package com.robinhood.android.slip.onboarding.utils;

import com.robinhood.models.api.ApiSlipOnboardingEligibility2;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SLIPContextUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\n\u0010\r\u001a\u00020\u0005*\u00020\u000e\u001a\f\u0010\r\u001a\u00020\u0007*\u0004\u0018\u00010\u000f¨\u0006\u0010"}, m3636d2 = {"createSlipContext", "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "source", "", "onboardingVariant", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "eligibilityStatus", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "dollarAmount", "percentAmount", "isQuickEnrollment", "", "skipIntro", "toProtobuf", "Lcom/robinhood/models/db/SlipOnboarding$SlipOnboardingVariant;", "Lcom/robinhood/models/api/EligibilityStatus;", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.utils.SLIPContextUtilsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SLIPContextUtils {

    /* compiled from: SLIPContextUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.utils.SLIPContextUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SlipOnboarding.SlipOnboardingVariant.values().length];
            try {
                iArr[SlipOnboarding.SlipOnboardingVariant.DOLLAR_RECOMMENDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlipOnboarding.SlipOnboardingVariant.PERCENT_RECOMMENDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSlipOnboardingEligibility2.values().length];
            try {
                iArr2[ApiSlipOnboardingEligibility2.NOT_ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiSlipOnboardingEligibility2.ELIGIBLE_WITHOUT_RECOMMENDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiSlipOnboardingEligibility2.ELIGIBLE_FOR_RECOMMENDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ SLIPContext createSlipContext$default(String str, SLIPContext.OnboardingVariant onboardingVariant, SLIPContext.EligibilityStatus eligibilityStatus, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            onboardingVariant = null;
        }
        if ((i & 4) != 0) {
            eligibilityStatus = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        return createSlipContext(str, onboardingVariant, eligibilityStatus, str2, str3, z, z2);
    }

    public static final SLIPContext createSlipContext(String str, SLIPContext.OnboardingVariant onboardingVariant, SLIPContext.EligibilityStatus eligibilityStatus, String str2, String str3, boolean z, boolean z2) {
        Boolean r13;
        Boolean r132;
        if (str == null) {
            str = "";
        }
        if (onboardingVariant == null) {
            onboardingVariant = SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED;
        }
        SLIPContext.OnboardingVariant onboardingVariant2 = onboardingVariant;
        if (eligibilityStatus == null) {
            eligibilityStatus = SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        SLIPContext.EligibilityStatus eligibilityStatus2 = eligibilityStatus;
        String str4 = str2 == null ? "" : str2;
        String str5 = str3 == null ? "" : str3;
        if (z) {
            r13 = Boolean.TRUE;
        } else {
            r13 = Boolean.FALSE;
        }
        Boolean r6 = r13;
        if (z2) {
            r132 = Boolean.TRUE;
        } else {
            r132 = Boolean.FALSE;
        }
        return new SLIPContext(str, onboardingVariant2, eligibilityStatus2, str4, str5, r6, r132, null, null, 384, null);
    }

    public static final SLIPContext.OnboardingVariant toProtobuf(SlipOnboarding.SlipOnboardingVariant slipOnboardingVariant) {
        Intrinsics.checkNotNullParameter(slipOnboardingVariant, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[slipOnboardingVariant.ordinal()];
        if (i == 1) {
            return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_DOLLAR;
        }
        if (i == 2) {
            return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_PERCENT;
        }
        return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED;
    }

    public static final SLIPContext.EligibilityStatus toProtobuf(ApiSlipOnboardingEligibility2 apiSlipOnboardingEligibility2) {
        int i = apiSlipOnboardingEligibility2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[apiSlipOnboardingEligibility2.ordinal()];
        if (i == 1) {
            return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_NOT_ELIGIBLE;
        }
        if (i == 2) {
            return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE;
        }
        if (i == 3) {
            return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION;
        }
        return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
    }
}
