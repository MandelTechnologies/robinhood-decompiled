package com.robinhood.android.advancedorderbottomsheet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposable;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.advancedorderbottomsheet.utils.EquityAdvancedOrderBottomSheetLoggingManager;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderBottomSheetDataRowComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"EquityAdvancedOrderBottomSheetDataRowComposable", "", "state", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;", "sheetState", "Landroidx/compose/material3/SheetState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class EquityAdvancedOrderBottomSheetDataRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderBottomSheetDataRowComposable$lambda$0(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow baseDataRow, Screen screen, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, SheetState sheetState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderBottomSheetDataRowComposable(baseDataRow, screen, equityAdvancedOrderDropdownEditCallbacks, sheetState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderBottomSheetDataRowComposable(final EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow state, final Screen loggingScreen, final EquityAdvancedOrderDropdownEditCallbacks callbacks, final SheetState sheetState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(loggingScreen, "loggingScreen");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-32037370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loggingScreen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-32037370, i3, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposable (EquityAdvancedOrderBottomSheetDataRowComposable.kt:26)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1964577809, true, new C85371(state, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), modifier5, (CoroutineScope) objRememberedValue, sheetState, callbacks, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), loggingScreen), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityAdvancedOrderBottomSheetDataRowComposable.EquityAdvancedOrderBottomSheetDataRowComposable$lambda$0(state, loggingScreen, callbacks, sheetState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1964577809, true, new C85371(state, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), modifier52, (CoroutineScope) objRememberedValue, sheetState, callbacks, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), loggingScreen), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EquityAdvancedOrderBottomSheetDataRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt$EquityAdvancedOrderBottomSheetDataRowComposable$1 */
    static final class C85371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EquityAdvancedOrderDropdownEditCallbacks $callbacks;
        final /* synthetic */ Context $context;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Screen $loggingScreen;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow $state;

        C85371(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow baseDataRow, Context context, Modifier modifier, CoroutineScope coroutineScope, SheetState sheetState, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, EventLogger eventLogger, Screen screen) {
            this.$state = baseDataRow;
            this.$context = context;
            this.$modifier = modifier;
            this.$scope = coroutineScope;
            this.$sheetState = sheetState;
            this.$callbacks = equityAdvancedOrderDropdownEditCallbacks;
            this.$eventLogger = eventLogger;
            this.$loggingScreen = screen;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1964577809, i, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposable.<anonymous> (EquityAdvancedOrderBottomSheetDataRowComposable.kt:31)");
            }
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            StringResource rowPrimaryText = this.$state.getRowPrimaryText();
            Resources resources = this.$context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = rowPrimaryText.getText(resources).toString();
            StringResource rowSecondaryText = this.$state.getRowSecondaryText();
            Resources resources2 = this.$context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String string3 = rowSecondaryText.getText(resources2).toString();
            boolean selected = this.$state.getSelected();
            boolean showDivider = this.$state.getShowDivider();
            boolean enabled = this.$state.getEnabled();
            Modifier modifierTestTag = TestTag3.testTag(this.$modifier, this.$state.getTestTag());
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(this.$scope) | composer.changed(this.$sheetState) | composer.changedInstance(this.$callbacks) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$loggingScreen);
            final EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow baseDataRow = this.$state;
            final CoroutineScope coroutineScope = this.$scope;
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$loggingScreen;
            final SheetState sheetState = this.$sheetState;
            final EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt$EquityAdvancedOrderBottomSheetDataRowComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityAdvancedOrderBottomSheetDataRowComposable.C85371.invoke$lambda$3$lambda$2(baseDataRow, coroutineScope, eventLogger, screen, sheetState, equityAdvancedOrderDropdownEditCallbacks);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue = function0;
            }
            composer.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(modifierTestTag, type2, string2, selected, string3, enabled, null, showDivider, true, false, (Function0) objRememberedValue, composer, 100663344, 0, 576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow baseDataRow, CoroutineScope coroutineScope, EventLogger eventLogger, Screen screen, SheetState sheetState, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks) {
            if (baseDataRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityAdvancedOrderBottomSheetDataRowComposable2(baseDataRow, sheetState, equityAdvancedOrderDropdownEditCallbacks, null), 3, null);
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, EquityAdvancedOrderBottomSheetLoggingManager.INSTANCE.getLoggingIdentifier(((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TradingSessionRow) baseDataRow).getTradingSession()), null, 4, null), null, null, false, 57, null);
            } else if (baseDataRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityAdvancedOrderBottomSheetDataRowComposable3(baseDataRow, sheetState, equityAdvancedOrderDropdownEditCallbacks, null), 3, null);
                String loggingIdentifier = EquityAdvancedOrderBottomSheetLoggingManager.INSTANCE.getLoggingIdentifier(((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow) baseDataRow).getTimeInForce());
                if (loggingIdentifier != null) {
                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, loggingIdentifier, null, 4, null), null, null, false, 57, null);
                }
            } else if (baseDataRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityAdvancedOrderBottomSheetDataRowComposable4(baseDataRow, sheetState, equityAdvancedOrderDropdownEditCallbacks, null), 3, null);
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, EquityAdvancedOrderBottomSheetLoggingManager.INSTANCE.getLoggingIdentifier(((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow) baseDataRow).getAvailableSelectionStrategyOption()), null, 4, null), null, null, false, 57, null);
            }
            return Unit.INSTANCE;
        }
    }
}
