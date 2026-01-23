package com.robinhood.android.retirement.taxbenefits.p238ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTaxBenefitsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementTaxBenefitsScreen {
    public static final RetirementTaxBenefitsScreen INSTANCE = new RetirementTaxBenefitsScreen();

    /* renamed from: lambda$-926427444, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9220lambda$926427444 = ComposableLambda3.composableLambdaInstance(-926427444, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt$lambda$-926427444$1
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
                ComposerKt.traceEventStart(-926427444, i, -1, "com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt.lambda$-926427444.<anonymous> (RetirementTaxBenefitsScreen.kt:73)");
            }
            RetirementTaxBenefitsScreen5.LoadedState(null, RetirementTaxBenefitsViewState.INSTANCE.getLoadingMock().getTaxBenefitsViewModel(), new RetirementTaxBenefitsScreen4() { // from class: com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt$lambda$-926427444$1.1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public boolean mo15941handle(GenericAction action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    return true;
                }

                @Override // com.robinhood.android.retirement.taxbenefits.p238ui.RetirementTaxBenefitsScreen4
                public void onTaxBenefitsComplete() {
                }

                @Override // com.robinhood.android.retirement.taxbenefits.p238ui.RetirementTaxBenefitsScreen4
                public void onTaxBenefitsError(Throwable throwable) {
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                }
            }, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$605069138 = ComposableLambda3.composableLambdaInstance(605069138, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt$lambda$605069138$1
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
                ComposerKt.traceEventStart(605069138, i, -1, "com.robinhood.android.retirement.taxbenefits.ui.ComposableSingletons$RetirementTaxBenefitsScreenKt.lambda$605069138.<anonymous> (RetirementTaxBenefitsScreen.kt:106)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-926427444$feature_retirement_tax_benefits_externalDebug */
    public final Function2<Composer, Integer, Unit> m2438x75b1f344() {
        return f9220lambda$926427444;
    }

    /* renamed from: getLambda$605069138$feature_retirement_tax_benefits_externalDebug */
    public final Function2<Composer, Integer, Unit> m2439x633e5989() {
        return lambda$605069138;
    }
}
