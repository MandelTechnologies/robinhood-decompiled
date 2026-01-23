package microgram.manifest;

import com.adjust.sdk.Constants;
import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.serialization.datetime.InstantEpochSecondsSerializer;
import microgram.serialization.p506io.HttpUrlSerializer;
import okhttp3.HttpUrl;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: Release.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/manifest/Release.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/manifest/Release;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.manifest.Release$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class Release2 implements PluginHelperInterfaces<Release> {
    public static final Release2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private Release2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Release2 release2 = new Release2();
        INSTANCE = release2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.manifest.Release", release2, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("base_url", false);
        pluginGeneratedSerialDescriptor.addElement("build", false);
        pluginGeneratedSerialDescriptor.addElement("created_at", false);
        pluginGeneratedSerialDescriptor.addElement("min_android_app_version", false);
        pluginGeneratedSerialDescriptor.addElement("min_ios_app_version", false);
        pluginGeneratedSerialDescriptor.addElement("override", false);
        pluginGeneratedSerialDescriptor.addElement("package_path", false);
        pluginGeneratedSerialDescriptor.addElement(Constants.PREINSTALL, false);
        pluginGeneratedSerialDescriptor.addElement("priority", false);
        pluginGeneratedSerialDescriptor.addElement("release_channel", false);
        pluginGeneratedSerialDescriptor.addElement("rollout", false);
        pluginGeneratedSerialDescriptor.addElement("sha256", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("web_entry_point", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = Release.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        VersionSerializer versionSerializer = VersionSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, HttpUrlSerializer.INSTANCE, stringSerializer, InstantEpochSecondsSerializer.INSTANCE, BuiltinSerializers.getNullable(versionSerializer), BuiltinSerializers.getNullable(versionSerializer), booleanSerializer, stringSerializer, booleanSerializer, IntSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), lazyArr[11].getValue(), stringSerializer, LongSerializer.INSTANCE, versionSerializer, BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final Release deserialize(Decoding2 decoder) {
        Instant instant;
        int i;
        String str;
        HttpUrl httpUrl;
        Version version;
        Version version2;
        String str2;
        Version version3;
        String str3;
        Rollout rollout;
        String str4;
        String str5;
        String str6;
        int i2;
        boolean z;
        boolean z2;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = Release.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
            HttpUrl httpUrl2 = (HttpUrl) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, HttpUrlSerializer.INSTANCE, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
            instant = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, InstantEpochSecondsSerializer.INSTANCE, null);
            VersionSerializer versionSerializer = VersionSerializer.INSTANCE;
            Version version4 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, versionSerializer, null);
            Version version5 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, versionSerializer, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            int iDecodeIntElement = decodingBeginStructure.decodeIntElement(serialDescriptor, 9);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Rollout rollout2 = (Rollout) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 11, (KSerializer2) lazyArr[11].getValue(), null);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(serialDescriptor, 12);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(serialDescriptor, 13);
            Version version6 = (Version) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 14, versionSerializer, null);
            String str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            i = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            str2 = str8;
            version3 = version6;
            str6 = strDecodeStringElement4;
            httpUrl = httpUrl2;
            str3 = str7;
            i2 = iDecodeIntElement;
            str5 = strDecodeStringElement3;
            z = zDecodeBooleanElement;
            version = version5;
            z2 = zDecodeBooleanElement2;
            version2 = version4;
            rollout = rollout2;
            j = jDecodeLongElement;
            str = strDecodeStringElement;
            str4 = strDecodeStringElement2;
        } else {
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement5 = null;
            HttpUrl httpUrl3 = null;
            Version version7 = null;
            String str9 = null;
            Version version8 = null;
            String str10 = null;
            Rollout rollout3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z3 = true;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            Version version9 = null;
            instant = null;
            i = 0;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 10;
                    case 0:
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i3 = 10;
                        i4 = 9;
                    case 1:
                        httpUrl3 = (HttpUrl) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, HttpUrlSerializer.INSTANCE, httpUrl3);
                        i |= 2;
                        i3 = 10;
                        i4 = 9;
                    case 2:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        instant = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 3, InstantEpochSecondsSerializer.INSTANCE, instant);
                        i |= 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        version9 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, VersionSerializer.INSTANCE, version9);
                        i |= 16;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        version7 = (Version) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, VersionSerializer.INSTANCE, version7);
                        i |= 32;
                        i3 = 10;
                        i4 = 9;
                    case 6:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i |= 64;
                        i3 = 10;
                    case 7:
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i3 = 10;
                    case 8:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i |= 256;
                    case 9:
                        iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i |= 512;
                        i5 = 8;
                    case 10:
                        str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        i |= 1024;
                        i5 = 8;
                    case 11:
                        rollout3 = (Rollout) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 11, (KSerializer2) lazyArr[11].getValue(), rollout3);
                        i |= 2048;
                        i5 = 8;
                    case 12:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        i5 = 8;
                    case 13:
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i |= 8192;
                        i5 = 8;
                    case 14:
                        version8 = (Version) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 14, VersionSerializer.INSTANCE, version8);
                        i |= 16384;
                        i5 = 8;
                    case 15:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str9);
                        i |= 32768;
                        i5 = 8;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement5;
            httpUrl = httpUrl3;
            version = version7;
            version2 = version9;
            str2 = str9;
            version3 = version8;
            str3 = str10;
            rollout = rollout3;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            i2 = iDecodeIntElement2;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            j = jDecodeLongElement2;
        }
        int i6 = i;
        Instant instant2 = instant;
        decodingBeginStructure.endStructure(serialDescriptor);
        return new Release(i6, str, httpUrl, str4, instant2, version2, version, z, str5, z2, i2, str3, rollout, str6, j, version3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, Release value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        Release.write$Self$microgram_manifest(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
