package com.robinhood.android.directipo.allocation.p104ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_DirectIpoSummaryActivity_Companion_NavigationResolverModule_Provide_LegacyIntentKey_DirectIpoSummaryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/Hammer_DirectIpoSummaryActivity_Companion_NavigationResolverModule_Provide_LegacyIntentKey_DirectIpoSummaryFactory;", "Ldagger/internal/Factory;", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide_LegacyIntentKey_DirectIpoSummary", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.Hammer_DirectIpoSummaryActivity_Companion_NavigationResolverModule_Provide_LegacyIntentKey_DirectIpoSummaryFactory */
/* loaded from: classes17.dex */
public final class C14216x97ba45aa implements Factory<Function0<NavigationResolver>> {
    public static final int $stable = 0;
    public static final C14216x97ba45aa INSTANCE = new C14216x97ba45aa();

    private C14216x97ba45aa() {
    }

    @Override // javax.inject.Provider
    public Function0<NavigationResolver> get() {
        return provide_LegacyIntentKey_DirectIpoSummary();
    }

    @JvmStatic
    public static final C14216x97ba45aa create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Function0<NavigationResolver> provide_LegacyIntentKey_DirectIpoSummary() {
        Object objCheckNotNull = Preconditions.checkNotNull(C14215x7db9eae9.INSTANCE.provide_LegacyIntentKey_DirectIpoSummary(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Function0) objCheckNotNull;
    }
}
