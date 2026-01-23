package com.robinhood.android.directdeposit.p101ui.redirect;

import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RedirectDirectDepositBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt$lambda$874699410$1, reason: use source file name */
/* loaded from: classes27.dex */
final class RedirectDirectDepositBottomSheetComposable3 implements Function2<Composer, Integer, Unit> {
    public static final RedirectDirectDepositBottomSheetComposable3 INSTANCE = new RedirectDirectDepositBottomSheetComposable3();

    RedirectDirectDepositBottomSheetComposable3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874699410, i, -1, "com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt.lambda$874699410.<anonymous> (RedirectDirectDepositBottomSheetComposable.kt:102)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt$lambda$874699410$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RedirectDirectDepositBottomSheetComposable3.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt$lambda$874699410$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        RedirectDirectDepositBottomSheetComposable4.RedirectDirectDepositBottomSheetComposable(companion, "Dec 19", "Dec 19, 2022", function1, (Function0) objRememberedValue2, composer, 28086, 0);
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
