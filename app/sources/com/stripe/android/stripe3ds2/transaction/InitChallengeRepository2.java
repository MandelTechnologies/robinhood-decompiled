package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.p418ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitChallengeRepository.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BW\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "acsDataParser", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "challengeRequestResultRepository", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;", "errorRequestExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V", "createCreqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "startChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "args", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository, reason: use source file name */
/* loaded from: classes26.dex */
public final class InitChallengeRepository2 implements InitChallengeRepository {
    private final AcsDataParser acsDataParser;
    private final ChallengeRequestResultRepository challengeRequestResultRepository;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor.Factory errorRequestExecutorFactory;
    private final JwsValidator jwsValidator;
    private final Logger logger;
    private final MessageTransformer messageTransformer;
    private final MessageVersionRegistry messageVersionRegistry;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;

    /* compiled from: InitChallengeRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository", m3645f = "InitChallengeRepository.kt", m3646l = {67}, m3647m = "startChallenge")
    /* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository$startChallenge$1 */
    static final class C426211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C426211(Continuation<? super C426211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitChallengeRepository2.this.startChallenge(null, this);
        }
    }

    public InitChallengeRepository2(SdkTransactionId sdkTransactionId, MessageVersionRegistry messageVersionRegistry, JwsValidator jwsValidator, MessageTransformer messageTransformer, AcsDataParser acsDataParser, ChallengeRequestResultRepository challengeRequestResultRepository, ErrorRequestExecutor.Factory errorRequestExecutorFactory, StripeUiCustomization uiCustomization, ErrorReporter errorReporter, Logger logger) {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(jwsValidator, "jwsValidator");
        Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
        Intrinsics.checkNotNullParameter(acsDataParser, "acsDataParser");
        Intrinsics.checkNotNullParameter(challengeRequestResultRepository, "challengeRequestResultRepository");
        Intrinsics.checkNotNullParameter(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.sdkTransactionId = sdkTransactionId;
        this.messageVersionRegistry = messageVersionRegistry;
        this.jwsValidator = jwsValidator;
        this.messageTransformer = messageTransformer;
        this.acsDataParser = acsDataParser;
        this.challengeRequestResultRepository = challengeRequestResultRepository;
        this.errorRequestExecutorFactory = errorRequestExecutorFactory;
        this.uiCustomization = uiCustomization;
        this.errorReporter = errorReporter;
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // com.stripe.android.stripe3ds2.transaction.InitChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        C426211 c426211;
        InitChallengeRepository2 initChallengeRepository2;
        ErrorRequestExecutor errorRequestExecutor;
        ChallengeRequestExecutor.Config config;
        InitChallengeRepository2 initChallengeRepository22;
        InitChallengeArgs initChallengeArgs2;
        Object objM28550constructorimpl;
        InitChallengeArgs initChallengeArgs3;
        Throwable thM28553exceptionOrNullimpl;
        InitChallengeArgs initChallengeArgs4;
        ChallengeRequestResult challengeRequestResult;
        Object end;
        ?? r2 = "getEncoded(...)";
        if (continuation instanceof C426211) {
            c426211 = (C426211) continuation;
            int i = c426211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c426211.label = i - Integer.MIN_VALUE;
            } else {
                c426211 = new C426211(continuation);
            }
        }
        Object obj = c426211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c426211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.logger.info("Make initial challenge request.");
            try {
                Result.Companion companion = Result.INSTANCE;
                AcsDataParser acsDataParser = this.acsDataParser;
                JwsValidator jwsValidator = this.jwsValidator;
                String acsSignedContent = initChallengeArgs.getChallengeParameters().getAcsSignedContent();
                try {
                    if (acsSignedContent != null) {
                        AcsData acsData = acsDataParser.parse(jwsValidator.getPayload(acsSignedContent));
                        String acsUrl = acsData.getAcsUrl();
                        ECPublicKey acsEphemPubKey = acsData.getAcsEphemPubKey();
                        ChallengeRequestData challengeRequestDataCreateCreqData = createCreqData(this.sdkTransactionId, initChallengeArgs.getChallengeParameters());
                        ErrorRequestExecutor errorRequestExecutorCreate = this.errorRequestExecutorFactory.create(acsUrl, this.errorReporter);
                        MessageTransformer messageTransformer = this.messageTransformer;
                        String sdkReferenceNumber = initChallengeArgs.getSdkReferenceNumber();
                        byte[] encoded = initChallengeArgs.getSdkKeyPair().getPrivate().getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
                        byte[] encoded2 = acsEphemPubKey.getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded2, "getEncoded(...)");
                        ChallengeRequestExecutor.Config config2 = new ChallengeRequestExecutor.Config(messageTransformer, sdkReferenceNumber, challengeRequestDataCreateCreqData, acsUrl, new ChallengeRequestExecutor.Config.Keys(encoded, encoded2));
                        ChallengeRequestResultRepository challengeRequestResultRepository = this.challengeRequestResultRepository;
                        c426211.L$0 = this;
                        InitChallengeArgs initChallengeArgs5 = initChallengeArgs;
                        c426211.L$1 = initChallengeArgs5;
                        c426211.L$2 = this;
                        c426211.L$3 = errorRequestExecutorCreate;
                        c426211.L$4 = config2;
                        c426211.label = 1;
                        obj = challengeRequestResultRepository.get(config2, challengeRequestDataCreateCreqData, c426211);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        initChallengeRepository2 = this;
                        errorRequestExecutor = errorRequestExecutorCreate;
                        config = config2;
                        initChallengeRepository22 = initChallengeRepository2;
                        initChallengeArgs4 = initChallengeArgs5;
                        challengeRequestResult = (ChallengeRequestResult) obj;
                        if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                        }
                        objM28550constructorimpl = Result.m28550constructorimpl(end);
                        initChallengeArgs3 = initChallengeArgs4;
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable th) {
                    th = th;
                    initChallengeRepository2 = this;
                    initChallengeArgs2 = r2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    initChallengeArgs3 = initChallengeArgs2;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = initChallengeArgs;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChallengeRequestExecutor.Config config3 = (ChallengeRequestExecutor.Config) c426211.L$4;
            errorRequestExecutor = (ErrorRequestExecutor) c426211.L$3;
            initChallengeRepository22 = (InitChallengeRepository2) c426211.L$2;
            InitChallengeArgs initChallengeArgs6 = (InitChallengeArgs) c426211.L$1;
            initChallengeRepository2 = (InitChallengeRepository2) c426211.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                config = config3;
                initChallengeArgs4 = initChallengeArgs6;
            } catch (Throwable th3) {
                th = th3;
                initChallengeArgs2 = initChallengeArgs6;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                initChallengeArgs3 = initChallengeArgs2;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
            }
            try {
                challengeRequestResult = (ChallengeRequestResult) obj;
                if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                    end = new InitChallengeResult.Start(new ChallengeViewArgs(((ChallengeRequestResult.Success) challengeRequestResult).getCresData(), ((ChallengeRequestResult.Success) challengeRequestResult).getCreqData(), initChallengeRepository22.uiCustomization, config, new StripeChallengeRequestExecutor.Factory(config), initChallengeArgs4.getTimeoutMins(), initChallengeArgs4.getIntentData()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                    errorRequestExecutor.executeAsync(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
                    end = new InitChallengeResult.End(new ChallengeResult.ProtocolError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData(), null, initChallengeArgs4.getIntentData()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
                    errorRequestExecutor.executeAsync(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
                    end = new InitChallengeResult.End(new ChallengeResult.Timeout(null, null, initChallengeArgs4.getIntentData()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
                    end = new InitChallengeResult.End(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable(), null, initChallengeArgs4.getIntentData()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                objM28550constructorimpl = Result.m28550constructorimpl(end);
                initChallengeArgs3 = initChallengeArgs4;
            } catch (Throwable th4) {
                th = th4;
                initChallengeArgs2 = initChallengeArgs4;
                Result.Companion companion222 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                initChallengeArgs3 = initChallengeArgs2;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
            }
        }
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return objM28550constructorimpl;
        }
        initChallengeRepository2.errorReporter.reportError(thM28553exceptionOrNullimpl);
        initChallengeRepository2.logger.error("Exception during initial challenge request.", thM28553exceptionOrNullimpl);
        return new InitChallengeResult.End(new ChallengeResult.RuntimeError(thM28553exceptionOrNullimpl, null, initChallengeArgs3.getIntentData()));
    }

    private final ChallengeRequestData createCreqData(SdkTransactionId sdkTransactionId, ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
        if (threeDsServerTransactionId != null) {
            return new ChallengeRequestData(this.messageVersionRegistry.getCurrent(), threeDsServerTransactionId, acsTransactionId, sdkTransactionId, null, null, null, null, null, null, 1008, null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
