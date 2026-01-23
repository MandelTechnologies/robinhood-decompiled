package com.robinhood.android.retirement.p239ui.signup.swipeys;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.pager.PagerScope;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$RetirementSignUpScreenKt {
    public static final ComposableSingletons$RetirementSignUpScreenKt INSTANCE = new ComposableSingletons$RetirementSignUpScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1945870633 = ComposableLambda3.composableLambdaInstance(1945870633, false, C27264x56dc5da9.INSTANCE);

    /* renamed from: lambda$-939958738, reason: not valid java name */
    private static Function4<PagerScope, Integer, Composer, Integer, Unit> f9226lambda$939958738 = ComposableLambda3.composableLambdaInstance(-939958738, false, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.ComposableSingletons$RetirementSignUpScreenKt$lambda$-939958738$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            invoke(pagerScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939958738, i2, -1, "com.robinhood.android.retirement.ui.signup.swipeys.ComposableSingletons$RetirementSignUpScreenKt.lambda$-939958738.<anonymous> (RetirementSignUpScreen.kt:315)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-939958738$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function4<PagerScope, Integer, Composer, Integer, Unit> m18219getLambda$939958738$feature_retirement_tab_externalDebug() {
        return f9226lambda$939958738;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1945870633$feature_retirement_tab_externalDebug() {
        return lambda$1945870633;
    }
}
