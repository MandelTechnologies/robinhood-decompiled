package com.truelayer.payments.analytics.events;

import com.truelayer.payments.analytics.events.AnalyticsEvents;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AnalyticsEvents.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/analytics/events/AnalyticsEvents.WTF.Details.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$WTF$Details;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes6.dex */
public final class AnalyticsEvents$WTF$Details$$serializer implements PluginHelperInterfaces<AnalyticsEvents.WTF.Details> {
    public static final AnalyticsEvents$WTF$Details$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AnalyticsEvents$WTF$Details$$serializer analyticsEvents$WTF$Details$$serializer = new AnalyticsEvents$WTF$Details$$serializer();
        INSTANCE = analyticsEvents$WTF$Details$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.analytics.events.AnalyticsEvents.WTF.Details", analyticsEvents$WTF$Details$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("error", false);
        pluginGeneratedSerialDescriptor.addElement("stacktrace", false);
        pluginGeneratedSerialDescriptor.addElement("server_response", false);
        pluginGeneratedSerialDescriptor.addElement("tl_trace_id", false);
        pluginGeneratedSerialDescriptor.addElement("endpoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AnalyticsEvents$WTF$Details$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public AnalyticsEvents.WTF.Details deserialize(Decoding2 decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        String str6 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            String str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            String str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            str4 = str10;
            i = 31;
            str3 = str9;
            str2 = str8;
            str = str7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str11 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str11);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str12 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str12);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str13 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str13);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    str14 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str14);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str6;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new AnalyticsEvents.WTF.Details(i, str, str2, str3, str4, str5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, AnalyticsEvents.WTF.Details value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        AnalyticsEvents.WTF.Details.write$Self$payments_analytics_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
