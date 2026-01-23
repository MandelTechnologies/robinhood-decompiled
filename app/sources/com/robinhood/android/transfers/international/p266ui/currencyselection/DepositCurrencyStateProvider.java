package com.robinhood.android.transfers.international.p266ui.currencyselection;

import android.content.res.Resources;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.currencyselection.DepositCurrencyViewState;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepositCurrencyStateProvider.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyDataState;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "currencyRow", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState$CurrencyRow;", "currency", "Ljava/util/Currency;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "secondaryTextRes", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DepositCurrencyStateProvider implements StateProvider<DepositCurrencyDataState, DepositCurrencyViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public DepositCurrencyStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DepositCurrencyViewState reduce(DepositCurrencyDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CountryCode.Supported locality = dataState.getLocality();
        if (Affiliate.RHSG.INSTANCE.contains(locality)) {
            String string2 = this.resources.getString(C30310R.string.select_deposit_currency_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new DepositCurrencyViewState.Loaded(string2, CollectionsKt.listOf((Object[]) new DepositCurrencyViewState.CurrencyRow[]{currencyRow(Currencies.USD, CountryCode.Supported.UnitedStates.INSTANCE, C30310R.string.select_deposit_currency_wire_transfer), currencyRow(Currencies.SGD, CountryCode.Supported.Singapore.INSTANCE, C30310R.string.select_deposit_currency_fast_or_wire_transfer)}));
        }
        if (locality == null) {
            return DepositCurrencyViewState.Loading.INSTANCE;
        }
        throw new IllegalStateException(("Unsupported locality: " + dataState.getLocality()).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DepositCurrencyViewState.CurrencyRow currencyRow(Currency currency, CountryCode countryCode, int secondaryTextRes) throws Resources.NotFoundException {
        String currencyCode;
        String iso3166CountryCode = countryCode.getIso3166CountryCode();
        Integer name = Currency2.getName(currency);
        if (name != null) {
            currencyCode = this.resources.getString(name.intValue());
            if (currencyCode == null) {
                currencyCode = currency.getCurrencyCode();
            }
        }
        Intrinsics.checkNotNullExpressionValue(currencyCode, "with(...)");
        String string2 = this.resources.getString(secondaryTextRes);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new DepositCurrencyViewState.CurrencyRow(currency, iso3166CountryCode, currencyCode, string2);
    }
}
