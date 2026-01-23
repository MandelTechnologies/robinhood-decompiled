package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.android.acatsin.availabledestinations.AcatsDestination;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableAccountOther;
import com.robinhood.models.api.bonfire.ApiAvailableAccountSignup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDestination.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$ExistingAccount;", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "selectedOption", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$SignUpAccount;", "Lcom/robinhood/models/api/bonfire/ApiAvailableAccountSignup;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination$Deeplink;", "Lcom/robinhood/models/api/bonfire/ApiAvailableAccountOther;", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsDestinationKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsDestination2 {
    public static final AcatsDestination.ExistingAccount toUiModel(AvailableAccount availableAccount, AcatsDestination acatsDestination) {
        Intrinsics.checkNotNullParameter(availableAccount, "<this>");
        return new AcatsDestination.ExistingAccount(availableAccount.getPictogram(), availableAccount.getTitle(), availableAccount.getBodyComponents(), (acatsDestination instanceof AcatsDestination.ExistingAccount) && Intrinsics.areEqual(((AcatsDestination.ExistingAccount) acatsDestination).getAvailableAccount(), availableAccount), availableAccount);
    }

    public static final AcatsDestination.SignUpAccount toUiModel(ApiAvailableAccountSignup apiAvailableAccountSignup, AcatsDestination acatsDestination) {
        Intrinsics.checkNotNullParameter(apiAvailableAccountSignup, "<this>");
        return new AcatsDestination.SignUpAccount(apiAvailableAccountSignup.getPictogram(), apiAvailableAccountSignup.getTitle(), apiAvailableAccountSignup.getBody_components(), (acatsDestination instanceof AcatsDestination.SignUpAccount) && ((AcatsDestination.SignUpAccount) acatsDestination).getAccountType() == apiAvailableAccountSignup.getBrokerage_account_type(), apiAvailableAccountSignup.getBrokerage_account_type(), apiAvailableAccountSignup.getQuery_value());
    }

    public static final AcatsDestination.Deeplink toUiModel(ApiAvailableAccountOther apiAvailableAccountOther, AcatsDestination acatsDestination) {
        Intrinsics.checkNotNullParameter(apiAvailableAccountOther, "<this>");
        return new AcatsDestination.Deeplink(apiAvailableAccountOther.getPictogram(), apiAvailableAccountOther.getTitle(), apiAvailableAccountOther.getBody_components(), (acatsDestination instanceof AcatsDestination.Deeplink) && Intrinsics.areEqual(((AcatsDestination.Deeplink) acatsDestination).getDeeplink(), apiAvailableAccountOther.getDeeplink()), apiAvailableAccountOther.getDeeplink(), apiAvailableAccountOther.getLogging_identifier());
    }
}
