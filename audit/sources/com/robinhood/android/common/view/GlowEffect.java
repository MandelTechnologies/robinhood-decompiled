package com.robinhood.android.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.system.CloseGuard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: GlowEffect.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00060\u0001j\u0002`\u0002:\u00011B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/common/view/GlowEffect;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "width", "", "height", "scale", "", "radius", "renderScript", "Landroid/renderscript/RenderScript;", "<init>", "(IIFFLandroid/renderscript/RenderScript;)V", "getWidth", "()I", "getHeight", "getScale", "()F", "getRadius", "sourceBounds", "Landroid/graphics/Rect;", "scaledBounds", "bitmapBounds", "outBitmap", "Landroid/graphics/Bitmap;", "outAllocation", "Landroid/renderscript/Allocation;", "sourceBitmap", "blur", "Landroid/renderscript/ScriptIntrinsicBlur;", "kotlin.jvm.PlatformType", "closeGuard", "Lcom/robinhood/utils/system/CloseGuard;", "closed", "", "bitmapPaint", "Landroid/graphics/Paint;", "getBitmapPaint", "()Landroid/graphics/Paint;", "sourceCanvas", "Landroid/graphics/Canvas;", "getSourceCanvas", "()Landroid/graphics/Canvas;", "clear", "", "drawGlow", "targetCanvas", "close", "finalize", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GlowEffect implements AutoCloseable {
    private static final int STRIDE = 16;
    private final Rect bitmapBounds;
    private final Paint bitmapPaint;
    private final ScriptIntrinsicBlur blur;
    private final CloseGuard closeGuard;
    private boolean closed;
    private final int height;
    private final Allocation outAllocation;
    private final Bitmap outBitmap;
    private final float radius;
    private final RenderScript renderScript;
    private final float scale;
    private final Rect scaledBounds;
    private final Bitmap sourceBitmap;
    private final Rect sourceBounds;
    private final Canvas sourceCanvas;
    private final int width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ GlowEffect(int i, int i2, float f, float f2, RenderScript renderScript, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2, renderScript);
    }

    private GlowEffect(int i, int i2, float f, float f2, RenderScript renderScript) {
        this.width = i;
        this.height = i2;
        this.scale = f;
        this.radius = f2;
        this.renderScript = renderScript;
        Rect rect = new Rect();
        rect.right = i;
        rect.bottom = i2;
        this.sourceBounds = rect;
        Rect rect2 = new Rect(rect);
        rect2.right = (int) (i / f);
        rect2.bottom = (int) (i2 / f);
        this.scaledBounds = rect2;
        Rect rect3 = new Rect(rect2);
        Companion companion = INSTANCE;
        rect3.right = companion.alignToStride(rect3.right);
        int iAlignToStride = companion.alignToStride(rect3.bottom);
        rect3.bottom = iAlignToStride;
        this.bitmapBounds = rect3;
        int i3 = rect3.right;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, iAlignToStride, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.outBitmap = bitmapCreateBitmap;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
        Intrinsics.checkNotNull(allocationCreateFromBitmap);
        this.outAllocation = allocationCreateFromBitmap;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rect3.right, rect3.bottom, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
        this.sourceBitmap = bitmapCreateBitmap2;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.setRadius(RangesKt.coerceIn(f2, 1.0f, 25.0f));
        this.blur = scriptIntrinsicBlurCreate;
        CloseGuard closeGuard = CloseGuard.INSTANCE.get();
        closeGuard.open("GlowEffect");
        this.closeGuard = closeGuard;
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, 2.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.bitmapPaint = paint;
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.scale(1.0f / f, 1.0f / f);
        this.sourceCanvas = canvas;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final Paint getBitmapPaint() {
        return this.bitmapPaint;
    }

    public final Canvas getSourceCanvas() {
        return this.sourceCanvas;
    }

    public final void clear() {
        this.sourceCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public final void drawGlow(Canvas targetCanvas) {
        Intrinsics.checkNotNullParameter(targetCanvas, "targetCanvas");
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.renderScript, this.sourceBitmap);
        try {
            this.blur.setInput(allocationCreateFromBitmap);
            this.blur.forEach(this.outAllocation);
            this.outAllocation.copyTo(this.outBitmap);
            Unit unit = Unit.INSTANCE;
            allocationCreateFromBitmap.destroy();
            targetCanvas.drawBitmap(this.outBitmap, this.scaledBounds, this.sourceBounds, this.bitmapPaint);
        } catch (Throwable th) {
            allocationCreateFromBitmap.destroy();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.outBitmap.recycle();
        this.sourceBitmap.recycle();
        this.outAllocation.destroy();
        this.blur.destroy();
        if (Build.VERSION.SDK_INT <= 26) {
            this.renderScript.destroy();
        }
        this.closeGuard.close();
    }

    protected final void finalize() {
        this.closeGuard.warnIfOpen();
        close();
    }

    /* compiled from: GlowEffect.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002J0\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/view/GlowEffect$Companion;", "", "<init>", "()V", "STRIDE", "", "alignToStride", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/view/GlowEffect;", "context", "Landroid/content/Context;", "width", "height", "scale", "", "radius", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int alignToStride(int i) {
            double d = 16;
            return (int) (Math.ceil(i / d) * d);
        }

        public final GlowEffect create(Context context, int width, int height, float scale, float radius) {
            RenderScript renderScriptCreate;
            Intrinsics.checkNotNullParameter(context, "context");
            if (width < 16 || width < scale || height < 16 || height < scale || scale < 1.0f || radius <= 0.0f) {
                return null;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i != 24 && i != 25) {
                    renderScriptCreate = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
                } else {
                    renderScriptCreate = RenderScript.create(context);
                }
                RenderScript renderScript = renderScriptCreate;
                Intrinsics.checkNotNull(renderScript);
                return new GlowEffect(width, height, scale, radius, renderScript, null);
            } catch (RSRuntimeException unused) {
                return null;
            }
        }
    }
}
