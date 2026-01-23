package com.robinhood.curatedproductdiscovery.p291ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewProductsLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NewProductsLandingFragmentKt {
    public static final ComposableSingletons$NewProductsLandingFragmentKt INSTANCE = new ComposableSingletons$NewProductsLandingFragmentKt();

    /* renamed from: lambda$-1141434637, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9359lambda$1141434637 = ComposableLambda3.composableLambdaInstance(-1141434637, false, C33037x211ed3c8.INSTANCE);
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1669467800 = ComposableLambda3.composableLambdaInstance(1669467800, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt$lambda$1669467800$1
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
                ComposerKt.traceEventStart(1669467800, i, -1, "com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt.lambda$1669467800.<anonymous> (NewProductsLandingFragment.kt:147)");
            }
            NewProductsLandingFragmentKt.NewProductLandingTitle(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1141434637$feature_curated_product_discovery_externalDebug */
    public final Function2<Composer, Integer, Unit> m2594xeff71997() {
        return f9359lambda$1141434637;
    }

    /* renamed from: getLambda$1669467800$feature_curated_product_discovery_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2595xc0edbae1() {
        return lambda$1669467800;
    }
}
