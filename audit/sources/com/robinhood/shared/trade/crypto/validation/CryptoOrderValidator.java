package com.robinhood.shared.trade.crypto.validation;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00060\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidator;", "Lcom/robinhood/android/lib/trade/validation/Validator;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "checks", "", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "<init>", "(Ljava/util/List;)V", "getChecks$feature_trade_crypto_externalDebug", "()Ljava/util/List;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class CryptoOrderValidator extends Validator<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final List<Validator.Check<CryptoOrderContext, CryptoOrderValidator3>> checks;

    public final List<Validator.Check<CryptoOrderContext, CryptoOrderValidator3>> getChecks$feature_trade_crypto_externalDebug() {
        return this.checks;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderValidator(List<? extends Validator.Check<? super CryptoOrderContext, ? super CryptoOrderValidator3>> checks) {
        Intrinsics.checkNotNullParameter(checks, "checks");
        Validator.Check[] checkArr = (Validator.Check[]) checks.toArray(new Validator.Check[0]);
        super((Validator.Check[]) Arrays.copyOf(checkArr, checkArr.length));
        this.checks = checks;
    }
}
