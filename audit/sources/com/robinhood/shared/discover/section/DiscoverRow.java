package com.robinhood.shared.discover.section;

import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoverRow.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverRow;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "Lcom/robinhood/shared/discover/section/DiscoverRow$Loading;", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class DiscoverRow {
    public static final int $stable = 0;

    public /* synthetic */ DiscoverRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DiscoverRow() {
    }

    /* compiled from: DiscoverRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverRow$Loading;", "Lcom/robinhood/shared/discover/section/DiscoverRow;", "<init>", "()V", "defaultLoadingState", "Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "getDefaultLoadingState", "()Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends DiscoverRow {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -92457147;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }

        public final Loaded getDefaultLoadingState() {
            return new Loaded(null, null, "", false, "", "--------", "--------", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null);
        }
    }

    /* compiled from: DiscoverRow.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u0080\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "Lcom/robinhood/shared/discover/section/DiscoverRow;", "chartDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "chartLines", "", "Lcom/robinhood/android/charts/models/db/ChartLine;", "deeplink", "", "isCrypto", "", "logoUrl", "metaText", "primaryText", "secondaryMetaText", "secondaryText", "shouldClearTopOnDeeplinkHandling", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getChartDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getChartLines", "()Ljava/util/List;", "getDeeplink", "()Ljava/lang/String;", "()Z", "getLogoUrl", "getMetaText", "getPrimaryText", "getSecondaryMetaText", "getSecondaryText", "getShouldClearTopOnDeeplinkHandling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "equals", "other", "", "hashCode", "", "toString", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends DiscoverRow {
        public static final int $stable = 8;
        private final Direction chartDirection;
        private final List<ChartLine> chartLines;
        private final String deeplink;
        private final boolean isCrypto;
        private final String logoUrl;
        private final String metaText;
        private final String primaryText;
        private final String secondaryMetaText;
        private final String secondaryText;
        private final Boolean shouldClearTopOnDeeplinkHandling;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Direction direction, List list, String str, boolean z, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                direction = loaded.chartDirection;
            }
            if ((i & 2) != 0) {
                list = loaded.chartLines;
            }
            if ((i & 4) != 0) {
                str = loaded.deeplink;
            }
            if ((i & 8) != 0) {
                z = loaded.isCrypto;
            }
            if ((i & 16) != 0) {
                str2 = loaded.logoUrl;
            }
            if ((i & 32) != 0) {
                str3 = loaded.metaText;
            }
            if ((i & 64) != 0) {
                str4 = loaded.primaryText;
            }
            if ((i & 128) != 0) {
                str5 = loaded.secondaryMetaText;
            }
            if ((i & 256) != 0) {
                str6 = loaded.secondaryText;
            }
            if ((i & 512) != 0) {
                bool = loaded.shouldClearTopOnDeeplinkHandling;
            }
            String str7 = str6;
            Boolean bool2 = bool;
            String str8 = str4;
            String str9 = str5;
            String str10 = str2;
            String str11 = str3;
            return loaded.copy(direction, list, str, z, str10, str11, str8, str9, str7, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Direction getChartDirection() {
            return this.chartDirection;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getShouldClearTopOnDeeplinkHandling() {
            return this.shouldClearTopOnDeeplinkHandling;
        }

        public final List<ChartLine> component2() {
            return this.chartLines;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMetaText() {
            return this.metaText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSecondaryMetaText() {
            return this.secondaryMetaText;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final Loaded copy(Direction chartDirection, List<ChartLine> chartLines, String deeplink, boolean isCrypto, String logoUrl, String metaText, String primaryText, String secondaryMetaText, String secondaryText, Boolean shouldClearTopOnDeeplinkHandling) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(metaText, "metaText");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryMetaText, "secondaryMetaText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new Loaded(chartDirection, chartLines, deeplink, isCrypto, logoUrl, metaText, primaryText, secondaryMetaText, secondaryText, shouldClearTopOnDeeplinkHandling);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.chartDirection == loaded.chartDirection && Intrinsics.areEqual(this.chartLines, loaded.chartLines) && Intrinsics.areEqual(this.deeplink, loaded.deeplink) && this.isCrypto == loaded.isCrypto && Intrinsics.areEqual(this.logoUrl, loaded.logoUrl) && Intrinsics.areEqual(this.metaText, loaded.metaText) && Intrinsics.areEqual(this.primaryText, loaded.primaryText) && Intrinsics.areEqual(this.secondaryMetaText, loaded.secondaryMetaText) && Intrinsics.areEqual(this.secondaryText, loaded.secondaryText) && Intrinsics.areEqual(this.shouldClearTopOnDeeplinkHandling, loaded.shouldClearTopOnDeeplinkHandling);
        }

        public int hashCode() {
            Direction direction = this.chartDirection;
            int iHashCode = (direction == null ? 0 : direction.hashCode()) * 31;
            List<ChartLine> list = this.chartLines;
            int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.deeplink.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31;
            String str = this.logoUrl;
            int iHashCode3 = (((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.metaText.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryMetaText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31;
            Boolean bool = this.shouldClearTopOnDeeplinkHandling;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(chartDirection=" + this.chartDirection + ", chartLines=" + this.chartLines + ", deeplink=" + this.deeplink + ", isCrypto=" + this.isCrypto + ", logoUrl=" + this.logoUrl + ", metaText=" + this.metaText + ", primaryText=" + this.primaryText + ", secondaryMetaText=" + this.secondaryMetaText + ", secondaryText=" + this.secondaryText + ", shouldClearTopOnDeeplinkHandling=" + this.shouldClearTopOnDeeplinkHandling + ")";
        }

        public final Direction getChartDirection() {
            return this.chartDirection;
        }

        public final List<ChartLine> getChartLines() {
            return this.chartLines;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean isCrypto() {
            return this.isCrypto;
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getMetaText() {
            return this.metaText;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryMetaText() {
            return this.secondaryMetaText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final Boolean getShouldClearTopOnDeeplinkHandling() {
            return this.shouldClearTopOnDeeplinkHandling;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Direction direction, List<ChartLine> list, String deeplink, boolean z, String str, String metaText, String primaryText, String secondaryMetaText, String secondaryText, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(metaText, "metaText");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryMetaText, "secondaryMetaText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.chartDirection = direction;
            this.chartLines = list;
            this.deeplink = deeplink;
            this.isCrypto = z;
            this.logoUrl = str;
            this.metaText = metaText;
            this.primaryText = primaryText;
            this.secondaryMetaText = secondaryMetaText;
            this.secondaryText = secondaryText;
            this.shouldClearTopOnDeeplinkHandling = bool;
        }
    }
}
