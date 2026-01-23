package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import accio.service.p003v1.LinkedAccountDto;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RecurringDepositExtraCashAccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\"\b\u0002\u0010\u0006\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u008c\u0001\u0010\u001e\u001a\u00020\u00002\"\b\u0002\u0010\u0006\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R1\u0010\u0006\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0016R+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010\u001d¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;", "", "Lcom/robinhood/utils/Either;", "", "Lcom/robinhood/models/db/AchRelationship;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "accounts", "", "", "Laccio/service/v1/LinkedAccountDto;", "accioAccounts", "Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;", "automaticDepositsToInstrumentId", "j$/time/Instant", "now", "selectedBankAccount", "selectedRobinhoodAccount", "<init>", "(Lcom/robinhood/utils/Either;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "component1", "()Lcom/robinhood/utils/Either;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/models/db/AchRelationship;", "component6", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "copy", "(Lcom/robinhood/utils/Either;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/bonfire/TransferAccount;)Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/utils/Either;", "getAccounts", "Ljava/util/Map;", "getAccioAccounts", "getAutomaticDepositsToInstrumentId", "Lj$/time/Instant;", "getNow", "Lcom/robinhood/models/db/AchRelationship;", "getSelectedBankAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSelectedRobinhoodAccount", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositExtraCashAccountSelectionDataState {
    public static final int $stable = 8;
    private final Map<String, LinkedAccountDto> accioAccounts;
    private final Either<List<AchRelationship>, List<TransferAccount>> accounts;
    private final Map<String, List<AutomaticDepositWithBankInfo>> automaticDepositsToInstrumentId;
    private final Instant now;
    private final AchRelationship selectedBankAccount;
    private final TransferAccount selectedRobinhoodAccount;

    public static /* synthetic */ RecurringDepositExtraCashAccountSelectionDataState copy$default(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Either either, Map map, Map map2, Instant instant, AchRelationship achRelationship, TransferAccount transferAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            either = recurringDepositExtraCashAccountSelectionDataState.accounts;
        }
        if ((i & 2) != 0) {
            map = recurringDepositExtraCashAccountSelectionDataState.accioAccounts;
        }
        if ((i & 4) != 0) {
            map2 = recurringDepositExtraCashAccountSelectionDataState.automaticDepositsToInstrumentId;
        }
        if ((i & 8) != 0) {
            instant = recurringDepositExtraCashAccountSelectionDataState.now;
        }
        if ((i & 16) != 0) {
            achRelationship = recurringDepositExtraCashAccountSelectionDataState.selectedBankAccount;
        }
        if ((i & 32) != 0) {
            transferAccount = recurringDepositExtraCashAccountSelectionDataState.selectedRobinhoodAccount;
        }
        AchRelationship achRelationship2 = achRelationship;
        TransferAccount transferAccount2 = transferAccount;
        return recurringDepositExtraCashAccountSelectionDataState.copy(either, map, map2, instant, achRelationship2, transferAccount2);
    }

    public final Either<List<AchRelationship>, List<TransferAccount>> component1() {
        return this.accounts;
    }

    public final Map<String, LinkedAccountDto> component2() {
        return this.accioAccounts;
    }

    public final Map<String, List<AutomaticDepositWithBankInfo>> component3() {
        return this.automaticDepositsToInstrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getNow() {
        return this.now;
    }

    /* renamed from: component5, reason: from getter */
    public final AchRelationship getSelectedBankAccount() {
        return this.selectedBankAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferAccount getSelectedRobinhoodAccount() {
        return this.selectedRobinhoodAccount;
    }

    public final RecurringDepositExtraCashAccountSelectionDataState copy(Either<? extends List<AchRelationship>, ? extends List<TransferAccount>> accounts2, Map<String, LinkedAccountDto> accioAccounts, Map<String, ? extends List<AutomaticDepositWithBankInfo>> automaticDepositsToInstrumentId, Instant now, AchRelationship selectedBankAccount, TransferAccount selectedRobinhoodAccount) {
        Intrinsics.checkNotNullParameter(now, "now");
        return new RecurringDepositExtraCashAccountSelectionDataState(accounts2, accioAccounts, automaticDepositsToInstrumentId, now, selectedBankAccount, selectedRobinhoodAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositExtraCashAccountSelectionDataState)) {
            return false;
        }
        RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState = (RecurringDepositExtraCashAccountSelectionDataState) other;
        return Intrinsics.areEqual(this.accounts, recurringDepositExtraCashAccountSelectionDataState.accounts) && Intrinsics.areEqual(this.accioAccounts, recurringDepositExtraCashAccountSelectionDataState.accioAccounts) && Intrinsics.areEqual(this.automaticDepositsToInstrumentId, recurringDepositExtraCashAccountSelectionDataState.automaticDepositsToInstrumentId) && Intrinsics.areEqual(this.now, recurringDepositExtraCashAccountSelectionDataState.now) && Intrinsics.areEqual(this.selectedBankAccount, recurringDepositExtraCashAccountSelectionDataState.selectedBankAccount) && Intrinsics.areEqual(this.selectedRobinhoodAccount, recurringDepositExtraCashAccountSelectionDataState.selectedRobinhoodAccount);
    }

    public int hashCode() {
        Either<List<AchRelationship>, List<TransferAccount>> either = this.accounts;
        int iHashCode = (either == null ? 0 : either.hashCode()) * 31;
        Map<String, LinkedAccountDto> map = this.accioAccounts;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, List<AutomaticDepositWithBankInfo>> map2 = this.automaticDepositsToInstrumentId;
        int iHashCode3 = (((iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31) + this.now.hashCode()) * 31;
        AchRelationship achRelationship = this.selectedBankAccount;
        int iHashCode4 = (iHashCode3 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        TransferAccount transferAccount = this.selectedRobinhoodAccount;
        return iHashCode4 + (transferAccount != null ? transferAccount.hashCode() : 0);
    }

    public String toString() {
        return "RecurringDepositExtraCashAccountSelectionDataState(accounts=" + this.accounts + ", accioAccounts=" + this.accioAccounts + ", automaticDepositsToInstrumentId=" + this.automaticDepositsToInstrumentId + ", now=" + this.now + ", selectedBankAccount=" + this.selectedBankAccount + ", selectedRobinhoodAccount=" + this.selectedRobinhoodAccount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositExtraCashAccountSelectionDataState(Either<? extends List<AchRelationship>, ? extends List<TransferAccount>> either, Map<String, LinkedAccountDto> map, Map<String, ? extends List<AutomaticDepositWithBankInfo>> map2, Instant now, AchRelationship achRelationship, TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(now, "now");
        this.accounts = either;
        this.accioAccounts = map;
        this.automaticDepositsToInstrumentId = map2;
        this.now = now;
        this.selectedBankAccount = achRelationship;
        this.selectedRobinhoodAccount = transferAccount;
    }

    public /* synthetic */ RecurringDepositExtraCashAccountSelectionDataState(Either either, Map map, Map map2, Instant instant, AchRelationship achRelationship, TransferAccount transferAccount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, instant, (i & 16) != 0 ? null : achRelationship, (i & 32) != 0 ? null : transferAccount);
    }

    public final Either<List<AchRelationship>, List<TransferAccount>> getAccounts() {
        return this.accounts;
    }

    public final Map<String, LinkedAccountDto> getAccioAccounts() {
        return this.accioAccounts;
    }

    public final Map<String, List<AutomaticDepositWithBankInfo>> getAutomaticDepositsToInstrumentId() {
        return this.automaticDepositsToInstrumentId;
    }

    public final Instant getNow() {
        return this.now;
    }

    public final AchRelationship getSelectedBankAccount() {
        return this.selectedBankAccount;
    }

    public final TransferAccount getSelectedRobinhoodAccount() {
        return this.selectedRobinhoodAccount;
    }
}
