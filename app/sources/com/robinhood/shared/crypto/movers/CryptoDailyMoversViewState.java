package com.robinhood.shared.crypto.movers;

import android.net.Uri;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDailyMoversDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversViewState;", "", "title", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "hideEverything", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "dailyMoversBottomSheetState", "Lcom/robinhood/shared/crypto/movers/CryptoHomeDailyMoversBottomSheetState;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Lcom/robinhood/shared/crypto/movers/CryptoHomeDailyMoversBottomSheetState;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getHideEverything", "()Z", "getDisclosure", "getDailyMoversBottomSheetState", "()Lcom/robinhood/shared/crypto/movers/CryptoHomeDailyMoversBottomSheetState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "CryptoCard", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoDailyMoversViewState {
    public static final int $stable = 0;
    private final CryptoHomeDailyMoversBottomSheetState dailyMoversBottomSheetState;
    private final String disclosure;
    private final boolean hideEverything;
    private final ImmutableList<InstrumentPreviewCard4> items;
    private final String title;

    public static /* synthetic */ CryptoDailyMoversViewState copy$default(CryptoDailyMoversViewState cryptoDailyMoversViewState, String str, ImmutableList immutableList, boolean z, String str2, CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoDailyMoversViewState.title;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoDailyMoversViewState.items;
        }
        if ((i & 4) != 0) {
            z = cryptoDailyMoversViewState.hideEverything;
        }
        if ((i & 8) != 0) {
            str2 = cryptoDailyMoversViewState.disclosure;
        }
        if ((i & 16) != 0) {
            cryptoHomeDailyMoversBottomSheetState = cryptoDailyMoversViewState.dailyMoversBottomSheetState;
        }
        CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState2 = cryptoHomeDailyMoversBottomSheetState;
        boolean z2 = z;
        return cryptoDailyMoversViewState.copy(str, immutableList, z2, str2, cryptoHomeDailyMoversBottomSheetState2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<InstrumentPreviewCard4> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHideEverything() {
        return this.hideEverything;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoHomeDailyMoversBottomSheetState getDailyMoversBottomSheetState() {
        return this.dailyMoversBottomSheetState;
    }

    public final CryptoDailyMoversViewState copy(String title, ImmutableList<? extends InstrumentPreviewCard4> items, boolean hideEverything, String disclosure, CryptoHomeDailyMoversBottomSheetState dailyMoversBottomSheetState) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CryptoDailyMoversViewState(title, items, hideEverything, disclosure, dailyMoversBottomSheetState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDailyMoversViewState)) {
            return false;
        }
        CryptoDailyMoversViewState cryptoDailyMoversViewState = (CryptoDailyMoversViewState) other;
        return Intrinsics.areEqual(this.title, cryptoDailyMoversViewState.title) && Intrinsics.areEqual(this.items, cryptoDailyMoversViewState.items) && this.hideEverything == cryptoDailyMoversViewState.hideEverything && Intrinsics.areEqual(this.disclosure, cryptoDailyMoversViewState.disclosure) && Intrinsics.areEqual(this.dailyMoversBottomSheetState, cryptoDailyMoversViewState.dailyMoversBottomSheetState);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.items.hashCode()) * 31) + Boolean.hashCode(this.hideEverything)) * 31;
        String str2 = this.disclosure;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState = this.dailyMoversBottomSheetState;
        return iHashCode2 + (cryptoHomeDailyMoversBottomSheetState != null ? cryptoHomeDailyMoversBottomSheetState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDailyMoversViewState(title=" + this.title + ", items=" + this.items + ", hideEverything=" + this.hideEverything + ", disclosure=" + this.disclosure + ", dailyMoversBottomSheetState=" + this.dailyMoversBottomSheetState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDailyMoversViewState(String str, ImmutableList<? extends InstrumentPreviewCard4> items, boolean z, String str2, CryptoHomeDailyMoversBottomSheetState cryptoHomeDailyMoversBottomSheetState) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = str;
        this.items = items;
        this.hideEverything = z;
        this.disclosure = str2;
        this.dailyMoversBottomSheetState = cryptoHomeDailyMoversBottomSheetState;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<InstrumentPreviewCard4> getItems() {
        return this.items;
    }

    public final boolean getHideEverything() {
        return this.hideEverything;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final CryptoHomeDailyMoversBottomSheetState getDailyMoversBottomSheetState() {
        return this.dailyMoversBottomSheetState;
    }

    /* compiled from: CryptoDailyMoversDuxo.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jv\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversViewState$CryptoCard;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState$Loaded;", "deeplink", "", "shouldClearTopOnDeeplinkHandling", "", "title", "subtitle", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "deltaText", "chartLines", "", "Lcom/robinhood/android/charts/models/db/ChartLine;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/models/api/CryptoTradingOptionStyle;)V", "getShouldClearTopOnDeeplinkHandling", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrice", "getDeltaText", "getChartLines", "()Ljava/util/List;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getStyle", "()Lcom/robinhood/models/api/CryptoTradingOptionStyle;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/models/api/CryptoTradingOptionStyle;)Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversViewState$CryptoCard;", "equals", "other", "", "hashCode", "", "toString", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class CryptoCard extends InstrumentPreviewCard4.Loaded {
        public static final int $stable = 8;
        private final List<ChartLine> chartLines;
        private final String deeplink;
        private final String deltaText;
        private final Direction direction;
        private final String price;
        private final Boolean shouldClearTopOnDeeplinkHandling;
        private final ApiCryptoTradingOptions3 style;
        private final String subtitle;
        private final String title;

        /* renamed from: component1, reason: from getter */
        private final String getDeeplink() {
            return this.deeplink;
        }

        public static /* synthetic */ CryptoCard copy$default(CryptoCard cryptoCard, String str, Boolean bool, String str2, String str3, String str4, String str5, List list, Direction direction, ApiCryptoTradingOptions3 apiCryptoTradingOptions3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cryptoCard.deeplink;
            }
            if ((i & 2) != 0) {
                bool = cryptoCard.shouldClearTopOnDeeplinkHandling;
            }
            if ((i & 4) != 0) {
                str2 = cryptoCard.title;
            }
            if ((i & 8) != 0) {
                str3 = cryptoCard.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = cryptoCard.price;
            }
            if ((i & 32) != 0) {
                str5 = cryptoCard.deltaText;
            }
            if ((i & 64) != 0) {
                list = cryptoCard.chartLines;
            }
            if ((i & 128) != 0) {
                direction = cryptoCard.direction;
            }
            if ((i & 256) != 0) {
                apiCryptoTradingOptions3 = cryptoCard.style;
            }
            Direction direction2 = direction;
            ApiCryptoTradingOptions3 apiCryptoTradingOptions32 = apiCryptoTradingOptions3;
            String str6 = str5;
            List list2 = list;
            String str7 = str4;
            String str8 = str2;
            return cryptoCard.copy(str, bool, str8, str3, str7, str6, list2, direction2, apiCryptoTradingOptions32);
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getShouldClearTopOnDeeplinkHandling() {
            return this.shouldClearTopOnDeeplinkHandling;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDeltaText() {
            return this.deltaText;
        }

        public final List<ChartLine> component7() {
            return this.chartLines;
        }

        /* renamed from: component8, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component9, reason: from getter */
        public final ApiCryptoTradingOptions3 getStyle() {
            return this.style;
        }

        public final CryptoCard copy(String deeplink, Boolean shouldClearTopOnDeeplinkHandling, String title, String subtitle, String price, String deltaText, List<ChartLine> chartLines, Direction direction, ApiCryptoTradingOptions3 style) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(deltaText, "deltaText");
            return new CryptoCard(deeplink, shouldClearTopOnDeeplinkHandling, title, subtitle, price, deltaText, chartLines, direction, style);
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoCard)) {
                return false;
            }
            CryptoCard cryptoCard = (CryptoCard) other;
            return Intrinsics.areEqual(this.deeplink, cryptoCard.deeplink) && Intrinsics.areEqual(this.shouldClearTopOnDeeplinkHandling, cryptoCard.shouldClearTopOnDeeplinkHandling) && Intrinsics.areEqual(this.title, cryptoCard.title) && Intrinsics.areEqual(this.subtitle, cryptoCard.subtitle) && Intrinsics.areEqual(this.price, cryptoCard.price) && Intrinsics.areEqual(this.deltaText, cryptoCard.deltaText) && Intrinsics.areEqual(this.chartLines, cryptoCard.chartLines) && this.direction == cryptoCard.direction && this.style == cryptoCard.style;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded
        public int hashCode() {
            int iHashCode = this.deeplink.hashCode() * 31;
            Boolean bool = this.shouldClearTopOnDeeplinkHandling;
            int iHashCode2 = (((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.price.hashCode()) * 31) + this.deltaText.hashCode()) * 31;
            List<ChartLine> list = this.chartLines;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Direction direction = this.direction;
            int iHashCode4 = (iHashCode3 + (direction == null ? 0 : direction.hashCode())) * 31;
            ApiCryptoTradingOptions3 apiCryptoTradingOptions3 = this.style;
            return iHashCode4 + (apiCryptoTradingOptions3 != null ? apiCryptoTradingOptions3.hashCode() : 0);
        }

        public String toString() {
            return "CryptoCard(deeplink=" + this.deeplink + ", shouldClearTopOnDeeplinkHandling=" + this.shouldClearTopOnDeeplinkHandling + ", title=" + this.title + ", subtitle=" + this.subtitle + ", price=" + this.price + ", deltaText=" + this.deltaText + ", chartLines=" + this.chartLines + ", direction=" + this.direction + ", style=" + this.style + ")";
        }

        public /* synthetic */ CryptoCard(String str, Boolean bool, String str2, String str3, String str4, String str5, List list, Direction direction, ApiCryptoTradingOptions3 apiCryptoTradingOptions3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, str3, str4, str5, list, direction, (i & 256) != 0 ? null : apiCryptoTradingOptions3);
        }

        public final Boolean getShouldClearTopOnDeeplinkHandling() {
            return this.shouldClearTopOnDeeplinkHandling;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded, com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded, com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded, com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getPrice() {
            return this.price;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded, com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public String getDeltaText() {
            return this.deltaText;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded
        public List<ChartLine> getChartLines() {
            return this.chartLines;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded
        public Direction getDirection() {
            return this.direction;
        }

        @Override // com.robinhood.shared.crypto.movers.InstrumentPreviewCard4.Loaded, com.robinhood.shared.crypto.movers.InstrumentPreviewCard4
        public ApiCryptoTradingOptions3 getStyle() {
            return this.style;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoCard(String deeplink, Boolean bool, String title, String subtitle, String price, String deltaText, List<ChartLine> list, Direction direction, ApiCryptoTradingOptions3 apiCryptoTradingOptions3) {
            super(list, direction, deltaText, price, subtitle, title, apiCryptoTradingOptions3);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(deltaText, "deltaText");
            this.deeplink = deeplink;
            this.shouldClearTopOnDeeplinkHandling = bool;
            this.title = title;
            this.subtitle = subtitle;
            this.price = price;
            this.deltaText = deltaText;
            this.chartLines = list;
            this.direction = direction;
            this.style = apiCryptoTradingOptions3;
        }

        public final Uri getDeeplinkUri() {
            return Uri.parse(this.deeplink);
        }
    }
}
