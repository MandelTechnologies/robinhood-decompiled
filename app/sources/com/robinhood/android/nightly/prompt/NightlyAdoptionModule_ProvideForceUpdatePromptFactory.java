package com.robinhood.android.nightly.prompt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyAdoptionModule_ProvideForceUpdatePromptFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideForceUpdatePromptFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideForceUpdatePrompt", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyAdoptionModule_ProvideForceUpdatePromptFactory implements Factory<NightlyUpgradePrompt> {
    public static final int $stable = 0;
    public static final NightlyAdoptionModule_ProvideForceUpdatePromptFactory INSTANCE = new NightlyAdoptionModule_ProvideForceUpdatePromptFactory();

    private NightlyAdoptionModule_ProvideForceUpdatePromptFactory() {
    }

    @Override // javax.inject.Provider
    public NightlyUpgradePrompt get() {
        return provideForceUpdatePrompt();
    }

    @JvmStatic
    public static final NightlyAdoptionModule_ProvideForceUpdatePromptFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final NightlyUpgradePrompt provideForceUpdatePrompt() {
        Object objCheckNotNull = Preconditions.checkNotNull(NightlyAdoptionModule.INSTANCE.provideForceUpdatePrompt(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (NightlyUpgradePrompt) objCheckNotNull;
    }
}
