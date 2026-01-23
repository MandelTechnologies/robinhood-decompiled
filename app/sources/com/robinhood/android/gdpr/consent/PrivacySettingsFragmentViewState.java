package com.robinhood.android.gdpr.consent;

import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsFragmentViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;", "", "enabledSet", "", "Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "expandedSet", "privacyPolicyLink", "Lcom/robinhood/utils/resource/StringResource;", "cookiePolicyLink", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getEnabledSet", "()Ljava/util/Set;", "getExpandedSet", "getPrivacyPolicyLink", "()Lcom/robinhood/utils/resource/StringResource;", "getCookiePolicyLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PrivacySettingsFragmentViewState {
    public static final int $stable = 8;
    private final StringResource cookiePolicyLink;
    private final Set<PrivacySetting> enabledSet;
    private final Set<PrivacySetting> expandedSet;
    private final StringResource privacyPolicyLink;

    public PrivacySettingsFragmentViewState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacySettingsFragmentViewState copy$default(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Set set, Set set2, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = privacySettingsFragmentViewState.enabledSet;
        }
        if ((i & 2) != 0) {
            set2 = privacySettingsFragmentViewState.expandedSet;
        }
        if ((i & 4) != 0) {
            stringResource = privacySettingsFragmentViewState.privacyPolicyLink;
        }
        if ((i & 8) != 0) {
            stringResource2 = privacySettingsFragmentViewState.cookiePolicyLink;
        }
        return privacySettingsFragmentViewState.copy(set, set2, stringResource, stringResource2);
    }

    public final Set<PrivacySetting> component1() {
        return this.enabledSet;
    }

    public final Set<PrivacySetting> component2() {
        return this.expandedSet;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPrivacyPolicyLink() {
        return this.privacyPolicyLink;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getCookiePolicyLink() {
        return this.cookiePolicyLink;
    }

    public final PrivacySettingsFragmentViewState copy(Set<? extends PrivacySetting> enabledSet, Set<? extends PrivacySetting> expandedSet, StringResource privacyPolicyLink, StringResource cookiePolicyLink) {
        Intrinsics.checkNotNullParameter(enabledSet, "enabledSet");
        Intrinsics.checkNotNullParameter(expandedSet, "expandedSet");
        Intrinsics.checkNotNullParameter(privacyPolicyLink, "privacyPolicyLink");
        Intrinsics.checkNotNullParameter(cookiePolicyLink, "cookiePolicyLink");
        return new PrivacySettingsFragmentViewState(enabledSet, expandedSet, privacyPolicyLink, cookiePolicyLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySettingsFragmentViewState)) {
            return false;
        }
        PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) other;
        return Intrinsics.areEqual(this.enabledSet, privacySettingsFragmentViewState.enabledSet) && Intrinsics.areEqual(this.expandedSet, privacySettingsFragmentViewState.expandedSet) && Intrinsics.areEqual(this.privacyPolicyLink, privacySettingsFragmentViewState.privacyPolicyLink) && Intrinsics.areEqual(this.cookiePolicyLink, privacySettingsFragmentViewState.cookiePolicyLink);
    }

    public int hashCode() {
        return (((((this.enabledSet.hashCode() * 31) + this.expandedSet.hashCode()) * 31) + this.privacyPolicyLink.hashCode()) * 31) + this.cookiePolicyLink.hashCode();
    }

    public String toString() {
        return "PrivacySettingsFragmentViewState(enabledSet=" + this.enabledSet + ", expandedSet=" + this.expandedSet + ", privacyPolicyLink=" + this.privacyPolicyLink + ", cookiePolicyLink=" + this.cookiePolicyLink + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySettingsFragmentViewState(Set<? extends PrivacySetting> enabledSet, Set<? extends PrivacySetting> expandedSet, StringResource privacyPolicyLink, StringResource cookiePolicyLink) {
        Intrinsics.checkNotNullParameter(enabledSet, "enabledSet");
        Intrinsics.checkNotNullParameter(expandedSet, "expandedSet");
        Intrinsics.checkNotNullParameter(privacyPolicyLink, "privacyPolicyLink");
        Intrinsics.checkNotNullParameter(cookiePolicyLink, "cookiePolicyLink");
        this.enabledSet = enabledSet;
        this.expandedSet = expandedSet;
        this.privacyPolicyLink = privacyPolicyLink;
        this.cookiePolicyLink = cookiePolicyLink;
    }

    public /* synthetic */ PrivacySettingsFragmentViewState(Set set, Set set2, StringResource stringResource, StringResource stringResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.setOf(PrivacySetting.STRICTLY_NECESSARY) : set, (i & 2) != 0 ? SetsKt.emptySet() : set2, (i & 4) != 0 ? StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_privacy_policy_link_gb, new Object[0]) : stringResource, (i & 8) != 0 ? StringResource.INSTANCE.invoke(C17671R.string.privacy_settings_cookie_policy_link_gb, new Object[0]) : stringResource2);
    }

    public final Set<PrivacySetting> getEnabledSet() {
        return this.enabledSet;
    }

    public final Set<PrivacySetting> getExpandedSet() {
        return this.expandedSet;
    }

    public final StringResource getPrivacyPolicyLink() {
        return this.privacyPolicyLink;
    }

    public final StringResource getCookiePolicyLink() {
        return this.cookiePolicyLink;
    }
}
