package microgram.manifest;

import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SystemSupport.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/manifest/SystemSupport.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/manifest/SystemSupport;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.manifest.SystemSupport$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class SystemSupport2 implements PluginHelperInterfaces<SystemSupport> {
    public static final SystemSupport2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private SystemSupport2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SystemSupport2 systemSupport2 = new SystemSupport2();
        INSTANCE = systemSupport2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.manifest.SystemSupport", systemSupport2, 3);
        pluginGeneratedSerialDescriptor.addElement("android", true);
        pluginGeneratedSerialDescriptor.addElement("ios", true);
        pluginGeneratedSerialDescriptor.addElement("web", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        VersionSerializer versionSerializer = VersionSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(versionSerializer), BuiltinSerializers.getNullable(versionSerializer), BuiltinSerializers.getNullable(versionSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SystemSupport deserialize(Decoding2 decoder) {
        int i;
        Version version;
        Version version2;
        Version version3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Version version4 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            VersionSerializer versionSerializer = VersionSerializer.INSTANCE;
            Version version5 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, versionSerializer, null);
            Version version6 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, versionSerializer, null);
            version3 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, versionSerializer, null);
            i = 7;
            version2 = version6;
            version = version5;
        } else {
            boolean z = true;
            int i2 = 0;
            Version version7 = null;
            Version version8 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    version4 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, VersionSerializer.INSTANCE, version4);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    version7 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, VersionSerializer.INSTANCE, version7);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    version8 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, VersionSerializer.INSTANCE, version8);
                    i2 |= 4;
                }
            }
            i = i2;
            version = version4;
            version2 = version7;
            version3 = version8;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SystemSupport(i, version, version2, version3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SystemSupport value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SystemSupport.write$Self$microgram_manifest(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
