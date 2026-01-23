package com.robinhood.compose.common;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeToDeleteRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlin/Function0;", "", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/compose/common/SwipeToDeleteRowState;", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "dismissState", "onDelete", "SwipeToDeleteRow", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/common/SwipeToDeleteRowState;Landroidx/compose/material3/SwipeToDismissBoxState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "SwipeThreshold", "F", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.SwipeToDeleteRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SwipeToDeleteRow2 {
    private static final float SwipeThreshold = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SwipeToDeleteRow$lambda$1$lambda$0(float f) {
        return f * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToDeleteRow$lambda$5(Function2 function2, Modifier modifier, SwipeToDeleteRowState swipeToDeleteRowState, SwipeToDismissBoxState swipeToDismissBoxState, Function0 function0, int i, int i2, Composer composer, int i3) {
        SwipeToDeleteRow(function2, modifier, swipeToDeleteRowState, swipeToDismissBoxState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDeleteRow(final Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, SwipeToDeleteRowState swipeToDeleteRowState, SwipeToDismissBoxState swipeToDismissBoxState, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SwipeToDeleteRowState swipeToDeleteRowState2;
        int i4;
        Function0<Unit> function02;
        final SwipeToDeleteRowState state;
        int i5;
        SwipeToDismissBoxState swipeToDismissBoxState2;
        Modifier modifier3;
        Function0<Unit> function03;
        boolean z;
        Object objRememberedValue;
        final SwipeToDeleteRowState swipeToDeleteRowState3;
        final SwipeToDismissBoxState swipeToDismissBoxState3;
        final Modifier modifier4;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState = swipeToDismissBoxState;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-659193620);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    swipeToDeleteRowState2 = swipeToDeleteRowState;
                    int i8 = composerStartRestartGroup.changed(swipeToDeleteRowState2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    swipeToDeleteRowState2 = swipeToDeleteRowState;
                }
                i3 |= i8;
            } else {
                swipeToDeleteRowState2 = swipeToDeleteRowState;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) != 0) {
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    if ((i & 4096) == 0 ? composerStartRestartGroup.changed(swipeToDismissBoxStateRememberSwipeToDismissBoxState) : composerStartRestartGroup.changedInstance(swipeToDismissBoxStateRememberSwipeToDismissBoxState)) {
                        i6 = 2048;
                    }
                    i3 |= i6;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            state = SwipeToDeleteRow.INSTANCE.getState(composerStartRestartGroup, 6);
                            i3 &= -897;
                        } else {
                            state = swipeToDeleteRowState2;
                        }
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Float.valueOf(SwipeToDeleteRow2.SwipeToDeleteRow$lambda$1$lambda$0(((Float) obj).floatValue()));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            i3 &= -7169;
                            i5 = 1849434622;
                            swipeToDismissBoxStateRememberSwipeToDismissBoxState = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, null, (Function1) objRememberedValue2, composerStartRestartGroup, 384, 3);
                        } else {
                            i5 = 1849434622;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(i5);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            Function0<Unit> function05 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            swipeToDismissBoxState2 = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                            function03 = function05;
                            modifier3 = modifier5;
                        } else {
                            swipeToDismissBoxState2 = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                            modifier3 = modifier5;
                            function03 = function0;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        state = swipeToDeleteRowState2;
                        swipeToDismissBoxState2 = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                        function03 = function02;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-659193620, i3, -1, "com.robinhood.compose.common.SwipeToDeleteRow (SwipeToDeleteRow.kt:34)");
                    }
                    SwipeToDismissBoxValue currentValue = swipeToDismissBoxState2.getCurrentValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z = ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changedInstance(swipeToDismissBoxState2)) || (i3 & 3072) == 2048) | ((57344 & i3) == 16384);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SwipeToDeleteRow3(swipeToDismissBoxState2, function03, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(currentValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxState2, ComposableLambda3.rememberComposableLambda(1556776206, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt.SwipeToDeleteRow.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                            invoke(row5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                            if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1556776206, i9, -1, "com.robinhood.compose.common.SwipeToDeleteRow.<anonymous> (SwipeToDeleteRow.kt:46)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer2, i10).m21452getNegative0d7_KjU(), null, 2, null);
                            SwipeToDeleteRowState swipeToDeleteRowState4 = state;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            String backgroundContentText = swipeToDeleteRowState4.getBackgroundContentText();
                            TextStyle textM = bentoTheme.getTypography(composer2, i10).getTextM();
                            BentoText2.m20747BentoText38GnDrw(backgroundContentText, boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), 0.0f, 1, null), companion2.getCenter()), Color.m6701boximpl(swipeToDeleteRowState4.m21665getBackgroundContentTextColor0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8104);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifier3, false, false, false, ComposableLambda3.rememberComposableLambda(-1520506775, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt.SwipeToDeleteRow.5
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                            invoke(row5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                            if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1520506775, i9, -1, "com.robinhood.compose.common.SwipeToDeleteRow.<anonymous> (SwipeToDeleteRow.kt:65)");
                            }
                            content.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1575984 | SwipeToDismissBoxState.$stable | ((i3 >> 9) & 14) | ((i3 << 3) & 896), 48);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    swipeToDeleteRowState3 = state;
                    swipeToDismissBoxState3 = swipeToDismissBoxState2;
                    modifier4 = modifier3;
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    swipeToDismissBoxState3 = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                    modifier4 = modifier2;
                    swipeToDeleteRowState3 = swipeToDeleteRowState2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDeleteRow2.SwipeToDeleteRow$lambda$5(content, modifier4, swipeToDeleteRowState3, swipeToDismissBoxState3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SwipeToDismissBoxValue currentValue2 = swipeToDismissBoxState2.getCurrentValue();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                        z = ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changedInstance(swipeToDismissBoxState2)) || (i3 & 3072) == 2048) | ((57344 & i3) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            objRememberedValue = new SwipeToDeleteRow3(swipeToDismissBoxState2, function03, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(currentValue2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                            SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxState2, ComposableLambda3.rememberComposableLambda(1556776206, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt.SwipeToDeleteRow.4
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                    invoke(row5, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i9) {
                                    Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                                    if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1556776206, i9, -1, "com.robinhood.compose.common.SwipeToDeleteRow.<anonymous> (SwipeToDeleteRow.kt:46)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer2, i10).m21452getNegative0d7_KjU(), null, 2, null);
                                    SwipeToDeleteRowState swipeToDeleteRowState4 = state;
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    String backgroundContentText = swipeToDeleteRowState4.getBackgroundContentText();
                                    TextStyle textM = bentoTheme.getTypography(composer2, i10).getTextM();
                                    BentoText2.m20747BentoText38GnDrw(backgroundContentText, boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), 0.0f, 1, null), companion2.getCenter()), Color.m6701boximpl(swipeToDeleteRowState4.m21665getBackgroundContentTextColor0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8104);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), modifier3, false, false, false, ComposableLambda3.rememberComposableLambda(-1520506775, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.SwipeToDeleteRowKt.SwipeToDeleteRow.5
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                    invoke(row5, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 SwipeToDismissBox, Composer composer2, int i9) {
                                    Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
                                    if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1520506775, i9, -1, "com.robinhood.compose.common.SwipeToDeleteRow.<anonymous> (SwipeToDeleteRow.kt:65)");
                                    }
                                    content.invoke(composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1575984 | SwipeToDismissBoxState.$stable | ((i3 >> 9) & 14) | ((i3 << 3) & 896), 48);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            swipeToDeleteRowState3 = state;
                            swipeToDismissBoxState3 = swipeToDismissBoxState2;
                            modifier4 = modifier3;
                            function04 = function03;
                        }
                    } else {
                        z = ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changedInstance(swipeToDismissBoxState2)) || (i3 & 3072) == 2048) | ((57344 & i3) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
