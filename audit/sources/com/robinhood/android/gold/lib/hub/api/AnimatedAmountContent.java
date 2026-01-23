package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDepositBoostHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "description", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getDescription", "()Ljava/lang/String;", "currencySymbol", "getCurrencySymbol", "amountValue", "getAmountValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AnimatedAmountContent implements Parcelable {
    public static final Parcelable.Creator<AnimatedAmountContent> CREATOR = new Creator();
    private final Money amount;
    private final String description;

    /* compiled from: ApiDepositBoostHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AnimatedAmountContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnimatedAmountContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnimatedAmountContent((Money) parcel.readParcelable(AnimatedAmountContent.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnimatedAmountContent[] newArray(int i) {
            return new AnimatedAmountContent[i];
        }
    }

    public static /* synthetic */ AnimatedAmountContent copy$default(AnimatedAmountContent animatedAmountContent, Money money, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            money = animatedAmountContent.amount;
        }
        if ((i & 2) != 0) {
            str = animatedAmountContent.description;
        }
        return animatedAmountContent.copy(money, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final AnimatedAmountContent copy(Money amount, String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new AnimatedAmountContent(amount, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedAmountContent)) {
            return false;
        }
        AnimatedAmountContent animatedAmountContent = (AnimatedAmountContent) other;
        return Intrinsics.areEqual(this.amount, animatedAmountContent.amount) && Intrinsics.areEqual(this.description, animatedAmountContent.description);
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AnimatedAmountContent(amount=" + this.amount + ", description=" + this.description + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.amount, flags);
        dest.writeString(this.description);
    }

    public AnimatedAmountContent(Money amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
        this.description = str;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCurrencySymbol() {
        String symbol = Format2.toMoney(this.amount).getCurrency().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    public final String getAmountValue() {
        return com.robinhood.models.util.Money.format$default(Format2.toMoney(this.amount), null, false, null, false, 0, null, false, null, false, false, 1015, null);
    }
}
