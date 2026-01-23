package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PostSignUpFundAccountDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.ComposableSingletons$PostSignUpFundAccountDetailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountDetailComposable {
    public static final PostSignUpFundAccountDetailComposable INSTANCE = new PostSignUpFundAccountDetailComposable();

    /* renamed from: lambda$-1768948624, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9125lambda$1768948624 = ComposableLambda3.composableLambdaInstance(-1768948624, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.ComposableSingletons$PostSignUpFundAccountDetailComposableKt$lambda$-1768948624$1
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
                ComposerKt.traceEventStart(-1768948624, i, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.ComposableSingletons$PostSignUpFundAccountDetailComposableKt.lambda$-1768948624.<anonymous> (PostSignUpFundAccountDetailComposable.kt:49)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1768948624$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16844getLambda$1768948624$feature_onboarding_externalDebug() {
        return f9125lambda$1768948624;
    }
}
