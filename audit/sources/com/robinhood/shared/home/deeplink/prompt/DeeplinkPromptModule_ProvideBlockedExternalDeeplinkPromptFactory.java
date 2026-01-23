package com.robinhood.shared.home.deeplink.prompt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/home/deeplink/prompt/DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideBlockedExternalDeeplinkPrompt", "lib-deeplink-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory implements Factory<BlockedExternalDeeplinkPrompt> {
    public static final int $stable = 0;
    public static final DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory INSTANCE = new DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory();

    private DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory() {
    }

    @Override // javax.inject.Provider
    public BlockedExternalDeeplinkPrompt get() {
        return provideBlockedExternalDeeplinkPrompt();
    }

    @JvmStatic
    public static final DeeplinkPromptModule_ProvideBlockedExternalDeeplinkPromptFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final BlockedExternalDeeplinkPrompt provideBlockedExternalDeeplinkPrompt() {
        Object objCheckNotNull = Preconditions.checkNotNull(DeeplinkPromptModule.INSTANCE.provideBlockedExternalDeeplinkPrompt(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (BlockedExternalDeeplinkPrompt) objCheckNotNull;
    }
}
