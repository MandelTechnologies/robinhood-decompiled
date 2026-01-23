package com.robinhood.android.lib.stepupverification;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.lib.stepupverification.SuvResult;
import com.robinhood.android.lib.stepupverification.VerificationWorkflowErrorResponse;
import com.robinhood.android.lib.stepupverification.VerificationWorkflowGrpcErrorResponse;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.converters.suv.VerificationWorkflowResults2;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.UUID;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: SuvWorkflowManager.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJq\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\u0010\u0019J8\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u001a\"\u0004\b\u0000\u0010\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u001e\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;)V", "handleRequest", "", "T", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onSuccess", "onError", "", "onVerificationRequired", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lcom/robinhood/android/lib/stepupverification/SuvResult;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapThrowable", "", "t", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractVerificationWorkflow", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse$VerificationWorkflow;", "error", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SuvWorkflowManager {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final SharedEventLogger eventLogger;
    private final LazyMoshi moshi;
    private final SuvMigrationManager suvMigrationManager;

    /* compiled from: SuvWorkflowManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationWorkflowResult.values().length];
            try {
                iArr[VerificationWorkflowResult.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationWorkflowResult.USER_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationWorkflowResult.INTERNAL_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationWorkflowResult.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationWorkflowResult.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SuvWorkflowManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.stepupverification.SuvWorkflowManager", m3645f = "SuvWorkflowManager.kt", m3646l = {58, 63, 73}, m3647m = "handleRequest")
    /* renamed from: com.robinhood.android.lib.stepupverification.SuvWorkflowManager$handleRequest$2 */
    static final class C205342<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C205342(Continuation<? super C205342> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuvWorkflowManager.this.handleRequest(null, this);
        }
    }

    /* compiled from: SuvWorkflowManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.stepupverification.SuvWorkflowManager", m3645f = "SuvWorkflowManager.kt", m3646l = {102}, m3647m = "mapThrowable")
    /* renamed from: com.robinhood.android.lib.stepupverification.SuvWorkflowManager$mapThrowable$1 */
    static final class C205351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C205351(Continuation<? super C205351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuvWorkflowManager.this.mapThrowable(null, this);
        }
    }

    public SuvWorkflowManager(@RootCoroutineScope CoroutineScope coroutineScope, LazyMoshi moshi, SharedEventLogger eventLogger, SuvMigrationManager suvMigrationManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        this.coroutineScope = coroutineScope;
        this.moshi = moshi;
        this.eventLogger = eventLogger;
        this.suvMigrationManager = suvMigrationManager;
    }

    /* compiled from: SuvWorkflowManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.stepupverification.SuvWorkflowManager$handleRequest$1", m3645f = "SuvWorkflowManager.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.stepupverification.SuvWorkflowManager$handleRequest$1 */
    static final class C205331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function1<T, Unit> $onSuccess;
        final /* synthetic */ Function2<UUID, Boolean, Unit> $onVerificationRequired;
        final /* synthetic */ Function1<Continuation<? super T>, Object> $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C205331(Function1<? super Continuation<? super T>, ? extends Object> function1, Function1<? super Throwable, Unit> function12, Function1<? super T, Unit> function13, Function2<? super UUID, ? super Boolean, Unit> function2, Continuation<? super C205331> continuation) {
            super(2, continuation);
            this.$request = function1;
            this.$onError = function12;
            this.$onSuccess = function13;
            this.$onVerificationRequired = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SuvWorkflowManager.this.new C205331(this.$request, this.$onError, this.$onSuccess, this.$onVerificationRequired, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C205331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SuvWorkflowManager suvWorkflowManager = SuvWorkflowManager.this;
                Function function = this.$request;
                this.label = 1;
                obj = suvWorkflowManager.handleRequest(function, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SuvResult suvResult = (SuvResult) obj;
            if (suvResult instanceof SuvResult.Error) {
                this.$onError.invoke(((SuvResult.Error) suvResult).getException());
            } else if (suvResult instanceof SuvResult.Success) {
                this.$onSuccess.invoke(((SuvResult.Success) suvResult).getValue());
            } else {
                if (!(suvResult instanceof SuvResult.VerificationRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                SuvResult.VerificationRequired verificationRequired = (SuvResult.VerificationRequired) suvResult;
                this.$onVerificationRequired.invoke(verificationRequired.getWorkflowId(), boxing.boxBoolean(verificationRequired.isMigrated()));
            }
            return Unit.INSTANCE;
        }
    }

    public final <T> void handleRequest(Function1<? super Continuation<? super T>, ? extends Object> request, Function1<? super T, Unit> onSuccess, Function1<? super Throwable, Unit> onError, Function2<? super UUID, ? super Boolean, Unit> onVerificationRequired) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onVerificationRequired, "onVerificationRequired");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C205331(request, onError, onSuccess, onVerificationRequired, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object handleRequest(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super SuvResult<? extends T>> continuation) {
        C205342 c205342;
        if (continuation instanceof C205342) {
            c205342 = (C205342) continuation;
            int i = c205342.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c205342.label = i - Integer.MIN_VALUE;
            } else {
                c205342 = new C205342(continuation);
            }
        }
        C205342 c2053422 = c205342;
        Object objInvoke = c2053422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2053422.label;
        try {
        } catch (Throwable th) {
            c2053422.label = 3;
            Object objMapThrowable = mapThrowable(th, c2053422);
            if (objMapThrowable != coroutine_suspended) {
                return objMapThrowable;
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            c2053422.label = 1;
            objInvoke = function1.invoke(c2053422);
            if (objInvoke == coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
            return objInvoke;
        }
        ResultKt.throwOnFailure(objInvoke);
        if ((objInvoke instanceof Response) && ((Response) objInvoke).code() == 403) {
            Throwable httpException = new HttpException((Response) objInvoke);
            c2053422.label = 2;
            Object objMapThrowable2 = mapThrowable(httpException, c2053422);
            return objMapThrowable2 == coroutine_suspended ? coroutine_suspended : objMapThrowable2;
        }
        SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(this.eventLogger, null, new SUVInfo(null, SUVInfo.SUVStatus.APPROVED, null, null, 13, null), null, null, null, 29, null);
        return new SuvResult.Success(objInvoke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mapThrowable(Throwable th, Continuation<? super SuvResult> continuation) {
        C205351 c205351;
        UUID id;
        if (continuation instanceof C205351) {
            c205351 = (C205351) continuation;
            int i = c205351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c205351.label = i - Integer.MIN_VALUE;
            } else {
                c205351 = new C205351(continuation);
            }
        }
        Object objIsMigrated = c205351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c205351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsMigrated);
            VerificationWorkflowErrorResponse.VerificationWorkflow verificationWorkflowExtractVerificationWorkflow = extractVerificationWorkflow(th);
            if (verificationWorkflowExtractVerificationWorkflow != null) {
                SharedEventLogger sharedEventLogger = this.eventLogger;
                String string2 = verificationWorkflowExtractVerificationWorkflow.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, new SUVInfo(string2, VerificationWorkflowResults2.toSuvInfoProtobuf(verificationWorkflowExtractVerificationWorkflow.getWorkflowStatus()), null, null, 12, null), null, null, null, 29, null);
                int i3 = WhenMappings.$EnumSwitchMapping$0[verificationWorkflowExtractVerificationWorkflow.getWorkflowStatus().ordinal()];
                if (i3 == 1) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    return new SuvResult.Error(th);
                }
                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                id = verificationWorkflowExtractVerificationWorkflow.getId();
                SuvMigrationManager suvMigrationManager = this.suvMigrationManager;
                UUID id2 = verificationWorkflowExtractVerificationWorkflow.getId();
                c205351.L$0 = id;
                c205351.label = 1;
                objIsMigrated = suvMigrationManager.isMigrated(id2, c205351);
                if (objIsMigrated == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return new SuvResult.Error(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            id = (UUID) c205351.L$0;
            ResultKt.throwOnFailure(objIsMigrated);
        }
        return new SuvResult.VerificationRequired(id, ((Boolean) objIsMigrated).booleanValue());
    }

    private final VerificationWorkflowErrorResponse.VerificationWorkflow extractVerificationWorkflow(Throwable error) {
        String strExtractErrorBodyString;
        VerificationWorkflowErrorResponse verificationWorkflowErrorResponse;
        VerificationWorkflowGrpcErrorResponse.Details detail;
        Integer httpStatusCode = Throwables.getHttpStatusCode(error);
        if (httpStatusCode == null || httpStatusCode.intValue() != 403) {
            return null;
        }
        Intrinsics.checkNotNull(error, "null cannot be cast to non-null type retrofit2.HttpException");
        HttpException httpException = (HttpException) error;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(httpException);
        if (errorResponseExtractErrorResponse == null || (strExtractErrorBodyString = errorResponseExtractErrorResponse.getFieldError("message")) == null) {
            Response<?> response = httpException.response();
            strExtractErrorBodyString = response != null ? NetworkThrowables.extractErrorBodyString(response) : null;
        }
        if (strExtractErrorBodyString != null) {
            try {
                LazyMoshi lazyMoshi = this.moshi;
                Types types = Types.INSTANCE;
                verificationWorkflowErrorResponse = (VerificationWorkflowErrorResponse) lazyMoshi.adapter(new TypeToken<VerificationWorkflowErrorResponse>() { // from class: com.robinhood.android.lib.stepupverification.SuvWorkflowManager$extractVerificationWorkflow$lambda$0$$inlined$getAdapter$1
                }.getType()).fromJson(strExtractErrorBodyString);
            } catch (Throwable unused) {
            }
            VerificationWorkflowErrorResponse.VerificationWorkflow verificationWorkflow = verificationWorkflowErrorResponse != null ? verificationWorkflowErrorResponse.getVerificationWorkflow() : null;
            if (verificationWorkflow != null) {
                return verificationWorkflow;
            }
        }
        VerificationWorkflowGrpcErrorResponse verificationWorkflowGrpcErrorResponseExtractGrpcErrorResponse = VerificationWorkflowGrpcErrorResponses.extractGrpcErrorResponse(error);
        if (verificationWorkflowGrpcErrorResponseExtractGrpcErrorResponse == null || (detail = verificationWorkflowGrpcErrorResponseExtractGrpcErrorResponse.getDetail()) == null || !(detail instanceof VerificationWorkflowErrorResponse.VerificationWorkflow)) {
            return null;
        }
        return (VerificationWorkflowErrorResponse.VerificationWorkflow) detail;
    }
}
