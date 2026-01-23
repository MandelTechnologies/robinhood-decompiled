package com.robinhood.android.margin.upgrade.goldupsell;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeGoldUpsellState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDataState;", "", "standardPageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "throwable", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Ljava/lang/Throwable;)V", "getStandardPageTemplate", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeGoldUpsellDataState {
    public static final int $stable = 8;
    private final StandardPageTemplate<GenericAction> standardPageTemplate;
    private final Throwable throwable;

    /* JADX WARN: Multi-variable type inference failed */
    public MarginUpgradeGoldUpsellDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginUpgradeGoldUpsellDataState copy$default(MarginUpgradeGoldUpsellDataState marginUpgradeGoldUpsellDataState, StandardPageTemplate standardPageTemplate, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            standardPageTemplate = marginUpgradeGoldUpsellDataState.standardPageTemplate;
        }
        if ((i & 2) != 0) {
            th = marginUpgradeGoldUpsellDataState.throwable;
        }
        return marginUpgradeGoldUpsellDataState.copy(standardPageTemplate, th);
    }

    public final StandardPageTemplate<GenericAction> component1() {
        return this.standardPageTemplate;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final MarginUpgradeGoldUpsellDataState copy(StandardPageTemplate<? extends GenericAction> standardPageTemplate, Throwable throwable) {
        return new MarginUpgradeGoldUpsellDataState(standardPageTemplate, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeGoldUpsellDataState)) {
            return false;
        }
        MarginUpgradeGoldUpsellDataState marginUpgradeGoldUpsellDataState = (MarginUpgradeGoldUpsellDataState) other;
        return Intrinsics.areEqual(this.standardPageTemplate, marginUpgradeGoldUpsellDataState.standardPageTemplate) && Intrinsics.areEqual(this.throwable, marginUpgradeGoldUpsellDataState.throwable);
    }

    public int hashCode() {
        StandardPageTemplate<GenericAction> standardPageTemplate = this.standardPageTemplate;
        int iHashCode = (standardPageTemplate == null ? 0 : standardPageTemplate.hashCode()) * 31;
        Throwable th = this.throwable;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "MarginUpgradeGoldUpsellDataState(standardPageTemplate=" + this.standardPageTemplate + ", throwable=" + this.throwable + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginUpgradeGoldUpsellDataState(StandardPageTemplate<? extends GenericAction> standardPageTemplate, Throwable th) {
        this.standardPageTemplate = standardPageTemplate;
        this.throwable = th;
    }

    public /* synthetic */ MarginUpgradeGoldUpsellDataState(StandardPageTemplate standardPageTemplate, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : standardPageTemplate, (i & 2) != 0 ? null : th);
    }

    public final StandardPageTemplate<GenericAction> getStandardPageTemplate() {
        return this.standardPageTemplate;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
