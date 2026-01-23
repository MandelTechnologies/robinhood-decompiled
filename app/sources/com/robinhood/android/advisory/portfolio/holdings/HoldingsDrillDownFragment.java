package com.robinhood.android.advisory.portfolio.holdings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.advisory.contracts.HoldingsDrillDownFragmentKey;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HoldingsDrillDownFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-advisory-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class HoldingsDrillDownFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, HoldingsDrillDownDuxo.class);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(HoldingsDrillDownFragment holdingsDrillDownFragment, int i, Composer composer, int i2) {
        holdingsDrillDownFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final HoldingsDrillDownDuxo getDuxo() {
        return (HoldingsDrillDownDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(738449270);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738449270, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment.ComposeContent (HoldingsDrillDownFragment.kt:21)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(986601803, true, new C91561(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HoldingsDrillDownFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HoldingsDrillDownFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment$ComposeContent$1 */
    static final class C91561 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<HoldingsDrillDownViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C91561(SnapshotState4<? extends HoldingsDrillDownViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(986601803, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment.ComposeContent.<anonymous> (HoldingsDrillDownFragment.kt:25)");
            }
            HoldingsDrillDownViewState holdingsDrillDownViewStateComposeContent$lambda$0 = HoldingsDrillDownFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(HoldingsDrillDownFragment.this);
            final HoldingsDrillDownFragment holdingsDrillDownFragment = HoldingsDrillDownFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HoldingsDrillDownFragment.C91561.invoke$lambda$1$lambda$0(holdingsDrillDownFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            HoldingsDrillDownScreen.HoldingsDrillDownScreen(holdingsDrillDownViewStateComposeContent$lambda$0, (Function0) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(HoldingsDrillDownFragment holdingsDrillDownFragment) {
            holdingsDrillDownFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: HoldingsDrillDownFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownFragment;", "Lcom/robinhood/android/advisory/contracts/HoldingsDrillDownFragmentKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<HoldingsDrillDownFragment, HoldingsDrillDownFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(HoldingsDrillDownFragmentKey holdingsDrillDownFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, holdingsDrillDownFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public HoldingsDrillDownFragmentKey getArgs(HoldingsDrillDownFragment holdingsDrillDownFragment) {
            return (HoldingsDrillDownFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, holdingsDrillDownFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public HoldingsDrillDownFragment newInstance(HoldingsDrillDownFragmentKey holdingsDrillDownFragmentKey) {
            return (HoldingsDrillDownFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, holdingsDrillDownFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(HoldingsDrillDownFragment holdingsDrillDownFragment, HoldingsDrillDownFragmentKey holdingsDrillDownFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, holdingsDrillDownFragment, holdingsDrillDownFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoldingsDrillDownViewState ComposeContent$lambda$0(SnapshotState4<? extends HoldingsDrillDownViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
