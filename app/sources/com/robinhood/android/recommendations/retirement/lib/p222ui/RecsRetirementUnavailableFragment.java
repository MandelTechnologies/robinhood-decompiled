package com.robinhood.android.recommendations.retirement.lib.p222ui;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.education.contracts.NewsFeed;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.recommendations.retirement.lib.C26016R;
import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementUnavailableFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\t\u0010\u0010\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableContentCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCloseClick", "onPrimaryCtaClick", "onSecondaryCtaClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecsRetirementUnavailableFragment extends GenericComposeFragment implements RecsRetirementUnavailableContent3, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RecommendationsRegionGate.INSTANCE, RetirementRegionGate.INSTANCE);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RecsRetirementUnavailableFragment recsRetirementUnavailableFragment, int i, Composer composer, int i2) {
        recsRetirementUnavailableFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757044137);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757044137, i2, -1, "com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableFragment.ComposeContent (RecsRetirementUnavailableFragment.kt:24)");
            }
            String string2 = getString(C26016R.string.recs_retirement_unavailable_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(C26016R.string.recs_retirement_unavailable_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(C26016R.string.recs_retirement_unavailable_cta_primary);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = getString(C26016R.string.recs_retirement_unavailable_cta_secondary);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            RecsRetirementUnavailableContent4.UnavailableContent(new UnavailableContentState(string2, string3, string4, string5, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getXrayLight(), null), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementUnavailableFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementUnavailableFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementUnavailableContent3
    public void onCloseClick() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementUnavailableContent3
    public void onPrimaryCtaClick() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInTab(new NewsFeed(true, null, 2, null), false, false, null, 12, null), null, false, 12, null));
        requireActivity().finish();
    }

    @Override // com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementUnavailableContent3
    public void onSecondaryCtaClick() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse("robinhood://web?url=https://robinhood.com/us/en/support/articles/retirement-recommendations/"), null, null, false, null, 60, null);
        requireActivity().finish();
    }

    /* compiled from: RecsRetirementUnavailableFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementUnavailableFragment;", "<init>", "()V", "feature-lib-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<RecsRetirementUnavailableFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((RecsRetirementUnavailableFragment) fragment);
        }

        public Void getArgs(RecsRetirementUnavailableFragment recsRetirementUnavailableFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, recsRetirementUnavailableFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RecsRetirementUnavailableFragment newInstance() {
            return (RecsRetirementUnavailableFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RecsRetirementUnavailableFragment newInstance(Void r1) {
            return (RecsRetirementUnavailableFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
