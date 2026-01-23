package io.github.z4kn4fein.semver;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"", "", "strict", "Lio/github/z4kn4fein/semver/Version;", "toVersion", "(Ljava/lang/String;Z)Lio/github/z4kn4fein/semver/Version;", "Lio/github/z4kn4fein/semver/PreRelease;", "toPreRelease", "(Ljava/lang/String;)Lio/github/z4kn4fein/semver/PreRelease;", "semver"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.github.z4kn4fein.semver.StringExtensionsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class StringExtensions2 {
    public static final Version toVersion(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Version.INSTANCE.parse(str, z);
    }

    public static /* synthetic */ Version toVersion$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toVersion(str, z);
    }

    public static final PreRelease toPreRelease(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return PreRelease.INSTANCE.invoke(str);
    }
}
