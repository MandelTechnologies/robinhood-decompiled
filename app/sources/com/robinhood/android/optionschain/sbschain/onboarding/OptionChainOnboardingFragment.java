package com.robinhood.android.optionschain.sbschain.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainOnboardingFragmentKey;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo2;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionChainOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainOnboardingFragment extends NoTitleToolbarFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OptionChainOnboardingFragment() {
        super(C24135R.layout.fragment_option_chain_onboarding);
        this.duxo = DuxosKt.duxo(this, OptionChainOnboardingDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainOnboardingDuxo getDuxo() {
        return (OptionChainOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C244891(null), 1, null);
    }

    /* compiled from: OptionChainOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingFragment$onViewCreated$1", m3645f = "OptionChainOnboardingFragment.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingFragment$onViewCreated$1 */
    static final class C244891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244891(Continuation<? super C244891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainOnboardingFragment.this.new C244891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<OptionChainOnboardingDuxo2> stateFlow = OptionChainOnboardingFragment.this.getDuxo().getStateFlow();
                final OptionChainOnboardingFragment optionChainOnboardingFragment = OptionChainOnboardingFragment.this;
                FlowCollector<? super OptionChainOnboardingDuxo2> flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OptionChainOnboardingDuxo2) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(OptionChainOnboardingDuxo2 optionChainOnboardingDuxo2, Continuation<? super Unit> continuation) {
                        if (!Intrinsics.areEqual(optionChainOnboardingDuxo2, OptionChainOnboardingDuxo2.Loading.INSTANCE)) {
                            if (Intrinsics.areEqual(optionChainOnboardingDuxo2, OptionChainOnboardingDuxo2.Error.INSTANCE)) {
                                optionChainOnboardingFragment.requireActivity().finish();
                            } else {
                                if (!(optionChainOnboardingDuxo2 instanceof OptionChainOnboardingDuxo2.Loaded)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Navigator navigator = optionChainOnboardingFragment.getNavigator();
                                Context contextRequireContext = optionChainOnboardingFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, ((OptionChainOnboardingDuxo2.Loaded) optionChainOnboardingDuxo2).getOptionChainIntentKey(), null, false, null, null, 60, null);
                                optionChainOnboardingFragment.requireActivity().finish();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: OptionChainOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingFragment;", "Lcom/robinhood/android/options/contracts/OptionChainOnboardingFragmentKey;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionChainOnboardingFragment, OptionChainOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionChainOnboardingFragmentKey optionChainOnboardingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionChainOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionChainOnboardingFragmentKey getArgs(OptionChainOnboardingFragment optionChainOnboardingFragment) {
            return (OptionChainOnboardingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionChainOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionChainOnboardingFragment newInstance(OptionChainOnboardingFragmentKey optionChainOnboardingFragmentKey) {
            return (OptionChainOnboardingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionChainOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionChainOnboardingFragment optionChainOnboardingFragment, OptionChainOnboardingFragmentKey optionChainOnboardingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionChainOnboardingFragment, optionChainOnboardingFragmentKey);
        }
    }
}
