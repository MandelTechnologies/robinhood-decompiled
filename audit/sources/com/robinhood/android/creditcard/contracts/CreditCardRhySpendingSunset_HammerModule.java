package com.robinhood.android.creditcard.contracts;

import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: CreditCardRhySpendingSunset_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/contracts/CreditCardRhySpendingSunset_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/experiments/ExperimentDeclaration;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditCardRhySpendingSunset_HammerModule {
    public static final CreditCardRhySpendingSunset_HammerModule INSTANCE = new CreditCardRhySpendingSunset_HammerModule();

    private CreditCardRhySpendingSunset_HammerModule() {
    }

    public final ExperimentDeclaration<?> provide() {
        return CreditCardRhySpendingSunset.INSTANCE;
    }
}
