package com.robinhood.android.creditcard.p091ui.creditapplication;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditApplicationScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CreditApplicationScaffoldKt {
    public static final ComposableSingletons$CreditApplicationScaffoldKt INSTANCE = new ComposableSingletons$CreditApplicationScaffoldKt();

    /* renamed from: lambda$-778111950, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8754lambda$778111950 = ComposableLambda3.composableLambdaInstance(-778111950, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt$lambda$-778111950$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-778111950, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt.lambda$-778111950.<anonymous> (CreditApplicationScaffold.kt:51)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$681092627 = ComposableLambda3.composableLambdaInstance(681092627, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt$lambda$681092627$1
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
                ComposerKt.traceEventStart(681092627, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt.lambda$681092627.<anonymous> (CreditApplicationScaffold.kt:52)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$277027922 = ComposableLambda3.composableLambdaInstance(277027922, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt$lambda$277027922$1
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
                ComposerKt.traceEventStart(277027922, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt.lambda$277027922.<anonymous> (CreditApplicationScaffold.kt:53)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1243300289 = ComposableLambda3.composableLambdaInstance(1243300289, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt$lambda$1243300289$1
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
                ComposerKt.traceEventStart(1243300289, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ComposableSingletons$CreditApplicationScaffoldKt.lambda$1243300289.<anonymous> (CreditApplicationScaffold.kt:150)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-778111950$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m12619getLambda$778111950$feature_credit_card_externalDebug() {
        return f8754lambda$778111950;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1243300289$feature_credit_card_externalDebug() {
        return lambda$1243300289;
    }

    public final Function2<Composer, Integer, Unit> getLambda$277027922$feature_credit_card_externalDebug() {
        return lambda$277027922;
    }

    public final Function2<Composer, Integer, Unit> getLambda$681092627$feature_credit_card_externalDebug() {
        return lambda$681092627;
    }
}
