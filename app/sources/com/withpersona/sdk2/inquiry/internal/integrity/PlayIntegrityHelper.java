package com.withpersona.sdk2.inquiry.internal.integrity;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.logger.Logger8;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: PlayIntegrityHelper.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper;", "", "applicationContext", "Landroid/content/Context;", "loggerFactory", "Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger$Factory;", "standardIntegrityManagerFactory", "Lcom/withpersona/sdk2/inquiry/internal/integrity/StandardIntegrityManagerFactory;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger$Factory;Lcom/withpersona/sdk2/inquiry/internal/integrity/StandardIntegrityManagerFactory;Lkotlinx/coroutines/CoroutineDispatcher;)V", "logger", "Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "playIntegrityState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "prepare", "", "cloudProjectNumber", "", "generateToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "Companion", "PlayIntegrityState", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PlayIntegrityHelper {
    private static final long INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION;
    private final Context applicationContext;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatcher dispatcher;
    private final Logger8 logger;
    private final Logger8.Factory loggerFactory;
    private final Mutex mutex;
    private final StateFlow2<PlayIntegrityState> playIntegrityState;
    private final StandardIntegrityManagerFactory standardIntegrityManagerFactory;

    public PlayIntegrityHelper(Context applicationContext, Logger8.Factory loggerFactory, StandardIntegrityManagerFactory standardIntegrityManagerFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(standardIntegrityManagerFactory, "standardIntegrityManagerFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.applicationContext = applicationContext;
        this.loggerFactory = loggerFactory;
        this.standardIntegrityManagerFactory = standardIntegrityManagerFactory;
        this.dispatcher = dispatcher;
        this.logger = loggerFactory.create("com.withpersona.sdk2.inquiry.integrity");
        this.mutex = Mutex3.Mutex$default(false, 1, null);
        this.coroutineScope = CoroutineScope2.CoroutineScope(dispatcher.plus(Supervisor3.SupervisorJob$default(null, 1, null)));
        this.playIntegrityState = StateFlow4.MutableStateFlow(PlayIntegrityState.NotStarted.INSTANCE);
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
    }

    /* compiled from: PlayIntegrityHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "", "NotStarted", "Preparing", "Error", "Ready", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Error;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$NotStarted;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Preparing;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Ready;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface PlayIntegrityState {

        /* compiled from: PlayIntegrityHelper.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$NotStarted;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class NotStarted implements PlayIntegrityState {
            public static final NotStarted INSTANCE = new NotStarted();

            public boolean equals(Object other) {
                return this == other || (other instanceof NotStarted);
            }

            public int hashCode() {
                return -384804045;
            }

            public String toString() {
                return "NotStarted";
            }

            private NotStarted() {
            }
        }

        /* compiled from: PlayIntegrityHelper.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Preparing;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Preparing implements PlayIntegrityState {
            public static final Preparing INSTANCE = new Preparing();

            public boolean equals(Object other) {
                return this == other || (other instanceof Preparing);
            }

            public int hashCode() {
                return -230105505;
            }

            public String toString() {
                return "Preparing";
            }

            private Preparing() {
            }
        }

        /* compiled from: PlayIntegrityHelper.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Error;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error implements PlayIntegrityState {
            public static final Error INSTANCE = new Error();

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1174409699;
            }

            public String toString() {
                return "Error";
            }

            private Error() {
            }
        }

        /* compiled from: PlayIntegrityHelper.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState$Ready;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "integrityTokenProvider", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "<init>", "(Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;)V", "getIntegrityTokenProvider", "()Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Ready implements PlayIntegrityState {
            private final StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider;

            public Ready(StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            public final StandardIntegrityManager.StandardIntegrityTokenProvider getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    /* compiled from: PlayIntegrityHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", m3645f = "PlayIntegrityHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 156, 91, 95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1 */
    static final class C436451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cloudProjectNumber;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436451(String str, Continuation<? super C436451> continuation) {
            super(2, continuation);
            this.$cloudProjectNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlayIntegrityHelper.this.new C436451(this.$cloudProjectNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(1:(3:(1:(1:(6:9|62|10|57|58|59)(2:14|15))(8:17|66|18|48|(3:50|(2:52|56)|53)(1:54)|57|58|59))(8:22|64|23|24|42|(1:44)|(6:47|48|(0)(0)|57|58|59)|56)|60|61)(1:27))(3:28|(0)|56)|67|31|(3:33|34|35)(2:38|(2:40|56)(5:41|42|(0)|(0)|56))) */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        
            r0 = r14;
            r14 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0121 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #3 {all -> 0x00ab, blocks: (B:42:0x00c9, B:44:0x0121, B:31:0x0095, B:33:0x00a5, B:38:0x00b1), top: B:67:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:18:0x0045, B:48:0x012a, B:50:0x0136, B:54:0x0156), top: B:66:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:18:0x0045, B:48:0x012a, B:50:0x0136, B:54:0x0156), top: B:66:0x0045 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            PlayIntegrityHelper playIntegrityHelper;
            String str;
            Mutex mutex2;
            Throwable th;
            String str2;
            PlayIntegrityHelper playIntegrityHelper2;
            Object result;
            Mutex mutex3;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = PlayIntegrityHelper.this.mutex;
                playIntegrityHelper = PlayIntegrityHelper.this;
                str = this.$cloudProjectNumber;
                this.L$0 = mutex;
                this.L$1 = playIntegrityHelper;
                this.L$2 = str;
                this.label = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    String str3 = (String) this.L$2;
                    PlayIntegrityHelper playIntegrityHelper3 = (PlayIntegrityHelper) this.L$1;
                    Mutex mutex4 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str2 = str3;
                        playIntegrityHelper2 = playIntegrityHelper3;
                        mutex = mutex4;
                        StandardIntegrityManager standardIntegrityManagerCreate = playIntegrityHelper2.standardIntegrityManagerFactory.create(playIntegrityHelper2.applicationContext);
                        StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequestBuild = StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(str2)).build();
                        this.L$0 = mutex;
                        this.L$1 = playIntegrityHelper2;
                        this.L$2 = standardIntegrityManagerCreate;
                        this.L$3 = prepareIntegrityTokenRequestBuild;
                        this.L$4 = this;
                        this.label = 3;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                        cancellableContinuationImpl.initCancellability();
                        standardIntegrityManagerCreate.prepareIntegrityToken(prepareIntegrityTokenRequestBuild).addOnSuccessListener(new PlayIntegrityHelper7(new Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit>() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                                invoke2(standardIntegrityTokenProvider);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(standardIntegrityTokenProvider))));
                            }
                        })).addOnFailureListener(new OnFailureListener() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1$1$1$2
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CancellableContinuation<Result<? extends StandardIntegrityManager.StandardIntegrityTokenProvider>> cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(it)))));
                            }
                        });
                        result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbes.probeCoroutineSuspended(this);
                        }
                        if (result != coroutine_suspended) {
                            mutex3 = mutex;
                            obj = result;
                            Object value = ((Result) obj).getValue();
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex4;
                    }
                } else if (i == 3) {
                    playIntegrityHelper2 = (PlayIntegrityHelper) this.L$1;
                    mutex3 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Object value2 = ((Result) obj).getValue();
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value2);
                        if (thM28553exceptionOrNullimpl != null) {
                            StateFlow2 stateFlow2 = playIntegrityHelper2.playIntegrityState;
                            PlayIntegrityState.Ready ready = new PlayIntegrityState.Ready((StandardIntegrityManager.StandardIntegrityTokenProvider) value2);
                            this.L$0 = mutex3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 4;
                            if (stateFlow2.emit(ready, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex2 = mutex3;
                        } else {
                            playIntegrityHelper2.logger.error("integrity:prepare:" + thM28553exceptionOrNullimpl.getMessage());
                            StateFlow2 stateFlow22 = playIntegrityHelper2.playIntegrityState;
                            PlayIntegrityState.Error error = PlayIntegrityState.Error.INSTANCE;
                            this.L$0 = mutex3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 5;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        mutex2 = mutex3;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit22 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                mutex2.unlock(null);
                throw th;
            }
            str = (String) this.L$2;
            playIntegrityHelper = (PlayIntegrityHelper) this.L$1;
            Mutex mutex5 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex5;
            if (Intrinsics.areEqual(playIntegrityHelper.playIntegrityState.getValue(), PlayIntegrityState.NotStarted.INSTANCE)) {
                StateFlow2 stateFlow23 = playIntegrityHelper.playIntegrityState;
                PlayIntegrityState.Preparing preparing = PlayIntegrityState.Preparing.INSTANCE;
                this.L$0 = mutex;
                this.L$1 = playIntegrityHelper;
                this.L$2 = str;
                this.label = 2;
                if (stateFlow23.emit(preparing, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                playIntegrityHelper2 = playIntegrityHelper;
                StandardIntegrityManager standardIntegrityManagerCreate2 = playIntegrityHelper2.standardIntegrityManagerFactory.create(playIntegrityHelper2.applicationContext);
                StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequestBuild2 = StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(str2)).build();
                this.L$0 = mutex;
                this.L$1 = playIntegrityHelper2;
                this.L$2 = standardIntegrityManagerCreate2;
                this.L$3 = prepareIntegrityTokenRequestBuild2;
                this.L$4 = this;
                this.label = 3;
                final CancellableContinuation<? super Result<? extends StandardIntegrityManager.StandardIntegrityTokenProvider>> cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl2.initCancellability();
                standardIntegrityManagerCreate2.prepareIntegrityToken(prepareIntegrityTokenRequestBuild2).addOnSuccessListener(new PlayIntegrityHelper7(new Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit>() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                        invoke2(standardIntegrityTokenProvider);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                        cancellableContinuationImpl2.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(standardIntegrityTokenProvider))));
                    }
                })).addOnFailureListener(new OnFailureListener() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1$1$1$2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CancellableContinuation<Result<? extends StandardIntegrityManager.StandardIntegrityTokenProvider>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(it)))));
                    }
                });
                result = cancellableContinuationImpl2.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Unit unit3 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit3;
        }
    }

    public final void prepare(String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C436451(cloudProjectNumber, null), 3, null);
    }

    /* compiled from: PlayIntegrityHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", m3645f = "PlayIntegrityHelper.kt", m3646l = {119, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2 */
    static final class C436442 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C436442(Continuation<? super C436442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlayIntegrityHelper.this.new C436442(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C436442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (PlayIntegrityHelper.this.playIntegrityState.getValue() instanceof PlayIntegrityState.NotStarted) {
                    return null;
                }
                final StateFlow2 stateFlow2 = PlayIntegrityHelper.this.playIntegrityState;
                final Flow flowM28818catch = FlowKt.m28818catch(FlowKt.m28821timeoutHG0u8IE(new Flow<PlayIntegrityState>() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", m3645f = "PlayIntegrityHelper.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                PlayIntegrityHelper.PlayIntegrityState playIntegrityState = (PlayIntegrityHelper.PlayIntegrityState) obj;
                                if ((playIntegrityState instanceof PlayIntegrityHelper.PlayIntegrityState.Error) || (playIntegrityState instanceof PlayIntegrityHelper.PlayIntegrityState.Ready)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PlayIntegrityHelper.PlayIntegrityState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, PlayIntegrityHelper.INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION), new PlayIntegrityHelper4(null));
                Flow<StandardIntegrityManager.StandardIntegrityTokenProvider> flow = new Flow<StandardIntegrityManager.StandardIntegrityTokenProvider>() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2 */
                    public static final class C436432<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", m3645f = "PlayIntegrityHelper.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C436432.this.emit(null, this);
                            }
                        }

                        public C436432(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                PlayIntegrityHelper.PlayIntegrityState playIntegrityState = (PlayIntegrityHelper.PlayIntegrityState) obj;
                                PlayIntegrityHelper.PlayIntegrityState.Ready ready = playIntegrityState instanceof PlayIntegrityHelper.PlayIntegrityState.Ready ? (PlayIntegrityHelper.PlayIntegrityState.Ready) playIntegrityState : null;
                                StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider = ready != null ? ready.getIntegrityTokenProvider() : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(integrityTokenProvider, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StandardIntegrityManager.StandardIntegrityTokenProvider> flowCollector, Continuation continuation) {
                        Object objCollect = flowM28818catch.collect(new C436432(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                obj = FlowKt.firstOrNull(flow, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = (StandardIntegrityManager.StandardIntegrityTokenProvider) obj;
            if (standardIntegrityTokenProvider == null) {
                return null;
            }
            final PlayIntegrityHelper playIntegrityHelper = PlayIntegrityHelper.this;
            this.L$0 = standardIntegrityTokenProvider;
            this.L$1 = playIntegrityHelper;
            this.label = 2;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(UUID.randomUUID().toString()).build()).addOnSuccessListener(new PlayIntegrityHelper7(new Function1<StandardIntegrityManager.StandardIntegrityToken, Unit>() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                    invoke2(standardIntegrityToken);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(standardIntegrityToken.token()));
                }
            })).addOnFailureListener(new OnFailureListener() { // from class: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$1$2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    playIntegrityHelper.logger.error("integrity:request:" + it.getMessage());
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(null));
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    public final Object generateToken(Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C436442(null), continuation);
    }

    /* compiled from: PlayIntegrityHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", m3645f = "PlayIntegrityHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 144}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2 */
    static final class C436462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C436462(Continuation<? super C436462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlayIntegrityHelper.this.new C436462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            PlayIntegrityHelper playIntegrityHelper;
            Mutex mutex2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = PlayIntegrityHelper.this.mutex;
                    playIntegrityHelper = PlayIntegrityHelper.this;
                    this.L$0 = mutex;
                    this.L$1 = playIntegrityHelper;
                    this.label = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                playIntegrityHelper = (PlayIntegrityHelper) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                StateFlow2 stateFlow2 = playIntegrityHelper.playIntegrityState;
                PlayIntegrityState.NotStarted notStarted = PlayIntegrityState.NotStarted.INSTANCE;
                this.L$0 = mutex;
                this.L$1 = null;
                this.label = 2;
                if (stateFlow2.emit(notStarted, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public final Object release(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C436462(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
