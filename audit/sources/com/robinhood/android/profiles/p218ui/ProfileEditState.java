package com.robinhood.android.profiles.p218ui;

import android.graphics.Bitmap;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileEditViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003JW\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/ProfileEditState;", "", "username", "", ResourceTypes.COLOR, "Lcom/robinhood/models/db/ProfileColor;", "picture", "Lcom/robinhood/models/db/MediaMetadata;", "editedUsername", "editedColor", "editedPicture", "Landroid/graphics/Bitmap;", "removePicture", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/ProfileColor;Lcom/robinhood/models/db/MediaMetadata;Ljava/lang/String;Lcom/robinhood/models/db/ProfileColor;Landroid/graphics/Bitmap;Z)V", "getUsername", "()Ljava/lang/String;", "getColor", "()Lcom/robinhood/models/db/ProfileColor;", "getPicture", "()Lcom/robinhood/models/db/MediaMetadata;", "getEditedUsername", "getEditedColor", "getEditedPicture", "()Landroid/graphics/Bitmap;", "getRemovePicture", "()Z", "displayPicture", "getDisplayPicture", "hasPendingChanges", "getHasPendingChanges", "showRemovePictureOption", "getShowRemovePictureOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfileEditState {
    private final Profile2 color;
    private final Profile2 editedColor;
    private final Bitmap editedPicture;
    private final String editedUsername;
    private final MediaMetadata picture;
    private final boolean removePicture;
    private final String username;

    public static /* synthetic */ ProfileEditState copy$default(ProfileEditState profileEditState, String str, Profile2 profile2, MediaMetadata mediaMetadata, String str2, Profile2 profile22, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileEditState.username;
        }
        if ((i & 2) != 0) {
            profile2 = profileEditState.color;
        }
        if ((i & 4) != 0) {
            mediaMetadata = profileEditState.picture;
        }
        if ((i & 8) != 0) {
            str2 = profileEditState.editedUsername;
        }
        if ((i & 16) != 0) {
            profile22 = profileEditState.editedColor;
        }
        if ((i & 32) != 0) {
            bitmap = profileEditState.editedPicture;
        }
        if ((i & 64) != 0) {
            z = profileEditState.removePicture;
        }
        Bitmap bitmap2 = bitmap;
        boolean z2 = z;
        Profile2 profile23 = profile22;
        MediaMetadata mediaMetadata2 = mediaMetadata;
        return profileEditState.copy(str, profile2, mediaMetadata2, str2, profile23, bitmap2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final Profile2 getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final MediaMetadata getPicture() {
        return this.picture;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEditedUsername() {
        return this.editedUsername;
    }

    /* renamed from: component5, reason: from getter */
    public final Profile2 getEditedColor() {
        return this.editedColor;
    }

    /* renamed from: component6, reason: from getter */
    public final Bitmap getEditedPicture() {
        return this.editedPicture;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getRemovePicture() {
        return this.removePicture;
    }

    public final ProfileEditState copy(String username, Profile2 color, MediaMetadata picture, String editedUsername, Profile2 editedColor, Bitmap editedPicture, boolean removePicture) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(editedColor, "editedColor");
        return new ProfileEditState(username, color, picture, editedUsername, editedColor, editedPicture, removePicture);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileEditState)) {
            return false;
        }
        ProfileEditState profileEditState = (ProfileEditState) other;
        return Intrinsics.areEqual(this.username, profileEditState.username) && this.color == profileEditState.color && Intrinsics.areEqual(this.picture, profileEditState.picture) && Intrinsics.areEqual(this.editedUsername, profileEditState.editedUsername) && this.editedColor == profileEditState.editedColor && Intrinsics.areEqual(this.editedPicture, profileEditState.editedPicture) && this.removePicture == profileEditState.removePicture;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.color.hashCode()) * 31;
        MediaMetadata mediaMetadata = this.picture;
        int iHashCode2 = (iHashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
        String str2 = this.editedUsername;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.editedColor.hashCode()) * 31;
        Bitmap bitmap = this.editedPicture;
        return ((iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Boolean.hashCode(this.removePicture);
    }

    public String toString() {
        return "ProfileEditState(username=" + this.username + ", color=" + this.color + ", picture=" + this.picture + ", editedUsername=" + this.editedUsername + ", editedColor=" + this.editedColor + ", editedPicture=" + this.editedPicture + ", removePicture=" + this.removePicture + ")";
    }

    public ProfileEditState(String str, Profile2 color, MediaMetadata mediaMetadata, String str2, Profile2 editedColor, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(editedColor, "editedColor");
        this.username = str;
        this.color = color;
        this.picture = mediaMetadata;
        this.editedUsername = str2;
        this.editedColor = editedColor;
        this.editedPicture = bitmap;
        this.removePicture = z;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Profile2 getColor() {
        return this.color;
    }

    public final MediaMetadata getPicture() {
        return this.picture;
    }

    public final String getEditedUsername() {
        return this.editedUsername;
    }

    public final Profile2 getEditedColor() {
        return this.editedColor;
    }

    public final Bitmap getEditedPicture() {
        return this.editedPicture;
    }

    public final boolean getRemovePicture() {
        return this.removePicture;
    }

    public final MediaMetadata getDisplayPicture() {
        if (this.removePicture) {
            return null;
        }
        return this.picture;
    }

    public final boolean getHasPendingChanges() {
        if (Intrinsics.areEqual(this.username, this.editedUsername) && this.color == this.editedColor && this.editedPicture == null) {
            return this.picture != null && this.removePicture;
        }
        return true;
    }

    public final boolean getShowRemovePictureOption() {
        return ((this.picture == null || this.removePicture) && this.editedPicture == null) ? false : true;
    }
}
