package com.robinhood.android.retirement.lib;

import kotlin.Metadata;

/* compiled from: RetirementFlowDeeplinkExitManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/lib/RetirementFlowDeeplinkExitManager;", "", "<init>", "()V", "retirementSignUpFlowExitedByDeeplink", "", "getRetirementSignUpFlowExitedByDeeplink", "()Ljava/lang/Boolean;", "setRetirementSignUpFlowExitedByDeeplink", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lib-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementFlowDeeplinkExitManager {
    private static Boolean retirementSignUpFlowExitedByDeeplink;
    public static final RetirementFlowDeeplinkExitManager INSTANCE = new RetirementFlowDeeplinkExitManager();
    public static final int $stable = 8;

    private RetirementFlowDeeplinkExitManager() {
    }

    public final Boolean getRetirementSignUpFlowExitedByDeeplink() {
        return retirementSignUpFlowExitedByDeeplink;
    }

    public final void setRetirementSignUpFlowExitedByDeeplink(Boolean bool) {
        retirementSignUpFlowExitedByDeeplink = bool;
    }
}
