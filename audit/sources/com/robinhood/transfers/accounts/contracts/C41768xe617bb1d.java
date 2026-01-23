package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments$$serializer */
/* loaded from: classes12.dex */
public /* synthetic */ class C41768xe617bb1d implements PluginHelperInterfaces<AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments> {
    public static final C41768xe617bb1d INSTANCE;
    private static final SerialDescriptor descriptor;

    private C41768xe617bb1d() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C41768xe617bb1d c41768xe617bb1d = new C41768xe617bb1d();
        INSTANCE = c41768xe617bb1d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments", c41768xe617bb1d, 3);
        pluginGeneratedSerialDescriptor.addElement("iraTransferType", false);
        pluginGeneratedSerialDescriptor.addElement("iraId", false);
        pluginGeneratedSerialDescriptor.addElement("selectingAccountId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments.$childSerializers[0], stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments deserialize(Decoding2 decoder) {
        int i;
        IraTransferType iraTransferType;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments.$childSerializers;
        IraTransferType iraTransferType2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            iraTransferType = (IraTransferType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
            strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iraTransferType2 = (IraTransferType) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], iraTransferType2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            iraTransferType = iraTransferType2;
            strDecodeStringElement = strDecodeStringElement3;
            strDecodeStringElement2 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments(i, iraTransferType, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
