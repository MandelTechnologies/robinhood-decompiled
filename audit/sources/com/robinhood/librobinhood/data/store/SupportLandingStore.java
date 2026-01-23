package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p355ui.pathfinder.auxcontext.AuxContext;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportLandingStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportLandingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "fetchAccountContent", "Lcom/robinhood/models/ui/pathfinder/auxcontext/AuxContext$SupportLandingAccountContent;", "inquiryId", "Ljava/util/UUID;", "sequence", "", "accountType", "", "(Ljava/util/UUID;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SupportLandingStore extends Store {
    private final PathfinderStore pathfinderStore;

    /* compiled from: SupportLandingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportLandingStore", m3645f = "SupportLandingStore.kt", m3646l = {30}, m3647m = "fetchAccountContent")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportLandingStore$fetchAccountContent$1 */
    static final class C343391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343391(Continuation<? super C343391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportLandingStore.this.fetchAccountContent(null, 0, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportLandingStore(StoreBundle storeBundle, PathfinderStore pathfinderStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        this.pathfinderStore = pathfinderStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAccountContent(UUID uuid, int i, String str, Continuation<? super AuxContext.SupportLandingAccountContent> continuation) throws InvalidAuxContextException {
        C343391 c343391;
        if (continuation instanceof C343391) {
            c343391 = (C343391) continuation;
            int i2 = c343391.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c343391.label = i2 - Integer.MIN_VALUE;
            } else {
                c343391 = new C343391(continuation);
            }
        }
        Object objFetchAllAuxContext = c343391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c343391.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objFetchAllAuxContext);
                PathfinderStore pathfinderStore = this.pathfinderStore;
                c343391.label = 1;
                objFetchAllAuxContext = pathfinderStore.fetchAllAuxContext(uuid, i, str, c343391);
                if (objFetchAllAuxContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchAllAuxContext);
            }
            if (objFetchAllAuxContext != null) {
                return (AuxContext.SupportLandingAccountContent) objFetchAllAuxContext;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.robinhood.models.ui.pathfinder.auxcontext.AuxContext.SupportLandingAccountContent");
        } catch (ClassCastException e) {
            throw new InvalidAuxContextException(e);
        }
    }
}
