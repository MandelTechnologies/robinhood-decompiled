package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AcsDataParser.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "parse", "Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "payloadJson", "Lorg/json/JSONObject;", "parsePublicKey", "Ljava/security/interfaces/ECPublicKey;", "ephemPubkey", "", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultAcsDataParser, reason: use source file name */
/* loaded from: classes26.dex */
public final class AcsDataParser2 implements AcsDataParser {
    private final ErrorReporter errorReporter;

    public AcsDataParser2(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.AcsDataParser
    public AcsData parse(JSONObject payloadJson) throws JSONException, JOSEException, ParseException {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        try {
            Result.Companion companion = Result.INSTANCE;
            Map<String, Object> map = JSONObjectUtils.parse(payloadJson.toString());
            Intrinsics.checkNotNullExpressionValue(map, "parse(...)");
            Map map2 = MapsKt.toMap(map);
            objM28550constructorimpl = Result.m28550constructorimpl(new AcsData(String.valueOf(map2.get("acsURL")), parsePublicKey(map2.get("acsEphemPubKey")), parsePublicKey(map2.get("sdkEphemPubKey"))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.errorReporter.reportError(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, thM28553exceptionOrNullimpl));
        }
        ResultKt.throwOnFailure(objM28550constructorimpl);
        return (AcsData) objM28550constructorimpl;
    }

    private final ECPublicKey parsePublicKey(Object ephemPubkey) throws JOSEException, ParseException {
        ECKey eCKey;
        if (ephemPubkey instanceof Map) {
            Intrinsics.checkNotNull(ephemPubkey, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            eCKey = ECKey.parse((Map<String, Object>) ephemPubkey);
        } else {
            String string2 = ephemPubkey != null ? ephemPubkey.toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            eCKey = ECKey.parse(string2);
        }
        ECPublicKey eCPublicKey = eCKey.toECPublicKey();
        Intrinsics.checkNotNullExpressionValue(eCPublicKey, "toECPublicKey(...)");
        return eCPublicKey;
    }
}
