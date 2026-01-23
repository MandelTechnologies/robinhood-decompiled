package com.robinhood.rosetta.converters.retirement;

import com.robinhood.android.models.retirement.api.analytics.RetirementAccountState;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementAccountState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtoBuf", "Lcom/robinhood/rosetta/eventlogging/RetirementContext$AccountState;", "Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.retirement.RetirementAccountStateKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RetirementAccountState2 {

    /* compiled from: RetirementAccountState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.retirement.RetirementAccountStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RetirementAccountState.values().length];
            try {
                iArr[RetirementAccountState.FUNDED_NOT_INVESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetirementAccountState.INVESTED_ZERO_EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RetirementAccountState.INVESTED_POSITIVE_EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RetirementAccountState.UNFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RetirementAccountState.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RetirementContext.AccountState toProtoBuf(RetirementAccountState retirementAccountState) {
        Intrinsics.checkNotNullParameter(retirementAccountState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[retirementAccountState.ordinal()];
        if (i == 1) {
            return RetirementContext.AccountState.FUNDED_NOT_INVESTED;
        }
        if (i == 2) {
            return RetirementContext.AccountState.INVESTED_ZERO_EQUITY;
        }
        if (i == 3) {
            return RetirementContext.AccountState.INVESTED_POSITIVE_EQUITY;
        }
        if (i == 4) {
            return RetirementContext.AccountState.UNFUNDED;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return RetirementContext.AccountState.ACCOUNT_STATE_UNSPECIFIED;
    }
}
