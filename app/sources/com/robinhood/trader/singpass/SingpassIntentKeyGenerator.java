package com.robinhood.trader.singpass;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingpassIntentKeyGenerator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"generateSingpassRhWebIntentKey", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "feature-singpass_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.singpass.SingpassIntentKeyGeneratorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SingpassIntentKeyGenerator {
    public static final RhWebIntentKey generateSingpassRhWebIntentKey(TargetBackend targetBackend) {
        String str;
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        if (targetBackend.isApollo()) {
            str = "webapp--" + targetBackend.getEndpoint().getApolloNamespace() + ".apollo.rhinternal.net";
        } else {
            str = DeepLinkPath.URL_BASE;
        }
        Uri uriBuild = new Uri.Builder().scheme(Constants.SCHEME).authority(str).path("oauth_connector").appendQueryParameter("vendor", "singpass").build();
        Intrinsics.checkNotNull(uriBuild);
        return new RhWebIntentKey(false, false, false, uriBuild, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
    }
}
