package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.api.docupload.DocUploadBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRequestStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "bonfireApi", "Lcom/robinhood/android/api/docupload/DocUploadBonfireApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DocumentRequestStore_Factory implements Factory<DocumentRequestStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DocUploadApi> api;
    private final Provider<DocUploadBonfireApi> bonfireApi;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final DocumentRequestStore_Factory create(Provider<DocUploadApi> provider, Provider<DocUploadBonfireApi> provider2, Provider<LazyMoshi> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final DocumentRequestStore newInstance(DocUploadApi docUploadApi, DocUploadBonfireApi docUploadBonfireApi, LazyMoshi lazyMoshi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(docUploadApi, docUploadBonfireApi, lazyMoshi, storeBundle);
    }

    public DocumentRequestStore_Factory(Provider<DocUploadApi> api, Provider<DocUploadBonfireApi> bonfireApi, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.bonfireApi = bonfireApi;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public DocumentRequestStore get() {
        Companion companion = INSTANCE;
        DocUploadApi docUploadApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(docUploadApi, "get(...)");
        DocUploadBonfireApi docUploadBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(docUploadBonfireApi, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(docUploadApi, docUploadBonfireApi, lazyMoshi, storeBundle);
    }

    /* compiled from: DocumentRequestStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "bonfireApi", "Lcom/robinhood/android/api/docupload/DocUploadBonfireApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DocumentRequestStore_Factory create(Provider<DocUploadApi> api, Provider<DocUploadBonfireApi> bonfireApi, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new DocumentRequestStore_Factory(api, bonfireApi, moshi, storeBundle);
        }

        @JvmStatic
        public final DocumentRequestStore newInstance(DocUploadApi api, DocUploadBonfireApi bonfireApi, LazyMoshi moshi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new DocumentRequestStore(api, bonfireApi, moshi, storeBundle);
        }
    }
}
