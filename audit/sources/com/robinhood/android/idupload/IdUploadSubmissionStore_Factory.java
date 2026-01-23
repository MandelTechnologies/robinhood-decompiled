package com.robinhood.android.idupload;

import android.content.ContentResolver;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.prefs.Installation;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdUploadSubmissionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/idupload/IdUploadSubmissionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "cardManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/util/CardManager;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "api", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "contentResolver", "Landroid/content/ContentResolver;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-id-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IdUploadSubmissionStore_Factory implements Factory<IdUploadSubmissionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DocUploadApi> api;
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<CardManager> cardManager;
    private final Provider<ContentResolver> contentResolver;
    private final Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore;
    private final Provider<Installation> installation;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IdUploadSubmissionStore_Factory create(Provider<CardManager> provider, Provider<BitmapStore> provider2, Provider<DocUploadApi> provider3, Provider<CryptoResidencyDocumentStore> provider4, Provider<ContentResolver> provider5, Provider<Installation> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final IdUploadSubmissionStore newInstance(CardManager cardManager, BitmapStore bitmapStore, DocUploadApi docUploadApi, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, ContentResolver contentResolver, Installation installation, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cardManager, bitmapStore, docUploadApi, cryptoResidencyDocumentStore, contentResolver, installation, storeBundle);
    }

    public IdUploadSubmissionStore_Factory(Provider<CardManager> cardManager, Provider<BitmapStore> bitmapStore, Provider<DocUploadApi> api, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<ContentResolver> contentResolver, Provider<Installation> installation, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cardManager = cardManager;
        this.bitmapStore = bitmapStore;
        this.api = api;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.contentResolver = contentResolver;
        this.installation = installation;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IdUploadSubmissionStore get() {
        Companion companion = INSTANCE;
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        DocUploadApi docUploadApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(docUploadApi, "get(...)");
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.cryptoResidencyDocumentStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoResidencyDocumentStore, "get(...)");
        ContentResolver contentResolver = this.contentResolver.get();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cardManager, bitmapStore, docUploadApi, cryptoResidencyDocumentStore, contentResolver, installation, storeBundle);
    }

    /* compiled from: IdUploadSubmissionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/idupload/IdUploadSubmissionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/idupload/IdUploadSubmissionStore_Factory;", "cardManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/util/CardManager;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "api", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "contentResolver", "Landroid/content/ContentResolver;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "lib-store-id-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdUploadSubmissionStore_Factory create(Provider<CardManager> cardManager, Provider<BitmapStore> bitmapStore, Provider<DocUploadApi> api, Provider<CryptoResidencyDocumentStore> cryptoResidencyDocumentStore, Provider<ContentResolver> contentResolver, Provider<Installation> installation, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IdUploadSubmissionStore_Factory(cardManager, bitmapStore, api, cryptoResidencyDocumentStore, contentResolver, installation, storeBundle);
        }

        @JvmStatic
        public final IdUploadSubmissionStore newInstance(CardManager cardManager, BitmapStore bitmapStore, DocUploadApi api, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, ContentResolver contentResolver, Installation installation, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IdUploadSubmissionStore(cardManager, bitmapStore, api, cryptoResidencyDocumentStore, contentResolver, installation, storeBundle);
        }
    }
}
