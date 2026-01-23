package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotModule_ProvideServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotModule_ProvideServiceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "rest", "Ljavax/inject/Provider;", "Lcom/robinhood/chatbot/proto/v1/RestChatbot;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ChatbotModule_ProvideServiceFactory implements Factory<Chatbot> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RestChatbot> rest;

    @JvmStatic
    public static final ChatbotModule_ProvideServiceFactory create(Provider<RestChatbot> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Chatbot provideService(Lazy<RestChatbot> lazy) {
        return INSTANCE.provideService(lazy);
    }

    public ChatbotModule_ProvideServiceFactory(Provider<RestChatbot> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        this.rest = rest;
    }

    @Override // javax.inject.Provider
    public Chatbot get() {
        Companion companion = INSTANCE;
        Lazy<RestChatbot> lazy = DoubleCheck.lazy(this.rest);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideService(lazy);
    }

    /* compiled from: ChatbotModule_ProvideServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotModule_ProvideServiceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/chatbot/proto/v1/ChatbotModule_ProvideServiceFactory;", "rest", "Ljavax/inject/Provider;", "Lcom/robinhood/chatbot/proto/v1/RestChatbot;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideService", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "Ldagger/Lazy;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChatbotModule_ProvideServiceFactory create(Provider<RestChatbot> rest) {
            Intrinsics.checkNotNullParameter(rest, "rest");
            return new ChatbotModule_ProvideServiceFactory(rest);
        }

        @JvmStatic
        public final Chatbot provideService(Lazy<RestChatbot> rest) {
            Intrinsics.checkNotNullParameter(rest, "rest");
            Object objCheckNotNull = Preconditions.checkNotNull(ChatbotModule.INSTANCE.provideService(rest), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Chatbot) objCheckNotNull;
        }
    }
}
