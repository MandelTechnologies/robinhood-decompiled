package com.robinhood.android.verification.email;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: EmailInitialLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.ComposableSingletons$EmailInitialLoadingFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class EmailInitialLoadingFragment2 {
    public static final EmailInitialLoadingFragment2 INSTANCE = new EmailInitialLoadingFragment2();
    private static Function3<BentoButtonBar3, Composer, Integer, Unit> lambda$2052399907 = ComposableLambda3.composableLambdaInstance(2052399907, false, EmailInitialLoadingFragment4.INSTANCE);
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$322112400 = ComposableLambda3.composableLambdaInstance(322112400, false, EmailInitialLoadingFragment5.INSTANCE);

    /* renamed from: lambda$-520977544, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9304lambda$520977544 = ComposableLambda3.composableLambdaInstance(-520977544, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.verification.email.ComposableSingletons$EmailInitialLoadingFragmentKt$lambda$-520977544$1
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
                ComposerKt.traceEventStart(-520977544, i, -1, "com.robinhood.android.verification.email.ComposableSingletons$EmailInitialLoadingFragmentKt.lambda$-520977544.<anonymous> (EmailInitialLoadingFragment.kt:39)");
            }
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
            EmailInitialLoadingFragment2 emailInitialLoadingFragment2 = EmailInitialLoadingFragment2.INSTANCE;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM21622defaultHorizontalPaddingWMci_g0, false, emailInitialLoadingFragment2.getLambda$2052399907$feature_verification_externalDebug(), emailInitialLoadingFragment2.getLambda$322112400$feature_verification_externalDebug(), composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-520977544$feature_verification_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20037getLambda$520977544$feature_verification_externalDebug() {
        return f9304lambda$520977544;
    }

    public final Function3<BentoButtonBar3, Composer, Integer, Unit> getLambda$2052399907$feature_verification_externalDebug() {
        return lambda$2052399907;
    }

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$322112400$feature_verification_externalDebug() {
        return lambda$322112400;
    }
}
