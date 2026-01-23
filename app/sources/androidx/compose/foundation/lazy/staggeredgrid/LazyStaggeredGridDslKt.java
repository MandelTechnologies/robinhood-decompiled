package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "rows", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/unit/Dp;", "horizontalItemSpacing", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyHorizontalStaggeredGrid-121YqSk", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyHorizontalStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5275LazyHorizontalStaggeredGrid121YqSk(final LazyStaggeredGridCells2 lazyStaggeredGridCells2, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, Overscroll overscroll, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Arrangement.Vertical vertical2;
        final boolean z4;
        final Modifier modifier3;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final PaddingValues paddingValues3;
        final boolean z5;
        final float f2;
        final FlingBehavior flingBehavior2;
        final Overscroll overscroll2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        Arrangement.Vertical verticalM5089spacedBy0680j_4;
        FlingBehavior flingBehavior3;
        Overscroll overscrollRememberOverscrollEffect;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState4;
        float f3;
        FlingBehavior flingBehavior4;
        boolean z6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-670735644);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(lazyStaggeredGridCells2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    int i13 = composerStartRestartGroup.changed(lazyStaggeredGridState2) ? 256 : 128;
                    i4 |= i13;
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i4 |= i13;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(vertical) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(flingBehavior)) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(overscroll)) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 4) != 0) {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridState7.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState2;
                                }
                                paddingValuesM5135PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                verticalM5089spacedBy0680j_4 = i7 != 0 ? Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(0)) : vertical;
                                float fM7995constructorimpl = i8 != 0 ? C2002Dp.m7995constructorimpl(0) : f;
                                if ((i3 & 128) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                boolean z7 = i10 == 0 ? z2 : true;
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollRememberOverscrollEffect = Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, 0);
                                } else {
                                    overscrollRememberOverscrollEffect = overscroll;
                                    modifier4 = modifier5;
                                }
                                lazyStaggeredGridState4 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                                f3 = fM7995constructorimpl;
                                flingBehavior4 = flingBehavior3;
                                z6 = z7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                verticalM5089spacedBy0680j_4 = vertical;
                                f3 = f;
                                flingBehavior4 = flingBehavior;
                                z6 = z2;
                                overscrollRememberOverscrollEffect = overscroll;
                                modifier4 = modifier2;
                                lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                paddingValuesM5135PaddingValues0680j_4 = paddingValues2;
                            }
                            boolean z8 = z3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-670735644, i4, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:206)");
                            }
                            int i14 = i4 >> 3;
                            int i15 = i4 << 3;
                            composer2 = composerStartRestartGroup;
                            PaddingValues paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                            LazyStaggeredGrid.m5279LazyStaggeredGridw41Enmo(lazyStaggeredGridState4, Orientation.Horizontal, rememberRowSlots(lazyStaggeredGridCells2, verticalM5089spacedBy0680j_4, paddingValuesM5135PaddingValues0680j_4, composerStartRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i14 & 896)), modifier4, paddingValues4, z8, flingBehavior4, z6, overscrollRememberOverscrollEffect, f3, verticalM5089spacedBy0680j_4.getSpacing(), function1, composer2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i15) | (i15 & 458752) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i4 << 9) & 1879048192), (i11 << 3) & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical2 = verticalM5089spacedBy0680j_4;
                            lazyStaggeredGridState3 = lazyStaggeredGridState4;
                            modifier3 = modifier4;
                            paddingValues3 = paddingValues4;
                            z5 = z8;
                            flingBehavior2 = flingBehavior4;
                            z4 = z6;
                            overscroll2 = overscrollRememberOverscrollEffect;
                            f2 = f3;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            vertical2 = vertical;
                            z4 = z2;
                            modifier3 = modifier2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            f2 = f;
                            flingBehavior2 = flingBehavior;
                            overscroll2 = overscroll;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                                public final void invoke(Composer composer3, int i16) {
                                    LazyStaggeredGridDslKt.m5275LazyHorizontalStaggeredGrid121YqSk(lazyStaggeredGridCells2, modifier3, lazyStaggeredGridState3, paddingValues3, z5, vertical2, f2, flingBehavior2, z4, overscroll2, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 100663296;
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true, i4 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i & 805306368) == 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true, i4 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i & 805306368) == 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true, i4 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i & 805306368) == 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i11 & 3) == 2) ? false : true, i4 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final LazyStaggeredGridCells2 lazyStaggeredGridCells2, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridCells2)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGrid3>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGrid3 invoke(Density density, Constraints constraints) {
                    return m5276invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGrid3 m5276invoke0kLqBqw(Density density, long j) {
                    if (!(Constraints.m7974getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
                        InlineClassHelper.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j) - density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(paddingValues.getTop() + paddingValues.getBottom()));
                    LazyStaggeredGridCells2 lazyStaggeredGridCells22 = lazyStaggeredGridCells2;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = lazyStaggeredGridCells22.calculateCrossAxisCellSizes(density, iM7974getMaxHeightimpl, density.mo5010roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, iM7974getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGrid3(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }
}
