package com.robinhood.futures.ordercheck.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter;
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
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: FuturesOrderCheckResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$Arguments$$serializer */
/* loaded from: classes15.dex */
public final class C33306x83322b0e implements PluginHelperInterfaces<FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments> {
    public static final C33306x83322b0e INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C33306x83322b0e c33306x83322b0e = new C33306x83322b0e();
        INSTANCE = c33306x83322b0e;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments", c33306x83322b0e, 1);
        pluginGeneratedSerialDescriptor.addElement("suggestedAmount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private C33306x83322b0e() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BigDecimalSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments deserialize(Decoding2 decoder) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i = 1;
        if (decodingBeginStructure.decodeSequentially()) {
            bigDecimal = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, BigDecimalSerializer.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            bigDecimal = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    bigDecimal = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, BigDecimalSerializer.INSTANCE, bigDecimal);
                    i2 = 1;
                }
            }
            i = i2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments(i, bigDecimal, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, FuturesOrderCheckResolver_Adapter.Endpoint_makeDeposit.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        encoding3BeginStructure.encodeSerializableElement(descriptor2, 0, BigDecimalSerializer.INSTANCE, value.suggestedAmount);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
