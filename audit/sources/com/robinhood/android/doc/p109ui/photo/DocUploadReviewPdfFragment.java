package com.robinhood.android.doc.p109ui.photo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadReviewPdfBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.IdDocument;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: DocUploadReviewPdfFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0002J\u001c\u0010*\u001a\u00020\u00182\b\b\u0001\u0010+\u001a\u00020\"2\b\b\u0001\u0010,\u001a\u00020\"H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "duxo", "Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "bindViewState", "viewState", "Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfViewState;", "handleIOErrors", "error", "", "showErrorDialog", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "bodyRes", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadReviewPdfFragment extends BaseFragment implements RhDialogFragment.OnDismissListener, RhDialogFragment.OnClickListener {
    public static final String ERROR_DIALOG_TAG = "errorDialog";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadReviewPdfFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadReviewPdfFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadReviewPdfFragment() {
        super(C14254R.layout.fragment_doc_upload_review_pdf);
        this.binding = ViewBinding5.viewBinding(this, DocUploadReviewPdfFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, DocUploadReviewPdfDuxo.class);
    }

    private final FragmentDocUploadReviewPdfBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadReviewPdfBinding) value;
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadReviewPdfDuxo getDuxo() {
        return (DocUploadReviewPdfDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().pdfReviewHeaderSdui.setVisibility(8);
        RhTextView rhTextView = getBinding().pdfReviewTitle;
        Resources resources = getResources();
        Companion companion = INSTANCE;
        rhTextView.setText(resources.getString(UtilKt.getReviewPhotoTitle(((DocUploadDestination.PdfReview) companion.getArgs((Fragment) this)).getDetails().getDocumentType())));
        RhTextView rhTextView2 = getBinding().pdfReviewSubtitle;
        IdDocument.Type documentType = ((DocUploadDestination.PdfReview) companion.getArgs((Fragment) this)).getDetails().getDocumentType();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(UtilKt.getReviewPhotoSubtitle(documentType, resources2));
        RdsButton pdfReviewNextBtn = getBinding().pdfReviewNextBtn;
        Intrinsics.checkNotNullExpressionValue(pdfReviewNextBtn, "pdfReviewNextBtn");
        OnClickListeners.onClick(pdfReviewNextBtn, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadReviewPdfFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton pdfReviewRetryCta = getBinding().pdfReviewRetryCta;
        Intrinsics.checkNotNullExpressionValue(pdfReviewRetryCta, "pdfReviewRetryCta");
        OnClickListeners.onClick(pdfReviewRetryCta, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadReviewPdfFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DocUploadReviewPdfFragment docUploadReviewPdfFragment) {
        DocUploadEventReceiver eventReceiver = docUploadReviewPdfFragment.getEventReceiver();
        Companion companion = INSTANCE;
        DocUploadEventReceiver.DefaultImpls.onEvent$default(eventReceiver, new DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Confirmed(((DocUploadDestination.PdfReview) companion.getArgs((Fragment) docUploadReviewPdfFragment)).getDetails(), ((DocUploadDestination.PdfReview) companion.getArgs((Fragment) docUploadReviewPdfFragment)).getPdf()), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DocUploadReviewPdfFragment docUploadReviewPdfFragment) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadReviewPdfFragment.getEventReceiver(), DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Rejected.INSTANCE, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144091(this));
    }

    /* compiled from: DocUploadReviewPdfFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$onStart$1 */
    /* synthetic */ class C144091 extends FunctionReferenceImpl implements Function1<DocUploadReviewPdfViewState, Unit> {
        C144091(Object obj) {
            super(1, obj, DocUploadReviewPdfFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocUploadReviewPdfViewState docUploadReviewPdfViewState) throws Throwable {
            invoke2(docUploadReviewPdfViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DocUploadReviewPdfViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadReviewPdfFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final ImageView pdfReviewImage = getBinding().pdfReviewImage;
        Intrinsics.checkNotNullExpressionValue(pdfReviewImage, "pdfReviewImage");
        OneShotPreDrawListener.add(pdfReviewImage, new Runnable() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$onResume$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view = pdfReviewImage;
                this.getDuxo().updatePage(0, view.getWidth(), view.getHeight());
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_pdf_read_failed) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Rejected.INSTANCE, false, 2, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final DocUploadReviewPdfViewState viewState) throws Throwable {
        Throwable thConsume;
        getBinding().pdfReviewImage.setImageBitmap(viewState.getCurrentPage());
        UiEvent<Boolean> exceedsFileSizeLimit = viewState.getExceedsFileSizeLimit();
        if ((exceedsFileSizeLimit != null ? exceedsFileSizeLimit.consume() : null) != null) {
            showErrorDialog(C14254R.string.doc_upload_submission_too_large_title, C14254R.string.doc_upload_submission_too_large_body);
        }
        UiEvent<Throwable> errors = viewState.getErrors();
        if (errors != null && (thConsume = errors.consume()) != null) {
            handleIOErrors(thConsume);
        }
        ImageView pdfReviewPrevPageBtn = getBinding().pdfReviewPrevPageBtn;
        Intrinsics.checkNotNullExpressionValue(pdfReviewPrevPageBtn, "pdfReviewPrevPageBtn");
        OnClickListeners.onClick(pdfReviewPrevPageBtn, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadReviewPdfFragment.bindViewState$lambda$4(this.f$0, viewState);
            }
        });
        ImageView pdfReviewNextPageBtn = getBinding().pdfReviewNextPageBtn;
        Intrinsics.checkNotNullExpressionValue(pdfReviewNextPageBtn, "pdfReviewNextPageBtn");
        OnClickListeners.onClick(pdfReviewNextPageBtn, new Function0() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadReviewPdfFragment.bindViewState$lambda$5(this.f$0, viewState);
            }
        });
        ImageView pdfReviewPrevPageBtn2 = getBinding().pdfReviewPrevPageBtn;
        Intrinsics.checkNotNullExpressionValue(pdfReviewPrevPageBtn2, "pdfReviewPrevPageBtn");
        pdfReviewPrevPageBtn2.setVisibility(!viewState.getPrevBtnEnabled() ? 4 : 0);
        ImageView pdfReviewNextPageBtn2 = getBinding().pdfReviewNextPageBtn;
        Intrinsics.checkNotNullExpressionValue(pdfReviewNextPageBtn2, "pdfReviewNextPageBtn");
        pdfReviewNextPageBtn2.setVisibility(viewState.getNextBtnEnabled() ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$4(DocUploadReviewPdfFragment docUploadReviewPdfFragment, DocUploadReviewPdfViewState docUploadReviewPdfViewState) {
        docUploadReviewPdfFragment.getDuxo().updatePage(docUploadReviewPdfViewState.getSelectedPage() - 1, docUploadReviewPdfFragment.getBinding().pdfReviewImage.getWidth(), docUploadReviewPdfFragment.getBinding().pdfReviewImage.getHeight());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$5(DocUploadReviewPdfFragment docUploadReviewPdfFragment, DocUploadReviewPdfViewState docUploadReviewPdfViewState) {
        docUploadReviewPdfFragment.getDuxo().updatePage(docUploadReviewPdfViewState.getSelectedPage() + 1, docUploadReviewPdfFragment.getBinding().pdfReviewImage.getWidth(), docUploadReviewPdfFragment.getBinding().pdfReviewImage.getHeight());
        return Unit.INSTANCE;
    }

    private final void handleIOErrors(Throwable error) throws Throwable {
        if (error instanceof IOException) {
            showErrorDialog(C14254R.string.doc_upload_cannot_read_pdf_title, C14254R.string.doc_upload_cannot_read_pdf_body);
        } else {
            if (error instanceof SecurityException) {
                showErrorDialog(C14254R.string.doc_upload_pdf_password_protected_title, C14254R.string.doc_upload_pdf_password_protected_body);
                return;
            }
            throw error;
        }
    }

    private final void showErrorDialog(int titleRes, int bodyRes) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(titleRes, new Object[0]).setMessage(bodyRes, new Object[0]).setId(C14254R.id.dialog_id_pdf_read_failed).setPositiveButton(C14254R.string.doc_upload_error_primary_cta, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, ERROR_DIALOG_TAG, false, 4, null).setCancelable(false);
    }

    /* compiled from: DocUploadReviewPdfFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PdfReview;", "<init>", "()V", "ERROR_DIALOG_TAG", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadReviewPdfFragment, DocUploadDestination.PdfReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.PdfReview getArgs(DocUploadReviewPdfFragment docUploadReviewPdfFragment) {
            return (DocUploadDestination.PdfReview) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadReviewPdfFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadReviewPdfFragment newInstance(DocUploadDestination.PdfReview pdfReview) {
            return (DocUploadReviewPdfFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, pdfReview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadReviewPdfFragment docUploadReviewPdfFragment, DocUploadDestination.PdfReview pdfReview) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadReviewPdfFragment, pdfReview);
        }
    }
}
