package com.truelayer.payments.analytics.configuration;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.http.Headers;
import com.truelayer.payments.analytics.TrueLayerAnalyticsImpl;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AnalyticsNetworkConfiguration.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B;\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "", "seen1", "", "apiUrlString", "", "headers", "", "Lcom/truelayer/payments/analytics/configuration/HttpHeader;", "enableDebugLogging", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Z)V", "getApiUrlString", "()Ljava/lang/String;", "getEnableDebugLogging", "()Z", "getHeaders", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsNetworkConfiguration {
    private final String apiUrlString;
    private final boolean enableDebugLogging;
    private final List<HttpHeader> headers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(HttpHeader2.INSTANCE), null};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsNetworkConfiguration copy$default(AnalyticsNetworkConfiguration analyticsNetworkConfiguration, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsNetworkConfiguration.apiUrlString;
        }
        if ((i & 2) != 0) {
            list = analyticsNetworkConfiguration.headers;
        }
        if ((i & 4) != 0) {
            z = analyticsNetworkConfiguration.enableDebugLogging;
        }
        return analyticsNetworkConfiguration.copy(str, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiUrlString() {
        return this.apiUrlString;
    }

    public final List<HttpHeader> component2() {
        return this.headers;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }

    public final AnalyticsNetworkConfiguration copy(String apiUrlString, List<HttpHeader> headers, boolean enableDebugLogging) {
        Intrinsics.checkNotNullParameter(apiUrlString, "apiUrlString");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new AnalyticsNetworkConfiguration(apiUrlString, headers, enableDebugLogging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsNetworkConfiguration)) {
            return false;
        }
        AnalyticsNetworkConfiguration analyticsNetworkConfiguration = (AnalyticsNetworkConfiguration) other;
        return Intrinsics.areEqual(this.apiUrlString, analyticsNetworkConfiguration.apiUrlString) && Intrinsics.areEqual(this.headers, analyticsNetworkConfiguration.headers) && this.enableDebugLogging == analyticsNetworkConfiguration.enableDebugLogging;
    }

    public int hashCode() {
        return (((this.apiUrlString.hashCode() * 31) + this.headers.hashCode()) * 31) + Boolean.hashCode(this.enableDebugLogging);
    }

    public String toString() {
        return "AnalyticsNetworkConfiguration(apiUrlString=" + this.apiUrlString + ", headers=" + this.headers + ", enableDebugLogging=" + this.enableDebugLogging + ")";
    }

    @Deprecated
    public /* synthetic */ AnalyticsNetworkConfiguration(int i, String str, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, AnalyticsNetworkConfiguration2.INSTANCE.getDescriptor());
        }
        this.apiUrlString = str;
        if ((i & 2) == 0) {
            this.headers = CollectionsKt.emptyList();
        } else {
            this.headers = list;
        }
        if ((i & 4) == 0) {
            this.enableDebugLogging = true;
        } else {
            this.enableDebugLogging = z;
        }
    }

    public AnalyticsNetworkConfiguration(String apiUrlString, List<HttpHeader> headers, boolean z) {
        Intrinsics.checkNotNullParameter(apiUrlString, "apiUrlString");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.apiUrlString = apiUrlString;
        this.headers = headers;
        this.enableDebugLogging = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_analytics_release(AnalyticsNetworkConfiguration self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.apiUrlString);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.headers, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.headers);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.enableDebugLogging) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 2, self.enableDebugLogging);
    }

    public final String getApiUrlString() {
        return this.apiUrlString;
    }

    public /* synthetic */ AnalyticsNetworkConfiguration(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? true : z);
    }

    public final List<HttpHeader> getHeaders() {
        return this.headers;
    }

    public final boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }

    /* compiled from: AnalyticsNetworkConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration$Companion;", "", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/truelayer/payments/analytics/configuration/AnalyticsNetworkConfiguration;", "environment", "Lcom/truelayer/payments/analytics/configuration/Environment;", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AnalyticsNetworkConfiguration> serializer() {
            return AnalyticsNetworkConfiguration2.INSTANCE;
        }

        /* renamed from: default, reason: not valid java name */
        public final AnalyticsNetworkConfiguration m26989default(Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new AnalyticsNetworkConfiguration(TrueLayerAnalyticsImpl.INSTANCE.getAnalyticsUrlString(environment), CollectionsKt.listOf((Object[]) new HttpHeader[]{new HttpHeader(Headers.USER_AGENT, "truelayer-android-payment-sdk/3.0.1 (Android; vc:400)"), new HttpHeader("TL-Agent", "truelayer-android-payment-sdk/3.0.1 (Android; vc:400)")}), false, 4, (DefaultConstructorMarker) null);
        }
    }
}
