package com.robinhood.android.fundingmethods;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.retirement.api.RetirementFundingMethod;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementFundingMethodsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.fundingmethods.ComposableSingletons$RetirementFundingMethodsScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RetirementFundingMethodsScreen {
    public static final RetirementFundingMethodsScreen INSTANCE = new RetirementFundingMethodsScreen();

    /* renamed from: lambda$-1929734107, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8972lambda$1929734107 = ComposableLambda3.composableLambdaInstance(-1929734107, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fundingmethods.ComposableSingletons$RetirementFundingMethodsScreenKt$lambda$-1929734107$1
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
                ComposerKt.traceEventStart(-1929734107, i, -1, "com.robinhood.android.fundingmethods.ComposableSingletons$RetirementFundingMethodsScreenKt.lambda$-1929734107.<anonymous> (RetirementFundingMethodsScreen.kt:69)");
            }
            RetirementFundingMethodsScreen4.RetirementFundingMethodsScreen(RetirementFundingMethodsViewState.INSTANCE.getLoadingMock().getFundingMethods(), new RetirementFundingMethodsScreen3() { // from class: com.robinhood.android.fundingmethods.ComposableSingletons$RetirementFundingMethodsScreenKt$lambda$-1929734107$1.1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public boolean mo15941handle(GenericAction action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    return true;
                }

                @Override // com.robinhood.android.fundingmethods.RetirementFundingMethodsScreen3
                public void onFundingMethodSelected(RetirementFundingMethod selectedMethod) {
                    Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
                }
            }, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1929734107$feature_retirement_funding_methods_externalDebug */
    public final Function2<Composer, Integer, Unit> m2020x7d58e00b() {
        return f8972lambda$1929734107;
    }
}
