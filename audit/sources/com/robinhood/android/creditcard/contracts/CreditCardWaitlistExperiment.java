package com.robinhood.android.creditcard.contracts;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: CreditCardWaitlistExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditCardWaitlistExperiment extends Experiment<SimpleVariant> {
    public static final CreditCardWaitlistExperiment INSTANCE = new CreditCardWaitlistExperiment();

    private CreditCardWaitlistExperiment() {
        super("rh-gold-credit-card-waitlist-launch", null, 2, null);
    }
}
