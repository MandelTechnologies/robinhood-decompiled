package androidx.compose.p011ui.node;

import androidx.collection.ObjectFloatMap2;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterSet2;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope2;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.Placeable4;
import androidx.compose.p011ui.layout.Ruler;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.unit.IntOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LookaheadDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020\nH ¢\u0006\u0004\b!\u0010\u0005J\u0013\u0010$\u001a\u00020\n*\u00020#H\u0004¢\u0006\u0004\b$\u0010%Jg\u00101\u001a\u0002002\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0(2\u0019\u0010-\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n\u0018\u00010*¢\u0006\u0002\b,2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0*¢\u0006\u0002\b,H\u0016¢\u0006\u0004\b1\u00102J\u0019\u0010\u000f\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010\u001aR\"\u0010<\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b=\u0010:\"\u0004\b>\u0010\u001aR\"\u0010?\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010:\"\u0004\bA\u0010\u001aR\u0017\u0010B\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR0\u0010K\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010P\u001a\u00020M8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0014\u0010W\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010:R\u0014\u0010Z\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010a\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u0002008 X \u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, m3636d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "ruler", "findAncestorRulerDefiner", "(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "invalidateChildrenOfDefiningRuler", "(Landroidx/compose/ui/layout/Ruler;)V", "Landroidx/compose/ui/node/PlaceableResult;", "placeableResult", "captureRulers", "(Landroidx/compose/ui/node/PlaceableResult;)V", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "notifyRulerValueChange", "(Landroidx/collection/MutableScatterSet;)V", "", "newMFR", "updatePlacedUnderMotionFrameOfReference", "(Z)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "calculateAlignmentLine", "replace$ui_release", "replace", "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "result", "captureRulers$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "_rulerScope", "Landroidx/compose/ui/layout/RulerScope;", "isPlacedUnderMotionFrameOfReference", "Z", "()Z", "setPlacedUnderMotionFrameOfReference", "isShallowPlacing", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/collection/MutableObjectFloatMap;", "rulerValues", "Landroidx/collection/MutableObjectFloatMap;", "rulerValuesCache", "Landroidx/collection/MutableScatterMap;", "rulerReaders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "hasMeasureResult", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getRulerScope", "()Landroidx/compose/ui/layout/RulerScope;", "rulerScope", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.LookaheadCapablePlaceable, reason: use source file name */
/* loaded from: classes.dex */
public abstract class LookaheadDelegate2 extends Placeable implements MeasureScopeWithLayoutNode, LayoutNodeLayoutDelegate4 {
    private static final Function1<PlaceableResult, Unit> onCommitAffectingRuler = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulers(placeableResult);
            }
        }
    };
    private MeasureScope2 _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = Placeable4.PlacementScope(this);
    private ScatterMap6<Ruler, ScatterSet2<WeakReference<LayoutNode>>> rulerReaders;
    private ObjectFloatMap2<Ruler> rulerValues;
    private ObjectFloatMap2<Ruler> rulerValuesCache;

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public abstract LookaheadDelegate2 getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.p011ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadDelegate2 getParent();

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long getPosition();

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public abstract void replace$ui_release();

    /* renamed from: isPlacedUnderMotionFrameOfReference, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    @Override // androidx.compose.p011ui.node.LayoutNodeLayoutDelegate4
    public void updatePlacedUnderMotionFrameOfReference(boolean newMFR) {
        LookaheadDelegate2 parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (Intrinsics.areEqual(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(newMFR);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(newMFR);
    }

    public final MeasureScope2 getRulerScope() {
        MeasureScope2 measureScope2 = this._rulerScope;
        return measureScope2 == null ? new MeasureScope2() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.p011ui.unit.Density
            public float getDensity() {
                return this.this$0.getDensity();
            }

            @Override // androidx.compose.p011ui.unit.FontScaling
            public float getFontScale() {
                return this.this$0.getFontScale();
            }
        } : measureScope2;
    }

    @Override // androidx.compose.p011ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + IntOffset.m8039getYimpl(getApparentToRealOffset());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: isShallowPlacing$ui_release, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.isShallowPlacing = z;
    }

    /* renamed from: isPlacingForAlignment$ui_release, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    protected final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        LayoutNodeAlignmentLines2 alignmentLines;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.areEqual(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        LayoutNodeLayoutDelegate2 parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    private final LookaheadDelegate2 findAncestorRulerDefiner(Ruler ruler) {
        LookaheadDelegate2 parent;
        LookaheadDelegate2 lookaheadDelegate2 = this;
        while (true) {
            ObjectFloatMap2<Ruler> objectFloatMap2 = lookaheadDelegate2.rulerValues;
            if ((objectFloatMap2 != null && objectFloatMap2.containsKey(ruler)) || (parent = lookaheadDelegate2.getParent()) == null) {
                return lookaheadDelegate2;
            }
            lookaheadDelegate2 = parent;
        }
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        ScatterMap6<Ruler, ScatterSet2<WeakReference<LayoutNode>>> scatterMap6 = findAncestorRulerDefiner(ruler).rulerReaders;
        ScatterSet2<WeakReference<LayoutNode>> scatterSet2Remove = scatterMap6 != null ? scatterMap6.remove(ruler) : null;
        if (scatterSet2Remove != null) {
            notifyRulerValueChange(scatterSet2Remove);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyRulerValueChange(ScatterSet2<WeakReference<LayoutNode>> layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void captureRulers$ui_release(MeasureResult result) {
        if (result != null) {
            captureRulers(new PlaceableResult(result, this));
            return;
        }
        ScatterMap6<Ruler, ScatterSet2<WeakReference<LayoutNode>>> scatterMap6 = this.rulerReaders;
        if (scatterMap6 != null) {
            Object[] objArr = scatterMap6.values;
            long[] jArr = scatterMap6.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                notifyRulerValueChange((ScatterSet2) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        ScatterMap6<Ruler, ScatterSet2<WeakReference<LayoutNode>>> scatterMap62 = this.rulerReaders;
        if (scatterMap62 != null) {
            scatterMap62.clear();
        }
        ObjectFloatMap2<Ruler> objectFloatMap2 = this.rulerValues;
        if (objectFloatMap2 != null) {
            objectFloatMap2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void captureRulers(final PlaceableResult placeableResult) {
        long j;
        long j2;
        LookaheadDelegate2 parent;
        long j3;
        ScatterSet2<WeakReference<LayoutNode>> scatterSet2Remove;
        OwnerSnapshotObserver snapshotObserver;
        char c;
        char c2;
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<MeasureScope2, Unit> rulers = placeableResult.getResult().getRulers();
        ScatterMap6<Ruler, ScatterSet2<WeakReference<LayoutNode>>> scatterMap6 = this.rulerReaders;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        int i = 0;
        if (rulers == null) {
            if (scatterMap6 != null) {
                Object[] objArr = scatterMap6.values;
                long[] jArr = scatterMap6.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j5 = jArr[i2];
                        if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j5 & 255) < 128) {
                                    c2 = c3;
                                    notifyRulerValueChange((ScatterSet2) objArr[(i2 << 3) + i4]);
                                } else {
                                    c2 = c3;
                                }
                                j5 >>= 8;
                                i4++;
                                c3 = c2;
                            }
                            c = c3;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            c = c3;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        c3 = c;
                    }
                }
                scatterMap6.clear();
                return;
            }
            return;
        }
        long j6 = 128;
        ObjectFloatMap2<Ruler> objectFloatMap2 = this.rulerValuesCache;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i5 = 1;
        if (objectFloatMap2 == null) {
            objectFloatMap2 = new ObjectFloatMap2<>(i, i5, defaultConstructorMarker);
            this.rulerValuesCache = objectFloatMap2;
        }
        ObjectFloatMap2<Ruler> objectFloatMap22 = this.rulerValues;
        if (objectFloatMap22 == null) {
            objectFloatMap22 = new ObjectFloatMap2<>(i, i5, defaultConstructorMarker);
            this.rulerValues = objectFloatMap22;
        }
        objectFloatMap2.putAll(objectFloatMap22);
        objectFloatMap22.clear();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(placeableResult, onCommitAffectingRuler, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Function1<MeasureScope2, Unit> rulers2 = placeableResult.getResult().getRulers();
                    if (rulers2 != null) {
                        rulers2.invoke(this.getRulerScope());
                    }
                }
            });
        }
        if (scatterMap6 != null) {
            Object[] objArr2 = objectFloatMap2.keys;
            float[] fArr = objectFloatMap2.values;
            long[] jArr2 = objectFloatMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j7 = jArr2[i6];
                    j = j4;
                    if ((((~j7) << 7) & j7 & j) != j) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        int i8 = i;
                        while (i8 < i7) {
                            if ((j7 & 255) < j6) {
                                int i9 = (i6 << 3) + i8;
                                Ruler ruler = (Ruler) objArr2[i9];
                                j3 = j6;
                                if (objectFloatMap22.getOrDefault(ruler, Float.NaN) != fArr[i9] && (scatterSet2Remove = scatterMap6.remove(ruler)) != null) {
                                    notifyRulerValueChange(scatterSet2Remove);
                                }
                            } else {
                                j3 = j6;
                            }
                            j7 >>= 8;
                            i8++;
                            j6 = j3;
                        }
                        j2 = j6;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        j2 = j6;
                    }
                    if (i6 == length2) {
                        break;
                    }
                    i6++;
                    j4 = j;
                    j6 = j2;
                    i = 0;
                }
            } else {
                j = -9187201950435737472L;
                j2 = 128;
            }
        }
        Object[] objArr3 = objectFloatMap22.keys;
        long[] jArr3 = objectFloatMap22.metadata;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i10 = 0;
            while (true) {
                long j8 = jArr3[i10];
                if ((((~j8) << 7) & j8 & j) != j) {
                    int i11 = 8 - ((~(i10 - length3)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j8 & 255) < j2) {
                            Ruler ruler2 = (Ruler) objArr3[(i10 << 3) + i12];
                            if (!objectFloatMap2.containsKey(ruler2) && (parent = getParent()) != null) {
                                parent.invalidateChildrenOfDefiningRuler(ruler2);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 == length3) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        objectFloatMap2.clear();
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> alignmentLines, final Function1<? super MeasureScope2, Unit> rulers, final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            InlineClassHelper4.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public int getF170$w() {
                return width;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public int getF169$h() {
                return height;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Function1<MeasureScope2, Unit> getRulers() {
                return rulers;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
                placementBlock.invoke(this.getPlacementScope());
            }
        };
    }
}
