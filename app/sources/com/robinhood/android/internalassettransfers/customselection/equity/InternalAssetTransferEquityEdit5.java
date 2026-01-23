package com.robinhood.android.internalassettransfers.customselection.equity;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferEquityEdit.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferEquityEdit5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ InternalAssetTransferEquityEditViewState $viewState;

    InternalAssetTransferEquityEdit5(InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, FocusRequester focusRequester) {
        this.$viewState = internalAssetTransferEquityEditViewState;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(212723142, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.EquityEditMainContent.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:201)");
        }
        boolean zIsUserCurrentlyEditing = this.$viewState.isUserCurrentlyEditing();
        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(Modifier.INSTANCE, this.$focusRequester);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744442, null);
        String inputDisplayString = this.$viewState.getInputDisplayString();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InternalAssetTransferEquityEdit5.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState = this.$viewState;
        BasicTextFieldKt.BasicTextField(inputDisplayString, (Function1<? super String, Unit>) objRememberedValue, modifierFocusRequester, false, zIsUserCurrentlyEditing, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1916039299, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$1$3.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer2.changedInstance(innerTextField) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1916039299, i4, -1, "com.robinhood.android.internalassettransfers.customselection.equity.EquityEditMainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:215)");
                }
                if (internalAssetTransferEquityEditViewState.getInputDisplayString().length() == 0) {
                    composer2.startReplaceGroup(611500024);
                    BentoText2.m20747BentoText38GnDrw("0", null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16378);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(611761695);
                    innerTextField.invoke(composer2, Integer.valueOf(i4 & 14));
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 100663344, 196608, 32456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
