package com.robinhood.android.trade.options.util;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.trade.options.extensions.TradingSessionExtensions;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.card.p311db.Card;
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
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: OptionOrderTradingSessionVisualizerUtil.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/trade/options/util/OptionOrderTradingSessionVisualizerUtil;", "", "<init>", "()V", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getVisualizerArg", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lj$/time/Clock;)Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "j$/time/Instant", "getDefaultMarketOpenEdge", "(Lj$/time/Clock;)Lj$/time/Instant;", "Lkotlin/Pair;", "selectedMarketHoursPair", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;)Lkotlin/Pair;", "", "string", "Lkotlinx/collections/immutable/ImmutableList;", "splitTime", "(Ljava/lang/String;)Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Function0;", "Lkotlinx/collections/immutable/PersistentList;", "Landroidx/compose/ui/graphics/Color;", "getGradient", "()Lkotlin/jvm/functions/Function2;", "", "TRADE_VISUALIZER_MARKET_START_END_TIME", "I", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderTradingSessionVisualizerUtil {
    public static final int $stable = 0;
    public static final OptionOrderTradingSessionVisualizerUtil INSTANCE = new OptionOrderTradingSessionVisualizerUtil();
    public static final int TRADE_VISUALIZER_MARKET_START_END_TIME = 20;

    /* compiled from: OptionOrderTradingSessionVisualizerUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OptionOrderTradingSessionVisualizerUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SetTradingHourVisualizerArgs getVisualizerArg(OrderMarketHours tradingSession, MarketHours marketHours, Clock clock) {
        Tuples2 tuples2;
        String str;
        Instant instant;
        Instant instant2;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Tuples2 tuples22 = null;
        Instant regularHoursOpensAt = marketHours != null ? marketHours.getRegularHoursOpensAt() : null;
        Instant instantCurbClosesAtWithDefault = marketHours != null ? TradingSessionExtensions.curbClosesAtWithDefault(marketHours) : null;
        if (marketHours != null && marketHours.isOpen() && regularHoursOpensAt != null && instantCurbClosesAtWithDefault != null) {
            Tuples2<Instant, Instant> tuples2SelectedMarketHoursPair = selectedMarketHoursPair(tradingSession, marketHours);
            Instant first = tuples2SelectedMarketHoursPair != null ? tuples2SelectedMarketHoursPair.getFirst() : null;
            Instant second = tuples2SelectedMarketHoursPair != null ? tuples2SelectedMarketHoursPair.getSecond() : null;
            boolean z = first != null && regularHoursOpensAt.compareTo(first) <= 0 && first.compareTo(instantCurbClosesAtWithDefault) <= 0;
            boolean z2 = second != null && regularHoursOpensAt.compareTo(second) <= 0 && second.compareTo(instantCurbClosesAtWithDefault) <= 0;
            if (z && z2) {
                tuples22 = new Tuples2(first, second);
            } else if (tradingSession != null && (first != null || second != null)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Selected pair " + tuples2SelectedMarketHoursPair + " is out of bound [" + regularHoursOpensAt + ", " + instantCurbClosesAtWithDefault + "]"), true, null, 4, null);
            }
            tuples2 = tuples22;
        } else {
            Instant defaultMarketOpenEdge = getDefaultMarketOpenEdge(clock);
            Instant instantPlus = defaultMarketOpenEdge.plus((TemporalAmount) Days.m3991of(1));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            if (marketHours != null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Visualizer expects open market hours, but regularHoursOpensAt is " + regularHoursOpensAt + ", curbClosesAt is " + instantCurbClosesAtWithDefault + "."), true, null, 4, null);
            }
            regularHoursOpensAt = defaultMarketOpenEdge;
            tuples2 = null;
            instantCurbClosesAtWithDefault = instantPlus;
        }
        String str2 = "";
        if (tuples2 == null || (instant2 = (Instant) tuples2.getFirst()) == null) {
            str = "";
        } else {
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
            LocalTime localTime = instant2.atZone(ZoneId.systemDefault()).toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            str = localTimeFormatter.format(localTime);
            if (str == null) {
            }
        }
        if (tuples2 != null && (instant = (Instant) tuples2.getSecond()) != null) {
            LocalTimeFormatter localTimeFormatter2 = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
            LocalTime localTime2 = instant.atZone(ZoneId.systemDefault()).toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
            String str3 = localTimeFormatter2.format(localTime2);
            if (str3 != null) {
                str2 = str3;
            }
        }
        LocalTimeFormatter localTimeFormatter3 = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
        LocalTime localTime3 = regularHoursOpensAt.atZone(ZoneId.systemDefault()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime3, "toLocalTime(...)");
        ImmutableList<String> immutableListSplitTime = splitTime(localTimeFormatter3.format(localTime3));
        LocalTime localTime4 = instantCurbClosesAtWithDefault.atZone(ZoneId.systemDefault()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime4, "toLocalTime(...)");
        return new SetTradingHourVisualizerArgs(immutableListSplitTime, splitTime(localTimeFormatter3.format(localTime4)), splitTime(str), splitTime(str2), 0, regularHoursOpensAt, instantCurbClosesAtWithDefault, tuples2, getGradient(), 16, null);
    }

    public final Instant getDefaultMarketOpenEdge(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Instant instant = ZonedDateTime.now(clock.withZone(ZoneIds.INSTANCE.getNEW_YORK())).with((TemporalAdjuster) LocalTime.m3408of(20, 0)).withSecond(0).withNano(0).mo3460b(ZoneId.systemDefault()).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        return instant;
    }

    public final Tuples2<Instant, Instant> selectedMarketHoursPair(OrderMarketHours tradingSession, MarketHours marketHours) {
        Instant indexOptionNon0DteClosesAt = null;
        if (marketHours == null) {
            return null;
        }
        if (tradingSession != null && tradingSession != OrderMarketHours.REGULAR_HOURS && tradingSession != OrderMarketHours.REGULAR_CURB_HOURS) {
            throw new IllegalArgumentException(("unsupported tradingSession: " + tradingSession + ", options only support REGULAR_HOURS and REGULAR_CURB_HOURS.").toString());
        }
        int i = tradingSession == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        Instant regularOpensAt = (i == 1 || i == 2) ? marketHours.getRegularOpensAt() : null;
        int i2 = tradingSession != null ? WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()] : -1;
        if (i2 == 1) {
            indexOptionNon0DteClosesAt = marketHours.getIndexOptionNon0DteClosesAt();
        } else if (i2 == 2) {
            indexOptionNon0DteClosesAt = TradingSessionExtensions.curbClosesAtWithDefault(marketHours);
        }
        return new Tuples2<>(regularOpensAt, indexOptionNon0DteClosesAt);
    }

    public final ImmutableList<String> splitTime(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        return extensions2.toImmutableList(StringsKt.split$default((CharSequence) string2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null));
    }

    public final Function2<Composer, Integer, ImmutableList3<Color>> getGradient() {
        return new Function2<Composer, Integer, ImmutableList3<? extends Color>>() { // from class: com.robinhood.android.trade.options.util.OptionOrderTradingSessionVisualizerUtil.getGradient.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ImmutableList3<? extends Color> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final ImmutableList3<Color> invoke(Composer composer, int i) {
                composer.startReplaceGroup(-182683997);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-182683997, i, -1, "com.robinhood.android.trade.options.util.OptionOrderTradingSessionVisualizerUtil.getGradient.<anonymous> (OptionOrderTradingSessionVisualizerUtil.kt:158)");
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
