package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.os.Parcel;
import coil.ImageLoader;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.Named;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.squareup.workflow1.p415ui.modal.AlertContainerScreen;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureHelper;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage3;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: GovernmentIdWorkflow.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002`aBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%J;\u0010(\u001a\u00020'2\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020'2\u001c\u0010,\u001a\u00180*R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040+H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020/*\u00020\u00052\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504*\u00020\u00052\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\u000207*\u00020\u0003H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u0004\u0018\u000102*\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010;J-\u0010A\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bC\u0010BJ-\u0010D\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bD\u0010BJ\u001b\u0010E\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bG\u0010FJ!\u0010K\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJC\u0010M\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bM\u0010%J\u0017\u0010O\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0003H\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010ZR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcoil/ImageLoader;", "imageLoader", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Factory;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker;", "documentSelectWorker", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/LocalVideoCaptureRenderer;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcRenderer;", "webRtcRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/capture/CaptureRenderer;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Factory;", "autoClassifyWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationRenderer;", "autoClassificationRenderer", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "cameraStatsManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lcoil/ImageLoader;Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Factory;Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/LocalVideoCaptureRenderer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcRenderer;Lcom/withpersona/sdk2/inquiry/governmentid/capture/CaptureRenderer;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Factory;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationRenderer;Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;)V", "renderProps", "renderState", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "context", "renderScreen", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "output", "", "setOutputForWorkflow", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;)V", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "updater", "setWebRtcMisconfiguredOutput", "(Lcom/squareup/workflow1/WorkflowAction$Updater;)V", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "wrapScreenWithTransition", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "", "name", "Lcom/squareup/workflow1/ui/Named;", "named", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/squareup/workflow1/ui/Named;", "", "useCamera", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z", "getScreenName", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "selectedId", "countryCode", "getChooseCaptureMethodTitle", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getChooseCaptureMethodBody", "getConfirmCaptureTitle", "getReviewSelectedImageTitle", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Ljava/lang/String;", "getReviewSelectedImageBody", "props", "Lcom/squareup/workflow1/Snapshot;", "snapshot", "initialState", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/squareup/workflow1/Snapshot;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "render", "state", "snapshotState", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/squareup/workflow1/Snapshot;", "Landroid/content/Context;", "Lcoil/ImageLoader;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/SubmitVerificationWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/LocalVideoCaptureRenderer;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcRenderer;", "Lcom/withpersona/sdk2/inquiry/governmentid/capture/CaptureRenderer;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationRenderer;", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "Input", "Output", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GovernmentIdWorkflow extends StatefulWorkflow<Input, GovernmentIdState, Output, Object> {
    private final Context applicationContext;
    private final AutoClassificationRenderer autoClassificationRenderer;
    private final AutoClassifyWorker.Factory autoClassifyWorkerFactory;
    private final CameraStatsManager cameraStatsManager;
    private final CaptureRenderer captureRenderer;
    private final DocumentSelectWorker documentSelectWorker;
    private final ExternalEventLogger externalEventLogger;
    private final ImageLoader imageLoader;
    private final LocalVideoCaptureRenderer localVideoCaptureRenderer;
    private final NavigationStateManager navigationStateManager;
    private final SubmitVerificationWorker.Factory submitVerificationWorkerFactory;
    private final VideoCaptureHelper videoCaptureHelper;
    private final WebRtcRenderer webRtcRenderer;

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdConfig.Side.values().length];
            try {
                iArr[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.Side.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.Side.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.Side.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.Side.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.os.Parcelable, java.lang.Object] */
    @Override // com.squareup.workflow1.StatefulWorkflow
    public GovernmentIdState initialState(Input props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        GovernmentIdState governmentIdState = null;
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                ?? parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                governmentIdState = parcelable;
            }
            governmentIdState = governmentIdState;
        }
        if (governmentIdState != null) {
            return governmentIdState;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.isVideoCapture(props)) {
            if (props.getHasMultipleCaptureOptions()) {
                return new GovernmentIdState.ChooseCaptureMethod(new IdConfig2.SideIdPart(IdConfig.Side.Front), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, null);
            }
            return new GovernmentIdState.WaitForAutocapture(new IdConfig2.SideIdPart(IdConfig.Side.Front), CollectionsKt.emptyList(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled, CollectionsKt.emptyList(), 0, null, WebRtcState.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, null, 28160, null);
        }
        return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    public GovernmentIdWorkflow(Context applicationContext, ImageLoader imageLoader, SubmitVerificationWorker.Factory submitVerificationWorkerFactory, DocumentSelectWorker documentSelectWorker, LocalVideoCaptureRenderer localVideoCaptureRenderer, WebRtcRenderer webRtcRenderer, CaptureRenderer captureRenderer, AutoClassifyWorker.Factory autoClassifyWorkerFactory, AutoClassificationRenderer autoClassificationRenderer, CameraStatsManager cameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSelectWorker, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(webRtcRenderer, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(captureRenderer, "captureRenderer");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(autoClassificationRenderer, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.videoCaptureHelper = new VideoCaptureHelper(null, 1, null);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Object render(Input renderProps, GovernmentIdState renderState, StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object objRenderScreen = renderScreen(renderProps, renderState, context);
        String screenName = getScreenName(renderState);
        if (screenName != null) {
            objRenderScreen = named(objRenderScreen, screenName);
        }
        if (!useCamera(renderState)) {
            context.runningSideEffect("close_camera", new C435912(null));
        }
        if (!this.videoCaptureHelper.webRtcConfigIsValid(renderProps) && ContextUtils3.isDebugBuild(this.applicationContext)) {
            context.runningSideEffect("output_webrtc_error", new C435923(context, this, null));
        }
        return wrapScreenWithTransition(objRenderScreen, renderState);
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", m3645f = "GovernmentIdWorkflow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2 */
    static final class C435912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435912(Continuation<? super C435912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GovernmentIdWorkflow.this.new C435912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CameraHelper cameraHelper = CameraHelper.INSTANCE;
                Context context = GovernmentIdWorkflow.this.applicationContext;
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
            GovernmentIdWorkflow.this.videoCaptureHelper.closeWebRtcConnection();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", m3645f = "GovernmentIdWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3 */
    static final class C435923 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, GovernmentIdState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ GovernmentIdWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C435923(StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, Continuation<? super C435923> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = governmentIdWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435923(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435923) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Input, GovernmentIdState, ? extends Output>> actionSink = this.$context.getActionSink();
            final GovernmentIdWorkflow governmentIdWorkflow = this.this$0;
            actionSink.send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GovernmentIdWorkflow.C435923.invokeSuspend$lambda$0(governmentIdWorkflow, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GovernmentIdWorkflow governmentIdWorkflow, WorkflowAction.Updater updater) {
            governmentIdWorkflow.setWebRtcMisconfiguredOutput(updater);
            return Unit.INSTANCE;
        }
    }

    private final Object renderScreen(final Input renderProps, final GovernmentIdState renderState, final StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext context) {
        InquiryPage3 takePhoto;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        int i;
        final Sink<? super Output> sink = new Sink() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda0
            @Override // com.squareup.workflow1.Sink
            public final void send(Object obj) {
                GovernmentIdWorkflow.renderScreen$lambda$2(context, this, (GovernmentIdWorkflow.Output) obj);
            }
        };
        this.navigationStateManager.setState(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit));
        ExternalEventLogger externalEventLogger = this.externalEventLogger;
        String fromStep = renderProps.getFromStep();
        boolean z = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z) {
            takePhoto = InquiryPage3.AutoClassificationFailure.INSTANCE;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = InquiryPage3.AutoClassificationSelect.INSTANCE;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = InquiryPage3.Select.INSTANCE;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new InquiryPage3.Prompt(((GovernmentIdState.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof GovernmentIdState.WaitForAutocapture) || (renderState instanceof GovernmentIdState.CountdownToCapture) || (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (renderState instanceof GovernmentIdState.FinalizeWebRtc)) {
            takePhoto = new InquiryPage3.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new InquiryPage3.Check(((GovernmentIdState.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new InquiryPage3.CheckUpload(((GovernmentIdState.ReviewSelectedImage) renderState).getPartIndex());
        } else {
            if (!(renderState instanceof GovernmentIdState.Submit)) {
                throw new NoWhenBranchMatchedException();
            }
            takePhoto = InquiryPage3.Pending.INSTANCE;
        }
        externalEventLogger.logPageChange(new InquiryPage.GovernmentId(fromStep, takePhoto));
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            context.runningSideEffect("check_if_single_id_class", new C435931(renderProps, renderState, this, context, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> enabledIdClasses = GovernmentIdWorkflowUtils.getEnabledIdClasses(renderProps);
            C435942 c435942 = new C435942(renderState, this, context, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new GovernmentIdScreen2.InstructionsScreen(title, prompt, choose, instructionsDisclaimer, enabledIdClasses, this.navigationStateManager.getNavigationState(), c435942, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$4(context, this);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$5(context);
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$7(context, this, renderState);
                }
            });
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdConfig2.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                Workflows.runningWorker(context, this.documentSelectWorker, Reflection.typeOf(DocumentSelectWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflow.renderScreen$lambda$10(this.f$0, currentPart, renderState, (DocumentSelectWorker.Output) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = renderProps.getEnabledCaptureOptionsNativeMobile();
            String chooseCaptureMethodTitle = getChooseCaptureMethodTitle(renderProps.getStrings(), currentPart.getSide(), CaptureConfig2.getIdClassKey(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodBody = getChooseCaptureMethodBody(renderProps.getStrings(), currentPart.getSide(), CaptureConfig2.getIdClassKey(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState navigationState = this.navigationStateManager.getNavigationState();
            Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$14(context, this, renderState, renderProps);
                }
            };
            Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$16(context, this, renderState);
                }
            };
            Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$17(context, this);
                }
            };
            Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$18(context);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function05 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$20(context, this, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.Side side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i2 = iArr[side.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                remoteImage = idFrontPictograph;
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                            remoteImage = idFrontPictograph;
                        }
                    }
                    remoteImage = null;
                } else {
                    if (promptPage != null) {
                        idFrontPictograph = promptPage.getIdBackPictograph();
                        remoteImage = idFrontPictograph;
                    }
                    remoteImage = null;
                }
            } else if (CaptureConfig2.getIdClass(chooseCaptureMethod.getCaptureConfig()) == IdClass.Passport) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                    remoteImage = idFrontPictograph;
                }
                remoteImage = null;
            } else {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdFrontPictograph();
                    remoteImage = idFrontPictograph;
                }
                remoteImage = null;
            }
            int i3 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            if (i3 != 1) {
                if (i3 == 2 || i3 == 4) {
                    i = R$raw.pi2_upload_gov_id_back_lottie;
                } else {
                    i = R$raw.pi2_upload_gov_id_front_lottie;
                }
            } else if (CaptureConfig2.getIdClass(chooseCaptureMethod.getCaptureConfig()) == IdClass.Passport) {
                i = R$raw.pi2_upload_gov_id_passport_lottie;
            } else {
                i = R$raw.pi2_upload_gov_id_front_lottie;
            }
            return new ChooseCaptureMethodView(enabledCaptureOptionsNativeMobile, chooseCaptureMethodTitle, chooseCaptureMethodBody, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, navigationState, function0, function02, function03, function04, error, function05, styles, remoteImage, i);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.renderWaitForAutoCapture(renderProps, (GovernmentIdState.WaitForAutocapture) renderState, context, this.videoCaptureHelper, sink);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.renderCountdownToCapture(renderProps, (GovernmentIdState.CountdownToCapture) renderState, context, this.videoCaptureHelper, sink);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig sideConfig = CaptureConfig2.getSideConfig(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.first((List) reviewCapturedImage.getIdForReview().getFrames());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                ReviewScreenUtils.runAutoClassificationWorker(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new AlertContainerScreen(PermissionsUtils.toModalContainerScreen(new GovernmentIdScreen2.ReviewScreen(this.imageLoader, GovernmentIdWorkflowUtils.getConfirmCaptureText(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), CaptureConfig2.getIdClassKey(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), renderProps.getStrings().getCaptureDisclaimer(), sideConfig.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), CaptureConfig2.getIdClass(captureConfig), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$21(renderProps, renderState, context, this);
                }
            }, renderProps.getStrings().getButtonSubmit(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$26(context, this, renderState, renderProps, captureConfig);
                }
            }, renderProps.getStrings().getButtonRetake(), getConfirmCaptureTitle(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), CaptureConfig2.getIdClassKey(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$27(sink);
                }
            }, renderProps.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$29(context, this, renderState);
                }
            }, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis())), null, 2, null);
        }
        if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
            IdConfig2.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                ReviewScreenUtils.runAutoClassificationWorker(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new ReviewSelectedImageView(this.imageLoader, getReviewSelectedImageTitle(renderProps.getStrings(), currentPart2.getSide()), getReviewSelectedImageBody(renderProps.getStrings(), currentPart2.getSide()), renderProps.getStrings().getReviewSelectedImageConfirmButton(), renderProps.getStrings().getReviewSelectedImageChooseAnotherButton(), ((Frame) CollectionsKt.first((List) reviewSelectedImage.getIdForReview().getFrames())).getAbsoluteFilePath(), ((Frame) CollectionsKt.first((List) reviewSelectedImage.getIdForReview().getFrames())).getMimeType(), reviewSelectedImage.getFileName(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$30(renderProps, renderState, context, this);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$31(context, this);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$32(context, this);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$33(context);
                }
            }, reviewSelectedImage.getError(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$35(context, this, renderState);
                }
            }, renderProps.getStyles(), reviewSelectedImage.getSubmittingForAutoClassification());
        }
        if (renderState instanceof GovernmentIdState.Submit) {
            GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
            Workflows.runningWorker(context, this.submitVerificationWorkerFactory.create(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), Reflection.typeOf(SubmitVerificationWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.renderScreen$lambda$39(this.f$0, context, (SubmitVerificationWorker.Response) obj);
                }
            });
            NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
            return new GovernmentIdScreen2.SubmittingScreen(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$40(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdWorkflow.renderScreen$lambda$41(this.f$0, context);
                }
            }, renderProps.getPendingPageTextVerticalPosition());
        }
        if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
            return this.localVideoCaptureRenderer.renderFinalizeVideoCapture(renderProps, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
        }
        if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
            return this.webRtcRenderer.renderFinalizeWebRtc(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, context, this.videoCaptureHelper);
        }
        if (z) {
            return this.autoClassificationRenderer.renderError(renderProps, (GovernmentIdState.AutoClassificationError) renderState, context, this.videoCaptureHelper);
        }
        if (!(renderState instanceof GovernmentIdState.AutoClassificationManualSelect)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.autoClassificationRenderer.renderManualSelect(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderScreen$lambda$2(final StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, final Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$2$lambda$1(this.f$0, renderContext, it, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$2$lambda$1(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, Output output, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.setOutputForWorkflow(renderContext, output);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void renderScreen$selectIdClass$default(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, Input input, IdConfig idConfig, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        renderScreen$selectIdClass(governmentIdState, governmentIdWorkflow, renderContext, input, idConfig, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderScreen$selectIdClass(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext renderContext, Input input, IdConfig idConfig, boolean z) {
        GovernmentIdState.ShowInstructions showInstructions = (GovernmentIdState.ShowInstructions) governmentIdState;
        GovernmentIdWorkflowUtils.moveToNextStep(showInstructions, renderContext, input, null, idConfig, governmentIdWorkflow.videoCaptureHelper, new CameraProperties(null, null, null, 0, 15, null), (3584 & 128) != 0 ? true : z, (3584 & 256) != 0 ? showInstructions.getParts$government_id_release() : idConfig.getParts(), (3584 & 512) != 0 ? showInstructions.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? showInstructions.getCountryCode() : null);
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", m3645f = "GovernmentIdWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1 */
    static final class C435931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, GovernmentIdState, Output, Object>.RenderContext $context;
        final /* synthetic */ Input $renderProps;
        final /* synthetic */ GovernmentIdState $renderState;
        int label;
        final /* synthetic */ GovernmentIdWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C435931(Input input, GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext renderContext, Continuation<? super C435931> continuation) {
            super(2, continuation);
            this.$renderProps = input;
            this.$renderState = governmentIdState;
            this.this$0 = governmentIdWorkflow;
            this.$context = renderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435931(this.$renderProps, this.$renderState, this.this$0, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$renderProps.getEnabledIdClasses().size() == 1) {
                GovernmentIdState governmentIdState = this.$renderState;
                GovernmentIdWorkflow governmentIdWorkflow = this.this$0;
                StatefulWorkflow<Input, GovernmentIdState, Output, Object>.RenderContext renderContext = this.$context;
                Input input = this.$renderProps;
                GovernmentIdWorkflow.renderScreen$selectIdClass(governmentIdState, governmentIdWorkflow, renderContext, input, (IdConfig) CollectionsKt.first((List) input.getEnabledIdClasses()), false);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$2 */
    /* synthetic */ class C435942 extends AdaptedFunctionReference implements Function1<IdConfig, Unit> {
        final /* synthetic */ StatefulWorkflow<Input, GovernmentIdState, Output, Object>.RenderContext $context;
        final /* synthetic */ Input $renderProps;
        final /* synthetic */ GovernmentIdState $renderState;
        final /* synthetic */ GovernmentIdWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C435942(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext renderContext, Input input) {
            super(1, Intrinsics.Kotlin.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.$renderState = governmentIdState;
            this.this$0 = governmentIdWorkflow;
            this.$context = renderContext;
            this.$renderProps = input;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            invoke2(idConfig);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(IdConfig p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            GovernmentIdWorkflow.renderScreen$selectIdClass$default(this.$renderState, this.this$0, this.$context, this.$renderProps, p0, false, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$4(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        GovernmentIdWorkflowUtils.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$5(StatefulWorkflow.RenderContext renderContext) {
        GovernmentIdWorkflowUtils.cancel(renderContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$7(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$7$lambda$6(governmentIdState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$7$lambda$6(GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.ShowInstructions.copy$default((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null));
        return Unit.INSTANCE;
    }

    private static final WorkflowAction<Input, GovernmentIdState, Output> renderScreen$onFileSelected(IdConfig2.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, String str, final String str2) {
        final GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(CollectionsKt.listOf(new Frame(str, null, 2, null)), GovernmentIdWorkflowUtils.toGovIdSide(sideIdPart.getSide()), CaptureConfig2.getIdClassKey(((GovernmentIdState.ChooseCaptureMethod) governmentIdState).getCaptureConfig()), GovernmentId.CaptureMethod.UPLOAD, null, null, 32, null);
        return StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$onFileSelected$lambda$8(governmentIdState, governmentIdImage, str2, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$onFileSelected$lambda$8(GovernmentIdState governmentIdState, GovernmentId.GovernmentIdImage governmentIdImage, String str, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = state instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) state : null;
        if (chooseCaptureMethod == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = chooseCaptureMethod;
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod3 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.setState(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod3.getCurrentPart(), chooseCaptureMethod3.getUploadingIds$government_id_release(), chooseCaptureMethod3.getCaptureConfig(), governmentIdImage, str, chooseCaptureMethod2.getParts$government_id_release(), chooseCaptureMethod2.getPartIndex(), GovernmentIdWorkflowUtils.createBackState$default(action, false, 1, null), null, null, false, chooseCaptureMethod3.getCountryCode(), 1792, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderScreen$lambda$10(GovernmentIdWorkflow governmentIdWorkflow, IdConfig2.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, DocumentSelectWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentSelectWorker.Output.Success) {
            DocumentSelectWorker.Output.Success success = (DocumentSelectWorker.Output.Success) it;
            return renderScreen$onFileSelected(sideIdPart, governmentIdState, governmentIdWorkflow, success.getAbsoluteFilePath(), success.getFileName());
        }
        if (Intrinsics.areEqual(it, DocumentSelectWorker.Output.Cancel.INSTANCE)) {
            return StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.renderScreen$lambda$10$lambda$9(governmentIdState, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$10$lambda$9(GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$14(final StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState, final Input input) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$14$lambda$13(governmentIdState, input, renderContext, governmentIdWorkflow, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$14$lambda$13(GovernmentIdState governmentIdState, Input input, final StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = state instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) state : null;
        if (chooseCaptureMethod == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.setState(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.getUploadingIds$government_id_release(), chooseCaptureMethod2.getCaptureConfig(), GovernmentIdWorkflowUtils.getManualCaptureDefaultState(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.getParts$government_id_release(), chooseCaptureMethod.getPartIndex(), GovernmentIdWorkflowUtils.createBackState$default(action, false, 1, null), WebRtcState.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.renderScreen$lambda$14$lambda$13$lambda$12(renderContext, governmentIdWorkflow);
            }
        }, 11776, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$14$lambda$13$lambda$12(StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$14$lambda$13$lambda$12$lambda$11(this.f$0, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$14$lambda$13$lambda$12$lambda$11(GovernmentIdWorkflow governmentIdWorkflow, WorkflowAction.Updater action) {
        WebRtcState webRtcState;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture != null) {
            if (governmentIdWorkflow.videoCaptureHelper.isWebRtcConnected()) {
                webRtcState = WebRtcState.Connected;
            } else {
                webRtcState = WebRtcState.Disconnected;
            }
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, null, null, 0, null, webRtcState, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$16(StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$16$lambda$15(this.f$0, governmentIdState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$16$lambda$15(GovernmentIdWorkflow governmentIdWorkflow, GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.documentSelectWorker.launchSelectDocument();
        action.setState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$17(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        GovernmentIdWorkflowUtils.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$18(StatefulWorkflow.RenderContext renderContext) {
        GovernmentIdWorkflowUtils.cancel(renderContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$20(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$20$lambda$19(governmentIdState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$20$lambda$19(GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$21(Input input, GovernmentIdState governmentIdState, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        ReviewScreenUtils.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$26(final StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState, final Input input, final CaptureConfig captureConfig) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$26$lambda$25(governmentIdState, input, captureConfig, renderContext, governmentIdWorkflow, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$26$lambda$25(GovernmentIdState governmentIdState, Input input, CaptureConfig captureConfig, final StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState governmentIdState2 = state instanceof GovernmentIdState ? (GovernmentIdState) state : null;
        if (governmentIdState2 == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), ((GovernmentIdState) action.getState()).getUploadingIds$government_id_release(), captureConfig, GovernmentIdWorkflowUtils.getManualCaptureDefaultState((Input) action.getProps(), reviewCapturedImage.getCurrentPart().getSide()), governmentIdState2.getParts$government_id_release(), governmentIdState2.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, false), WebRtcState.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdWorkflow.renderScreen$lambda$26$lambda$25$lambda$23(renderContext, governmentIdWorkflow);
            }
        }, 11776, null);
        waitForAutocapture.setDidGoBack$government_id_release(true);
        action.setState(waitForAutocapture);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$26$lambda$25$lambda$23(StatefulWorkflow.RenderContext renderContext, final GovernmentIdWorkflow governmentIdWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$26$lambda$25$lambda$23$lambda$22(this.f$0, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$26$lambda$25$lambda$23$lambda$22(GovernmentIdWorkflow governmentIdWorkflow, WorkflowAction.Updater action) {
        WebRtcState webRtcState;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture != null) {
            if (governmentIdWorkflow.videoCaptureHelper.isWebRtcConnected()) {
                webRtcState = WebRtcState.Connected;
            } else {
                webRtcState = WebRtcState.Disconnected;
            }
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, null, null, 0, null, webRtcState, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$27(Sink sink) {
        sink.send(Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$29(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$29$lambda$28(governmentIdState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$29$lambda$28(GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.ReviewCapturedImage.copy$default((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$30(Input input, GovernmentIdState governmentIdState, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        ReviewScreenUtils.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$31(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        GovernmentIdWorkflowUtils.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$32(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        GovernmentIdWorkflowUtils.goBack(renderContext, governmentIdWorkflow.videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$33(StatefulWorkflow.RenderContext renderContext) {
        GovernmentIdWorkflowUtils.cancel(renderContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$35(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflow.renderScreen$lambda$35$lambda$34(governmentIdState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$35$lambda$34(GovernmentIdState governmentIdState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.ReviewSelectedImage.copy$default((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderScreen$lambda$39(final GovernmentIdWorkflow governmentIdWorkflow, final StatefulWorkflow.RenderContext renderContext, final SubmitVerificationWorker.Response it) {
        final String string2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof SubmitVerificationWorker.Response.Success) {
            return StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.renderScreen$lambda$39$lambda$36(this.f$0, renderContext, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof SubmitVerificationWorker.Response.FileUploadError) {
            SubmitVerificationWorker.Response.FileUploadError fileUploadError = (SubmitVerificationWorker.Response.FileUploadError) it;
            if (fileUploadError.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                string2 = governmentIdWorkflow.applicationContext.getString(R$string.pi2_governmentid_error_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) fileUploadError.getCause()).getDetails().getMinDimensionSize()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            } else {
                string2 = governmentIdWorkflow.applicationContext.getString(R$string.pi2_governmentid_error_unable_to_upload_file);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            return StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.renderScreen$lambda$39$lambda$37(string2, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof SubmitVerificationWorker.Response.Error) {
            return StatefulWorkflow2.action$default(governmentIdWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflow.renderScreen$lambda$39$lambda$38(it, governmentIdWorkflow, renderContext, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$39$lambda$36(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.setOutputForWorkflow(renderContext, Output.Finished.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$39$lambda$37(String str, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.getState()).getBackState();
        if (backState != null) {
            action.setState(backState.copyWithErrorMessage$government_id_release(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$39$lambda$38(SubmitVerificationWorker.Response response, GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.getState()).getBackState();
        SubmitVerificationWorker.Response.Error error = (SubmitVerificationWorker.Response.Error) response;
        if (error.getCause().isRecoverable() && backState != null) {
            String string2 = governmentIdWorkflow.applicationContext.getString(R$string.pi2_network_connection_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            action.setState(backState.copyWithErrorMessage$government_id_release(string2));
        } else {
            governmentIdWorkflow.setOutputForWorkflow(renderContext, new Output.Error(error.getCause()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$40(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext) {
        governmentIdWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderScreen$lambda$41(GovernmentIdWorkflow governmentIdWorkflow, StatefulWorkflow.RenderContext renderContext) {
        governmentIdWorkflow.setOutputForWorkflow(renderContext, Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    private final void setOutputForWorkflow(StatefulWorkflow<? super Input, GovernmentIdState, ? extends Output, ? extends Object>.RenderContext context, Output output) {
        GovernmentIdWorkflowUtils.setOutputForWorkflow(context, output, this.videoCaptureHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWebRtcMisconfiguredOutput(WorkflowAction<? super Input, GovernmentIdState, ? extends Output>.Updater updater) {
        updater.setOutput(new Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    private final ScreenWithTransition wrapScreenWithTransition(Object obj, GovernmentIdState governmentIdState) {
        ScreenWithTransition2 screenWithTransition2;
        if (governmentIdState.getDidGoBack()) {
            screenWithTransition2 = ScreenWithTransition2.SLIDE_OUT;
        } else {
            screenWithTransition2 = ScreenWithTransition2.SLIDE_IN;
        }
        return new ScreenWithTransition(obj, screenWithTransition2);
    }

    private final Named<Object> named(Object obj, String str) {
        return new Named<>(obj, str);
    }

    private final boolean useCamera(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture)) {
            return true;
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getScreenName(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc)) {
            return "camera_screen";
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getChooseCaptureMethodTitle(Input.Strings strings, IdConfig.Side side, String str, String str2) {
        String text = strings.getChooseCaptureMethodTitle().getText(str2, str, side);
        if (text != null) {
            return text;
        }
        String string2 = this.applicationContext.getString(R$string.pi2_governmentid_choose_capture_method_title_default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getChooseCaptureMethodBody(Input.Strings strings, IdConfig.Side side, String str, String str2) {
        String text = strings.getChooseCaptureMethodBody().getText(str2, str, side);
        if (text != null) {
            return text;
        }
        String string2 = this.applicationContext.getString(R$string.pi2_governmentid_choose_capture_method_body_default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getConfirmCaptureTitle(Input.Strings strings, IdConfig.Side side, String str, String str2) {
        String text = strings.getConfirmCaptureTitle().getText(str2, str, side);
        return text == null ? "" : text;
    }

    private final String getReviewSelectedImageTitle(Input.Strings strings, IdConfig.Side side) {
        String str = strings.getReviewSelectedImageTitle().get(side);
        if (str != null) {
            return str;
        }
        String string2 = this.applicationContext.getString(R$string.pi2_governmentid_review_selected_image_title_default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getReviewSelectedImageBody(Input.Strings strings, IdConfig.Side side) {
        String str = strings.getReviewSelectedImageBody().get(side);
        if (str != null) {
            return str;
        }
        String string2 = this.applicationContext.getString(R$string.pi2_governmentid_review_selected_image_body_default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(GovernmentIdState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\u0018\u00002\u00020\u0001:\u0001`BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b.\u0010-R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b2\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b3\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b4\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b8\u00107R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\bC\u0010-R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\bD\u0010-R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\bH\u00107R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b \u00107R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010[\u001a\u0004\b\\\u0010]R\u0011\u0010_\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b^\u00107¨\u0006a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "", "", "sessionToken", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "strings", "", "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", "", "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)V", "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "getCountryCode", "Ljava/util/List;", "getEnabledIdClasses", "()Ljava/util/List;", "getInquiryId", "getFromStep", "getFromComponent", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getEnabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "getStrings", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "I", "getImageCaptureCount", "()I", "getFieldKeyDocument", "getFieldKeyIdClass", "J", "getManualCaptureButtonDelayMs", "()J", "getShouldSkipReviewScreen", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "getVideoCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "getAutoClassificationConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getDigitalIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getHasMultipleCaptureOptions", "hasMultipleCaptureOptions", "Strings", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Input {
        private final NextStep.GovernmentId.AssetConfig assetConfig;
        private final AutoClassificationConfig autoClassificationConfig;
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final String countryCode;
        private final DigitalIdConfig digitalIdConfig;
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;
        private final List<IdConfig> enabledIdClasses;
        private final String fieldKeyDocument;
        private final String fieldKeyIdClass;
        private final String fromComponent;
        private final String fromStep;
        private final int imageCaptureCount;
        private final String inquiryId;
        private final boolean isEnabled;
        private final long manualCaptureButtonDelayMs;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final StyleElements.Axis reviewCaptureButtonsAxis;
        private final String sessionToken;
        private final boolean shouldSkipReviewScreen;
        private final Strings strings;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final Integer theme;
        private final VideoCaptureConfig videoCaptureConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public Input(String sessionToken, String str, List<IdConfig> enabledIdClasses, String inquiryId, String fromStep, String fromComponent, boolean z, boolean z2, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Strings strings, int i, String fieldKeyDocument, String fieldKeyIdClass, long j, boolean z3, Integer num, VideoCaptureConfig videoCaptureConfig, NextStep.GovernmentId.AssetConfig assetConfig, boolean z4, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, DigitalIdConfig digitalIdConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.styles = governmentIdStepStyle;
            this.strings = strings;
            this.imageCaptureCount = i;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.manualCaptureButtonDelayMs = j;
            this.shouldSkipReviewScreen = z3;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z4;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.digitalIdConfig = digitalIdConfig;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final List<IdConfig> getEnabledIdClasses() {
            return this.enabledIdClasses;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getFromStep() {
            return this.fromStep;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final Strings getStrings() {
            return this.strings;
        }

        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final boolean getHasMultipleCaptureOptions() {
            return this.enabledCaptureOptionsNativeMobile.size() > 1;
        }

        /* compiled from: GovernmentIdWorkflow.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b?\u0018\u00002\u00020\u0001B³\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>¢\u0006\u0004\b@\u0010AR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010CR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010CR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010CR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010CR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010HR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bT\u0010HR\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010HR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010CR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\bX\u0010SR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\bY\u0010SR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010CR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010CR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010CR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010CR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010CR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010CR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010CR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010CR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010CR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010CR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010CR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010CR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010CR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010CR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010CR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010CR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010CR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010CR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010CR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010CR\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010CR\u0013\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010CR\u0013\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010CR\u0013\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010CR\u0013\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010CR\u0013\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010CR\u0013\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010CR\u0013\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010CR\u0019\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}¨\u0006~"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "", "title", "", "prompt", "choose", "instructionsDisclaimer", "captureScreenTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", "idClassToName", "", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "reviewSelectedImageTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "localizationOverrides", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getChoose", "getInstructionsDisclaimer", "getCaptureScreenTitle", "()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "getScanInstructions", "getCapturing", "getConfirmCapture", "getCaptureDisclaimer", "getButtonSubmit", "getButtonRetake", "getConfirmCaptureTitle", "getProcessingTitle", "getProcessingDescription", "getIdClassToName", "()Ljava/util/Map;", "getChooseCaptureMethodTitle", "getChooseCaptureMethodBody", "getChooseCaptureMethodCameraButton", "getChooseCaptureMethodUploadButton", "getReviewSelectedImageTitle", "getReviewSelectedImageBody", "getReviewSelectedImageConfirmButton", "getReviewSelectedImageChooseAnotherButton", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsTitle", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsAllowButtonText", "getMicrophonePermissionsCancelButtonText", "getHintHoldStill", "getHintLowLight", "getHelpButtonText", "getBarcodeHelpModalTitle", "getBarcodeHelpModalPrompt", "getBarcodeHelpModalHints", "getBarcodeHelpModalContinueButtonText", "getIdFrontHelpModalTitle", "getIdFrontHelpModalPrompt", "getIdFrontHelpModalHints", "getIdFrontHelpModalContinueButtonText", "getIdBackHelpModalTitle", "getIdBackHelpModalPrompt", "getIdBackHelpModalHints", "getIdBackHelpModalContinueButtonText", "getUnableToClassifyDocumentTitle", "getUnableToClassifyDocumentContinueButtonText", "getIdClassRejectedTitle", "getIdClassRejectedContinueButtonText", "getCountryInputTitle", "getIdClassInputTitle", "getManualClassificationTitle", "getManualClassificationContinueButtonText", "getAutoClassificationCaptureTipText", "getLocalizationOverrides", "()Ljava/util/List;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Strings {
            private final String autoClassificationCaptureTipText;
            private final String barcodeHelpModalContinueButtonText;
            private final String barcodeHelpModalHints;
            private final String barcodeHelpModalPrompt;
            private final String barcodeHelpModalTitle;
            private final String buttonRetake;
            private final String buttonSubmit;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String captureDisclaimer;
            private final OverridableText captureScreenTitle;
            private final String capturing;
            private final String choose;
            private final OverridableText chooseCaptureMethodBody;
            private final String chooseCaptureMethodCameraButton;
            private final OverridableText chooseCaptureMethodTitle;
            private final String chooseCaptureMethodUploadButton;
            private final OverridableText confirmCapture;
            private final OverridableText confirmCaptureTitle;
            private final String countryInputTitle;
            private final String helpButtonText;
            private final String hintHoldStill;
            private final String hintLowLight;
            private final String idBackHelpModalContinueButtonText;
            private final String idBackHelpModalHints;
            private final String idBackHelpModalPrompt;
            private final String idBackHelpModalTitle;
            private final String idClassInputTitle;
            private final String idClassRejectedContinueButtonText;
            private final String idClassRejectedTitle;
            private final Map<String, String> idClassToName;
            private final String idFrontHelpModalContinueButtonText;
            private final String idFrontHelpModalHints;
            private final String idFrontHelpModalPrompt;
            private final String idFrontHelpModalTitle;
            private final String instructionsDisclaimer;
            private final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;
            private final String manualClassificationContinueButtonText;
            private final String manualClassificationTitle;
            private final String microphonePermissionsAllowButtonText;
            private final String microphonePermissionsCancelButtonText;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;
            private final String processingDescription;
            private final String processingTitle;
            private final String prompt;
            private final Map<IdConfig.Side, String> reviewSelectedImageBody;
            private final String reviewSelectedImageChooseAnotherButton;
            private final String reviewSelectedImageConfirmButton;
            private final Map<IdConfig.Side, String> reviewSelectedImageTitle;
            private final OverridableText scanInstructions;
            private final String title;
            private final String unableToClassifyDocumentContinueButtonText;
            private final String unableToClassifyDocumentTitle;

            public Strings(String title, String prompt, String choose, String instructionsDisclaimer, OverridableText captureScreenTitle, OverridableText scanInstructions, String capturing, OverridableText confirmCapture, String captureDisclaimer, String buttonSubmit, String buttonRetake, OverridableText confirmCaptureTitle, String processingTitle, String processingDescription, Map<String, String> idClassToName, OverridableText chooseCaptureMethodTitle, OverridableText chooseCaptureMethodBody, String chooseCaptureMethodCameraButton, String chooseCaptureMethodUploadButton, Map<IdConfig.Side, String> reviewSelectedImageTitle, Map<IdConfig.Side, String> reviewSelectedImageBody, String reviewSelectedImageConfirmButton, String reviewSelectedImageChooseAnotherButton, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List<NextStep.GovernmentId.LocalizationOverride> list) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(choose, "choose");
                Intrinsics.checkNotNullParameter(instructionsDisclaimer, "instructionsDisclaimer");
                Intrinsics.checkNotNullParameter(captureScreenTitle, "captureScreenTitle");
                Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
                Intrinsics.checkNotNullParameter(capturing, "capturing");
                Intrinsics.checkNotNullParameter(confirmCapture, "confirmCapture");
                Intrinsics.checkNotNullParameter(captureDisclaimer, "captureDisclaimer");
                Intrinsics.checkNotNullParameter(buttonSubmit, "buttonSubmit");
                Intrinsics.checkNotNullParameter(buttonRetake, "buttonRetake");
                Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                Intrinsics.checkNotNullParameter(idClassToName, "idClassToName");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodTitle, "chooseCaptureMethodTitle");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodBody, "chooseCaptureMethodBody");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodCameraButton, "chooseCaptureMethodCameraButton");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodUploadButton, "chooseCaptureMethodUploadButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageTitle, "reviewSelectedImageTitle");
                Intrinsics.checkNotNullParameter(reviewSelectedImageBody, "reviewSelectedImageBody");
                Intrinsics.checkNotNullParameter(reviewSelectedImageConfirmButton, "reviewSelectedImageConfirmButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageChooseAnotherButton, "reviewSelectedImageChooseAnotherButton");
                this.title = title;
                this.prompt = prompt;
                this.choose = choose;
                this.instructionsDisclaimer = instructionsDisclaimer;
                this.captureScreenTitle = captureScreenTitle;
                this.scanInstructions = scanInstructions;
                this.capturing = capturing;
                this.confirmCapture = confirmCapture;
                this.captureDisclaimer = captureDisclaimer;
                this.buttonSubmit = buttonSubmit;
                this.buttonRetake = buttonRetake;
                this.confirmCaptureTitle = confirmCaptureTitle;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.idClassToName = idClassToName;
                this.chooseCaptureMethodTitle = chooseCaptureMethodTitle;
                this.chooseCaptureMethodBody = chooseCaptureMethodBody;
                this.chooseCaptureMethodCameraButton = chooseCaptureMethodCameraButton;
                this.chooseCaptureMethodUploadButton = chooseCaptureMethodUploadButton;
                this.reviewSelectedImageTitle = reviewSelectedImageTitle;
                this.reviewSelectedImageBody = reviewSelectedImageBody;
                this.reviewSelectedImageConfirmButton = reviewSelectedImageConfirmButton;
                this.reviewSelectedImageChooseAnotherButton = reviewSelectedImageChooseAnotherButton;
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsTitle = str5;
                this.microphonePermissionsPrompt = str6;
                this.microphonePermissionsAllowButtonText = str7;
                this.microphonePermissionsCancelButtonText = str8;
                this.hintHoldStill = str9;
                this.hintLowLight = str10;
                this.helpButtonText = str11;
                this.barcodeHelpModalTitle = str12;
                this.barcodeHelpModalPrompt = str13;
                this.barcodeHelpModalHints = str14;
                this.barcodeHelpModalContinueButtonText = str15;
                this.idFrontHelpModalTitle = str16;
                this.idFrontHelpModalPrompt = str17;
                this.idFrontHelpModalHints = str18;
                this.idFrontHelpModalContinueButtonText = str19;
                this.idBackHelpModalTitle = str20;
                this.idBackHelpModalPrompt = str21;
                this.idBackHelpModalHints = str22;
                this.idBackHelpModalContinueButtonText = str23;
                this.unableToClassifyDocumentTitle = str24;
                this.unableToClassifyDocumentContinueButtonText = str25;
                this.idClassRejectedTitle = str26;
                this.idClassRejectedContinueButtonText = str27;
                this.countryInputTitle = str28;
                this.idClassInputTitle = str29;
                this.manualClassificationTitle = str30;
                this.manualClassificationContinueButtonText = str31;
                this.autoClassificationCaptureTipText = str32;
                this.localizationOverrides = list;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getChoose() {
                return this.choose;
            }

            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            public final OverridableText getCaptureScreenTitle() {
                return this.captureScreenTitle;
            }

            public final OverridableText getScanInstructions() {
                return this.scanInstructions;
            }

            public final String getCapturing() {
                return this.capturing;
            }

            public final OverridableText getConfirmCapture() {
                return this.confirmCapture;
            }

            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            public final OverridableText getConfirmCaptureTitle() {
                return this.confirmCaptureTitle;
            }

            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            public final Map<String, String> getIdClassToName() {
                return this.idClassToName;
            }

            public final OverridableText getChooseCaptureMethodTitle() {
                return this.chooseCaptureMethodTitle;
            }

            public final OverridableText getChooseCaptureMethodBody() {
                return this.chooseCaptureMethodBody;
            }

            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            public final Map<IdConfig.Side, String> getReviewSelectedImageTitle() {
                return this.reviewSelectedImageTitle;
            }

            public final Map<IdConfig.Side, String> getReviewSelectedImageBody() {
                return this.reviewSelectedImageBody;
            }

            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }

            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            public final List<NextStep.GovernmentId.LocalizationOverride> getLocalizationOverrides() {
                return this.localizationOverrides;
            }
        }
    }

    /* compiled from: GovernmentIdWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "", "<init>", "()V", "Canceled", "Finished", "Back", "Error", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Finished;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: GovernmentIdWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Canceled extends Output {
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            public int hashCode() {
                return 1649914237;
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

        /* compiled from: GovernmentIdWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Finished;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public boolean equals(Object other) {
                return this == other || (other instanceof Finished);
            }

            public int hashCode() {
                return 1099427158;
            }

            public String toString() {
                return "Finished";
            }

            private Finished() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Back extends Output {
            public static final Back INSTANCE = new Back();

            public boolean equals(Object other) {
                return this == other || (other instanceof Back);
            }

            public int hashCode() {
                return 1411335115;
            }

            public String toString() {
                return "Back";
            }

            private Back() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error extends Output {
            private final InternalErrorInfo cause;

            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }
        }
    }
}
