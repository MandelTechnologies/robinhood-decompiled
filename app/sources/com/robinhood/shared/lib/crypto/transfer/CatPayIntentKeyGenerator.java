package com.robinhood.shared.lib.crypto.transfer;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CatPayIntentKeyGenerator.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"generateCatPayIntentKey", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "uriForQueryParams", "Landroid/net/Uri;", "lib-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.lib.crypto.transfer.CatPayIntentKeyGeneratorKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CatPayIntentKeyGenerator {
    public static final RhWebIntentKey generateCatPayIntentKey(TargetBackend targetBackend, Uri uriForQueryParams) {
        String str;
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(uriForQueryParams, "uriForQueryParams");
        if (targetBackend.isApollo()) {
            str = "webapp--" + targetBackend.getEndpoint().getApolloNamespace() + ".apollo.rhinternal.net";
        } else {
            str = DeepLinkPath.URL_BASE;
        }
        Uri.Builder builderPath = new Uri.Builder().scheme(Constants.SCHEME).authority(str).path("connect");
        for (String str2 : uriForQueryParams.getQueryParameterNames()) {
            builderPath.appendQueryParameter(str2, uriForQueryParams.getQueryParameter(str2));
        }
        Uri uriBuild = builderPath.build();
        Intrinsics.checkNotNull(uriBuild);
        return new RhWebIntentKey(true, true, false, uriBuild, true, true, true, true, false, 256, null);
    }
}
