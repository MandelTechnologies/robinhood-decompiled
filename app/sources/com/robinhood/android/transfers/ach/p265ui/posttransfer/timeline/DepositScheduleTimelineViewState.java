package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.TransferTimelineRow;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.DepositSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: DepositScheduleTimelineViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState$Loading;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class DepositScheduleTimelineViewState {
    public static final int $stable = 0;

    public /* synthetic */ DepositScheduleTimelineViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DepositScheduleTimelineViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState$Loading;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DepositScheduleTimelineViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private DepositScheduleTimelineViewState() {
    }

    /* compiled from: DepositScheduleTimelineViewState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "depositSchedule", "Lcom/robinhood/models/db/DepositSchedule;", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/db/DepositSchedule;)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getDepositSchedule", "()Lcom/robinhood/models/db/DepositSchedule;", "timelineRows", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TransferTimelineRows;", "depositScheduleTimelineAmountTextValue", "Lcom/robinhood/utils/resource/StringResource;", "getDepositScheduleTimelineAmountTextValue", "()Lcom/robinhood/utils/resource/StringResource;", "getAchRelationshipTextValue", "", "resources", "Landroid/content/res/Resources;", "getNextDepositRowDescription", "getTimelineAdapterRows", "", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TimelineRowAdapterItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded extends DepositScheduleTimelineViewState {
        public static final int $stable = 8;
        private final AchRelationship achRelationship;
        private final DepositSchedule depositSchedule;
        private final TransferTimelineRows timelineRows;

        /* compiled from: DepositScheduleTimelineViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiDepositSchedule.Frequency.values().length];
                try {
                    iArr[ApiDepositSchedule.Frequency.WEEKLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.BIWEEKLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.BIMONTHLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.MONTHLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.QUARTERLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AchRelationship achRelationship, DepositSchedule depositSchedule, int i, Object obj) {
            if ((i & 1) != 0) {
                achRelationship = loaded.achRelationship;
            }
            if ((i & 2) != 0) {
                depositSchedule = loaded.depositSchedule;
            }
            return loaded.copy(achRelationship, depositSchedule);
        }

        /* renamed from: component1, reason: from getter */
        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* renamed from: component2, reason: from getter */
        public final DepositSchedule getDepositSchedule() {
            return this.depositSchedule;
        }

        public final Loaded copy(AchRelationship achRelationship, DepositSchedule depositSchedule) {
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            Intrinsics.checkNotNullParameter(depositSchedule, "depositSchedule");
            return new Loaded(achRelationship, depositSchedule);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.achRelationship, loaded.achRelationship) && Intrinsics.areEqual(this.depositSchedule, loaded.depositSchedule);
        }

        public int hashCode() {
            return (this.achRelationship.hashCode() * 31) + this.depositSchedule.hashCode();
        }

        public String toString() {
            return "Loaded(achRelationship=" + this.achRelationship + ", depositSchedule=" + this.depositSchedule + ")";
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        public final DepositSchedule getDepositSchedule() {
            return this.depositSchedule;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(AchRelationship achRelationship, DepositSchedule depositSchedule) {
            super(null);
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            Intrinsics.checkNotNullParameter(depositSchedule, "depositSchedule");
            this.achRelationship = achRelationship;
            this.depositSchedule = depositSchedule;
            this.timelineRows = TransferTimelineRows.INSTANCE.createDepositScheduleTimeline(depositSchedule);
        }

        public final StringResource getDepositScheduleTimelineAmountTextValue() {
            return StringResource.INSTANCE.invoke(C30082R.string.ach_transfer_timeline_amount, Money.format$default(this.depositSchedule.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }

        public final String getAchRelationshipTextValue(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string2 = resources.getString(C30082R.string.deposit_schedule_timeline_bank_account, AchRelationships.getAchRelationshipDisplayName(this.achRelationship, resources));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        private final StringResource getNextDepositRowDescription() {
            String str = LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) this.depositSchedule.getStartDate());
            int i = WhenMappings.$EnumSwitchMapping$0[this.depositSchedule.getFrequency().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C30082R.string.next_deposit_timeline_description_weekly, str);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C30082R.string.next_deposit_timeline_description_biweekly, str);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C30082R.string.next_deposit_timeline_description_bimonthly, new Object[0]);
            }
            if (i == 4) {
                return StringResource.INSTANCE.invoke(C30082R.string.next_deposit_timeline_description_monthly, MessageFormat.format("{0, ordinal}", Integer.valueOf(this.depositSchedule.getStartDate().getDayOfMonth())));
            }
            if (i != 5) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C30082R.string.next_deposit_timeline_description_quarterly, new Object[0]);
        }

        public final List<TimelineRowAdapterItem> getTimelineAdapterRows(Resources resources) throws Resources.NotFoundException {
            RdsTimelineRowView.State state;
            RdsTimelineRowView.Position position;
            CharSequence text;
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
                String string2 = null;
                if (transferTimelineRow instanceof TransferTimelineRow.NextDepositRow) {
                    StringResource nextDepositRowDescription = getNextDepositRowDescription();
                    if (nextDepositRowDescription != null && (text = nextDepositRowDescription.getText(resources)) != null) {
                        string2 = text.toString();
                    }
                } else {
                    Integer metadataTextRes = transferTimelineRow.getMetadataTextRes();
                    if (metadataTextRes != null) {
                        string2 = resources.getString(metadataTextRes.intValue());
                    }
                }
                String str = string2;
                Instant timestamp = transferTimelineRow.getTimestamp();
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                String str2 = LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR.format((LocalDateFormatter) Instants.toLocalDate(timestamp, zoneIdSystemDefault));
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
                String string3 = resources.getString(transferTimelineRow.getPrimaryTextRes());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                arrayList.add(new TimelineRowAdapterItem(string3, str, str2, state2, position2));
                i = i2;
            }
            return arrayList;
        }
    }
}
