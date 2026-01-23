package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
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
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderSettingsBottomSheetKt;
import com.robinhood.android.futures.trade.p147ui.shared.TimeInForceSelectionContent;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: LadderSettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"LadderSettingsBottomSheet", "", "settingsData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "onDismiss", "Lkotlin/Function0;", "onTimeInForceChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "onLadderEducationCtaClick", "onAutoSendChanged", "", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;II)V", "Divider", "(Landroidx/compose/runtime/Composer;I)V", "Label", AnnotatedPrivateKey.LABEL, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LadderSettingsBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider$lambda$1(int i, Composer composer, int i2) {
        Divider(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Label$lambda$2(String str, int i, Composer composer, int i2) {
        Label(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSettingsBottomSheet$lambda$0(FuturesLadderViewState.SettingsBottomSheetData settingsBottomSheetData, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Modifier modifier, SheetState sheetState, int i, int i2, Composer composer, int i3) {
        LadderSettingsBottomSheet(settingsBottomSheetData, function0, function1, function02, function12, modifier, sheetState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderSettingsBottomSheet(final FuturesLadderViewState.SettingsBottomSheetData settingsData, final Function0<Unit> onDismiss, final Function1<? super FuturesTimeInForce, Unit> onTimeInForceChanged, final Function0<Unit> onLadderEducationCtaClick, final Function1<? super Boolean, Unit> onAutoSendChanged, Modifier modifier, SheetState sheetState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SheetState sheetStateRememberModalBottomSheetState;
        Modifier modifier3;
        final Modifier modifier4;
        final SheetState sheetState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onTimeInForceChanged, "onTimeInForceChanged");
        Intrinsics.checkNotNullParameter(onLadderEducationCtaClick, "onLadderEducationCtaClick");
        Intrinsics.checkNotNullParameter(onAutoSendChanged, "onAutoSendChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-728371546);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(settingsData) : composerStartRestartGroup.changedInstance(settingsData) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onTimeInForceChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLadderEducationCtaClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAutoSendChanged) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState;
                    int i5 = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) ? 1048576 : 524288;
                    i3 |= i5;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                i3 |= i5;
            } else {
                sheetStateRememberModalBottomSheetState = sheetState;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-728371546, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheet (LadderSettingsBottomSheet.kt:43)");
                }
                Modifier modifier5 = modifier3;
                SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier5, false, sheetState3, null, 0L, ComposableLambda3.rememberComposableLambda(79450157, true, new C175691(settingsData, onAutoSendChanged, onTimeInForceChanged, onDismiss, onLadderEducationCtaClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 1572864 | ((i3 >> 12) & 112) | ((i3 >> 9) & 7168), 52);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                sheetState2 = sheetState3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                sheetState2 = sheetStateRememberModalBottomSheetState;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderSettingsBottomSheetKt.LadderSettingsBottomSheet$lambda$0(settingsData, onDismiss, onTimeInForceChanged, onLadderEducationCtaClick, onAutoSendChanged, modifier4, sheetState2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i & 1572864) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier52, false, sheetState32, null, 0L, ComposableLambda3.rememberComposableLambda(79450157, true, new C175691(settingsData, onAutoSendChanged, onTimeInForceChanged, onDismiss, onLadderEducationCtaClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 1572864 | ((i3 >> 12) & 112) | ((i3 >> 9) & 7168), 52);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                sheetState2 = sheetState32;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: LadderSettingsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$LadderSettingsBottomSheet$1 */
    static final class C175691 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $onAutoSendChanged;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function0<Unit> $onLadderEducationCtaClick;
        final /* synthetic */ Function1<FuturesTimeInForce, Unit> $onTimeInForceChanged;
        final /* synthetic */ FuturesLadderViewState.SettingsBottomSheetData $settingsData;

        /* JADX WARN: Multi-variable type inference failed */
        C175691(FuturesLadderViewState.SettingsBottomSheetData settingsBottomSheetData, Function1<? super Boolean, Unit> function1, Function1<? super FuturesTimeInForce, Unit> function12, Function0<Unit> function0, Function0<Unit> function02) {
            this.$settingsData = settingsBottomSheetData;
            this.$onAutoSendChanged = function1;
            this.$onTimeInForceChanged = function12;
            this.$onDismiss = function0;
            this.$onLadderEducationCtaClick = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x038c  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            final RhModalBottomSheet5 rhModalBottomSheet5;
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
                ComposerKt.traceEventStart(79450157, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheet.<anonymous> (LadderSettingsBottomSheet.kt:49)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null));
            FuturesLadderViewState.SettingsBottomSheetData settingsBottomSheetData = this.$settingsData;
            Function1<Boolean, Unit> function1 = this.$onAutoSendChanged;
            Function1<FuturesTimeInForce, Unit> function12 = this.$onTimeInForceChanged;
            final Function0<Unit> function0 = this.$onDismiss;
            final Function0<Unit> function02 = this.$onLadderEducationCtaClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSystemBarsPadding);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_settings_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
            LadderSettingsBottomSheetKt.Label(StringResources_androidKt.stringResource(C17462R.string.futures_settings_advanced_trading_label, composer, 0), composer, 0);
            String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_settings_autosend_toggle_label, composer, 0);
            BentoToggleRowState.Text.Plain plain = new BentoToggleRowState.Text.Plain(StringResources_androidKt.stringResource(C17462R.string.futures_settings_autosend_toggle_desc, composer, 0));
            Boolean autoSend = settingsBottomSheetData.getAutoSend();
            BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, strStringResource, plain, false, autoSend != null ? autoSend.booleanValue() : false, null, null, settingsBottomSheetData.getAutoSend() == null, false, false, 361, null), function1, null, composer, BentoToggleRowState.$stable, 4);
            LadderSettingsBottomSheetKt.Divider(composer, 0);
            LadderSettingsBottomSheetKt.Label(StringResources_androidKt.stringResource(C17462R.string.futures_trade_time_in_force_label, composer, 0), composer, 0);
            FuturesTimeInForce timeInForce = settingsBottomSheetData.getTimeInForce();
            StringResource gfdDesc = settingsBottomSheetData.getGfdDesc();
            composer.startReplaceGroup(-2048915072);
            String text = gfdDesc == null ? null : StringResources4.getText(gfdDesc, composer, StringResource.$stable);
            composer.endReplaceGroup();
            TimeInForceSelectionContent.TimeInForceSelectionContent(timeInForce, text, function12, null, false, composer, 24576, 8);
            LadderSettingsBottomSheetKt.Divider(composer, 0);
            LadderSettingsBottomSheetKt.Label(StringResources_androidKt.stringResource(C17462R.string.futures_trade_education_label, composer, 0), composer, 0);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_trade_ladder_education_description, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8186);
            String strStringResource2 = StringResources_androidKt.stringResource(C17462R.string.futures_trade_ladder_education_open_link_cta, composer, 0);
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
            Modifier modifierAlign = boxScopeInstance.align(companion2, companion.getCenterEnd());
            composer.startReplaceGroup(-1746271574);
            int i5 = i4 & 14;
            boolean zChanged2 = composer.changed(function02) | (i5 == 4 || ((i4 & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$LadderSettingsBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderSettingsBottomSheetKt.C175691.invoke$lambda$5$lambda$2$lambda$1$lambda$0(function02, RhModalBottomSheet, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource2, ClickableKt.m4893clickableXHw0xAI$default(modifierAlign, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, bold, underline, null, 0, false, 0, 0, null, 0, textM, composer, 221184, 0, 8140);
            composer.endNode();
            composer.startReplaceGroup(-1633490746);
            if (i5 != 4) {
                rhModalBottomSheet5 = RhModalBottomSheet;
                boolean z = (i4 & 8) != 0 && composer.changedInstance(rhModalBottomSheet5);
                zChanged = composer.changed(function0) | z;
                objRememberedValue = composer.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$LadderSettingsBottomSheet$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderSettingsBottomSheetKt.C175691.invoke$lambda$5$lambda$4$lambda$3(rhModalBottomSheet5, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            rhModalBottomSheet5 = RhModalBottomSheet;
            zChanged = composer.changed(function0) | z;
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$LadderSettingsBottomSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderSettingsBottomSheetKt.C175691.invoke$lambda$5$lambda$4$lambda$3(rhModalBottomSheet5, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1$lambda$0(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5, Function0 function02) {
            function0.invoke();
            rhModalBottomSheet5.hideBottomSheet(function02);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Divider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-694880022);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694880022, i, -1, "com.robinhood.android.futures.trade.ui.ladder.Divider (LadderSettingsBottomSheet.kt:127)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), bentoTheme.getColors(composerStartRestartGroup, i2).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.Divider$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Label(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(467444724);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467444724, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.Label (LadderSettingsBottomSheet.kt:140)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i2 & 14) | 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.Label$lambda$2(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
