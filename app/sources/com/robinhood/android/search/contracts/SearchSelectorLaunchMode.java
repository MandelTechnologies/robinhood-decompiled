package com.robinhood.android.search.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.api.search.SearchQueryContext;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "shouldClearTop", "", "getShouldClearTop", "()Z", "shouldDismissSearchAfterSelection", "getShouldDismissSearchAfterSelection", "Options", "AdvancedChart", "TradingTrends", "CompanyFinancials", "BwAdvanceChart", "Copilot", "Ladder", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$AdvancedChart;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$BwAdvanceChart;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$CompanyFinancials;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Copilot;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Ladder;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$TradingTrends;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SearchSelectorLaunchMode implements Parcelable {
    private final boolean shouldClearTop;
    private final boolean shouldDismissSearchAfterSelection;

    public /* synthetic */ SearchSelectorLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getSearchQueryContext$annotations() {
    }

    public abstract SearchQueryContext getSearchQueryContext();

    private SearchSelectorLaunchMode() {
    }

    public boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    public boolean getShouldDismissSearchAfterSelection() {
        return this.shouldDismissSearchAfterSelection;
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "<init>", "()V", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "useOptionHoldings", "", "getUseOptionHoldings", "()Z", "Deeplink", "AssetHome", "Watchlist", "StrategyBuilder", "SideBySideChainOnboarding", "SimulatedReturnPreTradeOnboarding", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$AssetHome;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$Deeplink;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$SideBySideChainOnboarding;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$SimulatedReturnPreTradeOnboarding;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$StrategyBuilder;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$Watchlist;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Options extends SearchSelectorLaunchMode {
        private final SearchQueryContext searchQueryContext;
        private final boolean useOptionHoldings;

        public /* synthetic */ Options(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getAccountNumber();

        public abstract OptionChainLaunchMode getOptionChainLaunchMode();

        private Options() {
            super(null);
            this.searchQueryContext = SearchQueryContext.OPTIONS;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return this.searchQueryContext;
        }

        public boolean getUseOptionHoldings() {
            return this.useOptionHoldings;
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$Deeplink;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "<init>", "()V", "accountNumber", "", "getAccountNumber$annotations", "getAccountNumber", "()Ljava/lang/String;", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getOptionChainLaunchMode$annotations", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "useOptionHoldings", "", "getUseOptionHoldings$annotations", "getUseOptionHoldings", "()Z", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Deeplink extends Options {
            private static final String accountNumber = null;
            public static final Deeplink INSTANCE = new Deeplink();
            private static final OptionChainLaunchMode optionChainLaunchMode = OptionChainLaunchMode.Normal.INSTANCE;
            private static final boolean useOptionHoldings = true;
            public static final Parcelable.Creator<Deeplink> CREATOR = new Creator();

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Deeplink> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Deeplink createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Deeplink.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Deeplink[] newArray(int i) {
                    return new Deeplink[i];
                }
            }

            public static /* synthetic */ void getAccountNumber$annotations() {
            }

            public static /* synthetic */ void getOptionChainLaunchMode$annotations() {
            }

            public static /* synthetic */ void getUseOptionHoldings$annotations() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Deeplink);
            }

            public int hashCode() {
                return 513041192;
            }

            public String toString() {
                return "Deeplink";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Deeplink() {
                super(null);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return accountNumber;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return optionChainLaunchMode;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public boolean getUseOptionHoldings() {
                return useOptionHoldings;
            }
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$AssetHome;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "accountNumber", "", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AssetHome extends Options {
            public static final Parcelable.Creator<AssetHome> CREATOR = new Creator();
            private final String accountNumber;
            private final OptionChainLaunchMode optionChainLaunchMode;

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AssetHome> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetHome createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AssetHome(parcel.readString(), (OptionChainLaunchMode) parcel.readParcelable(AssetHome.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetHome[] newArray(int i) {
                    return new AssetHome[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AssetHome() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AssetHome copy$default(AssetHome assetHome, String str, OptionChainLaunchMode optionChainLaunchMode, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = assetHome.accountNumber;
                }
                if ((i & 2) != 0) {
                    optionChainLaunchMode = assetHome.optionChainLaunchMode;
                }
                return assetHome.copy(str, optionChainLaunchMode);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            public final AssetHome copy(String accountNumber, OptionChainLaunchMode optionChainLaunchMode) {
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                return new AssetHome(accountNumber, optionChainLaunchMode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetHome)) {
                    return false;
                }
                AssetHome assetHome = (AssetHome) other;
                return Intrinsics.areEqual(this.accountNumber, assetHome.accountNumber) && Intrinsics.areEqual(this.optionChainLaunchMode, assetHome.optionChainLaunchMode);
            }

            public int hashCode() {
                String str = this.accountNumber;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.optionChainLaunchMode.hashCode();
            }

            public String toString() {
                return "AssetHome(accountNumber=" + this.accountNumber + ", optionChainLaunchMode=" + this.optionChainLaunchMode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeParcelable(this.optionChainLaunchMode, flags);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return this.accountNumber;
            }

            public /* synthetic */ AssetHome(String str, OptionChainLaunchMode optionChainLaunchMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OptionChainLaunchMode.Normal.INSTANCE : optionChainLaunchMode);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssetHome(String str, OptionChainLaunchMode optionChainLaunchMode) {
                super(null);
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                this.accountNumber = str;
                this.optionChainLaunchMode = optionChainLaunchMode;
            }
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$Watchlist;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "accountNumber", "", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "postOptionsOnboardingExperiment", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getPostOptionsOnboardingExperiment", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Watchlist extends Options {
            public static final Parcelable.Creator<Watchlist> CREATOR = new Creator();
            private final String accountNumber;
            private final OptionChainLaunchMode optionChainLaunchMode;
            private final boolean postOptionsOnboardingExperiment;

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Watchlist> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Watchlist createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Watchlist(parcel.readString(), (OptionChainLaunchMode) parcel.readParcelable(Watchlist.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Watchlist[] newArray(int i) {
                    return new Watchlist[i];
                }
            }

            public static /* synthetic */ Watchlist copy$default(Watchlist watchlist, String str, OptionChainLaunchMode optionChainLaunchMode, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = watchlist.accountNumber;
                }
                if ((i & 2) != 0) {
                    optionChainLaunchMode = watchlist.optionChainLaunchMode;
                }
                if ((i & 4) != 0) {
                    z = watchlist.postOptionsOnboardingExperiment;
                }
                return watchlist.copy(str, optionChainLaunchMode, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getPostOptionsOnboardingExperiment() {
                return this.postOptionsOnboardingExperiment;
            }

            public final Watchlist copy(String accountNumber, OptionChainLaunchMode optionChainLaunchMode, boolean postOptionsOnboardingExperiment) {
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                return new Watchlist(accountNumber, optionChainLaunchMode, postOptionsOnboardingExperiment);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Watchlist)) {
                    return false;
                }
                Watchlist watchlist = (Watchlist) other;
                return Intrinsics.areEqual(this.accountNumber, watchlist.accountNumber) && Intrinsics.areEqual(this.optionChainLaunchMode, watchlist.optionChainLaunchMode) && this.postOptionsOnboardingExperiment == watchlist.postOptionsOnboardingExperiment;
            }

            public int hashCode() {
                String str = this.accountNumber;
                return ((((str == null ? 0 : str.hashCode()) * 31) + this.optionChainLaunchMode.hashCode()) * 31) + Boolean.hashCode(this.postOptionsOnboardingExperiment);
            }

            public String toString() {
                return "Watchlist(accountNumber=" + this.accountNumber + ", optionChainLaunchMode=" + this.optionChainLaunchMode + ", postOptionsOnboardingExperiment=" + this.postOptionsOnboardingExperiment + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeParcelable(this.optionChainLaunchMode, flags);
                dest.writeInt(this.postOptionsOnboardingExperiment ? 1 : 0);
            }

            public /* synthetic */ Watchlist(String str, OptionChainLaunchMode optionChainLaunchMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, optionChainLaunchMode, (i & 4) != 0 ? false : z);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            public final boolean getPostOptionsOnboardingExperiment() {
                return this.postOptionsOnboardingExperiment;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Watchlist(String str, OptionChainLaunchMode optionChainLaunchMode, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                this.accountNumber = str;
                this.optionChainLaunchMode = optionChainLaunchMode;
                this.postOptionsOnboardingExperiment = z;
            }
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$StrategyBuilder;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StrategyBuilder extends Options {
            public static final Parcelable.Creator<StrategyBuilder> CREATOR = new Creator();
            private final String accountNumber;

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<StrategyBuilder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrategyBuilder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StrategyBuilder(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrategyBuilder[] newArray(int i) {
                    return new StrategyBuilder[i];
                }
            }

            public static /* synthetic */ StrategyBuilder copy$default(StrategyBuilder strategyBuilder, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = strategyBuilder.accountNumber;
                }
                return strategyBuilder.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final StrategyBuilder copy(String accountNumber) {
                return new StrategyBuilder(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StrategyBuilder) && Intrinsics.areEqual(this.accountNumber, ((StrategyBuilder) other).accountNumber);
            }

            public int hashCode() {
                String str = this.accountNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "StrategyBuilder(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return this.accountNumber;
            }

            public StrategyBuilder(String str) {
                super(null);
                this.accountNumber = str;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return OptionChainLaunchMode.Normal.INSTANCE;
            }
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$SideBySideChainOnboarding;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "accountNumber", "", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "shouldClearTop", "", "getShouldClearTop$annotations", "()V", "getShouldClearTop", "()Z", "useOptionHoldings", "getUseOptionHoldings$annotations", "getUseOptionHoldings", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SideBySideChainOnboarding extends Options {
            public static final Parcelable.Creator<SideBySideChainOnboarding> CREATOR = new Creator();
            private final String accountNumber;
            private final OptionChainLaunchMode optionChainLaunchMode;
            private final boolean shouldClearTop;
            private final boolean useOptionHoldings;

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SideBySideChainOnboarding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SideBySideChainOnboarding createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SideBySideChainOnboarding(parcel.readString(), (OptionChainLaunchMode) parcel.readParcelable(SideBySideChainOnboarding.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SideBySideChainOnboarding[] newArray(int i) {
                    return new SideBySideChainOnboarding[i];
                }
            }

            public static /* synthetic */ SideBySideChainOnboarding copy$default(SideBySideChainOnboarding sideBySideChainOnboarding, String str, OptionChainLaunchMode optionChainLaunchMode, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sideBySideChainOnboarding.accountNumber;
                }
                if ((i & 2) != 0) {
                    optionChainLaunchMode = sideBySideChainOnboarding.optionChainLaunchMode;
                }
                return sideBySideChainOnboarding.copy(str, optionChainLaunchMode);
            }

            public static /* synthetic */ void getShouldClearTop$annotations() {
            }

            public static /* synthetic */ void getUseOptionHoldings$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            public final SideBySideChainOnboarding copy(String accountNumber, OptionChainLaunchMode optionChainLaunchMode) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                return new SideBySideChainOnboarding(accountNumber, optionChainLaunchMode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SideBySideChainOnboarding)) {
                    return false;
                }
                SideBySideChainOnboarding sideBySideChainOnboarding = (SideBySideChainOnboarding) other;
                return Intrinsics.areEqual(this.accountNumber, sideBySideChainOnboarding.accountNumber) && Intrinsics.areEqual(this.optionChainLaunchMode, sideBySideChainOnboarding.optionChainLaunchMode);
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.optionChainLaunchMode.hashCode();
            }

            public String toString() {
                return "SideBySideChainOnboarding(accountNumber=" + this.accountNumber + ", optionChainLaunchMode=" + this.optionChainLaunchMode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeParcelable(this.optionChainLaunchMode, flags);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SideBySideChainOnboarding(String accountNumber, OptionChainLaunchMode optionChainLaunchMode) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                this.accountNumber = accountNumber;
                this.optionChainLaunchMode = optionChainLaunchMode;
                this.shouldClearTop = true;
                this.useOptionHoldings = true;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
            public boolean getShouldClearTop() {
                return this.shouldClearTop;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public boolean getUseOptionHoldings() {
                return this.useOptionHoldings;
            }
        }

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options$SimulatedReturnPreTradeOnboarding;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "accountNumber", "", "optionChainLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionChainLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "shouldClearTop", "", "getShouldClearTop$annotations", "()V", "getShouldClearTop", "()Z", "useOptionHoldings", "getUseOptionHoldings$annotations", "getUseOptionHoldings", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SimulatedReturnPreTradeOnboarding extends Options {
            public static final Parcelable.Creator<SimulatedReturnPreTradeOnboarding> CREATOR = new Creator();
            private final String accountNumber;
            private final OptionChainLaunchMode optionChainLaunchMode;
            private final boolean shouldClearTop;
            private final boolean useOptionHoldings;

            /* compiled from: SearchSelectorLaunchMode.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SimulatedReturnPreTradeOnboarding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SimulatedReturnPreTradeOnboarding createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SimulatedReturnPreTradeOnboarding(parcel.readString(), (OptionChainLaunchMode) parcel.readParcelable(SimulatedReturnPreTradeOnboarding.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SimulatedReturnPreTradeOnboarding[] newArray(int i) {
                    return new SimulatedReturnPreTradeOnboarding[i];
                }
            }

            public static /* synthetic */ SimulatedReturnPreTradeOnboarding copy$default(SimulatedReturnPreTradeOnboarding simulatedReturnPreTradeOnboarding, String str, OptionChainLaunchMode optionChainLaunchMode, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = simulatedReturnPreTradeOnboarding.accountNumber;
                }
                if ((i & 2) != 0) {
                    optionChainLaunchMode = simulatedReturnPreTradeOnboarding.optionChainLaunchMode;
                }
                return simulatedReturnPreTradeOnboarding.copy(str, optionChainLaunchMode);
            }

            public static /* synthetic */ void getShouldClearTop$annotations() {
            }

            public static /* synthetic */ void getUseOptionHoldings$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            public final SimulatedReturnPreTradeOnboarding copy(String accountNumber, OptionChainLaunchMode optionChainLaunchMode) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                return new SimulatedReturnPreTradeOnboarding(accountNumber, optionChainLaunchMode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SimulatedReturnPreTradeOnboarding)) {
                    return false;
                }
                SimulatedReturnPreTradeOnboarding simulatedReturnPreTradeOnboarding = (SimulatedReturnPreTradeOnboarding) other;
                return Intrinsics.areEqual(this.accountNumber, simulatedReturnPreTradeOnboarding.accountNumber) && Intrinsics.areEqual(this.optionChainLaunchMode, simulatedReturnPreTradeOnboarding.optionChainLaunchMode);
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.optionChainLaunchMode.hashCode();
            }

            public String toString() {
                return "SimulatedReturnPreTradeOnboarding(accountNumber=" + this.accountNumber + ", optionChainLaunchMode=" + this.optionChainLaunchMode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeParcelable(this.optionChainLaunchMode, flags);
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public OptionChainLaunchMode getOptionChainLaunchMode() {
                return this.optionChainLaunchMode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SimulatedReturnPreTradeOnboarding(String accountNumber, OptionChainLaunchMode optionChainLaunchMode) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionChainLaunchMode, "optionChainLaunchMode");
                this.accountNumber = accountNumber;
                this.optionChainLaunchMode = optionChainLaunchMode;
                this.shouldClearTop = true;
                this.useOptionHoldings = true;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
            public boolean getShouldClearTop() {
                return this.shouldClearTop;
            }

            @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode.Options
            public boolean getUseOptionHoldings() {
                return this.useOptionHoldings;
            }
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$AdvancedChart;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "shouldClearTop", "", "shouldDismissSearchAfterSelection", "backToStockDetailPage", "showAlertTooltip", "<init>", "(ZZZZ)V", "getShouldClearTop", "()Z", "getShouldDismissSearchAfterSelection", "getBackToStockDetailPage", "getShowAlertTooltip", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "()V", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AdvancedChart extends SearchSelectorLaunchMode {
        public static final Parcelable.Creator<AdvancedChart> CREATOR = new Creator();
        private final boolean backToStockDetailPage;
        private final SearchQueryContext searchQueryContext;
        private final boolean shouldClearTop;
        private final boolean shouldDismissSearchAfterSelection;
        private final boolean showAlertTooltip;

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AdvancedChart> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdvancedChart createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdvancedChart(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdvancedChart[] newArray(int i) {
                return new AdvancedChart[i];
            }
        }

        public static /* synthetic */ AdvancedChart copy$default(AdvancedChart advancedChart, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = advancedChart.shouldClearTop;
            }
            if ((i & 2) != 0) {
                z2 = advancedChart.shouldDismissSearchAfterSelection;
            }
            if ((i & 4) != 0) {
                z3 = advancedChart.backToStockDetailPage;
            }
            if ((i & 8) != 0) {
                z4 = advancedChart.showAlertTooltip;
            }
            return advancedChart.copy(z, z2, z3, z4);
        }

        public static /* synthetic */ void getSearchQueryContext$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldClearTop() {
            return this.shouldClearTop;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldDismissSearchAfterSelection() {
            return this.shouldDismissSearchAfterSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getBackToStockDetailPage() {
            return this.backToStockDetailPage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowAlertTooltip() {
            return this.showAlertTooltip;
        }

        public final AdvancedChart copy(boolean shouldClearTop, boolean shouldDismissSearchAfterSelection, boolean backToStockDetailPage, boolean showAlertTooltip) {
            return new AdvancedChart(shouldClearTop, shouldDismissSearchAfterSelection, backToStockDetailPage, showAlertTooltip);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvancedChart)) {
                return false;
            }
            AdvancedChart advancedChart = (AdvancedChart) other;
            return this.shouldClearTop == advancedChart.shouldClearTop && this.shouldDismissSearchAfterSelection == advancedChart.shouldDismissSearchAfterSelection && this.backToStockDetailPage == advancedChart.backToStockDetailPage && this.showAlertTooltip == advancedChart.showAlertTooltip;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.shouldClearTop) * 31) + Boolean.hashCode(this.shouldDismissSearchAfterSelection)) * 31) + Boolean.hashCode(this.backToStockDetailPage)) * 31) + Boolean.hashCode(this.showAlertTooltip);
        }

        public String toString() {
            return "AdvancedChart(shouldClearTop=" + this.shouldClearTop + ", shouldDismissSearchAfterSelection=" + this.shouldDismissSearchAfterSelection + ", backToStockDetailPage=" + this.backToStockDetailPage + ", showAlertTooltip=" + this.showAlertTooltip + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.shouldClearTop ? 1 : 0);
            dest.writeInt(this.shouldDismissSearchAfterSelection ? 1 : 0);
            dest.writeInt(this.backToStockDetailPage ? 1 : 0);
            dest.writeInt(this.showAlertTooltip ? 1 : 0);
        }

        public /* synthetic */ AdvancedChart(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, z3, (i & 8) != 0 ? false : z4);
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldClearTop() {
            return this.shouldClearTop;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldDismissSearchAfterSelection() {
            return this.shouldDismissSearchAfterSelection;
        }

        public final boolean getBackToStockDetailPage() {
            return this.backToStockDetailPage;
        }

        public final boolean getShowAlertTooltip() {
            return this.showAlertTooltip;
        }

        public AdvancedChart(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.shouldClearTop = z;
            this.shouldDismissSearchAfterSelection = z2;
            this.backToStockDetailPage = z3;
            this.showAlertTooltip = z4;
            this.searchQueryContext = SearchQueryContext.DEFAULT;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return this.searchQueryContext;
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$TradingTrends;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "<init>", "()V", "shouldClearTop", "", "getShouldClearTop$annotations", "getShouldClearTop", "()Z", "shouldDismissSearchAfterSelection", "getShouldDismissSearchAfterSelection$annotations", "getShouldDismissSearchAfterSelection", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TradingTrends extends SearchSelectorLaunchMode {
        private static final boolean shouldClearTop = false;
        private static final boolean shouldDismissSearchAfterSelection = false;
        public static final TradingTrends INSTANCE = new TradingTrends();
        private static final SearchQueryContext searchQueryContext = SearchQueryContext.DEFAULT;
        public static final Parcelable.Creator<TradingTrends> CREATOR = new Creator();

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TradingTrends> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradingTrends createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TradingTrends.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradingTrends[] newArray(int i) {
                return new TradingTrends[i];
            }
        }

        public static /* synthetic */ void getSearchQueryContext$annotations() {
        }

        public static /* synthetic */ void getShouldClearTop$annotations() {
        }

        public static /* synthetic */ void getShouldDismissSearchAfterSelection$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TradingTrends);
        }

        public int hashCode() {
            return -2119312027;
        }

        public String toString() {
            return "TradingTrends";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TradingTrends() {
            super(null);
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldClearTop() {
            return shouldClearTop;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldDismissSearchAfterSelection() {
            return shouldDismissSearchAfterSelection;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return searchQueryContext;
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$CompanyFinancials;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "<init>", "()V", "shouldClearTop", "", "getShouldClearTop$annotations", "getShouldClearTop", "()Z", "shouldDismissSearchAfterSelection", "getShouldDismissSearchAfterSelection$annotations", "getShouldDismissSearchAfterSelection", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CompanyFinancials extends SearchSelectorLaunchMode {
        private static final boolean shouldClearTop = false;
        private static final boolean shouldDismissSearchAfterSelection = false;
        public static final CompanyFinancials INSTANCE = new CompanyFinancials();
        private static final SearchQueryContext searchQueryContext = SearchQueryContext.DEFAULT;
        public static final Parcelable.Creator<CompanyFinancials> CREATOR = new Creator();

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CompanyFinancials> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompanyFinancials createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompanyFinancials.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompanyFinancials[] newArray(int i) {
                return new CompanyFinancials[i];
            }
        }

        public static /* synthetic */ void getSearchQueryContext$annotations() {
        }

        public static /* synthetic */ void getShouldClearTop$annotations() {
        }

        public static /* synthetic */ void getShouldDismissSearchAfterSelection$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CompanyFinancials);
        }

        public int hashCode() {
            return 1491190997;
        }

        public String toString() {
            return "CompanyFinancials";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CompanyFinancials() {
            super(null);
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldClearTop() {
            return shouldClearTop;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldDismissSearchAfterSelection() {
            return shouldDismissSearchAfterSelection;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return searchQueryContext;
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B@\u0012)\b\u0002\u0010\u0002\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\"\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JD\u0010$\u001a\u00020\u00002)\b\u0002\u0010\u0002\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0016\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R8\u0010\u0002\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$BwAdvanceChart;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "onBwSearchItemClickedCallback", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "instrumentId", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "", "searchContentTypes", "", "Lcom/robinhood/models/api/search/SearchContentType;", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V", "getOnBwSearchItemClickedCallback$annotations", "()V", "getOnBwSearchItemClickedCallback", "()Lkotlin/jvm/functions/Function2;", "getSearchContentTypes", "()Ljava/util/List;", "shouldClearTop", "", "getShouldClearTop$annotations", "getShouldClearTop", "()Z", "shouldDismissSearchAfterSelection", "getShouldDismissSearchAfterSelection$annotations", "getShouldDismissSearchAfterSelection", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BwAdvanceChart extends SearchSelectorLaunchMode {
        public static final Parcelable.Creator<BwAdvanceChart> CREATOR = new Creator();
        private final Function2<UUID, BlackWidowAdvancedChartFragmentKey2, Unit> onBwSearchItemClickedCallback;
        private final List<SearchContentType> searchContentTypes;
        private final SearchQueryContext searchQueryContext;
        private final boolean shouldClearTop;
        private final boolean shouldDismissSearchAfterSelection;

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BwAdvanceChart> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final BwAdvanceChart createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SearchContentType.valueOf(parcel.readString()));
                }
                return new BwAdvanceChart(null, arrayList, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BwAdvanceChart[] newArray(int i) {
                return new BwAdvanceChart[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BwAdvanceChart copy$default(BwAdvanceChart bwAdvanceChart, Function2 function2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                function2 = bwAdvanceChart.onBwSearchItemClickedCallback;
            }
            if ((i & 2) != 0) {
                list = bwAdvanceChart.searchContentTypes;
            }
            return bwAdvanceChart.copy(function2, list);
        }

        public static /* synthetic */ void getOnBwSearchItemClickedCallback$annotations() {
        }

        public static /* synthetic */ void getSearchQueryContext$annotations() {
        }

        public static /* synthetic */ void getShouldClearTop$annotations() {
        }

        public static /* synthetic */ void getShouldDismissSearchAfterSelection$annotations() {
        }

        public final Function2<UUID, BlackWidowAdvancedChartFragmentKey2, Unit> component1() {
            return this.onBwSearchItemClickedCallback;
        }

        public final List<SearchContentType> component2() {
            return this.searchContentTypes;
        }

        public final BwAdvanceChart copy(Function2<? super UUID, ? super BlackWidowAdvancedChartFragmentKey2, Unit> onBwSearchItemClickedCallback, List<? extends SearchContentType> searchContentTypes) {
            Intrinsics.checkNotNullParameter(onBwSearchItemClickedCallback, "onBwSearchItemClickedCallback");
            Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
            return new BwAdvanceChart(onBwSearchItemClickedCallback, searchContentTypes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BwAdvanceChart)) {
                return false;
            }
            BwAdvanceChart bwAdvanceChart = (BwAdvanceChart) other;
            return Intrinsics.areEqual(this.onBwSearchItemClickedCallback, bwAdvanceChart.onBwSearchItemClickedCallback) && Intrinsics.areEqual(this.searchContentTypes, bwAdvanceChart.searchContentTypes);
        }

        public int hashCode() {
            return (this.onBwSearchItemClickedCallback.hashCode() * 31) + this.searchContentTypes.hashCode();
        }

        public String toString() {
            return "BwAdvanceChart(onBwSearchItemClickedCallback=" + this.onBwSearchItemClickedCallback + ", searchContentTypes=" + this.searchContentTypes + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<SearchContentType> list = this.searchContentTypes;
            dest.writeInt(list.size());
            Iterator<SearchContentType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        public final Function2<UUID, BlackWidowAdvancedChartFragmentKey2, Unit> getOnBwSearchItemClickedCallback() {
            return this.onBwSearchItemClickedCallback;
        }

        public /* synthetic */ BwAdvanceChart(Function2 function2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Function2() { // from class: com.robinhood.android.search.contracts.SearchSelectorLaunchMode$BwAdvanceChart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchSelectorLaunchMode.BwAdvanceChart._init_$lambda$0((UUID) obj, (BlackWidowAdvancedChartFragmentKey2) obj2);
                }
            } : function2, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2) {
            Intrinsics.checkNotNullParameter(uuid, "<unused var>");
            Intrinsics.checkNotNullParameter(blackWidowAdvancedChartFragmentKey2, "<unused var>");
            return Unit.INSTANCE;
        }

        public final List<SearchContentType> getSearchContentTypes() {
            return this.searchContentTypes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BwAdvanceChart(Function2<? super UUID, ? super BlackWidowAdvancedChartFragmentKey2, Unit> onBwSearchItemClickedCallback, List<? extends SearchContentType> searchContentTypes) {
            super(null);
            Intrinsics.checkNotNullParameter(onBwSearchItemClickedCallback, "onBwSearchItemClickedCallback");
            Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
            this.onBwSearchItemClickedCallback = onBwSearchItemClickedCallback;
            this.searchContentTypes = searchContentTypes;
            this.searchQueryContext = SearchQueryContext.DEFAULT;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldClearTop() {
            return this.shouldClearTop;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldDismissSearchAfterSelection() {
            return this.shouldDismissSearchAfterSelection;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return this.searchQueryContext;
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Copilot;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "<init>", "()V", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Copilot extends SearchSelectorLaunchMode {
        public static final Copilot INSTANCE = new Copilot();
        public static final Parcelable.Creator<Copilot> CREATOR = new Creator();

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Copilot> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Copilot createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Copilot.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Copilot[] newArray(int i) {
                return new Copilot[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Copilot);
        }

        public int hashCode() {
            return -1875050822;
        }

        public String toString() {
            return "Copilot";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Copilot() {
            super(null);
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return SearchQueryContext.CORTEX;
        }
    }

    /* compiled from: SearchSelectorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Ladder;", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "searchContentTypes", "", "Lcom/robinhood/models/api/search/SearchContentType;", "<init>", "(Ljava/util/List;)V", "getSearchContentTypes", "()Ljava/util/List;", "shouldClearTop", "", "getShouldClearTop$annotations", "()V", "getShouldClearTop", "()Z", "searchQueryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "getSearchQueryContext$annotations", "getSearchQueryContext", "()Lcom/robinhood/models/api/search/SearchQueryContext;", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ladder extends SearchSelectorLaunchMode {
        public static final Parcelable.Creator<Ladder> CREATOR = new Creator();
        private final List<SearchContentType> searchContentTypes;
        private final SearchQueryContext searchQueryContext;
        private final boolean shouldClearTop;

        /* compiled from: SearchSelectorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Ladder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ladder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SearchContentType.valueOf(parcel.readString()));
                }
                return new Ladder(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ladder[] newArray(int i) {
                return new Ladder[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ladder copy$default(Ladder ladder, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ladder.searchContentTypes;
            }
            return ladder.copy(list);
        }

        public static /* synthetic */ void getSearchQueryContext$annotations() {
        }

        public static /* synthetic */ void getShouldClearTop$annotations() {
        }

        public final List<SearchContentType> component1() {
            return this.searchContentTypes;
        }

        public final Ladder copy(List<? extends SearchContentType> searchContentTypes) {
            Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
            return new Ladder(searchContentTypes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ladder) && Intrinsics.areEqual(this.searchContentTypes, ((Ladder) other).searchContentTypes);
        }

        public int hashCode() {
            return this.searchContentTypes.hashCode();
        }

        public String toString() {
            return "Ladder(searchContentTypes=" + this.searchContentTypes + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<SearchContentType> list = this.searchContentTypes;
            dest.writeInt(list.size());
            Iterator<SearchContentType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ladder(List<? extends SearchContentType> searchContentTypes) {
            super(null);
            Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
            this.searchContentTypes = searchContentTypes;
            this.shouldClearTop = true;
            this.searchQueryContext = SearchQueryContext.DEFAULT;
        }

        public final List<SearchContentType> getSearchContentTypes() {
            return this.searchContentTypes;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public boolean getShouldClearTop() {
            return this.shouldClearTop;
        }

        @Override // com.robinhood.android.search.contracts.SearchSelectorLaunchMode
        public SearchQueryContext getSearchQueryContext() {
            return this.searchQueryContext;
        }
    }
}
