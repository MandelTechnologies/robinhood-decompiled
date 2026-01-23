package io.github.z4kn4fein.semver;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: PreRelease.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lio/github/z4kn4fein/semver/PreRelease;", "", "", "", "parts", "<init>", "(Ljava/util/List;)V", "part1", "part2", "", "compareParts", "(Ljava/lang/String;Ljava/lang/String;)I", "other", "compareTo", "(Lio/github/z4kn4fein/semver/PreRelease;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "Companion", "semver"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PreRelease implements Comparable<PreRelease> {
    private final List<String> parts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex onlyNumberRegex = new Regex("^[0-9]+$");
    private static final Regex onlyAlphaNumericAndHyphenRegex = new Regex("^[0-9a-zA-Z-]+$");

    /* renamed from: default, reason: not valid java name */
    private static final PreRelease f9643default = new PreRelease(CollectionsKt.listOf("0"));

    public /* synthetic */ PreRelease(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private PreRelease(List<String> list) {
        this.parts = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(PreRelease other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = this.parts.size();
        int size2 = other.parts.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareParts = compareParts(this.parts.get(i), other.parts.get(i));
            if (iCompareParts != 0) {
                return iCompareParts;
            }
        }
        return Intrinsics.compare(size, size2);
    }

    public boolean equals(Object other) {
        PreRelease preRelease = other instanceof PreRelease ? (PreRelease) other : null;
        return preRelease != null && compareTo(preRelease) == 0;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.parts, ".", null, null, 0, null, null, 62, null);
    }

    private final int compareParts(String part1, String part2) {
        Integer intOrNull = StringsKt.toIntOrNull(part1);
        Integer intOrNull2 = StringsKt.toIntOrNull(part2);
        if (intOrNull != null && intOrNull2 == null) {
            return -1;
        }
        if (intOrNull == null && intOrNull2 != null) {
            return 1;
        }
        if (intOrNull != null && intOrNull2 != null) {
            return Intrinsics.compare(intOrNull.intValue(), intOrNull2.intValue());
        }
        return part1.compareTo(part2);
    }

    /* compiled from: PreRelease.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lio/github/z4kn4fein/semver/PreRelease$Companion;", "", "<init>", "()V", "", "preReleaseString", "", "validate", "(Ljava/lang/String;)Ljava/util/List;", "Lio/github/z4kn4fein/semver/PreRelease;", "invoke", "(Ljava/lang/String;)Lio/github/z4kn4fein/semver/PreRelease;", "DEFAULT_INIT_PART", "Ljava/lang/String;", "Lkotlin/text/Regex;", "onlyAlphaNumericAndHyphenRegex", "Lkotlin/text/Regex;", "onlyNumberRegex", "semver"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreRelease invoke(String preReleaseString) {
            Intrinsics.checkNotNullParameter(preReleaseString, "preReleaseString");
            return new PreRelease(validate(preReleaseString), null);
        }

        private final List<String> validate(String preReleaseString) throws VersionFormatException {
            String str;
            if (StringsKt.isBlank(preReleaseString)) {
                return CollectionsKt.listOf("0");
            }
            List<String> listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim(preReleaseString).toString(), new char[]{'.'}, false, 0, 6, (Object) null);
            for (String str2 : listSplit$default) {
                if (StringsKt.isBlank(str2)) {
                    str = "Pre-release identity contains an empty part.";
                } else if (PreRelease.onlyNumberRegex.matches(str2) && str2.length() > 1 && str2.charAt(0) == '0') {
                    str = "Pre-release part '" + str2 + "' is numeric but contains a leading zero.";
                } else {
                    str = PreRelease.onlyAlphaNumericAndHyphenRegex.matches(str2) ? null : "Pre-release part '" + str2 + "' contains an invalid character.";
                }
                if (str != null) {
                    throw new VersionFormatException(str + " (" + preReleaseString + ')');
                }
            }
            return listSplit$default;
        }
    }
}
