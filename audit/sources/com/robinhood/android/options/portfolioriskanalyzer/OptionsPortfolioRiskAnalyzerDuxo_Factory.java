package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerDuxo_Factory implements Factory<OptionsPortfolioRiskAnalyzerDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionsPortfolioRiskAnalyzerStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerDuxo_Factory create(Provider<DuxoBundle> provider, Provider<OptionsPortfolioRiskAnalyzerStateProvider> provider2, Provider<SavedStateHandle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerDuxo newInstance(DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerStateProvider optionsPortfolioRiskAnalyzerStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(duxoBundle, optionsPortfolioRiskAnalyzerStateProvider, savedStateHandle);
    }

    public OptionsPortfolioRiskAnalyzerDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionsPortfolioRiskAnalyzerDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OptionsPortfolioRiskAnalyzerStateProvider optionsPortfolioRiskAnalyzerStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsPortfolioRiskAnalyzerStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(duxoBundle, optionsPortfolioRiskAnalyzerStateProvider, savedStateHandle);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerDuxo_Factory(duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerDuxo newInstance(DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerDuxo(duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
