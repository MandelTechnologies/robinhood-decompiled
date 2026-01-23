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
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsNotEnoughShares.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"TaxLotsNotEnoughSharesAlert", "", "symbol", "", "maxShares", "Ljava/math/BigDecimal;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsNotEnoughShares {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsNotEnoughSharesAlert$lambda$7(String str, BigDecimal bigDecimal, Function0 function0, int i, Composer composer, int i2) {
        TaxLotsNotEnoughSharesAlert(str, bigDecimal, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TaxLotsNotEnoughSharesAlert(final String symbol, final BigDecimal maxShares, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(maxShares, "maxShares");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717087792);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(symbol) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(maxShares) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717087792, i2, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesAlert (TaxLotsNotEnoughShares.kt:20)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsNotEnoughShares.TaxLotsNotEnoughSharesAlert$lambda$1$lambda$0(current, userInteractionEventDescriptor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "OVER_ALLOWED_SHARES_ALERT", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
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
            String strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lots_not_enough_shares_dialog_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C14807R.string.tax_lots_not_enough_shares_dialog_body, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(maxShares).toPlainString(), symbol}, composerStartRestartGroup, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 896;
            boolean zChanged = composerStartRestartGroup.changed(function0) | (i3 == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsNotEnoughShares.TaxLotsNotEnoughSharesAlert$lambda$6$lambda$3$lambda$2(function0, onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(function0) | (i3 == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsNotEnoughShares.TaxLotsNotEnoughSharesAlert$lambda$6$lambda$5$lambda$4(function0, onDismiss);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughSharesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsNotEnoughShares.TaxLotsNotEnoughSharesAlert$lambda$7(symbol, maxShares, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsNotEnoughSharesAlert$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.ALERT, "OVER_ALLOWED_SHARES_ALERT.dismiss", null, 4, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsNotEnoughSharesAlert$lambda$6$lambda$3$lambda$2(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsNotEnoughSharesAlert$lambda$6$lambda$5$lambda$4(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
