package com.truelayer.payments.core.network.mandates.entity.response;

import com.truelayer.payments.core.network.mandates.entity.response.MandateResponse;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow;
import com.truelayer.payments.core.network.mandates.entity.shared.AuthorizationFlow3;
import com.truelayer.payments.core.network.mandates.entity.shared.Beneficiary;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints;
import com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints3;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/response/MandateResponse.Revoked.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse$Revoked;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.response.MandateResponse$Revoked$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateResponse6 implements PluginHelperInterfaces<MandateResponse.Revoked> {
    public static final MandateResponse6 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MandateResponse6 mandateResponse6 = new MandateResponse6();
        INSTANCE = mandateResponse6;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("revoked", mandateResponse6, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("provider_selection", false);
        pluginGeneratedSerialDescriptor.addElement("constraints", false);
        pluginGeneratedSerialDescriptor.addElement("beneficiary", false);
        pluginGeneratedSerialDescriptor.addElement("reference", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("related_products", true);
        pluginGeneratedSerialDescriptor.addElement("authorization_flow", true);
        pluginGeneratedSerialDescriptor.addElement("revocation_source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MandateResponse6() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MandateResponse.Revoked.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], MandateConstraints3.INSTANCE, kSerializerArr[4], BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(User4.INSTANCE), BuiltinSerializers.getNullable(RelatedProducts2.INSTANCE), BuiltinSerializers.getNullable(AuthorizationFlow3.INSTANCE), kSerializerArr[9]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public MandateResponse.Revoked deserialize(Decoding2 decoder) {
        int i;
        MandateResponse.Revoked.RevocationSource revocationSource;
        AuthorizationFlow authorizationFlow;
        RelatedProducts relatedProducts;
        String str;
        User user;
        Beneficiary beneficiary;
        MandateConstraints mandateConstraints;
        ProviderSelection providerSelection;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = MandateResponse.Revoked.$childSerializers;
        int i2 = 9;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            ProviderSelection providerSelection2 = (ProviderSelection) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            MandateConstraints mandateConstraints2 = (MandateConstraints) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, MandateConstraints3.INSTANCE, null);
            Beneficiary beneficiary2 = (Beneficiary) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            User user2 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, User4.INSTANCE, null);
            RelatedProducts relatedProducts2 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, RelatedProducts2.INSTANCE, null);
            AuthorizationFlow authorizationFlow2 = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, AuthorizationFlow3.INSTANCE, null);
            revocationSource = (MandateResponse.Revoked.RevocationSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            str2 = strDecodeStringElement2;
            relatedProducts = relatedProducts2;
            user = user2;
            str = str4;
            mandateConstraints = mandateConstraints2;
            authorizationFlow = authorizationFlow2;
            i = 1023;
            beneficiary = beneficiary2;
            providerSelection = providerSelection2;
            str3 = strDecodeStringElement3;
        } else {
            int i3 = 4;
            boolean z = true;
            int i4 = 0;
            MandateResponse.Revoked.RevocationSource revocationSource2 = null;
            AuthorizationFlow authorizationFlow3 = null;
            RelatedProducts relatedProducts3 = null;
            String str5 = null;
            User user3 = null;
            Beneficiary beneficiary3 = null;
            MandateConstraints mandateConstraints3 = null;
            ProviderSelection providerSelection3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 4;
                    case 0:
                        i4 |= 1;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 9;
                        i3 = 4;
                    case 1:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 4;
                    case 2:
                        providerSelection3 = (ProviderSelection) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], providerSelection3);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 4;
                    case 3:
                        mandateConstraints3 = (MandateConstraints) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, MandateConstraints3.INSTANCE, mandateConstraints3);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 4;
                    case 4:
                        beneficiary3 = (Beneficiary) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], beneficiary3);
                        i4 |= 16;
                        i2 = 9;
                    case 5:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str5);
                        i4 |= 32;
                        i2 = 9;
                    case 6:
                        user3 = (User) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, User4.INSTANCE, user3);
                        i4 |= 64;
                        i2 = 9;
                    case 7:
                        relatedProducts3 = (RelatedProducts) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, RelatedProducts2.INSTANCE, relatedProducts3);
                        i4 |= 128;
                        i2 = 9;
                    case 8:
                        authorizationFlow3 = (AuthorizationFlow) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, AuthorizationFlow3.INSTANCE, authorizationFlow3);
                        i4 |= 256;
                        i2 = 9;
                    case 9:
                        revocationSource2 = (MandateResponse.Revoked.RevocationSource) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i2], revocationSource2);
                        i4 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            revocationSource = revocationSource2;
            authorizationFlow = authorizationFlow3;
            relatedProducts = relatedProducts3;
            str = str5;
            user = user3;
            beneficiary = beneficiary3;
            mandateConstraints = mandateConstraints3;
            providerSelection = providerSelection3;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new MandateResponse.Revoked(i, str2, str3, providerSelection, mandateConstraints, beneficiary, str, user, relatedProducts, authorizationFlow, revocationSource, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MandateResponse.Revoked value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        MandateResponse.Revoked.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
