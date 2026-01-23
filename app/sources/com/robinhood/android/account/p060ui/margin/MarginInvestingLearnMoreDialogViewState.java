package com.robinhood.android.account.p060ui.margin;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInvestingLearnMoreDialogViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;", "", "content", "Landroid/text/Spanned;", "errorMessageId", "", "<init>", "(Landroid/text/Spanned;Ljava/lang/Integer;)V", "getContent", "()Landroid/text/Spanned;", "getErrorMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isLoading", "", "()Z", "component1", "component2", "copy", "(Landroid/text/Spanned;Ljava/lang/Integer;)Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;", "equals", "other", "hashCode", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class MarginInvestingLearnMoreDialogViewState {
    public static final int $stable = 8;
    private final Spanned content;
    private final Integer errorMessageId;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public MarginInvestingLearnMoreDialogViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarginInvestingLearnMoreDialogViewState copy$default(MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState, Spanned spanned, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            spanned = marginInvestingLearnMoreDialogViewState.content;
        }
        if ((i & 2) != 0) {
            num = marginInvestingLearnMoreDialogViewState.errorMessageId;
        }
        return marginInvestingLearnMoreDialogViewState.copy(spanned, num);
    }

    /* renamed from: component1, reason: from getter */
    public final Spanned getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getErrorMessageId() {
        return this.errorMessageId;
    }

    public final MarginInvestingLearnMoreDialogViewState copy(Spanned content, Integer errorMessageId) {
        return new MarginInvestingLearnMoreDialogViewState(content, errorMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginInvestingLearnMoreDialogViewState)) {
            return false;
        }
        MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState = (MarginInvestingLearnMoreDialogViewState) other;
        return Intrinsics.areEqual(this.content, marginInvestingLearnMoreDialogViewState.content) && Intrinsics.areEqual(this.errorMessageId, marginInvestingLearnMoreDialogViewState.errorMessageId);
    }

    public int hashCode() {
        Spanned spanned = this.content;
        int iHashCode = (spanned == null ? 0 : spanned.hashCode()) * 31;
        Integer num = this.errorMessageId;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        Spanned spanned = this.content;
        return "MarginInvestingLearnMoreDialogViewState(content=" + ((Object) spanned) + ", errorMessageId=" + this.errorMessageId + ")";
    }

    public MarginInvestingLearnMoreDialogViewState(Spanned spanned, Integer num) {
        this.content = spanned;
        this.errorMessageId = num;
        this.isLoading = spanned == null && num == null;
    }

    public /* synthetic */ MarginInvestingLearnMoreDialogViewState(Spanned spanned, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : spanned, (i & 2) != 0 ? null : num);
    }

    public final Spanned getContent() {
        return this.content;
    }

    public final Integer getErrorMessageId() {
        return this.errorMessageId;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }
}
