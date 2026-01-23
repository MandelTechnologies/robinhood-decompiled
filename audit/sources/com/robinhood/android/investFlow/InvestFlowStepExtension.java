package com.robinhood.android.investFlow;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.embeddedDetail.EmbeddedDetailFragment;
import com.robinhood.android.investFlow.amount.InvestFlowAmountArgs;
import com.robinhood.android.investFlow.amount.InvestFlowAmountFragment;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyArgs;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboArgs;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodArgs;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringArgs;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringParentFragment;
import com.robinhood.android.investFlow.search.InvestFlowSearchArgs;
import com.robinhood.android.investFlow.search.InvestFlowSearchFragment;
import com.robinhood.android.investFlow.split.InvestFlowSplitArgs;
import com.robinhood.android.investFlow.split.InvestFlowSplitFragment;
import com.robinhood.android.investFlow.submit.InvestFlowOrderArgs;
import com.robinhood.android.investFlow.submit.InvestFlowOrderFragment;
import com.robinhood.android.investFlow.submit.InvestFlowOrderParentFragment;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowManifest;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowStepExtension.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a1\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"mapToFragment", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "state", "Lcom/robinhood/android/investFlow/InvestFlowViewState;", "mapToInvestFlowStep", "isRecurring", "", "numTargets", "", "isBackup", "(Landroidx/fragment/app/Fragment;Ljava/lang/Boolean;ILjava/lang/Boolean;)Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.InvestFlowStepExtensionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowStepExtension {
    public static final Fragment mapToFragment(InvestFlowStep investFlowStep, InvestFlowViewState state) {
        BrokerageAccountType brokerageAccountType;
        BrokerageAccountType brokerageAccountType2;
        BrokerageAccountType brokerageAccountType3;
        Intrinsics.checkNotNullParameter(investFlowStep, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.Discovery.INSTANCE)) {
            InvestFlowSearchFragment.Companion companion = InvestFlowSearchFragment.INSTANCE;
            List<InvestFlowBasketItem> selectedItems = state.getSelectedItems();
            String accountNumber = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber);
            return companion.newInstance((Parcelable) new InvestFlowSearchArgs(selectedItems, accountNumber, state.getLoggingParams()));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.Amount.INSTANCE)) {
            InvestFlowAmountFragment.Companion companion2 = InvestFlowAmountFragment.INSTANCE;
            List<UUID> selectedItemIds = state.getSelectedItemIds();
            Money totalAmount = state.getTotalAmount();
            BigDecimal minOrderAmount = state.getMinOrderAmount();
            int numTargets = state.getNumTargets();
            InvestFlowFrequency selectedFrequency = state.getSelectedFrequency();
            if (selectedFrequency == null) {
                throw new IllegalStateException("need frequency selected to start amount fragment");
            }
            String accountNumber2 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber2);
            return companion2.newInstance((Parcelable) new InvestFlowAmountArgs(selectedItemIds, totalAmount, minOrderAmount, numTargets, selectedFrequency, false, accountNumber2, 32, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.Frequency.INSTANCE)) {
            InvestFlowFrequencyFragment.Companion companion3 = InvestFlowFrequencyFragment.INSTANCE;
            InvestFlowFrequency selectedFrequency2 = state.getSelectedFrequency();
            boolean recurringOnly = state.getRecurringOnly();
            String accountNumber3 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber3);
            return companion3.newInstance((Parcelable) new InvestFlowFrequencyArgs(false, selectedFrequency2, recurringOnly, accountNumber3, 1, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.Allocation.INSTANCE)) {
            InvestFlowSplitFragment.Companion companion4 = InvestFlowSplitFragment.INSTANCE;
            String accountNumber4 = state.getAccountNumber();
            if (accountNumber4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Money userEnteredAmount = state.getCoreData().getUserEnteredAmount();
            if (userEnteredAmount == null) {
                throw new IllegalStateException("need total amount selected to start allocationfragment");
            }
            InvestFlowManifest investFlowManifest = new InvestFlowManifest(state.getSelectedItemIds());
            AllocationStrategy allocationProviderArgs = state.getAllocationProviderArgs();
            InvestFlowFrequency selectedFrequency3 = state.getSelectedFrequency();
            if (selectedFrequency3 != null) {
                return companion4.newInstance((Parcelable) new InvestFlowSplitArgs(accountNumber4, userEnteredAmount, investFlowManifest, false, allocationProviderArgs, selectedFrequency3, 8, null));
            }
            throw new IllegalStateException("need frequency selected to start allocationfragment");
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.PaymentMethod.INSTANCE)) {
            InvestFlowPaymentMethodFragment.Companion companion5 = InvestFlowPaymentMethodFragment.INSTANCE;
            InvestFlowPaymentMethod primaryPaymentMethod = state.getPrimaryPaymentMethod();
            Money accountBuyingPower = state.getAccountBuyingPower();
            String accountNumber5 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber5);
            Account account = state.getAccount();
            return companion5.newInstance((Parcelable) new InvestFlowPaymentMethodArgs(primaryPaymentMethod, accountBuyingPower, false, false, accountNumber5, (account == null || (brokerageAccountType3 = account.getBrokerageAccountType()) == null || !brokerageAccountType3.isRetirement()) ? false : true, 4, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.BackupPaymentMethod.INSTANCE)) {
            InvestFlowPaymentMethodFragment.Companion companion6 = InvestFlowPaymentMethodFragment.INSTANCE;
            InvestFlowPaymentMethod backupPaymentMethod = state.getBackupPaymentMethod();
            String accountNumber6 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber6);
            Account account2 = state.getAccount();
            return companion6.newInstance((Parcelable) new InvestFlowPaymentMethodArgs(backupPaymentMethod, null, false, true, accountNumber6, (account2 == null || (brokerageAccountType2 = account2.getBrokerageAccountType()) == null || !brokerageAccountType2.isRetirement()) ? false : true, 6, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.OneTimeSingleSubmit.INSTANCE)) {
            InvestFlowOrderParentFragment.Companion companion7 = InvestFlowOrderParentFragment.INSTANCE;
            Money totalAmount2 = state.getTotalAmount();
            Intrinsics.checkNotNull(totalAmount2);
            List<ApiAssetAllocation> assetAllocations = state.getAssetAllocations();
            String accountNumber7 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber7);
            ApiInvestFlowNbboResponse nbboResponse = state.getNbboResponse();
            if (nbboResponse != null) {
                return companion7.newInstance((Parcelable) new InvestFlowOrderArgs.OneTimeSingle(totalAmount2, false, assetAllocations, accountNumber7, state.getLoggingParams(), nbboResponse, 2, null));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.OneTimeMultiple.INSTANCE)) {
            InvestFlowMultipleNbboFragment.Companion companion8 = InvestFlowMultipleNbboFragment.INSTANCE;
            Money totalAmount3 = state.getTotalAmount();
            if (totalAmount3 == null) {
                throw new IllegalStateException("need total amount selected to start NBBO fragment");
            }
            List<ApiAssetAllocation> assetAllocations2 = state.getAssetAllocations();
            String accountNumber8 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber8);
            Account account3 = state.getAccount();
            BrokerageAccountType brokerageAccountType4 = account3 != null ? account3.getBrokerageAccountType() : null;
            if (brokerageAccountType4 != null) {
                return companion8.newInstance((Parcelable) new InvestFlowMultipleNbboArgs(totalAmount3, assetAllocations2, false, accountNumber8, brokerageAccountType4, 4, null));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.OneTimeMultipleSubmit.INSTANCE)) {
            InvestFlowOrderParentFragment.Companion companion9 = InvestFlowOrderParentFragment.INSTANCE;
            Money totalAmount4 = state.getTotalAmount();
            Intrinsics.checkNotNull(totalAmount4);
            List<ApiAssetAllocation> assetAllocations3 = state.getAssetAllocations();
            ApiInvestFlowNbboResponse nbboResponse2 = state.getNbboResponse();
            String accountNumber9 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber9);
            return companion9.newInstance((Parcelable) new InvestFlowOrderArgs.OneTimeMultiple(totalAmount4, false, assetAllocations3, accountNumber9, state.getLoggingParams(), state.getLoggingParams().getSourceId(), nbboResponse2, 2, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.RecurringSubmit.INSTANCE)) {
            InvestFlowOrderParentFragment.Companion companion10 = InvestFlowOrderParentFragment.INSTANCE;
            Money totalAmount5 = state.getTotalAmount();
            Intrinsics.checkNotNull(totalAmount5);
            InvestFlowPaymentMethod primaryPaymentMethod2 = state.getPrimaryPaymentMethod();
            Intrinsics.checkNotNull(primaryPaymentMethod2);
            InvestFlowPaymentMethod backupPaymentMethod2 = state.getBackupPaymentMethod();
            List<ApiAssetAllocation> assetAllocations4 = state.getAssetAllocations();
            InvestFlowFrequency selectedFrequency4 = state.getSelectedFrequency();
            Intrinsics.checkNotNull(selectedFrequency4, "null cannot be cast to non-null type com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency.Recurring");
            ApiInvestmentSchedule.Frequency frequency = ((InvestFlowFrequency.Recurring) selectedFrequency4).getFrequency();
            LocalDate startDate = ((InvestFlowFrequency.Recurring) state.getSelectedFrequency()).getStartDate();
            String accountNumber10 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber10);
            boolean skipForceSuitability = state.getSkipForceSuitability();
            Account account4 = state.getAccount();
            BrokerageAccountType brokerageAccountType5 = account4 != null ? account4.getBrokerageAccountType() : null;
            if (brokerageAccountType5 != null) {
                return companion10.newInstance((Parcelable) new InvestFlowOrderArgs.Recurring(totalAmount5, false, assetAllocations4, accountNumber10, skipForceSuitability, state.getLoggingParams().getSourceId(), state.getLoggingParams(), brokerageAccountType5, primaryPaymentMethod2, startDate, frequency, backupPaymentMethod2, null, 4098, null));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.RecurringSettings.INSTANCE)) {
            InvestFlowRecurringParentFragment.Companion companion11 = InvestFlowRecurringParentFragment.INSTANCE;
            Money totalAmount6 = state.getTotalAmount();
            if (totalAmount6 == null) {
                throw new IllegalStateException("need total amount selected to start recurring settings fragment");
            }
            InvestFlowFrequency selectedFrequency5 = state.getSelectedFrequency();
            Intrinsics.checkNotNull(selectedFrequency5, "null cannot be cast to non-null type com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency.Recurring");
            ApiInvestmentSchedule.Frequency frequency2 = ((InvestFlowFrequency.Recurring) selectedFrequency5).getFrequency();
            List<ApiAssetAllocation> assetAllocations5 = state.getAssetAllocations();
            InvestFlowPaymentMethod primaryPaymentMethod3 = state.getPrimaryPaymentMethod();
            Intrinsics.checkNotNull(primaryPaymentMethod3);
            InvestFlowPaymentMethod backupPaymentMethod3 = state.getBackupPaymentMethod();
            LocalDate startDate2 = ((InvestFlowFrequency.Recurring) state.getSelectedFrequency()).getStartDate();
            String accountNumber11 = state.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber11);
            Account account5 = state.getAccount();
            return companion11.newInstance((Parcelable) new InvestFlowRecurringArgs(false, totalAmount6, frequency2, assetAllocations5, primaryPaymentMethod3, backupPaymentMethod3, startDate2, accountNumber11, (account5 == null || (brokerageAccountType = account5.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true, state.isRecurringUpsell(), 1, null));
        }
        if (Intrinsics.areEqual(investFlowStep, InvestFlowStep.Complete.INSTANCE)) {
            throw new IllegalStateException("there is no fragment used in completing invest flow");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ InvestFlowStep mapToInvestFlowStep$default(Fragment fragment, Boolean bool, int i, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 4) != 0) {
            bool2 = null;
        }
        return mapToInvestFlowStep(fragment, bool, i, bool2);
    }

    public static final InvestFlowStep mapToInvestFlowStep(Fragment fragment, Boolean bool, int i, Boolean bool2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if ((fragment instanceof InvestFlowSearchFragment) || (fragment instanceof EmbeddedDetailFragment)) {
            return InvestFlowStep.Discovery.INSTANCE;
        }
        if (fragment instanceof InvestFlowAmountFragment) {
            return InvestFlowStep.Amount.INSTANCE;
        }
        if (fragment instanceof InvestFlowFrequencyFragment) {
            return InvestFlowStep.Frequency.INSTANCE;
        }
        if (fragment instanceof InvestFlowSplitFragment) {
            return InvestFlowStep.Allocation.INSTANCE;
        }
        if (fragment instanceof InvestFlowPaymentMethodFragment) {
            if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                return InvestFlowStep.BackupPaymentMethod.INSTANCE;
            }
            return InvestFlowStep.PaymentMethod.INSTANCE;
        }
        if (fragment instanceof InvestFlowMultipleNbboFragment) {
            return InvestFlowStep.OneTimeMultiple.INSTANCE;
        }
        if (fragment instanceof InvestFlowRecurringParentFragment) {
            return InvestFlowStep.RecurringSettings.INSTANCE;
        }
        if (fragment instanceof InvestFlowOrderFragment) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                return InvestFlowStep.RecurringSubmit.INSTANCE;
            }
            if (i > 1) {
                return InvestFlowStep.OneTimeMultipleSubmit.INSTANCE;
            }
            return InvestFlowStep.OneTimeSingleSubmit.INSTANCE;
        }
        if (fragment instanceof InvestFlowOrderParentFragment) {
            return null;
        }
        throw new IllegalStateException(("fragment " + Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName() + " not known, can not map to flow step").toString());
    }
}
