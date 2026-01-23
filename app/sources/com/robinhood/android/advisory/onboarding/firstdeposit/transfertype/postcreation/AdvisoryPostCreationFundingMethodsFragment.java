package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.advisory.contracts.AdvisoryPostCreationFundingMethodsKey;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen2;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsViewState;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel3;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryPostCreationFundingMethodsFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J*\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\t\u0010 \u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackClicked", "onRetryClicked", "onSelection", "selection", "Lcom/robinhood/models/advisory/api/contribution/FirstTimeTransferType;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "rowLoggingIdentifier", "", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-onboarding_externalDebug", "state", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPostCreationFundingMethodsFragment extends GenericComposeFragment implements RegionGated, AdvisoryFundingMethodsScreen {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean toolbarVisible;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdvisoryPostCreationFundingMethodsDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AdvisoryPostCreationFundingMethodsFragment advisoryPostCreationFundingMethodsFragment, int i, Composer composer, int i2) {
        advisoryPostCreationFundingMethodsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final AdvisoryPostCreationFundingMethodsDuxo getDuxo() {
        return (AdvisoryPostCreationFundingMethodsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1520015637);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1520015637, i2, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsFragment.ComposeContent (AdvisoryPostCreationFundingMethodsFragment.kt:29)");
            }
            AdvisoryFundingMethodsViewState advisoryFundingMethodsViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            Companion companion = INSTANCE;
            AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen(advisoryFundingMethodsViewStateComposeContent$lambda$0, ((AdvisoryPostCreationFundingMethodsKey) companion.getArgs((Fragment) this)).getSource(), ((AdvisoryPostCreationFundingMethodsKey) companion.getArgs((Fragment) this)).getBrokerageAccountType(), this, null, composerStartRestartGroup, (i2 << 9) & 7168, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPostCreationFundingMethodsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onBackClicked() {
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onRetryClicked() {
        getDuxo().retry();
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen
    public void onSelection(ApiAdvisoryFirstTimeContributionViewModel3 selection, ApiAdvisoryFirstTimeContributionViewModel viewModel, String rowLoggingIdentifier, TransferAccountInfo sourceTransferAccountInfo) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(rowLoggingIdentifier, "rowLoggingIdentifier");
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, FundingSelectionIntentKey.getFundingSelectionIntentKey((AdvisoryPostCreationFundingMethodsKey) INSTANCE.getArgs((Fragment) this), selection, sourceTransferAccountInfo), null, false, null, null, 60, null);
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryPostCreationFundingMethodsKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AdvisoryPostCreationFundingMethodsFragment, AdvisoryPostCreationFundingMethodsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryPostCreationFundingMethodsKey advisoryPostCreationFundingMethodsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryPostCreationFundingMethodsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryPostCreationFundingMethodsKey getArgs(AdvisoryPostCreationFundingMethodsFragment advisoryPostCreationFundingMethodsFragment) {
            return (AdvisoryPostCreationFundingMethodsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, advisoryPostCreationFundingMethodsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryPostCreationFundingMethodsFragment newInstance(AdvisoryPostCreationFundingMethodsKey advisoryPostCreationFundingMethodsKey) {
            return (AdvisoryPostCreationFundingMethodsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryPostCreationFundingMethodsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryPostCreationFundingMethodsFragment advisoryPostCreationFundingMethodsFragment, AdvisoryPostCreationFundingMethodsKey advisoryPostCreationFundingMethodsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, advisoryPostCreationFundingMethodsFragment, advisoryPostCreationFundingMethodsKey);
        }
    }

    private static final AdvisoryFundingMethodsViewState ComposeContent$lambda$0(SnapshotState4<? extends AdvisoryFundingMethodsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
