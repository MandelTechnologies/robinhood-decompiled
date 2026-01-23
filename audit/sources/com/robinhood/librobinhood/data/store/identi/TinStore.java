package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.ApiTin;
import com.robinhood.models.api.Tin;
import com.robinhood.models.api.Tin2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TinStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/TinStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/models/api/ApiTin;", "getTins", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/api/Tin;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TinStore extends Store {
    private final Endpoint<Unit, List<ApiTin>> getEndpoint;
    private final Identi identi;

    /* compiled from: TinStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.TinStore", m3645f = "TinStore.kt", m3646l = {32}, m3647m = "getTins")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.TinStore$getTins$1 */
    static final class C348431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348431(Continuation<? super C348431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TinStore.this.getTins(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinStore(Identi identi2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identi = identi2;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TinStore2(this, null), getLogoutKillswitch(), new TinStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTins(Continuation<? super ImmutableList3<Tin>> continuation) {
        C348431 c348431;
        if (continuation instanceof C348431) {
            c348431 = (C348431) continuation;
            int i = c348431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348431.label = i - Integer.MIN_VALUE;
            } else {
                c348431 = new C348431(continuation);
            }
        }
        Object objForceFetch$default = c348431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348431.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objForceFetch$default);
                Endpoint<Unit, List<ApiTin>> endpoint = this.getEndpoint;
                c348431.label = 1;
                objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, c348431, 1, null);
                if (objForceFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objForceFetch$default);
            }
            Iterable iterable = (Iterable) objForceFetch$default;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Tin2.toUiModel((ApiTin) it.next()));
            }
            return extensions2.toPersistentList(arrayList);
        } catch (Throwable unused) {
            return extensions2.persistentListOf();
        }
    }
}
