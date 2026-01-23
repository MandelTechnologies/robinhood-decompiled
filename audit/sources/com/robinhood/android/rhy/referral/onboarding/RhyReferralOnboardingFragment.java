package com.robinhood.android.rhy.referral.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialog;
import com.robinhood.android.rhyonboarding.contracts.RhyReferralOnboardingKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RhyReferralOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\r\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "navigateAndFinish", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-referral_externalDebug", "viewState", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingViewState;", "dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralOnboardingFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RhyReferralOnboardingDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(RhyReferralOnboardingFragment rhyReferralOnboardingFragment, int i, Composer composer, int i2) {
        rhyReferralOnboardingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyReferralOnboardingDuxo getDuxo() {
        return (RhyReferralOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C274751(null), 1, null);
    }

    /* compiled from: RhyReferralOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1", m3645f = "RhyReferralOnboardingFragment.kt", m3646l = {38}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1 */
    static final class C274751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C274751(Continuation<? super C274751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralOnboardingFragment.this.new C274751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C274751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<RhyReferralOnboardingViewState> stateFlow = RhyReferralOnboardingFragment.this.getDuxo().getStateFlow();
                Flow<RhyReferralOnboardingViewState> flow = new Flow<RhyReferralOnboardingViewState>() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1$invokeSuspend$$inlined$filter$1$2", m3645f = "RhyReferralOnboardingFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$onViewCreated$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((RhyReferralOnboardingViewState) obj).getRhyReferralOutAction() != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super RhyReferralOnboardingViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final RhyReferralOnboardingFragment rhyReferralOnboardingFragment = RhyReferralOnboardingFragment.this;
                FlowCollector<? super RhyReferralOnboardingViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment.onViewCreated.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RhyReferralOnboardingViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RhyReferralOnboardingViewState rhyReferralOnboardingViewState, Continuation<? super Unit> continuation) {
                        if (rhyReferralOnboardingViewState.getRhyReferralOutAction() instanceof RhyReferralOnboardingStore4.Direct) {
                            rhyReferralOnboardingFragment.navigateAndFinish(((RhyReferralOnboardingStore4.Direct) rhyReferralOnboardingViewState.getRhyReferralOutAction()).getIntentKey());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-381472500);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381472500, i2, -1, "com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment.ComposeContent (RhyReferralOnboardingFragment.kt:48)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final RhyReferralOnboardingStore4 rhyReferralOutAction = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRhyReferralOutAction();
            snapshotState.setValue(rhyReferralOutAction instanceof RhyReferralOnboardingStore4.Dialog ? ((RhyReferralOnboardingStore4.Dialog) rhyReferralOutAction).getDialogContent() : null);
            RhyReferralOnboardingStore4.Dialog.DialogContent dialogContentComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1522837883);
            if (dialogContentComposeContent$lambda$2 != null) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(rhyReferralOutAction) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyReferralOnboardingFragment.ComposeContent$lambda$8$lambda$5$lambda$4(rhyReferralOutAction, this, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyReferralOnboardingFragment.ComposeContent$lambda$8$lambda$7$lambda$6(this.f$0, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhyReferralOnboardingActionDialog.RhyReferralOnboardingActionDialog(dialogContentComposeContent$lambda$2, function0, (Function0) objRememberedValue3, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.onboarding.RhyReferralOnboardingFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralOnboardingFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$5$lambda$4(RhyReferralOnboardingStore4 rhyReferralOnboardingStore4, RhyReferralOnboardingFragment rhyReferralOnboardingFragment, SnapshotState snapshotState) {
        if (rhyReferralOnboardingStore4 instanceof RhyReferralOnboardingStore4.Dialog) {
            rhyReferralOnboardingFragment.navigateAndFinish(((RhyReferralOnboardingStore4.Dialog) rhyReferralOnboardingStore4).getIntentKey());
        }
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7$lambda$6(RhyReferralOnboardingFragment rhyReferralOnboardingFragment, SnapshotState snapshotState) {
        snapshotState.setValue(null);
        rhyReferralOnboardingFragment.navigateAndFinish(new TabLinkIntentKey.McDuckling(null, false, null, 7, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateAndFinish(IntentKey intentKey) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKey, null, false, null, null, 60, null);
        requireActivity().overridePendingTransition(0, 0);
        requireActivity().finish();
    }

    private static final RhyReferralOnboardingViewState ComposeContent$lambda$0(SnapshotState4<RhyReferralOnboardingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final RhyReferralOnboardingStore4.Dialog.DialogContent ComposeContent$lambda$2(SnapshotState<RhyReferralOnboardingStore4.Dialog.DialogContent> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: RhyReferralOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/rhy/referral/onboarding/RhyReferralOnboardingFragment;", "Lcom/robinhood/android/rhyonboarding/contracts/RhyReferralOnboardingKey;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RhyReferralOnboardingFragment, RhyReferralOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhyReferralOnboardingKey rhyReferralOnboardingKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyReferralOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RhyReferralOnboardingKey getArgs(RhyReferralOnboardingFragment rhyReferralOnboardingFragment) {
            return (RhyReferralOnboardingKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rhyReferralOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyReferralOnboardingFragment newInstance(RhyReferralOnboardingKey rhyReferralOnboardingKey) {
            return (RhyReferralOnboardingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyReferralOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyReferralOnboardingFragment rhyReferralOnboardingFragment, RhyReferralOnboardingKey rhyReferralOnboardingKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rhyReferralOnboardingFragment, rhyReferralOnboardingKey);
        }
    }
}
