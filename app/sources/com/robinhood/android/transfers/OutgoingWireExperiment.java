package com.robinhood.android.transfers;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: OutgoingWireExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/OutgoingWireMemoExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.OutgoingWireMemoExperiment, reason: use source file name */
/* loaded from: classes9.dex */
public final class OutgoingWireExperiment extends Experiment<SimpleVariant> {
    public static final OutgoingWireExperiment INSTANCE = new OutgoingWireExperiment();
    public static final int $stable = 8;

    private OutgoingWireExperiment() {
        super("moneymovement-all-outgoing-wire-memo", null, 2, null);
    }
}
