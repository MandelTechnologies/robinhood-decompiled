package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderSettingsBottomSheet;
import com.robinhood.shared.tradeladder.p398ui.ladder.LadderSettingsBottomSheetData;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderSettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"LadderSettingsBottomSheetComposable", "", "autoSendChecked", "", "autoSendLoading", "hideAutoSendToggle", "onAutoSendChecked", "Lkotlin/Function1;", "stocksAndEtfTitle", "Lcom/robinhood/utils/resource/StringResource;", "onLadderEducationCtaClick", "Lkotlin/Function0;", "onShowNestedBottomSheet", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet;", "onDismiss", "(ZZZLkotlin/jvm/functions/Function1;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TradingSessionSection", "onEquityMarketHoursClicked", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TimeInForceSection", "onEquityTimeInForceClicked", "TradingSessionSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "TimeInForceSectionPreview", "LadderSettingsBottomSheetComposablePreview", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LadderSettingsBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSettingsBottomSheetComposable$lambda$0(boolean z, boolean z2, boolean z3, Function1 function1, StringResource stringResource, Function0 function0, Function1 function12, Function0 function02, int i, Composer composer, int i2) {
        LadderSettingsBottomSheetComposable(z, z2, z3, function1, stringResource, function0, function12, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSettingsBottomSheetComposablePreview$lambda$9(int i, Composer composer, int i2) {
        LadderSettingsBottomSheetComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSection$lambda$6(Function0 function0, int i, Composer composer, int i2) {
        TimeInForceSection(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSectionPreview$lambda$8(int i, Composer composer, int i2) {
        TimeInForceSectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionSection$lambda$3(Function0 function0, int i, Composer composer, int i2) {
        TradingSessionSection(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionSectionPreview$lambda$7(int i, Composer composer, int i2) {
        TradingSessionSectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LadderSettingsBottomSheetComposable(final boolean z, final boolean z2, final boolean z3, final Function1<? super Boolean, Unit> onAutoSendChecked, final StringResource stocksAndEtfTitle, final Function0<Unit> onLadderEducationCtaClick, final Function1<? super LadderScreenState.BottomSheet.NestedSettingsBottomSheet, Unit> onShowNestedBottomSheet, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAutoSendChecked, "onAutoSendChecked");
        Intrinsics.checkNotNullParameter(stocksAndEtfTitle, "stocksAndEtfTitle");
        Intrinsics.checkNotNullParameter(onLadderEducationCtaClick, "onLadderEducationCtaClick");
        Intrinsics.checkNotNullParameter(onShowNestedBottomSheet, "onShowNestedBottomSheet");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199293286);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAutoSendChecked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(stocksAndEtfTitle) : composerStartRestartGroup.changedInstance(stocksAndEtfTitle) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLadderEducationCtaClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowNestedBottomSheet) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199293286, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetComposable (LadderSettingsBottomSheet.kt:42)");
            }
            GenericLadderSettingsBottomSheet.GenericLadderSettingsBottomSheet(new LadderSettingsBottomSheetData(StringResources_androidKt.stringResource(C40888R.string.ladder_settings_label, composerStartRestartGroup, 0), CollectionsKt.listOf((Object[]) new LadderSettingsBottomSheetData.Row[]{new LadderSettingsBottomSheetData.Row(null, CollectionsKt.listOf(ComposableLambda3.rememberComposableLambda(-1003198712, true, new C15989x813b60ee(z3, z, z2, onAutoSendChecked), composerStartRestartGroup, 54))), new LadderSettingsBottomSheetData.Row(StringResources5.getText(stocksAndEtfTitle, composerStartRestartGroup, StringResource.$stable | ((i2 >> 12) & 14)), CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambda3.rememberComposableLambda(-139920734, true, new C15990x813b60ef(onShowNestedBottomSheet), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1092210561, true, new C15991x813b60f0(onShowNestedBottomSheet), composerStartRestartGroup, 54)})), new LadderSettingsBottomSheetData.Row(StringResources_androidKt.stringResource(C15889R.string.equity_trade_ladder_education_label, composerStartRestartGroup, 0), CollectionsKt.listOf(ComposableLambda3.rememberComposableLambda(1084377226, true, new C15992x813b60f1(onLadderEducationCtaClick), composerStartRestartGroup, 54)))}), StringResources_androidKt.stringResource(C40888R.string.ladder_settings_disclaimer, composerStartRestartGroup, 0)), onDismiss, null, composerStartRestartGroup, LadderSettingsBottomSheetData.$stable | ((i2 >> 18) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.LadderSettingsBottomSheetComposable$lambda$0(z, z2, z3, onAutoSendChecked, stocksAndEtfTitle, onLadderEducationCtaClick, onShowNestedBottomSheet, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingSessionSection(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1212576261);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1212576261, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.TradingSessionSection (LadderSettingsBottomSheet.kt:138)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderSettingsBottomSheetKt.TradingSessionSection$lambda$2$lambda$1(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
            ComposableSingletons$LadderSettingsBottomSheetKt composableSingletons$LadderSettingsBottomSheetKt = ComposableSingletons$LadderSettingsBottomSheetKt.INSTANCE;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableSingletons$LadderSettingsBottomSheetKt.m14071getLambda$1597834551$feature_equity_trade_ladder_externalDebug(), null, null, null, composableSingletons$LadderSettingsBottomSheetKt.m14073getLambda$752083899$feature_equity_trade_ladder_externalDebug(), true, false, false, null, composerStartRestartGroup, 14156160, 0, 1850);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.TradingSessionSection$lambda$3(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingSessionSection$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInForceSection(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1417113453);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417113453, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.TimeInForceSection (LadderSettingsBottomSheet.kt:173)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderSettingsBottomSheetKt.TimeInForceSection$lambda$5$lambda$4(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
            ComposableSingletons$LadderSettingsBottomSheetKt composableSingletons$LadderSettingsBottomSheetKt = ComposableSingletons$LadderSettingsBottomSheetKt.INSTANCE;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableSingletons$LadderSettingsBottomSheetKt.getLambda$350305577$feature_equity_trade_ladder_externalDebug(), null, null, null, composableSingletons$LadderSettingsBottomSheetKt.m14070getLambda$1136923347$feature_equity_trade_ladder_externalDebug(), true, false, false, null, composerStartRestartGroup, 14156160, 0, 1850);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.TimeInForceSection$lambda$6(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSection$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void TradingSessionSectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-984791531);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-984791531, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.TradingSessionSectionPreview (LadderSettingsBottomSheet.kt:201)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$LadderSettingsBottomSheetKt.INSTANCE.m14072getLambda$528249868$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.TradingSessionSectionPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TimeInForceSectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(888044925);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888044925, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.TimeInForceSectionPreview (LadderSettingsBottomSheet.kt:213)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$LadderSettingsBottomSheetKt.INSTANCE.getLambda$1516641278$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.TimeInForceSectionPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LadderSettingsBottomSheetComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933892023);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1933892023, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetComposablePreview (LadderSettingsBottomSheet.kt:225)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$LadderSettingsBottomSheetKt.INSTANCE.getLambda$993409512$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSettingsBottomSheetKt.LadderSettingsBottomSheetComposablePreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
