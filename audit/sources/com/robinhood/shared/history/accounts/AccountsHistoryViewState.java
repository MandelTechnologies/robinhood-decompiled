package com.robinhood.shared.history.accounts;

import android.content.res.Resources;
import androidx.paging.PagedList;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.lib.account.futures.RhdSubAccountIds;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.history.HistoryDisclosure;
import com.robinhood.shared.history.accounts.HistoryFilterSelection;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter2;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: AccountsHistoryViewState.kt */
@Metadata(m3635d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>J\u001f\u0010\u008f\u0001\u001a\u0005\u0018\u0001H\u0090\u0001\"\u000b\b\u0000\u0010\u0090\u0001\u0018\u0001*\u00020\u0003H\u0082\b¢\u0006\u0002\u0010\"J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\tHÆ\u0003J\u001c\u0010\u0096\u0001\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fHÆ\u0003J\u001c\u0010\u0097\u0001\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fHÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J\u0010\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\tHÆ\u0003J\n\u0010 \u0001\u001a\u00020\tHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\tHÂ\u0003Jø\u0001\u0010£\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\tHÆ\u0001J\u0015\u0010¤\u0001\u001a\u00020\t2\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¦\u0001\u001a\u00020YHÖ\u0001J\u000b\u0010§\u0001\u001a\u00030¨\u0001HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010'R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R#\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R#\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010'R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010FR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020@0M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010FR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020S0M8F¢\u0006\u0006\u001a\u0004\bT\u0010OR\u0011\u0010U\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020Y8G¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010\\\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0016\u0010b\u001a\u0004\u0018\u00010c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\bg\u0010_R\u0013\u0010h\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\bi\u0010_R\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010n\u001a\u0004\u0018\u00010o8F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0011\u0010r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bs\u0010'R\u0011\u0010t\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bu\u0010'R\u0011\u0010v\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bw\u0010'R\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020y0M8F¢\u0006\u0006\u001a\u0004\bz\u0010OR\u0011\u0010{\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b|\u0010'R\u0017\u0010}\u001a\u0004\u0018\u00010~8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010M8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010OR\u001a\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010'R\u0016\u0010\u0089\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010'R\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006©\u0001"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryViewState;", "", "selectedAccountTypeFilter", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "selectedTransactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "selectedTransactionTypeSubFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "isLoading", "", "hasError", "pendingHistoryEvents", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "historyEvents", "accounts", "Lkotlinx/collections/immutable/PersistentList;", "presentTransactionFilters", "Lkotlinx/collections/immutable/ImmutableSet;", "presentTransactionSubFilters", "isInEtfRegionGate", "inCryptoRegionGate", "inSpendingRegionGate", "inFuturesRegionGate", "inEcRegionGate", "inAdvisoryRegionGate", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "isRhcApp", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;ZZLandroidx/paging/PagedList;Landroidx/paging/PagedList;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/ImmutableSet;Lkotlinx/collections/immutable/ImmutableSet;ZZZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;Z)V", "getSelectedAccountTypeFilter", "()Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "getSelectedTransactionTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getSelectedTransactionTypeSubFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "()Z", "getHasError", "getPendingHistoryEvents", "()Landroidx/paging/PagedList;", "getHistoryEvents", "getAccounts", "()Lkotlinx/collections/immutable/PersistentList;", "getPresentTransactionFilters", "()Lkotlinx/collections/immutable/ImmutableSet;", "getPresentTransactionSubFilters", "getInCryptoRegionGate", "getInSpendingRegionGate", "getInFuturesRegionGate", "getInEcRegionGate", "getInAdvisoryRegionGate", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "hasHistoryEvents", "hasPendingHistoryEvents", "isEmpty", "getAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "resources", "Landroid/content/res/Resources;", "activeTransactionTypeFilter", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionFilter;", "getActiveTransactionTypeFilter", "()Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionFilter;", "transactionTypeFiltersToHide", "", "getTransactionTypeFiltersToHide", "()Ljava/util/Set;", "supportedTransactionFiltersForAccountType", "", "getSupportedTransactionFiltersForAccountType", "transactionTypeFilters", "getTransactionTypeFilters", "selectableTransactionTypeFilters", "", "getSelectableTransactionTypeFilters", "()Ljava/util/List;", "transactionTypeSubFilters", "getTransactionTypeSubFilters", "selectableTransactionTypeSubFilters", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionSubFilter;", "getSelectableTransactionTypeSubFilters", "activeTransactionTypeSubFilter", "getActiveTransactionTypeSubFilter", "()Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionSubFilter;", "subFiltersSheetTitle", "", "getSubFiltersSheetTitle", "()I", "selectedMinervaAccountId", "Ljava/util/UUID;", "getSelectedMinervaAccountId", "()Ljava/util/UUID;", "selectedRhyAccountId", "getSelectedRhyAccountId", "activeRhdSubAccountIds", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "getActiveRhdSubAccountIds", "()Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "selectedFuturesSubAccountId", "getSelectedFuturesSubAccountId", "selectedSwapsSubAccountId", "getSelectedSwapsSubAccountId", "rhsAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "getRhsAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "nummusAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "getNummusAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "showAccountTypeChip", "getShowAccountTypeChip", "showTransactionTypeChip", "getShowTransactionTypeChip", "showSubTransactionTypeChip", "getShowSubTransactionTypeChip", "disclosures", "Lcom/robinhood/shared/history/HistoryDisclosure;", "getDisclosures", "showInfoMenu", "getShowInfoMenu", "rhyAccount", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Rhy;", "getRhyAccount", "()Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Rhy;", "brokerageAccounts", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$BrokerageAccount;", "getBrokerageAccounts", "originalIndividualAccount", "getOriginalIndividualAccount", "()Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$BrokerageAccount;", "hasAnyRhdSubAccounts", "getHasAnyRhdSubAccounts", "hasAnyManagedAccounts", "getHasAnyManagedAccounts", "cryptoAccount", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Crypto;", "getCryptoAccount", "()Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Crypto;", "getAccount", "T", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class AccountsHistoryViewState {
    public static final int $stable = 8;
    private final ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> accounts;
    private final boolean hasError;
    private final boolean hasHistoryEvents;
    private final boolean hasPendingHistoryEvents;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> historyEvents;
    private final boolean inAdvisoryRegionGate;
    private final boolean inCryptoRegionGate;
    private final boolean inEcRegionGate;
    private final boolean inFuturesRegionGate;
    private final boolean inSpendingRegionGate;
    private final boolean isInEtfRegionGate;
    private final boolean isLoading;
    private final boolean isRhcApp;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryEvents;
    private final ImmutableSet<AccountsHistoryTransactionTypeFilter> presentTransactionFilters;
    private final ImmutableSet<AccountsHistoryTransactionTypeSubFilter> presentTransactionSubFilters;
    private final AccountsHistoryStore.HistoryAccountFilterViewInfo selectedAccountTypeFilter;
    private final AccountsHistoryTransactionTypeFilter selectedTransactionTypeFilter;
    private final AccountsHistoryTransactionTypeSubFilter selectedTransactionTypeSubFilter;
    private final CountryCode.Supported userLocality;

    /* compiled from: AccountsHistoryViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountsHistoryTransactionTypeFilter.values().length];
            try {
                iArr[AccountsHistoryTransactionTypeFilter.EQUITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryTransactionTypeFilter.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component18, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    public static /* synthetic */ AccountsHistoryViewState copy$default(AccountsHistoryViewState accountsHistoryViewState, AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo, AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter, boolean z, boolean z2, PagedList pagedList, PagedList pagedList2, ImmutableList3 immutableList3, ImmutableSet immutableSet, ImmutableSet immutableSet2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CountryCode.Supported supported, boolean z9, int i, Object obj) {
        boolean z10;
        CountryCode.Supported supported2;
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo2 = (i & 1) != 0 ? accountsHistoryViewState.selectedAccountTypeFilter : historyAccountFilterViewInfo;
        AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter2 = (i & 2) != 0 ? accountsHistoryViewState.selectedTransactionTypeFilter : accountsHistoryTransactionTypeFilter;
        AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter2 = (i & 4) != 0 ? accountsHistoryViewState.selectedTransactionTypeSubFilter : accountsHistoryTransactionTypeSubFilter;
        boolean z11 = (i & 8) != 0 ? accountsHistoryViewState.isLoading : z;
        boolean z12 = (i & 16) != 0 ? accountsHistoryViewState.hasError : z2;
        PagedList pagedList3 = (i & 32) != 0 ? accountsHistoryViewState.pendingHistoryEvents : pagedList;
        PagedList pagedList4 = (i & 64) != 0 ? accountsHistoryViewState.historyEvents : pagedList2;
        ImmutableList3 immutableList32 = (i & 128) != 0 ? accountsHistoryViewState.accounts : immutableList3;
        ImmutableSet immutableSet3 = (i & 256) != 0 ? accountsHistoryViewState.presentTransactionFilters : immutableSet;
        ImmutableSet immutableSet4 = (i & 512) != 0 ? accountsHistoryViewState.presentTransactionSubFilters : immutableSet2;
        boolean z13 = (i & 1024) != 0 ? accountsHistoryViewState.isInEtfRegionGate : z3;
        boolean z14 = (i & 2048) != 0 ? accountsHistoryViewState.inCryptoRegionGate : z4;
        boolean z15 = (i & 4096) != 0 ? accountsHistoryViewState.inSpendingRegionGate : z5;
        boolean z16 = (i & 8192) != 0 ? accountsHistoryViewState.inFuturesRegionGate : z6;
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo3 = historyAccountFilterViewInfo2;
        boolean z17 = (i & 16384) != 0 ? accountsHistoryViewState.inEcRegionGate : z7;
        boolean z18 = (i & 32768) != 0 ? accountsHistoryViewState.inAdvisoryRegionGate : z8;
        CountryCode.Supported supported3 = (i & 65536) != 0 ? accountsHistoryViewState.userLocality : supported;
        if ((i & 131072) != 0) {
            supported2 = supported3;
            z10 = accountsHistoryViewState.isRhcApp;
        } else {
            z10 = z9;
            supported2 = supported3;
        }
        return accountsHistoryViewState.copy(historyAccountFilterViewInfo3, accountsHistoryTransactionTypeFilter2, accountsHistoryTransactionTypeSubFilter2, z11, z12, pagedList3, pagedList4, immutableList32, immutableSet3, immutableSet4, z13, z14, z15, z16, z17, z18, supported2, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountsHistoryStore.HistoryAccountFilterViewInfo getSelectedAccountTypeFilter() {
        return this.selectedAccountTypeFilter;
    }

    public final ImmutableSet<AccountsHistoryTransactionTypeSubFilter> component10() {
        return this.presentTransactionSubFilters;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getInSpendingRegionGate() {
        return this.inSpendingRegionGate;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getInFuturesRegionGate() {
        return this.inFuturesRegionGate;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getInEcRegionGate() {
        return this.inEcRegionGate;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getInAdvisoryRegionGate() {
        return this.inAdvisoryRegionGate;
    }

    /* renamed from: component17, reason: from getter */
    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountsHistoryTransactionTypeFilter getSelectedTransactionTypeFilter() {
        return this.selectedTransactionTypeFilter;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountsHistoryTransactionTypeSubFilter getSelectedTransactionTypeSubFilter() {
        return this.selectedTransactionTypeSubFilter;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasError() {
        return this.hasError;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component6() {
        return this.pendingHistoryEvents;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component7() {
        return this.historyEvents;
    }

    public final ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> component8() {
        return this.accounts;
    }

    public final ImmutableSet<AccountsHistoryTransactionTypeFilter> component9() {
        return this.presentTransactionFilters;
    }

    public final AccountsHistoryViewState copy(AccountsHistoryStore.HistoryAccountFilterViewInfo selectedAccountTypeFilter, AccountsHistoryTransactionTypeFilter selectedTransactionTypeFilter, AccountsHistoryTransactionTypeSubFilter selectedTransactionTypeSubFilter, boolean isLoading, boolean hasError, PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryEvents, PagedList<StatefulHistoryEvent<HistoryEvent>> historyEvents, ImmutableList3<? extends AccountsHistoryStore.HistoryAccountFilterViewInfo> accounts2, ImmutableSet<? extends AccountsHistoryTransactionTypeFilter> presentTransactionFilters, ImmutableSet<? extends AccountsHistoryTransactionTypeSubFilter> presentTransactionSubFilters, boolean isInEtfRegionGate, boolean inCryptoRegionGate, boolean inSpendingRegionGate, boolean inFuturesRegionGate, boolean inEcRegionGate, boolean inAdvisoryRegionGate, CountryCode.Supported userLocality, boolean isRhcApp) {
        Intrinsics.checkNotNullParameter(selectedTransactionTypeFilter, "selectedTransactionTypeFilter");
        Intrinsics.checkNotNullParameter(selectedTransactionTypeSubFilter, "selectedTransactionTypeSubFilter");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(presentTransactionFilters, "presentTransactionFilters");
        Intrinsics.checkNotNullParameter(presentTransactionSubFilters, "presentTransactionSubFilters");
        return new AccountsHistoryViewState(selectedAccountTypeFilter, selectedTransactionTypeFilter, selectedTransactionTypeSubFilter, isLoading, hasError, pendingHistoryEvents, historyEvents, accounts2, presentTransactionFilters, presentTransactionSubFilters, isInEtfRegionGate, inCryptoRegionGate, inSpendingRegionGate, inFuturesRegionGate, inEcRegionGate, inAdvisoryRegionGate, userLocality, isRhcApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountsHistoryViewState)) {
            return false;
        }
        AccountsHistoryViewState accountsHistoryViewState = (AccountsHistoryViewState) other;
        return Intrinsics.areEqual(this.selectedAccountTypeFilter, accountsHistoryViewState.selectedAccountTypeFilter) && this.selectedTransactionTypeFilter == accountsHistoryViewState.selectedTransactionTypeFilter && this.selectedTransactionTypeSubFilter == accountsHistoryViewState.selectedTransactionTypeSubFilter && this.isLoading == accountsHistoryViewState.isLoading && this.hasError == accountsHistoryViewState.hasError && Intrinsics.areEqual(this.pendingHistoryEvents, accountsHistoryViewState.pendingHistoryEvents) && Intrinsics.areEqual(this.historyEvents, accountsHistoryViewState.historyEvents) && Intrinsics.areEqual(this.accounts, accountsHistoryViewState.accounts) && Intrinsics.areEqual(this.presentTransactionFilters, accountsHistoryViewState.presentTransactionFilters) && Intrinsics.areEqual(this.presentTransactionSubFilters, accountsHistoryViewState.presentTransactionSubFilters) && this.isInEtfRegionGate == accountsHistoryViewState.isInEtfRegionGate && this.inCryptoRegionGate == accountsHistoryViewState.inCryptoRegionGate && this.inSpendingRegionGate == accountsHistoryViewState.inSpendingRegionGate && this.inFuturesRegionGate == accountsHistoryViewState.inFuturesRegionGate && this.inEcRegionGate == accountsHistoryViewState.inEcRegionGate && this.inAdvisoryRegionGate == accountsHistoryViewState.inAdvisoryRegionGate && Intrinsics.areEqual(this.userLocality, accountsHistoryViewState.userLocality) && this.isRhcApp == accountsHistoryViewState.isRhcApp;
    }

    public int hashCode() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        int iHashCode = (((((((((historyAccountFilterViewInfo == null ? 0 : historyAccountFilterViewInfo.hashCode()) * 31) + this.selectedTransactionTypeFilter.hashCode()) * 31) + this.selectedTransactionTypeSubFilter.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.hasError)) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pendingHistoryEvents;
        int iHashCode2 = (iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2 = this.historyEvents;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (pagedList2 == null ? 0 : pagedList2.hashCode())) * 31) + this.accounts.hashCode()) * 31) + this.presentTransactionFilters.hashCode()) * 31) + this.presentTransactionSubFilters.hashCode()) * 31) + Boolean.hashCode(this.isInEtfRegionGate)) * 31) + Boolean.hashCode(this.inCryptoRegionGate)) * 31) + Boolean.hashCode(this.inSpendingRegionGate)) * 31) + Boolean.hashCode(this.inFuturesRegionGate)) * 31) + Boolean.hashCode(this.inEcRegionGate)) * 31) + Boolean.hashCode(this.inAdvisoryRegionGate)) * 31;
        CountryCode.Supported supported = this.userLocality;
        return ((iHashCode3 + (supported != null ? supported.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRhcApp);
    }

    public String toString() {
        return "AccountsHistoryViewState(selectedAccountTypeFilter=" + this.selectedAccountTypeFilter + ", selectedTransactionTypeFilter=" + this.selectedTransactionTypeFilter + ", selectedTransactionTypeSubFilter=" + this.selectedTransactionTypeSubFilter + ", isLoading=" + this.isLoading + ", hasError=" + this.hasError + ", pendingHistoryEvents=" + this.pendingHistoryEvents + ", historyEvents=" + this.historyEvents + ", accounts=" + this.accounts + ", presentTransactionFilters=" + this.presentTransactionFilters + ", presentTransactionSubFilters=" + this.presentTransactionSubFilters + ", isInEtfRegionGate=" + this.isInEtfRegionGate + ", inCryptoRegionGate=" + this.inCryptoRegionGate + ", inSpendingRegionGate=" + this.inSpendingRegionGate + ", inFuturesRegionGate=" + this.inFuturesRegionGate + ", inEcRegionGate=" + this.inEcRegionGate + ", inAdvisoryRegionGate=" + this.inAdvisoryRegionGate + ", userLocality=" + this.userLocality + ", isRhcApp=" + this.isRhcApp + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountsHistoryViewState(AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo, AccountsHistoryTransactionTypeFilter selectedTransactionTypeFilter, AccountsHistoryTransactionTypeSubFilter selectedTransactionTypeSubFilter, boolean z, boolean z2, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList2, ImmutableList3<? extends AccountsHistoryStore.HistoryAccountFilterViewInfo> accounts2, ImmutableSet<? extends AccountsHistoryTransactionTypeFilter> presentTransactionFilters, ImmutableSet<? extends AccountsHistoryTransactionTypeSubFilter> presentTransactionSubFilters, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CountryCode.Supported supported, boolean z9) {
        Intrinsics.checkNotNullParameter(selectedTransactionTypeFilter, "selectedTransactionTypeFilter");
        Intrinsics.checkNotNullParameter(selectedTransactionTypeSubFilter, "selectedTransactionTypeSubFilter");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(presentTransactionFilters, "presentTransactionFilters");
        Intrinsics.checkNotNullParameter(presentTransactionSubFilters, "presentTransactionSubFilters");
        this.selectedAccountTypeFilter = historyAccountFilterViewInfo;
        this.selectedTransactionTypeFilter = selectedTransactionTypeFilter;
        this.selectedTransactionTypeSubFilter = selectedTransactionTypeSubFilter;
        this.isLoading = z;
        this.hasError = z2;
        this.pendingHistoryEvents = pagedList;
        this.historyEvents = pagedList2;
        this.accounts = accounts2;
        this.presentTransactionFilters = presentTransactionFilters;
        this.presentTransactionSubFilters = presentTransactionSubFilters;
        this.isInEtfRegionGate = z3;
        this.inCryptoRegionGate = z4;
        this.inSpendingRegionGate = z5;
        this.inFuturesRegionGate = z6;
        this.inEcRegionGate = z7;
        this.inAdvisoryRegionGate = z8;
        this.userLocality = supported;
        this.isRhcApp = z9;
        this.hasHistoryEvents = !(pagedList2 == null || pagedList2.isEmpty());
        this.hasPendingHistoryEvents = !(pagedList == null || pagedList.isEmpty());
    }

    public final AccountsHistoryStore.HistoryAccountFilterViewInfo getSelectedAccountTypeFilter() {
        return this.selectedAccountTypeFilter;
    }

    public final AccountsHistoryTransactionTypeFilter getSelectedTransactionTypeFilter() {
        return this.selectedTransactionTypeFilter;
    }

    public final AccountsHistoryTransactionTypeSubFilter getSelectedTransactionTypeSubFilter() {
        return this.selectedTransactionTypeSubFilter;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountsHistoryViewState(com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo r22, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter r23, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter r24, boolean r25, boolean r26, androidx.paging.PagedList r27, androidx.paging.PagedList r28, kotlinx.collections.immutable.ImmutableList3 r29, kotlinx.collections.immutable.ImmutableSet r30, kotlinx.collections.immutable.ImmutableSet r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, com.robinhood.iso.countrycode.CountryCode.Supported r38, boolean r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter r1 = com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter.ALL
            r5 = r1
            goto Lc
        La:
            r5 = r24
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L13
            r1 = 1
            r6 = r1
            goto L15
        L13:
            r6 = r25
        L15:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L1c
            r7 = r2
            goto L1e
        L1c:
            r7 = r26
        L1e:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L25
            r8 = r3
            goto L27
        L25:
            r8 = r27
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r9 = r3
            goto L2f
        L2d:
            r9 = r28
        L2f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L39
            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.extensions2.persistentListOf()
            r10 = r1
            goto L3b
        L39:
            r10 = r29
        L3b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L45
            kotlinx.collections.immutable.PersistentSet r1 = kotlinx.collections.immutable.extensions2.persistentSetOf()
            r11 = r1
            goto L47
        L45:
            r11 = r30
        L47:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L51
            kotlinx.collections.immutable.PersistentSet r1 = kotlinx.collections.immutable.extensions2.persistentSetOf()
            r12 = r1
            goto L53
        L51:
            r12 = r31
        L53:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L59
            r13 = r2
            goto L5b
        L59:
            r13 = r32
        L5b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L61
            r14 = r2
            goto L63
        L61:
            r14 = r33
        L63:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L69
            r15 = r2
            goto L6b
        L69:
            r15 = r34
        L6b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L72
            r16 = r2
            goto L74
        L72:
            r16 = r35
        L74:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            r17 = r2
            goto L7d
        L7b:
            r17 = r36
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L86
            r18 = r2
            goto L88
        L86:
            r18 = r37
        L88:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L98
            r19 = r3
            r2 = r21
            r4 = r23
            r20 = r39
            r3 = r22
            goto La2
        L98:
            r19 = r38
            r2 = r21
            r3 = r22
            r4 = r23
            r20 = r39
        La2:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.history.accounts.AccountsHistoryViewState.<init>(com.robinhood.librobinhood.data.store.AccountsHistoryStore$HistoryAccountFilterViewInfo, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter, boolean, boolean, androidx.paging.PagedList, androidx.paging.PagedList, kotlinx.collections.immutable.PersistentList, kotlinx.collections.immutable.ImmutableSet, kotlinx.collections.immutable.ImmutableSet, boolean, boolean, boolean, boolean, boolean, boolean, com.robinhood.iso.countrycode.CountryCode$Supported, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getPendingHistoryEvents() {
        return this.pendingHistoryEvents;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryEvents() {
        return this.historyEvents;
    }

    public final ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> getAccounts() {
        return this.accounts;
    }

    public final ImmutableSet<AccountsHistoryTransactionTypeFilter> getPresentTransactionFilters() {
        return this.presentTransactionFilters;
    }

    public final ImmutableSet<AccountsHistoryTransactionTypeSubFilter> getPresentTransactionSubFilters() {
        return this.presentTransactionSubFilters;
    }

    public final boolean isInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    public final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }

    public final boolean getInSpendingRegionGate() {
        return this.inSpendingRegionGate;
    }

    public final boolean getInFuturesRegionGate() {
        return this.inFuturesRegionGate;
    }

    public final boolean getInEcRegionGate() {
        return this.inEcRegionGate;
    }

    public final boolean getInAdvisoryRegionGate() {
        return this.inAdvisoryRegionGate;
    }

    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public final boolean isEmpty() {
        return (this.isLoading || this.hasHistoryEvents || this.hasPendingHistoryEvents) ? false : true;
    }

    public final AccountSwitcherData getAccountSwitcherData(Resources resources) {
        AccountSwitcherData.ActiveSelection accountRow;
        String accountIdentifier;
        Intrinsics.checkNotNullParameter(resources, "resources");
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        if (historyAccountFilterViewInfo != null && (accountIdentifier = historyAccountFilterViewInfo.getAccountIdentifier()) != null) {
            accountRow = new AccountSwitcherData.ActiveSelection.AccountRow(accountIdentifier);
        } else {
            accountRow = AccountSwitcherData.ActiveSelection.AllAccounts.INSTANCE;
        }
        AccountSwitcherData.ActiveSelection activeSelection = accountRow;
        ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> immutableList3 = this.accounts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
        Iterator<AccountsHistoryStore.HistoryAccountFilterViewInfo> it = immutableList3.iterator();
        while (it.hasNext()) {
            arrayList.add(AccountsHistoryStoreExtensions.toAccountSwitcherRow(it.next()));
        }
        return new AccountSwitcherData(arrayList, activeSelection, true, false, null, null, null, resources.getString(C11183R.string.history_accounts_account_type_title), 120, null);
    }

    public final HistoryFilterSelection.TransactionFilter getActiveTransactionTypeFilter() {
        return new HistoryFilterSelection.TransactionFilter(this.selectedTransactionTypeFilter, this.isInEtfRegionGate);
    }

    private final Set<AccountsHistoryTransactionTypeFilter> getTransactionTypeFiltersToHide() {
        boolean z = this.inAdvisoryRegionGate;
        return SetsKt.setOfNotNull((Object[]) new AccountsHistoryTransactionTypeFilter[]{z ? null : AccountsHistoryTransactionTypeFilter.ADVISOR_TRADES, z ? null : AccountsHistoryTransactionTypeFilter.ADVISORY_FEE});
    }

    private final Set<AccountsHistoryTransactionTypeFilter> getSupportedTransactionFiltersForAccountType() {
        EnumEntries<AccountsHistoryTransactionTypeFilter> entries = AccountsHistoryTransactionTypeFilter.getEntries();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter : entries) {
            Set<HistoryTransactionType> setSupportedHistoryTransactionTypes = accountsHistoryTransactionTypeFilter.supportedHistoryTransactionTypes();
            if (!(setSupportedHistoryTransactionTypes instanceof Collection) || !setSupportedHistoryTransactionTypes.isEmpty()) {
                Iterator<T> it = setSupportedHistoryTransactionTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AccountsHistoryAccountTypeFilter2.supportedAccountTypeFilters((HistoryTransactionType) it.next()).contains(AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(this.selectedAccountTypeFilter))) {
                        linkedHashSet.add(accountsHistoryTransactionTypeFilter);
                        break;
                    }
                }
            }
        }
        return linkedHashSet;
    }

    private final Set<AccountsHistoryTransactionTypeFilter> getTransactionTypeFilters() {
        return CollectionsKt.subtract(CollectionsKt.intersect(this.presentTransactionFilters, getSupportedTransactionFiltersForAccountType()), getTransactionTypeFiltersToHide());
    }

    public final List<HistoryFilterSelection.TransactionFilter> getSelectableTransactionTypeFilters() {
        List listSortedWith = CollectionsKt.sortedWith(getTransactionTypeFilters(), new Comparator() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryViewState$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AccountsHistoryTransactionTypeFilter) t).ordinal()), Integer.valueOf(((AccountsHistoryTransactionTypeFilter) t2).ordinal()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(new HistoryFilterSelection.TransactionFilter((AccountsHistoryTransactionTypeFilter) it.next(), this.isInEtfRegionGate));
        }
        return arrayList;
    }

    private final Set<AccountsHistoryTransactionTypeSubFilter> getTransactionTypeSubFilters() {
        return CollectionsKt.intersect(this.presentTransactionSubFilters, this.selectedTransactionTypeFilter.subFilters());
    }

    public final List<HistoryFilterSelection.TransactionSubFilter> getSelectableTransactionTypeSubFilters() {
        List listSortedWith = CollectionsKt.sortedWith(getTransactionTypeSubFilters(), new Comparator() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryViewState$special$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AccountsHistoryTransactionTypeSubFilter) t).ordinal()), Integer.valueOf(((AccountsHistoryTransactionTypeSubFilter) t2).ordinal()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(new HistoryFilterSelection.TransactionSubFilter((AccountsHistoryTransactionTypeSubFilter) it.next()));
        }
        return arrayList;
    }

    public final HistoryFilterSelection.TransactionSubFilter getActiveTransactionTypeSubFilter() {
        return new HistoryFilterSelection.TransactionSubFilter(this.selectedTransactionTypeSubFilter);
    }

    public final int getSubFiltersSheetTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.selectedTransactionTypeFilter.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C38979R.string.options_subfilters;
            }
            return C11183R.string.history_accounts_transaction_subtype_title;
        }
        if (this.isInEtfRegionGate) {
            return C38979R.string.equities_subfilters;
        }
        return C38979R.string.stocks_subfilters;
    }

    public final UUID getSelectedMinervaAccountId() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        if (!(historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy)) {
            if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
                return ((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) historyAccountFilterViewInfo).getMinervaId();
            }
            return null;
        }
        AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy rhyAccount = getRhyAccount();
        if (rhyAccount != null) {
            return rhyAccount.getMinervaId();
        }
        return null;
    }

    public final UUID getSelectedRhyAccountId() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy rhyAccount;
        if (!(this.selectedAccountTypeFilter instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) || (rhyAccount = getRhyAccount()) == null) {
            return null;
        }
        return rhyAccount.getSpendingId();
    }

    private final RhdSubAccountIds getActiveRhdSubAccountIds() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
            return ((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) historyAccountFilterViewInfo).getRhdSubAccountIds();
        }
        if (!(historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) && !(historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) && historyAccountFilterViewInfo != null) {
            throw new NoWhenBranchMatchedException();
        }
        AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount originalIndividualAccount = getOriginalIndividualAccount();
        if (originalIndividualAccount != null) {
            return originalIndividualAccount.getRhdSubAccountIds();
        }
        return null;
    }

    public final UUID getSelectedFuturesSubAccountId() {
        RhdSubAccountIds activeRhdSubAccountIds = getActiveRhdSubAccountIds();
        if (activeRhdSubAccountIds != null) {
            return activeRhdSubAccountIds.getFuturesSubAccountId();
        }
        return null;
    }

    public final UUID getSelectedSwapsSubAccountId() {
        RhdSubAccountIds activeRhdSubAccountIds = getActiveRhdSubAccountIds();
        if (activeRhdSubAccountIds != null) {
            return activeRhdSubAccountIds.getEventContractSwapsAccountId();
        }
        return null;
    }

    public final HistoryStaticFilter.RhsAccountContext getRhsAccountContext() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
            return new HistoryStaticFilter.RhsAccountContext(((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) this.selectedAccountTypeFilter).getAccountNumber(), ((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) this.selectedAccountTypeFilter).getBrokerageAccountType());
        }
        if ((historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) || (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) || historyAccountFilterViewInfo == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final HistoryStaticFilter.NummusAccountContext getNummusAccountContext() {
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo = this.selectedAccountTypeFilter;
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
            return new HistoryStaticFilter.NummusAccountContext(((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) this.selectedAccountTypeFilter).getCryptoId(), ((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) this.selectedAccountTypeFilter).getBrokerageAccountType());
        }
        if ((historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) || (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) || historyAccountFilterViewInfo == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowAccountTypeChip() {
        return !this.isRhcApp && this.accounts.size() > 1;
    }

    public final boolean getShowTransactionTypeChip() {
        return SetsKt.minus(getTransactionTypeFilters(), AccountsHistoryTransactionTypeFilter.ALL).size() > 1;
    }

    public final boolean getShowSubTransactionTypeChip() {
        return SetsKt.minus(getTransactionTypeSubFilters(), AccountsHistoryTransactionTypeSubFilter.ALL).size() > 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<HistoryDisclosure> getDisclosures() {
        HistoryDisclosure historyDisclosure;
        CountryCode.Supported supported = this.userLocality;
        CountryCode.Supported.UnitedKingdom unitedKingdom = CountryCode.Supported.UnitedKingdom.INSTANCE;
        HistoryDisclosure historyDisclosure2 = Intrinsics.areEqual(supported, unitedKingdom) ? HistoryDisclosure.BASE_UK : HistoryDisclosure.BASE;
        HistoryDisclosure historyDisclosure3 = HistoryDisclosure.ADVISORY;
        if (!getHasAnyManagedAccounts()) {
            historyDisclosure3 = null;
        }
        HistoryDisclosure historyDisclosure4 = HistoryDisclosure.CRYPTO;
        if (!this.inCryptoRegionGate) {
            historyDisclosure4 = null;
        }
        CountryCode.Supported supported2 = this.userLocality;
        if (Intrinsics.areEqual(supported2, CountryCode.Supported.UnitedStates.INSTANCE)) {
            boolean z = this.inFuturesRegionGate;
            if (z && this.inEcRegionGate) {
                historyDisclosure = HistoryDisclosure.FUTURES_AND_EVENT_CONTRACTS;
            } else if (z) {
                historyDisclosure = HistoryDisclosure.FUTURES;
            } else {
                historyDisclosure = this.inEcRegionGate ? HistoryDisclosure.EVENT_CONTRACTS : null;
            }
        } else if (Intrinsics.areEqual(supported2, unitedKingdom) && this.inFuturesRegionGate) {
            historyDisclosure = HistoryDisclosure.FUTURES_UK;
        }
        return CollectionsKt.listOfNotNull((Object[]) new HistoryDisclosure[]{historyDisclosure2, historyDisclosure3, historyDisclosure4, historyDisclosure, this.inSpendingRegionGate ? HistoryDisclosure.SPENDING : null});
    }

    public final boolean getShowInfoMenu() {
        return (getRhyAccount() == null && !getHasAnyRhdSubAccounts() && getCryptoAccount() == null) ? false : true;
    }

    private final List<AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount> getBrokerageAccounts() {
        ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> immutableList3 = this.accounts;
        ArrayList arrayList = new ArrayList();
        for (AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo : immutableList3) {
            if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
                arrayList.add(historyAccountFilterViewInfo);
            }
        }
        return arrayList;
    }

    private final AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount getOriginalIndividualAccount() {
        Object next;
        Iterator<T> it = getBrokerageAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) next).isOriginalAccount()) {
                break;
            }
        }
        return (AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) next;
    }

    private final boolean getHasAnyRhdSubAccounts() {
        List<AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount> brokerageAccounts = getBrokerageAccounts();
        if ((brokerageAccounts instanceof Collection) && brokerageAccounts.isEmpty()) {
            return false;
        }
        Iterator<T> it = brokerageAccounts.iterator();
        while (it.hasNext()) {
            if (((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) it.next()).getRhdSubAccountIds() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean getHasAnyManagedAccounts() {
        List<AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount> brokerageAccounts = getBrokerageAccounts();
        if ((brokerageAccounts instanceof Collection) && brokerageAccounts.isEmpty()) {
            return false;
        }
        Iterator<T> it = brokerageAccounts.iterator();
        while (it.hasNext()) {
            if (((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) it.next()).getManagementType() == ManagementType.MANAGED) {
                return true;
            }
        }
        return false;
    }

    private final /* synthetic */ <T extends AccountsHistoryStore.HistoryAccountFilterViewInfo> T getAccount() {
        ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> immutableList3 = this.accounts;
        ArrayList arrayList = new ArrayList();
        for (AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo : immutableList3) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (historyAccountFilterViewInfo != null) {
                arrayList.add(historyAccountFilterViewInfo);
            }
        }
        return (T) CollectionsKt.firstOrNull((List) arrayList);
    }

    private final AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto getCryptoAccount() {
        ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> immutableList3 = this.accounts;
        ArrayList arrayList = new ArrayList();
        for (AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo : immutableList3) {
            if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) {
                arrayList.add(historyAccountFilterViewInfo);
            }
        }
        return (AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) ((AccountsHistoryStore.HistoryAccountFilterViewInfo) CollectionsKt.firstOrNull((List) arrayList));
    }

    private final AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy getRhyAccount() {
        ImmutableList3<AccountsHistoryStore.HistoryAccountFilterViewInfo> immutableList3 = this.accounts;
        ArrayList arrayList = new ArrayList();
        for (AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo : immutableList3) {
            if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) {
                arrayList.add(historyAccountFilterViewInfo);
            }
        }
        return (AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) ((AccountsHistoryStore.HistoryAccountFilterViewInfo) CollectionsKt.firstOrNull((List) arrayList));
    }
}
