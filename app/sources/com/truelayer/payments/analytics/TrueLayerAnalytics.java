package com.truelayer.payments.analytics;

import android.content.Context;
import androidx.work.WorkManager;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.truelayer.payments.analytics.configuration.AnalyticsNetworkConfiguration;
import com.truelayer.payments.analytics.configuration.Environment;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.truelayer.payments.analytics.store.AnalyticsStore2;
import com.truelayer.payments.analytics.utils.ResourceType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrueLayerAnalytics.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "", "track", "", "event", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents;", "AnalyticsContext", "Companion", "Configuration", "IntegrationType", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface TrueLayerAnalytics {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void track(AnalyticsEvents event);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrueLayerAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "Native", "ReactNative", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class IntegrationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IntegrationType[] $VALUES;
        public static final IntegrationType Native = new IntegrationType("Native", 0, "native");
        public static final IntegrationType ReactNative = new IntegrationType("ReactNative", 1, "react-native");
        private final String typeName;

        private static final /* synthetic */ IntegrationType[] $values() {
            return new IntegrationType[]{Native, ReactNative};
        }

        public static EnumEntries<IntegrationType> getEntries() {
            return $ENTRIES;
        }

        public static IntegrationType valueOf(String str) {
            return (IntegrationType) Enum.valueOf(IntegrationType.class, str);
        }

        public static IntegrationType[] values() {
            return (IntegrationType[]) $VALUES.clone();
        }

        private IntegrationType(String str, int i, String str2) {
            this.typeName = str2;
        }

        public final String getTypeName() {
            return this.typeName;
        }

        static {
            IntegrationType[] integrationTypeArr$values = $values();
            $VALUES = integrationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(integrationTypeArr$values);
        }
    }

    /* compiled from: TrueLayerAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jr\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006<"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;", "", "id", "", "providerId", "resourceToken", "resourceType", "Lcom/truelayer/payments/analytics/utils/ResourceType;", "providerCountryCode", "amountInMinor", "", "currency", "integrationType", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;", "integrationVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/utils/ResourceType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;Ljava/lang/String;)V", "getAmountInMinor", "()Ljava/lang/Long;", "setAmountInMinor", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getId", "setId", "getIntegrationType", "()Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;", "setIntegrationType", "(Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;)V", "getIntegrationVersion", "setIntegrationVersion", "getProviderCountryCode", "setProviderCountryCode", "getProviderId", "setProviderId", "getResourceToken", "setResourceToken", "getResourceType", "()Lcom/truelayer/payments/analytics/utils/ResourceType;", "setResourceType", "(Lcom/truelayer/payments/analytics/utils/ResourceType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/utils/ResourceType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/truelayer/payments/analytics/TrueLayerAnalytics$IntegrationType;Ljava/lang/String;)Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;", "equals", "", "other", "hashCode", "", "toString", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AnalyticsContext {
        private Long amountInMinor;
        private String currency;
        private String id;
        private IntegrationType integrationType;
        private String integrationVersion;
        private String providerCountryCode;
        private String providerId;
        private String resourceToken;
        private ResourceType resourceType;

        public static /* synthetic */ AnalyticsContext copy$default(AnalyticsContext analyticsContext, String str, String str2, String str3, ResourceType resourceType, String str4, Long l, String str5, IntegrationType integrationType, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analyticsContext.id;
            }
            if ((i & 2) != 0) {
                str2 = analyticsContext.providerId;
            }
            if ((i & 4) != 0) {
                str3 = analyticsContext.resourceToken;
            }
            if ((i & 8) != 0) {
                resourceType = analyticsContext.resourceType;
            }
            if ((i & 16) != 0) {
                str4 = analyticsContext.providerCountryCode;
            }
            if ((i & 32) != 0) {
                l = analyticsContext.amountInMinor;
            }
            if ((i & 64) != 0) {
                str5 = analyticsContext.currency;
            }
            if ((i & 128) != 0) {
                integrationType = analyticsContext.integrationType;
            }
            if ((i & 256) != 0) {
                str6 = analyticsContext.integrationVersion;
            }
            IntegrationType integrationType2 = integrationType;
            String str7 = str6;
            Long l2 = l;
            String str8 = str5;
            String str9 = str4;
            String str10 = str3;
            return analyticsContext.copy(str, str2, str10, resourceType, str9, l2, str8, integrationType2, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getResourceToken() {
            return this.resourceToken;
        }

        /* renamed from: component4, reason: from getter */
        public final ResourceType getResourceType() {
            return this.resourceType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: component8, reason: from getter */
        public final IntegrationType getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component9, reason: from getter */
        public final String getIntegrationVersion() {
            return this.integrationVersion;
        }

        public final AnalyticsContext copy(String id, String providerId, String resourceToken, ResourceType resourceType, String providerCountryCode, Long amountInMinor, String currency, IntegrationType integrationType, String integrationVersion) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(resourceType, "resourceType");
            Intrinsics.checkNotNullParameter(integrationType, "integrationType");
            return new AnalyticsContext(id, providerId, resourceToken, resourceType, providerCountryCode, amountInMinor, currency, integrationType, integrationVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsContext)) {
                return false;
            }
            AnalyticsContext analyticsContext = (AnalyticsContext) other;
            return Intrinsics.areEqual(this.id, analyticsContext.id) && Intrinsics.areEqual(this.providerId, analyticsContext.providerId) && Intrinsics.areEqual(this.resourceToken, analyticsContext.resourceToken) && this.resourceType == analyticsContext.resourceType && Intrinsics.areEqual(this.providerCountryCode, analyticsContext.providerCountryCode) && Intrinsics.areEqual(this.amountInMinor, analyticsContext.amountInMinor) && Intrinsics.areEqual(this.currency, analyticsContext.currency) && this.integrationType == analyticsContext.integrationType && Intrinsics.areEqual(this.integrationVersion, analyticsContext.integrationVersion);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.providerId;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.resourceToken.hashCode()) * 31) + this.resourceType.hashCode()) * 31;
            String str2 = this.providerCountryCode;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.amountInMinor;
            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.currency;
            int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.integrationType.hashCode()) * 31;
            String str4 = this.integrationVersion;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "AnalyticsContext(id=" + this.id + ", providerId=" + this.providerId + ", resourceToken=" + this.resourceToken + ", resourceType=" + this.resourceType + ", providerCountryCode=" + this.providerCountryCode + ", amountInMinor=" + this.amountInMinor + ", currency=" + this.currency + ", integrationType=" + this.integrationType + ", integrationVersion=" + this.integrationVersion + ")";
        }

        public AnalyticsContext(String id, String str, String resourceToken, ResourceType resourceType, String str2, Long l, String str3, IntegrationType integrationType, String str4) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            Intrinsics.checkNotNullParameter(resourceType, "resourceType");
            Intrinsics.checkNotNullParameter(integrationType, "integrationType");
            this.id = id;
            this.providerId = str;
            this.resourceToken = resourceToken;
            this.resourceType = resourceType;
            this.providerCountryCode = str2;
            this.amountInMinor = l;
            this.currency = str3;
            this.integrationType = integrationType;
            this.integrationVersion = str4;
        }

        public final String getId() {
            return this.id;
        }

        public final void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public final void setProviderId(String str) {
            this.providerId = str;
        }

        public final String getResourceToken() {
            return this.resourceToken;
        }

        public final void setResourceToken(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.resourceToken = str;
        }

        public final ResourceType getResourceType() {
            return this.resourceType;
        }

        public final void setResourceType(ResourceType resourceType) {
            Intrinsics.checkNotNullParameter(resourceType, "<set-?>");
            this.resourceType = resourceType;
        }

        public final String getProviderCountryCode() {
            return this.providerCountryCode;
        }

        public final void setProviderCountryCode(String str) {
            this.providerCountryCode = str;
        }

        public final Long getAmountInMinor() {
            return this.amountInMinor;
        }

        public final void setAmountInMinor(Long l) {
            this.amountInMinor = l;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final void setCurrency(String str) {
            this.currency = str;
        }

        public /* synthetic */ AnalyticsContext(String str, String str2, String str3, ResourceType resourceType, String str4, Long l, String str5, IntegrationType integrationType, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, resourceType, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? IntegrationType.Native : integrationType, (i & 256) != 0 ? null : str6);
        }

        public final IntegrationType getIntegrationType() {
            return this.integrationType;
        }

        public final void setIntegrationType(IntegrationType integrationType) {
            Intrinsics.checkNotNullParameter(integrationType, "<set-?>");
            this.integrationType = integrationType;
        }

        public final String getIntegrationVersion() {
            return this.integrationVersion;
        }

        public final void setIntegrationVersion(String str) {
            this.integrationVersion = str;
        }
    }

    /* compiled from: TrueLayerAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Configuration;", "", "environment", "Lcom/truelayer/payments/analytics/configuration/Environment;", Auth.DEVELOPER_NAME, "", "sdkVersion", "networkConfiguration", "Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "startSendingEventsAutomatically", "", "(Lcom/truelayer/payments/analytics/configuration/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;Z)V", "getClientId", "()Ljava/lang/String;", "getEnvironment", "()Lcom/truelayer/payments/analytics/configuration/Environment;", "getNetworkConfiguration", "()Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "getSdkVersion", "setSdkVersion", "(Ljava/lang/String;)V", "getStartSendingEventsAutomatically", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Configuration {
        private final String clientId;
        private final Environment environment;
        private final AnalyticsNetworkConfiguration networkConfiguration;
        private String sdkVersion;
        private final boolean startSendingEventsAutomatically;

        public Configuration() {
            this(null, null, null, null, false, 31, null);
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, Environment environment, String str, String str2, AnalyticsNetworkConfiguration analyticsNetworkConfiguration, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                environment = configuration.environment;
            }
            if ((i & 2) != 0) {
                str = configuration.clientId;
            }
            if ((i & 4) != 0) {
                str2 = configuration.sdkVersion;
            }
            if ((i & 8) != 0) {
                analyticsNetworkConfiguration = configuration.networkConfiguration;
            }
            if ((i & 16) != 0) {
                z = configuration.startSendingEventsAutomatically;
            }
            boolean z2 = z;
            String str3 = str2;
            return configuration.copy(environment, str, str3, analyticsNetworkConfiguration, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        /* renamed from: component4, reason: from getter */
        public final AnalyticsNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getStartSendingEventsAutomatically() {
            return this.startSendingEventsAutomatically;
        }

        public final Configuration copy(Environment environment, String clientId, String sdkVersion, AnalyticsNetworkConfiguration networkConfiguration, boolean startSendingEventsAutomatically) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
            return new Configuration(environment, clientId, sdkVersion, networkConfiguration, startSendingEventsAutomatically);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.environment == configuration.environment && Intrinsics.areEqual(this.clientId, configuration.clientId) && Intrinsics.areEqual(this.sdkVersion, configuration.sdkVersion) && Intrinsics.areEqual(this.networkConfiguration, configuration.networkConfiguration) && this.startSendingEventsAutomatically == configuration.startSendingEventsAutomatically;
        }

        public int hashCode() {
            int iHashCode = this.environment.hashCode() * 31;
            String str = this.clientId;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sdkVersion.hashCode()) * 31) + this.networkConfiguration.hashCode()) * 31) + Boolean.hashCode(this.startSendingEventsAutomatically);
        }

        public String toString() {
            return "Configuration(environment=" + this.environment + ", clientId=" + this.clientId + ", sdkVersion=" + this.sdkVersion + ", networkConfiguration=" + this.networkConfiguration + ", startSendingEventsAutomatically=" + this.startSendingEventsAutomatically + ")";
        }

        public Configuration(Environment environment, String str, String sdkVersion, AnalyticsNetworkConfiguration networkConfiguration, boolean z) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
            this.environment = environment;
            this.clientId = str;
            this.sdkVersion = sdkVersion;
            this.networkConfiguration = networkConfiguration;
            this.startSendingEventsAutomatically = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Configuration(Environment environment, String str, String str2, AnalyticsNetworkConfiguration analyticsNetworkConfiguration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            environment = (i & 1) != 0 ? Environment.PRODUCTION : environment;
            this(environment, (i & 2) != 0 ? null : str, (i & 4) != 0 ? BuildConfig.PAYMENT_SDK_VERSION_NAME : str2, (i & 8) != 0 ? AnalyticsNetworkConfiguration.INSTANCE.m26989default(environment) : analyticsNetworkConfiguration, (i & 16) != 0 ? true : z);
        }

        public final Environment getEnvironment() {
            return this.environment;
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        public final void setSdkVersion(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sdkVersion = str;
        }

        public final AnalyticsNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public final boolean getStartSendingEventsAutomatically() {
            return this.startSendingEventsAutomatically;
        }
    }

    /* compiled from: TrueLayerAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Companion;", "", "()V", "analyticsContext", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;", "getAnalyticsContext", "()Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;", "setAnalyticsContext", "(Lcom/truelayer/payments/analytics/TrueLayerAnalytics$AnalyticsContext;)V", "shared", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "context", "Landroid/content/Context;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/analytics/TrueLayerAnalytics$Configuration;", "dbProvider", "Lkotlin/Function0;", "Lcom/truelayer/payments/analytics/AnalyticsDB;", "workManager", "Landroidx/work/WorkManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static AnalyticsContext analyticsContext;

        private Companion() {
        }

        public final AnalyticsContext getAnalyticsContext() {
            return analyticsContext;
        }

        public final void setAnalyticsContext(AnalyticsContext analyticsContext2) {
            analyticsContext = analyticsContext2;
        }

        public static /* synthetic */ TrueLayerAnalytics shared$default(Companion companion, final Context context, Configuration configuration, Function0 function0, WorkManager workManager, CoroutineScope coroutineScope, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new Function0<AnalyticsDB>() { // from class: com.truelayer.payments.analytics.TrueLayerAnalytics$Companion$shared$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AnalyticsDB invoke() {
                        AnalyticsStore2.Companion companion2 = AnalyticsStore2.Companion;
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        return companion2.defaultEventDatabaseProvider(applicationContext);
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 8) != 0) {
                workManager = WorkManager.getInstance(context.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
            }
            WorkManager workManager2 = workManager;
            if ((i & 16) != 0) {
                coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getIO());
            }
            return companion.shared(context, configuration, function02, workManager2, coroutineScope);
        }

        public final TrueLayerAnalytics shared(Context context, Configuration configuration, Function0<? extends AnalyticsDB> dbProvider, WorkManager workManager, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(dbProvider, "dbProvider");
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return TrueLayerAnalyticsImpl.INSTANCE.shared(context, configuration, dbProvider, workManager, coroutineScope);
        }
    }
}
