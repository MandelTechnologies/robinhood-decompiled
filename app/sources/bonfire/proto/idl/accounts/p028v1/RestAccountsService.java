package bonfire.proto.idl.accounts.p028v1;

import bonfire.proto.idl.accounts.p028v1.FundingOptionsRequestDto;
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
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementTypeDto;

/* compiled from: RestAccountsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/RestAccountsService;", "Lbonfire/proto/idl/accounts/v1/AccountsService;", "Lbonfire/proto/idl/accounts/v1/AccountsServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/accounts/v1/AccountsServiceRetrofit;)V", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;", "request", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "ValidateNickname", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationResponseDto;", "CreateApplication", "(Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsResponseDto;", "FundingOptions", "(Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityResponseDto;", "AccountOnboardingEligibility", "(Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "AccountNumbers", "(Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;", "AccountDashboardFooter", "(Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountsServiceRetrofit;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestAccountsService implements AccountsService {
    private final AccountsServiceRetrofit retrofit;

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "AccountDashboardFooter")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountDashboardFooter$1 */
    static final class C38091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38091(Continuation<? super C38091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountDashboardFooter((AccountDashboardFooterRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "AccountDashboardFooter")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountDashboardFooter$2 */
    static final class C38102 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38102(Continuation<? super C38102> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountDashboardFooter((Request<AccountDashboardFooterRequestDto>) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {125}, m3647m = "AccountNumbers")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountNumbers$1 */
    static final class C38111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38111(Continuation<? super C38111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountNumbers((AccountNumbersRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {131}, m3647m = "AccountNumbers")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountNumbers$2 */
    static final class C38122 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38122(Continuation<? super C38122> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountNumbers((Request<AccountNumbersRequestDto>) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {92}, m3647m = "AccountOnboardingEligibility")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountOnboardingEligibility$1 */
    static final class C38131 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38131(Continuation<? super C38131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountOnboardingEligibility((AccountOnboardingEligibilityRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {98}, m3647m = "AccountOnboardingEligibility")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$AccountOnboardingEligibility$2 */
    static final class C38142 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38142(Continuation<? super C38142> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.AccountOnboardingEligibility((Request<AccountOnboardingEligibilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {39}, m3647m = "CreateApplication")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$CreateApplication$1 */
    static final class C38151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38151(Continuation<? super C38151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.CreateApplication((CreateApplicationRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {45}, m3647m = "CreateApplication")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$CreateApplication$2 */
    static final class C38162 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38162(Continuation<? super C38162> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.CreateApplication((Request<CreateApplicationRequestDto>) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {73}, m3647m = "FundingOptions")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$FundingOptions$1 */
    static final class C38171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38171(Continuation<? super C38171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.FundingOptions((FundingOptionsRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {79}, m3647m = "FundingOptions")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$FundingOptions$2 */
    static final class C38182 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38182(Continuation<? super C38182> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.FundingOptions((Request<FundingOptionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {22}, m3647m = "ValidateNickname")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$ValidateNickname$1 */
    static final class C38191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38191(Continuation<? super C38191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.ValidateNickname((ValidateNicknameRequestDto) null, this);
        }
    }

    /* compiled from: RestAccountsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.accounts.v1.RestAccountsService", m3645f = "RestAccountsService.kt", m3646l = {28}, m3647m = "ValidateNickname")
    /* renamed from: bonfire.proto.idl.accounts.v1.RestAccountsService$ValidateNickname$2 */
    static final class C38202 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38202(Continuation<? super C38202> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAccountsService.this.ValidateNickname((Request<ValidateNicknameRequestDto>) null, this);
        }
    }

    public RestAccountsService(AccountsServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateNickname(ValidateNicknameRequestDto validateNicknameRequestDto, Continuation<? super ValidateNicknameResponseDto> continuation) {
        C38191 c38191;
        if (continuation instanceof C38191) {
            c38191 = (C38191) continuation;
            int i = c38191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38191.label = i - Integer.MIN_VALUE;
            } else {
                c38191 = new C38191(continuation);
            }
        }
        Object objValidateNickname = c38191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateNickname);
            Request<ValidateNicknameRequestDto> request = new Request<>(validateNicknameRequestDto, null, 2, null);
            c38191.label = 1;
            objValidateNickname = ValidateNickname(request, c38191);
            if (objValidateNickname == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateNickname);
        }
        return ((Response) objValidateNickname).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateNickname(Request<ValidateNicknameRequestDto> request, Continuation<? super Response<ValidateNicknameResponseDto>> continuation) {
        C38202 c38202;
        if (continuation instanceof C38202) {
            c38202 = (C38202) continuation;
            int i = c38202.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38202.label = i - Integer.MIN_VALUE;
            } else {
                c38202 = new C38202(continuation);
            }
        }
        Object objValidateNickname = c38202.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38202.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateNickname);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String nickname = !Intrinsics.areEqual(request.getData().getNickname(), "") ? request.getData().getNickname() : null;
            c38202.label = 1;
            objValidateNickname = accountsServiceRetrofit.ValidateNickname(metadata, account_number, nickname, c38202);
            if (objValidateNickname == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateNickname);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objValidateNickname);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateApplication(CreateApplicationRequestDto createApplicationRequestDto, Continuation<? super CreateApplicationResponseDto> continuation) {
        C38151 c38151;
        if (continuation instanceof C38151) {
            c38151 = (C38151) continuation;
            int i = c38151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38151.label = i - Integer.MIN_VALUE;
            } else {
                c38151 = new C38151(continuation);
            }
        }
        Object objCreateApplication = c38151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateApplication);
            Request<CreateApplicationRequestDto> request = new Request<>(createApplicationRequestDto, null, 2, null);
            c38151.label = 1;
            objCreateApplication = CreateApplication(request, c38151);
            if (objCreateApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateApplication);
        }
        return ((Response) objCreateApplication).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateApplication(Request<CreateApplicationRequestDto> request, Continuation<? super Response<CreateApplicationResponseDto>> continuation) {
        C38162 c38162;
        if (continuation instanceof C38162) {
            c38162 = (C38162) continuation;
            int i = c38162.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38162.label = i - Integer.MIN_VALUE;
            } else {
                c38162 = new C38162(continuation);
            }
        }
        Object objCreateApplication = c38162.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38162.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateApplication);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateApplicationRequestDto data = request.getData();
            c38162.label = 1;
            objCreateApplication = accountsServiceRetrofit.CreateApplication(metadata, data, c38162);
            if (objCreateApplication == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateApplication);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateApplication);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FundingOptions(FundingOptionsRequestDto fundingOptionsRequestDto, Continuation<? super FundingOptionsResponseDto> continuation) {
        C38171 c38171;
        if (continuation instanceof C38171) {
            c38171 = (C38171) continuation;
            int i = c38171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38171.label = i - Integer.MIN_VALUE;
            } else {
                c38171 = new C38171(continuation);
            }
        }
        Object objFundingOptions = c38171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFundingOptions);
            Request<FundingOptionsRequestDto> request = new Request<>(fundingOptionsRequestDto, null, 2, null);
            c38171.label = 1;
            objFundingOptions = FundingOptions(request, c38171);
            if (objFundingOptions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFundingOptions);
        }
        return ((Response) objFundingOptions).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FundingOptions(Request<FundingOptionsRequestDto> request, Continuation<? super Response<FundingOptionsResponseDto>> continuation) {
        C38182 c38182;
        if (continuation instanceof C38182) {
            c38182 = (C38182) continuation;
            int i = c38182.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38182.label = i - Integer.MIN_VALUE;
            } else {
                c38182 = new C38182(continuation);
            }
        }
        C38182 c381822 = c38182;
        Object objFundingOptions = c381822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c381822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFundingOptions);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String entry_point = request.getData().getEntry_point();
            FundingOptionsRequestDto.LocationDto location = request.getData().getLocation();
            FundingOptionsRequestDto.LayoutDto requested_layout = request.getData().getRequested_layout();
            c381822.label = 1;
            objFundingOptions = accountsServiceRetrofit.FundingOptions(metadata, account_number, entry_point, location, requested_layout, c381822);
            if (objFundingOptions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFundingOptions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFundingOptions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountOnboardingEligibility(AccountOnboardingEligibilityRequestDto accountOnboardingEligibilityRequestDto, Continuation<? super AccountOnboardingEligibilityResponseDto> continuation) {
        C38131 c38131;
        if (continuation instanceof C38131) {
            c38131 = (C38131) continuation;
            int i = c38131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38131.label = i - Integer.MIN_VALUE;
            } else {
                c38131 = new C38131(continuation);
            }
        }
        Object objAccountOnboardingEligibility = c38131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountOnboardingEligibility);
            Request<AccountOnboardingEligibilityRequestDto> request = new Request<>(accountOnboardingEligibilityRequestDto, null, 2, null);
            c38131.label = 1;
            objAccountOnboardingEligibility = AccountOnboardingEligibility(request, c38131);
            if (objAccountOnboardingEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountOnboardingEligibility);
        }
        return ((Response) objAccountOnboardingEligibility).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountOnboardingEligibility(Request<AccountOnboardingEligibilityRequestDto> request, Continuation<? super Response<AccountOnboardingEligibilityResponseDto>> continuation) {
        C38142 c38142;
        if (continuation instanceof C38142) {
            c38142 = (C38142) continuation;
            int i = c38142.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38142.label = i - Integer.MIN_VALUE;
            } else {
                c38142 = new C38142(continuation);
            }
        }
        Object objAccountOnboardingEligibility = c38142.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38142.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountOnboardingEligibility);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            BrokerageAccountTypeDto brokerage_account_type = request.getData().getBrokerage_account_type() != BrokerageAccountTypeDto.INSTANCE.getZeroValue() ? request.getData().getBrokerage_account_type() : null;
            ManagementTypeDto management_type = request.getData().getManagement_type();
            c38142.label = 1;
            objAccountOnboardingEligibility = accountsServiceRetrofit.AccountOnboardingEligibility(metadata, brokerage_account_type, management_type, c38142);
            if (objAccountOnboardingEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountOnboardingEligibility);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAccountOnboardingEligibility);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountNumbers(AccountNumbersRequestDto accountNumbersRequestDto, Continuation<? super AccountNumbersResponseDto> continuation) {
        C38111 c38111;
        if (continuation instanceof C38111) {
            c38111 = (C38111) continuation;
            int i = c38111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38111.label = i - Integer.MIN_VALUE;
            } else {
                c38111 = new C38111(continuation);
            }
        }
        Object objAccountNumbers = c38111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountNumbers);
            Request<AccountNumbersRequestDto> request = new Request<>(accountNumbersRequestDto, null, 2, null);
            c38111.label = 1;
            objAccountNumbers = AccountNumbers(request, c38111);
            if (objAccountNumbers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountNumbers);
        }
        return ((Response) objAccountNumbers).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountNumbers(Request<AccountNumbersRequestDto> request, Continuation<? super Response<AccountNumbersResponseDto>> continuation) {
        C38122 c38122;
        if (continuation instanceof C38122) {
            c38122 = (C38122) continuation;
            int i = c38122.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38122.label = i - Integer.MIN_VALUE;
            } else {
                c38122 = new C38122(continuation);
            }
        }
        Object objAccountNumbers = c38122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountNumbers);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c38122.label = 1;
            objAccountNumbers = accountsServiceRetrofit.AccountNumbers(metadata, c38122);
            if (objAccountNumbers == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountNumbers);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAccountNumbers);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.accounts.p028v1.AccountsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountDashboardFooter(AccountDashboardFooterRequestDto accountDashboardFooterRequestDto, Continuation<? super AccountDashboardFooterResponseDto> continuation) {
        C38091 c38091;
        if (continuation instanceof C38091) {
            c38091 = (C38091) continuation;
            int i = c38091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38091.label = i - Integer.MIN_VALUE;
            } else {
                c38091 = new C38091(continuation);
            }
        }
        Object objAccountDashboardFooter = c38091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountDashboardFooter);
            Request<AccountDashboardFooterRequestDto> request = new Request<>(accountDashboardFooterRequestDto, null, 2, null);
            c38091.label = 1;
            objAccountDashboardFooter = AccountDashboardFooter(request, c38091);
            if (objAccountDashboardFooter == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountDashboardFooter);
        }
        return ((Response) objAccountDashboardFooter).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountDashboardFooter(Request<AccountDashboardFooterRequestDto> request, Continuation<? super Response<AccountDashboardFooterResponseDto>> continuation) {
        C38102 c38102;
        if (continuation instanceof C38102) {
            c38102 = (C38102) continuation;
            int i = c38102.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38102.label = i - Integer.MIN_VALUE;
            } else {
                c38102 = new C38102(continuation);
            }
        }
        Object objAccountDashboardFooter = c38102.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c38102.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountDashboardFooter);
            AccountsServiceRetrofit accountsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c38102.label = 1;
            objAccountDashboardFooter = accountsServiceRetrofit.AccountDashboardFooter(metadata, account_number, c38102);
            if (objAccountDashboardFooter == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountDashboardFooter);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAccountDashboardFooter);
    }
}
