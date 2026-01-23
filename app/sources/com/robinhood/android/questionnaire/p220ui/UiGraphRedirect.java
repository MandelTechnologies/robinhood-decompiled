package com.robinhood.android.questionnaire.p220ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiGraphRedirect.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "Landroid/os/Parcelable;", "redirect", "", "redirectRequired", "", "<init>", "(Ljava/lang/String;Z)V", "getRedirect", "()Ljava/lang/String;", "getRedirectRequired", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiGraphRedirect implements Parcelable {
    public static final Parcelable.Creator<UiGraphRedirect> CREATOR = new Creator();
    private final String redirect;
    private final boolean redirectRequired;

    /* compiled from: UiGraphRedirect.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiGraphRedirect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiGraphRedirect createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiGraphRedirect(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiGraphRedirect[] newArray(int i) {
            return new UiGraphRedirect[i];
        }
    }

    public static /* synthetic */ UiGraphRedirect copy$default(UiGraphRedirect uiGraphRedirect, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiGraphRedirect.redirect;
        }
        if ((i & 2) != 0) {
            z = uiGraphRedirect.redirectRequired;
        }
        return uiGraphRedirect.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRedirectRequired() {
        return this.redirectRequired;
    }

    public final UiGraphRedirect copy(String redirect, boolean redirectRequired) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        return new UiGraphRedirect(redirect, redirectRequired);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiGraphRedirect)) {
            return false;
        }
        UiGraphRedirect uiGraphRedirect = (UiGraphRedirect) other;
        return Intrinsics.areEqual(this.redirect, uiGraphRedirect.redirect) && this.redirectRequired == uiGraphRedirect.redirectRequired;
    }

    public int hashCode() {
        return (this.redirect.hashCode() * 31) + Boolean.hashCode(this.redirectRequired);
    }

    public String toString() {
        return "UiGraphRedirect(redirect=" + this.redirect + ", redirectRequired=" + this.redirectRequired + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.redirect);
        dest.writeInt(this.redirectRequired ? 1 : 0);
    }

    public UiGraphRedirect(String redirect, boolean z) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.redirect = redirect;
        this.redirectRequired = z;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final boolean getRedirectRequired() {
        return this.redirectRequired;
    }
}
