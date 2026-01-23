package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.ClientAggregatedCodeOwnershipEventDto;
import com.robinhood.rosetta.eventlogging.ClientApolloErrorEventDto;
import com.robinhood.rosetta.eventlogging.ClientAppPerformanceEventDto;
import com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEventDto;
import com.robinhood.rosetta.eventlogging.ClientBenchmarkResultEventDto;
import com.robinhood.rosetta.eventlogging.ClientBinaryEventDto;
import com.robinhood.rosetta.eventlogging.ClientBrokenMainBranchEventDto;
import com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEventDto;
import com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEventDto;
import com.robinhood.rosetta.eventlogging.ClientBuildStepEventDto;
import com.robinhood.rosetta.eventlogging.ClientBuildTimeEventDto;
import com.robinhood.rosetta.eventlogging.ClientCIEventDto;
import com.robinhood.rosetta.eventlogging.ClientCIStepEventDto;
import com.robinhood.rosetta.eventlogging.ClientCacheMissEventDto;
import com.robinhood.rosetta.eventlogging.ClientCodeCoverageByModuleEventDto;
import com.robinhood.rosetta.eventlogging.ClientCodeCoverageByOwnershipEventDto;
import com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEventDto;
import com.robinhood.rosetta.eventlogging.ClientCrashlyticsMetricsEventDto;
import com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEventDto;
import com.robinhood.rosetta.eventlogging.ClientDeployEventDto;
import com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEventDto;
import com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEventDto;
import com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertEventDto;
import com.robinhood.rosetta.eventlogging.ClientModuleEventDto;
import com.robinhood.rosetta.eventlogging.ClientOverallProfileModulesResultEventDto;
import com.robinhood.rosetta.eventlogging.ClientPartyOwnershipEventDto;
import com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto;
import com.robinhood.rosetta.eventlogging.ClientSnapshotTestEventDto;
import com.robinhood.rosetta.eventlogging.ClientTestEventDto;
import com.robinhood.rosetta.eventlogging.ClientTestSuiteEventDto;
import com.robinhood.rosetta.eventlogging.ClientToolchainEventDto;
import com.robinhood.rosetta.eventlogging.ClientUnusedCodeByModuleEventDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ClientMetricEventDto.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bG\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u009d\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0003\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010H\u001a\u00020I¢\u0006\u0004\b\u0006\u0010JJ\u0091\u0003\u0010\u008d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010H\u001a\u00020IJ\t\u0010\u008e\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008f\u0001\u001a\u00020IH\u0016J\u0017\u0010\u0090\u0001\u001a\u00030\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0096\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\u001e\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u0095\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u0095\u0001H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010<\u001a\u0004\u0018\u00010=8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010F\u001a\u0004\u0018\u00010G8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0013\u0010H\u001a\u00020I8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006 \u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate;)V", "build_time", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "ci", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "ci_step", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "code_occurence", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "deploy", "Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;", "broken_main_branch", "Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;", "module", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "test_suite", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "build_step", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "test", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "test_alert", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "toolchain_event", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "overall_profile_modules_result", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "individual_profile_module_result", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "benchmark_result", "Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;", "apollo_error", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "binary", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "cache_miss", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "dependency_graph", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "build_impact", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "build_impact_module", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "crashlytics_metric", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "firebase_screen_metric", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "app_performance", "Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;", "aggregated_code_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;", "party_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;", "code_coverage_by_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;", "code_coverage_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;", "unused_code_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;", "snapshot_test", "Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;", "securityware_benchmark", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "bazel_spawn_exec", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "source", "", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;Ljava/lang/String;)V", "getBuild_time", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "getCi", "()Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "getCi_step", "()Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "getCode_occurence", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "getDeploy", "()Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;", "getBroken_main_branch", "()Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;", "getModule", "()Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "getTest_suite", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "getBuild_step", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "getTest", "()Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "getTest_alert", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "getToolchain_event", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "getOverall_profile_modules_result", "()Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "getIndividual_profile_module_result", "()Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "getBenchmark_result", "()Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;", "getApollo_error", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "getBinary", "()Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "getCache_miss", "()Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "getDependency_graph", "()Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "getBuild_impact", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "getBuild_impact_module", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "getCrashlytics_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "getFirebase_screen_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "getApp_performance", "()Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;", "getAggregated_code_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;", "getParty_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;", "getCode_coverage_by_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;", "getCode_coverage_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;", "getUnused_code_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;", "getSnapshot_test", "()Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;", "getSecurityware_benchmark", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "getBazel_spawn_exec", "()Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "getSource", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientMetricEventDto implements Dto3<ClientMetricEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientMetricEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientMetricEventDto, ClientMetricEvent>> binaryBase64Serializer$delegate;
    private static final ClientMetricEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientMetricEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientMetricEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientBuildTimeEventDto getBuild_time() {
        return this.surrogate.getBuild_time();
    }

    public final ClientCIEventDto getCi() {
        return this.surrogate.getCi();
    }

    public final ClientCIStepEventDto getCi_step() {
        return this.surrogate.getCi_step();
    }

    public final ClientCodeOccurenceEventDto getCode_occurence() {
        return this.surrogate.getCode_occurence();
    }

    public final ClientDeployEventDto getDeploy() {
        return this.surrogate.getDeploy();
    }

    public final ClientBrokenMainBranchEventDto getBroken_main_branch() {
        return this.surrogate.getBroken_main_branch();
    }

    public final ClientModuleEventDto getModule() {
        return this.surrogate.getModule();
    }

    public final ClientTestSuiteEventDto getTest_suite() {
        return this.surrogate.getTest_suite();
    }

    public final ClientBuildStepEventDto getBuild_step() {
        return this.surrogate.getBuild_step();
    }

    public final ClientTestEventDto getTest() {
        return this.surrogate.getTest();
    }

    public final ClientIntegrationTestAlertEventDto getTest_alert() {
        return this.surrogate.getTest_alert();
    }

    public final ClientToolchainEventDto getToolchain_event() {
        return this.surrogate.getToolchain_event();
    }

    public final ClientOverallProfileModulesResultEventDto getOverall_profile_modules_result() {
        return this.surrogate.getOverall_profile_modules_result();
    }

    public final ClientIndividualProfileModuleResultEventDto getIndividual_profile_module_result() {
        return this.surrogate.getIndividual_profile_module_result();
    }

    public final ClientBenchmarkResultEventDto getBenchmark_result() {
        return this.surrogate.getBenchmark_result();
    }

    public final ClientApolloErrorEventDto getApollo_error() {
        return this.surrogate.getApollo_error();
    }

    public final ClientBinaryEventDto getBinary() {
        return this.surrogate.getBinary();
    }

    public final ClientCacheMissEventDto getCache_miss() {
        return this.surrogate.getCache_miss();
    }

    public final ClientDependencyGraphMetricsEventDto getDependency_graph() {
        return this.surrogate.getDependency_graph();
    }

    public final ClientBuildImpactMetricsEventDto getBuild_impact() {
        return this.surrogate.getBuild_impact();
    }

    public final ClientBuildImpactModuleMetricsEventDto getBuild_impact_module() {
        return this.surrogate.getBuild_impact_module();
    }

    public final ClientCrashlyticsMetricsEventDto getCrashlytics_metric() {
        return this.surrogate.getCrashlytics_metric();
    }

    public final ClientFirebaseScreenMetricsEventDto getFirebase_screen_metric() {
        return this.surrogate.getFirebase_screen_metric();
    }

    public final ClientAppPerformanceEventDto getApp_performance() {
        return this.surrogate.getApp_performance();
    }

    public final ClientAggregatedCodeOwnershipEventDto getAggregated_code_ownership() {
        return this.surrogate.getAggregated_code_ownership();
    }

    public final ClientPartyOwnershipEventDto getParty_ownership() {
        return this.surrogate.getParty_ownership();
    }

    public final ClientCodeCoverageByOwnershipEventDto getCode_coverage_by_ownership() {
        return this.surrogate.getCode_coverage_by_ownership();
    }

    public final ClientCodeCoverageByModuleEventDto getCode_coverage_by_module() {
        return this.surrogate.getCode_coverage_by_module();
    }

    public final ClientUnusedCodeByModuleEventDto getUnused_code_by_module() {
        return this.surrogate.getUnused_code_by_module();
    }

    public final ClientSnapshotTestEventDto getSnapshot_test() {
        return this.surrogate.getSnapshot_test();
    }

    public final ClientSecuritywareBenchmarkEventDto getSecurityware_benchmark() {
        return this.surrogate.getSecurityware_benchmark();
    }

    public final ClientBazelSpawnExecEventDto getBazel_spawn_exec() {
        return this.surrogate.getBazel_spawn_exec();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public /* synthetic */ ClientMetricEventDto(ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : clientBuildTimeEventDto, (i & 2) != 0 ? null : clientCIEventDto, (i & 4) != 0 ? null : clientCIStepEventDto, (i & 8) != 0 ? null : clientCodeOccurenceEventDto, (i & 16) != 0 ? null : clientDeployEventDto, (i & 32) != 0 ? null : clientBrokenMainBranchEventDto, (i & 64) != 0 ? null : clientModuleEventDto, (i & 128) != 0 ? null : clientTestSuiteEventDto, (i & 256) != 0 ? null : clientBuildStepEventDto, (i & 512) != 0 ? null : clientTestEventDto, (i & 1024) != 0 ? null : clientIntegrationTestAlertEventDto, (i & 2048) != 0 ? null : clientToolchainEventDto, (i & 4096) != 0 ? null : clientOverallProfileModulesResultEventDto, (i & 8192) != 0 ? null : clientIndividualProfileModuleResultEventDto, (i & 16384) != 0 ? null : clientBenchmarkResultEventDto, (i & 32768) != 0 ? null : clientApolloErrorEventDto, (i & 65536) != 0 ? null : clientBinaryEventDto, (i & 131072) != 0 ? null : clientCacheMissEventDto, (i & 262144) != 0 ? null : clientDependencyGraphMetricsEventDto, (i & 524288) != 0 ? null : clientBuildImpactMetricsEventDto, (i & 1048576) != 0 ? null : clientBuildImpactModuleMetricsEventDto, (i & 2097152) != 0 ? null : clientCrashlyticsMetricsEventDto, (i & 4194304) != 0 ? null : clientFirebaseScreenMetricsEventDto, (i & 8388608) != 0 ? null : clientAppPerformanceEventDto, (i & 16777216) != 0 ? null : clientAggregatedCodeOwnershipEventDto, (i & 33554432) != 0 ? null : clientPartyOwnershipEventDto, (i & 67108864) != 0 ? null : clientCodeCoverageByOwnershipEventDto, (i & 134217728) != 0 ? null : clientCodeCoverageByModuleEventDto, (i & 268435456) != 0 ? null : clientUnusedCodeByModuleEventDto, (i & 536870912) != 0 ? null : clientSnapshotTestEventDto, (i & 1073741824) != 0 ? null : clientSecuritywareBenchmarkEventDto, (i & Integer.MIN_VALUE) != 0 ? null : clientBazelSpawnExecEventDto, (i2 & 1) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientMetricEventDto(ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String source) {
        this(new Surrogate(clientBuildTimeEventDto, clientCIEventDto, clientCIStepEventDto, clientCodeOccurenceEventDto, clientDeployEventDto, clientBrokenMainBranchEventDto, clientModuleEventDto, clientTestSuiteEventDto, clientBuildStepEventDto, clientTestEventDto, clientIntegrationTestAlertEventDto, clientToolchainEventDto, clientOverallProfileModulesResultEventDto, clientIndividualProfileModuleResultEventDto, clientBenchmarkResultEventDto, clientApolloErrorEventDto, clientBinaryEventDto, clientCacheMissEventDto, clientDependencyGraphMetricsEventDto, clientBuildImpactMetricsEventDto, clientBuildImpactModuleMetricsEventDto, clientCrashlyticsMetricsEventDto, clientFirebaseScreenMetricsEventDto, clientAppPerformanceEventDto, clientAggregatedCodeOwnershipEventDto, clientPartyOwnershipEventDto, clientCodeCoverageByOwnershipEventDto, clientCodeCoverageByModuleEventDto, clientUnusedCodeByModuleEventDto, clientSnapshotTestEventDto, clientSecuritywareBenchmarkEventDto, clientBazelSpawnExecEventDto, source));
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ ClientMetricEventDto copy$default(ClientMetricEventDto clientMetricEventDto, ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String str, int i, int i2, Object obj) {
        String source;
        ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto2;
        ClientBinaryEventDto clientBinaryEventDto2;
        ClientCacheMissEventDto clientCacheMissEventDto2;
        ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto2;
        ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto2;
        ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto2;
        ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto2;
        ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto2;
        ClientAppPerformanceEventDto clientAppPerformanceEventDto2;
        ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto2;
        ClientPartyOwnershipEventDto clientPartyOwnershipEventDto2;
        ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto2;
        ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto2;
        ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto2;
        ClientSnapshotTestEventDto clientSnapshotTestEventDto2;
        ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto2;
        ClientBenchmarkResultEventDto clientBenchmarkResultEventDto2;
        ClientCIEventDto clientCIEventDto2;
        ClientCIStepEventDto clientCIStepEventDto2;
        ClientCodeOccurenceEventDto clientCodeOccurenceEventDto2;
        ClientDeployEventDto clientDeployEventDto2;
        ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto2;
        ClientModuleEventDto clientModuleEventDto2;
        ClientTestSuiteEventDto clientTestSuiteEventDto2;
        ClientBuildStepEventDto clientBuildStepEventDto2;
        ClientTestEventDto clientTestEventDto2;
        ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto2;
        ClientToolchainEventDto clientToolchainEventDto2;
        ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto2;
        ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto2;
        ClientApolloErrorEventDto clientApolloErrorEventDto2;
        ClientBuildTimeEventDto build_time = (i & 1) != 0 ? clientMetricEventDto.surrogate.getBuild_time() : clientBuildTimeEventDto;
        ClientCIEventDto ci = (i & 2) != 0 ? clientMetricEventDto.surrogate.getCi() : clientCIEventDto;
        ClientCIStepEventDto ci_step = (i & 4) != 0 ? clientMetricEventDto.surrogate.getCi_step() : clientCIStepEventDto;
        ClientCodeOccurenceEventDto code_occurence = (i & 8) != 0 ? clientMetricEventDto.surrogate.getCode_occurence() : clientCodeOccurenceEventDto;
        ClientDeployEventDto deploy = (i & 16) != 0 ? clientMetricEventDto.surrogate.getDeploy() : clientDeployEventDto;
        ClientBrokenMainBranchEventDto broken_main_branch = (i & 32) != 0 ? clientMetricEventDto.surrogate.getBroken_main_branch() : clientBrokenMainBranchEventDto;
        ClientModuleEventDto module = (i & 64) != 0 ? clientMetricEventDto.surrogate.getModule() : clientModuleEventDto;
        ClientTestSuiteEventDto test_suite = (i & 128) != 0 ? clientMetricEventDto.surrogate.getTest_suite() : clientTestSuiteEventDto;
        ClientBuildStepEventDto build_step = (i & 256) != 0 ? clientMetricEventDto.surrogate.getBuild_step() : clientBuildStepEventDto;
        ClientTestEventDto test = (i & 512) != 0 ? clientMetricEventDto.surrogate.getTest() : clientTestEventDto;
        ClientIntegrationTestAlertEventDto test_alert = (i & 1024) != 0 ? clientMetricEventDto.surrogate.getTest_alert() : clientIntegrationTestAlertEventDto;
        ClientToolchainEventDto toolchain_event = (i & 2048) != 0 ? clientMetricEventDto.surrogate.getToolchain_event() : clientToolchainEventDto;
        ClientOverallProfileModulesResultEventDto overall_profile_modules_result = (i & 4096) != 0 ? clientMetricEventDto.surrogate.getOverall_profile_modules_result() : clientOverallProfileModulesResultEventDto;
        ClientIndividualProfileModuleResultEventDto individual_profile_module_result = (i & 8192) != 0 ? clientMetricEventDto.surrogate.getIndividual_profile_module_result() : clientIndividualProfileModuleResultEventDto;
        ClientBuildTimeEventDto clientBuildTimeEventDto2 = build_time;
        ClientBenchmarkResultEventDto benchmark_result = (i & 16384) != 0 ? clientMetricEventDto.surrogate.getBenchmark_result() : clientBenchmarkResultEventDto;
        ClientApolloErrorEventDto apollo_error = (i & 32768) != 0 ? clientMetricEventDto.surrogate.getApollo_error() : clientApolloErrorEventDto;
        ClientBinaryEventDto binary = (i & 65536) != 0 ? clientMetricEventDto.surrogate.getBinary() : clientBinaryEventDto;
        ClientCacheMissEventDto cache_miss = (i & 131072) != 0 ? clientMetricEventDto.surrogate.getCache_miss() : clientCacheMissEventDto;
        ClientDependencyGraphMetricsEventDto dependency_graph = (i & 262144) != 0 ? clientMetricEventDto.surrogate.getDependency_graph() : clientDependencyGraphMetricsEventDto;
        ClientBuildImpactMetricsEventDto build_impact = (i & 524288) != 0 ? clientMetricEventDto.surrogate.getBuild_impact() : clientBuildImpactMetricsEventDto;
        ClientBuildImpactModuleMetricsEventDto build_impact_module = (i & 1048576) != 0 ? clientMetricEventDto.surrogate.getBuild_impact_module() : clientBuildImpactModuleMetricsEventDto;
        ClientCrashlyticsMetricsEventDto crashlytics_metric = (i & 2097152) != 0 ? clientMetricEventDto.surrogate.getCrashlytics_metric() : clientCrashlyticsMetricsEventDto;
        ClientFirebaseScreenMetricsEventDto firebase_screen_metric = (i & 4194304) != 0 ? clientMetricEventDto.surrogate.getFirebase_screen_metric() : clientFirebaseScreenMetricsEventDto;
        ClientAppPerformanceEventDto app_performance = (i & 8388608) != 0 ? clientMetricEventDto.surrogate.getApp_performance() : clientAppPerformanceEventDto;
        ClientAggregatedCodeOwnershipEventDto aggregated_code_ownership = (i & 16777216) != 0 ? clientMetricEventDto.surrogate.getAggregated_code_ownership() : clientAggregatedCodeOwnershipEventDto;
        ClientPartyOwnershipEventDto party_ownership = (i & 33554432) != 0 ? clientMetricEventDto.surrogate.getParty_ownership() : clientPartyOwnershipEventDto;
        ClientCodeCoverageByOwnershipEventDto code_coverage_by_ownership = (i & 67108864) != 0 ? clientMetricEventDto.surrogate.getCode_coverage_by_ownership() : clientCodeCoverageByOwnershipEventDto;
        ClientCodeCoverageByModuleEventDto code_coverage_by_module = (i & 134217728) != 0 ? clientMetricEventDto.surrogate.getCode_coverage_by_module() : clientCodeCoverageByModuleEventDto;
        ClientUnusedCodeByModuleEventDto unused_code_by_module = (i & 268435456) != 0 ? clientMetricEventDto.surrogate.getUnused_code_by_module() : clientUnusedCodeByModuleEventDto;
        ClientSnapshotTestEventDto snapshot_test = (i & 536870912) != 0 ? clientMetricEventDto.surrogate.getSnapshot_test() : clientSnapshotTestEventDto;
        ClientSecuritywareBenchmarkEventDto securityware_benchmark = (i & 1073741824) != 0 ? clientMetricEventDto.surrogate.getSecurityware_benchmark() : clientSecuritywareBenchmarkEventDto;
        ClientBazelSpawnExecEventDto bazel_spawn_exec = (i & Integer.MIN_VALUE) != 0 ? clientMetricEventDto.surrogate.getBazel_spawn_exec() : clientBazelSpawnExecEventDto;
        if ((i2 & 1) != 0) {
            clientBazelSpawnExecEventDto2 = bazel_spawn_exec;
            source = clientMetricEventDto.surrogate.getSource();
            clientCacheMissEventDto2 = cache_miss;
            clientDependencyGraphMetricsEventDto2 = dependency_graph;
            clientBuildImpactMetricsEventDto2 = build_impact;
            clientBuildImpactModuleMetricsEventDto2 = build_impact_module;
            clientCrashlyticsMetricsEventDto2 = crashlytics_metric;
            clientFirebaseScreenMetricsEventDto2 = firebase_screen_metric;
            clientAppPerformanceEventDto2 = app_performance;
            clientAggregatedCodeOwnershipEventDto2 = aggregated_code_ownership;
            clientPartyOwnershipEventDto2 = party_ownership;
            clientCodeCoverageByOwnershipEventDto2 = code_coverage_by_ownership;
            clientCodeCoverageByModuleEventDto2 = code_coverage_by_module;
            clientUnusedCodeByModuleEventDto2 = unused_code_by_module;
            clientSnapshotTestEventDto2 = snapshot_test;
            clientSecuritywareBenchmarkEventDto2 = securityware_benchmark;
            clientBenchmarkResultEventDto2 = benchmark_result;
            clientCIStepEventDto2 = ci_step;
            clientCodeOccurenceEventDto2 = code_occurence;
            clientDeployEventDto2 = deploy;
            clientBrokenMainBranchEventDto2 = broken_main_branch;
            clientModuleEventDto2 = module;
            clientTestSuiteEventDto2 = test_suite;
            clientBuildStepEventDto2 = build_step;
            clientTestEventDto2 = test;
            clientIntegrationTestAlertEventDto2 = test_alert;
            clientToolchainEventDto2 = toolchain_event;
            clientOverallProfileModulesResultEventDto2 = overall_profile_modules_result;
            clientIndividualProfileModuleResultEventDto2 = individual_profile_module_result;
            clientApolloErrorEventDto2 = apollo_error;
            clientBinaryEventDto2 = binary;
            clientCIEventDto2 = ci;
        } else {
            source = str;
            clientBazelSpawnExecEventDto2 = bazel_spawn_exec;
            clientBinaryEventDto2 = binary;
            clientCacheMissEventDto2 = cache_miss;
            clientDependencyGraphMetricsEventDto2 = dependency_graph;
            clientBuildImpactMetricsEventDto2 = build_impact;
            clientBuildImpactModuleMetricsEventDto2 = build_impact_module;
            clientCrashlyticsMetricsEventDto2 = crashlytics_metric;
            clientFirebaseScreenMetricsEventDto2 = firebase_screen_metric;
            clientAppPerformanceEventDto2 = app_performance;
            clientAggregatedCodeOwnershipEventDto2 = aggregated_code_ownership;
            clientPartyOwnershipEventDto2 = party_ownership;
            clientCodeCoverageByOwnershipEventDto2 = code_coverage_by_ownership;
            clientCodeCoverageByModuleEventDto2 = code_coverage_by_module;
            clientUnusedCodeByModuleEventDto2 = unused_code_by_module;
            clientSnapshotTestEventDto2 = snapshot_test;
            clientSecuritywareBenchmarkEventDto2 = securityware_benchmark;
            clientBenchmarkResultEventDto2 = benchmark_result;
            clientCIEventDto2 = ci;
            clientCIStepEventDto2 = ci_step;
            clientCodeOccurenceEventDto2 = code_occurence;
            clientDeployEventDto2 = deploy;
            clientBrokenMainBranchEventDto2 = broken_main_branch;
            clientModuleEventDto2 = module;
            clientTestSuiteEventDto2 = test_suite;
            clientBuildStepEventDto2 = build_step;
            clientTestEventDto2 = test;
            clientIntegrationTestAlertEventDto2 = test_alert;
            clientToolchainEventDto2 = toolchain_event;
            clientOverallProfileModulesResultEventDto2 = overall_profile_modules_result;
            clientIndividualProfileModuleResultEventDto2 = individual_profile_module_result;
            clientApolloErrorEventDto2 = apollo_error;
        }
        return clientMetricEventDto.copy(clientBuildTimeEventDto2, clientCIEventDto2, clientCIStepEventDto2, clientCodeOccurenceEventDto2, clientDeployEventDto2, clientBrokenMainBranchEventDto2, clientModuleEventDto2, clientTestSuiteEventDto2, clientBuildStepEventDto2, clientTestEventDto2, clientIntegrationTestAlertEventDto2, clientToolchainEventDto2, clientOverallProfileModulesResultEventDto2, clientIndividualProfileModuleResultEventDto2, clientBenchmarkResultEventDto2, clientApolloErrorEventDto2, clientBinaryEventDto2, clientCacheMissEventDto2, clientDependencyGraphMetricsEventDto2, clientBuildImpactMetricsEventDto2, clientBuildImpactModuleMetricsEventDto2, clientCrashlyticsMetricsEventDto2, clientFirebaseScreenMetricsEventDto2, clientAppPerformanceEventDto2, clientAggregatedCodeOwnershipEventDto2, clientPartyOwnershipEventDto2, clientCodeCoverageByOwnershipEventDto2, clientCodeCoverageByModuleEventDto2, clientUnusedCodeByModuleEventDto2, clientSnapshotTestEventDto2, clientSecuritywareBenchmarkEventDto2, clientBazelSpawnExecEventDto2, source);
    }

    public final ClientMetricEventDto copy(ClientBuildTimeEventDto build_time, ClientCIEventDto ci, ClientCIStepEventDto ci_step, ClientCodeOccurenceEventDto code_occurence, ClientDeployEventDto deploy, ClientBrokenMainBranchEventDto broken_main_branch, ClientModuleEventDto module, ClientTestSuiteEventDto test_suite, ClientBuildStepEventDto build_step, ClientTestEventDto test, ClientIntegrationTestAlertEventDto test_alert, ClientToolchainEventDto toolchain_event, ClientOverallProfileModulesResultEventDto overall_profile_modules_result, ClientIndividualProfileModuleResultEventDto individual_profile_module_result, ClientBenchmarkResultEventDto benchmark_result, ClientApolloErrorEventDto apollo_error, ClientBinaryEventDto binary, ClientCacheMissEventDto cache_miss, ClientDependencyGraphMetricsEventDto dependency_graph, ClientBuildImpactMetricsEventDto build_impact, ClientBuildImpactModuleMetricsEventDto build_impact_module, ClientCrashlyticsMetricsEventDto crashlytics_metric, ClientFirebaseScreenMetricsEventDto firebase_screen_metric, ClientAppPerformanceEventDto app_performance, ClientAggregatedCodeOwnershipEventDto aggregated_code_ownership, ClientPartyOwnershipEventDto party_ownership, ClientCodeCoverageByOwnershipEventDto code_coverage_by_ownership, ClientCodeCoverageByModuleEventDto code_coverage_by_module, ClientUnusedCodeByModuleEventDto unused_code_by_module, ClientSnapshotTestEventDto snapshot_test, ClientSecuritywareBenchmarkEventDto securityware_benchmark, ClientBazelSpawnExecEventDto bazel_spawn_exec, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ClientMetricEventDto(new Surrogate(build_time, ci, ci_step, code_occurence, deploy, broken_main_branch, module, test_suite, build_step, test, test_alert, toolchain_event, overall_profile_modules_result, individual_profile_module_result, benchmark_result, apollo_error, binary, cache_miss, dependency_graph, build_impact, build_impact_module, crashlytics_metric, firebase_screen_metric, app_performance, aggregated_code_ownership, party_ownership, code_coverage_by_ownership, code_coverage_by_module, unused_code_by_module, snapshot_test, securityware_benchmark, bazel_spawn_exec, source));
    }

    @Override // com.robinhood.idl.Dto
    public ClientMetricEvent toProto() {
        ClientBuildTimeEventDto build_time = this.surrogate.getBuild_time();
        ClientBuildTimeEvent proto = build_time != null ? build_time.toProto() : null;
        ClientCIEventDto ci = this.surrogate.getCi();
        ClientCIEvent proto2 = ci != null ? ci.toProto() : null;
        ClientCIStepEventDto ci_step = this.surrogate.getCi_step();
        ClientCIStepEvent proto3 = ci_step != null ? ci_step.toProto() : null;
        ClientCodeOccurenceEventDto code_occurence = this.surrogate.getCode_occurence();
        ClientCodeOccurenceEvent proto4 = code_occurence != null ? code_occurence.toProto() : null;
        ClientDeployEventDto deploy = this.surrogate.getDeploy();
        ClientDeployEvent proto5 = deploy != null ? deploy.toProto() : null;
        ClientBrokenMainBranchEventDto broken_main_branch = this.surrogate.getBroken_main_branch();
        ClientBrokenMainBranchEvent proto6 = broken_main_branch != null ? broken_main_branch.toProto() : null;
        ClientModuleEventDto module = this.surrogate.getModule();
        ClientModuleEvent proto7 = module != null ? module.toProto() : null;
        ClientTestSuiteEventDto test_suite = this.surrogate.getTest_suite();
        ClientTestSuiteEvent proto8 = test_suite != null ? test_suite.toProto() : null;
        ClientBuildStepEventDto build_step = this.surrogate.getBuild_step();
        ClientBuildStepEvent proto9 = build_step != null ? build_step.toProto() : null;
        ClientTestEventDto test = this.surrogate.getTest();
        ClientTestEvent proto10 = test != null ? test.toProto() : null;
        ClientIntegrationTestAlertEventDto test_alert = this.surrogate.getTest_alert();
        ClientIntegrationTestAlertEvent proto11 = test_alert != null ? test_alert.toProto() : null;
        ClientToolchainEventDto toolchain_event = this.surrogate.getToolchain_event();
        ClientToolchainEvent proto12 = toolchain_event != null ? toolchain_event.toProto() : null;
        ClientOverallProfileModulesResultEventDto overall_profile_modules_result = this.surrogate.getOverall_profile_modules_result();
        ClientOverallProfileModulesResultEvent proto13 = overall_profile_modules_result != null ? overall_profile_modules_result.toProto() : null;
        ClientIndividualProfileModuleResultEventDto individual_profile_module_result = this.surrogate.getIndividual_profile_module_result();
        ClientIndividualProfileModuleResultEvent proto14 = individual_profile_module_result != null ? individual_profile_module_result.toProto() : null;
        ClientBenchmarkResultEventDto benchmark_result = this.surrogate.getBenchmark_result();
        ClientBenchmarkResultEvent proto15 = benchmark_result != null ? benchmark_result.toProto() : null;
        ClientApolloErrorEventDto apollo_error = this.surrogate.getApollo_error();
        ClientApolloErrorEvent proto16 = apollo_error != null ? apollo_error.toProto() : null;
        ClientBinaryEventDto binary = this.surrogate.getBinary();
        ClientBinaryEvent proto17 = binary != null ? binary.toProto() : null;
        ClientCacheMissEventDto cache_miss = this.surrogate.getCache_miss();
        ClientCacheMissEvent proto18 = cache_miss != null ? cache_miss.toProto() : null;
        ClientDependencyGraphMetricsEventDto dependency_graph = this.surrogate.getDependency_graph();
        ClientDependencyGraphMetricsEvent proto19 = dependency_graph != null ? dependency_graph.toProto() : null;
        ClientBuildImpactMetricsEventDto build_impact = this.surrogate.getBuild_impact();
        ClientBuildImpactMetricsEvent proto20 = build_impact != null ? build_impact.toProto() : null;
        ClientBuildImpactModuleMetricsEventDto build_impact_module = this.surrogate.getBuild_impact_module();
        ClientBuildImpactModuleMetricsEvent proto21 = build_impact_module != null ? build_impact_module.toProto() : null;
        ClientCrashlyticsMetricsEventDto crashlytics_metric = this.surrogate.getCrashlytics_metric();
        ClientCrashlyticsMetricsEvent proto22 = crashlytics_metric != null ? crashlytics_metric.toProto() : null;
        ClientFirebaseScreenMetricsEventDto firebase_screen_metric = this.surrogate.getFirebase_screen_metric();
        ClientFirebaseScreenMetricsEvent proto23 = firebase_screen_metric != null ? firebase_screen_metric.toProto() : null;
        ClientAppPerformanceEventDto app_performance = this.surrogate.getApp_performance();
        ClientAppPerformanceEvent proto24 = app_performance != null ? app_performance.toProto() : null;
        ClientAggregatedCodeOwnershipEventDto aggregated_code_ownership = this.surrogate.getAggregated_code_ownership();
        ClientAggregatedCodeOwnershipEvent proto25 = aggregated_code_ownership != null ? aggregated_code_ownership.toProto() : null;
        ClientPartyOwnershipEventDto party_ownership = this.surrogate.getParty_ownership();
        ClientPartyOwnershipEvent proto26 = party_ownership != null ? party_ownership.toProto() : null;
        ClientCodeCoverageByOwnershipEventDto code_coverage_by_ownership = this.surrogate.getCode_coverage_by_ownership();
        ClientCodeCoverageByOwnershipEvent proto27 = code_coverage_by_ownership != null ? code_coverage_by_ownership.toProto() : null;
        ClientCodeCoverageByModuleEventDto code_coverage_by_module = this.surrogate.getCode_coverage_by_module();
        ClientCodeCoverageByModuleEvent proto28 = code_coverage_by_module != null ? code_coverage_by_module.toProto() : null;
        ClientUnusedCodeByModuleEventDto unused_code_by_module = this.surrogate.getUnused_code_by_module();
        ClientUnusedCodeByModuleEvent proto29 = unused_code_by_module != null ? unused_code_by_module.toProto() : null;
        ClientSnapshotTestEventDto snapshot_test = this.surrogate.getSnapshot_test();
        ClientSnapshotTestEvent proto30 = snapshot_test != null ? snapshot_test.toProto() : null;
        ClientSecuritywareBenchmarkEventDto securityware_benchmark = this.surrogate.getSecurityware_benchmark();
        ClientSecuritywareBenchmarkEvent proto31 = securityware_benchmark != null ? securityware_benchmark.toProto() : null;
        ClientBazelSpawnExecEventDto bazel_spawn_exec = this.surrogate.getBazel_spawn_exec();
        return new ClientMetricEvent(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, proto28, proto29, proto30, proto31, bazel_spawn_exec != null ? bazel_spawn_exec.toProto() : null, this.surrogate.getSource(), null, 0, 2, null);
    }

    public String toString() {
        return "[ClientMetricEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientMetricEventDto) && Intrinsics.areEqual(((ClientMetricEventDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientMetricEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0081\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0088\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 à\u00012\u00020\u0001:\u0004ß\u0001à\u0001B\u0091\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010B\u001a\u00020C¢\u0006\u0004\bD\u0010EBí\u0002\b\u0010\u0012\u0006\u0010F\u001a\u00020G\u0012\u0006\u0010H\u001a\u00020G\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u0012\b\u0010@\u001a\u0004\u0018\u00010A\u0012\b\u0010B\u001a\u0004\u0018\u00010C\u0012\b\u0010I\u001a\u0004\u0018\u00010J¢\u0006\u0004\bD\u0010KJ\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010;HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010AHÆ\u0003J\n\u0010Ð\u0001\u001a\u00020CHÆ\u0003J\u0094\u0003\u0010Ñ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020CHÆ\u0001J\u0016\u0010Ò\u0001\u001a\u00030Ó\u00012\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Õ\u0001\u001a\u00020GHÖ\u0001J\n\u0010Ö\u0001\u001a\u00020CHÖ\u0001J-\u0010×\u0001\u001a\u00030Ø\u00012\u0007\u0010Ù\u0001\u001a\u00020\u00002\b\u0010Ú\u0001\u001a\u00030Û\u00012\b\u0010Ü\u0001\u001a\u00030Ý\u0001H\u0001¢\u0006\u0003\bÞ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010M\u001a\u0004\bQ\u0010RR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010M\u001a\u0004\bT\u0010UR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010M\u001a\u0004\bW\u0010XR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010M\u001a\u0004\bZ\u0010[R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010M\u001a\u0004\b]\u0010^R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010M\u001a\u0004\b`\u0010aR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010M\u001a\u0004\bc\u0010dR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010M\u001a\u0004\bf\u0010gR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010M\u001a\u0004\bi\u0010jR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u0010M\u001a\u0004\bl\u0010mR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u0010M\u001a\u0004\bo\u0010pR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u0010M\u001a\u0004\br\u0010sR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bt\u0010M\u001a\u0004\bu\u0010vR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010M\u001a\u0004\bx\u0010yR\u001e\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bz\u0010M\u001a\u0004\b{\u0010|R\u001e\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010M\u001a\u0004\b~\u0010\u007fR!\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0080\u0001\u0010M\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0083\u0001\u0010M\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0086\u0001\u0010M\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0089\u0001\u0010M\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008c\u0001\u0010M\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008f\u0001\u0010M\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R!\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0092\u0001\u0010M\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0095\u0001\u0010M\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u00104\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0098\u0001\u0010M\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u00106\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009b\u0001\u0010M\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009e\u0001\u0010M\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010:\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¡\u0001\u0010M\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¤\u0001\u0010M\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010>\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b§\u0001\u0010M\u001a\u0006\b¨\u0001\u0010©\u0001R!\u0010@\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bª\u0001\u0010M\u001a\u0006\b«\u0001\u0010¬\u0001R\u001f\u0010B\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u00ad\u0001\u0010M\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006á\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate;", "", "build_time", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "ci", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "ci_step", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "code_occurence", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "deploy", "Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;", "broken_main_branch", "Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;", "module", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "test_suite", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "build_step", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "test", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "test_alert", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "toolchain_event", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "overall_profile_modules_result", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "individual_profile_module_result", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "benchmark_result", "Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;", "apollo_error", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "binary", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "cache_miss", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "dependency_graph", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "build_impact", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "build_impact_module", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "crashlytics_metric", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "firebase_screen_metric", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "app_performance", "Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;", "aggregated_code_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;", "party_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;", "code_coverage_by_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;", "code_coverage_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;", "unused_code_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;", "snapshot_test", "Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;", "securityware_benchmark", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "bazel_spawn_exec", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "source", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;Ljava/lang/String;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBuild_time$annotations", "()V", "getBuild_time", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "getCi$annotations", "getCi", "()Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "getCi_step$annotations", "getCi_step", "()Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "getCode_occurence$annotations", "getCode_occurence", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "getDeploy$annotations", "getDeploy", "()Lcom/robinhood/rosetta/eventlogging/ClientDeployEventDto;", "getBroken_main_branch$annotations", "getBroken_main_branch", "()Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEventDto;", "getModule$annotations", "getModule", "()Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "getTest_suite$annotations", "getTest_suite", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "getBuild_step$annotations", "getBuild_step", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "getTest$annotations", "getTest", "()Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "getTest_alert$annotations", "getTest_alert", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEventDto;", "getToolchain_event$annotations", "getToolchain_event", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "getOverall_profile_modules_result$annotations", "getOverall_profile_modules_result", "()Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "getIndividual_profile_module_result$annotations", "getIndividual_profile_module_result", "()Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "getBenchmark_result$annotations", "getBenchmark_result", "()Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEventDto;", "getApollo_error$annotations", "getApollo_error", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEventDto;", "getBinary$annotations", "getBinary", "()Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "getCache_miss$annotations", "getCache_miss", "()Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "getDependency_graph$annotations", "getDependency_graph", "()Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "getBuild_impact$annotations", "getBuild_impact", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "getBuild_impact_module$annotations", "getBuild_impact_module", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "getCrashlytics_metric$annotations", "getCrashlytics_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "getFirebase_screen_metric$annotations", "getFirebase_screen_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "getApp_performance$annotations", "getApp_performance", "()Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEventDto;", "getAggregated_code_ownership$annotations", "getAggregated_code_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEventDto;", "getParty_ownership$annotations", "getParty_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEventDto;", "getCode_coverage_by_ownership$annotations", "getCode_coverage_by_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEventDto;", "getCode_coverage_by_module$annotations", "getCode_coverage_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEventDto;", "getUnused_code_by_module$annotations", "getUnused_code_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEventDto;", "getSnapshot_test$annotations", "getSnapshot_test", "()Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEventDto;", "getSecurityware_benchmark$annotations", "getSecurityware_benchmark", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "getBazel_spawn_exec$annotations", "getBazel_spawn_exec", "()Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "getSource$annotations", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientAggregatedCodeOwnershipEventDto aggregated_code_ownership;
        private final ClientApolloErrorEventDto apollo_error;
        private final ClientAppPerformanceEventDto app_performance;
        private final ClientBazelSpawnExecEventDto bazel_spawn_exec;
        private final ClientBenchmarkResultEventDto benchmark_result;
        private final ClientBinaryEventDto binary;
        private final ClientBrokenMainBranchEventDto broken_main_branch;
        private final ClientBuildImpactMetricsEventDto build_impact;
        private final ClientBuildImpactModuleMetricsEventDto build_impact_module;
        private final ClientBuildStepEventDto build_step;
        private final ClientBuildTimeEventDto build_time;
        private final ClientCacheMissEventDto cache_miss;
        private final ClientCIEventDto ci;
        private final ClientCIStepEventDto ci_step;
        private final ClientCodeCoverageByModuleEventDto code_coverage_by_module;
        private final ClientCodeCoverageByOwnershipEventDto code_coverage_by_ownership;
        private final ClientCodeOccurenceEventDto code_occurence;
        private final ClientCrashlyticsMetricsEventDto crashlytics_metric;
        private final ClientDependencyGraphMetricsEventDto dependency_graph;
        private final ClientDeployEventDto deploy;
        private final ClientFirebaseScreenMetricsEventDto firebase_screen_metric;
        private final ClientIndividualProfileModuleResultEventDto individual_profile_module_result;
        private final ClientModuleEventDto module;
        private final ClientOverallProfileModulesResultEventDto overall_profile_modules_result;
        private final ClientPartyOwnershipEventDto party_ownership;
        private final ClientSecuritywareBenchmarkEventDto securityware_benchmark;
        private final ClientSnapshotTestEventDto snapshot_test;
        private final String source;
        private final ClientTestEventDto test;
        private final ClientIntegrationTestAlertEventDto test_alert;
        private final ClientTestSuiteEventDto test_suite;
        private final ClientToolchainEventDto toolchain_event;
        private final ClientUnusedCodeByModuleEventDto unused_code_by_module;

        public Surrogate() {
            this((ClientBuildTimeEventDto) null, (ClientCIEventDto) null, (ClientCIStepEventDto) null, (ClientCodeOccurenceEventDto) null, (ClientDeployEventDto) null, (ClientBrokenMainBranchEventDto) null, (ClientModuleEventDto) null, (ClientTestSuiteEventDto) null, (ClientBuildStepEventDto) null, (ClientTestEventDto) null, (ClientIntegrationTestAlertEventDto) null, (ClientToolchainEventDto) null, (ClientOverallProfileModulesResultEventDto) null, (ClientIndividualProfileModuleResultEventDto) null, (ClientBenchmarkResultEventDto) null, (ClientApolloErrorEventDto) null, (ClientBinaryEventDto) null, (ClientCacheMissEventDto) null, (ClientDependencyGraphMetricsEventDto) null, (ClientBuildImpactMetricsEventDto) null, (ClientBuildImpactModuleMetricsEventDto) null, (ClientCrashlyticsMetricsEventDto) null, (ClientFirebaseScreenMetricsEventDto) null, (ClientAppPerformanceEventDto) null, (ClientAggregatedCodeOwnershipEventDto) null, (ClientPartyOwnershipEventDto) null, (ClientCodeCoverageByOwnershipEventDto) null, (ClientCodeCoverageByModuleEventDto) null, (ClientUnusedCodeByModuleEventDto) null, (ClientSnapshotTestEventDto) null, (ClientSecuritywareBenchmarkEventDto) null, (ClientBazelSpawnExecEventDto) null, (String) null, -1, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String str, int i, int i2, Object obj) {
            String str2;
            ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto2;
            ClientBinaryEventDto clientBinaryEventDto2;
            ClientCacheMissEventDto clientCacheMissEventDto2;
            ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto2;
            ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto2;
            ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto2;
            ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto2;
            ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto2;
            ClientAppPerformanceEventDto clientAppPerformanceEventDto2;
            ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto2;
            ClientPartyOwnershipEventDto clientPartyOwnershipEventDto2;
            ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto2;
            ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto2;
            ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto2;
            ClientSnapshotTestEventDto clientSnapshotTestEventDto2;
            ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto2;
            ClientBenchmarkResultEventDto clientBenchmarkResultEventDto2;
            ClientCIEventDto clientCIEventDto2;
            ClientCIStepEventDto clientCIStepEventDto2;
            ClientCodeOccurenceEventDto clientCodeOccurenceEventDto2;
            ClientDeployEventDto clientDeployEventDto2;
            ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto2;
            ClientModuleEventDto clientModuleEventDto2;
            ClientTestSuiteEventDto clientTestSuiteEventDto2;
            ClientBuildStepEventDto clientBuildStepEventDto2;
            ClientTestEventDto clientTestEventDto2;
            ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto2;
            ClientToolchainEventDto clientToolchainEventDto2;
            ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto2;
            ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto2;
            ClientApolloErrorEventDto clientApolloErrorEventDto2;
            ClientBuildTimeEventDto clientBuildTimeEventDto2 = (i & 1) != 0 ? surrogate.build_time : clientBuildTimeEventDto;
            ClientCIEventDto clientCIEventDto3 = (i & 2) != 0 ? surrogate.ci : clientCIEventDto;
            ClientCIStepEventDto clientCIStepEventDto3 = (i & 4) != 0 ? surrogate.ci_step : clientCIStepEventDto;
            ClientCodeOccurenceEventDto clientCodeOccurenceEventDto3 = (i & 8) != 0 ? surrogate.code_occurence : clientCodeOccurenceEventDto;
            ClientDeployEventDto clientDeployEventDto3 = (i & 16) != 0 ? surrogate.deploy : clientDeployEventDto;
            ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto3 = (i & 32) != 0 ? surrogate.broken_main_branch : clientBrokenMainBranchEventDto;
            ClientModuleEventDto clientModuleEventDto3 = (i & 64) != 0 ? surrogate.module : clientModuleEventDto;
            ClientTestSuiteEventDto clientTestSuiteEventDto3 = (i & 128) != 0 ? surrogate.test_suite : clientTestSuiteEventDto;
            ClientBuildStepEventDto clientBuildStepEventDto3 = (i & 256) != 0 ? surrogate.build_step : clientBuildStepEventDto;
            ClientTestEventDto clientTestEventDto3 = (i & 512) != 0 ? surrogate.test : clientTestEventDto;
            ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto3 = (i & 1024) != 0 ? surrogate.test_alert : clientIntegrationTestAlertEventDto;
            ClientToolchainEventDto clientToolchainEventDto3 = (i & 2048) != 0 ? surrogate.toolchain_event : clientToolchainEventDto;
            ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto3 = (i & 4096) != 0 ? surrogate.overall_profile_modules_result : clientOverallProfileModulesResultEventDto;
            ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto3 = (i & 8192) != 0 ? surrogate.individual_profile_module_result : clientIndividualProfileModuleResultEventDto;
            ClientBuildTimeEventDto clientBuildTimeEventDto3 = clientBuildTimeEventDto2;
            ClientBenchmarkResultEventDto clientBenchmarkResultEventDto3 = (i & 16384) != 0 ? surrogate.benchmark_result : clientBenchmarkResultEventDto;
            ClientApolloErrorEventDto clientApolloErrorEventDto3 = (i & 32768) != 0 ? surrogate.apollo_error : clientApolloErrorEventDto;
            ClientBinaryEventDto clientBinaryEventDto3 = (i & 65536) != 0 ? surrogate.binary : clientBinaryEventDto;
            ClientCacheMissEventDto clientCacheMissEventDto3 = (i & 131072) != 0 ? surrogate.cache_miss : clientCacheMissEventDto;
            ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto3 = (i & 262144) != 0 ? surrogate.dependency_graph : clientDependencyGraphMetricsEventDto;
            ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto3 = (i & 524288) != 0 ? surrogate.build_impact : clientBuildImpactMetricsEventDto;
            ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto3 = (i & 1048576) != 0 ? surrogate.build_impact_module : clientBuildImpactModuleMetricsEventDto;
            ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto3 = (i & 2097152) != 0 ? surrogate.crashlytics_metric : clientCrashlyticsMetricsEventDto;
            ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto3 = (i & 4194304) != 0 ? surrogate.firebase_screen_metric : clientFirebaseScreenMetricsEventDto;
            ClientAppPerformanceEventDto clientAppPerformanceEventDto3 = (i & 8388608) != 0 ? surrogate.app_performance : clientAppPerformanceEventDto;
            ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto3 = (i & 16777216) != 0 ? surrogate.aggregated_code_ownership : clientAggregatedCodeOwnershipEventDto;
            ClientPartyOwnershipEventDto clientPartyOwnershipEventDto3 = (i & 33554432) != 0 ? surrogate.party_ownership : clientPartyOwnershipEventDto;
            ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto3 = (i & 67108864) != 0 ? surrogate.code_coverage_by_ownership : clientCodeCoverageByOwnershipEventDto;
            ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto3 = (i & 134217728) != 0 ? surrogate.code_coverage_by_module : clientCodeCoverageByModuleEventDto;
            ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto3 = (i & 268435456) != 0 ? surrogate.unused_code_by_module : clientUnusedCodeByModuleEventDto;
            ClientSnapshotTestEventDto clientSnapshotTestEventDto3 = (i & 536870912) != 0 ? surrogate.snapshot_test : clientSnapshotTestEventDto;
            ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto3 = (i & 1073741824) != 0 ? surrogate.securityware_benchmark : clientSecuritywareBenchmarkEventDto;
            ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto3 = (i & Integer.MIN_VALUE) != 0 ? surrogate.bazel_spawn_exec : clientBazelSpawnExecEventDto;
            if ((i2 & 1) != 0) {
                clientBazelSpawnExecEventDto2 = clientBazelSpawnExecEventDto3;
                str2 = surrogate.source;
                clientCacheMissEventDto2 = clientCacheMissEventDto3;
                clientDependencyGraphMetricsEventDto2 = clientDependencyGraphMetricsEventDto3;
                clientBuildImpactMetricsEventDto2 = clientBuildImpactMetricsEventDto3;
                clientBuildImpactModuleMetricsEventDto2 = clientBuildImpactModuleMetricsEventDto3;
                clientCrashlyticsMetricsEventDto2 = clientCrashlyticsMetricsEventDto3;
                clientFirebaseScreenMetricsEventDto2 = clientFirebaseScreenMetricsEventDto3;
                clientAppPerformanceEventDto2 = clientAppPerformanceEventDto3;
                clientAggregatedCodeOwnershipEventDto2 = clientAggregatedCodeOwnershipEventDto3;
                clientPartyOwnershipEventDto2 = clientPartyOwnershipEventDto3;
                clientCodeCoverageByOwnershipEventDto2 = clientCodeCoverageByOwnershipEventDto3;
                clientCodeCoverageByModuleEventDto2 = clientCodeCoverageByModuleEventDto3;
                clientUnusedCodeByModuleEventDto2 = clientUnusedCodeByModuleEventDto3;
                clientSnapshotTestEventDto2 = clientSnapshotTestEventDto3;
                clientSecuritywareBenchmarkEventDto2 = clientSecuritywareBenchmarkEventDto3;
                clientBenchmarkResultEventDto2 = clientBenchmarkResultEventDto3;
                clientCIStepEventDto2 = clientCIStepEventDto3;
                clientCodeOccurenceEventDto2 = clientCodeOccurenceEventDto3;
                clientDeployEventDto2 = clientDeployEventDto3;
                clientBrokenMainBranchEventDto2 = clientBrokenMainBranchEventDto3;
                clientModuleEventDto2 = clientModuleEventDto3;
                clientTestSuiteEventDto2 = clientTestSuiteEventDto3;
                clientBuildStepEventDto2 = clientBuildStepEventDto3;
                clientTestEventDto2 = clientTestEventDto3;
                clientIntegrationTestAlertEventDto2 = clientIntegrationTestAlertEventDto3;
                clientToolchainEventDto2 = clientToolchainEventDto3;
                clientOverallProfileModulesResultEventDto2 = clientOverallProfileModulesResultEventDto3;
                clientIndividualProfileModuleResultEventDto2 = clientIndividualProfileModuleResultEventDto3;
                clientApolloErrorEventDto2 = clientApolloErrorEventDto3;
                clientBinaryEventDto2 = clientBinaryEventDto3;
                clientCIEventDto2 = clientCIEventDto3;
            } else {
                str2 = str;
                clientBazelSpawnExecEventDto2 = clientBazelSpawnExecEventDto3;
                clientBinaryEventDto2 = clientBinaryEventDto3;
                clientCacheMissEventDto2 = clientCacheMissEventDto3;
                clientDependencyGraphMetricsEventDto2 = clientDependencyGraphMetricsEventDto3;
                clientBuildImpactMetricsEventDto2 = clientBuildImpactMetricsEventDto3;
                clientBuildImpactModuleMetricsEventDto2 = clientBuildImpactModuleMetricsEventDto3;
                clientCrashlyticsMetricsEventDto2 = clientCrashlyticsMetricsEventDto3;
                clientFirebaseScreenMetricsEventDto2 = clientFirebaseScreenMetricsEventDto3;
                clientAppPerformanceEventDto2 = clientAppPerformanceEventDto3;
                clientAggregatedCodeOwnershipEventDto2 = clientAggregatedCodeOwnershipEventDto3;
                clientPartyOwnershipEventDto2 = clientPartyOwnershipEventDto3;
                clientCodeCoverageByOwnershipEventDto2 = clientCodeCoverageByOwnershipEventDto3;
                clientCodeCoverageByModuleEventDto2 = clientCodeCoverageByModuleEventDto3;
                clientUnusedCodeByModuleEventDto2 = clientUnusedCodeByModuleEventDto3;
                clientSnapshotTestEventDto2 = clientSnapshotTestEventDto3;
                clientSecuritywareBenchmarkEventDto2 = clientSecuritywareBenchmarkEventDto3;
                clientBenchmarkResultEventDto2 = clientBenchmarkResultEventDto3;
                clientCIEventDto2 = clientCIEventDto3;
                clientCIStepEventDto2 = clientCIStepEventDto3;
                clientCodeOccurenceEventDto2 = clientCodeOccurenceEventDto3;
                clientDeployEventDto2 = clientDeployEventDto3;
                clientBrokenMainBranchEventDto2 = clientBrokenMainBranchEventDto3;
                clientModuleEventDto2 = clientModuleEventDto3;
                clientTestSuiteEventDto2 = clientTestSuiteEventDto3;
                clientBuildStepEventDto2 = clientBuildStepEventDto3;
                clientTestEventDto2 = clientTestEventDto3;
                clientIntegrationTestAlertEventDto2 = clientIntegrationTestAlertEventDto3;
                clientToolchainEventDto2 = clientToolchainEventDto3;
                clientOverallProfileModulesResultEventDto2 = clientOverallProfileModulesResultEventDto3;
                clientIndividualProfileModuleResultEventDto2 = clientIndividualProfileModuleResultEventDto3;
                clientApolloErrorEventDto2 = clientApolloErrorEventDto3;
            }
            return surrogate.copy(clientBuildTimeEventDto3, clientCIEventDto2, clientCIStepEventDto2, clientCodeOccurenceEventDto2, clientDeployEventDto2, clientBrokenMainBranchEventDto2, clientModuleEventDto2, clientTestSuiteEventDto2, clientBuildStepEventDto2, clientTestEventDto2, clientIntegrationTestAlertEventDto2, clientToolchainEventDto2, clientOverallProfileModulesResultEventDto2, clientIndividualProfileModuleResultEventDto2, clientBenchmarkResultEventDto2, clientApolloErrorEventDto2, clientBinaryEventDto2, clientCacheMissEventDto2, clientDependencyGraphMetricsEventDto2, clientBuildImpactMetricsEventDto2, clientBuildImpactModuleMetricsEventDto2, clientCrashlyticsMetricsEventDto2, clientFirebaseScreenMetricsEventDto2, clientAppPerformanceEventDto2, clientAggregatedCodeOwnershipEventDto2, clientPartyOwnershipEventDto2, clientCodeCoverageByOwnershipEventDto2, clientCodeCoverageByModuleEventDto2, clientUnusedCodeByModuleEventDto2, clientSnapshotTestEventDto2, clientSecuritywareBenchmarkEventDto2, clientBazelSpawnExecEventDto2, str2);
        }

        @SerialName("aggregatedCodeOwnership")
        @JsonAnnotations2(names = {"aggregated_code_ownership"})
        public static /* synthetic */ void getAggregated_code_ownership$annotations() {
        }

        @SerialName("apolloError")
        @JsonAnnotations2(names = {"apollo_error"})
        public static /* synthetic */ void getApollo_error$annotations() {
        }

        @SerialName("appPerformance")
        @JsonAnnotations2(names = {"app_performance"})
        public static /* synthetic */ void getApp_performance$annotations() {
        }

        @SerialName("bazelSpawnExec")
        @JsonAnnotations2(names = {"bazel_spawn_exec"})
        public static /* synthetic */ void getBazel_spawn_exec$annotations() {
        }

        @SerialName("benchmarkResult")
        @JsonAnnotations2(names = {"benchmark_result"})
        public static /* synthetic */ void getBenchmark_result$annotations() {
        }

        @SerialName("binary")
        @JsonAnnotations2(names = {"binary"})
        public static /* synthetic */ void getBinary$annotations() {
        }

        @SerialName("brokenMainBranch")
        @JsonAnnotations2(names = {"broken_main_branch"})
        public static /* synthetic */ void getBroken_main_branch$annotations() {
        }

        @SerialName("buildImpact")
        @JsonAnnotations2(names = {"build_impact"})
        public static /* synthetic */ void getBuild_impact$annotations() {
        }

        @SerialName("buildImpactModule")
        @JsonAnnotations2(names = {"build_impact_module"})
        public static /* synthetic */ void getBuild_impact_module$annotations() {
        }

        @SerialName("buildStep")
        @JsonAnnotations2(names = {"build_step"})
        public static /* synthetic */ void getBuild_step$annotations() {
        }

        @SerialName("buildTime")
        @JsonAnnotations2(names = {"build_time"})
        public static /* synthetic */ void getBuild_time$annotations() {
        }

        @SerialName("cacheMiss")
        @JsonAnnotations2(names = {"cache_miss"})
        public static /* synthetic */ void getCache_miss$annotations() {
        }

        @SerialName("ci")
        @JsonAnnotations2(names = {"ci"})
        public static /* synthetic */ void getCi$annotations() {
        }

        @SerialName("ciStep")
        @JsonAnnotations2(names = {"ci_step"})
        public static /* synthetic */ void getCi_step$annotations() {
        }

        @SerialName("codeCoverageByModule")
        @JsonAnnotations2(names = {"code_coverage_by_module"})
        public static /* synthetic */ void getCode_coverage_by_module$annotations() {
        }

        @SerialName("codeCoverageByOwnership")
        @JsonAnnotations2(names = {"code_coverage_by_ownership"})
        public static /* synthetic */ void getCode_coverage_by_ownership$annotations() {
        }

        @SerialName("codeOccurence")
        @JsonAnnotations2(names = {"code_occurence"})
        public static /* synthetic */ void getCode_occurence$annotations() {
        }

        @SerialName("crashlyticsMetric")
        @JsonAnnotations2(names = {"crashlytics_metric"})
        public static /* synthetic */ void getCrashlytics_metric$annotations() {
        }

        @SerialName("dependencyGraph")
        @JsonAnnotations2(names = {"dependency_graph"})
        public static /* synthetic */ void getDependency_graph$annotations() {
        }

        @SerialName("deploy")
        @JsonAnnotations2(names = {"deploy"})
        public static /* synthetic */ void getDeploy$annotations() {
        }

        @SerialName("firebaseScreenMetric")
        @JsonAnnotations2(names = {"firebase_screen_metric"})
        public static /* synthetic */ void getFirebase_screen_metric$annotations() {
        }

        @SerialName("individualProfileModuleResult")
        @JsonAnnotations2(names = {"individual_profile_module_result"})
        public static /* synthetic */ void getIndividual_profile_module_result$annotations() {
        }

        @SerialName("module")
        @JsonAnnotations2(names = {"module"})
        public static /* synthetic */ void getModule$annotations() {
        }

        @SerialName("overallProfileModulesResult")
        @JsonAnnotations2(names = {"overall_profile_modules_result"})
        public static /* synthetic */ void getOverall_profile_modules_result$annotations() {
        }

        @SerialName("partyOwnership")
        @JsonAnnotations2(names = {"party_ownership"})
        public static /* synthetic */ void getParty_ownership$annotations() {
        }

        @SerialName("securitywareBenchmark")
        @JsonAnnotations2(names = {"securityware_benchmark"})
        public static /* synthetic */ void getSecurityware_benchmark$annotations() {
        }

        @SerialName("snapshotTest")
        @JsonAnnotations2(names = {"snapshot_test"})
        public static /* synthetic */ void getSnapshot_test$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("test")
        @JsonAnnotations2(names = {"test"})
        public static /* synthetic */ void getTest$annotations() {
        }

        @SerialName("testAlert")
        @JsonAnnotations2(names = {"test_alert"})
        public static /* synthetic */ void getTest_alert$annotations() {
        }

        @SerialName("testSuite")
        @JsonAnnotations2(names = {"test_suite"})
        public static /* synthetic */ void getTest_suite$annotations() {
        }

        @SerialName("toolchainEvent")
        @JsonAnnotations2(names = {"toolchain_event"})
        public static /* synthetic */ void getToolchain_event$annotations() {
        }

        @SerialName("unusedCodeByModule")
        @JsonAnnotations2(names = {"unused_code_by_module"})
        public static /* synthetic */ void getUnused_code_by_module$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientBuildTimeEventDto getBuild_time() {
            return this.build_time;
        }

        /* renamed from: component10, reason: from getter */
        public final ClientTestEventDto getTest() {
            return this.test;
        }

        /* renamed from: component11, reason: from getter */
        public final ClientIntegrationTestAlertEventDto getTest_alert() {
            return this.test_alert;
        }

        /* renamed from: component12, reason: from getter */
        public final ClientToolchainEventDto getToolchain_event() {
            return this.toolchain_event;
        }

        /* renamed from: component13, reason: from getter */
        public final ClientOverallProfileModulesResultEventDto getOverall_profile_modules_result() {
            return this.overall_profile_modules_result;
        }

        /* renamed from: component14, reason: from getter */
        public final ClientIndividualProfileModuleResultEventDto getIndividual_profile_module_result() {
            return this.individual_profile_module_result;
        }

        /* renamed from: component15, reason: from getter */
        public final ClientBenchmarkResultEventDto getBenchmark_result() {
            return this.benchmark_result;
        }

        /* renamed from: component16, reason: from getter */
        public final ClientApolloErrorEventDto getApollo_error() {
            return this.apollo_error;
        }

        /* renamed from: component17, reason: from getter */
        public final ClientBinaryEventDto getBinary() {
            return this.binary;
        }

        /* renamed from: component18, reason: from getter */
        public final ClientCacheMissEventDto getCache_miss() {
            return this.cache_miss;
        }

        /* renamed from: component19, reason: from getter */
        public final ClientDependencyGraphMetricsEventDto getDependency_graph() {
            return this.dependency_graph;
        }

        /* renamed from: component2, reason: from getter */
        public final ClientCIEventDto getCi() {
            return this.ci;
        }

        /* renamed from: component20, reason: from getter */
        public final ClientBuildImpactMetricsEventDto getBuild_impact() {
            return this.build_impact;
        }

        /* renamed from: component21, reason: from getter */
        public final ClientBuildImpactModuleMetricsEventDto getBuild_impact_module() {
            return this.build_impact_module;
        }

        /* renamed from: component22, reason: from getter */
        public final ClientCrashlyticsMetricsEventDto getCrashlytics_metric() {
            return this.crashlytics_metric;
        }

        /* renamed from: component23, reason: from getter */
        public final ClientFirebaseScreenMetricsEventDto getFirebase_screen_metric() {
            return this.firebase_screen_metric;
        }

        /* renamed from: component24, reason: from getter */
        public final ClientAppPerformanceEventDto getApp_performance() {
            return this.app_performance;
        }

        /* renamed from: component25, reason: from getter */
        public final ClientAggregatedCodeOwnershipEventDto getAggregated_code_ownership() {
            return this.aggregated_code_ownership;
        }

        /* renamed from: component26, reason: from getter */
        public final ClientPartyOwnershipEventDto getParty_ownership() {
            return this.party_ownership;
        }

        /* renamed from: component27, reason: from getter */
        public final ClientCodeCoverageByOwnershipEventDto getCode_coverage_by_ownership() {
            return this.code_coverage_by_ownership;
        }

        /* renamed from: component28, reason: from getter */
        public final ClientCodeCoverageByModuleEventDto getCode_coverage_by_module() {
            return this.code_coverage_by_module;
        }

        /* renamed from: component29, reason: from getter */
        public final ClientUnusedCodeByModuleEventDto getUnused_code_by_module() {
            return this.unused_code_by_module;
        }

        /* renamed from: component3, reason: from getter */
        public final ClientCIStepEventDto getCi_step() {
            return this.ci_step;
        }

        /* renamed from: component30, reason: from getter */
        public final ClientSnapshotTestEventDto getSnapshot_test() {
            return this.snapshot_test;
        }

        /* renamed from: component31, reason: from getter */
        public final ClientSecuritywareBenchmarkEventDto getSecurityware_benchmark() {
            return this.securityware_benchmark;
        }

        /* renamed from: component32, reason: from getter */
        public final ClientBazelSpawnExecEventDto getBazel_spawn_exec() {
            return this.bazel_spawn_exec;
        }

        /* renamed from: component33, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final ClientCodeOccurenceEventDto getCode_occurence() {
            return this.code_occurence;
        }

        /* renamed from: component5, reason: from getter */
        public final ClientDeployEventDto getDeploy() {
            return this.deploy;
        }

        /* renamed from: component6, reason: from getter */
        public final ClientBrokenMainBranchEventDto getBroken_main_branch() {
            return this.broken_main_branch;
        }

        /* renamed from: component7, reason: from getter */
        public final ClientModuleEventDto getModule() {
            return this.module;
        }

        /* renamed from: component8, reason: from getter */
        public final ClientTestSuiteEventDto getTest_suite() {
            return this.test_suite;
        }

        /* renamed from: component9, reason: from getter */
        public final ClientBuildStepEventDto getBuild_step() {
            return this.build_step;
        }

        public final Surrogate copy(ClientBuildTimeEventDto build_time, ClientCIEventDto ci, ClientCIStepEventDto ci_step, ClientCodeOccurenceEventDto code_occurence, ClientDeployEventDto deploy, ClientBrokenMainBranchEventDto broken_main_branch, ClientModuleEventDto module, ClientTestSuiteEventDto test_suite, ClientBuildStepEventDto build_step, ClientTestEventDto test, ClientIntegrationTestAlertEventDto test_alert, ClientToolchainEventDto toolchain_event, ClientOverallProfileModulesResultEventDto overall_profile_modules_result, ClientIndividualProfileModuleResultEventDto individual_profile_module_result, ClientBenchmarkResultEventDto benchmark_result, ClientApolloErrorEventDto apollo_error, ClientBinaryEventDto binary, ClientCacheMissEventDto cache_miss, ClientDependencyGraphMetricsEventDto dependency_graph, ClientBuildImpactMetricsEventDto build_impact, ClientBuildImpactModuleMetricsEventDto build_impact_module, ClientCrashlyticsMetricsEventDto crashlytics_metric, ClientFirebaseScreenMetricsEventDto firebase_screen_metric, ClientAppPerformanceEventDto app_performance, ClientAggregatedCodeOwnershipEventDto aggregated_code_ownership, ClientPartyOwnershipEventDto party_ownership, ClientCodeCoverageByOwnershipEventDto code_coverage_by_ownership, ClientCodeCoverageByModuleEventDto code_coverage_by_module, ClientUnusedCodeByModuleEventDto unused_code_by_module, ClientSnapshotTestEventDto snapshot_test, ClientSecuritywareBenchmarkEventDto securityware_benchmark, ClientBazelSpawnExecEventDto bazel_spawn_exec, String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(build_time, ci, ci_step, code_occurence, deploy, broken_main_branch, module, test_suite, build_step, test, test_alert, toolchain_event, overall_profile_modules_result, individual_profile_module_result, benchmark_result, apollo_error, binary, cache_miss, dependency_graph, build_impact, build_impact_module, crashlytics_metric, firebase_screen_metric, app_performance, aggregated_code_ownership, party_ownership, code_coverage_by_ownership, code_coverage_by_module, unused_code_by_module, snapshot_test, securityware_benchmark, bazel_spawn_exec, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.build_time, surrogate.build_time) && Intrinsics.areEqual(this.ci, surrogate.ci) && Intrinsics.areEqual(this.ci_step, surrogate.ci_step) && Intrinsics.areEqual(this.code_occurence, surrogate.code_occurence) && Intrinsics.areEqual(this.deploy, surrogate.deploy) && Intrinsics.areEqual(this.broken_main_branch, surrogate.broken_main_branch) && Intrinsics.areEqual(this.module, surrogate.module) && Intrinsics.areEqual(this.test_suite, surrogate.test_suite) && Intrinsics.areEqual(this.build_step, surrogate.build_step) && Intrinsics.areEqual(this.test, surrogate.test) && Intrinsics.areEqual(this.test_alert, surrogate.test_alert) && Intrinsics.areEqual(this.toolchain_event, surrogate.toolchain_event) && Intrinsics.areEqual(this.overall_profile_modules_result, surrogate.overall_profile_modules_result) && Intrinsics.areEqual(this.individual_profile_module_result, surrogate.individual_profile_module_result) && Intrinsics.areEqual(this.benchmark_result, surrogate.benchmark_result) && Intrinsics.areEqual(this.apollo_error, surrogate.apollo_error) && Intrinsics.areEqual(this.binary, surrogate.binary) && Intrinsics.areEqual(this.cache_miss, surrogate.cache_miss) && Intrinsics.areEqual(this.dependency_graph, surrogate.dependency_graph) && Intrinsics.areEqual(this.build_impact, surrogate.build_impact) && Intrinsics.areEqual(this.build_impact_module, surrogate.build_impact_module) && Intrinsics.areEqual(this.crashlytics_metric, surrogate.crashlytics_metric) && Intrinsics.areEqual(this.firebase_screen_metric, surrogate.firebase_screen_metric) && Intrinsics.areEqual(this.app_performance, surrogate.app_performance) && Intrinsics.areEqual(this.aggregated_code_ownership, surrogate.aggregated_code_ownership) && Intrinsics.areEqual(this.party_ownership, surrogate.party_ownership) && Intrinsics.areEqual(this.code_coverage_by_ownership, surrogate.code_coverage_by_ownership) && Intrinsics.areEqual(this.code_coverage_by_module, surrogate.code_coverage_by_module) && Intrinsics.areEqual(this.unused_code_by_module, surrogate.unused_code_by_module) && Intrinsics.areEqual(this.snapshot_test, surrogate.snapshot_test) && Intrinsics.areEqual(this.securityware_benchmark, surrogate.securityware_benchmark) && Intrinsics.areEqual(this.bazel_spawn_exec, surrogate.bazel_spawn_exec) && Intrinsics.areEqual(this.source, surrogate.source);
        }

        public int hashCode() {
            ClientBuildTimeEventDto clientBuildTimeEventDto = this.build_time;
            int iHashCode = (clientBuildTimeEventDto == null ? 0 : clientBuildTimeEventDto.hashCode()) * 31;
            ClientCIEventDto clientCIEventDto = this.ci;
            int iHashCode2 = (iHashCode + (clientCIEventDto == null ? 0 : clientCIEventDto.hashCode())) * 31;
            ClientCIStepEventDto clientCIStepEventDto = this.ci_step;
            int iHashCode3 = (iHashCode2 + (clientCIStepEventDto == null ? 0 : clientCIStepEventDto.hashCode())) * 31;
            ClientCodeOccurenceEventDto clientCodeOccurenceEventDto = this.code_occurence;
            int iHashCode4 = (iHashCode3 + (clientCodeOccurenceEventDto == null ? 0 : clientCodeOccurenceEventDto.hashCode())) * 31;
            ClientDeployEventDto clientDeployEventDto = this.deploy;
            int iHashCode5 = (iHashCode4 + (clientDeployEventDto == null ? 0 : clientDeployEventDto.hashCode())) * 31;
            ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto = this.broken_main_branch;
            int iHashCode6 = (iHashCode5 + (clientBrokenMainBranchEventDto == null ? 0 : clientBrokenMainBranchEventDto.hashCode())) * 31;
            ClientModuleEventDto clientModuleEventDto = this.module;
            int iHashCode7 = (iHashCode6 + (clientModuleEventDto == null ? 0 : clientModuleEventDto.hashCode())) * 31;
            ClientTestSuiteEventDto clientTestSuiteEventDto = this.test_suite;
            int iHashCode8 = (iHashCode7 + (clientTestSuiteEventDto == null ? 0 : clientTestSuiteEventDto.hashCode())) * 31;
            ClientBuildStepEventDto clientBuildStepEventDto = this.build_step;
            int iHashCode9 = (iHashCode8 + (clientBuildStepEventDto == null ? 0 : clientBuildStepEventDto.hashCode())) * 31;
            ClientTestEventDto clientTestEventDto = this.test;
            int iHashCode10 = (iHashCode9 + (clientTestEventDto == null ? 0 : clientTestEventDto.hashCode())) * 31;
            ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto = this.test_alert;
            int iHashCode11 = (iHashCode10 + (clientIntegrationTestAlertEventDto == null ? 0 : clientIntegrationTestAlertEventDto.hashCode())) * 31;
            ClientToolchainEventDto clientToolchainEventDto = this.toolchain_event;
            int iHashCode12 = (iHashCode11 + (clientToolchainEventDto == null ? 0 : clientToolchainEventDto.hashCode())) * 31;
            ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto = this.overall_profile_modules_result;
            int iHashCode13 = (iHashCode12 + (clientOverallProfileModulesResultEventDto == null ? 0 : clientOverallProfileModulesResultEventDto.hashCode())) * 31;
            ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto = this.individual_profile_module_result;
            int iHashCode14 = (iHashCode13 + (clientIndividualProfileModuleResultEventDto == null ? 0 : clientIndividualProfileModuleResultEventDto.hashCode())) * 31;
            ClientBenchmarkResultEventDto clientBenchmarkResultEventDto = this.benchmark_result;
            int iHashCode15 = (iHashCode14 + (clientBenchmarkResultEventDto == null ? 0 : clientBenchmarkResultEventDto.hashCode())) * 31;
            ClientApolloErrorEventDto clientApolloErrorEventDto = this.apollo_error;
            int iHashCode16 = (iHashCode15 + (clientApolloErrorEventDto == null ? 0 : clientApolloErrorEventDto.hashCode())) * 31;
            ClientBinaryEventDto clientBinaryEventDto = this.binary;
            int iHashCode17 = (iHashCode16 + (clientBinaryEventDto == null ? 0 : clientBinaryEventDto.hashCode())) * 31;
            ClientCacheMissEventDto clientCacheMissEventDto = this.cache_miss;
            int iHashCode18 = (iHashCode17 + (clientCacheMissEventDto == null ? 0 : clientCacheMissEventDto.hashCode())) * 31;
            ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto = this.dependency_graph;
            int iHashCode19 = (iHashCode18 + (clientDependencyGraphMetricsEventDto == null ? 0 : clientDependencyGraphMetricsEventDto.hashCode())) * 31;
            ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto = this.build_impact;
            int iHashCode20 = (iHashCode19 + (clientBuildImpactMetricsEventDto == null ? 0 : clientBuildImpactMetricsEventDto.hashCode())) * 31;
            ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto = this.build_impact_module;
            int iHashCode21 = (iHashCode20 + (clientBuildImpactModuleMetricsEventDto == null ? 0 : clientBuildImpactModuleMetricsEventDto.hashCode())) * 31;
            ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto = this.crashlytics_metric;
            int iHashCode22 = (iHashCode21 + (clientCrashlyticsMetricsEventDto == null ? 0 : clientCrashlyticsMetricsEventDto.hashCode())) * 31;
            ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto = this.firebase_screen_metric;
            int iHashCode23 = (iHashCode22 + (clientFirebaseScreenMetricsEventDto == null ? 0 : clientFirebaseScreenMetricsEventDto.hashCode())) * 31;
            ClientAppPerformanceEventDto clientAppPerformanceEventDto = this.app_performance;
            int iHashCode24 = (iHashCode23 + (clientAppPerformanceEventDto == null ? 0 : clientAppPerformanceEventDto.hashCode())) * 31;
            ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto = this.aggregated_code_ownership;
            int iHashCode25 = (iHashCode24 + (clientAggregatedCodeOwnershipEventDto == null ? 0 : clientAggregatedCodeOwnershipEventDto.hashCode())) * 31;
            ClientPartyOwnershipEventDto clientPartyOwnershipEventDto = this.party_ownership;
            int iHashCode26 = (iHashCode25 + (clientPartyOwnershipEventDto == null ? 0 : clientPartyOwnershipEventDto.hashCode())) * 31;
            ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto = this.code_coverage_by_ownership;
            int iHashCode27 = (iHashCode26 + (clientCodeCoverageByOwnershipEventDto == null ? 0 : clientCodeCoverageByOwnershipEventDto.hashCode())) * 31;
            ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto = this.code_coverage_by_module;
            int iHashCode28 = (iHashCode27 + (clientCodeCoverageByModuleEventDto == null ? 0 : clientCodeCoverageByModuleEventDto.hashCode())) * 31;
            ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto = this.unused_code_by_module;
            int iHashCode29 = (iHashCode28 + (clientUnusedCodeByModuleEventDto == null ? 0 : clientUnusedCodeByModuleEventDto.hashCode())) * 31;
            ClientSnapshotTestEventDto clientSnapshotTestEventDto = this.snapshot_test;
            int iHashCode30 = (iHashCode29 + (clientSnapshotTestEventDto == null ? 0 : clientSnapshotTestEventDto.hashCode())) * 31;
            ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto = this.securityware_benchmark;
            int iHashCode31 = (iHashCode30 + (clientSecuritywareBenchmarkEventDto == null ? 0 : clientSecuritywareBenchmarkEventDto.hashCode())) * 31;
            ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto = this.bazel_spawn_exec;
            return ((iHashCode31 + (clientBazelSpawnExecEventDto != null ? clientBazelSpawnExecEventDto.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(build_time=" + this.build_time + ", ci=" + this.ci + ", ci_step=" + this.ci_step + ", code_occurence=" + this.code_occurence + ", deploy=" + this.deploy + ", broken_main_branch=" + this.broken_main_branch + ", module=" + this.module + ", test_suite=" + this.test_suite + ", build_step=" + this.build_step + ", test=" + this.test + ", test_alert=" + this.test_alert + ", toolchain_event=" + this.toolchain_event + ", overall_profile_modules_result=" + this.overall_profile_modules_result + ", individual_profile_module_result=" + this.individual_profile_module_result + ", benchmark_result=" + this.benchmark_result + ", apollo_error=" + this.apollo_error + ", binary=" + this.binary + ", cache_miss=" + this.cache_miss + ", dependency_graph=" + this.dependency_graph + ", build_impact=" + this.build_impact + ", build_impact_module=" + this.build_impact_module + ", crashlytics_metric=" + this.crashlytics_metric + ", firebase_screen_metric=" + this.firebase_screen_metric + ", app_performance=" + this.app_performance + ", aggregated_code_ownership=" + this.aggregated_code_ownership + ", party_ownership=" + this.party_ownership + ", code_coverage_by_ownership=" + this.code_coverage_by_ownership + ", code_coverage_by_module=" + this.code_coverage_by_module + ", unused_code_by_module=" + this.unused_code_by_module + ", snapshot_test=" + this.snapshot_test + ", securityware_benchmark=" + this.securityware_benchmark + ", bazel_spawn_exec=" + this.bazel_spawn_exec + ", source=" + this.source + ")";
        }

        /* compiled from: ClientMetricEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientMetricEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.build_time = null;
            } else {
                this.build_time = clientBuildTimeEventDto;
            }
            if ((i & 2) == 0) {
                this.ci = null;
            } else {
                this.ci = clientCIEventDto;
            }
            if ((i & 4) == 0) {
                this.ci_step = null;
            } else {
                this.ci_step = clientCIStepEventDto;
            }
            if ((i & 8) == 0) {
                this.code_occurence = null;
            } else {
                this.code_occurence = clientCodeOccurenceEventDto;
            }
            if ((i & 16) == 0) {
                this.deploy = null;
            } else {
                this.deploy = clientDeployEventDto;
            }
            if ((i & 32) == 0) {
                this.broken_main_branch = null;
            } else {
                this.broken_main_branch = clientBrokenMainBranchEventDto;
            }
            if ((i & 64) == 0) {
                this.module = null;
            } else {
                this.module = clientModuleEventDto;
            }
            if ((i & 128) == 0) {
                this.test_suite = null;
            } else {
                this.test_suite = clientTestSuiteEventDto;
            }
            if ((i & 256) == 0) {
                this.build_step = null;
            } else {
                this.build_step = clientBuildStepEventDto;
            }
            if ((i & 512) == 0) {
                this.test = null;
            } else {
                this.test = clientTestEventDto;
            }
            if ((i & 1024) == 0) {
                this.test_alert = null;
            } else {
                this.test_alert = clientIntegrationTestAlertEventDto;
            }
            if ((i & 2048) == 0) {
                this.toolchain_event = null;
            } else {
                this.toolchain_event = clientToolchainEventDto;
            }
            if ((i & 4096) == 0) {
                this.overall_profile_modules_result = null;
            } else {
                this.overall_profile_modules_result = clientOverallProfileModulesResultEventDto;
            }
            if ((i & 8192) == 0) {
                this.individual_profile_module_result = null;
            } else {
                this.individual_profile_module_result = clientIndividualProfileModuleResultEventDto;
            }
            if ((i & 16384) == 0) {
                this.benchmark_result = null;
            } else {
                this.benchmark_result = clientBenchmarkResultEventDto;
            }
            if ((32768 & i) == 0) {
                this.apollo_error = null;
            } else {
                this.apollo_error = clientApolloErrorEventDto;
            }
            if ((65536 & i) == 0) {
                this.binary = null;
            } else {
                this.binary = clientBinaryEventDto;
            }
            if ((131072 & i) == 0) {
                this.cache_miss = null;
            } else {
                this.cache_miss = clientCacheMissEventDto;
            }
            if ((262144 & i) == 0) {
                this.dependency_graph = null;
            } else {
                this.dependency_graph = clientDependencyGraphMetricsEventDto;
            }
            if ((524288 & i) == 0) {
                this.build_impact = null;
            } else {
                this.build_impact = clientBuildImpactMetricsEventDto;
            }
            if ((1048576 & i) == 0) {
                this.build_impact_module = null;
            } else {
                this.build_impact_module = clientBuildImpactModuleMetricsEventDto;
            }
            if ((2097152 & i) == 0) {
                this.crashlytics_metric = null;
            } else {
                this.crashlytics_metric = clientCrashlyticsMetricsEventDto;
            }
            if ((4194304 & i) == 0) {
                this.firebase_screen_metric = null;
            } else {
                this.firebase_screen_metric = clientFirebaseScreenMetricsEventDto;
            }
            if ((8388608 & i) == 0) {
                this.app_performance = null;
            } else {
                this.app_performance = clientAppPerformanceEventDto;
            }
            if ((16777216 & i) == 0) {
                this.aggregated_code_ownership = null;
            } else {
                this.aggregated_code_ownership = clientAggregatedCodeOwnershipEventDto;
            }
            if ((33554432 & i) == 0) {
                this.party_ownership = null;
            } else {
                this.party_ownership = clientPartyOwnershipEventDto;
            }
            if ((67108864 & i) == 0) {
                this.code_coverage_by_ownership = null;
            } else {
                this.code_coverage_by_ownership = clientCodeCoverageByOwnershipEventDto;
            }
            if ((134217728 & i) == 0) {
                this.code_coverage_by_module = null;
            } else {
                this.code_coverage_by_module = clientCodeCoverageByModuleEventDto;
            }
            if ((268435456 & i) == 0) {
                this.unused_code_by_module = null;
            } else {
                this.unused_code_by_module = clientUnusedCodeByModuleEventDto;
            }
            if ((536870912 & i) == 0) {
                this.snapshot_test = null;
            } else {
                this.snapshot_test = clientSnapshotTestEventDto;
            }
            if ((1073741824 & i) == 0) {
                this.securityware_benchmark = null;
            } else {
                this.securityware_benchmark = clientSecuritywareBenchmarkEventDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.bazel_spawn_exec = null;
            } else {
                this.bazel_spawn_exec = clientBazelSpawnExecEventDto;
            }
            this.source = (i2 & 1) == 0 ? "" : str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ClientBuildTimeEventDto clientBuildTimeEventDto = self.build_time;
            if (clientBuildTimeEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ClientBuildTimeEventDto.Serializer.INSTANCE, clientBuildTimeEventDto);
            }
            ClientCIEventDto clientCIEventDto = self.ci;
            if (clientCIEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ClientCIEventDto.Serializer.INSTANCE, clientCIEventDto);
            }
            ClientCIStepEventDto clientCIStepEventDto = self.ci_step;
            if (clientCIStepEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ClientCIStepEventDto.Serializer.INSTANCE, clientCIStepEventDto);
            }
            ClientCodeOccurenceEventDto clientCodeOccurenceEventDto = self.code_occurence;
            if (clientCodeOccurenceEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ClientCodeOccurenceEventDto.Serializer.INSTANCE, clientCodeOccurenceEventDto);
            }
            ClientDeployEventDto clientDeployEventDto = self.deploy;
            if (clientDeployEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ClientDeployEventDto.Serializer.INSTANCE, clientDeployEventDto);
            }
            ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto = self.broken_main_branch;
            if (clientBrokenMainBranchEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ClientBrokenMainBranchEventDto.Serializer.INSTANCE, clientBrokenMainBranchEventDto);
            }
            ClientModuleEventDto clientModuleEventDto = self.module;
            if (clientModuleEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ClientModuleEventDto.Serializer.INSTANCE, clientModuleEventDto);
            }
            ClientTestSuiteEventDto clientTestSuiteEventDto = self.test_suite;
            if (clientTestSuiteEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ClientTestSuiteEventDto.Serializer.INSTANCE, clientTestSuiteEventDto);
            }
            ClientBuildStepEventDto clientBuildStepEventDto = self.build_step;
            if (clientBuildStepEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ClientBuildStepEventDto.Serializer.INSTANCE, clientBuildStepEventDto);
            }
            ClientTestEventDto clientTestEventDto = self.test;
            if (clientTestEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ClientTestEventDto.Serializer.INSTANCE, clientTestEventDto);
            }
            ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto = self.test_alert;
            if (clientIntegrationTestAlertEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ClientIntegrationTestAlertEventDto.Serializer.INSTANCE, clientIntegrationTestAlertEventDto);
            }
            ClientToolchainEventDto clientToolchainEventDto = self.toolchain_event;
            if (clientToolchainEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ClientToolchainEventDto.Serializer.INSTANCE, clientToolchainEventDto);
            }
            ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto = self.overall_profile_modules_result;
            if (clientOverallProfileModulesResultEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, ClientOverallProfileModulesResultEventDto.Serializer.INSTANCE, clientOverallProfileModulesResultEventDto);
            }
            ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto = self.individual_profile_module_result;
            if (clientIndividualProfileModuleResultEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ClientIndividualProfileModuleResultEventDto.Serializer.INSTANCE, clientIndividualProfileModuleResultEventDto);
            }
            ClientBenchmarkResultEventDto clientBenchmarkResultEventDto = self.benchmark_result;
            if (clientBenchmarkResultEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, ClientBenchmarkResultEventDto.Serializer.INSTANCE, clientBenchmarkResultEventDto);
            }
            ClientApolloErrorEventDto clientApolloErrorEventDto = self.apollo_error;
            if (clientApolloErrorEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, ClientApolloErrorEventDto.Serializer.INSTANCE, clientApolloErrorEventDto);
            }
            ClientBinaryEventDto clientBinaryEventDto = self.binary;
            if (clientBinaryEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, ClientBinaryEventDto.Serializer.INSTANCE, clientBinaryEventDto);
            }
            ClientCacheMissEventDto clientCacheMissEventDto = self.cache_miss;
            if (clientCacheMissEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, ClientCacheMissEventDto.Serializer.INSTANCE, clientCacheMissEventDto);
            }
            ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto = self.dependency_graph;
            if (clientDependencyGraphMetricsEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, ClientDependencyGraphMetricsEventDto.Serializer.INSTANCE, clientDependencyGraphMetricsEventDto);
            }
            ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto = self.build_impact;
            if (clientBuildImpactMetricsEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ClientBuildImpactMetricsEventDto.Serializer.INSTANCE, clientBuildImpactMetricsEventDto);
            }
            ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto = self.build_impact_module;
            if (clientBuildImpactModuleMetricsEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, ClientBuildImpactModuleMetricsEventDto.Serializer.INSTANCE, clientBuildImpactModuleMetricsEventDto);
            }
            ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto = self.crashlytics_metric;
            if (clientCrashlyticsMetricsEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, ClientCrashlyticsMetricsEventDto.Serializer.INSTANCE, clientCrashlyticsMetricsEventDto);
            }
            ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto = self.firebase_screen_metric;
            if (clientFirebaseScreenMetricsEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, ClientFirebaseScreenMetricsEventDto.Serializer.INSTANCE, clientFirebaseScreenMetricsEventDto);
            }
            ClientAppPerformanceEventDto clientAppPerformanceEventDto = self.app_performance;
            if (clientAppPerformanceEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, ClientAppPerformanceEventDto.Serializer.INSTANCE, clientAppPerformanceEventDto);
            }
            ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto = self.aggregated_code_ownership;
            if (clientAggregatedCodeOwnershipEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, ClientAggregatedCodeOwnershipEventDto.Serializer.INSTANCE, clientAggregatedCodeOwnershipEventDto);
            }
            ClientPartyOwnershipEventDto clientPartyOwnershipEventDto = self.party_ownership;
            if (clientPartyOwnershipEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, ClientPartyOwnershipEventDto.Serializer.INSTANCE, clientPartyOwnershipEventDto);
            }
            ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto = self.code_coverage_by_ownership;
            if (clientCodeCoverageByOwnershipEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, ClientCodeCoverageByOwnershipEventDto.Serializer.INSTANCE, clientCodeCoverageByOwnershipEventDto);
            }
            ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto = self.code_coverage_by_module;
            if (clientCodeCoverageByModuleEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, ClientCodeCoverageByModuleEventDto.Serializer.INSTANCE, clientCodeCoverageByModuleEventDto);
            }
            ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto = self.unused_code_by_module;
            if (clientUnusedCodeByModuleEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, ClientUnusedCodeByModuleEventDto.Serializer.INSTANCE, clientUnusedCodeByModuleEventDto);
            }
            ClientSnapshotTestEventDto clientSnapshotTestEventDto = self.snapshot_test;
            if (clientSnapshotTestEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, ClientSnapshotTestEventDto.Serializer.INSTANCE, clientSnapshotTestEventDto);
            }
            ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto = self.securityware_benchmark;
            if (clientSecuritywareBenchmarkEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, ClientSecuritywareBenchmarkEventDto.Serializer.INSTANCE, clientSecuritywareBenchmarkEventDto);
            }
            ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto = self.bazel_spawn_exec;
            if (clientBazelSpawnExecEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, ClientBazelSpawnExecEventDto.Serializer.INSTANCE, clientBazelSpawnExecEventDto);
            }
            if (Intrinsics.areEqual(self.source, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 32, self.source);
        }

        public Surrogate(ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.build_time = clientBuildTimeEventDto;
            this.ci = clientCIEventDto;
            this.ci_step = clientCIStepEventDto;
            this.code_occurence = clientCodeOccurenceEventDto;
            this.deploy = clientDeployEventDto;
            this.broken_main_branch = clientBrokenMainBranchEventDto;
            this.module = clientModuleEventDto;
            this.test_suite = clientTestSuiteEventDto;
            this.build_step = clientBuildStepEventDto;
            this.test = clientTestEventDto;
            this.test_alert = clientIntegrationTestAlertEventDto;
            this.toolchain_event = clientToolchainEventDto;
            this.overall_profile_modules_result = clientOverallProfileModulesResultEventDto;
            this.individual_profile_module_result = clientIndividualProfileModuleResultEventDto;
            this.benchmark_result = clientBenchmarkResultEventDto;
            this.apollo_error = clientApolloErrorEventDto;
            this.binary = clientBinaryEventDto;
            this.cache_miss = clientCacheMissEventDto;
            this.dependency_graph = clientDependencyGraphMetricsEventDto;
            this.build_impact = clientBuildImpactMetricsEventDto;
            this.build_impact_module = clientBuildImpactModuleMetricsEventDto;
            this.crashlytics_metric = clientCrashlyticsMetricsEventDto;
            this.firebase_screen_metric = clientFirebaseScreenMetricsEventDto;
            this.app_performance = clientAppPerformanceEventDto;
            this.aggregated_code_ownership = clientAggregatedCodeOwnershipEventDto;
            this.party_ownership = clientPartyOwnershipEventDto;
            this.code_coverage_by_ownership = clientCodeCoverageByOwnershipEventDto;
            this.code_coverage_by_module = clientCodeCoverageByModuleEventDto;
            this.unused_code_by_module = clientUnusedCodeByModuleEventDto;
            this.snapshot_test = clientSnapshotTestEventDto;
            this.securityware_benchmark = clientSecuritywareBenchmarkEventDto;
            this.bazel_spawn_exec = clientBazelSpawnExecEventDto;
            this.source = source;
        }

        public final ClientBuildTimeEventDto getBuild_time() {
            return this.build_time;
        }

        public final ClientCIEventDto getCi() {
            return this.ci;
        }

        public final ClientCIStepEventDto getCi_step() {
            return this.ci_step;
        }

        public final ClientCodeOccurenceEventDto getCode_occurence() {
            return this.code_occurence;
        }

        public final ClientDeployEventDto getDeploy() {
            return this.deploy;
        }

        public final ClientBrokenMainBranchEventDto getBroken_main_branch() {
            return this.broken_main_branch;
        }

        public final ClientModuleEventDto getModule() {
            return this.module;
        }

        public final ClientTestSuiteEventDto getTest_suite() {
            return this.test_suite;
        }

        public final ClientBuildStepEventDto getBuild_step() {
            return this.build_step;
        }

        public final ClientTestEventDto getTest() {
            return this.test;
        }

        public final ClientIntegrationTestAlertEventDto getTest_alert() {
            return this.test_alert;
        }

        public final ClientToolchainEventDto getToolchain_event() {
            return this.toolchain_event;
        }

        public final ClientOverallProfileModulesResultEventDto getOverall_profile_modules_result() {
            return this.overall_profile_modules_result;
        }

        public final ClientIndividualProfileModuleResultEventDto getIndividual_profile_module_result() {
            return this.individual_profile_module_result;
        }

        public final ClientBenchmarkResultEventDto getBenchmark_result() {
            return this.benchmark_result;
        }

        public final ClientApolloErrorEventDto getApollo_error() {
            return this.apollo_error;
        }

        public final ClientBinaryEventDto getBinary() {
            return this.binary;
        }

        public final ClientCacheMissEventDto getCache_miss() {
            return this.cache_miss;
        }

        public final ClientDependencyGraphMetricsEventDto getDependency_graph() {
            return this.dependency_graph;
        }

        public final ClientBuildImpactMetricsEventDto getBuild_impact() {
            return this.build_impact;
        }

        public final ClientBuildImpactModuleMetricsEventDto getBuild_impact_module() {
            return this.build_impact_module;
        }

        public final ClientCrashlyticsMetricsEventDto getCrashlytics_metric() {
            return this.crashlytics_metric;
        }

        public final ClientFirebaseScreenMetricsEventDto getFirebase_screen_metric() {
            return this.firebase_screen_metric;
        }

        public final ClientAppPerformanceEventDto getApp_performance() {
            return this.app_performance;
        }

        public final ClientAggregatedCodeOwnershipEventDto getAggregated_code_ownership() {
            return this.aggregated_code_ownership;
        }

        public final ClientPartyOwnershipEventDto getParty_ownership() {
            return this.party_ownership;
        }

        public final ClientCodeCoverageByOwnershipEventDto getCode_coverage_by_ownership() {
            return this.code_coverage_by_ownership;
        }

        public final ClientCodeCoverageByModuleEventDto getCode_coverage_by_module() {
            return this.code_coverage_by_module;
        }

        public final ClientUnusedCodeByModuleEventDto getUnused_code_by_module() {
            return this.unused_code_by_module;
        }

        public final ClientSnapshotTestEventDto getSnapshot_test() {
            return this.snapshot_test;
        }

        public final ClientSecuritywareBenchmarkEventDto getSecurityware_benchmark() {
            return this.securityware_benchmark;
        }

        public final ClientBazelSpawnExecEventDto getBazel_spawn_exec() {
            return this.bazel_spawn_exec;
        }

        public final String getSource() {
            return this.source;
        }

        public /* synthetic */ Surrogate(ClientBuildTimeEventDto clientBuildTimeEventDto, ClientCIEventDto clientCIEventDto, ClientCIStepEventDto clientCIStepEventDto, ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientDeployEventDto clientDeployEventDto, ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDto, ClientModuleEventDto clientModuleEventDto, ClientTestSuiteEventDto clientTestSuiteEventDto, ClientBuildStepEventDto clientBuildStepEventDto, ClientTestEventDto clientTestEventDto, ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDto, ClientToolchainEventDto clientToolchainEventDto, ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientBenchmarkResultEventDto clientBenchmarkResultEventDto, ClientApolloErrorEventDto clientApolloErrorEventDto, ClientBinaryEventDto clientBinaryEventDto, ClientCacheMissEventDto clientCacheMissEventDto, ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDto, ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDto, ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientAppPerformanceEventDto clientAppPerformanceEventDto, ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDto, ClientPartyOwnershipEventDto clientPartyOwnershipEventDto, ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDto, ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDto, ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDto, ClientSnapshotTestEventDto clientSnapshotTestEventDto, ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : clientBuildTimeEventDto, (i & 2) != 0 ? null : clientCIEventDto, (i & 4) != 0 ? null : clientCIStepEventDto, (i & 8) != 0 ? null : clientCodeOccurenceEventDto, (i & 16) != 0 ? null : clientDeployEventDto, (i & 32) != 0 ? null : clientBrokenMainBranchEventDto, (i & 64) != 0 ? null : clientModuleEventDto, (i & 128) != 0 ? null : clientTestSuiteEventDto, (i & 256) != 0 ? null : clientBuildStepEventDto, (i & 512) != 0 ? null : clientTestEventDto, (i & 1024) != 0 ? null : clientIntegrationTestAlertEventDto, (i & 2048) != 0 ? null : clientToolchainEventDto, (i & 4096) != 0 ? null : clientOverallProfileModulesResultEventDto, (i & 8192) != 0 ? null : clientIndividualProfileModuleResultEventDto, (i & 16384) != 0 ? null : clientBenchmarkResultEventDto, (i & 32768) != 0 ? null : clientApolloErrorEventDto, (i & 65536) != 0 ? null : clientBinaryEventDto, (i & 131072) != 0 ? null : clientCacheMissEventDto, (i & 262144) != 0 ? null : clientDependencyGraphMetricsEventDto, (i & 524288) != 0 ? null : clientBuildImpactMetricsEventDto, (i & 1048576) != 0 ? null : clientBuildImpactModuleMetricsEventDto, (i & 2097152) != 0 ? null : clientCrashlyticsMetricsEventDto, (i & 4194304) != 0 ? null : clientFirebaseScreenMetricsEventDto, (i & 8388608) != 0 ? null : clientAppPerformanceEventDto, (i & 16777216) != 0 ? null : clientAggregatedCodeOwnershipEventDto, (i & 33554432) != 0 ? null : clientPartyOwnershipEventDto, (i & 67108864) != 0 ? null : clientCodeCoverageByOwnershipEventDto, (i & 134217728) != 0 ? null : clientCodeCoverageByModuleEventDto, (i & 268435456) != 0 ? null : clientUnusedCodeByModuleEventDto, (i & 536870912) != 0 ? null : clientSnapshotTestEventDto, (i & 1073741824) != 0 ? null : clientSecuritywareBenchmarkEventDto, (i & Integer.MIN_VALUE) != 0 ? null : clientBazelSpawnExecEventDto, (i2 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: ClientMetricEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientMetricEventDto, ClientMetricEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientMetricEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientMetricEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientMetricEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientMetricEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientMetricEvent> getProtoAdapter() {
            return ClientMetricEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientMetricEventDto getZeroValue() {
            return ClientMetricEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientMetricEventDto fromProto(ClientMetricEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientBuildTimeEvent build_time = proto.getBuild_time();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ClientBuildTimeEventDto clientBuildTimeEventDtoFromProto = build_time != null ? ClientBuildTimeEventDto.INSTANCE.fromProto(build_time) : null;
            ClientCIEvent ci = proto.getCi();
            ClientCIEventDto clientCIEventDtoFromProto = ci != null ? ClientCIEventDto.INSTANCE.fromProto(ci) : null;
            ClientCIStepEvent ci_step = proto.getCi_step();
            ClientCIStepEventDto clientCIStepEventDtoFromProto = ci_step != null ? ClientCIStepEventDto.INSTANCE.fromProto(ci_step) : null;
            ClientCodeOccurenceEvent code_occurence = proto.getCode_occurence();
            ClientCodeOccurenceEventDto clientCodeOccurenceEventDtoFromProto = code_occurence != null ? ClientCodeOccurenceEventDto.INSTANCE.fromProto(code_occurence) : null;
            ClientDeployEvent deploy = proto.getDeploy();
            ClientDeployEventDto clientDeployEventDtoFromProto = deploy != null ? ClientDeployEventDto.INSTANCE.fromProto(deploy) : null;
            ClientBrokenMainBranchEvent broken_main_branch = proto.getBroken_main_branch();
            ClientBrokenMainBranchEventDto clientBrokenMainBranchEventDtoFromProto = broken_main_branch != null ? ClientBrokenMainBranchEventDto.INSTANCE.fromProto(broken_main_branch) : null;
            ClientModuleEvent module = proto.getModule();
            ClientModuleEventDto clientModuleEventDtoFromProto = module != null ? ClientModuleEventDto.INSTANCE.fromProto(module) : null;
            ClientTestSuiteEvent test_suite = proto.getTest_suite();
            ClientTestSuiteEventDto clientTestSuiteEventDtoFromProto = test_suite != null ? ClientTestSuiteEventDto.INSTANCE.fromProto(test_suite) : null;
            ClientBuildStepEvent build_step = proto.getBuild_step();
            ClientBuildStepEventDto clientBuildStepEventDtoFromProto = build_step != null ? ClientBuildStepEventDto.INSTANCE.fromProto(build_step) : null;
            ClientTestEvent test = proto.getTest();
            ClientTestEventDto clientTestEventDtoFromProto = test != null ? ClientTestEventDto.INSTANCE.fromProto(test) : null;
            ClientIntegrationTestAlertEvent test_alert = proto.getTest_alert();
            ClientIntegrationTestAlertEventDto clientIntegrationTestAlertEventDtoFromProto = test_alert != null ? ClientIntegrationTestAlertEventDto.INSTANCE.fromProto(test_alert) : null;
            ClientToolchainEvent toolchain_event = proto.getToolchain_event();
            ClientToolchainEventDto clientToolchainEventDtoFromProto = toolchain_event != null ? ClientToolchainEventDto.INSTANCE.fromProto(toolchain_event) : null;
            ClientOverallProfileModulesResultEvent overall_profile_modules_result = proto.getOverall_profile_modules_result();
            ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDtoFromProto = overall_profile_modules_result != null ? ClientOverallProfileModulesResultEventDto.INSTANCE.fromProto(overall_profile_modules_result) : null;
            ClientIndividualProfileModuleResultEvent individual_profile_module_result = proto.getIndividual_profile_module_result();
            ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDtoFromProto = individual_profile_module_result != null ? ClientIndividualProfileModuleResultEventDto.INSTANCE.fromProto(individual_profile_module_result) : null;
            ClientBenchmarkResultEvent benchmark_result = proto.getBenchmark_result();
            ClientBenchmarkResultEventDto clientBenchmarkResultEventDtoFromProto = benchmark_result != null ? ClientBenchmarkResultEventDto.INSTANCE.fromProto(benchmark_result) : null;
            ClientApolloErrorEvent apollo_error = proto.getApollo_error();
            ClientApolloErrorEventDto clientApolloErrorEventDtoFromProto = apollo_error != null ? ClientApolloErrorEventDto.INSTANCE.fromProto(apollo_error) : null;
            ClientBinaryEvent binary = proto.getBinary();
            ClientBinaryEventDto clientBinaryEventDtoFromProto = binary != null ? ClientBinaryEventDto.INSTANCE.fromProto(binary) : null;
            ClientCacheMissEvent cache_miss = proto.getCache_miss();
            ClientCacheMissEventDto clientCacheMissEventDtoFromProto = cache_miss != null ? ClientCacheMissEventDto.INSTANCE.fromProto(cache_miss) : null;
            ClientDependencyGraphMetricsEvent dependency_graph = proto.getDependency_graph();
            ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDtoFromProto = dependency_graph != null ? ClientDependencyGraphMetricsEventDto.INSTANCE.fromProto(dependency_graph) : null;
            ClientBuildImpactMetricsEvent build_impact = proto.getBuild_impact();
            ClientBuildImpactMetricsEventDto clientBuildImpactMetricsEventDtoFromProto = build_impact != null ? ClientBuildImpactMetricsEventDto.INSTANCE.fromProto(build_impact) : null;
            ClientBuildImpactModuleMetricsEvent build_impact_module = proto.getBuild_impact_module();
            ClientBuildImpactModuleMetricsEventDto clientBuildImpactModuleMetricsEventDtoFromProto = build_impact_module != null ? ClientBuildImpactModuleMetricsEventDto.INSTANCE.fromProto(build_impact_module) : null;
            ClientCrashlyticsMetricsEvent crashlytics_metric = proto.getCrashlytics_metric();
            ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDtoFromProto = crashlytics_metric != null ? ClientCrashlyticsMetricsEventDto.INSTANCE.fromProto(crashlytics_metric) : null;
            ClientFirebaseScreenMetricsEvent firebase_screen_metric = proto.getFirebase_screen_metric();
            ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDtoFromProto = firebase_screen_metric != null ? ClientFirebaseScreenMetricsEventDto.INSTANCE.fromProto(firebase_screen_metric) : null;
            ClientAppPerformanceEvent app_performance = proto.getApp_performance();
            ClientAppPerformanceEventDto clientAppPerformanceEventDtoFromProto = app_performance != null ? ClientAppPerformanceEventDto.INSTANCE.fromProto(app_performance) : null;
            ClientAggregatedCodeOwnershipEvent aggregated_code_ownership = proto.getAggregated_code_ownership();
            ClientAggregatedCodeOwnershipEventDto clientAggregatedCodeOwnershipEventDtoFromProto = aggregated_code_ownership != null ? ClientAggregatedCodeOwnershipEventDto.INSTANCE.fromProto(aggregated_code_ownership) : null;
            ClientPartyOwnershipEvent party_ownership = proto.getParty_ownership();
            ClientPartyOwnershipEventDto clientPartyOwnershipEventDtoFromProto = party_ownership != null ? ClientPartyOwnershipEventDto.INSTANCE.fromProto(party_ownership) : null;
            ClientCodeCoverageByOwnershipEvent code_coverage_by_ownership = proto.getCode_coverage_by_ownership();
            ClientCodeCoverageByOwnershipEventDto clientCodeCoverageByOwnershipEventDtoFromProto = code_coverage_by_ownership != null ? ClientCodeCoverageByOwnershipEventDto.INSTANCE.fromProto(code_coverage_by_ownership) : null;
            ClientCodeCoverageByModuleEvent code_coverage_by_module = proto.getCode_coverage_by_module();
            ClientCodeCoverageByModuleEventDto clientCodeCoverageByModuleEventDtoFromProto = code_coverage_by_module != null ? ClientCodeCoverageByModuleEventDto.INSTANCE.fromProto(code_coverage_by_module) : null;
            ClientUnusedCodeByModuleEvent unused_code_by_module = proto.getUnused_code_by_module();
            ClientUnusedCodeByModuleEventDto clientUnusedCodeByModuleEventDtoFromProto = unused_code_by_module != null ? ClientUnusedCodeByModuleEventDto.INSTANCE.fromProto(unused_code_by_module) : null;
            ClientSnapshotTestEvent snapshot_test = proto.getSnapshot_test();
            ClientSnapshotTestEventDto clientSnapshotTestEventDtoFromProto = snapshot_test != null ? ClientSnapshotTestEventDto.INSTANCE.fromProto(snapshot_test) : null;
            ClientSecuritywareBenchmarkEvent securityware_benchmark = proto.getSecurityware_benchmark();
            ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDtoFromProto = securityware_benchmark != null ? ClientSecuritywareBenchmarkEventDto.INSTANCE.fromProto(securityware_benchmark) : null;
            ClientBazelSpawnExecEvent bazel_spawn_exec = proto.getBazel_spawn_exec();
            return new ClientMetricEventDto(new Surrogate(clientBuildTimeEventDtoFromProto, clientCIEventDtoFromProto, clientCIStepEventDtoFromProto, clientCodeOccurenceEventDtoFromProto, clientDeployEventDtoFromProto, clientBrokenMainBranchEventDtoFromProto, clientModuleEventDtoFromProto, clientTestSuiteEventDtoFromProto, clientBuildStepEventDtoFromProto, clientTestEventDtoFromProto, clientIntegrationTestAlertEventDtoFromProto, clientToolchainEventDtoFromProto, clientOverallProfileModulesResultEventDtoFromProto, clientIndividualProfileModuleResultEventDtoFromProto, clientBenchmarkResultEventDtoFromProto, clientApolloErrorEventDtoFromProto, clientBinaryEventDtoFromProto, clientCacheMissEventDtoFromProto, clientDependencyGraphMetricsEventDtoFromProto, clientBuildImpactMetricsEventDtoFromProto, clientBuildImpactModuleMetricsEventDtoFromProto, clientCrashlyticsMetricsEventDtoFromProto, clientFirebaseScreenMetricsEventDtoFromProto, clientAppPerformanceEventDtoFromProto, clientAggregatedCodeOwnershipEventDtoFromProto, clientPartyOwnershipEventDtoFromProto, clientCodeCoverageByOwnershipEventDtoFromProto, clientCodeCoverageByModuleEventDtoFromProto, clientUnusedCodeByModuleEventDtoFromProto, clientSnapshotTestEventDtoFromProto, clientSecuritywareBenchmarkEventDtoFromProto, bazel_spawn_exec != null ? ClientBazelSpawnExecEventDto.INSTANCE.fromProto(bazel_spawn_exec) : null, proto.getSource()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientMetricEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientMetricEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientMetricEventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientMetricEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientMetricEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientMetricEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientMetricEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientMetricEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientMetricEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientMetricEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientMetricEventDto";
        }
    }
}
