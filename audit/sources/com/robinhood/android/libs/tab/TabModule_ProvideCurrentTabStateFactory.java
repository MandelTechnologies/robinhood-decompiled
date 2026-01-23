package com.robinhood.android.libs.tab;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabModule_ProvideCurrentTabStateFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/libs/tab/TabModule_ProvideCurrentTabStateFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideCurrentTabState", "lib-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class TabModule_ProvideCurrentTabStateFactory implements Factory<CurrentTabManager> {
    public static final TabModule_ProvideCurrentTabStateFactory INSTANCE = new TabModule_ProvideCurrentTabStateFactory();

    private TabModule_ProvideCurrentTabStateFactory() {
    }

    @Override // javax.inject.Provider
    public CurrentTabManager get() {
        return provideCurrentTabState();
    }

    @JvmStatic
    public static final TabModule_ProvideCurrentTabStateFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final CurrentTabManager provideCurrentTabState() {
        Object objCheckNotNull = Preconditions.checkNotNull(TabModule.INSTANCE.provideCurrentTabState(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (CurrentTabManager) objCheckNotNull;
    }
}
