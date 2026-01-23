package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import accio.service.p003v1.LinkedAccountDto;
import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.Either;
import com.robinhood.utils.datetime.Durations;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RecurringDepositExtraCashAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashAccountSelectionStateProvider implements StateProvider<RecurringDepositExtraCashAccountSelectionDataState, RecurringDepositExtraCashAccountSelectionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public RecurringDepositExtraCashAccountSelectionStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RecurringDepositExtraCashAccountSelectionViewState reduce(RecurringDepositExtraCashAccountSelectionDataState dataState) {
        ImmutableList3 immutableList3PersistentListOf;
        IdlDecimal earliest_balance;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Either<List<AchRelationship>, List<TransferAccount>> accounts2 = dataState.getAccounts();
        if (accounts2 instanceof Either.Left) {
            if (dataState.getAccioAccounts() == null || dataState.getAutomaticDepositsToInstrumentId() == null) {
                immutableList3PersistentListOf = extensions2.persistentListOf();
            } else {
                Iterable iterable = (Iterable) ((Either.Left) dataState.getAccounts()).getValue();
                ArrayList<AchRelationship> arrayList = new ArrayList();
                for (Object obj : iterable) {
                    AchRelationship achRelationship = (AchRelationship) obj;
                    if (dataState.getAccioAccounts().containsKey(achRelationship.getId().toString()) || Durations.since(achRelationship.getCreatedAt()).toMinutes() <= 1) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (AchRelationship achRelationship2 : arrayList) {
                    Resources resources = this.resources;
                    LinkedAccountDto linkedAccountDto = dataState.getAccioAccounts().get(achRelationship2.getId().toString());
                    BigDecimal bigDecimalOrNull = (linkedAccountDto == null || (earliest_balance = linkedAccountDto.getEarliest_balance()) == null) ? null : earliest_balance.toBigDecimalOrNull();
                    AchRelationship selectedBankAccount = dataState.getSelectedBankAccount();
                    arrayList2.add(RecurringDepositExtraCashAccountSelectionStateProvider2.toRow(achRelationship2, resources, bigDecimalOrNull, dataState.getAutomaticDepositsToInstrumentId().containsKey(achRelationship2.getId().toString()), selectedBankAccount != null ? selectedBankAccount.getId() : null));
                }
                immutableList3PersistentListOf = extensions2.toPersistentList(arrayList2);
            }
        } else if (accounts2 instanceof Either.Right) {
            Iterable<TransferAccount> iterable2 = (Iterable) ((Either.Right) dataState.getAccounts()).getValue();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (TransferAccount transferAccount : iterable2) {
                TransferAccount selectedRobinhoodAccount = dataState.getSelectedRobinhoodAccount();
                arrayList3.add(RecurringDepositExtraCashAccountSelectionStateProvider2.toRow(transferAccount, selectedRobinhoodAccount != null ? selectedRobinhoodAccount.getAccountId() : null));
            }
            immutableList3PersistentListOf = extensions2.toPersistentList(arrayList3);
        } else {
            if (accounts2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        return new RecurringDepositExtraCashAccountSelectionViewState(immutableList3PersistentListOf, RecurringDepositExtraCashAccountSelectionStateProvider2.isAddAccountButtonVisible(dataState), RecurringDepositExtraCashAccountSelectionStateProvider2.infoBannerMessage(dataState, this.resources), RecurringDepositExtraCashAccountSelectionStateProvider2.isContinueButtonEnabled(dataState), dataState.getSelectedBankAccount(), dataState.getSelectedRobinhoodAccount());
    }
}
