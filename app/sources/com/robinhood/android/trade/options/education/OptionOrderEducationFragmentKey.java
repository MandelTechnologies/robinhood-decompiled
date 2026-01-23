package com.robinhood.android.trade.options.education;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderEducationFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/education/OptionOrderEducationFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "side", "Lcom/robinhood/models/db/OrderSide;", "type", "Lcom/robinhood/models/db/OptionOrderEducationType;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OptionOrderEducationType;)V", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getType", "()Lcom/robinhood/models/db/OptionOrderEducationType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class OptionOrderEducationFragmentKey implements FragmentKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OptionOrderEducationFragmentKey> CREATOR = new Creator();
    private final OrderSide side;
    private final OptionOrderEducationType type;

    /* compiled from: OptionOrderEducationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<OptionOrderEducationFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOrderEducationFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionOrderEducationFragmentKey(OrderSide.valueOf(parcel.readString()), OptionOrderEducationType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOrderEducationFragmentKey[] newArray(int i) {
            return new OptionOrderEducationFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionOrderEducationFragmentKey copy$default(OptionOrderEducationFragmentKey optionOrderEducationFragmentKey, OrderSide orderSide, OptionOrderEducationType optionOrderEducationType, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSide = optionOrderEducationFragmentKey.side;
        }
        if ((i & 2) != 0) {
            optionOrderEducationType = optionOrderEducationFragmentKey.type;
        }
        return optionOrderEducationFragmentKey.copy(orderSide, optionOrderEducationType);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionOrderEducationType getType() {
        return this.type;
    }

    public final OptionOrderEducationFragmentKey copy(OrderSide side, OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OptionOrderEducationFragmentKey(side, type2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderEducationFragmentKey)) {
            return false;
        }
        OptionOrderEducationFragmentKey optionOrderEducationFragmentKey = (OptionOrderEducationFragmentKey) other;
        return this.side == optionOrderEducationFragmentKey.side && this.type == optionOrderEducationFragmentKey.type;
    }

    public int hashCode() {
        return (this.side.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "OptionOrderEducationFragmentKey(side=" + this.side + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.side.name());
        dest.writeString(this.type.name());
    }

    public OptionOrderEducationFragmentKey(OrderSide side, OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.side = side;
        this.type = type2;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    public final OptionOrderEducationType getType() {
        return this.type;
    }
}
