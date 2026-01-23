package com.robinhood.security.prompts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsChallengeStatusManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/security/prompts/PromptsChallengeStatusManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-security_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PromptsChallengeStatusManager_Factory implements Factory<PromptsChallengeStatusManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RxFactory> rxFactory;
    private final Provider<Sheriff> sheriff;

    @JvmStatic
    public static final PromptsChallengeStatusManager_Factory create(Provider<Sheriff> provider, Provider<RxFactory> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final PromptsChallengeStatusManager newInstance(Sheriff sheriff, RxFactory rxFactory) {
        return INSTANCE.newInstance(sheriff, rxFactory);
    }

    public PromptsChallengeStatusManager_Factory(Provider<Sheriff> sheriff, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.sheriff = sheriff;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public PromptsChallengeStatusManager get() {
        Companion companion = INSTANCE;
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(sheriff, rxFactory);
    }

    /* compiled from: PromptsChallengeStatusManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/security/prompts/PromptsChallengeStatusManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager_Factory;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "lib-security_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PromptsChallengeStatusManager_Factory create(Provider<Sheriff> sheriff, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new PromptsChallengeStatusManager_Factory(sheriff, rxFactory);
        }

        @JvmStatic
        public final PromptsChallengeStatusManager newInstance(Sheriff sheriff, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new PromptsChallengeStatusManager(sheriff, rxFactory);
        }
    }
}
