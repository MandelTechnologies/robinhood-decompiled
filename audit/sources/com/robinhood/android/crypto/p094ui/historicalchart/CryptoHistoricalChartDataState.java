package com.robinhood.android.crypto.p094ui.historicalchart;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.crypto.p314db.CryptoHistoricalChart;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.PriceChartData;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: CryptoHistoricalChartDataState.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010>H\u0002J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\rHÂ\u0003J\t\u0010q\u001a\u00020\u000fHÂ\u0003JW\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010s\u001a\u00020\u000f2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020MHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b(\u0010#\u001a\u0004\b)\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b,\u0010#\u001a\u0004\b-\u0010%R&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001a\u00101\u001a\u0002028@X\u0081\u0004¢\u0006\f\u0012\u0004\b3\u0010#\u001a\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010#\u001a\u0004\b8\u0010%R\u001a\u00109\u001a\u00020\u000f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010#\u001a\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>8@X\u0081\u0004¢\u0006\f\u0012\u0004\b?\u0010#\u001a\u0004\b@\u0010AR \u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u001f8@X\u0081\u0004¢\u0006\f\u0012\u0004\bD\u0010#\u001a\u0004\bE\u0010%R \u0010F\u001a\b\u0012\u0004\u0012\u00020H0G8@X\u0081\u0004¢\u0006\f\u0012\u0004\bI\u0010#\u001a\u0004\bJ\u0010KR\u0013\u0010O\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010R\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bS\u0010QR\u001c\u0010T\u001a\u0004\u0018\u00010U8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010#\u001a\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020Z8@X\u0081\u0004¢\u0006\f\u0012\u0004\b[\u0010#\u001a\u0004\b\\\u0010]R(\u0010^\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a\u0018\u00010_8@X\u0081\u0004¢\u0006\f\u0012\u0004\bb\u0010#\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u000f8@X\u0081\u0004¢\u0006\f\u0012\u0004\bf\u0010#\u001a\u0004\bg\u0010<R\u001a\u0010h\u001a\u00020\u000f8@X\u0081\u0004¢\u0006\f\u0012\u0004\bi\u0010#\u001a\u0004\bj\u0010<¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;", "", "chart", "Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;", "userSelectedSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "scrubPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "chartMode", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "rewardButtonDto", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "isCandleStickChartEnabled", "", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/serverdriven/experimental/api/Point;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/crypto/charts/ui/ChartMode;Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;Z)V", "getUserSelectedSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getScrubPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getChartMode", "()Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "chartState", "Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "getChartState", "()Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "header", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getHeader$feature_crypto_externalDebug$annotations", "()V", "getHeader$feature_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "getFills$feature_crypto_externalDebug$annotations", "getFills$feature_crypto_externalDebug", "lines", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "getLines$feature_crypto_externalDebug$annotations", "getLines$feature_crypto_externalDebug", "overlays", "getOverlays$feature_crypto_externalDebug$annotations", "getOverlays$feature_crypto_externalDebug", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getPageDirection$feature_crypto_externalDebug$annotations", "getPageDirection$feature_crypto_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "spans", "getSpans$feature_crypto_externalDebug$annotations", "getSpans$feature_crypto_externalDebug", "isLoading", "isLoading$feature_crypto_externalDebug$annotations", "isLoading$feature_crypto_externalDebug", "()Z", "cursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getCursorData$feature_crypto_externalDebug$annotations", "getCursorData$feature_crypto_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "legendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "getLegendList$feature_crypto_externalDebug$annotations", "getLegendList$feature_crypto_externalDebug", "legendPoints", "Lkotlinx/collections/immutable/ImmutableSet;", "", "getLegendPoints$feature_crypto_externalDebug$annotations", "getLegendPoints$feature_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableSet;", "formatDataToString", "", WebsocketGatewayConstants.DATA_KEY, "priceString", "getPriceString", "()Ljava/lang/String;", "headerString", "getHeaderString", "rewardButton", "Lrh_server_driven_ui/v1/ButtonDto;", "getRewardButton$feature_crypto_externalDebug$annotations", "getRewardButton$feature_crypto_externalDebug", "()Lrh_server_driven_ui/v1/ButtonDto;", "rewardThemeDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "getRewardThemeDirection$feature_crypto_externalDebug$annotations", "getRewardThemeDirection$feature_crypto_externalDebug", "()Lcom/robinhood/compose/bento/theme/Direction;", "trailingSpanIcon", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/compose/bento/component/BentoIcons;", "Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton$DrawableIcon;", "getTrailingSpanIcon$feature_crypto_externalDebug$annotations", "getTrailingSpanIcon$feature_crypto_externalDebug", "()Lcom/robinhood/utils/Either;", "showCandleScrubData", "getShowCandleScrubData$feature_crypto_externalDebug$annotations", "getShowCandleScrubData$feature_crypto_externalDebug", "isAnimationEnabled", "isAnimationEnabled$feature_crypto_externalDebug$annotations", "isAnimationEnabled$feature_crypto_externalDebug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHistoricalChartDataState {
    public static final int $stable = 8;
    private final CryptoHistoricalChart chart;
    private final HistoricalChartComposable chartMode;
    private final UiCurrencyPair currencyPair;
    private final boolean isCandleStickChartEnabled;
    private final GetCryptoDetailRewardButtonResponseDto rewardButtonDto;
    private final Point scrubPoint;
    private final DisplaySpan userSelectedSpan;

    /* compiled from: CryptoHistoricalChartDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HistoricalChartComposable.values().length];
            try {
                iArr2[HistoricalChartComposable.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HistoricalChartComposable.CANDLE_STICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoHistoricalChart getChart() {
        return this.chart;
    }

    /* renamed from: component6, reason: from getter */
    private final GetCryptoDetailRewardButtonResponseDto getRewardButtonDto() {
        return this.rewardButtonDto;
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getIsCandleStickChartEnabled() {
        return this.isCandleStickChartEnabled;
    }

    public static /* synthetic */ CryptoHistoricalChartDataState copy$default(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, CryptoHistoricalChart cryptoHistoricalChart, DisplaySpan displaySpan, Point point, UiCurrencyPair uiCurrencyPair, HistoricalChartComposable historicalChartComposable, GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoHistoricalChart = cryptoHistoricalChartDataState.chart;
        }
        if ((i & 2) != 0) {
            displaySpan = cryptoHistoricalChartDataState.userSelectedSpan;
        }
        if ((i & 4) != 0) {
            point = cryptoHistoricalChartDataState.scrubPoint;
        }
        if ((i & 8) != 0) {
            uiCurrencyPair = cryptoHistoricalChartDataState.currencyPair;
        }
        if ((i & 16) != 0) {
            historicalChartComposable = cryptoHistoricalChartDataState.chartMode;
        }
        if ((i & 32) != 0) {
            getCryptoDetailRewardButtonResponseDto = cryptoHistoricalChartDataState.rewardButtonDto;
        }
        if ((i & 64) != 0) {
            z = cryptoHistoricalChartDataState.isCandleStickChartEnabled;
        }
        GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto2 = getCryptoDetailRewardButtonResponseDto;
        boolean z2 = z;
        HistoricalChartComposable historicalChartComposable2 = historicalChartComposable;
        Point point2 = point;
        return cryptoHistoricalChartDataState.copy(cryptoHistoricalChart, displaySpan, point2, uiCurrencyPair, historicalChartComposable2, getCryptoDetailRewardButtonResponseDto2, z2);
    }

    public static /* synthetic */ void getCursorData$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getFills$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getHeader$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getLegendList$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getLegendPoints$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getLines$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getOverlays$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getPageDirection$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getRewardButton$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getRewardThemeDirection$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getShowCandleScrubData$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getSpans$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getTrailingSpanIcon$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void isAnimationEnabled$feature_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void isLoading$feature_crypto_externalDebug$annotations() {
    }

    /* renamed from: component2, reason: from getter */
    public final DisplaySpan getUserSelectedSpan() {
        return this.userSelectedSpan;
    }

    /* renamed from: component3, reason: from getter */
    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    /* renamed from: component4, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component5, reason: from getter */
    public final HistoricalChartComposable getChartMode() {
        return this.chartMode;
    }

    public final CryptoHistoricalChartDataState copy(CryptoHistoricalChart chart, DisplaySpan userSelectedSpan, Point scrubPoint, UiCurrencyPair currencyPair, HistoricalChartComposable chartMode, GetCryptoDetailRewardButtonResponseDto rewardButtonDto, boolean isCandleStickChartEnabled) {
        Intrinsics.checkNotNullParameter(userSelectedSpan, "userSelectedSpan");
        Intrinsics.checkNotNullParameter(chartMode, "chartMode");
        return new CryptoHistoricalChartDataState(chart, userSelectedSpan, scrubPoint, currencyPair, chartMode, rewardButtonDto, isCandleStickChartEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHistoricalChartDataState)) {
            return false;
        }
        CryptoHistoricalChartDataState cryptoHistoricalChartDataState = (CryptoHistoricalChartDataState) other;
        return Intrinsics.areEqual(this.chart, cryptoHistoricalChartDataState.chart) && this.userSelectedSpan == cryptoHistoricalChartDataState.userSelectedSpan && Intrinsics.areEqual(this.scrubPoint, cryptoHistoricalChartDataState.scrubPoint) && Intrinsics.areEqual(this.currencyPair, cryptoHistoricalChartDataState.currencyPair) && this.chartMode == cryptoHistoricalChartDataState.chartMode && Intrinsics.areEqual(this.rewardButtonDto, cryptoHistoricalChartDataState.rewardButtonDto) && this.isCandleStickChartEnabled == cryptoHistoricalChartDataState.isCandleStickChartEnabled;
    }

    public int hashCode() {
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        int iHashCode = (((cryptoHistoricalChart == null ? 0 : cryptoHistoricalChart.hashCode()) * 31) + this.userSelectedSpan.hashCode()) * 31;
        Point point = this.scrubPoint;
        int iHashCode2 = (iHashCode + (point == null ? 0 : point.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode3 = (((iHashCode2 + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + this.chartMode.hashCode()) * 31;
        GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto = this.rewardButtonDto;
        return ((iHashCode3 + (getCryptoDetailRewardButtonResponseDto != null ? getCryptoDetailRewardButtonResponseDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCandleStickChartEnabled);
    }

    public String toString() {
        return "CryptoHistoricalChartDataState(chart=" + this.chart + ", userSelectedSpan=" + this.userSelectedSpan + ", scrubPoint=" + this.scrubPoint + ", currencyPair=" + this.currencyPair + ", chartMode=" + this.chartMode + ", rewardButtonDto=" + this.rewardButtonDto + ", isCandleStickChartEnabled=" + this.isCandleStickChartEnabled + ")";
    }

    public CryptoHistoricalChartDataState(CryptoHistoricalChart cryptoHistoricalChart, DisplaySpan userSelectedSpan, Point point, UiCurrencyPair uiCurrencyPair, HistoricalChartComposable chartMode, GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto, boolean z) {
        Intrinsics.checkNotNullParameter(userSelectedSpan, "userSelectedSpan");
        Intrinsics.checkNotNullParameter(chartMode, "chartMode");
        this.chart = cryptoHistoricalChart;
        this.userSelectedSpan = userSelectedSpan;
        this.scrubPoint = point;
        this.currencyPair = uiCurrencyPair;
        this.chartMode = chartMode;
        this.rewardButtonDto = getCryptoDetailRewardButtonResponseDto;
        this.isCandleStickChartEnabled = z;
    }

    public /* synthetic */ CryptoHistoricalChartDataState(CryptoHistoricalChart cryptoHistoricalChart, DisplaySpan displaySpan, Point point, UiCurrencyPair uiCurrencyPair, HistoricalChartComposable historicalChartComposable, GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoHistoricalChart, displaySpan, point, uiCurrencyPair, historicalChartComposable, (i & 32) != 0 ? null : getCryptoDetailRewardButtonResponseDto, (i & 64) != 0 ? false : z);
    }

    public final DisplaySpan getUserSelectedSpan() {
        return this.userSelectedSpan;
    }

    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final HistoricalChartComposable getChartMode() {
        return this.chartMode;
    }

    public final HistoricalChartState getChartState() {
        return new HistoricalChartState(this.chartMode, getCursorData$feature_crypto_externalDebug(), getFills$feature_crypto_externalDebug(), getHeader$feature_crypto_externalDebug(), isAnimationEnabled$feature_crypto_externalDebug(), isLoading$feature_crypto_externalDebug(), getShowCandleScrubData$feature_crypto_externalDebug(), getLegendPoints$feature_crypto_externalDebug(), getLines$feature_crypto_externalDebug(), getOverlays$feature_crypto_externalDebug(), getPageDirection$feature_crypto_externalDebug(), getPriceString(), getRewardButton$feature_crypto_externalDebug(), getRewardThemeDirection$feature_crypto_externalDebug(), this.scrubPoint, this.userSelectedSpan, getSpans$feature_crypto_externalDebug(), getTrailingSpanIcon$feature_crypto_externalDebug(), getLegendList$feature_crypto_externalDebug());
    }

    public final ImmutableList<UIComponent<GenericAction>> getHeader$feature_crypto_externalDebug() {
        ImmutableList<UIComponent<GenericAction>> header;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (header = cryptoHistoricalChart.getHeader()) == null) ? extensions2.persistentListOf() : header;
    }

    public final ImmutableList<ChartFill> getFills$feature_crypto_externalDebug() {
        ImmutableList<ChartFill> compatFills;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (compatFills = cryptoHistoricalChart.getCompatFills()) == null) ? extensions2.persistentListOf() : compatFills;
    }

    public final ImmutableList<Line> getLines$feature_crypto_externalDebug() {
        ImmutableList<Line> compatLines;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (compatLines = cryptoHistoricalChart.getCompatLines()) == null) ? extensions2.persistentListOf() : compatLines;
    }

    public final ImmutableList<UIComponent<GenericAction>> getOverlays$feature_crypto_externalDebug() {
        ImmutableList<UIComponent<GenericAction>> compatOverlays;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (compatOverlays = cryptoHistoricalChart.getCompatOverlays()) == null) ? extensions2.persistentListOf() : compatOverlays;
    }

    public final Direction getPageDirection$feature_crypto_externalDebug() {
        Direction pageDirection;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (pageDirection = cryptoHistoricalChart.getPageDirection()) == null) ? Direction.f5855UP : pageDirection;
    }

    public final ImmutableList<DisplaySpan> getSpans$feature_crypto_externalDebug() {
        ImmutableList<DisplaySpan> spans;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (spans = cryptoHistoricalChart.getSpans()) == null) ? extensions2.persistentListOf() : spans;
    }

    public final boolean isLoading$feature_crypto_externalDebug() {
        return this.chart == null || this.currencyPair == null;
    }

    public final CursorData getCursorData$feature_crypto_externalDebug() {
        CursorData cursor_data;
        Point point = this.scrubPoint;
        if (point != null && (cursor_data = point.getCursor_data()) != null) {
            return cursor_data;
        }
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        if (cryptoHistoricalChart != null) {
            return cryptoHistoricalChart.getDefaultDisplay();
        }
        return null;
    }

    public final ImmutableList<ChartLegendItem> getLegendList$feature_crypto_externalDebug() {
        Point point;
        ImmutableList3 persistentList;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        ImmutableMap<String, List<ChartLegendItem>> compatLegendData = cryptoHistoricalChart != null ? cryptoHistoricalChart.getCompatLegendData() : null;
        if (compatLegendData != null && (point = this.scrubPoint) != null) {
            List<ChartLegendItem> legendList = UtilKt.getLegendList(compatLegendData, point);
            return (legendList == null || (persistentList = extensions2.toPersistentList(legendList)) == null) ? extensions2.persistentListOf() : persistentList;
        }
        return extensions2.persistentListOf();
    }

    public final ImmutableSet<Float> getLegendPoints$feature_crypto_externalDebug() {
        ImmutableSet<Float> compatLegendPoints;
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return (cryptoHistoricalChart == null || (compatLegendPoints = cryptoHistoricalChart.getCompatLegendPoints()) == null) ? extensions2.persistentSetOf() : compatLegendPoints;
    }

    private final String formatDataToString(CursorData data) {
        PriceChartData price_chart_data;
        Money dollar_value;
        Currency quoteCurrencyForPriceInput;
        int defaultFractionDigits;
        if (data == null || (price_chart_data = data.getPrice_chart_data()) == null || (dollar_value = price_chart_data.getDollar_value()) == null) {
            return null;
        }
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null && uiCurrencyPair.isTokenizedStock()) {
            java.util.Currency currency = java.util.Currency.getInstance(dollar_value.getCurrency_code());
            BigDecimal minOrderPriceIncrement = this.currencyPair.getMinOrderPriceIncrement();
            if (!Intrinsics.areEqual(minOrderPriceIncrement, BigDecimal.ZERO) && minOrderPriceIncrement.abs().compareTo(BigDecimal.ONE) < 0) {
                defaultFractionDigits = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(minOrderPriceIncrement).scale();
            } else {
                defaultFractionDigits = currency.getDefaultFractionDigits();
            }
            int i = defaultFractionDigits;
            Intrinsics.checkNotNull(currency);
            return com.robinhood.models.util.Money.format$default(new com.robinhood.models.util.Money(currency, dollar_value.getAmount()), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, i, Integer.valueOf(i), false, null, false, false, 972, null);
        }
        UiCurrencyPair uiCurrencyPair2 = this.currencyPair;
        if (uiCurrencyPair2 == null || (quoteCurrencyForPriceInput = uiCurrencyPair2.getQuoteCurrencyForPriceInput()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, dollar_value.getAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public final String getPriceString() {
        return formatDataToString(getCursorData$feature_crypto_externalDebug());
    }

    public final String getHeaderString() {
        CryptoHistoricalChart cryptoHistoricalChart = this.chart;
        return formatDataToString(cryptoHistoricalChart != null ? cryptoHistoricalChart.getDefaultDisplay() : null);
    }

    public final ButtonDto getRewardButton$feature_crypto_externalDebug() {
        GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto = this.rewardButtonDto;
        if (getCryptoDetailRewardButtonResponseDto != null) {
            return getCryptoDetailRewardButtonResponseDto.getButton();
        }
        return null;
    }

    public final BentoTheme4 getRewardThemeDirection$feature_crypto_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[getPageDirection$feature_crypto_externalDebug().ordinal()];
        if (i == 1) {
            return BentoTheme4.POSITIVE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoTheme4.NEGATIVE;
    }

    public final Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> getTrailingSpanIcon$feature_crypto_externalDebug() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this.isCandleStickChartEnabled) {
            CryptoHistoricalChart cryptoHistoricalChart = this.chart;
            if ((cryptoHistoricalChart != null ? Boolean.valueOf(cryptoHistoricalChart.getShowCandleSticks()) : null) != null) {
                int i = WhenMappings.$EnumSwitchMapping$1[this.chartMode.ordinal()];
                if (i == 1) {
                    return Either2.asRight(new SpanSelectorTrailingButton.DrawableIcon(C12757R.drawable.ic_chart_candlesticks_crypto_24, new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHART_LINE_24).mo20645getSizeD9Ej5fM(), defaultConstructorMarker));
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Either2.asLeft(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHART_LINE_24));
            }
        }
        return null;
    }

    public final boolean getShowCandleScrubData$feature_crypto_externalDebug() {
        return (this.scrubPoint == null || this.chartMode != HistoricalChartComposable.CANDLE_STICK || this.chart == null) ? false : true;
    }

    public final boolean isAnimationEnabled$feature_crypto_externalDebug() {
        return this.chartMode == HistoricalChartComposable.LINE;
    }
}
