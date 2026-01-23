package com.stripe.android.core.networking;

import com.robinhood.utils.http.Headers;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.stripe.android.core.networking.StripeRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializers2;

/* compiled from: AnalyticsRequestV2.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0003YXZB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u009b\u0001\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\n\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000f2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J(\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÁ\u0001¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u00020,2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b4\u00105JB\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u001cJ\u0010\u00109\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR \u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010\u001cR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010OR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bS\u0010\u001cR\u0014\u0010W\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006["}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lcom/stripe/android/core/networking/StripeRequest;", "", "eventName", Auth.DEVELOPER_NAME, "origin", "", "created", "Lkotlinx/serialization/json/JsonElement;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V", "", "seen1", "postParameters", "", "headers", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "method", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "mimeType", "", "retryResponseCodes", "url", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/StripeRequest$Method;Lcom/stripe/android/core/networking/StripeRequest$MimeType;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "createPostParams", "()Ljava/lang/String;", "map", "level", "encodeMapParam", "(Ljava/util/Map;I)Ljava/lang/String;", "", "analyticParams", "()Ljava/util/Map;", "runAttemptCount", "createWorkManagerParams", "(I)Ljava/util/Map;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$stripe_core_release", "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/io/OutputStream;", "outputStream", "writePostBody", "(Ljava/io/OutputStream;)V", "withWorkManagerParams", "(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "D", "Lkotlinx/serialization/json/JsonElement;", "getParams", "()Lkotlinx/serialization/json/JsonElement;", "getPostParameters$stripe_core_release", "getPostParameters$stripe_core_release$annotations", "()V", "Ljava/util/Map;", "getHeaders", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "Ljava/lang/Iterable;", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "getUrl", "", "getPostBodyBytes", "()[B", "postBodyBytes", "Companion", "$serializer", "Parameter", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class AnalyticsRequestV2 extends StripeRequest {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String clientId;
    private final double created;
    private final String eventName;
    private final Map<String, String> headers;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final String origin;
    private final JsonElement params;
    private final String postParameters;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    public static /* synthetic */ AnalyticsRequestV2 copy$default(AnalyticsRequestV2 analyticsRequestV2, String str, String str2, String str3, double d, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsRequestV2.eventName;
        }
        if ((i & 2) != 0) {
            str2 = analyticsRequestV2.clientId;
        }
        if ((i & 4) != 0) {
            str3 = analyticsRequestV2.origin;
        }
        if ((i & 8) != 0) {
            d = analyticsRequestV2.created;
        }
        if ((i & 16) != 0) {
            jsonElement = analyticsRequestV2.params;
        }
        JsonElement jsonElement2 = jsonElement;
        String str4 = str3;
        return analyticsRequestV2.copy(str, str2, str4, d, jsonElement2);
    }

    public final AnalyticsRequestV2 copy(String eventName, String clientId, String origin, double created, JsonElement params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(params, "params");
        return new AnalyticsRequestV2(eventName, clientId, origin, created, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsRequestV2)) {
            return false;
        }
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) other;
        return Intrinsics.areEqual(this.eventName, analyticsRequestV2.eventName) && Intrinsics.areEqual(this.clientId, analyticsRequestV2.clientId) && Intrinsics.areEqual(this.origin, analyticsRequestV2.origin) && Double.compare(this.created, analyticsRequestV2.created) == 0 && Intrinsics.areEqual(this.params, analyticsRequestV2.params);
    }

    public int hashCode() {
        return (((((((this.eventName.hashCode() * 31) + this.clientId.hashCode()) * 31) + this.origin.hashCode()) * 31) + Double.hashCode(this.created)) * 31) + this.params.hashCode();
    }

    public String toString() {
        return "AnalyticsRequestV2(eventName=" + this.eventName + ", clientId=" + this.clientId + ", origin=" + this.origin + ", created=" + this.created + ", params=" + this.params + ")";
    }

    @Deprecated
    public /* synthetic */ AnalyticsRequestV2(int i, String str, String str2, String str3, double d, JsonElement jsonElement, String str4, Map map, StripeRequest.Method method, StripeRequest.MimeType mimeType, Iterable iterable, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, AnalyticsRequestV22.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d;
        this.params = jsonElement;
        if ((i & 32) == 0) {
            this.postParameters = createPostParams();
        } else {
            this.postParameters = str4;
        }
        if ((i & 64) == 0) {
            this.headers = MapsKt.mapOf(Tuples4.m3642to("Content-Type", StripeRequest.MimeType.Form.getCode() + "; charset=" + Charsets.UTF_8.name()), Tuples4.m3642to("origin", str3), Tuples4.m3642to(Headers.USER_AGENT, "Stripe/v1 android/20.50.0"));
        } else {
            this.headers = map;
        }
        if ((i & 128) == 0) {
            this.method = StripeRequest.Method.POST;
        } else {
            this.method = method;
        }
        if ((i & 256) == 0) {
            this.mimeType = StripeRequest.MimeType.Form;
        } else {
            this.mimeType = mimeType;
        }
        if ((i & 512) == 0) {
            this.retryResponseCodes = new PrimitiveRanges2(429, 429);
        } else {
            this.retryResponseCodes = iterable;
        }
        if ((i & 1024) == 0) {
            this.url = "https://r.stripe.com/0";
        } else {
            this.url = str5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$stripe_core_release(AnalyticsRequestV2 self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.eventName);
        output.encodeStringElement(serialDesc, 1, self.clientId);
        output.encodeStringElement(serialDesc, 2, self.origin);
        output.encodeDoubleElement(serialDesc, 3, self.created);
        output.encodeSerializableElement(serialDesc, 4, JsonElementSerializers2.INSTANCE, self.params);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.postParameters, self.createPostParams())) {
            output.encodeStringElement(serialDesc, 5, self.postParameters);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6)) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.getHeaders());
        } else {
            if (!Intrinsics.areEqual(self.getHeaders(), MapsKt.mapOf(Tuples4.m3642to("Content-Type", StripeRequest.MimeType.Form.getCode() + "; charset=" + Charsets.UTF_8.name()), Tuples4.m3642to("origin", self.origin), Tuples4.m3642to(Headers.USER_AGENT, "Stripe/v1 android/20.50.0")))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getMethod() != StripeRequest.Method.POST) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.getMethod());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getMimeType() != StripeRequest.MimeType.Form) {
            output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.getMimeType());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.getRetryResponseCodes(), new PrimitiveRanges2(429, 429))) {
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.getRetryResponseCodes());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && Intrinsics.areEqual(self.getUrl(), "https://r.stripe.com/0")) {
            return;
        }
        output.encodeStringElement(serialDesc, 10, self.getUrl());
    }

    private AnalyticsRequestV2(String str, String str2, String str3, double d, JsonElement jsonElement) {
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d;
        this.params = jsonElement;
        this.postParameters = createPostParams();
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        this.headers = MapsKt.mapOf(Tuples4.m3642to("Content-Type", mimeType.getCode() + "; charset=" + Charsets.UTF_8.name()), Tuples4.m3642to("origin", str3), Tuples4.m3642to(Headers.USER_AGENT, "Stripe/v1 android/20.50.0"));
        this.method = StripeRequest.Method.POST;
        this.mimeType = mimeType;
        this.retryResponseCodes = new PrimitiveRanges2(429, 429);
        this.url = "https://r.stripe.com/0";
    }

    private final byte[] getPostBodyBytes() throws UnsupportedEncodingException {
        byte[] bytes = this.postParameters.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    /* compiled from: AnalyticsRequestV2.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "str", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final /* data */ class Parameter {
        private final String key;
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) other;
            return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public Parameter(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public String toString() throws UnsupportedEncodingException {
            return urlEncode(this.key) + "=" + urlEncode(this.value);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, Charsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }
    }

    private final String createPostParams() {
        Map<String, ?> mapPlus = MapsKt.plus(JsonUtils2.toMap(this.params), analyticParams());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : QueryStringFactory.INSTANCE.compactParams(mapPlus).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new Parameter(key, encodeMapParam$default(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new Parameter(key, value.toString()));
            }
        }
        return CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, new Function1<Parameter, CharSequence>() { // from class: com.stripe.android.core.networking.AnalyticsRequestV2.createPostParams.2
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Parameter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null);
    }

    static /* synthetic */ String encodeMapParam$default(AnalyticsRequestV2 analyticsRequestV2, Map map, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return analyticsRequestV2.encodeMapParam(map, i);
    }

    private final String encodeMapParam(Map<?, ?> map, int level) {
        String strEncodeMapParam;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        boolean z = true;
        for (Map.Entry entry : MapsKt.toSortedMap(map, new Comparator() { // from class: com.stripe.android.core.networking.AnalyticsRequestV2$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnalyticsRequestV2.encodeMapParam$lambda$1(obj, obj2);
            }
        }).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                strEncodeMapParam = encodeMapParam((Map) value, level + 1);
            } else if (value == null) {
                strEncodeMapParam = "";
            } else {
                strEncodeMapParam = "\"" + value + "\"";
            }
            if (!StringsKt.isBlank(strEncodeMapParam)) {
                if (z) {
                    sb.append(StringsKt.repeat("  ", level));
                    sb.append("  \"" + key + "\": " + strEncodeMapParam);
                    z = false;
                } else {
                    sb.append(",");
                    Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                    sb.append(StringsKt.repeat("  ", level));
                    sb.append("  \"" + key + "\": " + strEncodeMapParam);
                }
            }
        }
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(StringsKt.repeat("  ", level));
        sb.append("}");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encodeMapParam$lambda$1(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final Map<String, Object> analyticParams() {
        return MapsKt.mapOf(Tuples4.m3642to("client_id", this.clientId), Tuples4.m3642to("created", Double.valueOf(this.created)), Tuples4.m3642to("event_name", this.eventName), Tuples4.m3642to("event_id", UUID.randomUUID().toString()));
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    public final AnalyticsRequestV2 withWorkManagerParams(int runAttemptCount) {
        return copy$default(this, null, null, null, 0.0d, AnalyticsRequestV23.toJsonElement((Map<?, ?>) MapsKt.plus(JsonUtils2.toMap(this.params), createWorkManagerParams(runAttemptCount))), 15, null);
    }

    private final Map<String, ?> createWorkManagerParams(int runAttemptCount) {
        Duration.Companion companion = Duration.INSTANCE;
        return MapsKt.mapOf(Tuples4.m3642to("uses_work_manager", Boolean.TRUE), Tuples4.m3642to("is_retry", Boolean.valueOf(runAttemptCount > 0)), Tuples4.m3642to("delayed", Boolean.valueOf(Duration.m28758toDoubleimpl(Duration3.toDuration(System.currentTimeMillis(), DurationUnitJvm.MILLISECONDS), DurationUnitJvm.SECONDS) - this.created > 5.0d)));
    }

    /* compiled from: AnalyticsRequestV2.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "ANALYTICS_HOST", "Ljava/lang/String;", "HEADER_ORIGIN", "INDENTATION", "PARAM_CLIENT_ID", "PARAM_CREATED", "PARAM_DELAYED", "PARAM_EVENT_ID", "PARAM_EVENT_NAME", "PARAM_IS_RETRY", "PARAM_USES_WORK_MANAGER", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AnalyticsRequestV2> serializer() {
            return AnalyticsRequestV22.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), Enums4.createSimpleEnumSerializer("com.stripe.android.core.networking.StripeRequest.Method", StripeRequest.Method.values()), Enums4.createSimpleEnumSerializer("com.stripe.android.core.networking.StripeRequest.MimeType", StripeRequest.MimeType.values()), new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Iterable.class), new Annotation[0]), null};
    }
}
