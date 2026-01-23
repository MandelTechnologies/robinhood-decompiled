package com.robinhood.android.lib.pathfinder.p170di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.pathfinder.UserViewPageResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserViewPageResolverModule_ProvidePageResolverPlaidAuthenticationFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/di/UserViewPageResolverModule_ProvidePageResolverPlaidAuthenticationFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "providePageResolverPlaidAuthentication", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.di.UserViewPageResolverModule_ProvidePageResolverPlaidAuthenticationFactory */
/* loaded from: classes17.dex */
public final class C20433xff90131a implements Factory<UserViewPageResolver> {
    public static final int $stable = 0;
    public static final C20433xff90131a INSTANCE = new C20433xff90131a();

    private C20433xff90131a() {
    }

    @Override // javax.inject.Provider
    public UserViewPageResolver get() {
        return providePageResolverPlaidAuthentication();
    }

    @JvmStatic
    public static final C20433xff90131a create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final UserViewPageResolver providePageResolverPlaidAuthentication() {
        Object objCheckNotNull = Preconditions.checkNotNull(UserViewPageResolverModule.INSTANCE.providePageResolverPlaidAuthentication(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (UserViewPageResolver) objCheckNotNull;
    }
}
