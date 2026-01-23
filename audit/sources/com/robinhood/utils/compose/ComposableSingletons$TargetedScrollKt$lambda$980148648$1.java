package com.robinhood.utils.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TargetedScroll.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.ComposableSingletons$TargetedScrollKt$lambda$-980148648$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$TargetedScrollKt$lambda$980148648$1 implements Function3<TargetedScrollRowScope<Integer>, Composer, Integer, Unit> {
    public static final ComposableSingletons$TargetedScrollKt$lambda$980148648$1 INSTANCE = new ComposableSingletons$TargetedScrollKt$lambda$980148648$1();

    ComposableSingletons$TargetedScrollKt$lambda$980148648$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(TargetedScrollRowScope<Integer> targetedScrollRowScope, Composer composer, Integer num) {
        invoke(targetedScrollRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final TargetedScrollRowScope<Integer> TargetedScrollRow, Composer composer, int i) {
        int i2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(TargetedScrollRow, "$this$TargetedScrollRow");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changed(TargetedScrollRow) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-980148648, i2, -1, "com.robinhood.utils.compose.ComposableSingletons$TargetedScrollKt.lambda$-980148648.<anonymous> (TargetedScroll.kt:308)");
        }
        final int i3 = 1;
        while (i3 < 26) {
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(TargetedScrollRow.registerAsScrollTarget(Modifier.INSTANCE, Integer.valueOf(i3)), C2002Dp.m7995constructorimpl(10));
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = ((i2 & 14) == 4) | composer2.changed(i3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.utils.compose.ComposableSingletons$TargetedScrollKt$lambda$-980148648$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComposableSingletons$TargetedScrollKt$lambda$980148648$1.invoke$lambda$1$lambda$0(TargetedScrollRow, i3);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null);
            int i4 = i3;
            BasicTextKt.m5334BasicTextRWo7tUw(String.valueOf(i4), modifierM4893clickableXHw0xAI$default, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composer2, 0, 1020);
            i3 = i4 + 1;
            composer2 = composer;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TargetedScrollRowScope targetedScrollRowScope, int i) {
        targetedScrollRowScope.scrollTo(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
