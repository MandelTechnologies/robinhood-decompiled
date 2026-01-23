package com.robinhood.shared.trade.crypto.p397ui.coinlist;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTradingCoinListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState;", "", "<init>", "()V", "infoSheetContent", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "getInfoSheetContent", "()Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "Loading", "Loaded", "InfoSheetContent", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoTradingCoinListViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTradingCoinListViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InfoSheetContent getInfoSheetContent();

    private CryptoTradingCoinListViewState() {
    }

    /* compiled from: CryptoTradingCoinListViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState;", "infoSheetContent", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;)V", "getInfoSheetContent", "()Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoTradingCoinListViewState {
        public static final int $stable = StringResource.$stable;
        private final InfoSheetContent infoSheetContent;

        public static /* synthetic */ Loading copy$default(Loading loading, InfoSheetContent infoSheetContent, int i, Object obj) {
            if ((i & 1) != 0) {
                infoSheetContent = loading.infoSheetContent;
            }
            return loading.copy(infoSheetContent);
        }

        /* renamed from: component1, reason: from getter */
        public final InfoSheetContent getInfoSheetContent() {
            return this.infoSheetContent;
        }

        public final Loading copy(InfoSheetContent infoSheetContent) {
            Intrinsics.checkNotNullParameter(infoSheetContent, "infoSheetContent");
            return new Loading(infoSheetContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.infoSheetContent, ((Loading) other).infoSheetContent);
        }

        public int hashCode() {
            return this.infoSheetContent.hashCode();
        }

        public String toString() {
            return "Loading(infoSheetContent=" + this.infoSheetContent + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.coinlist.CryptoTradingCoinListViewState
        public InfoSheetContent getInfoSheetContent() {
            return this.infoSheetContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(InfoSheetContent infoSheetContent) {
            super(null);
            Intrinsics.checkNotNullParameter(infoSheetContent, "infoSheetContent");
            this.infoSheetContent = infoSheetContent;
        }
    }

    /* compiled from: CryptoTradingCoinListViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState;", "query", "", "displayItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "infoSheetContent", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;)V", "getQuery", "()Ljava/lang/String;", "getDisplayItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getInfoSheetContent", "()Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoTradingCoinListViewState {
        public static final int $stable = 8;
        private final ImmutableList<CryptoTradingOptions.TradingOptionItem> displayItems;
        private final InfoSheetContent infoSheetContent;
        private final String query;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList immutableList, InfoSheetContent infoSheetContent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.query;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.displayItems;
            }
            if ((i & 4) != 0) {
                infoSheetContent = loaded.infoSheetContent;
            }
            return loaded.copy(str, immutableList, infoSheetContent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public final ImmutableList<CryptoTradingOptions.TradingOptionItem> component2() {
            return this.displayItems;
        }

        /* renamed from: component3, reason: from getter */
        public final InfoSheetContent getInfoSheetContent() {
            return this.infoSheetContent;
        }

        public final Loaded copy(String query, ImmutableList<CryptoTradingOptions.TradingOptionItem> displayItems, InfoSheetContent infoSheetContent) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(displayItems, "displayItems");
            Intrinsics.checkNotNullParameter(infoSheetContent, "infoSheetContent");
            return new Loaded(query, displayItems, infoSheetContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.query, loaded.query) && Intrinsics.areEqual(this.displayItems, loaded.displayItems) && Intrinsics.areEqual(this.infoSheetContent, loaded.infoSheetContent);
        }

        public int hashCode() {
            return (((this.query.hashCode() * 31) + this.displayItems.hashCode()) * 31) + this.infoSheetContent.hashCode();
        }

        public String toString() {
            return "Loaded(query=" + this.query + ", displayItems=" + this.displayItems + ", infoSheetContent=" + this.infoSheetContent + ")";
        }

        public final String getQuery() {
            return this.query;
        }

        public final ImmutableList<CryptoTradingOptions.TradingOptionItem> getDisplayItems() {
            return this.displayItems;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.coinlist.CryptoTradingCoinListViewState
        public InfoSheetContent getInfoSheetContent() {
            return this.infoSheetContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String query, ImmutableList<CryptoTradingOptions.TradingOptionItem> displayItems, InfoSheetContent infoSheetContent) {
            super(null);
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(displayItems, "displayItems");
            Intrinsics.checkNotNullParameter(infoSheetContent, "infoSheetContent");
            this.query = query;
            this.displayItems = displayItems;
            this.infoSheetContent = infoSheetContent;
        }
    }

    /* compiled from: CryptoTradingCoinListViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "ctaText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "getCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoSheetContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource body;
        private final StringResource ctaText;
        private final StringResource title;

        public static /* synthetic */ InfoSheetContent copy$default(InfoSheetContent infoSheetContent, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = infoSheetContent.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = infoSheetContent.body;
            }
            if ((i & 4) != 0) {
                stringResource3 = infoSheetContent.ctaText;
            }
            return infoSheetContent.copy(stringResource, stringResource2, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getCtaText() {
            return this.ctaText;
        }

        public final InfoSheetContent copy(StringResource title, StringResource body, StringResource ctaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new InfoSheetContent(title, body, ctaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoSheetContent)) {
                return false;
            }
            InfoSheetContent infoSheetContent = (InfoSheetContent) other;
            return Intrinsics.areEqual(this.title, infoSheetContent.title) && Intrinsics.areEqual(this.body, infoSheetContent.body) && Intrinsics.areEqual(this.ctaText, infoSheetContent.ctaText);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.ctaText.hashCode();
        }

        public String toString() {
            return "InfoSheetContent(title=" + this.title + ", body=" + this.body + ", ctaText=" + this.ctaText + ")";
        }

        public InfoSheetContent(StringResource title, StringResource body, StringResource ctaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.title = title;
            this.body = body;
            this.ctaText = ctaText;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getBody() {
            return this.body;
        }

        public final StringResource getCtaText() {
            return this.ctaText;
        }
    }
}
