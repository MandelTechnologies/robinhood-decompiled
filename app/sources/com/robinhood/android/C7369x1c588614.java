package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicTranslationsModule_ProvideDynamicTranslationsContextWrapperFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/DynamicTranslationsModule_ProvideDynamicTranslationsContextWrapperFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideDynamicTranslationsContextWrapper", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.DynamicTranslationsModule_ProvideDynamicTranslationsContextWrapperFactory */
/* loaded from: classes24.dex */
public final class C7369x1c588614 implements Factory<DynamicTranslationsContextWrapper> {
    public static final C7369x1c588614 INSTANCE = new C7369x1c588614();

    private C7369x1c588614() {
    }

    @Override // javax.inject.Provider
    public DynamicTranslationsContextWrapper get() {
        return provideDynamicTranslationsContextWrapper();
    }

    @JvmStatic
    public static final C7369x1c588614 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final DynamicTranslationsContextWrapper provideDynamicTranslationsContextWrapper() {
        Object objCheckNotNull = Preconditions.checkNotNull(DynamicTranslationsModule.INSTANCE.provideDynamicTranslationsContextWrapper(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (DynamicTranslationsContextWrapper) objCheckNotNull;
    }
}
