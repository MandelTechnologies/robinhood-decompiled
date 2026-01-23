package androidx.compose.p011ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.ObjectList2;
import androidx.compose.p011ui.Actual_androidKt;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.Matrix2;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.MeasurePassDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.OwnedLayer;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RectManager.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u000b*\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\b*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u000b*\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010%J(\u0010,\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010%J\u0015\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b1\u0010\nJ\u0015\u00102\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\nJ(\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u0015\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b5\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m3636d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(Landroidx/collection/IntObjectMap;)V", "layoutNode", "", "insertOrUpdateTransformedNodeSubhierarchy", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "firstPlacement", "insertOrUpdateTransformedNode-70tqf50", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "insertOrUpdateTransformedNode", "", "l", "t", Constants.REVENUE_AMOUNT_KEY, "b", "insertOrUpdate", "(Landroidx/compose/ui/node/LayoutNode;ZIIII)V", "Landroidx/compose/ui/node/NodeCoordinator;", "positionInRoot-Bjo55l4", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "positionInRoot", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "boundingRectInRoot", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "outerToInnerOffset-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "outerToInnerOffset", "invalidate", "()V", "screenOffset", "windowOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "updateOffsets-ucfNpQE", "(JJ[F)V", "updateOffsets", "dispatchCallbacks", "ensureSomethingScheduled", "scheduleDebounceCallback", "(Z)V", "invalidateCallbacksFor", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged-70tqf50", "onLayoutPositionChanged", "remove", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "callbacks", "Landroidx/collection/MutableObjectList;", "isDirty", "Z", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "Ljava/lang/Object;", "", "scheduledDispatchDeadline", "J", "dispatchLambda", "Lkotlin/jvm/functions/Function0;", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RectManager {
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects = new RectList();
    private final ThrottledCallbacks throttledCallbacks = new ThrottledCallbacks();
    private final ObjectList2<Function0<Unit>> callbacks = new ObjectList2<>(0, 1, null);
    private long scheduledDispatchDeadline = -1;
    private final Function0<Unit> dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
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
            this.this$0.dispatchToken = null;
            RectManager rectManager = this.this$0;
            Trace.beginSection("OnPositionedDispatch");
            try {
                rectManager.dispatchCallbacks();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    };
    private final MutableRect cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m7502updateOffsetsucfNpQE(long screenOffset, long windowOffset, float[] viewToWindowMatrix) {
        int iM7505analyzeComponents58bKbWc = RectManager3.m7505analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM7505analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m7509updateOffsetsbT0EZQs(screenOffset, windowOffset, viewToWindowMatrix) || this.isScreenOrWindowDirty;
    }

    public final void dispatchCallbacks() {
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            ObjectList2<Function0<Unit>> objectList2 = this.callbacks;
            Object[] objArr = objectList2.content;
            int i = objectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j), jArr[i4], jArr[i4 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.removePost(obj);
            }
            long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
            long jMax = Math.max(minDebounceDeadline, 16 + jCurrentTimeMillis);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = Actual_androidKt.postDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
        }
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.markUpdated(layoutNode.getSemanticsId());
        scheduleDebounceCallback(true);
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            m7498insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jM7499outerToInnerOffsetBjo55l4 = m7499outerToInnerOffsetBjo55l4(layoutNode);
            if (RectManager3.m7506isSetgyyYBs(jM7499outerToInnerOffsetBjo55l4)) {
                layoutNode.m7312setOuterToInnerOffsetgyyYBs$ui_release(jM7499outerToInnerOffsetBjo55l4);
                layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
                MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode2 = layoutNodeArr[i];
                    m7501onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
                }
                invalidateCallbacksFor(layoutNode);
                return;
            }
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m7501onLayoutPositionChanged70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        long j;
        long jM7500positionInRootBjo55l4;
        long jM7499outerToInnerOffsetBjo55l4;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long offsetFromRoot = layoutNode.getOffsetFromRoot();
            long lastSize = layoutNode.getLastSize();
            int i = (int) (lastSize >> 32);
            int i2 = (int) (lastSize & 4294967295L);
            boolean z = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty = parent$ui_release.getOuterToInnerOffsetDirty();
                long offsetFromRoot2 = parent$ui_release.getOffsetFromRoot();
                long outerToInnerOffset = parent$ui_release.getOuterToInnerOffset();
                if (RectManager3.m7506isSetgyyYBs(offsetFromRoot2)) {
                    if (outerToInnerOffsetDirty) {
                        j = 4294967295L;
                        jM7499outerToInnerOffsetBjo55l4 = m7499outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m7312setOuterToInnerOffsetgyyYBs$ui_release(jM7499outerToInnerOffsetBjo55l4);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j = 4294967295L;
                        jM7499outerToInnerOffsetBjo55l4 = outerToInnerOffset;
                    }
                    z = !RectManager3.m7506isSetgyyYBs(jM7499outerToInnerOffsetBjo55l4);
                    jM7500positionInRootBjo55l4 = IntOffset.m8042plusqkQi6aY(IntOffset.m8042plusqkQi6aY(offsetFromRoot2, jM7499outerToInnerOffsetBjo55l4), position);
                } else {
                    j = 4294967295L;
                    jM7500positionInRootBjo55l4 = m7500positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j = 4294967295L;
                jM7500positionInRootBjo55l4 = position;
            }
            if (z || !RectManager3.m7506isSetgyyYBs(jM7500positionInRootBjo55l4)) {
                m7498insertOrUpdateTransformedNode70tqf50(layoutNode, position, firstPlacement);
                return;
            }
            layoutNode.m7311setOffsetFromRootgyyYBs$ui_release(jM7500positionInRootBjo55l4);
            layoutNode.m7310setLastSizeozmzZPI$ui_release(IntSize.m8056constructorimpl((measuredWidth << 32) | (measuredHeight & j)));
            int iM8038getXimpl = IntOffset.m8038getXimpl(jM7500positionInRootBjo55l4);
            int iM8039getYimpl = IntOffset.m8039getYimpl(jM7500positionInRootBjo55l4);
            int i3 = iM8038getXimpl + measuredWidth;
            int i4 = iM8039getYimpl + measuredHeight;
            if (!firstPlacement && IntOffset.m8037equalsimpl0(jM7500positionInRootBjo55l4, offsetFromRoot) && i == measuredWidth && i2 == measuredHeight) {
                return;
            }
            insertOrUpdate(layoutNode, firstPlacement, iM8038getXimpl, iM8039getYimpl, i3, i4);
        }
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m7498insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m8038getXimpl(position), IntOffset.m8039getYimpl(position), IntOffset.m8038getXimpl(position) + measuredWidth, IntOffset.m8039getYimpl(position) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean firstPlacement, int l, int t, int r, int b) {
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.move(semanticsId, l, t, r, b)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, l, t, r, b, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m7500positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jM6553getZeroF1C5BW0 = IntOffset2.m8049plusNvtHpc(jM6553getZeroF1C5BW0, nodeCoordinator.getPosition());
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo7383getUnderlyingMatrixsQKQjiQ = layer.mo7383getUnderlyingMatrixsQKQjiQ();
                int iM7505analyzeComponents58bKbWc = RectManager3.m7505analyzeComponents58bKbWc(fArrMo7383getUnderlyingMatrixsQKQjiQ);
                if (iM7505analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM7505analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m8046getMaxnOccac();
                    }
                    jM6553getZeroF1C5BW0 = Matrix.m6784mapMKHz9U(fArrMo7383getUnderlyingMatrixsQKQjiQ, jM6553getZeroF1C5BW0);
                }
            }
        }
        return IntOffset2.m8050roundk4lQ0M(jM6553getZeroF1C5BW0);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long position = nodeCoordinator.getPosition();
            float fM8038getXimpl = IntOffset.m8038getXimpl(position);
            float fM8039getYimpl = IntOffset.m8039getYimpl(position);
            mutableRect.m6533translatek4lQ0M(Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8038getXimpl) << 32) | (Float.floatToRawIntBits(fM8039getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo7383getUnderlyingMatrixsQKQjiQ = layer.mo7383getUnderlyingMatrixsQKQjiQ();
                if (!Matrix2.m6795isIdentity58bKbWc(fArrMo7383getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m6785mapimpl(fArrMo7383getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m7499outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            jM6553getZeroF1C5BW0 = IntOffset2.m8049plusNvtHpc(jM6553getZeroF1C5BW0, innerCoordinator$ui_release.getPosition());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy();
            if (layer != null) {
                float[] fArrMo7383getUnderlyingMatrixsQKQjiQ = layer.mo7383getUnderlyingMatrixsQKQjiQ();
                int iM7505analyzeComponents58bKbWc = RectManager3.m7505analyzeComponents58bKbWc(fArrMo7383getUnderlyingMatrixsQKQjiQ);
                if (iM7505analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM7505analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m8046getMaxnOccac();
                    }
                    jM6553getZeroF1C5BW0 = Matrix.m6784mapMKHz9U(fArrMo7383getUnderlyingMatrixsQKQjiQ, jM6553getZeroF1C5BW0);
                }
            }
        }
        return IntOffset2.m8050roundk4lQ0M(jM6553getZeroF1C5BW0);
    }

    public final void remove(LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }
}
