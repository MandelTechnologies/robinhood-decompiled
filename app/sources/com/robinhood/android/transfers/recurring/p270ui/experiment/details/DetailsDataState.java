package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import com.robinhood.models.p355ui.UiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailsDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J[\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDataState;", "", "uiAutomaticDeposit", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "isCancelDialogVisible", "", "isCancelConfirmationDialogVisible", "isPauseDialogVisible", "isResumeConfirmationDialogVisible", "isCancelRequestInFlight", "isResumeRequestInFlight", "isPauseRequestInFlight", "<init>", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;ZZZZZZZ)V", "getUiAutomaticDeposit", "()Lcom/robinhood/models/ui/UiAutomaticDeposit;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsDataState {
    public static final int $stable = 8;
    private final boolean isCancelConfirmationDialogVisible;
    private final boolean isCancelDialogVisible;
    private final boolean isCancelRequestInFlight;
    private final boolean isPauseDialogVisible;
    private final boolean isPauseRequestInFlight;
    private final boolean isResumeConfirmationDialogVisible;
    private final boolean isResumeRequestInFlight;
    private final UiAutomaticDeposit uiAutomaticDeposit;

    public DetailsDataState() {
        this(null, false, false, false, false, false, false, false, 255, null);
    }

    public static /* synthetic */ DetailsDataState copy$default(DetailsDataState detailsDataState, UiAutomaticDeposit uiAutomaticDeposit, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAutomaticDeposit = detailsDataState.uiAutomaticDeposit;
        }
        if ((i & 2) != 0) {
            z = detailsDataState.isCancelDialogVisible;
        }
        if ((i & 4) != 0) {
            z2 = detailsDataState.isCancelConfirmationDialogVisible;
        }
        if ((i & 8) != 0) {
            z3 = detailsDataState.isPauseDialogVisible;
        }
        if ((i & 16) != 0) {
            z4 = detailsDataState.isResumeConfirmationDialogVisible;
        }
        if ((i & 32) != 0) {
            z5 = detailsDataState.isCancelRequestInFlight;
        }
        if ((i & 64) != 0) {
            z6 = detailsDataState.isResumeRequestInFlight;
        }
        if ((i & 128) != 0) {
            z7 = detailsDataState.isPauseRequestInFlight;
        }
        boolean z8 = z6;
        boolean z9 = z7;
        boolean z10 = z4;
        boolean z11 = z5;
        return detailsDataState.copy(uiAutomaticDeposit, z, z2, z3, z10, z11, z8, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAutomaticDeposit getUiAutomaticDeposit() {
        return this.uiAutomaticDeposit;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCancelDialogVisible() {
        return this.isCancelDialogVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCancelConfirmationDialogVisible() {
        return this.isCancelConfirmationDialogVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPauseDialogVisible() {
        return this.isPauseDialogVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsResumeConfirmationDialogVisible() {
        return this.isResumeConfirmationDialogVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsResumeRequestInFlight() {
        return this.isResumeRequestInFlight;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPauseRequestInFlight() {
        return this.isPauseRequestInFlight;
    }

    public final DetailsDataState copy(UiAutomaticDeposit uiAutomaticDeposit, boolean isCancelDialogVisible, boolean isCancelConfirmationDialogVisible, boolean isPauseDialogVisible, boolean isResumeConfirmationDialogVisible, boolean isCancelRequestInFlight, boolean isResumeRequestInFlight, boolean isPauseRequestInFlight) {
        return new DetailsDataState(uiAutomaticDeposit, isCancelDialogVisible, isCancelConfirmationDialogVisible, isPauseDialogVisible, isResumeConfirmationDialogVisible, isCancelRequestInFlight, isResumeRequestInFlight, isPauseRequestInFlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsDataState)) {
            return false;
        }
        DetailsDataState detailsDataState = (DetailsDataState) other;
        return Intrinsics.areEqual(this.uiAutomaticDeposit, detailsDataState.uiAutomaticDeposit) && this.isCancelDialogVisible == detailsDataState.isCancelDialogVisible && this.isCancelConfirmationDialogVisible == detailsDataState.isCancelConfirmationDialogVisible && this.isPauseDialogVisible == detailsDataState.isPauseDialogVisible && this.isResumeConfirmationDialogVisible == detailsDataState.isResumeConfirmationDialogVisible && this.isCancelRequestInFlight == detailsDataState.isCancelRequestInFlight && this.isResumeRequestInFlight == detailsDataState.isResumeRequestInFlight && this.isPauseRequestInFlight == detailsDataState.isPauseRequestInFlight;
    }

    public int hashCode() {
        UiAutomaticDeposit uiAutomaticDeposit = this.uiAutomaticDeposit;
        return ((((((((((((((uiAutomaticDeposit == null ? 0 : uiAutomaticDeposit.hashCode()) * 31) + Boolean.hashCode(this.isCancelDialogVisible)) * 31) + Boolean.hashCode(this.isCancelConfirmationDialogVisible)) * 31) + Boolean.hashCode(this.isPauseDialogVisible)) * 31) + Boolean.hashCode(this.isResumeConfirmationDialogVisible)) * 31) + Boolean.hashCode(this.isCancelRequestInFlight)) * 31) + Boolean.hashCode(this.isResumeRequestInFlight)) * 31) + Boolean.hashCode(this.isPauseRequestInFlight);
    }

    public String toString() {
        return "DetailsDataState(uiAutomaticDeposit=" + this.uiAutomaticDeposit + ", isCancelDialogVisible=" + this.isCancelDialogVisible + ", isCancelConfirmationDialogVisible=" + this.isCancelConfirmationDialogVisible + ", isPauseDialogVisible=" + this.isPauseDialogVisible + ", isResumeConfirmationDialogVisible=" + this.isResumeConfirmationDialogVisible + ", isCancelRequestInFlight=" + this.isCancelRequestInFlight + ", isResumeRequestInFlight=" + this.isResumeRequestInFlight + ", isPauseRequestInFlight=" + this.isPauseRequestInFlight + ")";
    }

    public DetailsDataState(UiAutomaticDeposit uiAutomaticDeposit, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.uiAutomaticDeposit = uiAutomaticDeposit;
        this.isCancelDialogVisible = z;
        this.isCancelConfirmationDialogVisible = z2;
        this.isPauseDialogVisible = z3;
        this.isResumeConfirmationDialogVisible = z4;
        this.isCancelRequestInFlight = z5;
        this.isResumeRequestInFlight = z6;
        this.isPauseRequestInFlight = z7;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DetailsDataState(com.robinhood.models.p355ui.UiAutomaticDeposit r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 0
        L5:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 8
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r11 = r10 & 16
            if (r11 == 0) goto L1a
            r6 = r0
        L1a:
            r11 = r10 & 32
            if (r11 == 0) goto L1f
            r7 = r0
        L1f:
            r11 = r10 & 64
            if (r11 == 0) goto L24
            r8 = r0
        L24:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L32
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3b
        L32:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsDataState.<init>(com.robinhood.models.ui.UiAutomaticDeposit, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UiAutomaticDeposit getUiAutomaticDeposit() {
        return this.uiAutomaticDeposit;
    }

    public final boolean isCancelDialogVisible() {
        return this.isCancelDialogVisible;
    }

    public final boolean isCancelConfirmationDialogVisible() {
        return this.isCancelConfirmationDialogVisible;
    }

    public final boolean isPauseDialogVisible() {
        return this.isPauseDialogVisible;
    }

    public final boolean isResumeConfirmationDialogVisible() {
        return this.isResumeConfirmationDialogVisible;
    }

    public final boolean isCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final boolean isResumeRequestInFlight() {
        return this.isResumeRequestInFlight;
    }

    public final boolean isPauseRequestInFlight() {
        return this.isPauseRequestInFlight;
    }
}
