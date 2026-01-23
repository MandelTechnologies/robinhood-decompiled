package androidx.webkit.internal;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes23.dex */
public abstract class StartupApiFeature {
    private static final Set<StartupApiFeature> sValues = new HashSet();
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    StartupApiFeature(String str, String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    /* renamed from: androidx.webkit.internal.StartupApiFeature$P */
    public static class C3028P extends StartupApiFeature {
        C3028P(String str, String str2) {
            super(str, str2);
        }
    }

    public static class NoFramework extends StartupApiFeature {
        NoFramework(String str, String str2) {
            super(str, str2);
        }
    }
}
