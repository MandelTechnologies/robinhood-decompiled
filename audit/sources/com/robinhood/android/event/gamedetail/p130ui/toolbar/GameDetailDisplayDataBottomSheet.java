package com.robinhood.android.event.gamedetail.p130ui.toolbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.p130ui.toolbar.GameDetailDisplayDataBottomSheet;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GameDetailDisplayDataBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"GameDetailDisplayDataBottomSheet", "", "onAmericanOddsChanged", "Lkotlin/Function1;", "", "onDismiss", "Lkotlin/Function0;", "isAmericanOdds", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailDisplayDataBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailDisplayDataBottomSheet$lambda$0(Function1 function1, Function0 function0, boolean z, Modifier modifier, SheetState sheetState, int i, int i2, Composer composer, int i3) {
        GameDetailDisplayDataBottomSheet(function1, function0, z, modifier, sheetState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailDisplayDataBottomSheet(final Function1<? super Boolean, Unit> onAmericanOddsChanged, final Function0<Unit> onDismiss, final boolean z, Modifier modifier, SheetState sheetState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SheetState sheetState2;
        Modifier modifier3;
        SheetState sheetStateRememberModalBottomSheetState;
        final Modifier modifier4;
        final SheetState sheetState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAmericanOddsChanged, "onAmericanOddsChanged");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-192232010);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onAmericanOddsChanged) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    sheetState2 = sheetState;
                    int i5 = composerStartRestartGroup.changed(sheetState2) ? 16384 : 8192;
                    i3 |= i5;
                } else {
                    sheetState2 = sheetState;
                }
                i3 |= i5;
            } else {
                sheetState2 = sheetState;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                        i3 &= -57345;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-192232010, i3, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheet (GameDetailDisplayDataBottomSheet.kt:35)");
                    }
                    int i6 = i3 >> 3;
                    int i7 = ((i3 >> 6) & 112) | (i6 & 14) | 1572864 | (i6 & 7168);
                    Modifier modifier5 = modifier3;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier5, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-458798339, true, new C164031(onDismiss, z, onAmericanOddsChanged), composerStartRestartGroup, 54), composerStartRestartGroup, i7, 52);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                sheetStateRememberModalBottomSheetState = sheetState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = i3 >> 3;
                int i72 = ((i3 >> 6) & 112) | (i62 & 14) | 1572864 | (i62 & 7168);
                Modifier modifier52 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier52, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-458798339, true, new C164031(onDismiss, z, onAmericanOddsChanged), composerStartRestartGroup, 54), composerStartRestartGroup, i72, 52);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                sheetState3 = sheetStateRememberModalBottomSheetState;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                sheetState3 = sheetState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailDisplayDataBottomSheet.GameDetailDisplayDataBottomSheet$lambda$0(onAmericanOddsChanged, onDismiss, z, modifier4, sheetState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i622 = i3 >> 3;
                int i722 = ((i3 >> 6) & 112) | (i622 & 14) | 1572864 | (i622 & 7168);
                Modifier modifier522 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier522, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-458798339, true, new C164031(onDismiss, z, onAmericanOddsChanged), composerStartRestartGroup, 54), composerStartRestartGroup, i722, 52);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
                sheetState3 = sheetStateRememberModalBottomSheetState;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: GameDetailDisplayDataBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$GameDetailDisplayDataBottomSheet$1 */
    static final class C164031 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ boolean $isAmericanOdds;
        final /* synthetic */ Function1<Boolean, Unit> $onAmericanOddsChanged;
        final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        C164031(Function0<Unit> function0, boolean z, Function1<? super Boolean, Unit> function1) {
            this.$onDismiss = function0;
            this.$isAmericanOdds = z;
            this.$onAmericanOddsChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5, final Function0 function0) {
            rhModalBottomSheet5.hideBottomSheet(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$GameDetailDisplayDataBottomSheet$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GameDetailDisplayDataBottomSheet.C164031.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            final RhModalBottomSheet5 rhModalBottomSheet5;
            boolean z;
            boolean zChanged;
            Object objRememberedValue;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-458798339, i2, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheet.<anonymous> (GameDetailDisplayDataBottomSheet.kt:42)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 5, null);
            final Function0<Unit> function0 = this.$onDismiss;
            final boolean z2 = this.$isAmericanOdds;
            final Function1<Boolean, Unit> function1 = this.$onAmericanOddsChanged;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            int i4 = i2;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16283R.string.display_data_label, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), composer, 6, 1), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1201782475, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$GameDetailDisplayDataBottomSheet$1$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1201782475, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailDisplayDataBottomSheet.kt:68)");
                    }
                    BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C16283R.string.display_data_option_label, composer2, 0), new BentoToggleRowState.Text.Plain(StringResources_androidKt.stringResource(C16283R.string.display_data_option_description, composer2, 0)), false, z2, null, null, false, false, false, 489, null), function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, BentoToggleRowState.$stable | 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 510);
            composer.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2);
            composer.startReplaceGroup(-1633490746);
            if ((i4 & 14) != 4) {
                rhModalBottomSheet5 = RhModalBottomSheet;
                if ((i4 & 8) == 0 || !composer.changedInstance(rhModalBottomSheet5)) {
                    z = false;
                }
                zChanged = composer.changed(function0) | z;
                objRememberedValue = composer.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$GameDetailDisplayDataBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailDisplayDataBottomSheet.C164031.invoke$lambda$4$lambda$3$lambda$2(rhModalBottomSheet5, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            rhModalBottomSheet5 = RhModalBottomSheet;
            z = true;
            zChanged = composer.changed(function0) | z;
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailDisplayDataBottomSheetKt$GameDetailDisplayDataBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailDisplayDataBottomSheet.C164031.invoke$lambda$4$lambda$3$lambda$2(rhModalBottomSheet5, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }
    }
}
