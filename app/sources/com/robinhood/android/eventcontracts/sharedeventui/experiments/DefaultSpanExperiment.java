package com.robinhood.android.eventcontracts.sharedeventui.experiments;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: DefaultSpanExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/experiments/DefaultSpanExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DefaultSpanExperiment extends Experiment<SimpleVariant> {
    public static final DefaultSpanExperiment INSTANCE = new DefaultSpanExperiment();
    public static final int $stable = 8;

    private DefaultSpanExperiment() {
        super("event-contracts-default-chart-grain", null, 2, null);
    }
}
