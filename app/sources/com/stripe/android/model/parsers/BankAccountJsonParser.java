package com.stripe.android.model.parsers;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.BankAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: BankAccountJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/BankAccountJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/BankAccount;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BankAccountJsonParser implements ModelJsonParser<BankAccount> {
    private static final Companion Companion = new Companion(null);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public BankAccount parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new BankAccount(StripeJsonUtils.optString(json, "id"), StripeJsonUtils.optString(json, "account_holder_name"), BankAccount.Type.INSTANCE.fromCode$payments_model_release(StripeJsonUtils.optString(json, "account_holder_type")), StripeJsonUtils.optString(json, "bank_name"), StripeJsonUtils.INSTANCE.optCountryCode(json, PlaceTypes.COUNTRY), StripeJsonUtils.optCurrency(json, "currency"), StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"), StripeJsonUtils.optString(json, "routing_number"), BankAccount.Status.INSTANCE.fromCode$payments_model_release(StripeJsonUtils.optString(json, "status")));
    }

    /* compiled from: BankAccountJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/parsers/BankAccountJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_NAME", "", "FIELD_ACCOUNT_HOLDER_TYPE", "FIELD_BANK_NAME", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_FINGERPRINT", "FIELD_ID", "FIELD_LAST4", "FIELD_ROUTING_NUMBER", "FIELD_STATUS", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
