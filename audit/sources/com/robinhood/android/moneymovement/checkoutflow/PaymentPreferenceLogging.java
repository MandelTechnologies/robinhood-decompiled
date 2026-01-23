package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentPreferenceLogging.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0014\u0010\u000e\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\u000bH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"LOGGING_IDENTIFIER", "", "FAILED_LOGGING_IDENTIFIER", "SCREEN", "Lcom/robinhood/rosetta/eventlogging/Screen;", "COMPONENT_TYPE", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "CONTEXT", "Lcom/robinhood/rosetta/eventlogging/Context;", "logPaymentPreferenceCellAppear", "", "Lcom/robinhood/analytics/EventLogger;", "dataState", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;", "logPaymentPreferenceCellDisappear", "logPaymentPreferenceCellAlertTapped", "logPaymentPreferenceCellTapped", "identifierForState", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceLoggingKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PaymentPreferenceLogging {
    private static final String FAILED_LOGGING_IDENTIFIER = "payment_method_failed_to_display";
    private static final String LOGGING_IDENTIFIER = "payment_preference_cell";
    private static final Screen SCREEN = new Screen(Screen.Name.GOLD_HUB, null, null, null, 14, null);
    private static final Component.ComponentType COMPONENT_TYPE = Component.ComponentType.ROW;
    private static final Context CONTEXT = new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null);

    public static final void logPaymentPreferenceCellAppear(EventLogger eventLogger, MoneyMovementPaymentPreferenceDataState dataState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, SCREEN, new Component(COMPONENT_TYPE, identifierForState(dataState), null, 4, null), null, CONTEXT, 9, null);
    }

    public static final void logPaymentPreferenceCellDisappear(EventLogger eventLogger, MoneyMovementPaymentPreferenceDataState dataState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, SCREEN, new Component(COMPONENT_TYPE, identifierForState(dataState), null, 4, null), null, CONTEXT, 9, null);
    }

    public static final void logPaymentPreferenceCellAlertTapped(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, SCREEN, new Component(COMPONENT_TYPE, FAILED_LOGGING_IDENTIFIER, null, 4, null), null, CONTEXT, false, 41, null);
    }

    public static final void logPaymentPreferenceCellTapped(EventLogger eventLogger, MoneyMovementPaymentPreferenceDataState dataState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, SCREEN, new Component(COMPONENT_TYPE, identifierForState(dataState), null, 4, null), null, CONTEXT, false, 41, null);
    }

    private static final String identifierForState(MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState) {
        if (moneyMovementPaymentPreferenceDataState.getUnexpectedError()) {
            return FAILED_LOGGING_IDENTIFIER;
        }
        return LOGGING_IDENTIFIER;
    }
}
