package com.robinhood.android.transfers.international.p266ui.review;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.MoneyDto;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferRequestCreator.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator;", "", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator$TransferData;", "<init>", "(Lcom/robinhood/android/banking/util/RefIdFactory;)V", "createTransferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "transferData", "createAdditionalData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData;", "TransferData", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferRequestCreator {
    public static final int $stable = 8;
    private final RefIdFactory<TransferData> refIdFactory;

    /* compiled from: TransferRequestCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TransferRequestCreator(RefIdFactory<TransferData> refIdFactory) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        this.refIdFactory = refIdFactory;
    }

    /* compiled from: TransferRequestCreator.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator$TransferData;", "", "amount", "Lcom/robinhood/models/util/Money;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "internalAccountId", "", "externalAccountId", MemoInputActivity.EXTRA_MEMO, "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "serviceFeeResponse", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/transfers/international/ui/model/FxData;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "getInternalAccountId", "()Ljava/lang/String;", "getExternalAccountId", "getMemo", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "getServiceFeeResponse", "()Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferData {
        public static final int $stable = 8;
        private final Money amount;
        private final String externalAccountId;
        private final FxData fxData;
        private final String internalAccountId;
        private final String memo;
        private final GetServiceFeeResponseDto serviceFeeResponse;
        private final TransferDirection transferDirection;
        private final TransferType transferType;

        public static /* synthetic */ TransferData copy$default(TransferData transferData, Money money, TransferDirection transferDirection, TransferType transferType, String str, String str2, String str3, FxData fxData, GetServiceFeeResponseDto getServiceFeeResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                money = transferData.amount;
            }
            if ((i & 2) != 0) {
                transferDirection = transferData.transferDirection;
            }
            if ((i & 4) != 0) {
                transferType = transferData.transferType;
            }
            if ((i & 8) != 0) {
                str = transferData.internalAccountId;
            }
            if ((i & 16) != 0) {
                str2 = transferData.externalAccountId;
            }
            if ((i & 32) != 0) {
                str3 = transferData.memo;
            }
            if ((i & 64) != 0) {
                fxData = transferData.fxData;
            }
            if ((i & 128) != 0) {
                getServiceFeeResponseDto = transferData.serviceFeeResponse;
            }
            FxData fxData2 = fxData;
            GetServiceFeeResponseDto getServiceFeeResponseDto2 = getServiceFeeResponseDto;
            String str4 = str2;
            String str5 = str3;
            return transferData.copy(money, transferDirection, transferType, str, str4, str5, fxData2, getServiceFeeResponseDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferType getTransferType() {
            return this.transferType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInternalAccountId() {
            return this.internalAccountId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getExternalAccountId() {
            return this.externalAccountId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMemo() {
            return this.memo;
        }

        /* renamed from: component7, reason: from getter */
        public final FxData getFxData() {
            return this.fxData;
        }

        /* renamed from: component8, reason: from getter */
        public final GetServiceFeeResponseDto getServiceFeeResponse() {
            return this.serviceFeeResponse;
        }

        public final TransferData copy(Money amount, TransferDirection transferDirection, TransferType transferType, String internalAccountId, String externalAccountId, String memo, FxData fxData, GetServiceFeeResponseDto serviceFeeResponse) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(internalAccountId, "internalAccountId");
            Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
            return new TransferData(amount, transferDirection, transferType, internalAccountId, externalAccountId, memo, fxData, serviceFeeResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferData)) {
                return false;
            }
            TransferData transferData = (TransferData) other;
            return Intrinsics.areEqual(this.amount, transferData.amount) && this.transferDirection == transferData.transferDirection && this.transferType == transferData.transferType && Intrinsics.areEqual(this.internalAccountId, transferData.internalAccountId) && Intrinsics.areEqual(this.externalAccountId, transferData.externalAccountId) && Intrinsics.areEqual(this.memo, transferData.memo) && Intrinsics.areEqual(this.fxData, transferData.fxData) && Intrinsics.areEqual(this.serviceFeeResponse, transferData.serviceFeeResponse);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.amount.hashCode() * 31) + this.transferDirection.hashCode()) * 31) + this.transferType.hashCode()) * 31) + this.internalAccountId.hashCode()) * 31) + this.externalAccountId.hashCode()) * 31;
            String str = this.memo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            FxData fxData = this.fxData;
            int iHashCode3 = (iHashCode2 + (fxData == null ? 0 : fxData.hashCode())) * 31;
            GetServiceFeeResponseDto getServiceFeeResponseDto = this.serviceFeeResponse;
            return iHashCode3 + (getServiceFeeResponseDto != null ? getServiceFeeResponseDto.hashCode() : 0);
        }

        public String toString() {
            return "TransferData(amount=" + this.amount + ", transferDirection=" + this.transferDirection + ", transferType=" + this.transferType + ", internalAccountId=" + this.internalAccountId + ", externalAccountId=" + this.externalAccountId + ", memo=" + this.memo + ", fxData=" + this.fxData + ", serviceFeeResponse=" + this.serviceFeeResponse + ")";
        }

        public TransferData(Money amount, TransferDirection transferDirection, TransferType transferType, String internalAccountId, String externalAccountId, String str, FxData fxData, GetServiceFeeResponseDto getServiceFeeResponseDto) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(internalAccountId, "internalAccountId");
            Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
            this.amount = amount;
            this.transferDirection = transferDirection;
            this.transferType = transferType;
            this.internalAccountId = internalAccountId;
            this.externalAccountId = externalAccountId;
            this.memo = str;
            this.fxData = fxData;
            this.serviceFeeResponse = getServiceFeeResponseDto;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        public final TransferType getTransferType() {
            return this.transferType;
        }

        public final String getInternalAccountId() {
            return this.internalAccountId;
        }

        public final String getExternalAccountId() {
            return this.externalAccountId;
        }

        public final String getMemo() {
            return this.memo;
        }

        public final FxData getFxData() {
            return this.fxData;
        }

        public final GetServiceFeeResponseDto getServiceFeeResponse() {
            return this.serviceFeeResponse;
        }
    }

    public final ApiCreateTransferRequest createTransferRequest(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        transferData.getTransferDirection();
        TransferDirection.Companion companion = TransferDirection.INSTANCE;
        return new ApiCreateTransferRequest(this.refIdFactory.generateRefId(transferData), transferData.getAmount().getDecimalValue(), new ApiCreateTransferRequest.ApiTransferAccount(transferData.getInternalAccountId(), ApiTransferAccount.TransferAccountType.RHS, null, null, 12, null), new ApiCreateTransferRequest.ApiTransferAccount(transferData.getExternalAccountId(), ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT, null, null, 12, null), ApiCreateTransferRequest2.ONCE, null, createAdditionalData(transferData), null, null, Currency2.toTransferApiCurrency(transferData.getAmount().getCurrency()), TransferType3.toTransferApiTransferType(transferData.getTransferType()), false, null, 6560, null);
    }

    private final ApiCreateTransferRequest.ApiTransferAdditionalData createAdditionalData(TransferData transferData) {
        MoneyDto tax_amount;
        IdlDecimal amount;
        MoneyDto transfer_fee;
        IdlDecimal amount2;
        int i = WhenMappings.$EnumSwitchMapping$0[transferData.getTransferType().ordinal()];
        if (i == 1) {
            FxData fxData = transferData.getFxData();
            if (fxData != null) {
                return new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, 0, null, null, null, null, null, null, fxData.toApiI18nTransferData(transferData.getAmount().getCurrency()), null, null, null, false, null, null, null, null, null, 2095103, null);
            }
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String memo = transferData.getMemo();
        if (memo == null) {
            memo = "";
        }
        ApiCreateTransferRequest.ApiTransferAdditionalData.ApiI18nOutgoingWireData apiI18nOutgoingWireData = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiI18nOutgoingWireData(memo);
        GetServiceFeeResponseDto serviceFeeResponse = transferData.getServiceFeeResponse();
        BigDecimal bigDecimalOrNull = (serviceFeeResponse == null || (transfer_fee = serviceFeeResponse.getTransfer_fee()) == null || (amount2 = transfer_fee.getAmount()) == null) ? null : amount2.toBigDecimalOrNull();
        GetServiceFeeResponseDto serviceFeeResponse2 = transferData.getServiceFeeResponse();
        BigDecimal bigDecimalOrNull2 = (serviceFeeResponse2 == null || (tax_amount = serviceFeeResponse2.getTax_amount()) == null || (amount = tax_amount.getAmount()) == null) ? null : amount.toBigDecimalOrNull();
        FxData fxData2 = transferData.getFxData();
        return new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, 0, null, null, null, null, null, null, fxData2 != null ? fxData2.toApiI18nTransferData(transferData.getAmount().getCurrency()) : null, apiI18nOutgoingWireData, null, null, false, bigDecimalOrNull, bigDecimalOrNull2, null, null, null, 1894399, null);
    }
}
