package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.UkRowItem;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.UkTransferReviewFxRows;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferReviewScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"TransferReviewScreen", "", "continueButtonOnClick", "Lkotlin/Function0;", "accountSelectorOnClick", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;", "onLabelClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.TransferReviewScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferReviewScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferReviewScreen$lambda$2(Function0 function0, Function0 function02, TransferReviewScreenData transferReviewScreenData, Function0 function03, int i, Composer composer, int i2) {
        TransferReviewScreen(function0, function02, transferReviewScreenData, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TransferReviewScreen(final Function0<Unit> continueButtonOnClick, final Function0<Unit> accountSelectorOnClick, final TransferReviewScreenData data, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer composer2;
        BentoTheme bentoTheme;
        Intrinsics.checkNotNullParameter(continueButtonOnClick, "continueButtonOnClick");
        Intrinsics.checkNotNullParameter(accountSelectorOnClick, "accountSelectorOnClick");
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1514428568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(continueButtonOnClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountSelectorOnClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(data) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1514428568, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.TransferReviewScreen (TransferReviewScreen.kt:43)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            boolean accountChangeButtonEnabled = data.getAccountChangeButtonEnabled();
            StringResource accountRowHeaderText = data.getAccountRowHeaderText();
            int i4 = StringResource.$stable;
            int i5 = i2;
            UkRowItem.ClickableUkRowItem(StringResource2.getString(accountRowHeaderText, composerStartRestartGroup, i4), StringResource2.getString(data.getAccountRowText(), composerStartRestartGroup, i4), PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, "switch_account", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), accountChangeButtonEnabled, accountSelectorOnClick, composerStartRestartGroup, (i2 << 9) & 57344, 0);
            UkTransferReviewFxRows.UkTransferReviewFxRows(data.getExpectedExchangeRate(), data.getExpectedValue(), data.getLastUpdated(), function0, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), composerStartRestartGroup, i4 | (i5 & 7168), 0);
            UIComponent<GenericAction> disclosureText = data.getDisclosureText();
            composerStartRestartGroup.startReplaceGroup(1723857788);
            if (disclosureText == null) {
                companion = companion2;
                composer2 = composerStartRestartGroup;
                bentoTheme = bentoTheme2;
            } else {
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                companion = companion2;
                composer2 = composerStartRestartGroup;
                bentoTheme = bentoTheme2;
                SduiComponent3.SduiComponent(disclosureText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, composer2, 0, 4);
            }
            composer2.endReplaceGroup();
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup = composer2;
            BentoButtonKt.m20586BentoButtonEikTQX8(continueButtonOnClick, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, data.isPrimaryButtonEnabled(), data.isPrimaryButtonLoading(), null, null, null, null, false, null, composerStartRestartGroup, i5 & 14, 0, 8088);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferReviewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferReviewScreen2.TransferReviewScreen$lambda$2(continueButtonOnClick, accountSelectorOnClick, data, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
