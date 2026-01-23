package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import coil.ImageLoader;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen2;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState2;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage2;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep2;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: DocumentWorkflow.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006;<=>?@Bi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0003H\u0016J<\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\"\u0010)\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002J0\u0010-\u001a\u00020,*\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010.\u001a\u00020/H\u0002JN\u00100\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000203\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020,040201*\u0002062\"\u0010)\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002JN\u00100\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000203\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020,040201*\u0002072\"\u0010)\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002J@\u00108\u001a\u00020,*\u0002092\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\"\u0010)\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002J@\u00108\u001a\u00020,*\u00020:2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\"\u0010)\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "", "imageLoader", "Lcoil/ImageLoader;", "applicationContext", "Landroid/content/Context;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Factory;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentCreateWorker$Factory;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Factory;", "documentFileUploadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Factory;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Factory;", "documentSubmitWorker", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentSubmitWorker$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "<init>", "(Lcoil/ImageLoader;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker;Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Factory;Lcom/withpersona/sdk2/inquiry/document/network/DocumentCreateWorker$Factory;Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Factory;Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Factory;Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Factory;Lcom/withpersona/sdk2/inquiry/document/network/DocumentSubmitWorker$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;)V", "initialState", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "snapshotState", "state", "render", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "logState", "", "onEvent", "event", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "componentNamesToActions", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "run", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Event", "Input", "StartPage", "Output", "State", "Screen", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentWorkflow extends StatefulWorkflow<Input, State, Output, Object> {
    private final Context applicationContext;
    private final DocumentCameraWorker documentCameraWorker;
    private final DocumentCreateWorker.Factory documentCreateWorker;
    private final DocumentFileDeleteWorker.Factory documentFileDeleteWorker;
    private final DocumentFileUploadWorker.Factory documentFileUploadWorker;
    private final DocumentLoadWorker.Factory documentLoadWorker;
    private final DocumentSubmitWorker.Factory documentSubmitWorker;
    private final DocumentsSelectWorker.Factory documentsSelectWorkerFactory;
    private final ExternalEventLogger externalEventLogger;
    private final ImageLoader imageLoader;
    private final NavigationStateManager navigationStateManager;
    private final PermissionRequestWorkflow permissionRequestWorkflow;

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionsState2.values().length];
            try {
                iArr[PermissionsState2.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionsState2.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionsState2.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[State.CaptureState.values().length];
            try {
                iArr2[State.CaptureState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[State.CaptureState.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[State.CaptureState.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[State.CaptureState.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[State.CaptureState.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public State initialState(Input props, Snapshot snapshot) {
        State stateCopyWithUploadOptions$document_release;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            Object obj = null;
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                Object parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                obj = parcelable;
            }
            State state = (State) obj;
            if (state != null && (stateCopyWithUploadOptions$document_release = state.copyWithUploadOptions$document_release(false)) != null) {
                return stateCopyWithUploadOptions$document_release;
            }
        }
        StartPage startPage = props.getStartPage();
        if (Intrinsics.areEqual(startPage, StartPage.Prompt.INSTANCE)) {
            return new State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof StartPage.Review)) {
            throw new NoWhenBranchMatchedException();
        }
        return new State.ReviewCaptures(CollectionsKt.emptyList(), ((StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null);
    }

    public DocumentWorkflow(ImageLoader imageLoader, Context applicationContext, PermissionRequestWorkflow permissionRequestWorkflow, DocumentCameraWorker documentCameraWorker, DocumentsSelectWorker.Factory documentsSelectWorkerFactory, DocumentCreateWorker.Factory documentCreateWorker, DocumentLoadWorker.Factory documentLoadWorker, DocumentFileUploadWorker.Factory documentFileUploadWorker, DocumentFileDeleteWorker.Factory documentFileDeleteWorker, DocumentSubmitWorker.Factory documentSubmitWorker, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(documentCameraWorker, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(documentCreateWorker, "documentCreateWorker");
        Intrinsics.checkNotNullParameter(documentLoadWorker, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(documentFileUploadWorker, "documentFileUploadWorker");
        Intrinsics.checkNotNullParameter(documentFileDeleteWorker, "documentFileDeleteWorker");
        Intrinsics.checkNotNullParameter(documentSubmitWorker, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorker = documentCreateWorker;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorker = documentFileUploadWorker;
        this.documentFileDeleteWorker = documentFileDeleteWorker;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Object render(Input renderProps, final State renderState, final StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        this.navigationStateManager.setState(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof State.UploadDocument));
        run(renderState.getCaptureState(), renderProps, renderState, context);
        run(renderState.getUploadState(), renderProps, renderState, context);
        logState(renderProps, renderState);
        if (renderState instanceof State.Start) {
            Object documentInstructionsView = new DocumentInstructionsView(NestedUiStep2.m3256to(renderProps.getPages().getDocumentStartPage()), componentNamesToActions(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$0(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$1(this.f$0, context);
                }
            });
            State.Start start = (State.Start) renderState;
            if (start.getShouldShowUploadOptionsDialog()) {
                documentInstructionsView = ModalContainerScreen2.firstInModalStack(UiStepUtils.INSTANCE.getBottomSheetViewFor(NestedUiStep2.m3256to(renderProps.getPages().getUploadOptionsDialog()), componentNamesToActions(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentWorkflow.render$lambda$2(this.f$0, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), documentInstructionsView, "document_upload_options_dialog");
            }
            boolean z = start.getCaptureState() == State.CaptureState.CheckCameraPermissions;
            PermissionsState permissionsState = PermissionsState.Camera;
            String permissionsTitle = renderProps.getPermissionsTitle();
            String str = permissionsTitle != null ? permissionsTitle : "";
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(R$string.pi2_document_camera_permission_rationale);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string2 = context2.getString(R$string.pi2_document_camera_permission_denied_rationale, ContextUtils3.getApplicationName(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return PermissionsUtils.withRequestPermissionsIfNeeded(documentInstructionsView, context, z, permissionsState, (19976 & 8) != 0 ? false : false, str, permissionsRationale, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$4(this.f$0, renderState, (PermissionRequestWorkflow.Output) obj);
                }
            });
        }
        if (renderState instanceof State.ReviewCaptures) {
            State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) renderState;
            if (reviewCaptures.getReloadingFromPreviousSession()) {
                Workflows.runningWorker(context, this.documentLoadWorker.create$document_release(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), Reflection.typeOf(DocumentLoadWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentWorkflow.render$lambda$7(this.f$0, renderState, (DocumentLoadWorker.Response) obj);
                    }
                });
            }
            Screen.ReviewCaptures reviewCaptures2 = new Screen.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.getDocuments(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$8(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$9(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$10(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$11(this.f$0, context);
                }
            }, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$12(this.f$0, context, renderState, (DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$13(this.f$0, context, renderState);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$14(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$15(this.f$0, context);
                }
            }, reviewCaptures.getReloadingFromPreviousSession(), reviewCaptures.getDocuments().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.getDocuments().isEmpty() && Intrinsics.areEqual(reviewCaptures.getUploadState(), new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$16(this.f$0, context);
                }
            }, renderProps.getStyles());
            boolean z2 = reviewCaptures.getCaptureState() == State.CaptureState.CheckCameraPermissions;
            PermissionsState permissionsState2 = PermissionsState.Camera;
            String permissionsTitle2 = renderProps.getPermissionsTitle();
            if (permissionsTitle2 == null) {
                permissionsTitle2 = "";
            }
            String permissionsRationale2 = renderProps.getPermissionsRationale();
            if (permissionsRationale2 == null) {
                permissionsRationale2 = this.applicationContext.getString(R$string.pi2_document_camera_permission_rationale);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
            }
            Context context3 = this.applicationContext;
            String string3 = context3.getString(R$string.pi2_document_camera_permission_denied_rationale, ContextUtils3.getApplicationName(context3));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            ModalContainerScreen modalContainerScreenWithRequestPermissionsIfNeeded = PermissionsUtils.withRequestPermissionsIfNeeded(reviewCaptures2, context, z2, permissionsState2, (19976 & 8) != 0 ? false : false, permissionsTitle2, permissionsRationale2, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$18(this.f$0, renderState, (PermissionRequestWorkflow.Output) obj);
                }
            });
            if (reviewCaptures.getShouldShowUploadOptionsDialog()) {
                return ModalContainerScreen2.firstInModalStack(UiStepUtils.INSTANCE.getBottomSheetViewFor(NestedUiStep2.m3256to(renderProps.getPages().getUploadOptionsDialog()), componentNamesToActions(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentWorkflow.render$lambda$19(this.f$0, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), modalContainerScreenWithRequestPermissionsIfNeeded, "document_upload_screen");
            }
            return new ModalContainerScreen(modalContainerScreenWithRequestPermissionsIfNeeded, CollectionsKt.emptyList(), "document_upload_screen");
        }
        if (renderState instanceof State.ReviewCapturesWithoutDocumentId) {
            State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (State.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                context.runningSideEffect(documentId, new C435684(context, this, documentId, null));
            }
            Screen.ReviewCaptures reviewCaptures3 = new Screen.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.getDocuments(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$20(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$21(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$22(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$23(this.f$0, context);
                }
            }, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$24((DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$26(this.f$0, context);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$27(this.f$0, context);
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.getDocuments().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentWorkflow.render$lambda$28(this.f$0, context);
                }
            }, renderProps.getStyles());
            boolean z3 = reviewCapturesWithoutDocumentId.getCaptureState() == State.CaptureState.CheckCameraPermissions;
            PermissionsState permissionsState3 = PermissionsState.Camera;
            String permissionsTitle3 = renderProps.getPermissionsTitle();
            if (permissionsTitle3 == null) {
                permissionsTitle3 = "";
            }
            String permissionsRationale3 = renderProps.getPermissionsRationale();
            if (permissionsRationale3 == null) {
                permissionsRationale3 = this.applicationContext.getString(R$string.pi2_document_camera_permission_rationale);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
            }
            Context context4 = this.applicationContext;
            String string4 = context4.getString(R$string.pi2_document_camera_permission_denied_rationale, ContextUtils3.getApplicationName(context4));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            ModalContainerScreen modalContainerScreenWithRequestPermissionsIfNeeded2 = PermissionsUtils.withRequestPermissionsIfNeeded(reviewCaptures3, context, z3, permissionsState3, (19976 & 8) != 0 ? false : false, permissionsTitle3, permissionsRationale3, string4, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$30(this.f$0, renderState, (PermissionRequestWorkflow.Output) obj);
                }
            });
            if (reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog()) {
                return ModalContainerScreen2.firstInModalStack(UiStepUtils.INSTANCE.getBottomSheetViewFor(NestedUiStep2.m3256to(renderProps.getPages().getUploadOptionsDialog()), componentNamesToActions(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentWorkflow.render$lambda$31(this.f$0, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), modalContainerScreenWithRequestPermissionsIfNeeded2, "document_upload_screen");
            }
            return new ModalContainerScreen(modalContainerScreenWithRequestPermissionsIfNeeded2, CollectionsKt.emptyList(), "document_upload_screen");
        }
        if (!(renderState instanceof State.UploadDocument)) {
            throw new NoWhenBranchMatchedException();
        }
        Workflows.runningWorker(context, this.documentSubmitWorker.create(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((State.UploadDocument) renderState).getDocuments()), Reflection.typeOf(DocumentSubmitWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.render$lambda$34(this.f$0, (DocumentSubmitWorker.Response) obj);
            }
        });
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        return new Screen.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.render$lambda$35(this.f$0, context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentWorkflow.render$lambda$36(this.f$0, context);
            }
        }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$0(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Back.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$2(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.CloseUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$4(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.render$lambda$4$lambda$3(it, documentWorkflow, state, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4$lambda$3(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, WorkflowAction.Updater action) {
        State stateCopyWithCaptureState$document_release;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1) {
            DocumentCameraWorker documentCameraWorker = documentWorkflow.documentCameraWorker;
            String string2 = documentWorkflow.applicationContext.getString(R$string.pi2_camera_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (documentCameraWorker.launchTakePicture(string2)) {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.CameraRunning);
            } else {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.None);
            }
            action.setState(stateCopyWithCaptureState$document_release);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.setState(state.copyWithCaptureState$document_release(State.CaptureState.None));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$7(DocumentWorkflow documentWorkflow, final State state, final DocumentLoadWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentLoadWorker.Response.Success) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$7$lambda$5(state, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DocumentLoadWorker.Response.Error) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$7$lambda$6(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$7$lambda$5(State state, DocumentLoadWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) state;
        action.setState(State.ReviewCaptures.copy$default(reviewCaptures, ((DocumentLoadWorker.Response.Success) response).getDocuments(), null, null, new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId()), null, false, false, null, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$7$lambda$6(DocumentLoadWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new Output.Errored(((DocumentLoadWorker.Response.Error) response).getCause()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$8(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.SelectDocument.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$9(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.SelectPhotoFromLibrary.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$10(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.TakePhoto.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.OpenUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$12(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        documentWorkflow.onEvent(renderContext, new Event.RemoveDocument(((State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$13(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, State state) {
        documentWorkflow.onEvent(renderContext, new Event.Submit(((State.ReviewCaptures) state).getDocumentId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$14(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$15(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Back.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$16(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.DismissError.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$18(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.render$lambda$18$lambda$17(it, documentWorkflow, state, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18$lambda$17(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, WorkflowAction.Updater action) {
        State stateCopyWithCaptureState$document_release;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1) {
            DocumentCameraWorker documentCameraWorker = documentWorkflow.documentCameraWorker;
            String string2 = documentWorkflow.applicationContext.getString(R$string.pi2_camera_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (documentCameraWorker.launchTakePicture(string2)) {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.CameraRunning);
            } else {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.None);
            }
            action.setState(stateCopyWithCaptureState$document_release);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.setState(state.copyWithCaptureState$document_release(State.CaptureState.None));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$19(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.CloseUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4", m3645f = "DocumentWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4 */
    static final class C435684 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, State, Output, Object>.RenderContext $context;
        final /* synthetic */ String $documentId;
        int label;
        final /* synthetic */ DocumentWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C435684(StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext, DocumentWorkflow documentWorkflow, String str, Continuation<? super C435684> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = documentWorkflow;
            this.$documentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435684(this.$context, this.this$0, this.$documentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435684) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Input, State, ? extends Output>> actionSink = this.$context.getActionSink();
            DocumentWorkflow documentWorkflow = this.this$0;
            final String str = this.$documentId;
            actionSink.send(StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DocumentWorkflow.C435684.invokeSuspend$lambda$0(str, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(String str, WorkflowAction.Updater updater) {
            Object state = updater.getState();
            State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = state instanceof State.ReviewCapturesWithoutDocumentId ? (State.ReviewCapturesWithoutDocumentId) state : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.INSTANCE;
            }
            updater.setState(new State.ReviewCaptures(reviewCapturesWithoutDocumentId.getDocuments(), str, null, new State.UploadState.UploadFiles(str), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.SelectDocument.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$21(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.SelectPhotoFromLibrary.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$22(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.TakePhoto.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$23(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.OpenUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$24(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$26(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$27(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Back.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$28(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.DismissError.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$30(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.render$lambda$30$lambda$29(it, documentWorkflow, state, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$30$lambda$29(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, WorkflowAction.Updater action) {
        State stateCopyWithCaptureState$document_release;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1) {
            DocumentCameraWorker documentCameraWorker = documentWorkflow.documentCameraWorker;
            String string2 = documentWorkflow.applicationContext.getString(R$string.pi2_camera_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (documentCameraWorker.launchTakePicture(string2)) {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.CameraRunning);
            } else {
                stateCopyWithCaptureState$document_release = state.copyWithCaptureState$document_release(State.CaptureState.None);
            }
            action.setState(stateCopyWithCaptureState$document_release);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.setState(state.copyWithCaptureState$document_release(State.CaptureState.None));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$31(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.CloseUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$34(DocumentWorkflow documentWorkflow, final DocumentSubmitWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, DocumentSubmitWorker.Response.Success.INSTANCE)) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$34$lambda$32((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DocumentSubmitWorker.Response.Error) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.render$lambda$34$lambda$33(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$34$lambda$32(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Finished.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$34$lambda$33(DocumentSubmitWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new Output.Errored(((DocumentSubmitWorker.Response.Error) response).getCause()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$35(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$36(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext) {
        documentWorkflow.onEvent(renderContext, Event.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    private final void logState(Input renderProps, State renderState) {
        InquiryPage2 inquiryPage2;
        if (renderState.getCaptureState() == State.CaptureState.CameraRunning) {
            inquiryPage2 = InquiryPage2.TakePhoto.INSTANCE;
        } else if (renderState instanceof State.Start) {
            inquiryPage2 = InquiryPage2.Prompt.INSTANCE;
        } else if ((renderState instanceof State.ReviewCaptures) || (renderState instanceof State.ReviewCapturesWithoutDocumentId)) {
            inquiryPage2 = InquiryPage2.Review.INSTANCE;
        } else {
            if (!(renderState instanceof State.UploadDocument)) {
                throw new NoWhenBranchMatchedException();
            }
            inquiryPage2 = InquiryPage2.Pending.INSTANCE;
        }
        this.externalEventLogger.logPageChange(new InquiryPage.Document(renderProps.getFromStep(), inquiryPage2));
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "", "<init>", "()V", "Cancel", "Back", "SelectDocument", "SelectPhotoFromLibrary", "TakePhoto", "OpenUploadOptions", "CloseUploadOptions", "RemoveDocument", "DismissError", "Submit", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Back;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$CloseUploadOptions;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$DismissError;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$OpenUploadOptions;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$RemoveDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$SelectDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$SelectPhotoFromLibrary;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Submit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$TakePhoto;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Event {
        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Cancel extends Event {
            public static final Cancel INSTANCE = new Cancel();

            public boolean equals(Object other) {
                return this == other || (other instanceof Cancel);
            }

            public int hashCode() {
                return -1143899241;
            }

            public String toString() {
                return "Cancel";
            }

            private Cancel() {
                super(null);
            }
        }

        private Event() {
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Back;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Back extends Event {
            public static final Back INSTANCE = new Back();

            public boolean equals(Object other) {
                return this == other || (other instanceof Back);
            }

            public int hashCode() {
                return 1245705540;
            }

            public String toString() {
                return "Back";
            }

            private Back() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$SelectDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class SelectDocument extends Event {
            public static final SelectDocument INSTANCE = new SelectDocument();

            public boolean equals(Object other) {
                return this == other || (other instanceof SelectDocument);
            }

            public int hashCode() {
                return -1818587564;
            }

            public String toString() {
                return "SelectDocument";
            }

            private SelectDocument() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$SelectPhotoFromLibrary;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class SelectPhotoFromLibrary extends Event {
            public static final SelectPhotoFromLibrary INSTANCE = new SelectPhotoFromLibrary();

            public boolean equals(Object other) {
                return this == other || (other instanceof SelectPhotoFromLibrary);
            }

            public int hashCode() {
                return 1457257560;
            }

            public String toString() {
                return "SelectPhotoFromLibrary";
            }

            private SelectPhotoFromLibrary() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$TakePhoto;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class TakePhoto extends Event {
            public static final TakePhoto INSTANCE = new TakePhoto();

            public boolean equals(Object other) {
                return this == other || (other instanceof TakePhoto);
            }

            public int hashCode() {
                return -623405138;
            }

            public String toString() {
                return "TakePhoto";
            }

            private TakePhoto() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$OpenUploadOptions;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class OpenUploadOptions extends Event {
            public static final OpenUploadOptions INSTANCE = new OpenUploadOptions();

            public boolean equals(Object other) {
                return this == other || (other instanceof OpenUploadOptions);
            }

            public int hashCode() {
                return -1532240394;
            }

            public String toString() {
                return "OpenUploadOptions";
            }

            private OpenUploadOptions() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$CloseUploadOptions;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CloseUploadOptions extends Event {
            public static final CloseUploadOptions INSTANCE = new CloseUploadOptions();

            public boolean equals(Object other) {
                return this == other || (other instanceof CloseUploadOptions);
            }

            public int hashCode() {
                return -1422406686;
            }

            public String toString() {
                return "CloseUploadOptions";
            }

            private CloseUploadOptions() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$RemoveDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "getDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class RemoveDocument extends Event {
            private final DocumentFile.Remote document;
            private final String documentId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveDocument)) {
                    return false;
                }
                RemoveDocument removeDocument = (RemoveDocument) other;
                return Intrinsics.areEqual(this.documentId, removeDocument.documentId) && Intrinsics.areEqual(this.document, removeDocument.document);
            }

            public int hashCode() {
                return (this.documentId.hashCode() * 31) + this.document.hashCode();
            }

            public String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            public final DocumentFile.Remote getDocument() {
                return this.document;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveDocument(String documentId, DocumentFile.Remote document) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(document, "document");
                this.documentId = documentId;
                this.document = document;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$DismissError;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class DismissError extends Event {
            public static final DismissError INSTANCE = new DismissError();

            public boolean equals(Object other) {
                return this == other || (other instanceof DismissError);
            }

            public int hashCode() {
                return -967280389;
            }

            public String toString() {
                return "DismissError";
            }

            private DismissError() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event$Submit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Event;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Submit extends Event {
            private final String documentId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submit) && Intrinsics.areEqual(this.documentId, ((Submit) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            public String toString() {
                return "Submit(documentId=" + this.documentId + ")";
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(String documentId) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }
        }
    }

    private final void onEvent(StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext, final Event event) {
        WorkflowAction<? super Object, State, ? extends Object> workflowActionAction$default;
        if (Intrinsics.areEqual(event, Event.Cancel.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$37((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.Back.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$38((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.SelectDocument.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$39((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.SelectPhotoFromLibrary.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$40((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.TakePhoto.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$41((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.OpenUploadOptions.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$42((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.CloseUploadOptions.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$43((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (event instanceof Event.RemoveDocument) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$44(event, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (Intrinsics.areEqual(event, Event.DismissError.INSTANCE)) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$45((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else if (event instanceof Event.Submit) {
            workflowActionAction$default = StatefulWorkflow2.action$default(this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.onEvent$lambda$46(event, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        renderContext.getActionSink().send(workflowActionAction$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$37(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$38(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Back.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$39(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithCaptureState$document_release(State.CaptureState.SelectFileFromDocuments).copyWithUploadOptions$document_release(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$40(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithCaptureState$document_release(State.CaptureState.SelectImageFromPhotoLibrary).copyWithUploadOptions$document_release(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$41(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithCaptureState$document_release(State.CaptureState.CheckCameraPermissions).copyWithUploadOptions$document_release(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$42(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithUploadOptions$document_release(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$43(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithUploadOptions$document_release(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$44(Event event, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.getState() instanceof State.ReviewCaptures) {
            Event.RemoveDocument removeDocument = (Event.RemoveDocument) event;
            action.setState(State.copyWithUploadState$document_release$default((State) action.getState(), new State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$45(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State state = (State) action.getState();
        if (state instanceof State.ReviewCaptures) {
            action.setState(State.ReviewCaptures.copy$default((State.ReviewCaptures) state, null, null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$46(Event event, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Event.Submit submit = (Event.Submit) event;
        action.setState(new State.UploadDocument(((State) action.getState()).getDocuments(), submit.getDocumentId(), new State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        return Unit.INSTANCE;
    }

    private final List<Tuples2<String, Function1<UiComponent, Unit>>> componentNamesToActions(DocumentPages2 documentPages2, final StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext) {
        return new NestedUiStep.ComponentActionsBuilder().addAction(documentPages2.getSelectDocumentButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$47(this.f$0, renderContext, (UiComponent) obj);
            }
        }).addAction(documentPages2.getSelectPhotoButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$48(this.f$0, renderContext, (UiComponent) obj);
            }
        }).addAction(documentPages2.getTakePhotoButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$49(this.f$0, renderContext, (UiComponent) obj);
            }
        }).addAction(documentPages2.getLaunchUploadOptionsButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$50(this.f$0, renderContext, (UiComponent) obj);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$47(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.SelectDocument.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$48(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.SelectPhotoFromLibrary.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$49(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.TakePhoto.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$50(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.OpenUploadOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    private final List<Tuples2<String, Function1<UiComponent, Unit>>> componentNamesToActions(DocumentPages3 documentPages3, final StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext) {
        return new NestedUiStep.ComponentActionsBuilder().addAction(documentPages3.getSelectDocumentButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$51(this.f$0, renderContext, (UiComponent) obj);
            }
        }).addAction(documentPages3.getSelectPhotoButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$52(this.f$0, renderContext, (UiComponent) obj);
            }
        }).addAction(documentPages3.getTakePhotoButton(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.componentNamesToActions$lambda$53(this.f$0, renderContext, (UiComponent) obj);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$51(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.SelectDocument.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$52(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.SelectPhotoFromLibrary.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit componentNamesToActions$lambda$53(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.onEvent(renderContext, Event.TakePhoto.INSTANCE);
        return Unit.INSTANCE;
    }

    private final void run(State.CaptureState captureState, final Input input, final State state, StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext) {
        DocumentsSelectWorker documentsSelectWorkerCreateWithPhotoLibraryPicker;
        int i = WhenMappings.$EnumSwitchMapping$1[captureState.ordinal()];
        if (i == 1 || i == 2) {
            return;
        }
        if (i == 3) {
            Workflows.runningWorker(renderContext, this.documentCameraWorker, Reflection.typeOf(DocumentCameraWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$56(this.f$0, input, (DocumentCameraWorker.Output) obj);
                }
            });
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (state.getCaptureState() == State.CaptureState.SelectFileFromDocuments) {
                documentsSelectWorkerCreateWithPhotoLibraryPicker = this.documentsSelectWorkerFactory.createWithDocumentPicker();
            } else {
                documentsSelectWorkerCreateWithPhotoLibraryPicker = this.documentsSelectWorkerFactory.createWithPhotoLibraryPicker();
            }
            Workflows.runningWorker(renderContext, documentsSelectWorkerCreateWithPhotoLibraryPicker, Reflection.typeOf(DocumentsSelectWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$60(this.f$0, input, state, (DocumentsSelectWorker.Output) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction run$lambda$56(DocumentWorkflow documentWorkflow, final Input input, final DocumentCameraWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentCameraWorker.Output.Success) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$56$lambda$54(it, input, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, DocumentCameraWorker.Output.Cancel.INSTANCE)) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$56$lambda$55((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$56$lambda$54(DocumentCameraWorker.Output output, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.UploadState uploadState = ((State) action.getState()).getUploadState();
        State.CaptureState captureState = null;
        DocumentFile documentFile = null;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        action.setState(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Collection<? extends DocumentFile.Local>) ((State) action.getState()).getDocuments(), new DocumentFile.Local(((DocumentCameraWorker.Output.Success) output).getAbsoluteFilePath(), CaptureMethod.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), ((State) action.getState()).getDocumentId(), captureState, uploadState, documentFile, z, z2, str, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$56$lambda$55(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((State) action.getState()).copyWithCaptureState$document_release(State.CaptureState.None));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction run$lambda$60(final DocumentWorkflow documentWorkflow, final Input input, final State state, final DocumentsSelectWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentsSelectWorker.Output.Success) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$60$lambda$57(it, input, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DocumentsSelectWorker.Output.Failure) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$60$lambda$58(it, input, documentWorkflow, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, DocumentsSelectWorker.Output.Cancel.INSTANCE)) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$60$lambda$59(state, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$60$lambda$57(DocumentsSelectWorker.Output output, Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.CaptureState captureState = null;
        action.setState(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Collection) ((State) action.getState()).getDocuments(), (Iterable) DocumentWorkflow2.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Success) output).getAbsoluteFilePaths())), input.getDocumentFileLimit()), ((State) action.getState()).getDocumentId(), captureState, ((State) action.getState()).getUploadState(), null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$60$lambda$58(DocumentsSelectWorker.Output output, Input input, DocumentWorkflow documentWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.CaptureState captureState = null;
        action.setState(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Collection) ((State) action.getState()).getDocuments(), (Iterable) DocumentWorkflow2.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Failure) output).getAbsoluteFilePaths())), input.getDocumentFileLimit()), ((State) action.getState()).getDocumentId(), captureState, ((State) action.getState()).getUploadState(), null, false, false, documentWorkflow.applicationContext.getString(R$string.pi2_document_error_unable_to_add_file), 116, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$60$lambda$59(State state, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(state.copyWithCaptureState$document_release(State.CaptureState.None));
        return Unit.INSTANCE;
    }

    private final void run(final State.UploadState uploadState, Input input, State state, StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext) {
        if (Intrinsics.areEqual(uploadState, State.UploadState.CreateDocument.INSTANCE)) {
            if (state.getDocumentId() != null) {
                return;
            }
            Workflows.runningWorker(renderContext, this.documentCreateWorker.create(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), Reflection.typeOf(DocumentCreateWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$63(this.f$0, (DocumentCreateWorker.Response) obj);
                }
            });
            return;
        }
        if (uploadState instanceof State.UploadState.UploadFiles) {
            List<DocumentFile> documents = state.getDocuments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : documents) {
                if (obj instanceof DocumentFile.Local) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                renderContext.runningSideEffect("upload_complete", new C435694(renderContext, this, uploadState, null));
                return;
            }
            for (final DocumentFile.Local local : CollectionsKt.take(arrayList, 3)) {
                Workflows.runningWorker(renderContext, this.documentFileUploadWorker.create(input.getSessionToken(), ((State.UploadState.UploadFiles) uploadState).getDocumentId(), local), Reflection.typeOf(DocumentFileUploadWorker.class), local.getAbsoluteFilePath(), new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DocumentWorkflow.run$lambda$73$lambda$72(this.f$0, uploadState, local, (DocumentFileUploadWorker.Response) obj2);
                    }
                });
            }
            return;
        }
        if (uploadState instanceof State.UploadState.DeleteFiles) {
            if (state instanceof State.ReviewCaptures) {
                State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) state;
                DocumentFile documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                final DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                if (remote == null) {
                    return;
                }
                Workflows.runningWorker(renderContext, this.documentFileDeleteWorker.create$document_release(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), Reflection.typeOf(DocumentFileDeleteWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DocumentWorkflow.run$lambda$76(this.f$0, remote, uploadState, (DocumentFileDeleteWorker.Response) obj2);
                    }
                });
                return;
            }
            return;
        }
        if (!(uploadState instanceof State.UploadState.ReadyToSubmit)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction run$lambda$63(DocumentWorkflow documentWorkflow, final DocumentCreateWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentCreateWorker.Response.Success) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$63$lambda$61(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DocumentCreateWorker.Response.Error) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$63$lambda$62(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$63$lambda$61(DocumentCreateWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        DocumentCreateWorker.Response.Success success = (DocumentCreateWorker.Response.Success) response;
        action.setState(State.copyWithUploadState$document_release$default((State) action.getState(), new State.UploadState.ReadyToSubmit(success.getDocumentId()), success.getDocumentId(), null, null, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$63$lambda$62(DocumentCreateWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        DocumentCreateWorker.Response.Error error = (DocumentCreateWorker.Response.Error) response;
        if (!error.getCause().isRecoverable()) {
            action.setOutput(new Output.Errored(error.getCause()));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", m3645f = "DocumentWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4 */
    static final class C435694 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Input, State, Output, Object>.RenderContext $context;
        final /* synthetic */ State.UploadState $this_run;
        int label;
        final /* synthetic */ DocumentWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C435694(StatefulWorkflow<? super Input, State, ? extends Output, ? extends Object>.RenderContext renderContext, DocumentWorkflow documentWorkflow, State.UploadState uploadState, Continuation<? super C435694> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = documentWorkflow;
            this.$this_run = uploadState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435694(this.$context, this.this$0, this.$this_run, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435694) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Input, State, ? extends Output>> actionSink = this.$context.getActionSink();
            DocumentWorkflow documentWorkflow = this.this$0;
            final State.UploadState uploadState = this.$this_run;
            actionSink.send(StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DocumentWorkflow.C435694.invokeSuspend$lambda$0(uploadState, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(State.UploadState uploadState, WorkflowAction.Updater updater) {
            updater.setState(State.copyWithUploadState$document_release$default((State) updater.getState(), new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId()), null, null, null, 14, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction run$lambda$73$lambda$72(final DocumentWorkflow documentWorkflow, final State.UploadState uploadState, final DocumentFile.Local local, final DocumentFileUploadWorker.Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof DocumentFileUploadWorker.Response.Success) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$73$lambda$72$lambda$66(uploadState, response, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (response instanceof DocumentFileUploadWorker.Response.ProgressUpdate) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$73$lambda$72$lambda$68(local, response, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (response instanceof DocumentFileUploadWorker.Response.DocumentUploadError) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda68
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$73$lambda$72$lambda$70(local, uploadState, response, documentWorkflow, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (response instanceof DocumentFileUploadWorker.Response.NetworkError) {
            return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda69
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentWorkflow.run$lambda$73$lambda$72$lambda$71(response, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$73$lambda$72$lambda$66(State.UploadState uploadState, DocumentFileUploadWorker.Response response, WorkflowAction.Updater action) {
        State.UploadState readyToSubmit;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> documents = ((State) action.getState()).getDocuments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documents, 10));
        for (Parcelable newRemoteDocument : documents) {
            DocumentFileUploadWorker.Response.Success success = (DocumentFileUploadWorker.Response.Success) response;
            if (Intrinsics.areEqual(newRemoteDocument, success.getOldLocalDocument())) {
                newRemoteDocument = success.getNewRemoteDocument();
            }
            arrayList.add(newRemoteDocument);
        }
        if (arrayList.isEmpty()) {
            readyToSubmit = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    readyToSubmit = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
            readyToSubmit = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        }
        action.setState(State.copyWithUploadState$document_release$default((State) action.getState(), readyToSubmit, null, arrayList, null, 10, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$73$lambda$72$lambda$68(DocumentFile.Local local, DocumentFileUploadWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> documents = ((State) action.getState()).getDocuments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documents, 10));
        for (Parcelable parcelableCopy$default : documents) {
            if ((parcelableCopy$default instanceof DocumentFile.Local) && Intrinsics.areEqual(parcelableCopy$default, local)) {
                parcelableCopy$default = DocumentFile.Local.copy$default((DocumentFile.Local) parcelableCopy$default, null, null, ((DocumentFileUploadWorker.Response.ProgressUpdate) response).getProgressPercentage(), 3, null);
            }
            arrayList.add(parcelableCopy$default);
        }
        action.setState(State.copyWithUploadState$document_release$default((State) action.getState(), ((State) action.getState()).getUploadState(), null, arrayList, null, 10, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$73$lambda$72$lambda$70(DocumentFile.Local local, State.UploadState uploadState, DocumentFileUploadWorker.Response response, DocumentWorkflow documentWorkflow, WorkflowAction.Updater action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List listMinus = CollectionsKt.minus(((State) action.getState()).getDocuments(), local);
        List list = listMinus;
        if ((list instanceof Collection) && list.isEmpty()) {
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        }
        action.setState(new State.ReviewCaptures(listMinus, ((State.UploadState.UploadFiles) uploadState).getDocumentId(), State.CaptureState.None, uploadFiles, null, false, false, DocumentWorkflow2.toMessage(((DocumentFileUploadWorker.Response.DocumentUploadError) response).getCause(), documentWorkflow.applicationContext), 80, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$73$lambda$72$lambda$71(DocumentFileUploadWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new Output.Errored(((DocumentFileUploadWorker.Response.NetworkError) response).getCause()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction run$lambda$76(DocumentWorkflow documentWorkflow, final DocumentFile.Remote remote, final State.UploadState uploadState, final DocumentFileDeleteWorker.Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return StatefulWorkflow2.action$default(documentWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentWorkflow.run$lambda$76$lambda$75(remote, uploadState, response, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$76$lambda$75(DocumentFile.Remote remote, State.UploadState uploadState, DocumentFileDeleteWorker.Response response, WorkflowAction.Updater action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        State.ReviewCaptures reviewCaptures = state instanceof State.ReviewCaptures ? (State.ReviewCaptures) state : null;
        if (reviewCaptures == null) {
            return Unit.INSTANCE;
        }
        List listMinus = CollectionsKt.minus(reviewCaptures.getDocuments(), remote);
        List list = listMinus;
        if ((list instanceof Collection) && list.isEmpty()) {
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
            }
            uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
        }
        State.UploadState uploadState2 = uploadFiles;
        if (response instanceof DocumentFileDeleteWorker.Response.Success) {
            action.setState(State.ReviewCaptures.copy$default(reviewCaptures, listMinus, null, null, uploadState2, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null));
        } else {
            if (!(response instanceof DocumentFileDeleteWorker.Response.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            action.setOutput(new Output.Errored(((DocumentFileDeleteWorker.Response.Error) response).getCause()));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b8\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b9\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bE\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\bF\u0010&R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\bG\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\bH\u0010&R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\bI\u0010&R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010P\u001a\u0004\bQ\u0010R¨\u0006S"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "startPage", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "", "documentFileLimit", "", "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionToken", "getInquiryId", "getFromStep", "getFromComponent", "getPromptTitle", "getPromptDescription", "getDisclaimer", "getSubmitButtonText", "getPendingTitle", "getPendingDescription", "getFieldKeyDocument", "getKind", "getDocumentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "getStartPage", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "getPages", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "I", "getDocumentFileLimit", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getPermissionsTitle", "getPermissionsRationale", "getPermissionsModalPositiveButton", "getPermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Input {
        private final NextStep.Document.AssetConfig assetConfig;
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final String disclaimer;
        private final int documentFileLimit;
        private final String documentId;
        private final String fieldKeyDocument;
        private final String fromComponent;
        private final String fromStep;
        private final String inquiryId;
        private final String kind;
        private final DocumentPages pages;
        private final String pendingDescription;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final String pendingTitle;
        private final String permissionsModalNegativeButton;
        private final String permissionsModalPositiveButton;
        private final String permissionsRationale;
        private final String permissionsTitle;
        private final String promptDescription;
        private final String promptTitle;
        private final String sessionToken;
        private final StartPage startPage;
        private final StepStyles.DocumentStepStyle styles;
        private final String submitButtonText;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.fromStep, input.fromStep) && Intrinsics.areEqual(this.fromComponent, input.fromComponent) && Intrinsics.areEqual(this.promptTitle, input.promptTitle) && Intrinsics.areEqual(this.promptDescription, input.promptDescription) && Intrinsics.areEqual(this.disclaimer, input.disclaimer) && Intrinsics.areEqual(this.submitButtonText, input.submitButtonText) && Intrinsics.areEqual(this.pendingTitle, input.pendingTitle) && Intrinsics.areEqual(this.pendingDescription, input.pendingDescription) && Intrinsics.areEqual(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.areEqual(this.kind, input.kind) && Intrinsics.areEqual(this.documentId, input.documentId) && Intrinsics.areEqual(this.startPage, input.startPage) && Intrinsics.areEqual(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.areEqual(this.permissionsTitle, input.permissionsTitle) && Intrinsics.areEqual(this.permissionsRationale, input.permissionsRationale) && Intrinsics.areEqual(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.areEqual(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition;
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31;
            String str = this.promptTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.kind.hashCode()) * 31;
            String str7 = this.documentId;
            int iHashCode8 = (((((((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.startPage.hashCode()) * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.documentFileLimit)) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31;
            String str8 = this.permissionsTitle;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            return ((((iHashCode12 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0)) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode();
        }

        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromStep=" + this.fromStep + ", fromComponent=" + this.fromComponent + ", promptTitle=" + this.promptTitle + ", promptDescription=" + this.promptDescription + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", pendingTitle=" + this.pendingTitle + ", pendingDescription=" + this.pendingDescription + ", fieldKeyDocument=" + this.fieldKeyDocument + ", kind=" + this.kind + ", documentId=" + this.documentId + ", startPage=" + this.startPage + ", pages=" + this.pages + ", documentFileLimit=" + this.documentFileLimit + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", permissionsTitle=" + this.permissionsTitle + ", permissionsRationale=" + this.permissionsRationale + ", permissionsModalPositiveButton=" + this.permissionsModalPositiveButton + ", permissionsModalNegativeButton=" + this.permissionsModalNegativeButton + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
        }

        public Input(String sessionToken, String inquiryId, String fromStep, String fromComponent, String str, String str2, String str3, String str4, String str5, String str6, String fieldKeyDocument, String kind, String str7, StartPage startPage, DocumentPages pages, int i, boolean z, boolean z2, String str8, String str9, String str10, String str11, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(startPage, "startPage");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.promptTitle = str;
            this.promptDescription = str2;
            this.disclaimer = str3;
            this.submitButtonText = str4;
            this.pendingTitle = str5;
            this.pendingDescription = str6;
            this.fieldKeyDocument = fieldKeyDocument;
            this.kind = kind;
            this.documentId = str7;
            this.startPage = startPage;
            this.pages = pages;
            this.documentFileLimit = i;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.permissionsTitle = str8;
            this.permissionsRationale = str9;
            this.permissionsModalPositiveButton = str10;
            this.permissionsModalNegativeButton = str11;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
        }

        public final String getSessionToken() {
            return this.sessionToken;
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

        public final String getPromptTitle() {
            return this.promptTitle;
        }

        public final String getPromptDescription() {
            return this.promptDescription;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }

        public final String getPendingTitle() {
            return this.pendingTitle;
        }

        public final String getPendingDescription() {
            return this.pendingDescription;
        }

        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getDocumentId() {
            return this.documentId;
        }

        public final StartPage getStartPage() {
            return this.startPage;
        }

        public final DocumentPages getPages() {
            return this.pages;
        }

        public final int getDocumentFileLimit() {
            return this.documentFileLimit;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }

        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Landroid/os/Parcelable;", "Prompt", "Review", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface StartPage extends Parcelable {

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Prompt implements StartPage {
            public static final Prompt INSTANCE = new Prompt();
            public static final Parcelable.Creator<Prompt> CREATOR = new Creator();

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Prompt> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Prompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Prompt.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Prompt[] newArray(int i) {
                    return new Prompt[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Prompt);
            }

            public int hashCode() {
                return 813153962;
            }

            public String toString() {
                return "Prompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Prompt() {
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Review implements StartPage {
            public static final Parcelable.Creator<Review> CREATOR = new Creator();
            private final String documentId;

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Review> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Review createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Review(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Review[] newArray(int i) {
                    return new Review[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Review) && Intrinsics.areEqual(this.documentId, ((Review) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            public String toString() {
                return "Review(documentId=" + this.documentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.documentId);
            }

            public Review(String documentId) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            public final String getDocumentId() {
                return this.documentId;
            }
        }
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "", "<init>", "()V", "Canceled", "Back", "Errored", "Finished", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Errored;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Finished;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Canceled extends Output {
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            public int hashCode() {
                return -1234032835;
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

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Back extends Output {
            public static final Back INSTANCE = new Back();

            public boolean equals(Object other) {
                return this == other || (other instanceof Back);
            }

            public int hashCode() {
                return 89823627;
            }

            public String toString() {
                return "Back";
            }

            private Back() {
                super(null);
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Errored;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Errored extends Output {
            private final InternalErrorInfo cause;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Errored) && Intrinsics.areEqual(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Errored(InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output$Finished;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public boolean equals(Object other) {
                return this == other || (other instanceof Finished);
            }

            public int hashCode() {
                return -1784519914;
            }

            public String toString() {
                return "Finished";
            }

            private Finished() {
                super(null);
            }
        }
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u001e\u001f !\"#B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001aJ?\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0004$%&'¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Landroid/os/Parcelable;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "uploadState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "documentId", "", "documents", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V", "getCaptureState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "getUploadState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getDocumentId", "()Ljava/lang/String;", "getDocuments", "()Ljava/util/List;", "copyWithUploadOptions", "shouldShowUploadOptionsDialog", "", "copyWithUploadOptions$document_release", "copyWithCaptureState", "copyWithCaptureState$document_release", "copyWithUploadState", "documentFileToDelete", "copyWithUploadState$document_release", "CaptureState", "UploadState", "Start", "ReviewCapturesWithoutDocumentId", "ReviewCaptures", "UploadDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class State implements Parcelable {
        private final CaptureState captureState;
        private final String documentId;
        private final List<DocumentFile> documents;
        private final UploadState uploadState;

        public /* synthetic */ State(CaptureState captureState, UploadState uploadState, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(captureState, uploadState, str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private State(CaptureState captureState, UploadState uploadState, String str, List<? extends DocumentFile> list) {
            this.captureState = captureState;
            this.uploadState = uploadState;
            this.documentId = str;
            this.documents = list;
        }

        public CaptureState getCaptureState() {
            return this.captureState;
        }

        public UploadState getUploadState() {
            return this.uploadState;
        }

        public String getDocumentId() {
            return this.documentId;
        }

        public List<DocumentFile> getDocuments() {
            return this.documents;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "", "<init>", "(Ljava/lang/String;I)V", "None", "CheckCameraPermissions", "CameraRunning", "SelectFileFromDocuments", "SelectImageFromPhotoLibrary", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class CaptureState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CaptureState[] $VALUES;
            public static final CaptureState None = new CaptureState("None", 0);
            public static final CaptureState CheckCameraPermissions = new CaptureState("CheckCameraPermissions", 1);
            public static final CaptureState CameraRunning = new CaptureState("CameraRunning", 2);
            public static final CaptureState SelectFileFromDocuments = new CaptureState("SelectFileFromDocuments", 3);
            public static final CaptureState SelectImageFromPhotoLibrary = new CaptureState("SelectImageFromPhotoLibrary", 4);

            private static final /* synthetic */ CaptureState[] $values() {
                return new CaptureState[]{None, CheckCameraPermissions, CameraRunning, SelectFileFromDocuments, SelectImageFromPhotoLibrary};
            }

            public static EnumEntries<CaptureState> getEntries() {
                return $ENTRIES;
            }

            private CaptureState(String str, int i) {
            }

            static {
                CaptureState[] captureStateArr$values = $values();
                $VALUES = captureStateArr$values;
                $ENTRIES = EnumEntries2.enumEntries(captureStateArr$values);
            }

            public static CaptureState valueOf(String str) {
                return (CaptureState) Enum.valueOf(CaptureState.class, str);
            }

            public static CaptureState[] values() {
                return (CaptureState[]) $VALUES.clone();
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Landroid/os/Parcelable;", "CreateDocument", "UploadFiles", "DeleteFiles", "ReadyToSubmit", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public interface UploadState extends Parcelable {

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class CreateDocument implements UploadState {
                public static final CreateDocument INSTANCE = new CreateDocument();
                public static final Parcelable.Creator<CreateDocument> CREATOR = new Creator();

                /* compiled from: DocumentWorkflow.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<CreateDocument> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CreateDocument createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return CreateDocument.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CreateDocument[] newArray(int i) {
                        return new CreateDocument[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof CreateDocument);
                }

                public int hashCode() {
                    return 1079141691;
                }

                public String toString() {
                    return "CreateDocument";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }

                private CreateDocument() {
                }
            }

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class UploadFiles implements UploadState {
                public static final Parcelable.Creator<UploadFiles> CREATOR = new Creator();
                private final String documentId;

                /* compiled from: DocumentWorkflow.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<UploadFiles> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UploadFiles(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadFiles[] newArray(int i) {
                        return new UploadFiles[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UploadFiles) && Intrinsics.areEqual(this.documentId, ((UploadFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "UploadFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }

                public UploadFiles(String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                public final String getDocumentId() {
                    return this.documentId;
                }
            }

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class DeleteFiles implements UploadState {
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new Creator();
                private final String documentId;

                /* compiled from: DocumentWorkflow.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<DeleteFiles> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DeleteFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DeleteFiles(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DeleteFiles[] newArray(int i) {
                        return new DeleteFiles[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DeleteFiles) && Intrinsics.areEqual(this.documentId, ((DeleteFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "DeleteFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }

                public DeleteFiles(String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                public final String getDocumentId() {
                    return this.documentId;
                }
            }

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class ReadyToSubmit implements UploadState {
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new Creator();
                private final String documentId;

                /* compiled from: DocumentWorkflow.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<ReadyToSubmit> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ReadyToSubmit createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ReadyToSubmit(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ReadyToSubmit[] newArray(int i) {
                        return new ReadyToSubmit[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReadyToSubmit) && Intrinsics.areEqual(this.documentId, ((ReadyToSubmit) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "ReadyToSubmit(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }

                public ReadyToSubmit(String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "", "documentId", "", "shouldShowUploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "getCaptureState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getUploadState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Ljava/lang/String;", "getDocumentId", "Z", "getShouldShowUploadOptionsDialog", "()Z", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Start extends State {
            public static final Parcelable.Creator<Start> CREATOR = new Creator();
            private final CaptureState captureState;
            private final String documentId;
            private final boolean shouldShowUploadOptionsDialog;
            private final UploadState uploadState;

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Start> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Start createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Start(CaptureState.valueOf(parcel.readString()), (UploadState) parcel.readParcelable(Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Start[] newArray(int i) {
                    return new Start[i];
                }
            }

            public static /* synthetic */ Start copy$default(Start start, CaptureState captureState, UploadState uploadState, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    captureState = start.captureState;
                }
                if ((i & 2) != 0) {
                    uploadState = start.uploadState;
                }
                if ((i & 4) != 0) {
                    str = start.documentId;
                }
                if ((i & 8) != 0) {
                    z = start.shouldShowUploadOptionsDialog;
                }
                return start.copy(captureState, uploadState, str, z);
            }

            public final Start copy(CaptureState captureState, UploadState uploadState, String documentId, boolean shouldShowUploadOptionsDialog) {
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new Start(captureState, uploadState, documentId, shouldShowUploadOptionsDialog);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.captureState == start.captureState && Intrinsics.areEqual(this.uploadState, start.uploadState) && Intrinsics.areEqual(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            public int hashCode() {
                int iHashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            public String toString() {
                return "Start(captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentId=" + this.documentId + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.documentId);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            public /* synthetic */ Start(CaptureState captureState, UploadState uploadState, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CaptureState.None : captureState, (i & 2) != 0 ? UploadState.CreateDocument.INSTANCE : uploadState, str, (i & 8) != 0 ? false : z);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public String getDocumentId() {
                return this.documentId;
            }

            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(CaptureState captureState, UploadState uploadState, String str, boolean z) {
                super(captureState, uploadState, str, CollectionsKt.emptyList(), null);
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b6\u0010\u001e¨\u00067"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Ljava/lang/String;", "getDocumentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "getCaptureState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getUploadState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "getDocumentFileToDelete", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "getReloadingFromPreviousSession", "()Z", "getShouldShowUploadOptionsDialog", "getError", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ReviewCapturesWithoutDocumentId extends State {
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new Creator();
            private final CaptureState captureState;
            private final DocumentFile documentFileToDelete;
            private final String documentId;
            private final List<DocumentFile> documents;
            private final String error;
            private final boolean reloadingFromPreviousSession;
            private final boolean shouldShowUploadOptionsDialog;
            private final UploadState uploadState;

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ReviewCapturesWithoutDocumentId> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewCapturesWithoutDocumentId createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader()));
                    }
                    String string2 = parcel.readString();
                    CaptureState captureStateValueOf = CaptureState.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    boolean z2 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    return new ReviewCapturesWithoutDocumentId(arrayList, string2, captureStateValueOf, uploadState, documentFile, z2, parcel.readInt() != 0 ? z : false, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewCapturesWithoutDocumentId[] newArray(int i) {
                    return new ReviewCapturesWithoutDocumentId[i];
                }
            }

            public static /* synthetic */ ReviewCapturesWithoutDocumentId copy$default(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                if ((i & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                if ((i & 4) != 0) {
                    captureState = reviewCapturesWithoutDocumentId.captureState;
                }
                if ((i & 8) != 0) {
                    uploadState = reviewCapturesWithoutDocumentId.uploadState;
                }
                if ((i & 16) != 0) {
                    documentFile = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                if ((i & 32) != 0) {
                    z = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                }
                if ((i & 64) != 0) {
                    z2 = reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog;
                }
                if ((i & 128) != 0) {
                    str2 = reviewCapturesWithoutDocumentId.error;
                }
                boolean z3 = z2;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z4 = z;
                return reviewCapturesWithoutDocumentId.copy(list, str, captureState, uploadState, documentFile2, z4, z3, str3);
            }

            public final ReviewCapturesWithoutDocumentId copy(List<? extends DocumentFile> documents, String documentId, CaptureState captureState, UploadState uploadState, DocumentFile documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCapturesWithoutDocumentId(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCapturesWithoutDocumentId)) {
                    return false;
                }
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) other;
                return Intrinsics.areEqual(this.documents, reviewCapturesWithoutDocumentId.documents) && Intrinsics.areEqual(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && Intrinsics.areEqual(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && Intrinsics.areEqual(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && Intrinsics.areEqual(this.error, reviewCapturesWithoutDocumentId.error);
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int iHashCode3 = (((((iHashCode2 + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ReviewCapturesWithoutDocumentId(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public List<DocumentFile> getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public String getDocumentId() {
                return this.documentId;
            }

            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i & 4) != 0 ? CaptureState.None : captureState, (i & 8) != 0 ? UploadState.CreateDocument.INSTANCE : uploadState, (i & 16) != 0 ? null : documentFile, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : str2);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public UploadState getUploadState() {
                return this.uploadState;
            }

            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            public final String getError() {
                return this.error;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesWithoutDocumentId(List<? extends DocumentFile> documents, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2) {
                super(captureState, uploadState, str, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z;
                this.shouldShowUploadOptionsDialog = z2;
                this.error = str2;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b6\u0010\u001e¨\u00067"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Ljava/lang/String;", "getDocumentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "getCaptureState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$CaptureState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getUploadState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "getDocumentFileToDelete", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "getReloadingFromPreviousSession", "()Z", "getShouldShowUploadOptionsDialog", "getError", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ReviewCaptures extends State {
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new Creator();
            private final CaptureState captureState;
            private final DocumentFile documentFileToDelete;
            private final String documentId;
            private final List<DocumentFile> documents;
            private final String error;
            private final boolean reloadingFromPreviousSession;
            private final boolean shouldShowUploadOptionsDialog;
            private final UploadState uploadState;

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ReviewCaptures> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewCaptures createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                    }
                    String string2 = parcel.readString();
                    CaptureState captureStateValueOf = CaptureState.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    boolean z2 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    return new ReviewCaptures(arrayList, string2, captureStateValueOf, uploadState, documentFile, z2, parcel.readInt() != 0 ? z : false, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewCaptures[] newArray(int i) {
                    return new ReviewCaptures[i];
                }
            }

            public static /* synthetic */ ReviewCaptures copy$default(ReviewCaptures reviewCaptures, List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                if ((i & 2) != 0) {
                    str = reviewCaptures.documentId;
                }
                if ((i & 4) != 0) {
                    captureState = reviewCaptures.captureState;
                }
                if ((i & 8) != 0) {
                    uploadState = reviewCaptures.uploadState;
                }
                if ((i & 16) != 0) {
                    documentFile = reviewCaptures.documentFileToDelete;
                }
                if ((i & 32) != 0) {
                    z = reviewCaptures.reloadingFromPreviousSession;
                }
                if ((i & 64) != 0) {
                    z2 = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                if ((i & 128) != 0) {
                    str2 = reviewCaptures.error;
                }
                boolean z3 = z2;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z4 = z;
                return reviewCaptures.copy(list, str, captureState, uploadState, documentFile2, z4, z3, str3);
            }

            public final ReviewCaptures copy(List<? extends DocumentFile> documents, String documentId, CaptureState captureState, UploadState uploadState, DocumentFile documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.areEqual(this.documents, reviewCaptures.documents) && Intrinsics.areEqual(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && Intrinsics.areEqual(this.uploadState, reviewCaptures.uploadState) && Intrinsics.areEqual(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCaptures.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.areEqual(this.error, reviewCaptures.error);
            }

            public int hashCode() {
                int iHashCode = ((((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int iHashCode2 = (((((iHashCode + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str = this.error;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "ReviewCaptures(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public List<DocumentFile> getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public String getDocumentId() {
                return this.documentId;
            }

            public /* synthetic */ ReviewCaptures(List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i & 4) != 0 ? CaptureState.None : captureState, (i & 8) != 0 ? UploadState.CreateDocument.INSTANCE : uploadState, (i & 16) != 0 ? null : documentFile, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : str2);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public UploadState getUploadState() {
                return this.uploadState;
            }

            public final DocumentFile getDocumentFileToDelete() {
                return this.documentFileToDelete;
            }

            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            public final String getError() {
                return this.error;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(List<? extends DocumentFile> documents, String documentId, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str) {
                super(captureState, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z;
                this.shouldShowUploadOptionsDialog = z2;
                this.error = str;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Ljava/lang/String;", "getDocumentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getUploadState", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "getError", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class UploadDocument extends State {
            public static final Parcelable.Creator<UploadDocument> CREATOR = new Creator();
            private final String documentId;
            private final List<DocumentFile> documents;
            private final String error;
            private final UploadState uploadState;

            /* compiled from: DocumentWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<UploadDocument> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UploadDocument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), (UploadState) parcel.readParcelable(UploadDocument.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UploadDocument[] newArray(int i) {
                    return new UploadDocument[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UploadDocument copy$default(UploadDocument uploadDocument, List list, String str, UploadState uploadState, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i & 4) != 0) {
                    uploadState = uploadDocument.uploadState;
                }
                if ((i & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.copy(list, str, uploadState, str2);
            }

            public final UploadDocument copy(List<? extends DocumentFile> documents, String documentId, UploadState uploadState, String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new UploadDocument(documents, documentId, uploadState, error);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) other;
                return Intrinsics.areEqual(this.documents, uploadDocument.documents) && Intrinsics.areEqual(this.documentId, uploadDocument.documentId) && Intrinsics.areEqual(this.uploadState, uploadDocument.uploadState) && Intrinsics.areEqual(this.error, uploadDocument.error);
            }

            public int hashCode() {
                int iHashCode = ((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                String str = this.error;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "UploadDocument(documents=" + this.documents + ", documentId=" + this.documentId + ", uploadState=" + this.uploadState + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public List<DocumentFile> getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public String getDocumentId() {
                return this.documentId;
            }

            public /* synthetic */ UploadDocument(List list, String str, UploadState uploadState, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i & 4) != 0 ? UploadState.CreateDocument.INSTANCE : uploadState, (i & 8) != 0 ? null : str2);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public UploadState getUploadState() {
                return this.uploadState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UploadDocument(List<? extends DocumentFile> documents, String documentId, UploadState uploadState, String str) {
                super(CaptureState.None, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.uploadState = uploadState;
                this.error = str;
            }
        }

        public final State copyWithUploadOptions$document_release(boolean shouldShowUploadOptionsDialog) {
            if (this instanceof Start) {
                return Start.copy$default((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.copy$default((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.copy$default((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final State copyWithCaptureState$document_release(CaptureState captureState) {
            Intrinsics.checkNotNullParameter(captureState, "captureState");
            if (this instanceof Start) {
                return Start.copy$default((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.copy$default((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.copy$default((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copyWithUploadState$document_release$default(State state, UploadState uploadState, String str, List list, DocumentFile documentFile, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithUploadState");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            if ((i & 8) != 0) {
                documentFile = null;
            }
            return state.copyWithUploadState$document_release(uploadState, str, list, documentFile);
        }

        public final State copyWithUploadState$document_release(UploadState uploadState, String documentId, List<? extends DocumentFile> documents, DocumentFile documentFileToDelete) {
            Intrinsics.checkNotNullParameter(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = start.getDocumentId();
                }
                return Start.copy$default(start, null, uploadState, documentId, false, 9, null);
            }
            if (this instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) this;
                if (documents == null) {
                    documents = reviewCaptures.getDocuments();
                }
                return ReviewCaptures.copy$default(reviewCaptures, documents, null, null, uploadState, documentFileToDelete, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) this;
                if (documentId == null) {
                    documentId = reviewCapturesWithoutDocumentId.getDocumentId();
                }
                String str = documentId;
                if (documents == null) {
                    documents = reviewCapturesWithoutDocumentId.getDocuments();
                }
                return ReviewCapturesWithoutDocumentId.copy$default(reviewCapturesWithoutDocumentId, documents, str, null, uploadState, documentFileToDelete, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            }
            if (this instanceof UploadDocument) {
                return UploadDocument.copy$default((UploadDocument) this, null, null, uploadState, null, 11, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DocumentWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen;", "", "<init>", "()V", "ReviewCaptures", "LoadingAnimation", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$LoadingAnimation;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$ReviewCaptures;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Screen {
        public /* synthetic */ Screen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Screen() {
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b4\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b>\u0010=R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b@\u0010=R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bD\u0010=R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bE\u0010=R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010;\u001a\u0004\bF\u0010=R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bJ\u0010IR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\bL\u0010%R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\bM\u0010=R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen;", "Lcoil/ImageLoader;", "imageLoader", "", "title", "prompt", "disclaimer", "submitButtonText", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "onRemove", "onSubmit", "onCancel", "onBack", "", "disabled", "addButtonEnabled", "submitButtonEnabled", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lcoil/ImageLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "Ljava/lang/String;", "getTitle", "getPrompt", "getDisclaimer", "getSubmitButtonText", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOpenSelectFile", "()Lkotlin/jvm/functions/Function0;", "getSelectFromPhotoLibrary", "getOpenCamera", "getOpenUploadOptions", "Lkotlin/jvm/functions/Function1;", "getOnRemove", "()Lkotlin/jvm/functions/Function1;", "getOnSubmit", "getOnCancel", "getOnBack", "Z", "getDisabled", "()Z", "getAddButtonEnabled", "getSubmitButtonEnabled", "getError", "getOnErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ReviewCaptures extends Screen {
            private final boolean addButtonEnabled;
            private final boolean disabled;
            private final String disclaimer;
            private final List<DocumentFile> documents;
            private final String error;
            private final ImageLoader imageLoader;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final Function0<Unit> onErrorDismissed;
            private final Function1<DocumentFile.Remote, Unit> onRemove;
            private final Function0<Unit> onSubmit;
            private final Function0<Unit> openCamera;
            private final Function0<Unit> openSelectFile;
            private final Function0<Unit> openUploadOptions;
            private final String prompt;
            private final Function0<Unit> selectFromPhotoLibrary;
            private final StepStyles.DocumentStepStyle styles;
            private final boolean submitButtonEnabled;
            private final String submitButtonText;
            private final String title;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.areEqual(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.areEqual(this.title, reviewCaptures.title) && Intrinsics.areEqual(this.prompt, reviewCaptures.prompt) && Intrinsics.areEqual(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.areEqual(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.areEqual(this.documents, reviewCaptures.documents) && Intrinsics.areEqual(this.navigationState, reviewCaptures.navigationState) && Intrinsics.areEqual(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.areEqual(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.areEqual(this.openCamera, reviewCaptures.openCamera) && Intrinsics.areEqual(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.areEqual(this.onRemove, reviewCaptures.onRemove) && Intrinsics.areEqual(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.areEqual(this.onCancel, reviewCaptures.onCancel) && Intrinsics.areEqual(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.areEqual(this.error, reviewCaptures.error) && Intrinsics.areEqual(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.areEqual(this.styles, reviewCaptures.styles);
            }

            public int hashCode() {
                int iHashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.openSelectFile.hashCode()) * 31) + this.selectFromPhotoLibrary.hashCode()) * 31) + this.openCamera.hashCode()) * 31) + this.openUploadOptions.hashCode()) * 31) + this.onRemove.hashCode()) * 31) + this.onSubmit.hashCode()) * 31) + this.onCancel.hashCode()) * 31) + this.onBack.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.addButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31;
                String str5 = this.error;
                int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                return iHashCode6 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0);
            }

            public String toString() {
                return "ReviewCaptures(imageLoader=" + this.imageLoader + ", title=" + this.title + ", prompt=" + this.prompt + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", documents=" + this.documents + ", navigationState=" + this.navigationState + ", openSelectFile=" + this.openSelectFile + ", selectFromPhotoLibrary=" + this.selectFromPhotoLibrary + ", openCamera=" + this.openCamera + ", openUploadOptions=" + this.openUploadOptions + ", onRemove=" + this.onRemove + ", onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onBack=" + this.onBack + ", disabled=" + this.disabled + ", addButtonEnabled=" + this.addButtonEnabled + ", submitButtonEnabled=" + this.submitButtonEnabled + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ")";
            }

            public final ImageLoader getImageLoader() {
                return this.imageLoader;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getSubmitButtonText() {
                return this.submitButtonText;
            }

            public final List<DocumentFile> getDocuments() {
                return this.documents;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function0<Unit> getOpenUploadOptions() {
                return this.openUploadOptions;
            }

            public final Function1<DocumentFile.Remote, Unit> getOnRemove() {
                return this.onRemove;
            }

            public final Function0<Unit> getOnSubmit() {
                return this.onSubmit;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final boolean getDisabled() {
                return this.disabled;
            }

            public final boolean getAddButtonEnabled() {
                return this.addButtonEnabled;
            }

            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            public final String getError() {
                return this.error;
            }

            public final Function0<Unit> getOnErrorDismissed() {
                return this.onErrorDismissed;
            }

            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(ImageLoader imageLoader, String str, String str2, String str3, String str4, List<? extends DocumentFile> documents, NavigationState navigationState, Function0<Unit> openSelectFile, Function0<Unit> selectFromPhotoLibrary, Function0<Unit> openCamera, Function0<Unit> openUploadOptions, Function1<? super DocumentFile.Remote, Unit> onRemove, Function0<Unit> onSubmit, Function0<Unit> onCancel, Function0<Unit> onBack, boolean z, boolean z2, boolean z3, String str5, Function0<Unit> onErrorDismissed, StepStyles.DocumentStepStyle documentStepStyle) {
                super(null);
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(openSelectFile, "openSelectFile");
                Intrinsics.checkNotNullParameter(selectFromPhotoLibrary, "selectFromPhotoLibrary");
                Intrinsics.checkNotNullParameter(openCamera, "openCamera");
                Intrinsics.checkNotNullParameter(openUploadOptions, "openUploadOptions");
                Intrinsics.checkNotNullParameter(onRemove, "onRemove");
                Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.imageLoader = imageLoader;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = documents;
                this.navigationState = navigationState;
                this.openSelectFile = openSelectFile;
                this.selectFromPhotoLibrary = selectFromPhotoLibrary;
                this.openCamera = openCamera;
                this.openUploadOptions = openUploadOptions;
                this.onRemove = onRemove;
                this.onSubmit = onSubmit;
                this.onCancel = onCancel;
                this.onBack = onBack;
                this.disabled = z;
                this.addButtonEnabled = z2;
                this.submitButtonEnabled = z3;
                this.error = str5;
                this.onErrorDismissed = onErrorDismissed;
                this.styles = documentStepStyle;
            }
        }

        /* compiled from: DocumentWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$LoadingAnimation;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen;", "", "title", "prompt", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getPrompt", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class LoadingAnimation extends Screen {
            private final NextStep.Document.AssetConfig.PendingPage assetConfig;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final String prompt;
            private final StepStyles.DocumentStepStyle styles;
            private final String title;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) other;
                return Intrinsics.areEqual(this.title, loadingAnimation.title) && Intrinsics.areEqual(this.prompt, loadingAnimation.prompt) && Intrinsics.areEqual(this.navigationState, loadingAnimation.navigationState) && Intrinsics.areEqual(this.onBack, loadingAnimation.onBack) && Intrinsics.areEqual(this.onCancel, loadingAnimation.onCancel) && Intrinsics.areEqual(this.styles, loadingAnimation.styles) && Intrinsics.areEqual(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                return ((iHashCode3 + (pendingPage != null ? pendingPage.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode();
            }

            public String toString() {
                return "LoadingAnimation(title=" + this.title + ", prompt=" + this.prompt + ", navigationState=" + this.navigationState + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getPrompt() {
                return this.prompt;
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

            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            public final NextStep.Document.AssetConfig.PendingPage getAssetConfig() {
                return this.assetConfig;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadingAnimation(String str, String str2, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextVerticalPosition) {
                super(null);
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            }
        }
    }
}
