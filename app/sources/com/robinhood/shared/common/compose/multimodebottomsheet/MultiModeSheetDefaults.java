package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiModeSheetDefaults.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0000¨\u0006\r"}, m3636d2 = {"ConsumeSwipeWithinMultiModeBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetDefaultsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class MultiModeSheetDefaults {
    /* renamed from: ConsumeSwipeWithinMultiModeBottomSheetBoundsNestedScrollConnection */
    public static final NestedScrollModifier m2761x1005d098(final MultiModeSheetState sheetState, final Orientation orientation, final Function1<? super Float, Unit> onFling) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onFling, "onFling");
        return new NestedScrollModifier() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetDefaultsKt.ConsumeSwipeWithinMultiModeBottomSheetBoundsNestedScrollConnection.1
            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo5298onPreScrollOzD1aCk(long available, int source) {
                float fOffsetToFloat = offsetToFloat(available);
                if (fOffsetToFloat < 0.0f && NestedScrollModifier8.m7133equalsimpl0(source, NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI())) {
                    return toOffset(sheetState.m2763xe9eec44d().dispatchRawDelta(fOffsetToFloat));
                }
                return Offset.INSTANCE.m6553getZeroF1C5BW0();
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
                if (NestedScrollModifier8.m7133equalsimpl0(source, NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI())) {
                    return toOffset(sheetState.m2763xe9eec44d().dispatchRawDelta(offsetToFloat(available)));
                }
                return Offset.INSTANCE.m6553getZeroF1C5BW0();
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo5609onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.m2763xe9eec44d().getAnchors().minAnchor();
                if (fVelocityToFloat < 0.0f && fRequireOffset > fMinAnchor) {
                    onFling.invoke(boxing.boxFloat(fVelocityToFloat));
                } else {
                    j = Velocity.INSTANCE.m8109getZero9UxMQ8M();
                }
                return Velocity.m8095boximpl(j);
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
                onFling.invoke(boxing.boxFloat(velocityToFloat(j2)));
                return Velocity.m8095boximpl(j2);
            }

            private final long toOffset(float f) {
                Orientation orientation2 = orientation;
                float f2 = orientation2 == Orientation.Horizontal ? f : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            }

            @JvmName
            private final float velocityToFloat(long j) {
                return orientation == Orientation.Horizontal ? Velocity.m8101getXimpl(j) : Velocity.m8102getYimpl(j);
            }

            @JvmName
            private final float offsetToFloat(long j) {
                return Float.intBitsToFloat((int) (orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
            }
        };
    }
}
