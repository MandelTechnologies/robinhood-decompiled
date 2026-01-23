package com.robinhood.shared.transfers.cryptocheckout;

import bff_money_movement.service.p019v1.BillingAccountDto;
import bff_money_movement.service.p019v1.BillingAccountTypeDto;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: PaymentMethodDropdownStates.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"paymentMethodDropdownState", "Lcom/robinhood/shared/transfers/cryptocheckout/PaymentMethodDropdownState;", "Lbff_money_movement/service/v1/BillingAccountDto;", "getPaymentMethodDropdownState", "(Lbff_money_movement/service/v1/BillingAccountDto;)Lcom/robinhood/shared/transfers/cryptocheckout/PaymentMethodDropdownState;", "displayTitle", "", "getDisplayTitle", "(Lbff_money_movement/service/v1/BillingAccountDto;)Ljava/lang/String;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lbff_money_movement/service/v1/BillingAccountTypeDto;", "getIconAsset", "(Lbff_money_movement/service/v1/BillingAccountTypeDto;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "analyticsIdentifier", "getAnalyticsIdentifier", "truncate", Constants.RequestParamsKeys.APP_NAME_KEY, "", "MAX_NICKNAME_DISPLAY_LENGTH", "lib-crypto-checkout_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownStatesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentMethodDropdownStates {
    private static final int MAX_NICKNAME_DISPLAY_LENGTH = 15;

    /* compiled from: PaymentMethodDropdownStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAccountTypeDto.values().length];
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_DEBIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PaymentMethodDropdownState getPaymentMethodDropdownState(BillingAccountDto billingAccountDto) {
        Money money;
        String str;
        Intrinsics.checkNotNullParameter(billingAccountDto, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(getDisplayTitle(billingAccountDto));
        MoneyDto instant_available_amount = billingAccountDto.getInstant_available_amount();
        return new PaymentMethodDropdownState(new BentoIcon4.Size24(getIconAsset(billingAccountDto.getType())), stringResourceInvoke, (instant_available_amount == null || (money = Money3.toMoney(instant_available_amount)) == null || (str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) ? null : companion.invoke(str), getAnalyticsIdentifier(billingAccountDto));
    }

    public static final String getDisplayTitle(BillingAccountDto billingAccountDto) {
        Intrinsics.checkNotNullParameter(billingAccountDto, "<this>");
        return truncate(billingAccountDto.getNickname(), 15) + PlaceholderUtils.XXShortPlaceholderText + billingAccountDto.getTrailing_digits();
    }

    private static final ServerToBentoAssetMapper2 getIconAsset(BillingAccountTypeDto billingAccountTypeDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[billingAccountTypeDto.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.ROBINHOOD_24;
        }
        if (i == 2) {
            return ServerToBentoAssetMapper2.BANKING_24;
        }
        if (i == 3) {
            return ServerToBentoAssetMapper2.PAYMENT_24;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ServerToBentoAssetMapper2.UNKNOWN;
    }

    private static final String getAnalyticsIdentifier(BillingAccountDto billingAccountDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[billingAccountDto.getType().ordinal()];
        if (i == 1) {
            return "buying_power";
        }
        if (i == 2) {
            return "bank_account_" + billingAccountDto.getId();
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return "unknown";
        }
        return "debit_card_" + billingAccountDto.getId();
    }

    private static final String truncate(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        return StringsKt.trimEnd(StringsKt.take(str, i)).toString() + "…";
    }
}
