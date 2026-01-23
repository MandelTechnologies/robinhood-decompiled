package com.robinhood.transfers.accounts.contracts.model;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.lib.transfers.contracts.models.TransferDirection;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/accounts/contracts/model/CreateTransferState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.accounts.contracts.model.CreateTransferState$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class CreateTransferState2 implements PluginHelperInterfaces<CreateTransferState> {
    public static final CreateTransferState2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private CreateTransferState2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateTransferState2 createTransferState2 = new CreateTransferState2();
        INSTANCE = createTransferState2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.accounts.contracts.model.CreateTransferState", createTransferState2, 7);
        pluginGeneratedSerialDescriptor.addElement("direction", false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("frequency", false);
        pluginGeneratedSerialDescriptor.addElement("sourceAccountId", false);
        pluginGeneratedSerialDescriptor.addElement("sinkAccountId", false);
        pluginGeneratedSerialDescriptor.addElement("iraContributionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateTransferState.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, BigDecimalSerializer.INSTANCE, stringSerializer, kSerializerArr[3], BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(kSerializerArr[6])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final CreateTransferState deserialize(Decoding2 decoder) {
        int i;
        IraContributionType iraContributionType;
        String str;
        TransferDirection transferDirection;
        BigDecimal bigDecimal;
        String str2;
        TransferFrequency transferFrequency;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateTransferState.$childSerializers;
        int i2 = 5;
        int i3 = 4;
        TransferDirection transferDirection2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            TransferDirection transferDirection3 = (TransferDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            BigDecimal bigDecimal2 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, BigDecimalSerializer.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
            TransferFrequency transferFrequency2 = (TransferFrequency) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            iraContributionType = (IraContributionType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            transferDirection = transferDirection3;
            str = str5;
            str3 = str4;
            str2 = strDecodeStringElement;
            i = 127;
            transferFrequency = transferFrequency2;
            bigDecimal = bigDecimal2;
        } else {
            boolean z = true;
            int i4 = 0;
            IraContributionType iraContributionType2 = null;
            String str6 = null;
            BigDecimal bigDecimal3 = null;
            String strDecodeStringElement2 = null;
            TransferFrequency transferFrequency3 = null;
            String str7 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 4;
                    case 0:
                        transferDirection2 = (TransferDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], transferDirection2);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 4;
                    case 1:
                        bigDecimal3 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, BigDecimalSerializer.INSTANCE, bigDecimal3);
                        i4 |= 2;
                        i2 = 5;
                        i3 = 4;
                    case 2:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        transferFrequency3 = (TransferFrequency) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], transferFrequency3);
                        i4 |= 8;
                    case 4:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str7);
                        i4 |= 16;
                    case 5:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str6);
                        i4 |= 32;
                    case 6:
                        iraContributionType2 = (IraContributionType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], iraContributionType2);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            iraContributionType = iraContributionType2;
            str = str6;
            transferDirection = transferDirection2;
            bigDecimal = bigDecimal3;
            str2 = strDecodeStringElement2;
            transferFrequency = transferFrequency3;
            str3 = str7;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new CreateTransferState(i, transferDirection, bigDecimal, str2, transferFrequency, str3, str, iraContributionType, (SerializationConstructorMarker) null);
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
