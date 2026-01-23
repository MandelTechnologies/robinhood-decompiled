package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextWithTrailingIcon.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$BentoTextWithTrailingIcon$2$1$textPlaceables$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoTextWithTrailingIcon3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
    final /* synthetic */ BentoTextWithTrailingIconState $state;
    final /* synthetic */ SnapshotState<TextLayoutResult> $textLayoutResultState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    BentoTextWithTrailingIcon3(BentoTextWithTrailingIconState bentoTextWithTrailingIconState, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, SnapshotState<TextLayoutResult> snapshotState) {
        this.$state = bentoTextWithTrailingIconState;
        this.$mergedTextStyle = textStyle;
        this.$onTextLayout = function1;
        this.$textLayoutResultState$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-2098773803, i, -1, "com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon.<anonymous>.<anonymous>.<anonymous> (BentoTextWithTrailingIcon.kt:121)");
        }
        String text = this.$state.getText();
        long jM7661getColor0d7_KjU = this.$mergedTextStyle.m7661getColor0d7_KjU();
        FontStyle fontStyleM7663getFontStyle4Lr2A7w = this.$mergedTextStyle.m7663getFontStyle4Lr2A7w();
        FontWeight fontWeight = this.$mergedTextStyle.getFontWeight();
        TextDecoration textDecoration = this.$mergedTextStyle.getTextDecoration();
        int iM7669getTextAligne0LSkKk = this.$mergedTextStyle.m7669getTextAligne0LSkKk();
        int iM21119getOverflowgIe3tQ8 = this.$state.m21119getOverflowgIe3tQ8();
        boolean softWrap = this.$state.getSoftWrap();
        int maxLines = this.$state.getMaxLines();
        int minLines = this.$state.getMinLines();
        Color colorM6701boximpl = Color.m6701boximpl(jM7661getColor0d7_KjU);
        TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7669getTextAligne0LSkKk);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onTextLayout);
        final Function1<TextLayoutResult, Unit> function1 = this.$onTextLayout;
        final SnapshotState<TextLayoutResult> snapshotState = this.$textLayoutResultState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$BentoTextWithTrailingIcon$2$1$textPlaceables$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BentoTextWithTrailingIcon3.invoke$lambda$1$lambda$0(function1, snapshotState, (TextLayoutResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text, null, colorM6701boximpl, fontStyleM7663getFontStyle4Lr2A7w, fontWeight, textDecoration, textAlignM7912boximpl, iM21119getOverflowgIe3tQ8, softWrap, maxLines, minLines, (Function1) objRememberedValue, 0, this.$mergedTextStyle, composer, 0, 0, 4098);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, TextLayoutResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        snapshotState.setValue(result);
        function1.invoke(result);
        return Unit.INSTANCE;
    }
}
