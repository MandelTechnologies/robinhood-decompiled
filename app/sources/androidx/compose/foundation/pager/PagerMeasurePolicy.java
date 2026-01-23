package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraints;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m3636d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pageCount", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.pager.PagerMeasurePolicyKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PagerMeasurePolicy {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132 A[PHI: r3
      0x0132: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:104:0x0130, B:100:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[PHI: r4
      0x0074: PHI (r4v17 androidx.compose.foundation.gestures.Orientation) = (r4v15 androidx.compose.foundation.gestures.Orientation), (r4v18 androidx.compose.foundation.gestures.Orientation) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[PHI: r9
      0x0090: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x008e, B:42:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[PHI: r12
      0x00ac: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00aa, B:52:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[PHI: r13
      0x00c8: PHI (r13v12 float) = (r13v9 float), (r13v13 float) binds: [B:66:0x00c6, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
      0x00e4: PHI (r14v12 androidx.compose.foundation.pager.PageSize) = (r14v9 androidx.compose.foundation.pager.PageSize), (r14v13 androidx.compose.foundation.pager.PageSize) binds: [B:76:0x00e2, B:72:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe A[PHI: r5
      0x00fe: PHI (r5v8 androidx.compose.foundation.gestures.snapping.SnapPosition) = 
      (r5v6 androidx.compose.foundation.gestures.snapping.SnapPosition)
      (r5v9 androidx.compose.foundation.gestures.snapping.SnapPosition)
     binds: [B:86:0x00fc, B:82:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m5306rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, Orientation orientation, int i, float f, PageSize pageSize, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function02, Composer composer, int i2, int i3) {
        Orientation orientation2;
        boolean z2;
        Alignment.Horizontal horizontal2;
        boolean z3;
        Alignment.Vertical vertical2;
        boolean z4;
        float f2;
        boolean z5;
        PageSize pageSize2;
        boolean z6;
        SnapPosition snapPosition2;
        boolean z7;
        int i4;
        boolean z8;
        boolean zChanged;
        Object objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:57)");
        }
        boolean z9 = ((((i2 & 112) ^ 48) > 32 && composer.changed(pagerState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            orientation2 = orientation;
            if (composer.changed(orientation2)) {
                z2 = true;
            }
            boolean z10 = z9 | z2;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
                horizontal2 = horizontal;
                if (composer.changed(horizontal2)) {
                    z3 = true;
                }
                boolean z11 = z10 | z3;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    vertical2 = vertical;
                    if (composer.changed(vertical2)) {
                        z4 = true;
                    }
                    boolean z12 = z11 | z4;
                    if (((3670016 & i2) ^ 1572864) <= 1048576) {
                        f2 = f;
                        if (composer.changed(f2)) {
                            z5 = true;
                        }
                        boolean z13 = z12 | z5;
                        if (((29360128 & i2) ^ 12582912) > 8388608) {
                            pageSize2 = pageSize;
                            if (composer.changed(pageSize2)) {
                                z6 = true;
                            }
                            boolean z14 = z13 | z6;
                            if (((i3 & 14) ^ 6) <= 4) {
                                snapPosition2 = snapPosition;
                                if (composer.changed(snapPosition2)) {
                                    z7 = true;
                                }
                                boolean z15 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                                if (((458752 & i2) ^ 196608) > 131072) {
                                    i4 = i;
                                    if (composer.changed(i4)) {
                                        z8 = true;
                                    }
                                    zChanged = z15 | z8 | composer.changed(coroutineScope);
                                    objRememberedValue = composer.rememberedValue();
                                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final int i5 = i4;
                                        final SnapPosition snapPosition3 = snapPosition2;
                                        final Alignment.Horizontal horizontal3 = horizontal2;
                                        final Alignment.Vertical vertical3 = vertical2;
                                        final float f3 = f2;
                                        final PageSize pageSize3 = pageSize2;
                                        final Orientation orientation3 = orientation2;
                                        Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                                return m5307invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final PagerMeasureResult m5307invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                                int iMo5010roundToPx0680j_4;
                                                int iMo5010roundToPx0680j_42;
                                                int i6;
                                                int iM7975getMaxWidthimpl;
                                                long jM8033constructorimpl;
                                                ObservableScopeInvalidator.m5266attachToScopeimpl(pagerState.m5308getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                                Orientation orientation4 = orientation3;
                                                Orientation orientation5 = Orientation.Vertical;
                                                boolean z16 = orientation4 == orientation5;
                                                CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z16 ? orientation5 : Orientation.Horizontal);
                                                if (z16) {
                                                    iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                if (z16) {
                                                    iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5119calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getTop());
                                                int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getBottom());
                                                final int i7 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                                                final int i8 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                                                int i9 = z16 ? i7 : i8;
                                                if (z16 && !z) {
                                                    i6 = iMo5010roundToPx0680j_43;
                                                } else if (z16 && z) {
                                                    i6 = iMo5010roundToPx0680j_44;
                                                } else {
                                                    i6 = (z16 || z) ? iMo5010roundToPx0680j_42 : iMo5010roundToPx0680j_4;
                                                }
                                                int i10 = i9 - i6;
                                                long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i8, -i7);
                                                pagerState.setDensity$foundation_release(lazyLayoutMeasureScope);
                                                int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(f3);
                                                if (z16) {
                                                    iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i7;
                                                } else {
                                                    iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i8;
                                                }
                                                if (!z || iM7975getMaxWidthimpl > 0) {
                                                    jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                                } else {
                                                    if (!z16) {
                                                        iMo5010roundToPx0680j_4 += iM7975getMaxWidthimpl;
                                                    }
                                                    if (z16) {
                                                        iMo5010roundToPx0680j_43 += iM7975getMaxWidthimpl;
                                                    }
                                                    jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_43 & 4294967295L) | (iMo5010roundToPx0680j_4 << 32));
                                                }
                                                long j2 = jM8033constructorimpl;
                                                int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize3.calculateMainAxisPageSize(lazyLayoutMeasureScope, iM7975getMaxWidthimpl, iMo5010roundToPx0680j_45), 0);
                                                pagerState.m5311setPremeasureConstraintsBRTryo0$foundation_release(Constraints2.Constraints$default(0, orientation3 == orientation5 ? Constraints.m7975getMaxWidthimpl(jM7991offsetNN6EwU) : iCoerceAtLeast, 0, orientation3 != orientation5 ? Constraints.m7974getMaxHeightimpl(jM7991offsetNN6EwU) : iCoerceAtLeast, 5, null));
                                                PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                                                int i11 = iM7975getMaxWidthimpl + i6 + i10;
                                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                                PagerState pagerState2 = pagerState;
                                                SnapPosition snapPosition4 = snapPosition3;
                                                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                                try {
                                                    int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                                                    int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition4, i11, iCoerceAtLeast, iMo5010roundToPx0680j_45, i6, i10, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                    Unit unit = Unit.INSTANCE;
                                                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                    PagerMeasureResult pagerMeasureResultM5305measurePagerbmk8ZPk = PagerMeasure.m5305measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, iM7975getMaxWidthimpl, i6, i10, iMo5010roundToPx0680j_45, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM7991offsetNN6EwU, orientation3, vertical3, horizontal3, z, j2, iCoerceAtLeast, i5, LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition3, pagerState.m5309getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                        }

                                                        public final MeasureResult invoke(int i12, int i13, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                            return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i12 + i8), Constraints2.m7989constrainHeightK40F9xA(j, i13 + i7), MapsKt.emptyMap(), function1);
                                                        }
                                                    });
                                                    PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM5305measurePagerbmk8ZPk, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                                    return pagerMeasureResultM5305measurePagerbmk8ZPk;
                                                } catch (Throwable th) {
                                                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                    throw th;
                                                }
                                            }
                                        };
                                        composer.updateRememberedValue(function2);
                                        objRememberedValue = function2;
                                    }
                                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) objRememberedValue;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    return function22;
                                }
                                i4 = i;
                                if ((i2 & 196608) != 131072) {
                                    z8 = false;
                                }
                                zChanged = z15 | z8 | composer.changed(coroutineScope);
                                objRememberedValue = composer.rememberedValue();
                                if (!zChanged) {
                                    final int i52 = i4;
                                    final SnapPosition snapPosition32 = snapPosition2;
                                    final Alignment.Horizontal horizontal32 = horizontal2;
                                    final Alignment.Vertical vertical32 = vertical2;
                                    final float f32 = f2;
                                    final PageSize pageSize32 = pageSize2;
                                    final Orientation orientation32 = orientation2;
                                    Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return m5307invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final PagerMeasureResult m5307invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                            int iMo5010roundToPx0680j_4;
                                            int iMo5010roundToPx0680j_42;
                                            int i6;
                                            int iM7975getMaxWidthimpl;
                                            long jM8033constructorimpl;
                                            ObservableScopeInvalidator.m5266attachToScopeimpl(pagerState.m5308getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                            Orientation orientation4 = orientation32;
                                            Orientation orientation5 = Orientation.Vertical;
                                            boolean z16 = orientation4 == orientation5;
                                            CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z16 ? orientation5 : Orientation.Horizontal);
                                            if (z16) {
                                                iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            if (z16) {
                                                iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5119calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getTop());
                                            int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getBottom());
                                            final int i7 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                                            final int i8 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                                            int i9 = z16 ? i7 : i8;
                                            if (z16 && !z) {
                                                i6 = iMo5010roundToPx0680j_43;
                                            } else if (z16 && z) {
                                                i6 = iMo5010roundToPx0680j_44;
                                            } else {
                                                i6 = (z16 || z) ? iMo5010roundToPx0680j_42 : iMo5010roundToPx0680j_4;
                                            }
                                            int i10 = i9 - i6;
                                            long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i8, -i7);
                                            pagerState.setDensity$foundation_release(lazyLayoutMeasureScope);
                                            int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(f32);
                                            if (z16) {
                                                iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i7;
                                            } else {
                                                iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i8;
                                            }
                                            if (!z || iM7975getMaxWidthimpl > 0) {
                                                jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                            } else {
                                                if (!z16) {
                                                    iMo5010roundToPx0680j_4 += iM7975getMaxWidthimpl;
                                                }
                                                if (z16) {
                                                    iMo5010roundToPx0680j_43 += iM7975getMaxWidthimpl;
                                                }
                                                jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_43 & 4294967295L) | (iMo5010roundToPx0680j_4 << 32));
                                            }
                                            long j2 = jM8033constructorimpl;
                                            int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize32.calculateMainAxisPageSize(lazyLayoutMeasureScope, iM7975getMaxWidthimpl, iMo5010roundToPx0680j_45), 0);
                                            pagerState.m5311setPremeasureConstraintsBRTryo0$foundation_release(Constraints2.Constraints$default(0, orientation32 == orientation5 ? Constraints.m7975getMaxWidthimpl(jM7991offsetNN6EwU) : iCoerceAtLeast, 0, orientation32 != orientation5 ? Constraints.m7974getMaxHeightimpl(jM7991offsetNN6EwU) : iCoerceAtLeast, 5, null));
                                            PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                                            int i11 = iM7975getMaxWidthimpl + i6 + i10;
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            PagerState pagerState2 = pagerState;
                                            SnapPosition snapPosition4 = snapPosition32;
                                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                                                int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition4, i11, iCoerceAtLeast, iMo5010roundToPx0680j_45, i6, i10, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                Unit unit = Unit.INSTANCE;
                                                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                PagerMeasureResult pagerMeasureResultM5305measurePagerbmk8ZPk = PagerMeasure.m5305measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, iM7975getMaxWidthimpl, i6, i10, iMo5010roundToPx0680j_45, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM7991offsetNN6EwU, orientation32, vertical32, horizontal32, z, j2, iCoerceAtLeast, i52, LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition32, pagerState.m5309getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                    }

                                                    public final MeasureResult invoke(int i12, int i13, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                        return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i12 + i8), Constraints2.m7989constrainHeightK40F9xA(j, i13 + i7), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM5305measurePagerbmk8ZPk, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                                return pagerMeasureResultM5305measurePagerbmk8ZPk;
                                            } catch (Throwable th) {
                                                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                throw th;
                                            }
                                        }
                                    };
                                    composer.updateRememberedValue(function23);
                                    objRememberedValue = function23;
                                }
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222 = (Function2) objRememberedValue;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                return function222;
                            }
                            snapPosition2 = snapPosition;
                            if ((i3 & 6) == 4) {
                                z7 = false;
                            }
                            boolean z152 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                            if (((458752 & i2) ^ 196608) > 131072) {
                            }
                            if ((i2 & 196608) != 131072) {
                            }
                            zChanged = z152 | z8 | composer.changed(coroutineScope);
                            objRememberedValue = composer.rememberedValue();
                            if (!zChanged) {
                            }
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            return function2222;
                        }
                        pageSize2 = pageSize;
                        if ((12582912 & i2) != 8388608) {
                            z6 = false;
                        }
                        boolean z142 = z13 | z6;
                        if (((i3 & 14) ^ 6) <= 4) {
                        }
                        if ((i3 & 6) == 4) {
                        }
                        boolean z1522 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142 | z7;
                        if (((458752 & i2) ^ 196608) > 131072) {
                        }
                        if ((i2 & 196608) != 131072) {
                        }
                        zChanged = z1522 | z8 | composer.changed(coroutineScope);
                        objRememberedValue = composer.rememberedValue();
                        if (!zChanged) {
                        }
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        return function22222;
                    }
                    f2 = f;
                    if ((1572864 & i2) == 1048576) {
                        z5 = false;
                    }
                    boolean z132 = z12 | z5;
                    if (((29360128 & i2) ^ 12582912) > 8388608) {
                    }
                    if ((12582912 & i2) != 8388608) {
                    }
                    boolean z1422 = z132 | z6;
                    if (((i3 & 14) ^ 6) <= 4) {
                    }
                    if ((i3 & 6) == 4) {
                    }
                    boolean z15222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422 | z7;
                    if (((458752 & i2) ^ 196608) > 131072) {
                    }
                    if ((i2 & 196608) != 131072) {
                    }
                    zChanged = z15222 | z8 | composer.changed(coroutineScope);
                    objRememberedValue = composer.rememberedValue();
                    if (!zChanged) {
                    }
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    return function222222;
                }
                vertical2 = vertical;
                if ((805306368 & i2) != 536870912) {
                    z4 = false;
                }
                boolean z122 = z11 | z4;
                if (((3670016 & i2) ^ 1572864) <= 1048576) {
                }
                if ((1572864 & i2) == 1048576) {
                }
                boolean z1322 = z122 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                }
                if ((12582912 & i2) != 8388608) {
                }
                boolean z14222 = z1322 | z6;
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) == 4) {
                }
                boolean z152222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14222 | z7;
                if (((458752 & i2) ^ 196608) > 131072) {
                }
                if ((i2 & 196608) != 131072) {
                }
                zChanged = z152222 | z8 | composer.changed(coroutineScope);
                objRememberedValue = composer.rememberedValue();
                if (!zChanged) {
                }
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222222 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                }
                return function2222222;
            }
            horizontal2 = horizontal;
            if ((100663296 & i2) == 67108864) {
                z3 = false;
            }
            boolean z112 = z10 | z3;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((805306368 & i2) != 536870912) {
            }
            boolean z1222 = z112 | z4;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i2) == 1048576) {
            }
            boolean z13222 = z1222 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            boolean z142222 = z13222 | z6;
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) == 4) {
            }
            boolean z1522222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142222 | z7;
            if (((458752 & i2) ^ 196608) > 131072) {
            }
            if ((i2 & 196608) != 131072) {
            }
            zChanged = z1522222 | z8 | composer.changed(coroutineScope);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
            }
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222222 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return function22222222;
        }
        orientation2 = orientation;
        if ((i2 & 24576) != 16384) {
            z2 = false;
        }
        boolean z102 = z9 | z2;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) == 67108864) {
        }
        boolean z1122 = z102 | z3;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((805306368 & i2) != 536870912) {
        }
        boolean z12222 = z1122 | z4;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) == 1048576) {
        }
        boolean z132222 = z12222 | z5;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        boolean z1422222 = z132222 | z6;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) == 4) {
        }
        boolean z15222222 = ((((i3 & 896) ^ 384) > 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422222 | z7;
        if (((458752 & i2) ^ 196608) > 131072) {
        }
        if ((i2 & 196608) != 131072) {
        }
        zChanged = z15222222 | z8 | composer.changed(coroutineScope);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222222 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return function222222222;
    }
}
