package com.google.accompanist.pager;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlpha2;
import androidx.compose.material.ContentColor;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: PagerIndicator.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0080\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a~\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/google/accompanist/pager/PagerState;", "pagerState", "Landroidx/compose/ui/Modifier;", "modifier", "", "pageCount", "Lkotlin/Function1;", "pageIndexMapping", "Landroidx/compose/ui/graphics/Color;", "activeColor", "inactiveColor", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "indicatorHeight", "spacing", "Landroidx/compose/ui/graphics/Shape;", "indicatorShape", "", "HorizontalPagerIndicator-K_mkGiw", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;JJFFFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "HorizontalPagerIndicator", "Lcom/google/accompanist/pager/PagerStateBridge;", "(Lcom/google/accompanist/pager/PagerStateBridge;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;JJFFFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "pager-indicators_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.accompanist.pager.PagerIndicatorKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class PagerIndicator {
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @Deprecated
    /* renamed from: HorizontalPagerIndicator-K_mkGiw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9199HorizontalPagerIndicatorK_mkGiw(final PagerState pagerState, Modifier modifier, int i, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, Shape shape, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int pageCount;
        int i5;
        Function1<? super Integer, Integer> function12;
        int i6;
        long j3;
        int i7;
        int i8;
        float fM7995constructorimpl;
        long jM6705copywmQWz5c$default;
        long jM6705copywmQWz5c$default2;
        float f4;
        int i9;
        float f5;
        int i10;
        int i11;
        float f6;
        float f7;
        int i12;
        long j4;
        int i13;
        int i14;
        long j5;
        Shape circleShape;
        float f8;
        Function1<? super Integer, Integer> function13;
        int i15;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final int i16;
        final Modifier modifier3;
        final Function1<? super Integer, Integer> function14;
        final long j6;
        final long j7;
        final float f9;
        final float f10;
        final float f11;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1678773673);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    pageCount = i;
                    int i18 = composerStartRestartGroup.changed(pageCount) ? 256 : 128;
                    i4 |= i18;
                } else {
                    pageCount = i;
                }
                i4 |= i18;
            } else {
                pageCount = i;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    function12 = function1;
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i2 & 57344) == 0) {
                    i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(j)) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i6 = 57344;
                    j3 = j2;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
                } else {
                    i6 = 57344;
                    j3 = j2;
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                    if ((i2 & 3670016) == 0) {
                        i8 = 458752;
                        fM7995constructorimpl = f;
                        i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(f2)) ? 8388608 : 4194304;
                    }
                    if ((i2 & 234881024) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(f3)) ? 67108864 : 33554432;
                    }
                    if ((i2 & 1879048192) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                    }
                    if ((i4 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                pageCount = pagerState.getPageCount();
                            }
                            if (i5 != 0) {
                                function12 = new Function1<Integer, Integer>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$1
                                    public final Integer invoke(int i19) {
                                        return Integer.valueOf(i19);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }
                                };
                            }
                            if ((i3 & 16) == 0) {
                                i4 &= -57345;
                                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColor.getLocalContentColor())).getValue(), ((Number) composerStartRestartGroup.consume(ContentAlpha2.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM6705copywmQWz5c$default = j;
                            }
                            if ((i3 & 32) == 0) {
                                jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(jM6705copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                                i4 &= -458753;
                            } else {
                                jM6705copywmQWz5c$default2 = j3;
                            }
                            if (i7 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                            }
                            if ((i3 & 128) == 0) {
                                i4 &= -29360129;
                                f4 = fM7995constructorimpl;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & 256) == 0) {
                                i9 = i4 & (-234881025);
                                f5 = fM7995constructorimpl;
                            } else {
                                i9 = i4;
                                f5 = f3;
                            }
                            if ((i3 & 512) == 0) {
                                i10 = pageCount;
                                i11 = 3670016;
                                f6 = f4;
                                f7 = fM7995constructorimpl;
                                i12 = 1879048192;
                                j4 = jM6705copywmQWz5c$default2;
                                i13 = 29360128;
                                i14 = 234881024;
                                j5 = jM6705copywmQWz5c$default;
                                f8 = f5;
                                i4 = i9 & (-1879048193);
                                function13 = function12;
                                circleShape = RoundedCornerShape2.getCircleShape();
                            } else {
                                i10 = pageCount;
                                i11 = 3670016;
                                f6 = f4;
                                f7 = fM7995constructorimpl;
                                i12 = 1879048192;
                                j4 = jM6705copywmQWz5c$default2;
                                i13 = 29360128;
                                i14 = 234881024;
                                j5 = jM6705copywmQWz5c$default;
                                circleShape = shape;
                                f8 = f5;
                                i4 = i9;
                                function13 = function12;
                            }
                            i15 = 4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            i10 = pageCount;
                            i11 = 3670016;
                            f6 = f2;
                            f8 = f3;
                            circleShape = shape;
                            f7 = fM7995constructorimpl;
                            i13 = 29360128;
                            i14 = 234881024;
                            i12 = 1879048192;
                            i15 = 4;
                            j5 = j;
                            function13 = function12;
                            j4 = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1678773673, i4, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:87)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1521406528);
                        z = (i4 & 14) != i15;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PagerTab() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$stateBridge$1$1
                                @Override // com.google.accompanist.pager.PagerTab
                                public int getCurrentPage() {
                                    return pagerState.getCurrentPage();
                                }

                                @Override // com.google.accompanist.pager.PagerTab
                                public float getCurrentPageOffset() {
                                    return pagerState.getCurrentPageOffset();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i19 = (i14 & i4) | (i13 & i4) | (i11 & i4) | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (i4 & i6) | (i4 & i8) | (i12 & i4);
                        composer2 = composerStartRestartGroup;
                        Modifier modifier4 = modifier2;
                        m9200HorizontalPagerIndicatorK_mkGiw((PagerIndicator7) objRememberedValue, i10, modifier4, function13, j5, j4, f7, f6, f8, circleShape, composer2, i19, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i16 = i10;
                        modifier3 = modifier4;
                        function14 = function13;
                        j6 = j5;
                        j7 = j4;
                        f9 = f7;
                        f10 = f6;
                        f11 = f8;
                        shape2 = circleShape;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        shape2 = shape;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        i16 = pageCount;
                        function14 = function12;
                        j7 = j3;
                        f9 = fM7995constructorimpl;
                        j6 = j;
                        f10 = f2;
                        f11 = f3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$2
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

                            public final void invoke(Composer composer3, int i20) {
                                PagerIndicator.m9199HorizontalPagerIndicatorK_mkGiw(pagerState, modifier3, i16, function14, j6, j7, f9, f10, f11, shape2, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                i8 = 458752;
                fM7995constructorimpl = f;
                if ((i2 & 29360128) == 0) {
                }
                if ((i2 & 234881024) == 0) {
                }
                if ((i2 & 1879048192) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        i15 = 4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1521406528);
                        if ((i4 & 14) != i15) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new PagerTab() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$stateBridge$1$1
                                @Override // com.google.accompanist.pager.PagerTab
                                public int getCurrentPage() {
                                    return pagerState.getCurrentPage();
                                }

                                @Override // com.google.accompanist.pager.PagerTab
                                public float getCurrentPageOffset() {
                                    return pagerState.getCurrentPageOffset();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i192 = (i14 & i4) | (i13 & i4) | (i11 & i4) | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (i4 & i6) | (i4 & i8) | (i12 & i4);
                            composer2 = composerStartRestartGroup;
                            Modifier modifier42 = modifier2;
                            m9200HorizontalPagerIndicatorK_mkGiw((PagerIndicator7) objRememberedValue, i10, modifier42, function13, j5, j4, f7, f6, f8, circleShape, composer2, i192, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i16 = i10;
                            modifier3 = modifier42;
                            function14 = function13;
                            j6 = j5;
                            j7 = j4;
                            f9 = f7;
                            f10 = f6;
                            f11 = f8;
                            shape2 = circleShape;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = 458752;
            fM7995constructorimpl = f;
            if ((i2 & 29360128) == 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i2 & 1879048192) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = 458752;
        fM7995constructorimpl = f;
        if ((i2 & 29360128) == 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i2 & 1879048192) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a6 A[LOOP:0: B:190:0x03a4->B:191:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* renamed from: HorizontalPagerIndicator-K_mkGiw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9200HorizontalPagerIndicatorK_mkGiw(final PagerTab pagerTab, final int i, Modifier modifier, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, Shape shape, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function1<? super Integer, Integer> function12;
        long jM6705copywmQWz5c$default;
        Integer num;
        int i6;
        float fM7995constructorimpl;
        float f4;
        long jM6705copywmQWz5c$default2;
        float f5;
        float f6;
        float f7;
        int i7;
        Shape circleShape;
        float f8;
        long j3;
        Modifier modifier3;
        final Function1<? super Integer, Integer> function13;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i8;
        final long j4;
        Composer composer2;
        final Function1<? super Integer, Integer> function14;
        final float f9;
        final long j5;
        final float f10;
        final Shape shape2;
        final float f11;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1605247238);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(pagerTab) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    function12 = function1;
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        jM6705copywmQWz5c$default = j;
                        int i10 = composerStartRestartGroup.changed(jM6705copywmQWz5c$default) ? 16384 : 8192;
                        i4 |= i10;
                    } else {
                        jM6705copywmQWz5c$default = j;
                    }
                    i4 |= i10;
                } else {
                    jM6705copywmQWz5c$default = j;
                }
                if ((458752 & i2) == 0) {
                    num = 0;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j2)) ? 131072 : 65536;
                } else {
                    num = 0;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    fM7995constructorimpl = f;
                } else {
                    fM7995constructorimpl = f;
                    if ((i2 & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        f4 = f2;
                        int i11 = composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                        i4 |= i11;
                    } else {
                        f4 = f2;
                    }
                    i4 |= i11;
                } else {
                    f4 = f2;
                }
                if ((i2 & 234881024) == 0) {
                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(f3)) ? 67108864 : 33554432;
                }
                if ((1879048192 & i2) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                }
                if ((i4 & 1533916891) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            function12 = new Function1<Integer, Integer>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$5
                                public final Integer invoke(int i12) {
                                    return Integer.valueOf(i12);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num2) {
                                    return invoke(num2.intValue());
                                }
                            };
                        }
                        if ((i3 & 16) != 0) {
                            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColor.getLocalContentColor())).getValue(), ((Number) composerStartRestartGroup.consume(ContentAlpha2.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        }
                        long j6 = jM6705copywmQWz5c$default;
                        if ((i3 & 32) == 0) {
                            jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM6705copywmQWz5c$default2 = j2;
                        }
                        if (i6 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            f4 = fM7995constructorimpl;
                        }
                        if ((i3 & 256) == 0) {
                            i4 &= -234881025;
                            f5 = fM7995constructorimpl;
                        } else {
                            f5 = f3;
                        }
                        if ((i3 & 512) == 0) {
                            int i12 = i4 & (-1879048193);
                            f6 = f4;
                            f7 = fM7995constructorimpl;
                            i7 = i12;
                            circleShape = RoundedCornerShape2.getCircleShape();
                        } else {
                            int i13 = i4;
                            f6 = f4;
                            f7 = fM7995constructorimpl;
                            i7 = i13;
                            circleShape = shape;
                        }
                        f8 = f5;
                        j3 = jM6705copywmQWz5c$default2;
                        jM6705copywmQWz5c$default = j6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        int i14 = i4;
                        f6 = f4;
                        f7 = fM7995constructorimpl;
                        i7 = i14;
                        j3 = j2;
                        f8 = f3;
                        circleShape = shape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        modifier3 = modifier2;
                        function13 = function12;
                    } else {
                        modifier3 = modifier2;
                        function13 = function12;
                        ComposerKt.traceEventStart(-1605247238, i7, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:194)");
                    }
                    final int iMo5010roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f7);
                    final int iMo5010roundToPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f8);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment centerStart = companion.getCenterStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Integer num2 = num;
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num2);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(f8);
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    float f12 = f8;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num2);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion3, f7, f6), j3, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29719881);
                    for (i8 = 0; i8 < i; i8++) {
                        BoxKt.Box(modifierM4871backgroundbw27NRU, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM4871backgroundbw27NRU2 = Modifier.INSTANCE;
                    Function1<? super Integer, Integer> function15 = function13;
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(OffsetKt.offset(modifierM4871backgroundbw27NRU2, new Function1<Density, IntOffset>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$6$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                            return IntOffset.m8030boximpl(m9202invokeBjo55l4(density));
                        }

                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m9202invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffset2.IntOffset((int) ((iMo5010roundToPx0680j_42 + iMo5010roundToPx0680j_4) * RangesKt.coerceIn(((function13.invoke(Integer.valueOf(pagerTab.getCurrentPage() + ((int) Math.signum(r0)))).intValue() - r5) * Math.abs(pagerTab.getCurrentPageOffset())) + function13.invoke(Integer.valueOf(pagerTab.getCurrentPage())).intValue(), 0.0f, RangesKt.coerceAtLeast(i - 1, 0))), 0);
                        }
                    }), f7, f6);
                    if (i > 0) {
                        modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierM4871backgroundbw27NRU2, jM6705copywmQWz5c$default, circleShape);
                    }
                    BoxKt.Box(modifierM5171sizeVpY3zN4.then(modifierM4871backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    composer2 = composerStartRestartGroup;
                    function14 = function15;
                    f9 = f6;
                    j5 = jM6705copywmQWz5c$default;
                    f10 = f12;
                    shape2 = circleShape;
                    f11 = f7;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    function14 = function12;
                    j5 = jM6705copywmQWz5c$default;
                    f11 = fM7995constructorimpl;
                    f10 = f3;
                    shape2 = shape;
                    f9 = f4;
                    modifier4 = modifier2;
                    j4 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                            invoke(composer3, num3.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i15) {
                            PagerIndicator.m9200HorizontalPagerIndicatorK_mkGiw(pagerTab, i, modifier4, (Function1<? super Integer, Integer>) function14, j5, j4, f11, f9, f10, shape2, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            function12 = function1;
            if ((57344 & i2) == 0) {
            }
            if ((458752 & i2) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((1879048192 & i2) == 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    long j62 = jM6705copywmQWz5c$default;
                    if ((i3 & 32) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    f8 = f5;
                    j3 = jM6705copywmQWz5c$default2;
                    jM6705copywmQWz5c$default = j62;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final int iMo5010roundToPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f7);
                    final int iMo5010roundToPx0680j_422 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f8);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment centerStart2 = companion4.getCenterStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Integer num22 = num;
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num22);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(f8);
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        float f122 = f8;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion32);
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num22);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierM4871backgroundbw27NRU3 = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion32, f7, f6), j3, circleShape);
                            composerStartRestartGroup.startReplaceableGroup(-29719881);
                            while (i8 < i) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierM4871backgroundbw27NRU22 = Modifier.INSTANCE;
                            Function1<? super Integer, Integer> function152 = function13;
                            Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(OffsetKt.offset(modifierM4871backgroundbw27NRU22, new Function1<Density, IntOffset>() { // from class: com.google.accompanist.pager.PagerIndicatorKt$HorizontalPagerIndicator$6$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m8030boximpl(m9202invokeBjo55l4(density));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m9202invokeBjo55l4(Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffset2.IntOffset((int) ((iMo5010roundToPx0680j_422 + iMo5010roundToPx0680j_43) * RangesKt.coerceIn(((function13.invoke(Integer.valueOf(pagerTab.getCurrentPage() + ((int) Math.signum(r0)))).intValue() - r5) * Math.abs(pagerTab.getCurrentPageOffset())) + function13.invoke(Integer.valueOf(pagerTab.getCurrentPage())).intValue(), 0.0f, RangesKt.coerceAtLeast(i - 1, 0))), 0);
                                }
                            }), f7, f6);
                            if (i > 0) {
                            }
                            BoxKt.Box(modifierM5171sizeVpY3zN42.then(modifierM4871backgroundbw27NRU22), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j4 = j3;
                            composer2 = composerStartRestartGroup;
                            function14 = function152;
                            f9 = f6;
                            j5 = jM6705copywmQWz5c$default;
                            f10 = f122;
                            shape2 = circleShape;
                            f11 = f7;
                            modifier4 = modifier3;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((57344 & i2) == 0) {
        }
        if ((458752 & i2) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((1879048192 & i2) == 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
