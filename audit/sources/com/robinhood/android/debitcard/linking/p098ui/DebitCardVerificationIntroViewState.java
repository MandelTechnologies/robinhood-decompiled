package com.robinhood.android.debitcard.linking.p098ui;

import android.text.Spanned;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationIntroViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÂ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0017HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroViewState;", "", "isLoading", "", "titleVisibilityText", "", "subtitleVisibilityText", "Landroid/text/Spanned;", "isPrepareRequestInProgress", "prepareSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "prepareFailureEvent", "", "<init>", "(ZLjava/lang/String;Landroid/text/Spanned;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getTitleVisibilityText", "()Ljava/lang/String;", "getSubtitleVisibilityText", "()Landroid/text/Spanned;", "getPrepareSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getPrepareFailureEvent", "contentVisibility", "", "getContentVisibility", "()I", "isPrimaryButtonLoading", "()Z", "isSecondaryButtonLoading", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitCardVerificationIntroViewState {
    public static final int $stable = 8;
    private final int contentVisibility;
    private final boolean isLoading;
    private final boolean isPrepareRequestInProgress;
    private final boolean isPrimaryButtonLoading;
    private final boolean isSecondaryButtonLoading;
    private final UiEvent<Throwable> prepareFailureEvent;
    private final UiEvent<String> prepareSuccessEvent;
    private final Spanned subtitleVisibilityText;
    private final String titleVisibilityText;

    public DebitCardVerificationIntroViewState() {
        this(false, null, null, false, null, null, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsPrepareRequestInProgress() {
        return this.isPrepareRequestInProgress;
    }

    public static /* synthetic */ DebitCardVerificationIntroViewState copy$default(DebitCardVerificationIntroViewState debitCardVerificationIntroViewState, boolean z, String str, Spanned spanned, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = debitCardVerificationIntroViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = debitCardVerificationIntroViewState.titleVisibilityText;
        }
        if ((i & 4) != 0) {
            spanned = debitCardVerificationIntroViewState.subtitleVisibilityText;
        }
        if ((i & 8) != 0) {
            z2 = debitCardVerificationIntroViewState.isPrepareRequestInProgress;
        }
        if ((i & 16) != 0) {
            uiEvent = debitCardVerificationIntroViewState.prepareSuccessEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = debitCardVerificationIntroViewState.prepareFailureEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return debitCardVerificationIntroViewState.copy(z, str, spanned, z2, uiEvent3, uiEvent4);
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleVisibilityText() {
        return this.titleVisibilityText;
    }

    /* renamed from: component3, reason: from getter */
    public final Spanned getSubtitleVisibilityText() {
        return this.subtitleVisibilityText;
    }

    public final UiEvent<String> component5() {
        return this.prepareSuccessEvent;
    }

    public final UiEvent<Throwable> component6() {
        return this.prepareFailureEvent;
    }

    public final DebitCardVerificationIntroViewState copy(boolean isLoading, String titleVisibilityText, Spanned subtitleVisibilityText, boolean isPrepareRequestInProgress, UiEvent<String> prepareSuccessEvent, UiEvent<Throwable> prepareFailureEvent) {
        return new DebitCardVerificationIntroViewState(isLoading, titleVisibilityText, subtitleVisibilityText, isPrepareRequestInProgress, prepareSuccessEvent, prepareFailureEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebitCardVerificationIntroViewState)) {
            return false;
        }
        DebitCardVerificationIntroViewState debitCardVerificationIntroViewState = (DebitCardVerificationIntroViewState) other;
        return this.isLoading == debitCardVerificationIntroViewState.isLoading && Intrinsics.areEqual(this.titleVisibilityText, debitCardVerificationIntroViewState.titleVisibilityText) && Intrinsics.areEqual(this.subtitleVisibilityText, debitCardVerificationIntroViewState.subtitleVisibilityText) && this.isPrepareRequestInProgress == debitCardVerificationIntroViewState.isPrepareRequestInProgress && Intrinsics.areEqual(this.prepareSuccessEvent, debitCardVerificationIntroViewState.prepareSuccessEvent) && Intrinsics.areEqual(this.prepareFailureEvent, debitCardVerificationIntroViewState.prepareFailureEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.titleVisibilityText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Spanned spanned = this.subtitleVisibilityText;
        int iHashCode3 = (((iHashCode2 + (spanned == null ? 0 : spanned.hashCode())) * 31) + Boolean.hashCode(this.isPrepareRequestInProgress)) * 31;
        UiEvent<String> uiEvent = this.prepareSuccessEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.prepareFailureEvent;
        return iHashCode4 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.isLoading;
        String str = this.titleVisibilityText;
        Spanned spanned = this.subtitleVisibilityText;
        return "DebitCardVerificationIntroViewState(isLoading=" + z + ", titleVisibilityText=" + str + ", subtitleVisibilityText=" + ((Object) spanned) + ", isPrepareRequestInProgress=" + this.isPrepareRequestInProgress + ", prepareSuccessEvent=" + this.prepareSuccessEvent + ", prepareFailureEvent=" + this.prepareFailureEvent + ")";
    }

    public DebitCardVerificationIntroViewState(boolean z, String str, Spanned spanned, boolean z2, UiEvent<String> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.isLoading = z;
        this.titleVisibilityText = str;
        this.subtitleVisibilityText = spanned;
        this.isPrepareRequestInProgress = z2;
        this.prepareSuccessEvent = uiEvent;
        this.prepareFailureEvent = uiEvent2;
        this.contentVisibility = (z || str == null || spanned == null) ? 4 : 0;
        this.isPrimaryButtonLoading = z || z2;
        this.isSecondaryButtonLoading = z || z2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DebitCardVerificationIntroViewState(boolean r2, java.lang.String r3, android.text.Spanned r4, boolean r5, com.robinhood.udf.UiEvent r6, com.robinhood.udf.UiEvent r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = 0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationIntroViewState.<init>(boolean, java.lang.String, android.text.Spanned, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitleVisibilityText() {
        return this.titleVisibilityText;
    }

    public final Spanned getSubtitleVisibilityText() {
        return this.subtitleVisibilityText;
    }

    public final UiEvent<String> getPrepareSuccessEvent() {
        return this.prepareSuccessEvent;
    }

    public final UiEvent<Throwable> getPrepareFailureEvent() {
        return this.prepareFailureEvent;
    }

    public final int getContentVisibility() {
        return this.contentVisibility;
    }

    /* renamed from: isPrimaryButtonLoading, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* renamed from: isSecondaryButtonLoading, reason: from getter */
    public final boolean getIsSecondaryButtonLoading() {
        return this.isSecondaryButtonLoading;
    }
}
