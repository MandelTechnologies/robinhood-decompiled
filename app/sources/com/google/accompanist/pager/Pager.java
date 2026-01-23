package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.Velocity2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Pager.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00062,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aÁ\u0001\u0010$\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020 2,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a&\u0010*\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a&\u0010*\u001a\u00020+*\u00020+2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m3636d2 = {"", "count", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/accompanist/pager/PagerState;", "state", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "itemSpacing", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "page", "", "key", "userScrollEnabled", "Lkotlin/Function2;", "Lcom/google/accompanist/pager/PagerScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "HorizontalPager-7SJ-wSw", "(ILandroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Pager-upBTbn8", "(ILandroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;ZFZLandroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Pager", "Landroidx/compose/ui/geometry/Offset;", "consumeHorizontal", "consumeVertical", "consume-9KIMszo", "(JZZ)J", "consume", "Landroidx/compose/ui/unit/Velocity;", "consume-BMRW4eQ", "pager_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class Pager {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    @Deprecated
    /* renamed from: HorizontalPager-7SJ-wSw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9191HorizontalPager7SJwSw(final int i, Modifier modifier, PagerState pagerState, boolean z, float f, PaddingValues paddingValues, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1<? super Integer, ? extends Object> function1, boolean z2, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        PagerState pagerState2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        int i16;
        Modifier modifier3;
        PagerState pagerStateRememberPagerState;
        float fM7995constructorimpl;
        boolean z5;
        FlingBehavior flingBehaviorM9197flingBehaviorjt2gSs;
        int i17;
        boolean z6;
        Function1<? super Integer, ? extends Object> function12;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        final Function1<? super Integer, ? extends Object> function13;
        final Alignment.Vertical vertical3;
        final boolean z7;
        final float f2;
        Composer composer2;
        final boolean z8;
        final FlingBehavior flingBehavior3;
        final PagerState pagerState3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-131850087);
        if ((i4 & 1) != 0) {
            i6 = i2 | 6;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 14) == 0) {
                i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i2;
            } else {
                i6 = i2;
            }
        }
        int i18 = i4 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i4 & 4) == 0) {
                    pagerState2 = pagerState;
                    int i19 = composerStartRestartGroup.changed(pagerState2) ? 256 : 128;
                    i6 |= i19;
                } else {
                    pagerState2 = pagerState;
                }
                i6 |= i19;
            } else {
                pagerState2 = pagerState;
            }
            i7 = i4 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z3 = z;
                    i6 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else {
                    if ((i2 & 458752) == 0) {
                        i10 = 57344;
                        paddingValuesM5135PaddingValues0680j_4 = paddingValues;
                        i6 |= composerStartRestartGroup.changed(paddingValuesM5135PaddingValues0680j_4) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i6 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i6 |= composerStartRestartGroup.changed(vertical) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        i6 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(flingBehavior)) ? 8388608 : 4194304;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else {
                        if ((i2 & 234881024) == 0) {
                            i13 = i12;
                            i6 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        i14 = i4 & 512;
                        if (i14 == 0) {
                            if ((i2 & 1879048192) == 0) {
                                i15 = i14;
                                z4 = z2;
                                i6 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
                            }
                            if ((i4 & 1024) == 0) {
                                i16 = i3 | 6;
                            } else if ((i3 & 14) == 0) {
                                i16 = i3 | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
                            } else {
                                i16 = i3;
                            }
                            if ((i6 & 1533916891) == 306783378 || (i16 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i4 & 4) == 0) {
                                        pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, composerStartRestartGroup, 0, 1);
                                        i6 &= -897;
                                    } else {
                                        pagerStateRememberPagerState = pagerState2;
                                    }
                                    int i20 = i6;
                                    if (i7 != 0) {
                                        z3 = false;
                                    }
                                    fM7995constructorimpl = i8 == 0 ? C2002Dp.m7995constructorimpl(0) : f;
                                    if (i9 != 0) {
                                        paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                                    }
                                    Alignment.Vertical centerVertically = i11 == 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                    if ((i4 & 128) == 0) {
                                        z5 = true;
                                        flingBehaviorM9197flingBehaviorjt2gSs = PagerDefaults.INSTANCE.m9197flingBehaviorjt2gSs(pagerStateRememberPagerState, null, null, PaddingKt.calculateEndPadding(paddingValuesM5135PaddingValues0680j_4, LayoutDirection.Ltr), composerStartRestartGroup, ((i20 >> 6) & 14) | 24576, 6);
                                        i17 = i20 & (-29360129);
                                    } else {
                                        z5 = true;
                                        flingBehaviorM9197flingBehaviorjt2gSs = flingBehavior;
                                        i17 = i20;
                                    }
                                    Function1<? super Integer, ? extends Object> function14 = i13 == 0 ? null : function1;
                                    if (i15 == 0) {
                                        function12 = function14;
                                        vertical2 = centerVertically;
                                        z6 = z5;
                                    } else {
                                        z6 = z2;
                                        function12 = function14;
                                        vertical2 = centerVertically;
                                    }
                                    flingBehavior2 = flingBehaviorM9197flingBehaviorjt2gSs;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 4) != 0) {
                                        i6 &= -897;
                                    }
                                    if ((i4 & 128) != 0) {
                                        i6 &= -29360129;
                                    }
                                    fM7995constructorimpl = f;
                                    vertical2 = vertical;
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    pagerStateRememberPagerState = pagerState2;
                                    function12 = function1;
                                    z6 = z4;
                                    i17 = i6;
                                }
                                boolean z9 = z3;
                                PaddingValues paddingValues2 = paddingValuesM5135PaddingValues0680j_4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-131850087, i17, i16, "com.google.accompanist.pager.HorizontalPager (Pager.kt:284)");
                                }
                                int i21 = i17 >> 3;
                                int i22 = (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & i10) | (i21 & 3670016) | (i21 & 29360128) | ((i17 << 9) & 234881024) | (i17 & 1879048192);
                                int i23 = ((i17 >> 18) & 14) | ((i16 << 6) & 896);
                                float f3 = fM7995constructorimpl;
                                Modifier modifier5 = modifier3;
                                PagerState pagerState4 = pagerStateRememberPagerState;
                                m9192PagerupBTbn8(i5, modifier5, pagerState4, z9, f3, false, flingBehavior2, function12, paddingValues2, z6, vertical2, null, content, composerStartRestartGroup, i22, i23, 2048);
                                paddingValuesM5135PaddingValues0680j_4 = paddingValues2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                boolean z10 = z6;
                                function13 = function12;
                                vertical3 = vertical2;
                                z7 = z10;
                                f2 = f3;
                                composer2 = composerStartRestartGroup;
                                z8 = z9;
                                flingBehavior3 = flingBehavior2;
                                pagerState3 = pagerState4;
                                modifier4 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z7 = z4;
                                modifier4 = modifier2;
                                pagerState3 = pagerState2;
                                z8 = z3;
                                f2 = f;
                                vertical3 = vertical;
                                function13 = function1;
                                composer2 = composerStartRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            final PaddingValues paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.Pager$HorizontalPager$1
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

                                    public final void invoke(Composer composer3, int i24) {
                                        Pager.m9191HorizontalPager7SJwSw(i, modifier4, pagerState3, z8, f2, paddingValues3, vertical3, flingBehavior3, function13, z7, content, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i6 |= 805306368;
                        i15 = i14;
                        z4 = z2;
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i18 == 0) {
                                }
                                if ((i4 & 4) == 0) {
                                }
                                int i202 = i6;
                                if (i7 != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if ((i4 & 128) == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                flingBehavior2 = flingBehaviorM9197flingBehaviorjt2gSs;
                                boolean z92 = z3;
                                PaddingValues paddingValues22 = paddingValuesM5135PaddingValues0680j_4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i212 = i17 >> 3;
                                int i222 = (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & i10) | (i212 & 3670016) | (i212 & 29360128) | ((i17 << 9) & 234881024) | (i17 & 1879048192);
                                int i232 = ((i17 >> 18) & 14) | ((i16 << 6) & 896);
                                float f32 = fM7995constructorimpl;
                                Modifier modifier52 = modifier3;
                                PagerState pagerState42 = pagerStateRememberPagerState;
                                m9192PagerupBTbn8(i5, modifier52, pagerState42, z92, f32, false, flingBehavior2, function12, paddingValues22, z6, vertical2, null, content, composerStartRestartGroup, i222, i232, 2048);
                                paddingValuesM5135PaddingValues0680j_4 = paddingValues22;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z102 = z6;
                                function13 = function12;
                                vertical3 = vertical2;
                                z7 = z102;
                                f2 = f32;
                                composer2 = composerStartRestartGroup;
                                z8 = z92;
                                flingBehavior3 = flingBehavior2;
                                pagerState3 = pagerState42;
                                modifier4 = modifier52;
                            }
                        }
                        final PaddingValues paddingValues32 = paddingValuesM5135PaddingValues0680j_4;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    z4 = z2;
                    if ((i4 & 1024) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    final PaddingValues paddingValues322 = paddingValuesM5135PaddingValues0680j_4;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = 57344;
                paddingValuesM5135PaddingValues0680j_4 = paddingValues;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                z4 = z2;
                if ((i4 & 1024) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                final PaddingValues paddingValues3222 = paddingValuesM5135PaddingValues0680j_4;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = 57344;
            paddingValuesM5135PaddingValues0680j_4 = paddingValues;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            z4 = z2;
            if ((i4 & 1024) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            final PaddingValues paddingValues32222 = paddingValuesM5135PaddingValues0680j_4;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        z3 = z;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = 57344;
        paddingValuesM5135PaddingValues0680j_4 = paddingValues;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        z4 = z2;
        if ((i4 & 1024) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        final PaddingValues paddingValues322222 = paddingValuesM5135PaddingValues0680j_4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /* renamed from: Pager-upBTbn8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9192PagerupBTbn8(final int i, final Modifier modifier, final PagerState state, final boolean z, final float f, final boolean z2, final FlingBehavior flingBehavior, final Function1<? super Integer, ? extends Object> function1, final PaddingValues contentPadding, final boolean z3, Alignment.Vertical vertical, Alignment.Horizontal horizontal, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Alignment.Vertical vertical2;
        Alignment.Horizontal horizontal2;
        final Alignment.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        int i11;
        int i12;
        int i13;
        int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1072219707);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 7168) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i5 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
            }
            if ((i4 & 32) != 0) {
                i17 = (i2 & 458752) == 0 ? composerStartRestartGroup.changed(z2) ? 131072 : 65536 : 196608;
                if ((i4 & 64) == 0) {
                    i16 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changed(flingBehavior) ? 1048576 : 524288 : 1572864;
                    if ((i4 & 128) == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 29360128) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                        }
                        if ((i4 & 256) == 0) {
                            i15 = (234881024 & i2) == 0 ? composerStartRestartGroup.changed(contentPadding) ? 67108864 : 33554432 : 100663296;
                            if ((i4 & 512) != 0) {
                                if ((1879048192 & i2) == 0) {
                                    i5 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                                }
                                i6 = i4 & 1024;
                                if (i6 != 0) {
                                    i8 = i3 | 6;
                                    i7 = i6;
                                } else if ((i3 & 14) == 0) {
                                    i7 = i6;
                                    i8 = i3 | (composerStartRestartGroup.changed(vertical) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                    i8 = i3;
                                }
                                i9 = i4 & 2048;
                                if (i9 != 0) {
                                    i8 |= 48;
                                    i10 = i9;
                                } else if ((i3 & 112) == 0) {
                                    i10 = i9;
                                    i8 |= composerStartRestartGroup.changed(horizontal) ? 32 : 16;
                                } else {
                                    i10 = i9;
                                }
                                int i18 = i8;
                                if ((i4 & 4096) != 0) {
                                    i18 |= 384;
                                } else if ((i3 & 896) == 0) {
                                    i18 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                                }
                                if ((1533916891 & i5) != 306783378 || (i18 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                                    Alignment.Vertical centerVertically = i7 == 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                    Alignment.Horizontal centerHorizontally = i10 == 0 ? Alignment.INSTANCE.getCenterHorizontally() : horizontal;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1072219707, i5, i18, "com.google.accompanist.pager.Pager (Pager.kt:378)");
                                    }
                                    if (i >= 0) {
                                        throw new IllegalArgumentException("pageCount must be >= 0");
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(-510390079);
                                    int i19 = 3670016 & i5;
                                    boolean z4 = i19 == 1048576;
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Integer>() { // from class: com.google.accompanist.pager.Pager$Pager$2$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Integer invoke() {
                                                FlingBehavior flingBehavior2 = flingBehavior;
                                                SnapperFlingBehavior snapperFlingBehavior = flingBehavior2 instanceof SnapperFlingBehavior ? (SnapperFlingBehavior) flingBehavior2 : null;
                                                if (snapperFlingBehavior != null) {
                                                    return snapperFlingBehavior.getAnimationTarget();
                                                }
                                                return null;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    state.setFlingAnimationTarget$pager_release((Function0) objRememberedValue);
                                    Integer numValueOf = Integer.valueOf(i);
                                    composerStartRestartGroup.startReplaceableGroup(-510389932);
                                    int i20 = i5 & 896;
                                    int i21 = i5 & 14;
                                    boolean z5 = (i20 == 256) | (i21 == 4);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Pager$Pager$3$1(state, i, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i21 | 64);
                                    composerStartRestartGroup.startReplaceableGroup(-510389756);
                                    boolean z6 = i20 == 256;
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Pager$Pager$4$1(state, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i22 = i5 >> 6;
                                    int i23 = (i22 & 14) | 64;
                                    EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i23);
                                    composerStartRestartGroup.startReplaceableGroup(-510389361);
                                    boolean z7 = i20 == 256;
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (z7 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Pager$Pager$5$1(state, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i23);
                                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(f);
                                    composerStartRestartGroup.startReplaceableGroup(-510389095);
                                    boolean zChanged = composerStartRestartGroup.changed(density) | (i20 == 256) | ((i5 & 57344) == 16384);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Pager$Pager$6$1(density, state, f, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i24 = i5 >> 3;
                                    int i25 = i5;
                                    EffectsKt.LaunchedEffect(density, state, c2002DpM7993boximpl, (Function2) objRememberedValue5, composerStartRestartGroup, (i24 & 112) | 4096 | (i22 & 896));
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.startReplaceableGroup(-510388995);
                                    boolean z8 = i20 == 256;
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (z8 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new PagerScopeImpl(state);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    final PagerScopeImpl pagerScopeImpl = (PagerScopeImpl) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(-510388795);
                                    boolean z9 = (i25 & 458752) == 131072;
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (z9 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new ConsumeFlingNestedScrollConnection(!z2, z2, state);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    final ConsumeFlingNestedScrollConnection consumeFlingNestedScrollConnection = (ConsumeFlingNestedScrollConnection) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (z2) {
                                        composerStartRestartGroup.startReplaceableGroup(-510388572);
                                        LazyListState lazyListState = state.getLazyListState();
                                        Arrangement.Vertical verticalM5091spacedByD5KLDUw = Arrangement.INSTANCE.m5091spacedByD5KLDUw(f, centerVertically);
                                        composerStartRestartGroup.startReplaceableGroup(-510388141);
                                        boolean zChanged2 = ((i25 & 29360128) == 8388608) | (i21 == 4) | composerStartRestartGroup.changed(consumeFlingNestedScrollConnection) | ((i18 & 896) == 256) | composerStartRestartGroup.changed(pagerScopeImpl);
                                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            i11 = i19;
                                            vertical2 = centerVertically;
                                            i12 = i18;
                                            i13 = i22;
                                            i14 = i25;
                                            Function1<LazyListScope, Unit> function12 = new Function1<LazyListScope, Unit>() { // from class: com.google.accompanist.pager.Pager$Pager$7$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                                    invoke2(lazyListScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(LazyListScope LazyColumn) {
                                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                                    int i26 = i;
                                                    Function1<Integer, Object> function13 = function1;
                                                    final ConsumeFlingNestedScrollConnection consumeFlingNestedScrollConnection2 = consumeFlingNestedScrollConnection;
                                                    final Function4<PagerScope, Integer, Composer, Integer, Unit> function4 = content;
                                                    final PagerScopeImpl pagerScopeImpl2 = pagerScopeImpl;
                                                    LazyListScope.items$default(LazyColumn, i26, function13, null, ComposableLambda3.composableLambdaInstance(1889356237, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.Pager$Pager$7$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(4);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function4
                                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                                            invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(LazyItemScope items, int i27, Composer composer2, int i28) {
                                                            int i29;
                                                            Intrinsics.checkNotNullParameter(items, "$this$items");
                                                            if ((i28 & 14) == 0) {
                                                                i29 = (composer2.changed(items) ? 4 : 2) | i28;
                                                            } else {
                                                                i29 = i28;
                                                            }
                                                            if ((i28 & 112) == 0) {
                                                                i29 |= composer2.changed(i27) ? 32 : 16;
                                                            }
                                                            if ((i29 & 731) != 146 || !composer2.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1889356237, i29, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:439)");
                                                                }
                                                                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(LazyItemScope.fillParentMaxHeight$default(items, NestedScrollModifier7.nestedScroll$default(Modifier.INSTANCE, consumeFlingNestedScrollConnection2, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                                                                Function4<PagerScope, Integer, Composer, Integer, Unit> function42 = function4;
                                                                PagerScopeImpl pagerScopeImpl3 = pagerScopeImpl2;
                                                                composer2.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                                                composer2.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                                                                if (composer2.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer2.startReusableNode();
                                                                if (composer2.getInserting()) {
                                                                    composer2.createNode(constructor);
                                                                } else {
                                                                    composer2.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                                                                composer2.startReplaceableGroup(2058660585);
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function42.invoke(pagerScopeImpl3, Integer.valueOf(i27), composer2, Integer.valueOf(i29 & 112));
                                                                composer2.endReplaceableGroup();
                                                                composer2.endNode();
                                                                composer2.endReplaceableGroup();
                                                                composer2.endReplaceableGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer2.skipToGroupEnd();
                                                        }
                                                    }), 4, null);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(function12);
                                            objRememberedValue8 = function12;
                                        } else {
                                            i11 = i19;
                                            i12 = i18;
                                            i14 = i25;
                                            vertical2 = centerVertically;
                                            i13 = i22;
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Alignment.Horizontal horizontal4 = centerHorizontally;
                                        LazyDslKt.LazyColumn(modifier, lazyListState, contentPadding, z, verticalM5091spacedByD5KLDUw, horizontal4, flingBehavior, z3, (Function1) objRememberedValue8, composerStartRestartGroup, (i24 & 14) | ((i14 >> 18) & 896) | (i14 & 7168) | ((i12 << 12) & 458752) | i11 | (i13 & 29360128), 0);
                                        horizontal2 = horizontal4;
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        int i26 = i18;
                                        vertical2 = centerVertically;
                                        horizontal2 = centerHorizontally;
                                        composerStartRestartGroup.startReplaceableGroup(-510387365);
                                        LazyListState lazyListState2 = state.getLazyListState();
                                        Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = Arrangement.INSTANCE.m5090spacedByD5KLDUw(f, horizontal2);
                                        composerStartRestartGroup.startReplaceableGroup(-510386937);
                                        boolean zChanged3 = (i21 == 4) | ((i25 & 29360128) == 8388608) | composerStartRestartGroup.changed(consumeFlingNestedScrollConnection) | ((i26 & 896) == 256) | composerStartRestartGroup.changed(pagerScopeImpl);
                                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            Function1<LazyListScope, Unit> function13 = new Function1<LazyListScope, Unit>() { // from class: com.google.accompanist.pager.Pager$Pager$8$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                                    invoke2(lazyListScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(LazyListScope LazyRow) {
                                                    Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                                    int i27 = i;
                                                    Function1<Integer, Object> function14 = function1;
                                                    final ConsumeFlingNestedScrollConnection consumeFlingNestedScrollConnection2 = consumeFlingNestedScrollConnection;
                                                    final Function4<PagerScope, Integer, Composer, Integer, Unit> function4 = content;
                                                    final PagerScopeImpl pagerScopeImpl2 = pagerScopeImpl;
                                                    LazyListScope.items$default(LazyRow, i27, function14, null, ComposableLambda3.composableLambdaInstance(-70560628, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.Pager$Pager$8$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(4);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function4
                                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                                            invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(LazyItemScope items, int i28, Composer composer2, int i29) {
                                                            int i30;
                                                            Intrinsics.checkNotNullParameter(items, "$this$items");
                                                            if ((i29 & 14) == 0) {
                                                                i30 = (composer2.changed(items) ? 4 : 2) | i29;
                                                            } else {
                                                                i30 = i29;
                                                            }
                                                            if ((i29 & 112) == 0) {
                                                                i30 |= composer2.changed(i28) ? 32 : 16;
                                                            }
                                                            if ((i30 & 731) == 146 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-70560628, i30, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:468)");
                                                            }
                                                            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(LazyItemScope.fillParentMaxWidth$default(items, NestedScrollModifier7.nestedScroll$default(Modifier.INSTANCE, consumeFlingNestedScrollConnection2, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                                                            Function4<PagerScope, Integer, Composer, Integer, Unit> function42 = function4;
                                                            PagerScopeImpl pagerScopeImpl3 = pagerScopeImpl2;
                                                            composer2.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                                            composer2.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                                                            if (composer2.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer2.startReusableNode();
                                                            if (composer2.getInserting()) {
                                                                composer2.createNode(constructor);
                                                            } else {
                                                                composer2.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                                                            composer2.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            function42.invoke(pagerScopeImpl3, Integer.valueOf(i28), composer2, Integer.valueOf(i30 & 112));
                                                            composer2.endReplaceableGroup();
                                                            composer2.endNode();
                                                            composer2.endReplaceableGroup();
                                                            composer2.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }), 4, null);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(function13);
                                            objRememberedValue9 = function13;
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        LazyDslKt.LazyRow(modifier, lazyListState2, contentPadding, z, horizontalM5090spacedByD5KLDUw, vertical2, flingBehavior, z3, (Function1) objRememberedValue9, composerStartRestartGroup, (i24 & 14) | ((i25 >> 18) & 896) | (i25 & 7168) | ((i26 << 15) & 458752) | i19 | (i22 & 29360128), 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    horizontal3 = horizontal2;
                                    vertical3 = vertical2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    vertical3 = vertical;
                                    horizontal3 = horizontal;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.Pager$Pager$9
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
                                            Pager.m9192PagerupBTbn8(i, modifier, state, z, f, z2, flingBehavior, function1, contentPadding, z3, vertical3, horizontal3, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 805306368;
                            i6 = i4 & 1024;
                            if (i6 != 0) {
                            }
                            i9 = i4 & 2048;
                            if (i9 != 0) {
                            }
                            int i182 = i8;
                            if ((i4 & 4096) != 0) {
                            }
                            if ((1533916891 & i5) != 306783378) {
                                if (i7 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (i >= 0) {
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i5 |= i15;
                        if ((i4 & 512) != 0) {
                        }
                        i6 = i4 & 1024;
                        if (i6 != 0) {
                        }
                        i9 = i4 & 2048;
                        if (i9 != 0) {
                        }
                        int i1822 = i8;
                        if ((i4 & 4096) != 0) {
                        }
                        if ((1533916891 & i5) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i4 & 256) == 0) {
                    }
                    i5 |= i15;
                    if ((i4 & 512) != 0) {
                    }
                    i6 = i4 & 1024;
                    if (i6 != 0) {
                    }
                    i9 = i4 & 2048;
                    if (i9 != 0) {
                    }
                    int i18222 = i8;
                    if ((i4 & 4096) != 0) {
                    }
                    if ((1533916891 & i5) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i5 |= i16;
                if ((i4 & 128) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i5 |= i15;
                if ((i4 & 512) != 0) {
                }
                i6 = i4 & 1024;
                if (i6 != 0) {
                }
                i9 = i4 & 2048;
                if (i9 != 0) {
                }
                int i182222 = i8;
                if ((i4 & 4096) != 0) {
                }
                if ((1533916891 & i5) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i5 |= i17;
            if ((i4 & 64) == 0) {
            }
            i5 |= i16;
            if ((i4 & 128) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i5 |= i15;
            if ((i4 & 512) != 0) {
            }
            i6 = i4 & 1024;
            if (i6 != 0) {
            }
            i9 = i4 & 2048;
            if (i9 != 0) {
            }
            int i1822222 = i8;
            if ((i4 & 4096) != 0) {
            }
            if ((1533916891 & i5) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        i5 |= i17;
        if ((i4 & 64) == 0) {
        }
        i5 |= i16;
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i5 |= i15;
        if ((i4 & 512) != 0) {
        }
        i6 = i4 & 1024;
        if (i6 != 0) {
        }
        i9 = i4 & 2048;
        if (i9 != 0) {
        }
        int i18222222 = i8;
        if ((i4 & 4096) != 0) {
        }
        if ((1533916891 & i5) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: consume-9KIMszo, reason: not valid java name */
    public static final long m9195consume9KIMszo(long j, boolean z, boolean z2) {
        return OffsetKt.Offset(z ? Offset.m6543getXimpl(j) : 0.0f, z2 ? Offset.m6544getYimpl(j) : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: consume-BMRW4eQ, reason: not valid java name */
    public static final long m9196consumeBMRW4eQ(long j, boolean z, boolean z2) {
        return Velocity2.Velocity(z ? Velocity.m8101getXimpl(j) : 0.0f, z2 ? Velocity.m8102getYimpl(j) : 0.0f);
    }
}
