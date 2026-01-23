package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import java.io.Serializable;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessageTransformer.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "Ljava/io/Serializable;", "decrypt", "Lorg/json/JSONObject;", "message", "", "secretKey", "Ljavax/crypto/SecretKey;", "encrypt", "challengeRequest", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface MessageTransformer extends Serializable {
    JSONObject decrypt(String message, SecretKey secretKey) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException;

    String encrypt(JSONObject challengeRequest, SecretKey secretKey) throws JSONException, JOSEException;
}
