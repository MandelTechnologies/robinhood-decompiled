package com.robinhood.android.transfers.ach.util;

import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewRecurringDepositLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logOnReview", "", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment;", "amount", "Ljava/math/BigDecimal;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.util.ReviewRecurringDepositLoggingUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewRecurringDepositLoggingUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void logOnReview(ReviewRecurringDepositFragment reviewRecurringDepositFragment, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(reviewRecurringDepositFragment, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        EventLogger eventLogger = reviewRecurringDepositFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        Money moneyForLogging = com.robinhood.android.transfers.lib.ExtensionsKt.toMoneyForLogging(amount);
        ReviewRecurringDepositFragment.Companion companion = ReviewRecurringDepositFragment.INSTANCE;
        TransferContext.Direction directionForLogging = LoggingUtils7.toDirectionForLogging(((ReviewRecurringDepositFragment.Args) companion.getArgs((Fragment) reviewRecurringDepositFragment)).getTransferContext().getDirection());
        TransferContext.Frequency frequencyForLogging = LoggingUtils7.toFrequencyForLogging(((ReviewRecurringDepositFragment.Args) companion.getArgs((Fragment) reviewRecurringDepositFragment)).getFrequency());
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        String string2 = ExtensionsKt.getSessionId(reviewRecurringDepositFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TransferContext transferContext = new TransferContext(moneyForLogging, directionForLogging, null, frequencyForLogging, paymentInstrument, "", string2, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, null);
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.REVIEW_TRANSFER, null, null, null, 14, null), component, action, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null), null, null, 96, null), false, false, 6, null);
    }
}
