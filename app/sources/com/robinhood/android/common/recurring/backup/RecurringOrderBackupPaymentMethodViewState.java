package com.robinhood.android.common.recurring.backup;

import android.content.res.Resources;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RecurringOrderBackupPaymentMethodViewState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001LB\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010/\u001a\u0004\u0018\u00010\u00132\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020)J\u000e\u00109\u001a\u00020\u00132\u0006\u00100\u001a\u000201J\u000e\u0010:\u001a\u00020\u00132\u0006\u00100\u001a\u000201J\u000e\u0010;\u001a\u00020\u00132\u0006\u00100\u001a\u000201J\u0010\u0010<\u001a\u0004\u0018\u00010\u00132\u0006\u00100\u001a\u000201J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\u009d\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010H\u001a\u00020)2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020'HÖ\u0001J\t\u0010K\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0011\u0010+\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u0010-\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00103\u001a\u00020)X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState;", "", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "achRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "selectedRelationship", "scheduleUpdatedEvent", "Lcom/robinhood/udf/UiEvent;", "", "scheduleUpdatedErrorEvent", "", "applyBackupPromptEvent", "backupPaymentRemovedEvent", "buyingPowerSchedulesWithoutBackup", "promptState", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;Ljava/util/List;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;Ljava/lang/String;)V", "getInvestmentSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "getAchRelationships", "()Ljava/util/List;", "getSelectedRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getScheduleUpdatedEvent", "()Lcom/robinhood/udf/UiEvent;", "getScheduleUpdatedErrorEvent", "getApplyBackupPromptEvent", "getBackupPaymentRemovedEvent", "getBuyingPowerSchedulesWithoutBackup", "getPromptState", "()Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", "getLoggingSource", "()Ljava/lang/String;", "numberBuyingPowerSchedulesWithoutBackup", "", "isEditing", "", "()Z", "sourceOfFundsSelectedBtnEnabled", "getSourceOfFundsSelectedBtnEnabled", "sourceOfFundsDisclaimerTextVisible", "getSourceOfFundsDisclaimerTextVisible", "getSourceOfFundsDisclaimerVisibilityText", "resources", "Landroid/content/res/Resources;", "isCrypto", "showPrompt", "getShowPrompt", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "titleText", "promptTitle", "promptText", "secondaryCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "PromptState", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderBackupPaymentMethodViewState {
    public static final int $stable = 8;
    private final List<AchRelationship> achRelationships;
    private final UiEvent<Unit> applyBackupPromptEvent;
    private final UiEvent<Unit> backupPaymentRemovedEvent;
    private final List<InvestmentSchedule> buyingPowerSchedulesWithoutBackup;
    private final InvestmentSchedule investmentSchedule;
    private final boolean isEditing;
    private final RecurringContext loggingContext;
    private final String loggingSource;
    private final int numberBuyingPowerSchedulesWithoutBackup;
    private final PromptState promptState;
    private final UiEvent<Throwable> scheduleUpdatedErrorEvent;
    private final UiEvent<Unit> scheduleUpdatedEvent;
    private final AchRelationship selectedRelationship;
    private final boolean showPrompt;

    public RecurringOrderBackupPaymentMethodViewState() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ RecurringOrderBackupPaymentMethodViewState copy$default(RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState, InvestmentSchedule investmentSchedule, List list, AchRelationship achRelationship, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, List list2, PromptState promptState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentSchedule = recurringOrderBackupPaymentMethodViewState.investmentSchedule;
        }
        if ((i & 2) != 0) {
            list = recurringOrderBackupPaymentMethodViewState.achRelationships;
        }
        if ((i & 4) != 0) {
            achRelationship = recurringOrderBackupPaymentMethodViewState.selectedRelationship;
        }
        if ((i & 8) != 0) {
            uiEvent = recurringOrderBackupPaymentMethodViewState.scheduleUpdatedEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = recurringOrderBackupPaymentMethodViewState.scheduleUpdatedErrorEvent;
        }
        if ((i & 32) != 0) {
            uiEvent3 = recurringOrderBackupPaymentMethodViewState.applyBackupPromptEvent;
        }
        if ((i & 64) != 0) {
            uiEvent4 = recurringOrderBackupPaymentMethodViewState.backupPaymentRemovedEvent;
        }
        if ((i & 128) != 0) {
            list2 = recurringOrderBackupPaymentMethodViewState.buyingPowerSchedulesWithoutBackup;
        }
        if ((i & 256) != 0) {
            promptState = recurringOrderBackupPaymentMethodViewState.promptState;
        }
        if ((i & 512) != 0) {
            str = recurringOrderBackupPaymentMethodViewState.loggingSource;
        }
        PromptState promptState2 = promptState;
        String str2 = str;
        UiEvent uiEvent5 = uiEvent4;
        List list3 = list2;
        UiEvent uiEvent6 = uiEvent2;
        UiEvent uiEvent7 = uiEvent3;
        return recurringOrderBackupPaymentMethodViewState.copy(investmentSchedule, list, achRelationship, uiEvent, uiEvent6, uiEvent7, uiEvent5, list3, promptState2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLoggingSource() {
        return this.loggingSource;
    }

    public final List<AchRelationship> component2() {
        return this.achRelationships;
    }

    /* renamed from: component3, reason: from getter */
    public final AchRelationship getSelectedRelationship() {
        return this.selectedRelationship;
    }

    public final UiEvent<Unit> component4() {
        return this.scheduleUpdatedEvent;
    }

    public final UiEvent<Throwable> component5() {
        return this.scheduleUpdatedErrorEvent;
    }

    public final UiEvent<Unit> component6() {
        return this.applyBackupPromptEvent;
    }

    public final UiEvent<Unit> component7() {
        return this.backupPaymentRemovedEvent;
    }

    public final List<InvestmentSchedule> component8() {
        return this.buyingPowerSchedulesWithoutBackup;
    }

    /* renamed from: component9, reason: from getter */
    public final PromptState getPromptState() {
        return this.promptState;
    }

    public final RecurringOrderBackupPaymentMethodViewState copy(InvestmentSchedule investmentSchedule, List<AchRelationship> achRelationships, AchRelationship selectedRelationship, UiEvent<Unit> scheduleUpdatedEvent, UiEvent<Throwable> scheduleUpdatedErrorEvent, UiEvent<Unit> applyBackupPromptEvent, UiEvent<Unit> backupPaymentRemovedEvent, List<InvestmentSchedule> buyingPowerSchedulesWithoutBackup, PromptState promptState, String loggingSource) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(buyingPowerSchedulesWithoutBackup, "buyingPowerSchedulesWithoutBackup");
        Intrinsics.checkNotNullParameter(promptState, "promptState");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        return new RecurringOrderBackupPaymentMethodViewState(investmentSchedule, achRelationships, selectedRelationship, scheduleUpdatedEvent, scheduleUpdatedErrorEvent, applyBackupPromptEvent, backupPaymentRemovedEvent, buyingPowerSchedulesWithoutBackup, promptState, loggingSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderBackupPaymentMethodViewState)) {
            return false;
        }
        RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState = (RecurringOrderBackupPaymentMethodViewState) other;
        return Intrinsics.areEqual(this.investmentSchedule, recurringOrderBackupPaymentMethodViewState.investmentSchedule) && Intrinsics.areEqual(this.achRelationships, recurringOrderBackupPaymentMethodViewState.achRelationships) && Intrinsics.areEqual(this.selectedRelationship, recurringOrderBackupPaymentMethodViewState.selectedRelationship) && Intrinsics.areEqual(this.scheduleUpdatedEvent, recurringOrderBackupPaymentMethodViewState.scheduleUpdatedEvent) && Intrinsics.areEqual(this.scheduleUpdatedErrorEvent, recurringOrderBackupPaymentMethodViewState.scheduleUpdatedErrorEvent) && Intrinsics.areEqual(this.applyBackupPromptEvent, recurringOrderBackupPaymentMethodViewState.applyBackupPromptEvent) && Intrinsics.areEqual(this.backupPaymentRemovedEvent, recurringOrderBackupPaymentMethodViewState.backupPaymentRemovedEvent) && Intrinsics.areEqual(this.buyingPowerSchedulesWithoutBackup, recurringOrderBackupPaymentMethodViewState.buyingPowerSchedulesWithoutBackup) && Intrinsics.areEqual(this.promptState, recurringOrderBackupPaymentMethodViewState.promptState) && Intrinsics.areEqual(this.loggingSource, recurringOrderBackupPaymentMethodViewState.loggingSource);
    }

    public int hashCode() {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        int iHashCode = (((investmentSchedule == null ? 0 : investmentSchedule.hashCode()) * 31) + this.achRelationships.hashCode()) * 31;
        AchRelationship achRelationship = this.selectedRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.scheduleUpdatedEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.scheduleUpdatedErrorEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.applyBackupPromptEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.backupPaymentRemovedEvent;
        return ((((((iHashCode5 + (uiEvent4 != null ? uiEvent4.hashCode() : 0)) * 31) + this.buyingPowerSchedulesWithoutBackup.hashCode()) * 31) + this.promptState.hashCode()) * 31) + this.loggingSource.hashCode();
    }

    public String toString() {
        return "RecurringOrderBackupPaymentMethodViewState(investmentSchedule=" + this.investmentSchedule + ", achRelationships=" + this.achRelationships + ", selectedRelationship=" + this.selectedRelationship + ", scheduleUpdatedEvent=" + this.scheduleUpdatedEvent + ", scheduleUpdatedErrorEvent=" + this.scheduleUpdatedErrorEvent + ", applyBackupPromptEvent=" + this.applyBackupPromptEvent + ", backupPaymentRemovedEvent=" + this.backupPaymentRemovedEvent + ", buyingPowerSchedulesWithoutBackup=" + this.buyingPowerSchedulesWithoutBackup + ", promptState=" + this.promptState + ", loggingSource=" + this.loggingSource + ")";
    }

    public RecurringOrderBackupPaymentMethodViewState(InvestmentSchedule investmentSchedule, List<AchRelationship> achRelationships, AchRelationship achRelationship, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, List<InvestmentSchedule> buyingPowerSchedulesWithoutBackup, PromptState promptState, String loggingSource) {
        RecurringContext.EntryPoint entryPoint;
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(buyingPowerSchedulesWithoutBackup, "buyingPowerSchedulesWithoutBackup");
        Intrinsics.checkNotNullParameter(promptState, "promptState");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        this.investmentSchedule = investmentSchedule;
        this.achRelationships = achRelationships;
        this.selectedRelationship = achRelationship;
        this.scheduleUpdatedEvent = uiEvent;
        this.scheduleUpdatedErrorEvent = uiEvent2;
        this.applyBackupPromptEvent = uiEvent3;
        this.backupPaymentRemovedEvent = uiEvent4;
        this.buyingPowerSchedulesWithoutBackup = buyingPowerSchedulesWithoutBackup;
        this.promptState = promptState;
        this.loggingSource = loggingSource;
        ArrayList arrayList = new ArrayList();
        for (Object obj : buyingPowerSchedulesWithoutBackup) {
            if (!Intrinsics.areEqual((InvestmentSchedule) obj, this.investmentSchedule)) {
                arrayList.add(obj);
            }
        }
        this.numberBuyingPowerSchedulesWithoutBackup = arrayList.size();
        InvestmentSchedule investmentSchedule2 = this.investmentSchedule;
        boolean z = investmentSchedule2 != null;
        this.isEditing = z;
        RecurringContext.FlowType flowType = z ? RecurringContext.FlowType.EDIT : RecurringContext.FlowType.CREATE;
        RecurringContext.ScheduleFrequency protobuf = Recurring2.toProtobuf(investmentSchedule2 != null ? investmentSchedule2.getFrequency() : null);
        InvestmentSchedule investmentSchedule3 = this.investmentSchedule;
        RecurringContext.RecurringFundsSource protobuf2 = Recurring2.toProtobuf(investmentSchedule3 != null ? investmentSchedule3.getSourceOfFunds() : null);
        String str = this.loggingSource;
        if (!StringsKt.isBlank(str)) {
            entryPoint = RecurringContext.EntryPoint.COMMS;
        } else {
            entryPoint = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        this.loggingContext = new RecurringContext(flowType, entryPoint, str, protobuf, protobuf2, 0.0d, null, null, 0.0d, null, null, 2016, null);
    }

    public final InvestmentSchedule getInvestmentSchedule() {
        return this.investmentSchedule;
    }

    public /* synthetic */ RecurringOrderBackupPaymentMethodViewState(InvestmentSchedule investmentSchedule, List list, AchRelationship achRelationship, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, List list2, PromptState promptState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentSchedule, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : achRelationship, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3, (i & 64) != 0 ? null : uiEvent4, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? PromptState.Unseen.INSTANCE : promptState, (i & 512) != 0 ? "" : str);
    }

    public final List<AchRelationship> getAchRelationships() {
        return this.achRelationships;
    }

    public final AchRelationship getSelectedRelationship() {
        return this.selectedRelationship;
    }

    public final UiEvent<Unit> getScheduleUpdatedEvent() {
        return this.scheduleUpdatedEvent;
    }

    public final UiEvent<Throwable> getScheduleUpdatedErrorEvent() {
        return this.scheduleUpdatedErrorEvent;
    }

    public final UiEvent<Unit> getApplyBackupPromptEvent() {
        return this.applyBackupPromptEvent;
    }

    public final UiEvent<Unit> getBackupPaymentRemovedEvent() {
        return this.backupPaymentRemovedEvent;
    }

    public final List<InvestmentSchedule> getBuyingPowerSchedulesWithoutBackup() {
        return this.buyingPowerSchedulesWithoutBackup;
    }

    public final PromptState getPromptState() {
        return this.promptState;
    }

    public final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: isEditing, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public final boolean getSourceOfFundsSelectedBtnEnabled() {
        return this.selectedRelationship != null;
    }

    public final boolean getSourceOfFundsDisclaimerTextVisible() {
        return this.selectedRelationship != null;
    }

    public final String getSourceOfFundsDisclaimerVisibilityText(Resources resources, boolean isCrypto) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!getSourceOfFundsDisclaimerTextVisible()) {
            return null;
        }
        if (isCrypto) {
            i = C11595R.string.recurring_backup_payment_method_disclaimer_crypto;
        } else {
            i = C11595R.string.recurring_backup_payment_method_disclaimer_equity;
        }
        return resources.getString(i);
    }

    public final boolean getShowPrompt() {
        return this.showPrompt;
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    public final String titleText(Resources resources) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.isEditing) {
            string2 = resources.getString(C11595R.string.recurring_backup_payment_method_edit_title);
        } else {
            string2 = resources.getString(C11595R.string.recurring_backup_payment_method_title);
        }
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final String promptTitle(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11595R.string.recurring_backup_payment_apply_to_all_prompt_title, resources.getQuantityString(C11595R.plurals.recurring_backup_payment_method_order, this.numberBuyingPowerSchedulesWithoutBackup));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String promptText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = C11595R.string.recurring_backup_payment_apply_to_all_prompt_text;
        AchRelationship achRelationship = this.selectedRelationship;
        String bankAccountNickname = achRelationship != null ? achRelationship.getBankAccountNickname() : null;
        AchRelationship achRelationship2 = this.selectedRelationship;
        String string2 = resources.getString(i, bankAccountNickname, achRelationship2 != null ? achRelationship2.getBankAccountNumber() : null, String.valueOf(this.numberBuyingPowerSchedulesWithoutBackup), resources.getQuantityString(C11595R.plurals.recurring_backup_payment_method_order, this.numberBuyingPowerSchedulesWithoutBackup), resources.getQuantityString(C11595R.plurals.recurring_backup_payment_method_use, this.numberBuyingPowerSchedulesWithoutBackup));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final String secondaryCtaText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!this.isEditing) {
            return resources.getString(C11595R.string.recurring_backup_payment_method_skip);
        }
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null || !investmentSchedule.isBackupAchEnabled()) {
            return null;
        }
        return resources.getString(C11595R.string.recurring_backup_payment_method_remove);
    }

    /* compiled from: RecurringOrderBackupPaymentMethodViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", "", "<init>", "()V", "Pending", "Seen", "Unseen", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Pending;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Seen;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Unseen;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PromptState {
        public static final int $stable = 0;

        public /* synthetic */ PromptState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: RecurringOrderBackupPaymentMethodViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Pending;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Pending extends PromptState {
            public static final int $stable = 0;
            public static final Pending INSTANCE = new Pending();

            private Pending() {
                super(null);
            }
        }

        private PromptState() {
        }

        /* compiled from: RecurringOrderBackupPaymentMethodViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Seen;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Seen extends PromptState {
            public static final int $stable = 0;
            public static final Seen INSTANCE = new Seen();

            private Seen() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderBackupPaymentMethodViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState$Unseen;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState$PromptState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Unseen extends PromptState {
            public static final int $stable = 0;
            public static final Unseen INSTANCE = new Unseen();

            private Unseen() {
                super(null);
            }
        }
    }
}
