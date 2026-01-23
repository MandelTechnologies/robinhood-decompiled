package com.robinhood.utils;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: SemanticVersion.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/SemanticVersion;", "", "major", "", "minor", "patch", "<init>", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "toString", "", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class SemanticVersion implements Comparable<SemanticVersion> {
    private final int major;
    private final int minor;
    private final int patch;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Comparator<SemanticVersion> COMPARATOR = ComparisonsKt.compareBy(new PropertyReference1Impl() { // from class: com.robinhood.utils.SemanticVersion$Companion$COMPARATOR$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return Integer.valueOf(((SemanticVersion) obj).getMajor());
        }
    }, new PropertyReference1Impl() { // from class: com.robinhood.utils.SemanticVersion$Companion$COMPARATOR$2
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return Integer.valueOf(((SemanticVersion) obj).getMinor());
        }
    }, new PropertyReference1Impl() { // from class: com.robinhood.utils.SemanticVersion$Companion$COMPARATOR$3
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return Integer.valueOf(((SemanticVersion) obj).getPatch());
        }
    });
    private static final Regex PATTERN = new Regex("(\\d+)\\.(\\d+)\\.(\\d+)(?:-.+)?");
    private static final SemanticVersion MAX_VALUE = new SemanticVersion(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

    public static /* synthetic */ SemanticVersion copy$default(SemanticVersion semanticVersion, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = semanticVersion.major;
        }
        if ((i4 & 2) != 0) {
            i2 = semanticVersion.minor;
        }
        if ((i4 & 4) != 0) {
            i3 = semanticVersion.patch;
        }
        return semanticVersion.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    public final SemanticVersion copy(int major, int minor, int patch) {
        return new SemanticVersion(major, minor, patch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticVersion)) {
            return false;
        }
        SemanticVersion semanticVersion = (SemanticVersion) other;
        return this.major == semanticVersion.major && this.minor == semanticVersion.minor && this.patch == semanticVersion.patch;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
    }

    public SemanticVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (i < 0) {
            throw new IllegalArgumentException(("Major version must be >= 0: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("Minor version must be >= 0: " + i2).toString());
        }
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Patch version must be >= 0: " + i3).toString());
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major + "." + this.minor + "." + this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(SemanticVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return COMPARATOR.compare(this, other);
    }

    /* compiled from: SemanticVersion.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/SemanticVersion$Companion;", "", "<init>", "()V", "COMPARATOR", "Ljava/util/Comparator;", "Lcom/robinhood/utils/SemanticVersion;", "Lkotlin/Comparator;", "PATTERN", "Lkotlin/text/Regex;", "MAX_VALUE", "getMAX_VALUE", "()Lcom/robinhood/utils/SemanticVersion;", "parse", "input", "", "parseOrNull", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SemanticVersion getMAX_VALUE() {
            return SemanticVersion.MAX_VALUE;
        }

        public final SemanticVersion parse(String input) {
            MatchResult.Destructured destructured;
            Intrinsics.checkNotNullParameter(input, "input");
            MatchResult matchResultMatchEntire = SemanticVersion.PATTERN.matchEntire(input);
            if (matchResultMatchEntire == null || (destructured = matchResultMatchEntire.getDestructured()) == null) {
                throw new NumberFormatException("Version does not match " + SemanticVersion.PATTERN + ": " + input);
            }
            return new SemanticVersion(Integer.parseInt(destructured.getMatch().getGroupValues().get(1)), Integer.parseInt(destructured.getMatch().getGroupValues().get(2)), Integer.parseInt(destructured.getMatch().getGroupValues().get(3)));
        }

        public final SemanticVersion parseOrNull(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                return parse(input);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }
}
