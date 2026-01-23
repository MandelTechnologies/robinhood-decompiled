package com.robinhood.android.indexes.detail.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/targets/IndexDetailPageDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.targets.IndexDetailPageDeeplinkTarget, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexDetailPageDeeplinkTargets extends DeeplinkTarget4 {
    public static final IndexDetailPageDeeplinkTargets INSTANCE = new IndexDetailPageDeeplinkTargets();
    public static final int $stable = 8;

    private IndexDetailPageDeeplinkTargets() {
        super(ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, SetsKt.setOf(OptionsRegionGate.INSTANCE), null, false, 12, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuidFromString;
        IndexDetailPageFragmentKey indexDetailPageFragmentKey;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("symbol");
        try {
            uuidFromString = UUID.fromString(deeplinkContext.getUri().getQueryParameter("id"));
        } catch (Throwable unused) {
            uuidFromString = null;
        }
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
        if (queryParameter4 == null) {
            queryParameter4 = "true";
        }
        boolean z = Boolean.parseBoolean(queryParameter4);
        if (uuidFromString != null) {
            indexDetailPageFragmentKey = new IndexDetailPageFragmentKey(uuidFromString, queryParameter, new IndexDetailPageFragmentKey2.Deeplink(queryParameter2));
        } else if (queryParameter3 != null) {
            indexDetailPageFragmentKey = new IndexDetailPageFragmentKey(queryParameter3, queryParameter, new IndexDetailPageFragmentKey2.Deeplink(queryParameter2));
        } else {
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), indexDetailPageFragmentKey, false, z, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
