package com.robinhood.android.regiongate;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExperimentTarget.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0018\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¨\u0006\t"}, m3636d2 = {"toExperimentTarget", "Lcom/robinhood/android/regiongate/ExperimentTarget;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/experiments/Experiment;", "disabledVariants", "", "", "lib-region-gate_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.regiongate.ExperimentTargetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ExperimentTarget2 {
    public static final <VariantT extends Enum<VariantT> & RhEnum<VariantT>> ExperimentTarget<VariantT> toExperimentTarget(Experiment<VariantT> experiment, Set<String> disabledVariants) {
        Intrinsics.checkNotNullParameter(experiment, "<this>");
        Intrinsics.checkNotNullParameter(disabledVariants, "disabledVariants");
        Set<VariantT> variants = experiment.getVariants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : variants) {
            if (!disabledVariants.contains(((RhEnum) ((Enum) obj)).getServerValue())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Experiment must have at least 1 non-control variant");
        }
        return new ExperimentTarget<>(experiment, arrayList);
    }
}
