package microgram.manifest;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.github.z4kn4fein.semver.Version;
import io.github.z4kn4fein.semver.VersionSerializer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations;
import microgram.serialization.datetime.InstantEpochSecondsSerializer;
import microgram.serialization.p506io.HttpUrlSerializer;
import okhttp3.HttpUrl;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: Release.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcB·\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010)R3\u0010\u0007\u001a\u00150\u0006j\u0002`3¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\t068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010)R/\u0010\n\u001a\u00110\t¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\t0=8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bA\u00102\u001a\u0004\b?\u0010@R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bE\u00102\u001a\u0004\bC\u0010DR\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bG\u00102\u001a\u0004\bF\u0010DR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00102\u001a\u0004\bI\u0010JR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010/\u0012\u0004\bM\u00102\u001a\u0004\bL\u0010)R \u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bO\u00102\u001a\u0004\bN\u0010JR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bR\u00102\u001a\u0004\bQ\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010/\u0012\u0004\bT\u00102\u001a\u0004\bS\u0010)R$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010U\u0012\u0004\bX\u00102\u001a\u0004\bV\u0010WR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010/\u0012\u0004\bZ\u00102\u001a\u0004\bY\u0010)R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010[\u0012\u0004\b^\u00102\u001a\u0004\b\\\u0010]R \u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010B\u0012\u0004\b`\u00102\u001a\u0004\b_\u0010DR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010/\u0012\u0004\bb\u00102\u001a\u0004\ba\u0010)¨\u0006e"}, m3636d2 = {"Lmicrogram/manifest/Release;", "", "", "seen0", "", "appIdentifier", "Lokhttp3/HttpUrl;", "baseUrl", "build", "Lkotlinx/datetime/Instant;", "createdAt", "Lio/github/z4kn4fein/semver/Version;", "minAndroidAppVersion", "minIosAppVersion", "", "override", "packagePath", Constants.PREINSTALL, "priority", "releaseChannel", "Lmicrogram/manifest/Rollout;", "rollout", "sha256", "", "size", "version", "webEntryPoint", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lkotlinx/datetime/Instant;Lio/github/z4kn4fein/semver/Version;Lio/github/z4kn4fein/semver/Version;ZLjava/lang/String;ZILjava/lang/String;Lmicrogram/manifest/Rollout;Ljava/lang/String;JLio/github/z4kn4fein/semver/Version;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_manifest", "(Lmicrogram/manifest/Release;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppIdentifier", "getAppIdentifier$annotations", "()V", "Lmicrogram/serialization/io/HttpUrl;", "Lkotlinx/serialization/Serializable;", "with", "Lkotlin/reflect/KClass;", "Lokhttp3/HttpUrl;", "getBaseUrl", "()Lokhttp3/HttpUrl;", "getBaseUrl$annotations", "getBuild", "getBuild$annotations", "Lmicrogram/serialization/datetime/InstantEpochSecondsSerializer;", "Lkotlinx/datetime/Instant;", "getCreatedAt", "()Lkotlinx/datetime/Instant;", "getCreatedAt$annotations", "Lio/github/z4kn4fein/semver/Version;", "getMinAndroidAppVersion", "()Lio/github/z4kn4fein/semver/Version;", "getMinAndroidAppVersion$annotations", "getMinIosAppVersion", "getMinIosAppVersion$annotations", "Z", "getOverride", "()Z", "getOverride$annotations", "getPackagePath", "getPackagePath$annotations", "getPreinstall", "getPreinstall$annotations", "I", "getPriority", "getPriority$annotations", "getReleaseChannel", "getReleaseChannel$annotations", "Lmicrogram/manifest/Rollout;", "getRollout", "()Lmicrogram/manifest/Rollout;", "getRollout$annotations", "getSha256", "getSha256$annotations", "J", "getSize", "()J", "getSize$annotations", "getVersion", "getVersion$annotations", "getWebEntryPoint", "getWebEntryPoint$annotations", "Companion", "$serializer", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class Release {
    private final String appIdentifier;
    private final HttpUrl baseUrl;
    private final String build;
    private final Instant createdAt;
    private final Version minAndroidAppVersion;
    private final Version minIosAppVersion;
    private final boolean override;
    private final String packagePath;
    private final boolean preinstall;
    private final int priority;
    private final String releaseChannel;
    private final Rollout<?> rollout;
    private final String sha256;
    private final long size;
    private final Version version;
    private final String webEntryPoint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.manifest.Release$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Release._childSerializers$_anonymous_();
        }
    }), null, null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Release)) {
            return false;
        }
        Release release = (Release) other;
        return Intrinsics.areEqual(this.appIdentifier, release.appIdentifier) && Intrinsics.areEqual(this.baseUrl, release.baseUrl) && Intrinsics.areEqual(this.build, release.build) && Intrinsics.areEqual(this.createdAt, release.createdAt) && Intrinsics.areEqual(this.minAndroidAppVersion, release.minAndroidAppVersion) && Intrinsics.areEqual(this.minIosAppVersion, release.minIosAppVersion) && this.override == release.override && Intrinsics.areEqual(this.packagePath, release.packagePath) && this.preinstall == release.preinstall && this.priority == release.priority && Intrinsics.areEqual(this.releaseChannel, release.releaseChannel) && Intrinsics.areEqual(this.rollout, release.rollout) && Intrinsics.areEqual(this.sha256, release.sha256) && this.size == release.size && Intrinsics.areEqual(this.version, release.version) && Intrinsics.areEqual(this.webEntryPoint, release.webEntryPoint);
    }

    public int hashCode() {
        int iHashCode = ((((((this.appIdentifier.hashCode() * 31) + this.baseUrl.hashCode()) * 31) + this.build.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        Version version = this.minAndroidAppVersion;
        int iHashCode2 = (iHashCode + (version == null ? 0 : version.hashCode())) * 31;
        Version version2 = this.minIosAppVersion;
        int iHashCode3 = (((((((((iHashCode2 + (version2 == null ? 0 : version2.hashCode())) * 31) + Boolean.hashCode(this.override)) * 31) + this.packagePath.hashCode()) * 31) + Boolean.hashCode(this.preinstall)) * 31) + Integer.hashCode(this.priority)) * 31;
        String str = this.releaseChannel;
        int iHashCode4 = (((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.rollout.hashCode()) * 31) + this.sha256.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.version.hashCode()) * 31;
        String str2 = this.webEntryPoint;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Release(appIdentifier=" + this.appIdentifier + ", baseUrl=" + this.baseUrl + ", build=" + this.build + ", createdAt=" + this.createdAt + ", minAndroidAppVersion=" + this.minAndroidAppVersion + ", minIosAppVersion=" + this.minIosAppVersion + ", override=" + this.override + ", packagePath=" + this.packagePath + ", preinstall=" + this.preinstall + ", priority=" + this.priority + ", releaseChannel=" + this.releaseChannel + ", rollout=" + this.rollout + ", sha256=" + this.sha256 + ", size=" + this.size + ", version=" + this.version + ", webEntryPoint=" + this.webEntryPoint + ")";
    }

    /* compiled from: Release.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/manifest/Release$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/Release;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Release> serializer() {
            return Release2.INSTANCE;
        }
    }

    public /* synthetic */ Release(int i, String str, HttpUrl httpUrl, String str2, Instant instant, Version version, Version version2, boolean z, String str3, boolean z2, int i2, String str4, Rollout rollout, String str5, long j, Version version3, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            PluginExceptions.throwMissingFieldException(i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, Release2.INSTANCE.getDescriptor());
        }
        this.appIdentifier = str;
        this.baseUrl = httpUrl;
        this.build = str2;
        this.createdAt = instant;
        this.minAndroidAppVersion = version;
        this.minIosAppVersion = version2;
        this.override = z;
        this.packagePath = str3;
        this.preinstall = z2;
        this.priority = i2;
        this.releaseChannel = str4;
        this.rollout = rollout;
        this.sha256 = str5;
        this.size = j;
        this.version = version3;
        this.webEntryPoint = str6;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_manifest(Release self, Encoding3 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.appIdentifier);
        output.encodeSerializableElement(serialDesc, 1, HttpUrlSerializer.INSTANCE, self.baseUrl);
        output.encodeStringElement(serialDesc, 2, self.build);
        output.encodeSerializableElement(serialDesc, 3, InstantEpochSecondsSerializer.INSTANCE, self.createdAt);
        VersionSerializer versionSerializer = VersionSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, versionSerializer, self.minAndroidAppVersion);
        output.encodeNullableSerializableElement(serialDesc, 5, versionSerializer, self.minIosAppVersion);
        output.encodeBooleanElement(serialDesc, 6, self.override);
        output.encodeStringElement(serialDesc, 7, self.packagePath);
        output.encodeBooleanElement(serialDesc, 8, self.preinstall);
        output.encodeIntElement(serialDesc, 9, self.priority);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.releaseChannel);
        output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.rollout);
        output.encodeStringElement(serialDesc, 12, self.sha256);
        output.encodeLongElement(serialDesc, 13, self.size);
        output.encodeSerializableElement(serialDesc, 14, versionSerializer, self.version);
        output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.webEntryPoint);
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        final String str = "type";
        return new SealedSerializer("microgram.manifest.Rollout", Reflection.getOrCreateKotlinClass(Rollout.class), new KClass[]{Reflection.getOrCreateKotlinClass(DefaultRollout.class), Reflection.getOrCreateKotlinClass(ExperimentRollout.class), Reflection.getOrCreateKotlinClass(PercentageRollout.class), Reflection.getOrCreateKotlinClass(TimePhasedRollout.class)}, new KSerializer[]{new ObjectSerializer(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, DefaultRollout.INSTANCE, new Annotation[]{new JsonAnnotations(str) { // from class: microgram.manifest.Release$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0
            private final /* synthetic */ String discriminator;

            {
                Intrinsics.checkNotNullParameter(str, "discriminator");
                this.discriminator = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonAnnotations.class;
            }

            @Override // kotlinx.serialization.json.JsonAnnotations
            public final /* synthetic */ String discriminator() {
                return this.discriminator;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonAnnotations) && Intrinsics.areEqual(discriminator(), ((JsonAnnotations) obj).discriminator());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.discriminator.hashCode() ^ 707790692;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            }
        }}), ExperimentRollout$$serializer.INSTANCE, PercentageRollout$$serializer.INSTANCE, TimePhasedRollout$$serializer.INSTANCE}, new Annotation[]{new JsonAnnotations(str) { // from class: microgram.manifest.Release$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0
            private final /* synthetic */ String discriminator;

            {
                Intrinsics.checkNotNullParameter(str, "discriminator");
                this.discriminator = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonAnnotations.class;
            }

            @Override // kotlinx.serialization.json.JsonAnnotations
            public final /* synthetic */ String discriminator() {
                return this.discriminator;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonAnnotations) && Intrinsics.areEqual(discriminator(), ((JsonAnnotations) obj).discriminator());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.discriminator.hashCode() ^ 707790692;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            }
        }});
    }

    public final HttpUrl getBaseUrl() {
        return this.baseUrl;
    }

    public final String getBuild() {
        return this.build;
    }

    public final Version getMinAndroidAppVersion() {
        return this.minAndroidAppVersion;
    }

    public final String getPackagePath() {
        return this.packagePath;
    }

    public final Rollout<?> getRollout() {
        return this.rollout;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final Version getVersion() {
        return this.version;
    }
}
