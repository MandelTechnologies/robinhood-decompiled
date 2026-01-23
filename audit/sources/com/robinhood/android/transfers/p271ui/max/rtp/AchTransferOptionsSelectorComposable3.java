package com.robinhood.android.transfers.p271ui.max.rtp;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AchTransferOptionsSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionsSelectorComposable$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferOptionsSelectorComposable3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AchTransferOptionsSelectorDuxo $duxo;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ AchTransferOptionsSelectorViewState $this_with;

    AchTransferOptionsSelectorComposable3(Modifier modifier, AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState, AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo) {
        this.$modifier = modifier;
        this.$this_with = achTransferOptionsSelectorViewState;
        this.$duxo = achTransferOptionsSelectorDuxo;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo) {
        achTransferOptionsSelectorDuxo.selectOption(AchTransferOption.STANDARD);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo) {
        achTransferOptionsSelectorDuxo.selectOption(AchTransferOption.INSTANT);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176722357, i, -1, "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposable.<anonymous>.<anonymous> (AchTransferOptionsSelectorComposable.kt:63)");
        }
        Modifier modifierTestTag = TestTag3.testTag(this.$modifier, AchTransferOptionsSelectorComposable.AchTransferOptionSelectorTag);
        AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState = this.$this_with;
        final AchTransferOptionsSelectorDuxo achTransferOptionsSelectorDuxo = this.$duxo;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        boolean zIsAchTransferOptionStandardSelected = achTransferOptionsSelectorViewState.isAchTransferOptionStandardSelected();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(achTransferOptionsSelectorDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionsSelectorComposable$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferOptionsSelectorComposable3.invoke$lambda$4$lambda$1$lambda$0(achTransferOptionsSelectorDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        String strStringResource = StringResources_androidKt.stringResource(C30065R.string.ach_transfer_standard_title, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_free, composer, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        AchTransferOptionsSelectorComposable.m19919AchTransferOptionComposableCcamzx0(true, zIsAchTransferOptionStandardSelected, "standard", (Function0) objRememberedValue, strStringResource, jM21425getFg0d7_KjU, null, strStringResource2, SizeKt.wrapContentHeight$default(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), null, false, 3, null), composer, 1573254, 0);
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composer, 6);
        boolean zIsAchTransferOptionInstantEnabled = achTransferOptionsSelectorViewState.isAchTransferOptionInstantEnabled();
        boolean zIsAchTransferOptionInstantSelected = achTransferOptionsSelectorViewState.isAchTransferOptionInstantSelected();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(achTransferOptionsSelectorDuxo);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorComposableKt$AchTransferOptionsSelectorComposable$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferOptionsSelectorComposable3.invoke$lambda$4$lambda$3$lambda$2(achTransferOptionsSelectorDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        String strStringResource3 = StringResources_androidKt.stringResource(C9631R.string.instant_transfers, composer, 0);
        long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.LIGHTNING_12);
        StringResource achTransferOptionInstantSecondaryText = achTransferOptionsSelectorViewState.getAchTransferOptionInstantSecondaryText();
        composer.startReplaceGroup(949604570);
        String string2 = achTransferOptionInstantSecondaryText == null ? null : StringResource2.getString(achTransferOptionInstantSecondaryText, composer, StringResource.$stable);
        composer.endReplaceGroup();
        AchTransferOptionsSelectorComposable.m19919AchTransferOptionComposableCcamzx0(zIsAchTransferOptionInstantEnabled, zIsAchTransferOptionInstantSelected, GoldFeature.INSTANT, function0, strStringResource3, jM21456getPositive0d7_KjU, size12, string2, SizeKt.wrapContentHeight$default(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), null, false, 3, null), composer, (BentoIcon4.Size12.$stable << 18) | 384, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
