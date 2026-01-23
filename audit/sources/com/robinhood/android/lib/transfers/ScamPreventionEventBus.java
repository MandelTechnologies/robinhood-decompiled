package com.robinhood.android.lib.transfers;

import com.robinhood.udf.UiEvent;
import com.robinhood.wiretransfers.contracts.ScamPreventionButtonType;
import kotlin.Metadata;

/* compiled from: ScamPreventionEventBus.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "", "<init>", "()V", "scamPreventionContinueButtonEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "getScamPreventionContinueButtonEvent", "()Lcom/robinhood/udf/UiEvent;", "setScamPreventionContinueButtonEvent", "(Lcom/robinhood/udf/UiEvent;)V", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ScamPreventionEventBus {
    private UiEvent<ScamPreventionButtonType> scamPreventionContinueButtonEvent;

    public final UiEvent<ScamPreventionButtonType> getScamPreventionContinueButtonEvent() {
        return this.scamPreventionContinueButtonEvent;
    }

    public final void setScamPreventionContinueButtonEvent(UiEvent<ScamPreventionButtonType> uiEvent) {
        this.scamPreventionContinueButtonEvent = uiEvent;
    }
}
