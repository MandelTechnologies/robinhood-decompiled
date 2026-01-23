package com.robinhood.shared.unverifiedaccountrecovery;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeViewState;
import com.robinhood.shared.unverifiedaccountrecovery.databinding.FragmentPathfinderSmsChallengeBinding;
import com.robinhood.utils.extensions.ObservablesAndroid;
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

/* compiled from: PathfinderSmsChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentPathfinderSmsChallengeBinding;", "getBinding", "()Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentPathfinderSmsChallengeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "getPathfinderStore", "()Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "setPathfinderStore", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "challengeLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeViewState;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PathfinderSmsChallengeFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> challengeLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public PathfinderStore pathfinderStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PathfinderSmsChallengeFragment.class, "binding", "getBinding()Lcom/robinhood/shared/unverifiedaccountrecovery/databinding/FragmentPathfinderSmsChallengeBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PathfinderSmsChallengeFragment() {
        super(C41128R.layout.fragment_pathfinder_sms_challenge);
        this.duxo = OldDuxos.oldDuxo(this, PathfinderSmsChallengeDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PathfinderSmsChallengeFragment2.INSTANCE);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeVerificationResultContract(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeFragment$challengeLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ChallengeVerificationResult challengeVerificationResult) {
                PathfinderSmsChallengeDuxo duxo = this.this$0.getDuxo();
                ChallengeVerificationResult.Completed completed = challengeVerificationResult instanceof ChallengeVerificationResult.Completed ? (ChallengeVerificationResult.Completed) challengeVerificationResult : null;
                duxo.submitChallengeResult(completed != null ? completed.getChallengeId() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.challengeLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderSmsChallengeDuxo getDuxo() {
        return (PathfinderSmsChallengeDuxo) this.duxo.getValue();
    }

    private final FragmentPathfinderSmsChallengeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPathfinderSmsChallengeBinding) value;
    }

    public final PathfinderStore getPathfinderStore() {
        PathfinderStore pathfinderStore = this.pathfinderStore;
        if (pathfinderStore != null) {
            return pathfinderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pathfinderStore");
        return null;
    }

    public final void setPathfinderStore(PathfinderStore pathfinderStore) {
        Intrinsics.checkNotNullParameter(pathfinderStore, "<set-?>");
        this.pathfinderStore = pathfinderStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncher = this.challengeLauncher;
            Companion companion = INSTANCE;
            NavigationActivityResultContract3.launch$default(activityResultLauncher, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(((UserViewStatePageContext.SmsChallenge) ((LegacyFragmentKey.PathfinderSmsChallenge) companion.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getFlowId(), true, null, null, ((UserViewStatePageContext.SmsChallenge) ((LegacyFragmentKey.PathfinderSmsChallenge) companion.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getUserUuid(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null)), null, false, 6, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C411271(this));
    }

    /* compiled from: PathfinderSmsChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeFragment$onStart$1 */
    /* synthetic */ class C411271 extends FunctionReferenceImpl implements Function1<PathfinderSmsChallengeViewState, Unit> {
        C411271(Object obj) {
            super(1, obj, PathfinderSmsChallengeFragment.class, "bind", "bind(Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PathfinderSmsChallengeViewState pathfinderSmsChallengeViewState) {
            invoke2(pathfinderSmsChallengeViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PathfinderSmsChallengeViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PathfinderSmsChallengeFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PathfinderSmsChallengeViewState viewState) {
        final PathfinderSmsChallengeViewState.State state = viewState.getState();
        ErrorView smsChallengeErrorView = getBinding().smsChallengeErrorView;
        Intrinsics.checkNotNullExpressionValue(smsChallengeErrorView, "smsChallengeErrorView");
        boolean z = state instanceof PathfinderSmsChallengeViewState.State.SubmitChallengeNetworkError;
        smsChallengeErrorView.setVisibility(z ? 0 : 8);
        ShimmerLoadingView smsChallengeLoadingView = getBinding().smsChallengeLoadingView;
        Intrinsics.checkNotNullExpressionValue(smsChallengeLoadingView, "smsChallengeLoadingView");
        smsChallengeLoadingView.setVisibility(state instanceof PathfinderSmsChallengeViewState.State.SubmittingChallenge ? 0 : 8);
        if (z) {
            getBinding().smsChallengeErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderSmsChallengeFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PathfinderSmsChallengeFragment.bind$lambda$1(this.f$0, state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(PathfinderSmsChallengeFragment pathfinderSmsChallengeFragment, PathfinderSmsChallengeViewState.State state) {
        pathfinderSmsChallengeFragment.getDuxo().submitChallengeResult(((PathfinderSmsChallengeViewState.State.SubmitChallengeNetworkError) state).getInput());
        return Unit.INSTANCE;
    }

    /* compiled from: PathfinderSmsChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderSmsChallengeFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsChallenge;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderSmsChallengeFragment, LegacyFragmentKey.PathfinderSmsChallenge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderSmsChallenge pathfinderSmsChallenge) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderSmsChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderSmsChallenge getArgs(PathfinderSmsChallengeFragment pathfinderSmsChallengeFragment) {
            return (LegacyFragmentKey.PathfinderSmsChallenge) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderSmsChallengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderSmsChallengeFragment newInstance(LegacyFragmentKey.PathfinderSmsChallenge pathfinderSmsChallenge) {
            return (PathfinderSmsChallengeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderSmsChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderSmsChallengeFragment pathfinderSmsChallengeFragment, LegacyFragmentKey.PathfinderSmsChallenge pathfinderSmsChallenge) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderSmsChallengeFragment, pathfinderSmsChallenge);
        }
    }
}
