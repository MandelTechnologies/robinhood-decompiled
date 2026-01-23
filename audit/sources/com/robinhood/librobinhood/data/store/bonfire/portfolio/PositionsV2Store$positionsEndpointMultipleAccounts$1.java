package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/portfolio/PositionsV2;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequestMultipleAccounts;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpointMultipleAccounts$1", m3645f = "PositionsV2Store.kt", m3646l = {119}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$positionsEndpointMultipleAccounts$1 extends ContinuationImpl7 implements Function2<PositionsV2Store.PositionsRequestMultipleAccounts, Continuation<? super List<? extends PositionsV2>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$positionsEndpointMultipleAccounts$1(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$positionsEndpointMultipleAccounts$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsV2Store$positionsEndpointMultipleAccounts$1 positionsV2Store$positionsEndpointMultipleAccounts$1 = new PositionsV2Store$positionsEndpointMultipleAccounts$1(this.this$0, continuation);
        positionsV2Store$positionsEndpointMultipleAccounts$1.L$0 = obj;
        return positionsV2Store$positionsEndpointMultipleAccounts$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, Continuation<? super List<PositionsV2>> continuation) {
        return ((PositionsV2Store$positionsEndpointMultipleAccounts$1) create(positionsRequestMultipleAccounts, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, Continuation<? super List<? extends PositionsV2>> continuation) {
        return invoke2(positionsRequestMultipleAccounts, (Continuation<? super List<PositionsV2>>) continuation);
    }

    /* compiled from: PositionsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/portfolio/PositionsV2;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpointMultipleAccounts$1$1", m3645f = "PositionsV2Store.kt", m3646l = {118}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpointMultipleAccounts$1$1 */
    static final class C346841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends PositionsV2>>, Object> {
        final /* synthetic */ PositionsV2Store.PositionsRequestMultipleAccounts $request;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PositionsV2Store this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346841(PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, PositionsV2Store positionsV2Store, Continuation<? super C346841> continuation) {
            super(2, continuation);
            this.$request = positionsRequestMultipleAccounts;
            this.this$0 = positionsV2Store;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346841 c346841 = new C346841(this.$request, this.this$0, continuation);
            c346841.L$0 = obj;
            return c346841;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PositionsV2>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<PositionsV2>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<PositionsV2>> continuation) {
            return ((C346841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ce -> B:23:0x00d0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Collection collection;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<String> accountNumbers = this.$request.getAccountNumbers();
                PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts = this.$request;
                PositionsV2Store positionsV2Store = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountNumbers, 10));
                for (String str : accountNumbers) {
                    List<PositionInstrumentType> instrumentTypes = positionsRequestMultipleAccounts.getInstrumentTypes();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instrumentTypes, 10));
                    Iterator<T> it2 = instrumentTypes.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1(positionsV2Store, (PositionInstrumentType) it2.next(), positionsRequestMultipleAccounts, str, null), 3, null));
                        positionsRequestMultipleAccounts = positionsRequestMultipleAccounts;
                        positionsV2Store = positionsV2Store;
                        str = str;
                    }
                    arrayList.add(arrayList2);
                }
                List listFlatten = CollectionsKt.flatten(arrayList);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlatten, 10));
                it = listFlatten.iterator();
                collection = arrayList3;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) this.L$2;
                Iterator it3 = (Iterator) this.L$1;
                Collection collection2 = (Collection) this.L$0;
                ResultKt.throwOnFailure(obj);
                Iterator it4 = it3;
                Collection collection3 = collection2;
                Object objAwait = obj;
                collection.add((PositionsV2) objAwait);
                collection = collection3;
                it = it4;
                if (it.hasNext()) {
                    Deferred deferred = (Deferred) it.next();
                    this.L$0 = collection;
                    this.L$1 = it;
                    this.L$2 = collection;
                    this.label = 1;
                    objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it4 = it;
                    collection3 = collection;
                    collection.add((PositionsV2) objAwait);
                    collection = collection3;
                    it = it4;
                    if (it.hasNext()) {
                        return (List) collection;
                    }
                }
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
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.this$0.getStoreScope(), null, null, new C346841((PositionsV2Store.PositionsRequestMultipleAccounts) this.L$0, this.this$0, null), 3, null);
        this.label = 1;
        Object objAwait = deferredAsync$default.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
