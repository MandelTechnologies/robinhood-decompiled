package com.robinhood.android.doc.p109ui.splash;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$OpenDocument;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadSplashBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.initial.RejectedDocumentRequestReason;
import com.robinhood.android.doc.p109ui.splash.DocUploadSplashViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DocUploadSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020(2\u0006\u0010.\u001a\u000204H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\u001a\u00107\u001a\u0002022\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010;\u001a\u0002022\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010,H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R(\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020% &*\n\u0012\u0004\u0012\u00020%\u0018\u00010$0$0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "setRhProcessLifecycleOwner", "(Ldagger/Lazy;)V", "duxo", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/splash/DocUploadSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadSplashBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "captureDocumentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindViewState", "viewState", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "onLoading", "loading", "", "bindError", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Error;", "showRequirementsFailedDialog", "openFile", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadSplashFragment extends BaseFragment {
    private static final String CANNOT_PICK_PDF_DIALOG_TAG = "dialog-cannot-pick-pdf";
    private static final String LOAD_FAILED_DIALOG_TAG = "dialog-failed-doc-requirements-load";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<String[]> captureDocumentLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    public Markwon markwon;
    public dagger.Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadSplashFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocUploadSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocUploadSplashViewState2.values().length];
            try {
                iArr[DocUploadSplashViewState2.UPDATE_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocUploadSplashViewState2.LOADING_REQUIREMENTS_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocUploadSplashFragment() {
        super(C14254R.layout.fragment_doc_upload_splash);
        this.duxo = OldDuxos.oldDuxo(this, DocUploadSplashDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DocUploadSplashFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$captureDocumentLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                if (uri != null) {
                    DocUploadEventReceiver.DefaultImpls.onEvent$default(this.this$0.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured(((DocUploadDestination.Splash) DocUploadSplashFragment.INSTANCE.getArgs((Fragment) this.this$0)).getDetails(), new PdfDocument(IdDocument.Side.FRONT, uri)), false, 2, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.captureDocumentLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final dagger.Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
        dagger.Lazy<RhProcessLifecycleOwner> lazy = this.rhProcessLifecycleOwner;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
        return null;
    }

    public final void setRhProcessLifecycleOwner(dagger.Lazy<RhProcessLifecycleOwner> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.rhProcessLifecycleOwner = lazy;
    }

    private final DocUploadSplashDuxo getDuxo() {
        return (DocUploadSplashDuxo) this.duxo.getValue();
    }

    private final FragmentDocUploadSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadSplashBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144291(this));
        Companion companion = INSTANCE;
        if (((DocUploadDestination.Splash) companion.getArgs((Fragment) this)).getEnabledFileUpload() && ((DocUploadDestination.Splash) companion.getArgs((Fragment) this)).getEnabledCameraPhoto()) {
            getBinding().docUploadSplashPrimaryCta.setText(C14254R.string.doc_upload_splash_upload_pdf);
            RdsButton docUploadSplashSecondaryCta = getBinding().docUploadSplashSecondaryCta;
            Intrinsics.checkNotNullExpressionValue(docUploadSplashSecondaryCta, "docUploadSplashSecondaryCta");
            docUploadSplashSecondaryCta.setVisibility(0);
            return;
        }
        if (!((DocUploadDestination.Splash) companion.getArgs((Fragment) this)).getEnabledFileUpload() || ((DocUploadDestination.Splash) companion.getArgs((Fragment) this)).getEnabledCameraPhoto()) {
            return;
        }
        getBinding().docUploadSplashPrimaryCta.setText(C14254R.string.doc_upload_splash_upload_pdf);
    }

    /* compiled from: DocUploadSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$onViewCreated$1 */
    /* synthetic */ class C144291 extends FunctionReferenceImpl implements Function1<DocUploadSplashViewState, Unit> {
        C144291(Object obj) {
            super(1, obj, DocUploadSplashFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocUploadSplashViewState docUploadSplashViewState) {
            invoke2(docUploadSplashViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DocUploadSplashViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadSplashFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final DocUploadSplashViewState viewState) {
        onLoading(viewState instanceof DocUploadSplashViewState.Loading);
        if (viewState instanceof DocUploadSplashViewState.Error) {
            bindError((DocUploadSplashViewState.Error) viewState);
            return;
        }
        if (viewState instanceof DocUploadSplashViewState.Loaded) {
            DocUploadSplashViewState.Loaded loaded = (DocUploadSplashViewState.Loaded) viewState;
            UiEvent<Unit> takePhoto = loaded.getTakePhoto();
            if (takePhoto != null) {
                takePhoto.consumeWith(new Function1() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocUploadSplashFragment.bindViewState$lambda$0(this.f$0, viewState, (Unit) obj);
                    }
                });
            }
            getBinding().docUploadSplashTitle.setText(loaded.getTitleText());
            getMarkwon().mo17580setMarkdown(getBinding().docUploadSplashMessage, loaded.getBodyMarkdown());
            RdsButton docUploadSplashPrimaryCta = getBinding().docUploadSplashPrimaryCta;
            Intrinsics.checkNotNullExpressionValue(docUploadSplashPrimaryCta, "docUploadSplashPrimaryCta");
            OnClickListeners.onClick(docUploadSplashPrimaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocUploadSplashFragment.bindViewState$lambda$1(this.f$0, viewState);
                }
            });
            if (((DocUploadDestination.Splash) INSTANCE.getArgs((Fragment) this)).getEnabledCameraPhoto()) {
                RdsButton docUploadSplashSecondaryCta = getBinding().docUploadSplashSecondaryCta;
                Intrinsics.checkNotNullExpressionValue(docUploadSplashSecondaryCta, "docUploadSplashSecondaryCta");
                OnClickListeners.onClick(docUploadSplashSecondaryCta, new Function0() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocUploadSplashFragment.bindViewState$lambda$2(this.f$0, viewState);
                    }
                });
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(viewState, DocUploadSplashViewState.Loading.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$0(DocUploadSplashFragment docUploadSplashFragment, DocUploadSplashViewState docUploadSplashViewState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSplashFragment.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.SplashContinue(UploadFlowDetails.copy$default(((DocUploadDestination.Splash) INSTANCE.getArgs((Fragment) docUploadSplashFragment)).getDetails(), null, null, false, ((DocUploadSplashViewState.Loaded) docUploadSplashViewState).getSides(), null, null, null, 119, null)), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$1(DocUploadSplashFragment docUploadSplashFragment, DocUploadSplashViewState docUploadSplashViewState) {
        Companion companion = INSTANCE;
        if (((DocUploadDestination.Splash) companion.getArgs((Fragment) docUploadSplashFragment)).getEnabledFileUpload()) {
            docUploadSplashFragment.openFile();
        } else {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSplashFragment.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.SplashContinue(UploadFlowDetails.copy$default(((DocUploadDestination.Splash) companion.getArgs((Fragment) docUploadSplashFragment)).getDetails(), null, null, false, ((DocUploadSplashViewState.Loaded) docUploadSplashViewState).getSides(), null, null, null, 119, null)), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$2(DocUploadSplashFragment docUploadSplashFragment, DocUploadSplashViewState docUploadSplashViewState) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSplashFragment.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.SplashContinue(UploadFlowDetails.copy$default(((DocUploadDestination.Splash) INSTANCE.getArgs((Fragment) docUploadSplashFragment)).getDetails(), null, null, false, ((DocUploadSplashViewState.Loaded) docUploadSplashViewState).getSides(), null, null, null, 119, null)), false, 2, null);
        return Unit.INSTANCE;
    }

    private final void onLoading(boolean loading) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(loading);
        }
        getBinding().docUploadSplashPrimaryCta.setLoading(loading);
        getBinding().docUploadSplashSecondaryCta.setLoading(loading);
    }

    private final void bindError(DocUploadSplashViewState.Error viewState) {
        UiEvent<DocUploadSplashViewState2> event = viewState.getEvent();
        DocUploadSplashViewState2 docUploadSplashViewState2Consume = event != null ? event.consume() : null;
        int i = docUploadSplashViewState2Consume == null ? -1 : WhenMappings.$EnumSwitchMapping$0[docUploadSplashViewState2Consume.ordinal()];
        if (i != -1) {
            if (i == 1) {
                UtilKt.showRejectionDialog(this, RejectedDocumentRequestReason.UPDATE_APP_REQUIRED.getDialogResources());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                showRequirementsFailedDialog();
            }
        }
    }

    private final void showRequirementsFailedDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setId(C14254R.id.dialog_id_doc_info_failed).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C14254R.string.doc_upload_splash_error_message, new Object[0]).setPositiveButton(C11048R.string.general_label_retry, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]).setImage(C14254R.drawable.ic_warning).setCancelable(false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(cancelable, childFragmentManager, LOAD_FAILED_DIALOG_TAG, false, 4, null);
    }

    private final void openFile() {
        getRhProcessLifecycleOwner().get().useExtendedTimeout();
        try {
            this.captureDocumentLauncher.launch(new String[]{"application/pdf"});
        } catch (ActivityNotFoundException unused) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C14254R.id.dialog_id_pdf_pick_failed).setTitle(C14254R.string.doc_upload_pdf_cannot_pick_pdf_title, new Object[0]).setMessage(C14254R.string.doc_upload_pdf_cannot_pick_pdf_body, new Object[0]).setPositiveButton(C14254R.string.doc_upload_pdf_cannot_pick_pdf_primary_cta, new Object[0]);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, CANNOT_PICK_PDF_DIALOG_TAG, false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_doc_info_failed) {
            getDuxo().loadData();
            return true;
        }
        if (id == C14254R.id.dialog_id_pdf_pick_failed) {
            getDuxo().takePhoto();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_doc_info_failed) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), DocUploadEvent.ActiveDocRequestEvent.SplashDismiss.INSTANCE, false, 2, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: DocUploadSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$Splash;", "<init>", "()V", "CANNOT_PICK_PDF_DIALOG_TAG", "", "LOAD_FAILED_DIALOG_TAG", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadSplashFragment, DocUploadDestination.Splash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.Splash getArgs(DocUploadSplashFragment docUploadSplashFragment) {
            return (DocUploadDestination.Splash) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadSplashFragment newInstance(DocUploadDestination.Splash splash) {
            return (DocUploadSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, splash);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadSplashFragment docUploadSplashFragment, DocUploadDestination.Splash splash) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadSplashFragment, splash);
        }
    }
}
