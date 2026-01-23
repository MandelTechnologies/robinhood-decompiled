package microgram.networking;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.Map;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.networking.HttpResult;

/* compiled from: HttpResult.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/networking/HttpResult.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/networking/HttpResult$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.networking.HttpResult$Response$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpResult4 implements PluginHelperInterfaces<HttpResult.Response> {
    public static final HttpResult4 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HttpResult4 httpResult4 = new HttpResult4();
        INSTANCE = httpResult4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("response", httpResult4, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("headers", false);
        pluginGeneratedSerialDescriptor.addElement(CarResultComposable2.BODY, false);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new HttpResult5("type"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HttpResult4() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, HttpResult.Response.$childSerializers[2], BuiltinSerializers.getNullable(CommonTypes2.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public HttpResult.Response deserialize(Decoding2 decoder) {
        int i;
        int i2;
        String str;
        Map map;
        BodyData bodyData;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = HttpResult.Response.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            int iDecodeIntElement = decodingBeginStructure.decodeIntElement(descriptor2, 1);
            map = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            str = strDecodeStringElement;
            bodyData = (BodyData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, CommonTypes2.INSTANCE, null);
            i = 15;
            i2 = iDecodeIntElement;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement2 = null;
            Map map2 = null;
            BodyData bodyData2 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], map2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    bodyData2 = (BodyData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, CommonTypes2.INSTANCE, bodyData2);
                    i3 |= 8;
                }
            }
            i = i3;
            i2 = iDecodeIntElement2;
            str = strDecodeStringElement2;
            map = map2;
            bodyData = bodyData2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new HttpResult.Response(i, str, i2, map, bodyData, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, HttpResult.Response value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        HttpResult.Response.write$Self$microgram_networking(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
