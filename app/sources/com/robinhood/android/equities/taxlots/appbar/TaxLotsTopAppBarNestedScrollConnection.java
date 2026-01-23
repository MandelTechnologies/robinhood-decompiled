package com.robinhood.android.equities.taxlots.appbar;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: TaxLotsTopAppBarNestedScrollConnection.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tJ\u0015\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b'\u0010%J\u000e\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\tJ\u001f\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020 H\u0007J\u000e\u00107\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/appbar/TaxLotsTopAppBarNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "keyboardVisible", "", "staticAppBarInitialHeight", "", "collapsingHeaderInitialHeight", "staticAppBarInitialOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "collapsingHeaderInitialOffset", "collapsingAnimationProgress", "Landroidx/compose/runtime/MutableFloatState;", "getCollapsingAnimationProgress$annotations", "()V", "getCollapsingAnimationProgress", "()Landroidx/compose/runtime/MutableFloatState;", "collapsingAppBarAdditionalOffset", "Landroidx/compose/runtime/MutableState;", "getCollapsingAppBarAdditionalOffset", "()Landroidx/compose/runtime/MutableState;", "collapsingAppbarHeight", "Landroidx/compose/runtime/MutableIntState;", "getCollapsingAppbarHeight", "()Landroidx/compose/runtime/MutableIntState;", "animationComplete", "getAnimationComplete", "setStaticAppBarHeight", "", "height", "setStaticAppBarOffset", "offset", "setStaticAppBarOffset-k-4lQ0M", "(J)V", "setCollapsingAppBarOffset", "setCollapsingAppBarOffset-k-4lQ0M", "setCollapsingAppBarHeight", "onPreScroll", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "getCollapsingHeaderFontSize", "Landroidx/compose/ui/unit/TextUnit;", "collapsingAppBarFont", "Landroidx/compose/ui/text/TextStyle;", "staticAppBarFont", "getCollapsingHeaderFontSize-5XXgJZs", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)J", "collapseAppBar", "setKeyboardState", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotsTopAppBarNestedScrollConnection implements NestedScrollModifier {
    public static final int $stable = 8;
    private final SnapshotState<Boolean> animationComplete;
    private final SnapshotFloatState2 collapsingAnimationProgress;
    private final SnapshotState<Offset> collapsingAppBarAdditionalOffset;
    private final SnapshotIntState2 collapsingAppbarHeight;
    private int collapsingHeaderInitialHeight;
    private long collapsingHeaderInitialOffset;
    private boolean keyboardVisible;
    private final LazyListState scrollState;
    private int staticAppBarInitialHeight;
    private long staticAppBarInitialOffset;

    public static /* synthetic */ void getCollapsingAnimationProgress$annotations() {
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i) {
        return super.mo5024onPostScrollDzOQY0M(j, j2, i);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
        return super.mo5609onPreFlingQWom1Mo(j, continuation);
    }

    public TaxLotsTopAppBarNestedScrollConnection(LazyListState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scrollState = scrollState;
        Offset.Companion companion = Offset.INSTANCE;
        this.staticAppBarInitialOffset = companion.m6553getZeroF1C5BW0();
        this.collapsingHeaderInitialOffset = companion.m6553getZeroF1C5BW0();
        this.collapsingAnimationProgress = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.collapsingAppBarAdditionalOffset = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(companion.m6553getZeroF1C5BW0()), null, 2, null);
        this.collapsingAppbarHeight = SnapshotIntState3.mutableIntStateOf(0);
        this.animationComplete = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final SnapshotFloatState2 getCollapsingAnimationProgress() {
        return this.collapsingAnimationProgress;
    }

    public final SnapshotState<Offset> getCollapsingAppBarAdditionalOffset() {
        return this.collapsingAppBarAdditionalOffset;
    }

    public final SnapshotIntState2 getCollapsingAppbarHeight() {
        return this.collapsingAppbarHeight;
    }

    public final SnapshotState<Boolean> getAnimationComplete() {
        return this.animationComplete;
    }

    public final void setStaticAppBarHeight(int height) {
        this.staticAppBarInitialHeight = height;
    }

    /* renamed from: setStaticAppBarOffset-k-4lQ0M, reason: not valid java name */
    public final void m13609setStaticAppBarOffsetk4lQ0M(long offset) {
        this.staticAppBarInitialOffset = offset;
    }

    /* renamed from: setCollapsingAppBarOffset-k-4lQ0M, reason: not valid java name */
    public final void m13608setCollapsingAppBarOffsetk4lQ0M(long offset) {
        if (Offset.m6540equalsimpl0(this.collapsingAppBarAdditionalOffset.getValue().getPackedValue(), Offset.INSTANCE.m6552getUnspecifiedF1C5BW0())) {
            return;
        }
        this.collapsingHeaderInitialOffset = Offset.m6546minusMKHz9U(offset, this.collapsingAppBarAdditionalOffset.getValue().getPackedValue());
    }

    public final void setCollapsingAppBarHeight(int height) {
        int i = this.collapsingHeaderInitialHeight;
        if (i == 0 || height > i + this.staticAppBarInitialHeight) {
            this.collapsingHeaderInitialHeight = height;
            this.collapsingAppbarHeight.setIntValue(height + this.staticAppBarInitialHeight);
        }
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo5298onPreScrollOzD1aCk(long available, int source) {
        if (this.keyboardVisible) {
            return Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        int firstVisibleItemIndex = this.scrollState.getFirstVisibleItemIndex();
        int firstVisibleItemScrollOffset = this.scrollState.getFirstVisibleItemScrollOffset();
        if (firstVisibleItemIndex == 0 && firstVisibleItemScrollOffset == 0) {
            SnapshotIntState2 snapshotIntState2 = this.collapsingAppbarHeight;
            int intValue = snapshotIntState2.getIntValue() + ((int) Float.intBitsToFloat((int) (4294967295L & available)));
            int i = this.staticAppBarInitialHeight;
            snapshotIntState2.setIntValue(RangesKt.coerceIn(intValue, i, this.collapsingHeaderInitialHeight + i));
        }
        this.collapsingAnimationProgress.setFloatValue(1.0f - ((this.collapsingAppbarHeight.getIntValue() - this.staticAppBarInitialHeight) / this.collapsingHeaderInitialHeight));
        this.collapsingAppBarAdditionalOffset.setValue(Offset.m6534boximpl(Offset.m6548timestuRUvjQ(Offset.m6537copydBAh8RU$default(Offset.m6546minusMKHz9U(this.staticAppBarInitialOffset, this.collapsingHeaderInitialOffset), 0.0f, 0.0f, 1, null), this.collapsingAnimationProgress.getFloatValue())));
        this.animationComplete.setValue(Boolean.valueOf(this.collapsingAnimationProgress.getFloatValue() == 1.0f));
        if (this.collapsingAppbarHeight.getIntValue() - this.staticAppBarInitialHeight > 0) {
            return Offset.m6537copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
        }
        return Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* renamed from: getCollapsingHeaderFontSize-5XXgJZs, reason: not valid java name */
    public final long m13607getCollapsingHeaderFontSize5XXgJZs(TextStyle collapsingAppBarFont, TextStyle staticAppBarFont) {
        Intrinsics.checkNotNullParameter(collapsingAppBarFont, "collapsingAppBarFont");
        Intrinsics.checkNotNullParameter(staticAppBarFont, "staticAppBarFont");
        return TextUnit2.getSp(TextUnit.m8074getValueimpl(collapsingAppBarFont.m7662getFontSizeXSAIIZE()) - (this.collapsingAnimationProgress.getFloatValue() * (TextUnit.m8074getValueimpl(collapsingAppBarFont.m7662getFontSizeXSAIIZE()) - TextUnit.m8074getValueimpl(staticAppBarFont.m7662getFontSizeXSAIIZE()))));
    }

    public final void collapseAppBar() {
        this.collapsingAppbarHeight.setIntValue(this.staticAppBarInitialHeight);
        mo5298onPreScrollOzD1aCk(Offset.INSTANCE.m6553getZeroF1C5BW0(), NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI());
    }

    public final void setKeyboardState(boolean keyboardVisible) {
        if (keyboardVisible) {
            collapseAppBar();
        }
        this.keyboardVisible = keyboardVisible;
    }
}
