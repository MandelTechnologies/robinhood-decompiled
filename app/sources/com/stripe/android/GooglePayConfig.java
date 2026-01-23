package com.stripe.android;

import android.content.Context;
import com.stripe.android.core.ApiKeyValidator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayConfig.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/GooglePayConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "(Lcom/stripe/android/PaymentConfiguration;)V", "publishableKey", "", "connectedAccountId", "(Ljava/lang/String;Ljava/lang/String;)V", "key", "getKey", "()Ljava/lang/String;", "sdkVersion", "tokenizationSpecification", "Lorg/json/JSONObject;", "getTokenizationSpecification", "()Lorg/json/JSONObject;", "validPublishableKey", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GooglePayConfig {
    private static final Companion Companion = new Companion(null);
    private final String connectedAccountId;
    private final String sdkVersion;
    private final String validPublishableKey;

    @JvmOverloads
    public GooglePayConfig(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.connectedAccountId = str;
        this.validPublishableKey = ApiKeyValidator.INSTANCE.get().requireValid(publishableKey);
        this.sdkVersion = "20.50.0";
    }

    public final JSONObject getTokenizationSpecification() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.sdkVersion).put("stripe:publishableKey", getKey()));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final String getKey() {
        String str = this.connectedAccountId;
        if (str != null) {
            String str2 = this.validPublishableKey + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.validPublishableKey;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context) {
        this(PaymentConfiguration.INSTANCE.getInstance(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private GooglePayConfig(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }

    /* compiled from: GooglePayConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/GooglePayConfig$Companion;", "", "()V", "USER_AGENT", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
