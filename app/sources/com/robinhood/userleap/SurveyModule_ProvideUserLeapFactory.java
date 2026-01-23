package com.robinhood.userleap;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.userleap.UserLeap;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyModule_ProvideUserLeapFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/userleap/SurveyModule_ProvideUserLeapFactory;", "Ldagger/internal/Factory;", "Lcom/userleap/UserLeap;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideUserLeap", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SurveyModule_ProvideUserLeapFactory implements Factory<UserLeap> {
    public static final SurveyModule_ProvideUserLeapFactory INSTANCE = new SurveyModule_ProvideUserLeapFactory();

    private SurveyModule_ProvideUserLeapFactory() {
    }

    @Override // javax.inject.Provider
    public UserLeap get() {
        return provideUserLeap();
    }

    @JvmStatic
    public static final SurveyModule_ProvideUserLeapFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final UserLeap provideUserLeap() {
        Object objCheckNotNull = Preconditions.checkNotNull(SurveyModule.INSTANCE.provideUserLeap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (UserLeap) objCheckNotNull;
    }
}
