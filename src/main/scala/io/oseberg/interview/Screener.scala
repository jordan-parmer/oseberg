package io.oseberg.interview

import scala.io._

object Screener extends App {
  val source = Source.fromFile("./src/main/resources/DoI.txt")
  val stats = FileStats.gatherStats(source)

  // TODO - Print stats to stdout
}

case class FileStat(
    lineCount: Int,
    totalWordCount: Int) {

  def wordFreq(word: String): Int = ???
  def topXWordsByFreq(x: Int): Seq[String] = ???
}

object FileStats {
  def gatherStats(source: Source): FileStat = ???
}
