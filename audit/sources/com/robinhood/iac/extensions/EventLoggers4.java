package com.robinhood.iac.extensions;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLoggers.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"logAppear", "", "Lcom/robinhood/analytics/EventLogger;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacStatusBanner;", "logTap", "logBannerAction", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "lib-iac-status-banner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.extensions.EventLoggersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class EventLoggers4 {
    public static final void logAppear(EventLogger eventLogger, IacStatusBanner banner) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(banner, "banner");
        logBannerAction(eventLogger, banner, UserInteractionEventData.EventType.APPEAR);
    }

    public static final void logTap(EventLogger eventLogger, IacStatusBanner banner) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(banner, "banner");
        logBannerAction(eventLogger, banner, UserInteractionEventData.EventType.TAP);
    }

    private static final void logBannerAction(EventLogger eventLogger, IacStatusBanner iacStatusBanner, UserInteractionEventData.EventType eventType) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, null, IacStatusBanners.getComponent(iacStatusBanner), null, IacStatusBanners.getEventContext(iacStatusBanner), null, null, 106, null), false, false, 6, null);
    }
}
