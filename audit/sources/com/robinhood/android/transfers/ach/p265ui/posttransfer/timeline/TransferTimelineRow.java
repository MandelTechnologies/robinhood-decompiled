package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: TransferTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\t\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "", "<init>", "()V", "j$/time/Instant", "getTimestamp", "()Lj$/time/Instant;", "timestamp", "", "isComplete", "()Z", "", "getPrimaryTextRes", "()I", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "DepositInReviewRow", "DepositInitiatedRow", "DepositScheduleCreatedRow", "FirstDepositScheduleInitiatedRow", "DepositScheduleCompletesRow", "NextDepositRow", "DepositCompletedRow", "EarningInterestRow", "CoversMarginRow", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$CoversMarginRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositCompletedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInReviewRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInitiatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCompletesRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCreatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$EarningInterestRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$FirstDepositScheduleInitiatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$NextDepositRow;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferTimelineRow {
    public static final int $stable = 0;

    public /* synthetic */ TransferTimelineRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getMetadataTextRes();

    public abstract int getPrimaryTextRes();

    public abstract Instant getTimestamp();

    public abstract boolean isComplete();

    private TransferTimelineRow() {
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInReviewRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "<init>", "(Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInReviewRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "isComplete", "()Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositInReviewRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Instant timestamp;

        public static /* synthetic */ DepositInReviewRow copy$default(DepositInReviewRow depositInReviewRow, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = depositInReviewRow.timestamp;
            }
            return depositInReviewRow.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final DepositInReviewRow copy(Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DepositInReviewRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DepositInReviewRow) && Intrinsics.areEqual(this.timestamp, ((DepositInReviewRow) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return true;
        }

        public String toString() {
            return "DepositInReviewRow(timestamp=" + this.timestamp + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositInReviewRow(Instant timestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.ach_transfer_timeline_deposit_in_review_primary;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return Integer.valueOf(C30082R.string.ach_transfer_timeline_deposit_in_review_metadata);
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInitiatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "", "isComplete", "<init>", "(Lj$/time/Instant;Z)V", "component1", "()Lj$/time/Instant;", "component2", "()Z", "copy", "(Lj$/time/Instant;Z)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositInitiatedRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositInitiatedRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final boolean isComplete;
        private final Instant timestamp;

        public static /* synthetic */ DepositInitiatedRow copy$default(DepositInitiatedRow depositInitiatedRow, Instant instant, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = depositInitiatedRow.timestamp;
            }
            if ((i & 2) != 0) {
                z = depositInitiatedRow.isComplete;
            }
            return depositInitiatedRow.copy(instant, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final DepositInitiatedRow copy(Instant timestamp, boolean isComplete) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DepositInitiatedRow(timestamp, isComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositInitiatedRow)) {
                return false;
            }
            DepositInitiatedRow depositInitiatedRow = (DepositInitiatedRow) other;
            return Intrinsics.areEqual(this.timestamp, depositInitiatedRow.timestamp) && this.isComplete == depositInitiatedRow.isComplete;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return null;
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + Boolean.hashCode(this.isComplete);
        }

        public String toString() {
            return "DepositInitiatedRow(timestamp=" + this.timestamp + ", isComplete=" + this.isComplete + ")";
        }

        public /* synthetic */ DepositInitiatedRow(Instant instant, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(instant, (i & 2) != 0 ? true : z);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return this.isComplete;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositInitiatedRow(Instant timestamp, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
            this.isComplete = z;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.ach_transfer_timeline_deposit_initiated_primary;
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCreatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "<init>", "(Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCreatedRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "isComplete", "()Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositScheduleCreatedRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Instant timestamp;

        public static /* synthetic */ DepositScheduleCreatedRow copy$default(DepositScheduleCreatedRow depositScheduleCreatedRow, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = depositScheduleCreatedRow.timestamp;
            }
            return depositScheduleCreatedRow.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final DepositScheduleCreatedRow copy(Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DepositScheduleCreatedRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DepositScheduleCreatedRow) && Intrinsics.areEqual(this.timestamp, ((DepositScheduleCreatedRow) other).timestamp);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return null;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return true;
        }

        public String toString() {
            return "DepositScheduleCreatedRow(timestamp=" + this.timestamp + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositScheduleCreatedRow(Instant timestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.deposit_schedule_timeline_schedule_created_primary;
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$FirstDepositScheduleInitiatedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "<init>", "(Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$FirstDepositScheduleInitiatedRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "isComplete", "()Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FirstDepositScheduleInitiatedRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Instant timestamp;

        public static /* synthetic */ FirstDepositScheduleInitiatedRow copy$default(FirstDepositScheduleInitiatedRow firstDepositScheduleInitiatedRow, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = firstDepositScheduleInitiatedRow.timestamp;
            }
            return firstDepositScheduleInitiatedRow.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final FirstDepositScheduleInitiatedRow copy(Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new FirstDepositScheduleInitiatedRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstDepositScheduleInitiatedRow) && Intrinsics.areEqual(this.timestamp, ((FirstDepositScheduleInitiatedRow) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "FirstDepositScheduleInitiatedRow(timestamp=" + this.timestamp + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstDepositScheduleInitiatedRow(Instant timestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.deposit_schedule_timeline_first_deposit_primary;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return Integer.valueOf(C30082R.string.deposit_schedule_timeline_first_deposit_metadata);
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCompletesRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "<init>", "(Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositScheduleCompletesRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "isComplete", "()Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositScheduleCompletesRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Instant timestamp;

        public static /* synthetic */ DepositScheduleCompletesRow copy$default(DepositScheduleCompletesRow depositScheduleCompletesRow, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = depositScheduleCompletesRow.timestamp;
            }
            return depositScheduleCompletesRow.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final DepositScheduleCompletesRow copy(Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DepositScheduleCompletesRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DepositScheduleCompletesRow) && Intrinsics.areEqual(this.timestamp, ((DepositScheduleCompletesRow) other).timestamp);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return null;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "DepositScheduleCompletesRow(timestamp=" + this.timestamp + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositScheduleCompletesRow(Instant timestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.deposit_schedule_timeline_deposit_completes_primary;
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$NextDepositRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "<init>", "(Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "copy", "(Lj$/time/Instant;)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$NextDepositRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "isComplete", "()Z", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NextDepositRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Instant timestamp;

        public static /* synthetic */ NextDepositRow copy$default(NextDepositRow nextDepositRow, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = nextDepositRow.timestamp;
            }
            return nextDepositRow.copy(instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final NextDepositRow copy(Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new NextDepositRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NextDepositRow) && Intrinsics.areEqual(this.timestamp, ((NextDepositRow) other).timestamp);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return null;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "NextDepositRow(timestamp=" + this.timestamp + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextDepositRow(Instant timestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.deposit_schedule_timeline_next_deposit_primary;
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010 \u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositCompletedRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "", "isInCashManagement", "<init>", "(Lj$/time/Instant;Z)V", "component1", "()Lj$/time/Instant;", "component2", "()Z", "copy", "(Lj$/time/Instant;Z)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$DepositCompletedRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "Z", "isComplete", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositCompletedRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final boolean isInCashManagement;
        private final Instant timestamp;

        public static /* synthetic */ DepositCompletedRow copy$default(DepositCompletedRow depositCompletedRow, Instant instant, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = depositCompletedRow.timestamp;
            }
            if ((i & 2) != 0) {
                z = depositCompletedRow.isInCashManagement;
            }
            return depositCompletedRow.copy(instant, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInCashManagement() {
            return this.isInCashManagement;
        }

        public final DepositCompletedRow copy(Instant timestamp, boolean isInCashManagement) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DepositCompletedRow(timestamp, isInCashManagement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositCompletedRow)) {
                return false;
            }
            DepositCompletedRow depositCompletedRow = (DepositCompletedRow) other;
            return Intrinsics.areEqual(this.timestamp, depositCompletedRow.timestamp) && this.isInCashManagement == depositCompletedRow.isInCashManagement;
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + Boolean.hashCode(this.isInCashManagement);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "DepositCompletedRow(timestamp=" + this.timestamp + ", isInCashManagement=" + this.isInCashManagement + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        public final boolean isInCashManagement() {
            return this.isInCashManagement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositCompletedRow(Instant timestamp, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
            this.isInCashManagement = z;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.ach_transfer_timeline_deposit_completed_primary;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            if (this.isInCashManagement) {
                return Integer.valueOf(C30082R.string.ach_transfer_timeline_deposit_completed_cash_management_metadata);
            }
            return Integer.valueOf(C30082R.string.ach_transfer_timeline_deposit_completed_metadata);
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010 \u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$EarningInterestRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "", "isPartial", "<init>", "(Lj$/time/Instant;Z)V", "component1", "()Lj$/time/Instant;", "component2", "()Z", "copy", "(Lj$/time/Instant;Z)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$EarningInterestRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "Z", "isComplete", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EarningInterestRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final boolean isPartial;
        private final Instant timestamp;

        public static /* synthetic */ EarningInterestRow copy$default(EarningInterestRow earningInterestRow, Instant instant, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = earningInterestRow.timestamp;
            }
            if ((i & 2) != 0) {
                z = earningInterestRow.isPartial;
            }
            return earningInterestRow.copy(instant, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPartial() {
            return this.isPartial;
        }

        public final EarningInterestRow copy(Instant timestamp, boolean isPartial) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new EarningInterestRow(timestamp, isPartial);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarningInterestRow)) {
                return false;
            }
            EarningInterestRow earningInterestRow = (EarningInterestRow) other;
            return Intrinsics.areEqual(this.timestamp, earningInterestRow.timestamp) && this.isPartial == earningInterestRow.isPartial;
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + Boolean.hashCode(this.isPartial);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "EarningInterestRow(timestamp=" + this.timestamp + ", isPartial=" + this.isPartial + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        public final boolean isPartial() {
            return this.isPartial;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarningInterestRow(Instant timestamp, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
            this.isPartial = z;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            return C30082R.string.ach_transfer_timeline_earn_interest_primary;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            if (this.isPartial) {
                return Integer.valueOf(C30082R.string.ach_transfer_timeline_earn_interest_remaining_metadata);
            }
            return Integer.valueOf(C30082R.string.ach_transfer_timeline_earn_interest_metadata);
        }
    }

    /* compiled from: TransferTimelineRow.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0014\u0010$\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0016\u0010'\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$CoversMarginRow;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow;", "j$/time/Instant", "timestamp", "Lcom/robinhood/models/util/Money;", "coveredAmount", "", "marginEnabled", "<init>", "(Lj$/time/Instant;Lcom/robinhood/models/util/Money;Z)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/models/util/Money;", "component3", "()Z", "copy", "(Lj$/time/Instant;Lcom/robinhood/models/util/Money;Z)Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRow$CoversMarginRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTimestamp", "Lcom/robinhood/models/util/Money;", "getCoveredAmount", "Z", "getMarginEnabled", "isComplete", "getPrimaryTextRes", "primaryTextRes", "getMetadataTextRes", "()Ljava/lang/Integer;", "metadataTextRes", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CoversMarginRow extends TransferTimelineRow {
        public static final int $stable = 8;
        private final Money coveredAmount;
        private final boolean marginEnabled;
        private final Instant timestamp;

        public static /* synthetic */ CoversMarginRow copy$default(CoversMarginRow coversMarginRow, Instant instant, Money money, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = coversMarginRow.timestamp;
            }
            if ((i & 2) != 0) {
                money = coversMarginRow.coveredAmount;
            }
            if ((i & 4) != 0) {
                z = coversMarginRow.marginEnabled;
            }
            return coversMarginRow.copy(instant, money, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getCoveredAmount() {
            return this.coveredAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMarginEnabled() {
            return this.marginEnabled;
        }

        public final CoversMarginRow copy(Instant timestamp, Money coveredAmount, boolean marginEnabled) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new CoversMarginRow(timestamp, coveredAmount, marginEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CoversMarginRow)) {
                return false;
            }
            CoversMarginRow coversMarginRow = (CoversMarginRow) other;
            return Intrinsics.areEqual(this.timestamp, coversMarginRow.timestamp) && Intrinsics.areEqual(this.coveredAmount, coversMarginRow.coveredAmount) && this.marginEnabled == coversMarginRow.marginEnabled;
        }

        public int hashCode() {
            int iHashCode = this.timestamp.hashCode() * 31;
            Money money = this.coveredAmount;
            return ((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + Boolean.hashCode(this.marginEnabled);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public boolean isComplete() {
            return false;
        }

        public String toString() {
            return "CoversMarginRow(timestamp=" + this.timestamp + ", coveredAmount=" + this.coveredAmount + ", marginEnabled=" + this.marginEnabled + ")";
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Instant getTimestamp() {
            return this.timestamp;
        }

        public final Money getCoveredAmount() {
            return this.coveredAmount;
        }

        public final boolean getMarginEnabled() {
            return this.marginEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CoversMarginRow(Instant timestamp, Money money, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
            this.coveredAmount = money;
            this.marginEnabled = z;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public int getPrimaryTextRes() {
            if (this.marginEnabled) {
                return C30082R.string.ach_transfer_timeline_covers_margin_primary;
            }
            return C30082R.string.ach_transfer_timeline_covers_deficit_primary;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow
        public Integer getMetadataTextRes() {
            return this.coveredAmount == null ? Integer.valueOf(C30082R.string.ach_transfer_timeline_covers_margin_metadata) : this.marginEnabled ? Integer.valueOf(C30082R.string.ach_transfer_timeline_covers_margin_amount_metadata) : Integer.valueOf(C30082R.string.ach_transfer_timeline_covers_deficit_amount_metadata);
        }
    }
}
