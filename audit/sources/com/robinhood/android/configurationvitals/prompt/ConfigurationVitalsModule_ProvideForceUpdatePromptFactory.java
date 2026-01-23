package com.robinhood.android.configurationvitals.prompt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.configurationvitals.ForceUpdatePrompt;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsModule_ProvideForceUpdatePromptFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ConfigurationVitalsModule_ProvideForceUpdatePromptFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideForceUpdatePrompt", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationVitalsModule_ProvideForceUpdatePromptFactory implements Factory<ForceUpdatePrompt> {
    public static final int $stable = 0;
    public static final ConfigurationVitalsModule_ProvideForceUpdatePromptFactory INSTANCE = new ConfigurationVitalsModule_ProvideForceUpdatePromptFactory();

    private ConfigurationVitalsModule_ProvideForceUpdatePromptFactory() {
    }

    @Override // javax.inject.Provider
    public ForceUpdatePrompt get() {
        return provideForceUpdatePrompt();
    }

    @JvmStatic
    public static final ConfigurationVitalsModule_ProvideForceUpdatePromptFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ForceUpdatePrompt provideForceUpdatePrompt() {
        Object objCheckNotNull = Preconditions.checkNotNull(ConfigurationVitalsModule.INSTANCE.provideForceUpdatePrompt(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ForceUpdatePrompt) objCheckNotNull;
    }
}
