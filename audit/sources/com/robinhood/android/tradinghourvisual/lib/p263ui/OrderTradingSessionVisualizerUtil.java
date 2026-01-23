package com.robinhood.android.tradinghourvisual.lib.p263ui;

import android.annotation.SuppressLint;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: OrderTradingSessionVisualizerUtil.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/tradinghourvisual/lib/ui/OrderTradingSessionVisualizerUtil;", "", "<init>", "()V", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getVisualizerArg", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;)Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "Lkotlin/Pair;", "j$/time/Instant", "selectedMarketHoursPair", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;)Lkotlin/Pair;", "", "string", "Lkotlinx/collections/immutable/ImmutableList;", "splitTime", "(Ljava/lang/String;)Lkotlinx/collections/immutable/ImmutableList;", "selectedMarketHours", "Lkotlin/Function0;", "Lkotlinx/collections/immutable/PersistentList;", "Landroidx/compose/ui/graphics/Color;", "getGradient", "(Lcom/robinhood/models/db/OrderMarketHours;)Lkotlin/jvm/functions/Function2;", "", "TRADE_VISUALIZER_MARKET_START_END_TIME", "I", "TradeVisualizerTestTag", "Ljava/lang/String;", "getDefaultMarketOpenEdge$lib_trade_hour_visualizer_externalDebug", "()Lj$/time/Instant;", "defaultMarketOpenEdge", "lib-trade-hour-visualizer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderTradingSessionVisualizerUtil {
    public static final int $stable = 0;
    public static final OrderTradingSessionVisualizerUtil INSTANCE = new OrderTradingSessionVisualizerUtil();
    public static final int TRADE_VISUALIZER_MARKET_START_END_TIME = 20;
    public static final String TradeVisualizerTestTag = "TradeVisualizer";

    /* compiled from: OrderTradingSessionVisualizerUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OrderTradingSessionVisualizerUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SetTradingHourVisualizerArgs getVisualizerArg(OrderMarketHours tradingSession, MarketHours marketHours) {
        Instant instantPlus;
        String str;
        Instant instant;
        Instant instant2;
        Tuples2 tuples2 = null;
        Instant allDayHoursOpensAt = marketHours != null ? marketHours.getAllDayHoursOpensAt() : null;
        if (allDayHoursOpensAt != null) {
            instantPlus = allDayHoursOpensAt.plus((TemporalAmount) Days.m3991of(1));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            Tuples2<Instant, Instant> tuples2SelectedMarketHoursPair = selectedMarketHoursPair(tradingSession, marketHours);
            Instant first = tuples2SelectedMarketHoursPair != null ? tuples2SelectedMarketHoursPair.getFirst() : null;
            Instant second = tuples2SelectedMarketHoursPair != null ? tuples2SelectedMarketHoursPair.getSecond() : null;
            boolean z = first != null && allDayHoursOpensAt.compareTo(first) <= 0 && first.compareTo(instantPlus) <= 0;
            boolean z2 = second != null && allDayHoursOpensAt.compareTo(second) <= 0 && second.compareTo(instantPlus) <= 0;
            if (z && z2) {
                tuples2 = new Tuples2(first, second);
            } else if (tradingSession != null && (first != null || second != null)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Selected pair " + tuples2SelectedMarketHoursPair + " is out of bound [" + allDayHoursOpensAt + ", " + instantPlus + "]"), true, null, 4, null);
            }
        } else {
            allDayHoursOpensAt = getDefaultMarketOpenEdge$lib_trade_hour_visualizer_externalDebug();
            instantPlus = allDayHoursOpensAt.plus((TemporalAmount) Days.m3991of(1));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            if (marketHours != null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Visualizer expects open market hours, but marketHours.allDayHoursOpensAt is null"), true, null, 4, null);
            }
        }
        Tuples2 tuples22 = tuples2;
        Instant instant3 = instantPlus;
        LocalTime localTime = allDayHoursOpensAt.atZone(ZoneId.systemDefault()).toLocalTime();
        String str2 = "";
        if (tuples22 == null || (instant2 = (Instant) tuples22.getFirst()) == null) {
            str = "";
        } else {
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
            LocalTime localTime2 = instant2.atZone(ZoneId.systemDefault()).toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
            str = localTimeFormatter.format(localTime2);
            if (str == null) {
            }
        }
        if (tuples22 != null && (instant = (Instant) tuples22.getSecond()) != null) {
            LocalTimeFormatter localTimeFormatter2 = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
            LocalTime localTime3 = instant.atZone(ZoneId.systemDefault()).toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime3, "toLocalTime(...)");
            String str3 = localTimeFormatter2.format(localTime3);
            if (str3 != null) {
                str2 = str3;
            }
        }
        LocalTimeFormatter localTimeFormatter3 = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
        Intrinsics.checkNotNull(localTime);
        return new SetTradingHourVisualizerArgs(splitTime(localTimeFormatter3.format(localTime)), splitTime(localTimeFormatter3.format(localTime)), splitTime(str), splitTime(str2), 0, allDayHoursOpensAt, instant3, tuples22, getGradient(tradingSession), 16, null);
    }

    @SuppressLint({"NowWithoutClock"})
    public final Instant getDefaultMarketOpenEdge$lib_trade_hour_visualizer_externalDebug() {
        Instant instant = ZonedDateTime.now(ZoneIds.INSTANCE.getNEW_YORK()).with((TemporalAdjuster) LocalTime.m3408of(20, 0)).withSecond(0).withNano(0).mo3460b(ZoneId.systemDefault()).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        return instant;
    }

    public final Tuples2<Instant, Instant> selectedMarketHoursPair(OrderMarketHours tradingSession, MarketHours marketHours) {
        Instant allDayOpensAt;
        Instant allDayClosesAt = null;
        if (marketHours == null) {
            return null;
        }
        int i = tradingSession == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        if (i == 1) {
            allDayOpensAt = marketHours.getAllDayOpensAt();
        } else if (i == 2 || i == 3) {
            allDayOpensAt = marketHours.getExtendedOpensAt();
        } else {
            allDayOpensAt = i != 4 ? null : marketHours.getRegularOpensAt();
        }
        int i2 = tradingSession != null ? WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()] : -1;
        if (i2 == 1) {
            allDayClosesAt = marketHours.getAllDayClosesAt();
        } else if (i2 == 2 || i2 == 3) {
            allDayClosesAt = marketHours.getExtendedClosesAt();
        } else if (i2 == 4) {
            allDayClosesAt = marketHours.getRegularClosesAt();
        }
        return new Tuples2<>(allDayOpensAt, allDayClosesAt);
    }

    public final ImmutableList<String> splitTime(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        return extensions2.toImmutableList(StringsKt.split$default((CharSequence) string2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null));
    }

    public final Function2<Composer, Integer, ImmutableList3<Color>> getGradient(OrderMarketHours selectedMarketHours) {
        return new Function2<Composer, Integer, ImmutableList3<? extends Color>>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.OrderTradingSessionVisualizerUtil.getGradient.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ImmutableList3<? extends Color> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final ImmutableList3<Color> invoke(Composer composer, int i) {
                composer.startReplaceGroup(1284478398);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1284478398, i, -1, "com.robinhood.android.tradinghourvisual.lib.ui.OrderTradingSessionVisualizerUtil.getGradient.<anonymous> (OrderTradingSessionVisualizerUtil.kt:142)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                ImmutableList3<Color> immutableList3PersistentListOf = extensions2.persistentListOf(Color.m6701boximpl(bentoTheme.getColors(composer, i2).getPrime()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).getPrime()));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return immutableList3PersistentListOf;
            }
        };
    }
}
