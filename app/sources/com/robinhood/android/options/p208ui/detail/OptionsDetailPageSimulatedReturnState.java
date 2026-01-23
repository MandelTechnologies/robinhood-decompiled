package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.options.contracts.OptionsSimulatedReturnFragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageBodyState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;", "", "simulatedReturnKey", "Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "tooltipState", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;)V", "getSimulatedReturnKey", "()Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getTooltipState", "()Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageSimulatedReturnState {
    public static final int $stable = 8;
    private final Context eventContext;
    private final Screen eventScreen;
    private final OptionsSimulatedReturnFragmentKey simulatedReturnKey;
    private final OptionsSimulatedReturnTooltipState tooltipState;

    public static /* synthetic */ OptionsDetailPageSimulatedReturnState copy$default(OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState, OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey, Context context, Screen screen, OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSimulatedReturnFragmentKey = optionsDetailPageSimulatedReturnState.simulatedReturnKey;
        }
        if ((i & 2) != 0) {
            context = optionsDetailPageSimulatedReturnState.eventContext;
        }
        if ((i & 4) != 0) {
            screen = optionsDetailPageSimulatedReturnState.eventScreen;
        }
        if ((i & 8) != 0) {
            optionsSimulatedReturnTooltipState = optionsDetailPageSimulatedReturnState.tooltipState;
        }
        return optionsDetailPageSimulatedReturnState.copy(optionsSimulatedReturnFragmentKey, context, screen, optionsSimulatedReturnTooltipState);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSimulatedReturnFragmentKey getSimulatedReturnKey() {
        return this.simulatedReturnKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    /* renamed from: component3, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsSimulatedReturnTooltipState getTooltipState() {
        return this.tooltipState;
    }

    public final OptionsDetailPageSimulatedReturnState copy(OptionsSimulatedReturnFragmentKey simulatedReturnKey, Context eventContext, Screen eventScreen, OptionsSimulatedReturnTooltipState tooltipState) {
        Intrinsics.checkNotNullParameter(simulatedReturnKey, "simulatedReturnKey");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        return new OptionsDetailPageSimulatedReturnState(simulatedReturnKey, eventContext, eventScreen, tooltipState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageSimulatedReturnState)) {
            return false;
        }
        OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState = (OptionsDetailPageSimulatedReturnState) other;
        return Intrinsics.areEqual(this.simulatedReturnKey, optionsDetailPageSimulatedReturnState.simulatedReturnKey) && Intrinsics.areEqual(this.eventContext, optionsDetailPageSimulatedReturnState.eventContext) && Intrinsics.areEqual(this.eventScreen, optionsDetailPageSimulatedReturnState.eventScreen) && Intrinsics.areEqual(this.tooltipState, optionsDetailPageSimulatedReturnState.tooltipState);
    }

    public int hashCode() {
        int iHashCode = ((((this.simulatedReturnKey.hashCode() * 31) + this.eventContext.hashCode()) * 31) + this.eventScreen.hashCode()) * 31;
        OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState = this.tooltipState;
        return iHashCode + (optionsSimulatedReturnTooltipState == null ? 0 : optionsSimulatedReturnTooltipState.hashCode());
    }

    public String toString() {
        return "OptionsDetailPageSimulatedReturnState(simulatedReturnKey=" + this.simulatedReturnKey + ", eventContext=" + this.eventContext + ", eventScreen=" + this.eventScreen + ", tooltipState=" + this.tooltipState + ")";
    }

    public OptionsDetailPageSimulatedReturnState(OptionsSimulatedReturnFragmentKey simulatedReturnKey, Context eventContext, Screen eventScreen, OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState) {
        Intrinsics.checkNotNullParameter(simulatedReturnKey, "simulatedReturnKey");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        this.simulatedReturnKey = simulatedReturnKey;
        this.eventContext = eventContext;
        this.eventScreen = eventScreen;
        this.tooltipState = optionsSimulatedReturnTooltipState;
    }

    public final OptionsSimulatedReturnFragmentKey getSimulatedReturnKey() {
        return this.simulatedReturnKey;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final OptionsSimulatedReturnTooltipState getTooltipState() {
        return this.tooltipState;
    }
}
