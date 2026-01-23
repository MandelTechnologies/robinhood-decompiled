package com.truelayer.payments.p419ui.screens.providerselection;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.core.domain.payments.ProviderAvailability2;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentProviderViewData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.ui.screens.providerselection.PaymentProviderViewData$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentProviderViewData2 implements PluginHelperInterfaces<PaymentProviderViewData> {
    public static final int $stable = 0;
    public static final PaymentProviderViewData2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentProviderViewData2 paymentProviderViewData2 = new PaymentProviderViewData2();
        INSTANCE = paymentProviderViewData2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.ui.screens.providerselection.PaymentProviderViewData", paymentProviderViewData2, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("displayName", false);
        pluginGeneratedSerialDescriptor.addElement("iconUri", false);
        pluginGeneratedSerialDescriptor.addElement("logoUri", false);
        pluginGeneratedSerialDescriptor.addElement("extendedIcon", false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", false);
        pluginGeneratedSerialDescriptor.addElement(Card.Icon.ORDER, true);
        pluginGeneratedSerialDescriptor.addElement("normalizedName", false);
        pluginGeneratedSerialDescriptor.addElement("searchAliases", false);
        pluginGeneratedSerialDescriptor.addElement("normalizedSearchAliases", false);
        pluginGeneratedSerialDescriptor.addElement("isRecommended", false);
        pluginGeneratedSerialDescriptor.addElement("hasUserPriming", false);
        pluginGeneratedSerialDescriptor.addElement("availability", false);
        pluginGeneratedSerialDescriptor.addElement("parentId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentProviderViewData2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PaymentProviderViewData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[8];
        KSerializer<?> kSerializer2 = kSerializerArr[9];
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(ProviderAvailability2.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, nullable, stringSerializer, FloatSerializer.INSTANCE, stringSerializer, kSerializer, kSerializer2, booleanSerializer, booleanSerializer, nullable2, nullable3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentProviderViewData deserialize(Decoding2 decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        ProviderAvailability providerAvailability;
        String str4;
        List list2;
        String str5;
        String str6;
        String str7;
        String str8;
        float f;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PaymentProviderViewData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            float fDecodeFloatElement = decodingBeginStructure.decodeFloatElement(descriptor2, 6);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            List list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 10);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 11);
            i = 16383;
            providerAvailability = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 12, ProviderAvailability2.INSTANCE, null);
            str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            str3 = strDecodeStringElement2;
            str5 = strDecodeStringElement3;
            list = list3;
            str8 = strDecodeStringElement6;
            f = fDecodeFloatElement;
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            str2 = str9;
            z = zDecodeBooleanElement;
            z2 = zDecodeBooleanElement2;
            list2 = list4;
            str = strDecodeStringElement;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            String strDecodeStringElement7 = null;
            List list5 = null;
            String strDecodeStringElement8 = null;
            ProviderAvailability providerAvailability2 = null;
            String str10 = null;
            List list6 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            i = 0;
            String str11 = null;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                    case 0:
                        i |= 1;
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        i |= 2;
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        str11 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str11);
                        i |= 16;
                        i2 = 7;
                        i3 = 6;
                    case 5:
                        strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i |= 32;
                        i2 = 7;
                    case 6:
                        fDecodeFloatElement2 = decodingBeginStructure.decodeFloatElement(descriptor2, i3);
                        i |= 64;
                    case 7:
                        strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i |= 128;
                        i3 = 6;
                    case 8:
                        list5 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], list5);
                        i |= 256;
                        i3 = 6;
                    case 9:
                        list6 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], list6);
                        i |= 512;
                        i3 = 6;
                    case 10:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 10);
                        i |= 1024;
                        i3 = 6;
                    case 11:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 11);
                        i |= 2048;
                        i3 = 6;
                    case 12:
                        providerAvailability2 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 12, ProviderAvailability2.INSTANCE, providerAvailability2);
                        i |= 4096;
                        i3 = 6;
                    case 13:
                        str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, str10);
                        i |= 8192;
                        i3 = 6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement7;
            list = list5;
            str2 = str11;
            str3 = strDecodeStringElement8;
            providerAvailability = providerAvailability2;
            str4 = str10;
            list2 = list6;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            str7 = strDecodeStringElement11;
            str8 = strDecodeStringElement12;
            f = fDecodeFloatElement2;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
        }
        int i4 = i;
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentProviderViewData(i4, str, str3, str5, str6, str2, str7, f, str8, list, list2, z, z2, providerAvailability, str4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentProviderViewData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PaymentProviderViewData.write$Self$payments_ui_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
