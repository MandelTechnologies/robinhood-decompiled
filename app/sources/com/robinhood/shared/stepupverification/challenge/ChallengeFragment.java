package com.robinhood.shared.stepupverification.challenge;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.security.contracts.PathfinderChallenge;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.p355ui.pathfinder.contexts.ChallengeContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.challenge.ChallengeDataState2;
import com.robinhood.shared.stepupverification.databinding.FragmentLoadingWithErrorViewBinding;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "binding", "Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", "getBinding", "()Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDuxo;", "getDuxo", "()Lcom/robinhood/shared/stepupverification/challenge/ChallengeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "challengeVerificationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationIntentKey;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "bind", "viewState", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeViewState;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ChallengeFragment extends BaseFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> challengeVerificationLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChallengeFragment.class, "binding", "getBinding()Lcom/robinhood/shared/stepupverification/databinding/FragmentLoadingWithErrorViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ChallengeFragment() {
        super(C39791R.layout.fragment_loading_with_error_view);
        this.binding = ViewBinding5.viewBinding(this, ChallengeFragment$binding$2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, ChallengeDuxo.class);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeVerificationResultContract(new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeFragment$challengeVerificationLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ChallengeVerificationResult challengeVerificationResult) {
                this.this$0.getDuxo().submitChallengeResult(challengeVerificationResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.challengeVerificationLauncher = activityResultLauncherRegisterForActivityResult;
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

    private final FragmentLoadingWithErrorViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoadingWithErrorViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeDuxo getDuxo() {
        return (ChallengeDuxo) this.duxo.getValue();
    }

    /* compiled from: ChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.ChallengeFragment$onViewCreated$1", m3645f = "ChallengeFragment.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeFragment$onViewCreated$1 */
    static final class C398011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398011(Continuation<? super C398011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeFragment.this.new C398011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChallengeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ChallengeFragment $tmp0;

            AnonymousClass1(ChallengeFragment challengeFragment) {
                this.$tmp0 = challengeFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ChallengeFragment.class, "bind", "bind(Lcom/robinhood/shared/stepupverification/challenge/ChallengeViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(ChallengeViewState challengeViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C398011.invokeSuspend$bind(this.$tmp0, challengeViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ChallengeViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ChallengeViewState> stateFlow = ChallengeFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ChallengeFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(ChallengeFragment challengeFragment, ChallengeViewState challengeViewState, Continuation continuation) {
            challengeFragment.bind(challengeViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C398011(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ChallengeContext context = ((UserViewStatePageContext.Challenge) ((PathfinderChallenge) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncher = this.challengeVerificationLauncher;
        String sheriffFlowId = context.getSheriffFlowId();
        boolean z = getAppType() != AppType.RHC;
        Challenge sheriffChallenge = context.getSheriffChallenge();
        UUID verificationWorkflowId = context.getVerificationWorkflowId();
        String fallbackCtaText = context.getFallbackCtaText();
        ChallengeContext.Alert initialAlert = context.getInitialAlert();
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(sheriffFlowId, z, sheriffChallenge, null, null, verificationWorkflowId, fallbackCtaText, initialAlert != null ? new ChallengeVerificationInput.Alert(initialAlert.getTitle(), initialAlert.getDescription(), initialAlert.getDismissCtaText()) : null, 24, null)), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ChallengeViewState viewState) {
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(viewState.getShowLoadingView() ? 0 : 8);
        ErrorView errorView = getBinding().errorView;
        Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
        errorView.setVisibility(viewState.getShowErrorView() ? 0 : 8);
        final ChallengeDataState2 state = viewState.getState();
        if (Intrinsics.areEqual(state, ChallengeDataState2.Loading.INSTANCE)) {
            return;
        }
        if (state instanceof ChallengeDataState2.Error) {
            getBinding().errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeFragment.bind$lambda$2(this.f$0, state);
                }
            });
        } else {
            if (!Intrinsics.areEqual(state, ChallengeDataState2.Exit.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(ChallengeFragment challengeFragment, ChallengeDataState2 challengeDataState2) {
        ChallengeDuxo.submitChallengeResult$default(challengeFragment.getDuxo(), ((ChallengeDataState2.Error) challengeDataState2).getInput(), false, 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeFragment;", "Lcom/robinhood/android/security/contracts/PathfinderChallenge;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ChallengeFragment, PathfinderChallenge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PathfinderChallenge pathfinderChallenge) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PathfinderChallenge getArgs(ChallengeFragment challengeFragment) {
            return (PathfinderChallenge) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, challengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChallengeFragment newInstance(PathfinderChallenge pathfinderChallenge) {
            return (ChallengeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChallengeFragment challengeFragment, PathfinderChallenge pathfinderChallenge) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, challengeFragment, pathfinderChallenge);
        }
    }
}
