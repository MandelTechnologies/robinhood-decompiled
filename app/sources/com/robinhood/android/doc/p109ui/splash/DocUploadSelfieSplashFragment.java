package com.robinhood.android.doc.p109ui.splash;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelfieSplashBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DocUploadSelfieSplashFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSelfieSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelfieSplashBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelfieSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadSelfieSplashFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadSelfieSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelfieSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadSelfieSplashFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadSelfieSplashFragment() {
        super(C14254R.layout.fragment_doc_upload_selfie_splash);
        this.binding = ViewBinding5.viewBinding(this, DocUploadSelfieSplashFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSelfieSplashFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final FragmentDocUploadSelfieSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadSelfieSplashBinding) value;
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton selfieSplashCta = getBinding().selfieSplashCta;
        Intrinsics.checkNotNullExpressionValue(selfieSplashCta, "selfieSplashCta");
        OnClickListeners.onClick(selfieSplashCta, new Function0() { // from class: com.robinhood.android.doc.ui.splash.DocUploadSelfieSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadSelfieSplashFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DocUploadSelfieSplashFragment docUploadSelfieSplashFragment) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSelfieSplashFragment.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.SelfieContinue(((DocUploadDestination.SelfieSplash) INSTANCE.getArgs((Fragment) docUploadSelfieSplashFragment)).getDetails()), false, 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: DocUploadSelfieSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSelfieSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSelfieSplashFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelfieSplash;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadSelfieSplashFragment, DocUploadDestination.SelfieSplash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.SelfieSplash getArgs(DocUploadSelfieSplashFragment docUploadSelfieSplashFragment) {
            return (DocUploadDestination.SelfieSplash) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadSelfieSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadSelfieSplashFragment newInstance(DocUploadDestination.SelfieSplash selfieSplash) {
            return (DocUploadSelfieSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, selfieSplash);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadSelfieSplashFragment docUploadSelfieSplashFragment, DocUploadDestination.SelfieSplash selfieSplash) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadSelfieSplashFragment, selfieSplash);
        }
    }
}
