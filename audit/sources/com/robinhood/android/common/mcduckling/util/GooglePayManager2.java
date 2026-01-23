package com.robinhood.android.common.mcduckling.util;

import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toGooglePayTokenInfoWrapper", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "feature-lib-mcduckling_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.mcduckling.util.GooglePayManagerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class GooglePayManager2 {
    public static final GooglePayTokenInfoWrapper toGooglePayTokenInfoWrapper(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "<this>");
        String issuerTokenId = tokenInfo.getIssuerTokenId();
        Intrinsics.checkNotNullExpressionValue(issuerTokenId, "getIssuerTokenId(...)");
        String issuerName = tokenInfo.getIssuerName();
        Intrinsics.checkNotNullExpressionValue(issuerName, "getIssuerName(...)");
        String fpanLastFour = tokenInfo.getFpanLastFour();
        Intrinsics.checkNotNullExpressionValue(fpanLastFour, "getFpanLastFour(...)");
        String dpanLastFour = tokenInfo.getDpanLastFour();
        Intrinsics.checkNotNullExpressionValue(dpanLastFour, "getDpanLastFour(...)");
        int tokenServiceProvider = tokenInfo.getTokenServiceProvider();
        int network = tokenInfo.getNetwork();
        int tokenState = tokenInfo.getTokenState();
        boolean isDefaultToken = tokenInfo.getIsDefaultToken();
        String portfolioName = tokenInfo.getPortfolioName();
        Intrinsics.checkNotNullExpressionValue(portfolioName, "getPortfolioName(...)");
        return new GooglePayTokenInfoWrapper(issuerTokenId, issuerName, fpanLastFour, dpanLastFour, tokenServiceProvider, network, tokenState, isDefaultToken, portfolioName);
    }
}
