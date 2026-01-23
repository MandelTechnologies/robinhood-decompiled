package com.robinhood.android.equities.taxlots.footer;

import com.robinhood.rosetta.common.Money;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/footer/FooterDataState;", "", "orderId", "Ljava/util/UUID;", "m1Enabled", "", "numShares", "Ljava/math/BigDecimal;", "estimatedGainLoss", "Lcom/robinhood/rosetta/common/Money;", "estimatedCredit", "invalidNumberOfShares", "<init>", "(Ljava/util/UUID;ZLjava/math/BigDecimal;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/math/BigDecimal;)V", "getOrderId", "()Ljava/util/UUID;", "getM1Enabled", "()Z", "getNumShares", "()Ljava/math/BigDecimal;", "getEstimatedGainLoss", "()Lcom/robinhood/rosetta/common/Money;", "getEstimatedCredit", "getInvalidNumberOfShares", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FooterDataState {
    public static final int $stable = 8;
    private final Money estimatedCredit;
    private final Money estimatedGainLoss;
    private final BigDecimal invalidNumberOfShares;
    private final boolean m1Enabled;
    private final BigDecimal numShares;
    private final UUID orderId;

    public FooterDataState() {
        this(null, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FooterDataState copy$default(FooterDataState footerDataState, UUID uuid, boolean z, BigDecimal bigDecimal, Money money, Money money2, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = footerDataState.orderId;
        }
        if ((i & 2) != 0) {
            z = footerDataState.m1Enabled;
        }
        if ((i & 4) != 0) {
            bigDecimal = footerDataState.numShares;
        }
        if ((i & 8) != 0) {
            money = footerDataState.estimatedGainLoss;
        }
        if ((i & 16) != 0) {
            money2 = footerDataState.estimatedCredit;
        }
        if ((i & 32) != 0) {
            bigDecimal2 = footerDataState.invalidNumberOfShares;
        }
        Money money3 = money2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return footerDataState.copy(uuid, z, bigDecimal, money, money3, bigDecimal3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getNumShares() {
        return this.numShares;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getEstimatedGainLoss() {
        return this.estimatedGainLoss;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getEstimatedCredit() {
        return this.estimatedCredit;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getInvalidNumberOfShares() {
        return this.invalidNumberOfShares;
    }

    public final FooterDataState copy(UUID orderId, boolean m1Enabled, BigDecimal numShares, Money estimatedGainLoss, Money estimatedCredit, BigDecimal invalidNumberOfShares) {
        return new FooterDataState(orderId, m1Enabled, numShares, estimatedGainLoss, estimatedCredit, invalidNumberOfShares);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterDataState)) {
            return false;
        }
        FooterDataState footerDataState = (FooterDataState) other;
        return Intrinsics.areEqual(this.orderId, footerDataState.orderId) && this.m1Enabled == footerDataState.m1Enabled && Intrinsics.areEqual(this.numShares, footerDataState.numShares) && Intrinsics.areEqual(this.estimatedGainLoss, footerDataState.estimatedGainLoss) && Intrinsics.areEqual(this.estimatedCredit, footerDataState.estimatedCredit) && Intrinsics.areEqual(this.invalidNumberOfShares, footerDataState.invalidNumberOfShares);
    }

    public int hashCode() {
        UUID uuid = this.orderId;
        int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + Boolean.hashCode(this.m1Enabled)) * 31;
        BigDecimal bigDecimal = this.numShares;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Money money = this.estimatedGainLoss;
        int iHashCode3 = (iHashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.estimatedCredit;
        int iHashCode4 = (iHashCode3 + (money2 == null ? 0 : money2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.invalidNumberOfShares;
        return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "FooterDataState(orderId=" + this.orderId + ", m1Enabled=" + this.m1Enabled + ", numShares=" + this.numShares + ", estimatedGainLoss=" + this.estimatedGainLoss + ", estimatedCredit=" + this.estimatedCredit + ", invalidNumberOfShares=" + this.invalidNumberOfShares + ")";
    }

    public FooterDataState(UUID uuid, boolean z, BigDecimal bigDecimal, Money money, Money money2, BigDecimal bigDecimal2) {
        this.orderId = uuid;
        this.m1Enabled = z;
        this.numShares = bigDecimal;
        this.estimatedGainLoss = money;
        this.estimatedCredit = money2;
        this.invalidNumberOfShares = bigDecimal2;
    }

    public /* synthetic */ FooterDataState(UUID uuid, boolean z, BigDecimal bigDecimal, Money money, Money money2, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? null : bigDecimal2);
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }

    public final BigDecimal getNumShares() {
        return this.numShares;
    }

    public final Money getEstimatedGainLoss() {
        return this.estimatedGainLoss;
    }

    public final Money getEstimatedCredit() {
        return this.estimatedCredit;
    }

    public final BigDecimal getInvalidNumberOfShares() {
        return this.invalidNumberOfShares;
    }
}
