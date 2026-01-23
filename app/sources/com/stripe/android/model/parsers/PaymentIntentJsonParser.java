package com.stripe.android.model.parsers;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* compiled from: PaymentIntentJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "ShippingJsonParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PaymentIntentJsonParser implements ModelJsonParser<PaymentIntent> {
    private static final Companion Companion = new Companion(null);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentIntent parse(JSONObject json) {
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual("payment_intent", StripeJsonUtils.optString(json, "object"))) {
            return null;
        }
        String strOptString = StripeJsonUtils.optString(json, "id");
        ModelJsonParser.Companion companion = ModelJsonParser.INSTANCE;
        List<String> listJsonArrayToList = companion.jsonArrayToList(json.optJSONArray("payment_method_types"));
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Long lOptLong = stripeJsonUtils.optLong(json, "amount");
        long jOptLong = json.optLong("canceled_at");
        PaymentIntent.CancellationReason cancellationReasonFromCode = PaymentIntent.CancellationReason.INSTANCE.fromCode(StripeJsonUtils.optString(json, "cancellation_reason"));
        PaymentIntent.CaptureMethod captureMethodFromCode = PaymentIntent.CaptureMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, "capture_method"));
        String strOptString2 = StripeJsonUtils.optString(json, "client_secret");
        PaymentIntent.ConfirmationMethod confirmationMethodFromCode = PaymentIntent.ConfirmationMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, "confirmation_method"));
        long jOptLong2 = json.optLong("created");
        String strOptCurrency = StripeJsonUtils.optCurrency(json, "currency");
        String strOptString3 = StripeJsonUtils.optString(json, "description");
        boolean zOptBoolean = stripeJsonUtils.optBoolean(json, "livemode");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethod = jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString4 = StripeJsonUtils.optString(json, "payment_method");
        if (paymentMethod != null) {
            strOptString4 = null;
        }
        if (strOptString4 != null) {
            str = strOptString4;
        } else if (paymentMethod != null) {
            strOptString4 = paymentMethod.id;
            str = strOptString4;
        } else {
            str = null;
        }
        String strOptString5 = StripeJsonUtils.optString(json, "receipt_email");
        StripeIntent.Status statusFromCode$payments_core_release = StripeIntent.Status.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "status"));
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("payment_method_options");
        String string2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        StripeIntent.Usage usageFromCode$payments_core_release = StripeIntent.Usage.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "setup_future_usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("last_payment_error");
        PaymentIntent.Error error = jSONObjectOptJSONObject3 != null ? new ErrorJsonParser().parse(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("shipping");
        PaymentIntent.Shipping shipping = jSONObjectOptJSONObject4 != null ? new ShippingJsonParser().parse(jSONObjectOptJSONObject4) : null;
        JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("next_action");
        StripeIntent.NextActionData nextActionData = jSONObjectOptJSONObject5 != null ? new NextActionDataParser().parse(jSONObjectOptJSONObject5) : null;
        List<String> listJsonArrayToList2 = companion.jsonArrayToList(json.optJSONArray("unactivated_payment_method_types"));
        List<String> listJsonArrayToList3 = companion.jsonArrayToList(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList3, 10));
        Iterator it = listJsonArrayToList3.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
            it = it2;
        }
        return new PaymentIntent(strOptString, listJsonArrayToList, lOptLong, jOptLong, cancellationReasonFromCode, captureMethodFromCode, strOptString2, confirmationMethodFromCode, StripeJsonUtils.optString(json, "country_code"), jOptLong2, strOptCurrency, strOptString3, zOptBoolean, paymentMethod, str, strOptString5, statusFromCode$payments_core_release, usageFromCode$payments_core_release, error, shipping, listJsonArrayToList2, arrayList, nextActionData, string2);
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ErrorJsonParser implements ModelJsonParser<PaymentIntent.Error> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "charge");
            String strOptString2 = StripeJsonUtils.optString(json, "code");
            String strOptString3 = StripeJsonUtils.optString(json, "decline_code");
            String strOptString4 = StripeJsonUtils.optString(json, "doc_url");
            String strOptString5 = StripeJsonUtils.optString(json, "message");
            String strOptString6 = StripeJsonUtils.optString(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new PaymentIntent.Error(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null, PaymentIntent.Error.Type.INSTANCE.fromCode(StripeJsonUtils.optString(json, "type")));
        }

        /* compiled from: PaymentIntentJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ShippingJsonParser implements ModelJsonParser<PaymentIntent.Shipping> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Shipping parse(JSONObject json) {
            Address address;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            return new PaymentIntent.Shipping((jSONObjectOptJSONObject == null || (address = new AddressJsonParser().parse(jSONObjectOptJSONObject)) == null) ? new Address(null, null, null, null, null, null, 63, null) : address, StripeJsonUtils.optString(json, "carrier"), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, "tracking_number"));
        }

        /* compiled from: PaymentIntentJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_RECEIPT_EMAIL", "FIELD_SETUP_FUTURE_USAGE", "FIELD_SHIPPING", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "OBJECT_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
