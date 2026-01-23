package com.truelayer.payments.core.network.payments.entity.response;

import com.truelayer.payments.core.network.payments.entity.response.PaymentResponse;
import com.truelayer.payments.core.network.payments.entity.shared.AuthorizationFlow;
import com.truelayer.payments.core.network.payments.entity.shared.AuthorizationFlow6;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts2;
import com.truelayer.payments.core.network.payments.entity.shared.User;
import com.truelayer.payments.core.network.payments.entity.shared.User5;
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

/* compiled from: PaymentResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/response/PaymentResponse.Authorizing.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Authorizing;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.payments.entity.response.PaymentResponse$Authorizing$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentResponse4 implements PluginHelperInterfaces<PaymentResponse.Authorizing> {
    public static final PaymentResponse4 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentResponse4 paymentResponse4 = new PaymentResponse4();
        INSTANCE = paymentResponse4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("authorizing", paymentResponse4, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("amount_in_minor", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("payment_method", false);
        pluginGeneratedSerialDescriptor.addElement("authorization_flow", false);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("related_products", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentResponse4() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = PaymentResponse.Authorizing.$childSerializers[3];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(User5.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(RelatedProducts2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, stringSerializer, kSerializer, AuthorizationFlow6.INSTANCE, nullable, nullable2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentResponse.Authorizing deserialize(Decoding2 decoder) {
        int i;
        RelatedProducts relatedProducts;
        User user;
        AuthorizationFlow authorizationFlow;
        String str;
        long j;
        String str2;
        PaymentMethod paymentMethod;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PaymentResponse.Authorizing.$childSerializers;
        int i3 = 6;
        int i4 = 3;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            PaymentMethod paymentMethod2 = (PaymentMethod) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            AuthorizationFlow authorizationFlow2 = (AuthorizationFlow) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, AuthorizationFlow6.INSTANCE, null);
            User user2 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, User5.INSTANCE, null);
            paymentMethod = paymentMethod2;
            str = strDecodeStringElement2;
            relatedProducts = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, RelatedProducts2.INSTANCE, null);
            user = user2;
            authorizationFlow = authorizationFlow2;
            str2 = strDecodeStringElement3;
            i = 127;
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i5 = 0;
            RelatedProducts relatedProducts2 = null;
            User user3 = null;
            AuthorizationFlow authorizationFlow3 = null;
            String strDecodeStringElement4 = null;
            PaymentMethod paymentMethod3 = null;
            while (z) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = i6;
                    case 0:
                        i5 |= 1;
                        i4 = i6;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 = 6;
                    case 1:
                        i5 |= 2;
                        i4 = i6;
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 1);
                        i3 = 6;
                    case 2:
                        i2 = i6;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i5 |= 4;
                        i4 = i2;
                        i3 = 6;
                    case 3:
                        i2 = i6;
                        paymentMethod3 = (PaymentMethod) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i6], paymentMethod3);
                        i5 |= 8;
                        i4 = i2;
                        i3 = 6;
                    case 4:
                        authorizationFlow3 = (AuthorizationFlow) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, AuthorizationFlow6.INSTANCE, authorizationFlow3);
                        i5 |= 16;
                        i4 = i6;
                    case 5:
                        user3 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, User5.INSTANCE, user3);
                        i5 |= 32;
                        i4 = i6;
                    case 6:
                        relatedProducts2 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, RelatedProducts2.INSTANCE, relatedProducts2);
                        i5 |= 64;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            relatedProducts = relatedProducts2;
            user = user3;
            authorizationFlow = authorizationFlow3;
            str = strDecodeStringElement;
            j = jDecodeLongElement2;
            str2 = strDecodeStringElement4;
            paymentMethod = paymentMethod3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentResponse.Authorizing(i, str, j, str2, paymentMethod, authorizationFlow, user, relatedProducts, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentResponse.Authorizing value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PaymentResponse.Authorizing.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
