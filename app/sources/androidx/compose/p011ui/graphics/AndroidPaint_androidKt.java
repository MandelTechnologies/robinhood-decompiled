package androidx.compose.p011ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\u000e\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\"\u0010 \u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010#\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010\r\u001a\u0017\u0010$\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b$\u0010\u0015\u001a\u001f\u0010%\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u0017\u001a\u0017\u0010'\u001a\u00020&*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b'\u0010(\u001a\"\u0010*\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010\r\u001a\u0017\u0010,\u001a\u00020+*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b,\u0010(\u001a\"\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010\r\u001a\u0017\u0010/\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b/\u0010\u0015\u001a\u001f\u00100\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b0\u0010\u0017\u001a\u0017\u00102\u001a\u000201*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b2\u0010(\u001a\"\u00104\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u000201H\u0000ø\u0001\u0000¢\u0006\u0004\b3\u0010\r\u001a'\u00107\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u0010\u001a\n\u0018\u000105j\u0004\u0018\u0001`6H\u0000¢\u0006\u0004\b7\u00108\u001a!\u0010:\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b:\u0010;*\n\u0010<\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m3636d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "asComposePaint", "(Landroid/graphics/Paint;)Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getNativeAlpha", "(Landroid/graphics/Paint;)F", "setNativeAlpha", "(Landroid/graphics/Paint;F)V", "", "setNativeAntiAlias", "(Landroid/graphics/Paint;Z)V", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "(Landroid/graphics/Paint;)I", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/PathEffect;)V", "NativePaint", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: AndroidPaint.android.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m6622setNativeBlendModeGB0RdKg(Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m6876setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m6594toPorterDuffModes9anfk8(i)));
        }
    }

    public static final void setNativeColorFilter(Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    public static final float getNativeAlpha(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final void setNativeAlpha(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    public static final long getNativeColor(Paint paint) {
        return Color2.Color(paint.getColor());
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m6623setNativeColor4WTKRHQ(Paint paint, long j) {
        paint.setColor(Color2.m6735toArgb8_81llA(j));
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m6627setNativeStyle5YerkU(Paint paint, int i) {
        paint.setStyle(PaintingStyle.m6801equalsimpl0(i, PaintingStyle.INSTANCE.m6803getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final float getNativeStrokeWidth(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void setNativeStrokeWidth(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final int getNativeStrokeCap(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return StrokeCap.INSTANCE.m6848getButtKaPHkGw();
        }
        if (i == 2) {
            return StrokeCap.INSTANCE.m6849getRoundKaPHkGw();
        }
        if (i == 3) {
            return StrokeCap.INSTANCE.m6850getSquareKaPHkGw();
        }
        return StrokeCap.INSTANCE.m6848getButtKaPHkGw();
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m6625setNativeStrokeCapCSYIeUk(Paint paint, int i) {
        Paint.Cap cap;
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        if (StrokeCap.m6845equalsimpl0(i, companion.m6850getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m6845equalsimpl0(i, companion.m6849getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = StrokeCap.m6845equalsimpl0(i, companion.m6848getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final int getNativeStrokeJoin(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return StrokeJoin.INSTANCE.m6856getMiterLxFBmk8();
        }
        if (i == 2) {
            return StrokeJoin.INSTANCE.m6855getBevelLxFBmk8();
        }
        if (i == 3) {
            return StrokeJoin.INSTANCE.m6857getRoundLxFBmk8();
        }
        return StrokeJoin.INSTANCE.m6856getMiterLxFBmk8();
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m6626setNativeStrokeJoinkLtJ_vA(Paint paint, int i) {
        Paint.Join join;
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        if (StrokeJoin.m6852equalsimpl0(i, companion.m6856getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m6852equalsimpl0(i, companion.m6855getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else {
            join = StrokeJoin.m6852equalsimpl0(i, companion.m6857getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final float getNativeStrokeMiterLimit(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final void setNativeStrokeMiterLimit(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final int getNativeFilterQuality(Paint paint) {
        if (!paint.isFilterBitmap()) {
            return FilterQuality.INSTANCE.m6756getNonefv9h1I();
        }
        return FilterQuality.INSTANCE.m6755getLowfv9h1I();
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m6624setNativeFilterQuality50PEsBU(Paint paint, int i) {
        paint.setFilterBitmap(!FilterQuality.m6752equalsimpl0(i, FilterQuality.INSTANCE.m6756getNonefv9h1I()));
    }

    public static final void setNativeShader(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void setNativePathEffect(Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }
}
