package com.robinhood.android.jointaccounts.onboarding.creation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCta.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCta;", "", "title", "", "loggingIdentifier", "deeplinkTemplate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLoggingIdentifier", "getDeeplinkTemplate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountCta {
    public static final int $stable = 0;
    private final String deeplinkTemplate;
    private final String loggingIdentifier;
    private final String title;

    public static /* synthetic */ JointAccountCta copy$default(JointAccountCta jointAccountCta, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountCta.title;
        }
        if ((i & 2) != 0) {
            str2 = jointAccountCta.loggingIdentifier;
        }
        if ((i & 4) != 0) {
            str3 = jointAccountCta.deeplinkTemplate;
        }
        return jointAccountCta.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }

    public final JointAccountCta copy(String title, String loggingIdentifier, String deeplinkTemplate) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new JointAccountCta(title, loggingIdentifier, deeplinkTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountCta)) {
            return false;
        }
        JointAccountCta jointAccountCta = (JointAccountCta) other;
        return Intrinsics.areEqual(this.title, jointAccountCta.title) && Intrinsics.areEqual(this.loggingIdentifier, jointAccountCta.loggingIdentifier) && Intrinsics.areEqual(this.deeplinkTemplate, jointAccountCta.deeplinkTemplate);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.loggingIdentifier.hashCode()) * 31;
        String str = this.deeplinkTemplate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "JointAccountCta(title=" + this.title + ", loggingIdentifier=" + this.loggingIdentifier + ", deeplinkTemplate=" + this.deeplinkTemplate + ")";
    }

    public JointAccountCta(String title, String loggingIdentifier, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.title = title;
        this.loggingIdentifier = loggingIdentifier;
        this.deeplinkTemplate = str;
    }

    public /* synthetic */ JointAccountCta(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }
}
