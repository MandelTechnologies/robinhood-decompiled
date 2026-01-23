package com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit;

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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotOrderInputLotLimitAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"CryptoTaxLotOrderInputLotLimitAlertDialog", "", "state", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;", "onContinueWithMaxQuantity", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "COMPONENT_HIERARCHY", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputLotLimitAlertDialog {
    private static final ComponentHierarchy COMPONENT_HIERARCHY = new ComponentHierarchy(new Component(Component.ComponentType.ALERT, "tax_lots_lot_limit", null, 4, null), null, null, null, null, 30, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotOrderInputLotLimitAlertDialog$lambda$3(CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotOrderInputLotLimitAlertDialog(cryptoTaxLotOrderInputLotLimitAlertDialogState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotOrderInputLotLimitAlertDialog(final CryptoTaxLotOrderInputLotLimitAlertDialogState state, final Function0<Unit> onContinueWithMaxQuantity, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinueWithMaxQuantity, "onContinueWithMaxQuantity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(2135810105);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueWithMaxQuantity) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2135810105, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialog (CryptoTaxLotOrderInputLotLimitAlertDialog.kt:24)");
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_title, composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_body, new Object[]{Integer.valueOf(state.getMaxLots()), CurrencyDefinitions.formatCurrency$default(state.getAssetCurrency(), state.getMaxQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null)}, composerStartRestartGroup, 0));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Component component = new Component(componentType, "continue", null, 4, null);
                ComponentHierarchy componentHierarchy = COMPONENT_HIERARCHY;
                BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_primary_cta, new Object[]{CurrencyDefinitions.formatCurrency$default(state.getAssetCurrency(), state.getMaxQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null)}, composerStartRestartGroup, 0), onContinueWithMaxQuantity, ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, component, componentHierarchy, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_dismiss_cta, composerStartRestartGroup, 0), onDismiss, ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "dismiss", null, 4, null), componentHierarchy, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                int i6 = BentoAlertButton.$stable;
                composer2 = composerStartRestartGroup;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i5 | (i6 << 6) | (i6 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotOrderInputLotLimitAlertDialog.CryptoTaxLotOrderInputLotLimitAlertDialog$lambda$3(state, onContinueWithMaxQuantity, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_title, composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_body, new Object[]{Integer.valueOf(state.getMaxLots()), CurrencyDefinitions.formatCurrency$default(state.getAssetCurrency(), state.getMaxQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null)}, composerStartRestartGroup, 0));
                Modifier.Companion companion22 = Modifier.INSTANCE;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                Component component2 = new Component(componentType2, "continue", null, 4, null);
                ComponentHierarchy componentHierarchy2 = COMPONENT_HIERARCHY;
                BentoAlertButton bentoAlertButton3 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_primary_cta, new Object[]{CurrencyDefinitions.formatCurrency$default(state.getAssetCurrency(), state.getMaxQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null)}, composerStartRestartGroup, 0), onContinueWithMaxQuantity, ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, component2, componentHierarchy2, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                BentoAlertButton bentoAlertButton22 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_lot_limit_alert_dismiss_cta, composerStartRestartGroup, 0), onDismiss, ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType2, "dismiss", null, 4, null), componentHierarchy2, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                int i62 = BentoAlertButton.$stable;
                composer2 = composerStartRestartGroup;
                BentoAlertDialog.BentoAlertDialog(strStringResource2, text2, bentoAlertButton3, null, bentoAlertButton22, null, false, null, function02, composer2, i52 | (i62 << 6) | (i62 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
