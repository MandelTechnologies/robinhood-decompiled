package com.robinhood.android.transfers.nonoriginated.p268ui;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedTransferInfoAccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;", "", "accounts", "", "Lcom/robinhood/models/db/Account;", "rhyAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "transferType", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/bonfire/RhyAccount;Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;)V", "getAccounts", "()Ljava/util/List;", "getRhyAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "getTransferType", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NonOriginatedTransferInfoAccountSelectionDataState {
    public static final int $stable = 8;
    private final List<Account> accounts;
    private final RhyAccount rhyAccount;
    private final NonOriginatedTransferTypeDto transferType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NonOriginatedTransferInfoAccountSelectionDataState copy$default(NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState, List list, RhyAccount rhyAccount, NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nonOriginatedTransferInfoAccountSelectionDataState.accounts;
        }
        if ((i & 2) != 0) {
            rhyAccount = nonOriginatedTransferInfoAccountSelectionDataState.rhyAccount;
        }
        if ((i & 4) != 0) {
            nonOriginatedTransferTypeDto = nonOriginatedTransferInfoAccountSelectionDataState.transferType;
        }
        return nonOriginatedTransferInfoAccountSelectionDataState.copy(list, rhyAccount, nonOriginatedTransferTypeDto);
    }

    public final List<Account> component1() {
        return this.accounts;
    }

    /* renamed from: component2, reason: from getter */
    public final RhyAccount getRhyAccount() {
        return this.rhyAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final NonOriginatedTransferTypeDto getTransferType() {
        return this.transferType;
    }

    public final NonOriginatedTransferInfoAccountSelectionDataState copy(List<Account> accounts2, RhyAccount rhyAccount, NonOriginatedTransferTypeDto transferType) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        return new NonOriginatedTransferInfoAccountSelectionDataState(accounts2, rhyAccount, transferType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonOriginatedTransferInfoAccountSelectionDataState)) {
            return false;
        }
        NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState = (NonOriginatedTransferInfoAccountSelectionDataState) other;
        return Intrinsics.areEqual(this.accounts, nonOriginatedTransferInfoAccountSelectionDataState.accounts) && Intrinsics.areEqual(this.rhyAccount, nonOriginatedTransferInfoAccountSelectionDataState.rhyAccount) && this.transferType == nonOriginatedTransferInfoAccountSelectionDataState.transferType;
    }

    public int hashCode() {
        int iHashCode = this.accounts.hashCode() * 31;
        RhyAccount rhyAccount = this.rhyAccount;
        return ((iHashCode + (rhyAccount == null ? 0 : rhyAccount.hashCode())) * 31) + this.transferType.hashCode();
    }

    public String toString() {
        return "NonOriginatedTransferInfoAccountSelectionDataState(accounts=" + this.accounts + ", rhyAccount=" + this.rhyAccount + ", transferType=" + this.transferType + ")";
    }

    public NonOriginatedTransferInfoAccountSelectionDataState(List<Account> accounts2, RhyAccount rhyAccount, NonOriginatedTransferTypeDto transferType) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.accounts = accounts2;
        this.rhyAccount = rhyAccount;
        this.transferType = transferType;
    }

    public /* synthetic */ NonOriginatedTransferInfoAccountSelectionDataState(List list, RhyAccount rhyAccount, NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : rhyAccount, nonOriginatedTransferTypeDto);
    }

    public final List<Account> getAccounts() {
        return this.accounts;
    }

    public final RhyAccount getRhyAccount() {
        return this.rhyAccount;
    }

    public final NonOriginatedTransferTypeDto getTransferType() {
        return this.transferType;
    }
}
