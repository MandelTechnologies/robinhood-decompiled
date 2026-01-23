package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradingButtonsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1, reason: invalid class name */
/* loaded from: classes7.dex */
final class ComposableSingletons$TradingButtonsRowKt$lambda$1637240158$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TradingButtonsRowKt$lambda$1637240158$1 INSTANCE = new ComposableSingletons$TradingButtonsRowKt$lambda$1637240158$1();

    ComposableSingletons$TradingButtonsRowKt$lambda$1637240158$1() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1637240158, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt.lambda$-1637240158.<anonymous> (TradingButtonsRow.kt:161)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        StringResource.Companion companion3 = StringResource.INSTANCE;
        TradeRowState tradeRowState = new TradeRowState(companion3.invoke("5 shares"), false, companion3.invoke("Buy MKT"), true, false, companion3.invoke("Sell MKT"), true, false);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new C10659x38d421a4(null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function2 function2 = (Function2) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new C10660x38d42565(null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        int i2 = TradeRowState.$stable;
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState, quantity, function0, function2, (Function2) objRememberedValue3, null, composer, i2 | 384, 32);
        TradeRowState tradeRowState2 = new TradeRowState(companion3.invoke("5 shares"), false, companion3.invoke("Buy MKT"), true, false, companion3.invoke("Sell MKT"), false, false);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity2 = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion4.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function02 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion4.getEmpty()) {
            objRememberedValue5 = new C10661x38d42ce7(null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function2 function22 = (Function2) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion4.getEmpty()) {
            objRememberedValue6 = new C10662x38d430a8(null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState2, quantity2, function02, function22, (Function2) objRememberedValue6, null, composer, i2 | 384, 32);
        TradeRowState tradeRowState3 = new TradeRowState(companion3.invoke("5 shares"), false, companion3.invoke("Buy MKT"), false, false, companion3.invoke("Sell MKT"), true, false);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity3 = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion4.getEmpty()) {
            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function0 function03 = (Function0) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion4.getEmpty()) {
            objRememberedValue8 = new C10663x38d4382a(null);
            composer.updateRememberedValue(objRememberedValue8);
        }
        Function2 function23 = (Function2) objRememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion4.getEmpty()) {
            objRememberedValue9 = new C10664x38d43beb(null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState3, quantity3, function03, function23, (Function2) objRememberedValue9, null, composer, i2 | 384, 32);
        TradeRowState tradeRowState4 = new TradeRowState(companion3.invoke("5 shares"), false, companion3.invoke("Buy MKT"), false, false, companion3.invoke("Sell MKT"), false, false);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity4 = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion4.getEmpty()) {
            objRememberedValue10 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue10);
        }
        Function0 function04 = (Function0) objRememberedValue10;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion4.getEmpty()) {
            objRememberedValue11 = new C10653xe1afcde8(null);
            composer.updateRememberedValue(objRememberedValue11);
        }
        Function2 function24 = (Function2) objRememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion4.getEmpty()) {
            objRememberedValue12 = new C10654xe1afd1a9(null);
            composer.updateRememberedValue(objRememberedValue12);
        }
        composer.endReplaceGroup();
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState4, quantity4, function04, function24, (Function2) objRememberedValue12, null, composer, i2 | 384, 32);
        TradeRowState tradeRowState5 = new TradeRowState(companion3.invoke("5 shares"), true, companion3.invoke("Buy MKT"), false, false, companion3.invoke("Sell MKT"), false, false);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity5 = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion4.getEmpty()) {
            objRememberedValue13 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue13);
        }
        Function0 function05 = (Function0) objRememberedValue13;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion4.getEmpty()) {
            objRememberedValue14 = new C10655xe1afd92b(null);
            composer.updateRememberedValue(objRememberedValue14);
        }
        Function2 function25 = (Function2) objRememberedValue14;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue15 = composer.rememberedValue();
        if (objRememberedValue15 == companion4.getEmpty()) {
            objRememberedValue15 = new C10656xe1afdcec(null);
            composer.updateRememberedValue(objRememberedValue15);
        }
        composer.endReplaceGroup();
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState5, quantity5, function05, function25, (Function2) objRememberedValue15, null, composer, i2 | 384, 32);
        TradeRowState tradeRowState6 = new TradeRowState(companion3.invoke("5 shares"), false, companion3.invoke("Submit"), true, true, companion3.invoke("Submit"), true, true);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        Quantity quantity6 = new Quantity(ONE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue16 = composer.rememberedValue();
        if (objRememberedValue16 == companion4.getEmpty()) {
            objRememberedValue16 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$TradingButtonsRowKt$lambda$-1637240158$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue16);
        }
        Function0 function06 = (Function0) objRememberedValue16;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue17 = composer.rememberedValue();
        if (objRememberedValue17 == companion4.getEmpty()) {
            objRememberedValue17 = new C10657xe1afe46e(null);
            composer.updateRememberedValue(objRememberedValue17);
        }
        Function2 function26 = (Function2) objRememberedValue17;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue18 = composer.rememberedValue();
        if (objRememberedValue18 == companion4.getEmpty()) {
            objRememberedValue18 = new C10658xe1afe82f(null);
            composer.updateRememberedValue(objRememberedValue18);
        }
        composer.endReplaceGroup();
        TradingButtonsRowKt.TradingButtonsRow(tradeRowState6, quantity6, function06, function26, (Function2) objRememberedValue18, null, composer, i2 | 384, 32);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }
}
