package com.robinhood.android.feature.margincallresolve;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margincallresolve.DayTradeResolveStore;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import com.robinhood.android.margin.contracts.DayTradeCallResolveFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DayTradeResolveDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDataState;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "dayTradeResolveStore", "Lcom/robinhood/android/lib/margincallresolve/DayTradeResolveStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "stateProvider", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margincallresolve/DayTradeResolveStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "init", "accountNumber", "", "Companion", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DayTradeResolveDuxo extends BaseDuxo<DayTradeResolveDataState, DayTradeResolveState3> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DayTradeResolveStore dayTradeResolveStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayTradeResolveDuxo(DayTradeResolveStore dayTradeResolveStore, AccountProvider accountProvider, DayTradeResolveState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new DayTradeResolveDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(dayTradeResolveStore, "dayTradeResolveStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.dayTradeResolveStore = dayTradeResolveStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        init(((DayTradeCallResolveFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber());
    }

    /* compiled from: DayTradeResolveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$init$1", m3645f = "DayTradeResolveDuxo.kt", m3646l = {35, 36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$init$1 */
    static final class C168951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDayTradeCallView>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C168951(String str, Continuation<? super C168951> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DayTradeResolveDuxo.this.new C168951(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDayTradeCallView> continuation) {
            return ((C168951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProvider accountProvider = DayTradeResolveDuxo.this.accountProvider;
                this.label = 1;
                obj = accountProvider.getIndividualAccountNumberForced(this);
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
            String str = (String) obj;
            DayTradeResolveStore dayTradeResolveStore = DayTradeResolveDuxo.this.dayTradeResolveStore;
            String str2 = this.$accountNumber;
            if (str2 != null) {
                str = str2;
            }
            this.label = 2;
            Object dayTradeCallView = dayTradeResolveStore.getDayTradeCallView(str, this);
            return dayTradeCallView == coroutine_suspended ? coroutine_suspended : dayTradeCallView;
        }
    }

    private final void init(String accountNumber) {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C168951(accountNumber, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeResolveDuxo.init$lambda$0(this.f$0, (ApiDayTradeCallView) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeResolveDuxo.init$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$0(DayTradeResolveDuxo dayTradeResolveDuxo, ApiDayTradeCallView dayTradeCallView) {
        Intrinsics.checkNotNullParameter(dayTradeCallView, "dayTradeCallView");
        dayTradeResolveDuxo.applyMutation(new DayTradeResolveDuxo2(dayTradeCallView, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$1(DayTradeResolveDuxo dayTradeResolveDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        dayTradeResolveDuxo.applyMutation(new DayTradeResolveDuxo3(throwable, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DayTradeResolveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDuxo;", "Lcom/robinhood/android/margin/contracts/DayTradeCallResolveFragmentKey;", "<init>", "()V", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DayTradeResolveDuxo, DayTradeCallResolveFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DayTradeCallResolveFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (DayTradeCallResolveFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DayTradeCallResolveFragmentKey getArgs(DayTradeResolveDuxo dayTradeResolveDuxo) {
            return (DayTradeCallResolveFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, dayTradeResolveDuxo);
        }
    }
}
