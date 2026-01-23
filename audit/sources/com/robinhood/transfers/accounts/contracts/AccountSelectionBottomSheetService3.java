package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.model.CreateTransferState;
import com.robinhood.transfers.accounts.contracts.model.CreateTransferState2;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import com.robinhood.transfers.accounts.contracts.model.TransferEntryPoint;
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

/* compiled from: AccountSelectionBottomSheetService.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetArgs;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetArgs$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class AccountSelectionBottomSheetService3 implements PluginHelperInterfaces<AccountSelectionBottomSheetArgs> {
    public static final AccountSelectionBottomSheetService3 INSTANCE;
    private static final SerialDescriptor descriptor;

    private AccountSelectionBottomSheetService3() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AccountSelectionBottomSheetService3 accountSelectionBottomSheetService3 = new AccountSelectionBottomSheetService3();
        INSTANCE = accountSelectionBottomSheetService3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetArgs", accountSelectionBottomSheetService3, 3);
        pluginGeneratedSerialDescriptor.addElement("direction", false);
        pluginGeneratedSerialDescriptor.addElement("transferState", false);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AccountSelectionBottomSheetArgs.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], CreateTransferState2.INSTANCE, BuiltinSerializers.getNullable(kSerializerArr[2])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final AccountSelectionBottomSheetArgs deserialize(Decoding2 decoder) {
        int i;
        TransferAccountDirection transferAccountDirection;
        CreateTransferState createTransferState;
        TransferEntryPoint transferEntryPoint;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AccountSelectionBottomSheetArgs.$childSerializers;
        TransferAccountDirection transferAccountDirection2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            TransferAccountDirection transferAccountDirection3 = (TransferAccountDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CreateTransferState createTransferState2 = (CreateTransferState) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, CreateTransferState2.INSTANCE, null);
            transferEntryPoint = (TransferEntryPoint) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            transferAccountDirection = transferAccountDirection3;
            i = 7;
            createTransferState = createTransferState2;
        } else {
            boolean z = true;
            int i2 = 0;
            CreateTransferState createTransferState3 = null;
            TransferEntryPoint transferEntryPoint2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    transferAccountDirection2 = (TransferAccountDirection) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], transferAccountDirection2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    createTransferState3 = (CreateTransferState) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, CreateTransferState2.INSTANCE, createTransferState3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    transferEntryPoint2 = (TransferEntryPoint) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transferEntryPoint2);
                    i2 |= 4;
                }
            }
            i = i2;
            transferAccountDirection = transferAccountDirection2;
            createTransferState = createTransferState3;
            transferEntryPoint = transferEntryPoint2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new AccountSelectionBottomSheetArgs(i, transferAccountDirection, createTransferState, transferEntryPoint, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, AccountSelectionBottomSheetArgs value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        AccountSelectionBottomSheetArgs.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
