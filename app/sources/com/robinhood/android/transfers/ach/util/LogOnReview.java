package com.robinhood.android.transfers.ach.util;

import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogOnReview.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"logOnReview", "", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.util.LogOnReviewKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LogOnReview {
    public static final void logOnReview(CreateAchTransferFragment createAchTransferFragment, BigDecimal amount, UUID uuid) {
        Intrinsics.checkNotNullParameter(createAchTransferFragment, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        EventLogger eventLogger = createAchTransferFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.REVIEW_TRANSFER;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.CREATE_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), action, LoggingUtils7.createContextForLogging(createAchTransferFragment, uuid, amount, createAchTransferFragment.getTransferContext().getDirection(), ((CreateAchTransferFragment.Args) CreateAchTransferFragment.INSTANCE.getArgs((Fragment) createAchTransferFragment)).getDepositFrequency()), null, null, 96, null), false, false, 6, null);
    }
}
