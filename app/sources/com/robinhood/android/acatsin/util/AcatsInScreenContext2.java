package com.robinhood.android.acatsin.util;

import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import kotlin.Metadata;

/* compiled from: AcatsInScreenContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toLoggingRejectReason", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRejectReasonEnum;", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.AcatsInScreenContextKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInScreenContext2 {

    /* compiled from: AcatsInScreenContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.util.AcatsInScreenContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.AcatRejectReasonEnum.values().length];
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.ACCOUNT_TITLE_MISMATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ACCOUNT_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.AcatRejectReasonEnum.INVALID_ASSETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AcatsInContext.RejectReason toLoggingRejectReason(ApiAcatsTransfer.AcatRejectReasonEnum acatRejectReasonEnum) {
        int i = acatRejectReasonEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[acatRejectReasonEnum.ordinal()];
        if (i == 1) {
            return AcatsInContext.RejectReason.ACCOUNT_TITLE_MISMATCH;
        }
        if (i == 2) {
            return AcatsInContext.RejectReason.INVALID_ACCOUNT_NUMBER;
        }
        if (i == 3) {
            return AcatsInContext.RejectReason.UNSUPPORTED_ASSETS;
        }
        return AcatsInContext.RejectReason.UNKNOWN;
    }
}
