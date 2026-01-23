package com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated.PdtDepositFundsInitiatedFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PdtDepositFundsInitiatedFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-transfers-pathfinder_externalDebug", "viewState", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PdtDepositFundsInitiatedFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, PdtDepositFundsInitiatedDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(PdtDepositFundsInitiatedFragment pdtDepositFundsInitiatedFragment, int i, Composer composer, int i2) throws Throwable {
        pdtDepositFundsInitiatedFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PdtDepositFundsInitiatedDuxo getDuxo() {
        return (PdtDepositFundsInitiatedDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Throwable thConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(1292800737);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292800737, i2, -1, "com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedFragment.ComposeContent (PdtDepositFundsInitiatedFragment.kt:18)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new PdtDepositFundsInitiatedViewState(null, false, null, 7, null), composerStartRestartGroup, ComposeUiEvent.$stable << 3);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1573299540, true, new C304301(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            ComposeUiEvent<Throwable> sendContinueErrorEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSendContinueErrorEvent();
            if (sendContinueErrorEvent == null || (thConsume = sendContinueErrorEvent.consume()) == null || AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw thConsume;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdtDepositFundsInitiatedFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PdtDepositFundsInitiatedFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedFragment$ComposeContent$1 */
    static final class C304301 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<PdtDepositFundsInitiatedViewState> $viewState$delegate;

        C304301(SnapshotState4<PdtDepositFundsInitiatedViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1573299540, i, -1, "com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedFragment.ComposeContent.<anonymous> (PdtDepositFundsInitiatedFragment.kt:22)");
            }
            PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewStateComposeContent$lambda$0 = PdtDepositFundsInitiatedFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(PdtDepositFundsInitiatedFragment.this);
            final PdtDepositFundsInitiatedFragment pdtDepositFundsInitiatedFragment = PdtDepositFundsInitiatedFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PdtDepositFundsInitiatedFragment.C304301.invoke$lambda$1$lambda$0(pdtDepositFundsInitiatedFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PdtDepositFundsInitiatedComposable.PdtDepositFundsInitiatedComposable(pdtDepositFundsInitiatedViewStateComposeContent$lambda$0, (Function0) objRememberedValue, composer, ComposeUiEvent.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PdtDepositFundsInitiatedFragment pdtDepositFundsInitiatedFragment) {
            pdtDepositFundsInitiatedFragment.getDuxo().sendContinue();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PdtDepositFundsInitiatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderPdtDepositFundsInitiated;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PdtDepositFundsInitiatedFragment, LegacyFragmentKey.PathfinderPdtDepositFundsInitiated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderPdtDepositFundsInitiated pathfinderPdtDepositFundsInitiated) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderPdtDepositFundsInitiated);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderPdtDepositFundsInitiated getArgs(PdtDepositFundsInitiatedFragment pdtDepositFundsInitiatedFragment) {
            return (LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pdtDepositFundsInitiatedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PdtDepositFundsInitiatedFragment newInstance(LegacyFragmentKey.PathfinderPdtDepositFundsInitiated pathfinderPdtDepositFundsInitiated) {
            return (PdtDepositFundsInitiatedFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderPdtDepositFundsInitiated);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PdtDepositFundsInitiatedFragment pdtDepositFundsInitiatedFragment, LegacyFragmentKey.PathfinderPdtDepositFundsInitiated pathfinderPdtDepositFundsInitiated) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pdtDepositFundsInitiatedFragment, pathfinderPdtDepositFundsInitiated);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdtDepositFundsInitiatedViewState ComposeContent$lambda$0(SnapshotState4<PdtDepositFundsInitiatedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
