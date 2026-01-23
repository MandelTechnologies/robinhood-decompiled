package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration2;
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

/* compiled from: AccountSelectionConfigurationService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments$$serializer, reason: use source file name */
/* loaded from: classes12.dex */
public /* synthetic */ class AccountSelectionConfigurationService_Adapter2 implements PluginHelperInterfaces<AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments> {
    public static final AccountSelectionConfigurationService_Adapter2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private AccountSelectionConfigurationService_Adapter2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AccountSelectionConfigurationService_Adapter2 accountSelectionConfigurationService_Adapter2 = new AccountSelectionConfigurationService_Adapter2();
        INSTANCE = accountSelectionConfigurationService_Adapter2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments", accountSelectionConfigurationService_Adapter2, 1);
        pluginGeneratedSerialDescriptor.addElement("config", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TransferAccountSelectionLoadConfiguration2.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments deserialize(Decoding2 decoder) {
        TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (decodingBeginStructure.decodeSequentially()) {
            transferAccountSelectionLoadConfiguration = (TransferAccountSelectionLoadConfiguration) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, TransferAccountSelectionLoadConfiguration2.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            transferAccountSelectionLoadConfiguration = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    transferAccountSelectionLoadConfiguration = (TransferAccountSelectionLoadConfiguration) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, TransferAccountSelectionLoadConfiguration2.INSTANCE, transferAccountSelectionLoadConfiguration);
                    i2 = 1;
                }
            }
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments(i, transferAccountSelectionLoadConfiguration, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        encoding3BeginStructure.encodeSerializableElement(serialDescriptor, 0, TransferAccountSelectionLoadConfiguration2.INSTANCE, value.config);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
