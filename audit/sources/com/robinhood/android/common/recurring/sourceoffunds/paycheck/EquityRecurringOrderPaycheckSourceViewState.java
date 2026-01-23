package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RecurringOrderPaycheckSourceViewState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00102\u001a\u00020\u0003HÂ\u0003J\t\u00103\u001a\u00020\u0005HÂ\u0003J\t\u00104\u001a\u00020\u0007HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÂ\u0003J\t\u00107\u001a\u00020\u000eHÂ\u0003J\u001b\u00108\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011\u0018\u00010\u0010HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0018\u00010\u0010HÆ\u0003J\u0081\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010,¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/EquityRecurringOrderPaycheckSourceViewState;", "", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "userSelectedDirectDepositRelationshipId", "Ljava/util/UUID;", "directDepositRelationships", "", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "isLoading", "", "editResultEvent", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/SuccessfulEditEvent;", "selectionResultEvent", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/SuccessfulSelectionEvent;", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getEditResultEvent", "()Lcom/robinhood/udf/UiEvent;", "getSelectionResultEvent", "selectedDirectDepositRelationshipId", "getSelectedDirectDepositRelationshipId", "()Ljava/util/UUID;", "selectedDirectDepositRelationship", "getSelectedDirectDepositRelationship", "()Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "recurringContext", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getRecurringContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "recurringContext$delegate", "Lkotlin/Lazy;", "directDepositRelationshipRowStates", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/DirectDepositRelationshipRowState;", "getDirectDepositRelationshipRowStates", "()Ljava/util/List;", "isPaycheckSourceSelectedButtonEnabled", "()Z", "paycheckSourceSelectedButtonAction", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/ButtonAction;", "getPaycheckSourceSelectedButtonAction", "()Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/ButtonAction;", "isPaycheckSourceSelectedButtonLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class EquityRecurringOrderPaycheckSourceViewState {
    public static final int $stable = 8;
    private final RecurringOrderActionType actionType;
    private final List<DirectDepositRelationship> directDepositRelationships;
    private final UiEvent<Result<Unit>> editResultEvent;
    private final InvestmentTarget investmentTarget;
    private final boolean isLoading;
    private final String loggingSource;

    /* renamed from: recurringContext$delegate, reason: from kotlin metadata */
    private final Lazy recurringContext;
    private final UUID selectedDirectDepositRelationshipId;
    private final UiEvent<Result<SuccessfulSelectionEvent>> selectionResultEvent;
    private final UUID userSelectedDirectDepositRelationshipId;

    /* renamed from: component1, reason: from getter */
    private final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /* renamed from: component2, reason: from getter */
    private final RecurringOrderActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component3, reason: from getter */
    private final String getLoggingSource() {
        return this.loggingSource;
    }

    /* renamed from: component4, reason: from getter */
    private final UUID getUserSelectedDirectDepositRelationshipId() {
        return this.userSelectedDirectDepositRelationshipId;
    }

    private final List<DirectDepositRelationship> component5() {
        return this.directDepositRelationships;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ EquityRecurringOrderPaycheckSourceViewState copy$default(EquityRecurringOrderPaycheckSourceViewState equityRecurringOrderPaycheckSourceViewState, InvestmentTarget investmentTarget, RecurringOrderActionType recurringOrderActionType, String str, UUID uuid, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentTarget = equityRecurringOrderPaycheckSourceViewState.investmentTarget;
        }
        if ((i & 2) != 0) {
            recurringOrderActionType = equityRecurringOrderPaycheckSourceViewState.actionType;
        }
        if ((i & 4) != 0) {
            str = equityRecurringOrderPaycheckSourceViewState.loggingSource;
        }
        if ((i & 8) != 0) {
            uuid = equityRecurringOrderPaycheckSourceViewState.userSelectedDirectDepositRelationshipId;
        }
        if ((i & 16) != 0) {
            list = equityRecurringOrderPaycheckSourceViewState.directDepositRelationships;
        }
        if ((i & 32) != 0) {
            z = equityRecurringOrderPaycheckSourceViewState.isLoading;
        }
        if ((i & 64) != 0) {
            uiEvent = equityRecurringOrderPaycheckSourceViewState.editResultEvent;
        }
        if ((i & 128) != 0) {
            uiEvent2 = equityRecurringOrderPaycheckSourceViewState.selectionResultEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        List list2 = list;
        boolean z2 = z;
        return equityRecurringOrderPaycheckSourceViewState.copy(investmentTarget, recurringOrderActionType, str, uuid, list2, z2, uiEvent3, uiEvent4);
    }

    public final UiEvent<Result<Unit>> component7() {
        return this.editResultEvent;
    }

    public final UiEvent<Result<SuccessfulSelectionEvent>> component8() {
        return this.selectionResultEvent;
    }

    public final EquityRecurringOrderPaycheckSourceViewState copy(InvestmentTarget investmentTarget, RecurringOrderActionType actionType, String loggingSource, UUID userSelectedDirectDepositRelationshipId, List<DirectDepositRelationship> directDepositRelationships, boolean isLoading, UiEvent<Result<Unit>> editResultEvent, UiEvent<Result<SuccessfulSelectionEvent>> selectionResultEvent) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(directDepositRelationships, "directDepositRelationships");
        return new EquityRecurringOrderPaycheckSourceViewState(investmentTarget, actionType, loggingSource, userSelectedDirectDepositRelationshipId, directDepositRelationships, isLoading, editResultEvent, selectionResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityRecurringOrderPaycheckSourceViewState)) {
            return false;
        }
        EquityRecurringOrderPaycheckSourceViewState equityRecurringOrderPaycheckSourceViewState = (EquityRecurringOrderPaycheckSourceViewState) other;
        return Intrinsics.areEqual(this.investmentTarget, equityRecurringOrderPaycheckSourceViewState.investmentTarget) && Intrinsics.areEqual(this.actionType, equityRecurringOrderPaycheckSourceViewState.actionType) && Intrinsics.areEqual(this.loggingSource, equityRecurringOrderPaycheckSourceViewState.loggingSource) && Intrinsics.areEqual(this.userSelectedDirectDepositRelationshipId, equityRecurringOrderPaycheckSourceViewState.userSelectedDirectDepositRelationshipId) && Intrinsics.areEqual(this.directDepositRelationships, equityRecurringOrderPaycheckSourceViewState.directDepositRelationships) && this.isLoading == equityRecurringOrderPaycheckSourceViewState.isLoading && Intrinsics.areEqual(this.editResultEvent, equityRecurringOrderPaycheckSourceViewState.editResultEvent) && Intrinsics.areEqual(this.selectionResultEvent, equityRecurringOrderPaycheckSourceViewState.selectionResultEvent);
    }

    public int hashCode() {
        int iHashCode = ((((this.investmentTarget.hashCode() * 31) + this.actionType.hashCode()) * 31) + this.loggingSource.hashCode()) * 31;
        UUID uuid = this.userSelectedDirectDepositRelationshipId;
        int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.directDepositRelationships.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Result<Unit>> uiEvent = this.editResultEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Result<SuccessfulSelectionEvent>> uiEvent2 = this.selectionResultEvent;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "EquityRecurringOrderPaycheckSourceViewState(investmentTarget=" + this.investmentTarget + ", actionType=" + this.actionType + ", loggingSource=" + this.loggingSource + ", userSelectedDirectDepositRelationshipId=" + this.userSelectedDirectDepositRelationshipId + ", directDepositRelationships=" + this.directDepositRelationships + ", isLoading=" + this.isLoading + ", editResultEvent=" + this.editResultEvent + ", selectionResultEvent=" + this.selectionResultEvent + ")";
    }

    public EquityRecurringOrderPaycheckSourceViewState(InvestmentTarget investmentTarget, RecurringOrderActionType actionType, String loggingSource, UUID uuid, List<DirectDepositRelationship> directDepositRelationships, boolean z, UiEvent<Result<Unit>> uiEvent, UiEvent<Result<SuccessfulSelectionEvent>> uiEvent2) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        Intrinsics.checkNotNullParameter(directDepositRelationships, "directDepositRelationships");
        this.investmentTarget = investmentTarget;
        this.actionType = actionType;
        this.loggingSource = loggingSource;
        this.userSelectedDirectDepositRelationshipId = uuid;
        this.directDepositRelationships = directDepositRelationships;
        this.isLoading = z;
        this.editResultEvent = uiEvent;
        this.selectionResultEvent = uiEvent2;
        this.selectedDirectDepositRelationshipId = directDepositRelationships.size() == 1 ? ((DirectDepositRelationship) CollectionsKt.first((List) directDepositRelationships)).getId() : uuid;
        this.recurringContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.EquityRecurringOrderPaycheckSourceViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityRecurringOrderPaycheckSourceViewState.recurringContext_delegate$lambda$1(this.f$0);
            }
        });
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquityRecurringOrderPaycheckSourceViewState(com.robinhood.recurring.models.p365db.InvestmentTarget r10, com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType r11, java.lang.String r12, java.util.UUID r13, java.util.List r14, boolean r15, com.robinhood.udf.UiEvent r16, com.robinhood.udf.UiEvent r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 4
            if (r1 == 0) goto L8
            java.lang.String r12 = ""
        L8:
            r3 = r12
            r12 = r0 & 8
            r1 = 0
            if (r12 == 0) goto L10
            r4 = r1
            goto L11
        L10:
            r4 = r13
        L11:
            r12 = r0 & 16
            if (r12 == 0) goto L1b
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            r5 = r12
            goto L1c
        L1b:
            r5 = r14
        L1c:
            r12 = r0 & 32
            if (r12 == 0) goto L23
            r12 = 0
            r6 = r12
            goto L24
        L23:
            r6 = r15
        L24:
            r12 = r0 & 64
            if (r12 == 0) goto L2a
            r7 = r1
            goto L2c
        L2a:
            r7 = r16
        L2c:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L35
            r8 = r1
            r0 = r9
            r2 = r11
            r1 = r10
            goto L3a
        L35:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
        L3a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.recurring.sourceoffunds.paycheck.EquityRecurringOrderPaycheckSourceViewState.<init>(com.robinhood.recurring.models.db.InvestmentTarget, com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType, java.lang.String, java.util.UUID, java.util.List, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UiEvent<Result<Unit>> getEditResultEvent() {
        return this.editResultEvent;
    }

    public final UiEvent<Result<SuccessfulSelectionEvent>> getSelectionResultEvent() {
        return this.selectionResultEvent;
    }

    public final UUID getSelectedDirectDepositRelationshipId() {
        return this.selectedDirectDepositRelationshipId;
    }

    public final DirectDepositRelationship getSelectedDirectDepositRelationship() {
        Object next;
        Iterator<T> it = this.directDepositRelationships.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UUID id = ((DirectDepositRelationship) next).getId();
            UUID uuid = this.selectedDirectDepositRelationshipId;
            Intrinsics.checkNotNull(uuid);
            if (Intrinsics.areEqual(id, uuid)) {
                break;
            }
        }
        return (DirectDepositRelationship) next;
    }

    public final RecurringContext getRecurringContext() {
        return (RecurringContext) this.recurringContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringContext recurringContext_delegate$lambda$1(EquityRecurringOrderPaycheckSourceViewState equityRecurringOrderPaycheckSourceViewState) {
        RecurringContext.FlowType flowType;
        RecurringContext.EntryPoint entryPoint;
        RecurringOrderActionType recurringOrderActionType = equityRecurringOrderPaycheckSourceViewState.actionType;
        if (Intrinsics.areEqual(recurringOrderActionType, RecurringOrderActionType.Create.INSTANCE)) {
            flowType = RecurringContext.FlowType.CREATE;
        } else {
            if (!(recurringOrderActionType instanceof RecurringOrderActionType.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            flowType = RecurringContext.FlowType.EDIT;
        }
        RecurringContext.FlowType flowType2 = flowType;
        RecurringContext.RecurringFundsSource recurringFundsSource = RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT;
        RecurringContext.ScheduleFrequency scheduleFrequency = RecurringContext.ScheduleFrequency.PAYCHECK;
        if (!StringsKt.isBlank(equityRecurringOrderPaycheckSourceViewState.loggingSource)) {
            entryPoint = RecurringContext.EntryPoint.COMMS;
        } else {
            entryPoint = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        RecurringContext.EntryPoint entryPoint2 = entryPoint;
        String str = equityRecurringOrderPaycheckSourceViewState.loggingSource;
        RecurringContext.AssetType protobuf = Recurring2.toProtobuf(equityRecurringOrderPaycheckSourceViewState.investmentTarget.getTargetType());
        UUID uuid = equityRecurringOrderPaycheckSourceViewState.selectedDirectDepositRelationshipId;
        Intrinsics.checkNotNull(uuid);
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new RecurringContext(flowType2, entryPoint2, str, scheduleFrequency, recurringFundsSource, 0.0d, protobuf, null, 0.0d, string2, null, 1440, null);
    }

    public final List<DirectDepositRelationshipRowState> getDirectDepositRelationshipRowStates() {
        List<DirectDepositRelationship> list = this.directDepositRelationships;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DirectDepositRelationshipRowState(this.selectedDirectDepositRelationshipId, (DirectDepositRelationship) it.next(), this.isLoading));
        }
        return arrayList;
    }

    public final boolean isPaycheckSourceSelectedButtonEnabled() {
        return this.selectedDirectDepositRelationshipId != null;
    }

    public final RecurringOrderPaycheckSourceViewState getPaycheckSourceSelectedButtonAction() {
        RecurringOrderActionType recurringOrderActionType = this.actionType;
        if (Intrinsics.areEqual(recurringOrderActionType, RecurringOrderActionType.Create.INSTANCE)) {
            return RecurringOrderPaycheckSourceViewState.CONTINUE;
        }
        if (recurringOrderActionType instanceof RecurringOrderActionType.Edit) {
            return RecurringOrderPaycheckSourceViewState.EDIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isPaycheckSourceSelectedButtonLoading() {
        return this.isLoading;
    }
}
