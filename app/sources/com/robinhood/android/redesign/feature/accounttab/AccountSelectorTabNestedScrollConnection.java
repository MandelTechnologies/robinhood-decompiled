package com.robinhood.android.redesign.feature.accounttab;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: AccountSelectorTabNestedScrollConnection.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B¸\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u000e\u0012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010!¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorTabNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "tabExpansionProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scrollThreshold", "Lkotlin/Function0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isAtTop", "", "isGestureActive", "notifyGestureActive", "Lkotlin/Function1;", "", "setUiExpansionState", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "notifyHorizontalPagingAllowed", "Lkotlin/ParameterName;", "name", "allowed", "calculateTabHeightProgress", "Lkotlin/Function3;", "<init>", "(Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "logger", "Ltimber/log/Timber$Tree;", "getLogger", "()Ltimber/log/Timber$Tree;", "gestureStartOffset", "Landroidx/compose/ui/geometry/Offset;", "accumulatedOffset", "J", "onPreScroll", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPostScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "resetAfterScrollGesture", "resetAfterScrollGesture-k-4lQ0M", "(J)V", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountSelectorTabNestedScrollConnection implements NestedScrollModifier {
    public static final int $stable = 8;
    private long accumulatedOffset;
    private final Function3<Float, Float, Float, Float> calculateTabHeightProgress;
    private final CoroutineScope coroutineScope;
    private Offset gestureStartOffset;
    private final Function0<Boolean> isAtTop;
    private final Function0<Boolean> isGestureActive;
    private final Function1<Boolean, Unit> notifyGestureActive;
    private final Function1<Boolean, Unit> notifyHorizontalPagingAllowed;
    private final Function0<Float> scrollThreshold;
    private final Function1<AccountSelectorExpansionState, Unit> setUiExpansionState;
    private final Animatable<Float, AnimationVectors2> tabExpansionProgress;

    public final Timber.Tree getLogger() {
        return null;
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    public AccountSelectorTabNestedScrollConnection(Animatable<Float, AnimationVectors2> tabExpansionProgress, Function0<Float> scrollThreshold, CoroutineScope coroutineScope, Function0<Boolean> isAtTop, Function0<Boolean> isGestureActive, Function1<? super Boolean, Unit> notifyGestureActive, Function1<? super AccountSelectorExpansionState, Unit> setUiExpansionState, Function1<? super Boolean, Unit> notifyHorizontalPagingAllowed, Function3<? super Float, ? super Float, ? super Float, Float> calculateTabHeightProgress) {
        Intrinsics.checkNotNullParameter(tabExpansionProgress, "tabExpansionProgress");
        Intrinsics.checkNotNullParameter(scrollThreshold, "scrollThreshold");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(isAtTop, "isAtTop");
        Intrinsics.checkNotNullParameter(isGestureActive, "isGestureActive");
        Intrinsics.checkNotNullParameter(notifyGestureActive, "notifyGestureActive");
        Intrinsics.checkNotNullParameter(setUiExpansionState, "setUiExpansionState");
        Intrinsics.checkNotNullParameter(notifyHorizontalPagingAllowed, "notifyHorizontalPagingAllowed");
        Intrinsics.checkNotNullParameter(calculateTabHeightProgress, "calculateTabHeightProgress");
        this.tabExpansionProgress = tabExpansionProgress;
        this.scrollThreshold = scrollThreshold;
        this.coroutineScope = coroutineScope;
        this.isAtTop = isAtTop;
        this.isGestureActive = isGestureActive;
        this.notifyGestureActive = notifyGestureActive;
        this.setUiExpansionState = setUiExpansionState;
        this.notifyHorizontalPagingAllowed = notifyHorizontalPagingAllowed;
        this.calculateTabHeightProgress = calculateTabHeightProgress;
        this.accumulatedOffset = Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    @SuppressLint({"BinaryOperationInTimber"})
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo5298onPreScrollOzD1aCk(long available, int source) {
        boolean zBooleanValue;
        float fFloatValue = this.scrollThreshold.invoke().floatValue();
        boolean z = false;
        if (fFloatValue > 0.0f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (available >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (available & 4294967295L));
            if (this.gestureStartOffset == null) {
                this.gestureStartOffset = Offset.m6534boximpl(available);
                this.accumulatedOffset = Offset.INSTANCE.m6553getZeroF1C5BW0();
                Timber.Tree logger = getLogger();
                if (logger != null) {
                    logger.mo3350d("NestedScroll: Starting new gesture", new Object[0]);
                }
            }
            this.accumulatedOffset = Offset.m6547plusMKHz9U(this.accumulatedOffset, available);
            float fFloatValue2 = this.tabExpansionProgress.getValue().floatValue();
            Timber.Tree logger2 = getLogger();
            if (logger2 != null) {
                logger2.mo3350d("NestedScroll: available=[dx=" + fIntBitsToFloat + ", dy=" + fIntBitsToFloat2 + "], threshold=" + fFloatValue + ", progress=" + fFloatValue2 + ", accumulatedOffset=" + Offset.m6549toStringimpl(this.accumulatedOffset) + ", isAtTop=" + this.isAtTop.invoke() + ", isGestureActive=" + this.isGestureActive.invoke(), new Object[0]);
            }
            if (fIntBitsToFloat2 > 0.0f) {
                zBooleanValue = this.isAtTop.invoke().booleanValue();
            } else {
                zBooleanValue = fIntBitsToFloat2 < 0.0f && (this.isAtTop.invoke().booleanValue() || this.isGestureActive.invoke().booleanValue());
            }
            if (!zBooleanValue) {
                return Offset.INSTANCE.m6553getZeroF1C5BW0();
            }
            if (fIntBitsToFloat2 <= 0.0f ? !(fIntBitsToFloat2 >= 0.0f || fFloatValue2 >= 1.0f) : fFloatValue2 > 0.0f) {
                z = true;
            }
            if (!z) {
                return Offset.INSTANCE.m6553getZeroF1C5BW0();
            }
            if (!this.isGestureActive.invoke().booleanValue()) {
                this.notifyGestureActive.invoke(Boolean.TRUE);
                this.setUiExpansionState.invoke(new AccountSelectorExpansionState.Transitioning(AccountSelectorExpansionState.Expanded.INSTANCE, fIntBitsToFloat2 > 0.0f ? AccountSelectorExpansionState.Expanded.INSTANCE : AccountSelectorExpansionState.Collapsed.INSTANCE));
                Timber.Tree logger3 = getLogger();
                if (logger3 != null) {
                    logger3.mo3350d("NestedScroll: Started gesture, dy=%.2f, direction=%s", Float.valueOf(fIntBitsToFloat2), fIntBitsToFloat2 > 0.0f ? "EXPAND" : "COLLAPSE");
                }
            }
            float fFloatValue3 = this.calculateTabHeightProgress.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fIntBitsToFloat2), Float.valueOf(fFloatValue)).floatValue();
            float f = (-(fFloatValue3 - fFloatValue2)) * fFloatValue;
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AccountSelectorTabNestedScrollConnection2(this, fFloatValue3, null), 3, null);
            Timber.Tree logger4 = getLogger();
            if (logger4 != null) {
                logger4.mo3350d("NestedScroll: progress=%.3f→%.3f, consumed=%.2f", Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3), Float.valueOf(f));
            }
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        }
        Timber.Tree logger5 = getLogger();
        if (logger5 != null) {
            logger5.mo3350d("NestedScroll: threshold is 0, skipping", new Object[0]);
        }
        return Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
        m17949resetAfterScrollGesturek4lQ0M(available);
        return Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* renamed from: resetAfterScrollGesture-k-4lQ0M, reason: not valid java name */
    private final void m17949resetAfterScrollGesturek4lQ0M(long available) {
        Offset.Companion companion = Offset.INSTANCE;
        if (Offset.m6540equalsimpl0(available, companion.m6553getZeroF1C5BW0())) {
            this.gestureStartOffset = null;
            this.accumulatedOffset = companion.m6553getZeroF1C5BW0();
            this.notifyHorizontalPagingAllowed.invoke(Boolean.TRUE);
            Timber.Tree logger = getLogger();
            if (logger != null) {
                logger.mo3350d("NestedScroll: Gesture ended, reset direction state", new Object[0]);
            }
        }
    }
}
