package com.robinhood.android.gold.eoy2025;

import eoy_giveaway.p456v1.GetProgramViewModelResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eoy2025ViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025ViewState;", "", "backgroundCountdownUrl", "", "loading", "", "showOverlay", "closeButtonLocation", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "calendarButtonLocation", "showPendingGiftIndicator", "<init>", "(Ljava/lang/String;ZZLeoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Z)V", "getBackgroundCountdownUrl", "()Ljava/lang/String;", "getLoading", "()Z", "getShowOverlay", "getCloseButtonLocation", "()Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "getCalendarButtonLocation", "getShowPendingGiftIndicator", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Eoy2025ViewState {
    public static final int $stable = 0;
    private final String backgroundCountdownUrl;
    private final GetProgramViewModelResponseDto.CloseButtonLocationDto calendarButtonLocation;
    private final GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocation;
    private final boolean loading;
    private final boolean showOverlay;
    private final boolean showPendingGiftIndicator;

    public Eoy2025ViewState() {
        this(null, false, false, null, null, false, 63, null);
    }

    public static /* synthetic */ Eoy2025ViewState copy$default(Eoy2025ViewState eoy2025ViewState, String str, boolean z, boolean z2, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eoy2025ViewState.backgroundCountdownUrl;
        }
        if ((i & 2) != 0) {
            z = eoy2025ViewState.loading;
        }
        if ((i & 4) != 0) {
            z2 = eoy2025ViewState.showOverlay;
        }
        if ((i & 8) != 0) {
            closeButtonLocationDto = eoy2025ViewState.closeButtonLocation;
        }
        if ((i & 16) != 0) {
            closeButtonLocationDto2 = eoy2025ViewState.calendarButtonLocation;
        }
        if ((i & 32) != 0) {
            z3 = eoy2025ViewState.showPendingGiftIndicator;
        }
        GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto3 = closeButtonLocationDto2;
        boolean z4 = z3;
        return eoy2025ViewState.copy(str, z, z2, closeButtonLocationDto, closeButtonLocationDto3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundCountdownUrl() {
        return this.backgroundCountdownUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowOverlay() {
        return this.showOverlay;
    }

    /* renamed from: component4, reason: from getter */
    public final GetProgramViewModelResponseDto.CloseButtonLocationDto getCloseButtonLocation() {
        return this.closeButtonLocation;
    }

    /* renamed from: component5, reason: from getter */
    public final GetProgramViewModelResponseDto.CloseButtonLocationDto getCalendarButtonLocation() {
        return this.calendarButtonLocation;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowPendingGiftIndicator() {
        return this.showPendingGiftIndicator;
    }

    public final Eoy2025ViewState copy(String backgroundCountdownUrl, boolean loading, boolean showOverlay, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocation, GetProgramViewModelResponseDto.CloseButtonLocationDto calendarButtonLocation, boolean showPendingGiftIndicator) {
        Intrinsics.checkNotNullParameter(backgroundCountdownUrl, "backgroundCountdownUrl");
        Intrinsics.checkNotNullParameter(closeButtonLocation, "closeButtonLocation");
        Intrinsics.checkNotNullParameter(calendarButtonLocation, "calendarButtonLocation");
        return new Eoy2025ViewState(backgroundCountdownUrl, loading, showOverlay, closeButtonLocation, calendarButtonLocation, showPendingGiftIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Eoy2025ViewState)) {
            return false;
        }
        Eoy2025ViewState eoy2025ViewState = (Eoy2025ViewState) other;
        return Intrinsics.areEqual(this.backgroundCountdownUrl, eoy2025ViewState.backgroundCountdownUrl) && this.loading == eoy2025ViewState.loading && this.showOverlay == eoy2025ViewState.showOverlay && this.closeButtonLocation == eoy2025ViewState.closeButtonLocation && this.calendarButtonLocation == eoy2025ViewState.calendarButtonLocation && this.showPendingGiftIndicator == eoy2025ViewState.showPendingGiftIndicator;
    }

    public int hashCode() {
        return (((((((((this.backgroundCountdownUrl.hashCode() * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.showOverlay)) * 31) + this.closeButtonLocation.hashCode()) * 31) + this.calendarButtonLocation.hashCode()) * 31) + Boolean.hashCode(this.showPendingGiftIndicator);
    }

    public String toString() {
        return "Eoy2025ViewState(backgroundCountdownUrl=" + this.backgroundCountdownUrl + ", loading=" + this.loading + ", showOverlay=" + this.showOverlay + ", closeButtonLocation=" + this.closeButtonLocation + ", calendarButtonLocation=" + this.calendarButtonLocation + ", showPendingGiftIndicator=" + this.showPendingGiftIndicator + ")";
    }

    public Eoy2025ViewState(String backgroundCountdownUrl, boolean z, boolean z2, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocation, GetProgramViewModelResponseDto.CloseButtonLocationDto calendarButtonLocation, boolean z3) {
        Intrinsics.checkNotNullParameter(backgroundCountdownUrl, "backgroundCountdownUrl");
        Intrinsics.checkNotNullParameter(closeButtonLocation, "closeButtonLocation");
        Intrinsics.checkNotNullParameter(calendarButtonLocation, "calendarButtonLocation");
        this.backgroundCountdownUrl = backgroundCountdownUrl;
        this.loading = z;
        this.showOverlay = z2;
        this.closeButtonLocation = closeButtonLocation;
        this.calendarButtonLocation = calendarButtonLocation;
        this.showPendingGiftIndicator = z3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Eoy2025ViewState(java.lang.String r2, boolean r3, boolean r4, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r5, eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            r3 = 1
        Lb:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r5 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.HIDDEN
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1d
            eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto r6 = eoy_giveaway.v1.GetProgramViewModelResponseDto.CloseButtonLocationDto.HIDDEN
        L1d:
            r8 = r8 & 32
            if (r8 == 0) goto L29
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L30
        L29:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L30:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.eoy2025.Eoy2025ViewState.<init>(java.lang.String, boolean, boolean, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, eoy_giveaway.v1.GetProgramViewModelResponseDto$CloseButtonLocationDto, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBackgroundCountdownUrl() {
        return this.backgroundCountdownUrl;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShowOverlay() {
        return this.showOverlay;
    }

    public final GetProgramViewModelResponseDto.CloseButtonLocationDto getCloseButtonLocation() {
        return this.closeButtonLocation;
    }

    public final GetProgramViewModelResponseDto.CloseButtonLocationDto getCalendarButtonLocation() {
        return this.calendarButtonLocation;
    }

    public final boolean getShowPendingGiftIndicator() {
        return this.showPendingGiftIndicator;
    }
}
