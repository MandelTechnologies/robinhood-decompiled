package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionToolbar$1$2 */
/* loaded from: classes10.dex */
final class C19162x1fcaa93b implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferCustomSelectionCallbacks $callbacks;
    final /* synthetic */ InternalAssetTransferCustomSelectionViewState $viewState;

    C19162x1fcaa93b(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        this.$viewState = internalAssetTransferCustomSelectionViewState;
        this.$callbacks = internalAssetTransferCustomSelectionCallbacks;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2000216715, i, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionToolbar.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:137)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$callbacks);
        final InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState = this.$viewState;
        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionToolbar$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C19162x1fcaa93b.invoke$lambda$1$lambda$0(internalAssetTransferCustomSelectionViewState, internalAssetTransferCustomSelectionCallbacks);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
        InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState2 = this.$viewState;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(internalAssetTransferCustomSelectionViewState2.getAreAllVisibleAssetsSelected() ? C18977R.string.internal_asset_transfer_custom_selection_toolbar_clear_text : C18977R.string.internal_asset_transfer_custom_selection_toolbar_select_all_text, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8184);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        if (internalAssetTransferCustomSelectionViewState.getAreAllVisibleAssetsSelected()) {
            internalAssetTransferCustomSelectionCallbacks.onClearButtonClicked(internalAssetTransferCustomSelectionViewState.isCashVisible(), internalAssetTransferCustomSelectionViewState.getVisibleInstrumentIds());
        } else {
            internalAssetTransferCustomSelectionCallbacks.onSelectAllButtonClicked(internalAssetTransferCustomSelectionViewState.isCashVisible(), internalAssetTransferCustomSelectionViewState.getVisibleInstrumentIds());
        }
        return Unit.INSTANCE;
    }
}
