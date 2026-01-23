package com.robinhood.android.matcha.p177ui.incentives;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesLearnMoreViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentivesLearnMoreStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDataState;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "<init>", "()V", "reduce", "dataState", "title", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "getTitle", "(Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;)Lcom/robinhood/utils/resource/StringResource;", "bullets", "", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded$Bullet;", "getBullets", "(Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;)Ljava/util/List;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaIncentivesLearnMoreStateProvider implements StateProvider<MatchaIncentivesLearnMoreDataState, MatchaIncentivesLearnMoreViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public MatchaIncentivesLearnMoreViewState reduce(MatchaIncentivesLearnMoreDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MatchaIncentivesSummary incentivesSummary = dataState.getIncentivesSummary();
        if (incentivesSummary == null) {
            return new MatchaIncentivesLearnMoreViewState.Loading(null, 1, 0 == true ? 1 : 0);
        }
        return new MatchaIncentivesLearnMoreViewState.Loaded(getTitle(incentivesSummary), getBullets(incentivesSummary), dataState.getFooterContext());
    }

    private final StringResource getTitle(MatchaIncentivesSummary matchaIncentivesSummary) {
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_incentives_learn_more_title, Money.format$default(Money3.toMoney(matchaIncentivesSummary.getInvitedUserIncentiveMaxAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
    }

    private final List<MatchaIncentivesLearnMoreViewState.Loaded.Bullet> getBullets(MatchaIncentivesSummary matchaIncentivesSummary) {
        BigDecimal invitedUserIncentiveAmount = matchaIncentivesSummary.getInvitedUserIncentiveAmount();
        Currency currency = Currencies.USD;
        String str = Money.format$default(Money3.toMoney(invitedUserIncentiveAmount, currency), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        return CollectionsKt.listOf((Object[]) new MatchaIncentivesLearnMoreViewState.Loaded.Bullet[]{new MatchaIncentivesLearnMoreViewState.Loaded.Bullet(companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_1_title, new Object[0]), companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_1_description, new Object[0])), new MatchaIncentivesLearnMoreViewState.Loaded.Bullet(companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_2_title, str), companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_2_description, new Object[0])), new MatchaIncentivesLearnMoreViewState.Loaded.Bullet(companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_3_title, Money.format$default(Money3.toMoney(matchaIncentivesSummary.getInvitedUserIncentiveMaxAmount(), currency), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null)), companion.invoke(C21284R.string.matcha_incentives_learn_more_bullet_3_description, str, Integer.valueOf(matchaIncentivesSummary.getInvitedUserIncentiveReferralsMaxAmount())))});
    }
}
