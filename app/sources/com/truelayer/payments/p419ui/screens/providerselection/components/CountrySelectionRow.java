package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.p419ui.models.Country;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountrySelectionRow.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$CountrySelectionRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CountrySelectionRow {
    public static final CountrySelectionRow INSTANCE = new CountrySelectionRow();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9606lambda1 = ComposableLambda3.composableLambdaInstance(734576067, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$CountrySelectionRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(734576067, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$CountrySelectionRowKt.lambda-1.<anonymous> (CountrySelectionRow.kt:92)");
                }
                CountrySelectionRow3.CountrySelectionRow(new Country(CountryCode.COUNTRY_CODE_GB, ""), true, new Function1<Country, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$CountrySelectionRowKt$lambda-1$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Country it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Country country) {
                        invoke2(country);
                        return Unit.INSTANCE;
                    }
                }, composer, 440);
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
    public final Function2<Composer, Integer, Unit> m27117getLambda1$payments_ui_release() {
        return f9606lambda1;
    }
}
