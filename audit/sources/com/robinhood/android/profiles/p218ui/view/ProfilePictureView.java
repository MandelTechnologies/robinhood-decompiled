package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.robinhood.android.mediaservice.MediaImageLoader;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfilePictureView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfilePictureView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "getMediaImageLoader", "()Lcom/robinhood/android/mediaservice/MediaImageLoader;", "setMediaImageLoader", "(Lcom/robinhood/android/mediaservice/MediaImageLoader;)V", "isPictureSet", "", "()Z", "pictureImageContainer", "Landroid/view/View;", "defaultPictureImg", "Landroid/widget/ImageView;", "pictureImg", "actionIconImg", "bind", "", "picture", "Lcom/robinhood/models/db/MediaMetadata;", "icon", "Lcom/robinhood/android/profiles/ui/view/ProfilePictureView$ActionIcon;", "bitmap", "Landroid/graphics/Bitmap;", "ActionIcon", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfilePictureView extends Hammer_ProfilePictureView {
    private final ImageView actionIconImg;
    private final ImageView defaultPictureImg;
    public MediaImageLoader mediaImageLoader;
    private final View pictureImageContainer;
    private final ImageView pictureImg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C25904R.layout.merge_profile_picture_view, true);
        View viewFindViewById = findViewById(C25904R.id.profile_picture_image_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.pictureImageContainer = viewFindViewById;
        View viewFindViewById2 = findViewById(C25904R.id.profile_picture_default_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.defaultPictureImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C25904R.id.profile_picture_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.pictureImg = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C25904R.id.profile_picture_plus_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.actionIconImg = (ImageView) viewFindViewById4;
        viewFindViewById.setClipToOutline(true);
    }

    public final MediaImageLoader getMediaImageLoader() {
        MediaImageLoader mediaImageLoader = this.mediaImageLoader;
        if (mediaImageLoader != null) {
            return mediaImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaImageLoader");
        return null;
    }

    public final void setMediaImageLoader(MediaImageLoader mediaImageLoader) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "<set-?>");
        this.mediaImageLoader = mediaImageLoader;
    }

    public final boolean isPictureSet() {
        return this.pictureImg.getVisibility() == 0 && this.defaultPictureImg.getVisibility() != 0;
    }

    public final void bind(MediaMetadata picture, ActionIcon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.actionIconImg.setImageResource(icon.getResourceId());
        if (picture == null) {
            getMediaImageLoader().cancelRequest(this.pictureImg);
            this.defaultPictureImg.setVisibility(0);
            this.pictureImg.setVisibility(8);
        } else {
            this.defaultPictureImg.setVisibility(0);
            this.pictureImg.setVisibility(0);
            getMediaImageLoader().cancelRequest(this.pictureImg);
            ImageLoader.ImageRequest.DefaultImpls.into$default(getMediaImageLoader().load(picture).fit().centerCrop().noFade(), this.pictureImg, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfilePictureView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfilePictureView.bind$lambda$0(this.f$0);
                }
            }, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ProfilePictureView profilePictureView) {
        profilePictureView.defaultPictureImg.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void bind(Bitmap bitmap, ActionIcon icon) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(icon, "icon");
        getMediaImageLoader().cancelRequest(this.pictureImg);
        this.actionIconImg.setImageResource(icon.getResourceId());
        this.defaultPictureImg.setVisibility(8);
        this.pictureImg.setVisibility(0);
        this.pictureImg.setImageBitmap(bitmap);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfilePictureView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfilePictureView$ActionIcon;", "", "resourceId", "", "<init>", "(Ljava/lang/String;II)V", "getResourceId", "()I", "PLUS", "EDIT", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionIcon[] $VALUES;
        private final int resourceId;
        public static final ActionIcon PLUS = new ActionIcon("PLUS", 0, C25904R.drawable.svg_ic_profile_circle_plus_24dp);
        public static final ActionIcon EDIT = new ActionIcon("EDIT", 1, C25904R.drawable.svg_ic_profile_circle_edit_24dp);

        private static final /* synthetic */ ActionIcon[] $values() {
            return new ActionIcon[]{PLUS, EDIT};
        }

        public static EnumEntries<ActionIcon> getEntries() {
            return $ENTRIES;
        }

        private ActionIcon(String str, int i, int i2) {
            this.resourceId = i2;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        static {
            ActionIcon[] actionIconArr$values = $values();
            $VALUES = actionIconArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionIconArr$values);
        }

        public static ActionIcon valueOf(String str) {
            return (ActionIcon) Enum.valueOf(ActionIcon.class, str);
        }

        public static ActionIcon[] values() {
            return (ActionIcon[]) $VALUES.clone();
        }
    }
}
