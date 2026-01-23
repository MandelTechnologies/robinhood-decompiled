package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.IcuNumberFormatter;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDetailTopBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÂ\u0003J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\t\u0010%\u001a\u00020\u0005HÂ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "isLoggedIn", "", "isPipExperimentEnabled", "watchlistsWithThisCurrencyPair", "", "Ljava/util/UUID;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "sduiPriceString", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;ZZLjava/util/List;Lcom/robinhood/models/crypto/db/CryptoQuote;Ljava/lang/String;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "priceFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "title", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "showBackButton", "getShowBackButton", "()Z", "topBarActions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "getTopBarActions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailTopBarDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final CryptoQuote cryptoQuote;
    private final UiCurrencyPair currencyPair;
    private final boolean isLoggedIn;
    private final boolean isPipExperimentEnabled;
    private final NumberFormatter priceFormat;
    private final String sduiPriceString;
    private final List<UUID> watchlistsWithThisCurrencyPair;

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsPipExperimentEnabled() {
        return this.isPipExperimentEnabled;
    }

    private final List<UUID> component4() {
        return this.watchlistsWithThisCurrencyPair;
    }

    /* renamed from: component5, reason: from getter */
    private final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component6, reason: from getter */
    private final String getSduiPriceString() {
        return this.sduiPriceString;
    }

    public static /* synthetic */ CryptoDetailTopBarDataState copy$default(CryptoDetailTopBarDataState cryptoDetailTopBarDataState, AppType appType, boolean z, boolean z2, List list, CryptoQuote cryptoQuote, String str, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoDetailTopBarDataState.appType;
        }
        if ((i & 2) != 0) {
            z = cryptoDetailTopBarDataState.isLoggedIn;
        }
        if ((i & 4) != 0) {
            z2 = cryptoDetailTopBarDataState.isPipExperimentEnabled;
        }
        if ((i & 8) != 0) {
            list = cryptoDetailTopBarDataState.watchlistsWithThisCurrencyPair;
        }
        if ((i & 16) != 0) {
            cryptoQuote = cryptoDetailTopBarDataState.cryptoQuote;
        }
        if ((i & 32) != 0) {
            str = cryptoDetailTopBarDataState.sduiPriceString;
        }
        if ((i & 64) != 0) {
            uiCurrencyPair = cryptoDetailTopBarDataState.currencyPair;
        }
        String str2 = str;
        UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
        CryptoQuote cryptoQuote2 = cryptoQuote;
        boolean z3 = z2;
        return cryptoDetailTopBarDataState.copy(appType, z, z3, list, cryptoQuote2, str2, uiCurrencyPair2);
    }

    /* renamed from: component7, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoDetailTopBarDataState copy(AppType appType, boolean isLoggedIn, boolean isPipExperimentEnabled, List<UUID> watchlistsWithThisCurrencyPair, CryptoQuote cryptoQuote, String sduiPriceString, UiCurrencyPair currencyPair) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(watchlistsWithThisCurrencyPair, "watchlistsWithThisCurrencyPair");
        return new CryptoDetailTopBarDataState(appType, isLoggedIn, isPipExperimentEnabled, watchlistsWithThisCurrencyPair, cryptoQuote, sduiPriceString, currencyPair);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailTopBarDataState)) {
            return false;
        }
        CryptoDetailTopBarDataState cryptoDetailTopBarDataState = (CryptoDetailTopBarDataState) other;
        return this.appType == cryptoDetailTopBarDataState.appType && this.isLoggedIn == cryptoDetailTopBarDataState.isLoggedIn && this.isPipExperimentEnabled == cryptoDetailTopBarDataState.isPipExperimentEnabled && Intrinsics.areEqual(this.watchlistsWithThisCurrencyPair, cryptoDetailTopBarDataState.watchlistsWithThisCurrencyPair) && Intrinsics.areEqual(this.cryptoQuote, cryptoDetailTopBarDataState.cryptoQuote) && Intrinsics.areEqual(this.sduiPriceString, cryptoDetailTopBarDataState.sduiPriceString) && Intrinsics.areEqual(this.currencyPair, cryptoDetailTopBarDataState.currencyPair);
    }

    public int hashCode() {
        int iHashCode = ((((((this.appType.hashCode() * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isPipExperimentEnabled)) * 31) + this.watchlistsWithThisCurrencyPair.hashCode()) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode2 = (iHashCode + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        String str = this.sduiPriceString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        return iHashCode3 + (uiCurrencyPair != null ? uiCurrencyPair.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDetailTopBarDataState(appType=" + this.appType + ", isLoggedIn=" + this.isLoggedIn + ", isPipExperimentEnabled=" + this.isPipExperimentEnabled + ", watchlistsWithThisCurrencyPair=" + this.watchlistsWithThisCurrencyPair + ", cryptoQuote=" + this.cryptoQuote + ", sduiPriceString=" + this.sduiPriceString + ", currencyPair=" + this.currencyPair + ")";
    }

    public CryptoDetailTopBarDataState(AppType appType, boolean z, boolean z2, List<UUID> watchlistsWithThisCurrencyPair, CryptoQuote cryptoQuote, String str, UiCurrencyPair uiCurrencyPair) {
        Currency quoteCurrencyForPriceInput;
        NumberFormatter cryptoFiatPriceFormatterForTicker;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(watchlistsWithThisCurrencyPair, "watchlistsWithThisCurrencyPair");
        this.appType = appType;
        this.isLoggedIn = z;
        this.isPipExperimentEnabled = z2;
        this.watchlistsWithThisCurrencyPair = watchlistsWithThisCurrencyPair;
        this.cryptoQuote = cryptoQuote;
        this.sduiPriceString = str;
        this.currencyPair = uiCurrencyPair;
        this.priceFormat = (uiCurrencyPair == null || (quoteCurrencyForPriceInput = uiCurrencyPair.getQuoteCurrencyForPriceInput()) == null || (cryptoFiatPriceFormatterForTicker = CurrencyDefinitions.getCryptoFiatPriceFormatterForTicker(quoteCurrencyForPriceInput)) == null) ? new IcuNumberFormatter(FormatsLocalized.getCurrencyFormat()) : cryptoFiatPriceFormatterForTicker;
    }

    public /* synthetic */ CryptoDetailTopBarDataState(AppType appType, boolean z, boolean z2, List list, CryptoQuote cryptoQuote, String str, UiCurrencyPair uiCurrencyPair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : cryptoQuote, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : uiCurrencyPair);
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final String getTitle() {
        CryptoQuote cryptoQuote;
        String str = this.sduiPriceString;
        if (str != null && str.length() != 0) {
            return this.sduiPriceString;
        }
        if (this.isLoggedIn && this.currencyPair != null && (cryptoQuote = this.cryptoQuote) != null) {
            return this.priceFormat.format(cryptoQuote.getMarkPrice().getDecimalValue());
        }
        return "";
    }

    public final String getSubtitle() {
        UiCurrencyPair uiCurrencyPair;
        if (getTitle().length() > 0 && this.isLoggedIn && (uiCurrencyPair = this.currencyPair) != null) {
            return uiCurrencyPair.getDisplayName();
        }
        return "";
    }

    public final boolean getShowBackButton() {
        return this.isLoggedIn;
    }

    public final ImmutableList<CryptoDetailTopBarAction> getTopBarActions() {
        Object addToList;
        if (!this.isLoggedIn) {
            return extensions2.persistentListOf();
        }
        if (this.watchlistsWithThisCurrencyPair.isEmpty()) {
            addToList = this.currencyPair != null ? new CryptoDetailTopBarAction.AddToList(this.currencyPair.getDisplaySymbol()) : null;
        } else {
            addToList = CryptoDetailTopBarAction.UpdateList.INSTANCE;
        }
        List listListOf = CollectionsKt.listOf(addToList);
        if (this.appType == AppType.TRADER) {
            UiCurrencyPair uiCurrencyPair = this.currencyPair;
            boolean z = (uiCurrencyPair == null || uiCurrencyPair.getMarketOrdersOnly()) ? false : true;
            CryptoDetailTopBarAction.Pip pip = CryptoDetailTopBarAction.Pip.INSTANCE;
            if (!this.isPipExperimentEnabled) {
                pip = null;
            }
            listListOf = CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new CryptoDetailTopBarAction[]{pip, z ? CryptoDetailTopBarAction.AdvancedAlerts.INSTANCE : null}), (Iterable) listListOf);
        }
        return extensions2.toImmutableList(CollectionsKt.filterNotNull(listListOf));
    }
}
