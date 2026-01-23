package com.robinhood.android.options.history.detail.order;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.hub.CylinderBarConstants;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionOrderDetailFragment$ComposeContent$1$1$5 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    final /* synthetic */ OptionOrderDetailViewState.InfoItem $item;
    final /* synthetic */ OptionOrderDetailViewState $state;
    final /* synthetic */ OptionOrderDetailFragment this$0;

    OptionOrderDetailFragment$ComposeContent$1$1$5(OptionOrderDetailViewState.InfoItem infoItem, OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState) {
        this.$item = infoItem;
        this.this$0 = optionOrderDetailFragment;
        this.$state = optionOrderDetailViewState;
    }

    public final void invoke(LazyGridItemScope item, Composer composer, int i) {
        Modifier modifierAutoLogEvents$default;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2049647078, i, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:194)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
        composer.startReplaceGroup(1679156676);
        if (this.$item.getProfitAndLossTradeItem() == null || this.$item.getAccountNumber() == null) {
            modifierAutoLogEvents$default = companion;
        } else {
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$item) | composer.changedInstance(this.$state);
            final OptionOrderDetailFragment optionOrderDetailFragment = this.this$0;
            final OptionOrderDetailViewState.InfoItem infoItem = this.$item;
            final OptionOrderDetailViewState optionOrderDetailViewState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeContent$1$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOrderDetailFragment$ComposeContent$1$1$5.invoke$lambda$1$lambda$0(optionOrderDetailFragment, infoItem, optionOrderDetailViewState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), null, null, new Component(Component.ComponentType.ROW, "options_pnl_entry_point", null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
        composer.endReplaceGroup();
        Modifier modifierThen = modifierM5143paddingVpY3zN4.then(modifierAutoLogEvents$default);
        OptionOrderDetailViewState.InfoItem infoItem2 = this.$item;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierThen);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String label = infoItem2.getLabel();
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, textS, composer, 817889280, 0, 7546);
        if (infoItem2.getProfitAndLossTradeItem() != null) {
            composer.startReplaceGroup(1177205269);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String value = infoItem2.getValue();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer, 817913856, 0, 15722);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1178181335);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(infoItem2.getValue(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer, 817889280, 0, 15738);
            composer.startReplaceGroup(CylinderBarConstants.TOTAL_ANIMATION_DURATION);
            if (infoItem2.getShowGoldSavingsIcon()) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.GOLD_24), "", bentoTheme.getColors(composer, i2).getIsDay() ? BentoColor.INSTANCE.m21245getDaySolLight0d7_KjU() : BentoColor.INSTANCE.m21344getNightSolLight0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
        invoke(lazyGridItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState.InfoItem infoItem, OptionOrderDetailViewState optionOrderDetailViewState) {
        Navigator.DefaultImpls.createDialogFragment$default(optionOrderDetailFragment.getNavigator(), new PnlTradeDetailDialogFragmentKey(infoItem.getAccountNumber(), infoItem.getProfitAndLossTradeItem(), new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), true, false, optionOrderDetailViewState.getPnlUpdatesEnabled(), 16, null), null, 2, null).show(optionOrderDetailFragment.getChildFragmentManager(), "pnl-detail");
        return Unit.INSTANCE;
    }
}
