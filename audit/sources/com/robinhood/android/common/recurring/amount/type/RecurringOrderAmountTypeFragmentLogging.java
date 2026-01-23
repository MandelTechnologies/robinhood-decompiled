package com.robinhood.android.common.recurring.amount.type;

import com.robinhood.analytics.EventLogger;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountTypeFragmentLogging.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"logAmountTypeSelected", "", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment;", "selectedAmountType", "Lcom/robinhood/recurring/models/AmountType;", "recurringContext", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragmentLoggingKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeFragmentLogging {

    /* compiled from: RecurringOrderAmountTypeFragmentLogging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragmentLoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void logAmountTypeSelected(RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment, AmountType selectedAmountType, RecurringContext recurringContext) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(recurringOrderAmountTypeFragment, "<this>");
        Intrinsics.checkNotNullParameter(selectedAmountType, "selectedAmountType");
        Intrinsics.checkNotNullParameter(recurringContext, "recurringContext");
        EventLogger eventLogger = recurringOrderAmountTypeFragment.getEventLogger();
        int i = WhenMappings.$EnumSwitchMapping$0[selectedAmountType.ordinal()];
        if (i == 1) {
            action = UserInteractionEventData.Action.SELECT_DOLLAR_AMOUNT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.SELECT_PERCENTAGE_AMOUNT;
        }
        UserInteractionEventData.Action action2 = action;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, new Screen(Screen.Name.RECURRING_AMOUNT_TYPE, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}
