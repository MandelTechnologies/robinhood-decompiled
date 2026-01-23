package com.truelayer.payments.p419ui.screens.account;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.p419ui.C42830R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Clock2;

/* compiled from: AccountSelection.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$AccountSelectionKt {
    public static final ComposableSingletons$AccountSelectionKt INSTANCE = new ComposableSingletons$AccountSelectionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<Row5, Composer, Integer, Unit> f9582lambda1 = ComposableLambda3.composableLambdaInstance(2031577399, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.ComposableSingletons$AccountSelectionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031577399, i, -1, "com.truelayer.payments.ui.screens.account.ComposableSingletons$AccountSelectionKt.lambda-1.<anonymous> (AccountSelection.kt:196)");
                }
                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.account_selection_use_different_account, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m5763getSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131066);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9583lambda2 = ComposableLambda3.composableLambdaInstance(-19212970, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.account.ComposableSingletons$AccountSelectionKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            int i2 = 2;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-19212970, i, -1, "com.truelayer.payments.ui.screens.account.ComposableSingletons$AccountSelectionKt.lambda-2.<anonymous> (AccountSelection.kt:263)");
                }
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                PaymentProvider paymentProvider = new PaymentProvider("", "Mock UK Payments - Redirect Flow", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null);
                Clock2 clock2 = Clock2.INSTANCE;
                listCreateListBuilder.add(new UserAccount("01", paymentProvider, "*******12", clock2.now()));
                listCreateListBuilder.add(new UserAccount("02", new PaymentProvider("", "Barclays", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), "*******34", clock2.now()));
                listCreateListBuilder.add(new UserAccount("03", new PaymentProvider("", "Revolut", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, new ProviderAvailability(ProviderAvailability.Status.Unhealthy, (Float) null, i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), (List) null, (List) null, 3520, (DefaultConstructorMarker) null), "*******556", clock2.now()));
                AccountSelectionKt.AccountSelection(CollectionsKt.build(listCreateListBuilder), null, null, null, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.account.ComposableSingletons$AccountSelectionKt$lambda-2$1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, composer, 24584, 14);
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
    public final Function3<Row5, Composer, Integer, Unit> m27090getLambda1$payments_ui_release() {
        return f9582lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27091getLambda2$payments_ui_release() {
        return f9583lambda2;
    }
}
