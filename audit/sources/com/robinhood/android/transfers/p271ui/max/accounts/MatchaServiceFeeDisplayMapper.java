package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFee;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams3;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams4;
import com.robinhood.models.api.bonfire.transfer.Discount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaServiceFeeDisplayMapper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/MatchaServiceFeeDisplayMapper;", "", "<init>", "()V", "getDisplayText", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "serviceFeeParams", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "matchaTreatment", "Lcom/robinhood/models/db/matcha/MatchaTreatment;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MatchaServiceFeeDisplayMapper {
    public static final int $stable = 0;
    public static final MatchaServiceFeeDisplayMapper INSTANCE = new MatchaServiceFeeDisplayMapper();

    /* compiled from: MatchaServiceFeeDisplayMapper.kt */
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

    private MatchaServiceFeeDisplayMapper() {
    }

    public final TransferAccountsViewState.ServiceFeeDisplayText getDisplayText(TransferAccount account, ApiServiceFeeParams serviceFeeParams, TransferAccountDirection direction, MatchaTreatment matchaTreatment) {
        ApiServiceFee pull;
        int i;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(matchaTreatment, "matchaTreatment");
        if (serviceFeeParams == null) {
            return null;
        }
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
        Discount discount = discountDetails != null ? (Discount) CollectionsKt.firstOrNull((List) discountDetails) : null;
        if (discount == null && matchaTreatment.getRolloutStatus() == ApiMatchaTreatment.RolloutStatus.CAN_INITIATE) {
            discount = new Discount(ApiServiceFeeParams3.P2P_DISCOUNTED_INSTANT_WITHDRAWAL, ApiServiceFeeParams4.PAID);
        }
        if (discount == null) {
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
        if (i4 != 1) {
            if (i4 == 2) {
                tuples2M3642to = Tuples4.m3642to(null, null);
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C30065R.string.matcha_min), Money.format$default(Money3.toMoney(pull.getMin_fee(), Currencies.USD), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null));
            }
        } else if (account.getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C30065R.string.matcha_min), Money.format$default(Money3.toMoney(pull.getMin_fee(), Currencies.USD), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null));
        } else {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C30065R.string.transfer_account_eligible_suffix), null);
        }
        return new TransferAccountsViewState.ServiceFeeDisplayText(i, (Integer) tuples2M3642to.component1(), (String) tuples2M3642to.component2());
    }
}
