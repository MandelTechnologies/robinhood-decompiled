package com.robinhood.android.doc.serverdriven.capture;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
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
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadCaptureDocumentBinding;
import com.robinhood.android.doc.p109ui.photo.PhotoEvent;
import com.robinhood.android.doc.p109ui.photo.RequirementsBottomSheetFragment;
import com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.logging.CrashReporter;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SddrCaptureFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020-H\u0002J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020-H\u0002J\b\u00109\u001a\u00020-H\u0002J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020<H\u0016J\u001a\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u000101H\u0016J\u001a\u0010?\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u000101H\u0016J\b\u0010@\u001a\u00020-H\u0016J\u0010\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001cH\u0016J\b\u0010C\u001a\u00020-H\u0016J\b\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020HH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureFragment;", "Lcom/robinhood/android/camera/CameraFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "callbacks$delegate", "<set-?>", "", "hasFlipped", "getHasFlipped", "()Z", "setHasFlipped", "(Z)V", "hasFlipped$delegate", "Lkotlin/properties/ReadWriteProperty;", "previewView", "Landroidx/camera/view/PreviewView;", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "getCameraSelector", "()Landroidx/camera/core/CameraSelector;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handlePhotoEvent", "event", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "bindViewState", "bindLoading", "loading", "showCameraUnsupportedDialog", "showWarningDialog", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "onResume", "onCameraPermissionEvent", "granted", "onPause", "setupCamera", "Lkotlinx/coroutines/Job;", "captureAndProcessPhoto", "imageCapture", "Landroidx/camera/core/ImageCapture;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrCaptureFragment extends CameraFragment {
    private static final String CAMERA_UNSUPPORTED_DIALOG_TAG = "camera-unsupported";
    private static final String IMAGE_BLURRY_DIALOG_TAG = "image-blurry";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: hasFlipped$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasFlipped;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrCaptureFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SddrCaptureFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SddrCaptureFragment.class, "hasFlipped", "getHasFlipped()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SddrCaptureFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdDocument.Side.values().length];
            try {
                iArr[IdDocument.Side.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdDocument.Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SddrCaptureFragment() {
        super(C14254R.layout.fragment_doc_upload_capture_document);
        this.duxo = DuxosKt.duxo(this, SddrCaptureDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SddrCaptureFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SddrFlowEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$special$$inlined$parentFragmentCallbacks$1
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
    public final SddrCaptureDuxo getDuxo() {
        return (SddrCaptureDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDocUploadCaptureDocumentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadCaptureDocumentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrFlowEventReceiver getCallbacks() {
        return (SddrFlowEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[1]);
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
        if (((SddrDestination.Capture) INSTANCE.getArgs((Fragment) this)).getCaptureSide().getSide().getUseBackCamera()) {
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNull(cameraSelector);
            return cameraSelector;
        }
        CameraSelector cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
        Intrinsics.checkNotNull(cameraSelector2);
        return cameraSelector2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C142761(null), 1, null);
        bindViewState();
    }

    /* compiled from: SddrCaptureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$onViewCreated$1", m3645f = "SddrCaptureFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$onViewCreated$1 */
    static final class C142761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142761(Continuation<? super C142761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrCaptureFragment.this.new C142761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SddrCaptureFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$onViewCreated$1$1", m3645f = "SddrCaptureFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<PhotoEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SddrCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SddrCaptureFragment sddrCaptureFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sddrCaptureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<PhotoEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final SddrCaptureFragment sddrCaptureFragment = this.this$0;
                    if ((event.getData() instanceof PhotoEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m13374invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13374invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                sddrCaptureFragment.handlePhotoEvent((PhotoEvent) event.getData());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<PhotoEvent>> eventFlow = SddrCaptureFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SddrCaptureFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePhotoEvent(PhotoEvent event) {
        int i;
        if (Intrinsics.areEqual(event, PhotoEvent.CameraUnsupported.INSTANCE)) {
            showCameraUnsupportedDialog();
            return;
        }
        if (Intrinsics.areEqual(event, PhotoEvent.CapturePhotoTimeout.INSTANCE) || (event instanceof PhotoEvent.CapturePhotoError)) {
            if (getAppType() == AppType.RHC) {
                i = C14254R.string.gated_crypto_doc_upload_camera_unavailable_rhc;
            } else {
                i = C14254R.string.doc_upload_camera_unavailable;
            }
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            ConstraintLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion.make(root, i, 0).show();
            return;
        }
        if (event instanceof PhotoEvent.CapturedPhotoIsBlurry) {
            showWarningDialog();
        } else {
            if (!Intrinsics.areEqual(event, PhotoEvent.CaptureComplete.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            SddrFlowEventReceiver callbacks = getCallbacks();
            Companion companion2 = INSTANCE;
            callbacks.onFlowEvent(new SddrFlowEvent.PhotoTaken(((SddrDestination.Capture) companion2.getArgs((Fragment) this)).getState(), new PhotoDocument(((SddrDestination.Capture) companion2.getArgs((Fragment) this)).getCaptureSide().getSide())));
        }
    }

    private final void bindViewState() throws Resources.NotFoundException {
        CharSequence string2;
        bindLoading(false);
        Companion companion = INSTANCE;
        ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide = ((SddrDestination.Capture) companion.getArgs((Fragment) this)).getCaptureSide();
        getBinding().capturePhotoTitle.setText(((SddrDestination.Capture) companion.getArgs((Fragment) this)).getCaptureSide().getTitle());
        RhTextView rhTextView = getBinding().capturePhotoSubtitle;
        int i = WhenMappings.$EnumSwitchMapping$0[((SddrDestination.Capture) companion.getArgs((Fragment) this)).getCaptureSide().getSide().ordinal()];
        if (i == 1) {
            string2 = getResources().getString(C14254R.string.doc_upload_capture_photo_subtitle, ((SddrDestination.Capture) companion.getArgs((Fragment) this)).getCaptureSide().getDocumentDisplayName());
            Intrinsics.checkNotNull(string2);
        } else if (i == 2) {
            String string3 = getResources().getString(C14254R.string.doc_upload_capture_photo_back, ((SddrDestination.Capture) companion.getArgs((Fragment) this)).getCaptureSide().getDocumentDisplayName());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string2 = HtmlCompat.fromHtml$default(string3, 0, 2, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Capture side is neither front nor back"), false, null, 6, null);
            string2 = "";
        }
        rhTextView.setText(string2);
        getBinding().cameraOverlayView.setAspectRatio((float) captureSide.getAspectRatioIdeal());
        RdsTextButton rdsTextButton = getBinding().capturePhotoRequirementsBtn;
        rdsTextButton.setText(((SddrDestination.Capture) companion.getArgs((Fragment) this)).getRequirementsButtonTitle());
        Intrinsics.checkNotNull(rdsTextButton);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrCaptureFragment.bindViewState$lambda$1$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$1$lambda$0(SddrCaptureFragment sddrCaptureFragment) {
        RequirementsBottomSheetFragment requirementsBottomSheetFragment = (RequirementsBottomSheetFragment) RequirementsBottomSheetFragment.INSTANCE.newInstance((Parcelable) new RequirementsBottomSheetFragment.Args.Sdui(((SddrDestination.Capture) INSTANCE.getArgs((Fragment) sddrCaptureFragment)).getRequirementsContent()));
        FragmentManager childFragmentManager = sddrCaptureFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        requirementsBottomSheetFragment.show(childFragmentManager, RequirementsBottomSheetFragment.TAG);
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
            getCallbacks().onFlowEvent(new SddrFlowEvent.SubmissionError(((SddrDestination.Capture) INSTANCE.getArgs((Fragment) this)).getState()));
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
        if (CameraUtils.INSTANCE.getCameraSupported() && ((SddrDestination.Capture) INSTANCE.getArgs((Fragment) this)).getCaptureSide().getSide() == IdDocument.Side.BACK && !getHasFlipped()) {
            getBinding().cameraOverlayView.post(new Runnable() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment.onResume.1
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    SddrCaptureFragment.this.getBinding().cameraOverlayView.flip();
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
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment.onCameraPermissionEvent.1
            @Override // java.lang.Runnable
            public final void run() {
                SddrCaptureFragment.this.getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopPreview();
    }

    /* compiled from: SddrCaptureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$setupCamera$1", m3645f = "SddrCaptureFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$setupCamera$1 */
    static final class C142771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142771(Continuation<? super C142771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrCaptureFragment.this.new C142771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SddrCaptureFragment.this.bindLoading(true);
                        SddrCaptureFragment sddrCaptureFragment = SddrCaptureFragment.this;
                        CameraSelector cameraSelector = sddrCaptureFragment.getCameraSelector();
                        this.label = 1;
                        obj = sddrCaptureFragment.startPreview(cameraSelector, this);
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
                    RdsIconButton capturePhotoPrimaryCta = SddrCaptureFragment.this.getBinding().capturePhotoPrimaryCta;
                    Intrinsics.checkNotNullExpressionValue(capturePhotoPrimaryCta, "capturePhotoPrimaryCta");
                    final SddrCaptureFragment sddrCaptureFragment2 = SddrCaptureFragment.this;
                    OnClickListeners.onClick(capturePhotoPrimaryCta, new Function0() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$setupCamera$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrCaptureFragment.C142771.invokeSuspend$lambda$0(sddrCaptureFragment2, imageCapture);
                        }
                    });
                } catch (Exception unused) {
                    Toast.makeText(SddrCaptureFragment.this.requireContext(), C14254R.string.doc_upload_camera_unavailable, 1).show();
                    SddrCaptureFragment.this.getCallbacks().onFlowEvent(new SddrFlowEvent.SubmissionError(((SddrDestination.Capture) SddrCaptureFragment.INSTANCE.getArgs((Fragment) SddrCaptureFragment.this)).getState()));
                }
                return Unit.INSTANCE;
            } finally {
                SddrCaptureFragment.this.bindLoading(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SddrCaptureFragment sddrCaptureFragment, ImageCapture imageCapture) {
            sddrCaptureFragment.captureAndProcessPhoto(imageCapture);
            return Unit.INSTANCE;
        }
    }

    private final Job setupCamera() {
        return getLifecycleScope().launchWhenStarted(new C142771(null));
    }

    /* compiled from: SddrCaptureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$captureAndProcessPhoto$1", m3645f = "SddrCaptureFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$captureAndProcessPhoto$1 */
    static final class C142731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageCapture $imageCapture;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142731(ImageCapture imageCapture, Continuation<? super C142731> continuation) {
            super(2, continuation);
            this.$imageCapture = imageCapture;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrCaptureFragment.this.new C142731(this.$imageCapture, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(3:(2:38|(1:(5:6|7|24|31|32)(2:11|12))(1:13))(5:15|36|16|(1:18)|23)|40|21) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
        
            if (r5.processPhoto(r6, r7, r9, r10, r11, r12) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            android.widget.Toast.makeText(r12.this$0.requireContext(), com.robinhood.android.doc.C14254R.string.doc_upload_camera_unavailable, 1).show();
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C142731 c142731;
            Throwable th;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception unused) {
                c142731 = this;
            }
            try {
                if (i != 0) {
                    try {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            c142731 = this;
                            SddrCaptureFragment.this.bindLoading(false);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        c142731 = this;
                        SddrCaptureFragment.this.bindLoading(false);
                        throw th;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        SddrCaptureFragment.this.bindLoading(true);
                        SddrCaptureFragment sddrCaptureFragment = SddrCaptureFragment.this;
                        ImageCapture imageCapture = this.$imageCapture;
                        this.label = 1;
                        obj = sddrCaptureFragment.capturePhotoBytes(imageCapture, this);
                        if (obj == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th2 = th4;
                        c142731 = this;
                        th = th2;
                        SddrCaptureFragment.this.bindLoading(false);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                th = th2;
                SddrCaptureFragment.this.bindLoading(false);
                throw th;
            }
            CapturePhotoResult capturePhotoResult = (CapturePhotoResult) obj;
            float margin = SddrCaptureFragment.this.getBinding().cameraOverlayView.getMargin();
            SddrCaptureDuxo duxo = SddrCaptureFragment.this.getDuxo();
            Companion companion = SddrCaptureFragment.INSTANCE;
            IdDocument.Side side = ((SddrDestination.Capture) companion.getArgs((Fragment) SddrCaptureFragment.this)).getCaptureSide().getSide();
            double aspectRatioIdeal = ((SddrDestination.Capture) companion.getArgs((Fragment) SddrCaptureFragment.this)).getCaptureSide().getAspectRatioIdeal();
            byte[] bytes = capturePhotoResult.getBytes();
            int rotationDegrees = capturePhotoResult.getRotationDegrees();
            this.label = 2;
            c142731 = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job captureAndProcessPhoto(ImageCapture imageCapture) {
        return getLifecycleScope().launchWhenStarted(new C142731(imageCapture, null));
    }

    /* compiled from: SddrCaptureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/capture/SddrCaptureFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Capture;", "<init>", "()V", "CAMERA_UNSUPPORTED_DIALOG_TAG", "", "IMAGE_BLURRY_DIALOG_TAG", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrCaptureFragment, SddrDestination.Capture> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SddrDestination.Capture getArgs(SddrCaptureFragment sddrCaptureFragment) {
            return (SddrDestination.Capture) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrCaptureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrCaptureFragment newInstance(SddrDestination.Capture capture) {
            return (SddrCaptureFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, capture);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrCaptureFragment sddrCaptureFragment, SddrDestination.Capture capture) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrCaptureFragment, capture);
        }
    }
}
