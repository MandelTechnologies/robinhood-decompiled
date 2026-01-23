package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitlistIntroComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$WaitlistIntroComposableKt {
    public static final ComposableSingletons$WaitlistIntroComposableKt INSTANCE = new ComposableSingletons$WaitlistIntroComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1382352779 = ComposableLambda3.composableLambdaInstance(1382352779, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt$lambda$1382352779$1
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
                ComposerKt.traceEventStart(1382352779, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt.lambda$1382352779.<anonymous> (WaitlistIntroComposable.kt:209)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-818060321, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f8807lambda$818060321 = ComposableLambda3.composableLambdaInstance(-818060321, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt$lambda$-818060321$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818060321, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt.lambda$-818060321.<anonymous> (WaitlistIntroComposable.kt:210)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1185536381, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8806lambda$1185536381 = ComposableLambda3.composableLambdaInstance(-1185536381, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt$lambda$-1185536381$1
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
                ComposerKt.traceEventStart(-1185536381, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.ComposableSingletons$WaitlistIntroComposableKt.lambda$-1185536381.<anonymous> (WaitlistIntroComposable.kt:262)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1185536381$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12886getLambda$1185536381$feature_credit_card_externalDebug() {
        return f8806lambda$1185536381;
    }

    /* renamed from: getLambda$-818060321$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m12887getLambda$818060321$feature_credit_card_externalDebug() {
        return f8807lambda$818060321;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1382352779$feature_credit_card_externalDebug() {
        return lambda$1382352779;
    }
}
