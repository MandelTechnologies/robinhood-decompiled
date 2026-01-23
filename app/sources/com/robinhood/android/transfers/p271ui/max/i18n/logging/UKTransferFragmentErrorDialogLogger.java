package com.robinhood.android.transfers.p271ui.max.i18n.logging;

import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UKTransferFragmentErrorDialogLogger.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u0007H\u0002¨\u0006\u000b"}, m3636d2 = {"logServerErrorAlertDialogAppear", "", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "errorCode", "", "logServerErrorAlertDialogDismiss", "toLoggingComponentForAlertLogging", "Lcom/robinhood/rosetta/eventlogging/Component;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.logging.UKTransferFragmentErrorDialogLoggerKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UKTransferFragmentErrorDialogLogger {
    public static final void logServerErrorAlertDialogAppear(InternationalTransferFragment internationalTransferFragment, Context eventContext, String str) {
        Intrinsics.checkNotNullParameter(internationalTransferFragment, "<this>");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        EventLogger.DefaultImpls.logAppear$default(internationalTransferFragment.getEventLogger(), null, internationalTransferFragment.getEventScreen(), toLoggingComponentForAlertLogging(str), null, eventContext, 9, null);
    }

    public static final void logServerErrorAlertDialogDismiss(InternationalTransferFragment internationalTransferFragment) {
        Intrinsics.checkNotNullParameter(internationalTransferFragment, "<this>");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Context.ProductTag productTag = null;
        int i4 = 0;
        List list = null;
        EventLogger.DefaultImpls.logTap$default(internationalTransferFragment.getEventLogger(), null, internationalTransferFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "dismiss", null, 4, null), null, new Context(i, i2, i3, null, null, null, null, productTag, i4, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, null, null, null, null, null, ((InternationalTransferFragment.Args) InternationalTransferFragment.INSTANCE.getArgs((Fragment) internationalTransferFragment)).getEntryPoint(), null, null, null, null, null, null, null, CountryCode.Supported.UnitedKingdom.INSTANCE.getIso3166CountryCode(), null, null, null, null, null, 1032127, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Component toLoggingComponentForAlertLogging(String str) {
        String str2;
        Component.ComponentType componentType = Component.ComponentType.ALERT;
        if (str != null) {
            switch (str.hashCode()) {
                case -1736497029:
                    if (!str.equals("i18n_withdrawal_insufficient_funds")) {
                        str2 = "";
                        break;
                    } else {
                        str2 = "insufficient_fund";
                        break;
                    }
                case -1537491788:
                    if (str.equals("i18n_restriction_no_withdraw")) {
                        str2 = "withdrawal_account_restricted";
                        break;
                    }
                    break;
                case -1443304947:
                    if (str.equals("i18n_planned_outage")) {
                        str2 = "planned_outage";
                        break;
                    }
                    break;
                case -1047343908:
                    if (str.equals("i18n_deposit_amount_limit_exceeded")) {
                        str2 = "deposit_amount_limit";
                        break;
                    }
                    break;
                case -958411571:
                    if (str.equals("i18n_restriction_ofac")) {
                        str2 = "deposit_account_restricted";
                        break;
                    }
                    break;
                case 13573553:
                    if (str.equals("i18n_deposit_pending_count_limit_exceeded")) {
                        str2 = "deposit_pending_count_limit";
                        break;
                    }
                    break;
                case 288262068:
                    if (!str.equals("i18n_restriction_no_deposit")) {
                    }
                    break;
                case 397155154:
                    if (!str.equals("i18n_restriction_account_closed")) {
                    }
                    break;
                case 565153529:
                    if (str.equals("i18n_withdrawal_no_funds")) {
                        str2 = "no_withdrawable_fund";
                        break;
                    }
                    break;
                case 657222896:
                    if (!str.equals("i18n_restriction_account_locked")) {
                    }
                    break;
                case 1376853936:
                    if (str.equals("i18n_withdrawal_count_limit_exceeded")) {
                        str2 = "withdrawal_count_limit";
                        break;
                    }
                    break;
                case 1424239798:
                    if (str.equals("i18n_generic")) {
                        str2 = "something_went_wrong";
                        break;
                    }
                    break;
                case 1695316489:
                    if (str.equals("i18n_deposit_count_limit_exceeded")) {
                        str2 = "deposit_count_limit";
                        break;
                    }
                    break;
                case 1965218837:
                    if (str.equals("i18n_withdrawal_amount_limit_exceeded")) {
                        str2 = "withdrawal_amount_limit";
                        break;
                    }
                    break;
            }
        }
        return new Component(componentType, str2, null, 4, null);
    }
}
