package com.robinhood.rosetta.converters.brokerage;

import com.robinhood.models.p320db.MarginHealth;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerRowContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.brokerage.BuyingPowerRowContextKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class BuyingPowerRowContext2 {

    /* compiled from: BuyingPowerRowContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.brokerage.BuyingPowerRowContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginHealth.MarginHealthState.values().length];
            try {
                iArr[MarginHealth.MarginHealthState.HEALTHY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginHealth.MarginHealthState.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginHealth.MarginHealthState.RISKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BuyingPowerRowContext.MarginHealthState toProtobuf(MarginHealth.MarginHealthState marginHealthState) {
        Intrinsics.checkNotNullParameter(marginHealthState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginHealthState.ordinal()];
        if (i == 1) {
            return BuyingPowerRowContext.MarginHealthState.HEALTHY;
        }
        if (i == 2) {
            return BuyingPowerRowContext.MarginHealthState.MODERATE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BuyingPowerRowContext.MarginHealthState.RISKY;
    }
}
