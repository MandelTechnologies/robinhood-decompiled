package com.robinhood.android.doc.p109ui.residency;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadVerifyResidencyBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.residency.DocUploadVerifyResidencyViewState;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.DensitySpecs;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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
import okhttp3.HttpUrl;

/* compiled from: DocUploadVerifyResidencyFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "duxo", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadVerifyResidencyBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadVerifyResidencyBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindViewState", "viewState", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "bindLoadedContent", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Loaded;", "showIneligibleDialog", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/ResidentialAddress;", "loadStateAsset", "mapStateToAsset", "Lokhttp3/HttpUrl;", "stateCode", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadVerifyResidencyFragment extends BaseFragment {
    private static final String NOT_ELIGIBLE_DIALOG = "not-eligible";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadVerifyResidencyFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadVerifyResidencyBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadVerifyResidencyFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadVerifyResidencyFragment() {
        super(C14254R.layout.fragment_doc_upload_verify_residency);
        this.duxo = OldDuxos.oldDuxo(this, DocUploadVerifyResidencyDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DocUploadVerifyResidencyFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final DocUploadVerifyResidencyDuxo getDuxo() {
        return (DocUploadVerifyResidencyDuxo) this.duxo.getValue();
    }

    private final FragmentDocUploadVerifyResidencyBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadVerifyResidencyBinding) value;
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton docUploadVerifyResidencyNegativeBtn = getBinding().docUploadVerifyResidencyNegativeBtn;
        Intrinsics.checkNotNullExpressionValue(docUploadVerifyResidencyNegativeBtn, "docUploadVerifyResidencyNegativeBtn");
        OnClickListeners.onClick(docUploadVerifyResidencyNegativeBtn, new Function0() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadVerifyResidencyFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton docUploadVerifyResidencyContinueBtn = getBinding().docUploadVerifyResidencyContinueBtn;
        Intrinsics.checkNotNullExpressionValue(docUploadVerifyResidencyContinueBtn, "docUploadVerifyResidencyContinueBtn");
        OnClickListeners.onClick(docUploadVerifyResidencyContinueBtn, new Function0() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadVerifyResidencyFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144223(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DocUploadVerifyResidencyFragment docUploadVerifyResidencyFragment) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadVerifyResidencyFragment.getEventReceiver(), DocUploadEvent.ActiveDocRequestEvent.Residency.Rejected.INSTANCE, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DocUploadVerifyResidencyFragment docUploadVerifyResidencyFragment) {
        docUploadVerifyResidencyFragment.getDuxo().onContinueClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: DocUploadVerifyResidencyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyFragment$onViewCreated$3 */
    /* synthetic */ class C144223 extends FunctionReferenceImpl implements Function1<DocUploadVerifyResidencyViewState, Unit> {
        C144223(Object obj) {
            super(1, obj, DocUploadVerifyResidencyFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DocUploadVerifyResidencyViewState docUploadVerifyResidencyViewState) throws Resources.NotFoundException {
            invoke2(docUploadVerifyResidencyViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DocUploadVerifyResidencyViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadVerifyResidencyFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(DocUploadVerifyResidencyViewState viewState) throws Resources.NotFoundException {
        getBinding().docUploadVerifyResidencyContinueBtn.setEnabled(!(viewState instanceof DocUploadVerifyResidencyViewState.Loading));
        if (Intrinsics.areEqual(viewState, DocUploadVerifyResidencyViewState.Loading.INSTANCE)) {
            return;
        }
        if (viewState instanceof DocUploadVerifyResidencyViewState.Loaded) {
            bindLoadedContent((DocUploadVerifyResidencyViewState.Loaded) viewState);
            return;
        }
        if (viewState instanceof DocUploadVerifyResidencyViewState.VerifyResult) {
            DocUploadVerifyResidencyViewState.Result resultConsume = ((DocUploadVerifyResidencyViewState.VerifyResult) viewState).getEvent().consume();
            if (Intrinsics.areEqual(resultConsume, DocUploadVerifyResidencyViewState.Result.Continue.INSTANCE)) {
                DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.Residency.Confirmed(((DocUploadDestination.VerifyResidency) INSTANCE.getArgs((Fragment) this)).getRequestType()), false, 2, null);
                return;
            } else if (resultConsume instanceof DocUploadVerifyResidencyViewState.Result.Ineligible) {
                showIneligibleDialog(((DocUploadVerifyResidencyViewState.Result.Ineligible) resultConsume).getAddress());
                return;
            } else {
                if (resultConsume != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(viewState instanceof DocUploadVerifyResidencyViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable thConsume = ((DocUploadVerifyResidencyViewState.Error) viewState).getThrowable().consume();
        if (thConsume != null) {
            getEventReceiver().onError(thConsume);
        }
    }

    private final void bindLoadedContent(DocUploadVerifyResidencyViewState.Loaded viewState) throws Resources.NotFoundException {
        int i;
        ResidentialAddress address = viewState.getAddress();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String fullStateName = UtilKt.getFullStateName(address, resources);
        if (fullStateName == null) {
            fullStateName = "";
        }
        if (viewState.getHasCryptoAccount()) {
            i = C14254R.string.doc_upload_verify_residency_existing_message;
        } else {
            i = C14254R.string.doc_upload_verify_residency_new_message;
        }
        getBinding().docUploadBodyTxt.setText(getResources().getString(i, fullStateName));
        getBinding().docUploadVerifyResidencyNegativeBtn.setText(getResources().getString(C14254R.string.doc_upload_verify_residency_wrong_state, fullStateName));
        loadStateAsset(viewState.getAddress());
    }

    private final void showIneligibleDialog(ResidentialAddress address) throws Resources.NotFoundException {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String fullStateName = UtilKt.getFullStateName(address, resources);
        if (fullStateName == null) {
            fullStateName = "";
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog_Negative).setTitle(C14254R.string.doc_upload_verify_residency_ineligible_title, new Object[0]).setMessage(C14254R.string.doc_upload_verify_residency_ineligible_message, fullStateName).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, NOT_ELIGIBLE_DIALOG, false, 4, null);
    }

    private final void loadStateAsset(ResidentialAddress address) {
        String state;
        UiAddress address2 = address.getAddress();
        UsAddress usAddress = address2 instanceof UsAddress ? (UsAddress) address2 : null;
        if (usAddress == null || (state = usAddress.getState()) == null) {
            return;
        }
        ImageLoader.ImageRequest imageRequestCenterInside = getImageLoader().load(mapStateToAsset(state)).fit().centerInside();
        ImageView docUploadStateImg = getBinding().docUploadStateImg;
        Intrinsics.checkNotNullExpressionValue(docUploadStateImg, "docUploadStateImg");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestCenterInside, docUploadStateImg, null, null, 6, null);
    }

    private final HttpUrl mapStateToAsset(String stateCode) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String multiplierString = DensitySpecs.getMultiplierString(ContextsUiExtensions.getDensitySpec(fragmentActivityRequireActivity));
        return Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment("crypto_v2").addPathSegment("states").addPathSegment(stateCode).addPathSegment(multiplierString + ".png").build();
    }

    /* compiled from: DocUploadVerifyResidencyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$VerifyResidency;", "<init>", "()V", "NOT_ELIGIBLE_DIALOG", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadVerifyResidencyFragment, DocUploadDestination.VerifyResidency> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.VerifyResidency getArgs(DocUploadVerifyResidencyFragment docUploadVerifyResidencyFragment) {
            return (DocUploadDestination.VerifyResidency) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadVerifyResidencyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadVerifyResidencyFragment newInstance(DocUploadDestination.VerifyResidency verifyResidency) {
            return (DocUploadVerifyResidencyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, verifyResidency);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadVerifyResidencyFragment docUploadVerifyResidencyFragment, DocUploadDestination.VerifyResidency verifyResidency) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadVerifyResidencyFragment, verifyResidency);
        }
    }
}
