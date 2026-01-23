package com.stripe.android.model.parsers;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.TokenizationMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* compiled from: CardJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CardJsonParser implements ModelJsonParser<Card> {
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Card parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual("card", json.optString("object"))) {
            return null;
        }
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Integer numOptInteger = stripeJsonUtils.optInteger(json, "exp_month");
        Integer numValueOf = Integer.valueOf(numOptInteger != null ? numOptInteger.intValue() : -1);
        int iIntValue = numValueOf.intValue();
        Integer num = (iIntValue < 1 || iIntValue > 12) ? null : numValueOf;
        Integer numOptInteger2 = stripeJsonUtils.optInteger(json, "exp_year");
        Integer numValueOf2 = Integer.valueOf(numOptInteger2 != null ? numOptInteger2.intValue() : -1);
        Integer num2 = numValueOf2.intValue() < 0 ? null : numValueOf2;
        String strOptString = StripeJsonUtils.optString(json, "address_city");
        String strOptString2 = StripeJsonUtils.optString(json, "address_line1");
        String strOptString3 = StripeJsonUtils.optString(json, "address_line1_check");
        String strOptString4 = StripeJsonUtils.optString(json, "address_line2");
        String strOptString5 = StripeJsonUtils.optString(json, "address_country");
        String strOptString6 = StripeJsonUtils.optString(json, "address_state");
        String strOptString7 = StripeJsonUtils.optString(json, "address_zip");
        String strOptString8 = StripeJsonUtils.optString(json, "address_zip_check");
        CardBrand cardBrand = Card.INSTANCE.getCardBrand(StripeJsonUtils.optString(json, "brand"));
        String strOptCountryCode = stripeJsonUtils.optCountryCode(json, PlaceTypes.COUNTRY);
        String strOptString9 = StripeJsonUtils.optString(json, "customer");
        return new Card(num, num2, StripeJsonUtils.optString(json, "name"), strOptString2, strOptString3, strOptString4, strOptString, strOptString6, strOptString7, strOptString8, strOptString5, StripeJsonUtils.optString(json, "last4"), cardBrand, CardFunding.INSTANCE.fromCode(StripeJsonUtils.optString(json, "funding")), StripeJsonUtils.optString(json, "fingerprint"), strOptCountryCode, StripeJsonUtils.optCurrency(json, "currency"), strOptString9, StripeJsonUtils.optString(json, "cvc_check"), StripeJsonUtils.optString(json, "id"), TokenizationMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, "tokenization_method")));
    }
}
