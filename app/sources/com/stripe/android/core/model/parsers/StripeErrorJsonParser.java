package com.stripe.android.core.model.parsers;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* compiled from: StripeErrorJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/core/StripeError;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class StripeErrorJsonParser implements ModelJsonParser<StripeError> {
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeError parse(JSONObject json) {
        Object objM28550constructorimpl;
        Map map;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = json.getJSONObject("error");
            String strOptString = StripeJsonUtils.optString(jSONObject, "charge");
            String strOptString2 = StripeJsonUtils.optString(jSONObject, "code");
            String strOptString3 = StripeJsonUtils.optString(jSONObject, "decline_code");
            String strOptString4 = StripeJsonUtils.optString(jSONObject, "message");
            String strOptString5 = StripeJsonUtils.optString(jSONObject, "param");
            String strOptString6 = StripeJsonUtils.optString(jSONObject, "type");
            String strOptString7 = StripeJsonUtils.optString(jSONObject, "doc_url");
            final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_fields");
            if (jSONObjectOptJSONObject != null) {
                Intrinsics.checkNotNull(jSONObjectOptJSONObject);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(itKeys), new Function1<String, Tuples2<? extends String, ? extends String>>() { // from class: com.stripe.android.core.model.parsers.StripeErrorJsonParser$parse$1$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Tuples2<String, String> invoke(String str) {
                        return Tuples4.m3642to(str, jSONObjectOptJSONObject.get(str).toString());
                    }
                }));
            } else {
                map = null;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(new StripeError(strOptString6, strOptString4, strOptString2, strOptString5, strOptString3, strOptString, strOptString7, map));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        StripeError stripeError = new StripeError(null, "An improperly formatted error response was found.", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = stripeError;
        }
        return (StripeError) objM28550constructorimpl;
    }
}
