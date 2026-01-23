package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec3;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider2;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior7;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.semantics.LiveRegionMode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: DatePicker.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008e\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010)\u001a\u00020(2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$¢\u0006\u0004\b)\u0010*J$\u00102\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101J6\u00107\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u00106J'\u0010@\u001a\u00020=2\u0006\u00109\u001a\u0002082\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010G\u001a\u00020F8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010S\u001a\u00020\u0004*\u00020P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8G¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m3636d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/DatePickerColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/DatePickerFormatter;", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/ui/Modifier;", "modifier", "", "DatePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "", "selectedDateMillis", "DatePickerHeadline-3kbWawI", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerHeadline", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "Lkotlin/ranges/IntRange;", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "Landroidx/compose/ui/unit/Dp;", "TonalElevation", "F", "getTonalElevation-D9Ej5fM", "()F", "Landroidx/compose/material3/SelectableDates;", "AllDates", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DatePickerDefaults {
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final PrimitiveRanges2 YearRange = new PrimitiveRanges2(1900, 2100);
    private static final float TonalElevation = ElevationTokens.INSTANCE.m6188getLevel0D9Ej5fM();
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public final DatePickerColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColors;
    }

    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m5827colorsbSRYm20(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, Composer composer, int i, int i2, int i3, int i4) {
        long j25;
        long j26;
        long jM6726getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM6726getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j2;
        long jM6726getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        long jM6726getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j4;
        long jM6726getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j5;
        long jM6726getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j6;
        long jM6726getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j7;
        long j27 = jM6726getUnspecified0d7_KjU;
        long jM6726getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j8;
        long jM6726getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j9;
        long jM6726getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j10;
        long jM6726getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j11;
        long jM6726getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j12;
        long jM6726getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j13;
        long jM6726getUnspecified0d7_KjU14 = (i4 & 8192) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j14;
        long jM6726getUnspecified0d7_KjU15 = (i4 & 16384) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j15;
        long jM6726getUnspecified0d7_KjU16 = (i4 & 32768) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j16;
        long jM6726getUnspecified0d7_KjU17 = (i4 & 65536) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j17;
        long jM6726getUnspecified0d7_KjU18 = (i4 & 131072) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j18;
        long jM6726getUnspecified0d7_KjU19 = (i4 & 262144) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j19;
        long jM6726getUnspecified0d7_KjU20 = (i4 & 524288) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j20;
        long jM6726getUnspecified0d7_KjU21 = (i4 & 1048576) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j21;
        long jM6726getUnspecified0d7_KjU22 = (i4 & 2097152) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j22;
        long jM6726getUnspecified0d7_KjU23 = (i4 & 4194304) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j23;
        long jM6726getUnspecified0d7_KjU24 = (i4 & 8388608) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j24;
        TextFieldColors textFieldColors2 = (i4 & 16777216) != 0 ? null : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            j25 = jM6726getUnspecified0d7_KjU15;
            j26 = jM6726getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1991626358, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:501)");
        } else {
            j25 = jM6726getUnspecified0d7_KjU15;
            j26 = jM6726getUnspecified0d7_KjU2;
        }
        DatePickerColors datePickerColorsM5817copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 >> 12) & 112).m5817copytNwlRmA(j27, j26, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU4, jM6726getUnspecified0d7_KjU5, jM6726getUnspecified0d7_KjU6, jM6726getUnspecified0d7_KjU7, jM6726getUnspecified0d7_KjU8, jM6726getUnspecified0d7_KjU9, jM6726getUnspecified0d7_KjU10, jM6726getUnspecified0d7_KjU11, jM6726getUnspecified0d7_KjU12, jM6726getUnspecified0d7_KjU13, jM6726getUnspecified0d7_KjU14, j25, jM6726getUnspecified0d7_KjU16, jM6726getUnspecified0d7_KjU17, jM6726getUnspecified0d7_KjU18, jM6726getUnspecified0d7_KjU19, jM6726getUnspecified0d7_KjU20, jM6726getUnspecified0d7_KjU21, jM6726getUnspecified0d7_KjU23, jM6726getUnspecified0d7_KjU22, jM6726getUnspecified0d7_KjU24, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerColorsM5817copytNwlRmA;
    }

    @JvmName
    public final DatePickerColors getDefaultDatePickerColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        DatePickerColors defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        composer.startReplaceGroup(-653681037);
        if (defaultDatePickerColorsCached == null) {
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            DatePickerColors datePickerColors = new DatePickerColors(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getHeaderSupportingTextColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getHeaderHeadlineColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getWeekdaysLabelTextColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionMonthSubheadColor()), colorScheme.getOnSurfaceVariant(), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getDateTodayContainerOutlineColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionActiveIndicatorContainerColor()), ColorScheme2.fromToken(colorScheme, datePickerModalTokens.getSelectionDateInRangeLabelTextColor()), ColorScheme2.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3_release(datePickerColors);
            defaultDatePickerColorsCached = datePickerColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColorsCached;
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yMMMM";
        }
        if ((i & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    public final DatePickerFormatter dateFormatter(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new DatePickerFormatterImpl(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: DatePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5826DatePickerTitlehOD91z4(final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        DisplayMode.Companion companion;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(327413563);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(327413563, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
                }
                companion = DisplayMode.INSTANCE;
                if (!DisplayMode.m5844equalsimpl0(i, companion.m5849getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(406439148);
                    Strings.Companion companion2 = Strings.INSTANCE;
                    TextKt.m6028Text4IGK_g(Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_picker_title), composerStartRestartGroup, 0), modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, i4 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m5844equalsimpl0(i, companion.m5848getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(406443211);
                    Strings.Companion companion3 = Strings.INSTANCE;
                    TextKt.m6028Text4IGK_g(Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_title), composerStartRestartGroup, 0), modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, i4 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-285079389);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        this.$tmp0_rcvr.m5826DatePickerTitlehOD91z4(i, modifier3, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            companion = DisplayMode.INSTANCE;
            if (!DisplayMode.m5844equalsimpl0(i, companion.m5849getPickerjFl4v0())) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: DatePickerHeadline-3kbWawI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5825DatePickerHeadline3kbWawI(final Long l, final int i, final DatePickerFormatter datePickerFormatter, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        String date$default;
        String date;
        DisplayMode.Companion companion;
        final String str;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1502835813);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1502835813, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
                }
                Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
                date$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l, localeDefaultLocale, false, 4, null);
                date = datePickerFormatter.formatDate(l, localeDefaultLocale, true);
                composerStartRestartGroup.startReplaceGroup(1148835145);
                String strM6095getString2EP1pXo = "";
                if (date == null) {
                    DisplayMode.Companion companion2 = DisplayMode.INSTANCE;
                    if (DisplayMode.m5844equalsimpl0(i, companion2.m5849getPickerjFl4v0())) {
                        composerStartRestartGroup.startReplaceGroup(1148842944);
                        Strings.Companion companion3 = Strings.INSTANCE;
                        date = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_picker_no_selection_description), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (DisplayMode.m5844equalsimpl0(i, companion2.m5848getInputjFl4v0())) {
                        composerStartRestartGroup.startReplaceGroup(1148845915);
                        Strings.Companion companion4 = Strings.INSTANCE;
                        date = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_no_input_description), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1254558033);
                        composerStartRestartGroup.endReplaceGroup();
                        date = "";
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1148850481);
                if (date$default == null) {
                    DisplayMode.Companion companion5 = DisplayMode.INSTANCE;
                    if (DisplayMode.m5844equalsimpl0(i, companion5.m5849getPickerjFl4v0())) {
                        composerStartRestartGroup.startReplaceGroup(1148853330);
                        Strings.Companion companion6 = Strings.INSTANCE;
                        date$default = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_picker_headline), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (DisplayMode.m5844equalsimpl0(i, companion5.m5848getInputjFl4v0())) {
                        composerStartRestartGroup.startReplaceGroup(1148855857);
                        Strings.Companion companion7 = Strings.INSTANCE;
                        date$default = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_headline), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1254856625);
                        composerStartRestartGroup.endReplaceGroup();
                        date$default = "";
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                companion = DisplayMode.INSTANCE;
                if (!DisplayMode.m5844equalsimpl0(i, companion.m5849getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148862013);
                    Strings.Companion companion8 = Strings.INSTANCE;
                    strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_picker_headline_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m5844equalsimpl0(i, companion.m5848getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148864764);
                    Strings.Companion companion9 = Strings.INSTANCE;
                    strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_date_input_headline_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1255139345);
                    composerStartRestartGroup.endReplaceGroup();
                }
                str = String.format(strM6095getString2EP1pXo, Arrays.copyOf(new Object[]{date}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m7495setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m7471getPolite0phEisY());
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier3;
                TextKt.m6028Text4IGK_g(date$default, SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 3072, 122876);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        this.$tmp9_rcvr.m5825DatePickerHeadline3kbWawI(l, i, datePickerFormatter, modifier2, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Locale localeDefaultLocale2 = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            date$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l, localeDefaultLocale2, false, 4, null);
            date = datePickerFormatter.formatDate(l, localeDefaultLocale2, true);
            composerStartRestartGroup.startReplaceGroup(1148835145);
            String strM6095getString2EP1pXo2 = "";
            if (date == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1148850481);
            if (date$default == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            companion = DisplayMode.INSTANCE;
            if (!DisplayMode.m5844equalsimpl0(i, companion.m5849getPickerjFl4v0())) {
            }
            str = String.format(strM6095getString2EP1pXo2, Arrays.copyOf(new Object[]{date}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            zChanged = composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m7495setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m7471getPolite0phEisY());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composer2 = composerStartRestartGroup;
                Modifier modifier42 = modifier3;
                TextKt.m6028Text4IGK_g(date$default, SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 3072, 122876);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpec3.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4) | composer.changed(decayAnimationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final SnapLayoutInfoProvider snapLayoutInfoProviderSnapLayoutInfoProvider$default = LazyListSnapLayoutInfoProvider2.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            objRememberedValue = SnapFlingBehavior7.snapFlingBehavior(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float velocity, float decayOffset) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float velocity) {
                    return snapLayoutInfoProviderSnapLayoutInfoProvider$default.calculateSnapOffset(velocity);
                }
            }, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final PrimitiveRanges2 getYearRange() {
        return YearRange;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m5828getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    @JvmName
    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        Shape value = Shapes5.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }
}
