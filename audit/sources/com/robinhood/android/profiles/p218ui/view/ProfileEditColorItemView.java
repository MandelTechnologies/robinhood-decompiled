package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.profiles.C25898R;
import com.robinhood.android.profiles.extensions.ProfileColors;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileEditColorItemView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "colorImg", "Landroid/widget/ImageView;", "checkmarkImg", "ringImg", "bind", "", "state", "Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView$Item;", "Item", "Companion", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileEditColorItemView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageView checkmarkImg;
    private final ImageView colorImg;
    private final ImageView ringImg;

    public /* synthetic */ ProfileEditColorItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileEditColorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C25898R.layout.merge_profile_edit_color_image_item, true);
        View viewFindViewById = findViewById(C25898R.id.profile_edit_color_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.colorImg = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C25898R.id.profile_edit_user_image_select_checkmark_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.checkmarkImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C25898R.id.profile_edit_user_image_select_ring_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.ringImg = (ImageView) viewFindViewById3;
    }

    public final void bind(Item state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.checkmarkImg.setVisibility(state.getSelected() ? 0 : 8);
        this.ringImg.setVisibility(state.getSelected() ? 0 : 8);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this.colorImg), ProfileColors.getThemeReference(state.getColor()), null, 2, null);
    }

    /* compiled from: ProfileEditColorItemView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView$Item;", "", ResourceTypes.COLOR, "Lcom/robinhood/models/db/ProfileColor;", "selected", "", "<init>", "(Lcom/robinhood/models/db/ProfileColor;Z)V", "getColor", "()Lcom/robinhood/models/db/ProfileColor;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        private final Profile2 color;
        private final boolean selected;

        public static /* synthetic */ Item copy$default(Item item, Profile2 profile2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                profile2 = item.color;
            }
            if ((i & 2) != 0) {
                z = item.selected;
            }
            return item.copy(profile2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Profile2 getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Item copy(Profile2 color, boolean selected) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Item(color, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.color == item.color && this.selected == item.selected;
        }

        public int hashCode() {
            return (this.color.hashCode() * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Item(color=" + this.color + ", selected=" + this.selected + ")";
        }

        public Item(Profile2 color, boolean z) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.selected = z;
        }

        public final Profile2 getColor() {
            return this.color;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }

    /* compiled from: ProfileEditColorItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/profiles/ui/view/ProfileEditColorItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProfileEditColorItemView> {
        private final /* synthetic */ Inflater<ProfileEditColorItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProfileEditColorItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProfileEditColorItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25898R.layout.include_profile_edit_color_image_item);
        }
    }
}
