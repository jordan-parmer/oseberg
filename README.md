# Oseberg Scala Screener

Please complete the following and submit source code and output from running
`sbt test` and `sbt run` to DataTeamResumes@oseberg.io.

You're welcome to use Internet resources in solving this problem as long as
they don't give you the solution. We just ask that you cite every source that
you used. Also, please state with how much time you spent on this question. If
you have any questions about this or would like to seek clarification, please
contact DataTeamResumes@oseberg.io.

The development team will use this assessment to determine if you may be a
suitable candidate for the position.

Please bundle your project (sans binaries) and email to
DataTeamResumes@oseberg.io or upload to a private repository and share the
link. Please don't push your solution to our public github repository. Thank
you.

## Instructions

1. Complete implementation of the `io.oseberg.interview.FileStats` and `io.oseberg.interview.FileStat` types.
2. Complete implementation of the final two test specs in `src/test/scala/io.oseberg/interview/ScreenerSpec.scala`.  When you run `sbt test` all tests should pass.
3. Complete the implementation of the `Screener` object in `io.oseberg.interview.Screener` so it prints relevant information for the file like the text below.
4. What is the time order complexity (Big-O) of your solution?

```
Stats for file: DoI.txt:
  Line Count: 41
  Total Word Count: 1335
  Count for 'People': 10
  Top Three Words by Freq: the, of, to
```
