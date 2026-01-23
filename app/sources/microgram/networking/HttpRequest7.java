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
import microgram.networking.HttpRequest;

/* compiled from: HttpRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/networking/HttpRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/networking/HttpRequest;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.networking.HttpRequest$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpRequest7 implements PluginHelperInterfaces<HttpRequest> {
    public static final HttpRequest7 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HttpRequest7 httpRequest7 = new HttpRequest7();
        INSTANCE = httpRequest7;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.networking.HttpRequest", httpRequest7, 7);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("responseType", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement(CarResultComposable2.BODY, true);
        pluginGeneratedSerialDescriptor.addElement("timeoutMs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HttpRequest7() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HttpRequest.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[2];
        KSerializer<?> kSerializer2 = kSerializerArr[3];
        KSerializer<?> kSerializer3 = kSerializerArr[4];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(CommonTypes2.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(IntSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializer, kSerializer2, kSerializer3, nullable, nullable2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public HttpRequest deserialize(Decoding2 decoder) {
        int i;
        Integer num;
        BodyData bodyData;
        String str;
        String str2;
        HttpRequest.Method method;
        CommonTypes3 commonTypes3;
        Map map;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = HttpRequest.$childSerializers;
        int i3 = 6;
        int i4 = 2;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            HttpRequest.Method method2 = (HttpRequest.Method) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            CommonTypes3 commonTypes32 = (CommonTypes3) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            BodyData bodyData2 = (BodyData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, CommonTypes2.INSTANCE, null);
            map = map2;
            str = strDecodeStringElement2;
            num = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, null);
            bodyData = bodyData2;
            commonTypes3 = commonTypes32;
            i = 127;
            method = method2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i5 = 0;
            Integer num2 = null;
            BodyData bodyData3 = null;
            String strDecodeStringElement4 = null;
            HttpRequest.Method method3 = null;
            CommonTypes3 commonTypes33 = null;
            Map map3 = null;
            while (z) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = i6;
                    case 0:
                        i5 |= 1;
                        i4 = i6;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 = 6;
                    case 1:
                        i2 = i6;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i4 = i2;
                        i3 = 6;
                    case 2:
                        i2 = i6;
                        method3 = (HttpRequest.Method) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i6], method3);
                        i5 |= 4;
                        i4 = i2;
                        i3 = 6;
                    case 3:
                        commonTypes33 = (CommonTypes3) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], commonTypes33);
                        i5 |= 8;
                        i4 = i6;
                    case 4:
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], map3);
                        i5 |= 16;
                        i4 = i6;
                    case 5:
                        bodyData3 = (BodyData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, CommonTypes2.INSTANCE, bodyData3);
                        i5 |= 32;
                        i4 = i6;
                    case 6:
                        num2 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, IntSerializer.INSTANCE, num2);
                        i5 |= 64;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            num = num2;
            bodyData = bodyData3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            method = method3;
            commonTypes3 = commonTypes33;
            map = map3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new HttpRequest(i, str, str2, method, commonTypes3, map, bodyData, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, HttpRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        HttpRequest.write$Self$microgram_networking(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
