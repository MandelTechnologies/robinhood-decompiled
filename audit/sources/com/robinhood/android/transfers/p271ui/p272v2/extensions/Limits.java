package com.robinhood.android.transfers.p271ui.p272v2.extensions;

import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.lib.limits.GetLimitTriggered;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Limits.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0004\u0018\u00010\u0001* \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b* \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¨\u0006\u0012"}, m3636d2 = {"getLimitHubResponseForTransfer", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "Lcom/robinhood/models/db/TransferDirection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsKey;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "productType", "getAllTransferLimitsForTransferAccount", "", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getNewSelectedAccountId", "", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "accountId", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.extensions.LimitsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Limits {

    /* compiled from: Limits.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.extensions.LimitsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApiLimitsHubResponse getLimitHubResponseForTransfer(Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> map, TransferDirectionV2 direction, TransferProductType transferProductType) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        TransferDirection transferDirection = null;
        if (transferProductType == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            transferDirection = TransferDirection.DEPOSIT;
        } else if (i == 2) {
            transferDirection = TransferDirection.WITHDRAW;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return map.get(Tuples4.m3642to(transferProductType, transferDirection));
    }

    public static final List<ApiLimitsHubResponse> getAllTransferLimitsForTransferAccount(Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> map, TransferDirectionV2 direction, TransferAccount transferAccount) {
        TransferProductType transferProductType;
        List<ApiLimitsHubResponse> listListOf;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
        if (!transferAccount.isExternal()) {
            return CollectionsKt.emptyList();
        }
        if (transferAccount.getType() != ApiTransferAccount.TransferAccountType.ACH) {
            if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                transferProductType = TransferProductType.DEBIT_CARD_FUNDING;
            } else {
                transferProductType = TransferProductType.UNKNOWN;
            }
            ApiLimitsHubResponse limitHubResponseForTransfer = getLimitHubResponseForTransfer(map, direction, transferProductType);
            return (limitHubResponseForTransfer == null || (listListOf = CollectionsKt.listOf(limitHubResponseForTransfer)) == null) ? CollectionsKt.emptyList() : listListOf;
        }
        List listMutableListOf = CollectionsKt.mutableListOf(TransferProductType.ORIGINATED_ACH);
        if ((TransferAccounts2.isRfpEligible(transferAccount) && direction == TransferDirectionV2.DEPOSIT) || (TransferAccounts2.isRtpEligible(transferAccount) && direction == TransferDirectionV2.WITHDRAW)) {
            listMutableListOf.add(TransferProductType.INSTANT_BANK_TRANSFER);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listMutableListOf.iterator();
        while (it.hasNext()) {
            ApiLimitsHubResponse limitHubResponseForTransfer2 = getLimitHubResponseForTransfer(map, direction, (TransferProductType) it.next());
            if (limitHubResponseForTransfer2 != null) {
                arrayList.add(limitHubResponseForTransfer2);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.transfers.ui.v2.extensions.LimitsKt$getAllTransferLimitsForTransferAccount$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                BigDecimal total_amount;
                T next;
                T next2;
                List<ApiAmountLimit> amount_limits = ((ApiLimitsHubResponse) t2).getAmount_limits();
                BigDecimal total_amount2 = null;
                if (amount_limits != null) {
                    Iterator<T> it2 = amount_limits.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it2.next();
                        if (((ApiAmountLimit) next2).getLimits_interval() == LimitsInterval.DAILY) {
                            break;
                        }
                    }
                    ApiAmountLimit apiAmountLimit = next2;
                    total_amount = apiAmountLimit != null ? apiAmountLimit.getTotal_amount() : null;
                }
                List<ApiAmountLimit> amount_limits2 = ((ApiLimitsHubResponse) t).getAmount_limits();
                if (amount_limits2 != null) {
                    Iterator<T> it3 = amount_limits2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it3.next();
                        if (((ApiAmountLimit) next).getLimits_interval() == LimitsInterval.DAILY) {
                            break;
                        }
                    }
                    ApiAmountLimit apiAmountLimit2 = next;
                    if (apiAmountLimit2 != null) {
                        total_amount2 = apiAmountLimit2.getTotal_amount();
                    }
                }
                return ComparisonsKt.compareValues(total_amount, total_amount2);
            }
        });
    }

    public static final String getNewSelectedAccountId(CreateTransferV2DataState createTransferV2DataState, String accountId) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        TransferAccount transferAccount = createTransferV2DataState.getTransferAccounts().get(accountId);
        if (transferAccount == null) {
            return null;
        }
        if (transferAccount.isExternal()) {
            List<ApiLimitsHubResponse> allTransferLimitsForTransferAccount = getAllTransferLimitsForTransferAccount(createTransferV2DataState.getTransferLimits(), createTransferV2DataState.getDirection(), transferAccount);
            if (!allTransferLimitsForTransferAccount.isEmpty()) {
                List<ApiLimitsHubResponse> list = allTransferLimitsForTransferAccount;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (GetLimitTriggered.getLimitTriggered(createTransferV2DataState.getAmount(), (ApiLimitsHubResponse) it.next()) == null) {
                            return accountId;
                        }
                    }
                }
                return null;
            }
        }
        return accountId;
    }
}
