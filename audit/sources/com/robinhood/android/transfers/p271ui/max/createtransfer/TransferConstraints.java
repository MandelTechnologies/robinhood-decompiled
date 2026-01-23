package com.robinhood.android.transfers.p271ui.max.createtransfer;

import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConstraints.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferConstraints;", "", "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "dailyLimits", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;)V", "getServiceFee", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "getDailyLimits", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferConstraints {
    public static final int $stable = 8;
    private final ApiAmountLimit dailyLimits;
    private final ApiServiceFeeResponse serviceFee;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferConstraints() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TransferConstraints copy$default(TransferConstraints transferConstraints, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, int i, Object obj) {
        if ((i & 1) != 0) {
            apiServiceFeeResponse = transferConstraints.serviceFee;
        }
        if ((i & 2) != 0) {
            apiAmountLimit = transferConstraints.dailyLimits;
        }
        return transferConstraints.copy(apiServiceFeeResponse, apiAmountLimit);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiServiceFeeResponse getServiceFee() {
        return this.serviceFee;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAmountLimit getDailyLimits() {
        return this.dailyLimits;
    }

    public final TransferConstraints copy(ApiServiceFeeResponse serviceFee, ApiAmountLimit dailyLimits) {
        return new TransferConstraints(serviceFee, dailyLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferConstraints)) {
            return false;
        }
        TransferConstraints transferConstraints = (TransferConstraints) other;
        return Intrinsics.areEqual(this.serviceFee, transferConstraints.serviceFee) && Intrinsics.areEqual(this.dailyLimits, transferConstraints.dailyLimits);
    }

    public int hashCode() {
        ApiServiceFeeResponse apiServiceFeeResponse = this.serviceFee;
        int iHashCode = (apiServiceFeeResponse == null ? 0 : apiServiceFeeResponse.hashCode()) * 31;
        ApiAmountLimit apiAmountLimit = this.dailyLimits;
        return iHashCode + (apiAmountLimit != null ? apiAmountLimit.hashCode() : 0);
    }

    public String toString() {
        return "TransferConstraints(serviceFee=" + this.serviceFee + ", dailyLimits=" + this.dailyLimits + ")";
    }

    public TransferConstraints(ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit) {
        this.serviceFee = apiServiceFeeResponse;
        this.dailyLimits = apiAmountLimit;
    }

    public /* synthetic */ TransferConstraints(ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiServiceFeeResponse, (i & 2) != 0 ? null : apiAmountLimit);
    }

    public final ApiServiceFeeResponse getServiceFee() {
        return this.serviceFee;
    }

    public final ApiAmountLimit getDailyLimits() {
        return this.dailyLimits;
    }
}
