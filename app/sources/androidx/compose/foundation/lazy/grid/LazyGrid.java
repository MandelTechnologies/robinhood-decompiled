package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraints;
import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.ScrollingContainer2;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayout2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics2;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems2;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGrid.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c¢\u0006\u0002\b\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0003¢\u0006\u0002\u0010)¨\u0006*"}, m3636d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsScrollBehavior", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyGrid {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Overscroll overscroll, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z4;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Modifier modifier3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        boolean z6;
        FlingBehavior flingBehavior4;
        int i8;
        Object objRememberedValue;
        Modifier modifierLazyLayoutBeyondBoundsModifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(708740370);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(lazyGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z;
                    i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(overscroll) ? 67108864 : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changed(vertical) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i6 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i6 = i2 | (composerStartRestartGroup.changed(horizontal) ? 4 : 2);
                        } else {
                            i6 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i6 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                        }
                        i7 = i6;
                        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                paddingValuesM5135PaddingValues0680j_4 = i10 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                z6 = i5 == 0 ? z4 : false;
                                if ((i3 & 64) != 0) {
                                    flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i8 = i4 & (-3670017);
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(708740370, i8, i7, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)");
                                }
                                int i11 = (i8 >> 3) & 14;
                                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda = LazyGridItemProvider3.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, (i7 & 112) | i11);
                                int i12 = i8 >> 9;
                                LazyLayoutSemantics lazyLayoutSemanticsRememberLazyGridSemanticState = LazySemantics.rememberLazyGridSemanticState(lazyGridState, z6, composerStartRestartGroup, (i12 & 112) | i11);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                Modifier modifier5 = modifier4;
                                int i13 = i8;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValuesM5135PaddingValues0680j_4, z6, z2, horizontal, vertical, (CoroutineScope) objRememberedValue, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), ((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? LazyLayoutStickyItems2.INSTANCE.getStickToTopPlacement() : null, composerStartRestartGroup, ((i7 << 18) & 3670016) | (524272 & i8) | ((i8 >> 6) & 29360128), 0);
                                PaddingValues paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                if (!z3) {
                                    composerStartRestartGroup.startReplaceGroup(-1614890700);
                                    modifierLazyLayoutBeyondBoundsModifier = LazyLayoutBeyondBoundsModifierLocal2.lazyLayoutBeyondBoundsModifier(Modifier.INSTANCE, LazyGridBeyondBoundsModifier.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11), lazyGridState.getBeyondBoundsInfo(), z6, orientation);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-1614595456);
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifierLazyLayoutBeyondBoundsModifier = Modifier.INSTANCE;
                                }
                                boolean z7 = z6;
                                FlingBehavior flingBehavior5 = flingBehavior4;
                                LazyLayout2.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollingContainer2.scrollingContainer(LazyLayoutSemantics2.lazyLayoutSemantics(modifier5.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticsRememberLazyGridSemanticState, orientation, z3, z7, composerStartRestartGroup, (i12 & 57344) | ((i13 << 3) & 458752)).then(modifierLazyLayoutBeyondBoundsModifier).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation, z3, z7, flingBehavior5, lazyGridState.getInternalInteractionSource(), false, overscroll, (256 & 256) != 0 ? null : null), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                flingBehavior3 = flingBehavior5;
                                z5 = z7;
                                paddingValues3 = paddingValues4;
                                modifier3 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                paddingValuesM5135PaddingValues0680j_4 = paddingValues2;
                                z6 = z4;
                                modifier4 = modifier2;
                            }
                            i8 = i4;
                            flingBehavior4 = flingBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i8 >> 3) & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda2 = LazyGridItemProvider3.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, (i7 & 112) | i112);
                            int i122 = i8 >> 9;
                            LazyLayoutSemantics lazyLayoutSemanticsRememberLazyGridSemanticState2 = LazySemantics.rememberLazyGridSemanticState(lazyGridState, z6, composerStartRestartGroup, (i122 & 112) | i112);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            Modifier modifier52 = modifier4;
                            int i132 = i8;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda2, lazyGridState, lazyGridSlotsProvider, paddingValuesM5135PaddingValues0680j_4, z6, z2, horizontal, vertical, (CoroutineScope) objRememberedValue, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), ((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? LazyLayoutStickyItems2.INSTANCE.getStickToTopPlacement() : null, composerStartRestartGroup, ((i7 << 18) & 3670016) | (524272 & i8) | ((i8 >> 6) & 29360128), 0);
                            PaddingValues paddingValues42 = paddingValuesM5135PaddingValues0680j_4;
                            Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                            if (!z3) {
                            }
                            boolean z72 = z6;
                            FlingBehavior flingBehavior52 = flingBehavior4;
                            LazyLayout2.LazyLayout(function0RememberLazyGridItemProviderLambda2, ScrollingContainer2.scrollingContainer(LazyLayoutSemantics2.lazyLayoutSemantics(modifier52.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda2, lazyLayoutSemanticsRememberLazyGridSemanticState2, orientation2, z3, z72, composerStartRestartGroup, (i122 & 57344) | ((i132 << 3) & 458752)).then(modifierLazyLayoutBeyondBoundsModifier).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2, z3, z72, flingBehavior52, lazyGridState.getInternalInteractionSource(), false, overscroll, (256 & 256) != 0 ? null : null), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            flingBehavior3 = flingBehavior52;
                            z5 = z72;
                            paddingValues3 = paddingValues42;
                            modifier3 = modifier52;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            paddingValues3 = paddingValues2;
                            z5 = z4;
                            modifier3 = modifier2;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i14) {
                                    LazyGrid.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, overscroll, vertical, horizontal, function1, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    i7 = i6;
                    if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                i7 = i6;
                if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            if ((i3 & 32) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i7 = i6;
            if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        if ((i3 & 32) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i7 = i6;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[PHI: r3
      0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final LazyLayoutStickyItems2 lazyLayoutStickyItems2, Composer composer, int i, int i2) {
        boolean z3;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2025385037, i, i2, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
        }
        boolean z5 = ((((i & 112) ^ 48) > 32 && composer.changed(lazyGridState)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(z)) || (i & 24576) == 16384);
        if (((458752 & i) ^ 196608) > 131072) {
            z3 = z2;
            if (composer.changed(z3)) {
                z4 = true;
            }
            zChanged = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final boolean z6 = z3;
                Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m5231invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final LazyGridMeasureResult m5231invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int iMo5010roundToPx0680j_4;
                        int iMo5010roundToPx0680j_42;
                        float spacing;
                        int iM7975getMaxWidthimpl;
                        long jM8033constructorimpl;
                        int lineIndexOfItem;
                        int i3;
                        int firstVisibleItemScrollOffset;
                        float scrollToBeConsumed;
                        ObservableScopeInvalidator.m5266attachToScopeimpl(lazyGridState.m5238getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z7 = lazyGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                        CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z6 ? Orientation.Vertical : Orientation.Horizontal);
                        if (z6) {
                            iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        if (z6) {
                            iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5119calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getTop());
                        int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getBottom());
                        final int i4 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                        final int i5 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                        boolean z8 = z6;
                        int i6 = z8 ? i4 : i5;
                        if (z8 && !z) {
                            iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_43;
                        } else if (z8 && z) {
                            iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_44;
                        } else if (!z8 && !z) {
                            iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_4;
                        }
                        final int i7 = i6 - iMo5010roundToPx0680j_42;
                        long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i5, -i4);
                        final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                        final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                        final LazyGrid7 lazyGrid7Mo5225invoke0kLqBqw = lazyGridSlotsProvider.mo5225invoke0kLqBqw(lazyLayoutMeasureScope, jM7991offsetNN6EwU);
                        int length = lazyGrid7Mo5225invoke0kLqBqw.getSizes().length;
                        spanLayoutProvider.setSlotsPerLine(length);
                        if (z6) {
                            Arrangement.Vertical vertical2 = vertical;
                            if (vertical2 == null) {
                                InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                                throw new ExceptionsH();
                            }
                            spacing = vertical2.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal2 = horizontal;
                            if (horizontal2 == null) {
                                InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                                throw new ExceptionsH();
                            }
                            spacing = horizontal2.getSpacing();
                        }
                        final int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(spacing);
                        final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                        if (z6) {
                            iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i4;
                        } else {
                            iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i5;
                        }
                        final int i8 = iMo5010roundToPx0680j_42;
                        if (!z || iM7975getMaxWidthimpl > 0) {
                            jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                        } else {
                            boolean z9 = z6;
                            if (!z9) {
                                iMo5010roundToPx0680j_4 += iM7975getMaxWidthimpl;
                            }
                            if (z9) {
                                iMo5010roundToPx0680j_43 += iM7975getMaxWidthimpl;
                            }
                            jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                        }
                        final LazyGridState lazyGridState2 = lazyGridState;
                        final boolean z10 = z6;
                        final boolean z11 = z;
                        final long j2 = jM8033constructorimpl;
                        final ?? r28 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, iMo5010roundToPx0680j_45, lazyGridState2, z10, z11, i8, i7, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                            final /* synthetic */ int $afterContentPadding;
                            final /* synthetic */ int $beforeContentPadding;
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ boolean $reverseLayout;
                            final /* synthetic */ LazyGridState $state;
                            final /* synthetic */ LazyLayoutMeasureScope $this_null;
                            final /* synthetic */ long $visualItemOffset;

                            {
                                this.$this_null = lazyLayoutMeasureScope;
                                this.$state = lazyGridState2;
                                this.$isVertical = z10;
                                this.$reverseLayout = z11;
                                this.$beforeContentPadding = i8;
                                this.$afterContentPadding = i7;
                                this.$visualItemOffset = j2;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                            public LazyGridMeasuredItem mo5232createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                                return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                            }
                        };
                        final boolean z12 = z6;
                        final ?? r23 = new LazyGridMeasuredLineProvider(z12, lazyGrid7Mo5225invoke0kLqBqw, itemCount, iMo5010roundToPx0680j_45, r28, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                            final /* synthetic */ boolean $isVertical;
                            final /* synthetic */ LazyGrid7 $resolvedSlots;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(z12, lazyGrid7Mo5225invoke0kLqBqw, itemCount, iMo5010roundToPx0680j_45, r28, spanLayoutProvider);
                                this.$isVertical = z12;
                                this.$resolvedSlots = lazyGrid7Mo5225invoke0kLqBqw;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                            public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<LazyGridSpan> spans, int mainAxisSpacing) {
                                return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                            }
                        };
                        Function1<Integer, ArrayList<Tuples2<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Tuples2<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ ArrayList<Tuples2<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final ArrayList<Tuples2<Integer, Constraints>> invoke(int i9) {
                                LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i9);
                                int firstItemIndex = lineConfiguration.getFirstItemIndex();
                                ArrayList<Tuples2<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                                List<LazyGridSpan> spans = lineConfiguration.getSpans();
                                LazyGrid5 lazyGrid5 = r23;
                                int size = spans.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size; i11++) {
                                    int iM5221getCurrentLineSpanimpl = LazyGridSpan.m5221getCurrentLineSpanimpl(spans.get(i11).getPackedValue());
                                    arrayList.add(Tuples4.m3642to(Integer.valueOf(firstItemIndex), Constraints.m7964boximpl(lazyGrid5.m5237childConstraintsJhjzzOo$foundation_release(i10, iM5221getCurrentLineSpanimpl))));
                                    firstItemIndex++;
                                    i10 += iM5221getCurrentLineSpanimpl;
                                }
                                return arrayList;
                            }
                        };
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        LazyGridState lazyGridState3 = lazyGridState;
                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState3.getFirstVisibleItemIndex());
                            if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                                i3 = i7;
                                firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                            } else {
                                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                                i3 = i7;
                                firstVisibleItemScrollOffset = 0;
                            }
                            Unit unit = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                            List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo());
                            if (lazyLayoutMeasureScope.isLookingAhead() || !z7) {
                                scrollToBeConsumed = lazyGridState.getScrollToBeConsumed();
                            } else {
                                scrollToBeConsumed = lazyGridState.getScrollDeltaBetweenPasses$foundation_release();
                            }
                            LazyGridMeasureResult lazyGridMeasureResultM5234measureLazyGridGyuLg2I = LazyGridMeasure.m5234measureLazyGridGyuLg2I(itemCount, r23, r28, iM7975getMaxWidthimpl, i8, i3, iMo5010roundToPx0680j_45, lineIndexOfItem, firstVisibleItemScrollOffset, scrollToBeConsumed, jM7991offsetNN6EwU, z6, vertical, horizontal, z, lazyLayoutMeasureScope, lazyGridState.getItemAnimator$foundation_release(), length, listCalculateLazyLayoutPinnedIndices, z7, lazyLayoutMeasureScope.isLookingAhead(), lazyGridState.getApproachLayoutInfo(), coroutineScope, lazyGridState.m5239getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, lazyLayoutStickyItems2, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                                }

                                public final MeasureResult invoke(int i9, int i10, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                    return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i9 + i5), Constraints2.m7989constrainHeightK40F9xA(j, i10 + i4), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, lazyGridMeasureResultM5234measureLazyGridGyuLg2I, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                            return lazyGridMeasureResultM5234measureLazyGridGyuLg2I;
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
        z3 = z2;
        if ((196608 & i) != 131072) {
            z4 = false;
        }
        zChanged = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
            final boolean z62 = z3;
            Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m5231invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m5231invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int iMo5010roundToPx0680j_4;
                    int iMo5010roundToPx0680j_42;
                    float spacing;
                    int iM7975getMaxWidthimpl;
                    long jM8033constructorimpl;
                    int lineIndexOfItem;
                    int i3;
                    int firstVisibleItemScrollOffset;
                    float scrollToBeConsumed;
                    ObservableScopeInvalidator.m5266attachToScopeimpl(lazyGridState.m5238getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z7 = lazyGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z62 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z62) {
                        iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z62) {
                        iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5119calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getTop());
                    int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getBottom());
                    final int i4 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                    final int i5 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                    boolean z8 = z62;
                    int i6 = z8 ? i4 : i5;
                    if (z8 && !z) {
                        iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_43;
                    } else if (z8 && z) {
                        iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_44;
                    } else if (!z8 && !z) {
                        iMo5010roundToPx0680j_42 = iMo5010roundToPx0680j_4;
                    }
                    final int i7 = i6 - iMo5010roundToPx0680j_42;
                    long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i5, -i4);
                    final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                    final LazyGrid7 lazyGrid7Mo5225invoke0kLqBqw = lazyGridSlotsProvider.mo5225invoke0kLqBqw(lazyLayoutMeasureScope, jM7991offsetNN6EwU);
                    int length = lazyGrid7Mo5225invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    if (z62) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                            throw new ExceptionsH();
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                            throw new ExceptionsH();
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(spacing);
                    final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                    if (z62) {
                        iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i4;
                    } else {
                        iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i5;
                    }
                    final int i8 = iMo5010roundToPx0680j_42;
                    if (!z || iM7975getMaxWidthimpl > 0) {
                        jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                    } else {
                        boolean z9 = z62;
                        if (!z9) {
                            iMo5010roundToPx0680j_4 += iM7975getMaxWidthimpl;
                        }
                        if (z9) {
                            iMo5010roundToPx0680j_43 += iM7975getMaxWidthimpl;
                        }
                        jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                    }
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z10 = z62;
                    final boolean z11 = z;
                    final long j2 = jM8033constructorimpl;
                    final LazyGrid4 r28 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, iMo5010roundToPx0680j_45, lazyGridState2, z10, z11, i8, i7, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z10;
                            this.$reverseLayout = z11;
                            this.$beforeContentPadding = i8;
                            this.$afterContentPadding = i7;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        /* renamed from: createItem-O3s9Psw, reason: not valid java name */
                        public LazyGridMeasuredItem mo5232createItemO3s9Psw(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Placeable> placeables, long constraints, int lane, int span) {
                            return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getItemAnimator$foundation_release(), constraints, lane, span, null);
                        }
                    };
                    final boolean z12 = z62;
                    final LazyGrid5 r23 = new LazyGridMeasuredLineProvider(z12, lazyGrid7Mo5225invoke0kLqBqw, itemCount, iMo5010roundToPx0680j_45, r28, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGrid7 $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z12, lazyGrid7Mo5225invoke0kLqBqw, itemCount, iMo5010roundToPx0680j_45, r28, spanLayoutProvider);
                            this.$isVertical = z12;
                            this.$resolvedSlots = lazyGrid7Mo5225invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public LazyGridMeasuredLine createLine(int index, LazyGridMeasuredItem[] items, List<LazyGridSpan> spans, int mainAxisSpacing) {
                            return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                        }
                    };
                    Function1<Integer, ArrayList<Tuples2<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Tuples2<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Tuples2<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final ArrayList<Tuples2<Integer, Constraints>> invoke(int i9) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i9);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Tuples2<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<LazyGridSpan> spans = lineConfiguration.getSpans();
                            LazyGrid5 lazyGrid5 = r23;
                            int size = spans.size();
                            int i10 = 0;
                            for (int i11 = 0; i11 < size; i11++) {
                                int iM5221getCurrentLineSpanimpl = LazyGridSpan.m5221getCurrentLineSpanimpl(spans.get(i11).getPackedValue());
                                arrayList.add(Tuples4.m3642to(Integer.valueOf(firstItemIndex), Constraints.m7964boximpl(lazyGrid5.m5237childConstraintsJhjzzOo$foundation_release(i10, iM5221getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i10 += iM5221getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState3.getFirstVisibleItemIndex());
                        if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            i3 = i7;
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        } else {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                            i3 = i7;
                            firstVisibleItemScrollOffset = 0;
                        }
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo());
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z7) {
                            scrollToBeConsumed = lazyGridState.getScrollToBeConsumed();
                        } else {
                            scrollToBeConsumed = lazyGridState.getScrollDeltaBetweenPasses$foundation_release();
                        }
                        LazyGridMeasureResult lazyGridMeasureResultM5234measureLazyGridGyuLg2I = LazyGridMeasure.m5234measureLazyGridGyuLg2I(itemCount, r23, r28, iM7975getMaxWidthimpl, i8, i3, iMo5010roundToPx0680j_45, lineIndexOfItem, firstVisibleItemScrollOffset, scrollToBeConsumed, jM7991offsetNN6EwU, z62, vertical, horizontal, z, lazyLayoutMeasureScope, lazyGridState.getItemAnimator$foundation_release(), length, listCalculateLazyLayoutPinnedIndices, z7, lazyLayoutMeasureScope.isLookingAhead(), lazyGridState.getApproachLayoutInfo(), coroutineScope, lazyGridState.m5239getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, lazyLayoutStickyItems2, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i9, int i10, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i9 + i5), Constraints2.m7989constrainHeightK40F9xA(j, i10 + i4), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, lazyGridMeasureResultM5234measureLazyGridGyuLg2I, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return lazyGridMeasureResultM5234measureLazyGridGyuLg2I;
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
}
