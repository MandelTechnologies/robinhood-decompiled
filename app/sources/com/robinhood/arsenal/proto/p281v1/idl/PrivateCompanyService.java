package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PrivateCompanyService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyService;", "", "ListPrivateCompanies", "Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesResponseDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface PrivateCompanyService {

    /* compiled from: PrivateCompanyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.PrivateCompanyService$DefaultImpls", m3645f = "PrivateCompanyService.kt", m3646l = {13}, m3647m = "ListPrivateCompanies")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.PrivateCompanyService$ListPrivateCompanies$1 */
    static final class C317861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317861(Continuation<? super C317861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListPrivateCompanies(null, null, this);
        }
    }

    Object ListPrivateCompanies(ListPrivateCompaniesRequestDto listPrivateCompaniesRequestDto, Continuation<? super ListPrivateCompaniesResponseDto> continuation);

    Object ListPrivateCompanies(Request<ListPrivateCompaniesRequestDto> request, Continuation<? super Response<ListPrivateCompaniesResponseDto>> continuation);

    /* compiled from: PrivateCompanyService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListPrivateCompanies(PrivateCompanyService privateCompanyService, Request<ListPrivateCompaniesRequestDto> request, Continuation<? super Response<ListPrivateCompaniesResponseDto>> continuation) {
            C317861 c317861;
            if (continuation instanceof C317861) {
                c317861 = (C317861) continuation;
                int i = c317861.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317861.label = i - Integer.MIN_VALUE;
                } else {
                    c317861 = new C317861(continuation);
                }
            }
            Object objListPrivateCompanies = c317861.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317861.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListPrivateCompanies);
                ListPrivateCompaniesRequestDto data = request.getData();
                c317861.label = 1;
                objListPrivateCompanies = privateCompanyService.ListPrivateCompanies(data, c317861);
                if (objListPrivateCompanies == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListPrivateCompanies);
            }
            return new Response(objListPrivateCompanies, null, 2, null);
        }
    }
}
