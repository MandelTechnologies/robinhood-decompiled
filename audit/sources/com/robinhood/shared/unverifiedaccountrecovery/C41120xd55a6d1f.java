package com.robinhood.shared.unverifiedaccountrecovery;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_UarVerificationSuccessFragment_Companion_NavigationResolverModule_Provide_LegacyFragmentKey_UarVerificationSuccessFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/Hammer_UarVerificationSuccessFragment_Companion_NavigationResolverModule_Provide_LegacyFragmentKey_UarVerificationSuccessFactory;", "Ldagger/internal/Factory;", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide_LegacyFragmentKey_UarVerificationSuccess", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.Hammer_UarVerificationSuccessFragment_Companion_NavigationResolverModule_Provide_LegacyFragmentKey_UarVerificationSuccessFactory */
/* loaded from: classes21.dex */
public final class C41120xd55a6d1f implements Factory<Function0<NavigationResolver>> {
    public static final int $stable = 0;
    public static final C41120xd55a6d1f INSTANCE = new C41120xd55a6d1f();

    private C41120xd55a6d1f() {
    }

    @Override // javax.inject.Provider
    public Function0<NavigationResolver> get() {
        return provide_LegacyFragmentKey_UarVerificationSuccess();
    }

    @JvmStatic
    public static final C41120xd55a6d1f create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Function0<NavigationResolver> provide_LegacyFragmentKey_UarVerificationSuccess() {
        Object objCheckNotNull = Preconditions.checkNotNull(C41119xa854e2ed.INSTANCE.provide_LegacyFragmentKey_UarVerificationSuccess(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Function0) objCheckNotNull;
    }
}
