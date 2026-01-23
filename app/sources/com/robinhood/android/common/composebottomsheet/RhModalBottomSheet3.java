package com.robinhood.android.common.composebottomsheet;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSize4;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ah\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "", "showDragHandle", "Landroidx/compose/material3/SheetState;", "sheetState", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "rhModalBottomSheetScope", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "bottomSheetContent", "RhModalBottomSheet-cd68TDI", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SheetState;Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RhModalBottomSheet", "lib-compose-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhModalBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhModalBottomSheet_cd68TDI$lambda$0(Function0 function0, Modifier modifier, boolean z, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        m12185RhModalBottomSheetcd68TDI(function0, modifier, z, sheetState, rhModalBottomSheet5, j, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /* renamed from: RhModalBottomSheet-cd68TDI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12185RhModalBottomSheetcd68TDI(final Function0<Unit> onDismissRequest, Modifier modifier, boolean z, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, long j, final Function3<? super RhModalBottomSheet5, ? super Composer, ? super Integer, Unit> bottomSheetContent, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        SheetState sheetStateRememberModalBottomSheetState;
        RhModalBottomSheet5 rhModalBottomSheet52;
        long jM21464getScrimColor0d7_KjU;
        final SheetState sheetState2;
        final boolean z3;
        final long j2;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(bottomSheetContent, "bottomSheetContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-33952954);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sheetStateRememberModalBottomSheetState = sheetState;
                        int i6 = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) ? 2048 : 1024;
                        i3 |= i6;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState;
                    }
                    i3 |= i6;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        int i7 = composerStartRestartGroup.changedInstance(rhModalBottomSheet52) ? 16384 : 8192;
                        i3 |= i7;
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    i3 |= i7;
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM21464getScrimColor0d7_KjU = j;
                        int i8 = composerStartRestartGroup.changed(jM21464getScrimColor0d7_KjU) ? 131072 : 65536;
                        i3 |= i8;
                    } else {
                        jM21464getScrimColor0d7_KjU = j;
                    }
                    i3 |= i8;
                } else {
                    jM21464getScrimColor0d7_KjU = j;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(bottomSheetContent) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        int i9 = i3;
                        final boolean z4 = z2;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        final RhModalBottomSheet5 rhModalBottomSheet54 = rhModalBottomSheet52;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Modifier modifier4 = modifier2;
                        final long j3 = jM21464getScrimColor0d7_KjU;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-2136334872, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2136334872, i10, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous> (RhModalBottomSheet.kt:42)");
                                }
                                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(modifier4, WindowInsetsKt.WindowInsets(0, 0, 0, 0));
                                Function2<Composer, Integer, Unit> lambda$700695524$lib_compose_bottom_sheet_externalDebug = z4 ? RhModalBottomSheet.INSTANCE.getLambda$700695524$lib_compose_bottom_sheet_externalDebug() : null;
                                Shape rectangleShape = RectangleShape2.getRectangleShape();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i11).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU();
                                Function0<Unit> function0 = onDismissRequest;
                                SheetState sheetState3 = sheetState2;
                                long j4 = j3;
                                final Function3<RhModalBottomSheet5, Composer, Integer, Unit> function3 = bottomSheetContent;
                                final RhModalBottomSheet5 rhModalBottomSheet55 = rhModalBottomSheet54;
                                ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function0, modifierWindowInsetsPadding, sheetState3, 0.0f, rectangleShape, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, 0.0f, j4, lambda$700695524$lib_compose_bottom_sheet_externalDebug, null, null, ComposableLambda3.rememberComposableLambda(-1399907861, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                        invoke(column5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i12) {
                                        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                        if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1399907861, i12, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous>.<anonymous> (RhModalBottomSheet.kt:57)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(companion, null, null, 3, null);
                                        Function3<RhModalBottomSheet5, Composer, Integer, Unit> function32 = function3;
                                        RhModalBottomSheet5 rhModalBottomSheet56 = rhModalBottomSheet55;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAnimateContentSize$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function32.invoke(rhModalBottomSheet56, composer3, 0);
                                        composer3.endNode();
                                        Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 24576, 384, 3208);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z4;
                        j2 = j3;
                        rhModalBottomSheet53 = rhModalBottomSheet54;
                        modifier3 = modifier4;
                    } else {
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                        }
                        if ((i2 & 16) != 0) {
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            i3 &= -57345;
                            rhModalBottomSheet52 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState, (CoroutineScope) objRememberedValue, onDismissRequest);
                        }
                        if ((i2 & 32) != 0) {
                            jM21464getScrimColor0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21464getScrimColor0d7_KjU();
                            i3 &= -458753;
                        }
                        int i92 = i3;
                        final boolean z42 = z2;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        final RhModalBottomSheet5 rhModalBottomSheet542 = rhModalBottomSheet52;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-33952954, i92, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet (RhModalBottomSheet.kt:40)");
                        }
                        final Modifier modifier42 = modifier2;
                        final long j32 = jM21464getScrimColor0d7_KjU;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-2136334872, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2136334872, i10, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous> (RhModalBottomSheet.kt:42)");
                                }
                                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(modifier42, WindowInsetsKt.WindowInsets(0, 0, 0, 0));
                                Function2<Composer, Integer, Unit> lambda$700695524$lib_compose_bottom_sheet_externalDebug = z42 ? RhModalBottomSheet.INSTANCE.getLambda$700695524$lib_compose_bottom_sheet_externalDebug() : null;
                                Shape rectangleShape = RectangleShape2.getRectangleShape();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i11).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU();
                                Function0<Unit> function0 = onDismissRequest;
                                SheetState sheetState3 = sheetState2;
                                long j4 = j32;
                                final Function3<? super RhModalBottomSheet5, ? super Composer, ? super Integer, Unit> function3 = bottomSheetContent;
                                final RhModalBottomSheet5 rhModalBottomSheet55 = rhModalBottomSheet542;
                                ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function0, modifierWindowInsetsPadding, sheetState3, 0.0f, rectangleShape, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, 0.0f, j4, lambda$700695524$lib_compose_bottom_sheet_externalDebug, null, null, ComposableLambda3.rememberComposableLambda(-1399907861, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                        invoke(column5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i12) {
                                        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                        if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1399907861, i12, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous>.<anonymous> (RhModalBottomSheet.kt:57)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(companion, null, null, 3, null);
                                        Function3<RhModalBottomSheet5, Composer, Integer, Unit> function32 = function3;
                                        RhModalBottomSheet5 rhModalBottomSheet56 = rhModalBottomSheet55;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAnimateContentSize$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function32.invoke(rhModalBottomSheet56, composer3, 0);
                                        composer3.endNode();
                                        Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 24576, 384, 3208);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z42;
                        j2 = j32;
                        rhModalBottomSheet53 = rhModalBottomSheet542;
                        modifier3 = modifier42;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    sheetState2 = sheetStateRememberModalBottomSheetState;
                    rhModalBottomSheet53 = rhModalBottomSheet52;
                    j2 = jM21464getScrimColor0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhModalBottomSheet3.RhModalBottomSheet_cd68TDI$lambda$0(onDismissRequest, modifier3, z3, sheetState2, rhModalBottomSheet53, j2, bottomSheetContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i5 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    int i922 = i3;
                    final boolean z422 = z2;
                    sheetState2 = sheetStateRememberModalBottomSheetState;
                    final RhModalBottomSheet5 rhModalBottomSheet5422 = rhModalBottomSheet52;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Modifier modifier422 = modifier2;
                    final long j322 = jM21464getScrimColor0d7_KjU;
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-2136334872, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2136334872, i10, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous> (RhModalBottomSheet.kt:42)");
                            }
                            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(modifier422, WindowInsetsKt.WindowInsets(0, 0, 0, 0));
                            Function2<Composer, Integer, Unit> lambda$700695524$lib_compose_bottom_sheet_externalDebug = z422 ? RhModalBottomSheet.INSTANCE.getLambda$700695524$lib_compose_bottom_sheet_externalDebug() : null;
                            Shape rectangleShape = RectangleShape2.getRectangleShape();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i11).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU();
                            Function0<Unit> function0 = onDismissRequest;
                            SheetState sheetState3 = sheetState2;
                            long j4 = j322;
                            final Function3<? super RhModalBottomSheet5, ? super Composer, ? super Integer, Unit> function3 = bottomSheetContent;
                            final RhModalBottomSheet5 rhModalBottomSheet55 = rhModalBottomSheet5422;
                            ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function0, modifierWindowInsetsPadding, sheetState3, 0.0f, rectangleShape, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, 0.0f, j4, lambda$700695524$lib_compose_bottom_sheet_externalDebug, null, null, ComposableLambda3.rememberComposableLambda(-1399907861, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetKt$RhModalBottomSheet$1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i12) {
                                    Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                    if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1399907861, i12, -1, "com.robinhood.android.common.composebottomsheet.RhModalBottomSheet.<anonymous>.<anonymous> (RhModalBottomSheet.kt:57)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(companion, null, null, 3, null);
                                    Function3<RhModalBottomSheet5, Composer, Integer, Unit> function32 = function3;
                                    RhModalBottomSheet5 rhModalBottomSheet56 = rhModalBottomSheet55;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAnimateContentSize$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function32.invoke(rhModalBottomSheet56, composer3, 0);
                                    composer3.endNode();
                                    Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 24576, 384, 3208);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z422;
                    j2 = j322;
                    rhModalBottomSheet53 = rhModalBottomSheet5422;
                    modifier3 = modifier422;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
