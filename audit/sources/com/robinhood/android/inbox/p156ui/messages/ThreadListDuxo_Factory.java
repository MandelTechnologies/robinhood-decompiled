package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.InboxMessageStore;
import com.robinhood.librobinhood.data.store.InboxThreadStore;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo;", "salesforceChatStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/messages/ThreadListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ThreadListDuxo_Factory implements Factory<ThreadListDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<InboxMessageStore> inboxMessageStore;
    private final Provider<InboxThreadStore> inboxThreadStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<SalesforceChatStore> salesforceChatStore;
    private final Provider<ThreadListStateProvider> stateProvider;
    private final Provider<SupportChatStore> supportChatStore;
    private final Provider<TwilioManager> twilioManager;

    @JvmStatic
    public static final ThreadListDuxo_Factory create(Provider<SalesforceChatStore> provider, Provider<TwilioManager> provider2, Provider<SupportChatStore> provider3, Provider<PerformanceLogger> provider4, Provider<InboxBadgeStore> provider5, Provider<InboxMessageStore> provider6, Provider<InboxThreadStore> provider7, Provider<ThreadListStateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final ThreadListDuxo newInstance(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, PerformanceLogger performanceLogger, InboxBadgeStore inboxBadgeStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, ThreadListStateProvider threadListStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(salesforceChatStore, twilioManager, supportChatStore, performanceLogger, inboxBadgeStore, inboxMessageStore, inboxThreadStore, threadListStateProvider, duxoBundle);
    }

    public ThreadListDuxo_Factory(Provider<SalesforceChatStore> salesforceChatStore, Provider<TwilioManager> twilioManager, Provider<SupportChatStore> supportChatStore, Provider<PerformanceLogger> performanceLogger, Provider<InboxBadgeStore> inboxBadgeStore, Provider<InboxMessageStore> inboxMessageStore, Provider<InboxThreadStore> inboxThreadStore, Provider<ThreadListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
        Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.salesforceChatStore = salesforceChatStore;
        this.twilioManager = twilioManager;
        this.supportChatStore = supportChatStore;
        this.performanceLogger = performanceLogger;
        this.inboxBadgeStore = inboxBadgeStore;
        this.inboxMessageStore = inboxMessageStore;
        this.inboxThreadStore = inboxThreadStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public ThreadListDuxo get() {
        Companion companion = INSTANCE;
        SalesforceChatStore salesforceChatStore = this.salesforceChatStore.get();
        Intrinsics.checkNotNullExpressionValue(salesforceChatStore, "get(...)");
        TwilioManager twilioManager = this.twilioManager.get();
        Intrinsics.checkNotNullExpressionValue(twilioManager, "get(...)");
        SupportChatStore supportChatStore = this.supportChatStore.get();
        Intrinsics.checkNotNullExpressionValue(supportChatStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        InboxMessageStore inboxMessageStore = this.inboxMessageStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxMessageStore, "get(...)");
        InboxThreadStore inboxThreadStore = this.inboxThreadStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxThreadStore, "get(...)");
        ThreadListStateProvider threadListStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(threadListStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(salesforceChatStore, twilioManager, supportChatStore, performanceLogger, inboxBadgeStore, inboxMessageStore, inboxThreadStore, threadListStateProvider, duxoBundle);
    }

    /* compiled from: ThreadListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo_Factory;", "salesforceChatStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/messages/ThreadListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ThreadListDuxo_Factory create(Provider<SalesforceChatStore> salesforceChatStore, Provider<TwilioManager> twilioManager, Provider<SupportChatStore> supportChatStore, Provider<PerformanceLogger> performanceLogger, Provider<InboxBadgeStore> inboxBadgeStore, Provider<InboxMessageStore> inboxMessageStore, Provider<InboxThreadStore> inboxThreadStore, Provider<ThreadListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
            Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ThreadListDuxo_Factory(salesforceChatStore, twilioManager, supportChatStore, performanceLogger, inboxBadgeStore, inboxMessageStore, inboxThreadStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final ThreadListDuxo newInstance(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, PerformanceLogger performanceLogger, InboxBadgeStore inboxBadgeStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, ThreadListStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
            Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ThreadListDuxo(salesforceChatStore, twilioManager, supportChatStore, performanceLogger, inboxBadgeStore, inboxMessageStore, inboxThreadStore, stateProvider, duxoBundle);
        }
    }
}
