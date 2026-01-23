package com.robinhood.shared.crypto.movers;

import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentPreviewCard.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "deltaText", "getDeltaText", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "Loading", "Loaded", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState$Loaded;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState$Loading;", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardState, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class InstrumentPreviewCard4 {
    public static final int $stable = 0;
    private final String deltaText;
    private final String price;
    private final ApiCryptoTradingOptions3 style;
    private final String subtitle;
    private final String title;

    public /* synthetic */ InstrumentPreviewCard4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InstrumentPreviewCard4() {
        this.title = "";
        this.subtitle = "";
        this.price = "";
        this.deltaText = "";
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getPrice() {
        return this.price;
    }

    public String getDeltaText() {
        return this.deltaText;
    }

    public ApiCryptoTradingOptions3 getStyle() {
        return this.style;
    }

    /* compiled from: InstrumentPreviewCard.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState$Loading;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "<init>", "(Lcom/robinhood/models/api/CryptoTradingOptionStyle;)V", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardState$Loading, reason: from toString */
    public static final /* data */ class Loading extends InstrumentPreviewCard4 {
        public static final int $stable = 0;
        private final ApiCryptoTradingOptions3 style;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, ApiCryptoTradingOptions3 apiCryptoTradingOptions3, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoTradingOptions3 = loading.style;
            }
            return loading.copy(apiCryptoTradingOptions3);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTradingOptions3 getStyle() {
            return this.style;
        }

        public final Loading copy(ApiCryptoTradingOptions3 style) {
            return new Loading(style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.style == ((Loading) other).style;
        }

        public int hashCode() {
            ApiCryptoTradingOptions3 apiCryptoTradingOptions3 = this.style;
            if (apiCryptoTradingOptions3 == null) {
                return 0;
            }
            return apiCryptoTradingOptions3.hashCode();
        }

        public String toString() {
            return "Loading(style=" + this.style + ")";
        }

        public /* synthetic */ Loading(ApiCryptoTradingOptions3 apiCryptoTradingOptions3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiCryptoTradingOptions3);
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public ApiCryptoTradingOptions3 getStyle() {
            return this.style;
        }

        public Loading(ApiCryptoTradingOptions3 apiCryptoTradingOptions3) {
            super(null);
            this.style = apiCryptoTradingOptions3;
        }
    }

    /* compiled from: InstrumentPreviewCard.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState$Loaded;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "chartLines", "", "Lcom/robinhood/android/charts/models/db/ChartLine;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "deltaText", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "subtitle", "title", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/CryptoTradingOptionStyle;)V", "getChartLines", "()Ljava/util/List;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getDeltaText", "()Ljava/lang/String;", "getPrice", "getSubtitle", "getTitle", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "equals", "", "other", "", "hashCode", "", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardState$Loaded */
    public static class Loaded extends InstrumentPreviewCard4 {
        public static final int $stable = 8;
        private final List<ChartLine> chartLines;
        private final String deltaText;
        private final Direction direction;
        private final String price;
        private final ApiCryptoTradingOptions3 style;
        private final String subtitle;
        private final String title;

        public /* synthetic */ Loaded(List list, Direction direction, String str, String str2, String str3, String str4, ApiCryptoTradingOptions3 apiCryptoTradingOptions3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, direction, str, str2, str3, str4, (i & 64) != 0 ? null : apiCryptoTradingOptions3);
        }

        public List<ChartLine> getChartLines() {
            return this.chartLines;
        }

        public Direction getDirection() {
            return this.direction;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getDeltaText() {
            return this.deltaText;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getPrice() {
            return this.price;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public ApiCryptoTradingOptions3 getStyle() {
            return this.style;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(List<ChartLine> list, Direction direction, String deltaText, String price, String subtitle, String title, ApiCryptoTradingOptions3 apiCryptoTradingOptions3) {
            super(null);
            Intrinsics.checkNotNullParameter(deltaText, "deltaText");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(title, "title");
            this.chartLines = list;
            this.direction = direction;
            this.deltaText = deltaText;
            this.price = price;
            this.subtitle = subtitle;
            this.title = title;
            this.style = apiCryptoTradingOptions3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(getChartLines(), loaded.getChartLines()) && getDirection() == loaded.getDirection() && Intrinsics.areEqual(getDeltaText(), loaded.getDeltaText()) && Intrinsics.areEqual(getPrice(), loaded.getPrice()) && Intrinsics.areEqual(getSubtitle(), loaded.getSubtitle()) && Intrinsics.areEqual(getTitle(), loaded.getTitle());
        }

        public int hashCode() {
            List<ChartLine> chartLines = getChartLines();
            int iHashCode = (chartLines != null ? chartLines.hashCode() : 0) * 31;
            Direction direction = getDirection();
            return ((((((((iHashCode + (direction != null ? direction.hashCode() : 0)) * 31) + getDeltaText().hashCode()) * 31) + getPrice().hashCode()) * 31) + getSubtitle().hashCode()) * 31) + getTitle().hashCode();
        }
    }
}
