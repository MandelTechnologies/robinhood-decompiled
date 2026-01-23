package com.robinhood.android.feature.account.onboarding.managmentstyle;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ManagementStyleSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ManagementStyleSelectionComposable {
    public static final ManagementStyleSelectionComposable INSTANCE = new ManagementStyleSelectionComposable();
    private static Function2<Composer, Integer, Unit> lambda$204092789 = ComposableLambda3.composableLambdaInstance(204092789, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt$lambda$204092789$1
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
                ComposerKt.traceEventStart(204092789, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt.lambda$204092789.<anonymous> (ManagementStyleSelectionComposable.kt:77)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-315164758, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8964lambda$315164758 = ComposableLambda3.composableLambdaInstance(-315164758, false, ManagementStyleSelectionComposable2.INSTANCE);

    /* renamed from: getLambda$-315164758$feature_account_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14444getLambda$315164758$feature_account_onboarding_externalDebug() {
        return f8964lambda$315164758;
    }

    public final Function2<Composer, Integer, Unit> getLambda$204092789$feature_account_onboarding_externalDebug() {
        return lambda$204092789;
    }
}
