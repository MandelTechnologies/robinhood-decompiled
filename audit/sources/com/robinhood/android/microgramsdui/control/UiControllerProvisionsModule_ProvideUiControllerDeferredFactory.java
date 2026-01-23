package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: UiControllerProvisionsModule_ProvideUiControllerDeferredFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiControllerProvisionsModule_ProvideUiControllerDeferredFactory;", "Ldagger/internal/Factory;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideUiControllerDeferred", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UiControllerProvisionsModule_ProvideUiControllerDeferredFactory implements Factory<CompletableDeferred<UiController>> {
    public static final int $stable = 0;
    public static final UiControllerProvisionsModule_ProvideUiControllerDeferredFactory INSTANCE = new UiControllerProvisionsModule_ProvideUiControllerDeferredFactory();

    private UiControllerProvisionsModule_ProvideUiControllerDeferredFactory() {
    }

    @Override // javax.inject.Provider
    public CompletableDeferred<UiController> get() {
        return provideUiControllerDeferred();
    }

    @JvmStatic
    public static final UiControllerProvisionsModule_ProvideUiControllerDeferredFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final CompletableDeferred<UiController> provideUiControllerDeferred() {
        Object objCheckNotNull = Preconditions.checkNotNull(UiController5.INSTANCE.provideUiControllerDeferred(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (CompletableDeferred) objCheckNotNull;
    }
}
