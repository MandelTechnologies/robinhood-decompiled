package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadAssistantLoadingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo;", "documentRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DocUploadAssistantLoadingDuxo_Factory implements Factory<DocUploadAssistantLoadingDuxo> {
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DocUploadAssistantLoadingDuxo_Factory create(Provider<DocumentRequestStore> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final DocUploadAssistantLoadingDuxo newInstance(DocumentRequestStore documentRequestStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(documentRequestStore, duxoBundle);
    }

    public DocUploadAssistantLoadingDuxo_Factory(Provider<DocumentRequestStore> documentRequestStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.documentRequestStore = documentRequestStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DocUploadAssistantLoadingDuxo get() {
        Companion companion = INSTANCE;
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(documentRequestStore, duxoBundle);
    }

    /* compiled from: DocUploadAssistantLoadingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo_Factory;", "documentRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingDuxo;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DocUploadAssistantLoadingDuxo_Factory create(Provider<DocumentRequestStore> documentRequestStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DocUploadAssistantLoadingDuxo_Factory(documentRequestStore, duxoBundle);
        }

        @JvmStatic
        public final DocUploadAssistantLoadingDuxo newInstance(DocumentRequestStore documentRequestStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DocUploadAssistantLoadingDuxo(documentRequestStore, duxoBundle);
        }
    }
}
