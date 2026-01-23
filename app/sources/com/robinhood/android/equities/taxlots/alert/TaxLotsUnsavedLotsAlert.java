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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsUnsavedLotsAlert.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"TaxLotsUnsavedLotsAlert", "", "m1Enabled", "", "closeScreen", "Lkotlin/Function0;", "goBack", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsUnsavedLotsAlert {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsUnsavedLotsAlert$lambda$9(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        TaxLotsUnsavedLotsAlert(z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TaxLotsUnsavedLotsAlert(final boolean z, final Function0<Unit> closeScreen, final Function0<Unit> goBack, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(closeScreen, "closeScreen");
        Intrinsics.checkNotNullParameter(goBack, "goBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1402107510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(closeScreen) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(goBack) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1402107510, i2, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlert (TaxLotsUnsavedLotsAlert.kt:23)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert$lambda$1$lambda$0(current, userInteractionEventDescriptor, (UserInteractionEventData.Action) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function2 function2 = (Function2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "tax_lots.table.dismiss_without_saving_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
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
            String strStringResource = StringResources_androidKt.stringResource(z ? C14807R.string.tax_lots_unsaved_alert_title_m1 : C14807R.string.tax_lots_unsaved_alert_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(z ? C14807R.string.tax_lots_unsaved_alert_body_m1 : C14807R.string.tax_lots_unsaved_alert_body, composerStartRestartGroup, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(z ? C14807R.string.tax_lots_unsaved_alert_button_primary_m1 : C14807R.string.tax_lots_unsaved_alert_button_primary, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(function2) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert$lambda$8$lambda$3$lambda$2(function2, closeScreen);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2);
            String strStringResource3 = StringResources_androidKt.stringResource(z ? C14807R.string.tax_lots_unsaved_alert_button_secondary_m1 : C14807R.string.tax_lots_unsaved_alert_button_secondary, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 896;
            boolean zChanged2 = composerStartRestartGroup.changed(function2) | (i3 == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert$lambda$8$lambda$5$lambda$4(function2, goBack);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged3 = composerStartRestartGroup.changed(function2) | (i3 == 256);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert$lambda$8$lambda$7$lambda$6(function2, goBack);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlertKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert$lambda$9(z, closeScreen, goBack, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsUnsavedLotsAlert$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventData.Action action, String identifier) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, new Component(Component.ComponentType.ALERT, "tax_lots.table.dismiss_without_saving_alert." + identifier, null, 4, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsUnsavedLotsAlert$lambda$8$lambda$3$lambda$2(Function2 function2, Function0 function0) {
        function2.invoke(UserInteractionEventData.Action.PRIMARY_CTA, InstantRetirementSplashScreen.PrimaryButtonTag);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsUnsavedLotsAlert$lambda$8$lambda$5$lambda$4(Function2 function2, Function0 function0) {
        function2.invoke(UserInteractionEventData.Action.SECONDARY_CTA, InstantRetirementSplashScreen.SecondaryButtonTag);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsUnsavedLotsAlert$lambda$8$lambda$7$lambda$6(Function2 function2, Function0 function0) {
        function2.invoke(UserInteractionEventData.Action.DISMISS, "dismiss");
        function0.invoke();
        return Unit.INSTANCE;
    }
}
