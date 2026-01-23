package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tJ\"\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\"\u0010'\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\u0002058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b6\u0010/R\u0016\u0010:\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010=\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m3636d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadOffset-F1C5BW0", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo7241getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m8056constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelper4.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelper4.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m7253getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinates2.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m6546minusMKHz9U(mo7242localPositionOfR5De75A(coordinates, companion.m6553getZeroF1C5BW0()), getCoordinator().mo7242localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m6553getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo7247screenToLocalMKHz9U(long relativeToScreen) {
        return Offset.m6547plusMKHz9U(getCoordinator().mo7247screenToLocalMKHz9U(relativeToScreen), m7253getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo7245localToScreenMKHz9U(long relativeToLocal) {
        return getCoordinator().mo7245localToScreenMKHz9U(Offset.m6547plusMKHz9U(relativeToLocal, m7253getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo7250windowToLocalMKHz9U(long relativeToWindow) {
        return Offset.m6547plusMKHz9U(getCoordinator().mo7250windowToLocalMKHz9U(relativeToWindow), m7253getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo7246localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo7246localToWindowMKHz9U(Offset.m6547plusMKHz9U(relativeToLocal, m7253getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo7244localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo7244localToRootMKHz9U(Offset.m6547plusMKHz9U(relativeToLocal, m7253getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo7242localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo7243localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo7243localPositionOfS_NoaFU(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) sourceCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long jM8041minusqkQi6aY = IntOffset.m8041minusqkQi6aY(IntOffset.m8042plusqkQi6aY(lookaheadDelegate.m7330positionIniSbpLlY$ui_release(lookaheadDelegate2, !includeMotionFrameOfReference), IntOffset2.m8050roundk4lQ0M(relativeToSource)), this.lookaheadDelegate.m7330positionIniSbpLlY$ui_release(lookaheadDelegate2, !includeMotionFrameOfReference));
                float fM8038getXimpl = IntOffset.m8038getXimpl(jM8041minusqkQi6aY);
                float fM8039getYimpl = IntOffset.m8039getYimpl(jM8041minusqkQi6aY);
                return Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8038getXimpl) << 32) | (Float.floatToRawIntBits(fM8039getYimpl) & 4294967295L));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinates2.getRootLookaheadDelegate(lookaheadDelegate);
            long jM8042plusqkQi6aY = IntOffset.m8042plusqkQi6aY(IntOffset.m8042plusqkQi6aY(lookaheadDelegate.m7330positionIniSbpLlY$ui_release(rootLookaheadDelegate, !includeMotionFrameOfReference), rootLookaheadDelegate.getPosition()), IntOffset2.m8050roundk4lQ0M(relativeToSource));
            LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinates2.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jM8041minusqkQi6aY2 = IntOffset.m8041minusqkQi6aY(jM8042plusqkQi6aY, IntOffset.m8042plusqkQi6aY(this.lookaheadDelegate.m7330positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !includeMotionFrameOfReference), rootLookaheadDelegate2.getPosition()));
            float fM8038getXimpl2 = IntOffset.m8038getXimpl(jM8041minusqkQi6aY2);
            float fM8039getYimpl2 = IntOffset.m8039getYimpl(jM8041minusqkQi6aY2);
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8039getYimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM8038getXimpl2) << 32));
            NodeCoordinator wrappedBy = rootLookaheadDelegate2.getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy2);
            return wrappedBy.mo7243localPositionOfS_NoaFU(wrappedBy2, jM6535constructorimpl, includeMotionFrameOfReference);
        }
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinates2.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jMo7243localPositionOfS_NoaFU = mo7243localPositionOfS_NoaFU(rootLookaheadDelegate3.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
        long position = rootLookaheadDelegate3.getPosition();
        float fM8038getXimpl3 = IntOffset.m8038getXimpl(position);
        float fM8039getYimpl3 = IntOffset.m8039getYimpl(position);
        long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(jMo7243localPositionOfS_NoaFU, Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(fM8039getYimpl3)) | (Float.floatToRawIntBits(fM8038getXimpl3) << 32)));
        LayoutCoordinates parentCoordinates = rootLookaheadDelegate3.getCoordinator().getParentCoordinates();
        if (parentCoordinates == null) {
            parentCoordinates = rootLookaheadDelegate3.getCoordinator().getCoordinates();
        }
        return Offset.m6547plusMKHz9U(jM6546minusMKHz9U, parentCoordinates.mo7243localPositionOfS_NoaFU(sourceCoordinates, Offset.INSTANCE.m6553getZeroF1C5BW0(), includeMotionFrameOfReference));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo7248transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        getCoordinator().mo7248transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo7249transformToScreen58bKbWc(float[] matrix) {
        getCoordinator().mo7249transformToScreen58bKbWc(matrix);
    }
}
