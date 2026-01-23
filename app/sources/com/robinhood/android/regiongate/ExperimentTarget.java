package com.robinhood.android.regiongate;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import java.lang.Enum;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentTarget.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ExperimentTarget;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "", "experiment", "Lcom/robinhood/experiments/Experiment;", "memberVariants", "", "<init>", "(Lcom/robinhood/experiments/Experiment;Ljava/util/List;)V", "getExperiment", "()Lcom/robinhood/experiments/Experiment;", "getMemberVariants", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExperimentTarget<VariantT extends Enum<VariantT> & RhEnum<VariantT>> {
    private final Experiment<VariantT> experiment;
    private final List<VariantT> memberVariants;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperimentTarget copy$default(ExperimentTarget experimentTarget, Experiment experiment, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            experiment = experimentTarget.experiment;
        }
        if ((i & 2) != 0) {
            list = experimentTarget.memberVariants;
        }
        return experimentTarget.copy(experiment, list);
    }

    public final Experiment<VariantT> component1() {
        return this.experiment;
    }

    public final List<VariantT> component2() {
        return this.memberVariants;
    }

    public final ExperimentTarget<VariantT> copy(Experiment<VariantT> experiment, List<? extends VariantT> memberVariants) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(memberVariants, "memberVariants");
        return new ExperimentTarget<>(experiment, memberVariants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperimentTarget)) {
            return false;
        }
        ExperimentTarget experimentTarget = (ExperimentTarget) other;
        return Intrinsics.areEqual(this.experiment, experimentTarget.experiment) && Intrinsics.areEqual(this.memberVariants, experimentTarget.memberVariants);
    }

    public int hashCode() {
        return (this.experiment.hashCode() * 31) + this.memberVariants.hashCode();
    }

    public String toString() {
        return "ExperimentTarget(experiment=" + this.experiment + ", memberVariants=" + this.memberVariants + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperimentTarget(Experiment<VariantT> experiment, List<? extends VariantT> memberVariants) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(memberVariants, "memberVariants");
        this.experiment = experiment;
        this.memberVariants = memberVariants;
    }

    public final Experiment<VariantT> getExperiment() {
        return this.experiment;
    }

    public final List<VariantT> getMemberVariants() {
        return this.memberVariants;
    }
}
