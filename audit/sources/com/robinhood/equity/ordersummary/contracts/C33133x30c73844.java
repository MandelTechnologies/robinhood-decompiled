package com.robinhood.equity.ordersummary.contracts;

import com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter;
import com.robinhood.equity.ordersummary.contracts.models.OrderSummaryParams;
import com.robinhood.equity.ordersummary.contracts.models.OrderSummaryParams2;
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

/* compiled from: EquityOrderSummaryService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments$$serializer */
/* loaded from: classes15.dex */
public /* synthetic */ class C33133x30c73844 implements PluginHelperInterfaces<EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments> {
    public static final C33133x30c73844 INSTANCE;
    private static final SerialDescriptor descriptor;

    private C33133x30c73844() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C33133x30c73844 c33133x30c73844 = new C33133x30c73844();
        INSTANCE = c33133x30c73844;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments", c33133x30c73844, 1);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OrderSummaryParams2.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments deserialize(Decoding2 decoder) {
        OrderSummaryParams orderSummaryParams;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (decodingBeginStructure.decodeSequentially()) {
            orderSummaryParams = (OrderSummaryParams) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, OrderSummaryParams2.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            orderSummaryParams = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    orderSummaryParams = (OrderSummaryParams) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, OrderSummaryParams2.INSTANCE, orderSummaryParams);
                    i2 = 1;
                }
            }
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments(i, orderSummaryParams, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        encoding3BeginStructure.encodeSerializableElement(serialDescriptor, 0, OrderSummaryParams2.INSTANCE, value.params);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
