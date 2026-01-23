package com.robinhood.shared.trade.crypto.p397ui.price;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceEvent;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderPriceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CryptoOrderPriceEvent.DialogData $content;
    final /* synthetic */ SnapshotState<CryptoOrderPriceEvent.DialogData> $dialogContent$delegate;
    final /* synthetic */ CryptoOrderPriceDuxo $duxo;

    CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1(CryptoOrderPriceEvent.DialogData dialogData, CryptoOrderPriceDuxo cryptoOrderPriceDuxo, SnapshotState<CryptoOrderPriceEvent.DialogData> snapshotState) {
        this.$content = dialogData;
        this.$duxo = cryptoOrderPriceDuxo;
        this.$dialogContent$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BentoAlertButton bentoAlertButton;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(805722122, i, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:171)");
        }
        StringResource titleText = this.$content.getTitleText();
        int i2 = StringResource.$stable;
        String textAsString = StringResources6.getTextAsString(titleText, composer, i2);
        BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources6.getTextAsString(this.$content.getMessageText(), composer, i2));
        String textAsString2 = StringResources6.getTextAsString(this.$content.getPositiveButtonText(), composer, i2);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$content);
        final CryptoOrderPriceDuxo cryptoOrderPriceDuxo = this.$duxo;
        final CryptoOrderPriceEvent.DialogData dialogData = this.$content;
        final SnapshotState<CryptoOrderPriceEvent.DialogData> snapshotState = this.$dialogContent$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1.invoke$lambda$1$lambda$0(cryptoOrderPriceDuxo, dialogData, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(textAsString2, (Function0) objRememberedValue);
        StringResource negativeButtonText = this.$content.getNegativeButtonText();
        composer.startReplaceGroup(1204867896);
        if (negativeButtonText == null) {
            bentoAlertButton = null;
        } else {
            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo2 = this.$duxo;
            final CryptoOrderPriceEvent.DialogData dialogData2 = this.$content;
            final SnapshotState<CryptoOrderPriceEvent.DialogData> snapshotState2 = this.$dialogContent$delegate;
            String textAsString3 = StringResources6.getTextAsString(negativeButtonText, composer, i2);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(cryptoOrderPriceDuxo2) | composer.changedInstance(dialogData2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1.invoke$lambda$4$lambda$3$lambda$2(cryptoOrderPriceDuxo2, dialogData2, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            bentoAlertButton = new BentoAlertButton(textAsString3, (Function0) objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        Component component = new Component(Component.ComponentType.ALERT, null, null, 6, null);
        CryptoOrderPriceEvent.DialogData dialogDataCryptoOrderPriceComposable$lambda$3 = CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$3(this.$dialogContent$delegate);
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, dialogDataCryptoOrderPriceComposable$lambda$3 != null ? dialogDataCryptoOrderPriceComposable$lambda$3.getAlertTitle() : null, null, null, null, component, null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        composer.startReplaceGroup(5004770);
        final SnapshotState<CryptoOrderPriceEvent.DialogData> snapshotState3 = this.$dialogContent$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1.invoke$lambda$6$lambda$5(snapshotState3);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function0 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        int i3 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
        int i4 = BentoAlertButton.$stable;
        BentoAlertDialog.BentoAlertDialog(textAsString, markdownText, bentoAlertButton2, modifierAutoLogEvents$default, bentoAlertButton, null, false, null, function0, composer, i3 | (i4 << 6) | (i4 << 12), 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceEvent.DialogData dialogData, SnapshotState snapshotState) {
        cryptoOrderPriceDuxo.onDialogPositiveButtonClicked(dialogData.getId());
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceEvent.DialogData dialogData, SnapshotState snapshotState) {
        cryptoOrderPriceDuxo.onDialogNegativeButtonClicked(dialogData.getId());
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
