package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WaitlistGoldComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistGoldComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WaitlistGoldComposable {
    public static final WaitlistGoldComposable INSTANCE = new WaitlistGoldComposable();

    /* renamed from: lambda$-1838422672, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8804lambda$1838422672 = ComposableLambda3.composableLambdaInstance(-1838422672, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistGoldComposableKt$lambda$-1838422672$1
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
                ComposerKt.traceEventStart(-1838422672, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistGoldComposableKt.lambda$-1838422672.<anonymous> (WaitlistGoldComposable.kt:129)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1838422672$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12873getLambda$1838422672$feature_credit_card_externalDebug() {
        return f8804lambda$1838422672;
    }
}
