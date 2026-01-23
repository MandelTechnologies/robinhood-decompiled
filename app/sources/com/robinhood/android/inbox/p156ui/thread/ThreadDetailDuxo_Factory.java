package com.robinhood.android.inbox.p156ui.thread;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InboxMessageStore;
import com.robinhood.librobinhood.data.store.InboxThreadStore;
import com.robinhood.librobinhood.data.store.InboxUserInputStore;
import com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore;
import com.robinhood.shared.common.store.media.MediaStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "inboxUserInputStore", "Lcom/robinhood/librobinhood/data/store/InboxUserInputStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "threadNotificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ThreadDetailDuxo_Factory implements Factory<ThreadDetailDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InboxMessageStore> inboxMessageStore;
    private final Provider<InboxThreadStore> inboxThreadStore;
    private final Provider<InboxUserInputStore> inboxUserInputStore;
    private final Provider<MediaStore> mediaStore;
    private final Provider<ThreadDetailStateProvider> stateProvider;
    private final Provider<ThreadNotificationSettingsStore> threadNotificationSettingsStore;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final ThreadDetailDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<InboxMessageStore> provider2, Provider<InboxThreadStore> provider3, Provider<InboxUserInputStore> provider4, Provider<MediaStore> provider5, Provider<ThreadNotificationSettingsStore> provider6, Provider<UserStore> provider7, Provider<ThreadDetailStateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final ThreadDetailDuxo newInstance(ExperimentsStore experimentsStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, InboxUserInputStore inboxUserInputStore, MediaStore mediaStore, ThreadNotificationSettingsStore threadNotificationSettingsStore, UserStore userStore, ThreadDetailStateProvider threadDetailStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(experimentsStore, inboxMessageStore, inboxThreadStore, inboxUserInputStore, mediaStore, threadNotificationSettingsStore, userStore, threadDetailStateProvider, duxoBundle);
    }

    public ThreadDetailDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<InboxMessageStore> inboxMessageStore, Provider<InboxThreadStore> inboxThreadStore, Provider<InboxUserInputStore> inboxUserInputStore, Provider<MediaStore> mediaStore, Provider<ThreadNotificationSettingsStore> threadNotificationSettingsStore, Provider<UserStore> userStore, Provider<ThreadDetailStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
        Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
        Intrinsics.checkNotNullParameter(inboxUserInputStore, "inboxUserInputStore");
        Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
        Intrinsics.checkNotNullParameter(threadNotificationSettingsStore, "threadNotificationSettingsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.inboxMessageStore = inboxMessageStore;
        this.inboxThreadStore = inboxThreadStore;
        this.inboxUserInputStore = inboxUserInputStore;
        this.mediaStore = mediaStore;
        this.threadNotificationSettingsStore = threadNotificationSettingsStore;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public ThreadDetailDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InboxMessageStore inboxMessageStore = this.inboxMessageStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxMessageStore, "get(...)");
        InboxThreadStore inboxThreadStore = this.inboxThreadStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxThreadStore, "get(...)");
        InboxUserInputStore inboxUserInputStore = this.inboxUserInputStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxUserInputStore, "get(...)");
        MediaStore mediaStore = this.mediaStore.get();
        Intrinsics.checkNotNullExpressionValue(mediaStore, "get(...)");
        ThreadNotificationSettingsStore threadNotificationSettingsStore = this.threadNotificationSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(threadNotificationSettingsStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        ThreadDetailStateProvider threadDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(threadDetailStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(experimentsStore, inboxMessageStore, inboxThreadStore, inboxUserInputStore, mediaStore, threadNotificationSettingsStore, userStore, threadDetailStateProvider, duxoBundle);
    }

    /* compiled from: ThreadDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "inboxUserInputStore", "Lcom/robinhood/librobinhood/data/store/InboxUserInputStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "threadNotificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ThreadDetailDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<InboxMessageStore> inboxMessageStore, Provider<InboxThreadStore> inboxThreadStore, Provider<InboxUserInputStore> inboxUserInputStore, Provider<MediaStore> mediaStore, Provider<ThreadNotificationSettingsStore> threadNotificationSettingsStore, Provider<UserStore> userStore, Provider<ThreadDetailStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
            Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
            Intrinsics.checkNotNullParameter(inboxUserInputStore, "inboxUserInputStore");
            Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
            Intrinsics.checkNotNullParameter(threadNotificationSettingsStore, "threadNotificationSettingsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ThreadDetailDuxo_Factory(experimentsStore, inboxMessageStore, inboxThreadStore, inboxUserInputStore, mediaStore, threadNotificationSettingsStore, userStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final ThreadDetailDuxo newInstance(ExperimentsStore experimentsStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, InboxUserInputStore inboxUserInputStore, MediaStore mediaStore, ThreadNotificationSettingsStore threadNotificationSettingsStore, UserStore userStore, ThreadDetailStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
            Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
            Intrinsics.checkNotNullParameter(inboxUserInputStore, "inboxUserInputStore");
            Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
            Intrinsics.checkNotNullParameter(threadNotificationSettingsStore, "threadNotificationSettingsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ThreadDetailDuxo(experimentsStore, inboxMessageStore, inboxThreadStore, inboxUserInputStore, mediaStore, threadNotificationSettingsStore, userStore, stateProvider, duxoBundle);
        }
    }
}
