package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow;
import com.robinhood.models.p320db.DepositSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.models.p406db.AchTransfer;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: TransferTimelineRows.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows;", "", "rows", "", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "<init>", "(Ljava/util/List;)V", "sortedRows", "getSortedRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferTimelineRows {
    private final List<TransferTimelineRow> rows;
    private final List<TransferTimelineRow> sortedRows;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final List<TransferTimelineRow> component1() {
        return this.rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferTimelineRows copy$default(TransferTimelineRows transferTimelineRows, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferTimelineRows.rows;
        }
        return transferTimelineRows.copy(list);
    }

    public final TransferTimelineRows copy(List<? extends TransferTimelineRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new TransferTimelineRows(rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferTimelineRows) && Intrinsics.areEqual(this.rows, ((TransferTimelineRows) other).rows);
    }

    public int hashCode() {
        return this.rows.hashCode();
    }

    public String toString() {
        return "TransferTimelineRows(rows=" + this.rows + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferTimelineRows(List<? extends TransferTimelineRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.sortedRows = CollectionsKt.sortedWith(rows, new Comparator() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.TransferTimelineRows$sortedRows$1
            @Override // java.util.Comparator
            public final int compare(TransferTimelineRow transferTimelineRow, TransferTimelineRow transferTimelineRow2) {
                boolean zIsComplete = transferTimelineRow.isComplete();
                if (zIsComplete == transferTimelineRow2.isComplete()) {
                    return transferTimelineRow.getTimestamp().isBefore(transferTimelineRow2.getTimestamp()) ? -1 : 1;
                }
                if (zIsComplete) {
                    return -1;
                }
                if (zIsComplete) {
                    throw new NoWhenBranchMatchedException();
                }
                return 1;
            }
        });
    }

    public final List<TransferTimelineRow> getSortedRows() {
        return this.sortedRows;
    }

    /* compiled from: TransferTimelineRows.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows$Companion;", "", "<init>", "()V", "createDepositScheduleTimeline", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows;", "depositSchedule", "Lcom/robinhood/models/db/DepositSchedule;", "createStandardTimeline", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "includeInterestEarned", "", "isInCashManagement", "createMarginFullyCoveredTimeline", "coveredAmount", "Lcom/robinhood/models/util/Money;", "isMarginEnabled", "createMarginPartiallyCoveredTimeline", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransferTimelineRows createDepositScheduleTimeline(DepositSchedule depositSchedule) {
            TransferTimelineRow.NextDepositRow nextDepositRow;
            Intrinsics.checkNotNullParameter(depositSchedule, "depositSchedule");
            TransferTimelineRow.DepositScheduleCreatedRow depositScheduleCreatedRow = new TransferTimelineRow.DepositScheduleCreatedRow(depositSchedule.getCreatedAt());
            TransferTimelineRow.DepositScheduleCompletesRow depositScheduleCompletesRow = new TransferTimelineRow.DepositScheduleCompletesRow(depositSchedule.getExpectedLandingDateTime());
            Instant instant = depositSchedule.getStartDate().atStartOfDay(ZoneId.systemDefault()).toInstant();
            Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
            TransferTimelineRow.FirstDepositScheduleInitiatedRow firstDepositScheduleInitiatedRow = new TransferTimelineRow.FirstDepositScheduleInitiatedRow(instant);
            if (depositSchedule.getNextDepositDate().isAfter(depositSchedule.getStartDate())) {
                Instant instant2 = depositSchedule.getNextDepositDate().atStartOfDay(ZoneId.systemDefault()).toInstant();
                Intrinsics.checkNotNullExpressionValue(instant2, "toInstant(...)");
                nextDepositRow = new TransferTimelineRow.NextDepositRow(instant2);
            } else {
                nextDepositRow = null;
            }
            return new TransferTimelineRows(CollectionsKt.listOfNotNull((Object[]) new TransferTimelineRow[]{depositScheduleCreatedRow, depositScheduleCompletesRow, firstDepositScheduleInitiatedRow, nextDepositRow}));
        }

        public final TransferTimelineRows createStandardTimeline(AchTransfer achTransfer, boolean includeInterestEarned, boolean isInCashManagement) {
            TransferTimelineRow.DepositInReviewRow depositInReviewRow;
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Instant expectedSweepAt = achTransfer.getExpectedSweepAt();
            AchTransferRhsState rhsState = achTransfer.getRhsState();
            AchTransferRhsState achTransferRhsState = AchTransferRhsState.REVIEWING_BALANCE;
            TransferTimelineRow.EarningInterestRow earningInterestRow = null;
            if (rhsState == achTransferRhsState) {
                Instant instantMinusSeconds = achTransfer.getCreatedAt().minusSeconds(1L);
                Intrinsics.checkNotNullExpressionValue(instantMinusSeconds, "minusSeconds(...)");
                depositInReviewRow = new TransferTimelineRow.DepositInReviewRow(instantMinusSeconds);
            } else {
                depositInReviewRow = null;
            }
            TransferTimelineRow.DepositInitiatedRow depositInitiatedRow = new TransferTimelineRow.DepositInitiatedRow(achTransfer.getCreatedAt(), achTransfer.getRhsState() != achTransferRhsState);
            if (includeInterestEarned && expectedSweepAt != null) {
                earningInterestRow = new TransferTimelineRow.EarningInterestRow(expectedSweepAt, false);
            }
            return new TransferTimelineRows(CollectionsKt.listOfNotNull((Object[]) new TransferTimelineRow[]{depositInReviewRow, depositInitiatedRow, earningInterestRow, new TransferTimelineRow.DepositCompletedRow(achTransfer.getExpectedLandingDateTime(), isInCashManagement)}));
        }

        public final TransferTimelineRows createMarginFullyCoveredTimeline(AchTransfer achTransfer, Money coveredAmount, boolean includeInterestEarned, boolean isInCashManagement, boolean isMarginEnabled) {
            Instant instantMinusSeconds;
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Intrinsics.checkNotNullParameter(coveredAmount, "coveredAmount");
            Instant expectedSweepAt = achTransfer.getExpectedSweepAt();
            TransferTimelineRow.EarningInterestRow earningInterestRow = null;
            TransferTimelineRow.DepositInitiatedRow depositInitiatedRow = new TransferTimelineRow.DepositInitiatedRow(achTransfer.getCreatedAt(), false, 2, null);
            if (expectedSweepAt != null) {
                instantMinusSeconds = expectedSweepAt.minusSeconds(1L);
            } else {
                instantMinusSeconds = achTransfer.getExpectedLandingDateTime().minusSeconds(1L);
            }
            Intrinsics.checkNotNull(instantMinusSeconds);
            TransferTimelineRow.CoversMarginRow coversMarginRow = new TransferTimelineRow.CoversMarginRow(instantMinusSeconds, coveredAmount, isMarginEnabled);
            if (includeInterestEarned && expectedSweepAt != null) {
                earningInterestRow = new TransferTimelineRow.EarningInterestRow(expectedSweepAt, true);
            }
            return new TransferTimelineRows(CollectionsKt.listOfNotNull((Object[]) new TransferTimelineRow[]{depositInitiatedRow, coversMarginRow, earningInterestRow, new TransferTimelineRow.DepositCompletedRow(achTransfer.getExpectedLandingDateTime(), isInCashManagement)}));
        }

        public final TransferTimelineRows createMarginPartiallyCoveredTimeline(AchTransfer achTransfer, boolean isInCashManagement, boolean isMarginEnabled) {
            Instant instantMinusSeconds;
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            Instant expectedSweepAt = achTransfer.getExpectedSweepAt();
            TransferTimelineRow.DepositInitiatedRow depositInitiatedRow = new TransferTimelineRow.DepositInitiatedRow(achTransfer.getCreatedAt(), false, 2, null);
            if (expectedSweepAt != null) {
                instantMinusSeconds = expectedSweepAt.minusSeconds(1L);
            } else {
                instantMinusSeconds = achTransfer.getExpectedLandingDateTime().minusSeconds(1L);
            }
            Intrinsics.checkNotNull(instantMinusSeconds);
            return new TransferTimelineRows(CollectionsKt.listOf((Object[]) new TransferTimelineRow[]{depositInitiatedRow, new TransferTimelineRow.CoversMarginRow(instantMinusSeconds, null, isMarginEnabled), new TransferTimelineRow.DepositCompletedRow(achTransfer.getExpectedLandingDateTime(), isInCashManagement)}));
        }
    }
}
