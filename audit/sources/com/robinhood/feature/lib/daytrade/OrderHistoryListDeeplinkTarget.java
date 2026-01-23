package com.robinhood.feature.lib.daytrade;

import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: OrderHistoryListDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/feature/lib/daytrade/OrderHistoryListDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-lib-day-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class OrderHistoryListDeeplinkTarget extends DeeplinkTarget4 {
    public static final OrderHistoryListDeeplinkTarget INSTANCE = new OrderHistoryListDeeplinkTarget();
    public static final int $stable = 8;

    private OrderHistoryListDeeplinkTarget() {
        super("order_history_list", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        List listEmptyList;
        FragmentKey optionOrderDetail;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("name");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("type");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("order_uuids");
        if (queryParameter3 == null || (listEmptyList = StringsKt.split$default((CharSequence) queryParameter3, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UUID.fromString((String) it.next()));
        }
        if (Intrinsics.areEqual(queryParameter2, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY)) {
            Intrinsics.checkNotNull(queryParameter);
            optionOrderDetail = new LegacyFragmentKey.OrderDetail(queryParameter, arrayList);
        } else {
            optionOrderDetail = Intrinsics.areEqual(queryParameter2, AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION) ? new LegacyFragmentKey.OptionOrderDetail(arrayList) : null;
        }
        FragmentKey fragmentKey = optionOrderDetail;
        if (fragmentKey != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), fragmentKey, false, false, false, null, false, false, false, false, false, null, false, 8180, null)};
        }
        return new Intent[0];
    }
}
