package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder

new SbtLibraryJobBuilder('play-whitelist-filter').
        build(this as DslFactory)

new SbtLibraryJobBuilder('amls').
        build(this as DslFactory)

new BuildMonitorViewBuilder('AMLS-MONITOR')
        .withJobs('play-whitelist-filter',
        'amls'
).build(this)
