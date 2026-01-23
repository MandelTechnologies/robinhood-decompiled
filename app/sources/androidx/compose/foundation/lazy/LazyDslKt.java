package androidx.compose.foundation.lazy;

import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyDsl.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0084\u0001\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0084\u0001\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ax\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001e\u001ax\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u001f¨\u0006 "}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, Overscroll overscroll, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final boolean z4;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior3;
        final Overscroll overscroll2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Arrangement.Horizontal start;
        FlingBehavior flingBehavior4;
        Overscroll overscrollRememberOverscrollEffect;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical4;
        boolean z6;
        boolean z7;
        int i8;
        FlingBehavior flingBehavior5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884325601);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i12 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i12;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i13 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i13;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(overscroll)) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            }
                            if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 2) != 0) {
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        i3 &= -113;
                                    }
                                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        start = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                        i3 &= -57345;
                                    } else {
                                        start = horizontal2;
                                    }
                                    Alignment.Vertical top = i5 != 0 ? Alignment.INSTANCE.getTop() : vertical2;
                                    if ((i2 & 64) != 0) {
                                        flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        flingBehavior4 = flingBehavior2;
                                    }
                                    boolean z8 = i7 == 0 ? z2 : true;
                                    if ((i2 & 256) != 0) {
                                        i3 &= -234881025;
                                        modifier3 = modifier4;
                                        overscrollRememberOverscrollEffect = Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, 0);
                                    } else {
                                        overscrollRememberOverscrollEffect = overscroll;
                                        modifier3 = modifier4;
                                    }
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                    horizontal4 = start;
                                    vertical4 = top;
                                    z6 = z3;
                                    z7 = z8;
                                    i8 = -1884325601;
                                    flingBehavior5 = flingBehavior4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 256) != 0) {
                                        i3 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    z7 = z2;
                                    overscrollRememberOverscrollEffect = overscroll;
                                    z6 = z3;
                                    horizontal4 = horizontal2;
                                    vertical4 = vertical2;
                                    flingBehavior5 = flingBehavior2;
                                    i8 = -1884325601;
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    paddingValues4 = paddingValues2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                                }
                                int i14 = i3 >> 3;
                                composer2 = composerStartRestartGroup;
                                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4, z6, false, flingBehavior5, z7, overscrollRememberOverscrollEffect, 0, null, null, vertical4, horizontal4, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z6;
                                flingBehavior3 = flingBehavior5;
                                z4 = z7;
                                overscroll2 = overscrollRememberOverscrollEffect;
                                vertical3 = vertical4;
                                horizontal3 = horizontal4;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                z4 = z2;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                                flingBehavior3 = flingBehavior2;
                                overscroll2 = overscroll;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
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

                                    public final void invoke(Composer composer3, int i15) {
                                        LazyDslKt.LazyRow(modifier2, lazyListState2, paddingValues3, z5, horizontal3, vertical3, flingBehavior3, z4, overscroll2, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Overscroll overscroll, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final boolean z4;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior3;
        final Overscroll overscroll2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Arrangement.Vertical top;
        FlingBehavior flingBehavior4;
        Overscroll overscrollRememberOverscrollEffect;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal4;
        boolean z6;
        boolean z7;
        int i8;
        FlingBehavior flingBehavior5;
        Composer composerStartRestartGroup = composer.startRestartGroup(53695811);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i12 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i12;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        horizontal2 = horizontal;
                        i3 |= composerStartRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i13 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i13;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(overscroll)) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            }
                            if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 2) != 0) {
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        i3 &= -113;
                                    }
                                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        top = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                        i3 &= -57345;
                                    } else {
                                        top = vertical2;
                                    }
                                    Alignment.Horizontal start = i5 != 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                    if ((i2 & 64) != 0) {
                                        flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        flingBehavior4 = flingBehavior2;
                                    }
                                    boolean z8 = i7 == 0 ? z2 : true;
                                    if ((i2 & 256) != 0) {
                                        i3 &= -234881025;
                                        modifier3 = modifier4;
                                        overscrollRememberOverscrollEffect = Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, 0);
                                    } else {
                                        overscrollRememberOverscrollEffect = overscroll;
                                        modifier3 = modifier4;
                                    }
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                    vertical4 = top;
                                    horizontal4 = start;
                                    z6 = z3;
                                    z7 = z8;
                                    i8 = 53695811;
                                    flingBehavior5 = flingBehavior4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 256) != 0) {
                                        i3 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    z7 = z2;
                                    overscrollRememberOverscrollEffect = overscroll;
                                    z6 = z3;
                                    vertical4 = vertical2;
                                    horizontal4 = horizontal2;
                                    flingBehavior5 = flingBehavior2;
                                    i8 = 53695811;
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    paddingValues4 = paddingValues2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                                }
                                int i14 = i3 >> 3;
                                composer2 = composerStartRestartGroup;
                                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4, z6, true, flingBehavior5, z7, overscrollRememberOverscrollEffect, 0, horizontal4, vertical4, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z6;
                                flingBehavior3 = flingBehavior5;
                                z4 = z7;
                                overscroll2 = overscrollRememberOverscrollEffect;
                                horizontal3 = horizontal4;
                                vertical3 = vertical4;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                z4 = z2;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                                flingBehavior3 = flingBehavior2;
                                overscroll2 = overscroll;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
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

                                    public final void invoke(Composer composer3, int i15) {
                                        LazyDslKt.LazyColumn(modifier2, lazyListState2, paddingValues3, z5, vertical3, horizontal3, flingBehavior3, z4, overscroll2, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final boolean z4;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Arrangement.Vertical top;
        FlingBehavior flingBehavior4;
        boolean z6;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal4;
        boolean z7;
        FlingBehavior flingBehavior5;
        Modifier modifier3;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i12 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i12;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        horizontal2 = horizontal;
                        i3 |= composerStartRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i13 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i13;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                            }
                            if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 2) != 0) {
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        i3 &= -113;
                                    }
                                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        top = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                        i3 &= -57345;
                                    } else {
                                        top = vertical2;
                                    }
                                    Alignment.Horizontal start = i5 != 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                    if ((i2 & 64) != 0) {
                                        flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        flingBehavior4 = flingBehavior2;
                                    }
                                    if (i7 != 0) {
                                        lazyListState3 = lazyListStateRememberLazyListState;
                                        paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                        vertical4 = top;
                                        horizontal4 = start;
                                        z7 = z3;
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                        lazyListState3 = lazyListStateRememberLazyListState;
                                        paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                        vertical4 = top;
                                        horizontal4 = start;
                                        z7 = z3;
                                    }
                                    flingBehavior5 = flingBehavior4;
                                    modifier3 = modifier4;
                                    i8 = -740714857;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    z6 = z2;
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    vertical4 = vertical2;
                                    horizontal4 = horizontal2;
                                    flingBehavior5 = flingBehavior2;
                                    i8 = -740714857;
                                    modifier3 = modifier;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)");
                                }
                                composer2 = composerStartRestartGroup;
                                LazyColumn(modifier3, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior5, z6, Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, 0), function1, composer2, (33554430 & i3) | ((i3 << 3) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z7;
                                vertical3 = vertical4;
                                horizontal3 = horizontal4;
                                flingBehavior3 = flingBehavior5;
                                z4 = z6;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                z4 = z2;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                                flingBehavior3 = flingBehavior2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
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

                                    public final void invoke(Composer composer3, int i14) {
                                        LazyDslKt.LazyColumn(modifier2, lazyListState2, paddingValues3, z5, vertical3, horizontal3, flingBehavior3, z4, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i2 & 256) == 0) {
                    }
                    if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i2 & 256) == 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i2 & 256) == 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 256) == 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final boolean z4;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Arrangement.Horizontal start;
        FlingBehavior flingBehavior4;
        boolean z6;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical4;
        boolean z7;
        FlingBehavior flingBehavior5;
        Modifier modifier3;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i12 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i12;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i13 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i13;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i7 = i6;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                            }
                            if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 2) != 0) {
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        i3 &= -113;
                                    }
                                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        start = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                        i3 &= -57345;
                                    } else {
                                        start = horizontal2;
                                    }
                                    Alignment.Vertical top = i5 != 0 ? Alignment.INSTANCE.getTop() : vertical2;
                                    if ((i2 & 64) != 0) {
                                        flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        flingBehavior4 = flingBehavior2;
                                    }
                                    if (i7 != 0) {
                                        lazyListState3 = lazyListStateRememberLazyListState;
                                        paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                        horizontal4 = start;
                                        vertical4 = top;
                                        z7 = z3;
                                        z6 = true;
                                    } else {
                                        z6 = z2;
                                        lazyListState3 = lazyListStateRememberLazyListState;
                                        paddingValues4 = paddingValuesM5135PaddingValues0680j_4;
                                        horizontal4 = start;
                                        vertical4 = top;
                                        z7 = z3;
                                    }
                                    flingBehavior5 = flingBehavior4;
                                    modifier3 = modifier4;
                                    i8 = -1724297413;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    z6 = z2;
                                    lazyListState3 = lazyListStateRememberLazyListState;
                                    horizontal4 = horizontal2;
                                    vertical4 = vertical2;
                                    flingBehavior5 = flingBehavior2;
                                    i8 = -1724297413;
                                    modifier3 = modifier;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)");
                                }
                                composer2 = composerStartRestartGroup;
                                LazyRow(modifier3, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior5, z6, Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, 0), function1, composer2, (33554430 & i3) | ((i3 << 3) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z7;
                                horizontal3 = horizontal4;
                                vertical3 = vertical4;
                                flingBehavior3 = flingBehavior5;
                                z4 = z6;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                z4 = z2;
                                lazyListState2 = lazyListStateRememberLazyListState;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                                flingBehavior3 = flingBehavior2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
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

                                    public final void invoke(Composer composer3, int i14) {
                                        LazyDslKt.LazyRow(modifier2, lazyListState2, paddingValues3, z5, horizontal3, vertical3, flingBehavior3, z4, function1, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i2 & 256) == 0) {
                    }
                    if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i2 & 256) == 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i2 & 256) == 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 256) == 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
