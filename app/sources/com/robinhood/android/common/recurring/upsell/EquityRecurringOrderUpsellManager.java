package com.robinhood.android.common.recurring.upsell;

import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellTimestampsPref2;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellViewCountPref2;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityRecurringOrderUpsellManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "equityRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "equityRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/LongSetPreference;Lcom/robinhood/prefs/IntPreference;)V", "getInvestmentScheduleStore", "()Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getEquityRecurringOrderUpsellTimestampsPref", "()Lcom/robinhood/prefs/LongSetPreference;", "getEquityRecurringOrderUpsellViewCountPref", "()Lcom/robinhood/prefs/IntPreference;", "getEquityRecurringUpsell", "Lio/reactivex/Single;", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class EquityRecurringOrderUpsellManager extends RecurringOrderUpsellManager {
    private static final int EQUITY_RECURRING_ORDER_UPSELL_MAX_IMPRESSIONS = 25;
    private final LongSetPreference equityRecurringOrderUpsellTimestampsPref;
    private final IntPreference equityRecurringOrderUpsellViewCountPref;
    private final ExperimentsStore experimentsStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    public static final int $stable = 8;

    public final TraderInvestmentScheduleStore getInvestmentScheduleStore() {
        return this.investmentScheduleStore;
    }

    public final ExperimentsStore getExperimentsStore() {
        return this.experimentsStore;
    }

    public final LongSetPreference getEquityRecurringOrderUpsellTimestampsPref() {
        return this.equityRecurringOrderUpsellTimestampsPref;
    }

    public final IntPreference getEquityRecurringOrderUpsellViewCountPref() {
        return this.equityRecurringOrderUpsellViewCountPref;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityRecurringOrderUpsellManager(TraderInvestmentScheduleStore investmentScheduleStore, ExperimentsStore experimentsStore, @RecurringOrderUpsellTimestampsPref2 LongSetPreference equityRecurringOrderUpsellTimestampsPref, @RecurringOrderUpsellViewCountPref2 IntPreference equityRecurringOrderUpsellViewCountPref) {
        super(equityRecurringOrderUpsellTimestampsPref, equityRecurringOrderUpsellViewCountPref, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellTimestampsPref, "equityRecurringOrderUpsellTimestampsPref");
        Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellViewCountPref, "equityRecurringOrderUpsellViewCountPref");
        this.investmentScheduleStore = investmentScheduleStore;
        this.experimentsStore = experimentsStore;
        this.equityRecurringOrderUpsellTimestampsPref = equityRecurringOrderUpsellTimestampsPref;
        this.equityRecurringOrderUpsellViewCountPref = equityRecurringOrderUpsellViewCountPref;
    }

    public final Single<RecurringOrderUpsellManager.RecurringUpsell> getEquityRecurringUpsell(final Order order) {
        if (order == null) {
            Single<RecurringOrderUpsellManager.RecurringUpsell> singleJust = Single.just(RecurringOrderUpsellManager.RecurringUpsell.NONE);
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        Single map = this.investmentScheduleStore.getStreamInvestmentSchedulesByInstrumentId().asObservable(order.getInstrument()).firstOrError().map(new Function() { // from class: com.robinhood.android.common.recurring.upsell.EquityRecurringOrderUpsellManager.getEquityRecurringUpsell.1
            @Override // io.reactivex.functions.Function
            public final RecurringOrderUpsellManager.RecurringUpsell apply(List<InvestmentSchedule> investmentSchedules) {
                Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
                if (order.getSide() != EquityOrderSide.BUY || !investmentSchedules.isEmpty()) {
                    return RecurringOrderUpsellManager.RecurringUpsell.NONE;
                }
                if (this.getUpsellViewCount$feature_lib_recurring_externalDebug() >= 25 || this.getHasSeenWithinWindow$feature_lib_recurring_externalDebug()) {
                    return RecurringOrderUpsellManager.RecurringUpsell.PASSIVE;
                }
                return RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
