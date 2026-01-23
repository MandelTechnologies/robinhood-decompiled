package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ClientMetricEvent.kt */
@Metadata(m3635d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u0094\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0094\u0001B\u009b\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010C\u001a\u00020D\u0012\b\b\u0002\u0010E\u001a\u00020F¢\u0006\u0004\bG\u0010HJ\t\u0010\u008b\u0001\u001a\u00020\u0002H\u0017J\u0017\u0010\u008c\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0096\u0002J\n\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\t\u0010\u0092\u0001\u001a\u00020DH\u0016J\u009b\u0003\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020FR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0018\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0018\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0019\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010C\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientMetricEvent;", "Lcom/squareup/wire/Message;", "", "build_time", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "ci", "Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "ci_step", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "code_occurence", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "deploy", "Lcom/robinhood/rosetta/eventlogging/ClientDeployEvent;", "broken_main_branch", "Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEvent;", "module", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "test_suite", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "build_step", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;", "test", "Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "test_alert", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "toolchain_event", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "overall_profile_modules_result", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "individual_profile_module_result", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "benchmark_result", "Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEvent;", "apollo_error", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "binary", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "cache_miss", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;", "dependency_graph", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;", "build_impact", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "build_impact_module", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "crashlytics_metric", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "firebase_screen_metric", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;", "app_performance", "Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEvent;", "aggregated_code_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEvent;", "party_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEvent;", "code_coverage_by_ownership", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEvent;", "code_coverage_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEvent;", "unused_code_by_module", "Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEvent;", "snapshot_test", "Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEvent;", "securityware_benchmark", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "bazel_spawn_exec", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "source", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;Lcom/robinhood/rosetta/eventlogging/ClientDeployEvent;Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEvent;Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEvent;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEvent;Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEvent;Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEvent;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEvent;Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEvent;Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEvent;Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEvent;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;Ljava/lang/String;Lokio/ByteString;)V", "getBuild_time", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "getCi", "()Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "getCi_step", "()Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "getCode_occurence", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "getDeploy", "()Lcom/robinhood/rosetta/eventlogging/ClientDeployEvent;", "getBroken_main_branch", "()Lcom/robinhood/rosetta/eventlogging/ClientBrokenMainBranchEvent;", "getModule", "()Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "getTest_suite", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "getBuild_step", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;", "getTest", "()Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "getTest_alert", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "getToolchain_event", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "getOverall_profile_modules_result", "()Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "getIndividual_profile_module_result", "()Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "getBenchmark_result", "()Lcom/robinhood/rosetta/eventlogging/ClientBenchmarkResultEvent;", "getApollo_error", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "getBinary", "()Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "getCache_miss", "()Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;", "getDependency_graph", "()Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;", "getBuild_impact", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "getBuild_impact_module", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "getCrashlytics_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "getFirebase_screen_metric", "()Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;", "getApp_performance", "()Lcom/robinhood/rosetta/eventlogging/ClientAppPerformanceEvent;", "getAggregated_code_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientAggregatedCodeOwnershipEvent;", "getParty_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEvent;", "getCode_coverage_by_ownership", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByOwnershipEvent;", "getCode_coverage_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeCoverageByModuleEvent;", "getUnused_code_by_module", "()Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEvent;", "getSnapshot_test", "()Lcom/robinhood/rosetta/eventlogging/ClientSnapshotTestEvent;", "getSecurityware_benchmark", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "getBazel_spawn_exec", "()Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "getSource", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientMetricEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientMetricEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientAggregatedCodeOwnershipEvent#ADAPTER", jsonName = "aggregatedCodeOwnership", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 26)
    private final ClientAggregatedCodeOwnershipEvent aggregated_code_ownership;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent#ADAPTER", jsonName = "apolloError", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final ClientApolloErrorEvent apollo_error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientAppPerformanceEvent#ADAPTER", jsonName = "appPerformance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 25)
    private final ClientAppPerformanceEvent app_performance;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEvent#ADAPTER", jsonName = "bazelSpawnExec", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 33)
    private final ClientBazelSpawnExecEvent bazel_spawn_exec;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBenchmarkResultEvent#ADAPTER", jsonName = "benchmarkResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final ClientBenchmarkResultEvent benchmark_result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBinaryEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final ClientBinaryEvent binary;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBrokenMainBranchEvent#ADAPTER", jsonName = "brokenMainBranch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final ClientBrokenMainBranchEvent broken_main_branch;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEvent#ADAPTER", jsonName = "buildImpact", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final ClientBuildImpactMetricsEvent build_impact;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEvent#ADAPTER", jsonName = "buildImpactModule", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final ClientBuildImpactModuleMetricsEvent build_impact_module;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBuildStepEvent#ADAPTER", jsonName = "buildStep", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final ClientBuildStepEvent build_step;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientBuildTimeEvent#ADAPTER", jsonName = "buildTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientBuildTimeEvent build_time;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCacheMissEvent#ADAPTER", jsonName = "cacheMiss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final ClientCacheMissEvent cache_miss;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCIEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ClientCIEvent ci;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCIStepEvent#ADAPTER", jsonName = "ciStep", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 16)
    private final ClientCIStepEvent ci_step;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCodeCoverageByModuleEvent#ADAPTER", jsonName = "codeCoverageByModule", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 29)
    private final ClientCodeCoverageByModuleEvent code_coverage_by_module;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCodeCoverageByOwnershipEvent#ADAPTER", jsonName = "codeCoverageByOwnership", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 28)
    private final ClientCodeCoverageByOwnershipEvent code_coverage_by_ownership;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEvent#ADAPTER", jsonName = "codeOccurence", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final ClientCodeOccurenceEvent code_occurence;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCrashlyticsMetricsEvent#ADAPTER", jsonName = "crashlyticsMetric", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final ClientCrashlyticsMetricsEvent crashlytics_metric;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEvent#ADAPTER", jsonName = "dependencyGraph", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final ClientDependencyGraphMetricsEvent dependency_graph;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientDeployEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final ClientDeployEvent deploy;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEvent#ADAPTER", jsonName = "firebaseScreenMetric", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 24)
    private final ClientFirebaseScreenMetricsEvent firebase_screen_metric;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEvent#ADAPTER", jsonName = "individualProfileModuleResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final ClientIndividualProfileModuleResultEvent individual_profile_module_result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientModuleEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final ClientModuleEvent module;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientOverallProfileModulesResultEvent#ADAPTER", jsonName = "overallProfileModulesResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final ClientOverallProfileModulesResultEvent overall_profile_modules_result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPartyOwnershipEvent#ADAPTER", jsonName = "partyOwnership", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 27)
    private final ClientPartyOwnershipEvent party_ownership;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent#ADAPTER", jsonName = "securitywareBenchmark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 32)
    private final ClientSecuritywareBenchmarkEvent securityware_benchmark;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientSnapshotTestEvent#ADAPTER", jsonName = "snapshotTest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 31)
    private final ClientSnapshotTestEvent snapshot_test;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 8)
    private final String source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final ClientTestEvent test;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertEvent#ADAPTER", jsonName = "testAlert", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final ClientIntegrationTestAlertEvent test_alert;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteEvent#ADAPTER", jsonName = "testSuite", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final ClientTestSuiteEvent test_suite;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientToolchainEvent#ADAPTER", jsonName = "toolchainEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final ClientToolchainEvent toolchain_event;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientUnusedCodeByModuleEvent#ADAPTER", jsonName = "unusedCodeByModule", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final ClientUnusedCodeByModuleEvent unused_code_by_module;

    public ClientMetricEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24104newBuilder();
    }

    public final ClientBuildTimeEvent getBuild_time() {
        return this.build_time;
    }

    public final ClientCIEvent getCi() {
        return this.ci;
    }

    public final ClientCIStepEvent getCi_step() {
        return this.ci_step;
    }

    public final ClientCodeOccurenceEvent getCode_occurence() {
        return this.code_occurence;
    }

    public final ClientDeployEvent getDeploy() {
        return this.deploy;
    }

    public final ClientBrokenMainBranchEvent getBroken_main_branch() {
        return this.broken_main_branch;
    }

    public final ClientModuleEvent getModule() {
        return this.module;
    }

    public final ClientTestSuiteEvent getTest_suite() {
        return this.test_suite;
    }

    public final ClientBuildStepEvent getBuild_step() {
        return this.build_step;
    }

    public final ClientTestEvent getTest() {
        return this.test;
    }

    public final ClientIntegrationTestAlertEvent getTest_alert() {
        return this.test_alert;
    }

    public final ClientToolchainEvent getToolchain_event() {
        return this.toolchain_event;
    }

    public final ClientOverallProfileModulesResultEvent getOverall_profile_modules_result() {
        return this.overall_profile_modules_result;
    }

    public final ClientIndividualProfileModuleResultEvent getIndividual_profile_module_result() {
        return this.individual_profile_module_result;
    }

    public final ClientBenchmarkResultEvent getBenchmark_result() {
        return this.benchmark_result;
    }

    public final ClientApolloErrorEvent getApollo_error() {
        return this.apollo_error;
    }

    public final ClientBinaryEvent getBinary() {
        return this.binary;
    }

    public final ClientCacheMissEvent getCache_miss() {
        return this.cache_miss;
    }

    public final ClientDependencyGraphMetricsEvent getDependency_graph() {
        return this.dependency_graph;
    }

    public final ClientBuildImpactMetricsEvent getBuild_impact() {
        return this.build_impact;
    }

    public final ClientBuildImpactModuleMetricsEvent getBuild_impact_module() {
        return this.build_impact_module;
    }

    public final ClientCrashlyticsMetricsEvent getCrashlytics_metric() {
        return this.crashlytics_metric;
    }

    public final ClientFirebaseScreenMetricsEvent getFirebase_screen_metric() {
        return this.firebase_screen_metric;
    }

    public final ClientAppPerformanceEvent getApp_performance() {
        return this.app_performance;
    }

    public final ClientAggregatedCodeOwnershipEvent getAggregated_code_ownership() {
        return this.aggregated_code_ownership;
    }

    public final ClientPartyOwnershipEvent getParty_ownership() {
        return this.party_ownership;
    }

    public final ClientCodeCoverageByOwnershipEvent getCode_coverage_by_ownership() {
        return this.code_coverage_by_ownership;
    }

    public final ClientCodeCoverageByModuleEvent getCode_coverage_by_module() {
        return this.code_coverage_by_module;
    }

    public final ClientUnusedCodeByModuleEvent getUnused_code_by_module() {
        return this.unused_code_by_module;
    }

    public final ClientSnapshotTestEvent getSnapshot_test() {
        return this.snapshot_test;
    }

    public final ClientSecuritywareBenchmarkEvent getSecurityware_benchmark() {
        return this.securityware_benchmark;
    }

    public final ClientBazelSpawnExecEvent getBazel_spawn_exec() {
        return this.bazel_spawn_exec;
    }

    public final String getSource() {
        return this.source;
    }

    public /* synthetic */ ClientMetricEvent(ClientBuildTimeEvent clientBuildTimeEvent, ClientCIEvent clientCIEvent, ClientCIStepEvent clientCIStepEvent, ClientCodeOccurenceEvent clientCodeOccurenceEvent, ClientDeployEvent clientDeployEvent, ClientBrokenMainBranchEvent clientBrokenMainBranchEvent, ClientModuleEvent clientModuleEvent, ClientTestSuiteEvent clientTestSuiteEvent, ClientBuildStepEvent clientBuildStepEvent, ClientTestEvent clientTestEvent, ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent, ClientToolchainEvent clientToolchainEvent, ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent, ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent, ClientBenchmarkResultEvent clientBenchmarkResultEvent, ClientApolloErrorEvent clientApolloErrorEvent, ClientBinaryEvent clientBinaryEvent, ClientCacheMissEvent clientCacheMissEvent, ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEvent, ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent, ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent, ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent, ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEvent, ClientAppPerformanceEvent clientAppPerformanceEvent, ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEvent, ClientPartyOwnershipEvent clientPartyOwnershipEvent, ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEvent, ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEvent, ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent, ClientSnapshotTestEvent clientSnapshotTestEvent, ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent, ClientBazelSpawnExecEvent clientBazelSpawnExecEvent, String str, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : clientBuildTimeEvent, (i & 2) != 0 ? null : clientCIEvent, (i & 4) != 0 ? null : clientCIStepEvent, (i & 8) != 0 ? null : clientCodeOccurenceEvent, (i & 16) != 0 ? null : clientDeployEvent, (i & 32) != 0 ? null : clientBrokenMainBranchEvent, (i & 64) != 0 ? null : clientModuleEvent, (i & 128) != 0 ? null : clientTestSuiteEvent, (i & 256) != 0 ? null : clientBuildStepEvent, (i & 512) != 0 ? null : clientTestEvent, (i & 1024) != 0 ? null : clientIntegrationTestAlertEvent, (i & 2048) != 0 ? null : clientToolchainEvent, (i & 4096) != 0 ? null : clientOverallProfileModulesResultEvent, (i & 8192) != 0 ? null : clientIndividualProfileModuleResultEvent, (i & 16384) != 0 ? null : clientBenchmarkResultEvent, (i & 32768) != 0 ? null : clientApolloErrorEvent, (i & 65536) != 0 ? null : clientBinaryEvent, (i & 131072) != 0 ? null : clientCacheMissEvent, (i & 262144) != 0 ? null : clientDependencyGraphMetricsEvent, (i & 524288) != 0 ? null : clientBuildImpactMetricsEvent, (i & 1048576) != 0 ? null : clientBuildImpactModuleMetricsEvent, (i & 2097152) != 0 ? null : clientCrashlyticsMetricsEvent, (i & 4194304) != 0 ? null : clientFirebaseScreenMetricsEvent, (i & 8388608) != 0 ? null : clientAppPerformanceEvent, (i & 16777216) != 0 ? null : clientAggregatedCodeOwnershipEvent, (i & 33554432) != 0 ? null : clientPartyOwnershipEvent, (i & 67108864) != 0 ? null : clientCodeCoverageByOwnershipEvent, (i & 134217728) != 0 ? null : clientCodeCoverageByModuleEvent, (i & 268435456) != 0 ? null : clientUnusedCodeByModuleEvent, (i & 536870912) != 0 ? null : clientSnapshotTestEvent, (i & 1073741824) != 0 ? null : clientSecuritywareBenchmarkEvent, (i & Integer.MIN_VALUE) != 0 ? null : clientBazelSpawnExecEvent, (i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientMetricEvent(ClientBuildTimeEvent clientBuildTimeEvent, ClientCIEvent clientCIEvent, ClientCIStepEvent clientCIStepEvent, ClientCodeOccurenceEvent clientCodeOccurenceEvent, ClientDeployEvent clientDeployEvent, ClientBrokenMainBranchEvent clientBrokenMainBranchEvent, ClientModuleEvent clientModuleEvent, ClientTestSuiteEvent clientTestSuiteEvent, ClientBuildStepEvent clientBuildStepEvent, ClientTestEvent clientTestEvent, ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent, ClientToolchainEvent clientToolchainEvent, ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent, ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent, ClientBenchmarkResultEvent clientBenchmarkResultEvent, ClientApolloErrorEvent clientApolloErrorEvent, ClientBinaryEvent clientBinaryEvent, ClientCacheMissEvent clientCacheMissEvent, ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEvent, ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent, ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent, ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent, ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEvent, ClientAppPerformanceEvent clientAppPerformanceEvent, ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEvent, ClientPartyOwnershipEvent clientPartyOwnershipEvent, ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEvent, ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEvent, ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent, ClientSnapshotTestEvent clientSnapshotTestEvent, ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent, ClientBazelSpawnExecEvent clientBazelSpawnExecEvent, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.build_time = clientBuildTimeEvent;
        this.ci = clientCIEvent;
        this.ci_step = clientCIStepEvent;
        this.code_occurence = clientCodeOccurenceEvent;
        this.deploy = clientDeployEvent;
        this.broken_main_branch = clientBrokenMainBranchEvent;
        this.module = clientModuleEvent;
        this.test_suite = clientTestSuiteEvent;
        this.build_step = clientBuildStepEvent;
        this.test = clientTestEvent;
        this.test_alert = clientIntegrationTestAlertEvent;
        this.toolchain_event = clientToolchainEvent;
        this.overall_profile_modules_result = clientOverallProfileModulesResultEvent;
        this.individual_profile_module_result = clientIndividualProfileModuleResultEvent;
        this.benchmark_result = clientBenchmarkResultEvent;
        this.apollo_error = clientApolloErrorEvent;
        this.binary = clientBinaryEvent;
        this.cache_miss = clientCacheMissEvent;
        this.dependency_graph = clientDependencyGraphMetricsEvent;
        this.build_impact = clientBuildImpactMetricsEvent;
        this.build_impact_module = clientBuildImpactModuleMetricsEvent;
        this.crashlytics_metric = clientCrashlyticsMetricsEvent;
        this.firebase_screen_metric = clientFirebaseScreenMetricsEvent;
        this.app_performance = clientAppPerformanceEvent;
        this.aggregated_code_ownership = clientAggregatedCodeOwnershipEvent;
        this.party_ownership = clientPartyOwnershipEvent;
        this.code_coverage_by_ownership = clientCodeCoverageByOwnershipEvent;
        this.code_coverage_by_module = clientCodeCoverageByModuleEvent;
        this.unused_code_by_module = clientUnusedCodeByModuleEvent;
        this.snapshot_test = clientSnapshotTestEvent;
        this.securityware_benchmark = clientSecuritywareBenchmarkEvent;
        this.bazel_spawn_exec = clientBazelSpawnExecEvent;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24104newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientMetricEvent)) {
            return false;
        }
        ClientMetricEvent clientMetricEvent = (ClientMetricEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientMetricEvent.unknownFields()) && Intrinsics.areEqual(this.build_time, clientMetricEvent.build_time) && Intrinsics.areEqual(this.ci, clientMetricEvent.ci) && Intrinsics.areEqual(this.ci_step, clientMetricEvent.ci_step) && Intrinsics.areEqual(this.code_occurence, clientMetricEvent.code_occurence) && Intrinsics.areEqual(this.deploy, clientMetricEvent.deploy) && Intrinsics.areEqual(this.broken_main_branch, clientMetricEvent.broken_main_branch) && Intrinsics.areEqual(this.module, clientMetricEvent.module) && Intrinsics.areEqual(this.test_suite, clientMetricEvent.test_suite) && Intrinsics.areEqual(this.build_step, clientMetricEvent.build_step) && Intrinsics.areEqual(this.test, clientMetricEvent.test) && Intrinsics.areEqual(this.test_alert, clientMetricEvent.test_alert) && Intrinsics.areEqual(this.toolchain_event, clientMetricEvent.toolchain_event) && Intrinsics.areEqual(this.overall_profile_modules_result, clientMetricEvent.overall_profile_modules_result) && Intrinsics.areEqual(this.individual_profile_module_result, clientMetricEvent.individual_profile_module_result) && Intrinsics.areEqual(this.benchmark_result, clientMetricEvent.benchmark_result) && Intrinsics.areEqual(this.apollo_error, clientMetricEvent.apollo_error) && Intrinsics.areEqual(this.binary, clientMetricEvent.binary) && Intrinsics.areEqual(this.cache_miss, clientMetricEvent.cache_miss) && Intrinsics.areEqual(this.dependency_graph, clientMetricEvent.dependency_graph) && Intrinsics.areEqual(this.build_impact, clientMetricEvent.build_impact) && Intrinsics.areEqual(this.build_impact_module, clientMetricEvent.build_impact_module) && Intrinsics.areEqual(this.crashlytics_metric, clientMetricEvent.crashlytics_metric) && Intrinsics.areEqual(this.firebase_screen_metric, clientMetricEvent.firebase_screen_metric) && Intrinsics.areEqual(this.app_performance, clientMetricEvent.app_performance) && Intrinsics.areEqual(this.aggregated_code_ownership, clientMetricEvent.aggregated_code_ownership) && Intrinsics.areEqual(this.party_ownership, clientMetricEvent.party_ownership) && Intrinsics.areEqual(this.code_coverage_by_ownership, clientMetricEvent.code_coverage_by_ownership) && Intrinsics.areEqual(this.code_coverage_by_module, clientMetricEvent.code_coverage_by_module) && Intrinsics.areEqual(this.unused_code_by_module, clientMetricEvent.unused_code_by_module) && Intrinsics.areEqual(this.snapshot_test, clientMetricEvent.snapshot_test) && Intrinsics.areEqual(this.securityware_benchmark, clientMetricEvent.securityware_benchmark) && Intrinsics.areEqual(this.bazel_spawn_exec, clientMetricEvent.bazel_spawn_exec) && Intrinsics.areEqual(this.source, clientMetricEvent.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ClientBuildTimeEvent clientBuildTimeEvent = this.build_time;
        int iHashCode2 = (iHashCode + (clientBuildTimeEvent != null ? clientBuildTimeEvent.hashCode() : 0)) * 37;
        ClientCIEvent clientCIEvent = this.ci;
        int iHashCode3 = (iHashCode2 + (clientCIEvent != null ? clientCIEvent.hashCode() : 0)) * 37;
        ClientCIStepEvent clientCIStepEvent = this.ci_step;
        int iHashCode4 = (iHashCode3 + (clientCIStepEvent != null ? clientCIStepEvent.hashCode() : 0)) * 37;
        ClientCodeOccurenceEvent clientCodeOccurenceEvent = this.code_occurence;
        int iHashCode5 = (iHashCode4 + (clientCodeOccurenceEvent != null ? clientCodeOccurenceEvent.hashCode() : 0)) * 37;
        ClientDeployEvent clientDeployEvent = this.deploy;
        int iHashCode6 = (iHashCode5 + (clientDeployEvent != null ? clientDeployEvent.hashCode() : 0)) * 37;
        ClientBrokenMainBranchEvent clientBrokenMainBranchEvent = this.broken_main_branch;
        int iHashCode7 = (iHashCode6 + (clientBrokenMainBranchEvent != null ? clientBrokenMainBranchEvent.hashCode() : 0)) * 37;
        ClientModuleEvent clientModuleEvent = this.module;
        int iHashCode8 = (iHashCode7 + (clientModuleEvent != null ? clientModuleEvent.hashCode() : 0)) * 37;
        ClientTestSuiteEvent clientTestSuiteEvent = this.test_suite;
        int iHashCode9 = (iHashCode8 + (clientTestSuiteEvent != null ? clientTestSuiteEvent.hashCode() : 0)) * 37;
        ClientBuildStepEvent clientBuildStepEvent = this.build_step;
        int iHashCode10 = (iHashCode9 + (clientBuildStepEvent != null ? clientBuildStepEvent.hashCode() : 0)) * 37;
        ClientTestEvent clientTestEvent = this.test;
        int iHashCode11 = (iHashCode10 + (clientTestEvent != null ? clientTestEvent.hashCode() : 0)) * 37;
        ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent = this.test_alert;
        int iHashCode12 = (iHashCode11 + (clientIntegrationTestAlertEvent != null ? clientIntegrationTestAlertEvent.hashCode() : 0)) * 37;
        ClientToolchainEvent clientToolchainEvent = this.toolchain_event;
        int iHashCode13 = (iHashCode12 + (clientToolchainEvent != null ? clientToolchainEvent.hashCode() : 0)) * 37;
        ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent = this.overall_profile_modules_result;
        int iHashCode14 = (iHashCode13 + (clientOverallProfileModulesResultEvent != null ? clientOverallProfileModulesResultEvent.hashCode() : 0)) * 37;
        ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent = this.individual_profile_module_result;
        int iHashCode15 = (iHashCode14 + (clientIndividualProfileModuleResultEvent != null ? clientIndividualProfileModuleResultEvent.hashCode() : 0)) * 37;
        ClientBenchmarkResultEvent clientBenchmarkResultEvent = this.benchmark_result;
        int iHashCode16 = (iHashCode15 + (clientBenchmarkResultEvent != null ? clientBenchmarkResultEvent.hashCode() : 0)) * 37;
        ClientApolloErrorEvent clientApolloErrorEvent = this.apollo_error;
        int iHashCode17 = (iHashCode16 + (clientApolloErrorEvent != null ? clientApolloErrorEvent.hashCode() : 0)) * 37;
        ClientBinaryEvent clientBinaryEvent = this.binary;
        int iHashCode18 = (iHashCode17 + (clientBinaryEvent != null ? clientBinaryEvent.hashCode() : 0)) * 37;
        ClientCacheMissEvent clientCacheMissEvent = this.cache_miss;
        int iHashCode19 = (iHashCode18 + (clientCacheMissEvent != null ? clientCacheMissEvent.hashCode() : 0)) * 37;
        ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEvent = this.dependency_graph;
        int iHashCode20 = (iHashCode19 + (clientDependencyGraphMetricsEvent != null ? clientDependencyGraphMetricsEvent.hashCode() : 0)) * 37;
        ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent = this.build_impact;
        int iHashCode21 = (iHashCode20 + (clientBuildImpactMetricsEvent != null ? clientBuildImpactMetricsEvent.hashCode() : 0)) * 37;
        ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent = this.build_impact_module;
        int iHashCode22 = (iHashCode21 + (clientBuildImpactModuleMetricsEvent != null ? clientBuildImpactModuleMetricsEvent.hashCode() : 0)) * 37;
        ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent = this.crashlytics_metric;
        int iHashCode23 = (iHashCode22 + (clientCrashlyticsMetricsEvent != null ? clientCrashlyticsMetricsEvent.hashCode() : 0)) * 37;
        ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEvent = this.firebase_screen_metric;
        int iHashCode24 = (iHashCode23 + (clientFirebaseScreenMetricsEvent != null ? clientFirebaseScreenMetricsEvent.hashCode() : 0)) * 37;
        ClientAppPerformanceEvent clientAppPerformanceEvent = this.app_performance;
        int iHashCode25 = (iHashCode24 + (clientAppPerformanceEvent != null ? clientAppPerformanceEvent.hashCode() : 0)) * 37;
        ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEvent = this.aggregated_code_ownership;
        int iHashCode26 = (iHashCode25 + (clientAggregatedCodeOwnershipEvent != null ? clientAggregatedCodeOwnershipEvent.hashCode() : 0)) * 37;
        ClientPartyOwnershipEvent clientPartyOwnershipEvent = this.party_ownership;
        int iHashCode27 = (iHashCode26 + (clientPartyOwnershipEvent != null ? clientPartyOwnershipEvent.hashCode() : 0)) * 37;
        ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEvent = this.code_coverage_by_ownership;
        int iHashCode28 = (iHashCode27 + (clientCodeCoverageByOwnershipEvent != null ? clientCodeCoverageByOwnershipEvent.hashCode() : 0)) * 37;
        ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEvent = this.code_coverage_by_module;
        int iHashCode29 = (iHashCode28 + (clientCodeCoverageByModuleEvent != null ? clientCodeCoverageByModuleEvent.hashCode() : 0)) * 37;
        ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent = this.unused_code_by_module;
        int iHashCode30 = (iHashCode29 + (clientUnusedCodeByModuleEvent != null ? clientUnusedCodeByModuleEvent.hashCode() : 0)) * 37;
        ClientSnapshotTestEvent clientSnapshotTestEvent = this.snapshot_test;
        int iHashCode31 = (iHashCode30 + (clientSnapshotTestEvent != null ? clientSnapshotTestEvent.hashCode() : 0)) * 37;
        ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent = this.securityware_benchmark;
        int iHashCode32 = (iHashCode31 + (clientSecuritywareBenchmarkEvent != null ? clientSecuritywareBenchmarkEvent.hashCode() : 0)) * 37;
        ClientBazelSpawnExecEvent clientBazelSpawnExecEvent = this.bazel_spawn_exec;
        int iHashCode33 = ((iHashCode32 + (clientBazelSpawnExecEvent != null ? clientBazelSpawnExecEvent.hashCode() : 0)) * 37) + this.source.hashCode();
        this.hashCode = iHashCode33;
        return iHashCode33;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ClientBuildTimeEvent clientBuildTimeEvent = this.build_time;
        if (clientBuildTimeEvent != null) {
            arrayList.add("build_time=" + clientBuildTimeEvent);
        }
        ClientCIEvent clientCIEvent = this.ci;
        if (clientCIEvent != null) {
            arrayList.add("ci=" + clientCIEvent);
        }
        ClientCIStepEvent clientCIStepEvent = this.ci_step;
        if (clientCIStepEvent != null) {
            arrayList.add("ci_step=" + clientCIStepEvent);
        }
        ClientCodeOccurenceEvent clientCodeOccurenceEvent = this.code_occurence;
        if (clientCodeOccurenceEvent != null) {
            arrayList.add("code_occurence=" + clientCodeOccurenceEvent);
        }
        ClientDeployEvent clientDeployEvent = this.deploy;
        if (clientDeployEvent != null) {
            arrayList.add("deploy=" + clientDeployEvent);
        }
        ClientBrokenMainBranchEvent clientBrokenMainBranchEvent = this.broken_main_branch;
        if (clientBrokenMainBranchEvent != null) {
            arrayList.add("broken_main_branch=" + clientBrokenMainBranchEvent);
        }
        ClientModuleEvent clientModuleEvent = this.module;
        if (clientModuleEvent != null) {
            arrayList.add("module=" + clientModuleEvent);
        }
        ClientTestSuiteEvent clientTestSuiteEvent = this.test_suite;
        if (clientTestSuiteEvent != null) {
            arrayList.add("test_suite=" + clientTestSuiteEvent);
        }
        ClientBuildStepEvent clientBuildStepEvent = this.build_step;
        if (clientBuildStepEvent != null) {
            arrayList.add("build_step=" + clientBuildStepEvent);
        }
        ClientTestEvent clientTestEvent = this.test;
        if (clientTestEvent != null) {
            arrayList.add("test=" + clientTestEvent);
        }
        ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent = this.test_alert;
        if (clientIntegrationTestAlertEvent != null) {
            arrayList.add("test_alert=" + clientIntegrationTestAlertEvent);
        }
        ClientToolchainEvent clientToolchainEvent = this.toolchain_event;
        if (clientToolchainEvent != null) {
            arrayList.add("toolchain_event=" + clientToolchainEvent);
        }
        ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent = this.overall_profile_modules_result;
        if (clientOverallProfileModulesResultEvent != null) {
            arrayList.add("overall_profile_modules_result=" + clientOverallProfileModulesResultEvent);
        }
        ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent = this.individual_profile_module_result;
        if (clientIndividualProfileModuleResultEvent != null) {
            arrayList.add("individual_profile_module_result=" + clientIndividualProfileModuleResultEvent);
        }
        ClientBenchmarkResultEvent clientBenchmarkResultEvent = this.benchmark_result;
        if (clientBenchmarkResultEvent != null) {
            arrayList.add("benchmark_result=" + clientBenchmarkResultEvent);
        }
        ClientApolloErrorEvent clientApolloErrorEvent = this.apollo_error;
        if (clientApolloErrorEvent != null) {
            arrayList.add("apollo_error=" + clientApolloErrorEvent);
        }
        ClientBinaryEvent clientBinaryEvent = this.binary;
        if (clientBinaryEvent != null) {
            arrayList.add("binary=" + clientBinaryEvent);
        }
        ClientCacheMissEvent clientCacheMissEvent = this.cache_miss;
        if (clientCacheMissEvent != null) {
            arrayList.add("cache_miss=" + clientCacheMissEvent);
        }
        ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEvent = this.dependency_graph;
        if (clientDependencyGraphMetricsEvent != null) {
            arrayList.add("dependency_graph=" + clientDependencyGraphMetricsEvent);
        }
        ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent = this.build_impact;
        if (clientBuildImpactMetricsEvent != null) {
            arrayList.add("build_impact=" + clientBuildImpactMetricsEvent);
        }
        ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent = this.build_impact_module;
        if (clientBuildImpactModuleMetricsEvent != null) {
            arrayList.add("build_impact_module=" + clientBuildImpactModuleMetricsEvent);
        }
        ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent = this.crashlytics_metric;
        if (clientCrashlyticsMetricsEvent != null) {
            arrayList.add("crashlytics_metric=" + clientCrashlyticsMetricsEvent);
        }
        ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEvent = this.firebase_screen_metric;
        if (clientFirebaseScreenMetricsEvent != null) {
            arrayList.add("firebase_screen_metric=" + clientFirebaseScreenMetricsEvent);
        }
        ClientAppPerformanceEvent clientAppPerformanceEvent = this.app_performance;
        if (clientAppPerformanceEvent != null) {
            arrayList.add("app_performance=" + clientAppPerformanceEvent);
        }
        ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEvent = this.aggregated_code_ownership;
        if (clientAggregatedCodeOwnershipEvent != null) {
            arrayList.add("aggregated_code_ownership=" + clientAggregatedCodeOwnershipEvent);
        }
        ClientPartyOwnershipEvent clientPartyOwnershipEvent = this.party_ownership;
        if (clientPartyOwnershipEvent != null) {
            arrayList.add("party_ownership=" + clientPartyOwnershipEvent);
        }
        ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEvent = this.code_coverage_by_ownership;
        if (clientCodeCoverageByOwnershipEvent != null) {
            arrayList.add("code_coverage_by_ownership=" + clientCodeCoverageByOwnershipEvent);
        }
        ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEvent = this.code_coverage_by_module;
        if (clientCodeCoverageByModuleEvent != null) {
            arrayList.add("code_coverage_by_module=" + clientCodeCoverageByModuleEvent);
        }
        ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent = this.unused_code_by_module;
        if (clientUnusedCodeByModuleEvent != null) {
            arrayList.add("unused_code_by_module=" + clientUnusedCodeByModuleEvent);
        }
        ClientSnapshotTestEvent clientSnapshotTestEvent = this.snapshot_test;
        if (clientSnapshotTestEvent != null) {
            arrayList.add("snapshot_test=" + clientSnapshotTestEvent);
        }
        ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent = this.securityware_benchmark;
        if (clientSecuritywareBenchmarkEvent != null) {
            arrayList.add("securityware_benchmark=" + clientSecuritywareBenchmarkEvent);
        }
        ClientBazelSpawnExecEvent clientBazelSpawnExecEvent = this.bazel_spawn_exec;
        if (clientBazelSpawnExecEvent != null) {
            arrayList.add("bazel_spawn_exec=" + clientBazelSpawnExecEvent);
        }
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientMetricEvent{", "}", 0, null, null, 56, null);
    }

    public final ClientMetricEvent copy(ClientBuildTimeEvent build_time, ClientCIEvent ci, ClientCIStepEvent ci_step, ClientCodeOccurenceEvent code_occurence, ClientDeployEvent deploy, ClientBrokenMainBranchEvent broken_main_branch, ClientModuleEvent module, ClientTestSuiteEvent test_suite, ClientBuildStepEvent build_step, ClientTestEvent test, ClientIntegrationTestAlertEvent test_alert, ClientToolchainEvent toolchain_event, ClientOverallProfileModulesResultEvent overall_profile_modules_result, ClientIndividualProfileModuleResultEvent individual_profile_module_result, ClientBenchmarkResultEvent benchmark_result, ClientApolloErrorEvent apollo_error, ClientBinaryEvent binary, ClientCacheMissEvent cache_miss, ClientDependencyGraphMetricsEvent dependency_graph, ClientBuildImpactMetricsEvent build_impact, ClientBuildImpactModuleMetricsEvent build_impact_module, ClientCrashlyticsMetricsEvent crashlytics_metric, ClientFirebaseScreenMetricsEvent firebase_screen_metric, ClientAppPerformanceEvent app_performance, ClientAggregatedCodeOwnershipEvent aggregated_code_ownership, ClientPartyOwnershipEvent party_ownership, ClientCodeCoverageByOwnershipEvent code_coverage_by_ownership, ClientCodeCoverageByModuleEvent code_coverage_by_module, ClientUnusedCodeByModuleEvent unused_code_by_module, ClientSnapshotTestEvent snapshot_test, ClientSecuritywareBenchmarkEvent securityware_benchmark, ClientBazelSpawnExecEvent bazel_spawn_exec, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientMetricEvent(build_time, ci, ci_step, code_occurence, deploy, broken_main_branch, module, test_suite, build_step, test, test_alert, toolchain_event, overall_profile_modules_result, individual_profile_module_result, benchmark_result, apollo_error, binary, cache_miss, dependency_graph, build_impact, build_impact_module, crashlytics_metric, firebase_screen_metric, app_performance, aggregated_code_ownership, party_ownership, code_coverage_by_ownership, code_coverage_by_module, unused_code_by_module, snapshot_test, securityware_benchmark, bazel_spawn_exec, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientMetricEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientMetricEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientMetricEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientMetricEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBuild_time() != null) {
                    size += ClientBuildTimeEvent.ADAPTER.encodedSizeWithTag(1, value.getBuild_time());
                }
                if (value.getCi() != null) {
                    size += ClientCIEvent.ADAPTER.encodedSizeWithTag(2, value.getCi());
                }
                if (value.getCi_step() != null) {
                    size += ClientCIStepEvent.ADAPTER.encodedSizeWithTag(16, value.getCi_step());
                }
                if (value.getCode_occurence() != null) {
                    size += ClientCodeOccurenceEvent.ADAPTER.encodedSizeWithTag(3, value.getCode_occurence());
                }
                if (value.getDeploy() != null) {
                    size += ClientDeployEvent.ADAPTER.encodedSizeWithTag(4, value.getDeploy());
                }
                if (value.getBroken_main_branch() != null) {
                    size += ClientBrokenMainBranchEvent.ADAPTER.encodedSizeWithTag(5, value.getBroken_main_branch());
                }
                if (value.getModule() != null) {
                    size += ClientModuleEvent.ADAPTER.encodedSizeWithTag(6, value.getModule());
                }
                if (value.getTest_suite() != null) {
                    size += ClientTestSuiteEvent.ADAPTER.encodedSizeWithTag(7, value.getTest_suite());
                }
                if (value.getBuild_step() != null) {
                    size += ClientBuildStepEvent.ADAPTER.encodedSizeWithTag(9, value.getBuild_step());
                }
                if (value.getTest() != null) {
                    size += ClientTestEvent.ADAPTER.encodedSizeWithTag(10, value.getTest());
                }
                if (value.getTest_alert() != null) {
                    size += ClientIntegrationTestAlertEvent.ADAPTER.encodedSizeWithTag(11, value.getTest_alert());
                }
                if (value.getToolchain_event() != null) {
                    size += ClientToolchainEvent.ADAPTER.encodedSizeWithTag(12, value.getToolchain_event());
                }
                if (value.getOverall_profile_modules_result() != null) {
                    size += ClientOverallProfileModulesResultEvent.ADAPTER.encodedSizeWithTag(13, value.getOverall_profile_modules_result());
                }
                if (value.getIndividual_profile_module_result() != null) {
                    size += ClientIndividualProfileModuleResultEvent.ADAPTER.encodedSizeWithTag(14, value.getIndividual_profile_module_result());
                }
                if (value.getBenchmark_result() != null) {
                    size += ClientBenchmarkResultEvent.ADAPTER.encodedSizeWithTag(15, value.getBenchmark_result());
                }
                if (value.getApollo_error() != null) {
                    size += ClientApolloErrorEvent.ADAPTER.encodedSizeWithTag(17, value.getApollo_error());
                }
                if (value.getBinary() != null) {
                    size += ClientBinaryEvent.ADAPTER.encodedSizeWithTag(18, value.getBinary());
                }
                if (value.getCache_miss() != null) {
                    size += ClientCacheMissEvent.ADAPTER.encodedSizeWithTag(19, value.getCache_miss());
                }
                if (value.getDependency_graph() != null) {
                    size += ClientDependencyGraphMetricsEvent.ADAPTER.encodedSizeWithTag(20, value.getDependency_graph());
                }
                if (value.getBuild_impact() != null) {
                    size += ClientBuildImpactMetricsEvent.ADAPTER.encodedSizeWithTag(21, value.getBuild_impact());
                }
                if (value.getBuild_impact_module() != null) {
                    size += ClientBuildImpactModuleMetricsEvent.ADAPTER.encodedSizeWithTag(22, value.getBuild_impact_module());
                }
                if (value.getCrashlytics_metric() != null) {
                    size += ClientCrashlyticsMetricsEvent.ADAPTER.encodedSizeWithTag(23, value.getCrashlytics_metric());
                }
                if (value.getFirebase_screen_metric() != null) {
                    size += ClientFirebaseScreenMetricsEvent.ADAPTER.encodedSizeWithTag(24, value.getFirebase_screen_metric());
                }
                if (value.getApp_performance() != null) {
                    size += ClientAppPerformanceEvent.ADAPTER.encodedSizeWithTag(25, value.getApp_performance());
                }
                if (value.getAggregated_code_ownership() != null) {
                    size += ClientAggregatedCodeOwnershipEvent.ADAPTER.encodedSizeWithTag(26, value.getAggregated_code_ownership());
                }
                if (value.getParty_ownership() != null) {
                    size += ClientPartyOwnershipEvent.ADAPTER.encodedSizeWithTag(27, value.getParty_ownership());
                }
                if (value.getCode_coverage_by_ownership() != null) {
                    size += ClientCodeCoverageByOwnershipEvent.ADAPTER.encodedSizeWithTag(28, value.getCode_coverage_by_ownership());
                }
                if (value.getCode_coverage_by_module() != null) {
                    size += ClientCodeCoverageByModuleEvent.ADAPTER.encodedSizeWithTag(29, value.getCode_coverage_by_module());
                }
                if (value.getUnused_code_by_module() != null) {
                    size += ClientUnusedCodeByModuleEvent.ADAPTER.encodedSizeWithTag(30, value.getUnused_code_by_module());
                }
                if (value.getSnapshot_test() != null) {
                    size += ClientSnapshotTestEvent.ADAPTER.encodedSizeWithTag(31, value.getSnapshot_test());
                }
                if (value.getSecurityware_benchmark() != null) {
                    size += ClientSecuritywareBenchmarkEvent.ADAPTER.encodedSizeWithTag(32, value.getSecurityware_benchmark());
                }
                if (value.getBazel_spawn_exec() != null) {
                    size += ClientBazelSpawnExecEvent.ADAPTER.encodedSizeWithTag(33, value.getBazel_spawn_exec());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSource()) : size;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientMetricEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ClientCIStepEvent clientCIStepEventDecode = null;
                ClientCodeOccurenceEvent clientCodeOccurenceEventDecode = null;
                ClientDeployEvent clientDeployEventDecode = null;
                ClientBrokenMainBranchEvent clientBrokenMainBranchEventDecode = null;
                ClientModuleEvent clientModuleEventDecode = null;
                ClientTestSuiteEvent clientTestSuiteEventDecode = null;
                ClientBuildStepEvent clientBuildStepEventDecode = null;
                ClientTestEvent clientTestEventDecode = null;
                ClientIntegrationTestAlertEvent clientIntegrationTestAlertEventDecode = null;
                ClientToolchainEvent clientToolchainEventDecode = null;
                ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEventDecode = null;
                ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEventDecode = null;
                ClientBenchmarkResultEvent clientBenchmarkResultEventDecode = null;
                ClientApolloErrorEvent clientApolloErrorEventDecode = null;
                ClientBinaryEvent clientBinaryEventDecode = null;
                ClientCacheMissEvent clientCacheMissEventDecode = null;
                ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEventDecode = null;
                ClientBuildImpactMetricsEvent clientBuildImpactMetricsEventDecode = null;
                ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEventDecode = null;
                ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEventDecode = null;
                ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEventDecode = null;
                ClientAppPerformanceEvent clientAppPerformanceEventDecode = null;
                ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEventDecode = null;
                ClientPartyOwnershipEvent clientPartyOwnershipEventDecode = null;
                ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEventDecode = null;
                ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEventDecode = null;
                ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEventDecode = null;
                ClientSnapshotTestEvent clientSnapshotTestEventDecode = null;
                ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEventDecode = null;
                ClientBazelSpawnExecEvent clientBazelSpawnExecEventDecode = null;
                ClientBuildTimeEvent clientBuildTimeEventDecode = null;
                String strDecode = "";
                ClientCIEvent clientCIEventDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    ClientCIEvent clientCIEvent = clientCIEventDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                clientBuildTimeEventDecode = ClientBuildTimeEvent.ADAPTER.decode(reader);
                                break;
                            case 2:
                                clientCIEventDecode = ClientCIEvent.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                clientCodeOccurenceEventDecode = ClientCodeOccurenceEvent.ADAPTER.decode(reader);
                                break;
                            case 4:
                                clientDeployEventDecode = ClientDeployEvent.ADAPTER.decode(reader);
                                break;
                            case 5:
                                clientBrokenMainBranchEventDecode = ClientBrokenMainBranchEvent.ADAPTER.decode(reader);
                                break;
                            case 6:
                                clientModuleEventDecode = ClientModuleEvent.ADAPTER.decode(reader);
                                break;
                            case 7:
                                clientTestSuiteEventDecode = ClientTestSuiteEvent.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                clientBuildStepEventDecode = ClientBuildStepEvent.ADAPTER.decode(reader);
                                break;
                            case 10:
                                clientTestEventDecode = ClientTestEvent.ADAPTER.decode(reader);
                                break;
                            case 11:
                                clientIntegrationTestAlertEventDecode = ClientIntegrationTestAlertEvent.ADAPTER.decode(reader);
                                break;
                            case 12:
                                clientToolchainEventDecode = ClientToolchainEvent.ADAPTER.decode(reader);
                                break;
                            case 13:
                                clientOverallProfileModulesResultEventDecode = ClientOverallProfileModulesResultEvent.ADAPTER.decode(reader);
                                break;
                            case 14:
                                clientIndividualProfileModuleResultEventDecode = ClientIndividualProfileModuleResultEvent.ADAPTER.decode(reader);
                                break;
                            case 15:
                                clientBenchmarkResultEventDecode = ClientBenchmarkResultEvent.ADAPTER.decode(reader);
                                break;
                            case 16:
                                clientCIStepEventDecode = ClientCIStepEvent.ADAPTER.decode(reader);
                                break;
                            case 17:
                                clientApolloErrorEventDecode = ClientApolloErrorEvent.ADAPTER.decode(reader);
                                break;
                            case 18:
                                clientBinaryEventDecode = ClientBinaryEvent.ADAPTER.decode(reader);
                                break;
                            case 19:
                                clientCacheMissEventDecode = ClientCacheMissEvent.ADAPTER.decode(reader);
                                break;
                            case 20:
                                clientDependencyGraphMetricsEventDecode = ClientDependencyGraphMetricsEvent.ADAPTER.decode(reader);
                                break;
                            case 21:
                                clientBuildImpactMetricsEventDecode = ClientBuildImpactMetricsEvent.ADAPTER.decode(reader);
                                break;
                            case 22:
                                clientBuildImpactModuleMetricsEventDecode = ClientBuildImpactModuleMetricsEvent.ADAPTER.decode(reader);
                                break;
                            case 23:
                                clientCrashlyticsMetricsEventDecode = ClientCrashlyticsMetricsEvent.ADAPTER.decode(reader);
                                break;
                            case 24:
                                clientFirebaseScreenMetricsEventDecode = ClientFirebaseScreenMetricsEvent.ADAPTER.decode(reader);
                                break;
                            case 25:
                                clientAppPerformanceEventDecode = ClientAppPerformanceEvent.ADAPTER.decode(reader);
                                break;
                            case 26:
                                clientAggregatedCodeOwnershipEventDecode = ClientAggregatedCodeOwnershipEvent.ADAPTER.decode(reader);
                                break;
                            case 27:
                                clientPartyOwnershipEventDecode = ClientPartyOwnershipEvent.ADAPTER.decode(reader);
                                break;
                            case 28:
                                clientCodeCoverageByOwnershipEventDecode = ClientCodeCoverageByOwnershipEvent.ADAPTER.decode(reader);
                                break;
                            case 29:
                                clientCodeCoverageByModuleEventDecode = ClientCodeCoverageByModuleEvent.ADAPTER.decode(reader);
                                break;
                            case 30:
                                clientUnusedCodeByModuleEventDecode = ClientUnusedCodeByModuleEvent.ADAPTER.decode(reader);
                                break;
                            case 31:
                                clientSnapshotTestEventDecode = ClientSnapshotTestEvent.ADAPTER.decode(reader);
                                break;
                            case 32:
                                clientSecuritywareBenchmarkEventDecode = ClientSecuritywareBenchmarkEvent.ADAPTER.decode(reader);
                                break;
                            case 33:
                                clientBazelSpawnExecEventDecode = ClientBazelSpawnExecEvent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        clientCIEventDecode = clientCIEvent;
                    } else {
                        return new ClientMetricEvent(clientBuildTimeEventDecode, clientCIEvent, clientCIStepEventDecode, clientCodeOccurenceEventDecode, clientDeployEventDecode, clientBrokenMainBranchEventDecode, clientModuleEventDecode, clientTestSuiteEventDecode, clientBuildStepEventDecode, clientTestEventDecode, clientIntegrationTestAlertEventDecode, clientToolchainEventDecode, clientOverallProfileModulesResultEventDecode, clientIndividualProfileModuleResultEventDecode, clientBenchmarkResultEventDecode, clientApolloErrorEventDecode, clientBinaryEventDecode, clientCacheMissEventDecode, clientDependencyGraphMetricsEventDecode, clientBuildImpactMetricsEventDecode, clientBuildImpactModuleMetricsEventDecode, clientCrashlyticsMetricsEventDecode, clientFirebaseScreenMetricsEventDecode, clientAppPerformanceEventDecode, clientAggregatedCodeOwnershipEventDecode, clientPartyOwnershipEventDecode, clientCodeCoverageByOwnershipEventDecode, clientCodeCoverageByModuleEventDecode, clientUnusedCodeByModuleEventDecode, clientSnapshotTestEventDecode, clientSecuritywareBenchmarkEventDecode, clientBazelSpawnExecEventDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientMetricEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBuild_time() != null) {
                    ClientBuildTimeEvent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuild_time());
                }
                if (value.getCi() != null) {
                    ClientCIEvent.ADAPTER.encodeWithTag(writer, 2, (int) value.getCi());
                }
                if (value.getCi_step() != null) {
                    ClientCIStepEvent.ADAPTER.encodeWithTag(writer, 16, (int) value.getCi_step());
                }
                if (value.getCode_occurence() != null) {
                    ClientCodeOccurenceEvent.ADAPTER.encodeWithTag(writer, 3, (int) value.getCode_occurence());
                }
                if (value.getDeploy() != null) {
                    ClientDeployEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeploy());
                }
                if (value.getBroken_main_branch() != null) {
                    ClientBrokenMainBranchEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getBroken_main_branch());
                }
                if (value.getModule() != null) {
                    ClientModuleEvent.ADAPTER.encodeWithTag(writer, 6, (int) value.getModule());
                }
                if (value.getTest_suite() != null) {
                    ClientTestSuiteEvent.ADAPTER.encodeWithTag(writer, 7, (int) value.getTest_suite());
                }
                if (value.getBuild_step() != null) {
                    ClientBuildStepEvent.ADAPTER.encodeWithTag(writer, 9, (int) value.getBuild_step());
                }
                if (value.getTest() != null) {
                    ClientTestEvent.ADAPTER.encodeWithTag(writer, 10, (int) value.getTest());
                }
                if (value.getTest_alert() != null) {
                    ClientIntegrationTestAlertEvent.ADAPTER.encodeWithTag(writer, 11, (int) value.getTest_alert());
                }
                if (value.getToolchain_event() != null) {
                    ClientToolchainEvent.ADAPTER.encodeWithTag(writer, 12, (int) value.getToolchain_event());
                }
                if (value.getOverall_profile_modules_result() != null) {
                    ClientOverallProfileModulesResultEvent.ADAPTER.encodeWithTag(writer, 13, (int) value.getOverall_profile_modules_result());
                }
                if (value.getIndividual_profile_module_result() != null) {
                    ClientIndividualProfileModuleResultEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getIndividual_profile_module_result());
                }
                if (value.getBenchmark_result() != null) {
                    ClientBenchmarkResultEvent.ADAPTER.encodeWithTag(writer, 15, (int) value.getBenchmark_result());
                }
                if (value.getApollo_error() != null) {
                    ClientApolloErrorEvent.ADAPTER.encodeWithTag(writer, 17, (int) value.getApollo_error());
                }
                if (value.getBinary() != null) {
                    ClientBinaryEvent.ADAPTER.encodeWithTag(writer, 18, (int) value.getBinary());
                }
                if (value.getCache_miss() != null) {
                    ClientCacheMissEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getCache_miss());
                }
                if (value.getDependency_graph() != null) {
                    ClientDependencyGraphMetricsEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getDependency_graph());
                }
                if (value.getBuild_impact() != null) {
                    ClientBuildImpactMetricsEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getBuild_impact());
                }
                if (value.getBuild_impact_module() != null) {
                    ClientBuildImpactModuleMetricsEvent.ADAPTER.encodeWithTag(writer, 22, (int) value.getBuild_impact_module());
                }
                if (value.getCrashlytics_metric() != null) {
                    ClientCrashlyticsMetricsEvent.ADAPTER.encodeWithTag(writer, 23, (int) value.getCrashlytics_metric());
                }
                if (value.getFirebase_screen_metric() != null) {
                    ClientFirebaseScreenMetricsEvent.ADAPTER.encodeWithTag(writer, 24, (int) value.getFirebase_screen_metric());
                }
                if (value.getApp_performance() != null) {
                    ClientAppPerformanceEvent.ADAPTER.encodeWithTag(writer, 25, (int) value.getApp_performance());
                }
                if (value.getAggregated_code_ownership() != null) {
                    ClientAggregatedCodeOwnershipEvent.ADAPTER.encodeWithTag(writer, 26, (int) value.getAggregated_code_ownership());
                }
                if (value.getParty_ownership() != null) {
                    ClientPartyOwnershipEvent.ADAPTER.encodeWithTag(writer, 27, (int) value.getParty_ownership());
                }
                if (value.getCode_coverage_by_ownership() != null) {
                    ClientCodeCoverageByOwnershipEvent.ADAPTER.encodeWithTag(writer, 28, (int) value.getCode_coverage_by_ownership());
                }
                if (value.getCode_coverage_by_module() != null) {
                    ClientCodeCoverageByModuleEvent.ADAPTER.encodeWithTag(writer, 29, (int) value.getCode_coverage_by_module());
                }
                if (value.getUnused_code_by_module() != null) {
                    ClientUnusedCodeByModuleEvent.ADAPTER.encodeWithTag(writer, 30, (int) value.getUnused_code_by_module());
                }
                if (value.getSnapshot_test() != null) {
                    ClientSnapshotTestEvent.ADAPTER.encodeWithTag(writer, 31, (int) value.getSnapshot_test());
                }
                if (value.getSecurityware_benchmark() != null) {
                    ClientSecuritywareBenchmarkEvent.ADAPTER.encodeWithTag(writer, 32, (int) value.getSecurityware_benchmark());
                }
                if (value.getBazel_spawn_exec() != null) {
                    ClientBazelSpawnExecEvent.ADAPTER.encodeWithTag(writer, 33, (int) value.getBazel_spawn_exec());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientMetricEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSource());
                }
                if (value.getBazel_spawn_exec() != null) {
                    ClientBazelSpawnExecEvent.ADAPTER.encodeWithTag(writer, 33, (int) value.getBazel_spawn_exec());
                }
                if (value.getSecurityware_benchmark() != null) {
                    ClientSecuritywareBenchmarkEvent.ADAPTER.encodeWithTag(writer, 32, (int) value.getSecurityware_benchmark());
                }
                if (value.getSnapshot_test() != null) {
                    ClientSnapshotTestEvent.ADAPTER.encodeWithTag(writer, 31, (int) value.getSnapshot_test());
                }
                if (value.getUnused_code_by_module() != null) {
                    ClientUnusedCodeByModuleEvent.ADAPTER.encodeWithTag(writer, 30, (int) value.getUnused_code_by_module());
                }
                if (value.getCode_coverage_by_module() != null) {
                    ClientCodeCoverageByModuleEvent.ADAPTER.encodeWithTag(writer, 29, (int) value.getCode_coverage_by_module());
                }
                if (value.getCode_coverage_by_ownership() != null) {
                    ClientCodeCoverageByOwnershipEvent.ADAPTER.encodeWithTag(writer, 28, (int) value.getCode_coverage_by_ownership());
                }
                if (value.getParty_ownership() != null) {
                    ClientPartyOwnershipEvent.ADAPTER.encodeWithTag(writer, 27, (int) value.getParty_ownership());
                }
                if (value.getAggregated_code_ownership() != null) {
                    ClientAggregatedCodeOwnershipEvent.ADAPTER.encodeWithTag(writer, 26, (int) value.getAggregated_code_ownership());
                }
                if (value.getApp_performance() != null) {
                    ClientAppPerformanceEvent.ADAPTER.encodeWithTag(writer, 25, (int) value.getApp_performance());
                }
                if (value.getFirebase_screen_metric() != null) {
                    ClientFirebaseScreenMetricsEvent.ADAPTER.encodeWithTag(writer, 24, (int) value.getFirebase_screen_metric());
                }
                if (value.getCrashlytics_metric() != null) {
                    ClientCrashlyticsMetricsEvent.ADAPTER.encodeWithTag(writer, 23, (int) value.getCrashlytics_metric());
                }
                if (value.getBuild_impact_module() != null) {
                    ClientBuildImpactModuleMetricsEvent.ADAPTER.encodeWithTag(writer, 22, (int) value.getBuild_impact_module());
                }
                if (value.getBuild_impact() != null) {
                    ClientBuildImpactMetricsEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getBuild_impact());
                }
                if (value.getDependency_graph() != null) {
                    ClientDependencyGraphMetricsEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getDependency_graph());
                }
                if (value.getCache_miss() != null) {
                    ClientCacheMissEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getCache_miss());
                }
                if (value.getBinary() != null) {
                    ClientBinaryEvent.ADAPTER.encodeWithTag(writer, 18, (int) value.getBinary());
                }
                if (value.getApollo_error() != null) {
                    ClientApolloErrorEvent.ADAPTER.encodeWithTag(writer, 17, (int) value.getApollo_error());
                }
                if (value.getBenchmark_result() != null) {
                    ClientBenchmarkResultEvent.ADAPTER.encodeWithTag(writer, 15, (int) value.getBenchmark_result());
                }
                if (value.getIndividual_profile_module_result() != null) {
                    ClientIndividualProfileModuleResultEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getIndividual_profile_module_result());
                }
                if (value.getOverall_profile_modules_result() != null) {
                    ClientOverallProfileModulesResultEvent.ADAPTER.encodeWithTag(writer, 13, (int) value.getOverall_profile_modules_result());
                }
                if (value.getToolchain_event() != null) {
                    ClientToolchainEvent.ADAPTER.encodeWithTag(writer, 12, (int) value.getToolchain_event());
                }
                if (value.getTest_alert() != null) {
                    ClientIntegrationTestAlertEvent.ADAPTER.encodeWithTag(writer, 11, (int) value.getTest_alert());
                }
                if (value.getTest() != null) {
                    ClientTestEvent.ADAPTER.encodeWithTag(writer, 10, (int) value.getTest());
                }
                if (value.getBuild_step() != null) {
                    ClientBuildStepEvent.ADAPTER.encodeWithTag(writer, 9, (int) value.getBuild_step());
                }
                if (value.getTest_suite() != null) {
                    ClientTestSuiteEvent.ADAPTER.encodeWithTag(writer, 7, (int) value.getTest_suite());
                }
                if (value.getModule() != null) {
                    ClientModuleEvent.ADAPTER.encodeWithTag(writer, 6, (int) value.getModule());
                }
                if (value.getBroken_main_branch() != null) {
                    ClientBrokenMainBranchEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getBroken_main_branch());
                }
                if (value.getDeploy() != null) {
                    ClientDeployEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeploy());
                }
                if (value.getCode_occurence() != null) {
                    ClientCodeOccurenceEvent.ADAPTER.encodeWithTag(writer, 3, (int) value.getCode_occurence());
                }
                if (value.getCi_step() != null) {
                    ClientCIStepEvent.ADAPTER.encodeWithTag(writer, 16, (int) value.getCi_step());
                }
                if (value.getCi() != null) {
                    ClientCIEvent.ADAPTER.encodeWithTag(writer, 2, (int) value.getCi());
                }
                if (value.getBuild_time() != null) {
                    ClientBuildTimeEvent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuild_time());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientMetricEvent redact(ClientMetricEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ClientBuildTimeEvent build_time = value.getBuild_time();
                ClientBuildTimeEvent clientBuildTimeEventRedact = build_time != null ? ClientBuildTimeEvent.ADAPTER.redact(build_time) : null;
                ClientCIEvent ci = value.getCi();
                ClientCIEvent clientCIEventRedact = ci != null ? ClientCIEvent.ADAPTER.redact(ci) : null;
                ClientCIStepEvent ci_step = value.getCi_step();
                ClientCIStepEvent clientCIStepEventRedact = ci_step != null ? ClientCIStepEvent.ADAPTER.redact(ci_step) : null;
                ClientCodeOccurenceEvent code_occurence = value.getCode_occurence();
                ClientCodeOccurenceEvent clientCodeOccurenceEventRedact = code_occurence != null ? ClientCodeOccurenceEvent.ADAPTER.redact(code_occurence) : null;
                ClientDeployEvent deploy = value.getDeploy();
                ClientDeployEvent clientDeployEventRedact = deploy != null ? ClientDeployEvent.ADAPTER.redact(deploy) : null;
                ClientBrokenMainBranchEvent broken_main_branch = value.getBroken_main_branch();
                ClientBrokenMainBranchEvent clientBrokenMainBranchEventRedact = broken_main_branch != null ? ClientBrokenMainBranchEvent.ADAPTER.redact(broken_main_branch) : null;
                ClientModuleEvent module = value.getModule();
                ClientModuleEvent clientModuleEventRedact = module != null ? ClientModuleEvent.ADAPTER.redact(module) : null;
                ClientTestSuiteEvent test_suite = value.getTest_suite();
                ClientTestSuiteEvent clientTestSuiteEventRedact = test_suite != null ? ClientTestSuiteEvent.ADAPTER.redact(test_suite) : null;
                ClientBuildStepEvent build_step = value.getBuild_step();
                ClientBuildStepEvent clientBuildStepEventRedact = build_step != null ? ClientBuildStepEvent.ADAPTER.redact(build_step) : null;
                ClientTestEvent test = value.getTest();
                ClientTestEvent clientTestEventRedact = test != null ? ClientTestEvent.ADAPTER.redact(test) : null;
                ClientIntegrationTestAlertEvent test_alert = value.getTest_alert();
                ClientIntegrationTestAlertEvent clientIntegrationTestAlertEventRedact = test_alert != null ? ClientIntegrationTestAlertEvent.ADAPTER.redact(test_alert) : null;
                ClientToolchainEvent toolchain_event = value.getToolchain_event();
                ClientToolchainEvent clientToolchainEventRedact = toolchain_event != null ? ClientToolchainEvent.ADAPTER.redact(toolchain_event) : null;
                ClientOverallProfileModulesResultEvent overall_profile_modules_result = value.getOverall_profile_modules_result();
                ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEventRedact = overall_profile_modules_result != null ? ClientOverallProfileModulesResultEvent.ADAPTER.redact(overall_profile_modules_result) : null;
                ClientIndividualProfileModuleResultEvent individual_profile_module_result = value.getIndividual_profile_module_result();
                ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEventRedact = individual_profile_module_result != null ? ClientIndividualProfileModuleResultEvent.ADAPTER.redact(individual_profile_module_result) : null;
                ClientBenchmarkResultEvent benchmark_result = value.getBenchmark_result();
                ClientBuildTimeEvent clientBuildTimeEvent = clientBuildTimeEventRedact;
                ClientBenchmarkResultEvent clientBenchmarkResultEventRedact = benchmark_result != null ? ClientBenchmarkResultEvent.ADAPTER.redact(benchmark_result) : null;
                ClientApolloErrorEvent apollo_error = value.getApollo_error();
                ClientBenchmarkResultEvent clientBenchmarkResultEvent = clientBenchmarkResultEventRedact;
                ClientApolloErrorEvent clientApolloErrorEventRedact = apollo_error != null ? ClientApolloErrorEvent.ADAPTER.redact(apollo_error) : null;
                ClientBinaryEvent binary = value.getBinary();
                ClientApolloErrorEvent clientApolloErrorEvent = clientApolloErrorEventRedact;
                ClientBinaryEvent clientBinaryEventRedact = binary != null ? ClientBinaryEvent.ADAPTER.redact(binary) : null;
                ClientCacheMissEvent cache_miss = value.getCache_miss();
                ClientBinaryEvent clientBinaryEvent = clientBinaryEventRedact;
                ClientCacheMissEvent clientCacheMissEventRedact = cache_miss != null ? ClientCacheMissEvent.ADAPTER.redact(cache_miss) : null;
                ClientDependencyGraphMetricsEvent dependency_graph = value.getDependency_graph();
                ClientCacheMissEvent clientCacheMissEvent = clientCacheMissEventRedact;
                ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEventRedact = dependency_graph != null ? ClientDependencyGraphMetricsEvent.ADAPTER.redact(dependency_graph) : null;
                ClientBuildImpactMetricsEvent build_impact = value.getBuild_impact();
                ClientDependencyGraphMetricsEvent clientDependencyGraphMetricsEvent = clientDependencyGraphMetricsEventRedact;
                ClientBuildImpactMetricsEvent clientBuildImpactMetricsEventRedact = build_impact != null ? ClientBuildImpactMetricsEvent.ADAPTER.redact(build_impact) : null;
                ClientBuildImpactModuleMetricsEvent build_impact_module = value.getBuild_impact_module();
                ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent = clientBuildImpactMetricsEventRedact;
                ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEventRedact = build_impact_module != null ? ClientBuildImpactModuleMetricsEvent.ADAPTER.redact(build_impact_module) : null;
                ClientCrashlyticsMetricsEvent crashlytics_metric = value.getCrashlytics_metric();
                ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent = clientBuildImpactModuleMetricsEventRedact;
                ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEventRedact = crashlytics_metric != null ? ClientCrashlyticsMetricsEvent.ADAPTER.redact(crashlytics_metric) : null;
                ClientFirebaseScreenMetricsEvent firebase_screen_metric = value.getFirebase_screen_metric();
                ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent = clientCrashlyticsMetricsEventRedact;
                ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEventRedact = firebase_screen_metric != null ? ClientFirebaseScreenMetricsEvent.ADAPTER.redact(firebase_screen_metric) : null;
                ClientAppPerformanceEvent app_performance = value.getApp_performance();
                ClientFirebaseScreenMetricsEvent clientFirebaseScreenMetricsEvent = clientFirebaseScreenMetricsEventRedact;
                ClientAppPerformanceEvent clientAppPerformanceEventRedact = app_performance != null ? ClientAppPerformanceEvent.ADAPTER.redact(app_performance) : null;
                ClientAggregatedCodeOwnershipEvent aggregated_code_ownership = value.getAggregated_code_ownership();
                ClientAppPerformanceEvent clientAppPerformanceEvent = clientAppPerformanceEventRedact;
                ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEventRedact = aggregated_code_ownership != null ? ClientAggregatedCodeOwnershipEvent.ADAPTER.redact(aggregated_code_ownership) : null;
                ClientPartyOwnershipEvent party_ownership = value.getParty_ownership();
                ClientAggregatedCodeOwnershipEvent clientAggregatedCodeOwnershipEvent = clientAggregatedCodeOwnershipEventRedact;
                ClientPartyOwnershipEvent clientPartyOwnershipEventRedact = party_ownership != null ? ClientPartyOwnershipEvent.ADAPTER.redact(party_ownership) : null;
                ClientCodeCoverageByOwnershipEvent code_coverage_by_ownership = value.getCode_coverage_by_ownership();
                ClientPartyOwnershipEvent clientPartyOwnershipEvent = clientPartyOwnershipEventRedact;
                ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEventRedact = code_coverage_by_ownership != null ? ClientCodeCoverageByOwnershipEvent.ADAPTER.redact(code_coverage_by_ownership) : null;
                ClientCodeCoverageByModuleEvent code_coverage_by_module = value.getCode_coverage_by_module();
                ClientCodeCoverageByOwnershipEvent clientCodeCoverageByOwnershipEvent = clientCodeCoverageByOwnershipEventRedact;
                ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEventRedact = code_coverage_by_module != null ? ClientCodeCoverageByModuleEvent.ADAPTER.redact(code_coverage_by_module) : null;
                ClientUnusedCodeByModuleEvent unused_code_by_module = value.getUnused_code_by_module();
                ClientCodeCoverageByModuleEvent clientCodeCoverageByModuleEvent = clientCodeCoverageByModuleEventRedact;
                ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEventRedact = unused_code_by_module != null ? ClientUnusedCodeByModuleEvent.ADAPTER.redact(unused_code_by_module) : null;
                ClientSnapshotTestEvent snapshot_test = value.getSnapshot_test();
                ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent = clientUnusedCodeByModuleEventRedact;
                ClientSnapshotTestEvent clientSnapshotTestEventRedact = snapshot_test != null ? ClientSnapshotTestEvent.ADAPTER.redact(snapshot_test) : null;
                ClientSecuritywareBenchmarkEvent securityware_benchmark = value.getSecurityware_benchmark();
                ClientSnapshotTestEvent clientSnapshotTestEvent = clientSnapshotTestEventRedact;
                ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEventRedact = securityware_benchmark != null ? ClientSecuritywareBenchmarkEvent.ADAPTER.redact(securityware_benchmark) : null;
                ClientBazelSpawnExecEvent bazel_spawn_exec = value.getBazel_spawn_exec();
                return value.copy((0 & 1) != 0 ? value.build_time : clientBuildTimeEvent, (0 & 2) != 0 ? value.ci : clientCIEventRedact, (0 & 4) != 0 ? value.ci_step : clientCIStepEventRedact, (0 & 8) != 0 ? value.code_occurence : clientCodeOccurenceEventRedact, (0 & 16) != 0 ? value.deploy : clientDeployEventRedact, (0 & 32) != 0 ? value.broken_main_branch : clientBrokenMainBranchEventRedact, (0 & 64) != 0 ? value.module : clientModuleEventRedact, (0 & 128) != 0 ? value.test_suite : clientTestSuiteEventRedact, (0 & 256) != 0 ? value.build_step : clientBuildStepEventRedact, (0 & 512) != 0 ? value.test : clientTestEventRedact, (0 & 1024) != 0 ? value.test_alert : clientIntegrationTestAlertEventRedact, (0 & 2048) != 0 ? value.toolchain_event : clientToolchainEventRedact, (0 & 4096) != 0 ? value.overall_profile_modules_result : clientOverallProfileModulesResultEventRedact, (0 & 8192) != 0 ? value.individual_profile_module_result : clientIndividualProfileModuleResultEventRedact, (0 & 16384) != 0 ? value.benchmark_result : clientBenchmarkResultEvent, (0 & 32768) != 0 ? value.apollo_error : clientApolloErrorEvent, (0 & 65536) != 0 ? value.binary : clientBinaryEvent, (0 & 131072) != 0 ? value.cache_miss : clientCacheMissEvent, (0 & 262144) != 0 ? value.dependency_graph : clientDependencyGraphMetricsEvent, (0 & 524288) != 0 ? value.build_impact : clientBuildImpactMetricsEvent, (0 & 1048576) != 0 ? value.build_impact_module : clientBuildImpactModuleMetricsEvent, (0 & 2097152) != 0 ? value.crashlytics_metric : clientCrashlyticsMetricsEvent, (0 & 4194304) != 0 ? value.firebase_screen_metric : clientFirebaseScreenMetricsEvent, (0 & 8388608) != 0 ? value.app_performance : clientAppPerformanceEvent, (0 & 16777216) != 0 ? value.aggregated_code_ownership : clientAggregatedCodeOwnershipEvent, (0 & 33554432) != 0 ? value.party_ownership : clientPartyOwnershipEvent, (0 & 67108864) != 0 ? value.code_coverage_by_ownership : clientCodeCoverageByOwnershipEvent, (0 & 134217728) != 0 ? value.code_coverage_by_module : clientCodeCoverageByModuleEvent, (0 & 268435456) != 0 ? value.unused_code_by_module : clientUnusedCodeByModuleEvent, (0 & 536870912) != 0 ? value.snapshot_test : clientSnapshotTestEvent, (0 & 1073741824) != 0 ? value.securityware_benchmark : clientSecuritywareBenchmarkEventRedact, (0 & Integer.MIN_VALUE) != 0 ? value.bazel_spawn_exec : bazel_spawn_exec != null ? ClientBazelSpawnExecEvent.ADAPTER.redact(bazel_spawn_exec) : null, (1 & 1) != 0 ? value.source : null, (1 & 2) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
