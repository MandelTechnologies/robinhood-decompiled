package com.robinhood.android.hyperextendedonboarding;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.models.api.bonfire.ApiNewTradingHoursOnboarding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HyperExtendedOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState;", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "result", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "<init>", "(Lcom/robinhood/android/designsystem/style/DayNightOverlay;Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;)V", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getResult", "()Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Result", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HyperExtendedOnboardingViewState {
    public static final int $stable = 0;
    private final DayNightOverlay dayNightOverlay;
    private final Result result;

    /* JADX WARN: Multi-variable type inference failed */
    public HyperExtendedOnboardingViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HyperExtendedOnboardingViewState copy$default(HyperExtendedOnboardingViewState hyperExtendedOnboardingViewState, DayNightOverlay dayNightOverlay, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            dayNightOverlay = hyperExtendedOnboardingViewState.dayNightOverlay;
        }
        if ((i & 2) != 0) {
            result = hyperExtendedOnboardingViewState.result;
        }
        return hyperExtendedOnboardingViewState.copy(dayNightOverlay, result);
    }

    /* renamed from: component1, reason: from getter */
    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    /* renamed from: component2, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final HyperExtendedOnboardingViewState copy(DayNightOverlay dayNightOverlay, Result result) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(result, "result");
        return new HyperExtendedOnboardingViewState(dayNightOverlay, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperExtendedOnboardingViewState)) {
            return false;
        }
        HyperExtendedOnboardingViewState hyperExtendedOnboardingViewState = (HyperExtendedOnboardingViewState) other;
        return this.dayNightOverlay == hyperExtendedOnboardingViewState.dayNightOverlay && Intrinsics.areEqual(this.result, hyperExtendedOnboardingViewState.result);
    }

    public int hashCode() {
        return (this.dayNightOverlay.hashCode() * 31) + this.result.hashCode();
    }

    public String toString() {
        return "HyperExtendedOnboardingViewState(dayNightOverlay=" + this.dayNightOverlay + ", result=" + this.result + ")";
    }

    public HyperExtendedOnboardingViewState(DayNightOverlay dayNightOverlay, Result result) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(result, "result");
        this.dayNightOverlay = dayNightOverlay;
        this.result = result;
    }

    public /* synthetic */ HyperExtendedOnboardingViewState(DayNightOverlay dayNightOverlay, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 2) != 0 ? Result.Loading.INSTANCE : result);
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final Result getResult() {
        return this.result;
    }

    /* compiled from: HyperExtendedOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "", "<init>", "()V", "Loading", "Error", "Success", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Error;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Loading;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Success;", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: HyperExtendedOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Loading;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "<init>", "()V", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: HyperExtendedOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Error;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "<init>", "()V", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends Result {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        /* compiled from: HyperExtendedOnboardingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result$Success;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState$Result;", "viewModel", "Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingViewModel;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingViewModel;)V", "getViewModel", "()Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingViewModel;", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends Result {
            public static final int $stable = 8;
            private final ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel viewModel;

            public final ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel getViewModel() {
                return this.viewModel;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel viewModel) {
                super(null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.viewModel = viewModel;
            }
        }
    }
}
