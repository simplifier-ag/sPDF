package io.github.simplifier_ag.scala.spdf

import ParamShow._

import scala.sys.process._

/**
 * Holds the configuration parameters of Pdf Kit
 */
trait PdfConfig {

  /**
   * Options for `wkhtmltopdf` command
   * See `wkhtmltopdf --extended-help` for a description of each option
   */


  //General Options

  val collate: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("collate")

  val cookieJar: Parameter[String] = Parameter[String]("cookie-jar")

  val copies: Parameter[Int] = Parameter[Int]("copies")

  val dpi: Parameter[Int] = Parameter[Int]("dpi")

  val extendedHelp: Parameter[Boolean] = Parameter[Boolean]("extended-help")

  val grayScale: Parameter[Boolean] = Parameter[Boolean]("grayscale")

  val help: Parameter[Boolean] = Parameter[Boolean]("help")

  val htmlDoc: Parameter[Boolean] = Parameter[Boolean]("html-doc")

  val imageDpi: Parameter[Int] = Parameter[Int]("image-dpi")

  val imageQuality: Parameter[Int] = Parameter[Int]("image-quality")

  val license: Parameter[Boolean] = Parameter[Boolean]("license")

  val manPage: Parameter[Boolean] = Parameter[Boolean]("manpage")

  val marginBottom: Parameter[String] = Parameter[String]("margin-bottom")

  val marginLeft: Parameter[String] = Parameter[String]("margin-left")

  val marginRight: Parameter[String] = Parameter[String]("margin-right")

  val marginTop: Parameter[String] = Parameter[String]("margin-top")

  val orientation: Parameter[PageOrientation] = Parameter[PageOrientation]("orientation")

  val pageHeight: Parameter[String] = Parameter[String]("page-height")

  val pageSize: Parameter[String] = Parameter[String]("page-size")

  val pageWidth: Parameter[String] = Parameter[String]("page-width")

  val noPdfCompression: Parameter[Boolean] = Parameter[Boolean]("no-pdf-compression")

  val readArgsFromStdin: Parameter[Boolean] = Parameter[Boolean]("read-args-from-stdin")

  val readme: Parameter[Boolean] = Parameter[Boolean]("readme")

  val title: Parameter[String] = Parameter[String]("title")

  val useXServer: Parameter[Boolean] = Parameter[Boolean]("use-xserver")

  val version: Parameter[Boolean] = Parameter[Boolean]("version")

  //Outline Options

  val dumpDefaultTocXsl: Parameter[Boolean] = Parameter[Boolean]("dump-default-toc-xsl")

  val dumpOutline: Parameter[String] = Parameter[String]("dump-outline")

  val outline: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("outline")

  val outlineDepth: Parameter[Int] = Parameter[Int]("outline-depth")

  //Page Options

  val allow: Parameter[Seq[String]] = Parameter[Seq[String]]("allow")

  val background: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("background")

  val bypassProxyFor: Parameter[Seq[String]] = Parameter[Seq[String]]("bypass-proxy-for")

  val cacheDir: Parameter[String] = Parameter[String]("cache-dir")

  val checkboxCheckedSvg: Parameter[String] = Parameter[String]("checkbox-checked-svg")

  val checkboxSvg: Parameter[String] = Parameter[String]("checkbox-svg")

  val cookie: Parameter[Map[String, String]] = Parameter[Map[String, String]]("cookie")

  val customHeader: Parameter[Map[String, String]] =  Parameter[Map[String, String]]("custom-header")

  val customHeaderPropagation: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("custom-header-propagation")

  val debugJavascript: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("debug-javascript")

  val defaultHeader: Parameter[Boolean] = Parameter[Boolean]("default-header")

  val encoding: Parameter[String] = Parameter[String]("encoding", "UTF-8")

  val disableExternalLinks: Parameter[Boolean] = Parameter[Boolean]("disable-external-links")

  val enableExternalLinks: Parameter[Boolean] = Parameter[Boolean]("enable-external-links")

  val disableForms: Parameter[Boolean] = Parameter[Boolean]("disable-forms")

  val enableForms: Parameter[Boolean] = Parameter[Boolean]("enable-forms")

  val images: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("images")

  val disableInternalLinks: Parameter[Boolean] = Parameter[Boolean]("disable-internal-links")

  val enableInternalLinks: Parameter[Boolean] = Parameter[Boolean]("enable-internal-links")

  val disableJavascript: Parameter[Boolean] = Parameter[Boolean]("disable-javascript")

  val enableJavascript: Parameter[Boolean] = Parameter[Boolean]("enable-javascript")

  val javascriptDelay: Parameter[Int] = Parameter[Int]("javascript-delay")

  val keepRelativeLinks: Parameter[Boolean] = Parameter[Boolean]("keep-relative-links")

  val loadErrorHandling: Parameter[ErrorHandling] = Parameter[ErrorHandling]("load-error-handling")

  val loadMediaErrorHandling: Parameter[ErrorHandling] = Parameter[ErrorHandling]("load-media-error-handling")

  val disableLocalFileAccess: Parameter[Boolean] = Parameter[Boolean]("disable-local-file-access")

  val enableLocalFileAccess: Parameter[Boolean] = Parameter[Boolean]("enable-local-file-access")

  val minimumFontSize: Parameter[Int] = Parameter[Int]("minimum-font-size")

  val excludeFromOutline: Parameter[Boolean] = Parameter[Boolean]("exclude-from-outline")

  val includeInOutline: Parameter[Boolean] = Parameter[Boolean]("include-in-outline")

  val pageOffset: Parameter[String] = Parameter[String]("page-offset")

  val password: Parameter[String] = Parameter[String]("password")

  val disablePlugins: Parameter[Boolean] = Parameter[Boolean]("disable-plugins")

  val enablePlugins: Parameter[Boolean] = Parameter[Boolean]("enable-plugins")

  val post: Parameter[Map[String, String]] = Parameter[Map[String, String]]("post")

  val postFile: Parameter[Map[String, String]] = Parameter[Map[String, String]]("post-file")

  val printMediaType: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("print-media-type")

  val proxy: Parameter[String] = Parameter[String]("proxy")

  val proxyHostnameLookup: Parameter[Boolean] = Parameter[Boolean]("proxy-hostname-lookup")

  val radioButtonCheckedSvg: Parameter[String] = Parameter[String]("radio-button-checked-svg")

  val radioButtonSvg: Parameter[String] = Parameter[String]("radio-button-svg")

  val runScript: Parameter[Seq[String]] = Parameter[Seq[String]]("run-script")

  val disableSmartShrinking: Parameter[Boolean] = Parameter[Boolean]("disable-smart-shrinking")

  val enableSmartShrinking: Parameter[Boolean] = Parameter[Boolean]("enable-smart-shrinking")

  val sslCrtParth: Parameter[String] = Parameter[String]("ssl-crt-path")

  val sslKeyPassword: Parameter[String] = Parameter[String]("ssl-key-password")

  val sslKeyPath: Parameter[String] = Parameter[String]("ssl-key-path")

  val stopSlowScripts: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("stop-slow-scripts")

  val disableTocBacklinks: Parameter[Boolean] = Parameter[Boolean]("disable-toc-backlinks")

  val enableTocBacklinks: Parameter[Boolean] = Parameter[Boolean]("enable-toc-backlinks")

  val userStyleSheet: Parameter[String] = Parameter[String]("user-style-sheet")

  val username: Parameter[String] = Parameter[String]("username")

  val viewportSize: Parameter[String] = Parameter[String]("viewport-size")

  val windowStatus: Parameter[String] = Parameter[String]("window-status")

  val zoom: Parameter[Float] = Parameter[Float]("zoom")

  //Header and Footer Options

  val footerCenter: Parameter[String] = Parameter[String]("footer-center")

  val footerFontName: Parameter[String] = Parameter[String]("footer-font-name")

  val footerFontSize: Parameter[String] = Parameter[String]("footer-font-size")

  val footerHtml: Parameter[String] = Parameter[String]("footer-html")

  val footerLeft: Parameter[String] = Parameter[String]("footer-left")

  val footerLine: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("footer-line")

  val footerRight: Parameter[String] = Parameter[String]("footer-right")

  val footerSpacing: Parameter[Float] = Parameter[Float]("footer-spacing")

  val headerCenter: Parameter[String] = Parameter[String]("header-center")

  val headerFontName: Parameter[String] = Parameter[String]("header-font-name")

  val headerFontSize: Parameter[String] = Parameter[String]("header-font-size")

  val headerHtml: Parameter[String] = Parameter[String]("header-html")

  val headerLeft: Parameter[String] = Parameter[String]("header-left")

  val headerLine: Parameter[Option[Boolean]] = Parameter[Option[Boolean]]("header-line")

  val headerRight: Parameter[String] = Parameter[String]("header-right")

  val headerSpacing: Parameter[Float] = Parameter[Float]("header-spacing")

  val replace: Parameter[Map[String, String]] = Parameter[Map[String, String]]("replace")

  //TOC Options

  val tableOfContent: ObjectParameter[Boolean] = ObjectParameter[Boolean]("toc")

  val disableDottedLines: Parameter[Boolean] = Parameter[Boolean]("disable-dotted-lines")

  val tocHeaderText: Parameter[String] = Parameter[String]("toc-header-text")

  val tocLevelIndentation: Parameter[String] = Parameter[String]("toc-level-indentation")

  val disableTocLinks: Parameter[Boolean] = Parameter[Boolean]("disable-toc-links")

  val tocTextSizeShrink: Parameter[Float] = Parameter[Float]("toc-text-size-shrink")

  val xslStyleSheet: Parameter[String] = Parameter[String]("xsl-style-sheet")


}

object PdfConfig {

  /**
   * An instance of the default configuration
   */
  object default extends PdfConfig

  /**
   * Generates a sequence of command line parameters from a `PdfKitConfig`
   */
  def toParameters(config: PdfConfig): Seq[String] = {
    import config._
    Seq(
    collate.toParameter,
    cookieJar.toParameter,
    copies.toParameter,
    dpi.toParameter,
    extendedHelp.toParameter,
    grayScale.toParameter,
    help.toParameter,
    htmlDoc.toParameter,
    imageDpi.toParameter,
    imageQuality.toParameter,
    license.toParameter,
    manPage.toParameter,
    marginBottom.toParameter,
    marginLeft.toParameter,
    marginRight.toParameter,
    marginTop.toParameter,
    orientation.toParameter,
    pageHeight.toParameter,
    pageSize.toParameter,
    pageWidth.toParameter,
    noPdfCompression.toParameter,
    readArgsFromStdin.toParameter,
    readme.toParameter,
    title.toParameter,
    useXServer.toParameter,
    version.toParameter,
    dumpDefaultTocXsl.toParameter,
    dumpOutline.toParameter,
    outline.toParameter,
    outlineDepth.toParameter,
    allow.toParameter,
    background.toParameter,
    bypassProxyFor.toParameter,
    cacheDir.toParameter,
    checkboxCheckedSvg.toParameter,
    checkboxSvg.toParameter,
    cookie.toParameter,
    customHeader.toParameter,
    customHeaderPropagation.toParameter,
    debugJavascript.toParameter,
    defaultHeader.toParameter,
    encoding.toParameter,
    disableExternalLinks.toParameter,
    enableExternalLinks.toParameter,
    disableForms.toParameter,
    enableForms.toParameter,
    images.toParameter,
    disableInternalLinks.toParameter,
    enableInternalLinks.toParameter,
    disableJavascript.toParameter,
    enableJavascript.toParameter,
    javascriptDelay.toParameter,
    keepRelativeLinks.toParameter,
    loadErrorHandling.toParameter,
    loadMediaErrorHandling.toParameter,
    disableLocalFileAccess.toParameter,
    enableLocalFileAccess.toParameter,
    minimumFontSize.toParameter,
    excludeFromOutline.toParameter,
    includeInOutline.toParameter,
    pageOffset.toParameter,
    password.toParameter,
    disablePlugins.toParameter,
    enablePlugins.toParameter,
    post.toParameter,
    postFile.toParameter,
    printMediaType.toParameter,
    proxy.toParameter,
    proxyHostnameLookup.toParameter,
    radioButtonCheckedSvg.toParameter,
    radioButtonSvg.toParameter,
    runScript.toParameter,
    disableSmartShrinking.toParameter,
    enableSmartShrinking.toParameter,
    sslCrtParth.toParameter,
    sslKeyPassword.toParameter,
    sslKeyPath.toParameter,
    stopSlowScripts.toParameter,
    disableTocBacklinks.toParameter,
    enableTocBacklinks.toParameter,
    userStyleSheet.toParameter,
    username.toParameter,
    viewportSize.toParameter,
    windowStatus.toParameter,
    zoom.toParameter,
    footerCenter.toParameter,
    footerFontName.toParameter,
    footerFontSize.toParameter,
    footerHtml.toParameter,
    footerLeft.toParameter,
    footerLine.toParameter,
    footerRight.toParameter,
    footerSpacing.toParameter,
    headerCenter.toParameter,
    headerFontName.toParameter,
    headerFontSize.toParameter,
    headerHtml.toParameter,
    headerLeft.toParameter,
    headerLine.toParameter,
    headerRight.toParameter,
    headerSpacing.toParameter,
    replace.toParameter,
    tableOfContent.toParameter(ObjectParamShow.BooleanObjectParamShow),
    disableDottedLines.toParameter,
    tocHeaderText.toParameter,
    tocLevelIndentation.toParameter,
    disableTocLinks.toParameter,
    tocTextSizeShrink.toParameter,
    xslStyleSheet.toParameter
    ).flatten
  }

  /**
   * Attempts to find the `wkhtmltopdf` executable in the system path.
   * @return
   */
  def findExecutable: Option[String] = try {
    val os = System.getProperty("os.name").toLowerCase
    val cmd = if(os.contains("windows")) "where wkhtmltopdf" else "which wkhtmltopdf"

    Option(cmd.!!.trim).filter(_.nonEmpty)
  } catch {
    case _: RuntimeException => None
  }

}
