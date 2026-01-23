package com.robinhood.android.trade.options;

import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTimeInForceRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForceRowState;", "", "title", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "enabled", "", "inIndexOptionsCurbHoursExperiment", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderTimeInForce;ZZ)V", "getTitle", "()Ljava/lang/String;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getEnabled", "()Z", "getInIndexOptionsCurbHoursExperiment", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderTimeInForceRowState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean inIndexOptionsCurbHoursExperiment;
    private final OrderTimeInForce timeInForce;
    private final String title;

    public static /* synthetic */ OptionOrderTimeInForceRowState copy$default(OptionOrderTimeInForceRowState optionOrderTimeInForceRowState, String str, OrderTimeInForce orderTimeInForce, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderTimeInForceRowState.title;
        }
        if ((i & 2) != 0) {
            orderTimeInForce = optionOrderTimeInForceRowState.timeInForce;
        }
        if ((i & 4) != 0) {
            z = optionOrderTimeInForceRowState.enabled;
        }
        if ((i & 8) != 0) {
            z2 = optionOrderTimeInForceRowState.inIndexOptionsCurbHoursExperiment;
        }
        return optionOrderTimeInForceRowState.copy(str, orderTimeInForce, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }

    public final OptionOrderTimeInForceRowState copy(String title, OrderTimeInForce timeInForce, boolean enabled, boolean inIndexOptionsCurbHoursExperiment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        return new OptionOrderTimeInForceRowState(title, timeInForce, enabled, inIndexOptionsCurbHoursExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderTimeInForceRowState)) {
            return false;
        }
        OptionOrderTimeInForceRowState optionOrderTimeInForceRowState = (OptionOrderTimeInForceRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderTimeInForceRowState.title) && this.timeInForce == optionOrderTimeInForceRowState.timeInForce && this.enabled == optionOrderTimeInForceRowState.enabled && this.inIndexOptionsCurbHoursExperiment == optionOrderTimeInForceRowState.inIndexOptionsCurbHoursExperiment;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.timeInForce.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.inIndexOptionsCurbHoursExperiment);
    }

    public String toString() {
        return "OptionOrderTimeInForceRowState(title=" + this.title + ", timeInForce=" + this.timeInForce + ", enabled=" + this.enabled + ", inIndexOptionsCurbHoursExperiment=" + this.inIndexOptionsCurbHoursExperiment + ")";
    }

    public OptionOrderTimeInForceRowState(String title, OrderTimeInForce timeInForce, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        this.title = title;
        this.timeInForce = timeInForce;
        this.enabled = z;
        this.inIndexOptionsCurbHoursExperiment = z2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }
}
