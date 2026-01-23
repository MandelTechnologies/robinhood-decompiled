package com.robinhood.transfers.disclosures.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.lib.transfers.contracts.TransferEntryPoint;
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
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: CreateTransferState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/disclosures/contracts/CreateTransferState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.disclosures.contracts.CreateTransferState$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class CreateTransferState3 implements PluginHelperInterfaces<CreateTransferState> {
    public static final CreateTransferState3 INSTANCE;
    private static final SerialDescriptor descriptor;

    private CreateTransferState3() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateTransferState3 createTransferState3 = new CreateTransferState3();
        INSTANCE = createTransferState3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.disclosures.contracts.CreateTransferState", createTransferState3, 10);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("sink", false);
        pluginGeneratedSerialDescriptor.addElement("frequency", false);
        pluginGeneratedSerialDescriptor.addElement("additional_data", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("transfer_type", true);
        pluginGeneratedSerialDescriptor.addElement("mode", false);
        pluginGeneratedSerialDescriptor.addElement("service_fee_params", false);
        pluginGeneratedSerialDescriptor.addElement("entry_point", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateTransferState.$childSerializers;
        CreateTransferState4 createTransferState4 = CreateTransferState4.INSTANCE;
        return new KSerializer[]{BigDecimalSerializer.INSTANCE, BuiltinSerializers.getNullable(createTransferState4), BuiltinSerializers.getNullable(createTransferState4), kSerializerArr[3], BuiltinSerializers.getNullable(CreateTransferState5.INSTANCE), BuiltinSerializers.getNullable(StringSerializer.INSTANCE), BuiltinSerializers.getNullable(kSerializerArr[6]), kSerializerArr[7], BuiltinSerializers.getNullable(ServiceFeeParams2.INSTANCE), BuiltinSerializers.getNullable(kSerializerArr[9])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final CreateTransferState deserialize(Decoding2 decoder) {
        int i;
        TransferMode transferMode;
        TransferType transferType;
        CreateTransferState.ApiTransferAdditionalData apiTransferAdditionalData;
        TransferEntryPoint transferEntryPoint;
        ServiceFeeParams serviceFeeParams;
        String str;
        CreateTransferState6 createTransferState6;
        CreateTransferState.ApiTransferAccount apiTransferAccount;
        BigDecimal bigDecimal;
        CreateTransferState.ApiTransferAccount apiTransferAccount2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateTransferState.$childSerializers;
        int i2 = 9;
        BigDecimal bigDecimal2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            BigDecimal bigDecimal3 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, BigDecimalSerializer.INSTANCE, null);
            CreateTransferState4 createTransferState4 = CreateTransferState4.INSTANCE;
            CreateTransferState.ApiTransferAccount apiTransferAccount3 = (CreateTransferState.ApiTransferAccount) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, createTransferState4, null);
            CreateTransferState.ApiTransferAccount apiTransferAccount4 = (CreateTransferState.ApiTransferAccount) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, createTransferState4, null);
            CreateTransferState6 createTransferState62 = (CreateTransferState6) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            CreateTransferState.ApiTransferAdditionalData apiTransferAdditionalData2 = (CreateTransferState.ApiTransferAdditionalData) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CreateTransferState5.INSTANCE, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            TransferType transferType2 = (TransferType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            TransferMode transferMode2 = (TransferMode) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            ServiceFeeParams serviceFeeParams2 = (ServiceFeeParams) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ServiceFeeParams2.INSTANCE, null);
            transferEntryPoint = (TransferEntryPoint) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            bigDecimal = bigDecimal3;
            str = str2;
            serviceFeeParams = serviceFeeParams2;
            apiTransferAdditionalData = apiTransferAdditionalData2;
            apiTransferAccount = apiTransferAccount4;
            i = 1023;
            transferMode = transferMode2;
            transferType = transferType2;
            createTransferState6 = createTransferState62;
            apiTransferAccount2 = apiTransferAccount3;
        } else {
            int i3 = 7;
            int i4 = 6;
            int i5 = 3;
            boolean z = true;
            int i6 = 0;
            TransferMode transferMode3 = null;
            TransferType transferType3 = null;
            CreateTransferState.ApiTransferAdditionalData apiTransferAdditionalData3 = null;
            TransferEntryPoint transferEntryPoint2 = null;
            ServiceFeeParams serviceFeeParams3 = null;
            String str3 = null;
            CreateTransferState6 createTransferState63 = null;
            CreateTransferState.ApiTransferAccount apiTransferAccount5 = null;
            CreateTransferState.ApiTransferAccount apiTransferAccount6 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 0:
                        bigDecimal2 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, BigDecimalSerializer.INSTANCE, bigDecimal2);
                        i6 |= 1;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 1:
                        apiTransferAccount6 = (CreateTransferState.ApiTransferAccount) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CreateTransferState4.INSTANCE, apiTransferAccount6);
                        i6 |= 2;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 2:
                        apiTransferAccount5 = (CreateTransferState.ApiTransferAccount) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CreateTransferState4.INSTANCE, apiTransferAccount5);
                        i6 |= 4;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 3:
                        createTransferState63 = (CreateTransferState6) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], createTransferState63);
                        i6 |= 8;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 4:
                        apiTransferAdditionalData3 = (CreateTransferState.ApiTransferAdditionalData) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CreateTransferState5.INSTANCE, apiTransferAdditionalData3);
                        i6 |= 16;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 5:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str3);
                        i6 |= 32;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 6:
                        transferType3 = (TransferType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], transferType3);
                        i6 |= 64;
                        i2 = 9;
                        i3 = 7;
                    case 7:
                        transferMode3 = (TransferMode) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], transferMode3);
                        i6 |= 128;
                        i2 = 9;
                    case 8:
                        serviceFeeParams3 = (ServiceFeeParams) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ServiceFeeParams2.INSTANCE, serviceFeeParams3);
                        i6 |= 256;
                        i2 = 9;
                    case 9:
                        transferEntryPoint2 = (TransferEntryPoint) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr[i2], transferEntryPoint2);
                        i6 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i6;
            transferMode = transferMode3;
            transferType = transferType3;
            apiTransferAdditionalData = apiTransferAdditionalData3;
            transferEntryPoint = transferEntryPoint2;
            serviceFeeParams = serviceFeeParams3;
            str = str3;
            createTransferState6 = createTransferState63;
            apiTransferAccount = apiTransferAccount5;
            bigDecimal = bigDecimal2;
            apiTransferAccount2 = apiTransferAccount6;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new CreateTransferState(i, bigDecimal, apiTransferAccount2, apiTransferAccount, createTransferState6, apiTransferAdditionalData, str, transferType, transferMode, serviceFeeParams, transferEntryPoint, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, CreateTransferState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        CreateTransferState.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
