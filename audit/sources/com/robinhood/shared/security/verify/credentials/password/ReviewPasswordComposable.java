package com.robinhood.shared.security.verify.credentials.password;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewPasswordComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.verify.credentials.password.ComposableSingletons$ReviewPasswordComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReviewPasswordComposable {
    public static final ReviewPasswordComposable INSTANCE = new ReviewPasswordComposable();
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1220180897 = ComposableLambda3.composableLambdaInstance(1220180897, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.password.ComposableSingletons$ReviewPasswordComposableKt$lambda$1220180897$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220180897, i, -1, "com.robinhood.shared.security.verify.credentials.password.ComposableSingletons$ReviewPasswordComposableKt.lambda$1220180897.<anonymous> (ReviewPasswordComposable.kt:26)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$1220180897$feature_verify_credentials_externalDebug() {
        return lambda$1220180897;
    }
}
