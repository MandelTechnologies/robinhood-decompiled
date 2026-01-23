package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
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
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CryptoQuickTradeAmountInputRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt$lambda$1513065964$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeAmountInputRow3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoQuickTradeAmountInputRow3 INSTANCE = new CryptoQuickTradeAmountInputRow3();

    CryptoQuickTradeAmountInputRow3() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513065964, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt.lambda$1513065964.<anonymous> (CryptoQuickTradeAmountInputRow.kt:301)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntState3.mutableIntStateOf(1);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
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
        CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState = new CryptoQuickTradeAmountInputRowState(StringsKt.repeat("9", snapshotIntState2.getIntValue()), "0.0586 BTC available", new CryptoInputRowCurrencyToggle4.Asset(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue2);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeAmountInputRowKt$lambda$1513065964$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoQuickTradeAmountInputRow3.invoke$lambda$6$lambda$5$lambda$4(snapshotIntState2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(cryptoQuickTradeAmountInputRowState, null, ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, null, false, null, null, (Function0) objRememberedValue3, 28, null), null, composer, 48, 8);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotIntState2 snapshotIntState2) {
        if (snapshotIntState2.getIntValue() > 26) {
            snapshotIntState2.setIntValue(0);
        }
        snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
        return Unit.INSTANCE;
    }
}
