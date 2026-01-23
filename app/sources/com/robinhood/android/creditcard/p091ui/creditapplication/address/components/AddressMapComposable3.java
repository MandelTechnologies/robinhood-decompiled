package com.robinhood.android.creditcard.p091ui.creditapplication.address.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressMapComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.components.ComposableSingletons$AddressMapComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AddressMapComposable3 {
    public static final AddressMapComposable3 INSTANCE = new AddressMapComposable3();

    /* renamed from: lambda$-1448764417, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8755lambda$1448764417 = ComposableLambda3.composableLambdaInstance(-1448764417, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.ComposableSingletons$AddressMapComposableKt$lambda$-1448764417$1
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
                ComposerKt.traceEventStart(-1448764417, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.components.ComposableSingletons$AddressMapComposableKt.lambda$-1448764417.<anonymous> (AddressMapComposable.kt:40)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1448764417$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12638getLambda$1448764417$feature_credit_card_externalDebug() {
        return f8755lambda$1448764417;
    }
}
