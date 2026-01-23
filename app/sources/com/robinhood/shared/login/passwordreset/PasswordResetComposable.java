package com.robinhood.shared.login.passwordreset;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PasswordResetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.passwordreset.ComposableSingletons$PasswordResetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PasswordResetComposable {
    public static final PasswordResetComposable INSTANCE = new PasswordResetComposable();

    /* renamed from: lambda$-785499064, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9458lambda$785499064 = ComposableLambda3.composableLambdaInstance(-785499064, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.ComposableSingletons$PasswordResetComposableKt$lambda$-785499064$1
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
                ComposerKt.traceEventStart(-785499064, i, -1, "com.robinhood.shared.login.passwordreset.ComposableSingletons$PasswordResetComposableKt.lambda$-785499064.<anonymous> (PasswordResetComposable.kt:64)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-785499064$feature_login_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25512getLambda$785499064$feature_login_externalRelease() {
        return f9458lambda$785499064;
    }
}
