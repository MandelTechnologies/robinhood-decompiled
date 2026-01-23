package androidx.compose.material;

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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u008b\u0001\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072)\b\u0002\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m3636d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "Lkotlin/Function0;", StatisticsSection2.DIVIDER, "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C2002Dp.m7995constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, Easing3.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5663ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long primarySurface;
        long jM5565contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final long j3;
        final long j4;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fM5661getScrollableTabRowPaddingD9Ej5fM;
        Modifier modifier3;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function2M5577getLambda2$material_release;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473476840);
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
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i9 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primarySurface = j;
                }
                i4 |= i9;
            } else {
                primarySurface = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jM5565contentColorForek8zF_U = j2;
                    int i10 = composerStartRestartGroup.changed(jM5565contentColorForek8zF_U) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    jM5565contentColorForek8zF_U = j2;
                }
                i4 |= i10;
            } else {
                jM5565contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        function32 = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
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
                        if (composerStartRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    primarySurface = Colors2.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jM5565contentColorForek8zF_U = Colors2.m5565contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                fM5661getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m5661getScrollableTabRowPaddingD9Ej5fM() : f2;
                                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda = i6 != 0 ? ComposableLambda3.rememberComposableLambda(-655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
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
                                            ComposerKt.traceEventStart(-655609869, i11, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m5660Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54) : function32;
                                if (i7 != 0) {
                                    function2M5577getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m5577getLambda2$material_release();
                                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function3RememberComposableLambda;
                                    modifier3 = modifier4;
                                    function34 = function35;
                                } else {
                                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function3RememberComposableLambda;
                                    modifier3 = modifier4;
                                    function34 = function36;
                                    function2M5577getLambda2$material_release = function2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                function2M5577getLambda2$material_release = function2;
                                fM5661getScrollableTabRowPaddingD9Ej5fM = f2;
                                function34 = function32;
                                modifier3 = modifier;
                            }
                            long j5 = primarySurface;
                            long j6 = jM5565contentColorForek8zF_U;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1473476840, i4, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)");
                            }
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function34;
                            final float f4 = fM5661getScrollableTabRowPaddingD9Ej5fM;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function2M5577getLambda2$material_release;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m5643SurfaceFjzlyU(modifier3, null, j5, j6, null, 0.0f, ComposableLambda3.rememberComposableLambda(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                    if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1455860572, i11, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
                                    }
                                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                                    boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                    Modifier modifierClipToBounds = Clip.clipToBounds(SelectableGroup.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                    boolean zChanged2 = composer3.changed(f4) | composer3.changed(function22) | composer3.changed(function24) | composer3.changed(function37) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                    final float f5 = f4;
                                    final Function2<Composer, Integer, Unit> function25 = function22;
                                    final Function2<Composer, Integer, Unit> function26 = function24;
                                    final int i12 = i;
                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function38 = function37;
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                        Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m5664invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m5664invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                int iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                final int iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(f5);
                                                long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j7, iMo5010roundToPx0680j_4, 0, 0, 0, 14, null);
                                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                int size = listSubcompose.size();
                                                for (int i13 = 0; i13 < size; i13++) {
                                                    arrayList.add(listSubcompose.get(i13).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                                                }
                                                final Ref.IntRef intRef = new Ref.IntRef();
                                                intRef.element = iMo5010roundToPx0680j_42 * 2;
                                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                                int size2 = arrayList.size();
                                                for (int i14 = 0; i14 < size2; i14++) {
                                                    Placeable placeable = (Placeable) arrayList.get(i14);
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i15 = intRef.element;
                                                int i16 = intRef2.element;
                                                final Function2<Composer, Integer, Unit> function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i17 = i12;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function39 = function38;
                                                return MeasureScope.layout$default(subcomposeMeasureScope, i15, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
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
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        int i18 = iMo5010roundToPx0680j_42;
                                                        List<Placeable> list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        int size3 = list.size();
                                                        int width = i18;
                                                        for (int i19 = 0; i19 < size3; i19++) {
                                                            Placeable placeable2 = list.get(i19);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo5013toDpu2uoSUM(width), subcomposeMeasureScope2.mo5013toDpu2uoSUM(placeable2.getWidth()), null));
                                                            width += placeable2.getWidth();
                                                        }
                                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                        long j8 = j7;
                                                        Ref.IntRef intRef3 = intRef;
                                                        Ref.IntRef intRef4 = intRef2;
                                                        int size4 = listSubcompose2.size();
                                                        for (int i20 = 0; i20 < size4; i20++) {
                                                            Measurable measurable = listSubcompose2.get(i20);
                                                            int i21 = intRef3.element;
                                                            Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j8, i21, i21, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo0, 0, intRef4.element - placeableMo7239measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function310 = function39;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambda3.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
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

                                                            public final void invoke(Composer composer4, int i22) {
                                                                if (!composer4.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-411868839, i22, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                                                                }
                                                                function310.invoke(arrayList2, composer4, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        Ref.IntRef intRef5 = intRef;
                                                        Ref.IntRef intRef6 = intRef2;
                                                        int size5 = listSubcompose3.size();
                                                        for (int i22 = 0; i22 < size5; i22++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i22).mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo5010roundToPx0680j_42, arrayList2, i17);
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
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, ((i4 >> 3) & 14) | 1572864 | (i4 & 896) | (i4 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function33 = function34;
                            function23 = function24;
                            f3 = fM5661getScrollableTabRowPaddingD9Ej5fM;
                            modifier2 = modifier3;
                            j3 = j5;
                            j4 = j6;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            j3 = primarySurface;
                            j4 = jM5565contentColorForek8zF_U;
                            f3 = f2;
                            function33 = function32;
                            function23 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                                    TabRowKt.m5663ScrollableTabRowsKfQg0A(i, modifier2, j3, j4, f3, function33, function23, function22, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if (composerStartRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
