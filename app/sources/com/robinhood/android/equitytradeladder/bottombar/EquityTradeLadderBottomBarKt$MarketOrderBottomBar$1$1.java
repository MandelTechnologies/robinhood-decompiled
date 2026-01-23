package com.robinhood.android.equitytradeladder.bottombar;

import android.content.res.Resources;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButton2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradeLadderBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ float $buttonMinHeight;
    final /* synthetic */ boolean $marketOrderInProgress;
    final /* synthetic */ Function0<Unit> $onQuantitySelectorClick;
    final /* synthetic */ EquityTradeLadderViewState.BottomBarData.MarketOrderData $state;

    EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1(float f, boolean z, Function0<Unit> function0, EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData) {
        this.$buttonMinHeight = f;
        this.$marketOrderInProgress = z;
        this.$onQuantitySelectorClick = function0;
        this.$state = marketOrderData;
    }

    public final void invoke(Row5 GenericTradeRow, Composer composer, int i) throws Resources.NotFoundException {
        int i2;
        String strPluralStringResource;
        long jM21425getFg0d7_KjU;
        Intrinsics.checkNotNullParameter(GenericTradeRow, "$this$GenericTradeRow");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(GenericTradeRow) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-276548813, i2, -1, "com.robinhood.android.equitytradeladder.bottombar.MarketOrderBottomBar.<anonymous>.<anonymous> (EquityTradeLadderBottomBar.kt:158)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(Row5.weight$default(GenericTradeRow, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), this.$buttonMinHeight), C2002Dp.m7995constructorimpl((float) 0.5d), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU(), TradeButton2.getLadderButtonShape()), TradeButton2.getLadderButtonShape());
        boolean z = !this.$marketOrderInProgress;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onQuantitySelectorClick);
        final Function0<Unit> function0 = this.$onQuantitySelectorClick;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, z, null, null, (Function0) objRememberedValue, 6, null);
        EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData = this.$state;
        boolean z2 = this.$marketOrderInProgress;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
        composer.startReplaceGroup(-2115834549);
        BigDecimal quantity = marketOrderData.getQuantity();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100000);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (quantity.compareTo(bigDecimalValueOf) < 0) {
            strPluralStringResource = StringResources_androidKt.pluralStringResource(C11048R.plurals.general_number_of_shares, Intrinsics.areEqual(marketOrderData.getQuantity(), BigDecimal.ONE) ? 1 : marketOrderData.getQuantity().intValue(), new Object[]{Formats.getShareQuantityFormat().format(marketOrderData.getQuantity())}, composer, 0);
        } else {
            strPluralStringResource = Formats.getShareQuantityFormat().format(marketOrderData.getQuantity());
        }
        composer.endReplaceGroup();
        TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
        if (z2) {
            composer.startReplaceGroup(-1165575076);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1165492771);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        BentoText2.m20747BentoText38GnDrw(strPluralStringResource, companion, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, textM, composer, 805330992, 0, 7656);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
