package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Nummus;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: CryptoResidencyDocumentStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "Lcom/robinhood/store/Store;", "nummus", "Lcom/robinhood/api/retrofit/Nummus;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Nummus;Lcom/robinhood/store/StoreBundle;)V", "getResidencyDocuments", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiResidencyDocument;", "state", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadResidencyDocument", "", "id", "Ljava/util/UUID;", "documentType", "Lokhttp3/RequestBody;", "front", "Lokhttp3/MultipartBody$Part;", TestTags.BACK, "(Ljava/util/UUID;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoResidencyDocumentStore extends Store {
    private final Nummus nummus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoResidencyDocumentStore(Nummus nummus2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummus = nummus2;
    }

    public static /* synthetic */ Object getResidencyDocuments$default(CryptoResidencyDocumentStore cryptoResidencyDocumentStore, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cryptoResidencyDocumentStore.getResidencyDocuments(str, continuation);
    }

    public final Object getResidencyDocuments(String str, Continuation<? super PaginatedResult<ApiResidencyDocument>> continuation) {
        return this.nummus.fetchResidencyDocuments(str, continuation);
    }

    public final Object uploadResidencyDocument(UUID uuid, RequestBody requestBody, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Unit> continuation) {
        Object objUploadResidencyDocument = this.nummus.uploadResidencyDocument(uuid, requestBody, part, part2, continuation);
        return objUploadResidencyDocument == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUploadResidencyDocument : Unit.INSTANCE;
    }
}
