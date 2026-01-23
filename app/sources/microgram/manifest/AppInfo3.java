package microgram.manifest;

import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
import java.util.Map;
import java.util.Set;
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
import kotlinx.serialization.internal.StringSerializer;
import microgram.manifest.AppInfo;
import microgram.serialization.p506io.HttpUrlSerializer;
import okhttp3.HttpUrl;

/* compiled from: AppInfo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/manifest/AppInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/manifest/AppInfo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.manifest.AppInfo$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class AppInfo3 implements PluginHelperInterfaces<AppInfo> {
    public static final AppInfo3 INSTANCE;
    private static final SerialDescriptor descriptor;

    private AppInfo3() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AppInfo3 appInfo3 = new AppInfo3();
        INSTANCE = appInfo3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.manifest.AppInfo", appInfo3, 10);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("build", false);
        pluginGeneratedSerialDescriptor.addElement("kind", false);
        pluginGeneratedSerialDescriptor.addElement("extraSecure", true);
        pluginGeneratedSerialDescriptor.addElement("supportedSystems", true);
        pluginGeneratedSerialDescriptor.addElement("dependentExtensions", true);
        pluginGeneratedSerialDescriptor.addElement("manifest", true);
        pluginGeneratedSerialDescriptor.addElement("remoteBaseURL", true);
        pluginGeneratedSerialDescriptor.addElement("compatibilityFlags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = AppInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, VersionSerializer.INSTANCE, stringSerializer, lazyArr[3].getValue(), BooleanSerializer.INSTANCE, SystemSupport2.INSTANCE, lazyArr[6].getValue(), lazyArr[7].getValue(), BuiltinSerializers.getNullable(HttpUrlSerializer.INSTANCE), AppInfo4.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final AppInfo deserialize(Decoding2 decoder) {
        boolean z;
        HttpUrl httpUrl;
        Map map;
        SystemSupport systemSupport;
        AppInfo.CompatibilityFlags compatibilityFlags;
        Set set;
        AppKind appKind;
        Version version;
        int i;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = AppInfo.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        int i4 = 7;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
            Version version2 = (Version) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, VersionSerializer.INSTANCE, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
            AppKind appKind2 = (AppKind) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, (KSerializer2) lazyArr[3].getValue(), null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            SystemSupport systemSupport2 = (SystemSupport) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 5, SystemSupport2.INSTANCE, null);
            Set set2 = (Set) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 6, (KSerializer2) lazyArr[6].getValue(), null);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 7, (KSerializer2) lazyArr[7].getValue(), null);
            HttpUrl httpUrl2 = (HttpUrl) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, HttpUrlSerializer.INSTANCE, null);
            map = map2;
            str = strDecodeStringElement;
            compatibilityFlags = (AppInfo.CompatibilityFlags) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 9, AppInfo4.INSTANCE, null);
            systemSupport = systemSupport2;
            httpUrl = httpUrl2;
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement2;
            i = 1023;
            set = set2;
            appKind = appKind2;
            version = version2;
        } else {
            int i5 = 6;
            int i6 = 3;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            HttpUrl httpUrl3 = null;
            Map map3 = null;
            SystemSupport systemSupport3 = null;
            AppInfo.CompatibilityFlags compatibilityFlags2 = null;
            Set set3 = null;
            AppKind appKind3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i7 = 0;
            Version version3 = null;
            while (z2) {
                int i8 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 9;
                        i4 = 7;
                        i6 = 3;
                        i5 = 6;
                    case 0:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        i6 = 3;
                        i5 = 6;
                    case 1:
                        version3 = (Version) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, VersionSerializer.INSTANCE, version3);
                        i7 |= 2;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        i6 = 3;
                        i5 = 6;
                    case 2:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        i5 = 6;
                    case 3:
                        appKind3 = (AppKind) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i6, (KSerializer2) lazyArr[i6].getValue(), appKind3);
                        i7 |= 8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        i5 = 6;
                    case 4:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i7 |= 16;
                        i2 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 5:
                        systemSupport3 = (SystemSupport) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 5, SystemSupport2.INSTANCE, systemSupport3);
                        i7 |= 32;
                        i2 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 6:
                        set3 = (Set) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i5, (KSerializer2) lazyArr[i5].getValue(), set3);
                        i7 |= 64;
                        i2 = 9;
                        i4 = 7;
                    case 7:
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i8, (KSerializer2) lazyArr[i8].getValue(), map3);
                        i7 |= 128;
                        i4 = i8;
                        i2 = 9;
                    case 8:
                        httpUrl3 = (HttpUrl) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, HttpUrlSerializer.INSTANCE, httpUrl3);
                        i7 |= 256;
                        i4 = i8;
                    case 9:
                        compatibilityFlags2 = (AppInfo.CompatibilityFlags) decodingBeginStructure.decodeSerializableElement(serialDescriptor, i2, AppInfo4.INSTANCE, compatibilityFlags2);
                        i7 |= 512;
                        i4 = i8;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            httpUrl = httpUrl3;
            map = map3;
            systemSupport = systemSupport3;
            compatibilityFlags = compatibilityFlags2;
            set = set3;
            appKind = appKind3;
            version = version3;
            i = i7;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new AppInfo(i, str, version, str2, appKind, z, systemSupport, set, map, httpUrl, compatibilityFlags, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, AppInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        AppInfo.write$Self$microgram_manifest(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
