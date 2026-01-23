package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Card.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJN\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJN\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u0015J:\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0019\u0010#\u001a\u00020\"2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010,\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0018\u00100\u001a\u00020\u0013*\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u00020\u0013*\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0018\u00104\u001a\u00020\u0013*\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m3636d2 = {"Landroidx/compose/material3/CardDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/CardElevation;", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "cardElevation", "elevatedCardElevation-aqJV_2Y", "elevatedCardElevation", "outlinedCardElevation-aqJV_2Y", "outlinedCardElevation", "Landroidx/compose/material3/CardColors;", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "elevatedCardColors", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "", "enabled", "Landroidx/compose/foundation/BorderStroke;", "outlinedCardBorder", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getElevatedShape", "elevatedShape", "getOutlinedShape", "outlinedShape", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultCardColors", "getDefaultElevatedCardColors$material3_release", "defaultElevatedCardColors", "getDefaultOutlinedCardColors$material3_release", "defaultOutlinedCardColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @JvmName
    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape value = Shapes5.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @JvmName
    public final Shape getElevatedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape value = Shapes5.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @JvmName
    public final Shape getOutlinedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape value = Shapes5.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m5730cardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = FilledCardTokens.INSTANCE.m6206getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = FilledCardTokens.INSTANCE.m6211getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = FilledCardTokens.INSTANCE.m6209getFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = FilledCardTokens.INSTANCE.m6210getHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = FilledCardTokens.INSTANCE.m6208getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = FilledCardTokens.INSTANCE.m6207getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m5731elevatedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = ElevatedCardTokens.INSTANCE.m6182getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = ElevatedCardTokens.INSTANCE.m6187getPressedContainerElevationD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = ElevatedCardTokens.INSTANCE.m6185getFocusContainerElevationD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = ElevatedCardTokens.INSTANCE.m6186getHoverContainerElevationD9Ej5fM();
        }
        if ((i2 & 16) != 0) {
            f5 = ElevatedCardTokens.INSTANCE.m6184getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = ElevatedCardTokens.INSTANCE.m6183getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m5733outlinedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = OutlinedCardTokens.INSTANCE.m6222getContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = f;
        }
        if ((i2 & 4) != 0) {
            f3 = f;
        }
        if ((i2 & 8) != 0) {
            f4 = f;
        }
        if ((i2 & 16) != 0) {
            f5 = OutlinedCardTokens.INSTANCE.m6224getDraggedContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = OutlinedCardTokens.INSTANCE.m6223getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation;
    }

    public final CardColors cardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCardColors$material3_release;
    }

    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m5729cardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long jM6705copywmQWz5c$default;
        long jM6726getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM5779contentColorForek8zF_U = (i2 & 2) != 0 ? ColorScheme2.m5779contentColorForek8zF_U(jM6726getUnspecified0d7_KjU, composer, i & 14) : j2;
        long jM6726getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        if ((i2 & 8) != 0) {
            long j6 = jM5779contentColorForek8zF_U;
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j5 = j6;
        } else {
            j5 = jM5779contentColorForek8zF_U;
            jM6705copywmQWz5c$default = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM5728copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5728copyjRlVdoo(jM6726getUnspecified0d7_KjU, j5, jM6726getUnspecified0d7_KjU2, jM6705copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM5728copyjRlVdoo;
    }

    public final CardColors getDefaultCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorScheme2.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), filledCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledCardTokens.getContainerColor())), Color.m6705copywmQWz5c$default(ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors elevatedCardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedCardColors$material3_release;
    }

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached = colorScheme.getDefaultElevatedCardColorsCached();
        if (defaultElevatedCardColorsCached != null) {
            return defaultElevatedCardColorsCached;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorScheme2.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), elevatedCardTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor())), Color.m6705copywmQWz5c$default(ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors outlinedCardColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedCardColors$material3_release;
    }

    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m5732outlinedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long jM6726getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM5779contentColorForek8zF_U = (i2 & 2) != 0 ? ColorScheme2.m5779contentColorForek8zF_U(jM6726getUnspecified0d7_KjU, composer, i & 14) : j2;
        long jM6726getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        long jM6705copywmQWz5c$default = (i2 & 8) != 0 ? Color.m6705copywmQWz5c$default(ColorScheme2.m5779contentColorForek8zF_U(jM6726getUnspecified0d7_KjU, composer, i & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM5728copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5728copyjRlVdoo(jM6726getUnspecified0d7_KjU, jM5779contentColorForek8zF_U, jM6726getUnspecified0d7_KjU2, jM6705copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColorsM5728copyjRlVdoo;
    }

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached = colorScheme.getDefaultOutlinedCardColorsCached();
        if (defaultOutlinedCardColorsCached != null) {
            return defaultOutlinedCardColorsCached;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
        CardColors cardColors = new CardColors(ColorScheme2.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorScheme2.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m6705copywmQWz5c$default(ColorScheme2.m5778contentColorFor4WTKRHQ(colorScheme, ColorScheme2.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i, int i2) {
        long jM6732compositeOverOWjLjI;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z) {
            composer.startReplaceGroup(-134409770);
            jM6732compositeOverOWjLjI = ColorScheme2.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            jM6732compositeOverOWjLjI = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(ColorScheme2.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM6732compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStroke2.m4886BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m6225getOutlineWidthD9Ej5fM(), jM6732compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }
}
