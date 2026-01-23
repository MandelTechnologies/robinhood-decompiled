package moneytree.p510v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestMembershipService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lmoneytree/v1/RestMembershipService;", "Lmoneytree/v1/MembershipService;", "retrofit", "Lmoneytree/v1/MembershipServiceRetrofit;", "<init>", "(Lmoneytree/v1/MembershipServiceRetrofit;)V", "UpdateMembership", "Lmoneytree/v1/UpdateMembershipResponseDto;", "request", "Lmoneytree/v1/UpdateMembershipRequestDto;", "(Lmoneytree/v1/UpdateMembershipRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMembershipDetails", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "Lmoneytree/v1/GetMembershipDetailsRequestDto;", "(Lmoneytree/v1/GetMembershipDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RestMembershipService implements MembershipService {
    private final MembershipServiceRetrofit retrofit;

    /* compiled from: RestMembershipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestMembershipService", m3645f = "RestMembershipService.kt", m3646l = {37}, m3647m = "GetMembershipDetails")
    /* renamed from: moneytree.v1.RestMembershipService$GetMembershipDetails$1 */
    static final class C470321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470321(Continuation<? super C470321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMembershipService.this.GetMembershipDetails((GetMembershipDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestMembershipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestMembershipService", m3645f = "RestMembershipService.kt", m3646l = {43}, m3647m = "GetMembershipDetails")
    /* renamed from: moneytree.v1.RestMembershipService$GetMembershipDetails$2 */
    static final class C470332 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470332(Continuation<? super C470332> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMembershipService.this.GetMembershipDetails((Request<GetMembershipDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestMembershipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestMembershipService", m3645f = "RestMembershipService.kt", m3646l = {21}, m3647m = "UpdateMembership")
    /* renamed from: moneytree.v1.RestMembershipService$UpdateMembership$1 */
    static final class C470341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470341(Continuation<? super C470341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMembershipService.this.UpdateMembership((UpdateMembershipRequestDto) null, this);
        }
    }

    /* compiled from: RestMembershipService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "moneytree.v1.RestMembershipService", m3645f = "RestMembershipService.kt", m3646l = {27}, m3647m = "UpdateMembership")
    /* renamed from: moneytree.v1.RestMembershipService$UpdateMembership$2 */
    static final class C470352 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C470352(Continuation<? super C470352> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestMembershipService.this.UpdateMembership((Request<UpdateMembershipRequestDto>) null, this);
        }
    }

    public RestMembershipService(MembershipServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // moneytree.p510v1.MembershipService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateMembership(UpdateMembershipRequestDto updateMembershipRequestDto, Continuation<? super UpdateMembershipResponseDto> continuation) {
        C470341 c470341;
        if (continuation instanceof C470341) {
            c470341 = (C470341) continuation;
            int i = c470341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470341.label = i - Integer.MIN_VALUE;
            } else {
                c470341 = new C470341(continuation);
            }
        }
        Object objUpdateMembership = c470341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateMembership);
            Request<UpdateMembershipRequestDto> request = new Request<>(updateMembershipRequestDto, null, 2, null);
            c470341.label = 1;
            objUpdateMembership = UpdateMembership(request, c470341);
            if (objUpdateMembership == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateMembership);
        }
        return ((Response) objUpdateMembership).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateMembership(Request<UpdateMembershipRequestDto> request, Continuation<? super Response<UpdateMembershipResponseDto>> continuation) {
        C470352 c470352;
        if (continuation instanceof C470352) {
            c470352 = (C470352) continuation;
            int i = c470352.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470352.label = i - Integer.MIN_VALUE;
            } else {
                c470352 = new C470352(continuation);
            }
        }
        Object objUpdateMembership = c470352.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470352.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateMembership);
            MembershipServiceRetrofit membershipServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UpdateMembershipRequestDto data = request.getData();
            c470352.label = 1;
            objUpdateMembership = membershipServiceRetrofit.UpdateMembership(metadata, data, c470352);
            if (objUpdateMembership == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateMembership);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateMembership);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // moneytree.p510v1.MembershipService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMembershipDetails(GetMembershipDetailsRequestDto getMembershipDetailsRequestDto, Continuation<? super GetMembershipDetailsResponseDto> continuation) {
        C470321 c470321;
        if (continuation instanceof C470321) {
            c470321 = (C470321) continuation;
            int i = c470321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470321.label = i - Integer.MIN_VALUE;
            } else {
                c470321 = new C470321(continuation);
            }
        }
        Object objGetMembershipDetails = c470321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMembershipDetails);
            Request<GetMembershipDetailsRequestDto> request = new Request<>(getMembershipDetailsRequestDto, null, 2, null);
            c470321.label = 1;
            objGetMembershipDetails = GetMembershipDetails(request, c470321);
            if (objGetMembershipDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMembershipDetails);
        }
        return ((Response) objGetMembershipDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMembershipDetails(Request<GetMembershipDetailsRequestDto> request, Continuation<? super Response<GetMembershipDetailsResponseDto>> continuation) {
        C470332 c470332;
        if (continuation instanceof C470332) {
            c470332 = (C470332) continuation;
            int i = c470332.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470332.label = i - Integer.MIN_VALUE;
            } else {
                c470332 = new C470332(continuation);
            }
        }
        Object objGetMembershipDetails = c470332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c470332.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMembershipDetails);
            MembershipServiceRetrofit membershipServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            VendorDto vendor = request.getData().getVendor() != VendorDto.INSTANCE.getZeroValue() ? request.getData().getVendor() : null;
            CurrencyDto currency = request.getData().getCurrency() != CurrencyDto.INSTANCE.getZeroValue() ? request.getData().getCurrency() : null;
            c470332.label = 1;
            objGetMembershipDetails = membershipServiceRetrofit.GetMembershipDetails(metadata, vendor, currency, c470332);
            if (objGetMembershipDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMembershipDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMembershipDetails);
    }
}
