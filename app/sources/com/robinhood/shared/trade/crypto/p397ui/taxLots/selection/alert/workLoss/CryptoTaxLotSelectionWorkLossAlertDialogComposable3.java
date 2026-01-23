package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.alert.workLoss;

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
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionWorkLossAlertDialogComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"CryptoTaxLotSelectionWorkLossAlertDialogComposable", "", "onLeaveScreen", "Lkotlin/Function0;", "onStayOnScreen", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "COMPONENT_HIERARCHY", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "CryptoFeeOrderSubmissionFailedAlertDialogComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionWorkLossAlertDialogComposable3 {
    private static final ComponentHierarchy COMPONENT_HIERARCHY = new ComponentHierarchy(new Component(Component.ComponentType.ALERT, "work_loss", null, 4, null), null, null, null, null, 30, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoFeeOrderSubmissionFailedAlertDialogComposablePreview$lambda$4 */
    public static final Unit m2924x3ea8cef2(int i, Composer composer, int i2) {
        CryptoFeeOrderSubmissionFailedAlertDialogComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionWorkLossAlertDialogComposable$lambda$3(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotSelectionWorkLossAlertDialogComposable(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotSelectionWorkLossAlertDialogComposable(final Function0<Unit> onLeaveScreen, final Function0<Unit> onStayOnScreen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLeaveScreen, "onLeaveScreen");
        Intrinsics.checkNotNullParameter(onStayOnScreen, "onStayOnScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(324607949);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onLeaveScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStayOnScreen) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324607949, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposable (CryptoTaxLotSelectionWorkLossAlertDialogComposable.kt:22)");
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
                String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_title, composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_subtitle, composerStartRestartGroup, 0));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Component component = new Component(componentType, "leave_screen", null, 4, null);
                ComponentHierarchy componentHierarchy = COMPONENT_HIERARCHY;
                BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_leave_screen_cta, composerStartRestartGroup, 0), onLeaveScreen, ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, component, componentHierarchy, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.f6293x80f11d4a, composerStartRestartGroup, 0), onStayOnScreen, ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "stay_on_screen", null, 4, null), componentHierarchy, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
                int i6 = BentoAlertButton.$stable;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier5;
                BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i5 | (i6 << 6) | (i6 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotSelectionWorkLossAlertDialogComposable3.CryptoTaxLotSelectionWorkLossAlertDialogComposable$lambda$3(onLeaveScreen, onStayOnScreen, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
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
                String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_title, composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                BentoAlertDialog2.Body.MarkdownText markdownText2 = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_subtitle, composerStartRestartGroup, 0));
                Modifier.Companion companion22 = Modifier.INSTANCE;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                Component component2 = new Component(componentType2, "leave_screen", null, 4, null);
                ComponentHierarchy componentHierarchy2 = COMPONENT_HIERARCHY;
                BentoAlertButton bentoAlertButton3 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_selection_work_loss_alert_dialog_leave_screen_cta, composerStartRestartGroup, 0), onLeaveScreen, ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, component2, componentHierarchy2, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                BentoAlertButton bentoAlertButton22 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.f6293x80f11d4a, composerStartRestartGroup, 0), onStayOnScreen, ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType2, "stay_on_screen", null, 4, null), componentHierarchy2, 15, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
                int i62 = BentoAlertButton.$stable;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier52;
                BentoAlertDialog.BentoAlertDialog(strStringResource2, markdownText2, bentoAlertButton3, null, bentoAlertButton22, null, false, null, function02, composer2, i52 | (i62 << 6) | (i62 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CryptoFeeOrderSubmissionFailedAlertDialogComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1855017923);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855017923, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoFeeOrderSubmissionFailedAlertDialogComposablePreview (CryptoTaxLotSelectionWorkLossAlertDialogComposable.kt:72)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoTaxLotSelectionWorkLossAlertDialogComposable.INSTANCE.m26033getLambda$424654859$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionWorkLossAlertDialogComposable3.m2924x3ea8cef2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
