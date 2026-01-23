package com.robinhood.shared.microgram.common.services;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import common.user_locale.proto.p426v1.GetUserLocaleRequestDto;
import common.user_locale.proto.p426v1.GetUserLocaleResponseDto;
import common.user_locale.proto.p426v1.UserLocaleService;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: RealUserLocaleService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealUserLocaleService;", "Lcommon/user_locale/proto/v1/UserLocaleService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;)V", "GetUserLocale", "Lcommon/user_locale/proto/v1/GetUserLocaleResponseDto;", "request", "Lcommon/user_locale/proto/v1/GetUserLocaleRequestDto;", "(Lcommon/user_locale/proto/v1/GetUserLocaleRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RealUserLocaleService implements UserLocaleService {
    private final UserStore userStore;

    /* compiled from: RealUserLocaleService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.microgram.common.services.RealUserLocaleService", m3645f = "RealUserLocaleService.kt", m3646l = {29}, m3647m = "GetUserLocale")
    /* renamed from: com.robinhood.shared.microgram.common.services.RealUserLocaleService$GetUserLocale$1 */
    static final class C391921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C391921(Continuation<? super C391921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealUserLocaleService.this.GetUserLocale((GetUserLocaleRequestDto) null, this);
        }
    }

    public Object GetUserLocale(Request<GetUserLocaleRequestDto> request, Continuation<? super Response<GetUserLocaleResponseDto>> continuation) {
        return UserLocaleService.DefaultImpls.GetUserLocale(this, request, continuation);
    }

    public RealUserLocaleService(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.userStore = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // common.user_locale.proto.p426v1.UserLocaleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUserLocale(GetUserLocaleRequestDto getUserLocaleRequestDto, Continuation<? super GetUserLocaleResponseDto> continuation) {
        C391921 c391921;
        if (continuation instanceof C391921) {
            c391921 = (C391921) continuation;
            int i = c391921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c391921.label = i - Integer.MIN_VALUE;
            } else {
                c391921 = new C391921(continuation);
            }
        }
        Object objAwaitFirst = c391921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c391921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<User> user = this.userStore.getUser();
            c391921.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(user, c391921);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        return new GetUserLocaleResponseDto(RealUserLocaleService2.toLocalityDto(((User) objAwaitFirst).getOrigin().getLocality()));
    }
}
