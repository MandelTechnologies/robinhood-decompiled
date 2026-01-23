package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.robinhood.models.api.ErrorResponse;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestFactory2;
import com.stripe.android.payments.core.analytics.ErrorReporter2;
import com.stripe.android.utils.MapUtils;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorReporter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u0000 \f2\u00020\u0001:\u0004\f\r\u000e\u000fJ9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "errorEvent", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "", "", "additionalNonPiiParams", "", "report", "(Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V", "Companion", "ErrorEvent", "ExpectedErrorEvent", "UnexpectedErrorEvent", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface ErrorReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ErrorEvent extends AnalyticsRequestFactory2 {
    }

    void report(ErrorEvent errorEvent, StripeException stripeException, Map<String, String> additionalNonPiiParams);

    /* compiled from: ErrorReporter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void report$default(ErrorReporter errorReporter, ErrorEvent errorEvent, StripeException stripeException, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
            }
            if ((i & 2) != 0) {
                stripeException = null;
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            errorReporter.report(errorEvent, stripeException, map);
        }
    }

    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "productUsage", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "createFallbackInstance", "(Landroid/content/Context;Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "", "getAdditionalParamsFromStripeException", "(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorReporter createFallbackInstance$default(Companion companion, Context context, Set set, int i, Object obj) {
            if ((i & 2) != 0) {
                set = SetsKt.emptySet();
            }
            return companion.createFallbackInstance(context, set);
        }

        public final ErrorReporter createFallbackInstance(Context context, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            ErrorReporter2.Builder builder = DaggerDefaultErrorReporterComponent.builder();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return builder.context(applicationContext).productUsage(productUsage).build().getErrorReporter();
        }

        public final Map<String, String> getAdditionalParamsFromStripeException(StripeException stripeException) {
            Intrinsics.checkNotNullParameter(stripeException, "stripeException");
            Integer numValueOf = stripeException.getStatusCode() == 0 ? null : Integer.valueOf(stripeException.getStatusCode());
            Tuples2 tuples2M3642to = Tuples4.m3642to("analytics_value", stripeException.analyticsValue());
            Tuples2 tuples2M3642to2 = Tuples4.m3642to("status_code", numValueOf != null ? numValueOf.toString() : null);
            Tuples2 tuples2M3642to3 = Tuples4.m3642to("request_id", stripeException.getRequestId());
            StripeError stripeError = stripeException.getStripeError();
            Tuples2 tuples2M3642to4 = Tuples4.m3642to("error_type", stripeError != null ? stripeError.getType() : null);
            StripeError stripeError2 = stripeException.getStripeError();
            return MapUtils.filterNotNullValues(MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, Tuples4.m3642to(ErrorResponse.ERROR_CODE, stripeError2 != null ? stripeError2.getCode() : null)));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;", "", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "eventName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "AUTH_WEB_VIEW_FAILURE", "AUTH_WEB_VIEW_NULL_ARGS", "GET_SAVED_PAYMENT_METHODS_FAILURE", "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", "CUSTOMER_SHEET_ADAPTER_NOT_FOUND", "PLACES_FIND_AUTOCOMPLETE_ERROR", "PLACES_FETCH_PLACE_ERROR", "LINK_CREATE_CARD_FAILURE", "LINK_SHARE_CARD_FAILURE", "LINK_LOG_OUT_FAILURE", "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", "BROWSER_LAUNCHER_NULL_ARGS", "GOOGLE_PAY_FAILED", "FRAUD_DETECTION_API_FAILURE", "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", "EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ExpectedErrorEvent implements ErrorEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ExpectedErrorEvent[] $VALUES;
        private final String eventName;
        public static final ExpectedErrorEvent AUTH_WEB_VIEW_FAILURE = new ExpectedErrorEvent("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");
        public static final ExpectedErrorEvent AUTH_WEB_VIEW_NULL_ARGS = new ExpectedErrorEvent("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");
        public static final ExpectedErrorEvent GET_SAVED_PAYMENT_METHODS_FAILURE = new ExpectedErrorEvent("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 3, "elements.customer_sheet.elements_session.load_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 4, "elements.customer_sheet.payment_methods.load_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", 5, "elements.customer_sheet.payment_methods.refresh_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_ADAPTER_NOT_FOUND = new ExpectedErrorEvent("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 6, "elements.customer_sheet.customer_adapter.not_found");
        public static final ExpectedErrorEvent PLACES_FIND_AUTOCOMPLETE_ERROR = new ExpectedErrorEvent("PLACES_FIND_AUTOCOMPLETE_ERROR", 7, "address_element.find_autocomplete.error");
        public static final ExpectedErrorEvent PLACES_FETCH_PLACE_ERROR = new ExpectedErrorEvent("PLACES_FETCH_PLACE_ERROR", 8, "address_element.fetch_place.error");
        public static final ExpectedErrorEvent LINK_CREATE_CARD_FAILURE = new ExpectedErrorEvent("LINK_CREATE_CARD_FAILURE", 9, "link.create_new_card.create_payment_details_failure");
        public static final ExpectedErrorEvent LINK_SHARE_CARD_FAILURE = new ExpectedErrorEvent("LINK_SHARE_CARD_FAILURE", 10, "link.create_new_card.share_payment_details_failure");
        public static final ExpectedErrorEvent LINK_LOG_OUT_FAILURE = new ExpectedErrorEvent("LINK_LOG_OUT_FAILURE", 11, "link.log_out.failure");
        public static final ExpectedErrorEvent PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS = new ExpectedErrorEvent("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 12, "payments.paymentlauncherconfirmation.null_args");
        public static final ExpectedErrorEvent BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND = new ExpectedErrorEvent("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 13, "payments.browserlauncher.activity_not_found");
        public static final ExpectedErrorEvent BROWSER_LAUNCHER_NULL_ARGS = new ExpectedErrorEvent("BROWSER_LAUNCHER_NULL_ARGS", 14, "payments.browserlauncher.null_args");
        public static final ExpectedErrorEvent GOOGLE_PAY_FAILED = new ExpectedErrorEvent("GOOGLE_PAY_FAILED", 15, "google_pay.confirm.error");
        public static final ExpectedErrorEvent FRAUD_DETECTION_API_FAILURE = new ExpectedErrorEvent("FRAUD_DETECTION_API_FAILURE", 16, "fraud_detection_data_repository.api_failure");
        public static final ExpectedErrorEvent EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL = new ExpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 17, "paymentsheet.external_payment_method.confirm_handler_is_null");
        public static final ExpectedErrorEvent EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL = new ExpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", 18, "paymentsheet.external_payment_method.launcher_is_null");

        private static final /* synthetic */ ExpectedErrorEvent[] $values() {
            return new ExpectedErrorEvent[]{AUTH_WEB_VIEW_FAILURE, AUTH_WEB_VIEW_NULL_ARGS, GET_SAVED_PAYMENT_METHODS_FAILURE, CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE, CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE, CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE, CUSTOMER_SHEET_ADAPTER_NOT_FOUND, PLACES_FIND_AUTOCOMPLETE_ERROR, PLACES_FETCH_PLACE_ERROR, LINK_CREATE_CARD_FAILURE, LINK_SHARE_CARD_FAILURE, LINK_LOG_OUT_FAILURE, PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS, BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND, BROWSER_LAUNCHER_NULL_ARGS, GOOGLE_PAY_FAILED, FRAUD_DETECTION_API_FAILURE, EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL};
        }

        public static EnumEntries<ExpectedErrorEvent> getEntries() {
            return $ENTRIES;
        }

        public static ExpectedErrorEvent valueOf(String str) {
            return (ExpectedErrorEvent) Enum.valueOf(ExpectedErrorEvent.class, str);
        }

        public static ExpectedErrorEvent[] values() {
            return (ExpectedErrorEvent[]) $VALUES.clone();
        }

        private ExpectedErrorEvent(String str, int i, String str2) {
            this.eventName = str2;
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        static {
            ExpectedErrorEvent[] expectedErrorEventArr$values = $values();
            $VALUES = expectedErrorEventArr$values;
            $ENTRIES = EnumEntries2.enumEntries(expectedErrorEventArr$values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;", "", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "partialEventName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "eventName", "getEventName", "()Ljava/lang/String;", "getPartialEventName", "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", "MISSING_CARDSCAN_DEPENDENCY", "MISSING_HOSTED_VOUCHER_URL", "MISSING_POLLING_AUTHENTICATOR", "LINK_INVALID_SESSION_STATE", "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", "GOOGLE_PAY_MISSING_INTENT_DATA", "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", "FETCH_PLACE_WITHOUT_DEPENDENCY", "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", "CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UnexpectedErrorEvent implements ErrorEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnexpectedErrorEvent[] $VALUES;
        private final String partialEventName;
        public static final UnexpectedErrorEvent AUTH_WEB_VIEW_BLANK_CLIENT_SECRET = new UnexpectedErrorEvent("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");
        public static final UnexpectedErrorEvent MISSING_CARDSCAN_DEPENDENCY = new UnexpectedErrorEvent("MISSING_CARDSCAN_DEPENDENCY", 1, "cardscan.missing_dependency");
        public static final UnexpectedErrorEvent MISSING_HOSTED_VOUCHER_URL = new UnexpectedErrorEvent("MISSING_HOSTED_VOUCHER_URL", 2, "payments.missing_hosted_voucher_url");
        public static final UnexpectedErrorEvent MISSING_POLLING_AUTHENTICATOR = new UnexpectedErrorEvent("MISSING_POLLING_AUTHENTICATOR", 3, "payments.missing_polling_authenticator");
        public static final UnexpectedErrorEvent LINK_INVALID_SESSION_STATE = new UnexpectedErrorEvent("LINK_INVALID_SESSION_STATE", 4, "link.signup.failure.invalidSessionState");
        public static final UnexpectedErrorEvent GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT = new UnexpectedErrorEvent("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 5, "google_pay.confirm.unexpected_result");
        public static final UnexpectedErrorEvent GOOGLE_PAY_MISSING_INTENT_DATA = new UnexpectedErrorEvent("GOOGLE_PAY_MISSING_INTENT_DATA", 6, "google_pay.on_result.missing_data");
        public static final UnexpectedErrorEvent FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY = new UnexpectedErrorEvent("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 7, "address_element.find_autocomplete.without_dependency");
        public static final UnexpectedErrorEvent FETCH_PLACE_WITHOUT_DEPENDENCY = new UnexpectedErrorEvent("FETCH_PLACE_WITHOUT_DEPENDENCY", 8, "address_element.fetch_place.without_dependency");
        public static final UnexpectedErrorEvent LINK_ATTACH_CARD_WITH_NULL_ACCOUNT = new UnexpectedErrorEvent("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 9, "link.create_new_card.missing_link_account");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND = new UnexpectedErrorEvent("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 10, "paymentsheet.authenticators.not_found");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND = new UnexpectedErrorEvent("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 11, "paymentsheet.loader.elements_session.customer.not_found");
        public static final UnexpectedErrorEvent EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE = new UnexpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 12, "elements.external_payment_methods_serializer.error");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 13, "paymentsheet.no_payment_selection");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 14, "paymentsheet.invalid_payment_selection");
        public static final UnexpectedErrorEvent FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 15, "flow_controller.invalid_payment_selection");
        public static final UnexpectedErrorEvent INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION = new UnexpectedErrorEvent("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 16, "intent_confirmation_handler.invalid_payment_confirmation_option");
        public static final UnexpectedErrorEvent EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE = new UnexpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 17, "paymentsheet.external_payment_method.unexpected_result_code");
        public static final UnexpectedErrorEvent CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION = new UnexpectedErrorEvent("CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", 18, "payments.cvc_recollection_unexpected_payment_selection");

        private static final /* synthetic */ UnexpectedErrorEvent[] $values() {
            return new UnexpectedErrorEvent[]{AUTH_WEB_VIEW_BLANK_CLIENT_SECRET, MISSING_CARDSCAN_DEPENDENCY, MISSING_HOSTED_VOUCHER_URL, MISSING_POLLING_AUTHENTICATOR, LINK_INVALID_SESSION_STATE, GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT, GOOGLE_PAY_MISSING_INTENT_DATA, FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY, FETCH_PLACE_WITHOUT_DEPENDENCY, LINK_ATTACH_CARD_WITH_NULL_ACCOUNT, PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND, PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND, EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE, PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT, PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION, EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE, CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION};
        }

        public static EnumEntries<UnexpectedErrorEvent> getEntries() {
            return $ENTRIES;
        }

        public static UnexpectedErrorEvent valueOf(String str) {
            return (UnexpectedErrorEvent) Enum.valueOf(UnexpectedErrorEvent.class, str);
        }

        public static UnexpectedErrorEvent[] values() {
            return (UnexpectedErrorEvent[]) $VALUES.clone();
        }

        private UnexpectedErrorEvent(String str, int i, String str2) {
            this.partialEventName = str2;
        }

        public final String getPartialEventName() {
            return this.partialEventName;
        }

        static {
            UnexpectedErrorEvent[] unexpectedErrorEventArr$values = $values();
            $VALUES = unexpectedErrorEventArr$values;
            $ENTRIES = EnumEntries2.enumEntries(unexpectedErrorEventArr$values);
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return "unexpected_error." + this.partialEventName;
        }
    }
}
