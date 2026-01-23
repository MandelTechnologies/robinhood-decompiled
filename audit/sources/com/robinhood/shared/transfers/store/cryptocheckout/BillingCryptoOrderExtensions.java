package com.robinhood.shared.transfers.store.cryptocheckout;

import bff_money_movement.service.p019v1.BillErrorDto;
import bff_money_movement.service.p019v1.BillingAccountDto;
import bff_money_movement.service.p019v1.CreateBillRequestDto;
import bff_money_movement.service.p019v1.CryptoRequestDto;
import bff_money_movement.service.p019v1.DCFMetaDataDto;
import bff_money_movement.service.p019v1.GetCryptoBillDetailsResponseDto;
import bff_money_movement.service.p019v1.PaymentRequestDto;
import billing.service.bill.p022v1.BillTypeDto;
import billing.service.bill.p022v1.BillerDto;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.order.OrderTypeDto;
import rosetta.order.SideDto;
import rosetta.order.TimeInForceDto;

/* compiled from: BillingCryptoOrderExtensions.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"isTerminal", "", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "(Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;)Z", "dcfInterruptMetaData", "Lbff_money_movement/service/v1/DCFMetaDataDto;", "getDcfInterruptMetaData", "(Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;)Lbff_money_movement/service/v1/DCFMetaDataDto;", "toCreateBillRequest", "Lbff_money_movement/service/v1/CreateBillRequestDto;", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "rhsAccountNumber", "", "billingAccount", "Lbff_money_movement/service/v1/BillingAccountDto;", "toOrderTypeDto", "Lrosetta/order/OrderTypeDto;", "Lcom/robinhood/models/api/CryptoOrderType;", "toSideDto", "Lrosetta/order/SideDto;", "Lcom/robinhood/models/db/OrderSide;", "toTimeInForceDto", "Lrosetta/order/TimeInForceDto;", "Lcom/robinhood/models/db/OrderTimeInForce;", "lib-store-crypto-checkout_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BillingCryptoOrderExtensions {

    /* compiled from: BillingCryptoOrderExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CryptoOrderType.values().length];
            try {
                iArr[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderTimeInForce.values().length];
            try {
                iArr3[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OrderTimeInForce.GFW.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderTimeInForce.GFM.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OrderTimeInForce.IOC.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OrderTimeInForce.OPG.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean isTerminal(GetCryptoBillDetailsResponseDto getCryptoBillDetailsResponseDto) {
        Intrinsics.checkNotNullParameter(getCryptoBillDetailsResponseDto, "<this>");
        GetCryptoBillDetailsResponseDto.ResultDto result = getCryptoBillDetailsResponseDto.getResult();
        if (result instanceof GetCryptoBillDetailsResponseDto.ResultDto.Error) {
            return ((GetCryptoBillDetailsResponseDto.ResultDto.Error) result).getValue() != BillErrorDto.BILL_ERROR_UNSPECIFIED;
        }
        if (result instanceof GetCryptoBillDetailsResponseDto.ResultDto.Success) {
            return true;
        }
        if (result == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DCFMetaDataDto getDcfInterruptMetaData(GetCryptoBillDetailsResponseDto getCryptoBillDetailsResponseDto) {
        DCFMetaDataDto value;
        Intrinsics.checkNotNullParameter(getCryptoBillDetailsResponseDto, "<this>");
        GetCryptoBillDetailsResponseDto.InterruptionMetadataDto interruption_metadata = getCryptoBillDetailsResponseDto.getInterruption_metadata();
        GetCryptoBillDetailsResponseDto.InterruptionMetadataDto.DcfMetadata dcfMetadata = interruption_metadata instanceof GetCryptoBillDetailsResponseDto.InterruptionMetadataDto.DcfMetadata ? (GetCryptoBillDetailsResponseDto.InterruptionMetadataDto.DcfMetadata) interruption_metadata : null;
        if (dcfMetadata == null || (value = dcfMetadata.getValue()) == null || value.getThree_d_secure_redirect_url().length() <= 0) {
            return null;
        }
        return value;
    }

    public static final CreateBillRequestDto toCreateBillRequest(ApiCryptoOrderRequest apiCryptoOrderRequest, String rhsAccountNumber, BillingAccountDto billingAccount) {
        Intrinsics.checkNotNullParameter(apiCryptoOrderRequest, "<this>");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
        String string2 = apiCryptoOrderRequest.getRef_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        BillTypeDto billTypeDto = BillTypeDto.BILL_TYPE_CRYPTO;
        BillerDto billerDto = new BillerDto(rhsAccountNumber, AccountTypeDto.RHS_ACCOUNT, null, 4, null);
        String string3 = apiCryptoOrderRequest.getCurrency_pair_id().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        boolean zIs_quantity_collared = apiCryptoOrderRequest.is_quantity_collared();
        String plainString = apiCryptoOrderRequest.getPrice().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        String plainString2 = apiCryptoOrderRequest.getQuantity().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
        SideDto sideDto = toSideDto(apiCryptoOrderRequest.getSide());
        TimeInForceDto timeInForceDto = toTimeInForceDto(apiCryptoOrderRequest.getTime_in_force());
        OrderTypeDto orderTypeDto = toOrderTypeDto(apiCryptoOrderRequest.getType());
        String accountId = apiCryptoOrderRequest.getAccountId();
        BigDecimal entered_amount = apiCryptoOrderRequest.getEntered_amount();
        String plainString3 = entered_amount != null ? entered_amount.toPlainString() : null;
        String str = plainString3 == null ? "" : plainString3;
        BigDecimal fee_ratio = apiCryptoOrderRequest.getFee_ratio();
        String plainString4 = fee_ratio != null ? fee_ratio.toPlainString() : null;
        List listListOf = CollectionsKt.listOf(new CryptoRequestDto(string3, zIs_quantity_collared, plainString, plainString2, sideDto, timeInForceDto, orderTypeDto, accountId, str, plainString4 == null ? "" : plainString4));
        BigDecimal entered_amount2 = apiCryptoOrderRequest.getEntered_amount();
        return new CreateBillRequestDto(billTypeDto, string2, billerDto, entered_amount2 != null ? new MoneyDto(IdlDecimal2.toIdlDecimal(entered_amount2), CurrencyDto.USD) : null, CollectionsKt.listOf(new PaymentRequestDto(BillingAccountDtos.getTransferType(billingAccount), billingAccount.getId(), BillingAccountDtos.getInstrumentType(billingAccount), billingAccount.is_3ds_required())), listListOf, null, null, 192, null);
    }

    private static final OrderTypeDto toOrderTypeDto(CryptoOrderType cryptoOrderType) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoOrderType.ordinal()];
        if (i == 1) {
            return OrderTypeDto.MARKET;
        }
        if (i == 2) {
            return OrderTypeDto.LIMIT;
        }
        if (i == 3) {
            return OrderTypeDto.STOP_LOSS;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderTypeDto.STOP_LIMIT;
    }

    private static final SideDto toSideDto(OrderSide orderSide) {
        int i = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i == 1) {
            return SideDto.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return SideDto.SELL;
    }

    private static final TimeInForceDto toTimeInForceDto(OrderTimeInForce orderTimeInForce) {
        switch (WhenMappings.$EnumSwitchMapping$2[orderTimeInForce.ordinal()]) {
            case 1:
                return TimeInForceDto.GFD;
            case 2:
                return TimeInForceDto.GTC;
            case 3:
                return TimeInForceDto.GFW;
            case 4:
                return TimeInForceDto.GFM;
            case 5:
            case 6:
            case 7:
                return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
