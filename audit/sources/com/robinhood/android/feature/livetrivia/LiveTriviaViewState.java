package com.robinhood.android.feature.livetrivia;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import trivia.p550v1.GetVideoViewModelResponseDto;

/* compiled from: LiveTriviaViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaViewState;", "", "triviaVideoViewModel", "Ltrivia/v1/GetVideoViewModelResponseDto;", "loading", "", "isVideoLoading", "<init>", "(Ltrivia/v1/GetVideoViewModelResponseDto;ZZ)V", "getTriviaVideoViewModel", "()Ltrivia/v1/GetVideoViewModelResponseDto;", "getLoading", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveTriviaViewState {
    public static final int $stable = 8;
    private final boolean isVideoLoading;
    private final boolean loading;
    private final GetVideoViewModelResponseDto triviaVideoViewModel;

    public LiveTriviaViewState() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ LiveTriviaViewState copy$default(LiveTriviaViewState liveTriviaViewState, GetVideoViewModelResponseDto getVideoViewModelResponseDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            getVideoViewModelResponseDto = liveTriviaViewState.triviaVideoViewModel;
        }
        if ((i & 2) != 0) {
            z = liveTriviaViewState.loading;
        }
        if ((i & 4) != 0) {
            z2 = liveTriviaViewState.isVideoLoading;
        }
        return liveTriviaViewState.copy(getVideoViewModelResponseDto, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final GetVideoViewModelResponseDto getTriviaVideoViewModel() {
        return this.triviaVideoViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVideoLoading() {
        return this.isVideoLoading;
    }

    public final LiveTriviaViewState copy(GetVideoViewModelResponseDto triviaVideoViewModel, boolean loading, boolean isVideoLoading) {
        return new LiveTriviaViewState(triviaVideoViewModel, loading, isVideoLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTriviaViewState)) {
            return false;
        }
        LiveTriviaViewState liveTriviaViewState = (LiveTriviaViewState) other;
        return Intrinsics.areEqual(this.triviaVideoViewModel, liveTriviaViewState.triviaVideoViewModel) && this.loading == liveTriviaViewState.loading && this.isVideoLoading == liveTriviaViewState.isVideoLoading;
    }

    public int hashCode() {
        GetVideoViewModelResponseDto getVideoViewModelResponseDto = this.triviaVideoViewModel;
        return ((((getVideoViewModelResponseDto == null ? 0 : getVideoViewModelResponseDto.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.isVideoLoading);
    }

    public String toString() {
        return "LiveTriviaViewState(triviaVideoViewModel=" + this.triviaVideoViewModel + ", loading=" + this.loading + ", isVideoLoading=" + this.isVideoLoading + ")";
    }

    public LiveTriviaViewState(GetVideoViewModelResponseDto getVideoViewModelResponseDto, boolean z, boolean z2) {
        this.triviaVideoViewModel = getVideoViewModelResponseDto;
        this.loading = z;
        this.isVideoLoading = z2;
    }

    public /* synthetic */ LiveTriviaViewState(GetVideoViewModelResponseDto getVideoViewModelResponseDto, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getVideoViewModelResponseDto, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }

    public final GetVideoViewModelResponseDto getTriviaVideoViewModel() {
        return this.triviaVideoViewModel;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean isVideoLoading() {
        return this.isVideoLoading;
    }
}
