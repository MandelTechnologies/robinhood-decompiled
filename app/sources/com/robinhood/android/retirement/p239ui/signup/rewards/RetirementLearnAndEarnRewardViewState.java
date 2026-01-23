package com.robinhood.android.retirement.p239ui.signup.rewards;

import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnFooter;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnViewModel;
import com.robinhood.android.models.retirement.api.rewards.Cta;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementLearnAndEarnRewardViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loaded;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loading;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementLearnAndEarnRewardViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RetirementLearnAndEarnRewardViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loading;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementLearnAndEarnRewardViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 25904320;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementLearnAndEarnRewardViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loaded;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;", "result", "Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;)V", "getResult", "()Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementLearnAndEarnRewardViewState {
        public static final int $stable = 8;
        private final ApiRetirementLearnAndEarnRewardResponse result;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiRetirementLearnAndEarnRewardResponse apiRetirementLearnAndEarnRewardResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementLearnAndEarnRewardResponse = loaded.result;
            }
            return loaded.copy(apiRetirementLearnAndEarnRewardResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementLearnAndEarnRewardResponse getResult() {
            return this.result;
        }

        public final Loaded copy(ApiRetirementLearnAndEarnRewardResponse result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Loaded(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.result, ((Loaded) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Loaded(result=" + this.result + ")";
        }

        public Loaded(ApiRetirementLearnAndEarnRewardResponse result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final ApiRetirementLearnAndEarnRewardResponse getResult() {
            return this.result;
        }
    }

    /* compiled from: RetirementLearnAndEarnRewardViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState$Loaded;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        static {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            loadingMock = new Loaded(new ApiRetirementLearnAndEarnRewardResponse(uuidRandomUUID, new ApiRetirementLearnAndEarnViewModel("---- ------ ----", "----- ----- ---- --- --- ---- ---", "--- ----- --- ---- ---- -- -------- ----- --- ----- --- -- ----- ------- --- ---- ---", new ApiRetirementLearnAndEarnFooter("---- ----", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER), new Cta("", "----- ------"))));
        }

        public final Loaded getLoadingMock() {
            return loadingMock;
        }
    }
}
