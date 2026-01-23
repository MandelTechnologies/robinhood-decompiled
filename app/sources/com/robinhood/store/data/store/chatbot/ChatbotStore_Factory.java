package com.robinhood.store.data.store.chatbot;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.chatbot.proto.p285v1.Chatbot;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: ChatbotStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/data/store/chatbot/ChatbotStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "chatbotApi", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "inFlightMessageStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-chatbot_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChatbotStore_Factory implements Factory<ChatbotStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Chatbot> chatbotApi;
    private final Provider<Clock> clock;
    private final Provider<InFlightMessageStore> inFlightMessageStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final ChatbotStore_Factory create(Provider<StoreBundle> provider, Provider<Chatbot> provider2, Provider<InFlightMessageStore> provider3, Provider<Clock> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ChatbotStore newInstance(StoreBundle storeBundle, Chatbot chatbot, InFlightMessageStore inFlightMessageStore, Clock clock) {
        return INSTANCE.newInstance(storeBundle, chatbot, inFlightMessageStore, clock);
    }

    public ChatbotStore_Factory(Provider<StoreBundle> storeBundle, Provider<Chatbot> chatbotApi, Provider<InFlightMessageStore> inFlightMessageStore, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(chatbotApi, "chatbotApi");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.storeBundle = storeBundle;
        this.chatbotApi = chatbotApi;
        this.inFlightMessageStore = inFlightMessageStore;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public ChatbotStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        Chatbot chatbot = this.chatbotApi.get();
        Intrinsics.checkNotNullExpressionValue(chatbot, "get(...)");
        InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore.get();
        Intrinsics.checkNotNullExpressionValue(inFlightMessageStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(storeBundle, chatbot, inFlightMessageStore, clock);
    }

    /* compiled from: ChatbotStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/data/store/chatbot/ChatbotStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "chatbotApi", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "inFlightMessageStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/data/store/chatbot/ChatbotStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/data/store/chatbot/ChatbotStore_Factory;", "Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "newInstance", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/chatbot/proto/v1/Chatbot;Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;Lj$/time/Clock;)Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "lib-store-chatbot_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChatbotStore_Factory create(Provider<StoreBundle> storeBundle, Provider<Chatbot> chatbotApi, Provider<InFlightMessageStore> inFlightMessageStore, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(chatbotApi, "chatbotApi");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ChatbotStore_Factory(storeBundle, chatbotApi, inFlightMessageStore, clock);
        }

        @JvmStatic
        public final ChatbotStore newInstance(StoreBundle storeBundle, Chatbot chatbotApi, InFlightMessageStore inFlightMessageStore, Clock clock) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(chatbotApi, "chatbotApi");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ChatbotStore(storeBundle, chatbotApi, inFlightMessageStore, clock);
        }
    }
}
