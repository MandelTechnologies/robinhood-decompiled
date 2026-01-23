package com.truelayer.payments.analytics.events;

import com.adjust.sdk.Constants;
import com.truelayer.payments.analytics.events.NetworkEvent;
import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: NetworkEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/analytics/events/NetworkEvent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/analytics/events/NetworkEvent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.analytics.events.NetworkEvent$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class NetworkEvent2 implements PluginHelperInterfaces<NetworkEvent> {
    public static final NetworkEvent2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NetworkEvent2 networkEvent2 = new NetworkEvent2();
        INSTANCE = networkEvent2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.analytics.events.NetworkEvent", networkEvent2, 25);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("resource_token", false);
        pluginGeneratedSerialDescriptor.addElement("resource_type", false);
        pluginGeneratedSerialDescriptor.addElement("client_id", false);
        pluginGeneratedSerialDescriptor.addElement("provider_id", false);
        pluginGeneratedSerialDescriptor.addElement("amount_in_minor", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("country_code", false);
        pluginGeneratedSerialDescriptor.addElement("os_name", false);
        pluginGeneratedSerialDescriptor.addElement("os_version", false);
        pluginGeneratedSerialDescriptor.addElement("screen_resolution", false);
        pluginGeneratedSerialDescriptor.addElement("app_name", false);
        pluginGeneratedSerialDescriptor.addElement("app_version", false);
        pluginGeneratedSerialDescriptor.addElement("sdk_version", false);
        pluginGeneratedSerialDescriptor.addElement("sdk_platform", false);
        pluginGeneratedSerialDescriptor.addElement("device_id", false);
        pluginGeneratedSerialDescriptor.addElement("device_type", false);
        pluginGeneratedSerialDescriptor.addElement("device_region", false);
        pluginGeneratedSerialDescriptor.addElement("device_language", false);
        pluginGeneratedSerialDescriptor.addElement("preferred_languages", false);
        pluginGeneratedSerialDescriptor.addElement("integration_type", false);
        pluginGeneratedSerialDescriptor.addElement("integration_version", true);
        pluginGeneratedSerialDescriptor.addElement(Constants.REFERRER_API_META, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NetworkEvent2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NetworkEvent.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(LongSerializer.INSTANCE), BuiltinSerializers.getNullable(stringSerializer), stringSerializer, BuiltinSerializers.getNullable(stringSerializer), stringSerializer, stringSerializer, NetworkEvent3.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[21], stringSerializer, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(JsonElementSerializers6.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public NetworkEvent deserialize(Decoding2 decoder) {
        int i;
        String str;
        NetworkEvent.ScreenResolution screenResolution;
        String str2;
        JsonElement6 jsonElement6;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        List list;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i2;
        int i3;
        String str23;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = NetworkEvent.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str24 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String str25 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            Long l2 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, null);
            String str26 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 8);
            String str27 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 10);
            String strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 11);
            NetworkEvent.ScreenResolution screenResolution2 = (NetworkEvent.ScreenResolution) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, NetworkEvent3.INSTANCE, null);
            String strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 13);
            String strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 14);
            String strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 15);
            String strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(descriptor2, 16);
            String strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(descriptor2, 17);
            String strDecodeStringElement13 = decodingBeginStructure.decodeStringElement(descriptor2, 18);
            String strDecodeStringElement14 = decodingBeginStructure.decodeStringElement(descriptor2, 19);
            String strDecodeStringElement15 = decodingBeginStructure.decodeStringElement(descriptor2, 20);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 21, kSerializerArr[21], null);
            String strDecodeStringElement16 = decodingBeginStructure.decodeStringElement(descriptor2, 22);
            String str28 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 23, stringSerializer, null);
            i = 33554431;
            str18 = strDecodeStringElement14;
            jsonElement6 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 24, JsonElementSerializers6.INSTANCE, null);
            str20 = strDecodeStringElement16;
            str13 = strDecodeStringElement9;
            str8 = strDecodeStringElement4;
            str9 = strDecodeStringElement5;
            str4 = str24;
            str6 = strDecodeStringElement3;
            str11 = strDecodeStringElement7;
            l = l2;
            str3 = str27;
            str2 = str26;
            str10 = strDecodeStringElement6;
            str17 = strDecodeStringElement13;
            str16 = strDecodeStringElement12;
            str15 = strDecodeStringElement11;
            str14 = strDecodeStringElement10;
            screenResolution = screenResolution2;
            str12 = strDecodeStringElement8;
            str21 = strDecodeStringElement2;
            str = str25;
            str5 = strDecodeStringElement;
            str19 = strDecodeStringElement15;
            list = list2;
            str7 = str28;
        } else {
            boolean z = true;
            String str29 = null;
            String strDecodeStringElement17 = null;
            NetworkEvent.ScreenResolution screenResolution3 = null;
            String str30 = null;
            JsonElement6 jsonElement62 = null;
            String str31 = null;
            Long l3 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String str32 = null;
            List list3 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            i = 0;
            String str33 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                    case 0:
                        str22 = strDecodeStringElement17;
                        i |= 1;
                        strDecodeStringElement18 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        strDecodeStringElement17 = str22;
                    case 1:
                        i |= 2;
                        strDecodeStringElement17 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                    case 2:
                        str22 = strDecodeStringElement17;
                        i |= 4;
                        strDecodeStringElement19 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        strDecodeStringElement17 = str22;
                    case 3:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement20 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        strDecodeStringElement17 = str22;
                    case 4:
                        str22 = strDecodeStringElement17;
                        str33 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str33);
                        i |= 16;
                        strDecodeStringElement17 = str22;
                    case 5:
                        str22 = strDecodeStringElement17;
                        str29 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str29);
                        i |= 32;
                        strDecodeStringElement17 = str22;
                    case 6:
                        str22 = strDecodeStringElement17;
                        l3 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, l3);
                        i |= 64;
                        strDecodeStringElement17 = str22;
                    case 7:
                        str22 = strDecodeStringElement17;
                        str30 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str30);
                        i |= 128;
                        strDecodeStringElement17 = str22;
                    case 8:
                        str23 = strDecodeStringElement17;
                        strDecodeStringElement21 = decodingBeginStructure.decodeStringElement(descriptor2, 8);
                        i |= 256;
                        strDecodeStringElement17 = str23;
                    case 9:
                        str23 = strDecodeStringElement17;
                        str31 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, str31);
                        i |= 512;
                        strDecodeStringElement17 = str23;
                    case 10:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement22 = decodingBeginStructure.decodeStringElement(descriptor2, 10);
                        i |= 1024;
                        strDecodeStringElement17 = str22;
                    case 11:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement23 = decodingBeginStructure.decodeStringElement(descriptor2, 11);
                        i |= 2048;
                        strDecodeStringElement17 = str22;
                    case 12:
                        str22 = strDecodeStringElement17;
                        screenResolution3 = (NetworkEvent.ScreenResolution) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, NetworkEvent3.INSTANCE, screenResolution3);
                        i |= 4096;
                        strDecodeStringElement17 = str22;
                    case 13:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement24 = decodingBeginStructure.decodeStringElement(descriptor2, 13);
                        i |= 8192;
                        strDecodeStringElement17 = str22;
                    case 14:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement25 = decodingBeginStructure.decodeStringElement(descriptor2, 14);
                        i |= 16384;
                        strDecodeStringElement17 = str22;
                    case 15:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement26 = decodingBeginStructure.decodeStringElement(descriptor2, 15);
                        i |= 32768;
                        strDecodeStringElement17 = str22;
                    case 16:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement27 = decodingBeginStructure.decodeStringElement(descriptor2, 16);
                        i |= 65536;
                        strDecodeStringElement17 = str22;
                    case 17:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement28 = decodingBeginStructure.decodeStringElement(descriptor2, 17);
                        i |= 131072;
                        strDecodeStringElement17 = str22;
                    case 18:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement29 = decodingBeginStructure.decodeStringElement(descriptor2, 18);
                        i |= 262144;
                        strDecodeStringElement17 = str22;
                    case 19:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement30 = decodingBeginStructure.decodeStringElement(descriptor2, 19);
                        i |= 524288;
                        strDecodeStringElement17 = str22;
                    case 20:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement31 = decodingBeginStructure.decodeStringElement(descriptor2, 20);
                        i2 = 1048576;
                        i |= i2;
                        strDecodeStringElement17 = str22;
                    case 21:
                        str22 = strDecodeStringElement17;
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 21, kSerializerArr[21], list3);
                        i2 = 2097152;
                        i |= i2;
                        strDecodeStringElement17 = str22;
                    case 22:
                        str22 = strDecodeStringElement17;
                        strDecodeStringElement32 = decodingBeginStructure.decodeStringElement(descriptor2, 22);
                        i3 = 4194304;
                        i |= i3;
                        strDecodeStringElement17 = str22;
                    case 23:
                        str22 = strDecodeStringElement17;
                        str32 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 23, StringSerializer.INSTANCE, str32);
                        i3 = 8388608;
                        i |= i3;
                        strDecodeStringElement17 = str22;
                    case 24:
                        str22 = strDecodeStringElement17;
                        jsonElement62 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 24, JsonElementSerializers6.INSTANCE, jsonElement62);
                        i3 = 16777216;
                        i |= i3;
                        strDecodeStringElement17 = str22;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            str = str29;
            screenResolution = screenResolution3;
            str2 = str30;
            jsonElement6 = jsonElement62;
            str3 = str31;
            l = l3;
            str4 = str33;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            str7 = str32;
            list = list3;
            str8 = strDecodeStringElement20;
            str9 = strDecodeStringElement21;
            str10 = strDecodeStringElement22;
            str11 = strDecodeStringElement23;
            str12 = strDecodeStringElement24;
            str13 = strDecodeStringElement25;
            str14 = strDecodeStringElement26;
            str15 = strDecodeStringElement27;
            str16 = strDecodeStringElement28;
            str17 = strDecodeStringElement29;
            str18 = strDecodeStringElement30;
            str19 = strDecodeStringElement31;
            str20 = strDecodeStringElement32;
            str21 = strDecodeStringElement17;
        }
        int i4 = i;
        decodingBeginStructure.endStructure(descriptor2);
        return new NetworkEvent(i4, str5, str21, str6, str8, str4, str, l, str2, str9, str3, str10, str11, screenResolution, str12, str13, str14, str15, str16, str17, str18, str19, list, str20, str7, jsonElement6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, NetworkEvent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        NetworkEvent.write$Self$payments_analytics_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
