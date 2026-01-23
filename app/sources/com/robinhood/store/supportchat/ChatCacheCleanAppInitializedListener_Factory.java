package com.robinhood.store.supportchat;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatCacheCleanAppInitializedListener_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChatCacheCleanAppInitializedListener_Factory implements Factory<ChatCacheCleanAppInitializedListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ChatCachedImageCleaner> chatCachedImageCleaner;
    private final Provider<CoroutineScope> coroutineScope;

    @JvmStatic
    public static final ChatCacheCleanAppInitializedListener_Factory create(Provider<CoroutineScope> provider, Provider<ChatCachedImageCleaner> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ChatCacheCleanAppInitializedListener newInstance(CoroutineScope coroutineScope, ChatCachedImageCleaner chatCachedImageCleaner) {
        return INSTANCE.newInstance(coroutineScope, chatCachedImageCleaner);
    }

    public ChatCacheCleanAppInitializedListener_Factory(Provider<CoroutineScope> coroutineScope, Provider<ChatCachedImageCleaner> chatCachedImageCleaner) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
        this.coroutineScope = coroutineScope;
        this.chatCachedImageCleaner = chatCachedImageCleaner;
    }

    @Override // javax.inject.Provider
    public ChatCacheCleanAppInitializedListener get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        ChatCachedImageCleaner chatCachedImageCleaner = this.chatCachedImageCleaner.get();
        Intrinsics.checkNotNullExpressionValue(chatCachedImageCleaner, "get(...)");
        return companion.newInstance(coroutineScope, chatCachedImageCleaner);
    }

    /* compiled from: ChatCacheCleanAppInitializedListener_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "newInstance", "Lcom/robinhood/store/supportchat/ChatCacheCleanAppInitializedListener;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChatCacheCleanAppInitializedListener_Factory create(Provider<CoroutineScope> coroutineScope, Provider<ChatCachedImageCleaner> chatCachedImageCleaner) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
            return new ChatCacheCleanAppInitializedListener_Factory(coroutineScope, chatCachedImageCleaner);
        }

        @JvmStatic
        public final ChatCacheCleanAppInitializedListener newInstance(CoroutineScope coroutineScope, ChatCachedImageCleaner chatCachedImageCleaner) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
            return new ChatCacheCleanAppInitializedListener(coroutineScope, chatCachedImageCleaner);
        }
    }
}
