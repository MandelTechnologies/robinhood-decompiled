package com.robinhood.transfers.accounts.contracts;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AccountSelectionResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear$Arguments$$serializer */
/* loaded from: classes12.dex */
public /* synthetic */ class C41769x382c32c0 implements PluginHelperInterfaces<AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments> {
    public static final C41769x382c32c0 INSTANCE;
    private static final SerialDescriptor descriptor;

    private C41769x382c32c0() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C41769x382c32c0 c41769x382c32c0 = new C41769x382c32c0();
        INSTANCE = c41769x382c32c0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments", c41769x382c32c0, 3);
        pluginGeneratedSerialDescriptor.addElement("transferAccountId", false);
        pluginGeneratedSerialDescriptor.addElement("transferAccountType", false);
        pluginGeneratedSerialDescriptor.addElement("direction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments deserialize(Decoding2 decoder) {
        int i;
        String str;
        TransferAccountType transferAccountType;
        TransferAccountDirection transferAccountDirection;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
            TransferAccountType transferAccountType2 = (TransferAccountType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            transferAccountDirection = (TransferAccountDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement2;
            i = 7;
            transferAccountType = transferAccountType2;
        } else {
            boolean z = true;
            int i2 = 0;
            TransferAccountType transferAccountType3 = null;
            TransferAccountDirection transferAccountDirection2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    transferAccountType3 = (TransferAccountType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transferAccountType3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    transferAccountDirection2 = (TransferAccountDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], transferAccountDirection2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            transferAccountType = transferAccountType3;
            transferAccountDirection = transferAccountDirection2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments(i, str, transferAccountType, transferAccountDirection, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        AccountSelectionResolver_Adapter.Endpoint_onAccountRowAppear.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
