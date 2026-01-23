package com.robinhood.android.feature.margin.hub.deficit;

import com.robinhood.models.api.ApiBuyingPowerBreakdown;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckBuyingPowerDeficitDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerViewState;", "", "buyingPowerBreakdown", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiBuyingPowerBreakdown;", "<init>", "(Lkotlin/Result;)V", "getBuyingPowerBreakdown-xLWZpok", "()Lkotlin/Result;", "component1", "component1-xLWZpok", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckBuyingPowerViewState {
    public static final int $stable = 8;
    private final Result<ApiBuyingPowerBreakdown> buyingPowerBreakdown;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBuyingPowerViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckBuyingPowerViewState copy$default(CheckBuyingPowerViewState checkBuyingPowerViewState, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            result = checkBuyingPowerViewState.buyingPowerBreakdown;
        }
        return checkBuyingPowerViewState.copy(result);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<ApiBuyingPowerBreakdown> m14498component1xLWZpok() {
        return this.buyingPowerBreakdown;
    }

    public final CheckBuyingPowerViewState copy(Result<ApiBuyingPowerBreakdown> buyingPowerBreakdown) {
        return new CheckBuyingPowerViewState(buyingPowerBreakdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckBuyingPowerViewState) && Intrinsics.areEqual(this.buyingPowerBreakdown, ((CheckBuyingPowerViewState) other).buyingPowerBreakdown);
    }

    public int hashCode() {
        Result<ApiBuyingPowerBreakdown> result = this.buyingPowerBreakdown;
        if (result == null) {
            return 0;
        }
        return Result.m28554hashCodeimpl(result.getValue());
    }

    public String toString() {
        return "CheckBuyingPowerViewState(buyingPowerBreakdown=" + this.buyingPowerBreakdown + ")";
    }

    public CheckBuyingPowerViewState(Result<ApiBuyingPowerBreakdown> result) {
        this.buyingPowerBreakdown = result;
    }

    public /* synthetic */ CheckBuyingPowerViewState(Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result);
    }

    /* renamed from: getBuyingPowerBreakdown-xLWZpok, reason: not valid java name */
    public final Result<ApiBuyingPowerBreakdown> m14499getBuyingPowerBreakdownxLWZpok() {
        return this.buyingPowerBreakdown;
    }
}
