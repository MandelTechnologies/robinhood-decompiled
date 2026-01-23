package com.stripe.android.core.networking;

import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.stripe.android.core.networking.StripeRequest;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializers2;

/* compiled from: AnalyticsRequestV2.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.stripe.android.core.networking.AnalyticsRequestV2$$serializer, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnalyticsRequestV22 implements PluginHelperInterfaces<AnalyticsRequestV2> {
    public static final AnalyticsRequestV22 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AnalyticsRequestV22 analyticsRequestV22 = new AnalyticsRequestV22();
        INSTANCE = analyticsRequestV22;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.core.networking.AnalyticsRequestV2", analyticsRequestV22, 11);
        pluginGeneratedSerialDescriptor.addElement("eventName", false);
        pluginGeneratedSerialDescriptor.addElement(Auth.DEVELOPER_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("origin", false);
        pluginGeneratedSerialDescriptor.addElement("created", false);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        pluginGeneratedSerialDescriptor.addElement("postParameters", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("mimeType", true);
        pluginGeneratedSerialDescriptor.addElement("retryResponseCodes", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AnalyticsRequestV22() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AnalyticsRequestV2.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[6];
        KSerializer<?> kSerializer2 = kSerializerArr[7];
        KSerializer<?> kSerializer3 = kSerializerArr[8];
        KSerializer<?> kSerializer4 = kSerializerArr[9];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, JsonElementSerializers2.INSTANCE, stringSerializer, kSerializer, kSerializer2, kSerializer3, kSerializer4, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public AnalyticsRequestV2 deserialize(Decoding2 decoder) {
        int i;
        StripeRequest.MimeType mimeType;
        Iterable iterable;
        StripeRequest.Method method;
        Map map;
        JsonElement jsonElement;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = AnalyticsRequestV2.$childSerializers;
        int i2 = 10;
        String strDecodeStringElement2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
            JsonElement jsonElement2 = (JsonElement) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, JsonElementSerializers2.INSTANCE, null);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            StripeRequest.Method method2 = (StripeRequest.Method) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            StripeRequest.MimeType mimeType2 = (StripeRequest.MimeType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            iterable = (Iterable) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            str = strDecodeStringElement3;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 10);
            str4 = strDecodeStringElement6;
            jsonElement = jsonElement2;
            map = map2;
            str3 = strDecodeStringElement5;
            i = 2047;
            method = method2;
            mimeType = mimeType2;
            str2 = strDecodeStringElement4;
            d = dDecodeDoubleElement;
        } else {
            boolean z = true;
            int i3 = 0;
            StripeRequest.MimeType mimeType3 = null;
            Iterable iterable2 = null;
            StripeRequest.Method method3 = null;
            Map map3 = null;
            JsonElement jsonElement3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 10;
                    case 1:
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 10;
                    case 2:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                        i2 = 10;
                    case 3:
                        dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
                        i3 |= 8;
                        i2 = 10;
                    case 4:
                        jsonElement3 = (JsonElement) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, JsonElementSerializers2.INSTANCE, jsonElement3);
                        i3 |= 16;
                        i2 = 10;
                    case 5:
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i3 |= 32;
                    case 6:
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], map3);
                        i3 |= 64;
                    case 7:
                        method3 = (StripeRequest.Method) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], method3);
                        i3 |= 128;
                    case 8:
                        mimeType3 = (StripeRequest.MimeType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], mimeType3);
                        i3 |= 256;
                    case 9:
                        iterable2 = (Iterable) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], iterable2);
                        i3 |= 512;
                    case 10:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 1024;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            mimeType = mimeType3;
            iterable = iterable2;
            method = method3;
            map = map3;
            jsonElement = jsonElement3;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
            d = dDecodeDoubleElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new AnalyticsRequestV2(i, str, str2, str3, d, jsonElement, str4, map, method, mimeType, iterable, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, AnalyticsRequestV2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        AnalyticsRequestV2.write$Self$stripe_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
