package com.robinhood.futures.ordercheck.contracts;

import com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest$$serializer;
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

/* compiled from: FuturesOrderChecksService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments$$serializer, reason: use source file name */
/* loaded from: classes15.dex */
public final class FuturesOrderChecksService_Adapter2 implements PluginHelperInterfaces<FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments> {
    public static final FuturesOrderChecksService_Adapter2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FuturesOrderChecksService_Adapter2 futuresOrderChecksService_Adapter2 = new FuturesOrderChecksService_Adapter2();
        INSTANCE = futuresOrderChecksService_Adapter2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments", futuresOrderChecksService_Adapter2, 1);
        pluginGeneratedSerialDescriptor.addElement("candidateOrder", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FuturesOrderChecksService_Adapter2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{FuturesOrderCheckRequest$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments deserialize(Decoding2 decoder) {
        FuturesOrderCheckRequest futuresOrderCheckRequest;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i = 1;
        if (decodingBeginStructure.decodeSequentially()) {
            futuresOrderCheckRequest = (FuturesOrderCheckRequest) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, FuturesOrderCheckRequest$$serializer.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            futuresOrderCheckRequest = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    futuresOrderCheckRequest = (FuturesOrderCheckRequest) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, FuturesOrderCheckRequest$$serializer.INSTANCE, futuresOrderCheckRequest);
                    i2 = 1;
                }
            }
            i = i2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments(i, futuresOrderCheckRequest, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        encoding3BeginStructure.encodeSerializableElement(descriptor2, 0, FuturesOrderCheckRequest$$serializer.INSTANCE, value.candidateOrder);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
