package com.robinhood.shared.transfers.store.cryptocheckout;

import bff_money_movement.service.p019v1.BillingAccountDto;
import bff_money_movement.service.p019v1.BillingAccountTypeDto;
import com.robinhood.rosetta.common.AccountTypeDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: BillingAccountDtos.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"transferType", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "Lbff_money_movement/service/v1/BillingAccountDto;", "getTransferType", "(Lbff_money_movement/service/v1/BillingAccountDto;)Lrosetta/payment_hub/v1/service/TransferTypeDto;", "instrumentType", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "getInstrumentType", "(Lbff_money_movement/service/v1/BillingAccountDto;)Lcom/robinhood/rosetta/common/AccountTypeDto;", "lib-store-crypto-checkout_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingAccountDtosKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BillingAccountDtos {

    /* compiled from: BillingAccountDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingAccountDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAccountTypeDto.values().length];
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_BANK_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TransferTypeDto getTransferType(BillingAccountDto billingAccountDto) {
        Intrinsics.checkNotNullParameter(billingAccountDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[billingAccountDto.getType().ordinal()];
        if (i == 1) {
            return TransferTypeDto.TRANSFER_TYPE_ORIGINATED_ACH;
        }
        if (i == 2) {
            return TransferTypeDto.TRANSFER_TYPE_DEBIT_CARD_FUNDING;
        }
        if (i == 3 || i == 4) {
            throw new IllegalStateException("Unexpected billing account type");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AccountTypeDto getInstrumentType(BillingAccountDto billingAccountDto) {
        Intrinsics.checkNotNullParameter(billingAccountDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[billingAccountDto.getType().ordinal()];
        if (i == 1) {
            return AccountTypeDto.ACH_RELATIONSHIP;
        }
        if (i == 2) {
            return AccountTypeDto.DEBIT_CARD_INSTRUMENT;
        }
        if (i == 3 || i == 4) {
            throw new IllegalStateException("Unexpected billing account type");
        }
        throw new NoWhenBranchMatchedException();
    }
}
