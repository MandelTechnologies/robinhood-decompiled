package com.truelayer.payments.core.network.payments.entity.request;

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

/* compiled from: StartAuthorizationFlowRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes6.dex */
public final class StartAuthorizationFlowRequest$$serializer implements PluginHelperInterfaces<StartAuthorizationFlowRequest> {
    public static final StartAuthorizationFlowRequest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StartAuthorizationFlowRequest$$serializer startAuthorizationFlowRequest$$serializer = new StartAuthorizationFlowRequest$$serializer();
        INSTANCE = startAuthorizationFlowRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.payments.entity.request.StartAuthorizationFlowRequest", startAuthorizationFlowRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("provider_selection", false);
        pluginGeneratedSerialDescriptor.addElement("redirect", false);
        pluginGeneratedSerialDescriptor.addElement("form", false);
        pluginGeneratedSerialDescriptor.addElement("consent", false);
        pluginGeneratedSerialDescriptor.addElement("scheme_selection", false);
        pluginGeneratedSerialDescriptor.addElement("user_account_selection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StartAuthorizationFlowRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = StartAuthorizationFlowRequest.$childSerializers;
        return new KSerializer[]{BuiltinSerializers.getNullable(kSerializerArr[0]), BuiltinSerializers.getNullable(RedirectPayload$$serializer.INSTANCE), BuiltinSerializers.getNullable(FormPayload$$serializer.INSTANCE), BuiltinSerializers.getNullable(kSerializerArr[3]), BuiltinSerializers.getNullable(kSerializerArr[4]), BuiltinSerializers.getNullable(kSerializerArr[5])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public StartAuthorizationFlowRequest deserialize(Decoding2 decoder) {
        int i;
        ProviderSelectionPayload providerSelectionPayload;
        RedirectPayload redirectPayload;
        FormPayload formPayload;
        ConsentPayload consentPayload;
        SchemeSelectionPayload schemeSelectionPayload;
        UserAccountSelectionPayload userAccountSelectionPayload;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = StartAuthorizationFlowRequest.$childSerializers;
        int i2 = 2;
        int i3 = 0;
        ProviderSelectionPayload providerSelectionPayload2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            ProviderSelectionPayload providerSelectionPayload3 = (ProviderSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            RedirectPayload redirectPayload2 = (RedirectPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, RedirectPayload$$serializer.INSTANCE, null);
            FormPayload formPayload2 = (FormPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, FormPayload$$serializer.INSTANCE, null);
            ConsentPayload consentPayload2 = (ConsentPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SchemeSelectionPayload schemeSelectionPayload2 = (SchemeSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            userAccountSelectionPayload = (UserAccountSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            providerSelectionPayload = providerSelectionPayload3;
            formPayload = formPayload2;
            i = 63;
            consentPayload = consentPayload2;
            schemeSelectionPayload = schemeSelectionPayload2;
            redirectPayload = redirectPayload2;
        } else {
            int i4 = 1;
            int i5 = 0;
            RedirectPayload redirectPayload3 = null;
            FormPayload formPayload3 = null;
            ConsentPayload consentPayload3 = null;
            SchemeSelectionPayload schemeSelectionPayload3 = null;
            UserAccountSelectionPayload userAccountSelectionPayload2 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 2;
                    case 0:
                        providerSelectionPayload2 = (ProviderSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i6, kSerializerArr[i6], providerSelectionPayload2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 2;
                    case 1:
                        redirectPayload3 = (RedirectPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, RedirectPayload$$serializer.INSTANCE, redirectPayload3);
                        i5 |= 2;
                        i3 = i6;
                    case 2:
                        formPayload3 = (FormPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, FormPayload$$serializer.INSTANCE, formPayload3);
                        i5 |= 4;
                        i3 = i6;
                    case 3:
                        consentPayload3 = (ConsentPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], consentPayload3);
                        i5 |= 8;
                        i3 = i6;
                    case 4:
                        schemeSelectionPayload3 = (SchemeSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], schemeSelectionPayload3);
                        i5 |= 16;
                        i3 = i6;
                    case 5:
                        userAccountSelectionPayload2 = (UserAccountSelectionPayload) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], userAccountSelectionPayload2);
                        i5 |= 32;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            providerSelectionPayload = providerSelectionPayload2;
            redirectPayload = redirectPayload3;
            formPayload = formPayload3;
            consentPayload = consentPayload3;
            schemeSelectionPayload = schemeSelectionPayload3;
            userAccountSelectionPayload = userAccountSelectionPayload2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new StartAuthorizationFlowRequest(i, providerSelectionPayload, redirectPayload, formPayload, consentPayload, schemeSelectionPayload, userAccountSelectionPayload, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, StartAuthorizationFlowRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        StartAuthorizationFlowRequest.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
