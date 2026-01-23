package com.stripe.android.networking;

import androidx.annotation.Keep;
import com.stripe.android.core.networking.AnalyticsRequestFactory2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentAnalyticsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bI\b\u0080\u0081\u0002\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001LB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0004H\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bK¨\u0006M"}, m3636d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "eventName", "getEventName", "toString", "TokenCreate", "PaymentMethodCreate", "PaymentMethodUpdate", "CustomerRetrieve", "CustomerRetrievePaymentMethods", "CustomerAttachPaymentMethod", "CustomerDetachPaymentMethod", "CustomerDeleteSource", "CustomerSetShippingInfo", "CustomerAddSource", "CustomerSetDefaultSource", "IssuingRetrievePin", "IssuingUpdatePin", "SourceCreate", "SourceRetrieve", "PaymentIntentConfirm", "PaymentIntentRetrieve", "PaymentIntentRetrieveOrdered", "PaymentIntentCancelSource", "PaymentIntentRefresh", "SetupIntentConfirm", "SetupIntentRetrieve", "SetupIntentRetrieveOrdered", "SetupIntentCancelSource", "SetupIntentRefresh", "PaymentLauncherConfirmStarted", "PaymentLauncherConfirmFinished", "PaymentLauncherNextActionStarted", "PaymentLauncherNextActionFinished", "FileCreate", "Auth3ds1Sdk", "Auth3ds1ChallengeStart", "Auth3ds1ChallengeError", "Auth3ds1ChallengeComplete", "AuthWithWebView", "AuthWithCustomTabs", "AuthWithDefaultBrowser", "ConfirmReturnUrlNull", "ConfirmReturnUrlDefault", "ConfirmReturnUrlCustom", "FpxBankStatusesRetrieve", "StripeUrlRetrieve", "Auth3ds2RequestParamsFailed", "Auth3ds2Fingerprint", "Auth3ds2Start", "Auth3ds2Frictionless", "Auth3ds2ChallengePresented", "Auth3ds2ChallengeCanceled", "Auth3ds2ChallengeCompleted", "Auth3ds2ChallengeErrored", "Auth3ds2ChallengeTimedOut", "Auth3ds2Fallback", "AuthRedirect", "AuthError", "AuthSourceStart", "AuthSourceRedirect", "AuthSourceResult", "RadarSessionCreate", "GooglePayLauncherInit", "GooglePayPaymentMethodLauncherInit", "CardMetadataPublishableKeyAvailable", "CardMetadataPublishableKeyUnavailable", "CardMetadataLoadedTooSlow", "CardMetadataLoadFailure", "CardMetadataMissingRange", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentAnalyticsEvent implements AnalyticsRequestFactory2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentAnalyticsEvent[] $VALUES;
    private static final Companion Companion;
    private final String code;
    public static final PaymentAnalyticsEvent TokenCreate = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");
    public static final PaymentAnalyticsEvent PaymentMethodCreate = new PaymentAnalyticsEvent("PaymentMethodCreate", 1, "payment_method_creation");
    public static final PaymentAnalyticsEvent PaymentMethodUpdate = new PaymentAnalyticsEvent("PaymentMethodUpdate", 2, "payment_method_update");
    public static final PaymentAnalyticsEvent CustomerRetrieve = new PaymentAnalyticsEvent("CustomerRetrieve", 3, "retrieve_customer");
    public static final PaymentAnalyticsEvent CustomerRetrievePaymentMethods = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 4, "retrieve_payment_methods");
    public static final PaymentAnalyticsEvent CustomerAttachPaymentMethod = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 5, "attach_payment_method");
    public static final PaymentAnalyticsEvent CustomerDetachPaymentMethod = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 6, "detach_payment_method");
    public static final PaymentAnalyticsEvent CustomerDeleteSource = new PaymentAnalyticsEvent("CustomerDeleteSource", 7, "delete_source");
    public static final PaymentAnalyticsEvent CustomerSetShippingInfo = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 8, "set_shipping_info");
    public static final PaymentAnalyticsEvent CustomerAddSource = new PaymentAnalyticsEvent("CustomerAddSource", 9, "add_source");
    public static final PaymentAnalyticsEvent CustomerSetDefaultSource = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 10, "default_source");
    public static final PaymentAnalyticsEvent IssuingRetrievePin = new PaymentAnalyticsEvent("IssuingRetrievePin", 11, "issuing_retrieve_pin");
    public static final PaymentAnalyticsEvent IssuingUpdatePin = new PaymentAnalyticsEvent("IssuingUpdatePin", 12, "issuing_update_pin");
    public static final PaymentAnalyticsEvent SourceCreate = new PaymentAnalyticsEvent("SourceCreate", 13, "source_creation");
    public static final PaymentAnalyticsEvent SourceRetrieve = new PaymentAnalyticsEvent("SourceRetrieve", 14, "retrieve_source");
    public static final PaymentAnalyticsEvent PaymentIntentConfirm = new PaymentAnalyticsEvent("PaymentIntentConfirm", 15, "payment_intent_confirmation");
    public static final PaymentAnalyticsEvent PaymentIntentRetrieve = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 16, "payment_intent_retrieval");
    public static final PaymentAnalyticsEvent PaymentIntentRetrieveOrdered = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 17, "payment_intent_retrieval_ordered");
    public static final PaymentAnalyticsEvent PaymentIntentCancelSource = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 18, "payment_intent_cancel_source");
    public static final PaymentAnalyticsEvent PaymentIntentRefresh = new PaymentAnalyticsEvent("PaymentIntentRefresh", 19, "payment_intent_refresh");
    public static final PaymentAnalyticsEvent SetupIntentConfirm = new PaymentAnalyticsEvent("SetupIntentConfirm", 20, "setup_intent_confirmation");
    public static final PaymentAnalyticsEvent SetupIntentRetrieve = new PaymentAnalyticsEvent("SetupIntentRetrieve", 21, "setup_intent_retrieval");
    public static final PaymentAnalyticsEvent SetupIntentRetrieveOrdered = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 22, "setup_intent_retrieval_ordered");
    public static final PaymentAnalyticsEvent SetupIntentCancelSource = new PaymentAnalyticsEvent("SetupIntentCancelSource", 23, "setup_intent_cancel_source");
    public static final PaymentAnalyticsEvent SetupIntentRefresh = new PaymentAnalyticsEvent("SetupIntentRefresh", 24, "setup_intent_refresh");
    public static final PaymentAnalyticsEvent PaymentLauncherConfirmStarted = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 25, "paymenthandler.confirm.started");
    public static final PaymentAnalyticsEvent PaymentLauncherConfirmFinished = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 26, "paymenthandler.confirm.finished");
    public static final PaymentAnalyticsEvent PaymentLauncherNextActionStarted = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 27, "paymenthandler.handle_next_action.started");
    public static final PaymentAnalyticsEvent PaymentLauncherNextActionFinished = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 28, "paymenthandler.handle_next_action.finished");
    public static final PaymentAnalyticsEvent FileCreate = new PaymentAnalyticsEvent("FileCreate", 29, "create_file");
    public static final PaymentAnalyticsEvent Auth3ds1Sdk = new PaymentAnalyticsEvent("Auth3ds1Sdk", 30, "3ds1_sdk");
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeStart = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 31, "3ds1_challenge_start");
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeError = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 32, "3ds1_challenge_error");
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeComplete = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 33, "3ds1_challenge_complete");
    public static final PaymentAnalyticsEvent AuthWithWebView = new PaymentAnalyticsEvent("AuthWithWebView", 34, "auth_with_webview");
    public static final PaymentAnalyticsEvent AuthWithCustomTabs = new PaymentAnalyticsEvent("AuthWithCustomTabs", 35, "auth_with_customtabs");
    public static final PaymentAnalyticsEvent AuthWithDefaultBrowser = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 36, "auth_with_defaultbrowser");
    public static final PaymentAnalyticsEvent ConfirmReturnUrlNull = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 37, "confirm_returnurl_null");
    public static final PaymentAnalyticsEvent ConfirmReturnUrlDefault = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 38, "confirm_returnurl_default");
    public static final PaymentAnalyticsEvent ConfirmReturnUrlCustom = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 39, "confirm_returnurl_custom");
    public static final PaymentAnalyticsEvent FpxBankStatusesRetrieve = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 40, "retrieve_fpx_bank_statuses");
    public static final PaymentAnalyticsEvent StripeUrlRetrieve = new PaymentAnalyticsEvent("StripeUrlRetrieve", 41, "retrieve_stripe_url");
    public static final PaymentAnalyticsEvent Auth3ds2RequestParamsFailed = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 42, "3ds2_authentication_request_params_failed");
    public static final PaymentAnalyticsEvent Auth3ds2Fingerprint = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 43, "3ds2_fingerprint");
    public static final PaymentAnalyticsEvent Auth3ds2Start = new PaymentAnalyticsEvent("Auth3ds2Start", 44, "3ds2_authenticate");
    public static final PaymentAnalyticsEvent Auth3ds2Frictionless = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 45, "3ds2_frictionless_flow");
    public static final PaymentAnalyticsEvent Auth3ds2ChallengePresented = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 46, "3ds2_challenge_flow_presented");
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeCanceled = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 47, "3ds2_challenge_flow_canceled");
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeCompleted = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 48, "3ds2_challenge_flow_completed");
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeErrored = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 49, "3ds2_challenge_flow_errored");
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeTimedOut = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 50, "3ds2_challenge_flow_timed_out");
    public static final PaymentAnalyticsEvent Auth3ds2Fallback = new PaymentAnalyticsEvent("Auth3ds2Fallback", 51, "3ds2_fallback");
    public static final PaymentAnalyticsEvent AuthRedirect = new PaymentAnalyticsEvent("AuthRedirect", 52, "url_redirect_next_action");
    public static final PaymentAnalyticsEvent AuthError = new PaymentAnalyticsEvent("AuthError", 53, "auth_error");
    public static final PaymentAnalyticsEvent AuthSourceStart = new PaymentAnalyticsEvent("AuthSourceStart", 54, "auth_source_start");
    public static final PaymentAnalyticsEvent AuthSourceRedirect = new PaymentAnalyticsEvent("AuthSourceRedirect", 55, "auth_source_redirect");
    public static final PaymentAnalyticsEvent AuthSourceResult = new PaymentAnalyticsEvent("AuthSourceResult", 56, "auth_source_result");
    public static final PaymentAnalyticsEvent RadarSessionCreate = new PaymentAnalyticsEvent("RadarSessionCreate", 57, "radar_session_create");
    public static final PaymentAnalyticsEvent GooglePayLauncherInit = new PaymentAnalyticsEvent("GooglePayLauncherInit", 58, "googlepaylauncher_init");
    public static final PaymentAnalyticsEvent GooglePayPaymentMethodLauncherInit = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 59, "googlepaypaymentmethodlauncher_init");
    public static final PaymentAnalyticsEvent CardMetadataPublishableKeyAvailable = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 60, "card_metadata_pk_available");
    public static final PaymentAnalyticsEvent CardMetadataPublishableKeyUnavailable = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 61, "card_metadata_pk_unavailable");
    public static final PaymentAnalyticsEvent CardMetadataLoadedTooSlow = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 62, "card_metadata_loaded_too_slow");
    public static final PaymentAnalyticsEvent CardMetadataLoadFailure = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 63, "card_metadata_load_failure");
    public static final PaymentAnalyticsEvent CardMetadataMissingRange = new PaymentAnalyticsEvent("CardMetadataMissingRange", 64, "card_metadata_missing_range");

    private static final /* synthetic */ PaymentAnalyticsEvent[] $values() {
        return new PaymentAnalyticsEvent[]{TokenCreate, PaymentMethodCreate, PaymentMethodUpdate, CustomerRetrieve, CustomerRetrievePaymentMethods, CustomerAttachPaymentMethod, CustomerDetachPaymentMethod, CustomerDeleteSource, CustomerSetShippingInfo, CustomerAddSource, CustomerSetDefaultSource, IssuingRetrievePin, IssuingUpdatePin, SourceCreate, SourceRetrieve, PaymentIntentConfirm, PaymentIntentRetrieve, PaymentIntentRetrieveOrdered, PaymentIntentCancelSource, PaymentIntentRefresh, SetupIntentConfirm, SetupIntentRetrieve, SetupIntentRetrieveOrdered, SetupIntentCancelSource, SetupIntentRefresh, PaymentLauncherConfirmStarted, PaymentLauncherConfirmFinished, PaymentLauncherNextActionStarted, PaymentLauncherNextActionFinished, FileCreate, Auth3ds1Sdk, Auth3ds1ChallengeStart, Auth3ds1ChallengeError, Auth3ds1ChallengeComplete, AuthWithWebView, AuthWithCustomTabs, AuthWithDefaultBrowser, ConfirmReturnUrlNull, ConfirmReturnUrlDefault, ConfirmReturnUrlCustom, FpxBankStatusesRetrieve, StripeUrlRetrieve, Auth3ds2RequestParamsFailed, Auth3ds2Fingerprint, Auth3ds2Start, Auth3ds2Frictionless, Auth3ds2ChallengePresented, Auth3ds2ChallengeCanceled, Auth3ds2ChallengeCompleted, Auth3ds2ChallengeErrored, Auth3ds2ChallengeTimedOut, Auth3ds2Fallback, AuthRedirect, AuthError, AuthSourceStart, AuthSourceRedirect, AuthSourceResult, RadarSessionCreate, GooglePayLauncherInit, GooglePayPaymentMethodLauncherInit, CardMetadataPublishableKeyAvailable, CardMetadataPublishableKeyUnavailable, CardMetadataLoadedTooSlow, CardMetadataLoadFailure, CardMetadataMissingRange};
    }

    public static EnumEntries<PaymentAnalyticsEvent> getEntries() {
        return $ENTRIES;
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) $VALUES.clone();
    }

    private PaymentAnalyticsEvent(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        PaymentAnalyticsEvent[] paymentAnalyticsEventArr$values = $values();
        $VALUES = paymentAnalyticsEventArr$values;
        $ENTRIES = EnumEntries2.enumEntries(paymentAnalyticsEventArr$values);
        Companion = new Companion(null);
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return "stripe_android." + this.code;
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
    public String getEventName() {
        return toString();
    }

    /* compiled from: PaymentAnalyticsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;", "", "()V", "PREFIX", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
