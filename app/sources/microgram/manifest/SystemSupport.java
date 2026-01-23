package microgram.manifest;

import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SystemSupport.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/manifest/SystemSupport;", "", "Lio/github/z4kn4fein/semver/Version;", "android", "ios", "web", "<init>", "(Lio/github/z4kn4fein/semver/Version;Lio/github/z4kn4fein/semver/Version;Lio/github/z4kn4fein/semver/Version;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILio/github/z4kn4fein/semver/Version;Lio/github/z4kn4fein/semver/Version;Lio/github/z4kn4fein/semver/Version;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_manifest", "(Lmicrogram/manifest/SystemSupport;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/github/z4kn4fein/semver/Version;", "getAndroid", "()Lio/github/z4kn4fein/semver/Version;", "getIos", "getWeb", "Companion", "$serializer", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SystemSupport {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Version android;
    private final Version ios;
    private final Version web;

    public SystemSupport() {
        this((Version) null, (Version) null, (Version) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemSupport)) {
            return false;
        }
        SystemSupport systemSupport = (SystemSupport) other;
        return Intrinsics.areEqual(this.android, systemSupport.android) && Intrinsics.areEqual(this.ios, systemSupport.ios) && Intrinsics.areEqual(this.web, systemSupport.web);
    }

    public int hashCode() {
        Version version = this.android;
        int iHashCode = (version == null ? 0 : version.hashCode()) * 31;
        Version version2 = this.ios;
        int iHashCode2 = (iHashCode + (version2 == null ? 0 : version2.hashCode())) * 31;
        Version version3 = this.web;
        return iHashCode2 + (version3 != null ? version3.hashCode() : 0);
    }

    public String toString() {
        return "SystemSupport(android=" + this.android + ", ios=" + this.ios + ", web=" + this.web + ")";
    }

    /* compiled from: SystemSupport.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/manifest/SystemSupport$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/SystemSupport;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SystemSupport> serializer() {
            return SystemSupport2.INSTANCE;
        }
    }

    public /* synthetic */ SystemSupport(int i, Version version, Version version2, Version version3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.android = null;
        } else {
            this.android = version;
        }
        if ((i & 2) == 0) {
            this.ios = null;
        } else {
            this.ios = version2;
        }
        if ((i & 4) == 0) {
            this.web = null;
        } else {
            this.web = version3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_manifest(SystemSupport self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.android != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, VersionSerializer.INSTANCE, self.android);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ios != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, VersionSerializer.INSTANCE, self.ios);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.web == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, VersionSerializer.INSTANCE, self.web);
    }

    public SystemSupport(Version version, Version version2, Version version3) {
        this.android = version;
        this.ios = version2;
        this.web = version3;
    }

    public /* synthetic */ SystemSupport(Version version, Version version2, Version version3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : version, (i & 2) != 0 ? null : version2, (i & 4) != 0 ? null : version3);
    }
}
