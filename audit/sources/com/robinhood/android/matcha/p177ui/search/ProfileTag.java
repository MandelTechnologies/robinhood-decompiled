package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/ProfileTag;", "", "profile", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "name", "", "isSelected", "", "<init>", "(Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Z)V", "getProfile", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getName", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProfileTag {
    public static final int $stable = 8;
    private final boolean isSelected;
    private final String name;
    private final ProfileAvatarState profile;

    public static /* synthetic */ ProfileTag copy$default(ProfileTag profileTag, ProfileAvatarState profileAvatarState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            profileAvatarState = profileTag.profile;
        }
        if ((i & 2) != 0) {
            str = profileTag.name;
        }
        if ((i & 4) != 0) {
            z = profileTag.isSelected;
        }
        return profileTag.copy(profileAvatarState, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ProfileAvatarState getProfile() {
        return this.profile;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final ProfileTag copy(ProfileAvatarState profile, String name, boolean isSelected) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ProfileTag(profile, name, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileTag)) {
            return false;
        }
        ProfileTag profileTag = (ProfileTag) other;
        return Intrinsics.areEqual(this.profile, profileTag.profile) && Intrinsics.areEqual(this.name, profileTag.name) && this.isSelected == profileTag.isSelected;
    }

    public int hashCode() {
        return (((this.profile.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "ProfileTag(profile=" + this.profile + ", name=" + this.name + ", isSelected=" + this.isSelected + ")";
    }

    public ProfileTag(ProfileAvatarState profile, String name, boolean z) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(name, "name");
        this.profile = profile;
        this.name = name;
        this.isSelected = z;
    }

    public final ProfileAvatarState getProfile() {
        return this.profile;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
