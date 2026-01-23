package com.robinhood.transfers.disclosures.contracts;

import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
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

/* compiled from: CreateTransferState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/disclosures/contracts/CreateTransferState.ApiTransferAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.disclosures.contracts.CreateTransferState$ApiTransferAccount$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class CreateTransferState4 implements PluginHelperInterfaces<CreateTransferState.ApiTransferAccount> {
    public static final CreateTransferState4 INSTANCE;
    private static final SerialDescriptor descriptor;

    private CreateTransferState4() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateTransferState4 createTransferState4 = new CreateTransferState4();
        INSTANCE = createTransferState4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.disclosures.contracts.CreateTransferState.ApiTransferAccount", createTransferState4, 4);
        pluginGeneratedSerialDescriptor.addElement("managementInfo", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("accountNumber", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateTransferState.ApiTransferAccount.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(ManagementInfo2.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[1];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, kSerializer, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final CreateTransferState.ApiTransferAccount deserialize(Decoding2 decoder) {
        int i;
        ManagementInfo managementInfo;
        TransferAccountType transferAccountType;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateTransferState.ApiTransferAccount.$childSerializers;
        ManagementInfo managementInfo2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            ManagementInfo managementInfo3 = (ManagementInfo) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ManagementInfo2.INSTANCE, null);
            TransferAccountType transferAccountType2 = (TransferAccountType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            transferAccountType = transferAccountType2;
            managementInfo = managementInfo3;
            str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str = str3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            TransferAccountType transferAccountType3 = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    managementInfo2 = (ManagementInfo) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ManagementInfo2.INSTANCE, managementInfo2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    transferAccountType3 = (TransferAccountType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transferAccountType3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            managementInfo = managementInfo2;
            transferAccountType = transferAccountType3;
            str = str4;
            str2 = str5;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new CreateTransferState.ApiTransferAccount(i, managementInfo, transferAccountType, str, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, CreateTransferState.ApiTransferAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        CreateTransferState.ApiTransferAccount.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
