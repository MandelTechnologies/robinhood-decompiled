package com.robinhood.android.api.gold.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ApiGoldDepositBoostPayout.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010 JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010 R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b7\u0010 ¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "id", "Ljava/math/BigDecimal;", "amount", "j$/time/Instant", "created_at", "", "title", "", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostHistoryDetailItem;", ErrorBundle.DETAIL_ENTRY, "account_number", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Lj$/time/Instant;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/math/BigDecimal;", "getAmount", "Lj$/time/Instant;", "getCreated_at", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getDetails", "getAccount_number", "lib-api-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApiGoldDepositBoostPayout implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDepositBoostPayout> CREATOR = new Creator();
    private final String account_number;
    private final BigDecimal amount;
    private final Instant created_at;
    private final List<ApiGoldDepositBoostHistoryDetailItem> details;
    private final UUID id;
    private final String title;

    /* compiled from: ApiGoldDepositBoostPayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDepositBoostPayout> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostPayout createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            Instant instant = (Instant) parcel.readSerializable();
            String string2 = parcel.readString();
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
            return new ApiGoldDepositBoostPayout(uuid, bigDecimal, instant, string2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostPayout[] newArray(int i) {
            return new ApiGoldDepositBoostPayout[i];
        }
    }

    public static /* synthetic */ ApiGoldDepositBoostPayout copy$default(ApiGoldDepositBoostPayout apiGoldDepositBoostPayout, UUID uuid, BigDecimal bigDecimal, Instant instant, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiGoldDepositBoostPayout.id;
        }
        if ((i & 2) != 0) {
            bigDecimal = apiGoldDepositBoostPayout.amount;
        }
        if ((i & 4) != 0) {
            instant = apiGoldDepositBoostPayout.created_at;
        }
        if ((i & 8) != 0) {
            str = apiGoldDepositBoostPayout.title;
        }
        if ((i & 16) != 0) {
            list = apiGoldDepositBoostPayout.details;
        }
        if ((i & 32) != 0) {
            str2 = apiGoldDepositBoostPayout.account_number;
        }
        List list2 = list;
        String str3 = str2;
        return apiGoldDepositBoostPayout.copy(uuid, bigDecimal, instant, str, list2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ApiGoldDepositBoostHistoryDetailItem> component5() {
        return this.details;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    public final ApiGoldDepositBoostPayout copy(UUID id, BigDecimal amount, Instant created_at, String title, List<ApiGoldDepositBoostHistoryDetailItem> details, String account_number) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        return new ApiGoldDepositBoostPayout(id, amount, created_at, title, details, account_number);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDepositBoostPayout)) {
            return false;
        }
        ApiGoldDepositBoostPayout apiGoldDepositBoostPayout = (ApiGoldDepositBoostPayout) other;
        return Intrinsics.areEqual(this.id, apiGoldDepositBoostPayout.id) && Intrinsics.areEqual(this.amount, apiGoldDepositBoostPayout.amount) && Intrinsics.areEqual(this.created_at, apiGoldDepositBoostPayout.created_at) && Intrinsics.areEqual(this.title, apiGoldDepositBoostPayout.title) && Intrinsics.areEqual(this.details, apiGoldDepositBoostPayout.details) && Intrinsics.areEqual(this.account_number, apiGoldDepositBoostPayout.account_number);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.amount.hashCode()) * 31) + this.created_at.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ApiGoldDepositBoostHistoryDetailItem> list = this.details;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.account_number;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldDepositBoostPayout(id=" + this.id + ", amount=" + this.amount + ", created_at=" + this.created_at + ", title=" + this.title + ", details=" + this.details + ", account_number=" + this.account_number + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.created_at);
        dest.writeString(this.title);
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

    public ApiGoldDepositBoostPayout(UUID id, BigDecimal amount, Instant created_at, String str, List<ApiGoldDepositBoostHistoryDetailItem> list, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        this.id = id;
        this.amount = amount;
        this.created_at = created_at;
        this.title = str;
        this.details = list;
        this.account_number = str2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ApiGoldDepositBoostHistoryDetailItem> getDetails() {
        return this.details;
    }

    public final String getAccount_number() {
        return this.account_number;
    }
}
