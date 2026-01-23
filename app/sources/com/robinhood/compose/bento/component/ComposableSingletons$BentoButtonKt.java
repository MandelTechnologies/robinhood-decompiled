package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BentoButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BentoButtonKt {
    public static final ComposableSingletons$BentoButtonKt INSTANCE = new ComposableSingletons$BentoButtonKt();
    private static Function2<Composer, Integer, Unit> lambda$1895745990 = ComposableLambda3.composableLambdaInstance(1895745990, false, ComposableSingletons$BentoButtonKt$lambda$1895745990$1.INSTANCE);

    /* renamed from: lambda$-924374600, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9319lambda$924374600 = ComposableLambda3.composableLambdaInstance(-924374600, false, ComposableSingletons$BentoButtonKt$lambda$924374600$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$475514884 = ComposableLambda3.composableLambdaInstance(475514884, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$475514884$1
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
                ComposerKt.traceEventStart(475514884, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt.lambda$475514884.<anonymous> (BentoButton.kt:730)");
            }
            BentoButtonKt.Primary(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-939954698, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9320lambda$939954698 = ComposableLambda3.composableLambdaInstance(-939954698, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$-939954698$1
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
                ComposerKt.traceEventStart(-939954698, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt.lambda$-939954698.<anonymous> (BentoButton.kt:737)");
            }
            BentoButtonKt.Secondary(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-924374600$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20772getLambda$924374600$lib_compose_bento_externalRelease() {
        return f9319lambda$924374600;
    }

    /* renamed from: getLambda$-939954698$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20773getLambda$939954698$lib_compose_bento_externalRelease() {
        return f9320lambda$939954698;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1895745990$lib_compose_bento_externalRelease() {
        return lambda$1895745990;
    }

    public final Function2<Composer, Integer, Unit> getLambda$475514884$lib_compose_bento_externalRelease() {
        return lambda$475514884;
    }
}
