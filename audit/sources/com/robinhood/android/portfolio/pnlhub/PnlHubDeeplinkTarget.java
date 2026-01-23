package com.robinhood.android.portfolio.pnlhub;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: PnlHubDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "resolveDestinationIntent", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubDeeplinkTarget extends DeeplinkTarget4 {
    public static final PnlHubDeeplinkTarget INSTANCE = new PnlHubDeeplinkTarget();
    public static final int $stable = 8;

    private PnlHubDeeplinkTarget() {
        super("pnl_hub", false, true, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Intent mainIntent = deeplinkContext.getMainIntent();
        Intent intentResolveDestinationIntent = resolveDestinationIntent(deeplinkContext);
        if (intentResolveDestinationIntent == null) {
            intentResolveDestinationIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null);
        }
        return new Intent[]{mainIntent, intentResolveDestinationIntent};
    }

    private final Intent resolveDestinationIntent(DeeplinkTarget2 deeplinkContext) {
        String queryParameter;
        List listSplit$default;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        BrokerageAccountType brokerageAccountTypeFromServerValue = queryParameter3 != null ? BrokerageAccountType.INSTANCE.fromServerValue(queryParameter3) : null;
        if ((queryParameter2 != null || brokerageAccountTypeFromServerValue != null) && brokerageAccountTypeFromServerValue != BrokerageAccountType.UNKNOWN && (queryParameter = deeplinkContext.getUri().getQueryParameter("asset_types")) != null && (listSplit$default = StringsKt.split$default((CharSequence) queryParameter, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                AssetClass assetClassFromServerValue = AssetClass.INSTANCE.fromServerValue((String) it.next());
                if (assetClassFromServerValue != null) {
                    arrayList.add(assetClassFromServerValue);
                }
            }
            if (arrayList.contains(AssetClass.UNKNOWN)) {
                return null;
            }
            String queryParameter4 = deeplinkContext.getUri().getQueryParameter("source");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            String str = queryParameter4;
            if (queryParameter2 != null) {
                return Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new PnlHubContract.Key.AccountNumberKey(queryParameter2, str, arrayList, null, 8, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            }
            if (brokerageAccountTypeFromServerValue != null) {
                return Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new PnlHubContract.Key.AccountTypeKey(brokerageAccountTypeFromServerValue, str, arrayList, null, 8, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            }
        }
        return null;
    }
}
