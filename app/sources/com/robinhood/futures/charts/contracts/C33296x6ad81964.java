package com.robinhood.futures.charts.contracts;

import com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiDisplaySpan;

/* compiled from: FuturesChartsService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/futures/charts/contracts/FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments$$serializer */
/* loaded from: classes15.dex */
public /* synthetic */ class C33296x6ad81964 implements PluginHelperInterfaces<FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments> {
    public static final C33296x6ad81964 INSTANCE;
    private static final SerialDescriptor descriptor;

    private C33296x6ad81964() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C33296x6ad81964 c33296x6ad81964 = new C33296x6ad81964();
        INSTANCE = c33296x6ad81964;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments", c33296x6ad81964, 2);
        pluginGeneratedSerialDescriptor.addElement("accountNumber", false);
        pluginGeneratedSerialDescriptor.addElement("span", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments.$childSerializers[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments deserialize(Decoding2 decoder) {
        SduiDisplaySpan sduiDisplaySpan;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments.$childSerializers;
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (decodingBeginStructure.decodeSequentially()) {
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
            sduiDisplaySpan = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiDisplaySpan sduiDisplaySpan2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiDisplaySpan2 = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), sduiDisplaySpan2);
                    i2 |= 2;
                }
            }
            sduiDisplaySpan = sduiDisplaySpan2;
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments(i, strDecodeStringElement, sduiDisplaySpan, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
