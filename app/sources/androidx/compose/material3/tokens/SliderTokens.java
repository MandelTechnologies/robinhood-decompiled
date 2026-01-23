package androidx.compose.material3.tokens;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SliderTokens.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010 \u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014R\u0017\u0010\"\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u0017\u0010$\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010(\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010,\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u0010.\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00102\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u0017\u00104\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001d\u00106\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u00108\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001dR\u0017\u0010:\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010\u001dR\u0017\u0010<\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b<\u0010\u001b\u001a\u0004\b=\u0010\u001dR\u001d\u0010>\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010@\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\bA\u0010\u0014R\u001d\u0010B\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010D\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bD\u0010\u001b\u001a\u0004\bE\u0010\u001dR\u001d\u0010F\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010H\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010\u001dR\u001a\u0010J\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010L\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bL\u0010\u001b\u001a\u0004\bM\u0010\u001dR\u001d\u0010N\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010P\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bP\u0010\u0012\u001a\u0004\bQ\u0010\u0014R\u0017\u0010R\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bR\u0010\u001b\u001a\u0004\bS\u0010\u001dR\u0017\u0010T\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bT\u0010\u001b\u001a\u0004\bU\u0010\u001dR\u0017\u0010V\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bV\u0010\u001b\u001a\u0004\bW\u0010\u001dR\u0017\u0010X\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bX\u0010\u001b\u001a\u0004\bY\u0010\u001dR\u001d\u0010Z\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010\\\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\\\u0010\u001b\u001a\u0004\b]\u0010\u001dR\u0017\u0010^\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b^\u0010\u001b\u001a\u0004\b_\u0010\u001dR\u0017\u0010`\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b`\u0010\u001b\u001a\u0004\ba\u0010\u001dR\u0017\u0010b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bb\u0010\u001b\u001a\u0004\bc\u0010\u001dR\u0017\u0010d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bd\u0010\u001b\u001a\u0004\be\u0010\u001dR\u0017\u0010f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bf\u0010\u0012\u001a\u0004\bg\u0010\u0014R\u001d\u0010h\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bi\u0010\bR\u001d\u0010j\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u001d\u0010l\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010n\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bn\u0010\u001b\u001a\u0004\bo\u0010\u001dR\u0017\u0010p\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bp\u0010\u001b\u001a\u0004\bq\u0010\u001dR\u0017\u0010s\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006w"}, m3636d2 = {"Landroidx/compose/material3/tokens/SliderTokens;", "", "<init>", "()V", "", "ActiveContainerOpacity", "F", "getActiveContainerOpacity", "()F", "Landroidx/compose/ui/unit/Dp;", "ActiveHandleHeight", "getActiveHandleHeight-D9Ej5fM", "ActiveHandleLeadingSpace", "getActiveHandleLeadingSpace-D9Ej5fM", "ActiveHandlePadding", "getActiveHandlePadding-D9Ej5fM", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveHandleShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveHandleShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveHandleTrailingSpace", "getActiveHandleTrailingSpace-D9Ej5fM", "ActiveHandleWidth", "getActiveHandleWidth-D9Ej5fM", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveTrackColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveTrackColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveTrackHeight", "getActiveTrackHeight-D9Ej5fM", "ActiveTrackShape", "getActiveTrackShape", "ActiveTrackShapeLeading", "getActiveTrackShapeLeading", "DisabledActiveTrackColor", "getDisabledActiveTrackColor", "DisabledActiveTrackOpacity", "getDisabledActiveTrackOpacity", "DisabledHandleColor", "getDisabledHandleColor", "DisabledHandleOpacity", "getDisabledHandleOpacity", "DisabledHandleWidth", "getDisabledHandleWidth-D9Ej5fM", "DisabledInactiveTrackColor", "getDisabledInactiveTrackColor", "DisabledInactiveTrackOpacity", "getDisabledInactiveTrackOpacity", "DisabledStopColor", "getDisabledStopColor", "FocusActiveTrackColor", "getFocusActiveTrackColor", "FocusHandleWidth", "getFocusHandleWidth-D9Ej5fM", "FocusInactiveTrackColor", "getFocusInactiveTrackColor", "FocusStopColor", "getFocusStopColor", "HandleColor", "getHandleColor", "HandleHeight", "getHandleHeight-D9Ej5fM", "HandleShape", "getHandleShape", "HandleWidth", "getHandleWidth-D9Ej5fM", "HoverHandleColor", "getHoverHandleColor", "HoverHandleWidth", "getHoverHandleWidth-D9Ej5fM", "HoverStopColor", "getHoverStopColor", "InactiveContainerOpacity", "getInactiveContainerOpacity", "InactiveTrackColor", "getInactiveTrackColor", "InactiveTrackHeight", "getInactiveTrackHeight-D9Ej5fM", "InactiveTrackShape", "getInactiveTrackShape", "LabelContainerColor", "getLabelContainerColor", "LabelTextColor", "getLabelTextColor", "PressedActiveTrackColor", "getPressedActiveTrackColor", "PressedHandleColor", "getPressedHandleColor", "PressedHandleWidth", "getPressedHandleWidth-D9Ej5fM", "PressedInactiveTrackColor", "getPressedInactiveTrackColor", "PressedStopColor", "getPressedStopColor", "SliderActiveHandleColor", "getSliderActiveHandleColor", "StopIndicatorColor", "getStopIndicatorColor", "StopIndicatorColorSelected", "getStopIndicatorColorSelected", "StopIndicatorShape", "getStopIndicatorShape", "StopIndicatorSize", "getStopIndicatorSize-D9Ej5fM", "StopIndicatorTrailingSpace", "getStopIndicatorTrailingSpace-D9Ej5fM", "ValueIndicatorActiveBottomSpace", "getValueIndicatorActiveBottomSpace-D9Ej5fM", "ValueIndicatorContainerColor", "getValueIndicatorContainerColor", "ValueIndicatorLabelTextColor", "getValueIndicatorLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ValueIndicatorLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getValueIndicatorLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SliderTokens {
    private static final float ActiveHandleHeight;
    private static final float ActiveHandleLeadingSpace;
    private static final float ActiveHandlePadding;
    private static final ShapeKeyTokens ActiveHandleShape;
    private static final float ActiveHandleTrailingSpace;
    private static final float ActiveHandleWidth;
    private static final ColorSchemeKeyTokens ActiveTrackColor;
    private static final float ActiveTrackHeight;
    private static final ShapeKeyTokens ActiveTrackShape;
    private static final ShapeKeyTokens ActiveTrackShapeLeading;
    private static final ColorSchemeKeyTokens DisabledActiveTrackColor;
    private static final float DisabledActiveTrackOpacity;
    private static final ColorSchemeKeyTokens DisabledHandleColor;
    private static final float DisabledHandleOpacity;
    private static final float DisabledHandleWidth;
    private static final ColorSchemeKeyTokens DisabledInactiveTrackColor;
    private static final float DisabledInactiveTrackOpacity;
    private static final ColorSchemeKeyTokens DisabledStopColor;
    private static final ColorSchemeKeyTokens FocusActiveTrackColor;
    private static final float FocusHandleWidth;
    private static final ColorSchemeKeyTokens FocusInactiveTrackColor;
    private static final ColorSchemeKeyTokens FocusStopColor;
    private static final ColorSchemeKeyTokens HandleColor;
    private static final float HandleHeight;
    private static final ShapeKeyTokens HandleShape;
    private static final float HandleWidth;
    private static final ColorSchemeKeyTokens HoverHandleColor;
    private static final float HoverHandleWidth;
    private static final ColorSchemeKeyTokens HoverStopColor;
    private static final float InactiveContainerOpacity;
    private static final ColorSchemeKeyTokens InactiveTrackColor;
    private static final float InactiveTrackHeight;
    private static final ShapeKeyTokens InactiveTrackShape;
    private static final ColorSchemeKeyTokens LabelContainerColor;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final ColorSchemeKeyTokens PressedActiveTrackColor;
    private static final ColorSchemeKeyTokens PressedHandleColor;
    private static final float PressedHandleWidth;
    private static final ColorSchemeKeyTokens PressedInactiveTrackColor;
    private static final ColorSchemeKeyTokens PressedStopColor;
    private static final ColorSchemeKeyTokens SliderActiveHandleColor;
    private static final ColorSchemeKeyTokens StopIndicatorColor;
    private static final ColorSchemeKeyTokens StopIndicatorColorSelected;
    private static final ShapeKeyTokens StopIndicatorShape;
    private static final float StopIndicatorSize;
    private static final float StopIndicatorTrailingSpace;
    private static final float ValueIndicatorActiveBottomSpace;
    private static final ColorSchemeKeyTokens ValueIndicatorContainerColor;
    private static final ColorSchemeKeyTokens ValueIndicatorLabelTextColor;
    private static final TypographyKeyTokens ValueIndicatorLabelTextFont;
    public static final SliderTokens INSTANCE = new SliderTokens();
    private static final float ActiveContainerOpacity = 1.0f;

    private SliderTokens() {
    }

    static {
        float f = (float) 44.0d;
        ActiveHandleHeight = C2002Dp.m7995constructorimpl(f);
        float f2 = (float) 6.0d;
        ActiveHandleLeadingSpace = C2002Dp.m7995constructorimpl(f2);
        ActiveHandlePadding = C2002Dp.m7995constructorimpl(f2);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveHandleShape = shapeKeyTokens;
        ActiveHandleTrailingSpace = C2002Dp.m7995constructorimpl(f2);
        float f3 = (float) 4.0d;
        ActiveHandleWidth = C2002Dp.m7995constructorimpl(f3);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        float f4 = (float) 16.0d;
        ActiveTrackHeight = C2002Dp.m7995constructorimpl(f4);
        ActiveTrackShape = shapeKeyTokens;
        ActiveTrackShapeLeading = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledActiveTrackOpacity = 0.38f;
        DisabledHandleColor = colorSchemeKeyTokens2;
        DisabledHandleOpacity = 0.38f;
        DisabledHandleWidth = C2002Dp.m7995constructorimpl(f3);
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        DisabledInactiveTrackOpacity = 0.12f;
        DisabledStopColor = colorSchemeKeyTokens2;
        FocusActiveTrackColor = colorSchemeKeyTokens;
        float f5 = (float) 2.0d;
        FocusHandleWidth = C2002Dp.m7995constructorimpl(f5);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.SecondaryContainer;
        FocusInactiveTrackColor = colorSchemeKeyTokens3;
        FocusStopColor = colorSchemeKeyTokens;
        HandleColor = colorSchemeKeyTokens;
        HandleHeight = C2002Dp.m7995constructorimpl(f);
        HandleShape = shapeKeyTokens;
        HandleWidth = C2002Dp.m7995constructorimpl(f3);
        HoverHandleColor = colorSchemeKeyTokens;
        HoverHandleWidth = C2002Dp.m7995constructorimpl(f3);
        HoverStopColor = colorSchemeKeyTokens;
        InactiveContainerOpacity = 1.0f;
        InactiveTrackColor = colorSchemeKeyTokens3;
        InactiveTrackHeight = C2002Dp.m7995constructorimpl(f4);
        InactiveTrackShape = shapeKeyTokens;
        LabelContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.InverseOnSurface;
        LabelTextColor = colorSchemeKeyTokens4;
        PressedActiveTrackColor = colorSchemeKeyTokens;
        PressedHandleColor = colorSchemeKeyTokens;
        PressedHandleWidth = C2002Dp.m7995constructorimpl(f5);
        PressedInactiveTrackColor = colorSchemeKeyTokens3;
        PressedStopColor = colorSchemeKeyTokens;
        SliderActiveHandleColor = colorSchemeKeyTokens;
        StopIndicatorColor = colorSchemeKeyTokens3;
        StopIndicatorColorSelected = colorSchemeKeyTokens3;
        StopIndicatorShape = shapeKeyTokens;
        StopIndicatorSize = C2002Dp.m7995constructorimpl(f3);
        StopIndicatorTrailingSpace = C2002Dp.m7995constructorimpl(f2);
        ValueIndicatorActiveBottomSpace = C2002Dp.m7995constructorimpl((float) 12.0d);
        ValueIndicatorContainerColor = ColorSchemeKeyTokens.InverseSurface;
        ValueIndicatorLabelTextColor = colorSchemeKeyTokens4;
        ValueIndicatorLabelTextFont = TypographyKeyTokens.LabelLarge;
    }

    /* renamed from: getActiveHandleLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m6287getActiveHandleLeadingSpaceD9Ej5fM() {
        return ActiveHandleLeadingSpace;
    }

    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return ActiveTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return DisabledActiveTrackColor;
    }

    public final float getDisabledActiveTrackOpacity() {
        return DisabledActiveTrackOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return DisabledHandleColor;
    }

    public final float getDisabledHandleOpacity() {
        return DisabledHandleOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return DisabledInactiveTrackColor;
    }

    public final float getDisabledInactiveTrackOpacity() {
        return DisabledInactiveTrackOpacity;
    }

    public final ColorSchemeKeyTokens getHandleColor() {
        return HandleColor;
    }

    /* renamed from: getHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m6288getHandleHeightD9Ej5fM() {
        return HandleHeight;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* renamed from: getHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m6289getHandleWidthD9Ej5fM() {
        return HandleWidth;
    }

    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return InactiveTrackColor;
    }

    /* renamed from: getInactiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m6290getInactiveTrackHeightD9Ej5fM() {
        return InactiveTrackHeight;
    }

    /* renamed from: getStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m6291getStopIndicatorSizeD9Ej5fM() {
        return StopIndicatorSize;
    }
}
