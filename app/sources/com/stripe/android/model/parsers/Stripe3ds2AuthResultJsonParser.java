package com.stripe.android.model.parsers;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Stripe3ds2AuthResultJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AresJsonParser", "Companion", "MessageExtensionJsonParser", "ThreeDS2ErrorJsonParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Stripe3ds2AuthResultJsonParser implements ModelJsonParser<Stripe3ds2AuthResult> {
    private static final Companion Companion = new Companion(null);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Stripe3ds2AuthResult parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string2 = json.getString("id");
        long j = json.getLong("created");
        boolean z = json.getBoolean("livemode");
        String string3 = json.getString("source");
        String strOptString = json.optString("state");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("ares");
        Stripe3ds2AuthResult.Ares ares = jSONObjectOptJSONObject != null ? new AresJsonParser().parse(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("error");
        return new Stripe3ds2AuthResult(string2, ares, Long.valueOf(j), string3, strOptString, z, jSONObjectOptJSONObject2 != null ? new ThreeDS2ErrorJsonParser().parse(jSONObjectOptJSONObject2) : null, StripeJsonUtils.optString(json, "fallback_redirect_url"), StripeJsonUtils.optString(json, "creq"));
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AresJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.Ares> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.Ares parse(JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "threeDSServerTransID");
            String strOptString2 = StripeJsonUtils.optString(json, "acsChallengeMandated");
            String strOptString3 = StripeJsonUtils.optString(json, "acsSignedContent");
            String string2 = json.getString("acsTransID");
            String strOptString4 = StripeJsonUtils.optString(json, "acsURL");
            String strOptString5 = StripeJsonUtils.optString(json, "authenticationType");
            String strOptString6 = StripeJsonUtils.optString(json, "cardholderInfo");
            String string3 = json.getString("messageType");
            String string4 = json.getString("messageVersion");
            String strOptString7 = StripeJsonUtils.optString(json, "sdkTransID");
            String strOptString8 = StripeJsonUtils.optString(json, "transStatus");
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("messageExtension");
            return new Stripe3ds2AuthResult.Ares(strOptString, strOptString2, strOptString3, string2, strOptString4, strOptString5, strOptString6, jSONArrayOptJSONArray != null ? new MessageExtensionJsonParser().parse(jSONArrayOptJSONArray) : null, string3, string4, strOptString7, strOptString8);
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser$Companion;", "", "()V", "FIELD_ACS_CHALLENGE_MANDATED", "", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "FIELD_TRANS_STATUS", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "()V", "parse", "", "jsonArray", "Lorg/json/JSONArray;", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class MessageExtensionJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.MessageExtension> {
        private static final Companion Companion = new Companion(null);

        public final List<Stripe3ds2AuthResult.MessageExtension> parse(JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(((PrimitiveIterators6) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(parse((JSONObject) it2.next()));
            }
            return arrayList2;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.MessageExtension parse(JSONObject json) {
            Map mapEmptyMap;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(WebsocketGatewayConstants.DATA_KEY);
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
                if (jSONArrayNames == null) {
                    jSONArrayNames = new JSONArray();
                }
                PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, jSONArrayNames.length());
                ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
                Iterator<Integer> it = primitiveRanges2Until.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArrayNames.getString(((PrimitiveIterators6) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(MapsKt.mapOf(Tuples4.m3642to(str, jSONObjectOptJSONObject.getString(str))));
                }
                mapEmptyMap = MapsKt.emptyMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mapEmptyMap = MapsKt.plus(mapEmptyMap, (Map) it2.next());
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new Stripe3ds2AuthResult.MessageExtension(StripeJsonUtils.optString(json, "name"), json.optBoolean("criticalityIndicator"), StripeJsonUtils.optString(json, "id"), MapsKt.toMap(mapEmptyMap));
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser$Companion;", "", "()V", "FIELD_CRITICALITY_INDICATOR", "", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ThreeDS2ErrorJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.ThreeDS2Error> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.ThreeDS2Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(json.getString("threeDSServerTransID"), StripeJsonUtils.optString(json, "acsTransID"), StripeJsonUtils.optString(json, "dsTransID"), json.getString("errorCode"), json.getString("errorComponent"), json.getString("errorDescription"), json.getString("errorDetail"), StripeJsonUtils.optString(json, "errorMessageType"), json.getString("messageType"), json.getString("messageVersion"), StripeJsonUtils.optString(json, "sdkTransID"));
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser$Companion;", "", "()V", "FIELD_ACS_TRANS_ID", "", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$Companion;", "", "()V", "FIELD_ARES", "", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
