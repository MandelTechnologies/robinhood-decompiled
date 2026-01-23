package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCardSection;", "Landroid/os/Parcelable;", "title", "", "cards", "", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "maxImpressions", "", "cooldown", "<init>", "(Ljava/lang/String;Ljava/util/List;II)V", "getTitle", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "getMaxImpressions", "()I", "getCooldown", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubCardSection implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubCardSection> CREATOR = new Creator();
    private final List<ApiGoldHubCard> cards;
    private final int cooldown;
    private final int maxImpressions;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubCardSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubCardSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ApiGoldHubCard.CREATOR.createFromParcel(parcel));
            }
            return new ApiGoldHubCardSection(string2, arrayList, parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubCardSection[] newArray(int i) {
            return new ApiGoldHubCardSection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiGoldHubCardSection copy$default(ApiGoldHubCardSection apiGoldHubCardSection, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = apiGoldHubCardSection.title;
        }
        if ((i3 & 2) != 0) {
            list = apiGoldHubCardSection.cards;
        }
        if ((i3 & 4) != 0) {
            i = apiGoldHubCardSection.maxImpressions;
        }
        if ((i3 & 8) != 0) {
            i2 = apiGoldHubCardSection.cooldown;
        }
        return apiGoldHubCardSection.copy(str, list, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ApiGoldHubCard> component2() {
        return this.cards;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxImpressions() {
        return this.maxImpressions;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCooldown() {
        return this.cooldown;
    }

    public final ApiGoldHubCardSection copy(String title, List<ApiGoldHubCard> cards, @Json(name = "max_impressions") int maxImpressions, int cooldown) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new ApiGoldHubCardSection(title, cards, maxImpressions, cooldown);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubCardSection)) {
            return false;
        }
        ApiGoldHubCardSection apiGoldHubCardSection = (ApiGoldHubCardSection) other;
        return Intrinsics.areEqual(this.title, apiGoldHubCardSection.title) && Intrinsics.areEqual(this.cards, apiGoldHubCardSection.cards) && this.maxImpressions == apiGoldHubCardSection.maxImpressions && this.cooldown == apiGoldHubCardSection.cooldown;
    }

    public int hashCode() {
        String str = this.title;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.cards.hashCode()) * 31) + Integer.hashCode(this.maxImpressions)) * 31) + Integer.hashCode(this.cooldown);
    }

    public String toString() {
        return "ApiGoldHubCardSection(title=" + this.title + ", cards=" + this.cards + ", maxImpressions=" + this.maxImpressions + ", cooldown=" + this.cooldown + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        List<ApiGoldHubCard> list = this.cards;
        dest.writeInt(list.size());
        Iterator<ApiGoldHubCard> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.maxImpressions);
        dest.writeInt(this.cooldown);
    }

    public ApiGoldHubCardSection(String str, List<ApiGoldHubCard> cards, @Json(name = "max_impressions") int i, int i2) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.title = str;
        this.cards = cards;
        this.maxImpressions = i;
        this.cooldown = i2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ApiGoldHubCard> getCards() {
        return this.cards;
    }

    public final int getMaxImpressions() {
        return this.maxImpressions;
    }

    public final int getCooldown() {
        return this.cooldown;
    }
}
