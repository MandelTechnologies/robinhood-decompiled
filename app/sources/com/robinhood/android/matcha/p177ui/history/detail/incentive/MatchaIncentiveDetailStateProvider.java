package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import com.robinhood.android.matcha.p177ui.history.detail.incentive.MatchaIncentiveDetailViewState;
import com.robinhood.android.models.matcha.api.MatchaIncentiveType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.matcha.MatchaIncentive;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaIncentiveDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000e*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u0014*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "<init>", "()V", "reduce", "dataState", "showReferralCount", "", "Lcom/robinhood/models/db/matcha/MatchaIncentive;", "getShowReferralCount", "(Lcom/robinhood/models/db/matcha/MatchaIncentive;)Z", "referralTotalPossible", "", "getReferralTotalPossible", "(Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;)I", "referralNumber", "getReferralNumber", "referralName", "", "getReferralName", "(Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;)Ljava/lang/String;", "dateText", "getDateText", "(Lcom/robinhood/models/db/matcha/MatchaIncentive;)Ljava/lang/String;", "amountText", "getAmountText", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaIncentiveDetailStateProvider implements StateProvider<MatchaIncentiveDetailDataState, MatchaIncentiveDetailViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public MatchaIncentiveDetailViewState reduce(MatchaIncentiveDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MatchaIncentive incentive = dataState.getIncentive();
        MatchaTransfer transfer = dataState.getTransfer();
        if (incentive != null && transfer != null) {
            MatchaIncentiveType type2 = incentive.getType();
            String amountText = getAmountText(incentive);
            return new MatchaIncentiveDetailViewState.Loaded(type2, getReferralName(dataState), getDateText(incentive), amountText, getReferralNumber(dataState), getReferralTotalPossible(dataState), (dataState.isMatchaIncentivesExperimentMember() && getShowReferralCount(incentive)) ? 1 : 0);
        }
        return new MatchaIncentiveDetailViewState.Loading(null, i, 0 == true ? 1 : 0);
    }

    private final boolean getShowReferralCount(MatchaIncentive matchaIncentive) {
        return matchaIncentive.getType() == MatchaIncentiveType.INVITED_USER;
    }

    private final int getReferralTotalPossible(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState) {
        MatchaIncentivesSummary incentivesSummary = matchaIncentiveDetailDataState.getIncentivesSummary();
        int invitedUserIncentiveReferralsMaxAmount = incentivesSummary != null ? incentivesSummary.getInvitedUserIncentiveReferralsMaxAmount() : 5;
        List<MatchaIncentive> incentives = matchaIncentiveDetailDataState.getIncentives();
        int i = 0;
        if (!(incentives instanceof Collection) || !incentives.isEmpty()) {
            Iterator<T> it = incentives.iterator();
            while (it.hasNext()) {
                if (((MatchaIncentive) it.next()).getType() == MatchaIncentiveType.INVITED_USER && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return Math.max(invitedUserIncentiveReferralsMaxAmount, i);
    }

    private final int getReferralNumber(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState) {
        List<MatchaIncentive> incentives = matchaIncentiveDetailDataState.getIncentives();
        ArrayList arrayList = new ArrayList();
        for (Object obj : incentives) {
            if (((MatchaIncentive) obj).getType() == MatchaIncentiveType.INVITED_USER) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.indexOf((List<? extends MatchaIncentive>) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailStateProvider$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((MatchaIncentive) t).getCreatedAt(), ((MatchaIncentive) t2).getCreatedAt());
            }
        }), matchaIncentiveDetailDataState.getIncentive()) + 1;
    }

    private final String getReferralName(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState) {
        MatchaUser transactor;
        MatchaTransfer transfer = matchaIncentiveDetailDataState.getTransfer();
        if (transfer == null || (transactor = transfer.getTransactor()) == null) {
            return null;
        }
        return transactor.getDisplayName();
    }

    private final String getDateText(MatchaIncentive matchaIncentive) {
        return LocalDateFormatter.LONG.format((LocalDateFormatter) Instants.toLocalDate$default(matchaIncentive.getCreatedAt(), null, 1, null));
    }

    private final String getAmountText(MatchaIncentive matchaIncentive) {
        return "+" + Money.format$default(Money3.toMoney(matchaIncentive.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }
}
