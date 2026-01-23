package com.robinhood.libmodelsequity.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: OrderTrailingPeg.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/libmodelsequity/order/OrderTrailingPeg.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/libmodelsequity/order/OrderTrailingPeg;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.libmodelsequity.order.OrderTrailingPeg$$serializer, reason: use source file name */
/* loaded from: classes10.dex */
public final class OrderTrailingPeg3 implements PluginHelperInterfaces<OrderTrailingPeg> {
    public static final OrderTrailingPeg3 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OrderTrailingPeg3 orderTrailingPeg3 = new OrderTrailingPeg3();
        INSTANCE = orderTrailingPeg3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.libmodelsequity.order.OrderTrailingPeg", orderTrailingPeg3, 3);
        pluginGeneratedSerialDescriptor.addElement("percentage", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsStrings.TAG_SORT_ORDER_PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderTrailingPeg3() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializers.getNullable(IntSerializer.INSTANCE), BuiltinSerializers.getNullable(DoubleSerializer.INSTANCE), OrderTrailingPeg.$childSerializers[2]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public OrderTrailingPeg deserialize(Decoding2 decoder) {
        int i;
        Integer num;
        Double d;
        TrailingPegType trailingPegType;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = OrderTrailingPeg.$childSerializers;
        Integer num2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            Integer num3 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, IntSerializer.INSTANCE, null);
            Double d2 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DoubleSerializer.INSTANCE, null);
            trailingPegType = (TrailingPegType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            num = num3;
            i = 7;
            d = d2;
        } else {
            boolean z = true;
            int i2 = 0;
            Double d3 = null;
            TrailingPegType trailingPegType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num2 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, IntSerializer.INSTANCE, num2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d3 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DoubleSerializer.INSTANCE, d3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    trailingPegType2 = (TrailingPegType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], trailingPegType2);
                    i2 |= 4;
                }
            }
            i = i2;
            num = num2;
            d = d3;
            trailingPegType = trailingPegType2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new OrderTrailingPeg(i, num, d, trailingPegType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, OrderTrailingPeg value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        OrderTrailingPeg.write$Self$lib_models_equity(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
