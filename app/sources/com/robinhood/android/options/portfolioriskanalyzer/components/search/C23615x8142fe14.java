package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxoKeysModule_ProvideViewModelMapKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxoKeysModule_ProvideViewModelMapKeyFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideViewModelMapKey", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxoKeysModule_ProvideViewModelMapKeyFactory */
/* loaded from: classes11.dex */
public final class C23615x8142fe14 implements Factory<String> {
    public static final int $stable = 0;
    public static final C23615x8142fe14 INSTANCE = new C23615x8142fe14();

    private C23615x8142fe14() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideViewModelMapKey();
    }

    @JvmStatic
    public static final C23615x8142fe14 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideViewModelMapKey() {
        Object objCheckNotNull = Preconditions.checkNotNull(OptionsPortfolioRiskAnalyzerSearchDuxo_Hammer2.INSTANCE.provideViewModelMapKey(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
