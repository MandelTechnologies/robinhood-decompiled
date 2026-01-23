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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AnalyticsEvents.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/analytics/events/AnalyticsEvents.ErrorScreenLoaded.Details.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/analytics/events/AnalyticsEvents$ErrorScreenLoaded$Details;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes6.dex */
public final class AnalyticsEvents$ErrorScreenLoaded$Details$$serializer implements PluginHelperInterfaces<AnalyticsEvents.ErrorScreenLoaded.Details> {
    public static final AnalyticsEvents$ErrorScreenLoaded$Details$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AnalyticsEvents$ErrorScreenLoaded$Details$$serializer analyticsEvents$ErrorScreenLoaded$Details$$serializer = new AnalyticsEvents$ErrorScreenLoaded$Details$$serializer();
        INSTANCE = analyticsEvents$ErrorScreenLoaded$Details$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.analytics.events.AnalyticsEvents.ErrorScreenLoaded.Details", analyticsEvents$ErrorScreenLoaded$Details$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("error_type", false);
        pluginGeneratedSerialDescriptor.addElement("error_message", false);
        pluginGeneratedSerialDescriptor.addElement("error_should_retry", false);
        pluginGeneratedSerialDescriptor.addElement("server_response", false);
        pluginGeneratedSerialDescriptor.addElement("error_cause", false);
        pluginGeneratedSerialDescriptor.addElement("tl_trace_id", false);
        pluginGeneratedSerialDescriptor.addElement("auto_retry", false);
        pluginGeneratedSerialDescriptor.addElement("endpoint", false);
        pluginGeneratedSerialDescriptor.addElement("underlying_error", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AnalyticsEvents$ErrorScreenLoaded$Details$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializers.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(IntSerializer.INSTANCE), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public AnalyticsEvents.ErrorScreenLoaded.Details deserialize(Decoding2 decoder) {
        boolean z;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 7;
        int i3 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String str11 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            Integer num2 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, null);
            str5 = strDecodeStringElement;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            num = num2;
            str3 = str11;
            str7 = str9;
            str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            str4 = str10;
            z = zDecodeBooleanElement;
            str6 = str8;
            i = 511;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String str12 = null;
            String str13 = null;
            Integer num3 = null;
            String str14 = null;
            String strDecodeStringElement2 = null;
            String str15 = null;
            String str16 = null;
            int i4 = 0;
            String str17 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                    case 0:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        str15 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str15);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i4 |= 4;
                        i2 = 7;
                    case 3:
                        str16 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str16);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        str17 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str17);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        str14 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str14);
                        i4 |= 32;
                        i2 = 7;
                    case 6:
                        num3 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, IntSerializer.INSTANCE, num3);
                        i4 |= 64;
                    case 7:
                        str12 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str12);
                        i4 |= 128;
                    case 8:
                        str13 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str13);
                        i4 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            str = str12;
            str2 = str13;
            num = num3;
            str3 = str14;
            str4 = str17;
            i = i4;
            str5 = strDecodeStringElement2;
            str6 = str15;
            str7 = str16;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new AnalyticsEvents.ErrorScreenLoaded.Details(i, str5, str6, z, str7, str4, str3, num, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, AnalyticsEvents.ErrorScreenLoaded.Details value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        AnalyticsEvents.ErrorScreenLoaded.Details.write$Self$payments_analytics_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
