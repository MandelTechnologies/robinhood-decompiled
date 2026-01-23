package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

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

/* compiled from: RestJointAccountsOnboardingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b\u001f\u0010\rJ\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020!H\u0096@¢\u0006\u0004\b\"\u0010#J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\b\"\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/RestJointAccountsOnboardingService;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingServiceRetrofit;)V", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsRequestDto;", "request", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "FetchSecondaryPostAgreements", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedRequestDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "FetchJointAccountCreated", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignSweepAgreementsRequestDto;", "", "SignSweepAgreements", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignSweepAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/GetGoldFeaturesRequestDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/GetGoldFeaturesResponseDto;", "GetGoldFeatures", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/GetGoldFeaturesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountCoOwnerQuestionnaireCompletedRequestDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountCoOwnerQuestionnaireCompletedResponseDto;", "JointAccountCoOwnerQuestionnaireCompleted", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountCoOwnerQuestionnaireCompletedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignMarginAgreementsRequestDto;", "SignMarginAgreements", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignMarginAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SendCoOwnerIpEmailRequestDto;", "SendCoOwnerIpEmail", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/SendCoOwnerIpEmailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingServiceRetrofit;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestJointAccountsOnboardingService implements JointAccountsOnboardingService {
    private final JointAccountsOnboardingServiceRetrofit retrofit;

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {27}, m3647m = "FetchJointAccountCreated")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$FetchJointAccountCreated$1 */
    static final class C43731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43731(Continuation<? super C43731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.FetchJointAccountCreated((FetchJointAccountCreatedRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {30}, m3647m = "FetchJointAccountCreated")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$FetchJointAccountCreated$2 */
    static final class C43742 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43742(Continuation<? super C43742> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.FetchJointAccountCreated((Request<FetchJointAccountCreatedRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {17}, m3647m = "FetchSecondaryPostAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$FetchSecondaryPostAgreements$1 */
    static final class C43751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43751(Continuation<? super C43751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.FetchSecondaryPostAgreements((FetchSecondaryPostAgreementsRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {20}, m3647m = "FetchSecondaryPostAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$FetchSecondaryPostAgreements$2 */
    static final class C43762 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43762(Continuation<? super C43762> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.FetchSecondaryPostAgreements((Request<FetchSecondaryPostAgreementsRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {48}, m3647m = "GetGoldFeatures")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$GetGoldFeatures$1 */
    static final class C43771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43771(Continuation<? super C43771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.GetGoldFeatures((GetGoldFeaturesRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {51}, m3647m = "GetGoldFeatures")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$GetGoldFeatures$2 */
    static final class C43782 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43782(Continuation<? super C43782> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.GetGoldFeatures((Request<GetGoldFeaturesRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {58}, m3647m = "JointAccountCoOwnerQuestionnaireCompleted")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$JointAccountCoOwnerQuestionnaireCompleted$1 */
    static final class C43791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43791(Continuation<? super C43791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.JointAccountCoOwnerQuestionnaireCompleted((JointAccountCoOwnerQuestionnaireCompletedRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {61}, m3647m = "JointAccountCoOwnerQuestionnaireCompleted")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$JointAccountCoOwnerQuestionnaireCompleted$2 */
    static final class C43802 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43802(Continuation<? super C43802> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.JointAccountCoOwnerQuestionnaireCompleted((Request<JointAccountCoOwnerQuestionnaireCompletedRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {79}, m3647m = "SendCoOwnerIpEmail")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SendCoOwnerIpEmail$1 */
    static final class C43811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43811(Continuation<? super C43811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SendCoOwnerIpEmail((SendCoOwnerIpEmailRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {82}, m3647m = "SendCoOwnerIpEmail")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SendCoOwnerIpEmail$2 */
    static final class C43822 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43822(Continuation<? super C43822> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SendCoOwnerIpEmail((Request<SendCoOwnerIpEmailRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {69}, m3647m = "SignMarginAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SignMarginAgreements$1 */
    static final class C43831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43831(Continuation<? super C43831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SignMarginAgreements((SignMarginAgreementsRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "SignMarginAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SignMarginAgreements$2 */
    static final class C43842 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43842(Continuation<? super C43842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SignMarginAgreements((Request<SignMarginAgreementsRequestDto>) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {38}, m3647m = "SignSweepAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SignSweepAgreements$1 */
    static final class C43851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43851(Continuation<? super C43851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SignSweepAgreements((SignSweepAgreementsRequestDto) null, this);
        }
    }

    /* compiled from: RestJointAccountsOnboardingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService", m3645f = "RestJointAccountsOnboardingService.kt", m3646l = {41}, m3647m = "SignSweepAgreements")
    /* renamed from: bonfire.proto.idl.joint_accounts_onboarding.v1.RestJointAccountsOnboardingService$SignSweepAgreements$2 */
    static final class C43862 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43862(Continuation<? super C43862> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestJointAccountsOnboardingService.this.SignSweepAgreements((Request<SignSweepAgreementsRequestDto>) null, this);
        }
    }

    public RestJointAccountsOnboardingService(JointAccountsOnboardingServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchSecondaryPostAgreements(FetchSecondaryPostAgreementsRequestDto fetchSecondaryPostAgreementsRequestDto, Continuation<? super FetchSecondaryPostAgreementsResponseDto> continuation) {
        C43751 c43751;
        if (continuation instanceof C43751) {
            c43751 = (C43751) continuation;
            int i = c43751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43751.label = i - Integer.MIN_VALUE;
            } else {
                c43751 = new C43751(continuation);
            }
        }
        Object objFetchSecondaryPostAgreements = c43751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchSecondaryPostAgreements);
            Request<FetchSecondaryPostAgreementsRequestDto> request = new Request<>(fetchSecondaryPostAgreementsRequestDto, null, 2, null);
            c43751.label = 1;
            objFetchSecondaryPostAgreements = FetchSecondaryPostAgreements(request, c43751);
            if (objFetchSecondaryPostAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchSecondaryPostAgreements);
        }
        return ((Response) objFetchSecondaryPostAgreements).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchSecondaryPostAgreements(Request<FetchSecondaryPostAgreementsRequestDto> request, Continuation<? super Response<FetchSecondaryPostAgreementsResponseDto>> continuation) {
        C43762 c43762;
        if (continuation instanceof C43762) {
            c43762 = (C43762) continuation;
            int i = c43762.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43762.label = i - Integer.MIN_VALUE;
            } else {
                c43762 = new C43762(continuation);
            }
        }
        Object objFetchSecondaryPostAgreements = c43762.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43762.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchSecondaryPostAgreements);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String invitation_id = !Intrinsics.areEqual(request.getData().getInvitation_id(), "") ? request.getData().getInvitation_id() : null;
            c43762.label = 1;
            objFetchSecondaryPostAgreements = jointAccountsOnboardingServiceRetrofit.FetchSecondaryPostAgreements(metadata, invitation_id, c43762);
            if (objFetchSecondaryPostAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchSecondaryPostAgreements);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFetchSecondaryPostAgreements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchJointAccountCreated(FetchJointAccountCreatedRequestDto fetchJointAccountCreatedRequestDto, Continuation<? super FetchJointAccountCreatedResponseDto> continuation) {
        C43731 c43731;
        if (continuation instanceof C43731) {
            c43731 = (C43731) continuation;
            int i = c43731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43731.label = i - Integer.MIN_VALUE;
            } else {
                c43731 = new C43731(continuation);
            }
        }
        Object objFetchJointAccountCreated = c43731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchJointAccountCreated);
            Request<FetchJointAccountCreatedRequestDto> request = new Request<>(fetchJointAccountCreatedRequestDto, null, 2, null);
            c43731.label = 1;
            objFetchJointAccountCreated = FetchJointAccountCreated(request, c43731);
            if (objFetchJointAccountCreated == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchJointAccountCreated);
        }
        return ((Response) objFetchJointAccountCreated).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchJointAccountCreated(Request<FetchJointAccountCreatedRequestDto> request, Continuation<? super Response<FetchJointAccountCreatedResponseDto>> continuation) {
        C43742 c43742;
        if (continuation instanceof C43742) {
            c43742 = (C43742) continuation;
            int i = c43742.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43742.label = i - Integer.MIN_VALUE;
            } else {
                c43742 = new C43742(continuation);
            }
        }
        Object objFetchJointAccountCreated = c43742.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43742.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchJointAccountCreated);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String entry_point = request.getData().getEntry_point();
            c43742.label = 1;
            objFetchJointAccountCreated = jointAccountsOnboardingServiceRetrofit.FetchJointAccountCreated(metadata, account_number, entry_point, c43742);
            if (objFetchJointAccountCreated == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchJointAccountCreated);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFetchJointAccountCreated);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignSweepAgreements(SignSweepAgreementsRequestDto signSweepAgreementsRequestDto, Continuation<Object> continuation) {
        C43851 c43851;
        if (continuation instanceof C43851) {
            c43851 = (C43851) continuation;
            int i = c43851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43851.label = i - Integer.MIN_VALUE;
            } else {
                c43851 = new C43851(continuation);
            }
        }
        Object objSignSweepAgreements = c43851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignSweepAgreements);
            Request<SignSweepAgreementsRequestDto> request = new Request<>(signSweepAgreementsRequestDto, null, 2, null);
            c43851.label = 1;
            objSignSweepAgreements = SignSweepAgreements(request, c43851);
            if (objSignSweepAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignSweepAgreements);
        }
        return ((Response) objSignSweepAgreements).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignSweepAgreements(Request<SignSweepAgreementsRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C43862 c43862;
        if (continuation instanceof C43862) {
            c43862 = (C43862) continuation;
            int i = c43862.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43862.label = i - Integer.MIN_VALUE;
            } else {
                c43862 = new C43862(continuation);
            }
        }
        Object objSignSweepAgreements = c43862.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43862.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignSweepAgreements);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SignSweepAgreementsRequestDto data = request.getData();
            c43862.label = 1;
            objSignSweepAgreements = jointAccountsOnboardingServiceRetrofit.SignSweepAgreements(metadata, data, c43862);
            if (objSignSweepAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignSweepAgreements);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSignSweepAgreements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetGoldFeatures(GetGoldFeaturesRequestDto getGoldFeaturesRequestDto, Continuation<? super GetGoldFeaturesResponseDto> continuation) {
        C43771 c43771;
        if (continuation instanceof C43771) {
            c43771 = (C43771) continuation;
            int i = c43771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43771.label = i - Integer.MIN_VALUE;
            } else {
                c43771 = new C43771(continuation);
            }
        }
        Object objGetGoldFeatures = c43771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetGoldFeatures);
            Request<GetGoldFeaturesRequestDto> request = new Request<>(getGoldFeaturesRequestDto, null, 2, null);
            c43771.label = 1;
            objGetGoldFeatures = GetGoldFeatures(request, c43771);
            if (objGetGoldFeatures == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetGoldFeatures);
        }
        return ((Response) objGetGoldFeatures).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetGoldFeatures(Request<GetGoldFeaturesRequestDto> request, Continuation<? super Response<GetGoldFeaturesResponseDto>> continuation) {
        C43782 c43782;
        if (continuation instanceof C43782) {
            c43782 = (C43782) continuation;
            int i = c43782.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43782.label = i - Integer.MIN_VALUE;
            } else {
                c43782 = new C43782(continuation);
            }
        }
        Object objGetGoldFeatures = c43782.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43782.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetGoldFeatures);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c43782.label = 1;
            objGetGoldFeatures = jointAccountsOnboardingServiceRetrofit.GetGoldFeatures(metadata, account_number, c43782);
            if (objGetGoldFeatures == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetGoldFeatures);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetGoldFeatures);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object JointAccountCoOwnerQuestionnaireCompleted(JointAccountCoOwnerQuestionnaireCompletedRequestDto jointAccountCoOwnerQuestionnaireCompletedRequestDto, Continuation<? super JointAccountCoOwnerQuestionnaireCompletedResponseDto> continuation) {
        C43791 c43791;
        if (continuation instanceof C43791) {
            c43791 = (C43791) continuation;
            int i = c43791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43791.label = i - Integer.MIN_VALUE;
            } else {
                c43791 = new C43791(continuation);
            }
        }
        Object objJointAccountCoOwnerQuestionnaireCompleted = c43791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJointAccountCoOwnerQuestionnaireCompleted);
            Request<JointAccountCoOwnerQuestionnaireCompletedRequestDto> request = new Request<>(jointAccountCoOwnerQuestionnaireCompletedRequestDto, null, 2, null);
            c43791.label = 1;
            objJointAccountCoOwnerQuestionnaireCompleted = JointAccountCoOwnerQuestionnaireCompleted(request, c43791);
            if (objJointAccountCoOwnerQuestionnaireCompleted == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJointAccountCoOwnerQuestionnaireCompleted);
        }
        return ((Response) objJointAccountCoOwnerQuestionnaireCompleted).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object JointAccountCoOwnerQuestionnaireCompleted(Request<JointAccountCoOwnerQuestionnaireCompletedRequestDto> request, Continuation<? super Response<JointAccountCoOwnerQuestionnaireCompletedResponseDto>> continuation) {
        C43802 c43802;
        if (continuation instanceof C43802) {
            c43802 = (C43802) continuation;
            int i = c43802.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43802.label = i - Integer.MIN_VALUE;
            } else {
                c43802 = new C43802(continuation);
            }
        }
        Object objJointAccountCoOwnerQuestionnaireCompleted = c43802.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43802.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJointAccountCoOwnerQuestionnaireCompleted);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String product_context = !Intrinsics.areEqual(request.getData().getProduct_context(), "") ? request.getData().getProduct_context() : null;
            String account_number = Intrinsics.areEqual(request.getData().getAccount_number(), "") ? null : request.getData().getAccount_number();
            c43802.label = 1;
            objJointAccountCoOwnerQuestionnaireCompleted = jointAccountsOnboardingServiceRetrofit.JointAccountCoOwnerQuestionnaireCompleted(metadata, product_context, account_number, c43802);
            if (objJointAccountCoOwnerQuestionnaireCompleted == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJointAccountCoOwnerQuestionnaireCompleted);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objJointAccountCoOwnerQuestionnaireCompleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignMarginAgreements(SignMarginAgreementsRequestDto signMarginAgreementsRequestDto, Continuation<Object> continuation) {
        C43831 c43831;
        if (continuation instanceof C43831) {
            c43831 = (C43831) continuation;
            int i = c43831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43831.label = i - Integer.MIN_VALUE;
            } else {
                c43831 = new C43831(continuation);
            }
        }
        Object objSignMarginAgreements = c43831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignMarginAgreements);
            Request<SignMarginAgreementsRequestDto> request = new Request<>(signMarginAgreementsRequestDto, null, 2, null);
            c43831.label = 1;
            objSignMarginAgreements = SignMarginAgreements(request, c43831);
            if (objSignMarginAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignMarginAgreements);
        }
        return ((Response) objSignMarginAgreements).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignMarginAgreements(Request<SignMarginAgreementsRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C43842 c43842;
        if (continuation instanceof C43842) {
            c43842 = (C43842) continuation;
            int i = c43842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43842.label = i - Integer.MIN_VALUE;
            } else {
                c43842 = new C43842(continuation);
            }
        }
        Object objSignMarginAgreements = c43842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignMarginAgreements);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SignMarginAgreementsRequestDto data = request.getData();
            c43842.label = 1;
            objSignMarginAgreements = jointAccountsOnboardingServiceRetrofit.SignMarginAgreements(metadata, data, c43842);
            if (objSignMarginAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignMarginAgreements);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSignMarginAgreements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendCoOwnerIpEmail(SendCoOwnerIpEmailRequestDto sendCoOwnerIpEmailRequestDto, Continuation<Object> continuation) {
        C43811 c43811;
        if (continuation instanceof C43811) {
            c43811 = (C43811) continuation;
            int i = c43811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43811.label = i - Integer.MIN_VALUE;
            } else {
                c43811 = new C43811(continuation);
            }
        }
        Object objSendCoOwnerIpEmail = c43811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendCoOwnerIpEmail);
            Request<SendCoOwnerIpEmailRequestDto> request = new Request<>(sendCoOwnerIpEmailRequestDto, null, 2, null);
            c43811.label = 1;
            objSendCoOwnerIpEmail = SendCoOwnerIpEmail(request, c43811);
            if (objSendCoOwnerIpEmail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendCoOwnerIpEmail);
        }
        return ((Response) objSendCoOwnerIpEmail).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendCoOwnerIpEmail(Request<SendCoOwnerIpEmailRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C43822 c43822;
        if (continuation instanceof C43822) {
            c43822 = (C43822) continuation;
            int i = c43822.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43822.label = i - Integer.MIN_VALUE;
            } else {
                c43822 = new C43822(continuation);
            }
        }
        Object objSendCoOwnerIpEmail = c43822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendCoOwnerIpEmail);
            JointAccountsOnboardingServiceRetrofit jointAccountsOnboardingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SendCoOwnerIpEmailRequestDto data = request.getData();
            c43822.label = 1;
            objSendCoOwnerIpEmail = jointAccountsOnboardingServiceRetrofit.SendCoOwnerIpEmail(metadata, data, c43822);
            if (objSendCoOwnerIpEmail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendCoOwnerIpEmail);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSendCoOwnerIpEmail);
    }
}
