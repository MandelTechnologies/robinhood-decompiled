package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SingleLineMiddleEllipsisBentoText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$SingleLineMiddleEllipsisBentoText$1$1$placeable$1, reason: use source file name */
/* loaded from: classes15.dex */
final class SingleLineMiddleEllipsisBentoText6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Color $color;
    final /* synthetic */ Constraints $constraints;
    final /* synthetic */ String $layoutText;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ String $text;
    final /* synthetic */ TextLayoutResult $textLayoutResult;

    SingleLineMiddleEllipsisBentoText6(Constraints constraints, String str, TextLayoutResult textLayoutResult, Color color, TextStyle textStyle, String str2) {
        this.$constraints = constraints;
        this.$text = str;
        this.$textLayoutResult = textLayoutResult;
        this.$color = color;
        this.$style = textStyle;
        this.$layoutText = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2$lambda$0(int i) {
        return i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2$lambda$1(String str, int i) {
        return StringsKt.getIndices(str).getLast() - i;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-197747360, i, -1, "com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoText.<anonymous>.<anonymous>.<anonymous> (SingleLineMiddleEllipsisBentoText.kt:57)");
        }
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(this.$constraints.getValue());
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(iM7975getMaxWidthimpl) | composer.changed(this.$text) | composer.changed(this.$textLayoutResult);
        final String str = this.$text;
        TextLayoutResult textLayoutResult = this.$textLayoutResult;
        Constraints constraints = this.$constraints;
        String str2 = this.$layoutText;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (str.length() != 0 && textLayoutResult.getBoundingBox(StringsKt.getIndices(str).getLast()).getRight() > Constraints.m7975getMaxWidthimpl(constraints.getValue())) {
                Rect boundingBox = textLayoutResult.getBoundingBox(StringsKt.getLastIndex(str2));
                float fM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(constraints.getValue()) - (boundingBox.getRight() - boundingBox.getLeft());
                SingleLineMiddleEllipsisBentoText singleLineMiddleEllipsisBentoText = new SingleLineMiddleEllipsisBentoText(str, textLayoutResult, new Function1() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$SingleLineMiddleEllipsisBentoText$1$1$placeable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SingleLineMiddleEllipsisBentoText6.invoke$lambda$2$lambda$0(((Integer) obj).intValue()));
                    }
                });
                SingleLineMiddleEllipsisBentoText singleLineMiddleEllipsisBentoText2 = new SingleLineMiddleEllipsisBentoText(str, textLayoutResult, new Function1() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$SingleLineMiddleEllipsisBentoText$1$1$placeable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SingleLineMiddleEllipsisBentoText6.invoke$lambda$2$lambda$1(str, ((Integer) obj).intValue()));
                    }
                });
                while ((fM7975getMaxWidthimpl - singleLineMiddleEllipsisBentoText.getWidth()) - singleLineMiddleEllipsisBentoText2.getWidth() > 0.0f) {
                    float fWidthWithNextChar = singleLineMiddleEllipsisBentoText2.widthWithNextChar();
                    if (singleLineMiddleEllipsisBentoText.getWidth() >= fWidthWithNextChar && (fM7975getMaxWidthimpl - singleLineMiddleEllipsisBentoText.getWidth()) - fWidthWithNextChar >= 0.0f) {
                        singleLineMiddleEllipsisBentoText2.addNextChar();
                    } else if ((fM7975getMaxWidthimpl - singleLineMiddleEllipsisBentoText.widthWithNextChar()) - singleLineMiddleEllipsisBentoText2.getWidth() < 0.0f) {
                        break;
                    } else {
                        singleLineMiddleEllipsisBentoText.addNextChar();
                    }
                }
                str = StringsKt.trimEnd(singleLineMiddleEllipsisBentoText.getString()).toString() + "…" + StringsKt.trimStart(StringsKt.reversed(singleLineMiddleEllipsisBentoText2.getString()).toString()).toString();
            }
            composer.updateRememberedValue(str);
            objRememberedValue = str;
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw((String) objRememberedValue, null, this.$color, null, null, null, null, 0, false, 1, 0, null, 0, this.$style, composer, 805306368, 0, 7674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
