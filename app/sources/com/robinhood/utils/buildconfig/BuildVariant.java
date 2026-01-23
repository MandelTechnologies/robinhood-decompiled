package com.robinhood.utils.buildconfig;

import com.robinhood.utils.android.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuildVariant.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/buildconfig/BuildVariant;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL_DEBUG", "INTERNAL_DEBUG", "EXTERNAL_RELEASE", "INTERNAL_RELEASE", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BuildVariant {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BuildVariant[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BuildVariant EXTERNAL_DEBUG = new BuildVariant("EXTERNAL_DEBUG", 0);
    public static final BuildVariant INTERNAL_DEBUG = new BuildVariant("INTERNAL_DEBUG", 1);
    public static final BuildVariant EXTERNAL_RELEASE = new BuildVariant("EXTERNAL_RELEASE", 2);
    public static final BuildVariant INTERNAL_RELEASE = new BuildVariant("INTERNAL_RELEASE", 3);

    private static final /* synthetic */ BuildVariant[] $values() {
        return new BuildVariant[]{EXTERNAL_DEBUG, INTERNAL_DEBUG, EXTERNAL_RELEASE, INTERNAL_RELEASE};
    }

    public static EnumEntries<BuildVariant> getEntries() {
        return $ENTRIES;
    }

    private BuildVariant(String str, int i) {
    }

    static {
        BuildVariant[] buildVariantArr$values = $values();
        $VALUES = buildVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(buildVariantArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: BuildVariant.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/buildconfig/BuildVariant$Companion;", "", "<init>", "()V", "compute", "Lcom/robinhood/utils/buildconfig/BuildVariant;", "toReleaseChannel", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: BuildVariant.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes12.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BuildVariant.values().length];
                try {
                    iArr[BuildVariant.EXTERNAL_RELEASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BuildVariant.EXTERNAL_DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BuildVariant.INTERNAL_DEBUG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BuildVariant.INTERNAL_RELEASE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BuildVariant compute() {
            String str = BuildConfig.FLAVOR;
            Intrinsics.areEqual(str, BuildFlavors.EXTERNAL);
            Intrinsics.areEqual(str, "internal");
            if (Intrinsics.areEqual(str, BuildFlavors.EXTERNAL)) {
                return BuildVariant.EXTERNAL_RELEASE;
            }
            if (Intrinsics.areEqual(str, "internal")) {
                return BuildVariant.INTERNAL_RELEASE;
            }
            throw new IllegalStateException(("Unknown build variant - BuildConfig.FLAVOR: " + str + ", BuildConfig.DEBUG: false").toString());
        }

        public final String toReleaseChannel() {
            int i = WhenMappings.$EnumSwitchMapping$0[compute().ordinal()];
            if (i == 1) {
                return "APP_STORE";
            }
            if (i == 2 || i == 3 || i == 4) {
                return "NIGHTLY";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static BuildVariant valueOf(String str) {
        return (BuildVariant) Enum.valueOf(BuildVariant.class, str);
    }

    public static BuildVariant[] values() {
        return (BuildVariant[]) $VALUES.clone();
    }
}
