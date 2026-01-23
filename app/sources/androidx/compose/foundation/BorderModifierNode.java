package androidx.compose.foundation;

import androidx.compose.p011ui.draw.CacheDrawModifierNode;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Canvas3;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.ImageBitmap2;
import androidx.compose.p011ui.graphics.ImageBitmap3;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathOperation;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Border.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m3636d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo5016toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m6582getMinDimensionimpl(cacheDrawScope.m6459getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f2 = 2;
                float fMin = Math.min(C2002Dp.m7997equalsimpl0(this.this$0.getWidth(), C2002Dp.INSTANCE.m8002getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo5016toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m6582getMinDimensionimpl(cacheDrawScope.m6459getSizeNHjbRc()) / f2));
                float f3 = fMin / f2;
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m6459getSizeNHjbRc() >> 32)) - fMin) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m6459getSizeNHjbRc() & 4294967295L)) - fMin)));
                boolean z = f2 * fMin > Size.m6582getMinDimensionimpl(cacheDrawScope.m6459getSizeNHjbRc());
                Outline outlineMo4911createOutlinePq9zytI = this.this$0.getShape().mo4911createOutlinePq9zytI(cacheDrawScope.m6459getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo4911createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo4911createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo4911createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m4882drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo4911createOutlinePq9zytI, jM6535constructorimpl, jM6575constructorimpl, z, fMin);
                }
                if (outlineMo4911createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m4879drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jM6535constructorimpl, jM6575constructorimpl, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m4884setWidth0680j_4(float f) {
        if (C2002Dp.m7997equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) throws Throwable {
        int iM6773getArgb8888_sVssgQ;
        ColorFilter colorFilterM6729tintxETnrds$default;
        Rect rect;
        BorderCache borderCache;
        Ref.ObjectRef objectRef;
        ImageBitmap imageBitmap;
        Canvas canvas;
        CanvasDrawScope canvasDrawScope;
        CanvasDrawScope canvasDrawScope2;
        float f2;
        float f3;
        float f4;
        float f5;
        DrawContext drawContext;
        long jMo6936getSizeNHjbRc;
        DrawContext drawContext2;
        long j;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.m6954drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM6773getArgb8888_sVssgQ = ImageBitmap2.INSTANCE.m6772getAlpha8_sVssgQ();
            colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, Color.m6705copywmQWz5c$default(((SolidColor) brush).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iM6773getArgb8888_sVssgQ = ImageBitmap2.INSTANCE.m6773getArgb8888_sVssgQ();
            colorFilterM6729tintxETnrds$default = null;
        }
        int i = iM6773getArgb8888_sVssgQ;
        Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        Path pathObtainPath = borderCache2.obtainPath();
        pathObtainPath.reset();
        Path.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo6630opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m6813getDifferenceb3I0S0c());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final long jM8056constructorimpl = IntSize.m8056constructorimpl((((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & 4294967295L) | (((int) Math.ceil(bounds.getRight() - bounds.getLeft())) << 32));
        BorderCache borderCache3 = this.borderCache;
        Intrinsics.checkNotNull(borderCache3);
        ImageBitmap imageBitmap2 = borderCache3.imageBitmap;
        Canvas canvas2 = borderCache3.canvas;
        ImageBitmap2 imageBitmap2M6765boximpl = imageBitmap2 != null ? ImageBitmap2.m6765boximpl(imageBitmap2.mo6606getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (imageBitmap2M6765boximpl == null ? false : ImageBitmap2.m6768equalsimpl0(imageBitmap2M6765boximpl.getValue(), ImageBitmap2.INSTANCE.m6773getArgb8888_sVssgQ())) {
            z2 = true;
        } else {
            if (ImageBitmap2.m6767equalsimpl(i, imageBitmap2 != null ? ImageBitmap2.m6765boximpl(imageBitmap2.mo6606getConfig_sVssgQ()) : null)) {
            }
        }
        try {
            try {
                try {
                    try {
                        if (imageBitmap2 != null && canvas2 != null) {
                            rect = bounds;
                            if (Float.intBitsToFloat((int) (cacheDrawScope.m6459getSizeNHjbRc() >> 32)) <= imageBitmap2.getWidth() && Float.intBitsToFloat((int) (cacheDrawScope.m6459getSizeNHjbRc() & 4294967295L)) <= imageBitmap2.getHeight() && z2) {
                                borderCache = borderCache3;
                                objectRef = objectRef2;
                                canvas = canvas2;
                                imageBitmap = imageBitmap2;
                            }
                            canvasDrawScope = borderCache.canvasDrawScope;
                            if (canvasDrawScope == null) {
                                canvasDrawScope = new CanvasDrawScope();
                                borderCache.canvasDrawScope = canvasDrawScope;
                            }
                            canvasDrawScope2 = canvasDrawScope;
                            long jM8067toSizeozmzZPI = IntSize2.m8067toSizeozmzZPI(jM8056constructorimpl);
                            LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                            CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
                            Density density = drawParams.getDensity();
                            LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                            Canvas canvas3 = drawParams.getCanvas();
                            long size = drawParams.getSize();
                            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
                            drawParams2.setDensity(cacheDrawScope);
                            drawParams2.setLayoutDirection(layoutDirection);
                            drawParams2.setCanvas(canvas);
                            drawParams2.m6935setSizeuvyYCjk(jM8067toSizeozmzZPI);
                            canvas.save();
                            long jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
                            BlendMode.Companion companion = BlendMode.INSTANCE;
                            DrawScope.m6958drawRectnJ9OG0$default(canvasDrawScope2, jM6716getBlack0d7_KjU, 0L, jM8067toSizeozmzZPI, 0.0f, null, null, companion.m6643getClear0nO6VwU(), 58, null);
                            f2 = -rect.getLeft();
                            f3 = -rect.getTop();
                            canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
                            ?? r1 = imageBitmap;
                            f5 = f3;
                            Canvas canvas4 = canvas;
                            final ColorFilter colorFilter = colorFilterM6729tintxETnrds$default;
                            f4 = f2;
                            DrawScope.m6954drawPathGBMwjPU$default(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float f6 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() >> 32)) + f6) / Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() & 4294967295L)) + f6) / Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() & 4294967295L));
                            long jMo6962getCenterF1C5BW0 = canvasDrawScope2.mo6962getCenterF1C5BW0();
                            drawContext = canvasDrawScope2.getDrawContext();
                            jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            drawContext.getTransform().mo6942scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo6962getCenterF1C5BW0);
                            final Ref.ObjectRef objectRef3 = objectRef;
                            j = jMo6936getSizeNHjbRc;
                            DrawScope.m6954drawPathGBMwjPU$default(canvasDrawScope2, pathObtainPath, brush, 0.0f, null, null, companion.m6643getClear0nO6VwU(), 28, null);
                            drawContext.getCanvas().restore();
                            drawContext.mo6937setSizeuvyYCjk(j);
                            canvasDrawScope2.getDrawContext().getTransform().translate(-f4, -f5);
                            canvas4.restore();
                            CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                            drawParams3.setDensity(density);
                            drawParams3.setLayoutDirection(layoutDirection2);
                            drawParams3.setCanvas(canvas3);
                            drawParams3.m6935setSizeuvyYCjk(size);
                            r1.prepareToDraw();
                            objectRef3.element = r1;
                            final Rect rect2 = rect;
                            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                    invoke2(contentDrawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ContentDrawScope contentDrawScope) {
                                    contentDrawScope.drawContent();
                                    float left = rect2.getLeft();
                                    float top = rect2.getTop();
                                    Ref.ObjectRef<ImageBitmap> objectRef4 = objectRef3;
                                    long j2 = jM8056constructorimpl;
                                    ColorFilter colorFilter2 = colorFilter;
                                    contentDrawScope.getDrawContext().getTransform().translate(left, top);
                                    try {
                                        DrawScope.m6948drawImageAZ2fEMs$default(contentDrawScope, objectRef4.element, 0L, j2, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                    } finally {
                                        contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
                                    }
                                }
                            });
                        }
                        rect = bounds;
                        DrawScope.m6954drawPathGBMwjPU$default(canvasDrawScope2, pathObtainPath, brush, 0.0f, null, null, companion.m6643getClear0nO6VwU(), 28, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo6937setSizeuvyYCjk(j);
                        canvasDrawScope2.getDrawContext().getTransform().translate(-f4, -f5);
                        canvas4.restore();
                        CanvasDrawScope.DrawParams drawParams32 = canvasDrawScope2.getDrawParams();
                        drawParams32.setDensity(density);
                        drawParams32.setLayoutDirection(layoutDirection2);
                        drawParams32.setCanvas(canvas3);
                        drawParams32.m6935setSizeuvyYCjk(size);
                        r1.prepareToDraw();
                        objectRef3.element = r1;
                        final Rect rect22 = rect;
                        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                contentDrawScope.drawContent();
                                float left = rect22.getLeft();
                                float top = rect22.getTop();
                                Ref.ObjectRef<ImageBitmap> objectRef4 = objectRef3;
                                long j2 = jM8056constructorimpl;
                                ColorFilter colorFilter2 = colorFilter;
                                contentDrawScope.getDrawContext().getTransform().translate(left, top);
                                try {
                                    DrawScope.m6948drawImageAZ2fEMs$default(contentDrawScope, objectRef4.element, 0L, j2, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                } finally {
                                    contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        drawContext2 = drawContext;
                        drawContext2.getCanvas().restore();
                        drawContext2.mo6937setSizeuvyYCjk(j);
                        throw th;
                    }
                    drawContext.getTransform().mo6942scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jMo6962getCenterF1C5BW0);
                    final Ref.ObjectRef<ImageBitmap> objectRef32 = objectRef;
                    j = jMo6936getSizeNHjbRc;
                } catch (Throwable th2) {
                    th = th2;
                    drawContext2 = drawContext;
                    j = jMo6936getSizeNHjbRc;
                }
                DrawScope.m6954drawPathGBMwjPU$default(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f62 = 1;
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() >> 32)) + f62) / Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() >> 32));
                float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() & 4294967295L)) + f62) / Float.intBitsToFloat((int) (canvasDrawScope2.mo6963getSizeNHjbRc() & 4294967295L));
                long jMo6962getCenterF1C5BW02 = canvasDrawScope2.mo6962getCenterF1C5BW0();
                drawContext = canvasDrawScope2.getDrawContext();
                jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                drawContext.getCanvas().save();
            } catch (Throwable th3) {
                th = th3;
                canvasDrawScope2.getDrawContext().getTransform().translate(-f4, -f5);
                throw th;
            }
            ?? r12 = imageBitmap;
            f5 = f3;
            Canvas canvas42 = canvas;
            final ColorFilter colorFilter2 = colorFilterM6729tintxETnrds$default;
            f4 = f2;
        } catch (Throwable th4) {
            th = th4;
            f4 = f2;
            f5 = f3;
        }
        borderCache = borderCache3;
        objectRef = objectRef2;
        ImageBitmap imageBitmapM6778ImageBitmapx__hDU$default = ImageBitmap3.m6778ImageBitmapx__hDU$default((int) (jM8056constructorimpl >> 32), (int) (jM8056constructorimpl & 4294967295L), i, false, null, 24, null);
        borderCache.imageBitmap = imageBitmapM6778ImageBitmapx__hDU$default;
        Canvas Canvas = Canvas3.Canvas(imageBitmapM6778ImageBitmapx__hDU$default);
        borderCache.canvas = Canvas;
        imageBitmap = imageBitmapM6778ImageBitmapx__hDU$default;
        canvas = Canvas;
        canvasDrawScope = borderCache.canvasDrawScope;
        if (canvasDrawScope == null) {
        }
        canvasDrawScope2 = canvasDrawScope;
        long jM8067toSizeozmzZPI2 = IntSize2.m8067toSizeozmzZPI(jM8056constructorimpl);
        LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope2.getDrawParams();
        Density density2 = drawParams4.getDensity();
        LayoutDirection layoutDirection22 = drawParams4.getLayoutDirection();
        Canvas canvas32 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope2.getDrawParams();
        drawParams22.setDensity(cacheDrawScope);
        drawParams22.setLayoutDirection(layoutDirection3);
        drawParams22.setCanvas(canvas);
        drawParams22.m6935setSizeuvyYCjk(jM8067toSizeozmzZPI2);
        canvas.save();
        long jM6716getBlack0d7_KjU2 = Color.INSTANCE.m6716getBlack0d7_KjU();
        BlendMode.Companion companion2 = BlendMode.INSTANCE;
        DrawScope.m6958drawRectnJ9OG0$default(canvasDrawScope2, jM6716getBlack0d7_KjU2, 0L, jM8067toSizeozmzZPI2, 0.0f, null, null, companion2.m6643getClear0nO6VwU(), 58, null);
        f2 = -rect.getLeft();
        f3 = -rect.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m4882drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRect2.isSimple(rounded.getRoundRect())) {
            final long topLeftCornerRadius = rounded.getRoundRect().getTopLeftCornerRadius();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    if (!z) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (topLeftCornerRadius >> 32));
                        float f3 = f2;
                        if (fIntBitsToFloat < f3) {
                            float f4 = f;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo6963getSizeNHjbRc() >> 32)) - f;
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo6963getSizeNHjbRc() & 4294967295L)) - f;
                            int iM6699getDifferencertfAjoo = ClipOp.INSTANCE.m6699getDifferencertfAjoo();
                            Brush brush2 = brush;
                            long j3 = topLeftCornerRadius;
                            DrawContext drawContext = contentDrawScope.getDrawContext();
                            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            try {
                                drawContext.getTransform().mo6939clipRectN_I0leg(f4, f4, fIntBitsToFloat2, fIntBitsToFloat3, iM6699getDifferencertfAjoo);
                                DrawScope.m6959drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j3, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
                                return;
                            } finally {
                                drawContext.getCanvas().restore();
                                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                            }
                        }
                        DrawScope.m6959drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j, j2, BorderKt.m4880shrinkKibmq7A(topLeftCornerRadius, f3), 0.0f, stroke, null, 0, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, null);
                        return;
                    }
                    DrawScope.m6959drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, topLeftCornerRadius, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m6954drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
