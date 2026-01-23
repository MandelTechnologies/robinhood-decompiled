package com.robinhood.shared.crypto.utils;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualCurrencyInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualCurrencyInputs.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"allowDecimalInput", "", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualCurrencyInput;", "getAllowDecimalInput", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualCurrencyInput;)Z", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.PerpetualCurrencyInputsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PerpetualCurrencyInputs {
    public static final boolean getAllowDecimalInput(PerpetualCurrencyInput perpetualCurrencyInput) {
        Intrinsics.checkNotNullParameter(perpetualCurrencyInput, "<this>");
        return perpetualCurrencyInput.getDecimalScale() > 0;
    }
}
