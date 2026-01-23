package com.robinhood.android.equities.taxlots.footer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterErrorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterErrorComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FooterErrorComposable {
    public static final FooterErrorComposable INSTANCE = new FooterErrorComposable();

    /* renamed from: lambda$-102951089, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8886lambda$102951089 = ComposableLambda3.composableLambdaInstance(-102951089, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterErrorComposableKt$lambda$-102951089$1
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
                ComposerKt.traceEventStart(-102951089, i, -1, "com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterErrorComposableKt.lambda$-102951089.<anonymous> (FooterErrorComposable.kt:70)");
            }
            BigDecimal TEN = BigDecimal.TEN;
            Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
            FooterErrorComposable3.FooterErrorComposable(TEN, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-102951089$lib_tax_lots_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13611getLambda$102951089$lib_tax_lots_externalDebug() {
        return f8886lambda$102951089;
    }
}
