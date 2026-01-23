package com.robinhood.librobinhood.data.store.bff;

import bff_money_movement.service.p019v1.GetPaymentIntentsResponseDto;
import bff_money_movement.service.p019v1.PaymentIntentDto;
import cashier_protos.payment_hub.p046v1.FXTransferDetailsDto;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import cashier_protos.payment_intents.p047v1.StateDto;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentDtos.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e*\u00020\u000f¨\u0006\u0010"}, m3636d2 = {"toDbModel", "Lcom/robinhood/models/db/bff/PaymentIntent;", "Lbff_money_movement/service/v1/PaymentIntentDto;", "Lcom/robinhood/models/db/bff/PaymentIntent$FxTransferDetails;", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "Lcom/robinhood/models/db/bff/PaymentIntent$State;", "Lcashier_protos/payment_intents/v1/StateDto;", "Lcom/robinhood/models/db/bff/PaymentIntent$Direction;", "Lcashier_protos/payment_intents/v1/DirectionDto;", "Lcom/robinhood/models/db/bff/PaymentIntent$AccountType;", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "Lcom/robinhood/models/db/bff/PaymentIntent$Purpose;", "Lcashier_protos/payment_intents/v1/PurposeDto;", "toPaginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lbff_money_movement/service/v1/GetPaymentIntentsResponseDto;", "lib-store-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bff.PaymentIntentDtosKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class PaymentIntentDtos {

    /* compiled from: PaymentIntentDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bff.PaymentIntentDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[StateDto.values().length];
            try {
                iArr[StateDto.STATE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateDto.STATE_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateDto.STATE_SCHEDULED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StateDto.STATE_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StateDto.STATE_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StateDto.STATE_PENDING_REVERSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StateDto.STATE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StateDto.STATE_CANCELED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StateDto.STATE_REVERSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StateDto.STATE_COMPLETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DirectionDto.values().length];
            try {
                iArr2[DirectionDto.DIRECTION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DirectionDto.DIRECTION_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DirectionDto.DIRECTION_WITHDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AccountTypeDto.values().length];
            try {
                iArr3[AccountTypeDto.I18N_BANK_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[AccountTypeDto.RHS_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[AccountTypeDto.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AccountTypeDto.ACH_RELATIONSHIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[AccountTypeDto.RHY_FIRM_ACCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[AccountTypeDto.RHS_FIRM_ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[AccountTypeDto.DEBIT_CARD_INSTRUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[AccountTypeDto.RHC_FIRM_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[AccountTypeDto.RHS_TRADITIONAL_IRA.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[AccountTypeDto.RHS_ROTH_IRA.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[AccountTypeDto.RHS_TRADITIONAL_IRA_INHERITED.ordinal()] = 11;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[AccountTypeDto.RHS_ROTH_IRA_INHERITED.ordinal()] = 12;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[AccountTypeDto.RHY_SAVINGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[AccountTypeDto.RHM_FIRM_ACCOUNT.ordinal()] = 14;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[AccountTypeDto.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[AccountTypeDto.RHCE_USER_WALLET.ordinal()] = 16;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[AccountTypeDto.RHCE_FIRM_WALLET.ordinal()] = 17;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[AccountTypeDto.RHCE_CUSTOMER_ACCOUNT.ordinal()] = 18;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[AccountTypeDto.UK_BANK_ACCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[AccountTypeDto.RCT_FIRM_ACCOUNT.ordinal()] = 20;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[AccountTypeDto.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 21;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[AccountTypeDto.RHY_ACCOUNT.ordinal()] = 22;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[AccountTypeDto.RCT_ACCOUNT.ordinal()] = 23;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[AccountTypeDto.OUTGOING_WIRE_ACCOUNT.ordinal()] = 24;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[AccountTypeDto.RHD_ACCOUNT.ordinal()] = 25;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[AccountTypeDto.RHY_BANKING_FIRM_ACCOUNT.ordinal()] = 26;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[AccountTypeDto.RHY_BANKING_CHECKING.ordinal()] = 27;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[AccountTypeDto.RHY_BANKING_SAVINGS.ordinal()] = 28;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[AccountTypeDto.RHS_CUSTODIAL_UGMA.ordinal()] = 29;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[AccountTypeDto.RHS_CUSTODIAL_UTMA.ordinal()] = 30;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[AccountTypeDto.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 31;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[AccountTypeDto.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 32;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[AccountTypeDto.RHSG_FIRM_ACCOUNT.ordinal()] = 33;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PurposeDto.values().length];
            try {
                iArr4[PurposeDto.PURPOSE_BILLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr4[PurposeDto.PURPOSE_UK_BANK_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr4[PurposeDto.PURPOSE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr4[PurposeDto.PURPOSE_SG_BANK_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr4[PurposeDto.PURPOSE_I18N_WIRE_TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final PaymentIntent toDbModel(PaymentIntentDto paymentIntentDto) {
        Intrinsics.checkNotNullParameter(paymentIntentDto, "<this>");
        UUID uuidFromString = UUID.fromString(paymentIntentDto.getId());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        MoneyDto amount = paymentIntentDto.getAmount();
        if (amount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Money money = Money3.toMoney(amount);
        MoneyDto received_amount = paymentIntentDto.getReceived_amount();
        if (received_amount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Money money2 = Money3.toMoney(received_amount);
        PaymentIntent.State dbModel = toDbModel(paymentIntentDto.getState());
        PaymentIntent.Direction dbModel2 = toDbModel(paymentIntentDto.getDirection());
        PaymentIntent.Purpose dbModel3 = toDbModel(paymentIntentDto.getPurpose());
        String rh_account_id = paymentIntentDto.getRh_account_id();
        PaymentIntent.AccountType dbModel4 = toDbModel(paymentIntentDto.getRh_account_type());
        String payment_instrument_id = paymentIntentDto.getPayment_instrument_id();
        PaymentIntent.AccountType dbModel5 = toDbModel(paymentIntentDto.getPayment_instrument_type());
        FXTransferDetailsDto fx_transfer_details = paymentIntentDto.getFx_transfer_details();
        PaymentIntent.FxTransferDetails dbModel6 = fx_transfer_details != null ? toDbModel(fx_transfer_details) : null;
        MoneyDto service_fee = paymentIntentDto.getService_fee();
        Money money3 = service_fee != null ? Money3.toMoney(service_fee) : null;
        MoneyDto tax_amount = paymentIntentDto.getTax_amount();
        return new PaymentIntent(uuidFromString, money, money2, dbModel2, dbModel, dbModel3, rh_account_id, dbModel4, payment_instrument_id, dbModel5, dbModel6, money3, tax_amount != null ? Money3.toMoney(tax_amount) : null, StringsKt.safeToInstant(kotlin.text.StringsKt.replace$default(paymentIntentDto.getCreated_at(), PlaceholderUtils.XXShortPlaceholderText, "T", false, 4, (Object) null)), StringsKt.safeToInstant(kotlin.text.StringsKt.replace$default(paymentIntentDto.getUpdated_at(), PlaceholderUtils.XXShortPlaceholderText, "T", false, 4, (Object) null)));
    }

    public static final PaymentIntent.FxTransferDetails toDbModel(FXTransferDetailsDto fXTransferDetailsDto) {
        Intrinsics.checkNotNullParameter(fXTransferDetailsDto, "<this>");
        BigDecimal bigDecimalOrNull = fXTransferDetailsDto.getBase_amount().toBigDecimalOrNull();
        String json_value = fXTransferDetailsDto.getBase_currency().getJson_value();
        if (json_value == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BigDecimal bigDecimalOrNull2 = fXTransferDetailsDto.getTarget_amount().toBigDecimalOrNull();
        String json_value2 = fXTransferDetailsDto.getTarget_currency().getJson_value();
        if (json_value2 != null) {
            return new PaymentIntent.FxTransferDetails(bigDecimalOrNull, json_value, bigDecimalOrNull2, json_value2, fXTransferDetailsDto.getTarget_fx_rate().toBigDecimalOrNull(), fXTransferDetailsDto.getActual_target_amount().toBigDecimalOrNull(), fXTransferDetailsDto.getActual_target_fx_rate().toBigDecimalOrNull());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final PaymentIntent.State toDbModel(StateDto stateDto) {
        Intrinsics.checkNotNullParameter(stateDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[stateDto.ordinal()]) {
            case 1:
                return PaymentIntent.State.UNKNOWN;
            case 2:
                return PaymentIntent.State.NEW;
            case 3:
                return PaymentIntent.State.SCHEDULED;
            case 4:
                return PaymentIntent.State.PENDING;
            case 5:
                return PaymentIntent.State.PAUSED;
            case 6:
                return PaymentIntent.State.PENDING_REVERSE;
            case 7:
                return PaymentIntent.State.FAILED;
            case 8:
                return PaymentIntent.State.CANCELED;
            case 9:
                return PaymentIntent.State.REVERSED;
            case 10:
                return PaymentIntent.State.COMPLETED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PaymentIntent.Direction toDbModel(DirectionDto directionDto) {
        Intrinsics.checkNotNullParameter(directionDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[directionDto.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Unspecified direction");
        }
        if (i == 2) {
            return PaymentIntent.Direction.DEPOSIT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PaymentIntent.Direction.WITHDRAW;
    }

    public static final PaymentIntent.AccountType toDbModel(AccountTypeDto accountTypeDto) {
        Intrinsics.checkNotNullParameter(accountTypeDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[accountTypeDto.ordinal()]) {
            case 1:
                return PaymentIntent.AccountType.I18N_BANK_ACCOUNT;
            case 2:
                return PaymentIntent.AccountType.RHS_ACCOUNT;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return PaymentIntent.AccountType.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PaymentIntent.Purpose toDbModel(PurposeDto purposeDto) {
        Intrinsics.checkNotNullParameter(purposeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[purposeDto.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return PaymentIntent.Purpose.UNKNOWN;
        }
        if (i == 4) {
            return PaymentIntent.Purpose.SG_BANK_TRANSFER;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return PaymentIntent.Purpose.I18N_WIRE_TRANSFER;
    }

    public static final PaginatedResult<PaymentIntentDto> toPaginatedResult(GetPaymentIntentsResponseDto getPaymentIntentsResponseDto) {
        Intrinsics.checkNotNullParameter(getPaymentIntentsResponseDto, "<this>");
        return new PaginatedResult<>(getPaymentIntentsResponseDto.getResults(), new PaginationCursor(getPaymentIntentsResponseDto.getPrevious()), new PaginationCursor(getPaymentIntentsResponseDto.getNext()));
    }
}
