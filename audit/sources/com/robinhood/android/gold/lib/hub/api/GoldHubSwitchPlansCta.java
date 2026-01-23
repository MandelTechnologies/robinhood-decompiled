package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldHubSwitchPlansCta;", "Landroid/os/Parcelable;", "title", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldHubSwitchPlansCta implements Parcelable {
    public static final Parcelable.Creator<GoldHubSwitchPlansCta> CREATOR = new Creator();
    private final GoldHubAction action;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldHubSwitchPlansCta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubSwitchPlansCta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldHubSwitchPlansCta(parcel.readString(), (GoldHubAction) parcel.readParcelable(GoldHubSwitchPlansCta.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubSwitchPlansCta[] newArray(int i) {
            return new GoldHubSwitchPlansCta[i];
        }
    }

    public static /* synthetic */ GoldHubSwitchPlansCta copy$default(GoldHubSwitchPlansCta goldHubSwitchPlansCta, String str, GoldHubAction goldHubAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldHubSwitchPlansCta.title;
        }
        if ((i & 2) != 0) {
            goldHubAction = goldHubSwitchPlansCta.action;
        }
        return goldHubSwitchPlansCta.copy(str, goldHubAction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldHubAction getAction() {
        return this.action;
    }

    public final GoldHubSwitchPlansCta copy(String title, GoldHubAction action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        return new GoldHubSwitchPlansCta(title, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldHubSwitchPlansCta)) {
            return false;
        }
        GoldHubSwitchPlansCta goldHubSwitchPlansCta = (GoldHubSwitchPlansCta) other;
        return Intrinsics.areEqual(this.title, goldHubSwitchPlansCta.title) && Intrinsics.areEqual(this.action, goldHubSwitchPlansCta.action);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "GoldHubSwitchPlansCta(title=" + this.title + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeParcelable(this.action, flags);
    }

    public GoldHubSwitchPlansCta(String title, GoldHubAction action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.action = action;
    }

    public final String getTitle() {
        return this.title;
    }

    public final GoldHubAction getAction() {
        return this.action;
    }
}
