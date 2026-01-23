package com.robinhood.android.resumeapplication.microgram;

import com.robinhood.analytics.EventLogger;
import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PostTransferUpsellContext;
import com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealResurrectionUpsellLoggingService.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/microgram/RealResurrectionUpsellLoggingService;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "logPostDepositUpsellAction", "", "upsellIdentifier", "", "shownCount", "", "lastShownTimeMs", "", "wasShown", "", "(Ljava/lang/String;ILjava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logTakeoverUpsellAction", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RealResurrectionUpsellLoggingService implements ResurrectionUpsellLoggingService {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public RealResurrectionUpsellLoggingService(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService
    public Object logPostDepositUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation) {
        Boolean r5;
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.POST_TRANSFER_UPSELL;
        if (z) {
            r5 = Boolean.TRUE;
        } else {
            r5 = Boolean.FALSE;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, null, null, new Context(i2, i3, i4, str2, str3, str4, str5, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferUpsellContext(str, i, i, r5, 0L, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -2, 16383, null), false, 46, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService
    public Object logTakeoverUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation) {
        Boolean r4;
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.RESURRECTION_TAKEOVER_UPSELL;
        if (z) {
            r4 = Boolean.TRUE;
        } else {
            r4 = Boolean.FALSE;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ResumeApplicationTakeoverContext(l != null ? l.longValue() : 0L, i, r4, str, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -268435457, -1, 16383, null), false, 46, null);
        return Unit.INSTANCE;
    }
}
