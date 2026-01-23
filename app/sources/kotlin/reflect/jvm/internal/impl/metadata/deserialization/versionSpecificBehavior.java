package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: versionSpecificBehavior.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class versionSpecificBehavior {
    public static final boolean isVersionRequirementTableWrittenCorrectly(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isKotlin1Dot4OrLater(version);
    }

    public static final boolean isKotlin1Dot4OrLater(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return (version.getMajor() == 1 && version.getMinor() >= 4) || version.getMajor() > 1;
    }
}
