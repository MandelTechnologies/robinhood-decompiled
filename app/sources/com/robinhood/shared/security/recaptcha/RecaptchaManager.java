package com.robinhood.shared.security.recaptcha;

import android.app.Application;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import dagger.Lazy;
import io.reactivex.Single;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: RecaptchaManager.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B3\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010 J\u000e\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010 J\u0016\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'JH\u0010(\u001a\b\u0012\u0004\u0012\u0002H*0)\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u00020,2\"\u0010-\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0)0/\u0012\u0006\u0012\u0004\u0018\u00010\u00010.H\u0082@¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00105\u001a\u00020\f*\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "", "app", "Ldagger/Lazy;", "Landroid/app/Application;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "isClientInitialized", "", "isClientInitialized$lib_recaptcha_externalDebug$annotations", "()V", "isClientInitialized$lib_recaptcha_externalDebug", "()Z", "client", "Lcom/google/android/recaptcha/RecaptchaClient;", "getClient$lib_recaptcha_externalDebug$annotations", "getClient$lib_recaptcha_externalDebug", "()Lcom/google/android/recaptcha/RecaptchaClient;", "setClient$lib_recaptcha_externalDebug", "(Lcom/google/android/recaptcha/RecaptchaClient;)V", "siteKey", "", "getSiteKey", "()Ljava/lang/String;", "isSignUpDisabled", "isLoginDisabled", "init", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeSignup", "Lcom/robinhood/shared/security/recaptcha/RecaptchaResult;", "executeLogin", "execute", "action", "Lcom/google/android/recaptcha/RecaptchaAction;", "(Lcom/google/android/recaptcha/RecaptchaAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryWithBackoff", "Lkotlin/Result;", "T", "numRetries", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "retryWithBackoff-0E7RQCE", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logRecaptchaErrors", "t", "", "isRecaptchaNetworkOrInternalError", "(Ljava/lang/Throwable;)Z", "Companion", "lib-recaptcha_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RecaptchaManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int EXECUTE_RETRIES = 3;
    private static final long INITIAL_DELAY_MS = 10;
    private static final long MAX_DELAY_MS = 5000;
    public static final String PROD_SITE_KEY = "6LfjbBoqAAAAAEqcONGoFI392OPR4pxyBKag4-9_";
    public static final String SANDBOX_SITE_KEY = "6LeX9RUqAAAAAMcl-WGu-Jw_ZuXeaDKTNOss5unQ";
    private final Lazy<Application> app;
    public RecaptchaClient client;
    private final Lazy<ExperimentsStore> experimentsStore;
    private boolean isLoginDisabled;
    private boolean isSignUpDisabled;
    private final Lazy<TargetBackend> targetBackend;

    /* compiled from: RecaptchaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.recaptcha.RecaptchaManager", m3645f = "RecaptchaManager.kt", m3646l = {86}, m3647m = "execute")
    /* renamed from: com.robinhood.shared.security.recaptcha.RecaptchaManager$execute$1 */
    static final class C396761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C396761(Continuation<? super C396761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecaptchaManager.this.execute(null, this);
        }
    }

    /* compiled from: RecaptchaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.recaptcha.RecaptchaManager", m3645f = "RecaptchaManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 61}, m3647m = "init")
    /* renamed from: com.robinhood.shared.security.recaptcha.RecaptchaManager$init$1 */
    static final class C396781 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C396781(Continuation<? super C396781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecaptchaManager.this.init(this);
        }
    }

    public static /* synthetic */ void getClient$lib_recaptcha_externalDebug$annotations() {
    }

    public static /* synthetic */ void isClientInitialized$lib_recaptcha_externalDebug$annotations() {
    }

    public RecaptchaManager(Lazy<Application> app, Lazy<TargetBackend> targetBackend, Lazy<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.app = app;
        this.targetBackend = targetBackend;
        this.experimentsStore = experimentsStore;
    }

    public final boolean isClientInitialized$lib_recaptcha_externalDebug() {
        return this.client != null;
    }

    /* renamed from: getClient$lib_recaptcha_externalDebug, reason: from getter */
    public final RecaptchaClient getClient() {
        return this.client;
    }

    public final void setClient$lib_recaptcha_externalDebug(RecaptchaClient recaptchaClient) {
        Intrinsics.checkNotNullParameter(recaptchaClient, "<set-?>");
        this.client = recaptchaClient;
    }

    private final String getSiteKey() {
        if (this.targetBackend.get().isApollo()) {
            return SANDBOX_SITE_KEY;
        }
        return PROD_SITE_KEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object init(Continuation<? super Unit> continuation) {
        C396781 c396781;
        RecaptchaManager recaptchaManager;
        if (continuation instanceof C396781) {
            c396781 = (C396781) continuation;
            int i = c396781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396781.label = i - Integer.MIN_VALUE;
            } else {
                c396781 = new C396781(continuation);
            }
        }
        Object objAwait = c396781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396781.label;
        try {
        } catch (RecaptchaException e) {
            logRecaptchaErrors(e, RecaptchaAction.INSTANCE.custom("fetchClient"));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Single singleZip = Singles.INSTANCE.zip(ExperimentsStore.getState$default(this.experimentsStore.get(), RecaptchaExperiments2.INSTANCE, false, 2, null), ExperimentsStore.getState$default(this.experimentsStore.get(), RecaptchaExperiments.INSTANCE, false, 2, null));
            c396781.label = 1;
            objAwait = RxAwait3.await(singleZip, c396781);
            if (objAwait != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recaptchaManager = (RecaptchaManager) c396781.L$0;
            ResultKt.throwOnFailure(objAwait);
            recaptchaManager.setClient$lib_recaptcha_externalDebug((RecaptchaClient) objAwait);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objAwait);
        Tuples2 tuples2 = (Tuples2) objAwait;
        Boolean bool = (Boolean) tuples2.component1();
        Boolean bool2 = (Boolean) tuples2.component2();
        Intrinsics.checkNotNull(bool);
        this.isSignUpDisabled = bool.booleanValue();
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        this.isLoginDisabled = zBooleanValue;
        if (!this.isSignUpDisabled || !zBooleanValue) {
            Recaptcha recaptcha = Recaptcha.INSTANCE;
            Application application = this.app.get();
            Intrinsics.checkNotNullExpressionValue(application, "get(...)");
            String siteKey = getSiteKey();
            c396781.L$0 = this;
            c396781.label = 2;
            objAwait = recaptcha.fetchClient(application, siteKey, c396781);
            if (objAwait != coroutine_suspended) {
                recaptchaManager = this;
                recaptchaManager.setClient$lib_recaptcha_externalDebug((RecaptchaClient) objAwait);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final Object executeSignup(Continuation<? super RecaptchaResult> continuation) {
        if (this.isSignUpDisabled) {
            return new RecaptchaResult(null, null, 3, null);
        }
        return execute(RecaptchaAction.SIGNUP, continuation);
    }

    public final Object executeLogin(Continuation<? super RecaptchaResult> continuation) {
        if (this.isLoginDisabled) {
            return new RecaptchaResult(null, null, 3, null);
        }
        return execute(RecaptchaAction.LOGIN, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(RecaptchaAction recaptchaAction, Continuation<? super RecaptchaResult> continuation) {
        C396761 c396761;
        Object objM25663retryWithBackoff0E7RQCE;
        if (continuation instanceof C396761) {
            c396761 = (C396761) continuation;
            int i = c396761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396761.label = i - Integer.MIN_VALUE;
            } else {
                c396761 = new C396761(continuation);
            }
        }
        Object obj = c396761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!isClientInitialized$lib_recaptcha_externalDebug()) {
                return new RecaptchaResult(null, null, 3, null);
            }
            C396772 c396772 = new C396772(recaptchaAction, null);
            c396761.L$0 = recaptchaAction;
            c396761.label = 1;
            objM25663retryWithBackoff0E7RQCE = m25663retryWithBackoff0E7RQCE(3, c396772, c396761);
            if (objM25663retryWithBackoff0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recaptchaAction = (RecaptchaAction) c396761.L$0;
            ResultKt.throwOnFailure(obj);
            objM25663retryWithBackoff0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM25663retryWithBackoff0E7RQCE);
        if (thM28553exceptionOrNullimpl == null) {
            return new RecaptchaResult((String) objM25663retryWithBackoff0E7RQCE, getSiteKey());
        }
        logRecaptchaErrors(thM28553exceptionOrNullimpl, recaptchaAction);
        return new RecaptchaResult(null, getSiteKey(), 1, null);
    }

    /* compiled from: RecaptchaManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.recaptcha.RecaptchaManager$execute$2", m3645f = "RecaptchaManager.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.recaptcha.RecaptchaManager$execute$2 */
    static final class C396772 extends ContinuationImpl7 implements Function1<Continuation<? super Result<? extends String>>, Object> {
        final /* synthetic */ RecaptchaAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396772(RecaptchaAction recaptchaAction, Continuation<? super C396772> continuation) {
            super(1, continuation);
            this.$action = recaptchaAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RecaptchaManager.this.new C396772(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends String>> continuation) {
            return invoke2((Continuation<? super Result<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<String>> continuation) {
            return ((C396772) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objMo9244executegIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecaptchaClient client = RecaptchaManager.this.getClient();
                RecaptchaAction recaptchaAction = this.$action;
                this.label = 1;
                objMo9244executegIAlus = client.mo9244executegIAlus(recaptchaAction, this);
                if (objMo9244executegIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo9244executegIAlus = ((Result) obj).getValue();
            }
            return Result.m28549boximpl(objMo9244executegIAlus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f7 -> B:38:0x00f8). Please report as a decompilation issue!!! */
    /* renamed from: retryWithBackoff-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m25663retryWithBackoff0E7RQCE(int i, Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function1, Continuation<? super Result<? extends T>> continuation) {
        RecaptchaManager2 recaptchaManager2;
        Ref.LongRef longRef;
        Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function12;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        int i2;
        int i3;
        int i4;
        Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function13;
        Ref.LongRef longRef2;
        if (continuation instanceof RecaptchaManager2) {
            recaptchaManager2 = (RecaptchaManager2) continuation;
            int i5 = recaptchaManager2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                recaptchaManager2.label = i5 - Integer.MIN_VALUE;
            } else {
                recaptchaManager2 = new RecaptchaManager2(this, continuation);
            }
        }
        Object objInvoke = recaptchaManager2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = recaptchaManager2.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            longRef = new Ref.LongRef();
            longRef.element = 10L;
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            recaptchaManager2.L$0 = function1;
            recaptchaManager2.L$1 = longRef;
            recaptchaManager2.L$2 = objectRef3;
            recaptchaManager2.L$3 = objectRef3;
            recaptchaManager2.I$0 = i;
            recaptchaManager2.label = 1;
            Object objInvoke2 = function1.invoke(recaptchaManager2);
            if (objInvoke2 != coroutine_suspended) {
                function12 = function1;
                objectRef = objectRef3;
                objInvoke = objInvoke2;
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                i4 = recaptchaManager2.I$1;
                i3 = recaptchaManager2.I$0;
                objectRef2 = (Ref.ObjectRef) recaptchaManager2.L$2;
                longRef = (Ref.LongRef) recaptchaManager2.L$1;
                function12 = (Function1) recaptchaManager2.L$0;
                ResultKt.throwOnFailure(objInvoke);
                function13 = function12;
                longRef2 = longRef;
                recaptchaManager2.L$0 = function13;
                recaptchaManager2.L$1 = longRef2;
                recaptchaManager2.L$2 = objectRef2;
                recaptchaManager2.L$3 = objectRef2;
                recaptchaManager2.I$0 = i3;
                recaptchaManager2.I$1 = i4;
                recaptchaManager2.label = 3;
                objInvoke = function13.invoke(recaptchaManager2);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = recaptchaManager2.I$1;
            i3 = recaptchaManager2.I$0;
            objectRef2 = (Ref.ObjectRef) recaptchaManager2.L$3;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) recaptchaManager2.L$2;
            longRef2 = (Ref.LongRef) recaptchaManager2.L$1;
            function13 = (Function1) recaptchaManager2.L$0;
            ResultKt.throwOnFailure(objInvoke);
            objectRef2.element = (T) ((Result) objInvoke).getValue();
            int i7 = i3;
            i2 = i4 + 1;
            i = i7;
            objectRef2 = objectRef4;
            longRef = longRef2;
            function12 = function13;
            if (i2 < i) {
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objectRef2.element);
                if (thM28553exceptionOrNullimpl == null || !isRecaptchaNetworkOrInternalError(thM28553exceptionOrNullimpl)) {
                    return objectRef2.element;
                }
                long jMin = Math.min(longRef.element * 2, 5000L);
                longRef.element = jMin;
                recaptchaManager2.L$0 = function12;
                recaptchaManager2.L$1 = longRef;
                recaptchaManager2.L$2 = objectRef2;
                recaptchaManager2.L$3 = null;
                recaptchaManager2.I$0 = i;
                recaptchaManager2.I$1 = i2;
                recaptchaManager2.label = 2;
                if (DelayKt.delay(jMin, recaptchaManager2) != coroutine_suspended) {
                    int i8 = i2;
                    i3 = i;
                    i4 = i8;
                    function13 = function12;
                    longRef2 = longRef;
                    recaptchaManager2.L$0 = function13;
                    recaptchaManager2.L$1 = longRef2;
                    recaptchaManager2.L$2 = objectRef2;
                    recaptchaManager2.L$3 = objectRef2;
                    recaptchaManager2.I$0 = i3;
                    recaptchaManager2.I$1 = i4;
                    recaptchaManager2.label = 3;
                    objInvoke = function13.invoke(recaptchaManager2);
                    if (objInvoke != coroutine_suspended) {
                        objectRef4 = objectRef2;
                        objectRef2.element = (T) ((Result) objInvoke).getValue();
                        int i72 = i3;
                        i2 = i4 + 1;
                        i = i72;
                        objectRef2 = objectRef4;
                        longRef = longRef2;
                        function12 = function13;
                        if (i2 < i) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            return objectRef2.element;
        }
        i = recaptchaManager2.I$0;
        objectRef = (Ref.ObjectRef) recaptchaManager2.L$3;
        objectRef2 = (Ref.ObjectRef) recaptchaManager2.L$2;
        longRef = (Ref.LongRef) recaptchaManager2.L$1;
        function12 = (Function1) recaptchaManager2.L$0;
        ResultKt.throwOnFailure(objInvoke);
        objectRef.element = (T) ((Result) objInvoke).getValue();
        i2 = 0;
        if (i2 < i) {
        }
    }

    private final void logRecaptchaErrors(Throwable t, RecaptchaAction action) {
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3356i("recaptchaAction: " + action.getAction(), new Object[0]);
        if (t instanceof RecaptchaException) {
            RecaptchaException recaptchaException = (RecaptchaException) t;
            companion.mo3356i("recaptchaErrorCode: " + recaptchaException.getErrorCode(), new Object[0]);
            companion.mo3356i("recaptchaErrorMessage: " + recaptchaException.getErrorMessage(), new Object[0]);
        }
        if (this.targetBackend.get().getId() == TargetBackend.EnumC41639Id.PROD) {
            CrashReporter.INSTANCE.reportNonFatal(t, false, isRecaptchaNetworkOrInternalError(t) ? null : new EventMetadata(SentryTeam.AUTH_AND_SAFETY, null, MapsKt.mapOf(Tuples4.m3642to("recaptchaAction", action.getAction())), 2, null));
        }
    }

    private final boolean isRecaptchaNetworkOrInternalError(Throwable th) {
        if (!(th instanceof RecaptchaException)) {
            return false;
        }
        RecaptchaException recaptchaException = (RecaptchaException) th;
        return recaptchaException.getErrorCode() == RecaptchaErrorCode.NETWORK_ERROR || recaptchaException.getErrorCode() == RecaptchaErrorCode.NO_NETWORK_FOUND || recaptchaException.getErrorCode() == RecaptchaErrorCode.INTERNAL_ERROR;
    }

    /* compiled from: RecaptchaManager.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/security/recaptcha/RecaptchaManager$Companion;", "", "<init>", "()V", "SANDBOX_SITE_KEY", "", "getSANDBOX_SITE_KEY$lib_recaptcha_externalDebug$annotations", "PROD_SITE_KEY", "getPROD_SITE_KEY$lib_recaptcha_externalDebug$annotations", "EXECUTE_RETRIES", "", "INITIAL_DELAY_MS", "", "MAX_DELAY_MS", "lib-recaptcha_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPROD_SITE_KEY$lib_recaptcha_externalDebug$annotations() {
        }

        public static /* synthetic */ void getSANDBOX_SITE_KEY$lib_recaptcha_externalDebug$annotations() {
        }

        private Companion() {
        }
    }
}
