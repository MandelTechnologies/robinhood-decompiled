package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SingleLineMiddleEllipsisBentoText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$SingleLineMiddleEllipsisBentoText$1$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class SingleLineMiddleEllipsisBentoText5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Color $color;
    final /* synthetic */ String $layoutText;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ SnapshotState<TextLayoutResult> $textLayoutResultState;

    SingleLineMiddleEllipsisBentoText5(String str, Color color, SnapshotState<TextLayoutResult> snapshotState, TextStyle textStyle) {
        this.$layoutText = str;
        this.$color = color;
        this.$textLayoutResultState = snapshotState;
        this.$style = textStyle;
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
            ComposerKt.traceEventStart(786628604, i, -1, "com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoText.<anonymous>.<anonymous>.<anonymous> (SingleLineMiddleEllipsisBentoText.kt:44)");
        }
        String str = this.$layoutText;
        Color color = this.$color;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$textLayoutResultState);
        final SnapshotState<TextLayoutResult> snapshotState = this.$textLayoutResultState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.SingleLineMiddleEllipsisBentoTextKt$SingleLineMiddleEllipsisBentoText$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SingleLineMiddleEllipsisBentoText5.invoke$lambda$1$lambda$0(snapshotState, (TextLayoutResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(str, null, color, null, null, null, null, 0, false, 1, 0, (Function1) objRememberedValue, 0, this.$style, composer, 805306368, 0, 5626);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }
}
