package com.robinhood.android.equities.taxlots.alert;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsMaximumSelectedLotsAlert.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a[\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"TaxLotsMaximumSelectedLotsAlert", "", "maxNumberOfTaxLots", "", "onDismiss", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TaxLotsSelectionStrategyMaximumSelectedLotsAlert", "proceedQuantity", "", "estGainLoss", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "onProceed", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "(Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsMaximumSelectedLotsAlert {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsMaximumSelectedLotsAlert$lambda$7(int i, Function0 function0, int i2, Composer composer, int i3) {
        TaxLotsMaximumSelectedLotsAlert(i, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsSelectionStrategyMaximumSelectedLotsAlert$lambda$15(String str, String str2, SelectionStrategy selectionStrategy, int i, Function0 function0, Function0 function02, Context context, int i2, int i3, Composer composer, int i4) {
        TaxLotsSelectionStrategyMaximumSelectedLotsAlert(str, str2, selectionStrategy, i, function0, function02, context, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void TaxLotsMaximumSelectedLotsAlert(final int i, final Function0<Unit> onDismiss, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(274269605);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274269605, i3, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlert (TaxLotsMaximumSelectedLotsAlert.kt:23)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsMaximumSelectedLotsAlert.TaxLotsMaximumSelectedLotsAlert$lambda$1$lambda$0(current, userInteractionEventDescriptor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "tax_lots.table.total_lot_limit_reached_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_body, new Object[]{Integer.valueOf(i), Integer.valueOf(i)}, composerStartRestartGroup, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i4 = i3 & 112;
            boolean zChanged = composerStartRestartGroup.changed(function0) | (i4 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsMaximumSelectedLotsAlert.TaxLotsMaximumSelectedLotsAlert$lambda$6$lambda$3$lambda$2(function0, onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(function0) | (i4 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsMaximumSelectedLotsAlert.TaxLotsMaximumSelectedLotsAlert$lambda$6$lambda$5$lambda$4(function0, onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue3, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsMaximumSelectedLotsAlert.TaxLotsMaximumSelectedLotsAlert$lambda$7(i, onDismiss, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsMaximumSelectedLotsAlert$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.ALERT, "tax_lots.table.total_lot_limit_reached_alert.dismiss", null, 4, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsMaximumSelectedLotsAlert$lambda$6$lambda$3$lambda$2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsMaximumSelectedLotsAlert$lambda$6$lambda$5$lambda$4(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLotsSelectionStrategyMaximumSelectedLotsAlert(final String proceedQuantity, final String estGainLoss, final SelectionStrategy selectionStrategy, final int i, final Function0<Unit> onProceed, final Function0<Unit> onDismiss, Context context, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Context context2;
        Context context3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        Composer composer2;
        final Context context4;
        TaxLotsContext tax_lots_context;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(proceedQuantity, "proceedQuantity");
        Intrinsics.checkNotNullParameter(estGainLoss, "estGainLoss");
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        Intrinsics.checkNotNullParameter(onProceed, "onProceed");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1294445080);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(proceedQuantity) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(estGainLoss) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(selectionStrategy.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onProceed) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    context2 = context;
                    i4 |= composerStartRestartGroup.changedInstance(context2) ? 1048576 : 524288;
                }
                if ((599187 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    context4 = context2;
                } else {
                    Context contextCopy$default = null;
                    EquityOrderContext equityOrderContextCopy = null;
                    Context context5 = i6 == 0 ? null : context2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1294445080, i4, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsAlert (TaxLotsMaximumSelectedLotsAlert.kt:80)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    context3 = context5 != null ? userInteractionEventDescriptor.getContext() : context5;
                    EquityOrderContext equity_order_context = context3 == null ? context3.getEquity_order_context() : null;
                    TaxLotsContext taxLotsContext = (equity_order_context != null || (tax_lots_context = equity_order_context.getTax_lots_context()) == null) ? new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null) : tax_lots_context;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Component component = new Component(Component.ComponentType.ALERT, "TAX_LOT_SELECTION_INVALID_METHOD", null, 4, null);
                    if (context3 != null) {
                        if (equity_order_context != null) {
                            equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : TaxLotsContext.copy$default(taxLotsContext, null, null, null, null, 0.0d, 0.0d, 0.0d, UtilsKt.toLoggingStrategy(selectionStrategy), null, 383, null), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                        }
                        contextCopy$default = Context.copy$default(context3, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, contextCopy$default, component, null, 39, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_body_gain_loss_m1, new Object[]{Integer.valueOf(i5), proceedQuantity, estGainLoss}, composerStartRestartGroup, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_primary_button, new Object[]{proceedQuantity}, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (57344 & i4) != 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotsMaximumSelectedLotsAlert.m1952x31e687ec(onProceed);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i7 = i4 & 458752;
                    z2 = i7 != 131072;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotsMaximumSelectedLotsAlert.m1950xb2ef965e(onDismiss);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = i7 != 131072;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotsMaximumSelectedLotsAlert.m1951xdcb8fbe2(onDismiss);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i9 = BentoAlertButton.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i8 | (i9 << 6) | (i9 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    context4 = context5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLotsMaximumSelectedLotsAlert.TaxLotsSelectionStrategyMaximumSelectedLotsAlert$lambda$15(proceedQuantity, estGainLoss, selectionStrategy, i, onProceed, onDismiss, context4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 1572864;
            context2 = context;
            if ((599187 & i4) == 599186) {
                Context contextCopy$default2 = null;
                EquityOrderContext equityOrderContextCopy2 = null;
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (context5 != null) {
                }
                if (context3 == null) {
                }
                if (equity_order_context != null) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Component component2 = new Component(Component.ComponentType.ALERT, "TAX_LOT_SELECTION_INVALID_METHOD", null, 4, null);
                    if (context3 != null) {
                    }
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, contextCopy$default2, component2, null, 39, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        String strStringResource4 = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_title, composerStartRestartGroup, 0);
                        BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_body_gain_loss_m1, new Object[]{Integer.valueOf(i5), proceedQuantity, estGainLoss}, composerStartRestartGroup, 0));
                        String strStringResource22 = StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_maximum_lots_alert_primary_button, new Object[]{proceedQuantity}, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((57344 & i4) != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TaxLotsMaximumSelectedLotsAlert.m1952x31e687ec(onProceed);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource22, (Function0) objRememberedValue);
                            String strStringResource32 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i72 = i4 & 458752;
                            if (i72 != 131072) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TaxLotsMaximumSelectedLotsAlert.m1950xb2ef965e(onDismiss);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoAlertButton bentoAlertButton22 = new BentoAlertButton(strStringResource32, (Function0) objRememberedValue2);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if (i72 != 131072) {
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z3) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TaxLotsMaximumSelectedLotsAlert.m1951xdcb8fbe2(onDismiss);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    Function0 function02 = (Function0) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i82 = BentoAlertDialog2.Body.Text.$stable << 3;
                                    int i92 = BentoAlertButton.$stable;
                                    composer2 = composerStartRestartGroup;
                                    BentoAlertDialog.BentoAlertDialog(strStringResource4, text2, bentoAlertButton3, null, bentoAlertButton22, null, false, null, function02, composer2, i82 | (i92 << 6) | (i92 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    context4 = context5;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        context2 = context;
        if ((599187 & i4) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TaxLotsSelectionStrategyMaximumSelectedLotsAlert$lambda$14$lambda$9$lambda$8 */
    public static final Unit m1952x31e687ec(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TaxLotsSelectionStrategyMaximumSelectedLotsAlert$lambda$14$lambda$11$lambda$10 */
    public static final Unit m1950xb2ef965e(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TaxLotsSelectionStrategyMaximumSelectedLotsAlert$lambda$14$lambda$13$lambda$12 */
    public static final Unit m1951xdcb8fbe2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
