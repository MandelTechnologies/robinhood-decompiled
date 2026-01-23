package com.robinhood.futures.charts.contracts;

import com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FuturesChartsClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments$$serializer */
/* loaded from: classes15.dex */
public /* synthetic */ class C33225xa3329483 implements PluginHelperInterfaces<FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments> {
    public static final C33225xa3329483 INSTANCE;
    private static final SerialDescriptor descriptor;

    private C33225xa3329483() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C33225xa3329483 c33225xa3329483 = new C33225xa3329483();
        INSTANCE = c33225xa3329483;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments", c33225xa3329483, 4);
        pluginGeneratedSerialDescriptor.addElement("contractId", false);
        pluginGeneratedSerialDescriptor.addElement("interval", false);
        pluginGeneratedSerialDescriptor.addElement("start", false);
        pluginGeneratedSerialDescriptor.addElement("end", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, lazyArr[1].getValue(), longSerializer, BuiltinSerializers.getNullable(longSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments deserialize(Decoding2 decoder) {
        int i;
        String str;
        long j;
        FuturesHistorical7 futuresHistorical7;
        Long l;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
            FuturesHistorical7 futuresHistorical72 = (FuturesHistorical7) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(serialDescriptor, 2);
            futuresHistorical7 = futuresHistorical72;
            str = strDecodeStringElement2;
            l = (Long) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, null);
            j = jDecodeLongElement;
            i = 15;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            FuturesHistorical7 futuresHistorical73 = null;
            Long l2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    futuresHistorical73 = (FuturesHistorical7) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), futuresHistorical73);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    l2 = (Long) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            j = jDecodeLongElement2;
            futuresHistorical7 = futuresHistorical73;
            l = l2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments(i, str, futuresHistorical7, j, l, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
