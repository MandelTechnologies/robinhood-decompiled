package com.truelayer.payments.core.network.mandates.entity.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/shared/PaymentProvider.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PaymentProvider;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.shared.PaymentProvider$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentProvider3 implements PluginHelperInterfaces<PaymentProvider> {
    public static final PaymentProvider3 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentProvider3 paymentProvider3 = new PaymentProvider3();
        INSTANCE = paymentProvider3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.mandates.entity.shared.PaymentProvider", paymentProvider3, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("icon_uri", false);
        pluginGeneratedSerialDescriptor.addElement("logo_uri", false);
        pluginGeneratedSerialDescriptor.addElement("country_code", false);
        pluginGeneratedSerialDescriptor.addElement("search_aliases", true);
        pluginGeneratedSerialDescriptor.addElement("availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentProvider3() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = PaymentProvider.$childSerializers[5];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(ProviderAvailability3.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializer, nullable};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentProvider deserialize(Decoding2 decoder) {
        int i;
        ProviderAvailability providerAvailability;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PaymentProvider.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            str = strDecodeStringElement2;
            providerAvailability = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ProviderAvailability3.INSTANCE, null);
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            i = 127;
            str2 = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i2 = 0;
            ProviderAvailability providerAvailability2 = null;
            List list2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        continue;
                    case 2:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i2 |= 4;
                        continue;
                    case 3:
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list2);
                        i2 |= 32;
                        break;
                    case 6:
                        providerAvailability2 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ProviderAvailability3.INSTANCE, providerAvailability2);
                        i2 |= 64;
                        break;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i2;
            providerAvailability = providerAvailability2;
            list = list2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentProvider(i, str, str2, str3, str4, str5, list, providerAvailability, (SerializationConstructorMarker) null);
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
