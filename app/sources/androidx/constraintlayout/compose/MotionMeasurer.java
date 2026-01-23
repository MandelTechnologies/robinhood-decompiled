package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MotionMeasurer.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jb\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J;\u0010/\u001a\u00020\u000f2\n\u0010)\u001a\u00060'j\u0002`(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\"\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J;\u00108\u001a\u00020\u000f*\u0002012\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109J.\u0010A\u001a\u00020\u000f*\u0002012\u0006\u0010:\u001a\u0002042\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J|\u0010I\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020C0B2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010E\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\u000f2\n\u0010)\u001a\u00060'j\u0002`(¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000fH\u0016¢\u0006\u0004\bL\u0010MJ/\u0010O\u001a\u00020\u000f*\u0002012\b\b\u0002\u0010N\u001a\u00020\u00172\b\b\u0002\u00108\u001a\u00020\u00172\b\b\u0002\u00107\u001a\u00020\u0017¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bQ\u0010MJ5\u0010T\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0017\u0010 \u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b \u0010[\u001a\u0004\b\\\u0010]R\u001e\u0010^\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m3636d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "optimizationLevel", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "measureConstraintSet", "Landroidx/constraintlayout/compose/CompositionSource;", "source", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "invalidateOnConstraintsCallback", "", "needsRemeasure-NN6Ew-U", "(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z", "needsRemeasure", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", NavTransition2.KEY_TRANSITION, "", "progress", "remeasure", "recalculateInterpolation-36Wf7g4", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V", "recalculateInterpolation", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", "location", "", "types", "count", "encodeKeyFrames", "(Ljava/lang/StringBuilder;[F[I[II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "parentWidth", "parentHeight", "Landroidx/constraintlayout/core/state/WidgetFrame;", "startFrame", "drawPath", "drawKeyPositions", "drawPaths", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;ZZ)V", "frame", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrame", "", "Landroidx/compose/ui/layout/Placeable;", "placeableMap", "compositionSource", "Landroidx/compose/ui/unit/IntSize;", "performInterpolationMeasure-LzAeyeM", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;Ljava/util/Map;IFLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)J", "performInterpolationMeasure", "encodeRoot", "(Ljava/lang/StringBuilder;)V", "computeLayoutResult", "()V", "drawBounds", "drawDebug", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;ZZZ)V", "clearConstraintSets", "start", "end", "initWith", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/TransitionImpl;F)V", "DEBUG", "Z", "lastProgressInInterpolation", "F", "Landroidx/constraintlayout/core/state/Transition;", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "oldConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MotionMeasurer extends Measurer2 {
    private final boolean DEBUG;
    private float lastProgressInInterpolation;
    private Constraints oldConstraints;
    private final androidx.constraintlayout.core.state.Transition transition;

    public MotionMeasurer(final Density density) {
        super(density);
        this.transition = new androidx.constraintlayout.core.state.Transition(new CorePixelDp() { // from class: androidx.constraintlayout.compose.MotionMeasurer$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f) {
                return MotionMeasurer.transition$lambda$1(density, f);
            }
        });
    }

    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    /* renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m8176measureConstraintSethBUhpc(int optimizationLevel, ConstraintSet constraintSet, List<? extends Measurable> measurables, long constraints) {
        String string2;
        Object layoutId;
        getState().reset();
        constraintSet.applyTo(getState(), measurables);
        ConstraintLayoutKt.buildMapping(getState(), measurables);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            children.get(i).setAnimated(true);
        }
        m8165applyRootSizeBRTryo0(constraints);
        getRoot().updateHierarchy();
        if (this.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            int size2 = children2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ConstraintWidget constraintWidget = children2.get(i2);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable == null || (layoutId = LayoutId2.getLayoutId(measurable)) == null || (string2 = layoutId.toString()) == null) {
                    string2 = "NOTAG";
                }
                constraintWidget.setDebugName(string2);
            }
        }
        getRoot().setOptimizationLevel(optimizationLevel);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* renamed from: performInterpolationMeasure-LzAeyeM, reason: not valid java name */
    public final long m8179performInterpolationMeasureLzAeyeM(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List<? extends Measurable> measurables, Map<Measurable, Placeable> placeableMap, int optimizationLevel, float progress, CompositionSource compositionSource, MotionMeasurer2 invalidateOnConstraintsCallback) {
        long j;
        MotionMeasurer motionMeasurer;
        LayoutInformationReceiver layoutInformationReceiver;
        LayoutInformationReceiver layoutInformationReceiver2;
        setPlaceables(placeableMap);
        boolean zM8177needsRemeasureNN6EwU = m8177needsRemeasureNN6EwU(constraints, compositionSource, invalidateOnConstraintsCallback);
        if (this.lastProgressInInterpolation != progress || ((((layoutInformationReceiver = getLayoutInformationReceiver()) == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) && ((layoutInformationReceiver2 = getLayoutInformationReceiver()) == null || layoutInformationReceiver2.getForcedHeight() != Integer.MIN_VALUE)) || zM8177needsRemeasureNN6EwU)) {
            j = constraints;
            motionMeasurer = this;
            motionMeasurer.m8178recalculateInterpolation36Wf7g4(j, layoutDirection, constraintSetStart, constraintSetEnd, transition, measurables, optimizationLevel, progress, zM8177needsRemeasureNN6EwU);
        } else {
            j = constraints;
            motionMeasurer = this;
        }
        motionMeasurer.oldConstraints = Constraints.m7964boximpl(j);
        return IntSize2.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }

    /* renamed from: needsRemeasure-NN6Ew-U, reason: not valid java name */
    private final boolean m8177needsRemeasureNN6EwU(long constraints, CompositionSource source, MotionMeasurer2 invalidateOnConstraintsCallback) {
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        Constraints constraints2 = this.oldConstraints;
        if (constraints2 != null && invalidateOnConstraintsCallback != null) {
            Intrinsics.checkNotNull(constraints2);
            if (invalidateOnConstraintsCallback.mo8163invokeN9IONVI(constraints2.getValue(), constraints)) {
                return true;
            }
        } else if ((Constraints.m7972getHasFixedHeightimpl(constraints) && !getState().sameFixedHeight(Constraints.m7974getMaxHeightimpl(constraints))) || (Constraints.m7973getHasFixedWidthimpl(constraints) && !getState().sameFixedWidth(Constraints.m7975getMaxWidthimpl(constraints)))) {
            return true;
        }
        return source == CompositionSource.Content;
    }

    /* renamed from: recalculateInterpolation-36Wf7g4, reason: not valid java name */
    private final void m8178recalculateInterpolation36Wf7g4(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List<? extends Measurable> measurables, int optimizationLevel, float progress, boolean remeasure) {
        WidgetFrame interpolated;
        androidx.constraintlayout.core.state.Dimension dimensionMin;
        androidx.constraintlayout.core.state.Dimension dimensionMin2;
        this.lastProgressInInterpolation = progress;
        int i = 0;
        if (remeasure) {
            this.transition.clear();
            resetMeasureState$constraintlayout_compose_release();
            State state = getState();
            if (Constraints.m7973getHasFixedWidthimpl(constraints)) {
                dimensionMin = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m7975getMaxWidthimpl(constraints));
            } else {
                dimensionMin = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m7977getMinWidthimpl(constraints));
            }
            state.width(dimensionMin);
            State state2 = getState();
            if (Constraints.m7972getHasFixedHeightimpl(constraints)) {
                dimensionMin2 = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m7974getMaxHeightimpl(constraints));
            } else {
                dimensionMin2 = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m7976getMinHeightimpl(constraints));
            }
            state2.height(dimensionMin2);
            getState().m8181setRootIncomingConstraintsBRTryo0(constraints);
            getState().setRtl(layoutDirection == LayoutDirection.Rtl);
            m8176measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
            this.transition.updateFrom(getRoot(), 0);
            m8176measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
            this.transition.updateFrom(getRoot(), 1);
            if (transition != null) {
                transition.applyKeyFramesTo(this.transition);
            }
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
        getRoot().setWidth(this.transition.getInterpolatedWidth());
        getRoot().setHeight(this.transition.getInterpolatedHeight());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        while (true) {
            if (i >= size) {
                break;
            }
            ConstraintWidget constraintWidget = children.get(i);
            Object companionWidget = constraintWidget.getCompanionWidget();
            Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
            if (measurable != null && (interpolated = this.transition.getInterpolated(constraintWidget)) != null) {
                getPlaceables().put(measurable, measurable.mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(interpolated.width(), interpolated.height())));
                getFrameCache().put(Measurer3.getAnyOrNullId(measurable), interpolated);
            }
            i++;
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    private final void encodeKeyFrames(StringBuilder json, float[] location, int[] types, int[] progress, int count) {
        if (count == 0) {
            return;
        }
        json.append("keyTypes : [");
        for (int i = 0; i < count; i++) {
            int i2 = types[i];
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(i2);
            sb.append(',');
            json.append(sb.toString());
        }
        json.append("],\n");
        json.append("keyPos : [");
        int i3 = count * 2;
        for (int i4 = 0; i4 < i3; i4++) {
            float f = location[i4];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(f);
            sb2.append(',');
            json.append(sb2.toString());
        }
        json.append("],\n ");
        json.append("keyFrames : [");
        for (int i5 = 0; i5 < count; i5++) {
            int i6 = progress[i5];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(i6);
            sb3.append(',');
            json.append(sb3.toString());
        }
        json.append("],\n ");
    }

    public final void encodeRoot(StringBuilder json) {
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public void computeLayoutResult() {
        MotionMeasurer motionMeasurer = this;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        motionMeasurer.encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList<ConstraintWidget> children = motionMeasurer.getRoot().getChildren();
        int size = children.size();
        int i = 0;
        while (i < size) {
            ConstraintWidget constraintWidget = children.get(i);
            WidgetFrame start = motionMeasurer.transition.getStart(constraintWidget.stringId);
            WidgetFrame end = motionMeasurer.transition.getEnd(constraintWidget.stringId);
            WidgetFrame interpolated = motionMeasurer.transition.getInterpolated(constraintWidget.stringId);
            float[] path = motionMeasurer.transition.getPath(constraintWidget.stringId);
            int keyFrames = motionMeasurer.transition.getKeyFrames(constraintWidget.stringId, fArr, iArr, iArr2);
            sb.append(' ' + constraintWidget.stringId + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            motionMeasurer.encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            for (float f : path) {
                sb.append(' ' + f + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
            i++;
            motionMeasurer = this;
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb.toString());
        }
    }

    public final void drawDebug(DrawScope drawScope, boolean z, boolean z2, boolean z3) {
        WidgetFrame widgetFrame;
        PathEffect pathEffect;
        PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        int i = 0;
        while (i < size) {
            ConstraintWidget constraintWidget = children.get(i);
            WidgetFrame start = this.transition.getStart(constraintWidget);
            WidgetFrame end = this.transition.getEnd(constraintWidget);
            if (z) {
                Color.Companion companion = Color.INSTANCE;
                m8175drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, companion.m6717getBlue0d7_KjU());
                m8175drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, companion.m6717getBlue0d7_KjU());
                drawScope.getDrawContext().getTransform().translate(2.0f, 2.0f);
                try {
                    m8175drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, companion.m6727getWhite0d7_KjU());
                    widgetFrame = start;
                    m8175drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, companion.m6727getWhite0d7_KjU());
                    pathEffect = pathEffectDashPathEffect;
                } finally {
                    drawScope.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                }
            } else {
                widgetFrame = start;
                pathEffect = pathEffectDashPathEffect;
            }
            drawPaths(drawScope, Size.m6583getWidthimpl(drawScope.mo6963getSizeNHjbRc()), Size.m6580getHeightimpl(drawScope.mo6963getSizeNHjbRc()), widgetFrame, z2, z3);
            i++;
            pathEffectDashPathEffect = pathEffect;
        }
    }

    private final void drawPaths(DrawScope drawScope, float f, float f2, WidgetFrame widgetFrame, boolean z, boolean z2) {
        new MotionRenderDebug(23.0f).basicDraw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, (int) f, (int) f2, z, z2);
    }

    /* renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m8175drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.m6958drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        int i = widgetFrame.left;
        int i2 = widgetFrame.top;
        int i3 = widgetFrame.right;
        int i4 = widgetFrame.bottom;
        float[] fArr = {i, i2, i3, i2, i3, i4, i, i4};
        matrix.mapPoints(fArr);
        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    public final void initWith(ConstraintSet start, ConstraintSet end, LayoutDirection layoutDirection, TransitionImpl transition, float progress) {
        clearConstraintSets();
        getState().setRtl(layoutDirection == LayoutDirection.Rtl);
        start.applyTo(getState(), CollectionsKt.emptyList());
        start.applyTo(this.transition, 0);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 0);
        start.applyTo(getState(), CollectionsKt.emptyList());
        end.applyTo(this.transition, 1);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 1);
        this.transition.interpolate(0, 0, progress);
        transition.applyAllTo(this.transition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transition$lambda$1(Density density, float f) {
        return density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f));
    }
}
