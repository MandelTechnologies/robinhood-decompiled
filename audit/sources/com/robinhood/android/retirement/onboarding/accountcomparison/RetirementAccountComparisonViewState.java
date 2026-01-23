package com.robinhood.android.retirement.onboarding.accountcomparison;

import com.robinhood.android.models.retirement.api.ApiRetirementAccountComparisonResponse;
import com.robinhood.android.models.retirement.api.RetirementAccountComparisonDropdown;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.Size;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementAccountComparisonViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;", "", "<init>", "()V", "Loading", "Success", "Companion", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Loading;", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Success;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RetirementAccountComparisonViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Success loadingMock;

    public /* synthetic */ RetirementAccountComparisonViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RetirementAccountComparisonViewState() {
    }

    /* compiled from: RetirementAccountComparisonViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Loading;", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends RetirementAccountComparisonViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 276496999;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: RetirementAccountComparisonViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Success;", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;", "comparison", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;)V", "getComparison", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends RetirementAccountComparisonViewState {
        public static final int $stable = 8;
        private final ApiRetirementAccountComparisonResponse comparison;

        public static /* synthetic */ Success copy$default(Success success, ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementAccountComparisonResponse = success.comparison;
            }
            return success.copy(apiRetirementAccountComparisonResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementAccountComparisonResponse getComparison() {
            return this.comparison;
        }

        public final Success copy(ApiRetirementAccountComparisonResponse comparison) {
            Intrinsics.checkNotNullParameter(comparison, "comparison");
            return new Success(comparison);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.comparison, ((Success) other).comparison);
        }

        public int hashCode() {
            return this.comparison.hashCode();
        }

        public String toString() {
            return "Success(comparison=" + this.comparison + ")";
        }

        public final ApiRetirementAccountComparisonResponse getComparison() {
            return this.comparison;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ApiRetirementAccountComparisonResponse comparison) {
            super(null);
            Intrinsics.checkNotNullParameter(comparison, "comparison");
            this.comparison = comparison;
        }
    }

    /* compiled from: RetirementAccountComparisonViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Success;", "getLoadingMock", "()Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState$Success;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Success getLoadingMock() {
            return RetirementAccountComparisonViewState.loadingMock;
        }
    }

    static {
        AspectFillRemoteImage aspectFillRemoteImage = new AspectFillRemoteImage("url", new Size(1, 1), null, null, null, 28, null);
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(new RetirementAccountComparisonDropdown("---- -----------", Pictogram.RETIREMENT, CollectionsKt.emptyList(), ""));
        }
        loadingMock = new Success(new ApiRetirementAccountComparisonResponse("----- --- -- ----- --- ----", "------ --- ----- --- -- - ---- -- ---------- --- --- -- ------ -- -------- -- ---------- ---------- ---- ----- - ------ --- ---- ---- --", "--- --", "---- ----------- -- ----------- --- --- --- -- ---------- -------", aspectFillRemoteImage, arrayList));
    }
}
