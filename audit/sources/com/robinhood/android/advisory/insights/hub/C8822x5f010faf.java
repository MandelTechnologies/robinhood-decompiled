package com.robinhood.android.advisory.insights.hub;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_AdvisoryInsightsHubFragment_Companion_NavigationResolverModule_Provide_AdvisoryInsightsHubKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/hub/Hammer_AdvisoryInsightsHubFragment_Companion_NavigationResolverModule_Provide_AdvisoryInsightsHubKeyFactory;", "Ldagger/internal/Factory;", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide_AdvisoryInsightsHubKey", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.hub.Hammer_AdvisoryInsightsHubFragment_Companion_NavigationResolverModule_Provide_AdvisoryInsightsHubKeyFactory */
/* loaded from: classes7.dex */
public final class C8822x5f010faf implements Factory<Function0<NavigationResolver>> {
    public static final int $stable = 0;
    public static final C8822x5f010faf INSTANCE = new C8822x5f010faf();

    private C8822x5f010faf() {
    }

    @Override // javax.inject.Provider
    public Function0<NavigationResolver> get() {
        return provide_AdvisoryInsightsHubKey();
    }

    @JvmStatic
    public static final C8822x5f010faf create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Function0<NavigationResolver> provide_AdvisoryInsightsHubKey() {
        Object objCheckNotNull = Preconditions.checkNotNull(C8821x61f0ace0.INSTANCE.provide_AdvisoryInsightsHubKey(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Function0) objCheckNotNull;
    }
}
