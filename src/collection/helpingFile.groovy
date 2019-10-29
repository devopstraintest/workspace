package collection
import java.lang.String

//class HelpingClass{
//
//    public static enum BuildReport {
////        APPS_LLV_BUILD(CommonJobs.A.name),
////        SQM_LLV_BUILD(CommonJobs.B.name),
////        EEA_COMMON_LLV_BUILD(CommonJobs.C.name),
////        APPS_TLP_BUILD(CommonJobs.D.name),
////        SQM_TLP_BUILD(CommonJobs.E.name)
//        APPS_LLV_BUILD("CommonJobs.A"),
//        SQM_LLV_BUILD("CommonJobs.B"),
//        EEA_COMMON_LLV_BUILD("CommonJobs.C"),
//        APPS_TLP_BUILD("CommonJobs.D"),
//        SQM_TLP_BUILD("CommonJobs.E")
//
//
//        String  jobName // The Job which generates the artifact containing the parameters
//        String  envFile // Filename in which the parameters are transported
//        String  keyword
//        String  versionEnv // Environment variable which contains version number information
//        String  changesEnv // Environment variable which contains the package changes
//
//
//        BuildReport(jobName, String keyword, String versionEnv="PRODUCT_PKGTAG", String changesEnv="PRODUCT_CHANGES", String envFile) {
//            this.jobName = jobName
//            this.keyword = keyword
//            this.versionEnv = versionEnv
//            this.changesEnv = changesEnv
//            this.envFile = envFile + ".properties"
//
//        }
//
//
//        String toString() {
//            return this.name
//        }
//    }
//



//
//enum CommonJobs {
//    A('platform-rel-17-0-0-build'),
//    B('platform-rel-17-0-1-build'),
//    C('platform-rel-17-1-0-build'),
//    D('platform-rel-17-2-0-build'),
//    E('platform-rel-17-3-0-build')
//
//    String name
//
//    CommonJobs(String name) {
//        this.name = name
//    }
//
//    String toString() {
//        return this.name
//    }
//}
//
//
//class HelpingClass{
//    public static enum PipelineReport {
//        LLV_PIPELINE(
//                [
//                        CommonJobs.A,
//                        CommonJobs.B,
//                        CommonJobs.C,
//                        CommonJobs.D,
//                        CommonJobs.E],
//                "Integration test report - template",
//                "EEA AESR integration test reports page",
//                "llv-build-job",
//                "Integration "
//        )
//        List buildJobs
//        String templatePage
//        String parentPage
//        String reportNamePropFile
//        String reportCreatorJob
//        String namePrefix
//
//        PipelineReport(buildJobs, templatePage, parentPage, reportCreatorJob,
//                       reportNamePropFile="report_name.env",
//                       namePrefix){
//
//            this.buildJobs = buildJobs
//            this.templatePage = templatePage
//            this.parentPage = parentPage
//            this.reportNamePropFile = reportNamePropFile
//            this.reportCreatorJob = reportCreatorJob
//            this.namePrefix = namePrefix
//
//        }
//
//    }
//
//}

class TestClass{

    public static enum PackageName {
        SYSTEM_PLATFORM('system-platform'),
        EA_APPLICATIONS('ea-applications'),
        EA_GUI('ea-gui'),
        EA_NARK('eea-nARK'),
        SQM_APPLICATIONS('sqm-applications'),
        SQM_ENGINE('sqm-engine'),
        EEA_COMMON('eea-common'),
        OS_PLATFORM('os-platform'),
        OS_CONFIG('os-config'),
        OS_PATCH('os-patch'),
        OS_TLP('os-tlp'),
        ADMIN_NODE('admin-node-components'),
        ADMIN_NODE_TLP('eea-admin-node-components-tlp'),
        EA_APPLICATIONS_TLP('ea-applications-tlp'),
        SYSTEM_PLATFORM_TLP('system-platform-tlp'),
        SQM_APPLICATIONS_TLP('sqm-applications-tlp'),
        SQM_ENGINE_TLP('sqm-engine-tlp')

        String name

        PackageName(String name) {
            this.name = name
        }

        String toString() {
            return this.name
        }
    }

}
