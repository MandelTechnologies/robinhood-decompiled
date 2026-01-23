package microgram.manifest;

import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.serialization.p506io.HttpUrlSerializer;
import okhttp3.HttpUrl;

/* compiled from: AppInfo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0004NOPMB\u008f\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R7\u0010\u0015\u001a\u0019\u0018\u00010\u0014j\u0004\u0018\u0001`A¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\t0D8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010E\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010GR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010L¨\u0006Q"}, m3636d2 = {"Lmicrogram/manifest/AppInfo;", "", "", "seen0", "", "identifier", "Lio/github/z4kn4fein/semver/Version;", "version", "build", "Lmicrogram/manifest/AppKind;", "kind", "", "extraSecure", "Lmicrogram/manifest/SystemSupport;", "supportedSystems", "", "dependentExtensions", "", "Lmicrogram/manifest/AppInfo$ManifestEntry;", "manifest", "Lokhttp3/HttpUrl;", "remoteBaseUrl", "Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "compatibilityFlags", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lio/github/z4kn4fein/semver/Version;Ljava/lang/String;Lmicrogram/manifest/AppKind;ZLmicrogram/manifest/SystemSupport;Ljava/util/Set;Ljava/util/Map;Lokhttp3/HttpUrl;Lmicrogram/manifest/AppInfo$CompatibilityFlags;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_manifest", "(Lmicrogram/manifest/AppInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Lio/github/z4kn4fein/semver/Version;", "getVersion", "()Lio/github/z4kn4fein/semver/Version;", "getBuild", "Lmicrogram/manifest/AppKind;", "getKind", "()Lmicrogram/manifest/AppKind;", "Z", "getExtraSecure", "()Z", "Lmicrogram/manifest/SystemSupport;", "getSupportedSystems", "()Lmicrogram/manifest/SystemSupport;", "Ljava/util/Set;", "getDependentExtensions", "()Ljava/util/Set;", "Ljava/util/Map;", "getManifest", "()Ljava/util/Map;", "Lmicrogram/serialization/io/HttpUrl;", "Lkotlinx/serialization/Serializable;", "with", "Lkotlin/reflect/KClass;", "Lokhttp3/HttpUrl;", "getRemoteBaseUrl", "()Lokhttp3/HttpUrl;", "getRemoteBaseUrl$annotations", "()V", "Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "getCompatibilityFlags", "()Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "Companion", "ManifestEntry", "CompatibilityFlags", "$serializer", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class AppInfo {

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String build;
    private final CompatibilityFlags compatibilityFlags;
    private final Set<String> dependentExtensions;
    private final boolean extraSecure;
    private final String identifier;
    private final AppKind kind;
    private final Map<String, ManifestEntry> manifest;
    private final HttpUrl remoteBaseUrl;
    private final SystemSupport supportedSystems;
    private final Version version;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppKind.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new LinkedHashSetSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AppInfo5.INSTANCE);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return Intrinsics.areEqual(this.identifier, appInfo.identifier) && Intrinsics.areEqual(this.version, appInfo.version) && Intrinsics.areEqual(this.build, appInfo.build) && this.kind == appInfo.kind && this.extraSecure == appInfo.extraSecure && Intrinsics.areEqual(this.supportedSystems, appInfo.supportedSystems) && Intrinsics.areEqual(this.dependentExtensions, appInfo.dependentExtensions) && Intrinsics.areEqual(this.manifest, appInfo.manifest) && Intrinsics.areEqual(this.remoteBaseUrl, appInfo.remoteBaseUrl) && Intrinsics.areEqual(this.compatibilityFlags, appInfo.compatibilityFlags);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.identifier.hashCode() * 31) + this.version.hashCode()) * 31) + this.build.hashCode()) * 31) + this.kind.hashCode()) * 31) + Boolean.hashCode(this.extraSecure)) * 31) + this.supportedSystems.hashCode()) * 31) + this.dependentExtensions.hashCode()) * 31) + this.manifest.hashCode()) * 31;
        HttpUrl httpUrl = this.remoteBaseUrl;
        return ((iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31) + this.compatibilityFlags.hashCode();
    }

    public String toString() {
        return "AppInfo(identifier=" + this.identifier + ", version=" + this.version + ", build=" + this.build + ", kind=" + this.kind + ", extraSecure=" + this.extraSecure + ", supportedSystems=" + this.supportedSystems + ", dependentExtensions=" + this.dependentExtensions + ", manifest=" + this.manifest + ", remoteBaseUrl=" + this.remoteBaseUrl + ", compatibilityFlags=" + this.compatibilityFlags + ")";
    }

    /* compiled from: AppInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/manifest/AppInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/AppInfo;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppInfo> serializer() {
            return AppInfo3.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.manifest.AppInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppInfo._childSerializers$_anonymous_();
            }
        }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.manifest.AppInfo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppInfo._childSerializers$_anonymous_$0();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.manifest.AppInfo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppInfo._childSerializers$_anonymous_$1();
            }
        }), null, null};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AppInfo(int i, String str, Version version, String str2, AppKind appKind, boolean z, SystemSupport systemSupport, Set set, Map map, HttpUrl httpUrl, CompatibilityFlags compatibilityFlags, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, AppInfo3.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.version = version;
        this.build = str2;
        this.kind = appKind;
        if ((i & 16) == 0) {
            this.extraSecure = false;
        } else {
            this.extraSecure = z;
        }
        if ((i & 32) == 0) {
            this.supportedSystems = new SystemSupport((Version) null, (Version) null, (Version) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.supportedSystems = systemSupport;
        }
        if ((i & 64) == 0) {
            this.dependentExtensions = SetsKt.emptySet();
        } else {
            this.dependentExtensions = set;
        }
        if ((i & 128) == 0) {
            this.manifest = MapsKt.emptyMap();
        } else {
            this.manifest = map;
        }
        Boolean bool = null;
        Object[] objArr = 0;
        if ((i & 256) == 0) {
            this.remoteBaseUrl = null;
        } else {
            this.remoteBaseUrl = httpUrl;
        }
        this.compatibilityFlags = (i & 512) == 0 ? new CompatibilityFlags(bool, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : compatibilityFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_manifest(AppInfo self, Encoding3 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.identifier);
        int i = 1;
        output.encodeSerializableElement(serialDesc, 1, VersionSerializer.INSTANCE, self.version);
        output.encodeStringElement(serialDesc, 2, self.build);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.kind);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.extraSecure) {
            output.encodeBooleanElement(serialDesc, 4, self.extraSecure);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5)) {
            output.encodeSerializableElement(serialDesc, 5, SystemSupport2.INSTANCE, self.supportedSystems);
        } else {
            if (!Intrinsics.areEqual(self.supportedSystems, new SystemSupport((Version) null, (Version) null, (Version) null, 7, (DefaultConstructorMarker) null))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.dependentExtensions, SetsKt.emptySet())) {
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.dependentExtensions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.manifest, MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.manifest);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.remoteBaseUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, HttpUrlSerializer.INSTANCE, self.remoteBaseUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && Intrinsics.areEqual(self.compatibilityFlags, new CompatibilityFlags((Boolean) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 9, AppInfo4.INSTANCE, self.compatibilityFlags);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Version getVersion() {
        return this.version;
    }

    public final String getBuild() {
        return this.build;
    }

    public final boolean getExtraSecure() {
        return this.extraSecure;
    }

    public final Set<String> getDependentExtensions() {
        return this.dependentExtensions;
    }

    public final Map<String, ManifestEntry> getManifest() {
        return this.manifest;
    }

    public final CompatibilityFlags getCompatibilityFlags() {
        return this.compatibilityFlags;
    }

    /* compiled from: AppInfo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/manifest/AppInfo$ManifestEntry;", "", "", "seen0", "", "sha256", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_manifest", "(Lmicrogram/manifest/AppInfo$ManifestEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSha256", "Companion", "$serializer", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ManifestEntry {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String sha256;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ManifestEntry) && Intrinsics.areEqual(this.sha256, ((ManifestEntry) other).sha256);
        }

        public int hashCode() {
            return this.sha256.hashCode();
        }

        public String toString() {
            return "ManifestEntry(sha256=" + this.sha256 + ")";
        }

        /* compiled from: AppInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/manifest/AppInfo$ManifestEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/AppInfo$ManifestEntry;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ManifestEntry> serializer() {
                return AppInfo5.INSTANCE;
            }
        }

        public /* synthetic */ ManifestEntry(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptions.throwMissingFieldException(i, 1, AppInfo5.INSTANCE.getDescriptor());
            }
            this.sha256 = str;
        }

        public final String getSha256() {
            return this.sha256;
        }
    }

    /* compiled from: AppInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m3636d2 = {"Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "", "", "neverTearDownAndroidUi", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_manifest", "(Lmicrogram/manifest/AppInfo$CompatibilityFlags;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getNeverTearDownAndroidUi", "()Ljava/lang/Boolean;", "Companion", "$serializer", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class CompatibilityFlags {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean neverTearDownAndroidUi;

        /* JADX WARN: Multi-variable type inference failed */
        public CompatibilityFlags() {
            this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CompatibilityFlags) && Intrinsics.areEqual(this.neverTearDownAndroidUi, ((CompatibilityFlags) other).neverTearDownAndroidUi);
        }

        public int hashCode() {
            Boolean bool = this.neverTearDownAndroidUi;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "CompatibilityFlags(neverTearDownAndroidUi=" + this.neverTearDownAndroidUi + ")";
        }

        /* compiled from: AppInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/manifest/AppInfo$CompatibilityFlags$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/AppInfo$CompatibilityFlags;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CompatibilityFlags> serializer() {
                return AppInfo4.INSTANCE;
            }
        }

        public /* synthetic */ CompatibilityFlags(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.neverTearDownAndroidUi = null;
            } else {
                this.neverTearDownAndroidUi = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_manifest(CompatibilityFlags self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.neverTearDownAndroidUi == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.neverTearDownAndroidUi);
        }

        public CompatibilityFlags(Boolean bool) {
            this.neverTearDownAndroidUi = bool;
        }

        public /* synthetic */ CompatibilityFlags(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getNeverTearDownAndroidUi() {
            return this.neverTearDownAndroidUi;
        }
    }
}
