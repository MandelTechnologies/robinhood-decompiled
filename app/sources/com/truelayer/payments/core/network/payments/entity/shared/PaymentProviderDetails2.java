package com.truelayer.payments.core.network.payments.entity.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: PaymentProviderDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.payments.entity.shared.PaymentProviderDetails$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentProviderDetails2 implements PluginHelperInterfaces<PaymentProviderDetails> {
    public static final PaymentProviderDetails2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentProviderDetails2 paymentProviderDetails2 = new PaymentProviderDetails2();
        INSTANCE = paymentProviderDetails2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.payments.entity.shared.PaymentProviderDetails", paymentProviderDetails2, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("icon_uri", false);
        pluginGeneratedSerialDescriptor.addElement("logo_uri", false);
        pluginGeneratedSerialDescriptor.addElement("country_code", false);
        pluginGeneratedSerialDescriptor.addElement("capabilities", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentProviderDetails2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializers.getNullable(ProviderCapabilities2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, nullable};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentProviderDetails deserialize(Decoding2 decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ProviderCapabilities providerCapabilities;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            str = strDecodeStringElement2;
            providerCapabilities = (ProviderCapabilities) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ProviderCapabilities2.INSTANCE, null);
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 63;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            ProviderCapabilities providerCapabilities2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        providerCapabilities2 = (ProviderCapabilities) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ProviderCapabilities2.INSTANCE, providerCapabilities2);
                        i2 |= 32;
                        break;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            providerCapabilities = providerCapabilities2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentProviderDetails(i, str, str2, str3, str4, str5, providerCapabilities, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentProviderDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PaymentProviderDetails.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
