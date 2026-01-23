package com.stripe.android.analytics;

import com.stripe.android.core.networking.AnalyticsRequestFactory2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;

/* compiled from: PaymentSessionEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0006\u000b\n\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "<init>", "()V", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "additionalParams", "Companion", "CardNumberCompleted", "LoadStarted", "PaymentOptionFormInteraction", "ShowPaymentOptionForm", "TapDoneButton", "Lcom/stripe/android/analytics/PaymentSessionEvent$CardNumberCompleted;", "Lcom/stripe/android/analytics/PaymentSessionEvent$LoadStarted;", "Lcom/stripe/android/analytics/PaymentSessionEvent$PaymentOptionFormInteraction;", "Lcom/stripe/android/analytics/PaymentSessionEvent$ShowPaymentOptionForm;", "Lcom/stripe/android/analytics/PaymentSessionEvent$TapDoneButton;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PaymentSessionEvent implements AnalyticsRequestFactory2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PaymentSessionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> getAdditionalParams();

    private PaymentSessionEvent() {
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$LoadStarted;", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class LoadStarted extends PaymentSessionEvent {
        private final Map<String, Object> additionalParams;
        private final String eventName;

        public LoadStarted() {
            super(null);
            this.eventName = "bi_load_started";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.analytics.PaymentSessionEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$ShowPaymentOptionForm;", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "code", "", "(Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ShowPaymentOptionForm extends PaymentSessionEvent {
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPaymentOptionForm(String code) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.eventName = "bi_form_shown";
            this.additionalParams = MapsKt.mapOf(Tuples4.m3642to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.analytics.PaymentSessionEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$PaymentOptionFormInteraction;", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "code", "", "(Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentOptionFormInteraction extends PaymentSessionEvent {
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentOptionFormInteraction(String code) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.eventName = "bi_form_interacted";
            this.additionalParams = MapsKt.mapOf(Tuples4.m3642to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.analytics.PaymentSessionEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$CardNumberCompleted;", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CardNumberCompleted extends PaymentSessionEvent {
        private final Map<String, Object> additionalParams;
        private final String eventName;

        public CardNumberCompleted() {
            super(null);
            this.eventName = "bi_card_number_completed";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.analytics.PaymentSessionEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$TapDoneButton;", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "code", "", "duration", "Lkotlin/time/Duration;", "(Ljava/lang/String;Lkotlin/time/Duration;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class TapDoneButton extends PaymentSessionEvent {
        private final Map<String, Object> additionalParams;
        private final String eventName;

        public /* synthetic */ TapDoneButton(String str, Duration duration, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, duration);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private TapDoneButton(String code, Duration duration) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(code, "code");
            this.eventName = "bi_done_button_tapped";
            this.additionalParams = MapsKt.mapOf(Tuples4.m3642to("selected_lpm", code), Tuples4.m3642to("duration", duration != null ? Float.valueOf(PaymentSessionEvent.INSTANCE.m26844getAsSecondsLRDsOJo(duration.getRawValue())) : null));
        }

        @Override // com.stripe.android.core.networking.AnalyticsRequestFactory2
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.analytics.PaymentSessionEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSessionEvent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEvent$Companion;", "", "()V", "FIELD_DURATION", "", "FIELD_ERROR_MESSAGE", "FIELD_SELECTED_LPM", "asSeconds", "", "Lkotlin/time/Duration;", "getAsSeconds-LRDsOJo", "(J)F", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getAsSeconds-LRDsOJo, reason: not valid java name */
        public final float m26844getAsSecondsLRDsOJo(long j) {
            return (float) Duration.m28758toDoubleimpl(j, DurationUnitJvm.SECONDS);
        }
    }
}
