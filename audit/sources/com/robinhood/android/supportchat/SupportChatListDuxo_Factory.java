package com.robinhood.android.supportchat;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/supportchat/SupportChatListDuxo;", "salesforceChatStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "stateProvider", "Lcom/robinhood/android/supportchat/SupportChatListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SupportChatListDuxo_Factory implements Factory<SupportChatListDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SalesforceChatStore> salesforceChatStore;
    private final Provider<SupportChatListStateProvider> stateProvider;
    private final Provider<SupportChatStore> supportChatStore;
    private final Provider<TwilioManager> twilioManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SupportChatListDuxo_Factory create(Provider<SalesforceChatStore> provider, Provider<TwilioManager> provider2, Provider<SupportChatStore> provider3, Provider<SupportChatListStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final SupportChatListDuxo newInstance(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, SupportChatListStateProvider supportChatListStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(salesforceChatStore, twilioManager, supportChatStore, supportChatListStateProvider, duxoBundle);
    }

    public SupportChatListDuxo_Factory(Provider<SalesforceChatStore> salesforceChatStore, Provider<TwilioManager> twilioManager, Provider<SupportChatStore> supportChatStore, Provider<SupportChatListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.salesforceChatStore = salesforceChatStore;
        this.twilioManager = twilioManager;
        this.supportChatStore = supportChatStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SupportChatListDuxo get() {
        Companion companion = INSTANCE;
        SalesforceChatStore salesforceChatStore = this.salesforceChatStore.get();
        Intrinsics.checkNotNullExpressionValue(salesforceChatStore, "get(...)");
        TwilioManager twilioManager = this.twilioManager.get();
        Intrinsics.checkNotNullExpressionValue(twilioManager, "get(...)");
        SupportChatStore supportChatStore = this.supportChatStore.get();
        Intrinsics.checkNotNullExpressionValue(supportChatStore, "get(...)");
        SupportChatListStateProvider supportChatListStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(supportChatListStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(salesforceChatStore, twilioManager, supportChatStore, supportChatListStateProvider, duxoBundle);
    }

    /* compiled from: SupportChatListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/supportchat/SupportChatListDuxo_Factory;", "salesforceChatStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "stateProvider", "Lcom/robinhood/android/supportchat/SupportChatListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/supportchat/SupportChatListDuxo;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SupportChatListDuxo_Factory create(Provider<SalesforceChatStore> salesforceChatStore, Provider<TwilioManager> twilioManager, Provider<SupportChatStore> supportChatStore, Provider<SupportChatListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SupportChatListDuxo_Factory(salesforceChatStore, twilioManager, supportChatStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final SupportChatListDuxo newInstance(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, SupportChatListStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
            Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
            Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SupportChatListDuxo(salesforceChatStore, twilioManager, supportChatStore, stateProvider, duxoBundle);
        }
    }
}
