package com.truelayer.payments.p419ui.screens.providerselection.priming;

import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PrimingContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PrimingContainer {
    public static final PrimingContainer INSTANCE = new PrimingContainer();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9612lambda1 = ComposableLambda3.composableLambdaInstance(-1357925856, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357925856, i, -1, "com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt.lambda-1.<anonymous> (PrimingContainer.kt:169)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.priming_confirm_button, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9613lambda2 = ComposableLambda3.composableLambdaInstance(-811614837, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-811614837, i, -1, "com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt.lambda-2.<anonymous> (PrimingContainer.kt:216)");
                }
                PrimingContainer4.PrimingContainer(new UserPriming.Data("Have you enabled International transfers?", "For security reasons, you need to complete these steps before you initiate the payment.", CollectionsKt.listOf((Object[]) new UserPriming.Data.Step[]{new UserPriming.Data.Step("<a href=\"http://www.google.com\">Sign in</a> on your BNP Paribas account from a browser or from the <b>mobile app</b>"), new UserPriming.Data.Step("<a href=\"http://www.google.com\"><b><i>Sign in on your</i></b></a> BNP Paribas account <a href=\"http://www.google.com\"><b>from a browser</b></a> or from the mobile app"), new UserPriming.Data.Step("<b>Sign in on your BNP</b> Paribas account from a browser or <b><a href=\"http://www.google.com\">from the mobile</a></b> app")}), new UserPriming.Data.BankLink("Go to BNP Mabanque", "https://truelayer.com/")), "BNP Paribas", "", "", null, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt$lambda-2$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.ComposableSingletons$PrimingContainerKt$lambda-2$1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, composer, 1772984, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27123getLambda1$payments_ui_release() {
        return f9612lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27124getLambda2$payments_ui_release() {
        return f9613lambda2;
    }
}
