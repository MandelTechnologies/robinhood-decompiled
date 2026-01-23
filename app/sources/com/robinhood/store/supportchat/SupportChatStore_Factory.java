package com.robinhood.store.supportchat;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.store.chat.common.ChatCache;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/supportchat/SupportChatStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/supportchat/SupportChatStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "supportChatApi", "Lcom/robinhood/android/api/supportchat/SupportChatApi;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "chatCache", "Lcom/robinhood/shared/store/chat/common/ChatCache;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SupportChatStore_Factory implements Factory<SupportChatStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<ChatCache> chatCache;
    private final Provider<DocUploadApi> docUploadApi;
    private final Provider<Installation> installation;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<SupportChatApi> supportChatApi;
    private final Provider<TwilioManager> twilioManager;

    @JvmStatic
    public static final SupportChatStore_Factory create(Provider<StoreBundle> provider, Provider<SupportChatApi> provider2, Provider<TwilioManager> provider3, Provider<DocUploadApi> provider4, Provider<ChatCache> provider5, Provider<BitmapStore> provider6, Provider<Installation> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final SupportChatStore newInstance(StoreBundle storeBundle, SupportChatApi supportChatApi, TwilioManager twilioManager, DocUploadApi docUploadApi, ChatCache chatCache, BitmapStore bitmapStore, Installation installation) {
        return INSTANCE.newInstance(storeBundle, supportChatApi, twilioManager, docUploadApi, chatCache, bitmapStore, installation);
    }

    public SupportChatStore_Factory(Provider<StoreBundle> storeBundle, Provider<SupportChatApi> supportChatApi, Provider<TwilioManager> twilioManager, Provider<DocUploadApi> docUploadApi, Provider<ChatCache> chatCache, Provider<BitmapStore> bitmapStore, Provider<Installation> installation) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(supportChatApi, "supportChatApi");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
        Intrinsics.checkNotNullParameter(chatCache, "chatCache");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.storeBundle = storeBundle;
        this.supportChatApi = supportChatApi;
        this.twilioManager = twilioManager;
        this.docUploadApi = docUploadApi;
        this.chatCache = chatCache;
        this.bitmapStore = bitmapStore;
        this.installation = installation;
    }

    @Override // javax.inject.Provider
    public SupportChatStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        SupportChatApi supportChatApi = this.supportChatApi.get();
        Intrinsics.checkNotNullExpressionValue(supportChatApi, "get(...)");
        TwilioManager twilioManager = this.twilioManager.get();
        Intrinsics.checkNotNullExpressionValue(twilioManager, "get(...)");
        DocUploadApi docUploadApi = this.docUploadApi.get();
        Intrinsics.checkNotNullExpressionValue(docUploadApi, "get(...)");
        ChatCache chatCache = this.chatCache.get();
        Intrinsics.checkNotNullExpressionValue(chatCache, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        return companion.newInstance(storeBundle, supportChatApi, twilioManager, docUploadApi, chatCache, bitmapStore, installation);
    }

    /* compiled from: SupportChatStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/supportchat/SupportChatStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/supportchat/SupportChatStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "supportChatApi", "Lcom/robinhood/android/api/supportchat/SupportChatApi;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "chatCache", "Lcom/robinhood/shared/store/chat/common/ChatCache;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "installation", "Lcom/robinhood/prefs/Installation;", "newInstance", "Lcom/robinhood/store/supportchat/SupportChatStore;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SupportChatStore_Factory create(Provider<StoreBundle> storeBundle, Provider<SupportChatApi> supportChatApi, Provider<TwilioManager> twilioManager, Provider<DocUploadApi> docUploadApi, Provider<ChatCache> chatCache, Provider<BitmapStore> bitmapStore, Provider<Installation> installation) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(supportChatApi, "supportChatApi");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
            Intrinsics.checkNotNullParameter(chatCache, "chatCache");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(installation, "installation");
            return new SupportChatStore_Factory(storeBundle, supportChatApi, twilioManager, docUploadApi, chatCache, bitmapStore, installation);
        }

        @JvmStatic
        public final SupportChatStore newInstance(StoreBundle storeBundle, SupportChatApi supportChatApi, TwilioManager twilioManager, DocUploadApi docUploadApi, ChatCache chatCache, BitmapStore bitmapStore, Installation installation) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(supportChatApi, "supportChatApi");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
            Intrinsics.checkNotNullParameter(chatCache, "chatCache");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(installation, "installation");
            return new SupportChatStore(storeBundle, supportChatApi, twilioManager, docUploadApi, chatCache, bitmapStore, installation);
        }
    }
}
