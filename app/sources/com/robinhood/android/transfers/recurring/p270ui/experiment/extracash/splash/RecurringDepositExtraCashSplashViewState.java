package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashViewState;", "", "isLoading", "", "dayNightLottieAssets", "Lkotlin/Pair;", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "title", "Landroidx/compose/ui/text/AnnotatedString;", "description", "<init>", "(ZLkotlin/Pair;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;)V", "()Z", "getDayNightLottieAssets", "()Lkotlin/Pair;", "getTitle", "()Landroidx/compose/ui/text/AnnotatedString;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositExtraCashSplashViewState {
    public static final int $stable = 0;
    private final Tuples2<LottieUrl, LottieUrl> dayNightLottieAssets;
    private final AnnotatedString description;
    private final boolean isLoading;
    private final AnnotatedString title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringDepositExtraCashSplashViewState copy$default(RecurringDepositExtraCashSplashViewState recurringDepositExtraCashSplashViewState, boolean z, Tuples2 tuples2, AnnotatedString annotatedString, AnnotatedString annotatedString2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recurringDepositExtraCashSplashViewState.isLoading;
        }
        if ((i & 2) != 0) {
            tuples2 = recurringDepositExtraCashSplashViewState.dayNightLottieAssets;
        }
        if ((i & 4) != 0) {
            annotatedString = recurringDepositExtraCashSplashViewState.title;
        }
        if ((i & 8) != 0) {
            annotatedString2 = recurringDepositExtraCashSplashViewState.description;
        }
        return recurringDepositExtraCashSplashViewState.copy(z, tuples2, annotatedString, annotatedString2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final Tuples2<LottieUrl, LottieUrl> component2() {
        return this.dayNightLottieAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final AnnotatedString getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final AnnotatedString getDescription() {
        return this.description;
    }

    public final RecurringDepositExtraCashSplashViewState copy(boolean isLoading, Tuples2<? extends LottieUrl, ? extends LottieUrl> dayNightLottieAssets, AnnotatedString title, AnnotatedString description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new RecurringDepositExtraCashSplashViewState(isLoading, dayNightLottieAssets, title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositExtraCashSplashViewState)) {
            return false;
        }
        RecurringDepositExtraCashSplashViewState recurringDepositExtraCashSplashViewState = (RecurringDepositExtraCashSplashViewState) other;
        return this.isLoading == recurringDepositExtraCashSplashViewState.isLoading && Intrinsics.areEqual(this.dayNightLottieAssets, recurringDepositExtraCashSplashViewState.dayNightLottieAssets) && Intrinsics.areEqual(this.title, recurringDepositExtraCashSplashViewState.title) && Intrinsics.areEqual(this.description, recurringDepositExtraCashSplashViewState.description);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Tuples2<LottieUrl, LottieUrl> tuples2 = this.dayNightLottieAssets;
        return ((((iHashCode + (tuples2 == null ? 0 : tuples2.hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "RecurringDepositExtraCashSplashViewState(isLoading=" + this.isLoading + ", dayNightLottieAssets=" + this.dayNightLottieAssets + ", title=" + ((Object) this.title) + ", description=" + ((Object) this.description) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositExtraCashSplashViewState(boolean z, Tuples2<? extends LottieUrl, ? extends LottieUrl> tuples2, AnnotatedString title, AnnotatedString description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.isLoading = z;
        this.dayNightLottieAssets = tuples2;
        this.title = title;
        this.description = description;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Tuples2<LottieUrl, LottieUrl> getDayNightLottieAssets() {
        return this.dayNightLottieAssets;
    }

    public final AnnotatedString getTitle() {
        return this.title;
    }

    public final AnnotatedString getDescription() {
        return this.description;
    }
}
