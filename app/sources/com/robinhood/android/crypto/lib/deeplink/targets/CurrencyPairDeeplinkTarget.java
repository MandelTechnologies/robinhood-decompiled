package com.robinhood.android.crypto.lib.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.utils.extensions.StringsKt;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CurrencyPairDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/lib/deeplink/targets/CurrencyPairDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CurrencyPairDeeplinkTarget extends DeeplinkTarget4 {
    public static final CurrencyPairDeeplinkTarget INSTANCE = new CurrencyPairDeeplinkTarget();

    private CurrencyPairDeeplinkTarget() {
        super(Content.MarketIndicator.CRYPTO_TYPE, (RegionGate) CryptoRegionGate.INSTANCE, (ExperimentDeclaration) null, false, true, 12, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        ArrayList arrayList;
        Intent intentCreateIntentForFragment$default;
        Intent intentCreateIntentForFragment$default2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        Intrinsics.checkNotNull(queryParameter);
        UUID uuid = StringsKt.toUuid(queryParameter);
        TradeAction tradeActionFromQueryParam = TradeAction.INSTANCE.fromQueryParam(deeplinkContext.getUri().getQueryParameter(Constants.RequestParamsKeys.DEVELOPER_API_KEY));
        CryptoOrderIntentKey.OrderType orderTypeFromQueryParam = CryptoOrderIntentKey.OrderType.INSTANCE.fromQueryParam(deeplinkContext.getUri().getQueryParameter("order_type"));
        boolean zEquals$default = kotlin.text.StringsKt.equals$default(deeplinkContext.getUri().getQueryParameter("from"), "insights", false, 2, null);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
        if (queryParameter2 == null) {
            queryParameter2 = "true";
        }
        boolean z = Boolean.parseBoolean(queryParameter2);
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("source");
        ArrayList arrayList2 = new ArrayList();
        if (deeplinkContext.getDeepLinkOrigin().isExternalOrNotification()) {
            arrayList2.add(deeplinkContext.getMainIntent());
        }
        if (tradeActionFromQueryParam != null) {
            intentCreateIntentForFragment$default2 = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CryptoOrderIntentKey(uuid, tradeActionFromQueryParam, orderTypeFromQueryParam, null, queryParameter3, 8, null), null, false, 12, null);
        } else if (zEquals$default) {
            intentCreateIntentForFragment$default2 = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CryptoDetailFragmentKey(uuid, CollectionsKt.listOf(uuid), true, null, queryParameter3, null, 40, null), false, false, false, null, false, false, false, false, false, null, false, 8180, null);
        } else {
            arrayList = arrayList2;
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CryptoDetailFragmentKey(uuid, CollectionsKt.listOf(uuid), false, null, queryParameter3, null, 44, null), false, z, false, null, false, false, false, false, false, null, false, 8180, null);
            arrayList.add(intentCreateIntentForFragment$default);
            return (Intent[]) arrayList.toArray(new Intent[0]);
        }
        intentCreateIntentForFragment$default = intentCreateIntentForFragment$default2;
        arrayList = arrayList2;
        arrayList.add(intentCreateIntentForFragment$default);
        return (Intent[]) arrayList.toArray(new Intent[0]);
    }
}
