package com.robinhood.transfers.hub.contracts;

import com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService_Adapter;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Arguments$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class TransferHubConfigurationManagedService_Adapter2 implements PluginHelperInterfaces<TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments> {
    public static final TransferHubConfigurationManagedService_Adapter2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private TransferHubConfigurationManagedService_Adapter2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransferHubConfigurationManagedService_Adapter2 transferHubConfigurationManagedService_Adapter2 = new TransferHubConfigurationManagedService_Adapter2();
        INSTANCE = transferHubConfigurationManagedService_Adapter2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments", transferHubConfigurationManagedService_Adapter2, 3);
        pluginGeneratedSerialDescriptor.addElement("isWithdrawal", false);
        pluginGeneratedSerialDescriptor.addElement("hasRhsAccount", false);
        pluginGeneratedSerialDescriptor.addElement("hasRhyAccount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        if (decodingBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            z = zDecodeBooleanElement3;
            i = 7;
        } else {
            boolean z2 = true;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int i2 = 0;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            z = zDecodeBooleanElement5;
            i = i2;
        }
        boolean z3 = zDecodeBooleanElement;
        decodingBeginStructure.endStructure(serialDescriptor);
        return new TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments(i, z3, z, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        TransferHubConfigurationManagedService_Adapter.Endpoint_getTransferScreenPrefillData.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
