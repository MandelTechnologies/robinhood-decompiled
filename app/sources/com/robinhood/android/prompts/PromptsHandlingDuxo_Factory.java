package com.robinhood.android.prompts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.shared.security.prompts.PromptsFetchManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsHandlingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/prompts/PromptsHandlingDuxo;", "promptsFetchManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PromptsHandlingDuxo_Factory implements Factory<PromptsHandlingDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PromptsFetchManager> promptsFetchManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<Sheriff> sheriff;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PromptsHandlingDuxo_Factory create(Provider<PromptsFetchManager> provider, Provider<Sheriff> provider2, Provider<DuxoBundle> provider3, Provider<SavedStateHandle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final PromptsHandlingDuxo newInstance(PromptsFetchManager promptsFetchManager, Sheriff sheriff, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(promptsFetchManager, sheriff, duxoBundle, savedStateHandle);
    }

    public PromptsHandlingDuxo_Factory(Provider<PromptsFetchManager> promptsFetchManager, Provider<Sheriff> sheriff, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(promptsFetchManager, "promptsFetchManager");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.promptsFetchManager = promptsFetchManager;
        this.sheriff = sheriff;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public PromptsHandlingDuxo get() {
        Companion companion = INSTANCE;
        PromptsFetchManager promptsFetchManager = this.promptsFetchManager.get();
        Intrinsics.checkNotNullExpressionValue(promptsFetchManager, "get(...)");
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(promptsFetchManager, sheriff, duxoBundle, savedStateHandle);
    }

    /* compiled from: PromptsHandlingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/prompts/PromptsHandlingDuxo_Factory;", "promptsFetchManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/prompts/PromptsHandlingDuxo;", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PromptsHandlingDuxo_Factory create(Provider<PromptsFetchManager> promptsFetchManager, Provider<Sheriff> sheriff, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(promptsFetchManager, "promptsFetchManager");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PromptsHandlingDuxo_Factory(promptsFetchManager, sheriff, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final PromptsHandlingDuxo newInstance(PromptsFetchManager promptsFetchManager, Sheriff sheriff, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(promptsFetchManager, "promptsFetchManager");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PromptsHandlingDuxo(promptsFetchManager, sheriff, duxoBundle, savedStateHandle);
        }
    }
}
