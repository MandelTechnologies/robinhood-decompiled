package com.robinhood.android.transfers.util;

import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetRate.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getRate", "Ljava/math/BigDecimal;", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.GetRateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class GetRate {

    /* compiled from: GetRate.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.util.GetRateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BigDecimal getRate(ApiFxQuote apiFxQuote, TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(apiFxQuote, "<this>");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return apiFxQuote.getBidOutrightRate();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return apiFxQuote.getOfferOutrightRate();
    }
}
