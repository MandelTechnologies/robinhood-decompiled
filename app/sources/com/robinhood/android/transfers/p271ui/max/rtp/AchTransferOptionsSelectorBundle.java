package com.robinhood.android.transfers.p271ui.max.rtp;

import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.ServiceFeeParamsState;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferOptionsSelectorBundle.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;", "", "mode", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "dailyLimits", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "serviceFeeParamsState", "Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "achTransferOptionSelectionOverride", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;Lcom/robinhood/udf/UiEvent;)V", "getMode", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getServiceFee", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "getDailyLimits", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "getServiceFeeParamsState", "()Lcom/robinhood/android/transfers/ui/max/ServiceFeeParamsState;", "getAchTransferOptionSelectionOverride", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AchTransferOptionsSelectorBundle {
    public static final int $stable = 8;
    private final UiEvent<AchTransferOption> achTransferOptionSelectionOverride;
    private final BigDecimal amount;
    private final ApiAmountLimit dailyLimits;
    private final CreateTransferViewState.Mode mode;
    private final ApiServiceFeeResponse serviceFee;
    private final ServiceFeeParamsState serviceFeeParamsState;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;

    public static /* synthetic */ AchTransferOptionsSelectorBundle copy$default(AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, CreateTransferViewState.Mode mode, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, ServiceFeeParamsState serviceFeeParamsState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            mode = achTransferOptionsSelectorBundle.mode;
        }
        if ((i & 2) != 0) {
            bigDecimal = achTransferOptionsSelectorBundle.amount;
        }
        if ((i & 4) != 0) {
            transferAccount = achTransferOptionsSelectorBundle.sourceAccount;
        }
        if ((i & 8) != 0) {
            transferAccount2 = achTransferOptionsSelectorBundle.sinkAccount;
        }
        if ((i & 16) != 0) {
            apiServiceFeeResponse = achTransferOptionsSelectorBundle.serviceFee;
        }
        if ((i & 32) != 0) {
            apiAmountLimit = achTransferOptionsSelectorBundle.dailyLimits;
        }
        if ((i & 64) != 0) {
            serviceFeeParamsState = achTransferOptionsSelectorBundle.serviceFeeParamsState;
        }
        if ((i & 128) != 0) {
            uiEvent = achTransferOptionsSelectorBundle.achTransferOptionSelectionOverride;
        }
        ServiceFeeParamsState serviceFeeParamsState2 = serviceFeeParamsState;
        UiEvent uiEvent2 = uiEvent;
        ApiServiceFeeResponse apiServiceFeeResponse2 = apiServiceFeeResponse;
        ApiAmountLimit apiAmountLimit2 = apiAmountLimit;
        return achTransferOptionsSelectorBundle.copy(mode, bigDecimal, transferAccount, transferAccount2, apiServiceFeeResponse2, apiAmountLimit2, serviceFeeParamsState2, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiServiceFeeResponse getServiceFee() {
        return this.serviceFee;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiAmountLimit getDailyLimits() {
        return this.dailyLimits;
    }

    /* renamed from: component7, reason: from getter */
    public final ServiceFeeParamsState getServiceFeeParamsState() {
        return this.serviceFeeParamsState;
    }

    public final UiEvent<AchTransferOption> component8() {
        return this.achTransferOptionSelectionOverride;
    }

    public final AchTransferOptionsSelectorBundle copy(CreateTransferViewState.Mode mode, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, ApiServiceFeeResponse serviceFee, ApiAmountLimit dailyLimits, ServiceFeeParamsState serviceFeeParamsState, UiEvent<AchTransferOption> achTransferOptionSelectionOverride) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new AchTransferOptionsSelectorBundle(mode, amount, sourceAccount, sinkAccount, serviceFee, dailyLimits, serviceFeeParamsState, achTransferOptionSelectionOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchTransferOptionsSelectorBundle)) {
            return false;
        }
        AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = (AchTransferOptionsSelectorBundle) other;
        return this.mode == achTransferOptionsSelectorBundle.mode && Intrinsics.areEqual(this.amount, achTransferOptionsSelectorBundle.amount) && Intrinsics.areEqual(this.sourceAccount, achTransferOptionsSelectorBundle.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, achTransferOptionsSelectorBundle.sinkAccount) && Intrinsics.areEqual(this.serviceFee, achTransferOptionsSelectorBundle.serviceFee) && Intrinsics.areEqual(this.dailyLimits, achTransferOptionsSelectorBundle.dailyLimits) && Intrinsics.areEqual(this.serviceFeeParamsState, achTransferOptionsSelectorBundle.serviceFeeParamsState) && Intrinsics.areEqual(this.achTransferOptionSelectionOverride, achTransferOptionsSelectorBundle.achTransferOptionSelectionOverride);
    }

    public int hashCode() {
        int iHashCode = ((this.mode.hashCode() * 31) + this.amount.hashCode()) * 31;
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        int iHashCode3 = (iHashCode2 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31;
        ApiServiceFeeResponse apiServiceFeeResponse = this.serviceFee;
        int iHashCode4 = (iHashCode3 + (apiServiceFeeResponse == null ? 0 : apiServiceFeeResponse.hashCode())) * 31;
        ApiAmountLimit apiAmountLimit = this.dailyLimits;
        int iHashCode5 = (iHashCode4 + (apiAmountLimit == null ? 0 : apiAmountLimit.hashCode())) * 31;
        ServiceFeeParamsState serviceFeeParamsState = this.serviceFeeParamsState;
        int iHashCode6 = (iHashCode5 + (serviceFeeParamsState == null ? 0 : serviceFeeParamsState.hashCode())) * 31;
        UiEvent<AchTransferOption> uiEvent = this.achTransferOptionSelectionOverride;
        return iHashCode6 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "AchTransferOptionsSelectorBundle(mode=" + this.mode + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", serviceFee=" + this.serviceFee + ", dailyLimits=" + this.dailyLimits + ", serviceFeeParamsState=" + this.serviceFeeParamsState + ", achTransferOptionSelectionOverride=" + this.achTransferOptionSelectionOverride + ")";
    }

    public AchTransferOptionsSelectorBundle(CreateTransferViewState.Mode mode, BigDecimal amount, TransferAccount transferAccount, TransferAccount transferAccount2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, ServiceFeeParamsState serviceFeeParamsState, UiEvent<AchTransferOption> uiEvent) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.mode = mode;
        this.amount = amount;
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.serviceFee = apiServiceFeeResponse;
        this.dailyLimits = apiAmountLimit;
        this.serviceFeeParamsState = serviceFeeParamsState;
        this.achTransferOptionSelectionOverride = uiEvent;
    }

    public /* synthetic */ AchTransferOptionsSelectorBundle(CreateTransferViewState.Mode mode, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, ServiceFeeParamsState serviceFeeParamsState, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, bigDecimal, transferAccount, transferAccount2, (i & 16) != 0 ? null : apiServiceFeeResponse, (i & 32) != 0 ? null : apiAmountLimit, (i & 64) != 0 ? null : serviceFeeParamsState, (i & 128) != 0 ? null : uiEvent);
    }

    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final ApiServiceFeeResponse getServiceFee() {
        return this.serviceFee;
    }

    public final ApiAmountLimit getDailyLimits() {
        return this.dailyLimits;
    }

    public final ServiceFeeParamsState getServiceFeeParamsState() {
        return this.serviceFeeParamsState;
    }

    public final UiEvent<AchTransferOption> getAchTransferOptionSelectionOverride() {
        return this.achTransferOptionSelectionOverride;
    }
}
