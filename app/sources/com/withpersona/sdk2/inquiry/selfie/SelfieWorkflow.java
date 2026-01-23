package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.Camera2Utils;
import com.withpersona.sdk2.camera.camera2.Camera2Utils4;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState2;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage4;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge2;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okio.ByteString;

/* compiled from: SelfieWorkflow.kt */
@Metadata(m3635d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0093\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001Ba\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 JC\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b'\u0010(JC\u0010*\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020)2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b*\u0010+JC\u0010.\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020,2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u0002002\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00104\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u0002032\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105JC\u00107\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u0002062\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JC\u0010:\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u0002092\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;JC\u0010=\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020<2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b=\u0010>JC\u0010@\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020?2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b@\u0010AJC\u0010C\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020B2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020E2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bF\u0010GJC\u0010I\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020H2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bI\u0010JJC\u0010L\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020K2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010OJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\bR\u0010SJ-\u0010X\u001a\u00020W2\u001c\u0010V\u001a\u00180TR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040UH\u0002¢\u0006\u0004\bX\u0010YJC\u0010[\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020Z2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b[\u0010\\JC\u0010^\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020]2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b^\u0010_JE\u0010e\u001a\u00020E\"\f\b\u0000\u0010a*\u00020\u0003*\u00020`*\u00160TR\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030U2\u0006\u0010b\u001a\u00028\u00002\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ3\u0010g\u001a\u00020W2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bg\u0010hJ;\u0010j\u001a\u00020W2\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010i\u001a\u00020\u0004H\u0002¢\u0006\u0004\bj\u0010kJ7\u0010n\u001a\u00020W*\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ%\u0010v\u001a\u0004\u0018\u00010u*\u00020p2\u0006\u0010r\u001a\u00020q2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bv\u0010wJ\u0013\u0010y\u001a\u00020x*\u00020\u0003H\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00032\"\u0010%\u001a\u001e0$R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0085\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0086\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0087\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0088\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0089\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008a\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008b\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u008c\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008d\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u008e\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u008f\u0001R\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0097\u0001"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Factory;", "submitVerificationWorker", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Factory;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/LocalVideoCaptureRenderer;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "cameraStatsManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Factory;Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Factory;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/LocalVideoCaptureRenderer;Lcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;)V", "", "useCamera", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "renderState", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "renderShowInstructions", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "renderWaitForCameraFeed", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "renderRestartCamera", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "renderWaitForWebRtcSetup", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "renderShowPoseHint", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "renderStartCapture", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "renderStartCaptureFaceDetected", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "renderCountdownToCapture", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "renderCountdownToManualCapture", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "renderCapture", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "renderCaptureTransition", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "renderFinalizeWebRtc", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "renderWebRtcFinished", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "webRtcConfigIsValid", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "isVideoCapture", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "videoCaptureMethod", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "updater", "", "setWebRtcErrorOutput", "(Lcom/squareup/workflow1/WorkflowAction$Updater;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "renderReviewCaptures", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "renderSubmit", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "T", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "nextState", "(Lcom/squareup/workflow1/WorkflowAction$Updater;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "runManualCaptureEnabledChecker", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)V", "output", "setOutputForWorkflow", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;)V", "", "error", "setErrorOutput", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Ljava/lang/Throwable;)V", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "pose", "", "toHintMessage", "(Lcom/withpersona/sdk2/camera/selfie/SelfieError;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "toSelfiePage", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/SelfiePage;", "props", "Lcom/squareup/workflow1/Snapshot;", "snapshot", "initialState", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/squareup/workflow1/Snapshot;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "render", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "state", "snapshotState", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/squareup/workflow1/Snapshot;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SubmitVerificationWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/LocalVideoCaptureRenderer;", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "Companion", "Input", "Output", "Screen", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SelfieWorkflow extends StatefulWorkflow<Input, SelfieState, Output, Object> {
    private final Context applicationContext;
    private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
    private final CameraStatsManager cameraStatsManager;
    private final CameraXController.Factory cameraXControllerFactory;
    private final ExternalEventLogger externalEventLogger;
    private final LocalVideoCaptureRenderer localVideoCaptureRenderer;
    private final NavigationStateManager navigationStateManager;
    private final PermissionRequestWorkflow permissionRequestWorkflow;
    private final SelfieAnalyzeWorker.Factory selfieAnalyzeWorker;
    private final SubmitVerificationWorker.Factory submitVerificationWorker;
    private final WebRtcManagerBridge webRtcManager;
    private final WebRtcWorker.Factory webRtcWorkerFactory;

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[Selfie.Pose.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Selfie.Pose.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Selfie.Pose.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelfieHintPose.values().length];
            try {
                iArr2[SelfieHintPose.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SelfieHintPose.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SelfieHintPose.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SelfieError.values().length];
            try {
                iArr3[SelfieError.FaceNotCentered.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SelfieError.FaceTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SelfieError.FaceTooFar.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SelfieError.MultipleFaces.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SelfieError.IncompleteFace.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SelfieError.FaceNotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[SelfieError.IncorrectPose.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[SelfieError.FaceDetectionUnsupported.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[SelfieError.Other.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public SelfieState initialState(Input props, Snapshot snapshot) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes == null) {
                parcelable = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            SelfieState selfieState = (SelfieState) parcelable;
            if (selfieState != null) {
                return selfieState;
            }
        }
        if (props.getSkipPromptPage()) {
            return new SelfieState.WaitForCameraFeed(false, false, null, props.getOrderedPoses(), props.getPoseConfigs(), false, CameraProperties.FacingMode.User, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, null);
        }
        return new SelfieState.ShowInstructions(null, null, 2, null);
    }

    public SelfieWorkflow(Context applicationContext, SubmitVerificationWorker.Factory submitVerificationWorker, WebRtcWorker.Factory webRtcWorkerFactory, SelfieAnalyzeWorker.Factory selfieAnalyzeWorker, PermissionRequestWorkflow permissionRequestWorkflow, LocalVideoCaptureRenderer localVideoCaptureRenderer, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, CameraStatsManager cameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.webRtcManager = WebRtcManagerBridge2.getWebRtcManagerBridge();
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", m3645f = "SelfieWorkflow.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1 */
    static final class C437381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C437381(Continuation<? super C437381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfieWorkflow.this.new C437381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CameraHelper cameraHelper = CameraHelper.INSTANCE;
                Context context = SelfieWorkflow.this.applicationContext;
                this.label = 1;
                if (cameraHelper.unbind(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WebRtcManagerBridge webRtcManagerBridge = SelfieWorkflow.this.webRtcManager;
            if (webRtcManagerBridge != null) {
                webRtcManagerBridge.closeWebRtcConnection();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Object render(Input renderProps, SelfieState renderState, StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Object objRenderSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!useCamera(renderState)) {
            context.runningSideEffect("close_camera", new C437381(null));
        }
        if (!webRtcConfigIsValid(renderProps)) {
            context.runningSideEffect("output_webrtc_error", new C437392(context, this, null));
        }
        boolean z = renderState instanceof SelfieState.Submit;
        this.navigationStateManager.setState(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z);
        this.externalEventLogger.logPageChange(new InquiryPage.Selfie(renderProps.getFromStep(), toSelfiePage(renderState)));
        if (renderState instanceof SelfieState.ShowInstructions) {
            objRenderSubmit = renderShowInstructions(renderProps, (SelfieState.ShowInstructions) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            objRenderSubmit = renderWaitForWebRtcSetup(renderProps, (SelfieState.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            objRenderSubmit = renderWaitForCameraFeed(renderProps, (SelfieState.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            objRenderSubmit = renderRestartCamera(renderProps, (SelfieState.RestartCamera) renderState, context);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            objRenderSubmit = renderShowPoseHint(renderProps, (SelfieState.ShowPoseHint) renderState, context);
        } else if (renderState instanceof SelfieState.StartCapture) {
            objRenderSubmit = renderStartCapture(renderProps, (SelfieState.StartCapture) renderState, context);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            objRenderSubmit = renderStartCaptureFaceDetected(renderProps, (SelfieState.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            objRenderSubmit = renderCountdownToCapture(renderProps, (SelfieState.CountdownToCapture) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            objRenderSubmit = renderCountdownToManualCapture(renderProps, (SelfieState.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof SelfieState.Capture) {
            objRenderSubmit = renderCapture(renderProps, (SelfieState.Capture) renderState, context);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            objRenderSubmit = renderCaptureTransition(renderProps, (SelfieState.CaptureTransition) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            objRenderSubmit = this.localVideoCaptureRenderer.renderFinalizeVideoCapture$selfie_release(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            objRenderSubmit = renderFinalizeWebRtc(renderProps, (SelfieState.FinalizeWebRtc) renderState, context);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            objRenderSubmit = renderWebRtcFinished(renderProps, (SelfieState.WebRtcFinished) renderState, context);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            objRenderSubmit = renderReviewCaptures(renderProps, (SelfieState.ReviewCaptures) renderState, context);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            objRenderSubmit = renderSubmit(renderProps, (SelfieState.Submit) renderState, context);
        }
        return objRenderSubmit instanceof Screen.OldCameraScreen ? PermissionsUtils.toModalContainerScreen(objRenderSubmit) : objRenderSubmit;
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", m3645f = "SelfieWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2 */
    static final class C437392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437392(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Continuation<? super C437392> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437392(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Input, SelfieState, ? extends Output>> actionSink = this.$context.getActionSink();
            final SelfieWorkflow selfieWorkflow = this.this$0;
            actionSink.send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C437392.invokeSuspend$lambda$0(selfieWorkflow, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SelfieWorkflow selfieWorkflow, WorkflowAction.Updater updater) {
            selfieWorkflow.setWebRtcErrorOutput(updater);
            return Unit.INSTANCE;
        }
    }

    private final boolean useCamera(SelfieState selfieState) {
        if ((selfieState instanceof SelfieState.Capture) || (selfieState instanceof SelfieState.CaptureTransition) || (selfieState instanceof SelfieState.CountdownToCapture) || (selfieState instanceof SelfieState.CountdownToManualCapture) || (selfieState instanceof SelfieState.ShowPoseHint) || (selfieState instanceof SelfieState.StartCapture) || (selfieState instanceof SelfieState.StartCaptureFaceDetected) || (selfieState instanceof SelfieState.WaitForCameraFeed) || (selfieState instanceof SelfieState.WaitForWebRtcSetup) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished) || (selfieState instanceof SelfieState.FinalizeLocalVideoCapture)) {
            return true;
        }
        if ((selfieState instanceof SelfieState.ShowInstructions) || (selfieState instanceof SelfieState.RestartCamera) || (selfieState instanceof SelfieState.ReviewCaptures) || (selfieState instanceof SelfieState.Submit)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowInstructions$lambda$2(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ShowInstructions showInstructions) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderShowInstructions$lambda$2$lambda$1(input, showInstructions, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowInstructions$lambda$2$lambda$1(Input input, SelfieState.ShowInstructions showInstructions, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.WaitForCameraFeed(false, false, SelfieWorkflowUtils.createBackState$default(action, false, 1, null), input.getOrderedPoses(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowInstructions$lambda$3(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowInstructions$lambda$4(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    private final Screen.InstructionsScreen renderShowInstructions(final Input renderProps, final SelfieState.ShowInstructions renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        SelfieType selfieType = renderProps.getSelfieType();
        RemoteImage selfiePictograph = null;
        if (Intrinsics.areEqual(selfieType, SelfieType.CenterOnly.INSTANCE)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.areEqual(selfieType, SelfieType.ThreePhotos.INSTANCE) && !Intrinsics.areEqual(selfieType, SelfieType.ConfigurablePoses.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new Screen.InstructionsScreen(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowInstructions$lambda$2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowInstructions$lambda$3(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowInstructions$lambda$4(this.f$0, context);
            }
        });
    }

    private final Object renderWaitForCameraFeed(final Input renderProps, final SelfieState.WaitForCameraFeed renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        boolean hasRequestedCameraPermissions = renderState.getHasRequestedCameraPermissions();
        boolean z = !renderState.getHasRequestedAudioPermissions() && isVideoCapture(renderProps) && ContextUtils3.isMicPresent(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Screen screenCreateCameraScreen$default = SelfieV1Utils.createCameraScreen$default(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), null, null, false, new Screen.OldCameraScreen.Mode.PreviewUnavailable(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$6(context, this, renderProps, renderState, jCurrentTimeMillis, (CameraProperties) obj);
            }
        }, Screen.OldCameraScreen.Overlay.CLEAR, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE)), SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$7(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$8(this.f$0, context);
            }
        }, SelfieWorkflowUtils.getCameraErrorHandler(context), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$9(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, !hasRequestedCameraPermissions || z, 16777216, null);
        if (!hasRequestedCameraPermissions) {
            PermissionsState permissionsState = PermissionsState.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle != null ? cameraPermissionsTitle : "";
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(R$string.pi2_selfie_camera_permission_rationale);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string2 = context2.getString(R$string.pi2_selfie_camera_permission_denied_rationale, ContextUtils3.getApplicationName(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return PermissionsUtils.withRequestPermissionsIfNeeded(screenCreateCameraScreen$default, context, true, permissionsState, (19976 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string2, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderWaitForCameraFeed$lambda$11(this.f$0, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
                }
            });
        }
        if (!z) {
            return screenCreateCameraScreen$default;
        }
        PermissionsState permissionsState2 = PermissionsState.RecordAudio;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(R$string.pi2_selfie_mic_permission_rationale);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string3 = context3.getString(R$string.pi2_selfie_mic_permission_denied_rationale, ContextUtils3.getApplicationName(context3));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        return PermissionsUtils.withRequestPermissionsIfNeeded(screenCreateCameraScreen$default, context, true, permissionsState2, (19976 & 8) != 0 ? false : false, microphonePermissionsTitle != null ? microphonePermissionsTitle : "", microphonePermissionsRationale, string3, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$13(this.f$0, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$6(StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.WaitForCameraFeed waitForCameraFeed, final long j, final CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$6$lambda$5(this.f$0, input, waitForCameraFeed, cameraProperties, j, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$6$lambda$5(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, CameraProperties cameraProperties, long j, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (selfieWorkflow.videoCaptureMethod(input) == VideoCaptureMethod.Stream) {
            action.setState(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j, SelfieWorkflowUtils.createBackState(action, false), waitForCameraFeed.getPosesNeeded(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            action.setState(new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.getPosesNeeded(), System.currentTimeMillis(), false, j, cameraProperties, SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), 67, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$7(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$8(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$9(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForCameraFeed$lambda$11(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$11$lambda$10(it, waitForCameraFeed, input, selfieWorkflow, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$11$lambda$10(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == PermissionsState2.PermissionGranted) {
            action.setState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed, true, false, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null));
        } else if (!input.getSkipPromptPage()) {
            action.setState(new SelfieState.ShowInstructions(null, null, 2, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.setOutputForWorkflow(renderContext, Output.Back.INSTANCE);
        } else {
            selfieWorkflow.setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForCameraFeed$lambda$13(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForCameraFeed$lambda$13$lambda$12(it, waitForCameraFeed, input, selfieWorkflow, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForCameraFeed$lambda$13$lambda$12(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == PermissionsState2.PermissionGranted) {
            action.setState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed, false, true, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
        } else if (!input.getSkipPromptPage()) {
            action.setState(new SelfieState.ShowInstructions(null, null, 2, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.setOutputForWorkflow(renderContext, Output.Back.INSTANCE);
        } else {
            selfieWorkflow.setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.INSTANCE;
    }

    private final Screen renderRestartCamera(final Input renderProps, final SelfieState.RestartCamera renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.closeWebRtcConnection();
        }
        return new Screen.RestartCameraScreen(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderRestartCamera$lambda$15(context, this, renderProps, renderState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRestartCamera$lambda$15(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.RestartCamera restartCamera) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderRestartCamera$lambda$15$lambda$14(input, restartCamera, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRestartCamera$lambda$15$lambda$14(Input input, SelfieState.RestartCamera restartCamera, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.WaitForCameraFeed(false, false, SelfieWorkflowUtils.createBackState(action, false), input.getOrderedPoses(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, null));
        return Unit.INSTANCE;
    }

    private final Screen renderWaitForWebRtcSetup(final Input renderProps, final SelfieState.WaitForWebRtcSetup renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Workflows.runningWorker(context, this.webRtcWorkerFactory.create(renderProps.getVideoCaptureConfig().getWebRtcJwt()), Reflection.typeOf(WebRtcWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23(this.f$0, renderState, renderProps, context, (WebRtcWorker.Response) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup waitingOnWebRtcSetup = new Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup(Screen.OldCameraScreen.Overlay.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, null, null, false, waitingOnWebRtcSetup, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$24(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$25(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$26(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod, webRtcManagerBridge, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForWebRtcSetup$lambda$23(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final StatefulWorkflow.RenderContext renderContext, final WebRtcWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices bestCameraChoices = Camera2Utils.getBestCameraChoices(selfieWorkflow.applicationContext, Camera2Utils4.FRONT);
        if (it instanceof WebRtcWorker.Response.Success) {
            return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda87
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$20(this.f$0, bestCameraChoices, it, waitForWebRtcSetup, input, renderContext, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof WebRtcWorker.Response.Error) {
            return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda88
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$22(renderContext, selfieWorkflow, waitForWebRtcSetup, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$20(final SelfieWorkflow selfieWorkflow, CameraChoices cameraChoices, WebRtcWorker.Response response, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        int i;
        int i2;
        CameraChoice primaryChoice;
        CameraChoice primaryChoice2;
        CameraChoice primaryChoice3;
        Size size;
        CameraChoice primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WebRtcManagerBridge webRtcManagerBridge = selfieWorkflow.webRtcManager;
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.setService(selfieWorkflow.webRtcWorkerFactory.getService());
        }
        WebRtcManagerBridge webRtcManagerBridge2 = selfieWorkflow.webRtcManager;
        if (webRtcManagerBridge2 != null) {
            webRtcManagerBridge2.setContext(selfieWorkflow.applicationContext);
        }
        int height = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            height = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i = height;
            i2 = width;
        } else {
            i2 = height;
            i = width;
        }
        WebRtcManagerBridge webRtcManagerBridge3 = selfieWorkflow.webRtcManager;
        if (webRtcManagerBridge3 != null) {
            WebRtcWorker.Response.Success success = (WebRtcWorker.Response.Success) response;
            webRtcManagerBridge3.setupConnection(success.getResult().getUsername(), success.getResult().getCredential(), success.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i2, i, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda93
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$17(renderContext, selfieWorkflow, waitForWebRtcSetup, input);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda94
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$19(renderContext, selfieWorkflow, waitForWebRtcSetup);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$17(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda96
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$17$lambda$16(waitForWebRtcSetup, input, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$17$lambda$16(SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.getPosesNeeded(), System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), 67, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$19(StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda95
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$19$lambda$18(this.f$0, waitForWebRtcSetup, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$20$lambda$19$lambda$18(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.webRtcManager.webRtcConnectionFailed();
        action.setState(new SelfieState.RestartCamera(false, false, SelfieWorkflowUtils.createBackState(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$22(StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda92
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWaitForWebRtcSetup$lambda$23$lambda$22$lambda$21(this.f$0, waitForWebRtcSetup, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$23$lambda$22$lambda$21(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WebRtcManagerBridge webRtcManagerBridge = selfieWorkflow.webRtcManager;
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.webRtcConnectionFailed();
        }
        action.setState(new SelfieState.RestartCamera(false, false, SelfieWorkflowUtils.createBackState(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$24(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$25(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForWebRtcSetup$lambda$26(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderShowPoseHint(final Input renderProps, final SelfieState.ShowPoseHint renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        SelfieHintPose selfieHintPose;
        String selfieHintLookLeft;
        Screen.OldCameraScreen.Overlay overlay;
        int i = WhenMappings.$EnumSwitchMapping$0[((Selfie.Pose) CollectionsKt.first((List) renderState.getPosesNeeded())).ordinal()];
        if (i == 1) {
            selfieHintPose = SelfieHintPose.Left;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            selfieHintPose = SelfieHintPose.Right;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i2 = iArr[selfieHintPose.ordinal()];
        if (i2 == 1) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i2 == 2) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookRight();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintPoseNotCentered();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i3 = iArr[selfieHintPose.ordinal()];
        if (i3 == 1) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_LEFT_HINT;
        } else if (i3 == 2) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_RIGHT_HINT;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            overlay = Screen.OldCameraScreen.Overlay.CENTER;
        }
        String str = selfieHintLookLeft;
        Screen.OldCameraScreen.Mode.PlayPoseHint playPoseHint = new Screen.OldCameraScreen.Mode.PlayPoseHint(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowPoseHint$lambda$28(context, this, renderState, renderProps);
            }
        }, overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        Screen.OldCameraScreen.AssetOverrides assetOverridesMakeCameraScreenAssetOverrides = SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        CameraXController.Factory factory = this.cameraXControllerFactory;
        Camera2ManagerFactory.Factory factory2 = this.camera2ManagerFactoryFactory;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, str, null, renderState.getAutoCaptureSupported(), playPoseHint, assetOverridesMakeCameraScreenAssetOverrides, requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowPoseHint$lambda$29(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowPoseHint$lambda$30(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderShowPoseHint$lambda$31(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod, webRtcManagerBridge, recordAudio, factory, factory2, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowPoseHint$lambda$28(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final SelfieState.ShowPoseHint showPoseHint, final Input input) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderShowPoseHint$lambda$28$lambda$27(showPoseHint, input, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowPoseHint$lambda$28$lambda$27(SelfieState.ShowPoseHint showPoseHint, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<Selfie.Pose> posesNeeded = showPoseHint.getPosesNeeded();
        action.setState(new SelfieState.Capture(null, 0.0f, null, showPoseHint.getSelfies$selfie_release(), posesNeeded, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, 8193, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowPoseHint$lambda$29(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowPoseHint$lambda$30(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderShowPoseHint$lambda$31(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderStartCapture(final Input renderProps, final SelfieState.StartCapture renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        boolean z;
        String selfieHintTakePhoto;
        Screen.OldCameraScreen.Mode autoCapture;
        Screen.OldCameraScreen.Mode manualCapture;
        if (renderState.getCurrentPoseConfig().getAutoCaptureEnabled()) {
            Workflows.runningWorker(context, this.selfieAnalyzeWorker.create(Selfie.Pose.Center, false), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderStartCapture$lambda$33(this.f$0, renderState, renderProps, context, (SelfieAnalyzeWorker.Output) obj);
                }
            });
        }
        final Selfie.Pose currentPose = renderState.getCurrentPose();
        boolean manualCaptureEnabled = renderState.getManualCaptureEnabled();
        if (!manualCaptureEnabled) {
            runManualCaptureEnabledChecker(context);
        }
        Screen.OldCameraScreen.Overlay overlay = Screen.OldCameraScreen.Overlay.CENTER;
        SelfieError selfieError = renderState.getSelfieError();
        String hintMessage = selfieError != null ? toHintMessage(selfieError, renderProps.getStrings(), renderState.getCurrentPose()) : null;
        if (hintMessage == null) {
            z = manualCaptureEnabled;
            selfieHintTakePhoto = renderProps.getStrings().getSelfieHintTakePhoto();
        } else {
            z = manualCaptureEnabled;
            selfieHintTakePhoto = hintMessage;
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (z) {
            if (isVideoCapture(renderProps)) {
                autoCapture = new Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.renderStartCapture$lambda$35(context, this, renderState, renderProps);
                    }
                }, overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
            } else {
                manualCapture = new Screen.OldCameraScreen.Mode.ManualCapture(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflow.renderStartCapture$lambda$37(currentPose, context, this, renderState, (String) obj);
                    }
                }, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflow.renderStartCapture$lambda$38(this.f$0, context, (Throwable) obj);
                    }
                }, false, overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE), 4, null);
                boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
                NavigationState navigationState = this.navigationStateManager.getNavigationState();
                Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
                VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
                WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
                return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, selfieHintTakePhoto, hintMessage, renderState.getAutoCaptureSupported(), manualCapture, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.renderStartCapture$lambda$39(context, this);
                    }
                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.renderStartCapture$lambda$40(this.f$0, context);
                    }
                }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.renderStartCapture$lambda$41(this.f$0, context, renderProps);
                    }
                }, videoCaptureMethod, webRtcManagerBridge, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
            }
        } else {
            autoCapture = new Screen.OldCameraScreen.Mode.AutoCapture(overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        }
        manualCapture = autoCapture;
        boolean requireStrictSelfieCapture2 = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState2 = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler2 = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod2 = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge2 = this.webRtcManager;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, selfieHintTakePhoto, hintMessage, renderState.getAutoCaptureSupported(), manualCapture, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), requireStrictSelfieCapture2, navigationState2, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCapture$lambda$39(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCapture$lambda$40(this.f$0, context);
            }
        }, cameraErrorHandler2, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCapture$lambda$41(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod2, webRtcManagerBridge2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderStartCapture$lambda$33(final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input, final StatefulWorkflow.RenderContext renderContext, final SelfieAnalyzeWorker.Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCapture$lambda$33$lambda$32(output, startCapture, input, selfieWorkflow, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$33$lambda$32(SelfieAnalyzeWorker.Output output, SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        SelfieState.StartCapture startCaptureCopy;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.StartCapture startCapture2 = state instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) state : null;
        if (startCapture2 == null) {
            return Unit.INSTANCE;
        }
        if (output instanceof SelfieAnalyzeWorker.Output.Detected) {
            SelfieAnalyzeWorker.Output.Detected detected = (SelfieAnalyzeWorker.Output.Detected) output;
            action.setState(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), detected.getPoseScore(), detected.getBrightnessInfo(), startCapture.getPosesNeeded(), SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled()));
        } else if (output instanceof SelfieAnalyzeWorker.Output.RuntimeError) {
            selfieWorkflow.setErrorOutput(renderContext, ((SelfieAnalyzeWorker.Output.RuntimeError) output).getError());
        } else {
            if (!(output instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                throw new NoWhenBranchMatchedException();
            }
            SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output;
            if (selfieDetectionError.getError() == SelfieError.FaceDetectionUnsupported) {
                startCaptureCopy = startCapture2.copy((4095 & 1) != 0 ? startCapture2.centered : false, (4095 & 2) != 0 ? startCapture2.selfieError : null, (4095 & 4) != 0 ? startCapture2.poseScore : selfieDetectionError.getPoseScore(), (4095 & 8) != 0 ? startCapture2.brightnessInfo : selfieDetectionError.getBrightnessInfo(), (4095 & 16) != 0 ? startCapture2.posesNeeded : null, (4095 & 32) != 0 ? startCapture2.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture2.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture2.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture2.cameraProperties : null, (4095 & 512) != 0 ? startCapture2.backState : null, (4095 & 1024) != 0 ? startCapture2.poseConfigs : null, (4095 & 2048) != 0 ? startCapture2.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture2.isFlashEnabled : false);
            } else {
                startCaptureCopy = startCapture2.copy((4095 & 1) != 0 ? startCapture2.centered : false, (4095 & 2) != 0 ? startCapture2.selfieError : selfieDetectionError.getError(), (4095 & 4) != 0 ? startCapture2.poseScore : selfieDetectionError.getPoseScore(), (4095 & 8) != 0 ? startCapture2.brightnessInfo : selfieDetectionError.getBrightnessInfo(), (4095 & 16) != 0 ? startCapture2.posesNeeded : null, (4095 & 32) != 0 ? startCapture2.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture2.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture2.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture2.cameraProperties : null, (4095 & 512) != 0 ? startCapture2.backState : null, (4095 & 1024) != 0 ? startCapture2.poseConfigs : null, (4095 & 2048) != 0 ? startCapture2.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture2.isFlashEnabled : false);
            }
            action.setState(startCaptureCopy);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$35(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCapture$lambda$35$lambda$34(startCapture, input, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$35$lambda$34(SelfieState.StartCapture startCapture, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.StartCapture startCapture2 = state instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) state : null;
        if (startCapture2 == null) {
            return Unit.INSTANCE;
        }
        action.setState(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.getPosesNeeded(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$37(Selfie.Pose pose, StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.CaptureMethod.MANUAL, pose, System.currentTimeMillis());
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCapture$lambda$37$lambda$36(this.f$0, startCapture, selfieImage, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$37$lambda$36(SelfieWorkflow selfieWorkflow, SelfieState.StartCapture startCapture, Selfie.SelfieImage selfieImage, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(selfieWorkflow.nextState(action, startCapture, selfieImage));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$38(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.setErrorOutput(renderContext, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$39(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$40(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCapture$lambda$41(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderStartCaptureFaceDetected(final Input renderProps, final SelfieState.StartCaptureFaceDetected renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        if (renderState.getCurrentPoseConfig().getAutoCaptureEnabled()) {
            Workflows.runningWorker(context, this.selfieAnalyzeWorker.create(Selfie.Pose.Center, false), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$43(this.f$0, context, renderState, renderProps, (SelfieAnalyzeWorker.Output) obj);
                }
            });
        }
        Workflows.runningWorker(context, Worker.Companion.timer$default(Worker.INSTANCE, 1000L, null, 2, null), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Unit.class))), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$45(this.f$0, renderState, renderProps, (Unit) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        Screen.OldCameraScreen.Mode.AutoCapture autoCapture = new Screen.OldCameraScreen.Mode.AutoCapture(Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        Screen.OldCameraScreen.AssetOverrides assetOverridesMakeCameraScreenAssetOverrides = SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        CameraXController.Factory factory = this.cameraXControllerFactory;
        Camera2ManagerFactory.Factory factory2 = this.camera2ManagerFactoryFactory;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), autoCapture, assetOverridesMakeCameraScreenAssetOverrides, requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$46(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$47(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$48(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod, webRtcManagerBridge, recordAudio, factory, factory2, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderStartCaptureFaceDetected$lambda$43(final SelfieWorkflow selfieWorkflow, final StatefulWorkflow.RenderContext renderContext, final SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final SelfieAnalyzeWorker.Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$43$lambda$42(output, selfieWorkflow, renderContext, startCaptureFaceDetected, input, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCaptureFaceDetected$lambda$43$lambda$42(SelfieAnalyzeWorker.Output output, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(output instanceof SelfieAnalyzeWorker.Output.Detected)) {
            if (output instanceof SelfieAnalyzeWorker.Output.RuntimeError) {
                selfieWorkflow.setErrorOutput(renderContext, ((SelfieAnalyzeWorker.Output.RuntimeError) output).getError());
            } else {
                if (!(output instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                    throw new NoWhenBranchMatchedException();
                }
                SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output;
                SelfieError error = selfieDetectionError.getError();
                List<Selfie.Pose> posesNeeded = startCaptureFaceDetected.getPosesNeeded();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.setState(new SelfieState.StartCapture(false, error, selfieDetectionError.getPoseScore(), selfieDetectionError.getBrightnessInfo(), posesNeeded, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), 65, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderStartCaptureFaceDetected$lambda$45(SelfieWorkflow selfieWorkflow, final SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderStartCaptureFaceDetected$lambda$45$lambda$44(startCaptureFaceDetected, input, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCaptureFaceDetected$lambda$45$lambda$44(SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(action.getState() instanceof SelfieState.StartCaptureFaceDetected)) {
            return Unit.INSTANCE;
        }
        List<Selfie.Pose> posesNeeded = startCaptureFaceDetected.getPosesNeeded();
        action.setState(new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), posesNeeded, SelfieWorkflowUtils.createBackState(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCaptureFaceDetected$lambda$46(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCaptureFaceDetected$lambda$47(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderStartCaptureFaceDetected$lambda$48(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderCountdownToCapture(final Input renderProps, SelfieState.CountdownToCapture renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        if (renderState.getCurrentPoseConfig().getAutoCaptureEnabled()) {
            Workflows.runningWorker(context, this.selfieAnalyzeWorker.create(Selfie.Pose.Center, false), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCountdownToCapture$lambda$50(this.f$0, context, (SelfieAnalyzeWorker.Output) obj);
                }
            });
        }
        context.runningSideEffect("countdown_" + renderState.getCountDown(), new C437422(context, this, renderState, renderProps, null));
        SelfieError selfieError = renderState.getSelfieError();
        String hintMessage = selfieError != null ? toHintMessage(selfieError, renderProps.getStrings(), renderState.getCurrentPose()) : null;
        String selfieHintCenterFace = hintMessage == null ? renderProps.getStrings().getSelfieHintCenterFace() : hintMessage;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded countDownAndStartLocalRecordingIfNeeded = new Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded(renderState.getCountDown(), videoCaptureMethod(renderProps) == VideoCaptureMethod.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE), new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCountdownToCapture$lambda$51(context, (Throwable) obj);
            }
        });
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, selfieHintCenterFace, hintMessage, renderState.getAutoCaptureSupported(), countDownAndStartLocalRecordingIfNeeded, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToCapture$lambda$52(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToCapture$lambda$53(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToCapture$lambda$54(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod, webRtcManagerBridge, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderCountdownToCapture$lambda$50(final SelfieWorkflow selfieWorkflow, final StatefulWorkflow.RenderContext renderContext, final SelfieAnalyzeWorker.Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCountdownToCapture$lambda$50$lambda$49(output, selfieWorkflow, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$50$lambda$49(SelfieAnalyzeWorker.Output output, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.CountdownToCapture countdownToCapture = state instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) state : null;
        if (countdownToCapture == null) {
            return Unit.INSTANCE;
        }
        if (!(output instanceof SelfieAnalyzeWorker.Output.Detected)) {
            if (output instanceof SelfieAnalyzeWorker.Output.RuntimeError) {
                selfieWorkflow.setErrorOutput(renderContext, ((SelfieAnalyzeWorker.Output.RuntimeError) output).getError());
            } else {
                if (!(output instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                    throw new NoWhenBranchMatchedException();
                }
                SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output;
                action.setState(countdownToCapture.copy((8188 & 1) != 0 ? countdownToCapture.countDown : 0, (8188 & 2) != 0 ? countdownToCapture.selfieError : selfieDetectionError.getError(), (8188 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture.poseScore : selfieDetectionError.getPoseScore(), (8188 & 64) != 0 ? countdownToCapture.brightnessInfo : selfieDetectionError.getBrightnessInfo(), (8188 & 128) != 0 ? countdownToCapture.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture.backState : null, (8188 & 512) != 0 ? countdownToCapture.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture.isFlashEnabled : false));
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", m3645f = "SelfieWorkflow.kt", m3646l = {938}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2 */
    static final class C437422 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        final /* synthetic */ Input $renderProps;
        final /* synthetic */ SelfieState.CountdownToCapture $renderState;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437422(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, SelfieState.CountdownToCapture countdownToCapture, Input input, Continuation<? super C437422> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
            this.$renderState = countdownToCapture;
            this.$renderProps = input;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437422(this.$context, this.this$0, this.$renderState, this.$renderProps, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Sink<WorkflowAction<? super Input, SelfieState, ? extends Output>> actionSink = this.$context.getActionSink();
            SelfieWorkflow selfieWorkflow = this.this$0;
            final SelfieState.CountdownToCapture countdownToCapture = this.$renderState;
            final Input input = this.$renderProps;
            actionSink.send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C437422.invokeSuspend$lambda$0(countdownToCapture, input, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SelfieState.CountdownToCapture countdownToCapture, Input input, WorkflowAction.Updater updater) {
            Object state = updater.getState();
            SelfieState.CountdownToCapture countdownToCapture2 = state instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) state : null;
            if (countdownToCapture2 == null) {
                return Unit.INSTANCE;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown > 1) {
                updater.setState(countdownToCapture2.copy((8188 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (8188 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (8188 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture2.poseScore : 0.0f, (8188 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (8188 & 128) != 0 ? countdownToCapture2.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture2.backState : null, (8188 & 512) != 0 ? countdownToCapture2.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture2.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture2.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture2.isFlashEnabled : false));
            } else {
                updater.setState(new SelfieState.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), null, countdownToCapture2.getPosesNeeded(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), SelfieWorkflowUtils.createBackState(updater, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, 8264, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$51(StatefulWorkflow.RenderContext renderContext, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SelfieWorkflowUtils.getCameraErrorHandler(renderContext).invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$52(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$53(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$54(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderCountdownToManualCapture(final Input renderProps, SelfieState.CountdownToManualCapture renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Screen.OldCameraScreen.Overlay overlay;
        final SelfieState.CountdownToManualCapture countdownToManualCapture;
        Screen.OldCameraScreen.Mode countDownAndStartLocalRecordingIfNeeded;
        final Selfie.Pose pose = (Selfie.Pose) CollectionsKt.first((List) renderState.getPosesNeeded());
        int i = WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == 1) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_LEFT;
        } else if (i == 2) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            overlay = Screen.OldCameraScreen.Overlay.CENTER;
        }
        Screen.OldCameraScreen.Overlay overlay2 = overlay;
        context.runningSideEffect("countdown_to_manual_capture_" + renderState.getCountDown(), new C437431(context, this, null));
        SelfieError selfieError = renderState.getSelfieError();
        String hintMessage = selfieError != null ? toHintMessage(selfieError, renderProps.getStrings(), renderState.getCurrentPose()) : null;
        String selfieHintCenterFace = hintMessage == null ? renderProps.getStrings().getSelfieHintCenterFace() : hintMessage;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            countDownAndStartLocalRecordingIfNeeded = new Screen.OldCameraScreen.Mode.ManualCapture(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCountdownToManualCapture$lambda$56(pose, context, this, countdownToManualCapture, (String) obj);
                }
            }, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCountdownToManualCapture$lambda$57(this.f$0, context, (Throwable) obj);
                }
            }, true, overlay2, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        } else {
            countdownToManualCapture = renderState;
            countDownAndStartLocalRecordingIfNeeded = new Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded(countdownToManualCapture.getCountDown(), videoCaptureMethod(renderProps) == VideoCaptureMethod.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), overlay2, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE), new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCountdownToManualCapture$lambda$58(context, (Throwable) obj);
                }
            });
        }
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, countdownToManualCapture.getCurrentPose(), capturePageTitle, selfieHintCenterFace, hintMessage, countdownToManualCapture.getAutoCaptureSupported(), countDownAndStartLocalRecordingIfNeeded, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToManualCapture$lambda$59(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToManualCapture$lambda$60(this.f$0, context);
            }
        }, SelfieWorkflowUtils.getCameraErrorHandler(context), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCountdownToManualCapture$lambda$61(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), false, false, 50331648, null);
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", m3645f = "SelfieWorkflow.kt", m3646l = {1029}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1 */
    static final class C437431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437431(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Continuation<? super C437431> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437431(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getActionSink().send(StatefulWorkflow2.action$default(this.this$0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C437431.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            Object state = updater.getState();
            SelfieState.CountdownToManualCapture countdownToManualCapture = state instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) state : null;
            if (countdownToManualCapture == null) {
                return Unit.INSTANCE;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                updater.setState(SelfieState.CountdownToManualCapture.copy$default(countdownToManualCapture, countDown - 1, countdownToManualCapture.getSelfieError(), null, null, 0L, false, 0L, null, null, null, false, 2044, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$56(Selfie.Pose pose, StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.CaptureMethod.MANUAL, pose, System.currentTimeMillis());
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCountdownToManualCapture$lambda$56$lambda$55(this.f$0, countdownToManualCapture, selfieImage, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$56$lambda$55(SelfieWorkflow selfieWorkflow, SelfieState.CountdownToManualCapture countdownToManualCapture, Selfie.SelfieImage selfieImage, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(selfieWorkflow.nextState(action, countdownToManualCapture, selfieImage));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$57(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.setErrorOutput(renderContext, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$58(StatefulWorkflow.RenderContext renderContext, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SelfieWorkflowUtils.getCameraErrorHandler(renderContext).invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$59(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$60(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToManualCapture$lambda$61(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderCapture(final Input renderProps, final SelfieState.Capture renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        SelfieState.FlashState flashState;
        String selfieHintCenterFace;
        Screen.OldCameraScreen.Overlay overlay;
        Screen.OldCameraScreen.Mode autoCapture;
        final Selfie.Pose currentPose = renderState.getCurrentPose();
        if (renderState.getIsFlashEnabled()) {
            if (renderState.getFlashState() == SelfieState.FlashState.Disabled) {
                flashState = SelfieState.FlashState.Enabled;
            } else {
                flashState = renderState.getFlashState();
            }
        } else {
            flashState = SelfieState.FlashState.Disabled;
        }
        if (renderState.getCurrentPoseConfig().getAutoCaptureEnabled()) {
            Workflows.runningWorker(context, this.selfieAnalyzeWorker.create(currentPose, flashState == SelfieState.FlashState.Disabled || flashState == SelfieState.FlashState.ReadyToCapture), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCapture$lambda$63(this.f$0, renderState, context, (SelfieAnalyzeWorker.Output) obj);
                }
            });
        }
        SelfieError selfieError = renderState.getSelfieError();
        String hintMessage = selfieError != null ? toHintMessage(selfieError, renderProps.getStrings(), renderState.getCurrentPose()) : null;
        if (currentPose == Selfie.Pose.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (currentPose == Selfie.Pose.Right) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        } else if (renderState.getSelfieError() != null) {
            selfieHintCenterFace = hintMessage;
        } else {
            selfieHintCenterFace = currentPose == Selfie.Pose.Center ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[currentPose.ordinal()];
        if (i == 1) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_LEFT;
        } else if (i == 2) {
            overlay = Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            overlay = Screen.OldCameraScreen.Overlay.CENTER;
        }
        Screen.OldCameraScreen.Overlay overlay2 = overlay;
        if (renderState.getManualCaptureEnabled() && flashState != SelfieState.FlashState.FlashOn && flashState != SelfieState.FlashState.ReadyToCapture) {
            autoCapture = new Screen.OldCameraScreen.Mode.ManualCapture(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCapture$lambda$65(currentPose, context, this, renderState, (String) obj);
                }
            }, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderCapture$lambda$66(this.f$0, context, (Throwable) obj);
                }
            }, false, overlay2, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE), 4, null);
        } else {
            autoCapture = new Screen.OldCameraScreen.Mode.AutoCapture(overlay2, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        }
        if (!renderState.getManualCaptureEnabled()) {
            runManualCaptureEnabledChecker(context);
        }
        SelfieState.FlashState flashState2 = SelfieState.FlashState.FlashOn;
        if (flashState == flashState2) {
            context.runningSideEffect("wait_to_capture_with_flash_on", new C437402(context, this, null));
        }
        SelfieState.FlashState flashState3 = SelfieState.FlashState.ReadyToCapture;
        if (flashState == flashState3) {
            context.runningSideEffect("turn_off_flash", new C437413(context, this, null));
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(renderProps);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        String str = hintMessage;
        String str2 = selfieHintCenterFace;
        Screen.OldCameraScreen.AssetOverrides assetOverridesMakeCameraScreenAssetOverrides = SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        CameraXController.Factory factory = this.cameraXControllerFactory;
        Camera2ManagerFactory.Factory factory2 = this.camera2ManagerFactoryFactory;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, renderState.getCurrentPose(), capturePageTitle, str2, str, renderState.getAutoCaptureSupported(), autoCapture, assetOverridesMakeCameraScreenAssetOverrides, requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCapture$lambda$67(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCapture$lambda$68(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCapture$lambda$69(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod, webRtcManagerBridge, recordAudio, factory, factory2, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), renderState.getFlashState() == flashState2 || renderState.getFlashState() == flashState3, false, 33554432, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderCapture$lambda$63(final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, final StatefulWorkflow.RenderContext renderContext, final SelfieAnalyzeWorker.Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCapture$lambda$63$lambda$62(output, selfieWorkflow, capture, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$63$lambda$62(SelfieAnalyzeWorker.Output output, SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.Capture capture2 = state instanceof SelfieState.Capture ? (SelfieState.Capture) state : null;
        if (capture2 == null) {
            return Unit.INSTANCE;
        }
        if (output instanceof SelfieAnalyzeWorker.Output.Detected) {
            SelfieAnalyzeWorker.Output.Detected detected = (SelfieAnalyzeWorker.Output.Detected) output;
            if (detected.getSelfie() != null) {
                Selfie selfie = detected.getSelfie();
                if (selfie != null) {
                    action.setState(selfieWorkflow.nextState(action, capture, selfie));
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                action.setState(capture2.copy((8191 & 1) != 0 ? capture2.selfieError : null, (8191 & 2) != 0 ? capture2.poseScore : 0.0f, (8191 & 4) != 0 ? capture2.brightnessInfo : null, (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & 8192) != 0 ? capture2.flashState : SelfieState.FlashState.FlashOn));
            }
        } else if (output instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError) {
            SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output;
            if (selfieDetectionError.getError() == SelfieError.FaceDetectionUnsupported) {
                action.setState(capture2.copy((8191 & 1) != 0 ? capture2.selfieError : null, (8191 & 2) != 0 ? capture2.poseScore : selfieDetectionError.getPoseScore(), (8191 & 4) != 0 ? capture2.brightnessInfo : selfieDetectionError.getBrightnessInfo(), (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & 8192) != 0 ? capture2.flashState : null));
            } else {
                action.setState(capture2.copy((8191 & 1) != 0 ? capture2.selfieError : selfieDetectionError.getError(), (8191 & 2) != 0 ? capture2.poseScore : selfieDetectionError.getPoseScore(), (8191 & 4) != 0 ? capture2.brightnessInfo : selfieDetectionError.getBrightnessInfo(), (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & 8192) != 0 ? capture2.flashState : null));
            }
        } else {
            if (!(output instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                throw new NoWhenBranchMatchedException();
            }
            selfieWorkflow.setErrorOutput(renderContext, ((SelfieAnalyzeWorker.Output.RuntimeError) output).getError());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$65(Selfie.Pose pose, StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.CaptureMethod.MANUAL, pose, System.currentTimeMillis());
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCapture$lambda$65$lambda$64(this.f$0, capture, selfieImage, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$65$lambda$64(SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, Selfie.SelfieImage selfieImage, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(selfieWorkflow.nextState(action, capture, selfieImage));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$66(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.setErrorOutput(renderContext, it);
        return Unit.INSTANCE;
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$2", m3645f = "SelfieWorkflow.kt", m3646l = {1235}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$2 */
    static final class C437402 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437402(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Continuation<? super C437402> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437402(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getActionSink().send(StatefulWorkflow2.action$default(this.this$0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C437402.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            Object state = updater.getState();
            SelfieState.Capture capture = state instanceof SelfieState.Capture ? (SelfieState.Capture) state : null;
            if (capture == null) {
                return Unit.INSTANCE;
            }
            updater.setState(capture.copy((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : 0.0f, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : false, (8191 & 8192) != 0 ? capture.flashState : SelfieState.FlashState.ReadyToCapture));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", m3645f = "SelfieWorkflow.kt", m3646l = {1249}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3 */
    static final class C437413 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437413(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Continuation<? super C437413> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437413(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getActionSink().send(StatefulWorkflow2.action$default(this.this$0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C437413.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            Object state = updater.getState();
            SelfieState.Capture capture = state instanceof SelfieState.Capture ? (SelfieState.Capture) state : null;
            if (capture == null) {
                return Unit.INSTANCE;
            }
            updater.setState(capture.copy((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : 0.0f, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : false, (8191 & 8192) != 0 ? capture.flashState : SelfieState.FlashState.Enabled));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$67(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$68(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCapture$lambda$69(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderCaptureTransition(final Input renderProps, SelfieState.CaptureTransition renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Screen.OldCameraScreen.Overlay overlay;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            overlay = Screen.OldCameraScreen.Overlay.COMPLETE_WITH_CAPTURE;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[renderState.getCompletedPose().ordinal()];
            if (i == 1) {
                overlay = Screen.OldCameraScreen.Overlay.LOOK_LEFT_COMPLETE;
            } else if (i == 2) {
                overlay = Screen.OldCameraScreen.Overlay.LOOK_RIGHT_COMPLETE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                overlay = Screen.OldCameraScreen.Overlay.CENTER_COMPLETE;
            }
        }
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, null, capturePageTitle, null, null, false, new Screen.OldCameraScreen.Mode.Transition(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCaptureTransition$lambda$71(context, this);
            }
        }, true, overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE)), SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCaptureTransition$lambda$72(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCaptureTransition$lambda$73(this.f$0, context);
            }
        }, SelfieWorkflowUtils.getCameraErrorHandler(context), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderCaptureTransition$lambda$74(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCaptureTransition$lambda$71(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderCaptureTransition$lambda$71$lambda$70((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCaptureTransition$lambda$71$lambda$70(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            action.setState(nextState);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCaptureTransition$lambda$72(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCaptureTransition$lambda$73(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCaptureTransition$lambda$74(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderFinalizeWebRtc(final Input renderProps, SelfieState.FinalizeWebRtc renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        if (webRtcManagerBridge != null) {
            finalizeWebRtc = renderState;
            webRtcManagerBridge.stopRecording(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderFinalizeWebRtc$lambda$76(context, this, finalizeWebRtc, (String) obj);
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), null, null, false, new Screen.OldCameraScreen.Mode.Transition(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, false, Screen.OldCameraScreen.Overlay.FINALIZING, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE)), SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderFinalizeWebRtc$lambda$78(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderFinalizeWebRtc$lambda$79(this.f$0, context);
            }
        }, SelfieWorkflowUtils.getCameraErrorHandler(context), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderFinalizeWebRtc$lambda$80(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$76(StatefulWorkflow.RenderContext renderContext, final SelfieWorkflow selfieWorkflow, final SelfieState.FinalizeWebRtc finalizeWebRtc, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderFinalizeWebRtc$lambda$76$lambda$75(finalizeWebRtc, it, selfieWorkflow, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$76$lambda$75(SelfieState.FinalizeWebRtc finalizeWebRtc, String str, SelfieWorkflow selfieWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.WebRtcFinished(finalizeWebRtc.getSelfies$selfie_release(), str, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), SelfieWorkflowUtils.createBackState(action, false), finalizeWebRtc.getCameraFacingMode()));
        selfieWorkflow.webRtcManager.closeWebRtcConnection();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$78(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$79(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$80(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final Screen renderWebRtcFinished(final Input renderProps, final SelfieState.WebRtcFinished renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        Screen.OldCameraScreen.Mode.Transition transition = new Screen.OldCameraScreen.Mode.Transition(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWebRtcFinished$lambda$82(context, this, renderState);
            }
        }, false, Screen.OldCameraScreen.Overlay.COMPLETE, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function1<Throwable, Unit> cameraErrorHandler = SelfieWorkflowUtils.getCameraErrorHandler(context);
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, null, capturePageTitle, null, null, false, transition, SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), requireStrictSelfieCapture, navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWebRtcFinished$lambda$83(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWebRtcFinished$lambda$84(this.f$0, context);
            }
        }, cameraErrorHandler, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderWebRtcFinished$lambda$85(this.f$0, context, renderProps);
            }
        }, videoCaptureMethod(renderProps), webRtcManagerBridge, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, renderState.getCameraFacingMode(), false, false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWebRtcFinished$lambda$82(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final SelfieState.WebRtcFinished webRtcFinished) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderWebRtcFinished$lambda$82$lambda$81(webRtcFinished, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWebRtcFinished$lambda$82$lambda$81(SelfieState.WebRtcFinished webRtcFinished, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(SelfieWorkflowUtils.reviewStateIfNeeded(action, webRtcFinished.getSelfies$selfie_release(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), SelfieWorkflowUtils.createBackState(action, false)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWebRtcFinished$lambda$83(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWebRtcFinished$lambda$84(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWebRtcFinished$lambda$85(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(selfieWorkflow.applicationContext, renderContext, input, selfieWorkflow.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final boolean webRtcConfigIsValid(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        Boolean boolValueOf = webRtcManagerBridge != null ? Boolean.valueOf(webRtcManagerBridge.webRtcConnectionHasFailedTooManyTimesToRetry()) : null;
        WebRtcManagerBridge webRtcManagerBridge2 = this.webRtcManager;
        Object objM27481isVideo0E7RQCE = videoCaptureConfig.m27481isVideo0E7RQCE(boolValueOf, webRtcManagerBridge2 != null ? Boolean.valueOf(webRtcManagerBridge2.webRtcConnectionHasFailedAtLeastOnce()) : null, this.applicationContext);
        if (Result.m28553exceptionOrNullimpl(objM27481isVideo0E7RQCE) != null) {
            return false;
        }
        ((Boolean) objM27481isVideo0E7RQCE).getClass();
        return true;
    }

    private final boolean isVideoCapture(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        Boolean boolValueOf = webRtcManagerBridge != null ? Boolean.valueOf(webRtcManagerBridge.webRtcConnectionHasFailedTooManyTimesToRetry()) : null;
        WebRtcManagerBridge webRtcManagerBridge2 = this.webRtcManager;
        Object objM27481isVideo0E7RQCE = videoCaptureConfig.m27481isVideo0E7RQCE(boolValueOf, webRtcManagerBridge2 != null ? Boolean.valueOf(webRtcManagerBridge2.webRtcConnectionHasFailedAtLeastOnce()) : null, this.applicationContext);
        if (Result.m28553exceptionOrNullimpl(objM27481isVideo0E7RQCE) == null) {
            return ((Boolean) objM27481isVideo0E7RQCE).booleanValue();
        }
        return false;
    }

    private final VideoCaptureMethod videoCaptureMethod(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        WebRtcManagerBridge webRtcManagerBridge = this.webRtcManager;
        Boolean boolValueOf = webRtcManagerBridge != null ? Boolean.valueOf(webRtcManagerBridge.webRtcConnectionHasFailedTooManyTimesToRetry()) : null;
        WebRtcManagerBridge webRtcManagerBridge2 = this.webRtcManager;
        Object objM27482videoCaptureMethod0E7RQCE = videoCaptureConfig.m27482videoCaptureMethod0E7RQCE(boolValueOf, webRtcManagerBridge2 != null ? Boolean.valueOf(webRtcManagerBridge2.webRtcConnectionHasFailedAtLeastOnce()) : null, this.applicationContext);
        return Result.m28553exceptionOrNullimpl(objM27482videoCaptureMethod0E7RQCE) == null ? (VideoCaptureMethod) objM27482videoCaptureMethod0E7RQCE : VideoCaptureMethod.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWebRtcErrorOutput(WorkflowAction<? super Input, SelfieState, ? extends Output>.Updater updater) {
        updater.setOutput(new Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    private final Screen renderReviewCaptures(final Input renderProps, final SelfieState.ReviewCaptures renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(R$string.pi2_selfie_check_page_title);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(R$string.pi2_selfie_check_page_description);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(R$string.pi2_selfie_check_page_label_front);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(R$string.pi2_selfie_check_page_label_left);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(R$string.pi2_selfie_check_page_label_right);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(R$string.pi2_selfie_check_page_label_btn_submit);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(R$string.pi2_selfie_check_page_label_btn_retake);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new Screen.ReviewCapturesScreen(new Screen.ReviewCapturesScreen.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.getSelfiesToReview(), renderProps.getStyles(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderReviewCaptures$lambda$93(context, this, renderState);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderReviewCaptures$lambda$95(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderReviewCaptures$lambda$96(context, this);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderReviewCaptures$lambda$97(this.f$0, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$93(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final SelfieState.ReviewCaptures reviewCaptures) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderReviewCaptures$lambda$93$lambda$92(reviewCaptures, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$93$lambda$92(SelfieState.ReviewCaptures reviewCaptures, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.ReviewCaptures reviewCaptures2 = state instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) state : null;
        if (reviewCaptures2 == null) {
            return Unit.INSTANCE;
        }
        SelfieState.ReviewCaptures reviewCaptures3 = reviewCaptures2;
        action.setState(new SelfieState.Submit(reviewCaptures3.getSelfies$selfie_release(), reviewCaptures3.getWebRtcObjectId(), reviewCaptures3.getCameraProperties(), reviewCaptures3.getStartSelfieTimestamp(), SelfieWorkflowUtils.createBackState(action, true), reviewCaptures.getCameraFacingMode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$95(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ReviewCaptures reviewCaptures) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderReviewCaptures$lambda$95$lambda$94(input, reviewCaptures, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$95$lambda$94(Input input, SelfieState.ReviewCaptures reviewCaptures, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.WaitForCameraFeed(false, false, SelfieWorkflowUtils.createBackState(action, false), input.getOrderedPoses(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$96(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        SelfieWorkflowUtils.goBack(renderContext, selfieWorkflow.webRtcManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderReviewCaptures$lambda$97(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    private final Screen renderSubmit(Input renderProps, SelfieState.Submit renderState, final StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Workflows.runningWorker(context, this.submitVerificationWorker.create(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.getSelfies$selfie_release(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp()), Reflection.typeOf(SubmitVerificationWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.renderSubmit$lambda$100(this.f$0, context, (SubmitVerificationWorker.Response) obj);
            }
        });
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderSubmit$lambda$101(this.f$0, context);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.renderSubmit$lambda$102(this.f$0, context);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new Screen.SubmittingScreen(processingTitle, processingDescription, pendingPageTextVerticalPosition, styles, navigationState, function0, function02, recordPage != null ? recordPage.getLoadingPictograph() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderSubmit$lambda$100(final SelfieWorkflow selfieWorkflow, final StatefulWorkflow.RenderContext renderContext, final SubmitVerificationWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof SubmitVerificationWorker.Response.Success) {
            return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderSubmit$lambda$100$lambda$98(this.f$0, renderContext, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof SubmitVerificationWorker.Response.Error) {
            return StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda68
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.renderSubmit$lambda$100$lambda$99(this.f$0, renderContext, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSubmit$lambda$100$lambda$98(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Finished.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSubmit$lambda$100$lambda$99(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, SubmitVerificationWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.setOutputForWorkflow(renderContext, new Output.Error(((SubmitVerificationWorker.Response.Error) response).getCause()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSubmit$lambda$101(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSubmit$lambda$102(SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext) {
        selfieWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    private final <T extends SelfieState & SelfieState3> SelfieState.CaptureTransition nextState(WorkflowAction<? super Input, SelfieState, ?>.Updater updater, T t, Selfie selfie) {
        SelfieState selfieStateReviewStateIfNeeded;
        SelfieState2 selfieState2 = (SelfieState2) t;
        if (selfieState2.getPosesNeeded().size() > 1) {
            SelfieState2 selfieState22 = (SelfieState2) t;
            T t2 = t;
            selfieStateReviewStateIfNeeded = new SelfieState.ShowPoseHint(CollectionsKt.plus((Collection<? extends Selfie>) t.getSelfies$selfie_release(), selfie), CollectionsKt.drop(selfieState22.getPosesNeeded(), 1), selfieState22.getAutoCaptureSupported(), t2.getCameraProperties(), t2.getStartSelfieTimestamp(), t.getBackState(), updater.getProps().getPoseConfigs(), t.getCameraFacingMode(), selfieState22.getIsFlashEnabled());
        } else if (videoCaptureMethod(updater.getProps()) == VideoCaptureMethod.Upload) {
            T t3 = t;
            selfieStateReviewStateIfNeeded = new SelfieState.FinalizeLocalVideoCapture(CollectionsKt.plus((Collection<? extends Selfie>) t.getSelfies$selfie_release(), selfie), 3000L, false, false, t3.getCameraProperties(), t3.getStartSelfieTimestamp(), t.getBackState(), t.getCameraFacingMode(), 12, null);
        } else if (videoCaptureMethod(updater.getProps()) == VideoCaptureMethod.Stream) {
            T t4 = t;
            selfieStateReviewStateIfNeeded = new SelfieState.FinalizeWebRtc(CollectionsKt.plus((Collection<? extends Selfie>) t.getSelfies$selfie_release(), selfie), t4.getCameraProperties(), t4.getStartSelfieTimestamp(), t.getBackState(), t.getCameraFacingMode());
        } else {
            T t5 = t;
            selfieStateReviewStateIfNeeded = SelfieWorkflowUtils.reviewStateIfNeeded(updater, CollectionsKt.plus((Collection<? extends Selfie>) t.getSelfies$selfie_release(), selfie), null, t5.getCameraProperties(), t5.getStartSelfieTimestamp(), t.getBackState());
        }
        return new SelfieState.CaptureTransition(selfieStateReviewStateIfNeeded, selfieState2.getCurrentPose(), t.getBackState(), t.getCameraFacingMode(), ((SelfieState2) t).getIsFlashEnabled());
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", m3645f = "SelfieWorkflow.kt", m3646l = {1708}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1 */
    static final class C437441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, SelfieState, Output, Object>.RenderContext $context;
        final /* synthetic */ Ref.BooleanRef $stillChecking;
        int label;
        final /* synthetic */ SelfieWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437441(Ref.BooleanRef booleanRef, StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Continuation<? super C437441> continuation) {
            super(2, continuation);
            this.$stillChecking = booleanRef;
            this.$context = renderContext;
            this.this$0 = selfieWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437441(this.$stillChecking, this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$stillChecking.element) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Sink<WorkflowAction<? super Input, SelfieState, ? extends Output>> actionSink = this.$context.getActionSink();
                SelfieWorkflow selfieWorkflow = this.this$0;
                final Ref.BooleanRef booleanRef = this.$stillChecking;
                actionSink.send(StatefulWorkflow2.action$default(selfieWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SelfieWorkflow.C437441.invokeSuspend$lambda$0(booleanRef, (WorkflowAction.Updater) obj2);
                    }
                }, 1, null));
                if (this.$stillChecking.element) {
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Sink<WorkflowAction<? super Input, SelfieState, ? extends Output>> actionSink2 = this.$context.getActionSink();
                    SelfieWorkflow selfieWorkflow2 = this.this$0;
                    final Ref.BooleanRef booleanRef2 = this.$stillChecking;
                    actionSink2.send(StatefulWorkflow2.action$default(selfieWorkflow2, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SelfieWorkflow.C437441.invokeSuspend$lambda$0(booleanRef2, (WorkflowAction.Updater) obj2);
                        }
                    }, 1, null));
                    if (this.$stillChecking.element) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, WorkflowAction.Updater updater) {
            Parcelable parcelable = (SelfieState) updater.getState();
            if ((parcelable instanceof SelfieState3) && ((SelfieState3) parcelable).getManualCaptureEnabled()) {
                updater.setState(parcelable);
                booleanRef.element = false;
            }
            return Unit.INSTANCE;
        }
    }

    private final void runManualCaptureEnabledChecker(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        context.runningSideEffect("check_if_manual_capture_enabled", new C437441(booleanRef, context, this, null));
    }

    private final void setOutputForWorkflow(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext context, final Output output) {
        WebRtcManagerBridge webRtcManagerBridge;
        if (((output instanceof Output.Finished) || (output instanceof Output.Back) || (output instanceof Output.Error)) && (webRtcManagerBridge = this.webRtcManager) != null) {
            webRtcManagerBridge.closeWebRtcConnection();
        }
        context.getActionSink().send(StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.setOutputForWorkflow$lambda$103(output, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOutputForWorkflow$lambda$103(Output output, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(output);
        return Unit.INSTANCE;
    }

    private final void setErrorOutput(StatefulWorkflow<? super Input, SelfieState, ? extends Output, ? extends Object>.RenderContext renderContext, Throwable th) {
        String message;
        String message2 = th.getMessage();
        if (message2 != null && StringsKt.contains$default((CharSequence) message2, (CharSequence) "ENOSPC", false, 2, (Object) null)) {
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (th instanceof ImageCaptureException) {
            Throwable cause = th.getCause();
            if (cause != null && (message = cause.getMessage()) != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "ENOSPC", false, 2, (Object) null)) {
                setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
                return;
            }
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th.getClass().getCanonicalName())));
            return;
        }
        setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th.getClass().getCanonicalName())));
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(SelfieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001:\u0001aBï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b:\u00109R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b;\u0010+R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b<\u00109R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u00109R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bI\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\bJ\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\bK\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bL\u0010+R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bM\u0010+R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bN\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010^\u001a\u0004\b_\u0010`¨\u0006b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "orderedPoses", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "designVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionToken", "getInquiryId", "getFromComponent", "getFromStep", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getFieldKeySelfie", "getRequireStrictSelfieCapture", "getSkipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "getStrings", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "getSelfieType", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "Ljava/util/List;", "getOrderedPoses", "()Ljava/util/List;", "getCameraPermissionsTitle", "getCameraPermissionsRationale", "getCameraPermissionsModalPositiveButton", "getCameraPermissionsModalNegativeButton", "getMicrophonePermissionsTitle", "getMicrophonePermissionsRationale", "getMicrophonePermissionsModalPositiveButton", "getMicrophonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "getVideoCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "getDesignVersion", "()Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "Strings", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Input {
        private final NextStep.Selfie.AssetConfig assetConfig;
        private final boolean backStepEnabled;
        private final String cameraPermissionsModalNegativeButton;
        private final String cameraPermissionsModalPositiveButton;
        private final String cameraPermissionsRationale;
        private final String cameraPermissionsTitle;
        private final boolean cancelButtonEnabled;
        private final DesignVersion designVersion;
        private final String fieldKeySelfie;
        private final String fromComponent;
        private final String fromStep;
        private final String inquiryId;
        private final String microphonePermissionsModalNegativeButton;
        private final String microphonePermissionsModalPositiveButton;
        private final String microphonePermissionsRationale;
        private final String microphonePermissionsTitle;
        private final List<Selfie.Pose> orderedPoses;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final PoseConfigs poseConfigs;
        private final boolean requireStrictSelfieCapture;
        private final SelfieType selfieType;
        private final String sessionToken;
        private final boolean skipPromptPage;
        private final Strings strings;
        private final StepStyles.SelfieStepStyle styles;
        private final VideoCaptureConfig videoCaptureConfig;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.fromComponent, input.fromComponent) && Intrinsics.areEqual(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.areEqual(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.areEqual(this.strings, input.strings) && Intrinsics.areEqual(this.selfieType, input.selfieType) && Intrinsics.areEqual(this.orderedPoses, input.orderedPoses) && Intrinsics.areEqual(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.areEqual(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.areEqual(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.areEqual(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.areEqual(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.areEqual(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.areEqual(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.areEqual(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.areEqual(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.areEqual(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            String str = this.cameraPermissionsTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            return ((((((((((iHashCode9 + (selfieStepStyle != null ? selfieStepStyle.hashCode() : 0)) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode();
        }

        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input(String sessionToken, String inquiryId, String fromComponent, String fromStep, boolean z, boolean z2, String fieldKeySelfie, boolean z3, boolean z4, Strings strings, SelfieType selfieType, List<? extends Selfie.Pose> orderedPoses, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyles.SelfieStepStyle selfieStepStyle, VideoCaptureConfig videoCaptureConfig, NextStep.Selfie.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition, PoseConfigs poseConfigs, DesignVersion designVersion) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = orderedPoses;
            this.cameraPermissionsTitle = str;
            this.cameraPermissionsRationale = str2;
            this.cameraPermissionsModalPositiveButton = str3;
            this.cameraPermissionsModalNegativeButton = str4;
            this.microphonePermissionsTitle = str5;
            this.microphonePermissionsRationale = str6;
            this.microphonePermissionsModalPositiveButton = str7;
            this.microphonePermissionsModalNegativeButton = str8;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        public final String getFromStep() {
            return this.fromStep;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        public final Strings getStrings() {
            return this.strings;
        }

        public final SelfieType getSelfieType() {
            return this.selfieType;
        }

        public final List<Selfie.Pose> getOrderedPoses() {
            return this.orderedPoses;
        }

        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }

        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public final DesignVersion getDesignVersion() {
            return this.designVersion;
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b8\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b9\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b:\u0010$R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b;\u0010$R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b<\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b=\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b>\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b?\u0010$R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b@\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\bA\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\bB\u0010$R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\bC\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\bD\u0010$R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\bE\u0010$R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\bF\u0010$R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\bG\u0010$R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\bH\u0010$R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\bI\u0010$R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\bJ\u0010$¨\u0006K"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "", "", "title", "prompt", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "startButton", "capturePageTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "cameraLoadingTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getPrompt", "getDisclosure", "getStartButton", "getCapturePageTitle", "getSelfieHintTakePhoto", "getSelfieHintCenterFace", "getSelfieHintFaceTooClose", "getSelfieHintFaceTooFar", "getSelfieHintMultipleFaces", "getSelfieHintFaceIncomplete", "getSelfieHintPoseNotCentered", "getSelfieHintLookLeft", "getSelfieHintLookRight", "getSelfieHintHoldStill", "getProcessingTitle", "getProcessingDescription", "getSelfieCheckPageTitle", "getSelfieCheckPageDescription", "getSelfieCheckPageLabelFront", "getSelfieCheckPageLabelLeft", "getSelfieCheckPageLabelRight", "getSelfieCheckPageBtnSubmit", "getSelfieCheckPageBtnRetake", "getAutoCaptureOn", "getCaptureSuccess", "getSelfieHintCenterFaceDescription", "getSelfieHintLookLeftDescription", "getSelfieHintLookRightDescription", "getCameraLoadingTitle", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Strings {
            private final String autoCaptureOn;
            private final String cameraLoadingTitle;
            private final String capturePageTitle;
            private final String captureSuccess;
            private final String disclosure;
            private final String processingDescription;
            private final String processingTitle;
            private final String prompt;
            private final String selfieCheckPageBtnRetake;
            private final String selfieCheckPageBtnSubmit;
            private final String selfieCheckPageDescription;
            private final String selfieCheckPageLabelFront;
            private final String selfieCheckPageLabelLeft;
            private final String selfieCheckPageLabelRight;
            private final String selfieCheckPageTitle;
            private final String selfieHintCenterFace;
            private final String selfieHintCenterFaceDescription;
            private final String selfieHintFaceIncomplete;
            private final String selfieHintFaceTooClose;
            private final String selfieHintFaceTooFar;
            private final String selfieHintHoldStill;
            private final String selfieHintLookLeft;
            private final String selfieHintLookLeftDescription;
            private final String selfieHintLookRight;
            private final String selfieHintLookRightDescription;
            private final String selfieHintMultipleFaces;
            private final String selfieHintPoseNotCentered;
            private final String selfieHintTakePhoto;
            private final String startButton;
            private final String title;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.areEqual(this.title, strings.title) && Intrinsics.areEqual(this.prompt, strings.prompt) && Intrinsics.areEqual(this.disclosure, strings.disclosure) && Intrinsics.areEqual(this.startButton, strings.startButton) && Intrinsics.areEqual(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.areEqual(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.areEqual(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.areEqual(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.areEqual(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.areEqual(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.areEqual(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.areEqual(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.areEqual(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.areEqual(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.areEqual(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.areEqual(this.processingTitle, strings.processingTitle) && Intrinsics.areEqual(this.processingDescription, strings.processingDescription) && Intrinsics.areEqual(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.areEqual(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.areEqual(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.areEqual(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.areEqual(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.areEqual(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.areEqual(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.areEqual(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.areEqual(this.captureSuccess, strings.captureSuccess) && Intrinsics.areEqual(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.areEqual(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.areEqual(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.areEqual(this.cameraLoadingTitle, strings.cameraLoadingTitle);
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31) + this.selfieHintHoldStill.hashCode()) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str = this.selfieCheckPageTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.selfieCheckPageDescription;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.selfieCheckPageLabelFront;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.selfieCheckPageLabelLeft;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.selfieCheckPageLabelRight;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieCheckPageBtnSubmit;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.selfieCheckPageBtnRetake;
                int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.autoCaptureOn;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.captureSuccess;
                int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieHintCenterFaceDescription;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieHintLookLeftDescription;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieHintLookRightDescription;
                int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.cameraLoadingTitle;
                return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
            }

            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ", autoCaptureOn=" + this.autoCaptureOn + ", captureSuccess=" + this.captureSuccess + ", selfieHintCenterFaceDescription=" + this.selfieHintCenterFaceDescription + ", selfieHintLookLeftDescription=" + this.selfieHintLookLeftDescription + ", selfieHintLookRightDescription=" + this.selfieHintLookRightDescription + ", cameraLoadingTitle=" + this.cameraLoadingTitle + ")";
            }

            public Strings(String title, String prompt, String disclosure, String startButton, String capturePageTitle, String selfieHintTakePhoto, String selfieHintCenterFace, String selfieHintFaceTooClose, String selfieHintFaceTooFar, String selfieHintMultipleFaces, String selfieHintFaceIncomplete, String selfieHintPoseNotCentered, String selfieHintLookLeft, String selfieHintLookRight, String selfieHintHoldStill, String processingTitle, String processingDescription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(startButton, "startButton");
                Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
                Intrinsics.checkNotNullParameter(selfieHintTakePhoto, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(selfieHintCenterFace, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
                Intrinsics.checkNotNullParameter(selfieHintLookLeft, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(selfieHintLookRight, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(selfieHintHoldStill, "selfieHintHoldStill");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.startButton = startButton;
                this.capturePageTitle = capturePageTitle;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCentered = selfieHintPoseNotCentered;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.selfieCheckPageTitle = str;
                this.selfieCheckPageDescription = str2;
                this.selfieCheckPageLabelFront = str3;
                this.selfieCheckPageLabelLeft = str4;
                this.selfieCheckPageLabelRight = str5;
                this.selfieCheckPageBtnSubmit = str6;
                this.selfieCheckPageBtnRetake = str7;
                this.autoCaptureOn = str8;
                this.captureSuccess = str9;
                this.selfieHintCenterFaceDescription = str10;
                this.selfieHintLookLeftDescription = str11;
                this.selfieHintLookRightDescription = str12;
                this.cameraLoadingTitle = str13;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }

            public final String getStartButton() {
                return this.startButton;
            }

            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }

            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }

            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }

            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }
        }
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "", "<init>", "()V", "Canceled", "Finished", "Back", "Error", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Finished;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Canceled extends Output {
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            public int hashCode() {
                return 1455860573;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
                super(null);
            }
        }

        private Output() {
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Finished;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public boolean equals(Object other) {
                return this == other || (other instanceof Finished);
            }

            public int hashCode() {
                return 905373494;
            }

            public String toString() {
                return "Finished";
            }

            private Finished() {
                super(null);
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Back extends Output {
            public static final Back INSTANCE = new Back();

            public boolean equals(Object other) {
                return this == other || (other instanceof Back);
            }

            public int hashCode() {
                return 869674411;
            }

            public String toString() {
                return "Back";
            }

            private Back() {
                super(null);
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Output {
            private final InternalErrorInfo cause;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }
    }

    /* compiled from: SelfieWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "", "<init>", "()V", "InstructionsScreen", "RestartCameraScreen", "OldCameraScreen", "CameraScreen", "ReviewCapturesScreen", "SubmittingScreen", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$RestartCameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Screen {
        public /* synthetic */ Screen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Screen() {
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$InstructionsScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "title", "", "prompt", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "start", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "instructionAsset", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onClick", "Lkotlin/Function0;", "", "onBack", "onCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getDisclosure", "getStart", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getInstructionAsset", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnBack", "getOnCancel", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class InstructionsScreen extends Screen {
            private final String disclosure;
            private final RemoteImage instructionAsset;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final Function0<Unit> onClick;
            private final String prompt;
            private final String start;
            private final StepStyles.SelfieStepStyle styles;
            private final String title;

            public final String getTitle() {
                return this.title;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }

            public final String getStart() {
                return this.start;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOnClick() {
                return this.onClick;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstructionsScreen(String title, String prompt, String disclosure, String start, StepStyles.SelfieStepStyle selfieStepStyle, RemoteImage remoteImage, NavigationState navigationState, Function0<Unit> onClick, Function0<Unit> onBack, Function0<Unit> onCancel) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(start, "start");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.start = start;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.onClick = onClick;
                this.onBack = onBack;
                this.onCancel = onCancel;
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$RestartCameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "rendered", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getRendered", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class RestartCameraScreen extends Screen {
            private final Function0<Unit> rendered;

            public final Function0<Unit> getRendered() {
                return this.rendered;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RestartCameraScreen(Function0<Unit> rendered) {
                super(null);
                Intrinsics.checkNotNullParameter(rendered, "rendered");
                this.rendered = rendered;
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0003>?@B³\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001c\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010-R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "title", "", "message", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "assetOverrides", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;", "requireStrictSelfieCapture", "", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onBack", "Lkotlin/Function0;", "", "onCancel", "onCameraError", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onPermissionChanged", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;ZLcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getMode", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getAssetOverrides", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;", "getRequireStrictSelfieCapture", "()Z", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getOnCameraError", "()Lkotlin/jvm/functions/Function1;", "getOnPermissionChanged", "getVideoCaptureMethod", "()Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "getWebRtcManager", "()Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "getCameraXControllerFactory", "()Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "getCamera2ManagerFactoryFactory", "()Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "Mode", "Overlay", "AssetOverrides", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class OldCameraScreen extends Screen {
            private final AssetOverrides assetOverrides;
            private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
            private final CameraXController.Factory cameraXControllerFactory;
            private final boolean isAudioRequired;
            private final String message;
            private final Mode mode;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function1<Throwable, Unit> onCameraError;
            private final Function0<Unit> onCancel;
            private final Function0<Unit> onPermissionChanged;
            private final boolean requireStrictSelfieCapture;
            private final StepStyles.SelfieStepStyle styles;
            private final String title;
            private final VideoCaptureMethod videoCaptureMethod;
            private final WebRtcManagerBridge webRtcManager;

            public final String getTitle() {
                return this.title;
            }

            public final String getMessage() {
                return this.message;
            }

            public final Mode getMode() {
                return this.mode;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            public final Function1<Throwable, Unit> getOnCameraError() {
                return this.onCameraError;
            }

            public final Function0<Unit> getOnPermissionChanged() {
                return this.onPermissionChanged;
            }

            public final VideoCaptureMethod getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            public final WebRtcManagerBridge getWebRtcManager() {
                return this.webRtcManager;
            }

            /* renamed from: isAudioRequired, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            public final CameraXController.Factory getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            public final Camera2ManagerFactory.Factory getCamera2ManagerFactoryFactory() {
                return this.camera2ManagerFactoryFactory;
            }

            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "overlay", "PreviewUnavailable", "WaitingOnWebRtcSetup", "PlayPoseHint", "CountDownAndStartLocalRecordingIfNeeded", "Transition", "ManualCapture", "ManualCaptureWithCountDown", "AutoCapture", "FinalizeLocalVideoCapture", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDownAndStartLocalRecordingIfNeeded;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static abstract class Mode {
                public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract Overlay getOverlay();

                private Mode() {
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "previewReady", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getPreviewReady", "()Lkotlin/jvm/functions/Function1;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class PreviewUnavailable extends Mode {
                    private final Overlay overlay;
                    private final Function1<CameraProperties, Unit> previewReady;
                    private final boolean showProgress;

                    public final Function1<CameraProperties, Unit> getPreviewReady() {
                        return this.previewReady;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public PreviewUnavailable(Function1<? super CameraProperties, Unit> previewReady, Overlay overlay, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.previewReady = previewReady;
                        this.overlay = overlay;
                        this.showProgress = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;JZ)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "J", "getMaxRecordingLengthMs", "()J", "Z", "getShowProgress", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class WaitingOnWebRtcSetup extends Mode {
                    private final long maxRecordingLengthMs;
                    private final Overlay overlay;
                    private final boolean showProgress;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public WaitingOnWebRtcSetup(Overlay overlay, long j, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j;
                        this.showProgress = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "poseHintComplete", "Lkotlin/Function0;", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getPoseHintComplete", "()Lkotlin/jvm/functions/Function0;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class PlayPoseHint extends Mode {
                    private final Overlay overlay;
                    private final Function0<Unit> poseHintComplete;
                    private final boolean showProgress;

                    public final Function0<Unit> getPoseHintComplete() {
                        return this.poseHintComplete;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public PlayPoseHint(Function0<Unit> poseHintComplete, Overlay overlay, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDownAndStartLocalRecordingIfNeeded;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "countDown", "", "recordLocalVideo", "", "maxRecordingLengthMs", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "onError", "Lkotlin/Function1;", "", "", "<init>", "(IZJLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;ZLkotlin/jvm/functions/Function1;)V", "getCountDown", "()I", "getRecordLocalVideo", "()Z", "getMaxRecordingLengthMs", "()J", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class CountDownAndStartLocalRecordingIfNeeded extends Mode {
                    private final int countDown;
                    private final long maxRecordingLengthMs;
                    private final Function1<Throwable, Unit> onError;
                    private final Overlay overlay;
                    private final boolean recordLocalVideo;
                    private final boolean showProgress;

                    public final int getCountDown() {
                        return this.countDown;
                    }

                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    public final Function1<Throwable, Unit> getOnError() {
                        return this.onError;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public CountDownAndStartLocalRecordingIfNeeded(int i, boolean z, long j, Overlay overlay, boolean z2, Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.countDown = i;
                        this.recordLocalVideo = z;
                        this.maxRecordingLengthMs = j;
                        this.overlay = overlay;
                        this.showProgress = z2;
                        this.onError = onError;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "onComplete", "Lkotlin/Function0;", "", "imageCaptured", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "getImageCaptured", "()Z", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Transition extends Mode {
                    private final boolean imageCaptured;
                    private final Function0<Unit> onComplete;
                    private final Overlay overlay;
                    private final boolean showProgress;

                    public final Function0<Unit> getOnComplete() {
                        return this.onComplete;
                    }

                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Transition(Function0<Unit> onComplete, boolean z, Overlay overlay, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z;
                        this.overlay = overlay;
                        this.showProgress = z2;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "processImage", "Lkotlin/Function1;", "", "", "onError", "", "forceCapture", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getProcessImage", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getForceCapture", "()Z", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class ManualCapture extends Mode {
                    private final boolean forceCapture;
                    private final Function1<Throwable, Unit> onError;
                    private final Overlay overlay;
                    private final Function1<String, Unit> processImage;
                    private final boolean showProgress;

                    public /* synthetic */ ManualCapture(Function1 function1, Function1 function12, boolean z, Overlay overlay, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function12, (i & 4) != 0 ? false : z, overlay, z2);
                    }

                    public final Function1<String, Unit> getProcessImage() {
                        return this.processImage;
                    }

                    public final Function1<Throwable, Unit> getOnError() {
                        return this.onError;
                    }

                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public ManualCapture(Function1<? super String, Unit> processImage, Function1<? super Throwable, Unit> onError, boolean z, Overlay overlay, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z;
                        this.overlay = overlay;
                        this.showProgress = z2;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "onCaptureClicked", "Lkotlin/Function0;", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getOnCaptureClicked", "()Lkotlin/jvm/functions/Function0;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class ManualCaptureWithCountDown extends Mode {
                    private final Function0<Unit> onCaptureClicked;
                    private final Overlay overlay;
                    private final boolean showProgress;

                    public final Function0<Unit> getOnCaptureClicked() {
                        return this.onCaptureClicked;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ManualCaptureWithCountDown(Function0<Unit> onCaptureClicked, Overlay overlay, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class AutoCapture extends Mode {
                    private final Overlay overlay;
                    private final boolean showProgress;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AutoCapture(Overlay overlay, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "finalizeVideo", "Lkotlin/Function1;", "Ljava/io/File;", "", "onAnimationComplete", "Lkotlin/Function0;", "startFinalize", "", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;Z)V", "getFinalizeVideo", "()Lkotlin/jvm/functions/Function1;", "getOnAnimationComplete", "()Lkotlin/jvm/functions/Function0;", "getStartFinalize", "()Z", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "getShowProgress", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class FinalizeLocalVideoCapture extends Mode {
                    private final Function1<File, Unit> finalizeVideo;
                    private final Function0<Unit> onAnimationComplete;
                    private final Overlay overlay;
                    private final boolean showProgress;
                    private final boolean startFinalize;

                    public final Function1<File, Unit> getFinalizeVideo() {
                        return this.finalizeVideo;
                    }

                    public final Function0<Unit> getOnAnimationComplete() {
                        return this.onAnimationComplete;
                    }

                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.OldCameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public FinalizeLocalVideoCapture(Function1<? super File, Unit> finalizeVideo, Function0<Unit> onAnimationComplete, boolean z, Overlay overlay, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z;
                        this.overlay = overlay;
                        this.showProgress = z2;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OldCameraScreen(String str, String str2, Mode mode, StepStyles.SelfieStepStyle selfieStepStyle, AssetOverrides assetOverrides, boolean z, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, Function1<? super Throwable, Unit> onCameraError, Function0<Unit> onPermissionChanged, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z2, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
                this.title = str;
                this.message = str2;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = webRtcManagerBridge;
                this.isAudioRequired = z2;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "CENTER_COMPLETE", "LOOK_LEFT_HINT", "LOOK_LEFT", "LOOK_LEFT_COMPLETE", "LOOK_RIGHT_HINT", "LOOK_RIGHT", "LOOK_RIGHT_COMPLETE", "FINALIZING", "COMPLETE_WITH_CAPTURE", "COMPLETE", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Overlay {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Overlay[] $VALUES;
                public static final Overlay CLEAR = new Overlay("CLEAR", 0);
                public static final Overlay CENTER = new Overlay("CENTER", 1);
                public static final Overlay CENTER_COMPLETE = new Overlay("CENTER_COMPLETE", 2);
                public static final Overlay LOOK_LEFT_HINT = new Overlay("LOOK_LEFT_HINT", 3);
                public static final Overlay LOOK_LEFT = new Overlay("LOOK_LEFT", 4);
                public static final Overlay LOOK_LEFT_COMPLETE = new Overlay("LOOK_LEFT_COMPLETE", 5);
                public static final Overlay LOOK_RIGHT_HINT = new Overlay("LOOK_RIGHT_HINT", 6);
                public static final Overlay LOOK_RIGHT = new Overlay("LOOK_RIGHT", 7);
                public static final Overlay LOOK_RIGHT_COMPLETE = new Overlay("LOOK_RIGHT_COMPLETE", 8);
                public static final Overlay FINALIZING = new Overlay("FINALIZING", 9);
                public static final Overlay COMPLETE_WITH_CAPTURE = new Overlay("COMPLETE_WITH_CAPTURE", 10);
                public static final Overlay COMPLETE = new Overlay("COMPLETE", 11);

                private static final /* synthetic */ Overlay[] $values() {
                    return new Overlay[]{CLEAR, CENTER, CENTER_COMPLETE, LOOK_LEFT_HINT, LOOK_LEFT, LOOK_LEFT_COMPLETE, LOOK_RIGHT_HINT, LOOK_RIGHT, LOOK_RIGHT_COMPLETE, FINALIZING, COMPLETE_WITH_CAPTURE, COMPLETE};
                }

                public static EnumEntries<Overlay> getEntries() {
                    return $ENTRIES;
                }

                private Overlay(String str, int i) {
                }

                static {
                    Overlay[] overlayArr$values = $values();
                    $VALUES = overlayArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(overlayArr$values);
                }

                public static Overlay valueOf(String str) {
                    return (Overlay) Enum.valueOf(Overlay.class, str);
                }

                public static Overlay[] values() {
                    return (Overlay[]) $VALUES.clone();
                }
            }

            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getRightPoseImage", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class AssetOverrides {
                private final RemoteImage leftPoseImage;
                private final RemoteImage rightPoseImage;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return Intrinsics.areEqual(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.areEqual(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }

                public AssetOverrides(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b.\u0018\u00002\u00020\u0001:\u0002[\\B¿\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0017j\u0002`\u0019\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0010&\u001a\u00020'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0017\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b1\u00102R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010:R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR!\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0017j\u0002`\u0019¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010:R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\b\n\u0000\u001a\u0004\bP\u0010FR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010*\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010+\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010:R\u0011\u0010,\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010:R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\b\n\u0000\u001a\u0004\bW\u0010FR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u00100\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010:¨\u0006]"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "title", "", "message", "description", "autoCaptureText", "captureSuccessText", "realTimeHint", "isAutoCaptureOn", "", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "requireStrictSelfieCapture", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onBack", "Lkotlin/Function0;", "", "onCancel", "onCameraError", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onPermissionChanged", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "onCameraFacingModeSelected", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "poseScore", "", "brightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "facingMode", "isFlashEnabled", "isFlashOn", "onFlashSet", "pose", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "requestingPermissions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;ZLcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lkotlin/jvm/functions/Function1;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;ZZLkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;Z)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDescription", "getAutoCaptureText", "getCaptureSuccessText", "getRealTimeHint", "()Z", "getMode", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getRequireStrictSelfieCapture", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getOnCameraError", "()Lkotlin/jvm/functions/Function1;", "getOnPermissionChanged", "getVideoCaptureMethod", "()Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "getWebRtcManager", "()Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "getCameraXControllerFactory", "()Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "getCamera2ManagerFactoryFactory", "()Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "getOnCameraFacingModeSelected", "getPoseScore", "()F", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "getFacingMode", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getOnFlashSet", "getPose", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "getRequestingPermissions", "Mode", "Overlay", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class CameraScreen extends Screen {
            private final String autoCaptureText;
            private final SelfieBrightnessInfo brightnessInfo;
            private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
            private final CameraXController.Factory cameraXControllerFactory;
            private final String captureSuccessText;
            private final String description;
            private final CameraProperties.FacingMode facingMode;
            private final boolean isAudioRequired;
            private final boolean isAutoCaptureOn;
            private final boolean isFlashEnabled;
            private final boolean isFlashOn;
            private final String message;
            private final Mode mode;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function1<Throwable, Unit> onCameraError;
            private final Function1<CameraProperties.FacingMode, Unit> onCameraFacingModeSelected;
            private final Function0<Unit> onCancel;
            private final Function1<Boolean, Unit> onFlashSet;
            private final Function0<Unit> onPermissionChanged;
            private final Selfie.Pose pose;
            private final float poseScore;
            private final String realTimeHint;
            private final boolean requestingPermissions;
            private final boolean requireStrictSelfieCapture;
            private final StepStyles.SelfieStepStyle styles;
            private final String title;
            private final VideoCaptureMethod videoCaptureMethod;
            private final WebRtcManagerBridge webRtcManager;

            public final String getTitle() {
                return this.title;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getAutoCaptureText() {
                return this.autoCaptureText;
            }

            public final String getCaptureSuccessText() {
                return this.captureSuccessText;
            }

            public final String getRealTimeHint() {
                return this.realTimeHint;
            }

            /* renamed from: isAutoCaptureOn, reason: from getter */
            public final boolean getIsAutoCaptureOn() {
                return this.isAutoCaptureOn;
            }

            public final Mode getMode() {
                return this.mode;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            public final Function1<Throwable, Unit> getOnCameraError() {
                return this.onCameraError;
            }

            public final Function0<Unit> getOnPermissionChanged() {
                return this.onPermissionChanged;
            }

            public final VideoCaptureMethod getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            public final WebRtcManagerBridge getWebRtcManager() {
                return this.webRtcManager;
            }

            /* renamed from: isAudioRequired, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            public final CameraXController.Factory getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            public final Camera2ManagerFactory.Factory getCamera2ManagerFactoryFactory() {
                return this.camera2ManagerFactoryFactory;
            }

            public final Function1<CameraProperties.FacingMode, Unit> getOnCameraFacingModeSelected() {
                return this.onCameraFacingModeSelected;
            }

            public final float getPoseScore() {
                return this.poseScore;
            }

            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            public final CameraProperties.FacingMode getFacingMode() {
                return this.facingMode;
            }

            /* renamed from: isFlashEnabled, reason: from getter */
            public final boolean getIsFlashEnabled() {
                return this.isFlashEnabled;
            }

            /* renamed from: isFlashOn, reason: from getter */
            public final boolean getIsFlashOn() {
                return this.isFlashOn;
            }

            public final Function1<Boolean, Unit> getOnFlashSet() {
                return this.onFlashSet;
            }

            public final Selfie.Pose getPose() {
                return this.pose;
            }

            public final boolean getRequestingPermissions() {
                return this.requestingPermissions;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public CameraScreen(String str, String str2, String str3, String str4, String str5, String str6, boolean z, Mode mode, StepStyles.SelfieStepStyle selfieStepStyle, boolean z2, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, Function1<? super Throwable, Unit> onCameraError, Function0<Unit> onPermissionChanged, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z3, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, Function1<? super CameraProperties.FacingMode, Unit> onCameraFacingModeSelected, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, Function1<? super Boolean, Unit> onFlashSet, Selfie.Pose pose, boolean z6) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
                Intrinsics.checkNotNullParameter(onCameraFacingModeSelected, "onCameraFacingModeSelected");
                Intrinsics.checkNotNullParameter(facingMode, "facingMode");
                Intrinsics.checkNotNullParameter(onFlashSet, "onFlashSet");
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.realTimeHint = str6;
                this.isAutoCaptureOn = z;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z2;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = webRtcManagerBridge;
                this.isAudioRequired = z3;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
                this.onCameraFacingModeSelected = onCameraFacingModeSelected;
                this.poseScore = f;
                this.brightnessInfo = selfieBrightnessInfo;
                this.facingMode = facingMode;
                this.isFlashEnabled = z4;
                this.isFlashOn = z5;
                this.onFlashSet = onFlashSet;
                this.pose = pose;
                this.requestingPermissions = z6;
            }

            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "", "<init>", "()V", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "PreviewUnavailable", "WaitingOnWebRtcSetup", "PlayPoseHint", "CountDownAndStartLocalRecordingIfNeeded", "Transition", "ManualCapture", "ManualCaptureWithCountDown", "AutoCapture", "FinalizeLocalVideoCapture", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$AutoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$CountDownAndStartLocalRecordingIfNeeded;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$Transition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static abstract class Mode {
                public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract Overlay getOverlay();

                private Mode() {
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "previewReady", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function1;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getPreviewReady", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class PreviewUnavailable extends Mode {
                    private final Overlay overlay;
                    private final Function1<CameraProperties, Unit> previewReady;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function1<CameraProperties, Unit> getPreviewReady() {
                        return this.previewReady;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public PreviewUnavailable(Overlay overlay, Function1<? super CameraProperties, Unit> previewReady) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        this.overlay = overlay;
                        this.previewReady = previewReady;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "maxRecordingLengthMs", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;J)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getMaxRecordingLengthMs", "()J", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class WaitingOnWebRtcSetup extends Mode {
                    private final long maxRecordingLengthMs;
                    private final Overlay overlay;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public WaitingOnWebRtcSetup(Overlay overlay, long j) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "poseHintComplete", "Lkotlin/Function0;", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function0;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getPoseHintComplete", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class PlayPoseHint extends Mode {
                    private final Overlay overlay;
                    private final Function0<Unit> poseHintComplete;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function0<Unit> getPoseHintComplete() {
                        return this.poseHintComplete;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public PlayPoseHint(Overlay overlay, Function0<Unit> poseHintComplete) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        this.overlay = overlay;
                        this.poseHintComplete = poseHintComplete;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$CountDownAndStartLocalRecordingIfNeeded;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "countDown", "", "recordLocalVideo", "", "maxRecordingLengthMs", "", "onError", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;IZJLkotlin/jvm/functions/Function1;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getCountDown", "()I", "getRecordLocalVideo", "()Z", "getMaxRecordingLengthMs", "()J", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class CountDownAndStartLocalRecordingIfNeeded extends Mode {
                    private final int countDown;
                    private final long maxRecordingLengthMs;
                    private final Function1<Throwable, Unit> onError;
                    private final Overlay overlay;
                    private final boolean recordLocalVideo;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final int getCountDown() {
                        return this.countDown;
                    }

                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    public final Function1<Throwable, Unit> getOnError() {
                        return this.onError;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public CountDownAndStartLocalRecordingIfNeeded(Overlay overlay, int i, boolean z, long j, Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.countDown = i;
                        this.recordLocalVideo = z;
                        this.maxRecordingLengthMs = j;
                        this.onError = onError;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$Transition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "onComplete", "Lkotlin/Function0;", "", "imageCaptured", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function0;Z)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "getImageCaptured", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Transition extends Mode {
                    private final boolean imageCaptured;
                    private final Function0<Unit> onComplete;
                    private final Overlay overlay;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function0<Unit> getOnComplete() {
                        return this.onComplete;
                    }

                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Transition(Overlay overlay, Function0<Unit> onComplete, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        this.overlay = overlay;
                        this.onComplete = onComplete;
                        this.imageCaptured = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "processImage", "Lkotlin/Function1;", "", "", "onError", "", "forceCapture", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getProcessImage", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getForceCapture", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class ManualCapture extends Mode {
                    private final boolean forceCapture;
                    private final Function1<Throwable, Unit> onError;
                    private final Overlay overlay;
                    private final Function1<String, Unit> processImage;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function1<String, Unit> getProcessImage() {
                        return this.processImage;
                    }

                    public final Function1<Throwable, Unit> getOnError() {
                        return this.onError;
                    }

                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public ManualCapture(Overlay overlay, Function1<? super String, Unit> processImage, Function1<? super Throwable, Unit> onError, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "onCaptureClicked", "Lkotlin/Function0;", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function0;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getOnCaptureClicked", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class ManualCaptureWithCountDown extends Mode {
                    private final Function0<Unit> onCaptureClicked;
                    private final Overlay overlay;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function0<Unit> getOnCaptureClicked() {
                        return this.onCaptureClicked;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ManualCaptureWithCountDown(Overlay overlay, Function0<Unit> onCaptureClicked) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        this.overlay = overlay;
                        this.onCaptureClicked = onCaptureClicked;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$AutoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class AutoCapture extends Mode {
                    private final Overlay overlay;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AutoCapture(Overlay overlay) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                    }
                }

                /* compiled from: SelfieWorkflow.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "overlay", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "finalizeVideo", "Lkotlin/Function1;", "Ljava/io/File;", "", "onAnimationComplete", "Lkotlin/Function0;", "startFinalize", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "getFinalizeVideo", "()Lkotlin/jvm/functions/Function1;", "getOnAnimationComplete", "()Lkotlin/jvm/functions/Function0;", "getStartFinalize", "()Z", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class FinalizeLocalVideoCapture extends Mode {
                    private final Function1<File, Unit> finalizeVideo;
                    private final Function0<Unit> onAnimationComplete;
                    private final Overlay overlay;
                    private final boolean startFinalize;

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Screen.CameraScreen.Mode
                    public Overlay getOverlay() {
                        return this.overlay;
                    }

                    public final Function1<File, Unit> getFinalizeVideo() {
                        return this.finalizeVideo;
                    }

                    public final Function0<Unit> getOnAnimationComplete() {
                        return this.onAnimationComplete;
                    }

                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public FinalizeLocalVideoCapture(Overlay overlay, Function1<? super File, Unit> finalizeVideo, Function0<Unit> onAnimationComplete, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        this.overlay = overlay;
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z;
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "LOOK_LEFT", "LOOK_RIGHT", "FINALIZING", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Overlay {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Overlay[] $VALUES;
                public static final Overlay CLEAR = new Overlay("CLEAR", 0);
                public static final Overlay CENTER = new Overlay("CENTER", 1);
                public static final Overlay LOOK_LEFT = new Overlay("LOOK_LEFT", 2);
                public static final Overlay LOOK_RIGHT = new Overlay("LOOK_RIGHT", 3);
                public static final Overlay FINALIZING = new Overlay("FINALIZING", 4);

                private static final /* synthetic */ Overlay[] $values() {
                    return new Overlay[]{CLEAR, CENTER, LOOK_LEFT, LOOK_RIGHT, FINALIZING};
                }

                public static EnumEntries<Overlay> getEntries() {
                    return $ENTRIES;
                }

                private Overlay(String str, int i) {
                }

                static {
                    Overlay[] overlayArr$values = $values();
                    $VALUES = overlayArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(overlayArr$values);
                }

                public static Overlay valueOf(String str) {
                    return (Overlay) Enum.valueOf(Overlay.class, str);
                }

                public static Overlay[] values() {
                    return (Overlay[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001 Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen$Strings;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onUsePhotos", "Lkotlin/Function0;", "", "onRetakePhotos", "onBack", "onCancel", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen$Strings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getStrings", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen$Strings;", "getSelfies", "()Ljava/util/List;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnUsePhotos", "()Lkotlin/jvm/functions/Function0;", "getOnRetakePhotos", "getOnBack", "getOnCancel", "Strings", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class ReviewCapturesScreen extends Screen {
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final Function0<Unit> onRetakePhotos;
            private final Function0<Unit> onUsePhotos;
            private final List<Selfie> selfies;
            private final Strings strings;
            private final StepStyles.SelfieStepStyle styles;

            public final Strings getStrings() {
                return this.strings;
            }

            public final List<Selfie> getSelfies() {
                return this.selfies;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOnUsePhotos() {
                return this.onUsePhotos;
            }

            public final Function0<Unit> getOnRetakePhotos() {
                return this.onRetakePhotos;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesScreen(Strings strings, List<? extends Selfie> selfies, StepStyles.SelfieStepStyle selfieStepStyle, NavigationState navigationState, Function0<Unit> onUsePhotos, Function0<Unit> onRetakePhotos, Function0<Unit> onBack, Function0<Unit> onCancel) {
                super(null);
                Intrinsics.checkNotNullParameter(strings, "strings");
                Intrinsics.checkNotNullParameter(selfies, "selfies");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onUsePhotos, "onUsePhotos");
                Intrinsics.checkNotNullParameter(onRetakePhotos, "onRetakePhotos");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.strings = strings;
                this.selfies = selfies;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = onUsePhotos;
                this.onRetakePhotos = onRetakePhotos;
                this.onBack = onBack;
                this.onCancel = onCancel;
            }

            /* compiled from: SelfieWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$ReviewCapturesScreen$Strings;", "", "", "title", "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getSelfieLabelFront", "getSelfieLabelLeft", "getSelfieLabelRight", "getSubmitButton", "getRetakeButton", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class Strings {
                private final String description;
                private final String retakeButton;
                private final String selfieLabelFront;
                private final String selfieLabelLeft;
                private final String selfieLabelRight;
                private final String submitButton;
                private final String title;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return Intrinsics.areEqual(this.title, strings.title) && Intrinsics.areEqual(this.description, strings.description) && Intrinsics.areEqual(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.areEqual(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.areEqual(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.areEqual(this.submitButton, strings.submitButton) && Intrinsics.areEqual(this.retakeButton, strings.retakeButton);
                }

                public int hashCode() {
                    return (((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }

                public Strings(String title, String description, String selfieLabelFront, String selfieLabelLeft, String selfieLabelRight, String submitButton, String retakeButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(selfieLabelFront, "selfieLabelFront");
                    Intrinsics.checkNotNullParameter(selfieLabelLeft, "selfieLabelLeft");
                    Intrinsics.checkNotNullParameter(selfieLabelRight, "selfieLabelRight");
                    Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                    Intrinsics.checkNotNullParameter(retakeButton, "retakeButton");
                    this.title = title;
                    this.description = description;
                    this.selfieLabelFront = selfieLabelFront;
                    this.selfieLabelLeft = selfieLabelLeft;
                    this.selfieLabelRight = selfieLabelRight;
                    this.submitButton = submitButton;
                    this.retakeButton = retakeButton;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getDescription() {
                    return this.description;
                }

                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                public final String getSubmitButton() {
                    return this.submitButton;
                }

                public final String getRetakeButton() {
                    return this.retakeButton;
                }
            }
        }

        /* compiled from: SelfieWorkflow.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "title", "", "description", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onBack", "Lkotlin/Function0;", "", "onCancel", "customLoadingAsset", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getCustomLoadingAsset", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class SubmittingScreen extends Screen {
            private final RemoteImage customLoadingAsset;
            private final String description;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StepStyles.SelfieStepStyle styles;
            private final String title;

            public final String getTitle() {
                return this.title;
            }

            public final String getDescription() {
                return this.description;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmittingScreen(String title, String description, PendingPageTextPosition pendingPageTextVerticalPosition, StepStyles.SelfieStepStyle selfieStepStyle, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, RemoteImage remoteImage) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.title = title;
                this.description = description;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.customLoadingAsset = remoteImage;
            }
        }
    }

    private final String toHintMessage(SelfieError selfieError, Input.Strings strings, Selfie.Pose pose) {
        switch (WhenMappings.$EnumSwitchMapping$2[selfieError.ordinal()]) {
            case 1:
                return strings.getSelfieHintCenterFace();
            case 2:
                return strings.getSelfieHintFaceTooClose();
            case 3:
                return strings.getSelfieHintFaceTooFar();
            case 4:
                return strings.getSelfieHintMultipleFaces();
            case 5:
                return strings.getSelfieHintFaceIncomplete();
            case 6:
                return strings.getSelfieHintCenterFace();
            case 7:
                int i = WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
                if (i == 1 || i == 2) {
                    return null;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return strings.getSelfieHintPoseNotCentered();
            case 8:
                return strings.getSelfieHintCenterFace();
            case 9:
                return strings.getSelfieHintCenterFace();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InquiryPage4 toSelfiePage(SelfieState selfieState) {
        if (selfieState instanceof SelfieState.ShowInstructions) {
            return InquiryPage4.Prompt.INSTANCE;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            Selfie.Pose currentPoseOrNull = ((SelfieState.ShowPoseHint) selfieState).getCurrentPoseOrNull();
            return new InquiryPage4.LeadInAnimation(currentPoseOrNull != null ? Selfie2.getPathName(currentPoseOrNull) : null);
        }
        if (selfieState instanceof SelfieState.RestartCamera) {
            return InquiryPage4.Prompt.INSTANCE;
        }
        if (selfieState instanceof SelfieState2) {
            Selfie.Pose currentPoseOrNull2 = ((SelfieState2) selfieState).getCurrentPoseOrNull();
            return new InquiryPage4.TakePhoto(currentPoseOrNull2 != null ? Selfie2.getPathName(currentPoseOrNull2) : null);
        }
        if (selfieState instanceof SelfieState.CaptureTransition) {
            return toSelfiePage(((SelfieState.CaptureTransition) selfieState).getNextState());
        }
        if ((selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished)) {
            return InquiryPage4.FinalizeVideo.INSTANCE;
        }
        if (selfieState instanceof SelfieState.ReviewCaptures) {
            return InquiryPage4.CheckUpload.INSTANCE;
        }
        if (!(selfieState instanceof SelfieState.Submit)) {
            throw new NoWhenBranchMatchedException();
        }
        return InquiryPage4.Pending.INSTANCE;
    }
}
