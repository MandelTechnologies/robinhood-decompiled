package bonfire.proto.idl.beneficiaries.p031v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestBeneficiariesService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/RestBeneficiariesService;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;", "retrofit", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesServiceRetrofit;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesServiceRetrofit;)V", "GetBeneficiaryFlow", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowResponseDto;", "request", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequestDto;", "(Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetBeneficiaryFlowIntroViewModels", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsResponseDto;", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequestDto;", "(Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateBeneficiary", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryResponseDto;", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "(Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateBeneficiary", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryResponseDto;", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequestDto;", "(Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBeneficiariesService implements BeneficiariesService {
    private final BeneficiariesServiceRetrofit retrofit;

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {55}, m3647m = "CreateBeneficiary")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$CreateBeneficiary$1 */
    static final class C40231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40231(Continuation<? super C40231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.CreateBeneficiary((CreateBeneficiaryRequestDto) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {61}, m3647m = "CreateBeneficiary")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$CreateBeneficiary$2 */
    static final class C40242 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40242(Continuation<? super C40242> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.CreateBeneficiary((Request<CreateBeneficiaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {20}, m3647m = "GetBeneficiaryFlow")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$GetBeneficiaryFlow$1 */
    static final class C40251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40251(Continuation<? super C40251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.GetBeneficiaryFlow((GetBeneficiaryFlowRequestDto) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {26}, m3647m = "GetBeneficiaryFlow")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$GetBeneficiaryFlow$2 */
    static final class C40262 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40262(Continuation<? super C40262> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.GetBeneficiaryFlow((Request<GetBeneficiaryFlowRequestDto>) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {39}, m3647m = "GetBeneficiaryFlowIntroViewModels")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$GetBeneficiaryFlowIntroViewModels$1 */
    static final class C40271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40271(Continuation<? super C40271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.GetBeneficiaryFlowIntroViewModels((GetBeneficiaryFlowIntroViewModelsRequestDto) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {45}, m3647m = "GetBeneficiaryFlowIntroViewModels")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$GetBeneficiaryFlowIntroViewModels$2 */
    static final class C40282 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40282(Continuation<? super C40282> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.GetBeneficiaryFlowIntroViewModels((Request<GetBeneficiaryFlowIntroViewModelsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "UpdateBeneficiary")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$UpdateBeneficiary$1 */
    static final class C40291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40291(Continuation<? super C40291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.UpdateBeneficiary((UpdateBeneficiaryRequestDto) null, this);
        }
    }

    /* compiled from: RestBeneficiariesService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService", m3645f = "RestBeneficiariesService.kt", m3646l = {77}, m3647m = "UpdateBeneficiary")
    /* renamed from: bonfire.proto.idl.beneficiaries.v1.RestBeneficiariesService$UpdateBeneficiary$2 */
    static final class C40302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C40302(Continuation<? super C40302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBeneficiariesService.this.UpdateBeneficiary((Request<UpdateBeneficiaryRequestDto>) null, this);
        }
    }

    public RestBeneficiariesService(BeneficiariesServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBeneficiaryFlow(GetBeneficiaryFlowRequestDto getBeneficiaryFlowRequestDto, Continuation<? super GetBeneficiaryFlowResponseDto> continuation) {
        C40251 c40251;
        if (continuation instanceof C40251) {
            c40251 = (C40251) continuation;
            int i = c40251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40251.label = i - Integer.MIN_VALUE;
            } else {
                c40251 = new C40251(continuation);
            }
        }
        Object objGetBeneficiaryFlow = c40251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBeneficiaryFlow);
            Request<GetBeneficiaryFlowRequestDto> request = new Request<>(getBeneficiaryFlowRequestDto, null, 2, null);
            c40251.label = 1;
            objGetBeneficiaryFlow = GetBeneficiaryFlow(request, c40251);
            if (objGetBeneficiaryFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBeneficiaryFlow);
        }
        return ((Response) objGetBeneficiaryFlow).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBeneficiaryFlow(Request<GetBeneficiaryFlowRequestDto> request, Continuation<? super Response<GetBeneficiaryFlowResponseDto>> continuation) {
        C40262 c40262;
        if (continuation instanceof C40262) {
            c40262 = (C40262) continuation;
            int i = c40262.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40262.label = i - Integer.MIN_VALUE;
            } else {
                c40262 = new C40262(continuation);
            }
        }
        C40262 c402622 = c40262;
        Object objGetBeneficiaryFlow = c402622.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c402622.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBeneficiaryFlow);
            BeneficiariesServiceRetrofit beneficiariesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            String beneficiary_id = request.getData().getBeneficiary_id();
            BeneficiaryTypeDto beneficiary_type = request.getData().getBeneficiary_type();
            BeneficiaryRoleDto beneficiary_role = request.getData().getBeneficiary_role();
            c402622.label = 1;
            objGetBeneficiaryFlow = beneficiariesServiceRetrofit.GetBeneficiaryFlow(metadata, account_number, beneficiary_id, beneficiary_type, beneficiary_role, c402622);
            if (objGetBeneficiaryFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBeneficiaryFlow);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetBeneficiaryFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBeneficiaryFlowIntroViewModels(GetBeneficiaryFlowIntroViewModelsRequestDto getBeneficiaryFlowIntroViewModelsRequestDto, Continuation<? super GetBeneficiaryFlowIntroViewModelsResponseDto> continuation) {
        C40271 c40271;
        if (continuation instanceof C40271) {
            c40271 = (C40271) continuation;
            int i = c40271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40271.label = i - Integer.MIN_VALUE;
            } else {
                c40271 = new C40271(continuation);
            }
        }
        Object objGetBeneficiaryFlowIntroViewModels = c40271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBeneficiaryFlowIntroViewModels);
            Request<GetBeneficiaryFlowIntroViewModelsRequestDto> request = new Request<>(getBeneficiaryFlowIntroViewModelsRequestDto, null, 2, null);
            c40271.label = 1;
            objGetBeneficiaryFlowIntroViewModels = GetBeneficiaryFlowIntroViewModels(request, c40271);
            if (objGetBeneficiaryFlowIntroViewModels == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBeneficiaryFlowIntroViewModels);
        }
        return ((Response) objGetBeneficiaryFlowIntroViewModels).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBeneficiaryFlowIntroViewModels(Request<GetBeneficiaryFlowIntroViewModelsRequestDto> request, Continuation<? super Response<GetBeneficiaryFlowIntroViewModelsResponseDto>> continuation) {
        C40282 c40282;
        if (continuation instanceof C40282) {
            c40282 = (C40282) continuation;
            int i = c40282.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40282.label = i - Integer.MIN_VALUE;
            } else {
                c40282 = new C40282(continuation);
            }
        }
        Object objGetBeneficiaryFlowIntroViewModels = c40282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40282.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBeneficiaryFlowIntroViewModels);
            BeneficiariesServiceRetrofit beneficiariesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c40282.label = 1;
            objGetBeneficiaryFlowIntroViewModels = beneficiariesServiceRetrofit.GetBeneficiaryFlowIntroViewModels(metadata, account_number, c40282);
            if (objGetBeneficiaryFlowIntroViewModels == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBeneficiaryFlowIntroViewModels);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetBeneficiaryFlowIntroViewModels);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateBeneficiary(CreateBeneficiaryRequestDto createBeneficiaryRequestDto, Continuation<? super CreateBeneficiaryResponseDto> continuation) {
        C40231 c40231;
        if (continuation instanceof C40231) {
            c40231 = (C40231) continuation;
            int i = c40231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40231.label = i - Integer.MIN_VALUE;
            } else {
                c40231 = new C40231(continuation);
            }
        }
        Object objCreateBeneficiary = c40231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateBeneficiary);
            Request<CreateBeneficiaryRequestDto> request = new Request<>(createBeneficiaryRequestDto, null, 2, null);
            c40231.label = 1;
            objCreateBeneficiary = CreateBeneficiary(request, c40231);
            if (objCreateBeneficiary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateBeneficiary);
        }
        return ((Response) objCreateBeneficiary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateBeneficiary(Request<CreateBeneficiaryRequestDto> request, Continuation<? super Response<CreateBeneficiaryResponseDto>> continuation) {
        C40242 c40242;
        if (continuation instanceof C40242) {
            c40242 = (C40242) continuation;
            int i = c40242.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40242.label = i - Integer.MIN_VALUE;
            } else {
                c40242 = new C40242(continuation);
            }
        }
        Object objCreateBeneficiary = c40242.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40242.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateBeneficiary);
            BeneficiariesServiceRetrofit beneficiariesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateBeneficiaryRequestDto data = request.getData();
            c40242.label = 1;
            objCreateBeneficiary = beneficiariesServiceRetrofit.CreateBeneficiary(metadata, data, c40242);
            if (objCreateBeneficiary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateBeneficiary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateBeneficiary);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateBeneficiary(UpdateBeneficiaryRequestDto updateBeneficiaryRequestDto, Continuation<? super UpdateBeneficiaryResponseDto> continuation) {
        C40291 c40291;
        if (continuation instanceof C40291) {
            c40291 = (C40291) continuation;
            int i = c40291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40291.label = i - Integer.MIN_VALUE;
            } else {
                c40291 = new C40291(continuation);
            }
        }
        Object objUpdateBeneficiary = c40291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateBeneficiary);
            Request<UpdateBeneficiaryRequestDto> request = new Request<>(updateBeneficiaryRequestDto, null, 2, null);
            c40291.label = 1;
            objUpdateBeneficiary = UpdateBeneficiary(request, c40291);
            if (objUpdateBeneficiary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateBeneficiary);
        }
        return ((Response) objUpdateBeneficiary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateBeneficiary(Request<UpdateBeneficiaryRequestDto> request, Continuation<? super Response<UpdateBeneficiaryResponseDto>> continuation) {
        C40302 c40302;
        if (continuation instanceof C40302) {
            c40302 = (C40302) continuation;
            int i = c40302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c40302.label = i - Integer.MIN_VALUE;
            } else {
                c40302 = new C40302(continuation);
            }
        }
        Object objUpdateBeneficiary = c40302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c40302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateBeneficiary);
            BeneficiariesServiceRetrofit beneficiariesServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String beneficiary_id = request.getData().getBeneficiary_id();
            UpdateBeneficiaryRequestDto data = request.getData();
            c40302.label = 1;
            objUpdateBeneficiary = beneficiariesServiceRetrofit.UpdateBeneficiary(metadata, beneficiary_id, data, c40302);
            if (objUpdateBeneficiary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateBeneficiary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateBeneficiary);
    }
}
