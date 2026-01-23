package com.robinhood.android.equities.taxlots.footer;

import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JZ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;", "", "orderId", "Ljava/util/UUID;", "numShares", "Ljava/math/BigDecimal;", "m1Enabled", "", "estimatedGainLoss", "Lcom/robinhood/utils/resource/StringResource;", "positiveGainLoss", "estimatedCredit", "invalidNumberOfShares", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;)V", "getOrderId", "()Ljava/util/UUID;", "getNumShares", "()Ljava/math/BigDecimal;", "getM1Enabled", "()Z", "getEstimatedGainLoss", "()Lcom/robinhood/utils/resource/StringResource;", "getPositiveGainLoss", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEstimatedCredit", "getInvalidNumberOfShares", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;)Lcom/robinhood/android/equities/taxlots/footer/FooterViewState;", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FooterViewState {
    public static final int $stable = 8;
    private final StringResource estimatedCredit;
    private final StringResource estimatedGainLoss;
    private final BigDecimal invalidNumberOfShares;
    private final boolean m1Enabled;
    private final BigDecimal numShares;
    private final UUID orderId;
    private final Boolean positiveGainLoss;

    public static /* synthetic */ FooterViewState copy$default(FooterViewState footerViewState, UUID uuid, BigDecimal bigDecimal, boolean z, StringResource stringResource, Boolean bool, StringResource stringResource2, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = footerViewState.orderId;
        }
        if ((i & 2) != 0) {
            bigDecimal = footerViewState.numShares;
        }
        if ((i & 4) != 0) {
            z = footerViewState.m1Enabled;
        }
        if ((i & 8) != 0) {
            stringResource = footerViewState.estimatedGainLoss;
        }
        if ((i & 16) != 0) {
            bool = footerViewState.positiveGainLoss;
        }
        if ((i & 32) != 0) {
            stringResource2 = footerViewState.estimatedCredit;
        }
        if ((i & 64) != 0) {
            bigDecimal2 = footerViewState.invalidNumberOfShares;
        }
        StringResource stringResource3 = stringResource2;
        BigDecimal bigDecimal3 = bigDecimal2;
        Boolean bool2 = bool;
        boolean z2 = z;
        return footerViewState.copy(uuid, bigDecimal, z2, stringResource, bool2, stringResource3, bigDecimal3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getNumShares() {
        return this.numShares;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getEstimatedGainLoss() {
        return this.estimatedGainLoss;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getPositiveGainLoss() {
        return this.positiveGainLoss;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getEstimatedCredit() {
        return this.estimatedCredit;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getInvalidNumberOfShares() {
        return this.invalidNumberOfShares;
    }

    public final FooterViewState copy(UUID orderId, BigDecimal numShares, boolean m1Enabled, StringResource estimatedGainLoss, Boolean positiveGainLoss, StringResource estimatedCredit, BigDecimal invalidNumberOfShares) {
        Intrinsics.checkNotNullParameter(numShares, "numShares");
        Intrinsics.checkNotNullParameter(estimatedGainLoss, "estimatedGainLoss");
        Intrinsics.checkNotNullParameter(estimatedCredit, "estimatedCredit");
        return new FooterViewState(orderId, numShares, m1Enabled, estimatedGainLoss, positiveGainLoss, estimatedCredit, invalidNumberOfShares);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterViewState)) {
            return false;
        }
        FooterViewState footerViewState = (FooterViewState) other;
        return Intrinsics.areEqual(this.orderId, footerViewState.orderId) && Intrinsics.areEqual(this.numShares, footerViewState.numShares) && this.m1Enabled == footerViewState.m1Enabled && Intrinsics.areEqual(this.estimatedGainLoss, footerViewState.estimatedGainLoss) && Intrinsics.areEqual(this.positiveGainLoss, footerViewState.positiveGainLoss) && Intrinsics.areEqual(this.estimatedCredit, footerViewState.estimatedCredit) && Intrinsics.areEqual(this.invalidNumberOfShares, footerViewState.invalidNumberOfShares);
    }

    public int hashCode() {
        UUID uuid = this.orderId;
        int iHashCode = (((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.numShares.hashCode()) * 31) + Boolean.hashCode(this.m1Enabled)) * 31) + this.estimatedGainLoss.hashCode()) * 31;
        Boolean bool = this.positiveGainLoss;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.estimatedCredit.hashCode()) * 31;
        BigDecimal bigDecimal = this.invalidNumberOfShares;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "FooterViewState(orderId=" + this.orderId + ", numShares=" + this.numShares + ", m1Enabled=" + this.m1Enabled + ", estimatedGainLoss=" + this.estimatedGainLoss + ", positiveGainLoss=" + this.positiveGainLoss + ", estimatedCredit=" + this.estimatedCredit + ", invalidNumberOfShares=" + this.invalidNumberOfShares + ")";
    }

    public FooterViewState(UUID uuid, BigDecimal numShares, boolean z, StringResource estimatedGainLoss, Boolean bool, StringResource estimatedCredit, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(numShares, "numShares");
        Intrinsics.checkNotNullParameter(estimatedGainLoss, "estimatedGainLoss");
        Intrinsics.checkNotNullParameter(estimatedCredit, "estimatedCredit");
        this.orderId = uuid;
        this.numShares = numShares;
        this.m1Enabled = z;
        this.estimatedGainLoss = estimatedGainLoss;
        this.positiveGainLoss = bool;
        this.estimatedCredit = estimatedCredit;
        this.invalidNumberOfShares = bigDecimal;
    }

    public /* synthetic */ FooterViewState(UUID uuid, BigDecimal bigDecimal, boolean z, StringResource stringResource, Boolean bool, StringResource stringResource2, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, bigDecimal, z, stringResource, bool, stringResource2, (i & 64) != 0 ? null : bigDecimal2);
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final BigDecimal getNumShares() {
        return this.numShares;
    }

    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }

    public final StringResource getEstimatedGainLoss() {
        return this.estimatedGainLoss;
    }

    public final Boolean getPositiveGainLoss() {
        return this.positiveGainLoss;
    }

    public final StringResource getEstimatedCredit() {
        return this.estimatedCredit;
    }

    public final BigDecimal getInvalidNumberOfShares() {
        return this.invalidNumberOfShares;
    }
}
