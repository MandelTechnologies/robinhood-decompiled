package com.robinhood.android.transfers.p271ui.updaterecurring;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.UpdateRecurringDepositKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: UpdateRecurringDepositFrequencyFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\r\u0010\r\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositFrequencyFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "onContinueClicked", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onBackPressed", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UpdateRecurringDepositFrequencyFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UpdateRecurringDepositFrequencyFragment updateRecurringDepositFrequencyFragment, int i, Composer composer, int i2) {
        updateRecurringDepositFrequencyFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContinueClicked(ApiCreateTransferRequest2 frequency) {
        requireActivity().finish();
        Companion companion = INSTANCE;
        String transferId = ((UpdateRecurringDepositKey) companion.getArgs((Fragment) this)).getTransferId();
        ApiCreateTransferRequest2 frequency2 = ((UpdateRecurringDepositKey) companion.getArgs((Fragment) this)).getFrequency();
        BigDecimal amount = ((UpdateRecurringDepositKey) companion.getArgs((Fragment) this)).getAmount();
        ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
        UUID sourceAccountId = ((UpdateRecurringDepositKey) companion.getArgs((Fragment) this)).getSourceAccountId();
        TransferConfiguration.UpdateRecurringDeposit updateRecurringDeposit = new TransferConfiguration.UpdateRecurringDeposit(frequency, amount, new TransferConfiguration.TransferAccountSelection(sourceAccountId != null ? sourceAccountId.toString() : null, false, transferAccountType, 2, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null), ((UpdateRecurringDepositKey) companion.getArgs((Fragment) this)).getEntrypoint(), null, frequency2, transferId, 32, null);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(updateRecurringDeposit), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-691915261);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691915261, i2, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyFragment.ComposeContent (UpdateRecurringDepositFrequencyFragment.kt:53)");
            }
            UpdateRecurringDepositKey updateRecurringDepositKey = (UpdateRecurringDepositKey) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UpdateRecurringDepositFrequencyFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            UpdateRecurringDepositFrequencyComposable4.UpdateRecurringDepositFrequencyComposable(updateRecurringDepositKey, (Function1) ((KFunction) objRememberedValue), Modifier.INSTANCE, null, composerStartRestartGroup, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateRecurringDepositFrequencyFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UpdateRecurringDepositFrequencyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositFrequencyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositFrequencyFragment;", "Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UpdateRecurringDepositFrequencyFragment, UpdateRecurringDepositKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UpdateRecurringDepositKey getArgs(UpdateRecurringDepositFrequencyFragment updateRecurringDepositFrequencyFragment) {
            return (UpdateRecurringDepositKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, updateRecurringDepositFrequencyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UpdateRecurringDepositFrequencyFragment newInstance(UpdateRecurringDepositKey updateRecurringDepositKey) {
            return (UpdateRecurringDepositFrequencyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, updateRecurringDepositKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UpdateRecurringDepositFrequencyFragment updateRecurringDepositFrequencyFragment, UpdateRecurringDepositKey updateRecurringDepositKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, updateRecurringDepositFrequencyFragment, updateRecurringDepositKey);
        }
    }
}
