package com.robinhood.lib.transfers.nonoriginated;

import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoResponseDto;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAccountInfoDataState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDataState;", "", "transferType", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "nonOriginatedTransferInfoResponseDto", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "expandedSectionIndexes", "", "", "error", "", "<init>", "(Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;Ljava/util/Set;Ljava/lang/Throwable;)V", "getTransferType", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getNonOriginatedTransferInfoResponseDto", "()Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "getExpandedSectionIndexes", "()Ljava/util/Set;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NonOriginatedAccountInfoDataState {
    public static final int $stable = 8;
    private final CurrencyDto currency;
    private final Throwable error;
    private final Set<Integer> expandedSectionIndexes;
    private final GetNonOriginatedTransferInfoResponseDto nonOriginatedTransferInfoResponseDto;
    private final NonOriginatedTransferTypeDto transferType;

    public static /* synthetic */ NonOriginatedAccountInfoDataState copy$default(NonOriginatedAccountInfoDataState nonOriginatedAccountInfoDataState, NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto, Set set, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            nonOriginatedTransferTypeDto = nonOriginatedAccountInfoDataState.transferType;
        }
        if ((i & 2) != 0) {
            currencyDto = nonOriginatedAccountInfoDataState.currency;
        }
        if ((i & 4) != 0) {
            getNonOriginatedTransferInfoResponseDto = nonOriginatedAccountInfoDataState.nonOriginatedTransferInfoResponseDto;
        }
        if ((i & 8) != 0) {
            set = nonOriginatedAccountInfoDataState.expandedSectionIndexes;
        }
        if ((i & 16) != 0) {
            th = nonOriginatedAccountInfoDataState.error;
        }
        Throwable th2 = th;
        GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto2 = getNonOriginatedTransferInfoResponseDto;
        return nonOriginatedAccountInfoDataState.copy(nonOriginatedTransferTypeDto, currencyDto, getNonOriginatedTransferInfoResponseDto2, set, th2);
    }

    /* renamed from: component1, reason: from getter */
    public final NonOriginatedTransferTypeDto getTransferType() {
        return this.transferType;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrencyDto getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto() {
        return this.nonOriginatedTransferInfoResponseDto;
    }

    public final Set<Integer> component4() {
        return this.expandedSectionIndexes;
    }

    /* renamed from: component5, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final NonOriginatedAccountInfoDataState copy(NonOriginatedTransferTypeDto transferType, CurrencyDto currency, GetNonOriginatedTransferInfoResponseDto nonOriginatedTransferInfoResponseDto, Set<Integer> expandedSectionIndexes, Throwable error) {
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(expandedSectionIndexes, "expandedSectionIndexes");
        return new NonOriginatedAccountInfoDataState(transferType, currency, nonOriginatedTransferInfoResponseDto, expandedSectionIndexes, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonOriginatedAccountInfoDataState)) {
            return false;
        }
        NonOriginatedAccountInfoDataState nonOriginatedAccountInfoDataState = (NonOriginatedAccountInfoDataState) other;
        return this.transferType == nonOriginatedAccountInfoDataState.transferType && this.currency == nonOriginatedAccountInfoDataState.currency && Intrinsics.areEqual(this.nonOriginatedTransferInfoResponseDto, nonOriginatedAccountInfoDataState.nonOriginatedTransferInfoResponseDto) && Intrinsics.areEqual(this.expandedSectionIndexes, nonOriginatedAccountInfoDataState.expandedSectionIndexes) && Intrinsics.areEqual(this.error, nonOriginatedAccountInfoDataState.error);
    }

    public int hashCode() {
        int iHashCode = ((this.transferType.hashCode() * 31) + this.currency.hashCode()) * 31;
        GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto = this.nonOriginatedTransferInfoResponseDto;
        int iHashCode2 = (((iHashCode + (getNonOriginatedTransferInfoResponseDto == null ? 0 : getNonOriginatedTransferInfoResponseDto.hashCode())) * 31) + this.expandedSectionIndexes.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "NonOriginatedAccountInfoDataState(transferType=" + this.transferType + ", currency=" + this.currency + ", nonOriginatedTransferInfoResponseDto=" + this.nonOriginatedTransferInfoResponseDto + ", expandedSectionIndexes=" + this.expandedSectionIndexes + ", error=" + this.error + ")";
    }

    public NonOriginatedAccountInfoDataState(NonOriginatedTransferTypeDto transferType, CurrencyDto currency, GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto, Set<Integer> expandedSectionIndexes, Throwable th) {
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(expandedSectionIndexes, "expandedSectionIndexes");
        this.transferType = transferType;
        this.currency = currency;
        this.nonOriginatedTransferInfoResponseDto = getNonOriginatedTransferInfoResponseDto;
        this.expandedSectionIndexes = expandedSectionIndexes;
        this.error = th;
    }

    public final NonOriginatedTransferTypeDto getTransferType() {
        return this.transferType;
    }

    public final CurrencyDto getCurrency() {
        return this.currency;
    }

    public final GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto() {
        return this.nonOriginatedTransferInfoResponseDto;
    }

    public /* synthetic */ NonOriginatedAccountInfoDataState(NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, GetNonOriginatedTransferInfoResponseDto getNonOriginatedTransferInfoResponseDto, Set set, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonOriginatedTransferTypeDto, currencyDto, (i & 4) != 0 ? null : getNonOriginatedTransferInfoResponseDto, (i & 8) != 0 ? SetsKt.emptySet() : set, (i & 16) != 0 ? null : th);
    }

    public final Set<Integer> getExpandedSectionIndexes() {
        return this.expandedSectionIndexes;
    }

    public final Throwable getError() {
        return this.error;
    }
}
