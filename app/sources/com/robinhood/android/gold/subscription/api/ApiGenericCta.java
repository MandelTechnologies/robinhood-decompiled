package com.robinhood.android.gold.subscription.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/ApiGenericCta;", "Landroid/os/Parcelable;", "text", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGenericCta implements Parcelable {
    public static final Parcelable.Creator<ApiGenericCta> CREATOR = new Creator();
    private final GenericAction action;
    private final String text;

    /* compiled from: ApiModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGenericCta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGenericCta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGenericCta(parcel.readString(), (GenericAction) parcel.readParcelable(ApiGenericCta.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGenericCta[] newArray(int i) {
            return new ApiGenericCta[i];
        }
    }

    public static /* synthetic */ ApiGenericCta copy$default(ApiGenericCta apiGenericCta, String str, GenericAction genericAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGenericCta.text;
        }
        if ((i & 2) != 0) {
            genericAction = apiGenericCta.action;
        }
        return apiGenericCta.copy(str, genericAction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final GenericAction getAction() {
        return this.action;
    }

    public final ApiGenericCta copy(String text, GenericAction action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ApiGenericCta(text, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGenericCta)) {
            return false;
        }
        ApiGenericCta apiGenericCta = (ApiGenericCta) other;
        return Intrinsics.areEqual(this.text, apiGenericCta.text) && Intrinsics.areEqual(this.action, apiGenericCta.action);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "ApiGenericCta(text=" + this.text + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeParcelable(this.action, flags);
    }

    public ApiGenericCta(String text, GenericAction action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.action = action;
    }

    public final String getText() {
        return this.text;
    }

    public final GenericAction getAction() {
        return this.action;
    }
}
