package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$MenuOfOptionsComposableKt {
    public static final ComposableSingletons$MenuOfOptionsComposableKt INSTANCE = new ComposableSingletons$MenuOfOptionsComposableKt();

    /* renamed from: lambda$-485312893, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9461lambda$485312893 = ComposableLambda3.composableLambdaInstance(-485312893, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt$lambda$-485312893$1
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
                ComposerKt.traceEventStart(-485312893, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt.lambda$-485312893.<anonymous> (MenuOfOptionsComposable.kt:128)");
            }
            MenuOfOptionsComposableKt.MenuOfOptionsLoading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-460902276, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9460lambda$460902276 = ComposableLambda3.composableLambdaInstance(-460902276, false, C39232x84ca9f6c.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$287912079 = ComposableLambda3.composableLambdaInstance(287912079, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt$lambda$287912079$1
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
                ComposerKt.traceEventStart(287912079, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt.lambda$287912079.<anonymous> (MenuOfOptionsComposable.kt:793)");
            }
            MenuOfOptionsComposableKt.MenuOfOptionsLoading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-460902276$lib_menu_of_options_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25550getLambda$460902276$lib_menu_of_options_externalDebug() {
        return f9460lambda$460902276;
    }

    /* renamed from: getLambda$-485312893$lib_menu_of_options_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25551getLambda$485312893$lib_menu_of_options_externalDebug() {
        return f9461lambda$485312893;
    }

    public final Function2<Composer, Integer, Unit> getLambda$287912079$lib_menu_of_options_externalDebug() {
        return lambda$287912079;
    }
}
