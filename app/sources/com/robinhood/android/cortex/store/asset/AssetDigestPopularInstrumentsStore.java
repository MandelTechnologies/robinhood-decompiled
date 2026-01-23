package com.robinhood.android.cortex.store.asset;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.DigestPopularInstrumentsRequestDto;
import bonfire.proto.idl.copilot.p032v1.DigestPopularInstrumentsResponseDto;
import com.robinhood.android.cortex.models.asset.AssetDigestPopularInstruments;
import com.robinhood.android.cortex.models.asset.AssetDigestPopularInstruments2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestPopularInstrumentsStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestPopularInstrumentsStore;", "Lcom/robinhood/store/Store;", "copilotService", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotService;Lcom/robinhood/store/StoreBundle;)V", "getPopularInstruments", "Lcom/robinhood/android/cortex/models/asset/AssetDigestPopularInstruments;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestPopularInstrumentsStore extends Store {
    public static final int $stable = 8;
    private final CopilotService copilotService;

    /* compiled from: AssetDigestPopularInstrumentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestPopularInstrumentsStore", m3645f = "AssetDigestPopularInstrumentsStore.kt", m3646l = {17}, m3647m = "getPopularInstruments")
    /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestPopularInstrumentsStore$getPopularInstruments$1 */
    static final class C121841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C121841(Continuation<? super C121841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetDigestPopularInstrumentsStore.this.getPopularInstruments(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestPopularInstrumentsStore(CopilotService copilotService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(copilotService, "copilotService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.copilotService = copilotService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPopularInstruments(Continuation<? super AssetDigestPopularInstruments> continuation) {
        C121841 c121841;
        if (continuation instanceof C121841) {
            c121841 = (C121841) continuation;
            int i = c121841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c121841.label = i - Integer.MIN_VALUE;
            } else {
                c121841 = new C121841(continuation);
            }
        }
        Object objDigestPopularInstruments = c121841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c121841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDigestPopularInstruments);
            CopilotService copilotService = this.copilotService;
            DigestPopularInstrumentsRequestDto digestPopularInstrumentsRequestDto = new DigestPopularInstrumentsRequestDto();
            c121841.label = 1;
            objDigestPopularInstruments = copilotService.DigestPopularInstruments(digestPopularInstrumentsRequestDto, c121841);
            if (objDigestPopularInstruments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDigestPopularInstruments);
        }
        return AssetDigestPopularInstruments2.toUiModel((DigestPopularInstrumentsResponseDto) objDigestPopularInstruments);
    }
}
