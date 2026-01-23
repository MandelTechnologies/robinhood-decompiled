package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarSessionWithHCaptchaJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RadarSessionWithHCaptchaJsonParser implements ModelJsonParser<RadarSessionWithHCaptcha> {
    private static final Companion Companion = new Companion(null);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public RadarSessionWithHCaptcha parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "id");
        if (strOptString != null) {
            return new RadarSessionWithHCaptcha(strOptString, StripeJsonUtils.optString(json, "passive_captcha_site_key"), StripeJsonUtils.optString(json, "passive_captcha_rqdata"));
        }
        return null;
    }

    /* compiled from: RadarSessionWithHCaptchaJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser$Companion;", "", "()V", "FIELD_ID", "", "FIELD_PASSIVE_CAPTCHA_RQDATA", "FIELD_PASSIVE_CAPTCHA_SITE_KEY", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
