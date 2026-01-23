package com.robinhood.transfers.suggestions.pills.contracts;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: MicrogramTransferAccount.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccount$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public final class MicrogramTransferAccount2 implements PluginHelperInterfaces<MicrogramTransferAccount> {
    public static final MicrogramTransferAccount2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MicrogramTransferAccount2 microgramTransferAccount2 = new MicrogramTransferAccount2();
        INSTANCE = microgramTransferAccount2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccount", microgramTransferAccount2, 9);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("isExternal", false);
        pluginGeneratedSerialDescriptor.addElement("accountName", false);
        pluginGeneratedSerialDescriptor.addElement("accountNumber", false);
        pluginGeneratedSerialDescriptor.addElement("transferLimit", false);
        pluginGeneratedSerialDescriptor.addElement("withdrawableCash", false);
        pluginGeneratedSerialDescriptor.addElement("ungrantedInstant", false);
        pluginGeneratedSerialDescriptor.addElement("hasWithdrawalFee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MicrogramTransferAccount2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = MicrogramTransferAccount.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[0]);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(kSerializerArr[1]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, nullable3, nullable4, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public MicrogramTransferAccount deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        MicrogramTransferAccountStatus microgramTransferAccountStatus;
        boolean z;
        int i;
        MicrogramTransferAccountType microgramTransferAccountType;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = MicrogramTransferAccount.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            MicrogramTransferAccountType microgramTransferAccountType2 = (MicrogramTransferAccountType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            MicrogramTransferAccountStatus microgramTransferAccountStatus2 = (MicrogramTransferAccountStatus) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            microgramTransferAccountStatus = microgramTransferAccountStatus2;
            microgramTransferAccountType = microgramTransferAccountType2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            str2 = str6;
            str5 = strDecodeStringElement3;
            str3 = strDecodeStringElement;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
            str4 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            i = 511;
        } else {
            int i4 = 1;
            boolean z2 = true;
            boolean zDecodeBooleanElement3 = false;
            int i5 = 0;
            String str7 = null;
            String str8 = null;
            MicrogramTransferAccountType microgramTransferAccountType3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement4 = false;
            MicrogramTransferAccountStatus microgramTransferAccountStatus3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        i4 = 1;
                    case 0:
                        microgramTransferAccountType3 = (MicrogramTransferAccountType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], microgramTransferAccountType3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 1;
                    case 1:
                        microgramTransferAccountStatus3 = (MicrogramTransferAccountStatus) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], microgramTransferAccountStatus3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        i5 |= 4;
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                    case 3:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                    case 4:
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str8);
                        i5 |= 64;
                    case 7:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str7);
                        i5 |= 128;
                    case 8:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
                        i5 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            str = str7;
            str2 = str8;
            microgramTransferAccountStatus = microgramTransferAccountStatus3;
            z = zDecodeBooleanElement4;
            i = i5;
            microgramTransferAccountType = microgramTransferAccountType3;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new MicrogramTransferAccount(i, microgramTransferAccountType, microgramTransferAccountStatus, z, str3, str4, str5, str2, str, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MicrogramTransferAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        MicrogramTransferAccount.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
