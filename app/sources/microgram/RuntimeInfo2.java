package microgram;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.RuntimeInfo;

/* compiled from: RuntimeInfo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/RuntimeInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/RuntimeInfo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.RuntimeInfo$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class RuntimeInfo2 implements PluginHelperInterfaces<RuntimeInfo> {
    public static final RuntimeInfo2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private RuntimeInfo2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RuntimeInfo2 runtimeInfo2 = new RuntimeInfo2();
        INSTANCE = runtimeInfo2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.RuntimeInfo", runtimeInfo2, 10);
        pluginGeneratedSerialDescriptor.addElement("platform", false);
        pluginGeneratedSerialDescriptor.addElement("appVersion", false);
        pluginGeneratedSerialDescriptor.addElement("buildNumber", false);
        pluginGeneratedSerialDescriptor.addElement("apiEnvironment", false);
        pluginGeneratedSerialDescriptor.addElement("apolloNamespace", false);
        pluginGeneratedSerialDescriptor.addElement("releaseVariant", false);
        pluginGeneratedSerialDescriptor.addElement("appType", true);
        pluginGeneratedSerialDescriptor.addElement("preferredLocales", true);
        pluginGeneratedSerialDescriptor.addElement("formattingLocale", true);
        pluginGeneratedSerialDescriptor.addElement("startApplicationFromDebugger", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = RuntimeInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, stringSerializer, lazyArr[3].getValue(), BuiltinSerializers.getNullable(stringSerializer), lazyArr[5].getValue(), BuiltinSerializers.getNullable((KSerializer) lazyArr[6].getValue()), lazyArr[7].getValue(), stringSerializer, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final RuntimeInfo deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        List list;
        RuntimeInfo.ReleaseVariant releaseVariant;
        RuntimeInfo.AppType appType;
        String str;
        RuntimeInfo.ApiEnvironment apiEnvironment;
        int i;
        RuntimeInfo.Platform platform;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RuntimeInfo.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        int i4 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            RuntimeInfo.Platform platform2 = (RuntimeInfo.Platform) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer2) lazyArr[0].getValue(), null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
            RuntimeInfo.ApiEnvironment apiEnvironment2 = (RuntimeInfo.ApiEnvironment) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, (KSerializer2) lazyArr[3].getValue(), null);
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            RuntimeInfo.ReleaseVariant releaseVariant2 = (RuntimeInfo.ReleaseVariant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 5, (KSerializer2) lazyArr[5].getValue(), null);
            RuntimeInfo.AppType appType2 = (RuntimeInfo.AppType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (KSerializer2) lazyArr[6].getValue(), null);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 7, (KSerializer2) lazyArr[7].getValue(), null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(serialDescriptor, 8);
            list = list2;
            platform = platform2;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            str4 = strDecodeStringElement3;
            str = str5;
            str3 = strDecodeStringElement2;
            i = 1023;
            appType = appType2;
            releaseVariant = releaseVariant2;
            apiEnvironment = apiEnvironment2;
            str2 = strDecodeStringElement;
        } else {
            int i5 = 3;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            List list3 = null;
            RuntimeInfo.ReleaseVariant releaseVariant3 = null;
            RuntimeInfo.AppType appType3 = null;
            String str6 = null;
            RuntimeInfo.Platform platform3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i6 = 0;
            RuntimeInfo.ApiEnvironment apiEnvironment3 = null;
            while (z) {
                int i7 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 8;
                        i4 = 5;
                        i5 = 3;
                    case 0:
                        platform3 = (RuntimeInfo.Platform) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, (KSerializer2) lazyArr[0].getValue(), platform3);
                        i6 |= 1;
                        i2 = 9;
                        i3 = 8;
                        i4 = 5;
                        i5 = 3;
                    case 1:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i2 = 9;
                        i4 = 5;
                        i5 = 3;
                    case 2:
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i2 = 9;
                        i4 = 5;
                    case 3:
                        apiEnvironment3 = (RuntimeInfo.ApiEnvironment) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i5, (KSerializer2) lazyArr[i5].getValue(), apiEnvironment3);
                        i6 |= 8;
                        i2 = 9;
                        i4 = 5;
                    case 4:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str6);
                        i6 |= 16;
                        i2 = 9;
                        i4 = 5;
                    case 5:
                        releaseVariant3 = (RuntimeInfo.ReleaseVariant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i7, (KSerializer2) lazyArr[i7].getValue(), releaseVariant3);
                        i6 |= 32;
                        i4 = i7;
                        i2 = 9;
                    case 6:
                        appType3 = (RuntimeInfo.AppType) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (KSerializer2) lazyArr[6].getValue(), appType3);
                        i6 |= 64;
                        i4 = i7;
                    case 7:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 7, (KSerializer2) lazyArr[7].getValue(), list3);
                        i6 |= 128;
                        i4 = i7;
                    case 8:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i6 |= 256;
                        i4 = i7;
                    case 9:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i6 |= 512;
                        i4 = i7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            list = list3;
            releaseVariant = releaseVariant3;
            appType = appType3;
            str = str6;
            apiEnvironment = apiEnvironment3;
            i = i6;
            platform = platform3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new RuntimeInfo(i, platform, str2, str3, apiEnvironment, str, releaseVariant, appType, list, str4, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, RuntimeInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        RuntimeInfo.write$Self$microgram_core(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
