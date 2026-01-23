package com.robinhood.android.transfers.p271ui.retirement.contributions;

import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateRetirementContributionDeeplinkTarget extends DeeplinkTarget4 {
    public static final CreateRetirementContributionDeeplinkTarget INSTANCE = new CreateRetirementContributionDeeplinkTarget();
    public static final int $stable = 8;

    private CreateRetirementContributionDeeplinkTarget() {
        super("create_retirement_contribution", (RegionGate) RetirementRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        MAXTransferContext.EntryPoint entryPoint;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("entry_point");
        if (queryParameter3 != null) {
            switch (queryParameter3.hashCode()) {
                case -906316841:
                    if (!queryParameter3.equals("retirement_unfunded_learn_and_earn_education_lesson")) {
                        entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                        break;
                    } else {
                        entryPoint = MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
                        break;
                    }
                case -739102460:
                    if (queryParameter3.equals("retirement_gold_bottom_sheet")) {
                        entryPoint = MAXTransferContext.EntryPoint.GOLD_RET_PROMO_BOTTOM_SHEET;
                        break;
                    }
                    break;
                case -456009438:
                    if (queryParameter3.equals(AnalyticsStrings.BUTTON_ACCOUNT_GOLD_SETTINGS)) {
                        entryPoint = MAXTransferContext.EntryPoint.GOLD_SETTINGS;
                        break;
                    }
                    break;
                case -241873878:
                    if (queryParameter3.equals("retirement_funding_methods")) {
                        entryPoint = MAXTransferContext.EntryPoint.RETIREMENT_FUNDING_METHODS;
                        break;
                    }
                    break;
                case 217489624:
                    if (queryParameter3.equals("retirement_unfunded_dashboard")) {
                        entryPoint = MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_DASHBOARD;
                        break;
                    }
                    break;
                case 1046003772:
                    if (queryParameter3.equals("retirement_gold_match_promo")) {
                        entryPoint = MAXTransferContext.EntryPoint.RETIREMENT_GOLD_MATCH_PROMO;
                        break;
                    }
                    break;
                case 1630172108:
                    if (queryParameter3.equals("retirement_contribution_hub")) {
                        entryPoint = MAXTransferContext.EntryPoint.RETIREMENT_CONTRIBUTION_HUB;
                        break;
                    }
                    break;
                case 2003395203:
                    if (queryParameter3.equals("gold_welcome")) {
                        entryPoint = MAXTransferContext.EntryPoint.GOLD_WELCOME;
                        break;
                    }
                    break;
            }
        }
        MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CreateRetirementContribution(null, queryParameter2, (TransferContext.RobinhoodAccountType) TransferContext.RobinhoodAccountType.INSTANCE.fromServerValue(queryParameter), false, false, entryPoint2, 25, null), null, false, 12, null)};
    }
}
