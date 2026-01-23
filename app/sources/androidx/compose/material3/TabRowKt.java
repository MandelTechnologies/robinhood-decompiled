package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ao\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042'\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0091\u0001\u0010!\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m3636d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "Lkotlin/Function0;", StatisticsSection2.DIVIDER, "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "TabRowWithSubcomposeImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "Landroidx/compose/foundation/ScrollState;", "scrollState", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "TabRowIndicatorSpec", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TabRowKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final float ScrollableTabRowMinimumTabWidth = C2002Dp.m7995constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, Easing3.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<C2002Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(250, 0, Easing3.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5993TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function2M5811getLambda3$material3_release;
        Modifier modifier3;
        long j3;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        long j4;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function3RememberComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    function3RememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2052073983, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:307)");
                                            }
                                            if (i < list.size()) {
                                                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                                tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i6 == 0) {
                                    function2M5811getLambda3$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m5811getLambda3$material3_release();
                                    modifier3 = modifier2;
                                    j3 = primaryContentColor;
                                    function32 = function3RememberComposableLambda;
                                    i7 = -1199178586;
                                    j4 = primaryContainerColor;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:315)");
                                }
                                composer2 = composerStartRestartGroup;
                                m5994TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M5811getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                j5 = j4;
                                j6 = j3;
                                function33 = function32;
                                function24 = function2M5811getLambda3$material3_release;
                            }
                            modifier3 = modifier2;
                            function32 = function3RememberComposableLambda;
                            function2M5811getLambda3$material3_release = function23;
                            i7 = -1199178586;
                            j4 = primaryContainerColor;
                            j3 = primaryContentColor;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m5994TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M5811getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M5811getLambda3$material3_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            j5 = primaryContainerColor;
                            j6 = primaryContentColor;
                            function33 = function3RememberComposableLambda;
                            function24 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    TabRowKt.m5993TabRowpAZo6Ak(i, modifier4, j5, j6, function33, function24, function22, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i8 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                                modifier3 = modifier2;
                                function32 = function3RememberComposableLambda;
                                function2M5811getLambda3$material3_release = function23;
                                i7 = -1199178586;
                                j4 = primaryContainerColor;
                                j3 = primaryContentColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m5994TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M5811getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M5811getLambda3$material3_release;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function3RememberComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3RememberComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5991ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        float fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i7;
        int i8;
        final Modifier modifier3;
        final long j3;
        final long j4;
        final float f2;
        Function2<? super Composer, ? super Integer, Unit> function2M5812getLambda6$material3_release;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i10 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i10;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i10;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i11 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i11;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i11;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        function3RememberComposableLambda = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m5989getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    function3RememberComposableLambda = ComposableLambda3.rememberComposableLambda(-913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                            invoke((List<TabPosition>) list, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer2, int i12) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-913748678, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:501)");
                                            }
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                            tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i7 == 0) {
                                    i8 = i4;
                                    modifier3 = modifier2;
                                    j3 = primaryContainerColor;
                                    j4 = primaryContentColor;
                                    f2 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    function2M5812getLambda6$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m5812getLambda6$material3_release();
                                    function32 = function3RememberComposableLambda;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-497821003, i8, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:507)");
                                }
                                int i12 = i8 << 3;
                                m5992ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M5812getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i12 & 896) | (i8 & 14) | ((i8 >> 12) & 112) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i8) | (i8 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function23 = function2M5812getLambda6$material3_release;
                                function33 = function32;
                            }
                            i8 = i4;
                            modifier3 = modifier2;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f2 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function32 = function3RememberComposableLambda;
                            function2M5812getLambda6$material3_release = function2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = i8 << 3;
                            m5992ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M5812getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i122 & 896) | (i8 & 14) | ((i8 >> 12) & 112) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (3670016 & i8) | (i8 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M5812getLambda6$material3_release;
                            function33 = function32;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2;
                            modifier3 = modifier2;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f2 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function33 = function3RememberComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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

                                public final void invoke(Composer composer2, int i13) {
                                    TabRowKt.m5991ScrollableTabRowsKfQg0A(i, modifier3, j3, j4, f2, function33, function23, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i4 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i9 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                                i8 = i4;
                                modifier3 = modifier2;
                                j3 = primaryContainerColor;
                                j4 = primaryContentColor;
                                f2 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                function32 = function3RememberComposableLambda;
                                function2M5812getLambda6$material3_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i1222 = i8 << 3;
                            m5992ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M5812getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i1222 & 896) | (i8 & 14) | ((i8 >> 12) & 112) | (i1222 & 7168) | (57344 & i1222) | (458752 & i1222) | (3670016 & i8) | (i8 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M5812getLambda6$material3_release;
                            function33 = function32;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3RememberComposableLambda = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i4 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function3RememberComposableLambda = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i4 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function3RememberComposableLambda = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m5994TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j, final long j2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5967SurfaceT9BRK9s(SelectableGroup.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:954)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChanged = composer3.changed(function22) | composer3.changed(function2) | composer3.changed(function3);
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m5998invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m5998invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                final int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j3);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = listSubcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM7975getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    numValueOf = Integer.valueOf(Math.max(listSubcompose.get(i5).maxIntrinsicHeight(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    Measurable measurable = listSubcompose.get(i6);
                                    int i7 = intRef.element;
                                    arrayList.add(measurable.mo7239measureBRTryo0(Constraints.m7966copyZbe2FdA(j3, i7, i7, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList2.add(new TabPosition(C2002Dp.m7995constructorimpl(subcomposeMeasureScope.mo5013toDpu2uoSUM(intRef.element) * i8), subcomposeMeasureScope.mo5013toDpu2uoSUM(intRef.element), ((C2002Dp) ComparisonsKt.maxOf(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(subcomposeMeasureScope.mo5013toDpu2uoSUM(Math.min(listSubcompose.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - C2002Dp.m7995constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(24)))).getValue(), null));
                                }
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM7975getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        List<Placeable> list = arrayList;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i9), i9 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j4 = j3;
                                        int i10 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            Placeable placeableMo7239measureBRTryo0 = listSubcompose2.get(i11).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo0, 0, i10 - placeableMo7239measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList2;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambda3.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i12) {
                                                if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i12, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1000)");
                                                }
                                                function34.invoke(list2, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i12 = iM7975getMaxWidthimpl;
                                        int i13 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i14).mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
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

                public final void invoke(Composer composer3, int i4) {
                    TabRowKt.m5994TabRowWithSubcomposeImplDTcfvLk(modifier3, j, j2, function3, function2, function22, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5992ScrollableTabRowWithSubcomposeImplqhFBPw4(final int i, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i2, final int i3) {
        int i4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i5;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i6;
        float fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M5813getLambda7$material3_release;
        Composer composer2;
        final float f2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-955409947);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function32 = function3;
                i4 |= composerStartRestartGroup.changedInstance(function32) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        primaryContainerColor = j;
                        int i8 = composerStartRestartGroup.changed(primaryContainerColor) ? 2048 : 1024;
                        i4 |= i8;
                    } else {
                        primaryContainerColor = j;
                    }
                    i4 |= i8;
                } else {
                    primaryContainerColor = j;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        primaryContentColor = j2;
                        int i9 = composerStartRestartGroup.changed(primaryContentColor) ? 16384 : 8192;
                        i4 |= i9;
                    } else {
                        primaryContentColor = j2;
                    }
                    i4 |= i9;
                } else {
                    primaryContentColor = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                        i4 |= composerStartRestartGroup.changed(fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(scrollState) ? 67108864 : 33554432;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 8) != 0) {
                                        primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                        i4 &= -57345;
                                    }
                                    if (i6 != 0) {
                                        fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m5989getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                    }
                                    if (i7 == 0) {
                                        function2M5813getLambda7$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m5813getLambda7$material3_release();
                                    }
                                    long j5 = primaryContentColor;
                                    final float f3 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    Modifier modifier4 = modifier2;
                                    long j6 = primaryContainerColor;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-955409947, i4, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1020)");
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = function2M5813getLambda7$material3_release;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                    int i10 = ((i4 >> 6) & 14) | 12582912;
                                    int i11 = i4 >> 3;
                                    composer2 = composerStartRestartGroup;
                                    SurfaceKt.m5967SurfaceT9BRK9s(modifier4, null, j6, j5, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                        public final void invoke(Composer composer3, int i12) {
                                            if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                                }
                                                Object objRememberedValue = composer3.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (objRememberedValue == companion.getEmpty()) {
                                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3));
                                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                                }
                                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                                boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                                ScrollState scrollState2 = scrollState;
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                    objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                                Modifier modifierClipToBounds = Clip.clipToBounds(SelectableGroup.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                                boolean zChanged2 = composer3.changed(f3) | composer3.changed(function22) | composer3.changed(function24) | composer3.changed(function33) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                                final float f4 = f3;
                                                final Function2<Composer, Integer, Unit> function25 = function22;
                                                final Function2<Composer, Integer, Unit> function26 = function24;
                                                final int i13 = i;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                    Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                            return m5997invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                        }

                                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                        public final MeasureResult m5997invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                            int iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                            final int iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(f4);
                                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                            Integer numValueOf = 0;
                                                            int size = listSubcompose.size();
                                                            for (int i14 = 0; i14 < size; i14++) {
                                                                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                            }
                                                            final int iIntValue = numValueOf.intValue();
                                                            long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j7, iMo5010roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                            final ArrayList arrayList = new ArrayList();
                                                            final ArrayList arrayList2 = new ArrayList();
                                                            int size2 = listSubcompose.size();
                                                            for (int i15 = 0; i15 < size2; i15++) {
                                                                Measurable measurable = listSubcompose.get(i15);
                                                                Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
                                                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(subcomposeMeasureScope.mo5013toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo7239measureBRTryo0.getHeight()), placeableMo7239measureBRTryo0.getWidth())) - C2002Dp.m7995constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                                arrayList.add(placeableMo7239measureBRTryo0);
                                                                arrayList2.add(C2002Dp.m7993boximpl(fM7995constructorimpl));
                                                            }
                                                            Integer numValueOf2 = Integer.valueOf(iMo5010roundToPx0680j_42 * 2);
                                                            int size3 = arrayList.size();
                                                            for (int i16 = 0; i16 < size3; i16++) {
                                                                numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                            }
                                                            final int iIntValue2 = numValueOf2.intValue();
                                                            final Function2<Composer, Integer, Unit> function27 = function26;
                                                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                            final int i17 = i13;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                                            return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                    final ArrayList arrayList3 = new ArrayList();
                                                                    int i18 = iMo5010roundToPx0680j_42;
                                                                    List<Placeable> list = arrayList;
                                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                    List<C2002Dp> list2 = arrayList2;
                                                                    int size4 = list.size();
                                                                    int width = i18;
                                                                    for (int i19 = 0; i19 < size4; i19++) {
                                                                        Placeable placeable = list.get(i19);
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                        arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo5013toDpu2uoSUM(width), subcomposeMeasureScope2.mo5013toDpu2uoSUM(placeable.getWidth()), list2.get(i19).getValue(), null));
                                                                        width += placeable.getWidth();
                                                                    }
                                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                    long j8 = j7;
                                                                    int i20 = iIntValue2;
                                                                    int i21 = iIntValue;
                                                                    int size5 = listSubcompose2.size();
                                                                    for (int i22 = 0; i22 < size5; i22++) {
                                                                        Placeable placeableMo7239measureBRTryo02 = listSubcompose2.get(i22).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo02, 0, i21 - placeableMo7239measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                    }
                                                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambda3.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                            invoke(composer4, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer4, int i23) {
                                                                            if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                                composer4.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                            }
                                                                            function36.invoke(arrayList3, composer4, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }));
                                                                    int i23 = iIntValue2;
                                                                    int i24 = iIntValue;
                                                                    int size6 = listSubcompose3.size();
                                                                    for (int i25 = 0; i25 < size6; i25++) {
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                    }
                                                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo5010roundToPx0680j_42, arrayList3, i17);
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(obj);
                                                    objRememberedValue3 = obj;
                                                }
                                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composer2, i10 | (i11 & 896) | (i11 & 7168), 114);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f2 = f3;
                                    function23 = function2M5813getLambda7$material3_release;
                                    modifier3 = modifier4;
                                    j3 = j6;
                                    j4 = j5;
                                }
                                function2M5813getLambda7$material3_release = function2;
                                long j52 = primaryContentColor;
                                final float f32 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                Modifier modifier42 = modifier2;
                                long j62 = primaryContainerColor;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2M5813getLambda7$material3_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function332 = function32;
                                int i102 = ((i4 >> 6) & 14) | 12582912;
                                int i112 = i4 >> 3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m5967SurfaceT9BRK9s(modifier42, null, j62, j52, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                            }
                                            Object objRememberedValue = composer3.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            Modifier modifierClipToBounds = Clip.clipToBounds(SelectableGroup.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            boolean zChanged2 = composer3.changed(f32) | composer3.changed(function22) | composer3.changed(function242) | composer3.changed(function332) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                            final float f4 = f32;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                            final int i13 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function332;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m5997invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m5997invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                        int iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(f4);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        Integer numValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = numValueOf.intValue();
                                                        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j7, iMo5010roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C2002Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
                                                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(subcomposeMeasureScope.mo5013toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo7239measureBRTryo0.getHeight()), placeableMo7239measureBRTryo0.getWidth())) - C2002Dp.m7995constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo7239measureBRTryo0);
                                                            arrayList2.add(C2002Dp.m7993boximpl(fM7995constructorimpl));
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(iMo5010roundToPx0680j_42 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf2.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i13;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int i18 = iMo5010roundToPx0680j_42;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C2002Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                int width = i18;
                                                                for (int i19 = 0; i19 < size4; i19++) {
                                                                    Placeable placeable = list.get(i19);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo5013toDpu2uoSUM(width), subcomposeMeasureScope2.mo5013toDpu2uoSUM(placeable.getWidth()), list2.get(i19).getValue(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j8 = j7;
                                                                int i20 = iIntValue2;
                                                                int i21 = iIntValue;
                                                                int size5 = listSubcompose2.size();
                                                                for (int i22 = 0; i22 < size5; i22++) {
                                                                    Placeable placeableMo7239measureBRTryo02 = listSubcompose2.get(i22).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo02, 0, i21 - placeableMo7239measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambda3.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        invoke(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer4, int i23) {
                                                                        if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                            composer4.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                        }
                                                                        function36.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i23 = iIntValue2;
                                                                int i24 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i25 = 0; i25 < size6; i25++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo5010roundToPx0680j_42, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(obj);
                                                objRememberedValue3 = obj;
                                            }
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, i102 | (i112 & 896) | (i112 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f32;
                                function23 = function2M5813getLambda7$material3_release;
                                modifier3 = modifier42;
                                j3 = j62;
                                j4 = j52;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                j3 = primaryContainerColor;
                                j4 = primaryContentColor;
                                f2 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                function23 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$2
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

                                    public final void invoke(Composer composer3, int i12) {
                                        TabRowKt.m5992ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function3, modifier3, j3, j4, f2, function23, function22, scrollState, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        if ((i4 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0) {
                                if (i5 != 0) {
                                }
                                if ((i3 & 8) != 0) {
                                }
                                if ((i3 & 16) != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                    function2M5813getLambda7$material3_release = function2;
                                }
                                long j522 = primaryContentColor;
                                final float f322 = fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                Modifier modifier422 = modifier2;
                                long j622 = primaryContainerColor;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function2422 = function2M5813getLambda7$material3_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3322 = function32;
                                int i1022 = ((i4 >> 6) & 14) | 12582912;
                                int i1122 = i4 >> 3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m5967SurfaceT9BRK9s(modifier422, null, j622, j522, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                            }
                                            Object objRememberedValue = composer3.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            Modifier modifierClipToBounds = Clip.clipToBounds(SelectableGroup.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            boolean zChanged2 = composer3.changed(f322) | composer3.changed(function22) | composer3.changed(function2422) | composer3.changed(function3322) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                            final float f4 = f322;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                            final int i13 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function3322;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m5997invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m5997invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                        int iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(f4);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        Integer numValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = numValueOf.intValue();
                                                        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j7, iMo5010roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C2002Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
                                                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(subcomposeMeasureScope.mo5013toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo7239measureBRTryo0.getHeight()), placeableMo7239measureBRTryo0.getWidth())) - C2002Dp.m7995constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo7239measureBRTryo0);
                                                            arrayList2.add(C2002Dp.m7993boximpl(fM7995constructorimpl));
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(iMo5010roundToPx0680j_42 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf2.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i13;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int i18 = iMo5010roundToPx0680j_42;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C2002Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                int width = i18;
                                                                for (int i19 = 0; i19 < size4; i19++) {
                                                                    Placeable placeable = list.get(i19);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo5013toDpu2uoSUM(width), subcomposeMeasureScope2.mo5013toDpu2uoSUM(placeable.getWidth()), list2.get(i19).getValue(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j8 = j7;
                                                                int i20 = iIntValue2;
                                                                int i21 = iIntValue;
                                                                int size5 = listSubcompose2.size();
                                                                for (int i22 = 0; i22 < size5; i22++) {
                                                                    Placeable placeableMo7239measureBRTryo02 = listSubcompose2.get(i22).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo02, 0, i21 - placeableMo7239measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambda3.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        invoke(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer4, int i23) {
                                                                        if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                            composer4.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                        }
                                                                        function36.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i23 = iIntValue2;
                                                                int i24 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i25 = 0; i25 < size6; i25++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo5010roundToPx0680j_42, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(obj);
                                                objRememberedValue3 = obj;
                                            }
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, i1022 | (i1122 & 896) | (i1122 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f322;
                                function23 = function2M5813getLambda7$material3_release;
                                modifier3 = modifier422;
                                j3 = j622;
                                j4 = j522;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function32 = function3;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        fM5989getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
