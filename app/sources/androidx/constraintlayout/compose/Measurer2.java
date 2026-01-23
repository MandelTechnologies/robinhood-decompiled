package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Measurer.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010#J\u0017\u0010&\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)JR\u00108\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b6\u00107J\u000f\u0010:\u001a\u00020\u0018H\u0000¢\u0006\u0004\b9\u0010)J\u001a\u0010=\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0004ø\u0001\u0000¢\u0006\u0004\b;\u0010<J3\u0010?\u001a\u00020\u0018*\u00020>2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020201¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0018H\u0016¢\u0006\u0004\bA\u0010)R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010$8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010'R\u001a\u0010K\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR&\u0010U\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010PR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020V018\u0004X\u0084\u0004¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bX\u0010RR\u001a\u0010Z\u001a\u00020Y8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\"\u0010b\u001a\u00020a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0011\u0010j\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010l\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bk\u0010i\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, m3636d2 = {"Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "obtainConstraints", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z", "", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/collection/IntIntPair;", "measureWidget-yQShABA", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "measureWidget", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "layoutReceiver", "addLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "computeLayoutResult", "()V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "Landroidx/compose/ui/layout/Placeable;", "placeableMap", "optimizationLevel", "Landroidx/compose/ui/unit/IntSize;", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;Ljava/util/Map;I)J", "performMeasure", "resetMeasureState$constraintlayout_compose_release", "resetMeasureState", "applyRootSize-BRTryo0", "(J)V", "applyRootSize", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "performLayout", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Ljava/util/List;Ljava/util/Map;)V", "didMeasures", "", "computedLayoutResult", "Ljava/lang/String;", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "placeables", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "setPlaceables", "(Ljava/util/Map;)V", "lastMeasures", "Landroidx/constraintlayout/core/state/WidgetFrame;", "frameCache", "getFrameCache", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "widthConstraintsHolder", "[I", "heightConstraintsHolder", "", "forcedScaleFactor", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "getLayoutCurrentWidth", "()I", "layoutCurrentWidth", "getLayoutCurrentHeight", "layoutCurrentHeight", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes4.dex */
public class Measurer2 implements BasicMeasure.Measurer, ToolingUtils {
    private String computedLayoutResult = "";
    private float forcedScaleFactor;
    private final Map<String, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<String, Integer[]> lastMeasures;
    private LayoutInformationReceiver layoutInformationReceiver;
    private Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final State state;
    private final int[] widthConstraintsHolder;

    /* compiled from: Measurer.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    public Measurer2(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    protected final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    protected final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    protected final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    protected final void setPlaceables(Map<Measurable, Placeable> map) {
        this.placeables = map;
    }

    protected final Map<String, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    protected final State getState() {
        return this.state;
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measure(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
        boolean z;
        String str = constraintWidget.stringId;
        Integer[] numArr = this.lastMeasures.get(str);
        obtainConstraints(measure.horizontalBehavior, measure.horizontalDimension, constraintWidget.mMatchConstraintDefaultWidth, measure.measureStrategy, (numArr != null ? numArr[1].intValue() : 0) == constraintWidget.getHeight(), constraintWidget.isResolvedHorizontally(), Constraints.m7975getMaxWidthimpl(this.state.getRootIncomingConstraints()), this.widthConstraintsHolder);
        obtainConstraints(measure.verticalBehavior, measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, measure.measureStrategy, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m7974getMaxHeightimpl(this.state.getRootIncomingConstraints()), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long jConstraints = Constraints2.Constraints(i, i2, iArr2[0], iArr2[1]);
        int i3 = measure.measureStrategy;
        if (i3 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS && i3 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour != dimensionBehaviour2 || constraintWidget.mMatchConstraintDefaultWidth != 0 || measure.verticalBehavior != dimensionBehaviour2 || constraintWidget.mMatchConstraintDefaultHeight != 0) {
            }
        } else {
            long jM8164measureWidgetyQShABA = m8164measureWidgetyQShABA(constraintWidget, jConstraints);
            constraintWidget.setMeasureRequested(false);
            Integer numValueOf = Integer.valueOf(IntIntPair.m4739getFirstimpl(jM8164measureWidgetyQShABA));
            Integer numValueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            Integer numValueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            int iIntValue = ((Number) RangesKt.coerceIn(numValueOf, numValueOf2, numValueOf3)).intValue();
            Integer numValueOf4 = Integer.valueOf(IntIntPair.m4740getSecondimpl(jM8164measureWidgetyQShABA));
            Integer numValueOf5 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
            if (numValueOf5.intValue() <= 0) {
                numValueOf5 = null;
            }
            Integer numValueOf6 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
            int iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf4, numValueOf5, numValueOf6.intValue() > 0 ? numValueOf6 : null)).intValue();
            if (iIntValue != IntIntPair.m4739getFirstimpl(jM8164measureWidgetyQShABA)) {
                jConstraints = Constraints2.Constraints(iIntValue, iIntValue, Constraints.m7976getMinHeightimpl(jConstraints), Constraints.m7974getMaxHeightimpl(jConstraints));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != IntIntPair.m4740getSecondimpl(jM8164measureWidgetyQShABA)) {
                jConstraints = Constraints2.Constraints(Constraints.m7977getMinWidthimpl(jConstraints), Constraints.m7975getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                z = true;
            }
            if (z) {
                m8164measureWidgetyQShABA(constraintWidget, jConstraints);
                constraintWidget.setMeasureRequested(false);
            }
        }
        Placeable placeable = this.placeables.get(constraintWidget.getCompanionWidget());
        measure.measuredWidth = placeable != null ? placeable.getWidth() : constraintWidget.getWidth();
        measure.measuredHeight = placeable != null ? placeable.getHeight() : constraintWidget.getHeight();
        int i4 = (placeable == null || !this.state.isBaselineNeeded(constraintWidget)) ? Integer.MIN_VALUE : placeable.get(AlignmentLineKt.getFirstBaseline());
        measure.measuredHasBaseline = i4 != Integer.MIN_VALUE;
        measure.measuredBaseline = i4;
        Map<String, Integer[]> map = this.lastMeasures;
        Integer[] numArr2 = map.get(str);
        if (numArr2 == null) {
            numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
            map.put(str, numArr2);
        }
        copyFrom(numArr2, measure);
        measure.measuredNeedsSolverPass = (measure.measuredWidth == measure.horizontalDimension && measure.measuredHeight == measure.verticalDimension) ? false : true;
    }

    public final void addLayoutInformationReceiver(LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver != null) {
            layoutReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutId2.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTag2.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(Measurer3.getAnyOrNullId((Measurable) companionWidget));
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + next.stringId + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (next instanceof Guideline) {
                sb.append(' ' + next.stringId + ": {");
                Guideline guideline = (Guideline) next;
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string2 = sb.toString();
        this.computedLayoutResult = string2;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(string2);
        }
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i == 3) {
            boolean z = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
            outConstraints[0] = z ? dimension : 0;
            if (!z) {
                dimension = rootMaxConstraint;
            }
            outConstraints[1] = dimension;
            return !z;
        }
        if (i == 4) {
            outConstraints[0] = rootMaxConstraint;
            outConstraints[1] = rootMaxConstraint;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m8166performMeasureDjhGOtQ(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> measurables, Map<Measurable, Placeable> placeableMap, int optimizationLevel) {
        androidx.constraintlayout.core.state.Dimension dimensionMin;
        androidx.constraintlayout.core.state.Dimension dimensionMin2;
        this.placeables = placeableMap;
        if (measurables.isEmpty()) {
            return IntSize2.IntSize(Constraints.m7977getMinWidthimpl(constraints), Constraints.m7976getMinHeightimpl(constraints));
        }
        State state = this.state;
        if (Constraints.m7973getHasFixedWidthimpl(constraints)) {
            dimensionMin = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m7975getMaxWidthimpl(constraints));
        } else {
            dimensionMin = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m7977getMinWidthimpl(constraints));
        }
        state.width(dimensionMin);
        State state2 = this.state;
        if (Constraints.m7972getHasFixedHeightimpl(constraints)) {
            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m7974getMaxHeightimpl(constraints));
        } else {
            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m7976getMinHeightimpl(constraints));
        }
        state2.height(dimensionMin2);
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m8181setRootIncomingConstraintsBRTryo0(constraints);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose_release();
        if (constraintSet.isDirty(measurables)) {
            this.state.reset();
            constraintSet.applyTo(this.state, measurables);
            ConstraintLayoutKt.buildMapping(this.state, measurables);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(this.state, measurables);
        }
        m8165applyRootSizeBRTryo0(constraints);
        this.root.updateHierarchy();
        this.root.setOptimizationLevel(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        return IntSize2.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    protected final void m8165applyRootSizeBRTryo0(long constraints) {
        this.root.setWidth(Constraints.m7975getMaxWidthimpl(constraints));
        this.root.setHeight(Constraints.m7974getMaxHeightimpl(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            Intrinsics.checkNotNull(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
    }

    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list, Map<Measurable, Placeable> map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.placeables = map;
        int i = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = children.get(i2);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(Measurer3.getAnyOrNullId((Measurable) companionWidget), new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            Measurable measurable = list.get(i);
            WidgetFrame widgetFrame = this.frameCache.get(Measurer3.getAnyOrNullId(measurable));
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                placementScope2 = placementScope;
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m8153placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            }
            i++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m8164measureWidgetyQShABA(ConstraintWidget constraintWidget, long constraints) {
        int i;
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i2 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            if (Constraints.m7973getHasFixedWidthimpl(constraints)) {
                i = 1073741824;
            } else {
                i = Constraints.m7971getHasBoundedWidthimpl(constraints) ? Integer.MIN_VALUE : 0;
            }
            if (Constraints.m7972getHasFixedHeightimpl(constraints)) {
                i2 = 1073741824;
            } else if (Constraints.m7970getHasBoundedHeightimpl(constraints)) {
                i2 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i, Constraints.m7975getMaxWidthimpl(constraints), i2, Constraints.m7974getMaxHeightimpl(constraints));
            return IntIntPair.m4736constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
        if (companionWidget instanceof Measurable) {
            Placeable placeableMo7239measureBRTryo0 = ((Measurable) companionWidget).mo7239measureBRTryo0(constraints);
            this.placeables.put(companionWidget, placeableMo7239measureBRTryo0);
            return IntIntPair.m4736constructorimpl(placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m4736constructorimpl(0, 0);
    }
}
