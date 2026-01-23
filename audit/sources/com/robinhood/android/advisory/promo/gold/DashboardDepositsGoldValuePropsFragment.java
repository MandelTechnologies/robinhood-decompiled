package com.robinhood.android.advisory.promo.gold;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.advisory.contracts.AdvisoryGoldValuePropsFragmentKey;
import com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DashboardDepositsGoldValuePropsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/gold/DashboardDepositsGoldValuePropsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DashboardDepositsGoldValuePropsFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DashboardDepositsGoldValuePropsFragment dashboardDepositsGoldValuePropsFragment, int i, Composer composer, int i2) {
        dashboardDepositsGoldValuePropsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: DashboardDepositsGoldValuePropsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment$ComposeContent$1 */
    static final class C93201 implements Function2<Composer, Integer, Unit> {
        C93201() {
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
                ComposerKt.traceEventStart(1663015431, i, -1, "com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment.ComposeContent.<anonymous> (DashboardDepositsGoldValuePropsFragment.kt:17)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(DashboardDepositsGoldValuePropsFragment.this);
            final DashboardDepositsGoldValuePropsFragment dashboardDepositsGoldValuePropsFragment = DashboardDepositsGoldValuePropsFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardDepositsGoldValuePropsFragment.C93201.invoke$lambda$1$lambda$0(dashboardDepositsGoldValuePropsFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            DashboardDepositsGoldValuePropsComposable3.AdvisoryGoldValuePropsScreen((Function0) objRememberedValue, null, null, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DashboardDepositsGoldValuePropsFragment dashboardDepositsGoldValuePropsFragment) {
            dashboardDepositsGoldValuePropsFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1612613823);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1612613823, i2, -1, "com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment.ComposeContent (DashboardDepositsGoldValuePropsFragment.kt:15)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1663015431, true, new C93201(), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.promo.gold.DashboardDepositsGoldValuePropsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardDepositsGoldValuePropsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: DashboardDepositsGoldValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/gold/DashboardDepositsGoldValuePropsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/promo/gold/DashboardDepositsGoldValuePropsFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryGoldValuePropsFragmentKey;", "<init>", "()V", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DashboardDepositsGoldValuePropsFragment, AdvisoryGoldValuePropsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryGoldValuePropsFragmentKey advisoryGoldValuePropsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryGoldValuePropsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryGoldValuePropsFragmentKey getArgs(DashboardDepositsGoldValuePropsFragment dashboardDepositsGoldValuePropsFragment) {
            return (AdvisoryGoldValuePropsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, dashboardDepositsGoldValuePropsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DashboardDepositsGoldValuePropsFragment newInstance(AdvisoryGoldValuePropsFragmentKey advisoryGoldValuePropsFragmentKey) {
            return (DashboardDepositsGoldValuePropsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryGoldValuePropsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DashboardDepositsGoldValuePropsFragment dashboardDepositsGoldValuePropsFragment, AdvisoryGoldValuePropsFragmentKey advisoryGoldValuePropsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, dashboardDepositsGoldValuePropsFragment, advisoryGoldValuePropsFragmentKey);
        }
    }
}
