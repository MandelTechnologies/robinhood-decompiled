package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuitabilityCheckpointDtos.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"previousCheckpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "nextCheckpoint", "feature-futures-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.uk.SuitabilityCheckpointDtosKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SuitabilityCheckpointDtos {

    /* compiled from: SuitabilityCheckpointDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.uk.SuitabilityCheckpointDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuitabilityCheckpointDto.values().length];
            try {
                iArr[SuitabilityCheckpointDto.SUITABILITY_CHECKPOINT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuitabilityCheckpointDto.INVESTOR_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuitabilityCheckpointDto.EXPERIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuitabilityCheckpointDto.KNOWLEDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SuitabilityCheckpointDto previousCheckpoint(SuitabilityCheckpointDto suitabilityCheckpointDto) {
        Intrinsics.checkNotNullParameter(suitabilityCheckpointDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[suitabilityCheckpointDto.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return SuitabilityCheckpointDto.INVESTOR_PROFILE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return SuitabilityCheckpointDto.EXPERIENCE;
    }

    public static final SuitabilityCheckpointDto nextCheckpoint(SuitabilityCheckpointDto suitabilityCheckpointDto) {
        Intrinsics.checkNotNullParameter(suitabilityCheckpointDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[suitabilityCheckpointDto.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return SuitabilityCheckpointDto.EXPERIENCE;
        }
        if (i == 3) {
            return SuitabilityCheckpointDto.KNOWLEDGE;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
