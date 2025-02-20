package io.github.simplifier_ag.scala.spdf

import org.scalatest.Matchers
import org.scalatest.WordSpec

class PdfConfigSpec extends WordSpec with Matchers {

  "PdfConfig" should {

    "have a default config" in {
      PdfConfig.toParameters(PdfConfig.default) should equal(Seq("--encoding", "UTF-8"))
    }

    "generate parameters from config" in {
      val config = new PdfConfig {
        enableForms := true
        marginBottom := "1in"
        minimumFontSize := 3
        orientation := Landscape
        zoom := 1.23f
      }
      PdfConfig.toParameters(config) should equal(Seq("--margin-bottom", "1in", "--orientation", "Landscape", "--encoding", "UTF-8", "--enable-forms", "--minimum-font-size", "3", "--zoom", "1,23"))
    }

    "no pdf compression" in {
      val config = new PdfConfig {
        noPdfCompression := true
      }

      PdfConfig.toParameters(config) should contain("--no-pdf-compression")
    }

    "generate the --allow parameter" in {
      val config = new PdfConfig {
        allow := List("/some/path", "/some/other/path")
      }
      PdfConfig.toParameters(config) should equal(Seq("--allow", "/some/path", "--allow", "/some/other/path", "--encoding", "UTF-8"))
    }

    "print media type" in {
      val config = new PdfConfig {
        printMediaType := Some(true)
      }
      PdfConfig.toParameters(config) should contain("--print-media-type")
    }

    "no print media type" in {
      val config = new PdfConfig {
        printMediaType := Some(false)
      }
      PdfConfig.toParameters(config) should contain("--no-print-media-type")
    }

    "use x-server" in {
      val config = new PdfConfig {
        useXServer := true
      }
      PdfConfig.toParameters(config) should contain("--use-xserver")
    }

    "check for executable in PATH" in {
      PdfConfig.findExecutable match {
        case Some(path) => path.contains("wkhtmltopdf") should equal(true)
        case None => true should equal(true)
      }
    }
  }

}
