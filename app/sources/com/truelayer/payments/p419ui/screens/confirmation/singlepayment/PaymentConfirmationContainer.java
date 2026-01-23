package com.truelayer.payments.p419ui.screens.confirmation.singlepayment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.PaymentConfirmationViewData;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentConfirmationContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.singlepayment.ComposableSingletons$PaymentConfirmationContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentConfirmationContainer {
    public static final PaymentConfirmationContainer INSTANCE = new PaymentConfirmationContainer();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9591lambda1 = ComposableLambda3.composableLambdaInstance(-939158393, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.ComposableSingletons$PaymentConfirmationContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-939158393, i, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.ComposableSingletons$PaymentConfirmationContainerKt.lambda-1.<anonymous> (PaymentConfirmationContainer.kt:118)");
                }
                PaymentConfirmationContainer3.PaymentConfirmationContainer(new PaymentConfirmationViewData("asdfsdf", "TheBank", "http://notavalidurl.com", null, CountryCode.COUNTRY_CODE_GB, "MyMerchant", new URL("http://notavalidurl.com"), Currency.Defaults.INSTANCE.getGBP(), new Legals("Some legal text with <a href=\"https://alamakota.com\">link</a>", "This type of payment lets you pay directly from your bank account, and saves you the hassle of entering your card details. It's safe, secure and protected by bank-grade encryption.\\n\u200b\u200bTrueLayer Limited is authorized by the Financial Conduct Authority under the Payment Services Regulations 2017 and the Electronic Money Regulations 2011.\\nFirm Reference Number: 901096"), false, false, false, ConfirmationViewData.PaymentUseCase.SignUpPlus, 1L), null, null, null, null, composer, 8, 30);
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
    public final Function2<Composer, Integer, Unit> m27101getLambda1$payments_ui_release() {
        return f9591lambda1;
    }
}
