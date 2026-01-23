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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/response/PaymentResponse.Executed.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse$Executed;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.payments.entity.response.PaymentResponse$Executed$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentResponse5 implements PluginHelperInterfaces<PaymentResponse.Executed> {
    public static final PaymentResponse5 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentResponse5 paymentResponse5 = new PaymentResponse5();
        INSTANCE = paymentResponse5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("executed", paymentResponse5, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("amount_in_minor", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("payment_method", false);
        pluginGeneratedSerialDescriptor.addElement("authorization_flow", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("related_products", true);
        pluginGeneratedSerialDescriptor.addElement("creditable_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentResponse5() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PaymentResponse.Executed.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, stringSerializer, kSerializerArr[3], BuiltinSerializers.getNullable(AuthorizationFlow6.INSTANCE), BuiltinSerializers.getNullable(User5.INSTANCE), BuiltinSerializers.getNullable(RelatedProducts2.INSTANCE), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentResponse.Executed deserialize(Decoding2 decoder) {
        int i;
        String str;
        User user;
        RelatedProducts relatedProducts;
        AuthorizationFlow authorizationFlow;
        PaymentMethod paymentMethod;
        String str2;
        long j;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PaymentResponse.Executed.$childSerializers;
        int i2 = 7;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            PaymentMethod paymentMethod2 = (PaymentMethod) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            AuthorizationFlow authorizationFlow2 = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, AuthorizationFlow6.INSTANCE, null);
            User user2 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, User5.INSTANCE, null);
            RelatedProducts relatedProducts2 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, RelatedProducts2.INSTANCE, null);
            paymentMethod = paymentMethod2;
            str2 = strDecodeStringElement2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            relatedProducts = relatedProducts2;
            user = user2;
            authorizationFlow = authorizationFlow2;
            str3 = strDecodeStringElement3;
            i = 255;
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i3 = 0;
            String str4 = null;
            User user3 = null;
            RelatedProducts relatedProducts3 = null;
            AuthorizationFlow authorizationFlow3 = null;
            PaymentMethod paymentMethod3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        i3 |= 2;
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 1);
                        i2 = 7;
                    case 2:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        paymentMethod3 = (PaymentMethod) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], paymentMethod3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        authorizationFlow3 = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, AuthorizationFlow6.INSTANCE, authorizationFlow3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        user3 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, User5.INSTANCE, user3);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        relatedProducts3 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, RelatedProducts2.INSTANCE, relatedProducts3);
                        i3 |= 64;
                    case 7:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str4);
                        i3 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str4;
            user = user3;
            relatedProducts = relatedProducts3;
            authorizationFlow = authorizationFlow3;
            paymentMethod = paymentMethod3;
            str2 = strDecodeStringElement;
            j = jDecodeLongElement2;
            str3 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PaymentResponse.Executed(i, str2, j, str3, paymentMethod, authorizationFlow, user, relatedProducts, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentResponse.Executed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PaymentResponse.Executed.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
