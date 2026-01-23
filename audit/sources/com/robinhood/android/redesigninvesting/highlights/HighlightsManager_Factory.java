package com.robinhood.android.redesigninvesting.highlights;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HighlightsManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "experimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class HighlightsManager_Factory implements Factory<HighlightsManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RedesignInvestingExperimentStore> experimentStore;
    private final Provider<MicrogramManager> microgramManager;

    @JvmStatic
    public static final HighlightsManager_Factory create(Provider<MicrogramManager> provider, Provider<RedesignInvestingExperimentStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final HighlightsManager newInstance(MicrogramManager microgramManager, RedesignInvestingExperimentStore redesignInvestingExperimentStore) {
        return INSTANCE.newInstance(microgramManager, redesignInvestingExperimentStore);
    }

    public HighlightsManager_Factory(Provider<MicrogramManager> microgramManager, Provider<RedesignInvestingExperimentStore> experimentStore) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        this.microgramManager = microgramManager;
        this.experimentStore = experimentStore;
    }

    @Override // javax.inject.Provider
    public HighlightsManager get() {
        Companion companion = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        RedesignInvestingExperimentStore redesignInvestingExperimentStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(redesignInvestingExperimentStore, "get(...)");
        return companion.newInstance(microgramManager, redesignInvestingExperimentStore);
    }

    /* compiled from: HighlightsManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager_Factory;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "experimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "newInstance", "Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;", "lib-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HighlightsManager_Factory create(Provider<MicrogramManager> microgramManager, Provider<RedesignInvestingExperimentStore> experimentStore) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            return new HighlightsManager_Factory(microgramManager, experimentStore);
        }

        @JvmStatic
        public final HighlightsManager newInstance(MicrogramManager microgramManager, RedesignInvestingExperimentStore experimentStore) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            return new HighlightsManager(microgramManager, experimentStore);
        }
    }
}
