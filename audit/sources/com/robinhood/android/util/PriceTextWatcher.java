package com.robinhood.android.util;

import com.robinhood.android.common.util.DecimalLimitTextWatcher;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceTextWatcher.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/util/PriceTextWatcher;", "Lcom/robinhood/android/common/util/DecimalLimitTextWatcher;", "<init>", "()V", "getAllowedScale", "", "input", "Ljava/math/BigDecimal;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PriceTextWatcher extends DecimalLimitTextWatcher {
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.util.DecimalLimitTextWatcher
    public int getAllowedScale(BigDecimal input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return BigDecimals7.gte(input, BigDecimal.ONE) ? 2 : 4;
    }
}
