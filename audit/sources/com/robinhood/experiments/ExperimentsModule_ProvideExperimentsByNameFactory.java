package com.robinhood.experiments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentsModule_ProvideExperimentsByNameFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 \f2\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\fB$\u0012\u001b\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\b¢\u0006\u0002\b\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0002\b\u0005H\u0016R#\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\b¢\u0006\u0002\b\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentsModule_ProvideExperimentsByNameFactory;", "Ldagger/internal/Factory;", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "experiments", "Ljavax/inject/Provider;", "", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ExperimentsModule_ProvideExperimentsByNameFactory implements Factory<Map<String, ExperimentDeclaration<?>>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Set<ExperimentDeclaration<?>>> experiments;

    @JvmStatic
    public static final ExperimentsModule_ProvideExperimentsByNameFactory create(Provider<Set<ExperimentDeclaration<?>>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Map<String, ExperimentDeclaration<?>> provideExperimentsByName(Set<ExperimentDeclaration<?>> set) {
        return INSTANCE.provideExperimentsByName(set);
    }

    public ExperimentsModule_ProvideExperimentsByNameFactory(Provider<Set<ExperimentDeclaration<?>>> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.experiments = experiments;
    }

    @Override // javax.inject.Provider
    public Map<String, ExperimentDeclaration<?>> get() {
        Companion companion = INSTANCE;
        Set<ExperimentDeclaration<?>> set = this.experiments.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.provideExperimentsByName(set);
    }

    /* compiled from: ExperimentsModule_ProvideExperimentsByNameFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u001b\u0010\u0006\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u0007H\u0007J4\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\f¢\u0006\u0002\b\n2\u0015\u0010\u0006\u001a\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\nH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentsModule_ProvideExperimentsByNameFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/experiments/ExperimentsModule_ProvideExperimentsByNameFactory;", "experiments", "Ljavax/inject/Provider;", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideExperimentsByName", "", "", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ExperimentsModule_ProvideExperimentsByNameFactory create(Provider<Set<ExperimentDeclaration<?>>> experiments) {
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            return new ExperimentsModule_ProvideExperimentsByNameFactory(experiments);
        }

        @JvmStatic
        public final Map<String, ExperimentDeclaration<?>> provideExperimentsByName(Set<ExperimentDeclaration<?>> experiments) {
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Object objCheckNotNull = Preconditions.checkNotNull(ExperimentsModule.INSTANCE.provideExperimentsByName(experiments), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Map) objCheckNotNull;
        }
    }
}
