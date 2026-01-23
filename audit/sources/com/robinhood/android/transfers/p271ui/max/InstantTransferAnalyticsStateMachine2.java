package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.p271ui.max.InstantTransferAnalyticsStateMachine;
import com.robinhood.rosetta.eventlogging.Boolean;
import kotlin.Metadata;

/* compiled from: InstantTransferAnalyticsStateMachine.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0004*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"AnalyticsBoolean", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "getState", "Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine$Result;", "Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.InstantTransferAnalyticsStateMachineKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InstantTransferAnalyticsStateMachine2 {
    public static final InstantTransferAnalyticsStateMachine.Result getState(InstantTransferAnalyticsStateMachine instantTransferAnalyticsStateMachine) {
        Boolean causedByDefault;
        Boolean causedByUpsell;
        InstantTransferAnalyticsStateMachine.State state;
        InstantTransferAnalyticsStateMachine.State state2;
        if (instantTransferAnalyticsStateMachine == null || (state2 = instantTransferAnalyticsStateMachine.getState()) == null || (causedByDefault = state2.getCausedByDefault()) == null) {
            causedByDefault = Boolean.BOOLEAN_UNSPECIFIED;
        }
        if (instantTransferAnalyticsStateMachine == null || (state = instantTransferAnalyticsStateMachine.getState()) == null || (causedByUpsell = state.getCausedByUpsell()) == null) {
            causedByUpsell = Boolean.BOOLEAN_UNSPECIFIED;
        }
        return new InstantTransferAnalyticsStateMachine.Result(causedByDefault, causedByUpsell);
    }
}
