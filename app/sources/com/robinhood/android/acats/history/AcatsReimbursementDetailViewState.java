package com.robinhood.android.acats.history;

import acats_aggregation.service.p001v1.FeeReimbursementsHistoryDetailsResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AcatsReimbursementDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;", "", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "reimbursementDetails", "j$/time/Instant", "completionDate", "<init>", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;Lj$/time/Instant;)V", "component1", "()Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "component2", "()Lj$/time/Instant;", "copy", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;Lj$/time/Instant;)Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "getReimbursementDetails", "Lj$/time/Instant;", "getCompletionDate", "feature-acats-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsReimbursementDetailViewState {
    public static final int $stable = 8;
    private final Instant completionDate;
    private final FeeReimbursementsHistoryDetailsResponseDto reimbursementDetails;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsReimbursementDetailViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcatsReimbursementDetailViewState copy$default(AcatsReimbursementDetailViewState acatsReimbursementDetailViewState, FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            feeReimbursementsHistoryDetailsResponseDto = acatsReimbursementDetailViewState.reimbursementDetails;
        }
        if ((i & 2) != 0) {
            instant = acatsReimbursementDetailViewState.completionDate;
        }
        return acatsReimbursementDetailViewState.copy(feeReimbursementsHistoryDetailsResponseDto, instant);
    }

    /* renamed from: component1, reason: from getter */
    public final FeeReimbursementsHistoryDetailsResponseDto getReimbursementDetails() {
        return this.reimbursementDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getCompletionDate() {
        return this.completionDate;
    }

    public final AcatsReimbursementDetailViewState copy(FeeReimbursementsHistoryDetailsResponseDto reimbursementDetails, Instant completionDate) {
        return new AcatsReimbursementDetailViewState(reimbursementDetails, completionDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsReimbursementDetailViewState)) {
            return false;
        }
        AcatsReimbursementDetailViewState acatsReimbursementDetailViewState = (AcatsReimbursementDetailViewState) other;
        return Intrinsics.areEqual(this.reimbursementDetails, acatsReimbursementDetailViewState.reimbursementDetails) && Intrinsics.areEqual(this.completionDate, acatsReimbursementDetailViewState.completionDate);
    }

    public int hashCode() {
        FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto = this.reimbursementDetails;
        int iHashCode = (feeReimbursementsHistoryDetailsResponseDto == null ? 0 : feeReimbursementsHistoryDetailsResponseDto.hashCode()) * 31;
        Instant instant = this.completionDate;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "AcatsReimbursementDetailViewState(reimbursementDetails=" + this.reimbursementDetails + ", completionDate=" + this.completionDate + ")";
    }

    public AcatsReimbursementDetailViewState(FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, Instant instant) {
        this.reimbursementDetails = feeReimbursementsHistoryDetailsResponseDto;
        this.completionDate = instant;
    }

    public /* synthetic */ AcatsReimbursementDetailViewState(FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : feeReimbursementsHistoryDetailsResponseDto, (i & 2) != 0 ? null : instant);
    }

    public final FeeReimbursementsHistoryDetailsResponseDto getReimbursementDetails() {
        return this.reimbursementDetails;
    }

    public final Instant getCompletionDate() {
        return this.completionDate;
    }
}
