package com.robinhood.compose.bento.component.rows;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BentoValuePropRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoValuePropRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoValuePropRow4 {
    public static final BentoValuePropRow4 INSTANCE = new BentoValuePropRow4();
    private static Function2<Composer, Integer, Unit> lambda$1176006033 = ComposableLambda3.composableLambdaInstance(1176006033, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoValuePropRowKt$lambda$1176006033$1
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
                ComposerKt.traceEventStart(1176006033, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoValuePropRowKt.lambda$1176006033.<anonymous> (BentoValuePropRow.kt:216)");
            }
            BentoValuePropRow3.ValuePropPreviews(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1032566507, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9341lambda$1032566507 = ComposableLambda3.composableLambdaInstance(-1032566507, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoValuePropRowKt$lambda$-1032566507$1
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
                ComposerKt.traceEventStart(-1032566507, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoValuePropRowKt.lambda$-1032566507.<anonymous> (BentoValuePropRow.kt:224)");
            }
            BentoValuePropRow3.ValuePropPreviews(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1032566507$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21038getLambda$1032566507$lib_compose_bento_externalRelease() {
        return f9341lambda$1032566507;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1176006033$lib_compose_bento_externalRelease() {
        return lambda$1176006033;
    }
}
