package com.truelayer.payments.core.domain.payments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
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

/* compiled from: PaymentProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/domain/payments/PaymentProvider.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.domain.payments.PaymentProvider$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentProvider2 implements PluginHelperInterfaces<PaymentProvider> {
    public static final PaymentProvider2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentProvider2 paymentProvider2 = new PaymentProvider2();
        INSTANCE = paymentProvider2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.domain.payments.PaymentProvider", paymentProvider2, 12);
        pluginGeneratedSerialDescriptor.addElement("provider_id", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("icon_uri", false);
        pluginGeneratedSerialDescriptor.addElement("extended_icon", false);
        pluginGeneratedSerialDescriptor.addElement("logo_uri", false);
        pluginGeneratedSerialDescriptor.addElement("country_code", false);
        pluginGeneratedSerialDescriptor.addElement("search_aliases", true);
        pluginGeneratedSerialDescriptor.addElement(Card.Icon.ORDER, true);
        pluginGeneratedSerialDescriptor.addElement("user_priming", true);
        pluginGeneratedSerialDescriptor.addElement("availability", true);
        pluginGeneratedSerialDescriptor.addElement("branches", true);
        pluginGeneratedSerialDescriptor.addElement("schemes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentProvider2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PaymentProvider.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializers.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[6], FloatSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(ProviderAvailability2.INSTANCE), kSerializerArr[10], BuiltinSerializers.getNullable(kSerializerArr[11])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentProvider deserialize(Decoding2 decoder) {
        float f;
        List list;
        ProviderAvailability providerAvailability;
        List list2;
        List list3;
        boolean z;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PaymentProvider.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 0;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            float fDecodeFloatElement = decodingBeginStructure.decodeFloatElement(descriptor2, 7);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
            ProviderAvailability providerAvailability2 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, ProviderAvailability2.INSTANCE, null);
            List list5 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], null);
            list = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            str2 = strDecodeStringElement;
            providerAvailability = providerAvailability2;
            f = fDecodeFloatElement;
            str6 = strDecodeStringElement5;
            str = str7;
            z = zDecodeBooleanElement;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            i = 4095;
            list2 = list5;
            list3 = list4;
            str3 = strDecodeStringElement2;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            List list6 = null;
            ProviderAvailability providerAvailability3 = null;
            List list7 = null;
            List list8 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z2 = true;
            String str8 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int i7 = i5;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 9;
                        i5 = 6;
                    case 0:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 2:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i6 |= 4;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 3:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str8);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 4:
                        i2 = i7;
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i6 |= 16;
                        i5 = i2;
                        i3 = 9;
                        i4 = 7;
                    case 5:
                        i2 = i7;
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i6 |= 32;
                        i5 = i2;
                        i3 = 9;
                        i4 = 7;
                    case 6:
                        i2 = i7;
                        list8 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i7], list8);
                        i6 |= 64;
                        i5 = i2;
                        i3 = 9;
                        i4 = 7;
                    case 7:
                        fDecodeFloatElement2 = decodingBeginStructure.decodeFloatElement(descriptor2, i4);
                        i6 |= 128;
                        i5 = i7;
                    case 8:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
                        i6 |= 256;
                        i5 = i7;
                        i4 = 7;
                    case 9:
                        providerAvailability3 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, ProviderAvailability2.INSTANCE, providerAvailability3);
                        i6 |= 512;
                        i5 = i7;
                        i4 = 7;
                    case 10:
                        list7 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], list7);
                        i6 |= 1024;
                        i5 = i7;
                        i4 = 7;
                    case 11:
                        list6 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, kSerializerArr[11], list6);
                        i6 |= 2048;
                        i5 = i7;
                        i4 = 7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            f = fDecodeFloatElement2;
            list = list6;
            providerAvailability = providerAvailability3;
            list2 = list7;
            list3 = list8;
            z = zDecodeBooleanElement2;
            str = str8;
            i = i6;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentProvider(i, str2, str3, str4, str, str5, str6, list3, f, z, providerAvailability, list2, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentProvider value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PaymentProvider.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
