package com.robinhood.store.supportchat;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: ChatCachedImageCleaner_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatCachedImageCleaner_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "newInstance", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChatCachedImageCleaner_Factory implements Factory<ChatCachedImageCleaner> {
    public static final ChatCachedImageCleaner_Factory INSTANCE = new ChatCachedImageCleaner_Factory();

    private ChatCachedImageCleaner_Factory() {
    }

    @Override // javax.inject.Provider
    public ChatCachedImageCleaner get() {
        return newInstance();
    }

    @JvmStatic
    public static final ChatCachedImageCleaner_Factory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ChatCachedImageCleaner newInstance() {
        return new ChatCachedImageCleaner();
    }
}
