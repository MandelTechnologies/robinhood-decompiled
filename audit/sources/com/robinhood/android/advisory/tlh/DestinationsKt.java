package com.robinhood.android.advisory.tlh;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.advisory.contracts.TaxLossHarvestingKey2;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Destinations.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getTaxLossHarvestDestinationFromRoute", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", PlaceTypes.ROUTE, "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DestinationsKt {
    public static final ComposableDestination getTaxLossHarvestDestinationFromRoute(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (StringsKt.contains$default((CharSequence) route, (CharSequence) TaxLossHarvestingKey2.DASHBOARD.getDeeplinkPath(), false, 2, (Object) null)) {
            return TaxLossHarvestDashboardDestination.INSTANCE;
        }
        if (StringsKt.contains$default((CharSequence) route, (CharSequence) TaxLossHarvestingKey2.FLOW.getDeeplinkPath(), false, 2, (Object) null)) {
            return TaxLossHarvestFlowDestination.INSTANCE;
        }
        if (StringsKt.contains$default((CharSequence) route, (CharSequence) TaxLossHarvestingKey2.GAINS_AND_LOSSES.getDeeplinkPath(), false, 2, (Object) null)) {
            return GainsAndLossesDestination.INSTANCE;
        }
        return null;
    }
}
