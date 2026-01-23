package com.robinhood.shared.documentdownload;

import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.DocumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentDownloadActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DocumentDownloadActivity_MembersInjector implements MembersInjector<DocumentDownloadActivity> {
    private final Provider<DocumentStore> documentStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<SupportEmailHandler> supportEmailHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DocumentDownloadActivity> create(Provider<BaseActivitySingletons> provider, Provider<DocumentStore> provider2, Provider<SupportEmailHandler> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectDocumentStore(DocumentDownloadActivity documentDownloadActivity, DocumentStore documentStore) {
        INSTANCE.injectDocumentStore(documentDownloadActivity, documentStore);
    }

    @JvmStatic
    public static final void injectSupportEmailHandler(DocumentDownloadActivity documentDownloadActivity, SupportEmailHandler supportEmailHandler) {
        INSTANCE.injectSupportEmailHandler(documentDownloadActivity, supportEmailHandler);
    }

    public DocumentDownloadActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<DocumentStore> documentStore, Provider<SupportEmailHandler> supportEmailHandler) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
        this.singletons = singletons;
        this.documentStore = documentStore;
        this.supportEmailHandler = supportEmailHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocumentDownloadActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        DocumentStore documentStore = this.documentStore.get();
        Intrinsics.checkNotNullExpressionValue(documentStore, "get(...)");
        companion2.injectDocumentStore(instance, documentStore);
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler.get();
        Intrinsics.checkNotNullExpressionValue(supportEmailHandler, "get(...)");
        companion2.injectSupportEmailHandler(instance, supportEmailHandler);
    }

    /* compiled from: DocumentDownloadActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "injectDocumentStore", "", "instance", "injectSupportEmailHandler", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DocumentDownloadActivity> create(Provider<BaseActivitySingletons> singletons, Provider<DocumentStore> documentStore, Provider<SupportEmailHandler> supportEmailHandler) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            return new DocumentDownloadActivity_MembersInjector(singletons, documentStore, supportEmailHandler);
        }

        @JvmStatic
        public final void injectDocumentStore(DocumentDownloadActivity instance, DocumentStore documentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            instance.setDocumentStore(documentStore);
        }

        @JvmStatic
        public final void injectSupportEmailHandler(DocumentDownloadActivity instance, SupportEmailHandler supportEmailHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            instance.setSupportEmailHandler(supportEmailHandler);
        }
    }
}
