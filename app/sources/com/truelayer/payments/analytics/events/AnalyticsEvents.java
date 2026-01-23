package com.truelayer.payments.analytics.events;

import android.os.Build;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.NetworkEvent;
import com.truelayer.payments.analytics.utils.AnalyticsError;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;
import p479j$.util.DesugarTimeZone;

/* compiled from: AnalyticsEvents.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:-\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDB1\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u0082\u0001-EFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopq¨\u0006r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "", "id", "", "type", "providerId", "timeStamp", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getProviderId", "getType", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "getTimeStamp", "intoEvent", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "appAnalytics", "Lcom/truelayer/payments/analytics/events/AppAnalytics;", "analyticsContext", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;", "intoEvent$payments_analytics_release", "AdditionalInputsContinueButtonClicked", "AdditionalInputsLoaded", "AdditionalInputsServerValidationError", "AdditionalInputsSubmitted", "BackgroundError", "BannerHelpLinkTapped", "BranchSelected", "BranchSelectionLoaded", "BranchSelectionSearch", "CountryFlagTapped", "CountrySelected", "CountrySelectionScreenLoaded", "EmbeddedFlowCompleted", "ErrorScreenLoaded", "InfoHowDoesThisWorkOpened", "InfoSecureConnectionOpened", "KeepWaitingTapped", "LegalsOpened", "MandateDetailsOpened", "PaymentCancelled", "PaymentConfirmationLoaded", "PaymentConfirmed", "PaymentResultContinueClicked", "PaymentResultLoaderDisplayed", "PaymentResultScreenLoaded", "PrimingScreenBankLinkClicked", "PrimingScreenContinueClicked", "PrimingScreenLoaded", "ProviderSelected", "ProviderSelectionLoaded", "ProviderSelectionSearch", "RedirectFlowCompleted", "SDKReturnToHostApp", "SDKStarted", "SchemeSelectionLoaded", "SchemeSelectionSubmitted", "StillWaitingDialog", "UICustomised", "UnavailableProviderClicked", "UserAccountDeleteAccountSelected", "UserAccountNewAccountSelected", "UserAccountSelected", "UserAccountSelectionLoaded", "WTF", "WaitLoaded", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsContinueButtonClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsServerValidationError;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsSubmitted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BannerHelpLinkTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionSearch;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountryFlagTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelectionScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$EmbeddedFlowCompleted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$InfoHowDoesThisWorkOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$InfoSecureConnectionOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$KeepWaitingTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$LegalsOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$MandateDetailsOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentCancelled;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmationLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmed;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultContinueClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultLoaderDisplayed;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenBankLinkClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenContinueClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionSearch;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$RedirectFlowCompleted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKStarted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionSubmitted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$StillWaitingDialog;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UICustomised;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UnavailableProviderClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountDeleteAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountNewAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WaitLoaded;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class AnalyticsEvents {
    private final String id;
    private final String providerId;
    private final Date timeStamp;
    private final String type;

    public /* synthetic */ AnalyticsEvents(String str, String str2, String str3, Date date, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, date);
    }

    public JsonElement6 eventMeta$payments_analytics_release() {
        return null;
    }

    private AnalyticsEvents(String str, String str2, String str3, Date date) {
        this.id = str;
        this.type = str2;
        this.providerId = str3;
        this.timeStamp = date;
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "reason", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp$Reason;", "(Ljava/lang/String;Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp$Reason;)V", "getReason", "()Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp$Reason;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Reason", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class SDKReturnToHostApp extends AnalyticsEvents {
        private final Reason reason;

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
            JsonElementBuilders.put(jsonElementBuilders2, "reason", this.reason.name());
            return jsonElementBuilders2.build();
        }

        public /* synthetic */ SDKReturnToHostApp(String str, Reason reason, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, reason);
        }

        public final Reason getReason() {
            return this.reason;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKReturnToHostApp$Reason;", "", "(Ljava/lang/String;I)V", "Failure", "Abort", "AbortProviderTemporarilyUnavailable", "Success", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Reason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            public static final Reason Failure = new Reason("Failure", 0);
            public static final Reason Abort = new Reason("Abort", 1);
            public static final Reason AbortProviderTemporarilyUnavailable = new Reason("AbortProviderTemporarilyUnavailable", 2);
            public static final Reason Success = new Reason("Success", 3);

            private static final /* synthetic */ Reason[] $values() {
                return new Reason[]{Failure, Abort, AbortProviderTemporarilyUnavailable, Success};
            }

            public static EnumEntries<Reason> getEntries() {
                return $ENTRIES;
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }

            private Reason(String str, int i) {
            }

            static {
                Reason[] reasonArr$values = $values();
                $VALUES = reasonArr$values;
                $ENTRIES = EnumEntries2.enumEntries(reasonArr$values);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SDKReturnToHostApp(String str, Reason reason) {
            super(str, "return_to_host_app", null, null, 12, null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public /* synthetic */ AnalyticsEvents(String str, String str2, String str3, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new Date() : date, null);
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SDKStarted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SDKStarted extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public SDKStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ SDKStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public SDKStarted(String str) {
            super(str, "start_initialisation", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$RedirectFlowCompleted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class RedirectFlowCompleted extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public RedirectFlowCompleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RedirectFlowCompleted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public RedirectFlowCompleted(String str) {
            super(str, "final_redirected_to_provider", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$EmbeddedFlowCompleted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class EmbeddedFlowCompleted extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public EmbeddedFlowCompleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ EmbeddedFlowCompleted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public EmbeddedFlowCompleted(String str) {
            super(str, "final_embedded_completed", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\r\u0010\u0010\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "previousProvidersShown", "", "unavailableProvidersIds", "", "", "countryCode", "id", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPreviousProvidersShown", "()Z", "getUnavailableProvidersIds", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ProviderSelectionLoaded extends AnalyticsEvents {
        private final String countryCode;
        private final boolean previousProvidersShown;
        private final List<String> unavailableProvidersIds;

        public /* synthetic */ ProviderSelectionLoaded(boolean z, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, list, str, (i & 8) != 0 ? null : str2);
        }

        public final boolean getPreviousProvidersShown() {
            return this.previousProvidersShown;
        }

        public final List<String> getUnavailableProvidersIds() {
            return this.unavailableProvidersIds;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderSelectionLoaded(boolean z, List<String> unavailableProvidersIds, String countryCode, String str) {
            super(str, "provider_selection_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(unavailableProvidersIds, "unavailableProvidersIds");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.previousProvidersShown = z;
            this.unavailableProvidersIds = unavailableProvidersIds;
            this.countryCode = countryCode;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.previousProvidersShown, CollectionsKt.joinToString$default(this.unavailableProvidersIds, ",", null, null, 0, null, null, 62, null));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B/\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionLoaded$Details;", "", "seen1", "", "previousProvidersShown", "", "unavailableProvidersIds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;)V", "getPreviousProvidersShown$annotations", "()V", "getPreviousProvidersShown", "()Z", "getUnavailableProvidersIds$annotations", "getUnavailableProvidersIds", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean previousProvidersShown;
            private final String unavailableProvidersIds;

            public static /* synthetic */ Details copy$default(Details details, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = details.previousProvidersShown;
                }
                if ((i & 2) != 0) {
                    str = details.unavailableProvidersIds;
                }
                return details.copy(z, str);
            }

            @SerialName("previous_providers_shown")
            public static /* synthetic */ void getPreviousProvidersShown$annotations() {
            }

            @SerialName("unavailable_provider_displayed")
            public static /* synthetic */ void getUnavailableProvidersIds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getPreviousProvidersShown() {
                return this.previousProvidersShown;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUnavailableProvidersIds() {
                return this.unavailableProvidersIds;
            }

            public final Details copy(boolean previousProvidersShown, String unavailableProvidersIds) {
                Intrinsics.checkNotNullParameter(unavailableProvidersIds, "unavailableProvidersIds");
                return new Details(previousProvidersShown, unavailableProvidersIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return this.previousProvidersShown == details.previousProvidersShown && Intrinsics.areEqual(this.unavailableProvidersIds, details.unavailableProvidersIds);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.previousProvidersShown) * 31) + this.unavailableProvidersIds.hashCode();
            }

            public String toString() {
                return "Details(previousProvidersShown=" + this.previousProvidersShown + ", unavailableProvidersIds=" + this.unavailableProvidersIds + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$ProviderSelectionLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("previous_providers_shown") boolean z, @SerialName("unavailable_provider_displayed") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$ProviderSelectionLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.previousProvidersShown = z;
                this.unavailableProvidersIds = str;
            }

            public Details(boolean z, String unavailableProvidersIds) {
                Intrinsics.checkNotNullParameter(unavailableProvidersIds, "unavailableProvidersIds");
                this.previousProvidersShown = z;
                this.unavailableProvidersIds = unavailableProvidersIds;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeBooleanElement(serialDesc, 0, self.previousProvidersShown);
                output.encodeStringElement(serialDesc, 1, self.unavailableProvidersIds);
            }

            public final boolean getPreviousProvidersShown() {
                return this.previousProvidersShown;
            }

            public final String getUnavailableProvidersIds() {
                return this.unavailableProvidersIds;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BranchSelectionLoaded extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public BranchSelectionLoaded() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ BranchSelectionLoaded(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public BranchSelectionLoaded(String str) {
            super(str, "branch_selection_loaded", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "schemeIds", "", "", "id", "(Ljava/util/List;Ljava/lang/String;)V", "getSchemeIds", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class SchemeSelectionLoaded extends AnalyticsEvents {
        private final List<String> schemeIds;

        public /* synthetic */ SchemeSelectionLoaded(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }

        public final List<String> getSchemeIds() {
            return this.schemeIds;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SchemeSelectionLoaded(List<String> schemeIds, String str) {
            super(str, "scheme_selection_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(schemeIds, "schemeIds");
            this.schemeIds = schemeIds;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(CollectionsKt.joinToString$default(this.schemeIds, ",", null, null, 0, null, null, 62, null));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionLoaded$Details;", "", "seen1", "", "schemeIds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getSchemeIds$annotations", "()V", "getSchemeIds", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String schemeIds;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.schemeIds;
                }
                return details.copy(str);
            }

            @SerialName("scheme_ids")
            public static /* synthetic */ void getSchemeIds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getSchemeIds() {
                return this.schemeIds;
            }

            public final Details copy(String schemeIds) {
                Intrinsics.checkNotNullParameter(schemeIds, "schemeIds");
                return new Details(schemeIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.schemeIds, ((Details) other).schemeIds);
            }

            public int hashCode() {
                return this.schemeIds.hashCode();
            }

            public String toString() {
                return "Details(schemeIds=" + this.schemeIds + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$SchemeSelectionLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("scheme_ids") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$SchemeSelectionLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.schemeIds = str;
            }

            public Details(String schemeIds) {
                Intrinsics.checkNotNullParameter(schemeIds, "schemeIds");
                this.schemeIds = schemeIds;
            }

            public final String getSchemeIds() {
                return this.schemeIds;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionSubmitted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "schemeId", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getSchemeId", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class SchemeSelectionSubmitted extends AnalyticsEvents {
        private final String schemeId;

        public /* synthetic */ SchemeSelectionSubmitted(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getSchemeId() {
            return this.schemeId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SchemeSelectionSubmitted(String schemeId, String str) {
            super(str, "scheme_selection_submitted", null, null, 12, null);
            Intrinsics.checkNotNullParameter(schemeId, "schemeId");
            this.schemeId = schemeId;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.schemeId);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionSubmitted$Details;", "", "seen1", "", "schemeId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getSchemeId$annotations", "()V", "getSchemeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String schemeId;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.schemeId;
                }
                return details.copy(str);
            }

            @SerialName("scheme_id")
            public static /* synthetic */ void getSchemeId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getSchemeId() {
                return this.schemeId;
            }

            public final Details copy(String schemeId) {
                Intrinsics.checkNotNullParameter(schemeId, "schemeId");
                return new Details(schemeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.schemeId, ((Details) other).schemeId);
            }

            public int hashCode() {
                return this.schemeId.hashCode();
            }

            public String toString() {
                return "Details(schemeId=" + this.schemeId + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionSubmitted$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$SchemeSelectionSubmitted$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$SchemeSelectionSubmitted$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("scheme_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$SchemeSelectionSubmitted$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.schemeId = str;
            }

            public Details(String schemeId) {
                Intrinsics.checkNotNullParameter(schemeId, "schemeId");
                this.schemeId = schemeId;
            }

            public final String getSchemeId() {
                return this.schemeId;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UnavailableProviderClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "selectedPreviousProvider", "", "providerCountryCode", "id", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getProviderCountryCode", "()Ljava/lang/String;", "getSelectedPreviousProvider", "()Z", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class UnavailableProviderClicked extends AnalyticsEvents {
        private final String providerCountryCode;
        private final boolean selectedPreviousProvider;

        public /* synthetic */ UnavailableProviderClicked(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, (i & 8) != 0 ? null : str3);
        }

        public final boolean getSelectedPreviousProvider() {
            return this.selectedPreviousProvider;
        }

        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnavailableProviderClicked(String providerId, boolean z, String providerCountryCode, String str) {
            super(str, "unavailable_provider_clicked", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
            this.selectedPreviousProvider = z;
            this.providerCountryCode = providerCountryCode;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.selectedPreviousProvider);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UnavailableProviderClicked$Details;", "", "seen1", "", "selectedPreviousProvider", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getSelectedPreviousProvider$annotations", "()V", "getSelectedPreviousProvider", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean selectedPreviousProvider;

            public static /* synthetic */ Details copy$default(Details details, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = details.selectedPreviousProvider;
                }
                return details.copy(z);
            }

            @SerialName("selected_previous_provider")
            public static /* synthetic */ void getSelectedPreviousProvider$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSelectedPreviousProvider() {
                return this.selectedPreviousProvider;
            }

            public final Details copy(boolean selectedPreviousProvider) {
                return new Details(selectedPreviousProvider);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && this.selectedPreviousProvider == ((Details) other).selectedPreviousProvider;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selectedPreviousProvider);
            }

            public String toString() {
                return "Details(selectedPreviousProvider=" + this.selectedPreviousProvider + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UnavailableProviderClicked$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UnavailableProviderClicked$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$UnavailableProviderClicked$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("selected_previous_provider") boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$UnavailableProviderClicked$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.selectedPreviousProvider = z;
            }

            public Details(boolean z) {
                this.selectedPreviousProvider = z;
            }

            public final boolean getSelectedPreviousProvider() {
                return this.selectedPreviousProvider;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionSearch;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "query", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "SearchDetails", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ProviderSelectionSearch extends AnalyticsEvents {
        private final String query;

        public /* synthetic */ ProviderSelectionSearch(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getQuery() {
            return this.query;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderSelectionSearch(String query, String str) {
            super(str, "provider_selection_search", null, null, 12, null);
            Intrinsics.checkNotNullParameter(query, "query");
            this.query = query;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            SearchDetails searchDetails = new SearchDetails(this.query);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(SearchDetails.INSTANCE.serializer(), searchDetails));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionSearch$SearchDetails;", "", "seen1", "", "query", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getQuery$annotations", "()V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class SearchDetails {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String query;

            public static /* synthetic */ SearchDetails copy$default(SearchDetails searchDetails, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = searchDetails.query;
                }
                return searchDetails.copy(str);
            }

            @SerialName("search_string")
            public static /* synthetic */ void getQuery$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getQuery() {
                return this.query;
            }

            public final SearchDetails copy(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return new SearchDetails(query);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SearchDetails) && Intrinsics.areEqual(this.query, ((SearchDetails) other).query);
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            public String toString() {
                return "SearchDetails(query=" + this.query + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionSearch$SearchDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelectionSearch$SearchDetails;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SearchDetails> serializer() {
                    return C42711x4f9dbbc6.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ SearchDetails(int i, @SerialName("search_string") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C42711x4f9dbbc6.INSTANCE.getDescriptor());
                }
                this.query = str;
            }

            public SearchDetails(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                this.query = query;
            }

            public final String getQuery() {
                return this.query;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionSearch;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "query", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "SearchDetails", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BranchSelectionSearch extends AnalyticsEvents {
        private final String query;

        public /* synthetic */ BranchSelectionSearch(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getQuery() {
            return this.query;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BranchSelectionSearch(String query, String str) {
            super(str, "branch_selection_search", null, null, 12, null);
            Intrinsics.checkNotNullParameter(query, "query");
            this.query = query;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            SearchDetails searchDetails = new SearchDetails(this.query);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(SearchDetails.INSTANCE.serializer(), searchDetails));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionSearch$SearchDetails;", "", "seen1", "", "query", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getQuery$annotations", "()V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class SearchDetails {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String query;

            public static /* synthetic */ SearchDetails copy$default(SearchDetails searchDetails, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = searchDetails.query;
                }
                return searchDetails.copy(str);
            }

            @SerialName("search_string")
            public static /* synthetic */ void getQuery$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getQuery() {
                return this.query;
            }

            public final SearchDetails copy(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return new SearchDetails(query);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SearchDetails) && Intrinsics.areEqual(this.query, ((SearchDetails) other).query);
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            public String toString() {
                return "SearchDetails(query=" + this.query + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionSearch$SearchDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelectionSearch$SearchDetails;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SearchDetails> serializer() {
                    return AnalyticsEvents$BranchSelectionSearch$SearchDetails$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ SearchDetails(int i, @SerialName("search_string") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$BranchSelectionSearch$SearchDetails$$serializer.INSTANCE.getDescriptor());
                }
                this.query = str;
            }

            public SearchDetails(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                this.query = query;
            }

            public final String getQuery() {
                return this.query;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\r\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "selectedPreviousProvider", "", "providerCountryCode", "id", "branchId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProviderCountryCode", "()Ljava/lang/String;", "getSelectedPreviousProvider", "()Z", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ProviderSelected extends AnalyticsEvents {
        private final String branchId;
        private final String providerCountryCode;
        private final boolean selectedPreviousProvider;

        public /* synthetic */ ProviderSelected(String str, boolean z, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        public final boolean getSelectedPreviousProvider() {
            return this.selectedPreviousProvider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderSelected(String providerId, boolean z, String providerCountryCode, String str, String str2) {
            super(str, "provider_selected", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
            this.selectedPreviousProvider = z;
            this.providerCountryCode = providerCountryCode;
            this.branchId = str2;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.selectedPreviousProvider, this.branchId);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B/\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelected$Details;", "", "seen1", "", "selectedPreviousProvider", "", "branchId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;)V", "getBranchId$annotations", "()V", "getBranchId", "()Ljava/lang/String;", "getSelectedPreviousProvider$annotations", "getSelectedPreviousProvider", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String branchId;
            private final boolean selectedPreviousProvider;

            public static /* synthetic */ Details copy$default(Details details, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = details.selectedPreviousProvider;
                }
                if ((i & 2) != 0) {
                    str = details.branchId;
                }
                return details.copy(z, str);
            }

            @SerialName("branch_id")
            public static /* synthetic */ void getBranchId$annotations() {
            }

            @SerialName("selected_previous_provider")
            public static /* synthetic */ void getSelectedPreviousProvider$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSelectedPreviousProvider() {
                return this.selectedPreviousProvider;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBranchId() {
                return this.branchId;
            }

            public final Details copy(boolean selectedPreviousProvider, String branchId) {
                return new Details(selectedPreviousProvider, branchId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return this.selectedPreviousProvider == details.selectedPreviousProvider && Intrinsics.areEqual(this.branchId, details.branchId);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.selectedPreviousProvider) * 31;
                String str = this.branchId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Details(selectedPreviousProvider=" + this.selectedPreviousProvider + ", branchId=" + this.branchId + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelected$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ProviderSelected$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$ProviderSelected$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("selected_previous_provider") boolean z, @SerialName("branch_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$ProviderSelected$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.selectedPreviousProvider = z;
                this.branchId = str;
            }

            public Details(boolean z, String str) {
                this.selectedPreviousProvider = z;
                this.branchId = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeBooleanElement(serialDesc, 0, self.selectedPreviousProvider);
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.branchId);
            }

            public final boolean getSelectedPreviousProvider() {
                return this.selectedPreviousProvider;
            }

            public final String getBranchId() {
                return this.branchId;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerCountryCode", "", "id", "branchId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBranchId", "()Ljava/lang/String;", "getProviderCountryCode", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BranchSelected extends AnalyticsEvents {
        private final String branchId;
        private final String providerCountryCode;

        public /* synthetic */ BranchSelected(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getBranchId() {
            return this.branchId;
        }

        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BranchSelected(String providerCountryCode, String str, String str2) {
            super(str, "branch_selected", null, null, 12, null);
            Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
            this.providerCountryCode = providerCountryCode;
            this.branchId = str2;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.branchId);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelected$Details;", "", "seen1", "", "branchId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getBranchId$annotations", "()V", "getBranchId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String branchId;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.branchId;
                }
                return details.copy(str);
            }

            @SerialName("branch_id")
            public static /* synthetic */ void getBranchId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getBranchId() {
                return this.branchId;
            }

            public final Details copy(String branchId) {
                return new Details(branchId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.branchId, ((Details) other).branchId);
            }

            public int hashCode() {
                String str = this.branchId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Details(branchId=" + this.branchId + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelected$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BranchSelected$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$BranchSelected$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("branch_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$BranchSelected$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.branchId = str;
            }

            public Details(String str) {
                this.branchId = str;
            }

            public final String getBranchId() {
                return this.branchId;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsContinueButtonClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "inputs", "", "", "inputTypes", "", "id", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getInputTypes", "()Ljava/util/Map;", "getInputs", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class AdditionalInputsContinueButtonClicked extends AnalyticsEvents {
        private final Map<String, String> inputTypes;
        private final List<String> inputs;

        public /* synthetic */ AdditionalInputsContinueButtonClicked(List list, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, map, (i & 4) != 0 ? null : str);
        }

        public final Map<String, String> getInputTypes() {
            return this.inputTypes;
        }

        public final List<String> getInputs() {
            return this.inputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalInputsContinueButtonClicked(List<String> inputs, Map<String, String> inputTypes, String str) {
            super(str, "additional_inputs_continue_button_clicked", null, null, 12, null);
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(inputTypes, "inputTypes");
            this.inputs = inputs;
            this.inputTypes = inputTypes;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.inputTypes);
            Json.Companion companion = Json.INSTANCE;
            List<String> list = this.inputs;
            companion.getSerializersModule();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            linkedHashMap.put("inputs", companion.encodeToString(new ArrayListSerializer(stringSerializer), list));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap));
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "inputs", "", "", "inputTypes", "", "id", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getInputTypes", "()Ljava/util/Map;", "getInputs", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class AdditionalInputsLoaded extends AnalyticsEvents {
        private final Map<String, String> inputTypes;
        private final List<String> inputs;

        public /* synthetic */ AdditionalInputsLoaded(List list, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, map, (i & 4) != 0 ? null : str);
        }

        public final Map<String, String> getInputTypes() {
            return this.inputTypes;
        }

        public final List<String> getInputs() {
            return this.inputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalInputsLoaded(List<String> inputs, Map<String, String> inputTypes, String str) {
            super(str, "additional_inputs_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(inputTypes, "inputTypes");
            this.inputs = inputs;
            this.inputTypes = inputTypes;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.inputTypes);
            Json.Companion companion = Json.INSTANCE;
            List<String> list = this.inputs;
            companion.getSerializersModule();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            linkedHashMap.put("inputs", companion.encodeToString(new ArrayListSerializer(stringSerializer), list));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap));
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsSubmitted;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "inputs", "", "", "inputTypes", "", "id", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getInputTypes", "()Ljava/util/Map;", "getInputs", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class AdditionalInputsSubmitted extends AnalyticsEvents {
        private final Map<String, String> inputTypes;
        private final List<String> inputs;

        public /* synthetic */ AdditionalInputsSubmitted(List list, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, map, (i & 4) != 0 ? null : str);
        }

        public final Map<String, String> getInputTypes() {
            return this.inputTypes;
        }

        public final List<String> getInputs() {
            return this.inputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalInputsSubmitted(List<String> inputs, Map<String, String> inputTypes, String str) {
            super(str, "additional_inputs_submitted", null, null, 12, null);
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(inputTypes, "inputTypes");
            this.inputs = inputs;
            this.inputTypes = inputTypes;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.inputTypes);
            Json.Companion companion = Json.INSTANCE;
            List<String> list = this.inputs;
            companion.getSerializersModule();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            linkedHashMap.put("inputs", companion.encodeToString(new ArrayListSerializer(stringSerializer), list));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap));
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsServerValidationError;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "inputs", "", "", "id", "(Ljava/util/List;Ljava/lang/String;)V", "getInputs", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class AdditionalInputsServerValidationError extends AnalyticsEvents {
        private final List<String> inputs;

        public /* synthetic */ AdditionalInputsServerValidationError(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }

        public final List<String> getInputs() {
            return this.inputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalInputsServerValidationError(List<String> inputs, String str) {
            super(str, "additional_inputs_server_validation_error", null, null, 12, null);
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.inputs = inputs;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            List<String> list = this.inputs;
            companion.getSerializersModule();
            Details details = new Details(companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsServerValidationError$Details;", "", "seen1", "", "inputs", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getInputs$annotations", "()V", "getInputs", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String inputs;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.inputs;
                }
                return details.copy(str);
            }

            @SerialName("inputs")
            public static /* synthetic */ void getInputs$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getInputs() {
                return this.inputs;
            }

            public final Details copy(String inputs) {
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                return new Details(inputs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.inputs, ((Details) other).inputs);
            }

            public int hashCode() {
                return this.inputs.hashCode();
            }

            public String toString() {
                return "Details(inputs=" + this.inputs + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsServerValidationError$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$AdditionalInputsServerValidationError$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return C42710x9f67b067.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("inputs") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C42710x9f67b067.INSTANCE.getDescriptor());
                }
                this.inputs = str;
            }

            public Details(String inputs) {
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                this.inputs = inputs;
            }

            public final String getInputs() {
                return this.inputs;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WaitLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class WaitLoaded extends AnalyticsEvents {
        public /* synthetic */ WaitLoaded(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitLoaded(String providerId, String str) {
            super(str, "wait_loaded", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$StillWaitingDialog;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class StillWaitingDialog extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public StillWaitingDialog() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ StillWaitingDialog(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public StillWaitingDialog(String str) {
            super(str, "still_waiting_dialog", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$KeepWaitingTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class KeepWaitingTapped extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public KeepWaitingTapped() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ KeepWaitingTapped(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public KeepWaitingTapped(String str) {
            super(str, "keep_waiting_tapped", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$MandateDetailsOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class MandateDetailsOpened extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public MandateDetailsOpened() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ MandateDetailsOpened(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public MandateDetailsOpened(String str) {
            super(str, "mandate_details_opened", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$InfoHowDoesThisWorkOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class InfoHowDoesThisWorkOpened extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public InfoHowDoesThisWorkOpened() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ InfoHowDoesThisWorkOpened(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public InfoHowDoesThisWorkOpened(String str) {
            super(str, "info_how_does_this_work_opened", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmationLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "signUpPlus", "", "id", "(Ljava/lang/String;ZLjava/lang/String;)V", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class PaymentConfirmationLoaded extends AnalyticsEvents {
        private final boolean signUpPlus;

        public /* synthetic */ PaymentConfirmationLoaded(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentConfirmationLoaded(String providerId, boolean z, String str) {
            super(str, "payment_confirmation_loaded", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            this.signUpPlus = z;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.signUpPlus);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmationLoaded$Details;", "", "seen1", "", "signUp", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getSignUp$annotations", "()V", "getSignUp", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean signUp;

            public static /* synthetic */ Details copy$default(Details details, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = details.signUp;
                }
                return details.copy(z);
            }

            @SerialName(AnalyticsStrings.BUTTON_MAX_WELCOME_SIGNUP)
            public static /* synthetic */ void getSignUp$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSignUp() {
                return this.signUp;
            }

            public final Details copy(boolean signUp) {
                return new Details(signUp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && this.signUp == ((Details) other).signUp;
            }

            public int hashCode() {
                return Boolean.hashCode(this.signUp);
            }

            public String toString() {
                return "Details(signUp=" + this.signUp + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmationLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmationLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$PaymentConfirmationLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName(AnalyticsStrings.BUTTON_MAX_WELCOME_SIGNUP) boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$PaymentConfirmationLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.signUp = z;
            }

            public Details(boolean z) {
                this.signUp = z;
            }

            public final boolean getSignUp() {
                return this.signUp;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentConfirmed;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentConfirmed extends AnalyticsEvents {
        public /* synthetic */ PaymentConfirmed(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public PaymentConfirmed(String str, String str2) {
            super(str2, "payment_confirmed", str, null, 8, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentCancelled;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentCancelled extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public PaymentCancelled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PaymentCancelled(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public PaymentCancelled(String str) {
            super(str, "payment_cancelled", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00020\fH\u0010¢\u0006\u0002\b\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BannerHelpLinkTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "key", "", "url", "providerId", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getUrl", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BannerHelpLinkTapped extends AnalyticsEvents {
        private final String key;
        private final String url;

        public /* synthetic */ BannerHelpLinkTapped(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerHelpLinkTapped(String key, String url, String providerId, String str) {
            super(str, "banner_help_link_tapped", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            this.key = key;
            this.url = url;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.key, this.url);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BannerHelpLinkTapped$Details;", "", "seen1", "", "key", "", "url", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey$annotations", "()V", "getKey", "()Ljava/lang/String;", "getUrl$annotations", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final String url;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.key;
                }
                if ((i & 2) != 0) {
                    str2 = details.url;
                }
                return details.copy(str, str2);
            }

            @SerialName("key")
            public static /* synthetic */ void getKey$annotations() {
            }

            @SerialName("url")
            public static /* synthetic */ void getUrl$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Details copy(String key, String url) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(url, "url");
                return new Details(key, url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.key, details.key) && Intrinsics.areEqual(this.url, details.url);
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + this.url.hashCode();
            }

            public String toString() {
                return "Details(key=" + this.key + ", url=" + this.url + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BannerHelpLinkTapped$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BannerHelpLinkTapped$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$BannerHelpLinkTapped$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("key") String str, @SerialName("url") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$BannerHelpLinkTapped$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.url = str2;
            }

            public Details(String key, String url) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(url, "url");
                this.key = key;
                this.url = url;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeStringElement(serialDesc, 1, self.url);
            }

            public final String getKey() {
                return this.key;
            }

            public final String getUrl() {
                return this.url;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$LegalsOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "link", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class LegalsOpened extends AnalyticsEvents {
        private final String link;

        public /* synthetic */ LegalsOpened(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getLink() {
            return this.link;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegalsOpened(String link, String str) {
            super(str, "legals_opened", null, null, 12, null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.link);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$LegalsOpened$Details;", "", "seen1", "", "link", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getLink$annotations", "()V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String link;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.link;
                }
                return details.copy(str);
            }

            @SerialName("link")
            public static /* synthetic */ void getLink$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            public final Details copy(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new Details(link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.link, ((Details) other).link);
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            public String toString() {
                return "Details(link=" + this.link + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$LegalsOpened$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$LegalsOpened$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$LegalsOpened$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("link") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$LegalsOpened$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.link = str;
            }

            public Details(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public final String getLink() {
                return this.link;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$InfoSecureConnectionOpened;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "providerId", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class InfoSecureConnectionOpened extends AnalyticsEvents {
        public /* synthetic */ InfoSecureConnectionOpened(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoSecureConnectionOpened(String providerId, String str) {
            super(str, "info_secure_connection_opened", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "error", "Lcom/truelayer/payments/analytics/utils/AnalyticsError;", "(Ljava/lang/String;Lcom/truelayer/payments/analytics/utils/AnalyticsError;)V", "getError", "()Lcom/truelayer/payments/analytics/utils/AnalyticsError;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ErrorScreenLoaded extends AnalyticsEvents {
        private final AnalyticsError error;

        public /* synthetic */ ErrorScreenLoaded(String str, AnalyticsError analyticsError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, analyticsError);
        }

        public final AnalyticsError getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorScreenLoaded(String str, AnalyticsError error) {
            super(str, "error_screen_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.error.getType().getKey(), this.error.getMessage(), this.error.getShouldRetry(), this.error.getServerResponse(), this.error.getCause(), this.error.getTraceId(), Integer.valueOf(this.error.getAutoRetry()), this.error.getEndpoint(), this.error.getUnderlyingError());
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABB\u0083\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jv\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001J&\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?HÁ\u0001¢\u0006\u0002\b@R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0017\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u001aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u001a¨\u0006C"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded$Details;", "", "seen1", "", "errorType", "", "errorMessage", "shouldRetry", "", "serverResponse", "errorCause", "traceId", "autoRetry", "endpoint", "underlyingError", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAutoRetry$annotations", "()V", "getAutoRetry", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndpoint$annotations", "getEndpoint", "()Ljava/lang/String;", "getErrorCause$annotations", "getErrorCause", "getErrorMessage$annotations", "getErrorMessage", "getErrorType$annotations", "getErrorType", "getServerResponse$annotations", "getServerResponse", "getShouldRetry$annotations", "getShouldRetry", "()Z", "getTraceId$annotations", "getTraceId", "getUnderlyingError$annotations", "getUnderlyingError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded$Details;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Integer autoRetry;
            private final String endpoint;
            private final String errorCause;
            private final String errorMessage;
            private final String errorType;
            private final String serverResponse;
            private final boolean shouldRetry;
            private final String traceId;
            private final String underlyingError;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, boolean z, String str3, String str4, String str5, Integer num, String str6, String str7, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = details.errorMessage;
                }
                if ((i & 4) != 0) {
                    z = details.shouldRetry;
                }
                if ((i & 8) != 0) {
                    str3 = details.serverResponse;
                }
                if ((i & 16) != 0) {
                    str4 = details.errorCause;
                }
                if ((i & 32) != 0) {
                    str5 = details.traceId;
                }
                if ((i & 64) != 0) {
                    num = details.autoRetry;
                }
                if ((i & 128) != 0) {
                    str6 = details.endpoint;
                }
                if ((i & 256) != 0) {
                    str7 = details.underlyingError;
                }
                String str8 = str6;
                String str9 = str7;
                String str10 = str5;
                Integer num2 = num;
                String str11 = str4;
                boolean z2 = z;
                return details.copy(str, str2, z2, str3, str11, str10, num2, str8, str9);
            }

            @SerialName("auto_retry")
            public static /* synthetic */ void getAutoRetry$annotations() {
            }

            @SerialName("endpoint")
            public static /* synthetic */ void getEndpoint$annotations() {
            }

            @SerialName("error_cause")
            public static /* synthetic */ void getErrorCause$annotations() {
            }

            @SerialName("error_message")
            public static /* synthetic */ void getErrorMessage$annotations() {
            }

            @SerialName("error_type")
            public static /* synthetic */ void getErrorType$annotations() {
            }

            @SerialName("server_response")
            public static /* synthetic */ void getServerResponse$annotations() {
            }

            @SerialName("error_should_retry")
            public static /* synthetic */ void getShouldRetry$annotations() {
            }

            @SerialName("tl_trace_id")
            public static /* synthetic */ void getTraceId$annotations() {
            }

            @SerialName("underlying_error")
            public static /* synthetic */ void getUnderlyingError$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getErrorType() {
                return this.errorType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShouldRetry() {
                return this.shouldRetry;
            }

            /* renamed from: component4, reason: from getter */
            public final String getServerResponse() {
                return this.serverResponse;
            }

            /* renamed from: component5, reason: from getter */
            public final String getErrorCause() {
                return this.errorCause;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getAutoRetry() {
                return this.autoRetry;
            }

            /* renamed from: component8, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            /* renamed from: component9, reason: from getter */
            public final String getUnderlyingError() {
                return this.underlyingError;
            }

            public final Details copy(String errorType, String errorMessage, boolean shouldRetry, String serverResponse, String errorCause, String traceId, Integer autoRetry, String endpoint, String underlyingError) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                return new Details(errorType, errorMessage, shouldRetry, serverResponse, errorCause, traceId, autoRetry, endpoint, underlyingError);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.errorType, details.errorType) && Intrinsics.areEqual(this.errorMessage, details.errorMessage) && this.shouldRetry == details.shouldRetry && Intrinsics.areEqual(this.serverResponse, details.serverResponse) && Intrinsics.areEqual(this.errorCause, details.errorCause) && Intrinsics.areEqual(this.traceId, details.traceId) && Intrinsics.areEqual(this.autoRetry, details.autoRetry) && Intrinsics.areEqual(this.endpoint, details.endpoint) && Intrinsics.areEqual(this.underlyingError, details.underlyingError);
            }

            public int hashCode() {
                int iHashCode = this.errorType.hashCode() * 31;
                String str = this.errorMessage;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldRetry)) * 31;
                String str2 = this.serverResponse;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.errorCause;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.traceId;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.autoRetry;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.endpoint;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.underlyingError;
                return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
            }

            public String toString() {
                return "Details(errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ", shouldRetry=" + this.shouldRetry + ", serverResponse=" + this.serverResponse + ", errorCause=" + this.errorCause + ", traceId=" + this.traceId + ", autoRetry=" + this.autoRetry + ", endpoint=" + this.endpoint + ", underlyingError=" + this.underlyingError + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$ErrorScreenLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("error_type") String str, @SerialName("error_message") String str2, @SerialName("error_should_retry") boolean z, @SerialName("server_response") String str3, @SerialName("error_cause") String str4, @SerialName("tl_trace_id") String str5, @SerialName("auto_retry") Integer num, @SerialName("endpoint") String str6, @SerialName("underlying_error") String str7, SerializationConstructorMarker serializationConstructorMarker) {
                if (511 != (i & 511)) {
                    PluginExceptions.throwMissingFieldException(i, 511, AnalyticsEvents$ErrorScreenLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.errorType = str;
                this.errorMessage = str2;
                this.shouldRetry = z;
                this.serverResponse = str3;
                this.errorCause = str4;
                this.traceId = str5;
                this.autoRetry = num;
                this.endpoint = str6;
                this.underlyingError = str7;
            }

            public Details(String errorType, String str, boolean z, String str2, String str3, String str4, Integer num, String str5, String str6) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.errorType = errorType;
                this.errorMessage = str;
                this.shouldRetry = z;
                this.serverResponse = str2;
                this.errorCause = str3;
                this.traceId = str4;
                this.autoRetry = num;
                this.endpoint = str5;
                this.underlyingError = str6;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.errorType);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.errorMessage);
                output.encodeBooleanElement(serialDesc, 2, self.shouldRetry);
                output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.serverResponse);
                output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.errorCause);
                output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.traceId);
                output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.autoRetry);
                output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.endpoint);
                output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.underlyingError);
            }

            public final String getErrorType() {
                return this.errorType;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final boolean getShouldRetry() {
                return this.shouldRetry;
            }

            public final String getServerResponse() {
                return this.serverResponse;
            }

            public final String getErrorCause() {
                return this.errorCause;
            }

            public final String getTraceId() {
                return this.traceId;
            }

            public final Integer getAutoRetry() {
                return this.autoRetry;
            }

            public final String getEndpoint() {
                return this.endpoint;
            }

            public final String getUnderlyingError() {
                return this.underlyingError;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\r\u0010\u0017\u001a\u00020\u0018H\u0010¢\u0006\u0002\b\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "error", "lineNumber", "", "fileName", "stacktrace", "serverResponse", "traceId", "endpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "getError", "getFileName", "getLineNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServerResponse", "getStacktrace", "getTraceId", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BackgroundError extends AnalyticsEvents {
        private final String endpoint;
        private final String error;
        private final String fileName;
        private final Integer lineNumber;
        private final String serverResponse;
        private final String stacktrace;
        private final String traceId;

        public /* synthetic */ BackgroundError(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, num, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
        }

        public final String getError() {
            return this.error;
        }

        public final Integer getLineNumber() {
            return this.lineNumber;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final String getServerResponse() {
            return this.serverResponse;
        }

        public final String getTraceId() {
            return this.traceId;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackgroundError(String str, String error, Integer num, String str2, String str3, String str4, String str5, String str6) {
            super(str, "background_error", null, null, 12, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.lineNumber = num;
            this.fileName = str2;
            this.stacktrace = str3;
            this.serverResponse = str4;
            this.traceId = str5;
            this.endpoint = str6;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.error, this.lineNumber, this.fileName, this.stacktrace, this.serverResponse, this.traceId, this.endpoint);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289Bm\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBK\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006:"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError$Details;", "", "seen1", "", "error", "", "lineNumber", "fileName", "stacktrace", "serverResponse", "traceId", "endpoint", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint$annotations", "()V", "getEndpoint", "()Ljava/lang/String;", "getError$annotations", "getError", "getFileName$annotations", "getFileName", "getLineNumber$annotations", "getLineNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServerResponse$annotations", "getServerResponse", "getStacktrace$annotations", "getStacktrace", "getTraceId$annotations", "getTraceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError$Details;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String endpoint;
            private final String error;
            private final String fileName;
            private final Integer lineNumber;
            private final String serverResponse;
            private final String stacktrace;
            private final String traceId;

            public static /* synthetic */ Details copy$default(Details details, String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.error;
                }
                if ((i & 2) != 0) {
                    num = details.lineNumber;
                }
                if ((i & 4) != 0) {
                    str2 = details.fileName;
                }
                if ((i & 8) != 0) {
                    str3 = details.stacktrace;
                }
                if ((i & 16) != 0) {
                    str4 = details.serverResponse;
                }
                if ((i & 32) != 0) {
                    str5 = details.traceId;
                }
                if ((i & 64) != 0) {
                    str6 = details.endpoint;
                }
                String str7 = str5;
                String str8 = str6;
                String str9 = str4;
                String str10 = str2;
                return details.copy(str, num, str10, str3, str9, str7, str8);
            }

            @SerialName("endpoint")
            public static /* synthetic */ void getEndpoint$annotations() {
            }

            @SerialName("error")
            public static /* synthetic */ void getError$annotations() {
            }

            @SerialName("file_name")
            public static /* synthetic */ void getFileName$annotations() {
            }

            @SerialName("line_number")
            public static /* synthetic */ void getLineNumber$annotations() {
            }

            @SerialName("server_response")
            public static /* synthetic */ void getServerResponse$annotations() {
            }

            @SerialName("stacktrace")
            public static /* synthetic */ void getStacktrace$annotations() {
            }

            @SerialName("tl_trace_id")
            public static /* synthetic */ void getTraceId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getLineNumber() {
                return this.lineNumber;
            }

            /* renamed from: component3, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }

            /* renamed from: component4, reason: from getter */
            public final String getStacktrace() {
                return this.stacktrace;
            }

            /* renamed from: component5, reason: from getter */
            public final String getServerResponse() {
                return this.serverResponse;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component7, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            public final Details copy(String error, Integer lineNumber, String fileName, String stacktrace, String serverResponse, String traceId, String endpoint) {
                return new Details(error, lineNumber, fileName, stacktrace, serverResponse, traceId, endpoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.error, details.error) && Intrinsics.areEqual(this.lineNumber, details.lineNumber) && Intrinsics.areEqual(this.fileName, details.fileName) && Intrinsics.areEqual(this.stacktrace, details.stacktrace) && Intrinsics.areEqual(this.serverResponse, details.serverResponse) && Intrinsics.areEqual(this.traceId, details.traceId) && Intrinsics.areEqual(this.endpoint, details.endpoint);
            }

            public int hashCode() {
                String str = this.error;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.lineNumber;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.fileName;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.stacktrace;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.serverResponse;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.traceId;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.endpoint;
                return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
            }

            public String toString() {
                return "Details(error=" + this.error + ", lineNumber=" + this.lineNumber + ", fileName=" + this.fileName + ", stacktrace=" + this.stacktrace + ", serverResponse=" + this.serverResponse + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$BackgroundError$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$BackgroundError$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("error") String str, @SerialName("line_number") Integer num, @SerialName("file_name") String str2, @SerialName("stacktrace") String str3, @SerialName("server_response") String str4, @SerialName("tl_trace_id") String str5, @SerialName("endpoint") String str6, SerializationConstructorMarker serializationConstructorMarker) {
                if (127 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE)) {
                    PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, AnalyticsEvents$BackgroundError$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.error = str;
                this.lineNumber = num;
                this.fileName = str2;
                this.stacktrace = str3;
                this.serverResponse = str4;
                this.traceId = str5;
                this.endpoint = str6;
            }

            public Details(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
                this.error = str;
                this.lineNumber = num;
                this.fileName = str2;
                this.stacktrace = str3;
                this.serverResponse = str4;
                this.traceId = str5;
                this.endpoint = str6;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.error);
                output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.lineNumber);
                output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.fileName);
                output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.stacktrace);
                output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.serverResponse);
                output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.traceId);
                output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.endpoint);
            }

            public final String getError() {
                return this.error;
            }

            public final Integer getLineNumber() {
                return this.lineNumber;
            }

            public final String getFileName() {
                return this.fileName;
            }

            public final String getStacktrace() {
                return this.stacktrace;
            }

            public final String getServerResponse() {
                return this.serverResponse;
            }

            public final String getTraceId() {
                return this.traceId;
            }

            public final String getEndpoint() {
                return this.endpoint;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\r\u0010\u0010\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "error", "stacktrace", "serverResponse", "traceId", "endpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "getError", "getServerResponse", "getStacktrace", "getTraceId", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class WTF extends AnalyticsEvents {
        private final String endpoint;
        private final String error;
        private final String serverResponse;
        private final String stacktrace;
        private final String traceId;

        public /* synthetic */ WTF(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public final String getError() {
            return this.error;
        }

        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final String getServerResponse() {
            return this.serverResponse;
        }

        public final String getTraceId() {
            return this.traceId;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WTF(String str, String error, String str2, String str3, String str4, String str5) {
            super(str, "wtf", null, null, 12, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.stacktrace = str2;
            this.serverResponse = str3;
            this.traceId = str4;
            this.endpoint = str5;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.error, this.stacktrace, this.serverResponse, this.traceId, this.endpoint);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF$Details;", "", "seen1", "", "error", "", "stacktrace", "serverResponse", "traceId", "endpoint", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint$annotations", "()V", "getEndpoint", "()Ljava/lang/String;", "getError$annotations", "getError", "getServerResponse$annotations", "getServerResponse", "getStacktrace$annotations", "getStacktrace", "getTraceId$annotations", "getTraceId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String endpoint;
            private final String error;
            private final String serverResponse;
            private final String stacktrace;
            private final String traceId;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.error;
                }
                if ((i & 2) != 0) {
                    str2 = details.stacktrace;
                }
                if ((i & 4) != 0) {
                    str3 = details.serverResponse;
                }
                if ((i & 8) != 0) {
                    str4 = details.traceId;
                }
                if ((i & 16) != 0) {
                    str5 = details.endpoint;
                }
                String str6 = str5;
                String str7 = str3;
                return details.copy(str, str2, str7, str4, str6);
            }

            @SerialName("endpoint")
            public static /* synthetic */ void getEndpoint$annotations() {
            }

            @SerialName("error")
            public static /* synthetic */ void getError$annotations() {
            }

            @SerialName("server_response")
            public static /* synthetic */ void getServerResponse$annotations() {
            }

            @SerialName("stacktrace")
            public static /* synthetic */ void getStacktrace$annotations() {
            }

            @SerialName("tl_trace_id")
            public static /* synthetic */ void getTraceId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStacktrace() {
                return this.stacktrace;
            }

            /* renamed from: component3, reason: from getter */
            public final String getServerResponse() {
                return this.serverResponse;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component5, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            public final Details copy(String error, String stacktrace, String serverResponse, String traceId, String endpoint) {
                return new Details(error, stacktrace, serverResponse, traceId, endpoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.error, details.error) && Intrinsics.areEqual(this.stacktrace, details.stacktrace) && Intrinsics.areEqual(this.serverResponse, details.serverResponse) && Intrinsics.areEqual(this.traceId, details.traceId) && Intrinsics.areEqual(this.endpoint, details.endpoint);
            }

            public int hashCode() {
                String str = this.error;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.stacktrace;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.serverResponse;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.traceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.endpoint;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            public String toString() {
                return "Details(error=" + this.error + ", stacktrace=" + this.stacktrace + ", serverResponse=" + this.serverResponse + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$WTF$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("error") String str, @SerialName("stacktrace") String str2, @SerialName("server_response") String str3, @SerialName("tl_trace_id") String str4, @SerialName("endpoint") String str5, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptions.throwMissingFieldException(i, 31, AnalyticsEvents$WTF$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.error = str;
                this.stacktrace = str2;
                this.serverResponse = str3;
                this.traceId = str4;
                this.endpoint = str5;
            }

            public Details(String str, String str2, String str3, String str4, String str5) {
                this.error = str;
                this.stacktrace = str2;
                this.serverResponse = str3;
                this.traceId = str4;
                this.endpoint = str5;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.error);
                output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.stacktrace);
                output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.serverResponse);
                output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.traceId);
                output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.endpoint);
            }

            public final String getError() {
                return this.error;
            }

            public final String getStacktrace() {
                return this.stacktrace;
            }

            public final String getServerResponse() {
                return this.serverResponse;
            }

            public final String getTraceId() {
                return this.traceId;
            }

            public final String getEndpoint() {
                return this.endpoint;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountryFlagTapped;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CountryFlagTapped extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public CountryFlagTapped() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CountryFlagTapped(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public CountryFlagTapped(String str) {
            super(str, "country_flag_tapped", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelectionScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CountrySelectionScreenLoaded extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public CountrySelectionScreenLoaded() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CountrySelectionScreenLoaded(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public CountrySelectionScreenLoaded(String str) {
            super(str, "country_selection_screen_loaded", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "selectedCountryCode", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getSelectedCountryCode", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class CountrySelected extends AnalyticsEvents {
        private final String selectedCountryCode;

        public /* synthetic */ CountrySelected(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountrySelected(String selectedCountryCode, String str) {
            super(str, "country_selected", null, null, 12, null);
            Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
            this.selectedCountryCode = selectedCountryCode;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.selectedCountryCode);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelected$Details;", "", "seen1", "", "selectedCountryCode", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getSelectedCountryCode$annotations", "()V", "getSelectedCountryCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String selectedCountryCode;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.selectedCountryCode;
                }
                return details.copy(str);
            }

            @SerialName("country_code_selected")
            public static /* synthetic */ void getSelectedCountryCode$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getSelectedCountryCode() {
                return this.selectedCountryCode;
            }

            public final Details copy(String selectedCountryCode) {
                Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
                return new Details(selectedCountryCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.selectedCountryCode, ((Details) other).selectedCountryCode);
            }

            public int hashCode() {
                return this.selectedCountryCode.hashCode();
            }

            public String toString() {
                return "Details(selectedCountryCode=" + this.selectedCountryCode + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelected$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$CountrySelected$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$CountrySelected$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("country_code_selected") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$CountrySelected$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.selectedCountryCode = str;
            }

            public Details(String selectedCountryCode) {
                Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
                this.selectedCountryCode = selectedCountryCode;
            }

            public final String getSelectedCountryCode() {
                return this.selectedCountryCode;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UICustomised;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "customisations", "", "", "id", "(Ljava/util/Map;Ljava/lang/String;)V", "getCustomisations", "()Ljava/util/Map;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class UICustomised extends AnalyticsEvents {
        private final Map<String, String> customisations;

        public /* synthetic */ UICustomised(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? null : str);
        }

        public final Map<String, String> getCustomisations() {
            return this.customisations;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UICustomised(Map<String, String> customisations, String str) {
            super(str, "ui_customised", null, null, 12, null);
            Intrinsics.checkNotNullParameter(customisations, "customisations");
            this.customisations = customisations;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Map<String, String> map = this.customisations;
            companion.getSerializersModule();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(new LinkedHashMapSerializer(stringSerializer, stringSerializer), map));
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "bankSpecific", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankSpecific", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class PrimingScreenLoaded extends AnalyticsEvents {
        private final String bankSpecific;

        public /* synthetic */ PrimingScreenLoaded(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getBankSpecific() {
            return this.bankSpecific;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimingScreenLoaded(String bankSpecific, String str) {
            super(str, "priming_screen_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(bankSpecific, "bankSpecific");
            this.bankSpecific = bankSpecific;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.bankSpecific);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenLoaded$Details;", "", "seen1", "", "bankSpecific", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getBankSpecific$annotations", "()V", "getBankSpecific", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String bankSpecific;

            public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.bankSpecific;
                }
                return details.copy(str);
            }

            @SerialName("bank_specific")
            public static /* synthetic */ void getBankSpecific$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getBankSpecific() {
                return this.bankSpecific;
            }

            public final Details copy(String bankSpecific) {
                Intrinsics.checkNotNullParameter(bankSpecific, "bankSpecific");
                return new Details(bankSpecific);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && Intrinsics.areEqual(this.bankSpecific, ((Details) other).bankSpecific);
            }

            public int hashCode() {
                return this.bankSpecific.hashCode();
            }

            public String toString() {
                return "Details(bankSpecific=" + this.bankSpecific + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$PrimingScreenLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("bank_specific") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AnalyticsEvents$PrimingScreenLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.bankSpecific = str;
            }

            public Details(String bankSpecific) {
                Intrinsics.checkNotNullParameter(bankSpecific, "bankSpecific");
                this.bankSpecific = bankSpecific;
            }

            public final String getBankSpecific() {
                return this.bankSpecific;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenBankLinkClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PrimingScreenBankLinkClicked extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public PrimingScreenBankLinkClicked() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PrimingScreenBankLinkClicked(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public PrimingScreenBankLinkClicked(String str) {
            super(str, "priming_screen_bank_link_clicked", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PrimingScreenContinueClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PrimingScreenContinueClicked extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public PrimingScreenContinueClicked() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PrimingScreenContinueClicked(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public PrimingScreenContinueClicked(String str) {
            super(str, "priming_screen_continue_clicked", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelectionLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "numberOfAccounts", "", "unhealthyProviders", "", "(Ljava/lang/String;ILjava/util/List;)V", "getNumberOfAccounts", "()I", "getUnhealthyProviders", "()Ljava/util/List;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class UserAccountSelectionLoaded extends AnalyticsEvents {
        private final int numberOfAccounts;
        private final List<String> unhealthyProviders;

        public /* synthetic */ UserAccountSelectionLoaded(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, i, list);
        }

        public final int getNumberOfAccounts() {
            return this.numberOfAccounts;
        }

        public final List<String> getUnhealthyProviders() {
            return this.unhealthyProviders;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccountSelectionLoaded(String str, int i, List<String> unhealthyProviders) {
            super(str, "user_account_selection_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(unhealthyProviders, "unhealthyProviders");
            this.numberOfAccounts = i;
            this.unhealthyProviders = unhealthyProviders;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(String.valueOf(this.numberOfAccounts), CollectionsKt.joinToString$default(this.unhealthyProviders, ",", "[", "]", 0, null, new Function1<String, CharSequence>() { // from class: com.truelayer.payments.analytics.events.AnalyticsEvents$UserAccountSelectionLoaded$eventMeta$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it;
                }
            }, 24, null));
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelectionLoaded$Details;", "", "seen1", "", "numberOfAccounts", "", "unhealthyProviders", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumberOfAccounts$annotations", "()V", "getNumberOfAccounts", "()Ljava/lang/String;", "getUnhealthyProviders$annotations", "getUnhealthyProviders", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String numberOfAccounts;
            private final String unhealthyProviders;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.numberOfAccounts;
                }
                if ((i & 2) != 0) {
                    str2 = details.unhealthyProviders;
                }
                return details.copy(str, str2);
            }

            @SerialName("number_of_accounts")
            public static /* synthetic */ void getNumberOfAccounts$annotations() {
            }

            @SerialName("unhealthy_providers")
            public static /* synthetic */ void getUnhealthyProviders$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getNumberOfAccounts() {
                return this.numberOfAccounts;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUnhealthyProviders() {
                return this.unhealthyProviders;
            }

            public final Details copy(String numberOfAccounts, String unhealthyProviders) {
                Intrinsics.checkNotNullParameter(numberOfAccounts, "numberOfAccounts");
                Intrinsics.checkNotNullParameter(unhealthyProviders, "unhealthyProviders");
                return new Details(numberOfAccounts, unhealthyProviders);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.numberOfAccounts, details.numberOfAccounts) && Intrinsics.areEqual(this.unhealthyProviders, details.unhealthyProviders);
            }

            public int hashCode() {
                return (this.numberOfAccounts.hashCode() * 31) + this.unhealthyProviders.hashCode();
            }

            public String toString() {
                return "Details(numberOfAccounts=" + this.numberOfAccounts + ", unhealthyProviders=" + this.unhealthyProviders + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelectionLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelectionLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$UserAccountSelectionLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("number_of_accounts") String str, @SerialName("unhealthy_providers") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$UserAccountSelectionLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.numberOfAccounts = str;
                this.unhealthyProviders = str2;
            }

            public Details(String numberOfAccounts, String unhealthyProviders) {
                Intrinsics.checkNotNullParameter(numberOfAccounts, "numberOfAccounts");
                Intrinsics.checkNotNullParameter(unhealthyProviders, "unhealthyProviders");
                this.numberOfAccounts = numberOfAccounts;
                this.unhealthyProviders = unhealthyProviders;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.numberOfAccounts);
                output.encodeStringElement(serialDesc, 1, self.unhealthyProviders);
            }

            public final String getNumberOfAccounts() {
                return this.numberOfAccounts;
            }

            public final String getUnhealthyProviders() {
                return this.unhealthyProviders;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "providerId", "userAccountId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserAccountId", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class UserAccountSelected extends AnalyticsEvents {
        private final String userAccountId;

        public /* synthetic */ UserAccountSelected(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3);
        }

        public final String getUserAccountId() {
            return this.userAccountId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccountSelected(String str, String providerId, String userAccountId) {
            super(str, "user_account_selected", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            this.userAccountId = userAccountId;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            String providerId = getProviderId();
            if (providerId == null) {
                providerId = "";
            }
            Details details = new Details(providerId, this.userAccountId);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelected$Details;", "", "seen1", "", "providerId", "", "userAccountId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "getUserAccountId$annotations", "getUserAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String providerId;
            private final String userAccountId;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.providerId;
                }
                if ((i & 2) != 0) {
                    str2 = details.userAccountId;
                }
                return details.copy(str, str2);
            }

            @SerialName("provider_id")
            public static /* synthetic */ void getProviderId$annotations() {
            }

            @SerialName("user_account_id")
            public static /* synthetic */ void getUserAccountId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getProviderId() {
                return this.providerId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUserAccountId() {
                return this.userAccountId;
            }

            public final Details copy(String providerId, String userAccountId) {
                Intrinsics.checkNotNullParameter(providerId, "providerId");
                Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
                return new Details(providerId, userAccountId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.providerId, details.providerId) && Intrinsics.areEqual(this.userAccountId, details.userAccountId);
            }

            public int hashCode() {
                return (this.providerId.hashCode() * 31) + this.userAccountId.hashCode();
            }

            public String toString() {
                return "Details(providerId=" + this.providerId + ", userAccountId=" + this.userAccountId + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelected$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountSelected$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$UserAccountSelected$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("provider_id") String str, @SerialName("user_account_id") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$UserAccountSelected$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.providerId = str;
                this.userAccountId = str2;
            }

            public Details(String providerId, String userAccountId) {
                Intrinsics.checkNotNullParameter(providerId, "providerId");
                Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
                this.providerId = providerId;
                this.userAccountId = userAccountId;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.providerId);
                output.encodeStringElement(serialDesc, 1, self.userAccountId);
            }

            public final String getProviderId() {
                return this.providerId;
            }

            public final String getUserAccountId() {
                return this.userAccountId;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountNewAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UserAccountNewAccountSelected extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public UserAccountNewAccountSelected() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UserAccountNewAccountSelected(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public UserAccountNewAccountSelected(String str) {
            super(str, "user_account_new_account_selected", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountDeleteAccountSelected;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "providerId", "userAccountId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserAccountId", "()Ljava/lang/String;", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class UserAccountDeleteAccountSelected extends AnalyticsEvents {
        private final String userAccountId;

        public /* synthetic */ UserAccountDeleteAccountSelected(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3);
        }

        public final String getUserAccountId() {
            return this.userAccountId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccountDeleteAccountSelected(String str, String providerId, String userAccountId) {
            super(str, "user_account_delete_account_selected", providerId, null, 8, null);
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
            this.userAccountId = userAccountId;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            String providerId = getProviderId();
            if (providerId == null) {
                providerId = "";
            }
            Details details = new Details(providerId, this.userAccountId);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountDeleteAccountSelected$Details;", "", "seen1", "", "providerId", "", "userAccountId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getProviderId$annotations", "()V", "getProviderId", "()Ljava/lang/String;", "getUserAccountId$annotations", "getUserAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String providerId;
            private final String userAccountId;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.providerId;
                }
                if ((i & 2) != 0) {
                    str2 = details.userAccountId;
                }
                return details.copy(str, str2);
            }

            @SerialName("provider_id")
            public static /* synthetic */ void getProviderId$annotations() {
            }

            @SerialName("user_account_id")
            public static /* synthetic */ void getUserAccountId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getProviderId() {
                return this.providerId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUserAccountId() {
                return this.userAccountId;
            }

            public final Details copy(String providerId, String userAccountId) {
                Intrinsics.checkNotNullParameter(providerId, "providerId");
                Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
                return new Details(providerId, userAccountId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.providerId, details.providerId) && Intrinsics.areEqual(this.userAccountId, details.userAccountId);
            }

            public int hashCode() {
                return (this.providerId.hashCode() * 31) + this.userAccountId.hashCode();
            }

            public String toString() {
                return "Details(providerId=" + this.providerId + ", userAccountId=" + this.userAccountId + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountDeleteAccountSelected$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$UserAccountDeleteAccountSelected$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return C42712xe443e690.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("provider_id") String str, @SerialName("user_account_id") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C42712xe443e690.INSTANCE.getDescriptor());
                }
                this.providerId = str;
                this.userAccountId = str2;
            }

            public Details(String providerId, String userAccountId) {
                Intrinsics.checkNotNullParameter(providerId, "providerId");
                Intrinsics.checkNotNullParameter(userAccountId, "userAccountId");
                this.providerId = providerId;
                this.userAccountId = userAccountId;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.providerId);
                output.encodeStringElement(serialDesc, 1, self.userAccountId);
            }

            public final String getProviderId() {
                return this.providerId;
            }

            public final String getUserAccountId() {
                return this.userAccountId;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultLoaderDisplayed;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentResultLoaderDisplayed extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public PaymentResultLoaderDisplayed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PaymentResultLoaderDisplayed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public PaymentResultLoaderDisplayed(String str) {
            super(str, "payment_result_loader_displayed", null, null, 12, null);
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultScreenLoaded;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "status", "failureReason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFailureReason", "()Ljava/lang/String;", "getStatus", "eventMeta", "Lkotlinx/serialization/json/JsonObject;", "eventMeta$payments_analytics_release", "Details", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class PaymentResultScreenLoaded extends AnalyticsEvents {
        private final String failureReason;
        private final String status;

        public /* synthetic */ PaymentResultScreenLoaded(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3);
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentResultScreenLoaded(String str, String status, String str2) {
            super(str, "payment_result_screen_loaded", null, null, 12, null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.failureReason = str2;
        }

        @Override // com.truelayer.payments.analytics.events.AnalyticsEvents
        public JsonElement6 eventMeta$payments_analytics_release() {
            Json.Companion companion = Json.INSTANCE;
            Details details = new Details(this.status, this.failureReason);
            companion.getSerializersModule();
            return JsonElement3.getJsonObject(companion.encodeToJsonElement(Details.INSTANCE.serializer(), details));
        }

        /* compiled from: AnalyticsEvents.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultScreenLoaded$Details;", "", "seen1", "", "status", "", "failureReason", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getFailureReason$annotations", "()V", "getFailureReason", "()Ljava/lang/String;", "getStatus$annotations", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Details {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String failureReason;
            private final String status;

            public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = details.status;
                }
                if ((i & 2) != 0) {
                    str2 = details.failureReason;
                }
                return details.copy(str, str2);
            }

            @SerialName("failure_reason")
            public static /* synthetic */ void getFailureReason$annotations() {
            }

            @SerialName("status")
            public static /* synthetic */ void getStatus$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            /* renamed from: component2, reason: from getter */
            public final String getFailureReason() {
                return this.failureReason;
            }

            public final Details copy(String status, String failureReason) {
                Intrinsics.checkNotNullParameter(status, "status");
                return new Details(status, failureReason);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return Intrinsics.areEqual(this.status, details.status) && Intrinsics.areEqual(this.failureReason, details.failureReason);
            }

            public int hashCode() {
                int iHashCode = this.status.hashCode() * 31;
                String str = this.failureReason;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Details(status=" + this.status + ", failureReason=" + this.failureReason + ")";
            }

            /* compiled from: AnalyticsEvents.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultScreenLoaded$Details$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultScreenLoaded$Details;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Details> serializer() {
                    return AnalyticsEvents$PaymentResultScreenLoaded$Details$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Details(int i, @SerialName("status") String str, @SerialName("failure_reason") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AnalyticsEvents$PaymentResultScreenLoaded$Details$$serializer.INSTANCE.getDescriptor());
                }
                this.status = str;
                this.failureReason = str2;
            }

            public Details(String status, String str) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.status = status;
                this.failureReason = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_analytics_release(Details self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.status);
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.failureReason);
            }

            public final String getStatus() {
                return this.status;
            }

            public final String getFailureReason() {
                return this.failureReason;
            }
        }
    }

    /* compiled from: AnalyticsEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvents$PaymentResultContinueClicked;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "id", "", "(Ljava/lang/String;)V", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentResultContinueClicked extends AnalyticsEvents {
        /* JADX WARN: Multi-variable type inference failed */
        public PaymentResultContinueClicked() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PaymentResultContinueClicked(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public PaymentResultContinueClicked(String str) {
            super(str, "payment_result_continue_clicked", null, null, 12, null);
        }
    }

    private final String getTimeStamp() {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(this.timeStamp);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final AnalyticsEvent intoEvent$payments_analytics_release(AppAnalytics appAnalytics, TrueLayerAnalytics.AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(appAnalytics, "appAnalytics");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        JsonElement6 jsonElement6EventMeta$payments_analytics_release = eventMeta$payments_analytics_release();
        String str = this.type;
        String id = this.id;
        if (id == null) {
            id = analyticsContext.getId();
        }
        String str2 = id;
        String resourceToken = analyticsContext.getResourceToken();
        String key = analyticsContext.getResourceType().getKey();
        String clientId = appAnalytics.getClientId();
        String providerId = this.providerId;
        if (providerId == null) {
            providerId = analyticsContext.getProviderId();
        }
        String str3 = providerId;
        Long amountInMinor = analyticsContext.getAmountInMinor();
        String currency = analyticsContext.getCurrency();
        String timeStamp = getTimeStamp();
        String providerCountryCode = analyticsContext.getProviderCountryCode();
        String str4 = Build.VERSION.BASE_OS;
        String str5 = Build.VERSION.RELEASE + " API " + appAnalytics.getOsVersion();
        NetworkEvent.ScreenResolution screenResolution = appAnalytics.getScreenResolution();
        String appName = appAnalytics.getAppName();
        String appVersion = appAnalytics.getAppVersion();
        String sdkVersion = appAnalytics.getSdkVersion();
        String deviceId = appAnalytics.getDeviceId();
        String device = appAnalytics.getDevice();
        String deviceMainLanguage = appAnalytics.getDeviceMainLanguage();
        List<String> locales = appAnalytics.getLocales();
        String countryCode = appAnalytics.getCountryCode();
        String typeName = analyticsContext.getIntegrationType().getTypeName();
        String integrationVersion = analyticsContext.getIntegrationVersion();
        Intrinsics.checkNotNull(str4);
        NetworkEvent networkEvent = new NetworkEvent(str, str2, resourceToken, key, clientId, str3, amountInMinor, currency, timeStamp, providerCountryCode, str4, str5, screenResolution, appName, appVersion, sdkVersion, "android", deviceId, device, countryCode, deviceMainLanguage, locales, typeName, integrationVersion, jsonElement6EventMeta$payments_analytics_release);
        Json.Companion companion = Json.INSTANCE;
        companion.getSerializersModule();
        String strEncodeToString = companion.encodeToString(NetworkEvent.INSTANCE.serializer(), networkEvent);
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return new AnalyticsEvent(0, simpleName, strEncodeToString, 0L, 9, null);
    }
}
