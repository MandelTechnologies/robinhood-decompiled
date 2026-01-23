package com.robinhood.lib.transfers.nonoriginated;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAccountInfoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.lib.transfers.nonoriginated.ComposableSingletons$NonOriginatedAccountInfoComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NonOriginatedAccountInfoComposable {
    public static final NonOriginatedAccountInfoComposable INSTANCE = new NonOriginatedAccountInfoComposable();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$409877982 = ComposableLambda3.composableLambdaInstance(409877982, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.lib.transfers.nonoriginated.ComposableSingletons$NonOriginatedAccountInfoComposableKt$lambda$409877982$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409877982, i, -1, "com.robinhood.lib.transfers.nonoriginated.ComposableSingletons$NonOriginatedAccountInfoComposableKt.lambda$409877982.<anonymous> (NonOriginatedAccountInfoComposable.kt:160)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$409877982$feature_lib_non_originated_transfer_info_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2600x3e226fac() {
        return lambda$409877982;
    }
}
