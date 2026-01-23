package com.robinhood.shared.recurring.p392ui.insights;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.shared.recurring.p392ui.insights.InvestmentInsightsViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentInsightsDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;", "", "scheduleId", "Ljava/util/UUID;", "recurringInsightsPageResponse", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;", "error", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;Ljava/lang/Throwable;)V", "getScheduleId", "()Ljava/util/UUID;", "getRecurringInsightsPageResponse", "()Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Provider", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InvestmentInsightsDataState {
    private final Throwable error;
    private final RecurringInsightsPageResponse recurringInsightsPageResponse;
    private final UUID scheduleId;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ InvestmentInsightsDataState copy$default(InvestmentInsightsDataState investmentInsightsDataState, UUID uuid, RecurringInsightsPageResponse recurringInsightsPageResponse, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = investmentInsightsDataState.scheduleId;
        }
        if ((i & 2) != 0) {
            recurringInsightsPageResponse = investmentInsightsDataState.recurringInsightsPageResponse;
        }
        if ((i & 4) != 0) {
            th = investmentInsightsDataState.error;
        }
        return investmentInsightsDataState.copy(uuid, recurringInsightsPageResponse, th);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getScheduleId() {
        return this.scheduleId;
    }

    /* renamed from: component2, reason: from getter */
    public final RecurringInsightsPageResponse getRecurringInsightsPageResponse() {
        return this.recurringInsightsPageResponse;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final InvestmentInsightsDataState copy(UUID scheduleId, RecurringInsightsPageResponse recurringInsightsPageResponse, Throwable error) {
        Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
        return new InvestmentInsightsDataState(scheduleId, recurringInsightsPageResponse, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentInsightsDataState)) {
            return false;
        }
        InvestmentInsightsDataState investmentInsightsDataState = (InvestmentInsightsDataState) other;
        return Intrinsics.areEqual(this.scheduleId, investmentInsightsDataState.scheduleId) && Intrinsics.areEqual(this.recurringInsightsPageResponse, investmentInsightsDataState.recurringInsightsPageResponse) && Intrinsics.areEqual(this.error, investmentInsightsDataState.error);
    }

    public int hashCode() {
        int iHashCode = this.scheduleId.hashCode() * 31;
        RecurringInsightsPageResponse recurringInsightsPageResponse = this.recurringInsightsPageResponse;
        int iHashCode2 = (iHashCode + (recurringInsightsPageResponse == null ? 0 : recurringInsightsPageResponse.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "InvestmentInsightsDataState(scheduleId=" + this.scheduleId + ", recurringInsightsPageResponse=" + this.recurringInsightsPageResponse + ", error=" + this.error + ")";
    }

    public InvestmentInsightsDataState(UUID scheduleId, RecurringInsightsPageResponse recurringInsightsPageResponse, Throwable th) {
        Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
        this.scheduleId = scheduleId;
        this.recurringInsightsPageResponse = recurringInsightsPageResponse;
        this.error = th;
    }

    public /* synthetic */ InvestmentInsightsDataState(UUID uuid, RecurringInsightsPageResponse recurringInsightsPageResponse, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : recurringInsightsPageResponse, (i & 4) != 0 ? null : th);
    }

    public final UUID getScheduleId() {
        return this.scheduleId;
    }

    public final RecurringInsightsPageResponse getRecurringInsightsPageResponse() {
        return this.recurringInsightsPageResponse;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: InvestmentInsightsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDataState;", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "<init>", "()V", "reduce", "dataState", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<InvestmentInsightsDataState, InvestmentInsightsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public InvestmentInsightsViewState reduce(InvestmentInsightsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getRecurringInsightsPageResponse() == null) {
                return dataState.getError() != null ? new InvestmentInsightsViewState.Error(dataState.getError()) : InvestmentInsightsViewState.Loading.INSTANCE;
            }
            String string2 = dataState.getScheduleId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new InvestmentInsightsViewState.Loaded(string2, extensions2.toPersistentList(dataState.getRecurringInsightsPageResponse().getComponents()), dataState.getRecurringInsightsPageResponse().getMenu_button(), dataState.getRecurringInsightsPageResponse().getAsset_type() == ApiAssetType.CRYPTO);
        }
    }
}
