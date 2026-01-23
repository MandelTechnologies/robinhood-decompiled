package com.robinhood.android.transfers.i18n;

import android.net.Uri;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.idl.DeeplinkMessage;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import deeplinks.isa.p450v1.IsaDashboardDeeplinkDto;
import deeplinks.isa.p450v1.IsaTransferFundsDeeplinkDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternationalTransfersHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"linkedAccountsState", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;", "getLinkedAccountsState$annotations", "(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;)V", "getLinkedAccountsState", "(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;)Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "transferHubActionsState", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "getTransferHubActionsState$annotations", "getTransferHubActionsState", "(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;)Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "getIsaTransferDeeplink", "Landroid/net/Uri;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransfersHubStateProvider2 {
    public static /* synthetic */ void getLinkedAccountsState$annotations(InternationalTransfersHubDataState internationalTransfersHubDataState) {
    }

    public static /* synthetic */ void getTransferHubActionsState$annotations(InternationalTransfersHubDataState internationalTransfersHubDataState) {
    }

    public static final InternationalTransfersHubViewState.LinkedAccountsState getLinkedAccountsState(InternationalTransfersHubDataState internationalTransfersHubDataState) {
        Intrinsics.checkNotNullParameter(internationalTransfersHubDataState, "<this>");
        ImmutableList<InternationalTransfersHubViewState.AccountRow> linkedAccountRows = internationalTransfersHubDataState.getLinkedAccountRows();
        if (linkedAccountRows == null) {
            return InternationalTransfersHubViewState.LinkedAccountsState.Loading.INSTANCE;
        }
        if (linkedAccountRows.isEmpty()) {
            if (Affiliate.RHSG.INSTANCE.contains(internationalTransfersHubDataState.getLocality())) {
                return InternationalTransfersHubViewState.LinkedAccountsState.Empty.INSTANCE;
            }
            return InternationalTransfersHubViewState.LinkedAccountsState.Hidden.INSTANCE;
        }
        return new InternationalTransfersHubViewState.LinkedAccountsState.Loaded(linkedAccountRows);
    }

    public static final InternationalTransfersHubViewState.TransferHubActionsState getTransferHubActionsState(InternationalTransfersHubDataState internationalTransfersHubDataState) {
        Intrinsics.checkNotNullParameter(internationalTransfersHubDataState, "<this>");
        CountryCode.Supported locality = internationalTransfersHubDataState.getLocality();
        if (Affiliate.RHSG.INSTANCE.contains(locality)) {
            return InternationalTransfersHubViewState.TransferHubActionsState.ActionBar.INSTANCE;
        }
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            Boolean boolIsMcwGbEnabled = internationalTransfersHubDataState.isMcwGbEnabled();
            if (Intrinsics.areEqual(boolIsMcwGbEnabled, Boolean.TRUE)) {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (internationalTransfersHubDataState.isIsaEnabled()) {
                    listCreateListBuilder.add(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.TRANSFER_IN_IRA);
                }
                if (internationalTransfersHubDataState.getBrokerageAccounts() != null && internationalTransfersHubDataState.getBrokerageAccounts().size() > 1) {
                    listCreateListBuilder.add(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.TRANSFER_BETWEEN_ACCOUNTS);
                }
                listCreateListBuilder.add(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow.VIEW_TRANSFER_LIMITS);
                return new InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows(CollectionsKt.build(listCreateListBuilder));
            }
            if (Intrinsics.areEqual(boolIsMcwGbEnabled, Boolean.FALSE)) {
                return InternationalTransfersHubViewState.TransferHubActionsState.Rows.INSTANCE;
            }
            if (boolIsMcwGbEnabled != null) {
                throw new NoWhenBranchMatchedException();
            }
            return InternationalTransfersHubViewState.TransferHubActionsState.Loading.INSTANCE;
        }
        throw new IllegalStateException(("Unexpected locality: " + internationalTransfersHubDataState.getLocality()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Uri getIsaTransferDeeplink(InternationalTransfersHubDataState internationalTransfersHubDataState) {
        String str;
        Object next;
        DeeplinkMessage isaDashboardDeeplinkDto;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(internationalTransfersHubDataState, "<this>");
        List<Account> brokerageAccounts = internationalTransfersHubDataState.getBrokerageAccounts();
        if (brokerageAccounts == null) {
            brokerageAccounts = CollectionsKt.emptyList();
        }
        Iterator<T> it = brokerageAccounts.iterator();
        while (true) {
            str = null;
            objArr = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.ISA_STOCKS_AND_SHARES) {
                break;
            }
        }
        Account account = (Account) next;
        if (account != null) {
            isaDashboardDeeplinkDto = new IsaTransferFundsDeeplinkDto(account.getAccountNumber());
        } else {
            isaDashboardDeeplinkDto = new IsaDashboardDeeplinkDto(str, 1, objArr == true ? 1 : 0);
        }
        return isaDashboardDeeplinkDto.encodeToUri(RhDeeplinkSupportedUri.ROBINHOOD);
    }
}
