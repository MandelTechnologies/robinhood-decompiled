package com.withpersona.sdk2.inquiry.internal;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest2;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.Logger7;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: ErrorReportingManager.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ErrorReportingManager;", "", "inquiryService", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "moshi", "Lcom/squareup/moshi/Moshi;", "logger", "Lcom/withpersona/sdk2/inquiry/logger/Logger;", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;Lcom/squareup/moshi/Moshi;Lcom/withpersona/sdk2/inquiry/logger/Logger;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "reportSessionCancelled", "Lkotlinx/coroutines/Job;", "sessionToken", "", "reportError", "errorInfo", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "reportErrors", "", "subsystem", "errorType", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;", "level", "Lcom/withpersona/sdk2/inquiry/logger/LogLevel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;Lcom/withpersona/sdk2/inquiry/logger/LogLevel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ErrorReportingManager {
    private final CoroutineScope coroutineScope;
    private final InquiryService inquiryService;
    private final Logger logger;
    private final Moshi moshi;

    /* compiled from: ErrorReportingManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", m3645f = "ErrorReportingManager.kt", m3646l = {62, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "reportError")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$2 */
    static final class C436082 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C436082(Continuation<? super C436082> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ErrorReportingManager.this.reportError(null, null, null, null, this);
        }
    }

    public ErrorReportingManager(InquiryService inquiryService, Moshi moshi, Logger logger) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    /* compiled from: ErrorReportingManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", m3645f = "ErrorReportingManager.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1 */
    static final class C436101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436101(String str, Continuation<? super C436101> continuation) {
            super(2, continuation);
            this.$sessionToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ErrorReportingManager.this.new C436101(this.$sessionToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InquiryService inquiryService = ErrorReportingManager.this.inquiryService;
                String str = this.$sessionToken;
                this.label = 1;
                if (inquiryService.cancelCurrentInquirySession(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job reportSessionCancelled(String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new C436101(sessionToken, null), 2, null);
    }

    /* compiled from: ErrorReportingManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", m3645f = "ErrorReportingManager.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1 */
    static final class C436071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InternalErrorInfo $errorInfo;
        final /* synthetic */ String $sessionToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436071(String str, InternalErrorInfo internalErrorInfo, Continuation<? super C436071> continuation) {
            super(2, continuation);
            this.$sessionToken = str;
            this.$errorInfo = internalErrorInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ErrorReportingManager.this.new C436071(this.$sessionToken, this.$errorInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InquiryService inquiryService = ErrorReportingManager.this.inquiryService;
                String str = this.$sessionToken;
                ErrorRequest errorRequest = new ErrorRequest(ErrorRequest2.toServerType(this.$errorInfo), ErrorReportingManager.this.moshi.adapter(InternalErrorInfo.class).toJsonValue(this.$errorInfo));
                this.label = 1;
                if (inquiryService.reportError(str, errorRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job reportError(String sessionToken, InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new C436071(sessionToken, errorInfo, null), 2, null);
    }

    /* compiled from: ErrorReportingManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", m3645f = "ErrorReportingManager.kt", m3646l = {48, 49, 50, 52}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1 */
    static final class C436091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436091(String str, Continuation<? super C436091> continuation) {
            super(2, continuation);
            this.$sessionToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ErrorReportingManager.this.new C436091(this.$sessionToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.deleteLogFile(r13) != r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1) = 
          (r10v2 com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1)
          (r10v6 com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1)
         binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C436091 c436091;
            ErrorReportingManager errorReportingManager;
            String str;
            ErrorRequest.ErrorType errorType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ErrorReportingManager errorReportingManager2 = ErrorReportingManager.this;
                String str2 = this.$sessionToken;
                ErrorRequest.ErrorType errorType2 = ErrorRequest.ErrorType.Nfc;
                this.label = 1;
                c436091 = this;
                if (ErrorReportingManager.reportError$default(errorReportingManager2, str2, "com.withpersona.sdk2.inquiry.nfc", errorType2, null, c436091, 8, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                c436091 = this;
            } else {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    c436091 = this;
                    errorReportingManager = ErrorReportingManager.this;
                    str = c436091.$sessionToken;
                    errorType = ErrorRequest.ErrorType.Other;
                    c436091.label = 3;
                    if (ErrorReportingManager.reportError$default(errorReportingManager, str, "com.withpersona.sdk2.inquiry.integrity", errorType, null, c436091, 8, null) != coroutine_suspended) {
                        Logger logger = ErrorReportingManager.this.logger;
                        c436091.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                c436091 = this;
                Logger logger2 = ErrorReportingManager.this.logger;
                c436091.label = 4;
            }
            ErrorReportingManager errorReportingManager3 = ErrorReportingManager.this;
            String str3 = c436091.$sessionToken;
            ErrorRequest.ErrorType errorType3 = ErrorRequest.ErrorType.Network;
            c436091.label = 2;
            if (ErrorReportingManager.reportError$default(errorReportingManager3, str3, NetworkUtilsKt.SUBSYSTEM, errorType3, null, c436091, 8, null) != coroutine_suspended) {
                errorReportingManager = ErrorReportingManager.this;
                str = c436091.$sessionToken;
                errorType = ErrorRequest.ErrorType.Other;
                c436091.label = 3;
                if (ErrorReportingManager.reportError$default(errorReportingManager, str, "com.withpersona.sdk2.inquiry.integrity", errorType, null, c436091, 8, null) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final Job reportErrors(String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new C436091(sessionToken, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r9.reportError(r6, r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportError(String str, String str2, ErrorRequest.ErrorType errorType, Logger7 logger7, Continuation<? super Unit> continuation) {
        C436082 c436082;
        ErrorReportingManager errorReportingManager;
        if (continuation instanceof C436082) {
            c436082 = (C436082) continuation;
            int i = c436082.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c436082.label = i - Integer.MIN_VALUE;
            } else {
                c436082 = new C436082(continuation);
            }
        }
        Object csvLogsWith = c436082.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c436082.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(csvLogsWith);
            Logger logger = this.logger;
            c436082.L$0 = this;
            c436082.L$1 = str;
            c436082.L$2 = errorType;
            c436082.label = 1;
            csvLogsWith = logger.readCsvLogsWith(str2, logger7, c436082);
            if (csvLogsWith != coroutine_suspended) {
                errorReportingManager = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(csvLogsWith);
            return Unit.INSTANCE;
        }
        errorType = (ErrorRequest.ErrorType) c436082.L$2;
        str = (String) c436082.L$1;
        errorReportingManager = (ErrorReportingManager) c436082.L$0;
        ResultKt.throwOnFailure(csvLogsWith);
        String str3 = (String) csvLogsWith;
        if (str3 == null) {
            return Unit.INSTANCE;
        }
        if (StringsKt.isBlank(str3)) {
            return Unit.INSTANCE;
        }
        InquiryService inquiryService = errorReportingManager.inquiryService;
        ErrorRequest errorRequest = new ErrorRequest(errorType, errorReportingManager.moshi.adapter(ErrorLog.class).toJsonValue(new ErrorLog(str3)));
        c436082.L$0 = null;
        c436082.L$1 = null;
        c436082.L$2 = null;
        c436082.label = 2;
    }

    static /* synthetic */ Object reportError$default(ErrorReportingManager errorReportingManager, String str, String str2, ErrorRequest.ErrorType errorType, Logger7 logger7, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            logger7 = Logger7.Error;
        }
        return errorReportingManager.reportError(str, str2, errorType, logger7, continuation);
    }
}
