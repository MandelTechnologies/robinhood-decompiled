package com.robinhood.android.transfers.p271ui.max.createtransfer;

import android.content.Context;
import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFee;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams4;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.Discount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaCreateTransferAccountRowViewMapper.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaCreateTransferAccountRowViewMapper;", "", "<init>", "()V", "getMatchaDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "context", "Landroid/content/Context;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "accountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "serviceFeeParams", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "isReviewMode", "", "serviceFeeData", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MatchaCreateTransferAccountRowViewMapper {
    public static final int $stable = 0;
    public static final MatchaCreateTransferAccountRowViewMapper INSTANCE = new MatchaCreateTransferAccountRowViewMapper();

    /* compiled from: MatchaCreateTransferAccountRowViewMapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiServiceFeeParams4.values().length];
            try {
                iArr2[ApiServiceFeeParams4.PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiServiceFeeParams4.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiServiceFeeParams4.CHEAPER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private MatchaCreateTransferAccountRowViewMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MatchaDisplayInfo getMatchaDisplayInfo(Context context, TransferAccountDirection direction, ApiTransferAccount.TransferAccountType accountType, ApiServiceFeeParams serviceFeeParams, boolean isReviewMode, ApiServiceFeeResponse serviceFeeData) {
        ApiServiceFee pull;
        Discount discount;
        int i;
        BigDecimal service_fee;
        Money money;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(serviceFeeParams, "serviceFeeParams");
        int i2 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i2 == 1) {
            pull = serviceFeeParams.getPull();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pull = serviceFeeParams.getPush();
        }
        List<Discount> discountDetails = pull.getDiscountDetails();
        String string2 = null;
        if (discountDetails == null || (discount = (Discount) CollectionsKt.firstOrNull((List) discountDetails)) == null) {
            return null;
        }
        if (accountType == ApiTransferAccount.TransferAccountType.ACH && discount.getValue() == ApiServiceFeeParams4.CHEAPER) {
            return null;
        }
        ApiServiceFeeParams4 value = discount.getValue();
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i3 = iArr[value.ordinal()];
        if (i3 == 1) {
            i = C13932R.string.instant_withdrawals;
        } else if (i3 == 2) {
            i = C13932R.string.matcha_free;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C13932R.string.matcha_cheaper;
        }
        int i4 = iArr[discount.getValue().ordinal()];
        if (i4 == 1) {
            if (!isReviewMode) {
                if (serviceFeeData != null && (service_fee = serviceFeeData.getService_fee()) != null && (money = Money3.toMoney(service_fee, Currencies.USD)) != null) {
                    string2 = Money.format$default(money, Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null);
                }
                string2 = context.getString(C30065R.string.matcha_fee, string2);
            } else {
                string2 = context.getString(C30065R.string.matcha_fee_percentage, pull.getFee_rate());
            }
        } else if (i4 != 2) {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!isReviewMode) {
            }
        } else if (isReviewMode) {
            BigDecimal service_fee_discount_amount = serviceFeeData != null ? serviceFeeData.getService_fee_discount_amount() : null;
            if (service_fee_discount_amount != null) {
                string2 = context.getString(C30065R.string.matcha_you_save, Money.format$default(Money3.toMoney(service_fee_discount_amount, Currencies.USD), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null));
            }
        }
        return new MatchaDisplayInfo(i, string2, ValueTextState2.CREATE_TRANSFER_SCREEN);
    }
}
