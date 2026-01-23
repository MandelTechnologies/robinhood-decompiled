package com.robinhood.android.educationtour;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToolbarState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/educationtour/ToolbarState;", "", "title", "", "subtitle", "navIcon", "Landroid/graphics/drawable/Drawable;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "getNavIcon", "()Landroid/graphics/drawable/Drawable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ToolbarState {
    public static final int $stable = 8;
    private final Drawable navIcon;
    private final CharSequence subtitle;
    private final CharSequence title;

    public static /* synthetic */ ToolbarState copy$default(ToolbarState toolbarState, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = toolbarState.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = toolbarState.subtitle;
        }
        if ((i & 4) != 0) {
            drawable = toolbarState.navIcon;
        }
        return toolbarState.copy(charSequence, charSequence2, drawable);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Drawable getNavIcon() {
        return this.navIcon;
    }

    public final ToolbarState copy(CharSequence title, CharSequence subtitle, Drawable navIcon) {
        return new ToolbarState(title, subtitle, navIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarState)) {
            return false;
        }
        ToolbarState toolbarState = (ToolbarState) other;
        return Intrinsics.areEqual(this.title, toolbarState.title) && Intrinsics.areEqual(this.subtitle, toolbarState.subtitle) && Intrinsics.areEqual(this.navIcon, toolbarState.navIcon);
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.subtitle;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Drawable drawable = this.navIcon;
        return iHashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.subtitle;
        return "ToolbarState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", navIcon=" + this.navIcon + ")";
    }

    public ToolbarState(CharSequence charSequence, CharSequence charSequence2, Drawable drawable) {
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.navIcon = drawable;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final Drawable getNavIcon() {
        return this.navIcon;
    }
}
