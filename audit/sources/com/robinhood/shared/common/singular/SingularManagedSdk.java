package com.robinhood.shared.common.singular;

import android.app.Application;
import com.robinhood.android.gdpr.GdprConsentCategory;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.TimberLogger;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SingularManagedSdk.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u000e\u0010\u001b\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "rootScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/shared/common/singular/SingularSdkWrapper;Lkotlinx/coroutines/CoroutineScope;)V", "name", "", "getName", "()Ljava/lang/String;", "consentCategory", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "getConsentCategory", "()Lcom/robinhood/android/gdpr/GdprConsentCategory;", "consentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onAppInitialized", "", "app", "Landroid/app/Application;", "updateConsentStatus", "isEnabled", "toggleSingular", "consent", "watchFlows", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SingularManagedSdk implements GdprManagedSdk {
    private final StateFlow2<Boolean> consentState;
    private final CoroutineScope rootScope;
    private final SingularSdkWrapper singularSdkWrapper;

    /* compiled from: SingularManagedSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.singular.SingularManagedSdk", m3645f = "SingularManagedSdk.kt", m3646l = {59}, m3647m = "watchFlows")
    /* renamed from: com.robinhood.shared.common.singular.SingularManagedSdk$watchFlows$1 */
    static final class C374891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C374891(Continuation<? super C374891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingularManagedSdk.this.watchFlows(this);
        }
    }

    public SingularManagedSdk(SingularSdkWrapper singularSdkWrapper, @RootCoroutineScope CoroutineScope rootScope) {
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.singularSdkWrapper = singularSdkWrapper;
        this.rootScope = rootScope;
        this.consentState = StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public String getName() {
        return "Singular";
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public GdprConsentCategory getConsentCategory() {
        return GdprConsentCategory.MARKETING;
    }

    /* compiled from: SingularManagedSdk.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.singular.SingularManagedSdk$onAppInitialized$1", m3645f = "SingularManagedSdk.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.singular.SingularManagedSdk$onAppInitialized$1 */
    static final class C374881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C374881(Continuation<? super C374881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingularManagedSdk.this.new C374881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SingularManagedSdk singularManagedSdk = SingularManagedSdk.this;
                this.label = 1;
                if (singularManagedSdk.watchFlows(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        BuildersKt__Builders_commonKt.launch$default(this.rootScope, null, null, new C374881(null), 3, null);
        app.unregisterActivityLifecycleCallbacks(this.singularSdkWrapper.getActivityLifecycleCallbacks());
        app.registerActivityLifecycleCallbacks(this.singularSdkWrapper.getActivityLifecycleCallbacks());
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void updateConsentStatus(boolean isEnabled) {
        this.consentState.setValue(Boolean.valueOf(isEnabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleSingular(boolean consent) {
        TimberLogger.INSTANCE.mo1679d("[Singular] toggleSingular consent:" + consent, new Object[0]);
        try {
            if (consent) {
                this.singularSdkWrapper.enableSingular();
            } else {
                if (consent) {
                    throw new NoWhenBranchMatchedException();
                }
                this.singularSdkWrapper.disableSingular();
            }
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object watchFlows(Continuation<? super Unit> continuation) {
        C374891 c374891;
        if (continuation instanceof C374891) {
            c374891 = (C374891) continuation;
            int i = c374891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374891.label = i - Integer.MIN_VALUE;
            } else {
                c374891 = new C374891(continuation);
            }
        }
        Object obj = c374891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow2<Boolean> stateFlow2 = this.consentState;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.common.singular.SingularManagedSdk.watchFlows.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation2);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation2) {
                    SingularManagedSdk.this.toggleSingular(z);
                    return Unit.INSTANCE;
                }
            };
            c374891.label = 1;
            if (stateFlow2.collect(flowCollector, c374891) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }
}
