package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: ProgressIndicator.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R&\u0010\u001c\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\u0013R&\u0010\u001f\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u0013R&\u0010\"\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u0013R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010-\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010/\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0017\u00101\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0017\u00103\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, m3636d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Landroidx/compose/ui/unit/Dp;", "stopSize", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "drawStopIndicator-EgI2THU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJI)V", "drawStopIndicator", "CircularStrokeWidth", "F", "getCircularStrokeWidth-D9Ej5fM", "()F", "LinearStrokeCap", "I", "getLinearStrokeCap-KaPHkGw", "()I", "CircularDeterminateStrokeCap", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularIndeterminateStrokeCap", "getCircularIndeterminateStrokeCap-KaPHkGw", "LinearTrackStopIndicatorSize", "getLinearTrackStopIndicatorSize-D9Ej5fM", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "getLinearIndicatorTrackGapSize-D9Ej5fM", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "getCircularIndicatorTrackGapSize-D9Ej5fM", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "Landroidx/compose/animation/core/SpringSpec;", "", "ProgressAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getLinearColor", "(Landroidx/compose/runtime/Composer;I)J", "linearColor", "getCircularColor", "circularColor", "getLinearTrackColor", "linearTrackColor", "getCircularIndeterminateTrackColor", "circularIndeterminateTrackColor", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ProgressIndicatorDefaults {
    private static final int CircularDeterminateStrokeCap;
    private static final int CircularIndeterminateStrokeCap;
    private static final float CircularIndicatorTrackGapSize;
    private static final float CircularStrokeWidth;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float LinearIndicatorTrackGapSize;
    private static final int LinearStrokeCap;
    private static final float LinearTrackStopIndicatorSize;
    private static final SpringSpec<Float> ProgressAnimationSpec;

    private ProgressIndicatorDefaults() {
    }

    @JvmName
    public final long getLinearColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long value = ColorScheme2.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @JvmName
    public final long getCircularColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long value = ColorScheme2.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @JvmName
    public final long getLinearTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long value = ColorScheme2.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @JvmName
    public final long getCircularIndeterminateTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM6725getTransparent0d7_KjU;
    }

    static {
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.INSTANCE;
        CircularStrokeWidth = progressIndicatorTokens.m6281getTrackThicknessD9Ej5fM();
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        LinearStrokeCap = companion.m6849getRoundKaPHkGw();
        CircularDeterminateStrokeCap = companion.m6849getRoundKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m6849getRoundKaPHkGw();
        LinearTrackStopIndicatorSize = progressIndicatorTokens.m6280getStopSizeD9Ej5fM();
        LinearIndicatorTrackGapSize = progressIndicatorTokens.m6278getActiveTrackSpaceD9Ej5fM();
        CircularIndicatorTrackGapSize = progressIndicatorTokens.m6278getActiveTrackSpaceD9Ej5fM();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m5918getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m5920getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m5917getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m5921getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m5919getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: drawStopIndicator-EgI2THU, reason: not valid java name */
    public final void m5916drawStopIndicatorEgI2THU(DrawScope drawScope, float stopSize, long color, int strokeCap) {
        float fMin = Math.min(drawScope.mo5016toPx0680j_4(stopSize), Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()));
        float fM6580getHeightimpl = (Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) - fMin) / 2;
        if (StrokeCap.m6845equalsimpl0(strokeCap, StrokeCap.INSTANCE.m6849getRoundKaPHkGw())) {
            float f = fMin / 2.0f;
            DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, color, f, OffsetKt.Offset((Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()) - f) - fM6580getHeightimpl, Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) / 2.0f), 0.0f, null, null, 0, 120, null);
        } else {
            DrawScope.m6958drawRectnJ9OG0$default(drawScope, color, OffsetKt.Offset((Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()) - fMin) - fM6580getHeightimpl, (Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()) - fMin) / 2.0f), SizeKt.Size(fMin, fMin), 0.0f, null, null, 0, 120, null);
        }
    }
}
