package microgram.manifest;

import java.util.List;
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

/* compiled from: VersionManifest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/manifest/VersionManifest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/manifest/VersionManifest;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.manifest.VersionManifest$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class VersionManifest2 implements PluginHelperInterfaces<VersionManifest> {
    public static final VersionManifest2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private VersionManifest2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VersionManifest2 versionManifest2 = new VersionManifest2();
        INSTANCE = versionManifest2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.manifest.VersionManifest", versionManifest2, 2);
        pluginGeneratedSerialDescriptor.addElement("current", false);
        pluginGeneratedSerialDescriptor.addElement("alternatives", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Release2.INSTANCE, VersionManifest.$childSerializers[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final VersionManifest deserialize(Decoding2 decoder) {
        List list;
        Release release;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = VersionManifest.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            release = (Release) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, Release2.INSTANCE, null);
            list = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            Release release2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    release2 = (Release) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, Release2.INSTANCE, release2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    list2 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), list2);
                    i2 |= 2;
                }
            }
            list = list2;
            release = release2;
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new VersionManifest(i, release, list, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, VersionManifest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        VersionManifest.write$Self$microgram_manifest(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
