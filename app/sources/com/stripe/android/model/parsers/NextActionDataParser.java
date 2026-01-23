package com.stripe.android.model.parsers;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NextActionDataParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AlipayRedirectParser", "BlikAuthorizeParser", "CashAppRedirectParser", "Companion", "DisplayBoletoDetailsJsonParser", "DisplayKonbiniDetailsJsonParser", "DisplayMultibancoDetailsJsonParser", "DisplayOxxoDetailsJsonParser", "RedirectToUrlParser", "SdkDataJsonParser", "SwishRedirectParser", "UpiAwaitNotificationParser", "VerifyWithMicrodepositsParser", "WeChatPayRedirectParser", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class NextActionDataParser implements ModelJsonParser<StripeIntent.NextActionData> {
    private static final Companion Companion = new Companion(null);

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeIntent.NextActionData parse(JSONObject json) {
        ModelJsonParser displayOxxoDetailsJsonParser;
        Intrinsics.checkNotNullParameter(json, "json");
        StripeIntent.NextActionType nextActionTypeFromCode$payments_core_release = StripeIntent.NextActionType.INSTANCE.fromCode$payments_core_release(json.optString("type"));
        switch (nextActionTypeFromCode$payments_core_release == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nextActionTypeFromCode$payments_core_release.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                displayOxxoDetailsJsonParser = new DisplayOxxoDetailsJsonParser();
                break;
            case 2:
                displayOxxoDetailsJsonParser = new DisplayBoletoDetailsJsonParser();
                break;
            case 3:
                displayOxxoDetailsJsonParser = new DisplayKonbiniDetailsJsonParser();
                break;
            case 4:
                displayOxxoDetailsJsonParser = new DisplayMultibancoDetailsJsonParser();
                break;
            case 5:
                displayOxxoDetailsJsonParser = new RedirectToUrlParser();
                break;
            case 6:
                displayOxxoDetailsJsonParser = new SdkDataJsonParser();
                break;
            case 7:
                displayOxxoDetailsJsonParser = new AlipayRedirectParser();
                break;
            case 8:
                displayOxxoDetailsJsonParser = new BlikAuthorizeParser();
                break;
            case 9:
                displayOxxoDetailsJsonParser = new WeChatPayRedirectParser();
                break;
            case 10:
                displayOxxoDetailsJsonParser = new VerifyWithMicrodepositsParser();
                break;
            case 11:
                displayOxxoDetailsJsonParser = new UpiAwaitNotificationParser();
                break;
            case 12:
                displayOxxoDetailsJsonParser = new CashAppRedirectParser();
                break;
            case 13:
                displayOxxoDetailsJsonParser = new SwishRedirectParser();
                break;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(nextActionTypeFromCode$payments_core_release.getCode());
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return (StripeIntent.NextActionData) displayOxxoDetailsJsonParser.parse(jSONObjectOptJSONObject);
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class DisplayOxxoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayOxxoDetails> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayOxxoDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.DisplayOxxoDetails(json.optInt("expires_after"), StripeJsonUtils.optString(json, InquiryField.FloatField.TYPE2), StripeJsonUtils.optString(json, "hosted_voucher_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser$Companion;", "", "()V", "FIELD_EXPIRES_AFTER", "", "FIELD_HOSTED_VOUCHER_URL", "FIELD_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayBoletoDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayBoletoDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class DisplayBoletoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayBoletoDetails> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayBoletoDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.DisplayBoletoDetails(StripeJsonUtils.optString(json, "hosted_voucher_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayBoletoDetailsJsonParser$Companion;", "", "()V", "FIELD_HOSTED_VOUCHER_URL", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayKonbiniDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayKonbiniDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class DisplayKonbiniDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayKonbiniDetails> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayKonbiniDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.DisplayKonbiniDetails(StripeJsonUtils.optString(json, "hosted_voucher_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayKonbiniDetailsJsonParser$Companion;", "", "()V", "FIELD_HOSTED_VOUCHER_URL", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayMultibancoDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayMultibancoDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class DisplayMultibancoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayMultibancoDetails> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayMultibancoDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.DisplayMultibancoDetails(StripeJsonUtils.optString(json, "hosted_voucher_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayMultibancoDetailsJsonParser$Companion;", "", "()V", "FIELD_HOSTED_VOUCHER_URL", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class RedirectToUrlParser implements ModelJsonParser<StripeIntent.NextActionData.RedirectToUrl> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.RedirectToUrl parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            if (!json.has("url")) {
                return null;
            }
            Uri uri = Uri.parse(json.getString("url"));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            return new StripeIntent.NextActionData.RedirectToUrl(uri, json.optString("return_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser$Companion;", "", "()V", "FIELD_RETURN_URL", "", "FIELD_URL", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AlipayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.AlipayRedirect> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.AlipayRedirect parse(JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            String string2 = json.getString("native_data");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = json.getString("url");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new StripeIntent.NextActionData.AlipayRedirect(string2, string3, StripeJsonUtils.optString(json, "return_url"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser$Companion;", "", "()V", "FIELD_NATIVE_DATA", "", "FIELD_RETURN_URL", "FIELD_URL", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseDirectoryServerEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class SdkDataJsonParser implements ModelJsonParser<StripeIntent.NextActionData.SdkData> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.SdkData parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "type");
            if (Intrinsics.areEqual(strOptString, "three_d_secure_redirect")) {
                String strOptString2 = json.optString("stripe_js");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                return new StripeIntent.NextActionData.SdkData.Use3DS1(strOptString2);
            }
            if (!Intrinsics.areEqual(strOptString, "stripe_3ds2_fingerprint")) {
                return null;
            }
            String strOptString3 = json.optString("three_d_secure_2_source");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            String strOptString4 = json.optString("directory_server_name");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            String strOptString5 = json.optString("server_transaction_id");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("directory_server_encryption");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new StripeIntent.NextActionData.SdkData.Use3DS2(strOptString3, strOptString4, strOptString5, parseDirectoryServerEncryption(jSONObjectOptJSONObject), StripeJsonUtils.optString(json, "three_d_secure_2_intent"), StripeJsonUtils.optString(json, "publishable_key"));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption parseDirectoryServerEncryption(JSONObject json) {
            List listEmptyList;
            List listJsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(json.optJSONArray("root_certificate_authorities"));
            if (listJsonArrayToList != null) {
                listEmptyList = CollectionsKt.emptyList();
                for (Object obj : listJsonArrayToList) {
                    if (obj instanceof String) {
                        listEmptyList = CollectionsKt.plus((Collection<? extends Object>) listEmptyList, obj);
                    }
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            String strOptString = json.optString("directory_server_id");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = json.optString("certificate");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            return new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption(strOptString, strOptString2, listEmptyList, json.optString("key_id"));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser$Companion;", "", "()V", "FIELD_CERTIFICATE", "", "FIELD_DIRECTORY_SERVER_ENCRYPTION", "FIELD_DIRECTORY_SERVER_ID", "FIELD_DIRECTORY_SERVER_NAME", "FIELD_KEY_ID", "FIELD_PUBLISHABLE_KEY", "FIELD_ROOT_CAS", "FIELD_SERVER_TRANSACTION_ID", "FIELD_STRIPE_JS", "FIELD_THREE_D_SECURE_2_INTENT", "FIELD_THREE_D_SECURE_2_SOURCE", "FIELD_TYPE", "TYPE_3DS1", "TYPE_3DS2", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BlikAuthorizeParser implements ModelJsonParser<StripeIntent.NextActionData.BlikAuthorize> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.BlikAuthorize parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class WeChatPayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.WeChatPayRedirect> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.WeChatPayRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.WeChatPayRedirect(new WeChat(null, json.optString("app_id"), json.optString("nonce_str"), json.optString("package"), json.optString("partner_id"), json.optString("prepay_id"), json.optString("sign"), json.optString("timestamp"), null, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, null));
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser$Companion;", "", "()V", "APP_ID", "", "NONCE_STR", "PACKAGE", "PARTNER_ID", "PREPAY_ID", "SIGN", "TIMESTAMP", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseMicrodepositType", "Lcom/stripe/android/model/MicrodepositType;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class VerifyWithMicrodepositsParser implements ModelJsonParser<StripeIntent.NextActionData.VerifyWithMicrodeposits> {
        private static final Companion Companion = new Companion(null);

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.VerifyWithMicrodeposits parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            long jOptLong = json.optLong("arrival_date");
            String strOptString = json.optString("hosted_verification_url");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new StripeIntent.NextActionData.VerifyWithMicrodeposits(jOptLong, strOptString, parseMicrodepositType(json));
        }

        private final MicrodepositType parseMicrodepositType(JSONObject json) {
            MicrodepositType next;
            Iterator<MicrodepositType> it = MicrodepositType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getValue(), json.optString("microdeposit_type"))) {
                    break;
                }
            }
            MicrodepositType microdepositType = next;
            return microdepositType == null ? MicrodepositType.UNKNOWN : microdepositType;
        }

        /* compiled from: NextActionDataParser.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;", "", "()V", "ARRIVAL_DATE", "", "HOSTED_VERIFICATION_URL", "MICRODEPOSIT_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UpiAwaitNotificationParser implements ModelJsonParser<StripeIntent.NextActionData.UpiAwaitNotification> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.UpiAwaitNotification parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return StripeIntent.NextActionData.UpiAwaitNotification.INSTANCE;
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CashAppRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.CashAppRedirect> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.CashAppRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("mobile_auth_url");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new StripeIntent.NextActionData.CashAppRedirect(strOptString);
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SwishRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SwishRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.SwishRedirect> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.SwishRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("mobile_auth_url");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new StripeIntent.NextActionData.SwishRedirect(strOptString);
        }
    }

    /* compiled from: NextActionDataParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;", "", "()V", "FIELD_NEXT_ACTION_TYPE", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
