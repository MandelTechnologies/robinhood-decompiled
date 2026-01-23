package com.stripe.android.stripe3ds2.transaction;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TransactionFactory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "directoryServerId", "", "rootCerts", "", "Ljava/security/cert/X509Certificate;", "directoryServerPublicKey", "Ljava/security/PublicKey;", "keyId", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "isLiveMode", "", "brand", "Lcom/stripe/android/stripe3ds2/views/Brand;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface TransactionFactory {
    Transaction create(String directoryServerId, List<? extends X509Certificate> rootCerts, PublicKey directoryServerPublicKey, String keyId, SdkTransactionId sdkTransactionId, boolean isLiveMode, Brand brand);
}
