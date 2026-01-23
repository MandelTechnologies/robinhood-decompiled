package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.ScrollingContainer2;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayout2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGrid.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m3636d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-w41Enmo", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyStaggeredGrid {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* renamed from: LazyStaggeredGrid-w41Enmo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5279LazyStaggeredGridw41Enmo(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, final Overscroll overscroll, float f, float f2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        FlingBehavior flingBehavior2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final boolean z4;
        final float f3;
        Composer composer2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Modifier modifier3;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        FlingBehavior flingBehavior3;
        boolean z6;
        float fM7995constructorimpl;
        Modifier modifier4;
        PaddingValues paddingValues4;
        FlingBehavior flingBehavior4;
        boolean z7;
        float fM7995constructorimpl2;
        Object objRememberedValue;
        Modifier modifierLazyLayoutBeyondBoundsModifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1904835166);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(orientation) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    i4 |= composerStartRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(overscroll) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i12 = i2 | 6;
                            i11 = i10;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i12 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                        }
                        i13 = i12;
                        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                PaddingValues paddingValuesM5135PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i4 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                z6 = i7 == 0 ? z2 : true;
                                fM7995constructorimpl = i9 != 0 ? C2002Dp.m7995constructorimpl(0) : f;
                                if (i11 != 0) {
                                    modifier4 = modifier5;
                                    paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                    flingBehavior4 = flingBehavior3;
                                    z7 = z3;
                                    fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1904835166, i4, i13, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                                    }
                                    int i15 = i4 & 14;
                                    Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProvider3.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, (i13 & 112) | i15);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    int i16 = i4 >> 6;
                                    int i17 = i4 >> 12;
                                    int i18 = i4;
                                    float f5 = fM7995constructorimpl;
                                    Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M5287rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicy.m5287rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda, paddingValues4, z7, orientation, f5, fM7995constructorimpl2, (CoroutineScope) objRememberedValue, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i16 & 7168) | (i16 & 896) | i15 | ((i4 << 9) & 57344) | (i17 & 458752) | ((i13 << 18) & 3670016) | ((i4 << 18) & 234881024));
                                    PaddingValues paddingValues5 = paddingValues4;
                                    float f6 = fM7995constructorimpl2;
                                    LazyLayoutSemantics lazyLayoutSemanticsRememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemantics.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z7, composerStartRestartGroup, (i17 & 112) | i15);
                                    if (z6) {
                                        composerStartRestartGroup.startReplaceGroup(1913691040);
                                        composerStartRestartGroup.endReplaceGroup();
                                        modifierLazyLayoutBeyondBoundsModifier = Modifier.INSTANCE;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1913386186);
                                        modifierLazyLayoutBeyondBoundsModifier = LazyLayoutBeyondBoundsModifierLocal2.lazyLayoutBeyondBoundsModifier(Modifier.INSTANCE, LazyStaggeredGridBeyondBoundsModifier.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i15), lazyStaggeredGridState.getBeyondBoundsInfo(), z7, orientation);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    Modifier modifier6 = modifierLazyLayoutBeyondBoundsModifier;
                                    boolean z8 = z7;
                                    boolean z9 = z6;
                                    FlingBehavior flingBehavior5 = flingBehavior4;
                                    Modifier modifierScrollingContainer = ScrollingContainer2.scrollingContainer(LazyLayoutSemantics2.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda, lazyLayoutSemanticsRememberLazyStaggeredGridSemanticState, orientation, z9, z8, composerStartRestartGroup, (i18 & 458752) | ((i18 << 6) & 7168) | ((i18 >> 9) & 57344)).then(modifier6).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z9, z8, flingBehavior5, lazyStaggeredGridState.getMutableInteractionSource(), false, overscroll, (256 & 256) != 0 ? null : null);
                                    flingBehavior2 = flingBehavior5;
                                    LazyLayout2.LazyLayout(function0RememberStaggeredGridItemProviderLambda, modifierScrollingContainer, lazyStaggeredGridState.getPrefetchState(), function2M5287rememberStaggeredGridMeasurePolicyqKj4JfE, composerStartRestartGroup, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = composerStartRestartGroup;
                                    z5 = z8;
                                    modifier3 = modifier4;
                                    z4 = z9;
                                    paddingValues3 = paddingValues5;
                                    f3 = f5;
                                    f4 = f6;
                                } else {
                                    modifier4 = modifier5;
                                    paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                    flingBehavior4 = flingBehavior3;
                                    z7 = z3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                z6 = z2;
                                paddingValues4 = paddingValues2;
                                z7 = z3;
                                flingBehavior4 = flingBehavior2;
                                modifier4 = modifier2;
                                fM7995constructorimpl = f;
                            }
                            fM7995constructorimpl2 = f2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i152 = i4 & 14;
                            Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda2 = LazyStaggeredGridItemProvider3.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, (i13 & 112) | i152);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            int i162 = i4 >> 6;
                            int i172 = i4 >> 12;
                            int i182 = i4;
                            float f52 = fM7995constructorimpl;
                            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M5287rememberStaggeredGridMeasurePolicyqKj4JfE2 = LazyStaggeredGridMeasurePolicy.m5287rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda2, paddingValues4, z7, orientation, f52, fM7995constructorimpl2, (CoroutineScope) objRememberedValue, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i162 & 7168) | (i162 & 896) | i152 | ((i4 << 9) & 57344) | (i172 & 458752) | ((i13 << 18) & 3670016) | ((i4 << 18) & 234881024));
                            PaddingValues paddingValues52 = paddingValues4;
                            float f62 = fM7995constructorimpl2;
                            LazyLayoutSemantics lazyLayoutSemanticsRememberLazyStaggeredGridSemanticState2 = LazyStaggeredGridSemantics.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z7, composerStartRestartGroup, (i172 & 112) | i152);
                            if (z6) {
                            }
                            Modifier modifier62 = modifierLazyLayoutBeyondBoundsModifier;
                            boolean z82 = z7;
                            boolean z92 = z6;
                            FlingBehavior flingBehavior52 = flingBehavior4;
                            Modifier modifierScrollingContainer2 = ScrollingContainer2.scrollingContainer(LazyLayoutSemantics2.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda2, lazyLayoutSemanticsRememberLazyStaggeredGridSemanticState2, orientation, z92, z82, composerStartRestartGroup, (i182 & 458752) | ((i182 << 6) & 7168) | ((i182 >> 9) & 57344)).then(modifier62).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z92, z82, flingBehavior52, lazyStaggeredGridState.getMutableInteractionSource(), false, overscroll, (256 & 256) != 0 ? null : null);
                            flingBehavior2 = flingBehavior52;
                            LazyLayout2.LazyLayout(function0RememberStaggeredGridItemProviderLambda2, modifierScrollingContainer2, lazyStaggeredGridState.getPrefetchState(), function2M5287rememberStaggeredGridMeasurePolicyqKj4JfE2, composerStartRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            z5 = z82;
                            modifier3 = modifier4;
                            z4 = z92;
                            paddingValues3 = paddingValues52;
                            f3 = f52;
                            f4 = f62;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z2;
                            f3 = f;
                            composer2 = composerStartRestartGroup;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            modifier3 = modifier2;
                            f4 = f2;
                        }
                        final FlingBehavior flingBehavior6 = flingBehavior2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i19) {
                                    LazyStaggeredGrid.m5279LazyStaggeredGridw41Enmo(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z5, flingBehavior6, z4, overscroll, f3, f4, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    i13 = i12;
                    if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
                    }
                    final FlingBehavior flingBehavior62 = flingBehavior2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                i13 = i12;
                if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
                }
                final FlingBehavior flingBehavior622 = flingBehavior2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i13 = i12;
            if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
            }
            final FlingBehavior flingBehavior6222 = flingBehavior2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i13 = i12;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true, i4 & 1)) {
        }
        final FlingBehavior flingBehavior62222 = flingBehavior2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
