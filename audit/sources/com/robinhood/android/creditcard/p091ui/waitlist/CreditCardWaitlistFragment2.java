package com.robinhood.android.creditcard.p091ui.waitlist;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.ComposableSingletons$CreditCardWaitlistFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CreditCardWaitlistFragment2 {
    public static final CreditCardWaitlistFragment2 INSTANCE = new CreditCardWaitlistFragment2();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$559476698 = ComposableLambda3.composableLambdaInstance(559476698, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.ComposableSingletons$CreditCardWaitlistFragmentKt$lambda$559476698$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559476698, i, -1, "com.robinhood.android.creditcard.ui.waitlist.ComposableSingletons$CreditCardWaitlistFragmentKt.lambda$559476698.<anonymous> (CreditCardWaitlistFragment.kt:150)");
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoColor.INSTANCE.m21139getCCGoldBG0d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$559476698$feature_credit_card_externalDebug() {
        return lambda$559476698;
    }
}
