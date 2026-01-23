package com.robinhood.android.equities.taxlots.table;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GainLossCellDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;", "", "gainLoss", "Lcom/robinhood/utils/resource/StringResource;", "isPositive", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;)V", "getGainLoss", "()Lcom/robinhood/utils/resource/StringResource;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;)Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GainLossViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource gainLoss;
    private final Boolean isPositive;

    /* JADX WARN: Multi-variable type inference failed */
    public GainLossViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GainLossViewState copy$default(GainLossViewState gainLossViewState, StringResource stringResource, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = gainLossViewState.gainLoss;
        }
        if ((i & 2) != 0) {
            bool = gainLossViewState.isPositive;
        }
        return gainLossViewState.copy(stringResource, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getGainLoss() {
        return this.gainLoss;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsPositive() {
        return this.isPositive;
    }

    public final GainLossViewState copy(StringResource gainLoss, Boolean isPositive) {
        return new GainLossViewState(gainLoss, isPositive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GainLossViewState)) {
            return false;
        }
        GainLossViewState gainLossViewState = (GainLossViewState) other;
        return Intrinsics.areEqual(this.gainLoss, gainLossViewState.gainLoss) && Intrinsics.areEqual(this.isPositive, gainLossViewState.isPositive);
    }

    public int hashCode() {
        StringResource stringResource = this.gainLoss;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        Boolean bool = this.isPositive;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "GainLossViewState(gainLoss=" + this.gainLoss + ", isPositive=" + this.isPositive + ")";
    }

    public GainLossViewState(StringResource stringResource, Boolean bool) {
        this.gainLoss = stringResource;
        this.isPositive = bool;
    }

    public /* synthetic */ GainLossViewState(StringResource stringResource, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stringResource, (i & 2) != 0 ? null : bool);
    }

    public final StringResource getGainLoss() {
        return this.gainLoss;
    }

    public final Boolean isPositive() {
        return this.isPositive;
    }
}
