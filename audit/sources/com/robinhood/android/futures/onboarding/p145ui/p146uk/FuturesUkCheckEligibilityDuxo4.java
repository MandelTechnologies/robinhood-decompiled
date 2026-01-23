package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityDuxo5;
import com.robinhood.android.models.futures.p192ui.SuitabilityResult;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesUkCheckEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDataState;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesUkCheckEligibilityDuxo4 implements StateProvider<FuturesUkCheckEligibilityDataState, FuturesUkCheckEligibilityDuxo5> {
    public static final int $stable = 0;
    public static final FuturesUkCheckEligibilityDuxo4 INSTANCE = new FuturesUkCheckEligibilityDuxo4();

    /* compiled from: FuturesUkCheckEligibilityDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityStateProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuitabilityCheckpointDto.values().length];
            try {
                iArr[SuitabilityCheckpointDto.INVESTOR_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuitabilityCheckpointDto.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuitabilityCheckpointDto.KNOWLEDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuitabilityCheckpointDto.SUITABILITY_CHECKPOINT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FuturesUkCheckEligibilityDuxo4() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesUkCheckEligibilityDuxo5 reduce(FuturesUkCheckEligibilityDataState dataState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SuitabilityResult currentCheckpointSuitability = dataState.getCurrentCheckpointSuitability();
        if (currentCheckpointSuitability != null && !currentCheckpointSuitability.isEligible()) {
            boolean z = dataState.getCheckpoint() == SuitabilityCheckpointDto.KNOWLEDGE && dataState.getCurrentCheckpointSuitability().getCanRetry();
            StringResource.Companion companion = StringResource.INSTANCE;
            SuitabilityCheckpointDto checkpoint = dataState.getCheckpoint();
            int i3 = checkpoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[checkpoint.ordinal()];
            if (i3 == -1) {
                i = C17293R.string.futures_uk_not_eligible_suitability;
            } else if (i3 == 1) {
                i = C17293R.string.futures_uk_not_eligible_investor_profile;
            } else if (i3 == 2) {
                i = C17293R.string.futures_uk_not_eligible_suitability;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C17293R.string.futures_uk_not_eligible_suitability;
            } else if (z) {
                i = C17293R.string.futures_uk_not_eligible_knowledge_quiz_with_retry;
            } else {
                i = C17293R.string.futures_uk_not_eligible_knowledge_quiz_no_retry;
            }
            StringResource stringResourceInvoke = companion.invoke(i, new Object[0]);
            SuitabilityCheckpointDto checkpoint2 = dataState.getCheckpoint();
            int i4 = checkpoint2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[checkpoint2.ordinal()];
            if (i4 == -1 || i4 == 1 || i4 == 2) {
                i2 = C17293R.string.futures_uk_not_eligible_got_it_cta;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C17293R.string.futures_uk_not_eligible_got_it_cta;
            } else if (z) {
                i2 = C17293R.string.futures_uk_not_eligible_knowledge_quiz_try_again_cta;
            } else {
                i2 = C17293R.string.futures_uk_not_eligible_got_it_cta;
            }
            return new FuturesUkCheckEligibilityDuxo5.Rejected(stringResourceInvoke, companion.invoke(i2, new Object[0]), z ? companion.invoke(C17293R.string.futures_uk_not_eligible_knowledge_quiz_later_cta, new Object[0]) : null, z);
        }
        return FuturesUkCheckEligibilityDuxo5.Loading.INSTANCE;
    }
}
