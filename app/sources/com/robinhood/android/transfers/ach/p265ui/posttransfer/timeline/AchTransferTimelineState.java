package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.content.res.Resources;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: AchTransferTimelineState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "TransferTimelineData", "TimelineRowAdapterItem", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Error;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Loading;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AchTransferTimelineState {
    public static final int $stable = 0;

    public /* synthetic */ AchTransferTimelineState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AchTransferTimelineState() {
    }

    /* compiled from: AchTransferTimelineState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Loading;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends AchTransferTimelineState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: AchTransferTimelineState.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 J0\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\"H\u0002J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\u0007HÂ\u0003J\t\u0010(\u001a\u00020\tHÂ\u0003J\t\u0010)\u001a\u00020\u000bHÂ\u0003J\t\u0010*\u001a\u00020\rHÂ\u0003JE\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0013HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "account", "Lcom/robinhood/models/db/Account;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "hideInterestEarned", "", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Z)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "titleTextRes", "", "getTitleTextRes", "()I", "timelineRows", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows;", "getTimelineRows$annotations", "()V", "getTimelineRows", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows;", "getTimelineAdapterRows", "", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$TimelineRowAdapterItem;", "resources", "Landroid/content/res/Resources;", "calculateTimelineData", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$TransferTimelineData;", "determineTimelineType", WebsocketGatewayConstants.DATA_KEY, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded extends AchTransferTimelineState {
        public static final int $stable = 8;
        private final Account account;
        private final AchRelationship achRelationship;
        private final AchTransfer achTransfer;
        private final boolean hideInterestEarned;
        private final MarginSettings marginSettings;
        private final TransferTimelineRows timelineRows;
        private final int titleTextRes;
        private final UnifiedAccountV2 unifiedAccount;

        /* renamed from: component2, reason: from getter */
        private final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        /* renamed from: component3, reason: from getter */
        private final Account getAccount() {
            return this.account;
        }

        /* renamed from: component4, reason: from getter */
        private final UnifiedAccountV2 getUnifiedAccount() {
            return this.unifiedAccount;
        }

        /* renamed from: component5, reason: from getter */
        private final MarginSettings getMarginSettings() {
            return this.marginSettings;
        }

        /* renamed from: component6, reason: from getter */
        private final boolean getHideInterestEarned() {
            return this.hideInterestEarned;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AchRelationship achRelationship, AchTransfer achTransfer, Account account, UnifiedAccountV2 unifiedAccountV2, MarginSettings marginSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                achRelationship = loaded.achRelationship;
            }
            if ((i & 2) != 0) {
                achTransfer = loaded.achTransfer;
            }
            if ((i & 4) != 0) {
                account = loaded.account;
            }
            if ((i & 8) != 0) {
                unifiedAccountV2 = loaded.unifiedAccount;
            }
            if ((i & 16) != 0) {
                marginSettings = loaded.marginSettings;
            }
            if ((i & 32) != 0) {
                z = loaded.hideInterestEarned;
            }
            MarginSettings marginSettings2 = marginSettings;
            boolean z2 = z;
            return loaded.copy(achRelationship, achTransfer, account, unifiedAccountV2, marginSettings2, z2);
        }

        public static /* synthetic */ void getTimelineRows$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        public final Loaded copy(AchRelationship achRelationship, AchTransfer achTransfer, Account account, UnifiedAccountV2 unifiedAccount, MarginSettings marginSettings, boolean hideInterestEarned) {
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
            Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
            return new Loaded(achRelationship, achTransfer, account, unifiedAccount, marginSettings, hideInterestEarned);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.achRelationship, loaded.achRelationship) && Intrinsics.areEqual(this.achTransfer, loaded.achTransfer) && Intrinsics.areEqual(this.account, loaded.account) && Intrinsics.areEqual(this.unifiedAccount, loaded.unifiedAccount) && Intrinsics.areEqual(this.marginSettings, loaded.marginSettings) && this.hideInterestEarned == loaded.hideInterestEarned;
        }

        public int hashCode() {
            return (((((((((this.achRelationship.hashCode() * 31) + this.achTransfer.hashCode()) * 31) + this.account.hashCode()) * 31) + this.unifiedAccount.hashCode()) * 31) + this.marginSettings.hashCode()) * 31) + Boolean.hashCode(this.hideInterestEarned);
        }

        public String toString() {
            return "Loaded(achRelationship=" + this.achRelationship + ", achTransfer=" + this.achTransfer + ", account=" + this.account + ", unifiedAccount=" + this.unifiedAccount + ", marginSettings=" + this.marginSettings + ", hideInterestEarned=" + this.hideInterestEarned + ")";
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(AchRelationship achRelationship, AchTransfer achTransfer, Account account, UnifiedAccountV2 unifiedAccount, MarginSettings marginSettings, boolean z) {
            int i;
            super(null);
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
            Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
            this.achRelationship = achRelationship;
            this.achTransfer = achTransfer;
            this.account = account;
            this.unifiedAccount = unifiedAccount;
            this.marginSettings = marginSettings;
            this.hideInterestEarned = z;
            if (achTransfer.getRhsState() == AchTransferRhsState.REVIEWING_BALANCE) {
                i = C30082R.string.ach_transfer_timeline_deposit_in_review;
            } else {
                i = C30082R.string.ach_transfer_timeline_deposit_initiated;
            }
            this.titleTextRes = i;
            this.timelineRows = determineTimelineType(calculateTimelineData(achTransfer, account, unifiedAccount, marginSettings, z));
        }

        public final int getTitleTextRes() {
            return this.titleTextRes;
        }

        public final TransferTimelineRows getTimelineRows() {
            return this.timelineRows;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<TimelineRowAdapterItem> getTimelineAdapterRows(Resources resources) throws Resources.NotFoundException {
            String string2;
            String string3;
            RdsTimelineRowView.State state;
            RdsTimelineRowView.Position position;
            Intrinsics.checkNotNullParameter(resources, "resources");
            List<TransferTimelineRow> sortedRows = this.timelineRows.getSortedRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedRows, 10));
            int i = 0;
            for (Object obj : sortedRows) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TransferTimelineRow transferTimelineRow = (TransferTimelineRow) obj;
                Integer metadataTextRes = transferTimelineRow.getMetadataTextRes();
                if (metadataTextRes != null) {
                    int iIntValue = metadataTextRes.intValue();
                    if (transferTimelineRow instanceof TransferTimelineRow.CoversMarginRow) {
                        TransferTimelineRow.CoversMarginRow coversMarginRow = (TransferTimelineRow.CoversMarginRow) transferTimelineRow;
                        if (coversMarginRow.getCoveredAmount() != null) {
                            string2 = resources.getString(iIntValue, Money.format$default(coversMarginRow.getCoveredAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                        } else {
                            string2 = resources.getString(iIntValue);
                        }
                    }
                } else {
                    string2 = null;
                }
                String str = string2;
                Instant timestamp = transferTimelineRow.getTimestamp();
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                LocalDate localDate = Instants.toLocalDate(timestamp, zoneIdSystemDefault);
                if (localDate.isEqual(LocalDate.now())) {
                    string3 = resources.getString(C30082R.string.ach_transfer_timeline_date_today);
                } else {
                    string3 = LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR.format((LocalDateFormatter) localDate);
                }
                String str2 = string3;
                Intrinsics.checkNotNull(str2);
                if (transferTimelineRow.isComplete()) {
                    state = RdsTimelineRowView.State.COMPLETE;
                } else {
                    state = (i == 0 || !this.timelineRows.getSortedRows().get(i + (-1)).isComplete()) ? RdsTimelineRowView.State.INCOMPLETE : RdsTimelineRowView.State.NEXT;
                }
                RdsTimelineRowView.State state2 = state;
                if (i == 0) {
                    position = RdsTimelineRowView.Position.TOP;
                } else {
                    position = i == CollectionsKt.getLastIndex(this.timelineRows.getSortedRows()) ? RdsTimelineRowView.Position.BOTTOM : RdsTimelineRowView.Position.BETWEEN;
                }
                RdsTimelineRowView.Position position2 = position;
                String string4 = resources.getString(transferTimelineRow.getPrimaryTextRes());
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                arrayList.add(new TimelineRowAdapterItem(string4, str, str2, state2, position2));
                i = i2;
            }
            return arrayList;
        }

        private final TransferTimelineData calculateTimelineData(AchTransfer achTransfer, Account account, UnifiedAccountV2 unifiedAccount, MarginSettings marginSettings, boolean hideInterestEarned) {
            BigDecimal pendingDeposit;
            BigDecimal decimalValue = unifiedAccount.getPortfolioEquity().minus(unifiedAccount.getTotalMarketValue()).getDecimalValue();
            Account.Balances balances = account.getBalances();
            if (balances instanceof Account.CashBalances) {
                pendingDeposit = ((Account.CashBalances) balances).getPendingDeposit();
            } else {
                if (!(balances instanceof Account.MarginBalances)) {
                    throw new IllegalStateException(("Unknown balance type: " + Reflection.getOrCreateKotlinClass(balances.getClass()).getQualifiedName()).toString());
                }
                pendingDeposit = ((Account.MarginBalances) balances).getPendingDeposit();
            }
            BigDecimal bigDecimalSubtract = pendingDeposit.subtract(achTransfer.getAmount().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalSubtract2 = decimalValue.subtract(achTransfer.getEarlyAccessAmount().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            if (achTransfer.getEarlyAccessAmount().isZero()) {
                BigDecimal bigDecimalSubtract3 = bigDecimalSubtract.subtract(account.getMaxAchEarlyAccessAmount());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
                bigDecimalSubtract2 = bigDecimalSubtract2.add(bigDecimalSubtract3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "add(...)");
            }
            return new TransferTimelineData(achTransfer, bigDecimalSubtract2, account.getBalances().isPatternDayTrader(), hideInterestEarned, account.getCashManagementEnabled(), marginSettings.isMarginInvestingEnabled());
        }

        private final TransferTimelineRows determineTimelineType(TransferTimelineData data) {
            AchTransfer achTransfer = data.getAchTransfer();
            BigDecimal netMargin = data.getNetMargin();
            boolean isPatternDayTrader = data.getIsPatternDayTrader();
            boolean z = false;
            if (BigDecimals7.isNegative(netMargin) && achTransfer.getRhsState() != AchTransferRhsState.REVIEWING_BALANCE) {
                BigDecimal bigDecimalAdd = netMargin.add(achTransfer.getAmount().getDecimalValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                if (!BigDecimals7.isNegative(bigDecimalAdd)) {
                    Currency currency = achTransfer.getAmount().getCurrency();
                    BigDecimal bigDecimalAbs = netMargin.abs();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                    return TransferTimelineRows.INSTANCE.createMarginFullyCoveredTimeline(achTransfer, new Money(currency, bigDecimalAbs), (!BigDecimals7.isPositive(bigDecimalAdd) || isPatternDayTrader || data.getHideInterestEarned()) ? false : true, data.isInCashManagement(), data.isMarginEnabled());
                }
                return TransferTimelineRows.INSTANCE.createMarginPartiallyCoveredTimeline(achTransfer, data.isInCashManagement(), data.isMarginEnabled());
            }
            if (!isPatternDayTrader && !data.getHideInterestEarned()) {
                z = true;
            }
            return TransferTimelineRows.INSTANCE.createStandardTimeline(achTransfer, z, data.isInCashManagement());
        }
    }

    /* compiled from: AchTransferTimelineState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$Error;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends AchTransferTimelineState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* compiled from: AchTransferTimelineState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$TransferTimelineData;", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "netMargin", "Ljava/math/BigDecimal;", "isPatternDayTrader", "", "hideInterestEarned", "isInCashManagement", "isMarginEnabled", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;Ljava/math/BigDecimal;ZZZZ)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "getNetMargin", "()Ljava/math/BigDecimal;", "()Z", "getHideInterestEarned", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class TransferTimelineData {
        private final AchTransfer achTransfer;
        private final boolean hideInterestEarned;
        private final boolean isInCashManagement;
        private final boolean isMarginEnabled;
        private final boolean isPatternDayTrader;
        private final BigDecimal netMargin;

        public static /* synthetic */ TransferTimelineData copy$default(TransferTimelineData transferTimelineData, AchTransfer achTransfer, BigDecimal bigDecimal, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                achTransfer = transferTimelineData.achTransfer;
            }
            if ((i & 2) != 0) {
                bigDecimal = transferTimelineData.netMargin;
            }
            if ((i & 4) != 0) {
                z = transferTimelineData.isPatternDayTrader;
            }
            if ((i & 8) != 0) {
                z2 = transferTimelineData.hideInterestEarned;
            }
            if ((i & 16) != 0) {
                z3 = transferTimelineData.isInCashManagement;
            }
            if ((i & 32) != 0) {
                z4 = transferTimelineData.isMarginEnabled;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            return transferTimelineData.copy(achTransfer, bigDecimal, z, z2, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getNetMargin() {
            return this.netMargin;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPatternDayTrader() {
            return this.isPatternDayTrader;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHideInterestEarned() {
            return this.hideInterestEarned;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInCashManagement() {
            return this.isInCashManagement;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsMarginEnabled() {
            return this.isMarginEnabled;
        }

        public final TransferTimelineData copy(AchTransfer achTransfer, BigDecimal netMargin, boolean isPatternDayTrader, boolean hideInterestEarned, boolean isInCashManagement, boolean isMarginEnabled) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Intrinsics.checkNotNullParameter(netMargin, "netMargin");
            return new TransferTimelineData(achTransfer, netMargin, isPatternDayTrader, hideInterestEarned, isInCashManagement, isMarginEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferTimelineData)) {
                return false;
            }
            TransferTimelineData transferTimelineData = (TransferTimelineData) other;
            return Intrinsics.areEqual(this.achTransfer, transferTimelineData.achTransfer) && Intrinsics.areEqual(this.netMargin, transferTimelineData.netMargin) && this.isPatternDayTrader == transferTimelineData.isPatternDayTrader && this.hideInterestEarned == transferTimelineData.hideInterestEarned && this.isInCashManagement == transferTimelineData.isInCashManagement && this.isMarginEnabled == transferTimelineData.isMarginEnabled;
        }

        public int hashCode() {
            return (((((((((this.achTransfer.hashCode() * 31) + this.netMargin.hashCode()) * 31) + Boolean.hashCode(this.isPatternDayTrader)) * 31) + Boolean.hashCode(this.hideInterestEarned)) * 31) + Boolean.hashCode(this.isInCashManagement)) * 31) + Boolean.hashCode(this.isMarginEnabled);
        }

        public String toString() {
            return "TransferTimelineData(achTransfer=" + this.achTransfer + ", netMargin=" + this.netMargin + ", isPatternDayTrader=" + this.isPatternDayTrader + ", hideInterestEarned=" + this.hideInterestEarned + ", isInCashManagement=" + this.isInCashManagement + ", isMarginEnabled=" + this.isMarginEnabled + ")";
        }

        public TransferTimelineData(AchTransfer achTransfer, BigDecimal netMargin, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Intrinsics.checkNotNullParameter(netMargin, "netMargin");
            this.achTransfer = achTransfer;
            this.netMargin = netMargin;
            this.isPatternDayTrader = z;
            this.hideInterestEarned = z2;
            this.isInCashManagement = z3;
            this.isMarginEnabled = z4;
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public final BigDecimal getNetMargin() {
            return this.netMargin;
        }

        public final boolean isPatternDayTrader() {
            return this.isPatternDayTrader;
        }

        public final boolean getHideInterestEarned() {
            return this.hideInterestEarned;
        }

        public final boolean isInCashManagement() {
            return this.isInCashManagement;
        }

        public final boolean isMarginEnabled() {
            return this.isMarginEnabled;
        }
    }

    /* compiled from: AchTransferTimelineState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState$TimelineRowAdapterItem;", "", "primaryText", "", "metaDataText", "timestampText", "state", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "position", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;)V", "getPrimaryText", "()Ljava/lang/String;", "getMetaDataText", "getTimestampText", "getState", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "getPosition", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TimelineRowAdapterItem {
        public static final int $stable = 0;
        private final String metaDataText;
        private final RdsTimelineRowView.Position position;
        private final String primaryText;
        private final RdsTimelineRowView.State state;
        private final String timestampText;

        public static /* synthetic */ TimelineRowAdapterItem copy$default(TimelineRowAdapterItem timelineRowAdapterItem, String str, String str2, String str3, RdsTimelineRowView.State state, RdsTimelineRowView.Position position, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timelineRowAdapterItem.primaryText;
            }
            if ((i & 2) != 0) {
                str2 = timelineRowAdapterItem.metaDataText;
            }
            if ((i & 4) != 0) {
                str3 = timelineRowAdapterItem.timestampText;
            }
            if ((i & 8) != 0) {
                state = timelineRowAdapterItem.state;
            }
            if ((i & 16) != 0) {
                position = timelineRowAdapterItem.position;
            }
            RdsTimelineRowView.Position position2 = position;
            String str4 = str3;
            return timelineRowAdapterItem.copy(str, str2, str4, state, position2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMetaDataText() {
            return this.metaDataText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTimestampText() {
            return this.timestampText;
        }

        /* renamed from: component4, reason: from getter */
        public final RdsTimelineRowView.State getState() {
            return this.state;
        }

        /* renamed from: component5, reason: from getter */
        public final RdsTimelineRowView.Position getPosition() {
            return this.position;
        }

        public final TimelineRowAdapterItem copy(String primaryText, String metaDataText, String timestampText, RdsTimelineRowView.State state, RdsTimelineRowView.Position position) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(timestampText, "timestampText");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(position, "position");
            return new TimelineRowAdapterItem(primaryText, metaDataText, timestampText, state, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimelineRowAdapterItem)) {
                return false;
            }
            TimelineRowAdapterItem timelineRowAdapterItem = (TimelineRowAdapterItem) other;
            return Intrinsics.areEqual(this.primaryText, timelineRowAdapterItem.primaryText) && Intrinsics.areEqual(this.metaDataText, timelineRowAdapterItem.metaDataText) && Intrinsics.areEqual(this.timestampText, timelineRowAdapterItem.timestampText) && this.state == timelineRowAdapterItem.state && this.position == timelineRowAdapterItem.position;
        }

        public int hashCode() {
            int iHashCode = this.primaryText.hashCode() * 31;
            String str = this.metaDataText;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.timestampText.hashCode()) * 31) + this.state.hashCode()) * 31) + this.position.hashCode();
        }

        public String toString() {
            return "TimelineRowAdapterItem(primaryText=" + this.primaryText + ", metaDataText=" + this.metaDataText + ", timestampText=" + this.timestampText + ", state=" + this.state + ", position=" + this.position + ")";
        }

        public TimelineRowAdapterItem(String primaryText, String str, String timestampText, RdsTimelineRowView.State state, RdsTimelineRowView.Position position) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(timestampText, "timestampText");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(position, "position");
            this.primaryText = primaryText;
            this.metaDataText = str;
            this.timestampText = timestampText;
            this.state = state;
            this.position = position;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getMetaDataText() {
            return this.metaDataText;
        }

        public final String getTimestampText() {
            return this.timestampText;
        }

        public final RdsTimelineRowView.State getState() {
            return this.state;
        }

        public final RdsTimelineRowView.Position getPosition() {
            return this.position;
        }
    }
}
