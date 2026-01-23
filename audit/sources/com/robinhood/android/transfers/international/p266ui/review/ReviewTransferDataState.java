package com.robinhood.android.transfers.international.p266ui.review;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;", "", "amount", "Lcom/robinhood/models/util/Money;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, MemoInputActivity.EXTRA_MEMO, "", "serviceFeeResponse", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "isTransferRequestInProgress", "", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Ljava/lang/String;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;Lcom/robinhood/android/transfers/international/ui/model/FxData;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "getSourceAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "getSinkAccount", "getMemo", "()Ljava/lang/String;", "getServiceFeeResponse", "()Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "()Z", "isFxEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReviewTransferDataState {
    public static final int $stable = 8;
    private final Money amount;
    private final FxData fxData;
    private final boolean isTransferRequestInProgress;
    private final String memo;
    private final GetServiceFeeResponseDto serviceFeeResponse;
    private final MultiCurrencyAccount sinkAccount;
    private final MultiCurrencyAccount sourceAccount;
    private final TransferType transferType;

    public static /* synthetic */ ReviewTransferDataState copy$default(ReviewTransferDataState reviewTransferDataState, Money money, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, String str, GetServiceFeeResponseDto getServiceFeeResponseDto, FxData fxData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            money = reviewTransferDataState.amount;
        }
        if ((i & 2) != 0) {
            transferType = reviewTransferDataState.transferType;
        }
        if ((i & 4) != 0) {
            multiCurrencyAccount = reviewTransferDataState.sourceAccount;
        }
        if ((i & 8) != 0) {
            multiCurrencyAccount2 = reviewTransferDataState.sinkAccount;
        }
        if ((i & 16) != 0) {
            str = reviewTransferDataState.memo;
        }
        if ((i & 32) != 0) {
            getServiceFeeResponseDto = reviewTransferDataState.serviceFeeResponse;
        }
        if ((i & 64) != 0) {
            fxData = reviewTransferDataState.fxData;
        }
        if ((i & 128) != 0) {
            z = reviewTransferDataState.isTransferRequestInProgress;
        }
        FxData fxData2 = fxData;
        boolean z2 = z;
        String str2 = str;
        GetServiceFeeResponseDto getServiceFeeResponseDto2 = getServiceFeeResponseDto;
        return reviewTransferDataState.copy(money, transferType, multiCurrencyAccount, multiCurrencyAccount2, str2, getServiceFeeResponseDto2, fxData2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component3, reason: from getter */
    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    /* renamed from: component6, reason: from getter */
    public final GetServiceFeeResponseDto getServiceFeeResponse() {
        return this.serviceFeeResponse;
    }

    /* renamed from: component7, reason: from getter */
    public final FxData getFxData() {
        return this.fxData;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsTransferRequestInProgress() {
        return this.isTransferRequestInProgress;
    }

    public final ReviewTransferDataState copy(Money amount, TransferType transferType, MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, String memo, GetServiceFeeResponseDto serviceFeeResponse, FxData fxData, boolean isTransferRequestInProgress) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        return new ReviewTransferDataState(amount, transferType, sourceAccount, sinkAccount, memo, serviceFeeResponse, fxData, isTransferRequestInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewTransferDataState)) {
            return false;
        }
        ReviewTransferDataState reviewTransferDataState = (ReviewTransferDataState) other;
        return Intrinsics.areEqual(this.amount, reviewTransferDataState.amount) && this.transferType == reviewTransferDataState.transferType && Intrinsics.areEqual(this.sourceAccount, reviewTransferDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, reviewTransferDataState.sinkAccount) && Intrinsics.areEqual(this.memo, reviewTransferDataState.memo) && Intrinsics.areEqual(this.serviceFeeResponse, reviewTransferDataState.serviceFeeResponse) && Intrinsics.areEqual(this.fxData, reviewTransferDataState.fxData) && this.isTransferRequestInProgress == reviewTransferDataState.isTransferRequestInProgress;
    }

    public int hashCode() {
        int iHashCode = ((((((this.amount.hashCode() * 31) + this.transferType.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode()) * 31;
        String str = this.memo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GetServiceFeeResponseDto getServiceFeeResponseDto = this.serviceFeeResponse;
        int iHashCode3 = (iHashCode2 + (getServiceFeeResponseDto == null ? 0 : getServiceFeeResponseDto.hashCode())) * 31;
        FxData fxData = this.fxData;
        return ((iHashCode3 + (fxData != null ? fxData.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTransferRequestInProgress);
    }

    public String toString() {
        return "ReviewTransferDataState(amount=" + this.amount + ", transferType=" + this.transferType + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", memo=" + this.memo + ", serviceFeeResponse=" + this.serviceFeeResponse + ", fxData=" + this.fxData + ", isTransferRequestInProgress=" + this.isTransferRequestInProgress + ")";
    }

    public ReviewTransferDataState(Money amount, TransferType transferType, MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, String str, GetServiceFeeResponseDto getServiceFeeResponseDto, FxData fxData, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        this.amount = amount;
        this.transferType = transferType;
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
        this.memo = str;
        this.serviceFeeResponse = getServiceFeeResponseDto;
        this.fxData = fxData;
        this.isTransferRequestInProgress = z;
    }

    public /* synthetic */ ReviewTransferDataState(Money money, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, String str, GetServiceFeeResponseDto getServiceFeeResponseDto, FxData fxData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, transferType, multiCurrencyAccount, multiCurrencyAccount2, str, (i & 32) != 0 ? null : getServiceFeeResponseDto, (i & 64) != 0 ? null : fxData, (i & 128) != 0 ? false : z);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final GetServiceFeeResponseDto getServiceFeeResponse() {
        return this.serviceFeeResponse;
    }

    public final FxData getFxData() {
        return this.fxData;
    }

    public final boolean isTransferRequestInProgress() {
        return this.isTransferRequestInProgress;
    }

    public final boolean isFxEnabled() {
        return !Intrinsics.areEqual(this.sourceAccount.getCurrency(), this.sinkAccount.getCurrency());
    }
}
