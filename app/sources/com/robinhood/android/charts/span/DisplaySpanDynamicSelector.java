package com.robinhood.android.charts.span;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DisplaySpanDynamicSelector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u000f\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "spans", "activeSpan", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "spanModifiers", "", "onSpanSelected", "Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton;", "trailingButton", "", "showFadeScrim", "showBlinkingDotOnSpan", "DisplaySpanDynamicSelector", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasBlinkingDot", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "toUnifiedSpan", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lkotlin/jvm/functions/Function3;ZLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/charts/span/UnifiedSpan;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DisplaySpanDynamicSelector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DisplaySpanDynamicSelector$lambda$3$lambda$2(DisplaySpan it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySpanDynamicSelector$lambda$5(ImmutableList immutableList, DisplaySpan displaySpan, Modifier modifier, Function3 function3, Function1 function1, SpanSelectorTrailingButton spanSelectorTrailingButton, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        DisplaySpanDynamicSelector(immutableList, displaySpan, modifier, function3, function1, spanSelectorTrailingButton, z, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySpanDynamicSelector$lambda$1$lambda$0(DisplaySpan it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c7 A[LOOP:0: B:133:0x01c1->B:135:0x01c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[PHI: r14
      0x00a6: PHI (r14v15 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:57:0x00a4, B:67:0x00be, B:66:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplaySpanDynamicSelector(final ImmutableList<? extends DisplaySpan> spans, final DisplaySpan activeSpan, Modifier modifier, Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function3, Function1<? super DisplaySpan, Unit> function1, SpanSelectorTrailingButton spanSelectorTrailingButton, boolean z, Function1<? super DisplaySpan, Boolean> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function32;
        int i4;
        Function1<? super DisplaySpan, Unit> function13;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Function1<? super DisplaySpan, Unit> function14;
        final SpanSelectorTrailingButton spanSelectorTrailingButton2;
        Function1<? super DisplaySpan, Boolean> function15;
        Function1<? super DisplaySpan, Unit> function16;
        final Function1<? super DisplaySpan, Unit> function17;
        Composer composer2;
        final SpanSelectorTrailingButton spanSelectorTrailingButton3;
        final Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function33;
        final Function1<? super DisplaySpan, Boolean> function18;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        Composer composerStartRestartGroup = composer.startRestartGroup(1323533899);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(spans) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(activeSpan.ordinal()) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function32 = function3;
                    int i9 = composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    function32 = function3;
                }
                i3 |= i9;
            } else {
                function32 = function3;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i10 = 196608;
                if (i5 != 0) {
                    i3 |= i10;
                } else if ((196608 & i) == 0) {
                    i10 = (262144 & i) == 0 ? composerStartRestartGroup.changed(spanSelectorTrailingButton) : composerStartRestartGroup.changedInstance(spanSelectorTrailingButton) ? 131072 : 65536;
                    i3 |= i10;
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                    if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                function32 = new Function3<DisplaySpan, Composer, Integer, Modifier.Companion>() { // from class: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt.DisplaySpanDynamicSelector.1
                                    public final Modifier.Companion invoke(DisplaySpan it, Composer composer3, int i11) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        composer3.startReplaceGroup(1845933987);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1845933987, i11, -1, "com.robinhood.android.charts.span.DisplaySpanDynamicSelector.<anonymous> (DisplaySpanDynamicSelector.kt:15)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return companion;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Modifier.Companion invoke(DisplaySpan displaySpan, Composer composer3, Integer num) {
                                        return invoke(displaySpan, composer3, num.intValue());
                                    }
                                };
                            }
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return DisplaySpanDynamicSelector.DisplaySpanDynamicSelector$lambda$1$lambda$0((DisplaySpan) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function14 = (Function1) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function14 = function13;
                            }
                            spanSelectorTrailingButton2 = i5 == 0 ? null : spanSelectorTrailingButton;
                            if (i6 != 0) {
                                z2 = true;
                            }
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Boolean.valueOf(DisplaySpanDynamicSelector.DisplaySpanDynamicSelector$lambda$3$lambda$2((DisplaySpan) obj));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                function15 = (Function1) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function15 = function12;
                            }
                            function16 = function14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            spanSelectorTrailingButton2 = spanSelectorTrailingButton;
                            function15 = function12;
                            function16 = function13;
                        }
                        boolean z4 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1323533899, i3, -1, "com.robinhood.android.charts.span.DisplaySpanDynamicSelector (DisplaySpanDynamicSelector.kt:20)");
                        }
                        composerStartRestartGroup.startReplaceGroup(605776826);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
                        for (DisplaySpan displaySpan : spans) {
                            Composer composer3 = composerStartRestartGroup;
                            Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function34 = function32;
                            arrayList.add(toUnifiedSpan(displaySpan, function34, function15.invoke(displaySpan).booleanValue(), composer3, (i3 >> 6) & 112, 0));
                            composerStartRestartGroup = composer3;
                            function32 = function34;
                        }
                        Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function35 = function32;
                        Composer composer4 = composerStartRestartGroup;
                        composer4.endReplaceGroup();
                        UnifiedSpanSelectorState unifiedSpanSelectorState = new UnifiedSpanSelectorState(extensions2.toImmutableList(arrayList), activeSpan, function16, false, null, z4, 0.0f, 80, null);
                        function17 = function16;
                        composer4.startReplaceGroup(605787530);
                        ComposableLambda composableLambdaRememberComposableLambda = spanSelectorTrailingButton2 == null ? ComposableLambda3.rememberComposableLambda(-298921235, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt.DisplaySpanDynamicSelector.5
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                invoke(row5, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 UnifiedDynamicSpanSelector, Composer composer5, int i11) {
                                Intrinsics.checkNotNullParameter(UnifiedDynamicSpanSelector, "$this$UnifiedDynamicSpanSelector");
                                if ((i11 & 17) == 16 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-298921235, i11, -1, "com.robinhood.android.charts.span.DisplaySpanDynamicSelector.<anonymous> (DisplaySpanDynamicSelector.kt:34)");
                                }
                                UnifiedSpanSelectorKt.UnifiedSpanSelectorTrailingButton(spanSelectorTrailingButton2, null, composer5, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54) : null;
                        composer4.endReplaceGroup();
                        Modifier modifier4 = modifier2;
                        UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState, modifier4, null, null, null, null, composableLambdaRememberComposableLambda, composer4, (i3 >> 3) & 112, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = composer4;
                        spanSelectorTrailingButton3 = spanSelectorTrailingButton2;
                        function33 = function35;
                        function18 = function15;
                        z3 = z4;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function18 = function12;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function33 = function32;
                        function17 = function13;
                        z3 = z2;
                        spanSelectorTrailingButton3 = spanSelectorTrailingButton;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.DisplaySpanDynamicSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DisplaySpanDynamicSelector.DisplaySpanDynamicSelector$lambda$5(spans, activeSpan, modifier3, function33, function17, spanSelectorTrailingButton3, z3, function18, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                z2 = z;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        function16 = function14;
                        boolean z42 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(605776826);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
                        while (r11.hasNext()) {
                        }
                        Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function352 = function32;
                        Composer composer42 = composerStartRestartGroup;
                        composer42.endReplaceGroup();
                        UnifiedSpanSelectorState unifiedSpanSelectorState2 = new UnifiedSpanSelectorState(extensions2.toImmutableList(arrayList2), activeSpan, function16, false, null, z42, 0.0f, 80, null);
                        function17 = function16;
                        composer42.startReplaceGroup(605787530);
                        if (spanSelectorTrailingButton2 == null) {
                        }
                        composer42.endReplaceGroup();
                        Modifier modifier42 = modifier2;
                        UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState2, modifier42, null, null, null, null, composableLambdaRememberComposableLambda, composer42, (i3 >> 3) & 112, 60);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composer42;
                        spanSelectorTrailingButton3 = spanSelectorTrailingButton2;
                        function33 = function352;
                        function18 = function15;
                        z3 = z42;
                        modifier3 = modifier42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 32;
            int i102 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 32;
        int i1022 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final UnifiedSpan<DisplaySpan> toUnifiedSpan(DisplaySpan displaySpan, Function3<? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function3, boolean z, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-755778272);
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-755778272, i, -1, "com.robinhood.android.charts.span.toUnifiedSpan (DisplaySpanDynamicSelector.kt:49)");
        }
        UnifiedSpan<DisplaySpan> unifiedSpan = new UnifiedSpan<>(displaySpan, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(displaySpan), composer, 0), z2, false, ChartDisplaySpanExtensions.getEducationTourId(displaySpan), function3.invoke(displaySpan, composer, Integer.valueOf(i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE)), 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return unifiedSpan;
    }
}
