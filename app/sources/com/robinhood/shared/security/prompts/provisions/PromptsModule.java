package com.robinhood.shared.security.prompts.provisions;

import com.robinhood.shared.security.prompts.PromptsFetchManager;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/security/prompts/provisions/PromptsModule;", "", "<init>", "()V", "providePromptsFetchManagerActivityListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "promptsFetchManager", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "lib-prompts-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PromptsModule {
    public static final PromptsModule INSTANCE = new PromptsModule();

    public final ActivityLifecycleListener providePromptsFetchManagerActivityListener(PromptsFetchManager promptsFetchManager) {
        Intrinsics.checkNotNullParameter(promptsFetchManager, "promptsFetchManager");
        return promptsFetchManager;
    }

    private PromptsModule() {
    }
}
