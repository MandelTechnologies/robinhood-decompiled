package com.robinhood.android.autoeventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.p409ui.view.GlobalOnClickListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoLoggableViewModule_ProvideAnalyticsGlobalClickListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/AutoLoggableViewModule_ProvideAnalyticsGlobalClickListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/ui/view/GlobalOnClickListener;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideAnalyticsGlobalClickListener", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.autoeventlogging.AutoLoggableViewModule_ProvideAnalyticsGlobalClickListenerFactory */
/* loaded from: classes7.dex */
public final class C9626x977cc3b8 implements Factory<GlobalOnClickListener> {
    public static final C9626x977cc3b8 INSTANCE = new C9626x977cc3b8();

    private C9626x977cc3b8() {
    }

    @Override // javax.inject.Provider
    public GlobalOnClickListener get() {
        return provideAnalyticsGlobalClickListener();
    }

    @JvmStatic
    public static final C9626x977cc3b8 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final GlobalOnClickListener provideAnalyticsGlobalClickListener() {
        Object objCheckNotNull = Preconditions.checkNotNull(AutoLoggableViewModule.INSTANCE.provideAnalyticsGlobalClickListener(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (GlobalOnClickListener) objCheckNotNull;
    }
}
