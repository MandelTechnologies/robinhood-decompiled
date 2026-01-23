package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderSelectionRow.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$ProviderSelectionRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderSelectionRow {
    public static final ProviderSelectionRow INSTANCE = new ProviderSelectionRow();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9607lambda1 = ComposableLambda3.composableLambdaInstance(1138127904, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$ProviderSelectionRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138127904, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$ProviderSelectionRowKt.lambda-1.<anonymous> (ProviderSelectionRow.kt:92)");
                }
                ProviderSelectionRow3.ProviderSelectionRow(new PaymentProviderViewData("fakeId", "Provider Name", "", "", "", CountryCode.COUNTRY_CODE_PL, 0.0f, "provider name", CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, false, new ProviderAvailability(ProviderAvailability.Status.Unhealthy, null), (String) null, 64, (DefaultConstructorMarker) null), new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$ProviderSelectionRowKt$lambda-1$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PaymentProviderViewData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                        invoke2(paymentProviderViewData);
                        return Unit.INSTANCE;
                    }
                }, new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$ProviderSelectionRowKt$lambda-1$1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PaymentProviderViewData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                        invoke2(paymentProviderViewData);
                        return Unit.INSTANCE;
                    }
                }, false, composer, 440, 8);
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
    public final Function2<Composer, Integer, Unit> m27118getLambda1$payments_ui_release() {
        return f9607lambda1;
    }
}
