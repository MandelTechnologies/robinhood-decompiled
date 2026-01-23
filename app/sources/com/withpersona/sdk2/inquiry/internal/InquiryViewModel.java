package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.PickVisualMediaRequest;
import coil.ImageLoader;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.p415ui.AndroidRenderWorkflow;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager2;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule3;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule2;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModule2;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ControllerRequest;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InquiryViewModel.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 }2\u00020\u0001:\u0001}B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010&J\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0013¢\u0006\u0004\b)\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R*\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O028\u0006¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bQ\u0010RR#\u0010T\u001a\b\u0012\u0004\u0012\u00020S0-8\u0006¢\u0006\u0012\n\u0004\bT\u0010.\u0012\u0004\bW\u0010&\u001a\u0004\bU\u0010VR#\u0010Y\u001a\b\u0012\u0004\u0012\u00020X028\u0006¢\u0006\u0012\n\u0004\bY\u00105\u0012\u0004\b[\u0010&\u001a\u0004\bZ\u0010RR&\u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020^0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00130\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\be\u0010bR,\u0010h\u001a\u0014\u0012\u0004\u0012\u00020f\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0g0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010`\u001a\u0004\bi\u0010bR2\u0010k\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0j\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0g0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010`\u001a\u0004\bl\u0010bR&\u0010m\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00130\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010`\u001a\u0004\bn\u0010bR.\u0010o\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0j\u0012\u0006\u0012\u0004\u0018\u00010c0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010bR&\u0010s\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020r0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010`\u001a\u0004\bt\u0010bR&\u0010w\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020v0\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010`\u001a\u0004\bx\u0010bR\u0017\u0010|\u001a\b\u0012\u0004\u0012\u0002030y8F¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006~"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)V", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "", "registerActivityLaunchers", "(Landroidx/activity/result/ActivityResultCaller;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;", "component", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Lcom/withpersona/sdk2/inquiry/internal/WorkflowStateViewModel;", "workflowStateViewModel", "", "resetState", "createWorkflow$inquiry_internal_release", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/WorkflowStateViewModel;Z)V", "createWorkflow", "init$inquiry_internal_release", "init", "newValue", "setForceFallbackMode$inquiry_internal_release", "(Z)V", "setForceFallbackMode", "Lkotlinx/coroutines/flow/StateFlow;", "", "render", "(Lcom/withpersona/sdk2/inquiry/internal/WorkflowStateViewModel;)Lkotlinx/coroutines/flow/StateFlow;", "Lcom/squareup/workflow1/ui/ViewRegistry;", "viewRegistry", "()Lcom/squareup/workflow1/ui/ViewRegistry;", "onDestroy", "()V", "refreshAppSetId", "force", "cancelInquiry", "Landroid/app/Application;", "Landroidx/lifecycle/SavedStateHandle;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "workflow", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "_result", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "getSdkFilesManager$inquiry_internal_release", "()Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "forceFallbackModeFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getForceFallbackModeFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/lifecycle/MutableLiveData;", "", "inquiryId", "Landroidx/lifecycle/MutableLiveData;", "getInquiryId", "()Landroidx/lifecycle/MutableLiveData;", "setInquiryId", "(Landroidx/lifecycle/MutableLiveData;)V", "sessionToken", "getSessionToken", "setSessionToken", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/RealDataCollector;", "dataCollector", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/RealDataCollector;", "getDataCollector", "()Lcom/withpersona/sdk2/inquiry/shared/data_collection/RealDataCollector;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest;", "controllerRequestFlow", "getControllerRequestFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/ScreenState;", "screenStateFlow", "getScreenStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getScreenStateFlow$annotations", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "eventFlow", "getEventFlow", "getEventFlow$annotations", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "resolvableApiLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "getResolvableApiLauncher$inquiry_internal_release", "()Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Landroid/net/Uri;", "pictureLaunchResultLauncher", "getPictureLaunchResultLauncher$inquiry_internal_release", "Landroidx/activity/result/PickVisualMediaRequest;", "", "selectFromPhotoLibraryLauncher", "getSelectFromPhotoLibraryLauncher$inquiry_internal_release", "", "documentsSelectResultLauncher", "getDocumentsSelectResultLauncher$inquiry_internal_release", "requestPermissionResultLauncher", "getRequestPermissionResultLauncher$inquiry_internal_release", "documentSelectResultLauncher", "getDocumentSelectResultLauncher$inquiry_internal_release", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "getPassportNfcReaderLauncher$inquiry_internal_release", "Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "", "customTabsLauncher", "getCustomTabsLauncher$inquiry_internal_release", "Lkotlinx/coroutines/flow/SharedFlow;", "getResult", "()Lkotlinx/coroutines/flow/SharedFlow;", "result", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryViewModel extends AndroidViewModel {
    private final SharedFlow2<InquiryWorkflow.Output> _result;
    private final Application application;
    private InquiryComponent component;
    private final SharedFlow2<ControllerRequest> controllerRequestFlow;
    private final ReusableActivityResultLauncher<CustomTabsLauncherModule2, Integer> customTabsLauncher;
    private final DataCollector3 dataCollector;
    private final ReusableActivityResultLauncher<String[], Uri> documentSelectResultLauncher;
    private final ReusableActivityResultLauncher<String[], List<Uri>> documentsSelectResultLauncher;
    private final SharedFlow2<InquiryEvent> eventFlow;
    private final StateFlow<Boolean> forceFallbackModeFlow;
    private MutableLiveData<String> inquiryId;
    private final ReusableActivityResultLauncher<PassportNfcReaderConfig, PassportNfcReaderOutput> passportNfcReaderLauncher;
    private final ReusableActivityResultLauncher<Uri, Boolean> pictureLaunchResultLauncher;
    private StateFlow2<InquiryWorkflow.Props> props;
    private final ReusableActivityResultLauncher<String, Boolean> requestPermissionResultLauncher;
    private final ReusableActivityResultLauncher<IntentSenderRequest, ActivityResult> resolvableApiLauncher;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow2<ScreenState> screenStateFlow;
    private final SdkFilesManager sdkFilesManager;
    private final ReusableActivityResultLauncher<PickVisualMediaRequest, List<Uri>> selectFromPhotoLibraryLauncher;
    private MutableLiveData<String> sessionToken;
    private InquiryWorkflow workflow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryViewModel(Application application, SavedStateHandle savedStateHandle) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.application = application;
        this.savedStateHandle = savedStateHandle;
        this._result = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.sdkFilesManager = new SdkFilesManager(application);
        this.forceFallbackModeFlow = savedStateHandle.getStateFlow("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.getLiveData("inquiry_id", null);
        this.sessionToken = savedStateHandle.getLiveData("session_token", null);
        this.dataCollector = new DataCollector3(savedStateHandle);
        this.controllerRequestFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.screenStateFlow = StateFlow4.MutableStateFlow(new ScreenState(false, false, true));
        this.eventFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.resolvableApiLauncher = ResolvableApiLauncherModule2.createResolvableApiLauncher();
        this.pictureLaunchResultLauncher = DocumentLaunchersModule2.createTakePictureLauncher();
        this.selectFromPhotoLibraryLauncher = DocumentLaunchersModule2.createOpenFromPhotoLibraryLauncher();
        this.documentsSelectResultLauncher = DocumentLaunchersModule2.createOpenDocumentsLauncher();
        this.requestPermissionResultLauncher = PermissionsLauncherModule2.createRequestPermissionResultLauncher();
        this.documentSelectResultLauncher = DocumentSelectLauncherModule2.createOpenDocumentLauncher();
        this.passportNfcReaderLauncher = PassportNfcReaderLauncherModule2.createPassportNfcReaderLauncher();
        this.customTabsLauncher = CustomTabsLauncherModule3.createCustomTabsLauncher();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), Dispatchers.getDefault(), null, new C436171(null), 2, null);
    }

    /* renamed from: getSdkFilesManager$inquiry_internal_release, reason: from getter */
    public final SdkFilesManager getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    public final StateFlow<Boolean> getForceFallbackModeFlow() {
        return this.forceFallbackModeFlow;
    }

    public final MutableLiveData<String> getInquiryId() {
        return this.inquiryId;
    }

    public final MutableLiveData<String> getSessionToken() {
        return this.sessionToken;
    }

    public final SharedFlow<InquiryWorkflow.Output> getResult() {
        return this._result;
    }

    public final DataCollector3 getDataCollector() {
        return this.dataCollector;
    }

    public final SharedFlow2<ControllerRequest> getControllerRequestFlow() {
        return this.controllerRequestFlow;
    }

    public final StateFlow2<ScreenState> getScreenStateFlow() {
        return this.screenStateFlow;
    }

    public final SharedFlow2<InquiryEvent> getEventFlow() {
        return this.eventFlow;
    }

    public final ReusableActivityResultLauncher<IntentSenderRequest, ActivityResult> getResolvableApiLauncher$inquiry_internal_release() {
        return this.resolvableApiLauncher;
    }

    public final ReusableActivityResultLauncher<Uri, Boolean> getPictureLaunchResultLauncher$inquiry_internal_release() {
        return this.pictureLaunchResultLauncher;
    }

    public final ReusableActivityResultLauncher<PickVisualMediaRequest, List<Uri>> getSelectFromPhotoLibraryLauncher$inquiry_internal_release() {
        return this.selectFromPhotoLibraryLauncher;
    }

    public final ReusableActivityResultLauncher<String[], List<Uri>> getDocumentsSelectResultLauncher$inquiry_internal_release() {
        return this.documentsSelectResultLauncher;
    }

    public final ReusableActivityResultLauncher<String, Boolean> getRequestPermissionResultLauncher$inquiry_internal_release() {
        return this.requestPermissionResultLauncher;
    }

    public final ReusableActivityResultLauncher<String[], Uri> getDocumentSelectResultLauncher$inquiry_internal_release() {
        return this.documentSelectResultLauncher;
    }

    public final ReusableActivityResultLauncher<PassportNfcReaderConfig, PassportNfcReaderOutput> getPassportNfcReaderLauncher$inquiry_internal_release() {
        return this.passportNfcReaderLauncher;
    }

    public final ReusableActivityResultLauncher<CustomTabsLauncherModule2, Integer> getCustomTabsLauncher$inquiry_internal_release() {
        return this.customTabsLauncher;
    }

    /* compiled from: InquiryViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", m3645f = "InquiryViewModel.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1 */
    static final class C436171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C436171(Continuation<? super C436171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InquiryViewModel.this.new C436171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<InquiryActivityBroadcastManager2> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                final InquiryViewModel inquiryViewModel = InquiryViewModel.this;
                FlowCollector<? super InquiryActivityBroadcastManager2> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InquiryActivityBroadcastManager2) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InquiryActivityBroadcastManager2 inquiryActivityBroadcastManager2, Continuation<? super Unit> continuation) {
                        if (inquiryActivityBroadcastManager2 instanceof InquiryActivityBroadcastManager2.CancelInquiry) {
                            inquiryViewModel.cancelInquiry(true);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final void createWorkflow$inquiry_internal_release(InquiryComponent component, InquiryWorkflow.Props props, WorkflowStateViewModel workflowStateViewModel, boolean resetState) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(workflowStateViewModel, "workflowStateViewModel");
        this.component = component;
        if (resetState) {
            workflowStateViewModel.resetState();
        }
        StateFlow2<InquiryWorkflow.Props> stateFlow2 = this.props;
        if (stateFlow2 != null) {
            if (stateFlow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("props");
                stateFlow2 = null;
            }
            stateFlow2.setValue(props);
        } else {
            this.props = StateFlow4.MutableStateFlow(props);
        }
        this.workflow = component.workflow();
    }

    public final void init$inquiry_internal_release(ActivityResultCaller activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        registerActivityLaunchers(activityResultCaller);
    }

    public final void setForceFallbackMode$inquiry_internal_release(boolean newValue) {
        this.savedStateHandle.set("force_fallback_mode", Boolean.valueOf(newValue));
    }

    public final StateFlow<Object> render(WorkflowStateViewModel workflowStateViewModel) {
        InquiryWorkflow inquiryWorkflow;
        StateFlow2<InquiryWorkflow.Props> stateFlow2;
        Intrinsics.checkNotNullParameter(workflowStateViewModel, "workflowStateViewModel");
        InquiryWorkflow inquiryWorkflow2 = this.workflow;
        if (inquiryWorkflow2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("workflow");
            inquiryWorkflow = null;
        } else {
            inquiryWorkflow = inquiryWorkflow2;
        }
        CoroutineScope viewModelScope = ViewModel2.getViewModelScope(this);
        SavedStateHandle savedStateHandle = workflowStateViewModel.getSavedStateHandle();
        StateFlow2<InquiryWorkflow.Props> stateFlow22 = this.props;
        if (stateFlow22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("props");
            stateFlow2 = null;
        } else {
            stateFlow2 = stateFlow22;
        }
        return AndroidRenderWorkflow.renderWorkflowIn(inquiryWorkflow, viewModelScope, stateFlow2, savedStateHandle, Interceptors.INSTANCE.getInterceptors(), new C436191(null));
    }

    /* compiled from: InquiryViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$render$1", m3645f = "InquiryViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$render$1 */
    static final class C436191 extends ContinuationImpl7 implements Function2<InquiryWorkflow.Output, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C436191(Continuation<? super C436191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C436191 c436191 = InquiryViewModel.this.new C436191(continuation);
            c436191.L$0 = obj;
            return c436191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InquiryWorkflow.Output output, Continuation<? super Unit> continuation) {
            return ((C436191) create(output, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InquiryViewModel.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$render$1$1", m3645f = "InquiryViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$render$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InquiryWorkflow.Output $it;
            int label;
            final /* synthetic */ InquiryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InquiryViewModel inquiryViewModel, InquiryWorkflow.Output output, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = inquiryViewModel;
                this.$it = output;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow2 sharedFlow2 = this.this$0._result;
                    InquiryWorkflow.Output output = this.$it;
                    this.label = 1;
                    if (sharedFlow2.emit(output, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(InquiryViewModel.this), null, null, new AnonymousClass1(InquiryViewModel.this, (InquiryWorkflow.Output) this.L$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final ViewRegistry viewRegistry() {
        InquiryComponent inquiryComponent = this.component;
        if (inquiryComponent != null) {
            return inquiryComponent.viewRegistry();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void onDestroy() {
        ImageLoader imageLoader;
        InquiryComponent inquiryComponent = this.component;
        if (inquiryComponent == null || (imageLoader = inquiryComponent.imageLoader()) == null) {
            return;
        }
        imageLoader.shutdown();
    }

    public final void refreshAppSetId() {
        DeviceVendorIDProvider deviceVendorIdProvider;
        InquiryComponent inquiryComponent = this.component;
        if (inquiryComponent == null || (deviceVendorIdProvider = inquiryComponent.deviceVendorIdProvider()) == null) {
            return;
        }
        deviceVendorIdProvider.refreshDeviceVendorId();
    }

    private final void registerActivityLaunchers(ActivityResultCaller activityResultCaller) {
        this.resolvableApiLauncher.register(activityResultCaller);
        this.pictureLaunchResultLauncher.register(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.register(activityResultCaller);
        this.documentsSelectResultLauncher.register(activityResultCaller);
        this.requestPermissionResultLauncher.register(activityResultCaller);
        this.documentSelectResultLauncher.register(activityResultCaller);
        this.passportNfcReaderLauncher.register(activityResultCaller);
        this.customTabsLauncher.register(activityResultCaller);
    }

    /* compiled from: InquiryViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", m3645f = "InquiryViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1 */
    static final class C436181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436181(boolean z, Continuation<? super C436181> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InquiryViewModel.this.new C436181(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2<ControllerRequest> controllerRequestFlow = InquiryViewModel.this.getControllerRequestFlow();
                ControllerRequest.CancelRequest cancelRequest = new ControllerRequest.CancelRequest(this.$force);
                this.label = 1;
                if (controllerRequestFlow.emit(cancelRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancelInquiry(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), Dispatchers.getDefault(), null, new C436181(force, null), 2, null);
    }
}
