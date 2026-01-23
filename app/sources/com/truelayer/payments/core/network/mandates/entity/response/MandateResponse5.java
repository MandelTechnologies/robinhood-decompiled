package com.truelayer.payments.core.network.mandates.entity.response;

import com.truelayer.payments.core.network.mandates.entity.response.MandateResponse;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow3;
import com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints3;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReason;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReason2;
import com.truelayer.payments.core.network.mandates.entity.shared.ProviderSelection;
import com.truelayer.payments.core.network.mandates.entity.shared.User;
import com.truelayer.payments.core.network.mandates.entity.shared.User4;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts;
import com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts2;
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

/* compiled from: MandateResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/response/MandateResponse.Failed.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Failed;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.response.MandateResponse$Failed$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateResponse5 implements PluginHelperInterfaces<MandateResponse.Failed> {
    public static final MandateResponse5 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MandateResponse5 mandateResponse5 = new MandateResponse5();
        INSTANCE = mandateResponse5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("failed", mandateResponse5, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("failure_reason", false);
        pluginGeneratedSerialDescriptor.addElement("provider_selection", false);
        pluginGeneratedSerialDescriptor.addElement("constraints", false);
        pluginGeneratedSerialDescriptor.addElement("beneficiary", false);
        pluginGeneratedSerialDescriptor.addElement("reference", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("related_products", true);
        pluginGeneratedSerialDescriptor.addElement("authorization_flow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MandateResponse5() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MandateResponse.Failed.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, MandateFailureReason2.INSTANCE, kSerializerArr[3], MandateConstraints3.INSTANCE, kSerializerArr[5], BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(User4.INSTANCE), BuiltinSerializers.getNullable(RelatedProducts2.INSTANCE), BuiltinSerializers.getNullable(AuthorizationFlow3.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public MandateResponse.Failed deserialize(Decoding2 decoder) {
        int i;
        AuthorizationFlow authorizationFlow;
        RelatedProducts relatedProducts;
        String str;
        MandateConstraints mandateConstraints;
        User user;
        Beneficiary beneficiary;
        ProviderSelection providerSelection;
        MandateFailureReason mandateFailureReason;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = MandateResponse.Failed.$childSerializers;
        int i2 = 9;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            MandateFailureReason mandateFailureReason2 = (MandateFailureReason) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, MandateFailureReason2.INSTANCE, null);
            ProviderSelection providerSelection2 = (ProviderSelection) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            MandateConstraints mandateConstraints2 = (MandateConstraints) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, MandateConstraints3.INSTANCE, null);
            Beneficiary beneficiary2 = (Beneficiary) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            User user2 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, User4.INSTANCE, null);
            RelatedProducts relatedProducts2 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, RelatedProducts2.INSTANCE, null);
            beneficiary = beneficiary2;
            str2 = strDecodeStringElement2;
            authorizationFlow = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, AuthorizationFlow3.INSTANCE, null);
            user = user2;
            str = str4;
            relatedProducts = relatedProducts2;
            mandateConstraints = mandateConstraints2;
            mandateFailureReason = mandateFailureReason2;
            i = 1023;
            providerSelection = providerSelection2;
            str3 = strDecodeStringElement3;
        } else {
            int i3 = 5;
            int i4 = 3;
            boolean z = true;
            int i5 = 0;
            AuthorizationFlow authorizationFlow2 = null;
            RelatedProducts relatedProducts3 = null;
            String str5 = null;
            MandateConstraints mandateConstraints3 = null;
            User user3 = null;
            Beneficiary beneficiary3 = null;
            ProviderSelection providerSelection3 = null;
            MandateFailureReason mandateFailureReason3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 3;
                        i3 = 5;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 9;
                        i4 = 3;
                        i3 = 5;
                    case 1:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i2 = 9;
                        i4 = 3;
                        i3 = 5;
                    case 2:
                        mandateFailureReason3 = (MandateFailureReason) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, MandateFailureReason2.INSTANCE, mandateFailureReason3);
                        i5 |= 4;
                        i2 = 9;
                        i4 = 3;
                        i3 = 5;
                    case 3:
                        providerSelection3 = (ProviderSelection) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], providerSelection3);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 5;
                    case 4:
                        mandateConstraints3 = (MandateConstraints) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, MandateConstraints3.INSTANCE, mandateConstraints3);
                        i5 |= 16;
                        i2 = 9;
                        i3 = 5;
                    case 5:
                        beneficiary3 = (Beneficiary) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], beneficiary3);
                        i5 |= 32;
                        i2 = 9;
                    case 6:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str5);
                        i5 |= 64;
                        i2 = 9;
                    case 7:
                        user3 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, User4.INSTANCE, user3);
                        i5 |= 128;
                        i2 = 9;
                    case 8:
                        relatedProducts3 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, RelatedProducts2.INSTANCE, relatedProducts3);
                        i5 |= 256;
                        i2 = 9;
                    case 9:
                        authorizationFlow2 = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, AuthorizationFlow3.INSTANCE, authorizationFlow2);
                        i5 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            authorizationFlow = authorizationFlow2;
            relatedProducts = relatedProducts3;
            str = str5;
            mandateConstraints = mandateConstraints3;
            user = user3;
            beneficiary = beneficiary3;
            providerSelection = providerSelection3;
            mandateFailureReason = mandateFailureReason3;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new MandateResponse.Failed(i, str2, str3, mandateFailureReason, providerSelection, mandateConstraints, beneficiary, str, user, relatedProducts, authorizationFlow, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MandateResponse.Failed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        MandateResponse.Failed.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
