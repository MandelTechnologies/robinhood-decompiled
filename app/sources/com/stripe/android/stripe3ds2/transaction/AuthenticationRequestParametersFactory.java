package com.stripe.android.stripe3ds2.transaction;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AuthenticationRequestParametersFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\fø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "directoryServerId", "", "directoryServerPublicKey", "Ljava/security/PublicKey;", "keyId", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkPublicKey", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AuthenticationRequestParametersFactory {
    Object create(String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, PublicKey publicKey2, Continuation<? super AuthenticationRequestParameters> continuation);
}
