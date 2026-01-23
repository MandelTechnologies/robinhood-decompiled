package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.DirectDecrypter;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultMessageTransformer.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u0000 32\u00020\u0001:\u00013B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010%\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b&\u0010$J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00102¨\u00064"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "", "isLiveMode", "", "counterSdkToAcs", "counterAcsToSdk", "<init>", "(ZBB)V", "(Z)V", "Lorg/json/JSONObject;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "encrypt", "(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "message", "decrypt", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;", "cres", "", "validateAcsToSdkCounter$3ds2sdk_release", "(Lorg/json/JSONObject;)V", "validateAcsToSdkCounter", "decryptMessage$3ds2sdk_release", "decryptMessage", "keyId", "Lcom/nimbusds/jose/JWEHeader;", "createEncryptionHeader$3ds2sdk_release", "(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader;", "createEncryptionHeader", "Lcom/nimbusds/jose/EncryptionMethod;", "encryptionMethod", "", "getDecryptionKey$3ds2sdk_release", "(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B", "getDecryptionKey", "getEncryptionKey$3ds2sdk_release", "getEncryptionKey", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "B", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class DefaultMessageTransformer implements MessageTransformer {
    private static final EncryptionMethod ENCRYPTION_METHOD = EncryptionMethod.A128CBC_HS256;
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;
    private final boolean isLiveMode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultMessageTransformer)) {
            return false;
        }
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) other;
        return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isLiveMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Byte.hashCode(this.counterSdkToAcs)) * 31) + Byte.hashCode(this.counterAcsToSdk);
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.isLiveMode + ", counterSdkToAcs=" + ((int) this.counterSdkToAcs) + ", counterAcsToSdk=" + ((int) this.counterAcsToSdk) + ")";
    }

    public DefaultMessageTransformer(boolean z, byte b, byte b2) {
        this.isLiveMode = z;
        this.counterSdkToAcs = b;
        this.counterAcsToSdk = b2;
    }

    public DefaultMessageTransformer(boolean z) {
        this(z, (byte) 0, (byte) 0);
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public String encrypt(JSONObject challengeRequest, SecretKey secretKey) throws JSONException, JOSEException {
        Intrinsics.checkNotNullParameter(challengeRequest, "challengeRequest");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        String string2 = challengeRequest.getString("acsTransID");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        JWEHeader jWEHeaderCreateEncryptionHeader$3ds2sdk_release = createEncryptionHeader$3ds2sdk_release(string2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        challengeRequest.put("sdkCounterStoA", str);
        JWEObject jWEObject = new JWEObject(jWEHeaderCreateEncryptionHeader$3ds2sdk_release, new Payload(challengeRequest.toString()));
        EncryptionMethod encryptionMethod = jWEHeaderCreateEncryptionHeader$3ds2sdk_release.getEncryptionMethod();
        Intrinsics.checkNotNullExpressionValue(encryptionMethod, "getEncryptionMethod(...)");
        jWEObject.encrypt(new TransactionEncrypter(getEncryptionKey$3ds2sdk_release(secretKey, encryptionMethod), this.counterSdkToAcs));
        byte b = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b;
        if (b == 0) {
            throw new IllegalArgumentException("SDK to ACS counter is zero");
        }
        String strSerialize = jWEObject.serialize();
        Intrinsics.checkNotNullExpressionValue(strSerialize, "serialize(...)");
        return strSerialize;
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public JSONObject decrypt(String message, SecretKey secretKey) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        JSONObject jSONObjectDecryptMessage$3ds2sdk_release = decryptMessage$3ds2sdk_release(message, secretKey);
        validateAcsToSdkCounter$3ds2sdk_release(jSONObjectDecryptMessage$3ds2sdk_release);
        byte b = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b;
        if (b != 0) {
            return jSONObjectDecryptMessage$3ds2sdk_release;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero");
    }

    public final void validateAcsToSdkCounter$3ds2sdk_release(JSONObject cres) throws JSONException, ChallengeResponseParseException {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(cres, "cres");
        if (this.isLiveMode) {
            if (!cres.has("acsCounterAtoS")) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("acsCounterAtoS");
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                String string2 = cres.getString("acsCounterAtoS");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                objM28550constructorimpl = Result.m28550constructorimpl(Byte.valueOf(Byte.parseByte(string2)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("acsCounterAtoS");
            }
            byte bByteValue = ((Number) objM28550constructorimpl).byteValue();
            if (this.counterAcsToSdk == bByteValue) {
                return;
            }
            throw new ChallengeResponseParseException(ProtocolError.DataDecryptionFailure, "Counters are not equal. SDK counter: " + ((int) this.counterAcsToSdk) + ", ACS counter: " + ((int) bByteValue));
        }
    }

    public final JSONObject decryptMessage$3ds2sdk_release(String message, SecretKey secretKey) throws JSONException, JOSEException, ParseException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        JWEObject jWEObject = JWEObject.parse(message);
        EncryptionMethod encryptionMethod = jWEObject.getHeader().getEncryptionMethod();
        Intrinsics.checkNotNullExpressionValue(encryptionMethod, "getEncryptionMethod(...)");
        jWEObject.decrypt(new DirectDecrypter(getDecryptionKey$3ds2sdk_release(secretKey, encryptionMethod)));
        return new JSONObject(jWEObject.getPayload().toString());
    }

    public final JWEHeader createEncryptionHeader$3ds2sdk_release(String keyId) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        JWEHeader jWEHeaderBuild = new JWEHeader.Builder(JWEAlgorithm.DIR, ENCRYPTION_METHOD).keyID(keyId).build();
        Intrinsics.checkNotNullExpressionValue(jWEHeaderBuild, "build(...)");
        return jWEHeaderBuild;
    }

    public final byte[] getDecryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A128GCM;
        if (encryptionMethod2 == encryptionMethod) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, encoded.length - (encryptionMethod2.cekBitLength() / 8), encoded.length);
            Intrinsics.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        Intrinsics.checkNotNull(encoded);
        return encoded;
    }

    public final byte[] getEncryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A128GCM;
        if (encryptionMethod2 == encryptionMethod) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, encryptionMethod2.cekBitLength() / 8);
            Intrinsics.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        Intrinsics.checkNotNull(encoded);
        return encoded;
    }
}
