package com.salesforce.android.smi.remote.internal.api.rest;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.AcknowledgementEntry;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.DeliveryAcknowledgeEntriesRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RestService.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "it"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$sendDeliveryAckThrottled$1", m3645f = "RestService.kt", m3646l = {369}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendDeliveryAckThrottled$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RestService2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Result<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ RestService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestService2(RestService restService, Continuation<? super RestService2> continuation) {
        super(2, continuation);
        this.this$0 = restService;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestService2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(unit, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Result<Unit>> continuation) {
        return ((RestService2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$sendDeliveryAckThrottled$1$1", m3645f = "RestService.kt", m3646l = {376}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendDeliveryAckThrottled$1$1 */
    static final class C423401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RestService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C423401(RestService restService, Continuation<? super C423401> continuation) {
            super(2, continuation);
            this.this$0 = restService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C423401(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((C423401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Map map;
            Iterator it;
            RestService restService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = CollectionsKt.toList(this.this$0.deliveryAckList);
                    this.this$0.deliveryAckList.clear();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : list) {
                        UUID conversationId = ((AcknowledgementEntry) obj2).getConversationId();
                        Object arrayList = linkedHashMap.get(conversationId);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(conversationId, arrayList);
                        }
                        ((List) arrayList).add(obj2);
                    }
                    RestService restService2 = this.this$0;
                    map = linkedHashMap;
                    it = linkedHashMap.entrySet().iterator();
                    restService = restService2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$2;
                    map = (Map) this.L$1;
                    restService = (RestService) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    UUID uuid = (UUID) entry.getKey();
                    if (uuid != null) {
                        DeliveryAcknowledgeEntriesRequest deliveryAcknowledgeEntriesRequest = new DeliveryAcknowledgeEntriesRequest((List) entry.getValue(), uuid);
                        RestApi restApi = restService.api;
                        this.L$0 = restService;
                        this.L$1 = map;
                        this.L$2 = it;
                        this.label = 1;
                        if (restApi.sendDeliveryAcknowledgeEntries(deliveryAcknowledgeEntriesRequest, uuid, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return new Result.Success(Unit.INSTANCE);
            } catch (Exception e) {
                this.this$0.logger.log(Level.WARNING, e.getMessage());
                return new Result.Error(e);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineDispatcher coroutineDispatcher = this.this$0.ioDispatcher;
        C423401 c423401 = new C423401(this.this$0, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, c423401, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }
}
