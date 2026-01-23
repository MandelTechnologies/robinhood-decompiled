package com.robinhood.android.doc.p109ui.photo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.CameraFragment;
import com.robinhood.android.camera.CameraUtils;
import com.robinhood.android.camera.CapturePhotoResult;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadCaptureDocumentBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.photo.DocUploadCaptureDocumentFragment;
import com.robinhood.android.doc.p109ui.photo.PhotoEvent;
import com.robinhood.android.doc.p109ui.photo.RequirementsBottomSheetFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: DocUploadCaptureDocumentFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\u001cH\u0002J\u0018\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010@\u001a\u00020-H\u0016J\u0010\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001cH\u0016J\b\u0010C\u001a\u00020-H\u0016J\b\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020HH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentFragment;", "Lcom/robinhood/android/camera/CameraFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "<set-?>", "", "hasFlipped", "getHasFlipped", "()Z", "setHasFlipped", "(Z)V", "hasFlipped$delegate", "Lkotlin/properties/ReadWriteProperty;", "previewView", "Landroidx/camera/view/PreviewView;", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "getCameraSelector", "()Landroidx/camera/core/CameraSelector;", "onStart", "", "bindViewState", "viewState", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentViewState;", "bindLoading", "loading", "showRequirementsBottomSheet", "title", "", "bodyMarkdown", "showCameraUnsupportedDialog", "showWarningDialog", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeButtonClicked", "onResume", "onCameraPermissionEvent", "granted", "onPause", "setupCamera", "Lkotlinx/coroutines/Job;", "captureAndProcessPhoto", "imageCapture", "Landroidx/camera/core/ImageCapture;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadCaptureDocumentFragment extends CameraFragment {
    private static final String CAMERA_UNSUPPORTED_DIALOG_TAG = "camera-unsupported";
    private static final String IMAGE_BLURRY_DIALOG_TAG = "image-blurry";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;

    /* renamed from: hasFlipped$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasFlipped;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadCaptureDocumentFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadCaptureDocumentFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DocUploadCaptureDocumentFragment.class, "hasFlipped", "getHasFlipped()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocUploadCaptureDocumentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdDocument.Side.values().length];
            try {
                iArr[IdDocument.Side.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocUploadCaptureDocumentFragment() {
        super(C14254R.layout.fragment_doc_upload_capture_document);
        this.duxo = OldDuxos.oldDuxo(this, DocUploadCaptureDocumentDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DocUploadCaptureDocumentFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.hasFlipped = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadCaptureDocumentDuxo getDuxo() {
        return (DocUploadCaptureDocumentDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDocUploadCaptureDocumentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadCaptureDocumentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    private final boolean getHasFlipped() {
        return ((Boolean) this.hasFlipped.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setHasFlipped(boolean z) {
        this.hasFlipped.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.camera.CameraFragment
    public PreviewView getPreviewView() {
        PreviewView cameraPreviewView = getBinding().cameraPreviewView;
        Intrinsics.checkNotNullExpressionValue(cameraPreviewView, "cameraPreviewView");
        return cameraPreviewView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraSelector getCameraSelector() {
        if (((DocUploadDestination.CaptureDocument) INSTANCE.getArgs((Fragment) this)).getSide().getUseBackCamera()) {
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNull(cameraSelector);
            return cameraSelector;
        }
        CameraSelector cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
        Intrinsics.checkNotNull(cameraSelector2);
        return cameraSelector2;
    }

    @Override // com.robinhood.android.camera.CameraFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144021(this));
    }

    /* compiled from: DocUploadCaptureDocumentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$onStart$1 */
    /* synthetic */ class C144021 extends FunctionReferenceImpl implements Function1<DocUploadCaptureDocumentViewState, Unit> {
        C144021(Object obj) {
            super(1, obj, DocUploadCaptureDocumentFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState) throws Resources.NotFoundException {
            invoke2(docUploadCaptureDocumentViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DocUploadCaptureDocumentViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadCaptureDocumentFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final DocUploadCaptureDocumentViewState viewState) throws Resources.NotFoundException {
        CharSequence string2;
        int i;
        bindLoading(viewState.getLoading());
        Companion companion = INSTANCE;
        IdDocument.Type documentType = ((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getDetails().getDocumentType();
        boolean forCrypto = ((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getDetails().getForCrypto();
        RhTextView rhTextView = getBinding().capturePhotoTitle;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(UtilKt.getCapturePhotoTitle(documentType, resources, forCrypto, viewState.getUserLocality()));
        RhTextView rhTextView2 = getBinding().capturePhotoSubtitle;
        if (WhenMappings.$EnumSwitchMapping$0[((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getSide().ordinal()] == 1) {
            UploadFlowDetails details = ((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getDetails();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            string2 = UtilKt.getBackSideSubtitle(details, resources2);
        } else {
            Resources resources3 = getResources();
            int i2 = C14254R.string.doc_upload_capture_photo_subtitle;
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            string2 = resources3.getString(i2, UtilKt.getDisplayNameLowercase(documentType, resources4, forCrypto, viewState.getUserLocality()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        rhTextView2.setText(string2);
        getBinding().cameraOverlayView.setAspectRatio(documentType.getAspectRatio());
        RdsTextButton rdsTextButton = getBinding().capturePhotoRequirementsBtn;
        Intrinsics.checkNotNull(rdsTextButton);
        rdsTextButton.setVisibility(viewState.getEnableRequirementsButton() ? 0 : 8);
        rdsTextButton.setText(viewState.getRequirementsTitle());
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadCaptureDocumentFragment.bindViewState$lambda$1$lambda$0(this.f$0, viewState);
            }
        });
        UiEvent<PhotoEvent> event = viewState.getEvent();
        PhotoEvent photoEventConsume = event != null ? event.consume() : null;
        if (Intrinsics.areEqual(photoEventConsume, PhotoEvent.CameraUnsupported.INSTANCE)) {
            showCameraUnsupportedDialog();
            return;
        }
        if (Intrinsics.areEqual(photoEventConsume, PhotoEvent.CapturePhotoTimeout.INSTANCE) || (photoEventConsume instanceof PhotoEvent.CapturePhotoError)) {
            if (getAppType() == AppType.RHC) {
                i = C14254R.string.gated_crypto_doc_upload_camera_unavailable_rhc;
            } else {
                i = C14254R.string.doc_upload_camera_unavailable;
            }
            RdsSnackbar.Companion companion2 = RdsSnackbar.INSTANCE;
            ConstraintLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion2.make(root, i, 0).show();
            return;
        }
        if (photoEventConsume instanceof PhotoEvent.CapturedPhotoIsBlurry) {
            showWarningDialog();
        } else if (Intrinsics.areEqual(photoEventConsume, PhotoEvent.CaptureComplete.INSTANCE)) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured(((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getDetails(), new PhotoDocument(((DocUploadDestination.CaptureDocument) companion.getArgs((Fragment) this)).getSide())), false, 2, null);
        } else if (photoEventConsume != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$1$lambda$0(DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment, DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState) {
        docUploadCaptureDocumentFragment.showRequirementsBottomSheet(docUploadCaptureDocumentViewState.getRequirementsTitle(), docUploadCaptureDocumentViewState.getRequirementsMarkdownBody());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindLoading(boolean loading) {
        FragmentDocUploadCaptureDocumentBinding binding = getBinding();
        binding.capturePhotoRequirementsBtn.setEnabled(!loading);
        binding.capturePhotoPrimaryCta.setEnabled(!loading);
        RdsProgressBar capturePhotoProgressCircle = binding.capturePhotoProgressCircle;
        Intrinsics.checkNotNullExpressionValue(capturePhotoProgressCircle, "capturePhotoProgressCircle");
        capturePhotoProgressCircle.setVisibility(loading ? 0 : 8);
    }

    private final void showRequirementsBottomSheet(String title, String bodyMarkdown) {
        RequirementsBottomSheetFragment requirementsBottomSheetFragment = (RequirementsBottomSheetFragment) RequirementsBottomSheetFragment.INSTANCE.newInstance((Parcelable) new RequirementsBottomSheetFragment.Args.Markdown(title, bodyMarkdown));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        requirementsBottomSheetFragment.show(childFragmentManager, RequirementsBottomSheetFragment.TAG);
    }

    private final void showCameraUnsupportedDialog() {
        int i;
        if (getAppType() == AppType.RHC) {
            i = C14254R.string.gated_crypto_doc_upload_camera_device_not_supported_rhc;
        } else {
            i = C14254R.string.doc_upload_camera_device_not_supported;
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C14254R.id.dialog_id_camera_unsupported).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(i, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, CAMERA_UNSUPPORTED_DIALOG_TAG, false, 4, null);
    }

    private final void showWarningDialog() {
        stopPreview();
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C14254R.id.dialog_id_image_blurry).setTitle(C14254R.string.doc_upload_image_blurry_title, new Object[0]).setMessage(C14254R.string.doc_upload_image_blurry_message, new Object[0]).setPositiveButton(C14254R.string.doc_upload_image_blurry_positive_action, new Object[0]).setNegativeButton(C14254R.string.doc_upload_image_blurry_negative_action, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, IMAGE_BLURRY_DIALOG_TAG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14254R.id.dialog_id_camera_unsupported) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.Exit(false, 1, null), false, 2, null);
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_image_blurry) {
            setupCamera();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_image_blurry) {
            getDuxo().acceptBlurryPhoto();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (CameraUtils.INSTANCE.getCameraSupported() && ((DocUploadDestination.CaptureDocument) INSTANCE.getArgs((Fragment) this)).getSide() == IdDocument.Side.BACK && !getHasFlipped()) {
            getBinding().cameraOverlayView.post(new Runnable() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment.onResume.1
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    DocUploadCaptureDocumentFragment.this.getBinding().cameraOverlayView.flip();
                }
            });
            setHasFlipped(true);
        }
    }

    @Override // com.robinhood.android.camera.CameraFragment
    public void onCameraPermissionEvent(boolean granted) {
        int i;
        if (granted) {
            setupCamera();
            return;
        }
        if (getAppType() == AppType.RHC) {
            i = C14254R.string.gated_crypto_doc_upload_camera_permission_denied_rhc;
        } else {
            i = C14254R.string.doc_upload_camera_permission_denied;
        }
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.make(root, i, 0).show();
        DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), DocUploadEvent.ActiveDocRequestEvent.CameraPermissionDenied.INSTANCE, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopPreview();
    }

    /* compiled from: DocUploadCaptureDocumentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$setupCamera$1", m3645f = "DocUploadCaptureDocumentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$setupCamera$1 */
    static final class C144031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C144031(Continuation<? super C144031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadCaptureDocumentFragment.this.new C144031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C144031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        DocUploadCaptureDocumentFragment.this.bindLoading(true);
                        DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment = DocUploadCaptureDocumentFragment.this;
                        CameraSelector cameraSelector = docUploadCaptureDocumentFragment.getCameraSelector();
                        this.label = 1;
                        obj = docUploadCaptureDocumentFragment.startPreview(cameraSelector, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    final ImageCapture imageCapture = (ImageCapture) obj;
                    RdsIconButton capturePhotoPrimaryCta = DocUploadCaptureDocumentFragment.this.getBinding().capturePhotoPrimaryCta;
                    Intrinsics.checkNotNullExpressionValue(capturePhotoPrimaryCta, "capturePhotoPrimaryCta");
                    final DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment2 = DocUploadCaptureDocumentFragment.this;
                    OnClickListeners.onClick(capturePhotoPrimaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$setupCamera$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DocUploadCaptureDocumentFragment.C144031.invokeSuspend$lambda$0(docUploadCaptureDocumentFragment2, imageCapture);
                        }
                    });
                } catch (Exception unused) {
                    Toast.makeText(DocUploadCaptureDocumentFragment.this.requireContext(), C14254R.string.doc_upload_camera_unavailable, 1).show();
                    DocUploadEventReceiver.DefaultImpls.onEvent$default(DocUploadCaptureDocumentFragment.this.getEventReceiver(), new DocUploadEvent.Exit(false, 1, null), false, 2, null);
                }
                return Unit.INSTANCE;
            } finally {
                DocUploadCaptureDocumentFragment.this.bindLoading(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment, ImageCapture imageCapture) {
            docUploadCaptureDocumentFragment.captureAndProcessPhoto(imageCapture);
            return Unit.INSTANCE;
        }
    }

    private final Job setupCamera() {
        return getLifecycleScope().launchWhenStarted(new C144031(null));
    }

    /* compiled from: DocUploadCaptureDocumentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$captureAndProcessPhoto$1", m3645f = "DocUploadCaptureDocumentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadCaptureDocumentFragment$captureAndProcessPhoto$1 */
    static final class C144001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageCapture $imageCapture;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144001(ImageCapture imageCapture, Continuation<? super C144001> continuation) {
            super(2, continuation);
            this.$imageCapture = imageCapture;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadCaptureDocumentFragment.this.new C144001(this.$imageCapture, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C144001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r5.processPhoto(r6, r8, r1, r7) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Exception unused) {
                    Toast.makeText(DocUploadCaptureDocumentFragment.this.requireContext(), C14254R.string.doc_upload_camera_unavailable, 1).show();
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DocUploadCaptureDocumentFragment.this.bindLoading(true);
                    DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment = DocUploadCaptureDocumentFragment.this;
                    ImageCapture imageCapture = this.$imageCapture;
                    this.label = 1;
                    obj = docUploadCaptureDocumentFragment.capturePhotoBytes(imageCapture, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CapturePhotoResult capturePhotoResult = (CapturePhotoResult) obj;
                float margin = DocUploadCaptureDocumentFragment.this.getBinding().cameraOverlayView.getMargin();
                DocUploadCaptureDocumentDuxo duxo = DocUploadCaptureDocumentFragment.this.getDuxo();
                byte[] bytes = capturePhotoResult.getBytes();
                int rotationDegrees = capturePhotoResult.getRotationDegrees();
                this.label = 2;
            } finally {
                DocUploadCaptureDocumentFragment.this.bindLoading(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job captureAndProcessPhoto(ImageCapture imageCapture) {
        return getLifecycleScope().launchWhenStarted(new C144001(imageCapture, null));
    }

    /* compiled from: DocUploadCaptureDocumentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$CaptureDocument;", "<init>", "()V", "CAMERA_UNSUPPORTED_DIALOG_TAG", "", "IMAGE_BLURRY_DIALOG_TAG", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadCaptureDocumentFragment, DocUploadDestination.CaptureDocument> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.CaptureDocument getArgs(DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment) {
            return (DocUploadDestination.CaptureDocument) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadCaptureDocumentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadCaptureDocumentFragment newInstance(DocUploadDestination.CaptureDocument captureDocument) {
            return (DocUploadCaptureDocumentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, captureDocument);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadCaptureDocumentFragment docUploadCaptureDocumentFragment, DocUploadDestination.CaptureDocument captureDocument) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadCaptureDocumentFragment, captureDocument);
        }
    }
}
