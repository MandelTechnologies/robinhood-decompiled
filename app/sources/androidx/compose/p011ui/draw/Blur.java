package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.RenderEffect2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.TileMode;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Blur.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.draw.BlurKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Blur {
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m6447blur1fqSgw(Modifier modifier, final float f, final float f2, final Shape shape) {
        int iM6863getDecal3opZhB0;
        final boolean z;
        if (shape != null) {
            iM6863getDecal3opZhB0 = TileMode.INSTANCE.m6862getClamp3opZhB0();
            z = true;
        } else {
            iM6863getDecal3opZhB0 = TileMode.INSTANCE.m6863getDecal3opZhB0();
            z = false;
        }
        final int i = iM6863getDecal3opZhB0;
        float f3 = 0;
        return ((C2002Dp.m7994compareTo0680j_4(f, C2002Dp.m7995constructorimpl(f3)) <= 0 || C2002Dp.m7994compareTo0680j_4(f2, C2002Dp.m7995constructorimpl(f3)) <= 0) && !z) ? modifier : GraphicsLayerModifier6.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float fMo5016toPx0680j_4 = graphicsLayerScope.mo5016toPx0680j_4(f);
                float fMo5016toPx0680j_42 = graphicsLayerScope.mo5016toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((fMo5016toPx0680j_4 <= 0.0f || fMo5016toPx0680j_42 <= 0.0f) ? null : RenderEffect2.m6822BlurEffect3YTHUZs(fMo5016toPx0680j_4, fMo5016toPx0680j_42, i));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShape2.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z);
            }
        });
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m6449blurF8QBwvs$default(Modifier modifier, float f, Blur3 blur3, int i, Object obj) {
        if ((i & 2) != 0) {
            blur3 = Blur3.m6450boximpl(Blur3.INSTANCE.m6456getRectangleGoahg());
        }
        return m6448blurF8QBwvs(modifier, f, blur3.getShape());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m6448blurF8QBwvs(Modifier modifier, float f, Shape shape) {
        return m6447blur1fqSgw(modifier, f, f, shape);
    }
}
