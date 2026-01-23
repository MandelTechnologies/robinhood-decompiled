package com.robinhood.android.gold.downgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.staticcontent.model.OtherMarkdown;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDowngradeContext.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "Landroid/os/Parcelable;", "subscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "valueProps", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;", "confirmation", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "goldSweepRate", "Ljava/math/BigDecimal;", "goldMarginRate", "<init>", "(Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;Lcom/robinhood/staticcontent/model/OtherMarkdown;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getValueProps", "()Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;", "getConfirmation", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getGoldSweepRate", "()Ljava/math/BigDecimal;", "getGoldMarginRate", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldDowngradeContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoldDowngradeContext> CREATOR = new Creator();
    private final OtherMarkdown confirmation;
    private final BigDecimal goldMarginRate;
    private final BigDecimal goldSweepRate;
    private final MarginSubscription subscription;
    private final ApiGoldValuePropsDowngrade valueProps;

    /* compiled from: GoldDowngradeContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldDowngradeContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDowngradeContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldDowngradeContext((MarginSubscription) parcel.readParcelable(GoldDowngradeContext.class.getClassLoader()), (ApiGoldValuePropsDowngrade) parcel.readParcelable(GoldDowngradeContext.class.getClassLoader()), (OtherMarkdown) parcel.readParcelable(GoldDowngradeContext.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDowngradeContext[] newArray(int i) {
            return new GoldDowngradeContext[i];
        }
    }

    public static /* synthetic */ GoldDowngradeContext copy$default(GoldDowngradeContext goldDowngradeContext, MarginSubscription marginSubscription, ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, OtherMarkdown otherMarkdown, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            marginSubscription = goldDowngradeContext.subscription;
        }
        if ((i & 2) != 0) {
            apiGoldValuePropsDowngrade = goldDowngradeContext.valueProps;
        }
        if ((i & 4) != 0) {
            otherMarkdown = goldDowngradeContext.confirmation;
        }
        if ((i & 8) != 0) {
            bigDecimal = goldDowngradeContext.goldSweepRate;
        }
        if ((i & 16) != 0) {
            bigDecimal2 = goldDowngradeContext.goldMarginRate;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        OtherMarkdown otherMarkdown2 = otherMarkdown;
        return goldDowngradeContext.copy(marginSubscription, apiGoldValuePropsDowngrade, otherMarkdown2, bigDecimal, bigDecimal3);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldValuePropsDowngrade getValueProps() {
        return this.valueProps;
    }

    /* renamed from: component3, reason: from getter */
    public final OtherMarkdown getConfirmation() {
        return this.confirmation;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getGoldSweepRate() {
        return this.goldSweepRate;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getGoldMarginRate() {
        return this.goldMarginRate;
    }

    public final GoldDowngradeContext copy(MarginSubscription subscription, ApiGoldValuePropsDowngrade valueProps, OtherMarkdown confirmation, BigDecimal goldSweepRate, BigDecimal goldMarginRate) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        return new GoldDowngradeContext(subscription, valueProps, confirmation, goldSweepRate, goldMarginRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDowngradeContext)) {
            return false;
        }
        GoldDowngradeContext goldDowngradeContext = (GoldDowngradeContext) other;
        return Intrinsics.areEqual(this.subscription, goldDowngradeContext.subscription) && Intrinsics.areEqual(this.valueProps, goldDowngradeContext.valueProps) && Intrinsics.areEqual(this.confirmation, goldDowngradeContext.confirmation) && Intrinsics.areEqual(this.goldSweepRate, goldDowngradeContext.goldSweepRate) && Intrinsics.areEqual(this.goldMarginRate, goldDowngradeContext.goldMarginRate);
    }

    public int hashCode() {
        int iHashCode = this.subscription.hashCode() * 31;
        ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade = this.valueProps;
        int iHashCode2 = (((iHashCode + (apiGoldValuePropsDowngrade == null ? 0 : apiGoldValuePropsDowngrade.hashCode())) * 31) + this.confirmation.hashCode()) * 31;
        BigDecimal bigDecimal = this.goldSweepRate;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.goldMarginRate;
        return iHashCode3 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "GoldDowngradeContext(subscription=" + this.subscription + ", valueProps=" + this.valueProps + ", confirmation=" + this.confirmation + ", goldSweepRate=" + this.goldSweepRate + ", goldMarginRate=" + this.goldMarginRate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.subscription, flags);
        dest.writeParcelable(this.valueProps, flags);
        dest.writeParcelable(this.confirmation, flags);
        dest.writeSerializable(this.goldSweepRate);
        dest.writeSerializable(this.goldMarginRate);
    }

    public GoldDowngradeContext(MarginSubscription subscription, ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, OtherMarkdown confirmation, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.subscription = subscription;
        this.valueProps = apiGoldValuePropsDowngrade;
        this.confirmation = confirmation;
        this.goldSweepRate = bigDecimal;
        this.goldMarginRate = bigDecimal2;
    }

    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    public final ApiGoldValuePropsDowngrade getValueProps() {
        return this.valueProps;
    }

    public final OtherMarkdown getConfirmation() {
        return this.confirmation;
    }

    public final BigDecimal getGoldSweepRate() {
        return this.goldSweepRate;
    }

    public final BigDecimal getGoldMarginRate() {
        return this.goldMarginRate;
    }
}
