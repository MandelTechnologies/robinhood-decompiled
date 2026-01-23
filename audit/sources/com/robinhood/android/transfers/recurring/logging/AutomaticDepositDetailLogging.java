package com.robinhood.android.transfers.recurring.logging;

import androidx.compose.p011ui.Modifier;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.transfers.recurring.p270ui.AutomaticDepositDetailFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomaticDepositDetailLogging.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\b¨\u0006\u000b"}, m3636d2 = {"autoLogSkipButton", "Landroidx/compose/ui/Modifier;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "isEnabled", "", "logSkipConfirmationDialogAppear", "", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailFragment;", "logSkipConfirmationDialogPositiveButtonTap", "logSkipConfirmationDialogNegativeButtonTap", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.logging.AutomaticDepositDetailLoggingKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AutomaticDepositDetailLogging {
    public static final Modifier autoLogSkipButton(Modifier modifier, Screen screen, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        if (z) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        return ModifiersKt.autoLogEvents$default(modifier, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.SKIP_RECURRING_DEPOSIT, null, new Component(componentType, str, null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
    }

    public static final void logSkipConfirmationDialogAppear(AutomaticDepositDetailFragment automaticDepositDetailFragment) {
        Intrinsics.checkNotNullParameter(automaticDepositDetailFragment, "<this>");
        EventLogger.DefaultImpls.logAppear$default(automaticDepositDetailFragment.getEventLogger(), null, automaticDepositDetailFragment.getEventScreen(), new Component(Component.ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG, null, null, 6, null), null, null, 25, null);
    }

    public static final void logSkipConfirmationDialogPositiveButtonTap(AutomaticDepositDetailFragment automaticDepositDetailFragment) {
        Intrinsics.checkNotNullParameter(automaticDepositDetailFragment, "<this>");
        EventLogger.DefaultImpls.logTap$default(automaticDepositDetailFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, automaticDepositDetailFragment.getEventScreen(), new Component(Component.ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG, null, null, 6, null), null, null, false, 56, null);
    }

    public static final void logSkipConfirmationDialogNegativeButtonTap(AutomaticDepositDetailFragment automaticDepositDetailFragment) {
        Intrinsics.checkNotNullParameter(automaticDepositDetailFragment, "<this>");
        EventLogger.DefaultImpls.logTap$default(automaticDepositDetailFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, automaticDepositDetailFragment.getEventScreen(), new Component(Component.ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG, null, null, 6, null), null, null, false, 56, null);
    }
}
