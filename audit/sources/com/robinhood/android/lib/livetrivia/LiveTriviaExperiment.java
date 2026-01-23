package com.robinhood.android.lib.livetrivia;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: LiveTriviaExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/lib/livetrivia/LiveTriviaExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LiveTriviaExperiment extends Experiment<SimpleVariant> {
    public static final LiveTriviaExperiment INSTANCE = new LiveTriviaExperiment();
    public static final int $stable = 8;

    private LiveTriviaExperiment() {
        super("acq-live-trivia", null, 2, null);
    }
}
