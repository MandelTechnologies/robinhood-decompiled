package androidx.compose.p011ui.platform;

import android.os.Build;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerScope3;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.Matrix2;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.TransformOrigin;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.CompositingStrategy;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer2;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.OwnedLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Density3;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GraphicsLayerOwnerLayer.android.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010,\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020)H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001a\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0001¢\u0006\u0004\b/\u0010+J!\u00101\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u0016J\"\u0010:\u001a\u00020#2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020%H\u0016ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b=\u0010>JW\u0010?\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b?\u0010@J\u001a\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\bE\u0010CR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010GR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IRJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u001c\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010LR\u0016\u0010M\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010Q\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bQ\u0010PR$\u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bS\u0010N\"\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010 \u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bb\u0010LR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010NR\u0016\u0010g\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010NR\u0016\u0010h\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010NR\u0016\u0010i\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010NR%\u0010m\u001a\u0013\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u000f0j¢\u0006\u0002\bl8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010p\u001a\u00020\u00188VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bo\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006q"}, m3636d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroidx/compose/ui/graphics/GraphicsContext;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "triggerRepaint", "()V", "updateOutline", "Landroidx/compose/ui/graphics/Matrix;", "getMatrix-sQKQjiQ", "()[F", "getMatrix", "getInverseMatrix-3i98HWw", "getInverseMatrix", "updateMatrix", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "J", "isDestroyed", "Z", "matrixCache", "[F", "inverseMatrixCache", "value", "isDirty", "setDirty", "(Z)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "", "mutatedFields", "I", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Outline;", "isMatrixDirty", "isInverseMatrixDirty", "isIdentity", "drawnWithEnabledZ", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "recordLambda", "Lkotlin/jvm/functions/Function1;", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer {
    private final GraphicsContext context;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private Function0<Unit> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size;
    private final float[] matrixCache = Matrix.m6781constructorimpl$default(null, 1, null);
    private Density density = Density3.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.INSTANCE.m6875getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final Function1<DrawScope, Unit> recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo7385isInLayerk4lQ0M(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtil.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        long j = Integer.MAX_VALUE;
        this.size = IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32));
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateLayerProperties(GraphicsLayerScope3 scope) {
        int iM6974getModulateAlphake2Ky5w;
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.setShadowElevation(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.m6984setAmbientShadowColor8_81llA(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.m6989setSpotShadowColor8_81llA(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            if (TransformOrigin.m6869equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m6875getCenterSzJe1aQ())) {
                this.graphicsLayer.m6986setPivotOffsetk4lQ0M(Offset.INSTANCE.m6552getUnspecifiedF1C5BW0());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM6870getPivotFractionXimpl = TransformOrigin.m6870getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m6986setPivotOffsetk4lQ0M(Offset.m6535constructorimpl((Float.floatToRawIntBits(TransformOrigin.m6871getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fM6870getPivotFractionXimpl) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.setClip(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.setRenderEffect(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            GraphicsLayerModifier4.Companion companion = GraphicsLayerModifier4.INSTANCE;
            if (GraphicsLayerModifier4.m6745equalsimpl0(compositingStrategy, companion.m6748getAutoNrFUSI())) {
                iM6974getModulateAlphake2Ky5w = CompositingStrategy.INSTANCE.m6973getAutoke2Ky5w();
            } else if (GraphicsLayerModifier4.m6745equalsimpl0(compositingStrategy, companion.m6750getOffscreenNrFUSI())) {
                iM6974getModulateAlphake2Ky5w = CompositingStrategy.INSTANCE.m6975getOffscreenke2Ky5w();
            } else {
                if (!GraphicsLayerModifier4.m6745equalsimpl0(compositingStrategy, companion.m6749getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM6974getModulateAlphake2Ky5w = CompositingStrategy.INSTANCE.m6974getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m6985setCompositingStrategyWpw9cng(iM6974getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (Intrinsics.areEqual(this.outline, scope.getOutline())) {
            z = false;
        } else {
            this.outline = scope.getOutline();
            updateOutline();
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z) {
            triggerRepaint();
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void updateOutline() {
        Function0<Unit> function0;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayer2.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo7387movegyyYBs(long position) {
        this.graphicsLayer.m6990setTopLeftgyyYBs(position);
        triggerRepaint();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo7388resizeozmzZPI(long size) {
        if (IntSize.m8058equalsimpl0(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(parentLayer);
        GraphicsLayer2.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m6869equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m6875getCenterSzJe1aQ()) && !IntSize.m8058equalsimpl0(this.graphicsLayer.getSize(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM6870getPivotFractionXimpl = TransformOrigin.m6870getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float fM6871getPivotFractionYimpl = TransformOrigin.m6871getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m6986setPivotOffsetk4lQ0M(Offset.m6535constructorimpl((Float.floatToRawIntBits(fM6871getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM6870getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m6983recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo7386mapOffset8S9VItk(long point, boolean inverse) {
        float[] fArrM7443getMatrixsQKQjiQ;
        if (inverse) {
            fArrM7443getMatrixsQKQjiQ = m7442getInverseMatrix3i98HWw();
            if (fArrM7443getMatrixsQKQjiQ == null) {
                return Offset.INSTANCE.m6551getInfiniteF1C5BW0();
            }
        } else {
            fArrM7443getMatrixsQKQjiQ = m7443getMatrixsQKQjiQ();
        }
        return this.isIdentity ? point : Matrix.m6784mapMKHz9U(fArrM7443getMatrixsQKQjiQ, point);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        float[] fArrM7442getInverseMatrix3i98HWw = inverse ? m7442getInverseMatrix3i98HWw() : m7443getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM7442getInverseMatrix3i98HWw == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m6785mapimpl(fArrM7442getInverseMatrix3i98HWw, rect);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            InlineClassHelper4.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
            throw new ExceptionsH();
        }
        if (!this.graphicsLayer.getIsReleased()) {
            InlineClassHelper4.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m6786resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m6786resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.INSTANCE.m6875getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        long j = Integer.MAX_VALUE;
        this.size = IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo7389transform58bKbWc(float[] matrix) {
        Matrix.m6790timesAssign58bKbWc(matrix, m7443getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo7384inverseTransform58bKbWc(float[] matrix) {
        float[] fArrM7442getInverseMatrix3i98HWw = m7442getInverseMatrix3i98HWw();
        if (fArrM7442getInverseMatrix3i98HWw != null) {
            Matrix.m6790timesAssign58bKbWc(matrix, fArrM7442getInverseMatrix3i98HWw);
        }
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m7443getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo7383getUnderlyingMatrixsQKQjiQ() {
        return m7443getMatrixsQKQjiQ();
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m7442getInverseMatrix3i98HWw() {
        float[] fArrM6781constructorimpl$default = this.inverseMatrixCache;
        if (fArrM6781constructorimpl$default == null) {
            fArrM6781constructorimpl$default = Matrix.m6781constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM6781constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM6781constructorimpl$default[0])) {
                return null;
            }
            return fArrM6781constructorimpl$default;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM7443getMatrixsQKQjiQ = m7443getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return fArrM7443getMatrixsQKQjiQ;
        }
        if (InvertMatrix.m7444invertToJiSxe2E(fArrM7443getMatrixsQKQjiQ, fArrM6781constructorimpl$default)) {
            return fArrM6781constructorimpl$default;
        }
        fArrM6781constructorimpl$default[0] = Float.NaN;
        return null;
    }

    private final void updateMatrix() {
        long pivotOffset;
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            if ((graphicsLayer.getPivotOffset() & 9223372034707292159L) == 9205357640488583168L) {
                pivotOffset = SizeKt.m6590getCenteruvyYCjk(IntSize2.m8067toSizeozmzZPI(this.size));
            } else {
                pivotOffset = graphicsLayer.getPivotOffset();
            }
            Matrix.m6787resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (pivotOffset >> 32)), Float.intBitsToFloat((int) (pivotOffset & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = Matrix2.m6795isIdentity58bKbWc(this.matrixCache);
        }
    }
}
