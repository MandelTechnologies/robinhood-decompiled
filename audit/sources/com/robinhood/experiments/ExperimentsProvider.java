package com.robinhood.experiments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ExperimentsProvider.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J;\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\"\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH'¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&JC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\b\"\u0006\u0012\u0002\b\u00030\u00102\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u0014JC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\b\"\u0006\u0012\u0002\b\u00030\u00102\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00122\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\b\b\u0002\u0010\t\u001a\u00020\u0006H&J&\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\b\b\u0002\u0010\t\u001a\u00020\u0006H&J2\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b0\u00052\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u001b2\b\b\u0002\u0010\t\u001a\u00020\u0006H&J\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006H'JM\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0012\"\u0018\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u001f*\b\u0012\u0004\u0012\u0002H\u001e0 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00102\u0006\u0010!\u001a\u0002H\u001e2\b\b\u0002\u0010\t\u001a\u00020\u0006H&¢\u0006\u0002\u0010\"JM\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0005\"\u0018\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u001f*\b\u0012\u0004\u0012\u0002H\u001e0 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00102\u0006\u0010!\u001a\u0002H\u001e2\b\b\u0002\u0010\t\u001a\u00020\u0006H&¢\u0006\u0002\u0010$J>\u0010%\u001a\u00020\u00062\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030&0\b\"\u0006\u0012\u0002\b\u00030&2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010'J&\u0010(\u001a\u0004\u0018\u00010\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030&2\b\b\u0002\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u000eH&¨\u0006+"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentsProvider;", "", "getCommaSeparatedExperimentNames", "", "coStreamStateForNames", "Lkotlinx/coroutines/flow/Flow;", "", "experimentNames", "", "trigger", "mode", "Lcom/robinhood/experiments/ExperimentQueryMode;", "([Ljava/lang/String;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lkotlinx/coroutines/flow/Flow;", "logExposure", "", "experiment", "Lcom/robinhood/experiments/Experiment;", "streamState", "Lio/reactivex/Observable;", "experiments", "([Lcom/robinhood/experiments/Experiment;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lio/reactivex/Observable;", "streamStateFlow", "([Lcom/robinhood/experiments/Experiment;ZLcom/robinhood/experiments/ExperimentQueryMode;)Lkotlinx/coroutines/flow/Flow;", "streamVariation", "Lcom/robinhood/utils/Optional;", "coStreamVariation", "coStreamVariations", "", "experimentName", "streamVariant", "E", "Lcom/robinhood/enums/RhEnum;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;Z)Lio/reactivex/Observable;", "coStreamVariant", "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;Z)Lkotlinx/coroutines/flow/Flow;", "getState", "Lcom/robinhood/experiments/ProcessInvariantExperiment;", "([Lcom/robinhood/experiments/ProcessInvariantExperiment;ZLcom/robinhood/experiments/ExperimentQueryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVariation", "(Lcom/robinhood/experiments/ProcessInvariantExperiment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAppCreated", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ExperimentsProvider {
    @UnsupportedAppUsageExperimentationApi
    Flow<Boolean> coStreamStateForNames(String[] experimentNames, boolean trigger, ExperimentQueryMode mode);

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Lcom/robinhood/experiments/Experiment<TE;>;TE;Z)Lkotlinx/coroutines/flow/Flow<TE;>; */
    Flow coStreamVariant(Experiment experiment, Enum r2, boolean trigger);

    Flow<String> coStreamVariation(Experiment<?> experiment, boolean trigger);

    @MicrogramOnlyUsageExperimentationApi
    Flow<String> coStreamVariation(String experimentName, boolean trigger);

    Flow<List<String>> coStreamVariations(List<? extends Experiment<?>> experiments, boolean trigger);

    /* renamed from: getCommaSeparatedExperimentNames */
    String getAnalyticsExperimentsLogString();

    Object getState(ProcessInvariantExperiment<?>[] processInvariantExperimentArr, boolean z, ExperimentQueryMode experimentQueryMode, Continuation<? super Boolean> continuation);

    Object getVariation(ProcessInvariantExperiment<?> processInvariantExperiment, boolean z, Continuation<? super String> continuation);

    void logExposure(Experiment<?> experiment);

    void onAppCreated();

    Observable<Boolean> streamState(Experiment<?>[] experiments, boolean trigger, ExperimentQueryMode mode);

    Flow<Boolean> streamStateFlow(Experiment<?>[] experiments, boolean trigger, ExperimentQueryMode mode);

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/robinhood/enums/RhEnum<TE;>;>(Lcom/robinhood/experiments/Experiment<TE;>;TE;Z)Lio/reactivex/Observable<TE;>; */
    Observable streamVariant(Experiment experiment, Enum r2, boolean trigger);

    Observable<Optional<String>> streamVariation(Experiment<?> experiment, boolean trigger);

    /* compiled from: ExperimentsProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow coStreamStateForNames$default(ExperimentsProvider experimentsProvider, String[] strArr, boolean z, ExperimentQueryMode experimentQueryMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coStreamStateForNames");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                experimentQueryMode = ExperimentQueryMode.ANY_ARE_MEMBER;
            }
            return experimentsProvider.coStreamStateForNames(strArr, z, experimentQueryMode);
        }

        public static /* synthetic */ Observable streamState$default(ExperimentsProvider experimentsProvider, Experiment[] experimentArr, boolean z, ExperimentQueryMode experimentQueryMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamState");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                experimentQueryMode = ExperimentQueryMode.ANY_ARE_MEMBER;
            }
            return experimentsProvider.streamState(experimentArr, z, experimentQueryMode);
        }

        public static /* synthetic */ Flow streamStateFlow$default(ExperimentsProvider experimentsProvider, Experiment[] experimentArr, boolean z, ExperimentQueryMode experimentQueryMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamStateFlow");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                experimentQueryMode = ExperimentQueryMode.ANY_ARE_MEMBER;
            }
            return experimentsProvider.streamStateFlow(experimentArr, z, experimentQueryMode);
        }

        public static /* synthetic */ Observable streamVariation$default(ExperimentsProvider experimentsProvider, Experiment experiment, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamVariation");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return experimentsProvider.streamVariation(experiment, z);
        }

        public static /* synthetic */ Flow coStreamVariation$default(ExperimentsProvider experimentsProvider, Experiment experiment, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coStreamVariation");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return experimentsProvider.coStreamVariation((Experiment<?>) experiment, z);
        }

        public static /* synthetic */ Flow coStreamVariations$default(ExperimentsProvider experimentsProvider, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coStreamVariations");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return experimentsProvider.coStreamVariations(list, z);
        }

        public static /* synthetic */ Flow coStreamVariation$default(ExperimentsProvider experimentsProvider, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coStreamVariation");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return experimentsProvider.coStreamVariation(str, z);
        }

        public static /* synthetic */ Observable streamVariant$default(ExperimentsProvider experimentsProvider, Experiment experiment, Enum r2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamVariant");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return experimentsProvider.streamVariant(experiment, r2, z);
        }

        public static /* synthetic */ Flow coStreamVariant$default(ExperimentsProvider experimentsProvider, Experiment experiment, Enum r2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coStreamVariant");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return experimentsProvider.coStreamVariant(experiment, r2, z);
        }

        public static /* synthetic */ Object getState$default(ExperimentsProvider experimentsProvider, ProcessInvariantExperiment[] processInvariantExperimentArr, boolean z, ExperimentQueryMode experimentQueryMode, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getState");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                experimentQueryMode = ExperimentQueryMode.ANY_ARE_MEMBER;
            }
            return experimentsProvider.getState(processInvariantExperimentArr, z, experimentQueryMode, continuation);
        }

        public static /* synthetic */ Object getVariation$default(ExperimentsProvider experimentsProvider, ProcessInvariantExperiment processInvariantExperiment, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVariation");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return experimentsProvider.getVariation(processInvariantExperiment, z, continuation);
        }
    }
}
