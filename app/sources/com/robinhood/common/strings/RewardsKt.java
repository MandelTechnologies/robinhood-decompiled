package com.robinhood.common.strings;

import com.robinhood.models.api.ApiRewards2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rewards.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/api/ApiRewardData$State;", "getLabelResId", "(Lcom/robinhood/models/api/ApiRewardData$State;)I", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RewardsKt {

    /* compiled from: Rewards.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRewards2.State.values().length];
            try {
                iArr[ApiRewards2.State.CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRewards2.State.UNCLAIMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRewards2.State.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiRewards2.State.EXCEEDED_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiRewards2.State.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiRewards2.State.UNSETTLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiRewards2.State.GRANTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiRewards2.State.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiRewards2.State.RESCINDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getLabelResId(ApiRewards2.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return C32428R.string.referral_state_claimed;
            case 2:
                return C32428R.string.referral_state_unclaimed;
            case 3:
                return C32428R.string.referral_state_pending;
            case 4:
                return C32428R.string.referral_state_exceeded_limit;
            case 5:
                return C32428R.string.referral_state_expired;
            case 6:
                return C32428R.string.referral_state_unsettled;
            case 7:
                return C32428R.string.referral_state_granted;
            case 8:
                return C32428R.string.referral_state_failed;
            case 9:
                return C32428R.string.referral_state_rescinded;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
