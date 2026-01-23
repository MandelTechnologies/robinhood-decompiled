package com.robinhood.shared.data.store.iac;

import com.robinhood.models.api.ApiIacInfoBanner;
import com.robinhood.models.api.ApiIacInfoBannerBatchResponse;
import com.robinhood.models.dao.IacInfoBannerDao;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: IacInfoBannerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/shared/data/store/iac/IacInfoBannersBatchParams;", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacInfoBannerBatchResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$getBatch$2", m3645f = "IacInfoBannerStore.kt", m3646l = {59, 73}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$getBatch$2, reason: use source file name */
/* loaded from: classes6.dex */
final class IacInfoBannerStore3 extends ContinuationImpl7 implements Function3<IacInfoBannersBatchParams, Response<ApiIacInfoBannerBatchResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ IacInfoBannerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacInfoBannerStore3(IacInfoBannerStore iacInfoBannerStore, Continuation<? super IacInfoBannerStore3> continuation) {
        super(3, continuation);
        this.this$0 = iacInfoBannerStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(IacInfoBannersBatchParams iacInfoBannersBatchParams, Response<ApiIacInfoBannerBatchResponse> response, Continuation<? super Unit> continuation) {
        IacInfoBannerStore3 iacInfoBannerStore3 = new IacInfoBannerStore3(this.this$0, continuation);
        iacInfoBannerStore3.L$0 = iacInfoBannersBatchParams;
        iacInfoBannerStore3.L$1 = response;
        return iacInfoBannerStore3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r12.insert(r9, r11) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IacInfoBannersBatchParams iacInfoBannersBatchParams;
        List arrayList;
        List<ApiIacInfoBanner> info_banners;
        IacInfoBannerStore iacInfoBannerStore;
        IacInfoBannersBatchParams iacInfoBannersBatchParams2;
        List list;
        Iterator it;
        IacInfoBannerStore iacInfoBannerStore2;
        Iterator it2;
        IacInfoBannersBatchParams iacInfoBannersBatchParams3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iacInfoBannersBatchParams = (IacInfoBannersBatchParams) this.L$0;
            Response response = (Response) this.L$1;
            arrayList = new ArrayList();
            ApiIacInfoBannerBatchResponse apiIacInfoBannerBatchResponse = (ApiIacInfoBannerBatchResponse) response.body();
            if (apiIacInfoBannerBatchResponse != null && (info_banners = apiIacInfoBannerBatchResponse.getInfo_banners()) != null) {
                iacInfoBannerStore = this.this$0;
                iacInfoBannersBatchParams2 = iacInfoBannersBatchParams;
                list = arrayList;
                it = info_banners.iterator();
                if (!it.hasNext()) {
                }
            }
            List<IacInfoBannerLocation> locations = iacInfoBannersBatchParams.getLocations();
            iacInfoBannerStore2 = this.this$0;
            it2 = locations.iterator();
            iacInfoBannersBatchParams3 = iacInfoBannersBatchParams;
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) this.L$3;
            iacInfoBannerStore2 = (IacInfoBannerStore) this.L$2;
            arrayList = (List) this.L$1;
            iacInfoBannersBatchParams3 = (IacInfoBannersBatchParams) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (it2.hasNext()) {
                IacInfoBannerLocation iacInfoBannerLocation = (IacInfoBannerLocation) it2.next();
                if (!arrayList.contains(iacInfoBannerLocation)) {
                    IacInfoBannerDao iacInfoBannerDao = iacInfoBannerStore2.dao;
                    UUID locationId = iacInfoBannersBatchParams3.getLocationId();
                    if (locationId == null) {
                        locationId = IacInfoBanner.INSTANCE.getLOCATION_ID_NONE();
                    }
                    this.L$0 = iacInfoBannersBatchParams3;
                    this.L$1 = arrayList;
                    this.L$2 = iacInfoBannerStore2;
                    this.L$3 = it2;
                    this.L$4 = null;
                    this.label = 2;
                    if (iacInfoBannerDao.delete(iacInfoBannerLocation, locationId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        ApiIacInfoBanner apiIacInfoBanner = (ApiIacInfoBanner) this.L$4;
        it = (Iterator) this.L$3;
        iacInfoBannerStore = (IacInfoBannerStore) this.L$2;
        list = (List) this.L$1;
        iacInfoBannersBatchParams2 = (IacInfoBannersBatchParams) this.L$0;
        ResultKt.throwOnFailure(obj);
        IacInfoBannerLocation iacInfoBannerLocationFromServerValue = IacInfoBannerLocation.INSTANCE.fromServerValue(apiIacInfoBanner.getLocation());
        if (iacInfoBannerLocationFromServerValue != null) {
            list.add(iacInfoBannerLocationFromServerValue);
        }
        if (!it.hasNext()) {
            apiIacInfoBanner = (ApiIacInfoBanner) it.next();
            IacInfoBannerDao iacInfoBannerDao2 = iacInfoBannerStore.dao;
            IacInfoBanner dbModel = apiIacInfoBanner.toDbModel(null, iacInfoBannersBatchParams2.getLocationId(), iacInfoBannersBatchParams2.getAccountNumber());
            this.L$0 = iacInfoBannersBatchParams2;
            this.L$1 = list;
            this.L$2 = iacInfoBannerStore;
            this.L$3 = it;
            this.L$4 = apiIacInfoBanner;
            this.label = 1;
        } else {
            arrayList = list;
            iacInfoBannersBatchParams = iacInfoBannersBatchParams2;
            List<IacInfoBannerLocation> locations2 = iacInfoBannersBatchParams.getLocations();
            iacInfoBannerStore2 = this.this$0;
            it2 = locations2.iterator();
            iacInfoBannersBatchParams3 = iacInfoBannersBatchParams;
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }
}
