package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
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

/* compiled from: SetupIntentJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    private static final Companion Companion = new Companion(null);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SetupIntent parse(JSONObject json) {
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual("setup_intent", StripeJsonUtils.optString(json, "object"))) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethod = jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString = StripeJsonUtils.optString(json, "payment_method");
        if (paymentMethod != null) {
            strOptString = null;
        }
        if (strOptString != null) {
            str = strOptString;
        } else if (paymentMethod != null) {
            strOptString = paymentMethod.id;
            str = strOptString;
        } else {
            str = null;
        }
        ModelJsonParser.Companion companion = ModelJsonParser.INSTANCE;
        List<String> listJsonArrayToList = companion.jsonArrayToList(json.optJSONArray("unactivated_payment_method_types"));
        List<String> listJsonArrayToList2 = companion.jsonArrayToList(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList2, 10));
        Iterator<T> it = listJsonArrayToList2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("payment_method_options");
        String string2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        String strOptString2 = StripeJsonUtils.optString(json, "id");
        long jOptLong = json.optLong("created");
        String strOptString3 = StripeJsonUtils.optString(json, "client_secret");
        SetupIntent.CancellationReason cancellationReasonFromCode$payments_core_release = SetupIntent.CancellationReason.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "cancellation_reason"));
        String strOptString4 = StripeJsonUtils.optString(json, "country_code");
        String strOptString5 = StripeJsonUtils.optString(json, "description");
        boolean zOptBoolean = json.optBoolean("livemode");
        List<String> listJsonArrayToList3 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray("payment_method_types"));
        StripeIntent.Status statusFromCode$payments_core_release = StripeIntent.Status.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "status"));
        StripeIntent.Usage usageFromCode$payments_core_release = StripeIntent.Usage.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("last_setup_error");
        SetupIntent.Error error = jSONObjectOptJSONObject3 != null ? new ErrorJsonParser().parse(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("next_action");
        return new SetupIntent(strOptString2, cancellationReasonFromCode$payments_core_release, jOptLong, strOptString4, strOptString3, strOptString5, zOptBoolean, paymentMethod, str, listJsonArrayToList3, statusFromCode$payments_core_release, usageFromCode$payments_core_release, error, listJsonArrayToList, arrayList, jSONObjectOptJSONObject4 != null ? new NextActionDataParser().parse(jSONObjectOptJSONObject4) : null, string2);
    }

    /* compiled from: SetupIntentJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ErrorJsonParser implements ModelJsonParser<SetupIntent.Error> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SetupIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "code");
            String strOptString2 = StripeJsonUtils.optString(json, "decline_code");
            String strOptString3 = StripeJsonUtils.optString(json, "doc_url");
            String strOptString4 = StripeJsonUtils.optString(json, "message");
            String strOptString5 = StripeJsonUtils.optString(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new SetupIntent.Error(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null, SetupIntent.Error.Type.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type")));
        }

        /* compiled from: SetupIntentJsonParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CODE", "", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SetupIntentJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$Companion;", "", "()V", "FIELD_CANCELLATION_REASON", "", "FIELD_CLIENT_SECRET", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_SETUP_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_USAGE", "VALUE_SETUP_INTENT", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
