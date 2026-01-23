package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraints;
import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.ScrollingContainer2;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayout2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics2;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItems2;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyList.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a\u009c\u0001\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 ¢\u0006\u0002\b\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003¢\u0006\u0002\u0010-¨\u0006."}, m3636d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, final Overscroll overscroll, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        PaddingValues paddingValues2;
        int i6;
        final int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifierLazyLayoutBeyondBoundsModifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(924924659);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else {
                if ((i2 & 196608) == 0) {
                    i5 |= composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                if ((i4 & 128) != 0) {
                    i5 |= 12582912;
                } else {
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(overscroll) ? 8388608 : 4194304;
                    }
                    i6 = i4 & 256;
                    if (i6 == 0) {
                        i5 |= 100663296;
                        i7 = i;
                    } else {
                        i7 = i;
                        if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(i7) ? 67108864 : 33554432;
                        }
                    }
                    i8 = i4 & 512;
                    if (i8 != 0) {
                        if ((i2 & 805306368) == 0) {
                            i9 = i8;
                            i5 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
                        }
                        i10 = i4 & 1024;
                        if (i10 != 0) {
                            i12 = i3 | 6;
                            i11 = i10;
                        } else if ((i3 & 6) == 0) {
                            i11 = i10;
                            i12 = i3 | (composerStartRestartGroup.changed(vertical) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i3;
                        }
                        i13 = i4 & 2048;
                        if (i13 != 0) {
                            i12 |= 48;
                            i14 = i13;
                        } else if ((i3 & 48) == 0) {
                            i14 = i13;
                            i12 |= composerStartRestartGroup.changed(vertical2) ? 32 : 16;
                        } else {
                            i14 = i13;
                        }
                        int i17 = i12;
                        i15 = i4 & 4096;
                        if (i15 != 0) {
                            i16 = i17 | 384;
                        } else {
                            int i18 = i17;
                            if ((i3 & 384) == 0) {
                                i18 |= composerStartRestartGroup.changed(horizontal2) ? 256 : 128;
                            }
                            i16 = i18;
                        }
                        if ((i4 & 8192) != 0) {
                            i16 |= 3072;
                        } else if ((i3 & 3072) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                        }
                        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i16 & 1171) == 1170) ? false : true, i5 & 1)) {
                            int i19 = i6 != 0 ? 0 : i7;
                            Alignment.Horizontal horizontal5 = i9 != 0 ? null : horizontal;
                            Arrangement.Vertical vertical5 = i11 != 0 ? null : vertical;
                            Alignment.Vertical vertical6 = i14 != 0 ? null : vertical2;
                            Arrangement.Horizontal horizontal6 = i15 != 0 ? null : horizontal2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(924924659, i5, i16, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:84)");
                            }
                            int i20 = (i5 >> 3) & 14;
                            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProvider3.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i20 | ((i16 >> 6) & 112));
                            int i21 = i5 >> 9;
                            int i22 = i16;
                            LazyLayoutSemantics lazyLayoutSemanticsRememberLazyListSemanticState = LazyListSemantics.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i20 | (i21 & 112));
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                            GraphicsContext graphicsContext = (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext());
                            int i23 = i22 << 18;
                            int i24 = (i5 & 65520) | (i21 & 458752) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i22 << 27) & 1879048192);
                            int i25 = i5;
                            Arrangement.Horizontal horizontal7 = horizontal6;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, lazyListState, paddingValues2, z, z2, i19, horizontal5, vertical6, horizontal7, vertical5, coroutineScope, graphicsContext, !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? LazyLayoutStickyItems2.INSTANCE.getStickToTopPlacement() : null, composerStartRestartGroup, i24, 0);
                            Alignment.Horizontal horizontal8 = horizontal5;
                            Alignment.Vertical vertical7 = vertical6;
                            Arrangement.Vertical vertical8 = vertical5;
                            int i26 = i19;
                            Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                            if (z3) {
                                composerStartRestartGroup.startReplaceGroup(-1513147781);
                                modifierLazyLayoutBeyondBoundsModifier = LazyLayoutBeyondBoundsModifierLocal2.lazyLayoutBeyondBoundsModifier(Modifier.INSTANCE, LazyListBeyondBoundsModifier.rememberLazyListBeyondBoundsState(lazyListState, i26, composerStartRestartGroup, i20 | ((i25 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z, orientation);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-1512720880);
                                composerStartRestartGroup.endReplaceGroup();
                                modifierLazyLayoutBeyondBoundsModifier = Modifier.INSTANCE;
                            }
                            LazyLayout2.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollingContainer2.scrollingContainer(LazyLayoutSemantics2.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticsRememberLazyListSemanticState, orientation, z3, z, composerStartRestartGroup, ((i25 >> 6) & 57344) | ((i25 << 6) & 458752)).then(modifierLazyLayoutBeyondBoundsModifier).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), false, overscroll, (256 & 256) != 0 ? null : null), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy, composerStartRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i7 = i26;
                            horizontal3 = horizontal8;
                            vertical3 = vertical8;
                            vertical4 = vertical7;
                            horizontal4 = horizontal7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            horizontal3 = horizontal;
                            vertical3 = vertical;
                            vertical4 = vertical2;
                            horizontal4 = horizontal2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                                public final void invoke(Composer composer2, int i27) {
                                    LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, overscroll, i7, horizontal3, vertical3, vertical4, horizontal4, function1, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 805306368;
                    i9 = i8;
                    i10 = i4 & 1024;
                    if (i10 != 0) {
                    }
                    i13 = i4 & 2048;
                    if (i13 != 0) {
                    }
                    int i172 = i12;
                    i15 = i4 & 4096;
                    if (i15 != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i16 & 1171) == 1170) ? false : true, i5 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i6 = i4 & 256;
                if (i6 == 0) {
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i4 & 1024;
                if (i10 != 0) {
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                }
                int i1722 = i12;
                i15 = i4 & 4096;
                if (i15 != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i16 & 1171) == 1170) ? false : true, i5 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i4 & 64) != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            i6 = i4 & 256;
            if (i6 == 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i17222 = i12;
            i15 = i4 & 4096;
            if (i15 != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i16 & 1171) == 1170) ? false : true, i5 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        i6 = i4 & 256;
        if (i6 == 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i172222 = i12;
        i15 = i4 & 4096;
        if (i15 != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i16 & 1171) == 1170) ? false : true, i5 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[PHI: r4
      0x0075: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0073, B:32:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[PHI: r9
      0x0091: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x008f, B:42:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[PHI: r12
      0x00ad: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00ab, B:52:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9 A[PHI: r13
      0x00c9: PHI (r13v12 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
      (r13v9 androidx.compose.foundation.layout.Arrangement$Horizontal)
      (r13v13 androidx.compose.foundation.layout.Arrangement$Horizontal)
     binds: [B:66:0x00c7, B:62:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5 A[PHI: r14
      0x00e5: PHI (r14v12 androidx.compose.foundation.layout.Arrangement$Vertical) = 
      (r14v9 androidx.compose.foundation.layout.Arrangement$Vertical)
      (r14v13 androidx.compose.foundation.layout.Arrangement$Vertical)
     binds: [B:76:0x00e3, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[PHI: r5
      0x0105: PHI (r5v7 androidx.compose.foundation.lazy.layout.StickyItemsPlacement) = 
      (r5v5 androidx.compose.foundation.lazy.layout.StickyItemsPlacement)
      (r5v8 androidx.compose.foundation.lazy.layout.StickyItemsPlacement)
     binds: [B:86:0x0103, B:82:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, LazyLayoutStickyItems2 lazyLayoutStickyItems2, Composer composer, int i2, int i3) {
        boolean z3;
        boolean z4;
        Alignment.Horizontal horizontal3;
        boolean z5;
        Alignment.Vertical vertical3;
        boolean z6;
        Arrangement.Horizontal horizontal4;
        boolean z7;
        Arrangement.Vertical vertical4;
        boolean z8;
        LazyLayoutStickyItems2 lazyLayoutStickyItems22;
        boolean z9;
        boolean z10;
        Object objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-739270660, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        boolean z11 = ((((i2 & 112) ^ 48) > 32 && composer.changed(lazyListState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            z3 = z2;
            if (composer.changed(z3)) {
                z4 = true;
            }
            boolean z12 = z11 | z4;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
                horizontal3 = horizontal;
                if (composer.changed(horizontal3)) {
                    z5 = true;
                }
                boolean z13 = z12 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    vertical3 = vertical;
                    if (composer.changed(vertical3)) {
                        z6 = true;
                    }
                    boolean z14 = z13 | z6;
                    if (((234881024 & i2) ^ 100663296) <= 67108864) {
                        horizontal4 = horizontal2;
                        if (composer.changed(horizontal4)) {
                            z7 = true;
                        }
                        boolean z15 = z14 | z7;
                        if (((1879048192 & i2) ^ 805306368) > 536870912) {
                            vertical4 = vertical2;
                            if (composer.changed(vertical4)) {
                                z8 = true;
                            }
                            boolean zChanged = z8 | z15 | composer.changed(graphicsContext);
                            if (((i3 & 896) ^ 384) <= 256) {
                                lazyLayoutStickyItems22 = lazyLayoutStickyItems2;
                                if (composer.changed(lazyLayoutStickyItems22)) {
                                    z9 = true;
                                }
                                z10 = zChanged | z9;
                                objRememberedValue = composer.rememberedValue();
                                if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final Arrangement.Vertical vertical5 = vertical4;
                                    final Arrangement.Horizontal horizontal5 = horizontal4;
                                    final LazyLayoutStickyItems2 lazyLayoutStickyItems23 = lazyLayoutStickyItems22;
                                    final Alignment.Horizontal horizontal6 = horizontal3;
                                    final Alignment.Vertical vertical6 = vertical3;
                                    final boolean z16 = z3;
                                    Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return m5204invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final LazyListMeasureResult m5204invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                            int iMo5010roundToPx0680j_4;
                                            int iMo5010roundToPx0680j_42;
                                            final int i4;
                                            float spacing;
                                            int iM7975getMaxWidthimpl;
                                            LazyListItemProvider lazyListItemProvider;
                                            long jM8033constructorimpl;
                                            float scrollToBeConsumed;
                                            ObservableScopeInvalidator.m5266attachToScopeimpl(lazyListState.m5216getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                            boolean z17 = lazyListState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                            CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
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
                                            final int i5 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                                            final int i6 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                                            boolean z18 = z16;
                                            int i7 = z18 ? i5 : i6;
                                            if (z18 && !z) {
                                                i4 = iMo5010roundToPx0680j_43;
                                            } else if (z18 && z) {
                                                i4 = iMo5010roundToPx0680j_44;
                                            } else {
                                                i4 = (z18 || z) ? iMo5010roundToPx0680j_42 : iMo5010roundToPx0680j_4;
                                            }
                                            final int i8 = i7 - i4;
                                            final long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i6, -i5);
                                            LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                                            lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m7975getMaxWidthimpl(jM7991offsetNN6EwU), Constraints.m7974getMaxHeightimpl(jM7991offsetNN6EwU));
                                            if (z16) {
                                                Arrangement.Vertical vertical7 = vertical5;
                                                if (vertical7 == null) {
                                                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                                                    throw new ExceptionsH();
                                                }
                                                spacing = vertical7.getSpacing();
                                            } else {
                                                Arrangement.Horizontal horizontal7 = horizontal5;
                                                if (horizontal7 == null) {
                                                    InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == false");
                                                    throw new ExceptionsH();
                                                }
                                                spacing = horizontal7.getSpacing();
                                            }
                                            final int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(spacing);
                                            final int itemCount = lazyListItemProviderInvoke.getItemCount();
                                            if (z16) {
                                                iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i5;
                                            } else {
                                                iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i6;
                                            }
                                            int i9 = iM7975getMaxWidthimpl;
                                            if (!z || i9 > 0) {
                                                lazyListItemProvider = lazyListItemProviderInvoke;
                                                jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                            } else {
                                                boolean z19 = z16;
                                                if (!z19) {
                                                    iMo5010roundToPx0680j_4 += i9;
                                                }
                                                if (z19) {
                                                    iMo5010roundToPx0680j_43 += i9;
                                                }
                                                lazyListItemProvider = lazyListItemProviderInvoke;
                                                jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                            }
                                            final boolean z20 = z16;
                                            final Alignment.Horizontal horizontal8 = horizontal6;
                                            final long j2 = jM8033constructorimpl;
                                            final LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                                            final Alignment.Vertical vertical8 = vertical6;
                                            final boolean z21 = z;
                                            final LazyListState lazyListState2 = lazyListState;
                                            LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM7991offsetNN6EwU, z20, lazyListItemProvider2, lazyLayoutMeasureScope, itemCount, iMo5010roundToPx0680j_45, horizontal8, vertical8, z21, i4, i8, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                                final /* synthetic */ int $afterContentPadding;
                                                final /* synthetic */ int $beforeContentPadding;
                                                final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                                final /* synthetic */ boolean $isVertical;
                                                final /* synthetic */ int $itemsCount;
                                                final /* synthetic */ boolean $reverseLayout;
                                                final /* synthetic */ int $spaceBetweenItems;
                                                final /* synthetic */ LazyListState $state;
                                                final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                                final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                                final /* synthetic */ long $visualItemOffset;

                                                {
                                                    this.$isVertical = z20;
                                                    this.$this_null = lazyLayoutMeasureScope;
                                                    this.$itemsCount = itemCount;
                                                    this.$spaceBetweenItems = iMo5010roundToPx0680j_45;
                                                    this.$horizontalAlignment = horizontal8;
                                                    this.$verticalAlignment = vertical8;
                                                    this.$reverseLayout = z21;
                                                    this.$beforeContentPadding = i4;
                                                    this.$afterContentPadding = i8;
                                                    this.$visualItemOffset = j2;
                                                    this.$state = lazyListState2;
                                                }

                                                @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                                /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                                public LazyListMeasuredItem mo5205createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                                    return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                                }
                                            };
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            LazyListState lazyListState3 = lazyListState;
                                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider2, lazyListState3.getFirstVisibleItemIndex());
                                                int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                                Unit unit = Unit.INSTANCE;
                                                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyListItemProvider2, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                                                if (lazyLayoutMeasureScope.isLookingAhead() || !z17) {
                                                    scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                                                } else {
                                                    scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                                                }
                                                LazyListMeasureResult lazyListMeasureResultM5207measureLazyListLCrQqZ4 = LazyListMeasure.m5207measureLazyListLCrQqZ4(itemCount, lazyListMeasuredItemProvider, i9, i4, i8, iMo5010roundToPx0680j_45, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, scrollToBeConsumed, jM7991offsetNN6EwU, z16, vertical5, horizontal5, z, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i, listCalculateLazyLayoutPinnedIndices, z17, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getApproachLayoutInfo(), coroutineScope, lazyListState.m5217getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, lazyLayoutStickyItems23, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                    }

                                                    public final MeasureResult invoke(int i10, int i11, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                        return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i10 + i6), Constraints2.m7989constrainHeightK40F9xA(j, i11 + i5), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM5207measureLazyListLCrQqZ4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                                return lazyListMeasureResultM5207measureLazyListLCrQqZ4;
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
                            lazyLayoutStickyItems22 = lazyLayoutStickyItems2;
                            if ((i3 & 384) == 256) {
                                z9 = false;
                            }
                            z10 = zChanged | z9;
                            objRememberedValue = composer.rememberedValue();
                            if (z10) {
                                final Arrangement.Vertical vertical52 = vertical4;
                                final Arrangement.Horizontal horizontal52 = horizontal4;
                                final LazyLayoutStickyItems2 lazyLayoutStickyItems232 = lazyLayoutStickyItems22;
                                final Alignment.Horizontal horizontal62 = horizontal3;
                                final Alignment.Vertical vertical62 = vertical3;
                                final boolean z162 = z3;
                                Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                        return m5204invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final LazyListMeasureResult m5204invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                        int iMo5010roundToPx0680j_4;
                                        int iMo5010roundToPx0680j_42;
                                        final int i4;
                                        float spacing;
                                        int iM7975getMaxWidthimpl;
                                        LazyListItemProvider lazyListItemProvider;
                                        long jM8033constructorimpl;
                                        float scrollToBeConsumed;
                                        ObservableScopeInvalidator.m5266attachToScopeimpl(lazyListState.m5216getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                        boolean z17 = lazyListState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                        CheckScrollableContainerConstraints.m4887checkScrollableContainerConstraintsK40F9xA(j, z162 ? Orientation.Vertical : Orientation.Horizontal);
                                        if (z162) {
                                            iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            iMo5010roundToPx0680j_4 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        if (z162) {
                                            iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.mo5119calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            iMo5010roundToPx0680j_42 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        int iMo5010roundToPx0680j_43 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getTop());
                                        int iMo5010roundToPx0680j_44 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(paddingValues.getBottom());
                                        final int i5 = iMo5010roundToPx0680j_43 + iMo5010roundToPx0680j_44;
                                        final int i6 = iMo5010roundToPx0680j_4 + iMo5010roundToPx0680j_42;
                                        boolean z18 = z162;
                                        int i7 = z18 ? i5 : i6;
                                        if (z18 && !z) {
                                            i4 = iMo5010roundToPx0680j_43;
                                        } else if (z18 && z) {
                                            i4 = iMo5010roundToPx0680j_44;
                                        } else {
                                            i4 = (z18 || z) ? iMo5010roundToPx0680j_42 : iMo5010roundToPx0680j_4;
                                        }
                                        final int i8 = i7 - i4;
                                        final long jM7991offsetNN6EwU = Constraints2.m7991offsetNN6EwU(j, -i6, -i5);
                                        LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                                        lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m7975getMaxWidthimpl(jM7991offsetNN6EwU), Constraints.m7974getMaxHeightimpl(jM7991offsetNN6EwU));
                                        if (z162) {
                                            Arrangement.Vertical vertical7 = vertical52;
                                            if (vertical7 == null) {
                                                InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                                                throw new ExceptionsH();
                                            }
                                            spacing = vertical7.getSpacing();
                                        } else {
                                            Arrangement.Horizontal horizontal7 = horizontal52;
                                            if (horizontal7 == null) {
                                                InlineClassHelper.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == false");
                                                throw new ExceptionsH();
                                            }
                                            spacing = horizontal7.getSpacing();
                                        }
                                        final int iMo5010roundToPx0680j_45 = lazyLayoutMeasureScope.mo5010roundToPx0680j_4(spacing);
                                        final int itemCount = lazyListItemProviderInvoke.getItemCount();
                                        if (z162) {
                                            iM7975getMaxWidthimpl = Constraints.m7974getMaxHeightimpl(j) - i5;
                                        } else {
                                            iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j) - i6;
                                        }
                                        int i9 = iM7975getMaxWidthimpl;
                                        if (!z || i9 > 0) {
                                            lazyListItemProvider = lazyListItemProviderInvoke;
                                            jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                        } else {
                                            boolean z19 = z162;
                                            if (!z19) {
                                                iMo5010roundToPx0680j_4 += i9;
                                            }
                                            if (z19) {
                                                iMo5010roundToPx0680j_43 += i9;
                                            }
                                            lazyListItemProvider = lazyListItemProviderInvoke;
                                            jM8033constructorimpl = IntOffset.m8033constructorimpl((iMo5010roundToPx0680j_4 << 32) | (iMo5010roundToPx0680j_43 & 4294967295L));
                                        }
                                        final boolean z20 = z162;
                                        final Alignment.Horizontal horizontal8 = horizontal62;
                                        final long j2 = jM8033constructorimpl;
                                        final LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                                        final Alignment.Vertical vertical8 = vertical62;
                                        final boolean z21 = z;
                                        final LazyListState lazyListState2 = lazyListState;
                                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM7991offsetNN6EwU, z20, lazyListItemProvider2, lazyLayoutMeasureScope, itemCount, iMo5010roundToPx0680j_45, horizontal8, vertical8, z21, i4, i8, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                            final /* synthetic */ int $afterContentPadding;
                                            final /* synthetic */ int $beforeContentPadding;
                                            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                            final /* synthetic */ boolean $isVertical;
                                            final /* synthetic */ int $itemsCount;
                                            final /* synthetic */ boolean $reverseLayout;
                                            final /* synthetic */ int $spaceBetweenItems;
                                            final /* synthetic */ LazyListState $state;
                                            final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                            final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                            final /* synthetic */ long $visualItemOffset;

                                            {
                                                this.$isVertical = z20;
                                                this.$this_null = lazyLayoutMeasureScope;
                                                this.$itemsCount = itemCount;
                                                this.$spaceBetweenItems = iMo5010roundToPx0680j_45;
                                                this.$horizontalAlignment = horizontal8;
                                                this.$verticalAlignment = vertical8;
                                                this.$reverseLayout = z21;
                                                this.$beforeContentPadding = i4;
                                                this.$afterContentPadding = i8;
                                                this.$visualItemOffset = j2;
                                                this.$state = lazyListState2;
                                            }

                                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                            public LazyListMeasuredItem mo5205createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                                return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                            }
                                        };
                                        Snapshot.Companion companion = Snapshot.INSTANCE;
                                        LazyListState lazyListState3 = lazyListState;
                                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                        try {
                                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider2, lazyListState3.getFirstVisibleItemIndex());
                                            int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                            Unit unit = Unit.INSTANCE;
                                            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                            List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsState2.calculateLazyLayoutPinnedIndices(lazyListItemProvider2, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                                            if (lazyLayoutMeasureScope.isLookingAhead() || !z17) {
                                                scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                                            } else {
                                                scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                                            }
                                            LazyListMeasureResult lazyListMeasureResultM5207measureLazyListLCrQqZ4 = LazyListMeasure.m5207measureLazyListLCrQqZ4(itemCount, lazyListMeasuredItemProvider, i9, i4, i8, iMo5010roundToPx0680j_45, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, scrollToBeConsumed, jM7991offsetNN6EwU, z162, vertical52, horizontal52, z, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i, listCalculateLazyLayoutPinnedIndices, z17, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getApproachLayoutInfo(), coroutineScope, lazyListState.m5217getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, lazyLayoutStickyItems232, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                }

                                                public final MeasureResult invoke(int i10, int i11, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                    return lazyLayoutMeasureScope.layout(Constraints2.m7990constrainWidthK40F9xA(j, i10 + i6), Constraints2.m7989constrainHeightK40F9xA(j, i11 + i5), MapsKt.emptyMap(), function1);
                                                }
                                            });
                                            LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM5207measureLazyListLCrQqZ4, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                            return lazyListMeasureResultM5207measureLazyListLCrQqZ4;
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
                        vertical4 = vertical2;
                        if ((i2 & 805306368) != 536870912) {
                            z8 = false;
                        }
                        boolean zChanged2 = z8 | z15 | composer.changed(graphicsContext);
                        if (((i3 & 896) ^ 384) <= 256) {
                        }
                        if ((i3 & 384) == 256) {
                        }
                        z10 = zChanged2 | z9;
                        objRememberedValue = composer.rememberedValue();
                        if (z10) {
                        }
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        return function2222;
                    }
                    horizontal4 = horizontal2;
                    if ((100663296 & i2) == 67108864) {
                        z7 = false;
                    }
                    boolean z152 = z14 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    }
                    if ((i2 & 805306368) != 536870912) {
                    }
                    boolean zChanged22 = z8 | z152 | composer.changed(graphicsContext);
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                    if ((i3 & 384) == 256) {
                    }
                    z10 = zChanged22 | z9;
                    objRememberedValue = composer.rememberedValue();
                    if (z10) {
                    }
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    return function22222;
                }
                vertical3 = vertical;
                if ((12582912 & i2) != 8388608) {
                    z6 = false;
                }
                boolean z142 = z13 | z6;
                if (((234881024 & i2) ^ 100663296) <= 67108864) {
                }
                if ((100663296 & i2) == 67108864) {
                }
                boolean z1522 = z142 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                }
                boolean zChanged222 = z8 | z1522 | composer.changed(graphicsContext);
                if (((i3 & 896) ^ 384) <= 256) {
                }
                if ((i3 & 384) == 256) {
                }
                z10 = zChanged222 | z9;
                objRememberedValue = composer.rememberedValue();
                if (z10) {
                }
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                }
                return function222222;
            }
            horizontal3 = horizontal;
            if ((1572864 & i2) == 1048576) {
                z5 = false;
            }
            boolean z132 = z12 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            boolean z1422 = z132 | z6;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) == 67108864) {
            }
            boolean z15222 = z1422 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            boolean zChanged2222 = z8 | z15222 | composer.changed(graphicsContext);
            if (((i3 & 896) ^ 384) <= 256) {
            }
            if ((i3 & 384) == 256) {
            }
            z10 = zChanged2222 | z9;
            objRememberedValue = composer.rememberedValue();
            if (z10) {
            }
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222222 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return function2222222;
        }
        z3 = z2;
        if ((i2 & 24576) != 16384) {
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
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) == 67108864) {
        }
        boolean z152222 = z14222 | z7;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        boolean zChanged22222 = z8 | z152222 | composer.changed(graphicsContext);
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if ((i3 & 384) == 256) {
        }
        z10 = zChanged22222 | z9;
        objRememberedValue = composer.rememberedValue();
        if (z10) {
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222222 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return function22222222;
    }
}
