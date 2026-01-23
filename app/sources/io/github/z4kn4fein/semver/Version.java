package io.github.z4kn4fein.semver;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: Version.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\"\u0010\u0018R\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%¨\u0006("}, m3636d2 = {"Lio/github/z4kn4fein/semver/Version;", "", "", "major", "minor", "patch", "Lio/github/z4kn4fein/semver/PreRelease;", "parsedPreRelease", "", "buildMetadata", "<init>", "(IIILio/github/z4kn4fein/semver/PreRelease;Ljava/lang/String;)V", "preRelease", "(IIILjava/lang/String;Ljava/lang/String;)V", "other", "compareTo", "(Lio/github/z4kn4fein/semver/Version;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getMajor", "getMinor", "getPatch", "Lio/github/z4kn4fein/semver/PreRelease;", "getParsedPreRelease$semver", "()Lio/github/z4kn4fein/semver/PreRelease;", "Ljava/lang/String;", "getBuildMetadata", "getPreRelease", "isPreRelease", "Z", "()Z", "isStable", "Companion", "semver"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = VersionSerializer.class)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Version implements Comparable<Version> {
    private final String buildMetadata;
    private final boolean isPreRelease;
    private final boolean isStable;
    private final int major;
    private final int minor;
    private final PreRelease parsedPreRelease;
    private final int patch;
    private final String preRelease;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex versionRegex = new Regex("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Regex looseVersionRegex = new Regex("^v?(0|[1-9]\\d*)(?:\\.(0|[1-9]\\d*))?(?:\\.(0|[1-9]\\d*))?(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Version min = new Version(0, 0, 0, null, null, 31, null);

    private Version(int i, int i2, int i3, PreRelease preRelease, String str) throws VersionFormatException {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.parsedPreRelease = preRelease;
        this.buildMetadata = str;
        if (i < 0) {
            throw new VersionFormatException("The major number must be >= 0.");
        }
        if (i2 < 0) {
            throw new VersionFormatException("The minor number must be >= 0.");
        }
        if (i3 < 0) {
            throw new VersionFormatException("The patch number must be >= 0.");
        }
        this.preRelease = preRelease != null ? preRelease.toString() : null;
        boolean z = false;
        this.isPreRelease = preRelease != null;
        if (i > 0 && preRelease == null) {
            z = true;
        }
        this.isStable = z;
    }

    public /* synthetic */ Version(int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2);
    }

    public Version(int i, int i2, int i3, String str, String str2) {
        this(i, i2, i3, str != null ? StringExtensions2.toPreRelease(str) : null, str2);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        PreRelease preRelease;
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.major;
        int i2 = other.major;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.minor;
        int i4 = other.minor;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.patch;
        int i6 = other.patch;
        if (i5 > i6) {
            return 1;
        }
        if (i5 < i6) {
            return -1;
        }
        PreRelease preRelease2 = this.parsedPreRelease;
        if (preRelease2 != null && other.parsedPreRelease == null) {
            return -1;
        }
        if (preRelease2 == null && other.parsedPreRelease != null) {
            return 1;
        }
        if (preRelease2 == null || (preRelease = other.parsedPreRelease) == null) {
            return 0;
        }
        return preRelease2.compareTo(preRelease);
    }

    public boolean equals(Object other) {
        Version version = other instanceof Version ? (Version) other : null;
        return version != null && compareTo(version) == 0;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.major) * (Integer.hashCode(this.minor) + 31) * (Integer.hashCode(this.patch) + 31);
        PreRelease preRelease = this.parsedPreRelease;
        return iHashCode * (preRelease != null ? preRelease.hashCode() + 31 : 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String string2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        String str = "";
        if (this.parsedPreRelease != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(this.parsedPreRelease);
            string2 = sb2.toString();
            if (string2 == null) {
                string2 = "";
            }
        }
        sb.append(string2);
        if (this.buildMetadata != null) {
            String str2 = '+' + this.buildMetadata;
            if (str2 != null) {
                str = str2;
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* compiled from: Version.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lio/github/z4kn4fein/semver/Version$Companion;", "", "<init>", "()V", "", "versionString", "", "strict", "Lio/github/z4kn4fein/semver/Version;", "parse", "(Ljava/lang/String;Z)Lio/github/z4kn4fein/semver/Version;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlin/text/Regex;", "looseVersionRegex", "Lkotlin/text/Regex;", "versionRegex", "semver"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Version> serializer() {
            return VersionSerializer.INSTANCE;
        }

        public final Version parse(String versionString, boolean strict) throws VersionFormatException {
            Intrinsics.checkNotNullParameter(versionString, "versionString");
            MatchResult matchResultMatchEntire = (strict ? Version.versionRegex : Version.looseVersionRegex).matchEntire(versionString);
            if (matchResultMatchEntire == null) {
                throw new VersionFormatException("Invalid version: " + versionString);
            }
            Integer intOrNull = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(1));
            Integer intOrNull2 = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(2));
            Integer intOrNull3 = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(3));
            MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(4);
            String value = matchGroup != null ? matchGroup.getValue() : null;
            MatchGroup matchGroup2 = matchResultMatchEntire.getGroups().get(5);
            String value2 = matchGroup2 != null ? matchGroup2.getValue() : null;
            if (strict && intOrNull != null && intOrNull2 != null && intOrNull3 != null) {
                return new Version(intOrNull.intValue(), intOrNull2.intValue(), intOrNull3.intValue(), value, value2);
            }
            if (!strict && intOrNull != null) {
                return new Version(intOrNull.intValue(), intOrNull2 != null ? intOrNull2.intValue() : 0, intOrNull3 != null ? intOrNull3.intValue() : 0, value, value2);
            }
            throw new VersionFormatException("Invalid version: " + versionString);
        }
    }
}
