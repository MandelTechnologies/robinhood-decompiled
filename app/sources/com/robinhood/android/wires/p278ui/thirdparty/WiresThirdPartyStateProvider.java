package com.robinhood.android.wires.p278ui.thirdparty;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WiresThirdPartyStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyViewState;", "<init>", "()V", "reduce", "dataState", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WiresThirdPartyStateProvider implements StateProvider<WiresThirdPartyDataState, WiresThirdPartyViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public WiresThirdPartyViewState reduce(WiresThirdPartyDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new WiresThirdPartyViewState(dataState.getSource(), dataState.getMode(), (dataState.getContinueEnabled() && dataState.getMode() == WiresThirdPartyPageMode.INFORMATION_INTAKE) || (dataState.getAcknowledgementChecked() && dataState.getMode() == WiresThirdPartyPageMode.REVIEW_SCREEN), dataState.getAcknowledgementChecked(), dataState.getMakingRequest());
    }
}
