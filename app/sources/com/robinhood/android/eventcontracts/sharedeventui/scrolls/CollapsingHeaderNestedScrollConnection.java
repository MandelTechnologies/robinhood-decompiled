package com.robinhood.android.eventcontracts.sharedeventui.scrolls;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: CollapsingHeaderNestedScrollConnection.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u000bR\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u000b¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "density", "Landroidx/compose/ui/unit/Density;", "headerMaxHeightPxState", "Landroidx/compose/runtime/State;", "", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/State;)V", "headerMaxHeightPx", "getHeaderMaxHeightPx", "()F", "headerMaxHeightPx$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "headerOffset", "getHeaderOffset", "setHeaderOffset", "(F)V", "headerOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "headerAlpha", "getHeaderAlpha", "headerAlpha$delegate", "spaceHeight", "Landroidx/compose/ui/unit/Dp;", "getSpaceHeight-D9Ej5fM", "spaceHeight$delegate", "onPreScroll", "Landroidx/compose/ui/geometry/Offset;", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPostScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CollapsingHeaderNestedScrollConnection implements NestedScrollModifier {
    public static final int $stable = 0;
    private final Density density;

    /* renamed from: headerAlpha$delegate, reason: from kotlin metadata */
    private final SnapshotState4 headerAlpha;

    /* renamed from: headerMaxHeightPx$delegate, reason: from kotlin metadata */
    private final SnapshotState4 headerMaxHeightPx;

    /* renamed from: headerOffset$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 headerOffset;

    /* renamed from: spaceHeight$delegate, reason: from kotlin metadata */
    private final SnapshotState4 spaceHeight;

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
        return super.mo5609onPreFlingQWom1Mo(j, continuation);
    }

    public CollapsingHeaderNestedScrollConnection(Density density, SnapshotState4<Float> headerMaxHeightPxState) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(headerMaxHeightPxState, "headerMaxHeightPxState");
        this.density = density;
        this.headerMaxHeightPx = headerMaxHeightPxState;
        this.headerOffset = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.headerAlpha = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.scrolls.CollapsingHeaderNestedScrollConnection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(CollapsingHeaderNestedScrollConnection.headerAlpha_delegate$lambda$0(this.f$0));
            }
        });
        this.spaceHeight = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.scrolls.CollapsingHeaderNestedScrollConnection$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollapsingHeaderNestedScrollConnection.spaceHeight_delegate$lambda$2(this.f$0);
            }
        });
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
        float headerOffset = getHeaderOffset() + Float.intBitsToFloat((int) (available & 4294967295L));
        float headerOffset2 = getHeaderOffset();
        float f = -getHeaderMaxHeightPx();
        setHeaderOffset(f > 0.0f ? 0.0f : RangesKt.coerceIn(headerOffset, f, 0.0f));
        return Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(getHeaderOffset() - headerOffset2)) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo5298onPreScrollOzD1aCk(long available, int source) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        if (fIntBitsToFloat >= 0.0f) {
            return Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        float headerOffset = getHeaderOffset() + fIntBitsToFloat;
        float headerOffset2 = getHeaderOffset();
        float f = -getHeaderMaxHeightPx();
        setHeaderOffset(f > 0.0f ? 0.0f : RangesKt.coerceIn(headerOffset, f, 0.0f));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(getHeaderOffset() - headerOffset2)));
    }

    private final float getHeaderMaxHeightPx() {
        return ((Number) this.headerMaxHeightPx.getValue()).floatValue();
    }

    private final float getHeaderOffset() {
        return this.headerOffset.getFloatValue();
    }

    private final void setHeaderOffset(float f) {
        this.headerOffset.setFloatValue(f);
    }

    public final float getHeaderAlpha() {
        return ((Number) this.headerAlpha.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float headerAlpha_delegate$lambda$0(CollapsingHeaderNestedScrollConnection collapsingHeaderNestedScrollConnection) {
        return 1 - (Math.abs(collapsingHeaderNestedScrollConnection.getHeaderOffset()) / collapsingHeaderNestedScrollConnection.getHeaderMaxHeightPx());
    }

    /* renamed from: getSpaceHeight-D9Ej5fM, reason: not valid java name */
    public final float m14411getSpaceHeightD9Ej5fM() {
        return ((C2002Dp) this.spaceHeight.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp spaceHeight_delegate$lambda$2(CollapsingHeaderNestedScrollConnection collapsingHeaderNestedScrollConnection) {
        return C2002Dp.m7993boximpl(collapsingHeaderNestedScrollConnection.density.mo5012toDpu2uoSUM(collapsingHeaderNestedScrollConnection.getHeaderMaxHeightPx() + collapsingHeaderNestedScrollConnection.getHeaderOffset()));
    }
}
