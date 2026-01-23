package com.robinhood.android.event.detail.experiments;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: LiveActivityExperimentVariant.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/event/detail/experiments/EagleDetailPageLiveActivityKillSwitch;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.experiments.EagleDetailPageLiveActivityKillSwitch, reason: use source file name */
/* loaded from: classes17.dex */
public final class LiveActivityExperimentVariant extends Experiment<SimpleVariant> {
    public static final LiveActivityExperimentVariant INSTANCE = new LiveActivityExperimentVariant();
    public static final int $stable = 8;

    private LiveActivityExperimentVariant() {
        super("android-project-eagle-live-activity-killswitch", null, 2, null);
    }
}
