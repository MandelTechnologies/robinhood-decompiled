package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.AgreementAcceptRequest;
import com.robinhood.models.api.UserAdditionalInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInfoStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;)V", "acceptAgreement", "", "request", "Lcom/robinhood/models/api/AgreementAcceptRequest;", "(Lcom/robinhood/models/api/AgreementAcceptRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasAgreedToRhsMargin", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class UserInfoStore extends Store {
    private final Brokeback brokeback;

    /* compiled from: UserInfoStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserInfoStore", m3645f = "UserInfoStore.kt", m3646l = {28}, m3647m = "hasAgreedToRhsMargin")
    /* renamed from: com.robinhood.librobinhood.data.store.UserInfoStore$hasAgreedToRhsMargin$1 */
    static final class C344311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344311(Continuation<? super C344311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserInfoStore.this.hasAgreedToRhsMargin(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoStore(Brokeback brokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
    }

    public final Object acceptAgreement(AgreementAcceptRequest agreementAcceptRequest, Continuation<? super Unit> continuation) {
        Object objAcceptAgreement = this.brokeback.acceptAgreement(agreementAcceptRequest, continuation);
        return objAcceptAgreement == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcceptAgreement : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasAgreedToRhsMargin(Continuation<? super Boolean> continuation) {
        C344311 c344311;
        if (continuation instanceof C344311) {
            c344311 = (C344311) continuation;
            int i = c344311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344311.label = i - Integer.MIN_VALUE;
            } else {
                c344311 = new C344311(continuation);
            }
        }
        Object userAdditionalInfo = c344311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userAdditionalInfo);
            Brokeback brokeback = this.brokeback;
            c344311.label = 1;
            userAdditionalInfo = brokeback.getUserAdditionalInfo(c344311);
            if (userAdditionalInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userAdditionalInfo);
        }
        return boxing.boxBoolean(((UserAdditionalInfo) userAdditionalInfo).getAgreed_to_rhs_margin());
    }
}
