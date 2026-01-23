package bonfire.proto.idl.copilot.p032v1;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RestCopilotService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0096@¢\u0006\u0004\b$\u0010\rJ\u0018\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020&0\u000bH\u0096@¢\u0006\u0004\b(\u0010\rJ\u0018\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J$\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020*0\u000bH\u0096@¢\u0006\u0004\b,\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/RestCopilotService;", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "Lbonfire/proto/idl/copilot/v1/CopilotServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotServiceRetrofit;)V", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;", "request", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "InstrumentDigestV2", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetFeedbackResponseDto;", "GetFeedback", "(Lbonfire/proto/idl/copilot/v1/GetFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponseDto;", "SubmitFeedback", "(Lbonfire/proto/idl/copilot/v1/SubmitFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackResponseDto;", "GetPortfolioDigestFeedback", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackResponseDto;", "SubmitPortfolioDigestFeedback", "(Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingRequestDto;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "DigestOnboarding", "(Lbonfire/proto/idl/copilot/v1/DigestOnboardingRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsRequestDto;", "Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsResponseDto;", "DigestPopularInstruments", "(Lbonfire/proto/idl/copilot/v1/DigestPopularInstrumentsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestRequestDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "GetPortfolioDigest", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;", "", "SubmitPortfolioDigestRead", "(Lbonfire/proto/idl/copilot/v1/SubmitPortfolioDigestReadRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/copilot/v1/CopilotServiceRetrofit;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class RestCopilotService implements CopilotService {
    private final CopilotServiceRetrofit retrofit;

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "DigestOnboarding")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$DigestOnboarding$1 */
    static final class C41121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41121(Continuation<? super C41121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.DigestOnboarding((DigestOnboardingRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "DigestOnboarding")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$DigestOnboarding$2 */
    static final class C41132 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41132(Continuation<? super C41132> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.DigestOnboarding((Request<DigestOnboardingRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "DigestPopularInstruments")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$DigestPopularInstruments$1 */
    static final class C41141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41141(Continuation<? super C41141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.DigestPopularInstruments((DigestPopularInstrumentsRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "DigestPopularInstruments")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$DigestPopularInstruments$2 */
    static final class C41152 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41152(Continuation<? super C41152> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.DigestPopularInstruments((Request<DigestPopularInstrumentsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {119}, m3647m = "GetFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetFeedback$1 */
    static final class C41161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41161(Continuation<? super C41161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetFeedback((GetFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {125}, m3647m = "GetFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetFeedback$2 */
    static final class C41172 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41172(Continuation<? super C41172> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetFeedback((Request<GetFeedbackRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "GetPortfolioDigest")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetPortfolioDigest$1 */
    static final class C41181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41181(Continuation<? super C41181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetPortfolioDigest((GetPortfolioDigestRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "GetPortfolioDigest")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetPortfolioDigest$2 */
    static final class C41192 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41192(Continuation<? super C41192> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetPortfolioDigest((Request<GetPortfolioDigestRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "GetPortfolioDigestFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetPortfolioDigestFeedback$1 */
    static final class C41201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41201(Continuation<? super C41201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetPortfolioDigestFeedback((GetPortfolioDigestFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "GetPortfolioDigestFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$GetPortfolioDigestFeedback$2 */
    static final class C41212 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41212(Continuation<? super C41212> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.GetPortfolioDigestFeedback((Request<GetPortfolioDigestFeedbackRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {53}, m3647m = "InstrumentDigestV2")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$InstrumentDigestV2$1 */
    static final class C41221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41221(Continuation<? super C41221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.InstrumentDigestV2((InstrumentDigestV2RequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {59}, m3647m = "InstrumentDigestV2")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$InstrumentDigestV2$2 */
    static final class C41232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41232(Continuation<? super C41232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.InstrumentDigestV2((Request<InstrumentDigestV2RequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "SubmitFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitFeedback$1 */
    static final class C41241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41241(Continuation<? super C41241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitFeedback((SubmitFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "SubmitFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitFeedback$2 */
    static final class C41252 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41252(Continuation<? super C41252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitFeedback((Request<SubmitFeedbackRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {204}, m3647m = "SubmitPortfolioDigestFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitPortfolioDigestFeedback$1 */
    static final class C41261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41261(Continuation<? super C41261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitPortfolioDigestFeedback((SubmitPortfolioDigestFeedbackRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "SubmitPortfolioDigestFeedback")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitPortfolioDigestFeedback$2 */
    static final class C41272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41272(Continuation<? super C41272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitPortfolioDigestFeedback((Request<SubmitPortfolioDigestFeedbackRequestDto>) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "SubmitPortfolioDigestRead")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitPortfolioDigestRead$1 */
    static final class C41281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41281(Continuation<? super C41281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitPortfolioDigestRead((SubmitPortfolioDigestReadRequestDto) null, this);
        }
    }

    /* compiled from: RestCopilotService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.copilot.v1.RestCopilotService", m3645f = "RestCopilotService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m3647m = "SubmitPortfolioDigestRead")
    /* renamed from: bonfire.proto.idl.copilot.v1.RestCopilotService$SubmitPortfolioDigestRead$2 */
    static final class C41292 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C41292(Continuation<? super C41292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCopilotService.this.SubmitPortfolioDigestRead((Request<SubmitPortfolioDigestReadRequestDto>) null, this);
        }
    }

    public RestCopilotService(CopilotServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InstrumentDigestV2(InstrumentDigestV2RequestDto instrumentDigestV2RequestDto, Continuation<? super InstrumentDigestV2ResponseDto> continuation) {
        C41221 c41221;
        if (continuation instanceof C41221) {
            c41221 = (C41221) continuation;
            int i = c41221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41221.label = i - Integer.MIN_VALUE;
            } else {
                c41221 = new C41221(continuation);
            }
        }
        Object objInstrumentDigestV2 = c41221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInstrumentDigestV2);
            Request<InstrumentDigestV2RequestDto> request = new Request<>(instrumentDigestV2RequestDto, null, 2, null);
            c41221.label = 1;
            objInstrumentDigestV2 = InstrumentDigestV2(request, c41221);
            if (objInstrumentDigestV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInstrumentDigestV2);
        }
        return ((Response) objInstrumentDigestV2).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InstrumentDigestV2(Request<InstrumentDigestV2RequestDto> request, Continuation<? super Response<InstrumentDigestV2ResponseDto>> continuation) {
        C41232 c41232;
        if (continuation instanceof C41232) {
            c41232 = (C41232) continuation;
            int i = c41232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41232.label = i - Integer.MIN_VALUE;
            } else {
                c41232 = new C41232(continuation);
            }
        }
        Object objInstrumentDigestV2 = c41232.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41232.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInstrumentDigestV2);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            InstrumentDigestV2RequestDto data = request.getData();
            c41232.label = 1;
            objInstrumentDigestV2 = copilotServiceRetrofit.InstrumentDigestV2(metadata, data, c41232);
            if (objInstrumentDigestV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInstrumentDigestV2);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objInstrumentDigestV2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeedback(GetFeedbackRequestDto getFeedbackRequestDto, Continuation<? super GetFeedbackResponseDto> continuation) {
        C41161 c41161;
        if (continuation instanceof C41161) {
            c41161 = (C41161) continuation;
            int i = c41161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41161.label = i - Integer.MIN_VALUE;
            } else {
                c41161 = new C41161(continuation);
            }
        }
        Object objGetFeedback = c41161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeedback);
            Request<GetFeedbackRequestDto> request = new Request<>(getFeedbackRequestDto, null, 2, null);
            c41161.label = 1;
            objGetFeedback = GetFeedback(request, c41161);
            if (objGetFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeedback);
        }
        return ((Response) objGetFeedback).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeedback(Request<GetFeedbackRequestDto> request, Continuation<? super Response<GetFeedbackResponseDto>> continuation) {
        C41172 c41172;
        if (continuation instanceof C41172) {
            c41172 = (C41172) continuation;
            int i = c41172.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41172.label = i - Integer.MIN_VALUE;
            } else {
                c41172 = new C41172(continuation);
            }
        }
        C41172 c411722 = c41172;
        Object objGetFeedback = c411722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c411722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeedback);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String digest_id = !Intrinsics.areEqual(request.getData().getDigest_id(), "") ? request.getData().getDigest_id() : null;
            Instant feedback_timestamp = request.getData().getFeedback_timestamp();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant feedback_timestamp2 = !Intrinsics.areEqual(feedback_timestamp, instantOfEpochSecond) ? request.getData().getFeedback_timestamp() : null;
            InstrumentTypeDto instrument_type = request.getData().getInstrument_type() != InstrumentTypeDto.INSTANCE.getZeroValue() ? request.getData().getInstrument_type() : null;
            c411722.label = 1;
            objGetFeedback = copilotServiceRetrofit.GetFeedback(metadata, digest_id, feedback_timestamp2, instrument_type, c411722);
            if (objGetFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFeedback);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitFeedback(SubmitFeedbackRequestDto submitFeedbackRequestDto, Continuation<? super SubmitFeedbackResponseDto> continuation) {
        C41241 c41241;
        if (continuation instanceof C41241) {
            c41241 = (C41241) continuation;
            int i = c41241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41241.label = i - Integer.MIN_VALUE;
            } else {
                c41241 = new C41241(continuation);
            }
        }
        Object objSubmitFeedback = c41241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitFeedback);
            Request<SubmitFeedbackRequestDto> request = new Request<>(submitFeedbackRequestDto, null, 2, null);
            c41241.label = 1;
            objSubmitFeedback = SubmitFeedback(request, c41241);
            if (objSubmitFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitFeedback);
        }
        return ((Response) objSubmitFeedback).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitFeedback(Request<SubmitFeedbackRequestDto> request, Continuation<? super Response<SubmitFeedbackResponseDto>> continuation) {
        C41252 c41252;
        if (continuation instanceof C41252) {
            c41252 = (C41252) continuation;
            int i = c41252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41252.label = i - Integer.MIN_VALUE;
            } else {
                c41252 = new C41252(continuation);
            }
        }
        Object objSubmitFeedback = c41252.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41252.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitFeedback);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SubmitFeedbackRequestDto data = request.getData();
            c41252.label = 1;
            objSubmitFeedback = copilotServiceRetrofit.SubmitFeedback(metadata, data, c41252);
            if (objSubmitFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSubmitFeedback);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPortfolioDigestFeedback(GetPortfolioDigestFeedbackRequestDto getPortfolioDigestFeedbackRequestDto, Continuation<? super GetPortfolioDigestFeedbackResponseDto> continuation) {
        C41201 c41201;
        if (continuation instanceof C41201) {
            c41201 = (C41201) continuation;
            int i = c41201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41201.label = i - Integer.MIN_VALUE;
            } else {
                c41201 = new C41201(continuation);
            }
        }
        Object objGetPortfolioDigestFeedback = c41201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPortfolioDigestFeedback);
            Request<GetPortfolioDigestFeedbackRequestDto> request = new Request<>(getPortfolioDigestFeedbackRequestDto, null, 2, null);
            c41201.label = 1;
            objGetPortfolioDigestFeedback = GetPortfolioDigestFeedback(request, c41201);
            if (objGetPortfolioDigestFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPortfolioDigestFeedback);
        }
        return ((Response) objGetPortfolioDigestFeedback).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPortfolioDigestFeedback(Request<GetPortfolioDigestFeedbackRequestDto> request, Continuation<? super Response<GetPortfolioDigestFeedbackResponseDto>> continuation) {
        C41212 c41212;
        if (continuation instanceof C41212) {
            c41212 = (C41212) continuation;
            int i = c41212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41212.label = i - Integer.MIN_VALUE;
            } else {
                c41212 = new C41212(continuation);
            }
        }
        Object objGetPortfolioDigestFeedback = c41212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPortfolioDigestFeedback);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String digest_id = !Intrinsics.areEqual(request.getData().getDigest_id(), "") ? request.getData().getDigest_id() : null;
            Instant generation_timestamp = request.getData().getGeneration_timestamp();
            c41212.label = 1;
            objGetPortfolioDigestFeedback = copilotServiceRetrofit.GetPortfolioDigestFeedback(metadata, digest_id, generation_timestamp, c41212);
            if (objGetPortfolioDigestFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPortfolioDigestFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPortfolioDigestFeedback);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitPortfolioDigestFeedback(SubmitPortfolioDigestFeedbackRequestDto submitPortfolioDigestFeedbackRequestDto, Continuation<? super SubmitPortfolioDigestFeedbackResponseDto> continuation) {
        C41261 c41261;
        if (continuation instanceof C41261) {
            c41261 = (C41261) continuation;
            int i = c41261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41261.label = i - Integer.MIN_VALUE;
            } else {
                c41261 = new C41261(continuation);
            }
        }
        Object objSubmitPortfolioDigestFeedback = c41261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitPortfolioDigestFeedback);
            Request<SubmitPortfolioDigestFeedbackRequestDto> request = new Request<>(submitPortfolioDigestFeedbackRequestDto, null, 2, null);
            c41261.label = 1;
            objSubmitPortfolioDigestFeedback = SubmitPortfolioDigestFeedback(request, c41261);
            if (objSubmitPortfolioDigestFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitPortfolioDigestFeedback);
        }
        return ((Response) objSubmitPortfolioDigestFeedback).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitPortfolioDigestFeedback(Request<SubmitPortfolioDigestFeedbackRequestDto> request, Continuation<? super Response<SubmitPortfolioDigestFeedbackResponseDto>> continuation) {
        C41272 c41272;
        if (continuation instanceof C41272) {
            c41272 = (C41272) continuation;
            int i = c41272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41272.label = i - Integer.MIN_VALUE;
            } else {
                c41272 = new C41272(continuation);
            }
        }
        Object objSubmitPortfolioDigestFeedback = c41272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitPortfolioDigestFeedback);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SubmitPortfolioDigestFeedbackRequestDto data = request.getData();
            c41272.label = 1;
            objSubmitPortfolioDigestFeedback = copilotServiceRetrofit.SubmitPortfolioDigestFeedback(metadata, data, c41272);
            if (objSubmitPortfolioDigestFeedback == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitPortfolioDigestFeedback);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSubmitPortfolioDigestFeedback);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DigestOnboarding(DigestOnboardingRequestDto digestOnboardingRequestDto, Continuation<? super DigestOnboardingResponseDto> continuation) {
        C41121 c41121;
        if (continuation instanceof C41121) {
            c41121 = (C41121) continuation;
            int i = c41121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41121.label = i - Integer.MIN_VALUE;
            } else {
                c41121 = new C41121(continuation);
            }
        }
        Object objDigestOnboarding = c41121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDigestOnboarding);
            Request<DigestOnboardingRequestDto> request = new Request<>(digestOnboardingRequestDto, null, 2, null);
            c41121.label = 1;
            objDigestOnboarding = DigestOnboarding(request, c41121);
            if (objDigestOnboarding == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDigestOnboarding);
        }
        return ((Response) objDigestOnboarding).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DigestOnboarding(Request<DigestOnboardingRequestDto> request, Continuation<? super Response<DigestOnboardingResponseDto>> continuation) {
        C41132 c41132;
        if (continuation instanceof C41132) {
            c41132 = (C41132) continuation;
            int i = c41132.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41132.label = i - Integer.MIN_VALUE;
            } else {
                c41132 = new C41132(continuation);
            }
        }
        Object objDigestOnboarding = c41132.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41132.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDigestOnboarding);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            FlowTypeDto flow_type = request.getData().getFlow_type();
            c41132.label = 1;
            objDigestOnboarding = copilotServiceRetrofit.DigestOnboarding(metadata, flow_type, c41132);
            if (objDigestOnboarding == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDigestOnboarding);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objDigestOnboarding);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DigestPopularInstruments(DigestPopularInstrumentsRequestDto digestPopularInstrumentsRequestDto, Continuation<? super DigestPopularInstrumentsResponseDto> continuation) {
        C41141 c41141;
        if (continuation instanceof C41141) {
            c41141 = (C41141) continuation;
            int i = c41141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41141.label = i - Integer.MIN_VALUE;
            } else {
                c41141 = new C41141(continuation);
            }
        }
        Object objDigestPopularInstruments = c41141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDigestPopularInstruments);
            Request<DigestPopularInstrumentsRequestDto> request = new Request<>(digestPopularInstrumentsRequestDto, null, 2, null);
            c41141.label = 1;
            objDigestPopularInstruments = DigestPopularInstruments(request, c41141);
            if (objDigestPopularInstruments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDigestPopularInstruments);
        }
        return ((Response) objDigestPopularInstruments).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object DigestPopularInstruments(Request<DigestPopularInstrumentsRequestDto> request, Continuation<? super Response<DigestPopularInstrumentsResponseDto>> continuation) {
        C41152 c41152;
        if (continuation instanceof C41152) {
            c41152 = (C41152) continuation;
            int i = c41152.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41152.label = i - Integer.MIN_VALUE;
            } else {
                c41152 = new C41152(continuation);
            }
        }
        Object objDigestPopularInstruments = c41152.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41152.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDigestPopularInstruments);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c41152.label = 1;
            objDigestPopularInstruments = copilotServiceRetrofit.DigestPopularInstruments(metadata, c41152);
            if (objDigestPopularInstruments == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDigestPopularInstruments);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objDigestPopularInstruments);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPortfolioDigest(GetPortfolioDigestRequestDto getPortfolioDigestRequestDto, Continuation<? super GetPortfolioDigestResponseDto> continuation) {
        C41181 c41181;
        if (continuation instanceof C41181) {
            c41181 = (C41181) continuation;
            int i = c41181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41181.label = i - Integer.MIN_VALUE;
            } else {
                c41181 = new C41181(continuation);
            }
        }
        Object objGetPortfolioDigest = c41181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPortfolioDigest);
            Request<GetPortfolioDigestRequestDto> request = new Request<>(getPortfolioDigestRequestDto, null, 2, null);
            c41181.label = 1;
            objGetPortfolioDigest = GetPortfolioDigest(request, c41181);
            if (objGetPortfolioDigest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPortfolioDigest);
        }
        return ((Response) objGetPortfolioDigest).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPortfolioDigest(Request<GetPortfolioDigestRequestDto> request, Continuation<? super Response<GetPortfolioDigestResponseDto>> continuation) {
        C41192 c41192;
        if (continuation instanceof C41192) {
            c41192 = (C41192) continuation;
            int i = c41192.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41192.label = i - Integer.MIN_VALUE;
            } else {
                c41192 = new C41192(continuation);
            }
        }
        Object objGetPortfolioDigest = c41192.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41192.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPortfolioDigest);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c41192.label = 1;
            objGetPortfolioDigest = copilotServiceRetrofit.GetPortfolioDigest(metadata, account_number, c41192);
            if (objGetPortfolioDigest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPortfolioDigest);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPortfolioDigest);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.copilot.p032v1.CopilotService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitPortfolioDigestRead(SubmitPortfolioDigestReadRequestDto submitPortfolioDigestReadRequestDto, Continuation<Object> continuation) {
        C41281 c41281;
        if (continuation instanceof C41281) {
            c41281 = (C41281) continuation;
            int i = c41281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41281.label = i - Integer.MIN_VALUE;
            } else {
                c41281 = new C41281(continuation);
            }
        }
        Object objSubmitPortfolioDigestRead = c41281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitPortfolioDigestRead);
            Request<SubmitPortfolioDigestReadRequestDto> request = new Request<>(submitPortfolioDigestReadRequestDto, null, 2, null);
            c41281.label = 1;
            objSubmitPortfolioDigestRead = SubmitPortfolioDigestRead(request, c41281);
            if (objSubmitPortfolioDigestRead == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitPortfolioDigestRead);
        }
        return ((Response) objSubmitPortfolioDigestRead).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitPortfolioDigestRead(Request<SubmitPortfolioDigestReadRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C41292 c41292;
        if (continuation instanceof C41292) {
            c41292 = (C41292) continuation;
            int i = c41292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41292.label = i - Integer.MIN_VALUE;
            } else {
                c41292 = new C41292(continuation);
            }
        }
        Object objSubmitPortfolioDigestRead = c41292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41292.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitPortfolioDigestRead);
            CopilotServiceRetrofit copilotServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SubmitPortfolioDigestReadRequestDto data = request.getData();
            c41292.label = 1;
            objSubmitPortfolioDigestRead = copilotServiceRetrofit.SubmitPortfolioDigestRead(metadata, data, c41292);
            if (objSubmitPortfolioDigestRead == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitPortfolioDigestRead);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSubmitPortfolioDigestRead);
    }
}
