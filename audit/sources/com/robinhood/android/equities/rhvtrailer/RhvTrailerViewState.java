package com.robinhood.android.equities.rhvtrailer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ventures.trailer.proto.p551v1.GetTrailerResponseDto;

/* compiled from: RhvTrailerViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerViewState;", "", "trailerData", "Lventures/trailer/proto/v1/GetTrailerResponseDto;", "hasShowEarlyExitBottomSheet", "", "<init>", "(Lventures/trailer/proto/v1/GetTrailerResponseDto;Z)V", "getTrailerData", "()Lventures/trailer/proto/v1/GetTrailerResponseDto;", "getHasShowEarlyExitBottomSheet", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhv-trailer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RhvTrailerViewState {
    public static final int $stable = 8;
    private final boolean hasShowEarlyExitBottomSheet;
    private final GetTrailerResponseDto trailerData;

    /* JADX WARN: Multi-variable type inference failed */
    public RhvTrailerViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhvTrailerViewState copy$default(RhvTrailerViewState rhvTrailerViewState, GetTrailerResponseDto getTrailerResponseDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            getTrailerResponseDto = rhvTrailerViewState.trailerData;
        }
        if ((i & 2) != 0) {
            z = rhvTrailerViewState.hasShowEarlyExitBottomSheet;
        }
        return rhvTrailerViewState.copy(getTrailerResponseDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final GetTrailerResponseDto getTrailerData() {
        return this.trailerData;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasShowEarlyExitBottomSheet() {
        return this.hasShowEarlyExitBottomSheet;
    }

    public final RhvTrailerViewState copy(GetTrailerResponseDto trailerData, boolean hasShowEarlyExitBottomSheet) {
        return new RhvTrailerViewState(trailerData, hasShowEarlyExitBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhvTrailerViewState)) {
            return false;
        }
        RhvTrailerViewState rhvTrailerViewState = (RhvTrailerViewState) other;
        return Intrinsics.areEqual(this.trailerData, rhvTrailerViewState.trailerData) && this.hasShowEarlyExitBottomSheet == rhvTrailerViewState.hasShowEarlyExitBottomSheet;
    }

    public int hashCode() {
        GetTrailerResponseDto getTrailerResponseDto = this.trailerData;
        return ((getTrailerResponseDto == null ? 0 : getTrailerResponseDto.hashCode()) * 31) + Boolean.hashCode(this.hasShowEarlyExitBottomSheet);
    }

    public String toString() {
        return "RhvTrailerViewState(trailerData=" + this.trailerData + ", hasShowEarlyExitBottomSheet=" + this.hasShowEarlyExitBottomSheet + ")";
    }

    public RhvTrailerViewState(GetTrailerResponseDto getTrailerResponseDto, boolean z) {
        this.trailerData = getTrailerResponseDto;
        this.hasShowEarlyExitBottomSheet = z;
    }

    public /* synthetic */ RhvTrailerViewState(GetTrailerResponseDto getTrailerResponseDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getTrailerResponseDto, (i & 2) != 0 ? false : z);
    }

    public final GetTrailerResponseDto getTrailerData() {
        return this.trailerData;
    }

    public final boolean getHasShowEarlyExitBottomSheet() {
        return this.hasShowEarlyExitBottomSheet;
    }
}
