package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferInstantDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;", "", "<init>", "()V", "Exit", "Loaded", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState$Exit;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState$Loaded;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AchTransferInstantDepositViewState {
    public static final int $stable = 0;

    public /* synthetic */ AchTransferInstantDepositViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AchTransferInstantDepositViewState() {
    }

    /* compiled from: AchTransferInstantDepositViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState$Exit;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit extends AchTransferInstantDepositViewState {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super(null);
        }
    }

    /* compiled from: AchTransferInstantDepositViewState.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b#J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010%\u001a\u00020\u0006HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;", "account", "Lcom/robinhood/models/db/Account;", "lastAccount", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "instantDepositInfo", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Account;Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/serverdriven/db/RichText;)V", "getAccount$feature_legacy_ach_transfers_externalDebug", "()Lcom/robinhood/models/db/Account;", "getInstantDepositInfo", "()Lcom/robinhood/models/serverdriven/db/RichText;", "showGoldHook", "", "getShowGoldHook", "()Z", ErrorResponse.DETAIL, "Lcom/robinhood/android/transfers/ach/ui/posttransfer/Detail;", "getDetail", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/Detail;", "showGoldHookButton", "getShowGoldHookButton", "restrictions", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/Restrictions;", "getRestrictions", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/Restrictions;", "closeAfterGoldSubscriptionEvent", "Lcom/robinhood/udf/UiEvent;", "", "getCloseAfterGoldSubscriptionEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component1$feature_legacy_ach_transfers_externalDebug", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends AchTransferInstantDepositViewState {
        public static final int $stable = 8;
        private final Account account;
        private final AchTransfer achTransfer;
        private final UiEvent<Unit> closeAfterGoldSubscriptionEvent;
        private final Detail detail;
        private final RichText instantDepositInfo;
        private final Account lastAccount;
        private final Restrictions restrictions;
        private final boolean showGoldHook;
        private final boolean showGoldHookButton;

        /* renamed from: component2, reason: from getter */
        private final Account getLastAccount() {
            return this.lastAccount;
        }

        /* renamed from: component3, reason: from getter */
        private final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Account account, Account account2, AchTransfer achTransfer, RichText richText, int i, Object obj) {
            if ((i & 1) != 0) {
                account = loaded.account;
            }
            if ((i & 2) != 0) {
                account2 = loaded.lastAccount;
            }
            if ((i & 4) != 0) {
                achTransfer = loaded.achTransfer;
            }
            if ((i & 8) != 0) {
                richText = loaded.instantDepositInfo;
            }
            return loaded.copy(account, account2, achTransfer, richText);
        }

        /* renamed from: component1$feature_legacy_ach_transfers_externalDebug, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component4, reason: from getter */
        public final RichText getInstantDepositInfo() {
            return this.instantDepositInfo;
        }

        public final Loaded copy(Account account, Account lastAccount, AchTransfer achTransfer, RichText instantDepositInfo) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            return new Loaded(account, lastAccount, achTransfer, instantDepositInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.account, loaded.account) && Intrinsics.areEqual(this.lastAccount, loaded.lastAccount) && Intrinsics.areEqual(this.achTransfer, loaded.achTransfer) && Intrinsics.areEqual(this.instantDepositInfo, loaded.instantDepositInfo);
        }

        public int hashCode() {
            Account account = this.account;
            int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
            Account account2 = this.lastAccount;
            int iHashCode2 = (((iHashCode + (account2 == null ? 0 : account2.hashCode())) * 31) + this.achTransfer.hashCode()) * 31;
            RichText richText = this.instantDepositInfo;
            return iHashCode2 + (richText != null ? richText.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(account=" + this.account + ", lastAccount=" + this.lastAccount + ", achTransfer=" + this.achTransfer + ", instantDepositInfo=" + this.instantDepositInfo + ")";
        }

        public /* synthetic */ Loaded(Account account, Account account2, AchTransfer achTransfer, RichText richText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : account2, achTransfer, (i & 8) != 0 ? null : richText);
        }

        public final Account getAccount$feature_legacy_ach_transfers_externalDebug() {
            return this.account;
        }

        public final RichText getInstantDepositInfo() {
            return this.instantDepositInfo;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        public Loaded(Account account, Account account2, AchTransfer achTransfer, RichText richText) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            UiEvent<Unit> uiEvent = 0;
            uiEvent = 0;
            uiEvent = 0;
            uiEvent = 0;
            super(uiEvent);
            this.account = account;
            this.lastAccount = account2;
            this.achTransfer = achTransfer;
            this.instantDepositInfo = richText;
            boolean z = false;
            if (account != null) {
                boolean z2 = account.getBalances().getUnclearedDeposits().compareTo(account.getMaxAchEarlyAccessAmount()) > 0;
                if (account.isInstant() && z2 && !account.isGold()) {
                    z = true;
                }
            }
            this.showGoldHook = z;
            this.detail = new Detail(C30082R.string.ach_transfer_instant_deposit_cleanup, CollectionsKt.listOf(Money.format$default(achTransfer.getEarlyAccessAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null)), null, 4, null);
            this.showGoldHookButton = z;
            this.restrictions = new Restrictions(C30082R.string.ach_transfer_instant_deposit_restrictions, C30082R.string.ach_transfer_instant_deposit_restrictions_learn_more);
            if (account2 != null && !account2.isGold() && account != null && account.isGold()) {
                uiEvent = new UiEvent(Unit.INSTANCE);
            }
            this.closeAfterGoldSubscriptionEvent = uiEvent;
        }

        public final boolean getShowGoldHook() {
            return this.showGoldHook;
        }

        public final Detail getDetail() {
            return this.detail;
        }

        public final boolean getShowGoldHookButton() {
            return this.showGoldHookButton;
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final UiEvent<Unit> getCloseAfterGoldSubscriptionEvent() {
            return this.closeAfterGoldSubscriptionEvent;
        }
    }
}
