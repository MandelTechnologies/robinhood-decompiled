package com.robinhood.crypto.perpetuals.util;

import com.robinhood.crypto.models.perpetuals.p288db.LeverageOptions;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LeverageUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"isValidLeverage", "", "leverage", "Ljava/math/BigDecimal;", "leverageOptions", "Lcom/robinhood/crypto/models/perpetuals/db/LeverageOptions;", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.util.LeverageUtilKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class LeverageUtil {
    public static final boolean isValidLeverage(BigDecimal leverage, LeverageOptions leverageOptions) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(leverageOptions, "leverageOptions");
        return leverage.compareTo(leverageOptions.getMaxLeverage()) <= 0 && leverage.compareTo(leverageOptions.getMinLeverage()) >= 0;
    }
}
