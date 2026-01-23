package androidx.constraintlayout.compose;

import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOrigin2;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a&\u0010\t\u001a\u00020\b2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\u0014\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f*\f\b\u0000\u0010\"\"\u00020!2\u00020!*\f\b\u0000\u0010$\"\u00020#2\u00020#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'²\u0006\u000e\u0010%\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "createId", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "", "Lkotlin/ExtensionFunctionType;", "description", "Landroidx/constraintlayout/compose/ConstraintSet;", "ConstraintSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/constraintlayout/core/state/WidgetFrame;", "frame", "Landroidx/compose/ui/unit/IntOffset;", "offset", "placeWithFrameTransform-Ktjjmr4", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;J)V", "placeWithFrameTransform", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "buildMapping", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State;", "SolverState", "startConstraint", "endConstraint", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConstraintLayoutKt {
    public static final void buildMapping(State state, List<? extends Measurable> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object layoutId = LayoutId2.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTag2.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId.toString(), measurable);
            Object constraintLayoutTag = ConstraintLayoutTag2.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
        }
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.createId.1
        };
    }

    public static final Dimension getAtLeastWrapContent(Dimension.MinCoercible minCoercible) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().update("wrap");
        return dimensionDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ConstraintSet ConstraintSet(Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4$default, reason: not valid java name */
    public static /* synthetic */ void m8153placeWithFrameTransformKtjjmr4$default(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntOffset.INSTANCE.m8047getZeronOccac();
        }
        m8152placeWithFrameTransformKtjjmr4(placementScope, placeable, widgetFrame, j);
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4, reason: not valid java name */
    public static final void m8152placeWithFrameTransformKtjjmr4(Placeable.PlacementScope placementScope, Placeable placeable, final WidgetFrame widgetFrame, long j) {
        if (widgetFrame.visibility == 8) {
            return;
        }
        if (widgetFrame.isDefaultTransform()) {
            Placeable.PlacementScope.m7264place70tqf50$default(placementScope, placeable, IntOffset2.IntOffset(widgetFrame.left - IntOffset.m8038getXimpl(j), widgetFrame.top - IntOffset.m8039getYimpl(j)), 0.0f, 2, null);
        } else {
            placementScope.placeWithLayer(placeable, widgetFrame.left - IntOffset.m8038getXimpl(j), widgetFrame.top - IntOffset.m8039getYimpl(j), Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
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
                    if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
                        graphicsLayerScope.mo6764setTransformOrigin__ExYCQ(TransformOrigin2.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
                    }
                    if (!Float.isNaN(widgetFrame.rotationX)) {
                        graphicsLayerScope.setRotationX(widgetFrame.rotationX);
                    }
                    if (!Float.isNaN(widgetFrame.rotationY)) {
                        graphicsLayerScope.setRotationY(widgetFrame.rotationY);
                    }
                    if (!Float.isNaN(widgetFrame.rotationZ)) {
                        graphicsLayerScope.setRotationZ(widgetFrame.rotationZ);
                    }
                    if (!Float.isNaN(widgetFrame.translationX)) {
                        graphicsLayerScope.setTranslationX(widgetFrame.translationX);
                    }
                    if (!Float.isNaN(widgetFrame.translationY)) {
                        graphicsLayerScope.setTranslationY(widgetFrame.translationY);
                    }
                    if (!Float.isNaN(widgetFrame.translationZ)) {
                        graphicsLayerScope.setShadowElevation(widgetFrame.translationZ);
                    }
                    if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
                        graphicsLayerScope.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
                        graphicsLayerScope.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
                    }
                    if (Float.isNaN(widgetFrame.alpha)) {
                        return;
                    }
                    graphicsLayerScope.setAlpha(widgetFrame.alpha);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-17, reason: not valid java name */
    public static final ConstraintSet m8144ConstraintLayout$lambda17(SnapshotState<ConstraintSet> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-20, reason: not valid java name */
    public static final ConstraintSet m8146ConstraintLayout$lambda20(SnapshotState<ConstraintSet> snapshotState) {
        return snapshotState.getValue();
    }
}
