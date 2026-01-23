package com.robinhood.shared.unverifiedaccountrecovery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.pathfinder.contexts.UarContactSelfieVerificationInitiateContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateViewState;
import com.robinhood.shared.unverifiedaccountrecovery.databinding.FragmentUarContactSelfieVerificationInitiateBinding;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: UarContactSelfieVerificationInitiateFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentUarContactSelfieVerificationInitiateBinding;", "getBinding", "()Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentUarContactSelfieVerificationInitiateBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "selfieLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UarContactSelfieVerificationInitiateFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> selfieLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UarContactSelfieVerificationInitiateFragment.class, "binding", "getBinding()Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentUarContactSelfieVerificationInitiateBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UarContactSelfieVerificationInitiateFragment() {
        super(C41128R.layout.fragment_uar_contact_selfie_verification_initiate);
        this.duxo = OldDuxos.oldDuxo(this, UarContactSelfieVerificationInitiateDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, UarContactSelfieVerificationInitiateFragment2.INSTANCE);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateFragment$selfieLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                int resultCode = result.getResultCode();
                if (resultCode == -1) {
                    this.this$0.getDuxo().submitSelfieVerificationResult(true);
                } else if (resultCode == 2) {
                    this.this$0.getDuxo().submitSelfieVerificationResult(false);
                } else {
                    this.this$0.requireActivity().onBackPressed();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.selfieLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UarContactSelfieVerificationInitiateDuxo getDuxo() {
        return (UarContactSelfieVerificationInitiateDuxo) this.duxo.getValue();
    }

    private final FragmentUarContactSelfieVerificationInitiateBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUarContactSelfieVerificationInitiateBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            UarContactSelfieVerificationInitiateContext context = ((UserViewStatePageContext.UarContactSelfieVerificationInitiate) ((LegacyFragmentKey.UarContactSelfieVerificationInitiate) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            this.selfieLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new DocumentUpload(CollectionsKt.listOf((Object[]) new DocumentRequest[]{new DocumentRequest(null, null, context.getPhotoIdRequestId(), null, false, null, null, null, null, null, null, 2043, null), new DocumentRequest(null, null, context.getThreePointSelfieRequestId(), null, false, null, null, null, null, null, null, 2043, null)}), false, false, null, false, null, false, null, false, 510, null), false, false, false, null, false, true, false, false, false, null, false, 6772, null));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C411351(this));
    }

    /* compiled from: UarContactSelfieVerificationInitiateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateFragment$onStart$1 */
    /* synthetic */ class C411351 extends FunctionReferenceImpl implements Function1<UarContactSelfieVerificationInitiateViewState, Unit> {
        C411351(Object obj) {
            super(1, obj, UarContactSelfieVerificationInitiateFragment.class, "bind", "bind(Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UarContactSelfieVerificationInitiateViewState uarContactSelfieVerificationInitiateViewState) {
            invoke2(uarContactSelfieVerificationInitiateViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UarContactSelfieVerificationInitiateViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((UarContactSelfieVerificationInitiateFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(UarContactSelfieVerificationInitiateViewState viewState) {
        final UarContactSelfieVerificationInitiateViewState.State state = viewState.getState();
        ErrorView selfieVerificationErrorView = getBinding().selfieVerificationErrorView;
        Intrinsics.checkNotNullExpressionValue(selfieVerificationErrorView, "selfieVerificationErrorView");
        boolean z = state instanceof UarContactSelfieVerificationInitiateViewState.State.SubmitNetworkError;
        selfieVerificationErrorView.setVisibility(z ? 0 : 8);
        ShimmerLoadingView selfieVerificationLoadingView = getBinding().selfieVerificationLoadingView;
        Intrinsics.checkNotNullExpressionValue(selfieVerificationLoadingView, "selfieVerificationLoadingView");
        selfieVerificationLoadingView.setVisibility(state instanceof UarContactSelfieVerificationInitiateViewState.State.Submitting ? 0 : 8);
        if (z) {
            getBinding().selfieVerificationErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationInitiateFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UarContactSelfieVerificationInitiateFragment.bind$lambda$0(this.f$0, state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(UarContactSelfieVerificationInitiateFragment uarContactSelfieVerificationInitiateFragment, UarContactSelfieVerificationInitiateViewState.State state) {
        uarContactSelfieVerificationInitiateFragment.getDuxo().submitSelfieVerificationResult(((UarContactSelfieVerificationInitiateViewState.State.SubmitNetworkError) state).getSuccess());
        return Unit.INSTANCE;
    }

    /* compiled from: UarContactSelfieVerificationInitiateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationInitiateFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationInitiate;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarContactSelfieVerificationInitiateFragment, LegacyFragmentKey.UarContactSelfieVerificationInitiate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.UarContactSelfieVerificationInitiate uarContactSelfieVerificationInitiate) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, uarContactSelfieVerificationInitiate);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.UarContactSelfieVerificationInitiate getArgs(UarContactSelfieVerificationInitiateFragment uarContactSelfieVerificationInitiateFragment) {
            return (LegacyFragmentKey.UarContactSelfieVerificationInitiate) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarContactSelfieVerificationInitiateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarContactSelfieVerificationInitiateFragment newInstance(LegacyFragmentKey.UarContactSelfieVerificationInitiate uarContactSelfieVerificationInitiate) {
            return (UarContactSelfieVerificationInitiateFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, uarContactSelfieVerificationInitiate);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarContactSelfieVerificationInitiateFragment uarContactSelfieVerificationInitiateFragment, LegacyFragmentKey.UarContactSelfieVerificationInitiate uarContactSelfieVerificationInitiate) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarContactSelfieVerificationInitiateFragment, uarContactSelfieVerificationInitiate);
        }
    }
}
