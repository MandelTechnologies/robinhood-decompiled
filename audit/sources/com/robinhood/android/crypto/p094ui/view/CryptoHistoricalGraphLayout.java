package com.robinhood.android.crypto.p094ui.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.tracing.Trace;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.view.CandlestickChartView;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.graph.GraphLayoutViewModel;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.IcuNumberFormatter;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDateTimes;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;

/* compiled from: CryptoHistoricalGraphLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010 \u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010RR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010Z\u001a\u00020T8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020T8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020T8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0014\u0010b\u001a\u00020_8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020_8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bc\u0010aR\u0014\u0010f\u001a\u00020_8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\be\u0010aR\u0014\u0010h\u001a\u00020_8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bg\u0010a¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout;", "Lcom/robinhood/android/graph/GraphLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Lcom/robinhood/models/ui/GraphSelection;", "graphSelection", "", "onGraphSelectionChanged", "(Lcom/robinhood/models/ui/GraphSelection;)V", "selection", "Lcom/robinhood/utils/datetime/format/InstantFormatter;", "getInstantFormatter", "(Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/utils/datetime/format/InstantFormatter;", "j$/time/Instant", "start", "end", "getStartInstantFormatter", "(Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/utils/datetime/format/InstantFormatter;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "historical", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "dataPoints", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "quote", "updateData", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;Ljava/util/List;Lcom/robinhood/models/crypto/db/CryptoQuote;)V", "updatePriceFormatter", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/android/font/CustomTypefaceSpan;", "deltaTextTypefaceSpan$delegate", "Lkotlin/Lazy;", "getDeltaTextTypefaceSpan", "()Lcom/robinhood/android/font/CustomTypefaceSpan;", "deltaTextTypefaceSpan", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "Landroid/content/SharedPreferences;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowCandlestickChartPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowCandlestickChartPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "cryptoTickerNumberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "cryptoPriceDeltaNumberFormatter", "getPriceFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "priceFormat", "getPriceDeltaFormat", "priceDeltaFormat", "getPercentDeltaFormat", "percentDeltaFormat", "", "getToggleCandlestickIconRes", "()I", "toggleCandlestickIconRes", "getDeltaTextPositiveColor", "deltaTextPositiveColor", "getDeltaTextNegativeColor", "deltaTextNegativeColor", "getDeltaTextStaleColor", "deltaTextStaleColor", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoHistoricalGraphLayout extends Hammer_CryptoHistoricalGraphLayout {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;
    private NumberFormatter cryptoPriceDeltaNumberFormatter;
    private NumberFormatter cryptoTickerNumberFormatter;

    /* renamed from: deltaTextTypefaceSpan$delegate, reason: from kotlin metadata */
    private final Lazy deltaTextTypefaceSpan;
    public EventLogger eventLogger;
    private UiCryptoHistorical historical;
    private final Screen loggingEventScreen;
    public TraderMarketHoursManager marketHoursManager;
    private CryptoQuote quote;

    @ShowCandlestickChartPref
    public BooleanPreference showCandlestickChartPref;

    @UserPrefs
    public SharedPreferences userPrefs;

    /* compiled from: CryptoHistoricalGraphLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GraphSelection.values().length];
            try {
                iArr2[GraphSelection.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GraphSelection.HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GraphSelection.ALL_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GraphSelection.MONTH_HOURLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GraphSelection.MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GraphSelection.MONTH_CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GraphSelection.THREE_MONTHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GraphSelection.YEAR_TO_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[GraphSelection.YEAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[GraphSelection.YEAR_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[GraphSelection.FIVE_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHistoricalGraphLayout(final Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loggingEventScreen = new Screen(Screen.Name.CRYPTO_DETAIL_PAGE, null, null, null, 14, null);
        this.deltaTextTypefaceSpan = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.crypto.ui.view.CryptoHistoricalGraphLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoHistoricalGraphLayout.deltaTextTypefaceSpan_delegate$lambda$0(context);
            }
        });
        View.inflate(context, C12757R.layout.include_crypto_graph_layout, this);
        onInitialized();
        Typeface typefaceLoad = RhTypeface.MEDIUM_CONDENSED.load(context);
        RhTextView candlestickScrubbedTxt = getCandlestickScrubbedTxt();
        if (candlestickScrubbedTxt != null) {
            candlestickScrubbedTxt.setTypeface(typefaceLoad);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.currentWidth(Views.baseActivity(this)).ordinal()];
        if (i == 1) {
            str = "16:9";
        } else if (i == 2) {
            str = "2.76:1";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "4:1";
        }
        ViewGroup.LayoutParams layoutParams = getGraphView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio = str;
        CandlestickChartView candlestickChartView = getCandlestickChartView();
        ViewGroup.LayoutParams layoutParams2 = candlestickChartView != null ? candlestickChartView.getLayoutParams() : null;
        ConstraintLayout.LayoutParams layoutParams3 = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.dimensionRatio = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoHistoricalGraphLayout(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected Screen getLoggingEventScreen() {
        return this.loggingEventScreen;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected NumberFormatter getPriceFormat() {
        NumberFormatter numberFormatter = this.cryptoTickerNumberFormatter;
        return numberFormatter == null ? new IcuNumberFormatter(FormatsLocalized.getCurrencyFormat()) : numberFormatter;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected NumberFormatter getPriceDeltaFormat() {
        NumberFormatter numberFormatter = this.cryptoPriceDeltaNumberFormatter;
        return numberFormatter == null ? new IcuNumberFormatter(FormatsLocalized.getSignedCurrencyFormat()) : numberFormatter;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected NumberFormatter getPercentDeltaFormat() {
        return FormatsLocalized.getSignedPercentFormat();
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected int getToggleCandlestickIconRes() {
        return C11048R.drawable.svg_ic_candlestick;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected int getDeltaTextPositiveColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C20690R.attr.colorPositive);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected int getDeltaTextNegativeColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C20690R.attr.colorNegative);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected int getDeltaTextStaleColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, C11048R.attr.rhStaleColor);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public CustomTypefaceSpan getDeltaTextTypefaceSpan() {
        return (CustomTypefaceSpan) this.deltaTextTypefaceSpan.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomTypefaceSpan deltaTextTypefaceSpan_delegate$lambda$0(Context context) {
        return new CustomTypefaceSpan(RhTypeface.MEDIUM_CONDENSED.load(context));
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public SharedPreferences getUserPrefs() {
        SharedPreferences sharedPreferences = this.userPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setUserPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.userPrefs = sharedPreferences;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public BooleanPreference getShowCandlestickChartPref() {
        BooleanPreference booleanPreference = this.showCandlestickChartPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showCandlestickChartPref");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setShowCandlestickChartPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showCandlestickChartPref = booleanPreference;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected void onGraphSelectionChanged(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        super.onGraphSelectionChanged(graphSelection);
        this.historical = null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected InstantFormatter getInstantFormatter(GraphSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        switch (WhenMappings.$EnumSwitchMapping$1[selection.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE;
            case 5:
            case 6:
            case 7:
            case 8:
                return InstantFormatter.DATETIME_IN_SYSTEM_ZONE;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return InstantFormatter.DATE_IN_UTC;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected InstantFormatter getStartInstantFormatter(Instant start, Instant end, GraphSelection selection) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(selection, "selection");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        LocalDateTime localDateTime = Instants.toLocalDateTime(start, zoneIdSystemDefault);
        ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault2, "systemDefault(...)");
        LocalDateTime localDateTime2 = Instants.toLocalDateTime(end, zoneIdSystemDefault2);
        switch (WhenMappings.$EnumSwitchMapping$1[selection.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (Intrinsics.areEqual(localDateTime.mo3394a(), localDateTime2.mo3394a())) {
                    if (LocalDateTimes.getAmPm(localDateTime) == LocalDateTimes.getAmPm(localDateTime2)) {
                        return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM;
                    }
                    return InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE;
                }
                return getInstantFormatter(selection);
            case 3:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(selection);
                throw new ExceptionsH();
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                if (localDateTime.getYear() == localDateTime2.getYear()) {
                    return InstantFormatter.DATE_NO_YEAR_IN_SYSTEM_ZONE;
                }
                return getInstantFormatter(selection);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void updateData(UiCurrencyPair uiCurrencyPair, UiCryptoHistorical historical, List<? extends DataPoint.Asset> dataPoints, CryptoQuote quote) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(historical, "historical");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Trace.beginSection("ForexHistoricalGraphLayout.updateData");
        try {
            setHeaderTitleTxt(uiCurrencyPair.getDisplayName());
            this.historical = historical;
            if (quote != null) {
                this.quote = quote;
            }
            CryptoQuote cryptoQuote = this.quote;
            GraphData.Companion companion = GraphData.INSTANCE;
            MarketHours currentMarketHours = getMarketHoursManager().getCurrentMarketHours();
            Money previousClose = historical.getPreviousClose();
            setGraphData(companion.fromAssetDataPoints(null, currentMarketHours, dataPoints, previousClose != null ? Money3.getBigDecimalCompat(previousClose) : null, getGraphSelection(), historical.getInterval(), historical.getCryptoHistorical().isStaleForUi(), (16256 & 128) != 0, (16256 & 256) != 0, (16256 & 512) != 0 ? false : false, (16256 & 1024) != 0 ? null : null, (16256 & 2048) != 0 ? false : true, (16256 & 4096) != 0 ? null : null, (16256 & 8192) != 0 ? false : false));
            if (cryptoQuote != null) {
                setData(new GraphLayoutViewModel.Asset(false, Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()), null));
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void updatePriceFormatter(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        this.cryptoTickerNumberFormatter = CurrencyDefinitions.getCryptoFiatPriceFormatterForTicker(uiCurrencyPair.getQuoteCurrencyForPriceInput());
        this.cryptoPriceDeltaNumberFormatter = CurrencyDefinitions.getCryptoFiatPriceDeltaFormatter(uiCurrencyPair.getQuoteCurrencyForPriceInput());
    }
}
