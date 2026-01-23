package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraints;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a!\u0010!\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m3636d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyStaggeredGridMeasurePolicy {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[PHI: r3
      0x00d9: PHI (r3v40 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) = 
      (r3v38 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
      (r3v41 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
     binds: [B:68:0x00d7, B:64:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m5287rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final Function0<? extends LazyStaggeredGridItemProvider> function0, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final float f, float f2, final CoroutineScope coroutineScope, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i) {
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider2;
        boolean zChanged;
        Object objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:51)");
        }
        boolean z2 = false;
        boolean z3 = ((((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(orientation)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && composer.changed(f)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) > 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
        if (((234881024 & i) ^ 100663296) > 67108864) {
            lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
            if (composer.changed(lazyGridStaggeredGridSlotsProvider2)) {
                z2 = true;
            }
            zChanged = z3 | z2 | composer.changed(graphicsContext);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider3 = lazyGridStaggeredGridSlotsProvider2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m5288invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyStaggeredGridMeasureResult m5288invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                        ObservableScopeInvalidator.m5266attachToScopeimpl(lazyStaggeredGridState.m5292getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z4 = lazyStaggeredGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                        CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, orientation);
                        LazyStaggeredGrid3 lazyStaggeredGrid3Mo5274invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider3.mo5274invoke0kLqBqw(lazyLayoutMeasureScope, j);
                        boolean z5 = orientation == Orientation.Vertical;
                        LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                        int iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iM7974getMaxHeightimpl = ((z5 ? Constraints.m7974getMaxHeightimpl(j) : Constraints.m7975getMaxWidthimpl(j)) - iMo5010roundToPx0680j_4) - iMo5010roundToPx0680j_42;
                        long jM8033constructorimpl = z5 ? IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 & 4294967295L) | (iMo5010roundToPx0680j_43 << 32)) : IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                        PaddingValues paddingValues2 = paddingValues;
                        int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                        PaddingValues paddingValues3 = paddingValues;
                        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4 = LazyStaggeredGridMeasure3.m5286measureStaggeredGridC6celF4(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGrid3Mo5274invoke0kLqBqw, Constraints.m7967copyZbe2FdA$default(j, Constraints2.m7990constrainWidthK40F9xA(j, iMo5010roundToPx0680j_44), 0, Constraints2.m7989constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z5, z, jM8033constructorimpl, iM7974getMaxHeightimpl, lazyLayoutMeasureScope.mo5010roundToPx0680j_4(f), iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_42, coroutineScope, z4, lazyLayoutMeasureScope.isLookingAhead(), lazyStaggeredGridState.getApproachLayoutInfo(), graphicsContext);
                        LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4;
                    }
                };
                composer.updateRememberedValue(function2);
                objRememberedValue = function2;
            }
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function22 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return function22;
        }
        lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
        if ((i & 100663296) == 67108864) {
        }
        zChanged = z3 | z2 | composer.changed(graphicsContext);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
            final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider32 = lazyGridStaggeredGridSlotsProvider2;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m5288invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridMeasureResult m5288invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    ObservableScopeInvalidator.m5266attachToScopeimpl(lazyStaggeredGridState.m5292getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z4 = lazyStaggeredGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, orientation);
                    LazyStaggeredGrid3 lazyStaggeredGrid3Mo5274invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider32.mo5274invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z5 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                    int iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(LazyStaggeredGridMeasurePolicy.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM7974getMaxHeightimpl = ((z5 ? Constraints.m7974getMaxHeightimpl(j) : Constraints.m7975getMaxWidthimpl(j)) - iMo5010roundToPx0680j_4) - iMo5010roundToPx0680j_42;
                    long jM8033constructorimpl = z5 ? IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 & 4294967295L) | (iMo5010roundToPx0680j_43 << 32)) : IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                    PaddingValues paddingValues2 = paddingValues;
                    int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4 = LazyStaggeredGridMeasure3.m5286measureStaggeredGridC6celF4(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGrid3Mo5274invoke0kLqBqw, Constraints.m7967copyZbe2FdA$default(j, Constraints2.m7990constrainWidthK40F9xA(j, iMo5010roundToPx0680j_44), 0, Constraints2.m7989constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z5, z, jM8033constructorimpl, iM7974getMaxHeightimpl, lazyLayoutMeasureScope.mo5010roundToPx0680j_4(f), iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_42, coroutineScope, z4, lazyLayoutMeasureScope.isLookingAhead(), lazyStaggeredGridState.getApproachLayoutInfo(), graphicsContext);
                    LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return lazyStaggeredGridMeasureResultM5286measureStaggeredGridC6celF4;
                }
            };
            composer.updateRememberedValue(function23);
            objRememberedValue = function23;
        }
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function222 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return function222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
