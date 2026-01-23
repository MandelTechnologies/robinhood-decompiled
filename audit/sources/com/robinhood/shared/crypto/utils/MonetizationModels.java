package com.robinhood.shared.crypto.utils;

import com.robinhood.models.api.fee.MonetizationModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.nummus.MonetizationModelDto;

/* compiled from: MonetizationModels.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"dto", "Lrosetta/nummus/MonetizationModelDto;", "Lcom/robinhood/models/api/fee/MonetizationModel;", "getDto", "(Lcom/robinhood/models/api/fee/MonetizationModel;)Lrosetta/nummus/MonetizationModelDto;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.MonetizationModelsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MonetizationModels {

    /* compiled from: MonetizationModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.MonetizationModelsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MonetizationModelDto getDto(MonetizationModel monetizationModel) {
        Intrinsics.checkNotNullParameter(monetizationModel, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[monetizationModel.ordinal()];
        if (i == 1) {
            return MonetizationModelDto.MONETIZATION_MODEL_FEE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return MonetizationModelDto.MONETIZATION_MODEL_REBATE;
    }
}
