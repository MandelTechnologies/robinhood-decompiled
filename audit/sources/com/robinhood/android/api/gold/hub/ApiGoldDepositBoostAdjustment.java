package com.robinhood.android.api.gold.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ApiGoldDepositBoostAdjustment.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001dR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b4\u0010\u001d¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostAdjustment;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "id", "j$/time/Instant", "created_at", "", "title", "description", "", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostHistoryDetailItem;", ErrorBundle.DETAIL_ENTRY, "account_number", "<init>", "(Ljava/util/UUID;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/util/UUID;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostAdjustment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Lj$/time/Instant;", "getCreated_at", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getDetails", "getAccount_number", "lib-api-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApiGoldDepositBoostAdjustment implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDepositBoostAdjustment> CREATOR = new Creator();
    private final String account_number;
    private final Instant created_at;
    private final String description;
    private final List<ApiGoldDepositBoostHistoryDetailItem> details;
    private final UUID id;
    private final String title;

    /* compiled from: ApiGoldDepositBoostAdjustment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDepositBoostAdjustment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostAdjustment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            Instant instant = (Instant) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(ApiGoldDepositBoostHistoryDetailItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ApiGoldDepositBoostAdjustment(uuid, instant, string2, string3, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostAdjustment[] newArray(int i) {
            return new ApiGoldDepositBoostAdjustment[i];
        }
    }

    public static /* synthetic */ ApiGoldDepositBoostAdjustment copy$default(ApiGoldDepositBoostAdjustment apiGoldDepositBoostAdjustment, UUID uuid, Instant instant, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiGoldDepositBoostAdjustment.id;
        }
        if ((i & 2) != 0) {
            instant = apiGoldDepositBoostAdjustment.created_at;
        }
        if ((i & 4) != 0) {
            str = apiGoldDepositBoostAdjustment.title;
        }
        if ((i & 8) != 0) {
            str2 = apiGoldDepositBoostAdjustment.description;
        }
        if ((i & 16) != 0) {
            list = apiGoldDepositBoostAdjustment.details;
        }
        if ((i & 32) != 0) {
            str3 = apiGoldDepositBoostAdjustment.account_number;
        }
        List list2 = list;
        String str4 = str3;
        return apiGoldDepositBoostAdjustment.copy(uuid, instant, str, str2, list2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<ApiGoldDepositBoostHistoryDetailItem> component5() {
        return this.details;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    public final ApiGoldDepositBoostAdjustment copy(UUID id, Instant created_at, String title, String description, List<ApiGoldDepositBoostHistoryDetailItem> details, String account_number) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ApiGoldDepositBoostAdjustment(id, created_at, title, description, details, account_number);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDepositBoostAdjustment)) {
            return false;
        }
        ApiGoldDepositBoostAdjustment apiGoldDepositBoostAdjustment = (ApiGoldDepositBoostAdjustment) other;
        return Intrinsics.areEqual(this.id, apiGoldDepositBoostAdjustment.id) && Intrinsics.areEqual(this.created_at, apiGoldDepositBoostAdjustment.created_at) && Intrinsics.areEqual(this.title, apiGoldDepositBoostAdjustment.title) && Intrinsics.areEqual(this.description, apiGoldDepositBoostAdjustment.description) && Intrinsics.areEqual(this.details, apiGoldDepositBoostAdjustment.details) && Intrinsics.areEqual(this.account_number, apiGoldDepositBoostAdjustment.account_number);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.created_at.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        List<ApiGoldDepositBoostHistoryDetailItem> list = this.details;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.account_number;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldDepositBoostAdjustment(id=" + this.id + ", created_at=" + this.created_at + ", title=" + this.title + ", description=" + this.description + ", details=" + this.details + ", account_number=" + this.account_number + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeSerializable(this.created_at);
        dest.writeString(this.title);
        dest.writeString(this.description);
        List<ApiGoldDepositBoostHistoryDetailItem> list = this.details;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ApiGoldDepositBoostHistoryDetailItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.account_number);
    }

    public ApiGoldDepositBoostAdjustment(UUID id, Instant created_at, String title, String description, List<ApiGoldDepositBoostHistoryDetailItem> list, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.created_at = created_at;
        this.title = title;
        this.description = description;
        this.details = list;
        this.account_number = str;
    }

    public final UUID getId() {
        return this.id;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<ApiGoldDepositBoostHistoryDetailItem> getDetails() {
        return this.details;
    }

    public final String getAccount_number() {
        return this.account_number;
    }
}
