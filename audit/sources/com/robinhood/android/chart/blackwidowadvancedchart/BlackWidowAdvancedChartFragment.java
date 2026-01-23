package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlackWidowAdvancedChartFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "Companion", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(BlackWidowAdvancedChartFragment blackWidowAdvancedChartFragment, int i, Composer composer, int i2) {
        blackWidowAdvancedChartFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(844829340);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844829340, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartFragment.ComposeContent (BlackWidowAdvancedChartFragment.kt:13)");
            }
            Companion companion = INSTANCE;
            String string2 = ((BlackWidowAdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            BlackWidowAdvancedChartFragmentKey2 instrumentType = ((BlackWidowAdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getInstrumentType();
            String source = ((BlackWidowAdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getSource();
            boolean showNuxLoading = ((BlackWidowAdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getShowNuxLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlackWidowAdvancedChartFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable(string2, instrumentType, source, (Function0) objRememberedValue, showNuxLoading, null, null, composerStartRestartGroup, 0, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlackWidowAdvancedChartFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(BlackWidowAdvancedChartFragment blackWidowAdvancedChartFragment) {
        blackWidowAdvancedChartFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: BlackWidowAdvancedChartFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartFragment;", "Lcom/robinhood/shared/chart/contracts/advancedChart/BlackWidowAdvancedChartFragmentKey;", "<init>", "()V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BlackWidowAdvancedChartFragment, BlackWidowAdvancedChartFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(BlackWidowAdvancedChartFragmentKey blackWidowAdvancedChartFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, blackWidowAdvancedChartFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BlackWidowAdvancedChartFragmentKey getArgs(BlackWidowAdvancedChartFragment blackWidowAdvancedChartFragment) {
            return (BlackWidowAdvancedChartFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, blackWidowAdvancedChartFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BlackWidowAdvancedChartFragment newInstance(BlackWidowAdvancedChartFragmentKey blackWidowAdvancedChartFragmentKey) {
            return (BlackWidowAdvancedChartFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, blackWidowAdvancedChartFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BlackWidowAdvancedChartFragment blackWidowAdvancedChartFragment, BlackWidowAdvancedChartFragmentKey blackWidowAdvancedChartFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, blackWidowAdvancedChartFragment, blackWidowAdvancedChartFragmentKey);
        }
    }
}
