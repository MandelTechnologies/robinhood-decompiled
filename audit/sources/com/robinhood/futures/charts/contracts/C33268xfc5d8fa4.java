package com.robinhood.futures.charts.contracts;

import com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter;
import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import microgram.p507ui.sdui.SduiDisplaySpan;

/* compiled from: FuturesChartsService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/futures/charts/contracts/FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments$$serializer */
/* loaded from: classes15.dex */
public /* synthetic */ class C33268xfc5d8fa4 implements PluginHelperInterfaces<FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments> {
    public static final C33268xfc5d8fa4 INSTANCE;
    private static final SerialDescriptor descriptor;

    private C33268xfc5d8fa4() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C33268xfc5d8fa4 c33268xfc5d8fa4 = new C33268xfc5d8fa4();
        INSTANCE = c33268xfc5d8fa4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments", c33268xfc5d8fa4, 3);
        pluginGeneratedSerialDescriptor.addElement("requests", false);
        pluginGeneratedSerialDescriptor.addElement("span", false);
        pluginGeneratedSerialDescriptor.addElement("fillEntireWidth", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), BuiltinSerializers.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments deserialize(Decoding2 decoder) {
        int i;
        List list;
        SduiDisplaySpan sduiDisplaySpan;
        Boolean bool;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments.$childSerializers;
        List list2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            List list3 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer2) lazyArr[0].getValue(), null);
            sduiDisplaySpan = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), null);
            list = list3;
            bool = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiDisplaySpan sduiDisplaySpan2 = null;
            Boolean bool2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer2) lazyArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiDisplaySpan2 = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), sduiDisplaySpan2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool2);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            sduiDisplaySpan = sduiDisplaySpan2;
            bool = bool2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments(i, list, sduiDisplaySpan, bool, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments.write$Self$contracts(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
