package com.robinhood.android.advisory.dashboard.deposit.promo;

import com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.advisory.p304db.promo.DepositPromoCard;
import com.robinhood.models.advisory.p304db.promo.DepositPromoConfig;
import com.robinhood.models.p320db.Account;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositPromoCardDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardDataState;", "", "config", "Lcom/robinhood/models/advisory/db/promo/DepositPromoConfig;", "card", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "dismissedPromos", "", "", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/advisory/db/promo/DepositPromoConfig;Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;Ljava/util/Set;Lcom/robinhood/models/db/Account;)V", "getConfig", "()Lcom/robinhood/models/advisory/db/promo/DepositPromoConfig;", "getCard", "()Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard;", "getDismissedPromos", "()Ljava/util/Set;", "getAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DepositPromoCardDataState {
    private final Account account;
    private final StrategiesDashboardCard card;
    private final DepositPromoConfig config;
    private final Set<String> dismissedPromos;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DepositPromoCardDataState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositPromoCardDataState copy$default(DepositPromoCardDataState depositPromoCardDataState, DepositPromoConfig depositPromoConfig, StrategiesDashboardCard strategiesDashboardCard, Set set, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            depositPromoConfig = depositPromoCardDataState.config;
        }
        if ((i & 2) != 0) {
            strategiesDashboardCard = depositPromoCardDataState.card;
        }
        if ((i & 4) != 0) {
            set = depositPromoCardDataState.dismissedPromos;
        }
        if ((i & 8) != 0) {
            account = depositPromoCardDataState.account;
        }
        return depositPromoCardDataState.copy(depositPromoConfig, strategiesDashboardCard, set, account);
    }

    /* renamed from: component1, reason: from getter */
    public final DepositPromoConfig getConfig() {
        return this.config;
    }

    /* renamed from: component2, reason: from getter */
    public final StrategiesDashboardCard getCard() {
        return this.card;
    }

    public final Set<String> component3() {
        return this.dismissedPromos;
    }

    /* renamed from: component4, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final DepositPromoCardDataState copy(DepositPromoConfig config, StrategiesDashboardCard card, Set<String> dismissedPromos, Account account) {
        Intrinsics.checkNotNullParameter(dismissedPromos, "dismissedPromos");
        return new DepositPromoCardDataState(config, card, dismissedPromos, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositPromoCardDataState)) {
            return false;
        }
        DepositPromoCardDataState depositPromoCardDataState = (DepositPromoCardDataState) other;
        return Intrinsics.areEqual(this.config, depositPromoCardDataState.config) && Intrinsics.areEqual(this.card, depositPromoCardDataState.card) && Intrinsics.areEqual(this.dismissedPromos, depositPromoCardDataState.dismissedPromos) && Intrinsics.areEqual(this.account, depositPromoCardDataState.account);
    }

    public int hashCode() {
        DepositPromoConfig depositPromoConfig = this.config;
        int iHashCode = (depositPromoConfig == null ? 0 : depositPromoConfig.hashCode()) * 31;
        StrategiesDashboardCard strategiesDashboardCard = this.card;
        int iHashCode2 = (((iHashCode + (strategiesDashboardCard == null ? 0 : strategiesDashboardCard.hashCode())) * 31) + this.dismissedPromos.hashCode()) * 31;
        Account account = this.account;
        return iHashCode2 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "DepositPromoCardDataState(config=" + this.config + ", card=" + this.card + ", dismissedPromos=" + this.dismissedPromos + ", account=" + this.account + ")";
    }

    public DepositPromoCardDataState(DepositPromoConfig depositPromoConfig, StrategiesDashboardCard strategiesDashboardCard, Set<String> dismissedPromos, Account account) {
        Intrinsics.checkNotNullParameter(dismissedPromos, "dismissedPromos");
        this.config = depositPromoConfig;
        this.card = strategiesDashboardCard;
        this.dismissedPromos = dismissedPromos;
        this.account = account;
    }

    public final DepositPromoConfig getConfig() {
        return this.config;
    }

    public final StrategiesDashboardCard getCard() {
        return this.card;
    }

    public /* synthetic */ DepositPromoCardDataState(DepositPromoConfig depositPromoConfig, StrategiesDashboardCard strategiesDashboardCard, Set set, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : depositPromoConfig, (i & 2) != 0 ? null : strategiesDashboardCard, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : account);
    }

    public final Set<String> getDismissedPromos() {
        return this.dismissedPromos;
    }

    public final Account getAccount() {
        return this.account;
    }

    /* compiled from: DepositPromoCardDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardDataState;", "Lcom/robinhood/android/advisory/dashboard/deposit/promo/DepositPromoCardViewState;", "<init>", "()V", "reduce", "dataState", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<DepositPromoCardDataState, DepositPromoCardViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public DepositPromoCardViewState reduce(DepositPromoCardDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getAccount() != null) {
                DepositPromoConfig config = dataState.getConfig();
                DepositPromoCard card = config != null ? config.getCard() : null;
                if (dataState.getCard() == null) {
                    if (card != null) {
                        return new DepositPromoCardViewState.Loaded(new StrategiesDashboardCard(new StrategiesDashboardCard.Image(card.getImageUrlLight(), card.getImageUrlDark()), card.getTitle(), new StrategiesDashboardCard.Cta(card.getCtaTitle(), null, card.getCtaColor()), null, StrategiesDashboardCard.Alignment.BELOW_DEPOSIT), false, dataState.getAccount().getBrokerageAccountType().isRetirement());
                    }
                    return DepositPromoCardViewState.Empty.INSTANCE;
                }
                StrategiesDashboardCard card2 = dataState.getCard();
                boolean zIsRetirement = dataState.getAccount().getBrokerageAccountType().isRetirement();
                StrategiesDashboardCard.DismissSettings dismissSettings = dataState.getCard().getDismissSettings();
                return new DepositPromoCardViewState.Loaded(card2, (dismissSettings != null ? dismissSettings.getDismissId() : null) != null, zIsRetirement);
            }
            return DepositPromoCardViewState.Empty.INSTANCE;
        }
    }
}
