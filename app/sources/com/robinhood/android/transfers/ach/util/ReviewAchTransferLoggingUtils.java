package com.robinhood.android.transfers.ach.util;

import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.ach.p265ui.ReviewAchTransferFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAchTransferLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logOnReview", "", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment;", "amount", "Ljava/math/BigDecimal;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.util.ReviewAchTransferLoggingUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewAchTransferLoggingUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void logOnReview(ReviewAchTransferFragment reviewAchTransferFragment, BigDecimal amount) {
        String string2;
        Intrinsics.checkNotNullParameter(reviewAchTransferFragment, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        EventLogger eventLogger = reviewAchTransferFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        Money moneyForLogging = com.robinhood.android.transfers.lib.ExtensionsKt.toMoneyForLogging(amount);
        TransferContext.Direction directionForLogging = LoggingUtils7.toDirectionForLogging(reviewAchTransferFragment.getTransferContext().getDirection());
        ReviewAchTransferFragment.Companion companion = ReviewAchTransferFragment.INSTANCE;
        TransferContext.Frequency frequencyForLogging = LoggingUtils7.toFrequencyForLogging(((ReviewAchTransferFragment.Args) companion.getArgs((Fragment) reviewAchTransferFragment)).getFrequency());
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        if (!((ReviewAchTransferFragment.Args) companion.getArgs((Fragment) reviewAchTransferFragment)).getFrequency().getIsRecurring()) {
            string2 = ExtensionsKt.generateRefId(reviewAchTransferFragment, new TransferData(((ReviewAchTransferFragment.Args) companion.getArgs((Fragment) reviewAchTransferFragment)).getAchRelationshipId(), amount, reviewAchTransferFragment.getTransferContext().getDirection())).toString();
        } else {
            string2 = "";
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        String string3 = ExtensionsKt.getSessionId(reviewAchTransferFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        TransferContext transferContext = new TransferContext(moneyForLogging, directionForLogging, null, frequencyForLogging, paymentInstrument, str, string3, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, null);
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.REVIEW_TRANSFER, null, null, null, 14, null), component, action, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null), null, null, 96, null), false, false, 6, null);
    }
}
