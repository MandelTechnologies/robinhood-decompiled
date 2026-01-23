package com.robinhood.android.doc.p109ui.initial;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogResources.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DialogResources;", "", "id", "", "title", "message", "tag", "", "drawableRes", "showUpdateAppAction", "", "<init>", "(IIILjava/lang/String;Ljava/lang/Integer;Z)V", "getId", "()I", "getTitle", "getMessage", "getTag", "()Ljava/lang/String;", "getDrawableRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowUpdateAppAction", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IIILjava/lang/String;Ljava/lang/Integer;Z)Lcom/robinhood/android/doc/ui/initial/DialogResources;", "equals", "other", "hashCode", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DialogResources {
    public static final int $stable = 0;
    private final Integer drawableRes;
    private final int id;
    private final int message;
    private final boolean showUpdateAppAction;
    private final String tag;
    private final int title;

    public static /* synthetic */ DialogResources copy$default(DialogResources dialogResources, int i, int i2, int i3, String str, Integer num, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dialogResources.id;
        }
        if ((i4 & 2) != 0) {
            i2 = dialogResources.title;
        }
        if ((i4 & 4) != 0) {
            i3 = dialogResources.message;
        }
        if ((i4 & 8) != 0) {
            str = dialogResources.tag;
        }
        if ((i4 & 16) != 0) {
            num = dialogResources.drawableRes;
        }
        if ((i4 & 32) != 0) {
            z = dialogResources.showUpdateAppAction;
        }
        Integer num2 = num;
        boolean z2 = z;
        return dialogResources.copy(i, i2, i3, str, num2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowUpdateAppAction() {
        return this.showUpdateAppAction;
    }

    public final DialogResources copy(int id, int title, int message, String tag, Integer drawableRes, boolean showUpdateAppAction) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DialogResources(id, title, message, tag, drawableRes, showUpdateAppAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogResources)) {
            return false;
        }
        DialogResources dialogResources = (DialogResources) other;
        return this.id == dialogResources.id && this.title == dialogResources.title && this.message == dialogResources.message && Intrinsics.areEqual(this.tag, dialogResources.tag) && Intrinsics.areEqual(this.drawableRes, dialogResources.drawableRes) && this.showUpdateAppAction == dialogResources.showUpdateAppAction;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31) + this.tag.hashCode()) * 31;
        Integer num = this.drawableRes;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.showUpdateAppAction);
    }

    public String toString() {
        return "DialogResources(id=" + this.id + ", title=" + this.title + ", message=" + this.message + ", tag=" + this.tag + ", drawableRes=" + this.drawableRes + ", showUpdateAppAction=" + this.showUpdateAppAction + ")";
    }

    public DialogResources(int i, int i2, int i3, String tag, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.id = i;
        this.title = i2;
        this.message = i3;
        this.tag = tag;
        this.drawableRes = num;
        this.showUpdateAppAction = z;
    }

    public /* synthetic */ DialogResources(int i, int i2, int i3, String str, Integer num, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, (i4 & 16) != 0 ? null : num, (i4 & 32) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    public final boolean getShowUpdateAppAction() {
        return this.showUpdateAppAction;
    }
}
