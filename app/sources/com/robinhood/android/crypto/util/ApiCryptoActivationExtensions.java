package com.robinhood.android.crypto.util;

import com.robinhood.models.api.ApiCryptoActivation;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiCryptoActivationExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, m3636d2 = {"hasIneligibleJurisdiction2or3", "", "", "Lcom/robinhood/models/api/ApiCryptoActivation;", "hasInReviewActivation", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.util.ApiCryptoActivationExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ApiCryptoActivationExtensions {
    public static final boolean hasIneligibleJurisdiction2or3(List<ApiCryptoActivation> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ApiCryptoActivation> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ApiCryptoActivation apiCryptoActivation : list2) {
            if (apiCryptoActivation.getInReview() && Intrinsics.areEqual(apiCryptoActivation.getType(), ApiCryptoActivation.TYPE_NEW_ACCOUNT) && !apiCryptoActivation.getSpeculative() && apiCryptoActivation.getUnsupportedJurisdiction2or3()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasInReviewActivation(List<ApiCryptoActivation> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ApiCryptoActivation> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ApiCryptoActivation apiCryptoActivation : list2) {
            if (apiCryptoActivation.getInReview() && Intrinsics.areEqual(apiCryptoActivation.getType(), ApiCryptoActivation.TYPE_NEW_ACCOUNT)) {
                return true;
            }
        }
        return false;
    }
}
