package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitlistJoinedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistJoinedComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WaitlistJoinedComposable {
    public static final WaitlistJoinedComposable INSTANCE = new WaitlistJoinedComposable();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$1969137060 = ComposableLambda3.composableLambdaInstance(1969137060, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistJoinedComposableKt$lambda$1969137060$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969137060, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistJoinedComposableKt.lambda$1969137060.<anonymous> (WaitlistJoinedComposable.kt:132)");
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1155622731, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8805lambda$1155622731 = ComposableLambda3.composableLambdaInstance(-1155622731, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistJoinedComposableKt$lambda$-1155622731$1
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
                ComposerKt.traceEventStart(-1155622731, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.ComposableSingletons$WaitlistJoinedComposableKt.lambda$-1155622731.<anonymous> (WaitlistJoinedComposable.kt:165)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1155622731$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12874getLambda$1155622731$feature_credit_card_externalDebug() {
        return f8805lambda$1155622731;
    }

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$1969137060$feature_credit_card_externalDebug() {
        return lambda$1969137060;
    }
}
