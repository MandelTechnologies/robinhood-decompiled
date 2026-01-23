package com.robinhood.transfers.disclosures.contracts;

import com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService_Adapter;
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

/* compiled from: TransferDisclosureManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService_Adapter$Endpoint_updateDisclosure$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService_Adapter$Endpoint_updateDisclosure$Arguments$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class TransferDisclosureManagedService_Adapter2 implements PluginHelperInterfaces<TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments> {
    public static final TransferDisclosureManagedService_Adapter2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private TransferDisclosureManagedService_Adapter2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransferDisclosureManagedService_Adapter2 transferDisclosureManagedService_Adapter2 = new TransferDisclosureManagedService_Adapter2();
        INSTANCE = transferDisclosureManagedService_Adapter2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments", transferDisclosureManagedService_Adapter2, 1);
        pluginGeneratedSerialDescriptor.addElement("createTransferState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{CreateTransferState3.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments deserialize(Decoding2 decoder) {
        CreateTransferState createTransferState;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (decodingBeginStructure.decodeSequentially()) {
            createTransferState = (CreateTransferState) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, CreateTransferState3.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            createTransferState = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    createTransferState = (CreateTransferState) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, CreateTransferState3.INSTANCE, createTransferState);
                    i2 = 1;
                }
            }
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments(i, createTransferState, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, TransferDisclosureManagedService_Adapter.Endpoint_updateDisclosure.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        encoding3BeginStructure.encodeSerializableElement(serialDescriptor, 0, CreateTransferState3.INSTANCE, value.createTransferState);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
