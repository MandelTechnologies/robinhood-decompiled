package com.robinhood.android.recurring.hub.accountselector;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.RecurringFragmentKeys;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringAccountSelectionFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAccountSelected", "accountNumber", "", "Companion", "feature-recurring-hub_externalDebug", "state", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecurringAccountSelectionFragment extends GenericComposeFragment implements AccountSelectorCallbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RecurringAccountSelectionDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RecurringAccountSelectionFragment recurringAccountSelectionFragment, int i, Composer composer, int i2) {
        recurringAccountSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final RecurringAccountSelectionDuxo getDuxo() {
        return (RecurringAccountSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(requireContext().getDrawable(C20690R.drawable.ic_rds_close_24dp));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1749648653);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749648653, i2, -1, "com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionFragment.ComposeContent (RecurringAccountSelectionFragment.kt:36)");
            }
            RecurringAccountSelectionFragment2.RecurringAccountSelectionContent(ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), this, composerStartRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAccountSelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
    public void onAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        requireActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new InvestFlowIntentKey((InvestFlowStep) InvestFlowStep.Discovery.INSTANCE, true, false, false, (List) null, accountNumber, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 2012, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
    }

    /* compiled from: RecurringAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/recurring/contracts/RecurringAccountSelection;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionFragment;", "key", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RecurringFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RecurringAccountSelectionFragment createFragment(RecurringFragmentKeys key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RecurringAccountSelectionFragment();
        }
    }

    private static final RecurringAccountSelectionViewState ComposeContent$lambda$0(SnapshotState4<RecurringAccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
