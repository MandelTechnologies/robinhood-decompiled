package com.robinhood.android.acatsin;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount2;
import com.robinhood.models.api.bonfire.ApiAvailableAccount;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n\"\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"toLoggingContent", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "defaultAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "getDefaultAccount", "(Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;)Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "findExistingAccountByAccountNumber", "accountNumber", "", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.AcatsInDataStateKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInDataState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsInContext.AccountContents toLoggingContent(AccountContentItem accountContentItem) {
        String lowerCase = accountContentItem.getName().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == -1315347646) {
            if (lowerCase.equals("mutual funds")) {
                return AcatsInContext.AccountContents.MUTUAL_FUNDS;
            }
            return null;
        }
        if (iHashCode == -1081309778) {
            if (lowerCase.equals(GoldFeature.MARGIN)) {
                return AcatsInContext.AccountContents.MARGIN;
            }
            return null;
        }
        if (iHashCode == 93920784 && lowerCase.equals("bonds")) {
            return AcatsInContext.AccountContents.BONDS;
        }
        return null;
    }

    public static final AvailableAccount getDefaultAccount(ApiAvailableDestinationsResponse apiAvailableDestinationsResponse) {
        Intrinsics.checkNotNullParameter(apiAvailableDestinationsResponse, "<this>");
        if (apiAvailableDestinationsResponse.getHasDefaultAccount()) {
            return AvailableAccount2.toDbModel((ApiAvailableAccount) CollectionsKt.first((List) apiAvailableDestinationsResponse.getAvailable_accounts()));
        }
        return null;
    }

    public static final AvailableAccount findExistingAccountByAccountNumber(ApiAvailableDestinationsResponse apiAvailableDestinationsResponse, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(apiAvailableDestinationsResponse, "<this>");
        Iterator<T> it = apiAvailableDestinationsResponse.getAvailable_accounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ApiAvailableAccount apiAvailableDestinationsResponse2 = (ApiAvailableAccount) next;
            if (Intrinsics.areEqual(apiAvailableDestinationsResponse2.getRhf_account_number(), str) || Intrinsics.areEqual(apiAvailableDestinationsResponse2.getRhs_account_number(), str)) {
                break;
            }
        }
        ApiAvailableAccount apiAvailableDestinationsResponse22 = (ApiAvailableAccount) next;
        if (apiAvailableDestinationsResponse22 != null) {
            return AvailableAccount2.toDbModel(apiAvailableDestinationsResponse22);
        }
        return null;
    }
}
