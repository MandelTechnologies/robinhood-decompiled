package com.robinhood.prefs.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.ResumeApplicationOverridePreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplicationModule_ProvideResumeApplicationOverridePreferenceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/prefs/dagger/ResumeApplicationModule_ProvideResumeApplicationOverridePreferenceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/ResumeApplicationOverridePreference;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideResumeApplicationOverridePreference", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.prefs.dagger.ResumeApplicationModule_ProvideResumeApplicationOverridePreferenceFactory */
/* loaded from: classes26.dex */
public final class C36132xd74ea3d1 implements Factory<ResumeApplicationOverridePreference> {
    public static final C36132xd74ea3d1 INSTANCE = new C36132xd74ea3d1();

    private C36132xd74ea3d1() {
    }

    @Override // javax.inject.Provider
    public ResumeApplicationOverridePreference get() {
        return provideResumeApplicationOverridePreference();
    }

    @JvmStatic
    public static final C36132xd74ea3d1 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ResumeApplicationOverridePreference provideResumeApplicationOverridePreference() {
        Object objCheckNotNull = Preconditions.checkNotNull(ResumeApplicationModule.INSTANCE.provideResumeApplicationOverridePreference(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ResumeApplicationOverridePreference) objCheckNotNull;
    }
}
