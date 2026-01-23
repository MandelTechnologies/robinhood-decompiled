package androidx.compose.foundation.pager;

import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Pager.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aé\u0001\u0010'\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2,\u0010$\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aS\u00100\u001a\u00020\b*\u00020\u001b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u00101\u001a3\u00105\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00102\u0006\u00104\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m3636d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "key", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "HorizontalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "currentPageOffset", "(Landroidx/compose/foundation/gestures/snapping/SnapPosition;IIIIIIFI)I", "isVertical", "Lkotlinx/coroutines/CoroutineScope;", "scope", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLkotlinx/coroutines/CoroutineScope;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5301HorizontalPager8jOkeI(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollModifier nestedScrollModifier, SnapPosition snapPosition, Overscroll overscroll, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        final int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Vertical centerVertically;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer2;
        final PaddingValues paddingValues2;
        final PageSize pageSize2;
        final boolean z3;
        final boolean z4;
        final Function1<? super Integer, ? extends Object> function12;
        final NestedScrollModifier nestedScrollModifier2;
        final SnapPosition snapPosition2;
        final float f3;
        final Modifier modifier3;
        final Alignment.Vertical vertical2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final Overscroll overscroll2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        PagerState pagerState2;
        ?? r4;
        int i22;
        int i23;
        NestedScrollModifier nestedScrollModifierPageNestedScrollConnection;
        int i24;
        Function1<? super Integer, ? extends Object> function13;
        NestedScrollModifier nestedScrollModifier3;
        int i25;
        PaddingValues paddingValues3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        int i26;
        float f4;
        int i27;
        boolean z6;
        SnapPosition snapPosition3;
        Modifier modifier4;
        Overscroll overscrollRememberOverscrollEffect;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1372972868);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
                }
                i7 = i4 & 8;
                int i29 = 1024;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(pageSize) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            centerVertically = vertical;
                        } else {
                            centerVertically = vertical;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(centerVertically) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i30 = composerStartRestartGroup.changed(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i5 |= i30;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i5 |= i30;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            i17 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changedInstance(nestedScrollModifier)) ? 32 : 16;
                        } else {
                            i18 = i16;
                        }
                        int i31 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i20 = i31 | 384;
                        } else {
                            i20 = i31;
                            if ((i3 & 384) == 0) {
                                i20 |= composerStartRestartGroup.changed(snapPosition) ? 256 : 128;
                            }
                            if ((i3 & 3072) == 0) {
                                if ((i4 & 8192) == 0 && composerStartRestartGroup.changed(overscroll)) {
                                    i29 = 2048;
                                }
                                i20 |= i29;
                            }
                            i21 = i20;
                            if ((i4 & 16384) != 0) {
                                if ((i3 & 24576) == 0) {
                                    i21 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
                                }
                                if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                        PaddingValues paddingValuesM5135PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        int i32 = i8 != 0 ? 0 : i9;
                                        float fM7995constructorimpl = i10 != 0 ? C2002Dp.m7995constructorimpl(0) : f2;
                                        if (i11 != 0) {
                                            centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        }
                                        if ((i4 & 128) != 0) {
                                            i22 = i19;
                                            i23 = i21;
                                            pagerState2 = pagerState;
                                            TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, composerStartRestartGroup, (i15 & 14) | 196608, 30);
                                            i15 &= -29360129;
                                            r4 = 0;
                                            targetedFlingBehavior2 = targetedFlingBehaviorFlingBehavior;
                                        } else {
                                            pagerState2 = pagerState;
                                            r4 = 0;
                                            i22 = i19;
                                            i23 = i21;
                                        }
                                        boolean z7 = i12 == 0 ? z : true;
                                        boolean z8 = i14 != 0 ? r4 : z2;
                                        Function1<? super Integer, ? extends Object> function14 = i18 != 0 ? null : function1;
                                        if ((i4 & 2048) != 0) {
                                            nestedScrollModifierPageNestedScrollConnection = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, composerStartRestartGroup, (i15 & 14) | 432);
                                            i24 = i23 & (-113);
                                        } else {
                                            nestedScrollModifierPageNestedScrollConnection = nestedScrollModifier;
                                            i24 = i23;
                                        }
                                        SnapPosition snapPosition4 = i22 != 0 ? SnapPosition.Start.INSTANCE : snapPosition;
                                        if ((i4 & 8192) != 0) {
                                            SnapPosition snapPosition5 = snapPosition4;
                                            overscrollRememberOverscrollEffect = Overscroll4.rememberOverscrollEffect(composerStartRestartGroup, r4);
                                            i25 = i24 & (-7169);
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            snapPosition3 = snapPosition5;
                                            function13 = function14;
                                            nestedScrollModifier3 = nestedScrollModifierPageNestedScrollConnection;
                                            composer2 = composerStartRestartGroup;
                                            paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i32;
                                            f4 = fM7995constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            modifier4 = modifier5;
                                        } else {
                                            function13 = function14;
                                            nestedScrollModifier3 = nestedScrollModifierPageNestedScrollConnection;
                                            i25 = i24;
                                            composer2 = composerStartRestartGroup;
                                            paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i32;
                                            f4 = fM7995constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            snapPosition3 = snapPosition4;
                                            modifier4 = modifier5;
                                            overscrollRememberOverscrollEffect = overscroll;
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 128) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            i21 &= -113;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i21 &= -7169;
                                        }
                                        paddingValues3 = paddingValues;
                                        pageSize3 = pageSize;
                                        z6 = z2;
                                        function13 = function1;
                                        nestedScrollModifier3 = nestedScrollModifier;
                                        i25 = i21;
                                        composer2 = composerStartRestartGroup;
                                        f4 = f2;
                                        modifier4 = modifier2;
                                        i27 = i15;
                                        z5 = z;
                                        overscrollRememberOverscrollEffect = overscroll;
                                        i26 = i9;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        snapPosition3 = snapPosition;
                                    }
                                    composer2.endDefaults();
                                    Modifier modifier6 = modifier4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1372972868, i27, i25, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:129)");
                                    }
                                    int i33 = i25;
                                    int i34 = i27 >> 6;
                                    int i35 = i27 << 12;
                                    int i36 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i34 & 458752) | (i34 & 3670016) | ((i33 << 12) & 29360128) | (i35 & 234881024) | (i35 & 1879048192);
                                    int i37 = ((i27 >> 9) & 14) | 3072 | (i33 & 112);
                                    int i38 = i33 << 6;
                                    LazyLayoutPagerKt.m5299PagereLwUrMk(modifier6, pagerState, paddingValues3, z6, Orientation.Horizontal, targetedFlingBehavior4, z5, overscrollRememberOverscrollEffect, i26, f4, pageSize3, nestedScrollModifier3, function13, Alignment.INSTANCE.getCenterHorizontally(), centerVertically, snapPosition3, function4, composer2, i36, i37 | (i38 & 896) | (i34 & 57344) | ((i33 << 9) & 458752) | (i38 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    int i39 = i26;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    i9 = i39;
                                    float f5 = f4;
                                    z3 = z5;
                                    f3 = f5;
                                    Alignment.Vertical vertical3 = centerVertically;
                                    overscroll2 = overscrollRememberOverscrollEffect;
                                    vertical2 = vertical3;
                                    Function1<? super Integer, ? extends Object> function15 = function13;
                                    nestedScrollModifier2 = nestedScrollModifier3;
                                    function12 = function15;
                                    pageSize2 = pageSize3;
                                    snapPosition2 = snapPosition3;
                                    z4 = z6;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier6;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z3 = z;
                                    z4 = z2;
                                    function12 = function1;
                                    nestedScrollModifier2 = nestedScrollModifier;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    modifier3 = modifier2;
                                    vertical2 = centerVertically;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    overscroll2 = overscroll;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
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

                                        public final void invoke(Composer composer3, int i40) {
                                            PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifier3, paddingValues2, pageSize2, i9, f3, vertical2, targetedFlingBehavior3, z3, z4, function12, nestedScrollModifier2, snapPosition2, overscroll2, function4, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i21 |= 24576;
                            if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i21 = i20;
                        if ((i4 & 16384) != 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i312 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i21 = i20;
                    if ((i4 & 16384) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3122 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i21 = i20;
                if ((i4 & 16384) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            int i292 = 1024;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i31222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i21 = i20;
            if ((i4 & 16384) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i2922 = 1024;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i312222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i21 = i20;
        if ((i4 & 16384) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true, i15 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return MathKt.roundToInt(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z, final CoroutineScope coroutineScope, boolean z2) {
        if (z2) {
            return modifier.then(SemanticsModifier6.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    if (z) {
                        final PagerState pagerState2 = pagerState;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, coroutineScope2));
                            }
                        }, 1, null);
                        final PagerState pagerState3 = pagerState;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, coroutineScope3));
                            }
                        }, 1, null);
                        return;
                    }
                    final PagerState pagerState4 = pagerState;
                    final CoroutineScope coroutineScope4 = coroutineScope;
                    SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, coroutineScope4));
                        }
                    }, 1, null);
                    final PagerState pagerState5 = pagerState;
                    final CoroutineScope coroutineScope5 = coroutineScope;
                    SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, coroutineScope5));
                        }
                    }, 1, null);
                }
            }, 1, null));
        }
        return modifier.then(Modifier.INSTANCE);
    }
}
