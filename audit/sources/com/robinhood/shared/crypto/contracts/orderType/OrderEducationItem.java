package com.robinhood.shared.crypto.contracts.orderType;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationItem;", "Landroid/os/Parcelable;", "title", "", "description", "action", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "<init>", "(IILcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;)V", "getTitle", "()I", "getDescription", "getAction", "()Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderEducationItem implements Parcelable {
    public static final Parcelable.Creator<OrderEducationItem> CREATOR = new Creator();
    private final CryptoOrderTypeFragmentKey3 action;
    private final int description;
    private final int title;

    /* compiled from: CryptoOrderTypeFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderEducationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderEducationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderEducationItem(parcel.readInt(), parcel.readInt(), CryptoOrderTypeFragmentKey3.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderEducationItem[] newArray(int i) {
            return new OrderEducationItem[i];
        }
    }

    public static /* synthetic */ OrderEducationItem copy$default(OrderEducationItem orderEducationItem, int i, int i2, CryptoOrderTypeFragmentKey3 cryptoOrderTypeFragmentKey3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = orderEducationItem.title;
        }
        if ((i3 & 2) != 0) {
            i2 = orderEducationItem.description;
        }
        if ((i3 & 4) != 0) {
            cryptoOrderTypeFragmentKey3 = orderEducationItem.action;
        }
        return orderEducationItem.copy(i, i2, cryptoOrderTypeFragmentKey3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoOrderTypeFragmentKey3 getAction() {
        return this.action;
    }

    public final OrderEducationItem copy(int title, int description, CryptoOrderTypeFragmentKey3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new OrderEducationItem(title, description, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEducationItem)) {
            return false;
        }
        OrderEducationItem orderEducationItem = (OrderEducationItem) other;
        return this.title == orderEducationItem.title && this.description == orderEducationItem.description && this.action == orderEducationItem.action;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.description)) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "OrderEducationItem(title=" + this.title + ", description=" + this.description + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.title);
        dest.writeInt(this.description);
        dest.writeString(this.action.name());
    }

    public OrderEducationItem(int i, int i2, CryptoOrderTypeFragmentKey3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = i;
        this.description = i2;
        this.action = action;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDescription() {
        return this.description;
    }

    public final CryptoOrderTypeFragmentKey3 getAction() {
        return this.action;
    }
}
