package com.robinhood.android.transfers.p271ui.max.i18n;

import android.content.res.Resources;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferStateProvider.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"convertCurrency", "", "localCurrency", "Ljava/util/Currency;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "amount", "Lcom/robinhood/models/util/Money;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "resources", "Landroid/content/res/Resources;", "MINIMUM_FRACTION_DIGIT_SIZE", "", "toolbarTitleRes", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "getToolbarTitleRes", "(Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;)Ljava/lang/Integer;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferStateProvider2 {
    private static final int MINIMUM_FRACTION_DIGIT_SIZE = 6;

    /* compiled from: InternationalTransferStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String convertCurrency(Currency localCurrency, TransferDirection transferDirection, Money amount, ApiFxQuote fxQuote, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (amount.isZero()) {
            Currency currency = Currencies.USD;
            BigDecimal scale = GetRate.getRate(fxQuote, transferDirection).setScale(6);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            String string2 = resources.getString(C30065R.string.default_fx_rate, localCurrency.getCurrencyCode(), Money.format$default(new Money(currency, scale), null, false, null, false, 6, null, false, null, false, false, 999, null));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C30065R.string.converted_fx_rate, Money.format$default(InternationalTransferCurrencyUtils.convertAmount(localCurrency, transferDirection, amount, fxQuote), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final Integer getToolbarTitleRes(InternationalTransferDataState internationalTransferDataState) {
        int i;
        Intrinsics.checkNotNullParameter(internationalTransferDataState, "<this>");
        CountryCode.Supported locality = internationalTransferDataState.getLocality();
        if (Intrinsics.areEqual(locality, CountryCode.Supported.Singapore.INSTANCE)) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[internationalTransferDataState.getTransferDirection().ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Singapore deposits are non originated");
            }
            if (i2 == 2) {
                return Integer.valueOf(C9631R.string.withdrawal_via_fast);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            if (locality == null) {
                return null;
            }
            throw new IllegalStateException(("Unsupported locality: " + internationalTransferDataState.getLocality()).toString());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[internationalTransferDataState.getTransferDirection().ordinal()];
        if (i3 == 1) {
            i = C9631R.string.uk_deposits_primary_text;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C9631R.string.uk_withdrawals_primary_text;
        }
        return Integer.valueOf(i);
    }
}
