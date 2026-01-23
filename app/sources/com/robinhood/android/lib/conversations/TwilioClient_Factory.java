package com.robinhood.android.lib.conversations;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.LogoutKillswitch;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TwilioClient_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioClient_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/conversations/TwilioClient;", "logoutKillswitch", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/LogoutKillswitch;", "chatTokenManager", "Lcom/robinhood/android/lib/conversations/ChatTokenManager;", "chatClientLogger", "Lcom/robinhood/android/lib/conversations/ChatClientLogger;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "appContext", "Landroid/content/Context;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TwilioClient_Factory implements Factory<TwilioClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> appContext;
    private final Provider<ChatClientLogger> chatClientLogger;
    private final Provider<ChatTokenManager> chatTokenManager;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<RxFactory> rxFactory;

    @JvmStatic
    public static final TwilioClient_Factory create(Provider<LogoutKillswitch> provider, Provider<ChatTokenManager> provider2, Provider<ChatClientLogger> provider3, Provider<RxFactory> provider4, Provider<Context> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TwilioClient newInstance(LogoutKillswitch logoutKillswitch, ChatTokenManager chatTokenManager, ChatClientLogger chatClientLogger, RxFactory rxFactory, Context context) {
        return INSTANCE.newInstance(logoutKillswitch, chatTokenManager, chatClientLogger, rxFactory, context);
    }

    public TwilioClient_Factory(Provider<LogoutKillswitch> logoutKillswitch, Provider<ChatTokenManager> chatTokenManager, Provider<ChatClientLogger> chatClientLogger, Provider<RxFactory> rxFactory, Provider<Context> appContext) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(chatTokenManager, "chatTokenManager");
        Intrinsics.checkNotNullParameter(chatClientLogger, "chatClientLogger");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.logoutKillswitch = logoutKillswitch;
        this.chatTokenManager = chatTokenManager;
        this.chatClientLogger = chatClientLogger;
        this.rxFactory = rxFactory;
        this.appContext = appContext;
    }

    @Override // javax.inject.Provider
    public TwilioClient get() {
        Companion companion = INSTANCE;
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        ChatTokenManager chatTokenManager = this.chatTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(chatTokenManager, "get(...)");
        ChatClientLogger chatClientLogger = this.chatClientLogger.get();
        Intrinsics.checkNotNullExpressionValue(chatClientLogger, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        return companion.newInstance(logoutKillswitch, chatTokenManager, chatClientLogger, rxFactory, context);
    }

    /* compiled from: TwilioClient_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioClient_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/conversations/TwilioClient_Factory;", "logoutKillswitch", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/LogoutKillswitch;", "chatTokenManager", "Lcom/robinhood/android/lib/conversations/ChatTokenManager;", "chatClientLogger", "Lcom/robinhood/android/lib/conversations/ChatClientLogger;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "appContext", "Landroid/content/Context;", "newInstance", "Lcom/robinhood/android/lib/conversations/TwilioClient;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TwilioClient_Factory create(Provider<LogoutKillswitch> logoutKillswitch, Provider<ChatTokenManager> chatTokenManager, Provider<ChatClientLogger> chatClientLogger, Provider<RxFactory> rxFactory, Provider<Context> appContext) {
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(chatTokenManager, "chatTokenManager");
            Intrinsics.checkNotNullParameter(chatClientLogger, "chatClientLogger");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return new TwilioClient_Factory(logoutKillswitch, chatTokenManager, chatClientLogger, rxFactory, appContext);
        }

        @JvmStatic
        public final TwilioClient newInstance(LogoutKillswitch logoutKillswitch, ChatTokenManager chatTokenManager, ChatClientLogger chatClientLogger, RxFactory rxFactory, Context appContext) {
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(chatTokenManager, "chatTokenManager");
            Intrinsics.checkNotNullParameter(chatClientLogger, "chatClientLogger");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return new TwilioClient(logoutKillswitch, chatTokenManager, chatClientLogger, rxFactory, appContext);
        }
    }
}
