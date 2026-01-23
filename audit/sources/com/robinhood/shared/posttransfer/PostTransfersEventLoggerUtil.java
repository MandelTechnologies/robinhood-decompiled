package com.robinhood.shared.posttransfer;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PostTransferUpsellContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostTransfersEventLoggerUtil.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"logPostTransferUpsellAction", "", "Lcom/robinhood/analytics/EventLogger;", "postTransferUpsellType", "", "impressionCountLogging", "", "shouldShowPostTransferUpsell", "", "lib-post-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.PostTransfersEventLoggerUtilKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PostTransfersEventLoggerUtil {
    public static final void logPostTransferUpsellAction(EventLogger eventLogger, String postTransferUpsellType, int i, boolean z) {
        Boolean r4;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(postTransferUpsellType, "postTransferUpsellType");
        UserInteractionEventData.Action action = UserInteractionEventData.Action.POST_TRANSFER_UPSELL;
        if (z) {
            r4 = Boolean.TRUE;
        } else {
            r4 = Boolean.FALSE;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferUpsellContext(postTransferUpsellType, i, 0, r4, 0L, null, 52, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -2, 16383, null), false, 46, null);
    }
}
