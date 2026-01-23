package com.robinhood.android.supportchat.thread;

import android.net.ConnectivityManager;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.store.data.store.chatbot.ChatbotStore;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.net.ActiveNetworkCounter;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/supportchat/thread/CxChatStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "salesforceChatStore", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "chatbotStore", "Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "installation", "Lcom/robinhood/prefs/Installation;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CxChatDuxo_Factory implements Factory<CxChatDuxo> {
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<ChatbotStore> chatbotStore;
    private final Provider<ConnectivityManager> connectivityManager;
    private final Provider<DocUploadApi> docUploadApi;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InFlightMessageStore> inFlightMessageStore;
    private final Provider<Installation> installation;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ActiveNetworkCounter> networkCounter;
    private final Provider<SalesforceChatStore> salesforceChatStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CxChatStateProvider> stateProvider;
    private final Provider<SupportChatStore> supportChatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CxChatDuxo_Factory create(Provider<CxChatStateProvider> provider, Provider<DuxoBundle> provider2, Provider<LazyMoshi> provider3, Provider<SavedStateHandle> provider4, Provider<SupportChatStore> provider5, Provider<SalesforceChatStore> provider6, Provider<ChatbotStore> provider7, Provider<InFlightMessageStore> provider8, Provider<BitmapStore> provider9, Provider<DocUploadApi> provider10, Provider<Installation> provider11, Provider<ActiveNetworkCounter> provider12, Provider<ExperimentsStore> provider13, Provider<ConnectivityManager> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final CxChatDuxo newInstance(CxChatStateProvider cxChatStateProvider, DuxoBundle duxoBundle, LazyMoshi lazyMoshi, SavedStateHandle savedStateHandle, SupportChatStore supportChatStore, SalesforceChatStore salesforceChatStore, ChatbotStore chatbotStore, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, DocUploadApi docUploadApi, Installation installation, ActiveNetworkCounter activeNetworkCounter, ExperimentsStore experimentsStore, ConnectivityManager connectivityManager) {
        return INSTANCE.newInstance(cxChatStateProvider, duxoBundle, lazyMoshi, savedStateHandle, supportChatStore, salesforceChatStore, chatbotStore, inFlightMessageStore, bitmapStore, docUploadApi, installation, activeNetworkCounter, experimentsStore, connectivityManager);
    }

    public CxChatDuxo_Factory(Provider<CxChatStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<LazyMoshi> moshi, Provider<SavedStateHandle> savedStateHandle, Provider<SupportChatStore> supportChatStore, Provider<SalesforceChatStore> salesforceChatStore, Provider<ChatbotStore> chatbotStore, Provider<InFlightMessageStore> inFlightMessageStore, Provider<BitmapStore> bitmapStore, Provider<DocUploadApi> docUploadApi, Provider<Installation> installation, Provider<ActiveNetworkCounter> networkCounter, Provider<ExperimentsStore> experimentsStore, Provider<ConnectivityManager> connectivityManager) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(chatbotStore, "chatbotStore");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(networkCounter, "networkCounter");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
        this.supportChatStore = supportChatStore;
        this.salesforceChatStore = salesforceChatStore;
        this.chatbotStore = chatbotStore;
        this.inFlightMessageStore = inFlightMessageStore;
        this.bitmapStore = bitmapStore;
        this.docUploadApi = docUploadApi;
        this.installation = installation;
        this.networkCounter = networkCounter;
        this.experimentsStore = experimentsStore;
        this.connectivityManager = connectivityManager;
    }

    @Override // javax.inject.Provider
    public CxChatDuxo get() {
        Companion companion = INSTANCE;
        CxChatStateProvider cxChatStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cxChatStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SupportChatStore supportChatStore = this.supportChatStore.get();
        Intrinsics.checkNotNullExpressionValue(supportChatStore, "get(...)");
        SalesforceChatStore salesforceChatStore = this.salesforceChatStore.get();
        Intrinsics.checkNotNullExpressionValue(salesforceChatStore, "get(...)");
        ChatbotStore chatbotStore = this.chatbotStore.get();
        Intrinsics.checkNotNullExpressionValue(chatbotStore, "get(...)");
        InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore.get();
        Intrinsics.checkNotNullExpressionValue(inFlightMessageStore, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        DocUploadApi docUploadApi = this.docUploadApi.get();
        Intrinsics.checkNotNullExpressionValue(docUploadApi, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        ActiveNetworkCounter activeNetworkCounter = this.networkCounter.get();
        Intrinsics.checkNotNullExpressionValue(activeNetworkCounter, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ConnectivityManager connectivityManager = this.connectivityManager.get();
        Intrinsics.checkNotNullExpressionValue(connectivityManager, "get(...)");
        return companion.newInstance(cxChatStateProvider, duxoBundle, lazyMoshi, savedStateHandle, supportChatStore, salesforceChatStore, chatbotStore, inFlightMessageStore, bitmapStore, docUploadApi, installation, activeNetworkCounter, experimentsStore, connectivityManager);
    }

    /* compiled from: CxChatDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/supportchat/thread/CxChatDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/supportchat/thread/CxChatStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "salesforceChatStore", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "chatbotStore", "Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "installation", "Lcom/robinhood/prefs/Installation;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "connectivityManager", "Landroid/net/ConnectivityManager;", "newInstance", "Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CxChatDuxo_Factory create(Provider<CxChatStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<LazyMoshi> moshi, Provider<SavedStateHandle> savedStateHandle, Provider<SupportChatStore> supportChatStore, Provider<SalesforceChatStore> salesforceChatStore, Provider<ChatbotStore> chatbotStore, Provider<InFlightMessageStore> inFlightMessageStore, Provider<BitmapStore> bitmapStore, Provider<DocUploadApi> docUploadApi, Provider<Installation> installation, Provider<ActiveNetworkCounter> networkCounter, Provider<ExperimentsStore> experimentsStore, Provider<ConnectivityManager> connectivityManager) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(chatbotStore, "chatbotStore");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(networkCounter, "networkCounter");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            return new CxChatDuxo_Factory(stateProvider, duxoBundle, moshi, savedStateHandle, supportChatStore, salesforceChatStore, chatbotStore, inFlightMessageStore, bitmapStore, docUploadApi, installation, networkCounter, experimentsStore, connectivityManager);
        }

        @JvmStatic
        public final CxChatDuxo newInstance(CxChatStateProvider stateProvider, DuxoBundle duxoBundle, LazyMoshi moshi, SavedStateHandle savedStateHandle, SupportChatStore supportChatStore, SalesforceChatStore salesforceChatStore, ChatbotStore chatbotStore, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, DocUploadApi docUploadApi, Installation installation, ActiveNetworkCounter networkCounter, ExperimentsStore experimentsStore, ConnectivityManager connectivityManager) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(chatbotStore, "chatbotStore");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(networkCounter, "networkCounter");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            return new CxChatDuxo(stateProvider, duxoBundle, moshi, savedStateHandle, supportChatStore, salesforceChatStore, chatbotStore, inFlightMessageStore, bitmapStore, docUploadApi, installation, networkCounter, experimentsStore, connectivityManager);
        }
    }
}
